package com.example.mohamed.waterproj_2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText cust_id;
    Spinner spinner;
    String selectedSpinner;
    Map<String,String> spinnerData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);*/


    cust_id =findViewById(R.id.cust_id);
    spinner=findViewById(R.id.spinner);

        spinnerData=new HashMap<>();
        spinnerData.put("شبين الكوم","T1");
        spinnerData.put("الشهداء","T4");
        spinnerData.put("تلا","T5");
        spinnerData.put("اشمون","T3");

        spinnerData.put("بركة السبع","T6");
        spinnerData.put("الباجور","T7");
        spinnerData.put("منوف","T8");
        spinnerData.put("مركز السادات","T9");

        spinnerData.put("قويسنا","T10");
        spinnerData.put("سرس الليان","T11");


        ArrayList<String>list=new ArrayList<>();
        list.add("اختر الفرع ->");
        list.addAll(spinnerData.keySet());

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSpinner=parent.getItemAtPosition(position).toString();
                if(selectedSpinner.equals("اختر الفرع->")){
                    selectedSpinner="";
                }
                //Toast.makeText(MainActivity.this,selectedSpinner,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void confirmData(View view) {


        final ProgressDialog progressBar = new ProgressDialog(this);
        progressBar.setMessage("جاري الاستعلام.....");
        progressBar.show();

        ApiInterface apiInterface = RetrofitClient.newInstance().create(ApiInterface.class);
        apiInterface.getCustomerBill(Integer.parseInt(cust_id.getText().toString()),spinnerData.get(selectedSpinner))
                .enqueue(new Callback<Bill>() {
                    @Override
                    public void onResponse(Call<Bill> call, Response<Bill> response) {
                        progressBar.dismiss();

                        Bill body = response.body();
                        if(body.getCUST_ID()!=null&&!selectedSpinner.equals("")){

                            Toast.makeText(MainActivity.this,"There is data",Toast.LENGTH_LONG).show();
                            Intent i=new Intent(MainActivity.this,SecondActivity.class);
                            i.putExtra("data",body);
                            startActivity(i);

                        }else{
                            Toast.makeText(MainActivity.this,"There is no data",Toast.LENGTH_LONG).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<Bill> call, Throwable t) {
                        progressBar.dismiss();
                        Toast.makeText(MainActivity.this,"There is no data",Toast.LENGTH_LONG).show();
     }
                });


    }
}

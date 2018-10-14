package com.example.mohamed.waterproj_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView cust_id,perName,comp,p_red,c_red,con,actName,metrStat,L,tot,pay_type,name,
    custName,secName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bill b= (Bill) getIntent().getExtras().get("data");

        setContentView(R.layout.activity_second);

        cust_id=findViewById(R.id.cust_id_tv);
        perName=findViewById(R.id.per_name_tv);
        comp=findViewById(R.id.comp_tv);
        p_red=findViewById(R.id.p_red_tv);
        c_red=findViewById(R.id.c_red_tv);
        con=findViewById(R.id.con_tv);
        actName=findViewById(R.id.act_name_tv);
        metrStat=findViewById(R.id.metr_stat);
        L=findViewById(R.id.l_tv);
        tot=findViewById(R.id.tot_tv);
        pay_type=findViewById(R.id.pay_type);
        name=findViewById(R.id.name_tv);
        custName=findViewById(R.id.cust_name_tv);
        secName=findViewById(R.id.sec_name_tv);


        cust_id.setText(b.getCUST_ID());
        perName.setText(b.getPER_NAME());
        comp.setText(b.getCOMP());
        p_red.setText(b.getP_RED());
        c_red.setText(b.getC_RED());
        con.setText(b.getCON());
        actName.setText(b.getACT_NAME());
        metrStat.setText(b.getMETR_STAT());
        L.setText(b.getL());
        tot.setText(b.getTOT());
        pay_type.setText(b.getPAY_TYPE());
        name.setText(b.getNAME());
        custName.setText(b.getCUST_NAME());
        secName.setText(b.getSEC_NAME());


        Toast.makeText(this,"Pay type:"+b.getPAY_TYPE(),Toast.LENGTH_LONG).show();

    }
}

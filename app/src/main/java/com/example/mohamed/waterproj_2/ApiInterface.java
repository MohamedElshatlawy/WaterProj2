package com.example.mohamed.waterproj_2;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("getBill.php")
    @FormUrlEncoded
    Call<Bill> getCustomerBill(@Field("CUST_ID") int cust_id, @Field("COMP") String comp);
/*
    @GET("getBill.php")
    Call<Bill> getCustomerBill(@Query("CUST_ID") int cust_id, @Query("COMP") String comp);

*/
}

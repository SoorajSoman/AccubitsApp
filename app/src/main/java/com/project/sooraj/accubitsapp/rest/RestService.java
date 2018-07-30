package com.project.sooraj.accubitsapp.rest;

import com.project.sooraj.accubitsapp.model.DataResponse;


import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by skynet on 6/25/18.
 */

public class RestService {

    public static RestApiInterface apiInterface;
    public static String BASEURL="http://52.221.4.121:5566";

    public static RestApiInterface getClient() {

        if (apiInterface == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            // set your desired log level
            //logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);


            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.interceptors().add(logging);
            builder.addInterceptor(logging);
            OkHttpClient httpClient = builder.build();


            Retrofit client = new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient)
                    .build();
            apiInterface = client.create(RestApiInterface.class);
        }
        return apiInterface;
    }

    public interface RestApiInterface {





        @POST("/searchWithPagination")
        @FormUrlEncoded
        Call<DataResponse> getDataPost(@Field("date") String date,
                            @Field("limit") int limit,
                            @Field("page") int page);
    }
}

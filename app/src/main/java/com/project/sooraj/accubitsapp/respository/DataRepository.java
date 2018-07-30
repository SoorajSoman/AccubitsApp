package com.project.sooraj.accubitsapp.respository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.project.sooraj.accubitsapp.model.DataResponse;
import com.project.sooraj.accubitsapp.rest.RestService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataRepository   {


    private RestService.RestApiInterface apiService;
    private static class SingletonHelper
    {
        private static final DataRepository INSTANCE = new DataRepository();
    }
    public static DataRepository getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
    public DataRepository()
    {
        apiService= RestService.getClient();
    }
    public LiveData<DataResponse> getDataResponse(String date,int limit,int page)
    {
        final MutableLiveData<DataResponse> data = new MutableLiveData<>();
        apiService.getDataPost(date,limit,page)
                .enqueue(new Callback<DataResponse>()
                {
                    @Override
                    public void onResponse(Call<DataResponse> call,     Response<DataResponse> response)
                    {
                        if (response.isSuccessful())
                        {
                            Log.d("TAG",""+ response.message());

                            data.postValue(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<DataResponse> call, Throwable t) {
                        Log.d("TAG",""+ t.getMessage());
                        data.postValue(null);
                    }
                });
        return data;
    }
}

package com.project.sooraj.accubitsapp;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.util.Log;

import com.project.sooraj.accubitsapp.model.DataResponse;
import com.project.sooraj.accubitsapp.respository.DataRepository;

import java.util.Observable;

public class DataViewModel extends AndroidViewModel {

    private static final MutableLiveData MUTABLE_LIVE_DATA = new MutableLiveData();
    private final LiveData<DataResponse> dataResponseObservable;

    {
        MUTABLE_LIVE_DATA.setValue(null);
    }
   // public final ObservableField<DataResponse> project = new ObservableField<>();

    public DataViewModel(
                             @NonNull Application application)
    {
        super(application);

      dataResponseObservable = DataRepository.getInstance()
                .getDataResponse("2018-06-10",30,1);
        Log.d("TAG",""+ dataResponseObservable.getValue());

    }


    public LiveData<DataResponse> getNewsResponseObservable()
    {
        return dataResponseObservable;
    }
}

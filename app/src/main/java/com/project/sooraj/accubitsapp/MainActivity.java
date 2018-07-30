package com.project.sooraj.accubitsapp;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.project.sooraj.accubitsapp.adapters.DataRecyclerAdapter;
import com.project.sooraj.accubitsapp.model.DataResponse;
import com.project.sooraj.accubitsapp.model.Datum;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {
    ArrayList<Datum>dataList;

    DataRecyclerAdapter recyclerAdapter;
    private static  String TAG=MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
      DataViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        dataList=new ArrayList<>();
        viewModel = ViewModelProviders
                .of(this).get(DataViewModel.class);
        setAdapter();



    }

    private void setAdapter() {

        if (recyclerAdapter == null)
        {
            recyclerAdapter = new
                    DataRecyclerAdapter(dataList, this);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(recyclerAdapter);

            observeViewModel( viewModel);
        } else {
            recyclerAdapter.notifyDataSetChanged();

        }


    }

    private void observeViewModel(DataViewModel vm)
    {
        vm.getNewsResponseObservable().observe(this, new android.arch.lifecycle.Observer<DataResponse>() {
            @Override
            public void onChanged(@Nullable DataResponse dataResponse) {

                if (dataResponse != null)
                {
                    List<Datum> articles = dataResponse.getData();
                    Log.d(TAG,"test"+articles.get(0).getName());
                    dataList.addAll(articles);
                    recyclerAdapter.notifyDataSetChanged();
                }
            }
        });


    }
}

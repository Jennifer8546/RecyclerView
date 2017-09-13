package com.example.a123.recyclerview;

import android.support.v7.app.AlertController.RecycleListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

//未完成處請參考 https://litotom.com/2016/08/29/firephoto-recyclerview-storage/
public class MainActivity extends AppCompatActivity implements FirebaseAuth.AuthStateListener {
    private AlertController.RecycleListView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ...
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
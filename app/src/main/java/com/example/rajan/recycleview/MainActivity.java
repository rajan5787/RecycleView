package com.example.rajan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.cardList);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter=new CustomAdapter(creatlist(30));
        mRecyclerView.setAdapter(customAdapter);
    }

    public ArrayList<Contect_info> creatlist(int n){
        ArrayList<Contect_info> result = new ArrayList<Contect_info>();
        for (int i=1; i <= n; i++) {
            Contect_info ci = new Contect_info();
            ci.name = Contect_info.NAME_PREFIX + i;
            ci.surname = Contect_info.SURNAME_PREFIX + i;
            ci.email = Contect_info.EMAIL_PREFIX + i + "@test.com";

            result.add(ci);

        }
        return result;
    }
}

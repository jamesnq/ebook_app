package com.lttbdd.ebook_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class BaseFragment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_fragment2);


        Intent intent=getIntent();
        Book book=(Book) getIntent().getSerializableExtra("thong tin sach");
        Fragment2 fragment2= (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragmentbase2);
        fragment2.SetData(book);

    }



}
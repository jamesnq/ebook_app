package com.lttbdd.ebook_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BaseFragment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_fragment2);
        Intent intent = getIntent();
        Book b1 = (Book) intent.getSerializableExtra("thong tin sach");

        Fragment2 fr2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragmentchitiet);

        fr2.SetData(b1);
    }
}
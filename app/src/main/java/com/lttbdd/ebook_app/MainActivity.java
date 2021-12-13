package com.lttbdd.ebook_app;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity implements ConvertName{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataBook(Book b) {
       Fragment2 fragment3= (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        Configuration configuration=getResources().getConfiguration();
        if(fragment3!=null&&configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){
            fragment3.SetData(b);
        }
        else{
            Intent intent=new Intent(MainActivity.this,BaseFragment2.class);
            intent.putExtra("thong tin sach",b);
            startActivity(intent);
        }

    }
}
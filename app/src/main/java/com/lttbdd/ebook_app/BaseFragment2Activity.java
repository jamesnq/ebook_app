package com.lttbdd.ebook_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class BaseFragment2Activity extends AppCompatActivity {

    static final String ITEM_CLICKED_INDEX = "itemClickedIndex";
    Fragment2 fragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_fragment2);

        int indexReceived = getIntent().getIntExtra(ITEM_CLICKED_INDEX,0);
        if(indexReceived == 0) return;

        fragmentManager = getSupportFragmentManager();
        fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.fragment2);
        if (fragment2 != null) {
            fragment2.setContent(indexReceived);
        }
    }


}
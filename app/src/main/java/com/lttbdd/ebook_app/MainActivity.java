package com.lttbdd.ebook_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity implements Fragment1.Communicator {

    Fragment1 fragment1;
    Fragment2 fragment2;
    FragmentManager fragmentManager;
    boolean isLandscape;
    TextView toolbar1Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar1Title = findViewById(R.id.toolbar1_title);
        toolbar1Title.setText("Home");

        fragmentManager = getSupportFragmentManager();
        fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.fragment1);
        fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.fragment2);

        fragment1.setCommunicator(this);

        isLandscape = fragment2 != null;
    }

    @Override
    public void respond(int clickedItemIndex) {
        if (isLandscape) {
            if (fragment2.isVisible()) {
                fragment2.setContent(clickedItemIndex);
            }
        } else {
            Intent baseFragment2ActivityIntent = new Intent(this, BaseFragment2Activity.class);
            baseFragment2ActivityIntent.putExtra(BaseFragment2Activity.ITEM_CLICKED_INDEX, clickedItemIndex);
            startActivity(baseFragment2ActivityIntent);
        }
    }
}


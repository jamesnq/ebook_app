package com.lttbdd.ebook_app;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import org.w3c.dom.Text;

public class BaseFragment2Activity extends AppCompatActivity {

    public static final String ITEM_CLICKED_INDEX = "itemClickedIndex";
    Fragment2 fragment2;
    FragmentManager fragmentManager;
    TextView toolbar2Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_fragment2);

        toolbar2Title = findViewById(R.id.toolbar2_title);
        toolbar2Title.setText("Book Detail");

        Toolbar myToolBar = findViewById(R.id.activity2_toolbar);
        setSupportActionBar(myToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int indexReceived = getIntent().getIntExtra(ITEM_CLICKED_INDEX, 0);
        fragmentManager = getSupportFragmentManager();
        fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.fragment2);
        fragment2.setContent(indexReceived);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
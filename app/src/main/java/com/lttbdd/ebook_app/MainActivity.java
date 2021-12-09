package com.lttbdd.ebook_app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

class Item{
    String name;
    String name1;

    public Item(String name,String name1){
        this.name=name;
        this.name1=name1;
    }

}

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    ArrayList<Item> item;
    ArrayList<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item=new ArrayList<>();
        item.add(new Item("1","khoi"));
        item.add(new Item("2","trinh"));
        item.add(new Item("3","tuan"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));
        item.add(new Item("4","khoi3"));


        data=new ArrayList<>();
        data.add("khoidz");
        data.add("khoidz1");


        listView = (ListView) findViewById(R.id.list_view);

        Adapter adapter = new Adapter(this, item);
        listView.setAdapter(adapter);
        //onclick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(MainActivity.this,""+data.get(i), Toast.LENGTH_LONG).show();
                // Intent intent = new Intent(MainActivity.this, Fragment2.class);
                //   startActivity(intent);
                //    String topic = String.valueOf(parent.getItemAtPosition(i));
                //  FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                //  Fragment2 fragment2=new Fragment2();
                //  fragmentTransaction.replace(R.id.fr2,fragment2);
                // fragmentTransaction.commit();
            }
        });
    }
}
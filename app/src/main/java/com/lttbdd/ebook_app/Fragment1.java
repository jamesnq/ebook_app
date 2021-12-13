package com.lttbdd.ebook_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends ListFragment {

    ArrayList<Book> item;
    Adapter adapter;
    ListView listView;
    ConvertName convertname;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        convertname=(ConvertName) getActivity();
        item=new ArrayList<>();
        item.add(new Book("name 1","1"));
        item.add(new Book("name 2","2"));
        item.add(new Book("name 3","3"));
        item.add(new Book("name 4","4"));
        adapter=new Adapter(getActivity(),R.layout.databook,item);
        setListAdapter(adapter);
        //listView.setAdapter(adapter);


        View view= inflater.inflate(R.layout.fragment_1, container, false);
        return view;

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        convertname.DataBook(item.get(position));
    }
}
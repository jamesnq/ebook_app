package com.lttbdd.ebook_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    TextView tv_id_data;
    TextView tv_name_data;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, container, false);
        // Inflate the layout for this fragment
        tv_name_data = (TextView) view.findViewById(R.id.tv_name_data);
        tv_id_data = (TextView) view.findViewById(R.id.tv_id_data);
        return view;
    }

    public void SetData(Book b) {
        tv_name_data.setText(b.getName());
        tv_id_data.setText(b.getId());
    }
}
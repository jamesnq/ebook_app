package com.lttbdd.ebook_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {
    TextView tv_id;
    TextView tv_name;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_2,container,false);
        // Inflate the layout for this fragment
        anhxa();
        return view;
    }
    public void SetData(Book b){
        tv_name.setText(b.getName());
        tv_id.setText(b.getId());
    }
    private void anhxa(){
        tv_name=(TextView) view.findViewById(R.id.tv_name_data);
        tv_id=(TextView) view.findViewById(R.id.tv_id_data);
    }

}
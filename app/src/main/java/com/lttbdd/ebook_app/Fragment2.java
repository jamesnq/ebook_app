package com.lttbdd.ebook_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    TextView tvContent;
    String[] contentList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        tvContent = view.findViewById(R.id.tv_content);
        contentList = getResources().getStringArray(R.array.content);
        return view;
    }

    public void setContent(int i) {
        tvContent.setText(contentList[i]);
        Toast.makeText(getContext(), "Data Successfully Changed", Toast.LENGTH_SHORT).show();
    }
}
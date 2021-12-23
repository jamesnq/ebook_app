package com.lttbdd.ebook_app;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment2 extends Fragment {

    LinearLayout bookContainer;
    ImageView bookBanner;
    ScrollView svBookContent;
    TextView tvBookContent;
    TextView tvBookName;
    TextView tvBookAuthor;
    String[] contentList;
    String[] bookNameList;
    String[] bookAuthorList;

    private int[] bookBannerName = {
            R.drawable.motdoinhuketimduong,
            R.drawable.hoccachhoc,
            R.drawable.tonybuoisang,
            R.drawable.neutoibietduockhicon20,
            R.drawable.camnangchonnghe,
            R.drawable.nhagiakim,
            R.drawable.doithaydoikhichungtathaydoi,
    };

    private int[] bookContainerBackground = {
            R.drawable.motdoinhuketimduong_bg,
            R.drawable.hoccachhoc_bg,
            R.drawable.tonybuoisang_bg,
            R.drawable.tuoi20toidasongnhumotbonghoadai_bg,
            R.drawable.camnangchonnghe_bg,
            R.drawable.nhagiakim_bg,
            R.drawable.doithaydoikhichungtathaydoi_bg,
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        tvBookContent = view.findViewById(R.id.tv_book_content);
        tvBookName = view.findViewById(R.id.tv_book_name);
        tvBookAuthor = view.findViewById(R.id.tv_book_author);
        bookBanner = view.findViewById(R.id.book_banner);
        bookContainer = view.findViewById(R.id.book_container);
        svBookContent = view.findViewById(R.id.sv_book_content);

        contentList = getResources().getStringArray(R.array.content);
        bookNameList = getResources().getStringArray(R.array.title);
        bookAuthorList = getResources().getStringArray(R.array.author);

        svBookContent.setFadingEdgeLength(80);

        return view;
    }

    public void setContent(int i) {
        tvBookContent.setText(contentList[i]);
        tvBookName.setText(bookNameList[i]);
        tvBookAuthor.setText(bookAuthorList[i]);
        bookContainer.setBackgroundResource(bookContainerBackground[i]);
        bookContainer.getBackground().setAlpha(20);
        bookBanner.setImageResource(bookBannerName[i]);
    }
}
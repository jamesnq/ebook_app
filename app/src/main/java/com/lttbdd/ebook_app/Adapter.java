package com.lttbdd.ebook_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends BaseAdapter {
    ArrayList<Item> item;
    private Activity activity;

    public Adapter(Activity activity, ArrayList<Item> item) {
        this.activity = activity;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Gọi layoutInflater ra để bắt đầu ánh xạ view và data.
        LayoutInflater inflater = activity.getLayoutInflater();

        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong item_name.xml
        view = inflater.inflate(R.layout.item_name, null);

        // Đặt chữ cho từng view trong danh sách.
        Item item1=(Item) getItem(i);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        tvName.setText(item1.name);
        TextView tvName1=(TextView) view.findViewById(R.id.tv_name1);
        tvName1.setText(item1.name1);
        //onCLick

        // Trả về view kết quả.
        return view;
    }
}
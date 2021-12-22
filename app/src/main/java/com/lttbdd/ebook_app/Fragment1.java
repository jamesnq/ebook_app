package com.lttbdd.ebook_app;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment implements AdapterView.OnItemClickListener {

    Communicator communicator;
    ArrayAdapter adapter;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        listView = view.findViewById(R.id.list);

        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.title, R.layout.book_list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);

        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.list_view_anim);
        view.startAnimation(hyperspaceJumpAnimation);
    }

    public interface Communicator {
        void respond(int i);
    }
}
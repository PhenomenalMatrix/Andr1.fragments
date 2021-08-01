package com.example.andr1fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private ArrayList<String> list;
    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(@NotNull View view) {
        recyclerView = view.findViewById(R.id.main_rv);
        adapter = new MainAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdaasdsadsd");
    }
}
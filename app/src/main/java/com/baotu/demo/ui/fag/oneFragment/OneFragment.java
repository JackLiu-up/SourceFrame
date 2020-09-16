package com.baotu.demo.ui.fag.oneFragment;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.baotu.demo.R;
import com.baotu.demo.adapter.RecyclerViweAdapter;

public class OneFragment extends Fragment {

    private OneViewModel mViewModel;
    private View view;
    private Context mContext;
    private RecyclerView recyclerView;
    private ListView listView;
    private String[] datas;
    private RecyclerViweAdapter adapter;

    public static OneFragment newInstance() {
        return new OneFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.one_fragment, container, false);
        initRecyclerView();
        initData();
        return view;
    }

    private void initRecyclerView() {
        recyclerView = view.findViewById(R.id.recyclerTextView);
    }

    private void initData() {
        datas = new String[]{"OKHttp", "xUtils", "Retrofit2", "Fresco", "Glide", "greenDao", "RxJava", "Volley","Gson",
                "picasso","evenBus","jcvideoplayer","pulltorefresh","ExpandablelistView","UniversalViderView"};
        //设置适配器
        adapter = new RecyclerViweAdapter(mContext, datas);
        recyclerView.setAdapter(adapter);
        //使用垂直布局来实现
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));//添加下划线
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(OneViewModel.class);
        // TODO: Use the ViewModel
    }

}
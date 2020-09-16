package com.baotu.demo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.baotu.demo.R;

/**
 * 常用框架的Fragment
 */
public class RecyclerViweAdapter extends RecyclerView.Adapter<RecyclerViweAdapter.MyViewHolder> {

    private final Context mContext;
    private final String[] mDatas;

    public RecyclerViweAdapter(Context context, String[] datas) {
        this.mContext = context;
        this.mDatas = datas;
    }

    /**
     * 通过MyViewHolder显示数据
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setPadding(10, 10, 0, 10);
        holder.textView.setText(mDatas[position]);
        holder.textView.setTextSize(20);
        holder.textView.setTextColor(Color.BLACK);
    }

    @Override
    public int getItemCount() {
        return mDatas.length;
    }

    /**
     * 创建ViewHolder类，用来缓存item中的子控件，避免不必要的findViewById
     */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.recyclerTextView);
        }
    }



}

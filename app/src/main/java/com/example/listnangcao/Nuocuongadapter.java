package com.example.listnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Nuocuongadapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Nuocuong> nuocuongList;

    public Nuocuongadapter(Context context, int layout, List<Nuocuong> nuocuongList) {
        this.context = context;
        this.layout = layout;
        this.nuocuongList = nuocuongList;
    }

    @Override
    public int getCount() {
        return nuocuongList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }
    private  class Viewholder{
        ImageView imghinh ;
        TextView txtten;
        TextView txtmota;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder = new Viewholder();

// anh xa
            holder.txtten = (TextView) convertView.findViewById(R.id.tvten);
            holder.txtmota = (TextView) convertView.findViewById(R.id.tvmota);
           holder.imghinh = (ImageView) convertView.findViewById(R.id.viewhinh);
           convertView.setTag(holder);

        }
        else {
            holder = (Viewholder) convertView.getTag();
        }

// gan'
        Nuocuong nuocuong = nuocuongList.get(position);
        holder.txtten.setText(nuocuong.getTen());
        holder.txtmota.setText(nuocuong.getMota());
        holder.imghinh.setImageResource(nuocuong.getHinh());
        return convertView;
    }
}

package com.example.albert.frescodemo;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

/**
 * Created by Albert on 2015/4/6.
 */
public class MyAdapter extends BaseAdapter {

    private ArrayList<Uri> mArray;
    private LayoutInflater mInflater;
  public MyAdapter(Context context,ArrayList<Uri> array){
      mInflater = LayoutInflater.from(context);
      this.mArray = array;
  }

    @Override
    public int getCount() {
        return mArray.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ViewHolder holder = null;
        if(convertView == null){
           holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.listview1,null);
            holder.draweeView = (SimpleDraweeView)convertView.findViewById(R.id.image_view);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.draweeView.setImageURI(mArray.get(position));
        return convertView;
    }

    public final class ViewHolder{
        public SimpleDraweeView draweeView;
    }

}

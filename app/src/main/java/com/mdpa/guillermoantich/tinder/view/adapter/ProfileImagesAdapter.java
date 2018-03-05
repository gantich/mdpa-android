package com.mdpa.guillermoantich.tinder.view.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.mdpa.guillermoantich.tinder.R;


/**
 * Created by Guillermo on 01/03/2018.
 */
public class ProfileImagesAdapter extends BaseAdapter {

    private Context mContext;

    //THIS WILL HAVE TO BE A MUTABLE LIST FROM LIBRARY MANAGER
    Integer[] imageIDs = {
            R.mipmap.ic_default_image_foreground,
            R.mipmap.ic_default_image_foreground,
            R.mipmap.ic_default_image_foreground,
            R.mipmap.ic_default_image_foreground,
            R.mipmap.ic_default_image_foreground,
            R.mipmap.ic_default_image_foreground
    };

    public ProfileImagesAdapter(Context c) {
        this.mContext = c;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(imageIDs[position]);
        return imageView;
    }


}
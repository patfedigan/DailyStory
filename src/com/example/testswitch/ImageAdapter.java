package com.example.testswitch;

import android.content.Context;
import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
//import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{
	private Context mContext;
	Bitmap[] tiles;
	Bitmap[] randomTiles;
		
	ImageAdapter(Context c) {
		mContext = c;
	}
	
	@Override
	public int getCount() {
		return randomTiles.length;
	}

	@Override
	public Object getItem(int position) {
		return randomTiles[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(2, 2, 2, 2);
        imageView.setImageBitmap(randomTiles[position]);
        return imageView;
	}
	
	public void setImages(Bitmap[] original, Bitmap[] random) {
		tiles = original;
		randomTiles = random;
	}
}

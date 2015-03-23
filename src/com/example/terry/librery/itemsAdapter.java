package com.example.terry.librery;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class itemsAdapter extends BaseAdapter{
	protected Activity activity;
	protected ArrayList<itemList> itemList;
	
	public itemsAdapter(Activity activity, ArrayList<itemList> itemList) {
	    this.activity = activity;
	    this.itemList = itemList;
	}
	
	@Override
	public int getCount() {
		return itemList.size();
	}

	@Override
	public Object getItem(int position) {
		return itemList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return itemList.get(position).getId();
	}

	@Override
	public View getView(int position, View contentView, ViewGroup parent) {
		View vi=contentView;
		
		if(contentView == null) {
			LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			vi = inflater.inflate(com.example.terryexample.R.layout.item_list, null);
		}
		
		itemList item = itemList.get(position);
	         
	    TextView nombre = (TextView) vi.findViewById(com.example.terryexample.R.id.tvField);
	    nombre.setText(item.getNombre());
	 
	    return vi;
		
	}

}

package com.navigationdrawer;


import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {

	ArrayList<String> IconName;
	private Activity contex;
	
	
	public CustomAdapter(Activity contex,ArrayList<String>SocialIconName) {
		
		this.contex=contex;
		this.IconName=SocialIconName;
	}
	
	
	
	@Override
	public int getCount() {
		
		return IconName.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		convertView=LayoutInflater.from(contex).inflate(R.layout.row,parent,false);
 		TextView SocialIconN =(TextView) convertView.findViewById(R.id.CountryNameTextView);
 		ImageView flag =(ImageView) convertView.findViewById(R.id.ImageView);
 		
 		String name = IconName.get(position);
 		SocialIconN.setText(name);
 		
 		
 		if (name.contains("Apple")) {
 			
			flag.setImageResource(R.drawable.apple);
		}
 		else if (name.contains("Blogger")) {
 			flag.setImageResource(R.drawable.blogger);
			
		}
 		else if (name.contains("Delicious")) {
 			flag.setImageResource(R.drawable.delicious);
			
		}
 		else if (name.contains("DeviantART")) {
 			flag.setImageResource(R.drawable.deviantart);
			
		}
 		else if (name.contains("Digg")) {
 			flag.setImageResource(R.drawable.digg);
			
		}
 		else if (name.contains("Dribbble")) {
 			flag.setImageResource(R.drawable.dribbble);
			
		}
 		else if (name.contains("Evernote")) {
 			flag.setImageResource(R.drawable.evernote);
			
		}
 		else if (name.contains("Facebook")) {
 			flag.setImageResource(R.drawable.facebook);
			
		}
 		else if (name.contains("Flickr")) {
 			flag.setImageResource(R.drawable.flickr);
			
		}
 		else if (name.contains("Forrst")) {
 			flag.setImageResource(R.drawable.forrst);
			
		}
 		else if (name.contains("GoogleBuzz")) {
 			flag.setImageResource(R.drawable.googlebuzz);
			
		}
 		else if (name.contains("Google")) {
 			flag.setImageResource(R.drawable.google);
			
		}
 		else if (name.contains("Last.FM")) {
 			flag.setImageResource(R.drawable.lastfm);
			
		}
 		else if (name.contains("LinkedIn")) {
 			flag.setImageResource(R.drawable.linkedin);
			
		}
 		else if (name.contains("Mixx")) {
 			flag.setImageResource(R.drawable.mixx);
			
		}
 		else if (name.contains("MobileMe")) {
 			flag.setImageResource(R.drawable.mobileme);
			
		}
 		else if (name.contains("MySpace")) {
 			flag.setImageResource(R.drawable.myspace);
			
		}
 		else if (name.contains("Netvibes")) {
 			flag.setImageResource(R.drawable.netvibes);
			
		}
 		else if (name.contains("Picasa")) {
 			flag.setImageResource(R.drawable.picasa);
			
		}
 		else if (name.contains("Readernaut")) {
 			flag.setImageResource(R.drawable.readernaut);
			
		}
 		else if (name.contains("Reddit")) {
 			flag.setImageResource(R.drawable.reddit);
			
		}
 		
 		else {
			flag.setImageResource(R.drawable.rss);
		}
 		
 		return convertView;
 		
	}
}



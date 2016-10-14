package com.tshyo.main;

import java.util.ArrayList;

import com.example.demo.R;
import com.tshyo.adapter.MyPagerAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;


public class MainActivity extends Activity {
	
		private ViewPager mPager;
		private ArrayList<View> listViews;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_main);
		
		mPager = (ViewPager) findViewById(R.id.vPager);   
		listViews = new ArrayList<View>();   
		LayoutInflater mInflater = getLayoutInflater();   
		listViews.add(mInflater.inflate(R.layout.lay1, null));   
		listViews.add(mInflater.inflate(R.layout.lay2, null));   
		listViews.add(mInflater.inflate(R.layout.lay3, null));   
		mPager.setAdapter(new MyPagerAdapter(listViews));   
		mPager.setCurrentItem(0);   
	}

}

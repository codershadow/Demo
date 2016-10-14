package com.tshyo.action;

import android.support.v4.view.ViewPager;
import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
	private ViewPager mPager;
	private int index = 0;   
	  
	public MyOnClickListener(int i) {   
		index = i;   
	}   
	  
	@Override  
	public void onClick(View v) {   
		mPager.setCurrentItem(index);   
	}   

}

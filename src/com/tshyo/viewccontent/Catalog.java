package com.tshyo.viewccontent;

import com.tshyo.action.Person;

import android.app.Activity;

public class Catalog {
	public String name;
	public Class<? extends Activity> cls;
	public Catalog(String name, Class<? extends Activity> cls){
		this.name = name;
		this.cls = cls;
	}
	

}

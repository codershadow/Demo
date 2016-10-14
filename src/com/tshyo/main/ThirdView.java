package com.tshyo.main;

import java.util.ArrayList;

import com.example.demo.R;
import com.tshyo.action.Person;
import com.tshyo.viewccontent.Catalog;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdView extends Activity{
	private ArrayList<Catalog> catalog;
	public ThirdView(){
		ListView list = (ListView) findViewById(R.id.personlist);
		catalog = new ArrayList<Catalog>();
		catalog.add(new Catalog("hahahha",Person.class));
		ArrayAdapter<Catalog> adapter = new ArrayAdapter<Catalog>(this, android.R.layout.simple_list_item_1, catalog);
		list.setAdapter(adapter);
		
	}

}

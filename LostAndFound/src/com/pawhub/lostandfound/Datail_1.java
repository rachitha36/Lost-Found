package com.pawhub.lostandfound;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Datail_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_datail_1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.datail_1, menu);
		return true;
	}

}
package com.example.contactlist;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ContactDetail extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contactdetail);
		Bundle bun=getIntent().getExtras();
		MyContacts obj=(MyContacts)bun.getParcelable("item");
		Log.e("kapil","Selected name:"+obj.getName());
		TextView name=(TextView) findViewById(R.id.textView1);
		TextView number=(TextView) findViewById(R.id.textView2);
		name.setText(obj.getName());
		number.setText(obj.getNumber());
		
	}
}

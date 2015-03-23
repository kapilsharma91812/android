package com.example.contactlist;


import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {
	 String phoneNumber;
     ListView lv;
     ArrayList <MyContacts> aa= new ArrayList<MyContacts>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 lv= (ListView) findViewById(R.id.listView1);
		 lv.setOnItemClickListener(this);
	        getNumber(this); 
	        
	}

	
	public void getNumber(Context context)
    {
		 Cursor cursor = null;
		    try {
		        cursor = context.getContentResolver().query(Phone.CONTENT_URI, null, null, null, null);
		     
		        int nameIdx = cursor.getColumnIndex(Phone.DISPLAY_NAME);
		        int phoneNumberIdx = cursor.getColumnIndex(Phone.NUMBER);
		        cursor.moveToFirst();
		        do {
		            
		            String name = cursor.getString(nameIdx);
		            String phoneNumber = cursor.getString(phoneNumberIdx);
		           aa.add(new MyContacts(name, phoneNumber));
		            
		        } while (cursor.moveToNext());  
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        if (cursor != null) {
		            cursor.close();
		        }
		    }

		    lv.setAdapter(new MyAdapter(this, aa));
		   
		
        /*Cursor phones = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);
        while (phones.moveToNext())
        {
          String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
          phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
          System.out.println(".................."+phoneNumber); 
          aa.add(phoneNumber);
        }
                 phones.close();// close cursor
*/  /*        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,aa);
          lv.setAdapter(adapter);*/
		 
                  //display contact numbers in the list
    }


	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Log.e("kapil","Item click:"+position);
		Bundle bun=new Bundle();
		bun.putParcelable("item", (MyContacts)aa.get(position));
		
		Intent i=new Intent(this,ContactDetail.class);
		i.putExtras(bun);
		startActivity(i);
		
		
	}
	
}

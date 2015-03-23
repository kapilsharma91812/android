package com.example.contactlist;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class MyContacts implements Parcelable {

	String name;
	String number; 
	
	public MyContacts(String name,String number) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.number=number;
	}
	
	String getName(){
		return name;
	}
	
	String getNumber(){
		return number;
	}
	
	void setName(String name){
		this.name=name;
	}
	void setNumber(String number){
		this.number=number;
	}
	
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		
		   // create a bundle for the key value pairs
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        bundle.putString("number", number);
        
        
		dest.writeBundle(bundle);
		
	}
	
	
	public static final Parcelable.Creator<MyContacts> CREATOR=new Creator<MyContacts>() {
		public MyContacts createFromParcel(Parcel source) {
			Bundle bundle=source.readBundle();
			
		
			return new MyContacts(bundle.getString("name"),bundle.getString("number"));
		}

		@Override
		public MyContacts[] newArray(int size) {
			// TODO Auto-generated method stub
			return new MyContacts[size];
		}
	};
	

}

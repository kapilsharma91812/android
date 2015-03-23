package com.example.contactlist;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<MyContacts> {
Context ctx;
List<MyContacts> data;
private LayoutInflater layoutinflator;
	public MyAdapter(Context context,List<MyContacts> objects) {
		super(context,0, objects);
		this.ctx=context;
		layoutinflator=LayoutInflater.from(context);
		data=objects;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Holder holder=null;
		if(convertView==null){
			holder=new Holder();
			convertView=layoutinflator.inflate(R.layout.singleitem, null);
			holder.setNametv((TextView)convertView.findViewById(R.id.textView1));
			holder.setNumbertv((TextView)convertView.findViewById(R.id.textView2));
			convertView.setTag(holder);
		}else{
		
			holder=(Holder)convertView.getTag();
		}
		MyContacts obj=(MyContacts) data.get(position);
		holder.getNametv().setText(obj.getName());
		holder.getnumbertv().setText(obj.getNumber());
			
		
		return convertView;
	}
	
	
	
	class Holder{
		TextView nametv;
		TextView numbertv;
		public void setNametv(TextView nametv) {
			this.nametv = nametv;
		}
		public void setNumbertv(TextView numbertv) {
			this.numbertv=numbertv;
			
		}
	
		public TextView getNametv(){
			return nametv;
		}
		
		public TextView getnumbertv(){
			return numbertv;
		}
	}

}

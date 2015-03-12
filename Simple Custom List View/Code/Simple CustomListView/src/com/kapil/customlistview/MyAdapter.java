package com.kapil.customlistview;

import java.util.List;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
	private LayoutInflater layoutInflater;
	public MyAdapter(Context context,List<String> objects) {
		super(context,0, objects);
		layoutInflater = LayoutInflater.from(context);
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	
		Holder holder = null;
		if (convertView == null)
		{
			holder = new Holder();

			convertView = layoutInflater.inflate(R.layout.singleitem, null);
			holder.setTextView1((TextView) convertView.findViewById(R.id.textView1));
			holder.setTextView2((TextView) convertView.findViewById(R.id.textView2));
			convertView.setTag(holder);
		}
		else
		{
			holder = (Holder) convertView.getTag();
		}

		holder.getTextView1().setText("Title: "+getItem(position).toString());
		holder.getTextView2().setText("Subtitle: "+getItem(position));
		return convertView;
	}
	
	class Holder
	{

		private TextView textView1;

		private TextView textView2;

		public TextView getTextView1()
		{
			return textView1;
		}

		public void setTextView1(TextView textView)
		{
			this.textView1 = textView;
		}

		public TextView getTextView2()
		{
			return textView2;
		}

		public void setTextView2(TextView textView)
		{
			this.textView2 = textView;
		}

	}

}

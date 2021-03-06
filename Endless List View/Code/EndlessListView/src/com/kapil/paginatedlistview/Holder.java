/*
 * Copyright (C) 2012 Daniel Medina <http://danielme.com>
 * 
 * This file is part of "Android Paginated ListView Demo".
 * 
 * "Android Paginated ListView Demo" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * "Android Paginated ListView Demo" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License version 3
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-3.0.html/>
 */
package com.kapil.paginatedlistview;

import android.widget.TextView;

public class Holder
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

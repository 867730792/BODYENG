package com.example.bodyeng;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bodyeng.R;

public class ui2Fragment extends Fragment {

	   @Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
		   View view = inflater.inflate(R.layout.top2_main,container, false);
	   		return view;
	   }
	}
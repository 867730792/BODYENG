package com.example.bodyeng;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
//�����������дadd,remove,finish���������ͨ������������
public class ActivityCollector {
	public static List<Activity>activities =new ArrayList<Activity>();
	
	public static void addActivity(Activity activity){
		activities.add(activity);
	}
	public static void removeActivity(Activity activity){
		activities.remove(activity);		
	}
	public static void finishALL() {
		for(Activity activity:activities){
			if(!activity.isFinishing()){
				activity.finish();
			}
		}
		
	}
}

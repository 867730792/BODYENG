package com.example.bodyeng;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
//活动管理器，重写add,remove,finish方法，将活动通过管理器管理。
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

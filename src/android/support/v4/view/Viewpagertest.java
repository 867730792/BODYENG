package android.support.v4.view;

import java.util.ArrayList;
import java.util.List;

import com.example.bodyeng.R;
import com.example.bodyeng.ui1Fragment;
import com.example.bodyeng.ui2Fragment;
import com.example.bodyeng.ui3Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class Viewpagertest extends Activity{
	ViewPager viewpager;
	FragmentPagerAdapter myAdapter;
	List<Fragment> myData;
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.frgment_main);
	initView();
	}
	
		private void initView() {
			viewpager =(ViewPager) findViewById(R.id.viewpager2); 
			myData =new ArrayList<Fragment>();
			ui1Fragment ui1 =new ui1Fragment();
			ui2Fragment ui2 =new ui2Fragment();
			ui3Fragment ui3 =new ui3Fragment();
			
			myData.add(ui1);
			myData.add(ui2);
			myData.add(ui3);
			myAdapter =new FragmentPagerAdapter(null) {
				
				@Override
				public int getCount() {
					return myData.size();
				}
				
				@Override
				public Fragment getItem(int arg0) {
					return myData.get(arg0);
				}
			};
			viewpager.setAdapter(myAdapter);
	}	
}

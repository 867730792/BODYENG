package activity;

import java.util.List;

import com.example.bodyeng.R;
import com.example.bodyeng.ui2Fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
/*代码需求：  1，获得一个操作主界面，用以完成登录后进入运动程序。
 * 		  2，界面由标题栏和三个可滑动的fragment组成，分为运动程序的三个功能中心。
 * 		  3，标题栏和fragment中提供相应的功能按钮，用以执行。
 * 		  4，点击按钮跳转到新的界面，执行相应的方法。
 * */
public class sportActivity extends Activity implements OnClickListener{
	Button buttonid;
	Button buttonnote;
	Button buttontime;
	Button fButton;
	Button ui2;
	ImageButton search;
	ImageButton menu;
	ImageButton set;
	ViewPager viewpager;
	FragmentPagerAdapter myAdapter;
	List<Fragment> myData;
	
	
	//获取操作主界面
	//删除了Viewpager导致的控件初始化出问题。
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.sport_main);
		Button buttonid =(Button) findViewById(R.id.set_id);
		Button buttonnote =(Button) findViewById(R.id.note);
		Button buttontime =(Button) findViewById(R.id.set_time);
		Button ui2 =(Button) findViewById(R.id.ui2_button2);
		ImageButton search =(ImageButton) findViewById(R.id.search);
		ImageButton menu =(ImageButton) findViewById(R.id.menu);
		ImageButton set =(ImageButton) findViewById(R.id.set);
		
		fButton =(Button) findViewById(R.id.ui2_button3);
		
		fButton.setOnClickListener(this);
		buttonid.setOnClickListener(this);
		buttonnote.setOnClickListener(this);
		buttontime.setOnClickListener(this);
		search.setOnClickListener(this);
		menu.setOnClickListener(this);
		set.setOnClickListener(this);
		ui2.setOnClickListener(this);
		
	
		
//		initView();
	}
//	
//		private void initView() {
//			viewpager =(ViewPager) findViewById(R.id.viewpager2); 
//			myData =new ArrayList<Fragment>();
//			ui1Fragment ui1 =new ui1Fragment();
//			ui2Fragment ui2 =new ui2Fragment();
//			ui3Fragment ui3 =new ui3Fragment();
//			
//			myData.add(ui1);
//			myData.add(ui2);
//			myData.add(ui3);
//			myAdapter =new FragmentPagerAdapter(null) {
//				
//				@Override
//				public int getCount() {
//					return myData.size();
//				}
//				
//				@Override
//				public Fragment getItem(int arg0) {
//					return myData.get(arg0);
//				}
//			};
//			viewpager.setAdapter(myAdapter);
//	}	

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.set_id:
				Intent intent = new Intent(sportActivity.this,setId.class);
				Toast.makeText(sportActivity.this, "提供一个设置个人信息的界面，功能暂未开放", Toast.LENGTH_SHORT).show();
			
				break;
			case R.id.note:
				Intent intent1 = new Intent(sportActivity.this,Mynote.class);
				startActivity(intent1);
				Toast.makeText(sportActivity.this, "提供一个笔记档案", Toast.LENGTH_SHORT).show();
				break;
			case R.id.set_time:
				Intent intent2 = new Intent(sportActivity.this,time.class);
				Toast.makeText(sportActivity.this, "提供一个用于定时通知运动的广播，功能暂未开放", Toast.LENGTH_SHORT).show();
				break;
			case R.id.search:
				Intent intent3 = new Intent(sportActivity.this,Search.class);
				startActivity(intent3);
				Toast.makeText(sportActivity.this, "搜索选项", Toast.LENGTH_SHORT).show();
				break;
			case R.id.menu:
				Toast.makeText(sportActivity.this, "菜单选项", Toast.LENGTH_SHORT).show();
				break;
				
			case R.id.ui2_button3:
				Intent intent4 = new Intent(sportActivity.this,FoodActivity.class);
				Toast.makeText(sportActivity.this, "健康管理", Toast.LENGTH_SHORT).show();
				startActivity(intent4);
				break;
			case R.id.ui2_button2:
				Intent intent5 = new Intent(sportActivity.this,ActionCenter.class);
				startActivity(intent5);
				Toast.makeText(sportActivity.this, "运动中心", Toast.LENGTH_SHORT).show();
				break;
			case R.id.set:
				Toast.makeText(sportActivity.this, "退出选项", Toast.LENGTH_SHORT).show();
					AlertDialog.Builder dialog = new AlertDialog.Builder(sportActivity.this);
					dialog.setTitle("提示");
					dialog.setMessage("你要退出程序吗？");
					dialog.setCancelable(false);
					dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							 finish();
						}
					});
						dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							
						}
					});
						dialog.show();
						break;
			
				default:
				break;	
		}
			
		
//		public boolean onCreateOptionsMenu(Menu menu) {
//			getMenuInflater().inflate(R.menu.main, menu);
//			return true;
//			}
	
//		@Override
//		public boolean onOptionsItemSelected(MenuItem item) {
//			return super.onOptionsItemSelected(item);
//			
	}
}		
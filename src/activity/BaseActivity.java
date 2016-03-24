package activity;

import com.example.bodyeng.ActivityCollector;

import android.app.Activity;
import android.os.Bundle;
//自定义BaseActivity类，重写onCreate(),onDestroy()方法，继承该类的活动在活动管理器管理。
public class BaseActivity extends Activity{
		@Override
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);
}
		@Override
		protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
		}
	}


package activity;

import com.example.bodyeng.ActivityCollector;

import android.app.Activity;
import android.os.Bundle;
//�Զ���BaseActivity�࣬��дonCreate(),onDestroy()�������̳и���Ļ�ڻ����������
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


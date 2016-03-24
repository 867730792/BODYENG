package activity;

import com.example.bodyeng.R;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

//便签的活动界面
public class Mynote extends BaseActivity{
	
	SharedPreferences notepref;
	Editor noteeditor;
	EditText editText;
	String write;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		  setContentView(R.layout.note);
		  //初始化输入控件。
	        editText =(EditText) findViewById(R.id.editext);
		  //获取SharedPreferences对象创建noteInfo文件存储数据。
		  notepref =getSharedPreferences("noteInfo", MODE_PRIVATE);
		//调用edit方法获得一个可以存入数据的SharedPreferences.Editor容器对象。
	        noteeditor=notepref.edit();
	        if (noteeditor!=null) {
	        	 String read = notepref.getString("write", "");
	        	 editText.setText(read);
	        } else {
	        	 //获取输入的数据将数据存入容器。
		        String write =editText.getText().toString().trim();
		        noteeditor.putString("write", "");
				noteeditor.commit();
	        }
	}
	        public void onBackPressed(){
	        	String write =editText.getText().toString().trim();
	        	noteeditor.putString("write", "");
	        	noteeditor.commit();
	        	finish(); 
	        }
	}
package activity;

import com.example.bodyeng.R;
import com.example.bodyeng.R.id;
import com.example.bodyeng.R.layout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/*代码需求：  1，获得一个登录界面，用以开始第一次登录运动程序。
 * 		  2，密码和用户匹配成功后跳转到新的界面，默认登录成功后自动保存，匹配不成功提示密码错误。
 * */
 
public class MainActivity extends BaseActivity{
	
	
	EditText userName,userPass;
	SharedPreferences pref;
	Editor editor;
	Button startButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.user_main);
	       
	        //初始化控件
	        userName =(EditText) findViewById(R.id.userName);
	        userPass =(EditText) findViewById(R.id.userPass);
	        startButton =(Button) findViewById(R.id.start);
	        //获取SharedPreferences对象，第一个参数为文件名，没有则创建，第二个为访问权限。
	        pref =getSharedPreferences("userInfo", MODE_PRIVATE);
	      //调用edit方法获得一个可以写入数据的SharedPreferences.Editor容器对象。
	        editor=pref.edit();
	        String name = pref.getString("name", "");
	        String pass = pref.getString("pass", "");
	        
	        if (editor!=null) {
	        // 默认要自动登陆的
	       Intent intent = new Intent(MainActivity.this, sportActivity.class);
	       startActivity(intent);
	       finish();
	       }
	}
	      //设置输入控件方法.
	        public void dostart(View v){
	        	switch(v.getId()){
	        	case R.id.start:
	        	String name =userName.getText().toString().trim();
	        	String pass =userPass.getText().toString().trim();
	        	//对比账户密码，符合则登录，并存储密码和账户，在关闭登录界面。密码错误发出提示。
	        	if("yonghuming".equals(name)&&"yonghumima".equals(pass)){
	    			Toast.makeText(MainActivity.this, "进入运动程序", Toast.LENGTH_SHORT).show();
	    			editor.putString(name, pass);
	    			editor.commit();
	    			Intent intent =new Intent(MainActivity.this,sportActivity.class);
	        		startActivity(intent);
	        		finish();
	        	}else{
	        		Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
	        	}
	        	break;
	        	
	        	default:
	        		break;
	        	}
	    }
		
	}
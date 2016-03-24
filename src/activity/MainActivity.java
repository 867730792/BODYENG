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


/*��������  1�����һ����¼���棬���Կ�ʼ��һ�ε�¼�˶�����
 * 		  2��������û�ƥ��ɹ�����ת���µĽ��棬Ĭ�ϵ�¼�ɹ����Զ����棬ƥ�䲻�ɹ���ʾ�������
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
	       
	        //��ʼ���ؼ�
	        userName =(EditText) findViewById(R.id.userName);
	        userPass =(EditText) findViewById(R.id.userPass);
	        startButton =(Button) findViewById(R.id.start);
	        //��ȡSharedPreferences���󣬵�һ������Ϊ�ļ�����û���򴴽����ڶ���Ϊ����Ȩ�ޡ�
	        pref =getSharedPreferences("userInfo", MODE_PRIVATE);
	      //����edit�������һ������д�����ݵ�SharedPreferences.Editor��������
	        editor=pref.edit();
	        String name = pref.getString("name", "");
	        String pass = pref.getString("pass", "");
	        
	        if (editor!=null) {
	        // Ĭ��Ҫ�Զ���½��
	       Intent intent = new Intent(MainActivity.this, sportActivity.class);
	       startActivity(intent);
	       finish();
	       }
	}
	      //��������ؼ�����.
	        public void dostart(View v){
	        	switch(v.getId()){
	        	case R.id.start:
	        	String name =userName.getText().toString().trim();
	        	String pass =userPass.getText().toString().trim();
	        	//�Ա��˻����룬�������¼�����洢������˻����ڹرյ�¼���档������󷢳���ʾ��
	        	if("yonghuming".equals(name)&&"yonghumima".equals(pass)){
	    			Toast.makeText(MainActivity.this, "�����˶�����", Toast.LENGTH_SHORT).show();
	    			editor.putString(name, pass);
	    			editor.commit();
	    			Intent intent =new Intent(MainActivity.this,sportActivity.class);
	        		startActivity(intent);
	        		finish();
	        	}else{
	        		Toast.makeText(MainActivity.this, "�������", Toast.LENGTH_SHORT).show();
	        	}
	        	break;
	        	
	        	default:
	        		break;
	        	}
	    }
		
	}
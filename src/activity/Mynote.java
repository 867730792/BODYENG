package activity;

import com.example.bodyeng.R;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

//��ǩ�Ļ����
public class Mynote extends BaseActivity{
	
	SharedPreferences notepref;
	Editor noteeditor;
	EditText editText;
	String write;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		  setContentView(R.layout.note);
		  //��ʼ������ؼ���
	        editText =(EditText) findViewById(R.id.editext);
		  //��ȡSharedPreferences���󴴽�noteInfo�ļ��洢���ݡ�
		  notepref =getSharedPreferences("noteInfo", MODE_PRIVATE);
		//����edit�������һ�����Դ������ݵ�SharedPreferences.Editor��������
	        noteeditor=notepref.edit();
	        if (noteeditor!=null) {
	        	 String read = notepref.getString("write", "");
	        	 editText.setText(read);
	        } else {
	        	 //��ȡ��������ݽ����ݴ���������
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
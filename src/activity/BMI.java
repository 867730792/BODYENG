package activity;

import com.example.bodyeng.R;

import android.R.integer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI extends BaseActivity implements OnClickListener{
	EditText ediwidth;
	EditText ediheight;
	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.bmi);
		Button bmisum =(Button) findViewById(R.id.bmi_button);
		ediwidth =(EditText) findViewById(R.id.bmi_width);
		ediheight =(EditText) findViewById(R.id.bmi_height);
		TextView textView =(TextView) findViewById(R.id.bmi_show);
		
		Button number1 =(Button) findViewById(R.id.number1);
		Button number2 =(Button) findViewById(R.id.number2);
		Button number3 =(Button) findViewById(R.id.number3);
		Button number4 =(Button) findViewById(R.id.number4);
		Button number5 =(Button) findViewById(R.id.number5);
		Button number6 =(Button) findViewById(R.id.number6);
		Button number7 =(Button) findViewById(R.id.number7);
		Button number8 =(Button) findViewById(R.id.number8);
		Button number9 =(Button) findViewById(R.id.number9);
		Button number0 =(Button) findViewById(R.id.number0);
		
		number1.setOnClickListener(this);
		number2.setOnClickListener(this);
		number3.setOnClickListener(this);
		number4.setOnClickListener(this);
		number5.setOnClickListener(this);
		number6.setOnClickListener(this);
		number7.setOnClickListener(this);
		number8.setOnClickListener(this);
		number9.setOnClickListener(this);
		number0.setOnClickListener(this);
		bmisum.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		//用两个字符串来保存获取按钮输入的值。
		String show1 =ediwidth.getText().toString();
		
		String show2 =ediheight.getText().toString();
		switch (v.getId()) {
		case R.id.number1:
		case R.id.number2:
		case R.id.number3:
		case R.id.number4:
		case R.id.number5:
		case R.id.number6:
		case R.id.number7:
		case R.id.number8:
		case R.id.number9:
		case R.id.number0:
			
			if(ediwidth.hasFocus()) {
				//获得焦点  
	        	ediwidth.setText(show1+((Button)v).getText());
	        }else{
	        	//失去焦点  
	        	ediheight.setText(show2+((Button)v).getText());
	        }  
			break;
			
		case R.id.bmi_button:
			//计算方法。
			Toast.makeText(BMI.this, "计算方法", Toast.LENGTH_SHORT).show();
			
			if (show1!=""&&show2!="") {
				//体重/身高平方
				String result ="";
				Log.d("log 打印日志", show1+show2);  
//				double a1 = Double.parseDouble(show1.trim());
//				double a2 = Double.parseDouble(show2.trim());
//				result = show1+show2;
				textView.setText("计算结果"+result);
			}
				
			
		break;
		
		default:
			break;
		}
		
	}
}
	



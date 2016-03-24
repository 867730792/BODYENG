package activity;

import com.example.bodyeng.R;
import com.example.bodyeng.R.layout;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;





public class ActionCenter extends BaseActivity implements OnClickListener{
	protected void onCreate(Bundle savedInstanceState) {
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	super.onCreate(savedInstanceState);
	setContentView(R.layout.top2_main);
	Button chest =(Button) findViewById(R.id.chest);
	Button leg =(Button) findViewById(R.id.leg);
	Button back =(Button) findViewById(R.id.back);
	Button shoulder =(Button) findViewById(R.id.shoulder);
	 
	chest.setOnClickListener(this);
	leg.setOnClickListener(this);
	back.setOnClickListener(this);
	shoulder.setOnClickListener(this);
	
	
	
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case chest:
			
			 
			break;
		case leg:
			 imageView.setImageResource(R.drawable.xx);
			break;
		case back:
			 imageView.setImageResource(R.drawable.xx);
			break;
		case shoulder:
			 imageView.setImageResource(R.drawable.xx);
			break;

		default:
			break;
		}
		
	}
    
 }

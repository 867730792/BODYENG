package colorie;


import java.util.ArrayList;
import java.util.List;

import com.example.bodyeng.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;



public class CalorieActivity extends Activity {
	private List<Food>FoodList =new ArrayList<Food>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);
        initFood();
        //给适配器传入上下文，布局和List中的数据内容。
        FoodAdapter adapter =new FoodAdapter(CalorieActivity.this, R.layout.food_list, FoodList);
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Food food =FoodList.get(position);
				Toast.makeText(CalorieActivity.this, food.getName(), Toast.LENGTH_SHORT).show();
			}
		});
    }
    //传入文字和图片
	private void initFood() {
		Food rice = new Food("rice 346卡路里",R.drawable.rice);
		FoodList.add(rice);
		Food apple = new Food("apple 52卡路里",R.drawable.apple);
		FoodList.add(apple);
		Food cabbage = new Food("cabbage 17卡路里",R.drawable.cabbage);
		FoodList.add(cabbage);
		Food chicken  = new Food("chicken 167卡路里",R.drawable.chicken);
		FoodList.add(chicken );
		Food oat  = new Food("oat 367卡路里",R.drawable.oat);
		FoodList.add(oat );
		Food pork  = new Food("pork 147卡路里",R.drawable.pork);
		FoodList.add(pork );
		Food potato  = new Food("potato 76卡路里",R.drawable.potato);
		FoodList.add(potato );
		Food rice1 = new Food("rice 346卡路里",R.drawable.rice);
		FoodList.add(rice);
		Food apple1 = new Food("apple 52卡路里",R.drawable.apple);
		FoodList.add(apple);
		Food cabbage1 = new Food("cabbage 17卡路里",R.drawable.cabbage);
		FoodList.add(cabbage);
		Food chicken1  = new Food("chicken 167卡路里",R.drawable.chicken);
		FoodList.add(chicken );
		Food oat1  = new Food("oat 367卡路里",R.drawable.oat);
		FoodList.add(oat );
		Food pork1  = new Food("pork 147卡路里",R.drawable.pork);
		FoodList.add(pork );
		Food potato1  = new Food("potato 76卡路里",R.drawable.potato);
		FoodList.add(potato );
	}
		
	}


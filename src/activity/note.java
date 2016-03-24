package activity;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;


//一个可以输入记录的便签用于笔记继承便签实现类。布局 一个EditText 一个Button 一个ListView
//重写BaseAdapter 用于加载数据 或者你使用简单的 Adapter
//每更新一次 EditText 通知 ListView  更新数据 在button的点击事件去获取edittext的文本 s=s+"\n"+获取的内容  再 textview.settext(s);
//还有一种方法就是，直接用一个textview显示，每次添加，就把上一次添加的字符串拼接一起结尾用换行符。然后每添加一次就更新textview显示内容就可以。
public class note extends AppWidgetProvider{
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onDeleted(context, appWidgetIds);
	}
}	
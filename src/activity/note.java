package activity;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;


//һ�����������¼�ı�ǩ���ڱʼǼ̳б�ǩʵ���ࡣ���� һ��EditText һ��Button һ��ListView
//��дBaseAdapter ���ڼ������� ������ʹ�ü򵥵� Adapter
//ÿ����һ�� EditText ֪ͨ ListView  �������� ��button�ĵ���¼�ȥ��ȡedittext���ı� s=s+"\n"+��ȡ������  �� textview.settext(s);
//����һ�ַ������ǣ�ֱ����һ��textview��ʾ��ÿ����ӣ��Ͱ���һ����ӵ��ַ���ƴ��һ���β�û��з���Ȼ��ÿ���һ�ξ͸���textview��ʾ���ݾͿ��ԡ�
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
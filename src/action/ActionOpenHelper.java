package action;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ActionOpenHelper extends SQLiteOpenHelper{
	
	//创建胸部，背部，腿部肌肉训练的表，包含id，文字，图片。
	public static final String CREATE_CHEST ="create table chestaction("
			+"id integer primary key autoincrement,"
			+"action_name text,"
			+"action_text text)";
	
	public static final String CREATE_LEG ="create table legaction("
		+"id integer primary key autoincrement,"
		+"action_name text,"
		+"action_text text)";
	public static final String CREATE_BACK ="create table backaction("
			+"id integer primary key autoincrement,"
			+"action_name text,"
			+"action_text text)";
	public ActionOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		}
			@Override
			public void onCreate(SQLiteDatabase db) {
				db.execSQL(CREATE_CHEST);
				db.execSQL(CREATE_BACK);
				db.execSQL(CREATE_LEG);
			}
			@Override
			public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
				
			}
	}	
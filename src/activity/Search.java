package activity;

import com.example.bodyeng.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
//��APP�������ṩһ��������������ҳ��
public class Search extends Activity{
	WebView webView;
	ProgressDialog progressDialog;
	 protected void onCreate(android.os.Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setContentView(R.layout.web_view);
		webView =(WebView) findViewById(R.id.webview);
		progressDialog =new ProgressDialog(Search.this);
		progressDialog.setTitle("��ҳ������");
		progressDialog.setMessage("Loading...");
		progressDialog.setCancelable(true);
		progressDialog.show();
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			// ���ݴ���Ĳ��������µ���ҳ��
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url); 
			return true; 
			}
		});
			webView.loadUrl("http://www.baidu.com");
			
	}
}

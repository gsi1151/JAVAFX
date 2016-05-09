package javafx.utng.edu.mx.javafx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Created by tony on 01/05/2016.
 */
public class StreamingActivity extends AppCompatActivity {

/**

 @Override protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_streaming);

 startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.exafm.com/#!/guadalajara/home")));
    //http://tutvgratis.tv/tv-abierta/canal-de-las-estrellas
  //http://www.radioreyna.net/Inicio
  //http://www.exafm.com/#!/guadalajara/home
 //http://tunein.com/radio/Radio-Educaci%C3%B3n-1060-s24497/
 }

    //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://webtv.comunicarconsentido.com/index.php/es/search")));

    //mPlayer.pause();


 @Override protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_streaming);


 try {
 MediaPlayer mediaPlayer = new MediaPlayer();
 mediaPlayer.setDataSource("http://www.internet-radio.com/station/dougeasyhits");
 mediaPlayer.prepare();
 mediaPlayer.start();
 } catch (IllegalArgumentException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 } catch (SecurityException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 } catch (IllegalStateException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 } catch (IOException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }

 }

 @Override public boolean onCreateOptionsMenu(Menu menu) {
 // Inflate the menu; this adds items to the action bar if it is present.
 getMenuInflater().inflate(R.menu.temario_activity_drawer, menu);
 return true;
 }


**/







  private WebView view; //membuat variabel view agar bisa akses method onKeyDown

  @Override
  protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main_web);

   view = (WebView) this.findViewById(R.id.webView);
   view.getSettings().setJavaScriptEnabled(true);
   view.setWebViewClient(new MyBrowser());
   view.loadUrl("http://www.radioreyna.net/Inicio"); //try js alert
   view.setWebChromeClient(new WebChromeClient()); // adding js alert support

  }

  private class MyBrowser extends WebViewClient {
   @Override
   public boolean shouldOverrideUrlLoading(WebView view, String url) {
    view.loadUrl(url);
    return true;
   }
  }

  public boolean onKeyDown(int keyCode, KeyEvent event) {
   //ketika disentuh tombol back
   if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {
    view.goBack(); //method goback() dieksekusi untuk kembali pada halaman sebelumnya
    return true;
   }
   // Jika tidak ada history (Halaman yang sebelumnya dibuka)
   // maka akan keluar dari activity
   return super.onKeyDown(keyCode, event);
  }

}




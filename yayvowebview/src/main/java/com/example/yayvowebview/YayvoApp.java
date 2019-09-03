package com.example.yayvowebview;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.example.yayvowebview.YayvoWebView;

public class YayvoApp extends Activity {

    public void open() {
        startActivity(new Intent(this, YayvoWebView.class));
    }
}

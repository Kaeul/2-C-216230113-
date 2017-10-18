package com.ebookfrenzy.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("About Me");

        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec classa = tabHost.newTabSpec("1").setContent(R.id.classa).setIndicator("기본 정보");
        TabHost.TabSpec name = tabHost.newTabSpec("2").setContent(R.id.name).setIndicator("좋아하는 것");
        TabHost.TabSpec number = tabHost.newTabSpec("3").setContent(R.id.number).setIndicator("하고싶은 말");

        tabHost.addTab(classa);
        tabHost.addTab(name);
        tabHost.addTab(number);
    }
}

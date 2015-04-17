package com.miraclewong.imooctopbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        TopBar topbar = (TopBar)findViewById(R.id.topbar);          //获得TopBar的引用

        topbar.setOnTopBarClickListener(new TopBar.topbarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this,"IMooc Left",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "IMooc Right", Toast.LENGTH_SHORT).show();
            }
        });

        topbar.setLeftIsVisable(false);
    }

}

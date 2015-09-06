package com.example.cl.adapterdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
Button simpleBtn ;
    Button intricacyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  simpleBtn = (Button) findViewById(R.id.simple_adapter);
      //  intricacyBtn = (Button) findViewById(R.id.intricacy_adapter);
        Intent intent1 = new Intent(MainActivity.this,IconList.class);
        startActivity(intent1);
        simpleBtn.setOnClickListener(this);
        intricacyBtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
        //    case R.id.simple_adapter:
           //     Intent intent = new Intent(MainActivity.this,SimpleList.class);
       //         startActivity(intent);
      //          break;
        //    case R.id.intricacy_adapter:

         //   break;
            default:
                break;
        }

    }
}

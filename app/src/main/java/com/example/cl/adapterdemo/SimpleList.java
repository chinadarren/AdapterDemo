package com.example.cl.adapterdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by cl on 2015/9/6.
 */
public class SimpleList extends ListActivity {

    private String[] mListSring = {"姓名：王奎丰","性别：男","年龄：23","居住地：上海普陀区"};
    private ListView mListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mListView = this.getListView();

        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mListSring));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleList.this,"你选择了："+ mListSring[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

}

package com.example.cl.adapterdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cl on 2015/9/6.
 */
public class IconList extends ListActivity {
    private String[] mListTitle = {"姓名","性别","年龄","居住地"};
    private String[] mListStr = {"李强","男","22","北京海淀区"};
    ListView mListView = null;
    ArrayList<Map<String,Object>> mData = new ArrayList<Map<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        mListView = getListView();

        int lengh = mListTitle.length;
        for(int i = 0 ; i <lengh; i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("image",R.drawable.abc_ab_share_pack_mtrl_alpha);
            item.put("title",mListTitle[i]);
            item.put("text",mListStr[i]);
            mData.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(
                this,mData,R.layout.activity_main,new String[]{"image","title","text"},
                new int[]{R.id.image,R.id.title, R.id.text} );
        setListAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(IconList.this, "你选择了：" + mListStr[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}

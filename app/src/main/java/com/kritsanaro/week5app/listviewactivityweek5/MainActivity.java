package com.kritsanaro.week5app.listviewactivityweek5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv_data;
    String[] arr_data = {"Android","IOS","WINDOWS PHONE","Linux","Windows","Ubuntu"};
    ArrayAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        lv_data = findViewById(R.id.lv_data);

        mAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,arr_data);

        lv_data.setAdapter(mAdapter);

        //get event on item click
        lv_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Toast.makeText(MainActivity.this,
                        "arr_data["+index+"] = "+arr_data[index]
                        , Toast.LENGTH_SHORT).show();
                Intent goPage2  =new Intent(MainActivity.this,Page2Activity.class);
                goPage2.putExtra("input",arr_data[index]);
                startActivity(goPage2);
//                finish();
            }
        });

    }
}

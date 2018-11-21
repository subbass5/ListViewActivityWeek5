package com.kritsanaro.week5app.listviewactivityweek5;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity
{
    TextView tv_result;
    Button btn_back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //bind widget
        tv_result = findViewById(R.id.tv_result);
        btn_back = findViewById(R.id.btn_back);


        String result = getIntent()
                .getExtras()
                .getString("input");

        tv_result.setText(result);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent goMainActivity
//                        = new Intent(Page2Activity.this,MainActivity.class);
//                startActivity(goMainActivity);
                finish();
            }
        });

    }
}

package com.example.sidemenutest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int MP = ViewGroup.LayoutParams.MATCH_PARENT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        //全ての土台
        LinearLayout base_layout = new LinearLayout(this);
        base_layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(base_layout);

        //ボタン乗っける土台
        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(MP,WC);

        relativeLayout.setLayoutParams(param);

        //ボタン生成
        Button button = new Button(this);
        button.setText("テスト");
        button.setId(View.generateViewId());

        Button button2 = new Button(this);
        button2.setText("まんなかぁ！");
        button2.setId(View.generateViewId());

        Button button3 = new Button(this);
        button3.setText("うぇ！");
        button3.setId(View.generateViewId());


        //最下部に配置させる
        param.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        relativeLayout.addView(button, param);
        base_layout.addView(relativeLayout);

        //buttonの上に配置
        RelativeLayout.LayoutParams param2 = new RelativeLayout.LayoutParams(MP,WC);
        param2.addRule(RelativeLayout.ABOVE, button.getId());
        relativeLayout.addView(button2, param2);

        //button2の上に配置
        RelativeLayout.LayoutParams param3 = new RelativeLayout.LayoutParams(MP,WC);
        param3.addRule(RelativeLayout.ABOVE, button2.getId());
        relativeLayout.addView(button3, param3);




    }
}

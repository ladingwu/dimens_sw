package com.example.laddingwu.adapterapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv2,tv1,tv3,tv4;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
         tv3 = findViewById(R.id.tv3);
         tv4 = findViewById(R.id.tv4);
        view = findViewById(R.id.view_show);

        tv1.postDelayed(new Runnable() {
            @Override
            public void run() {
                DisplayMetrics dm = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getRealMetrics(dm);
                tv1.setText("dpi: "+dm.densityDpi +"width Pixe "+dm.widthPixels);
                tv2.setText("smallWidthest : "+dm.widthPixels/(dm.densityDpi/160.0) +" dp");
                tv3.setText("actual use dimen : "+getResources().getString(R.string.base_dpi));
                tv4.setText("当前手机： "+SystemUtil.getDeviceBrand()+"  "+SystemUtil.getSystemModel()+ " \n"+"当前系统： "+SystemUtil.getSystemVersion()+ " ");
                LinearLayout.LayoutParams p= (LinearLayout.LayoutParams) view.getLayoutParams();
                p.width = getResources().getDimensionPixelSize(R.dimen.qb_px_375);
                view.setLayoutParams(p);
            }
        },500);
    }
}

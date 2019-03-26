package com.edu.sicnu.cs.zzy.scollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private static int[] images = {R.drawable.bg_black_small,R.drawable.bg_blue_small,R.drawable.bg_dark_small,R.drawable.bg_green_small,R.drawable.bg_orange_small,R.drawable.bg_pink_small};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageViewMain = findViewById(R.id.imageView);
        LinearLayout linearLayout= findViewById(R.id.linearlayout);

        for (int i=0;i<images.length;i++){
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(images[i]);
            imageView.setAdjustViewBounds(true);    //使图片大小可调
            imageView.setPadding(20,20,20,20);  //使图片之间不会挨得太紧密
            linearLayout.addView(imageView);
            imageView.setTag(i);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int index = (int)v.getTag();
                    imageViewMain.setImageResource(images[index]);
                }
            });


        }

    }
}

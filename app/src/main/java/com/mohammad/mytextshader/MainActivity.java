package com.mohammad.mytextshader;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mytext;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext=findViewById(R.id.mytext);
        bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.heart);
        mytext.getPaint().setShader(new BitmapShader(bitmap,Shader.TileMode.REPEAT,Shader.TileMode.REPEAT));
    }
}

package com.lzp.compileannotationstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.lzp.io.BindView;
import com.lzp.io.ContentView;
import com.lzp.ioc.ViewInjector;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    public TextView textView;

    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewInjector.injectView(this);
        textView.setText("hahahahaha");
    }
}

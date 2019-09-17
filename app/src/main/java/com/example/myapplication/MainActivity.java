package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {//implements View.OnClickListener {

    private static final  String TAG = "hhh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h);

        TextView out = findViewById(R.id.textView);
        out.setText("登录 改");
        Log.d(TAG, "onCreate: ");

        EditText input = findViewById(R.id.editText);
        String str = input.getText().toString();

        Button btn = findViewById(R.id.button);
        //btn.setOnClickListener(this);
        //btn.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  TextView out = findViewById(R.id.textView);
                //out.setText("登录 点击");
        //    }
       // });


    }

    //@Override
    //public void onClick(View view) {
      //  Log.i(TAG, "onClick: ");
        //TextView out = findViewById(R.id.textView);
        //out.setText("登录 点击");
        //EditText input = findViewById(R.id.editText);
        //String str = input.getText().toString();
        //out.setText(str);
    //}

    public void abc(View view){
        Log.i(TAG, "abc: ");
        TextView out = findViewById(R.id.textView);
        out.setText("登录 点击");
    }
}

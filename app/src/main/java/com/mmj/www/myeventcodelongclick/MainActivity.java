package com.mmj.www.myeventcodelongclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{
    Button btn1;
    Button btn2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        textView = (TextView)findViewById(R.id.text2);
    }


    @Override
    public boolean onLongClick(View view) {
        int id = view.getId();
        String text;
        switch (id){
            case R.id.btn1:
                text = ((Button)view).getText().toString();
                break;

        }
        Toast.makeText(this,(Button)view.getId())
          //textView.setText(text);
          return true;
    }
}
}

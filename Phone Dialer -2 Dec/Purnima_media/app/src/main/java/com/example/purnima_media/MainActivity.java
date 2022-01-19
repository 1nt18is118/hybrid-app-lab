package com.example.purnima_media;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText t1;//GLOBAL VARIABLE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.phone);
        Button call=findViewById(R.id.call);
        call.setOnClickListener( new View.OnClickListener(){
         @Override
         public void onClick(View v)
         {
            String num=t1.getText().toString();
            Intent it=new Intent(Intent.ACTION_DIAL);
            it.setData(Uri.parse("tel:"+num));//CASE SENSITIVE
            startActivity(it);
         }
     });
    }
}
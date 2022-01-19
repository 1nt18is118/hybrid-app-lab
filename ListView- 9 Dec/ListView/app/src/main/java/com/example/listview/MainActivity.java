package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    ListView myList ;
    String countryList[] ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList = findViewById(R.id.list) ;
        countryList = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
                countryList);
        myList.setAdapter(arrayAdapter);
myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, "You have clicked: "+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
    }
});
    }


}
package com.pila.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCount(View view) {
        count++;
        TextView showCount = findViewById(R.id.show_count);
        showCount.setText(Integer.toString(count));
        Log.i("Count",Integer.toString(count));
    }

    public void onToast(View view) {
        Toast.makeText(this, Integer.toString(count), Toast.LENGTH_SHORT).show();
    }
}
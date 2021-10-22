package com.pila.clicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    String KEY_COUNT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY_COUNT);
            TextView showCount = findViewById(R.id.show_count);
            showCount.setText(Integer.toString(count));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
    }

    public void onCount(View view) {
        TextView showCount = findViewById(R.id.show_count);
        Switch multiplicador = findViewById(R.id.multiplicador);
        if (multiplicador.isChecked()) {
            count = (count+1) * 10;
        } else {
            count++;
        }
        showCount.setText(Integer.toString(count));
        Log.i("Count", Integer.toString(count));
    }

    public void onToast(View view) {
        Toast.makeText(this, Integer.toString(count), Toast.LENGTH_SHORT).show();
    }
}
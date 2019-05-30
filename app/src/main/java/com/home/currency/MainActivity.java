package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText edNtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNtd = findViewById(R.id.ntd);
//
    }

    public void go(View view) {
        String ntdS = edNtd.getText().toString();
        if (ntdS.equals("")) {
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter you NTD amount")
                    .setPositiveButton("OK", null)
                    .show();
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("USD is " + Float.parseFloat(ntdS)*30.9f)
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
}

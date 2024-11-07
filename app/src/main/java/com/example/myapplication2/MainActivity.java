package com.example.myapplication2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etName,etYear;
    private View tvShowDetails;
    private String name, details;
    private int year;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etYear=findViewById(R.id.etYear);
        tvShowDetails=findViewById(R.id.tvShowDetails);
        



    }

    public void shoDetails(View view) {
        if(etName.getText().toString().isEmpty()||etYear.getText().toString().isEmpty()) {
            Toast.makeText(this, "please fill in fields", Toast.LENGTH_LONG).show();
        }
        else {
            name = etName.getText().toString();
            year = Integer.parseInt(etYear.getText().toString());
            int age = 2024 - year;
            details="welcome "+name+"Your age is:"+age;
            tvShowDetails.setTextDirection(Integer.parseInt(details));
        }
    }
}
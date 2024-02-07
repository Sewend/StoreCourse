package com.example.shop;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class contacts_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);
    }
    public void aboutUs(View view) {
        Intent intent = new Intent(this, abou_us.class);
        startActivity(intent);
    }
    public void mainActivity(View v) {
        finish();
    }
}
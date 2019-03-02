package com.example.saramazloumi.daycareapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editTextDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextDesc = findViewById(R.id.editTextDesc);
    }

    public void sendResult(View view){

        Intent intent = new Intent();
        if(!editTextDesc.getText().toString().equals("")){
            intent.putExtra("res", editTextDesc.getText().toString());
            setResult(RESULT_OK, intent);
        }else
            setResult(RESULT_CANCELED,intent);
            finish();
    }
}

package com.example.saramazloumi.daycareapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import model.Tasks;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private int textWidget[] = {R.id.textViewBM, R.id.textViewBW, R.id.textViewBTH, R.id.textViewLM, R.id.textViewLT, R.id.textViewLW, R.id.textViewLTH,
    R.id.textViewLF, R.id.textViewSM, R.id.textViewST, R.id.textViewSTH};
    TextView [] textList = new TextView[11];
    TextView clickedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initialize();
    }

    public void initialize(){

        Tasks[] listOfTasks = new Tasks[11];
        listOfTasks [0] = new Tasks("cheerios" + "\n"+"Banana" + "\n" + "Milk");
        listOfTasks [1] = new Tasks("Pancake" + "\n" + "Blueberries" + "\n" + "Milk");
        listOfTasks [2] = new Tasks("Scrambled eggs & toast" + "\n"+"Potatoes"+ "\n" + "100% juice");
        listOfTasks [3] = new Tasks("Mashed" + "\n" +"potatoes"+ "\n" + "peas & Corn" +"\n" + "bread & butter" + "\n" + "Milk");
        listOfTasks [4] = new Tasks("Tuna Fish" + "\n" + "sandwich" + "\n"+ "Applesauce" + "\n" +"Carrot sticks" + "\n" + "Milk");
        listOfTasks [5] = new Tasks("Rice & chicken" + "\n" + "stew" + "\n" + "Carrots & potatoes" + "\n" + "Milk");
        listOfTasks [6] = new Tasks("Macaroni &" + "\n" + "cheese" + "\n"+"Fish sticks" + "\n" + "Green beans" + "\n" + "Milk");
        listOfTasks [7] = new Tasks("Whole wheat" + "\n" + "pizza" +"\n" + "spinach" + "\n" + "Orange slices" + "\n" + "Milk");
        listOfTasks [8] = new Tasks("Crackers with" + "\n" + "peanut butter" + "\n" + "100% Juice");
        listOfTasks [9] = new Tasks("Yogurt Raisins/Peaches," + "\n" + "100% Juice");
        listOfTasks[10] = new Tasks("Home-made Blueberry" + "\n" + "Muffin" + "\n" + "100% Juice");

        for(int i =0; i < listOfTasks.length; i++){

            textList[i] = findViewById(textWidget[i]);
            textList[i].setText(listOfTasks[i].toString());
            textList[i].setTextColor(listOfTasks[i].getColor());
            textList[i].setOnClickListener(this);

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            String myData = (String) data.getSerializableExtra("res");
            clickedTextView.setText(myData);
        }else{
            Toast.makeText(this, "No data received", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        clickedTextView = (TextView)v;
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent,1);

    }
}

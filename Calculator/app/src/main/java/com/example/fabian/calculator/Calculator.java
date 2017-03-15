package com.example.fabian.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Calculator extends Activity implements View.OnClickListener {

    TextView numberView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        setNumberButtonListener();

        numberView = (TextView) findViewById(R.id.numberView);
    }


    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;
        switch (clickedButton.getId()) {
            case R.id.buttonPlus:
                break;
            case R.id.buttonMinus:
                break;
            case R.id.buttonMultiply:
                break;
            case R.id.buttonDivide:
                break;
            case R.id.buttonC:
                break;
            case R.id.buttonEqual:
                break;
            default:
                String recentNumber​ = numberView.getText().toString();
                if (recentNumber​.equals("0")) {
                    recentNumber​ = "";
                }
                recentNumber​ += clickedButton.getText().toString();
                numberView.setText(recentNumber​);
        }
        System.out.println("Current text: " + numberView.getText());
    }

    public void setNumberButtonListener() {
        for (int i = 0; i <= 9; i++) {
            String buttonName = "button" + i;
            int id = getResources().getIdentifier(buttonName, "id", R.class.getPackage().getName());
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
        }

        Button tempButton;
        tempButton = (Button) findViewById(R.id.buttonC);
        tempButton.setOnClickListener(this);
        tempButton = (Button) findViewById(R.id.buttonEqual);
        tempButton.setOnClickListener(this);
        tempButton = (Button) findViewById(R.id.buttonPlus);
        tempButton.setOnClickListener(this);
        tempButton = (Button) findViewById(R.id.buttonMinus);
        tempButton.setOnClickListener(this);
        tempButton = (Button) findViewById(R.id.buttonMultiply);
        tempButton.setOnClickListener(this);
        tempButton = (Button) findViewById(R.id.buttonDivide);
        tempButton.setOnClickListener(this);
    }
}

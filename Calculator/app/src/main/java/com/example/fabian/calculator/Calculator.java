package com.example.fabian.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Calculator extends Activity implements View.OnClickListener {

    ArrayList<Button> numberButtons;

    TextView numberView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonC;
    Button buttonEqual;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        numberView = (TextView) findViewById(R.id.numberView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
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

            numberButtons.add(button);
        }
    }
}

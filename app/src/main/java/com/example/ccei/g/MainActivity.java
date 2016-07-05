package com.example.ccei.g;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList arrayList = new ArrayList();

    int count = 0;
    TextView input_text;
    TextView ing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        ing = (TextView) findViewById(R.id.ing);
        input_text = (TextView) findViewById(R.id.input_text);

        Button clear = (Button) findViewById(R.id.clear);
        Button dot = (Button) findViewById(R.id.dot);

        Button num_0 = (Button) findViewById(R.id.num_0);
        Button num_1 = (Button) findViewById(R.id.num_1);
        Button num_2 = (Button) findViewById(R.id.num_2);
        Button num_3 = (Button) findViewById(R.id.num_3);
        Button num_4 = (Button) findViewById(R.id.num_4);
        Button num_5 = (Button) findViewById(R.id.num_5);
        Button num_6 = (Button) findViewById(R.id.num_6);
        Button num_7 = (Button) findViewById(R.id.num_7);
        Button num_8 = (Button) findViewById(R.id.num_8);
        Button num_9 = (Button) findViewById(R.id.num_9);

        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button mul = (Button) findViewById(R.id.mul);
        Button dev = (Button) findViewById(R.id.dev);
        Button result = (Button) findViewById(R.id.result);

        clear.setOnClickListener(this);
        dot.setOnClickListener(this);

        num_0.setOnClickListener(this);
        num_1.setOnClickListener(this);
        num_2.setOnClickListener(this);
        num_3.setOnClickListener(this);
        num_4.setOnClickListener(this);
        num_5.setOnClickListener(this);
        num_6.setOnClickListener(this);
        num_7.setOnClickListener(this);
        num_8.setOnClickListener(this);
        num_9.setOnClickListener(this);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        dev.setOnClickListener(this);
        result.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dot:
                input_text.setText(input_text.getText().toString() + ".");
                break;
            case R.id.clear:
                ing.setText("");
                input_text.setText(null);
                break;

            case R.id.num_0:
                input_text.setText(input_text.getText().toString() + "0");
                ing.append("0");
                break;
            case R.id.num_1:
                input_text.setText(input_text.getText().toString() + "1");
                ing.append("1");
                break;
            case R.id.num_2:
                input_text.setText(input_text.getText().toString() + "2");
                ing.append("2");
                break;
            case R.id.num_3:
                input_text.setText(input_text.getText().toString() + "3");
                ing.append("3");
                break;
            case R.id.num_4:
                input_text.setText(input_text.getText().toString() + "4");
                ing.append("4");
                break;
            case R.id.num_5:
                input_text.setText(input_text.getText().toString() + "5");
                ing.append("5");
                break;
            case R.id.num_6:
                input_text.setText(input_text.getText().toString() + "6");
                ing.append("6");
                break;
            case R.id.num_7:
                input_text.setText(input_text.getText().toString() + "7");
                ing.append("7");
                break;
            case R.id.num_8:
                input_text.setText(input_text.getText().toString() + "8");
                ing.append("8");
                break;
            case R.id.num_9:
                input_text.setText(input_text.getText().toString() + "9");
                ing.append("9");
                break;

            case R.id.plus:
                arrayList.add(input_text.getText().toString());
                input_text.setText("");
                ing.append("+");
                count = 1;
                break;



            case R.id.mul:
                arrayList.add(input_text.getText().toString());
                input_text.setText("");
                ing.append("*");
                count = 3;
                break;

            case R.id.dev:
                arrayList.add(input_text.getText().toString());
                input_text.setText("");
                ing.append("/");
                count = 4;
                break;

            case R.id.result:
                int sum1 = 0, sum2 = 0, sum3, count2 = 0;
                double fsum1 = 0, fsum2 = 0, fsum3 = 0;

                if (arrayList.isEmpty()) {
                    input_text.setText("");
                } else {
                    Object obj = arrayList.get(0);
                    String num1 = (String) obj;
                    String num2 = input_text.getText().toString();

                    if (num1.contains(".") || num2.contains(".")) {
                        count2 = 1;
                        fsum1 = Float.parseFloat(num1);
                        fsum2 = Float.parseFloat(num2);

                    } else {
                        sum1 = Integer.parseInt(num1);
                        sum2 = Integer.parseInt(num2);
                        sum3 = 0;
                    }
                    String val = "";

                    switch (count) {
                        case 0:
                            input_text.setText("");

                        case 1:
                            if (count2 == 1) {
                                fsum3 = fsum1 + fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 + sum2;
                                val = String.valueOf(sum3);
                            }
                            input_text.setText(val);
                            arrayList.clear();
                            break;

                        case 2:
                            if (count2 == 1) {
                                fsum3 = fsum1 - fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 - sum2;
                                val = String.valueOf(sum3);
                            }
                            input_text.setText(val);
                            arrayList.clear();
                            break;

                        case 3:
                            if (count2 == 1) {
                                fsum3 = fsum1 * fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 * sum2;
                                val = String.valueOf(sum3);
                            }
                            input_text.setText(val);
                            arrayList.clear();
                            break;

                        case 4:

                            if (count2 == 1) {

                                fsum3 = fsum1 / fsum2;
                                val = String.valueOf(fsum3);
                            } else {
                                sum3 = sum1 / sum2;
                                val = String.valueOf(sum3);
                            }
                            input_text.setText(val);
                            arrayList.clear();
                            break;
                    }
                }
                break;
        }
    }
}


package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static double result = 0.0;
    public static String operator = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNumber1 = (Button) findViewById(R.id.btnNumber1);
        Button btnNumber2 = (Button) findViewById(R.id.btnNumber2);
        Button btnNumber3 = (Button) findViewById(R.id.btnNumber3);
        Button btnNumber4 = (Button) findViewById(R.id.btnNumber4);
        Button btnNumber5 = (Button) findViewById(R.id.btnNumber5);
        Button btnNumber6 = (Button) findViewById(R.id.btnNumber6);
        Button btnNumber7 = (Button) findViewById(R.id.btnNumber7);
        Button btnNumber8 = (Button) findViewById(R.id.btnNumber8);
        Button btnNumber9 = (Button) findViewById(R.id.btnNumber9);
        Button btnNumber0 = (Button) findViewById(R.id.btnNumber0);
        Button btnC = (Button) findViewById(R.id.btnC);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnMul = (Button) findViewById(R.id.btnMul);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnResult = (Button) findViewById(R.id.btnResult);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);


        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("1");
                } else {
                    txtResult.setText(txtResult.getText() + "1");
                }
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("2");
                } else {
                    txtResult.setText(txtResult.getText() + "2");
                }
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("3");
                } else {
                    txtResult.setText(txtResult.getText() + "3");
                }
            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("4");
                } else {
                    txtResult.setText(txtResult.getText() + "4");
                }
            }
        });
        btnNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("5");
                } else {
                    txtResult.setText(txtResult.getText() + "5");
                }
            }
        });
        btnNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("6");
                } else {
                    txtResult.setText(txtResult.getText() + "6");
                }
            }
        });
        btnNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("7");
                } else {
                    txtResult.setText(txtResult.getText() + "7");
                }
            }
        });
        btnNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("8");
                } else {
                    txtResult.setText(txtResult.getText() + "8");
                }
            }
        });
        btnNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtResult.getText().equals("0")) {
                    txtResult.setText("9");
                } else {
                    txtResult.setText(txtResult.getText() + "9");
                }
            }
        });
        btnNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtResult.getText().equals("0")) {
                    txtResult.setText(txtResult.getText() + "0");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtResult.getText().equals("0")) {
                    result = Float.parseFloat(txtResult.getText() + "");
                }
                operator = "+";
                txtResult.setText("0");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtResult.getText().equals("0")) {
                    result = Float.parseFloat(txtResult.getText() + "");
                }
                operator = "-";
                txtResult.setText("0");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtResult.getText().equals("0")) {
                    result = Float.parseFloat(txtResult.getText() + "");
                }
                operator = "*";
                txtResult.setText("0");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtResult.getText().equals("0")) {
                    result = Float.parseFloat(txtResult.getText() + "");
                }
                operator = "/";
                txtResult.setText("0");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = null;
                txtResult.setText("0");
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float temp = Float.parseFloat(txtResult.getText() + "");
                switch (operator) {
                    case "+":
                        txtResult.setText(result + temp + "");
                        operator = null;
                        break;
                    case "-":
                        txtResult.setText(result - temp + "");
                        operator = null;
                        break;
                    case "*":
                        txtResult.setText(result * temp + "");
                        operator = null;
                        break;
                    case "/":
                        if (temp == 0) {
                            txtResult.setText("Error!");
                            operator = null;
                        } else {
                            txtResult.setText(result / temp + "");
                            operator = null;
                        }
                        break;
                    default:
                        txtResult.setText(temp + "");
                        break;


                }
            }
        });
    }
}

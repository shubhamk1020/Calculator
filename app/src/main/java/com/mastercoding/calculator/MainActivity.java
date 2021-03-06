package com.mastercoding.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edFirst,edSecond;
    Button  add,sub,mul,div,clear;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edFirst = findViewById(R.id.edFirstValue);
        edSecond = findViewById(R.id.edSecondValue);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
        clear = findViewById(R.id.clear);

        txt = findViewById(R.id.tvAns);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first , sec , ans;

                first = Integer.parseInt(edFirst.getText().toString());
                sec = Integer.parseInt(edSecond.getText().toString());

                ans = first + sec;

                txt.setText(""+ans);
            }
        });

       sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first , sec , ans;

                first = Integer.parseInt(edFirst.getText().toString());
                sec = Integer.parseInt(edSecond.getText().toString());

                ans = first - sec;

                txt.setText(""+ans);
            }
        });
       mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first , sec , ans;

                first = Integer.parseInt(edFirst.getText().toString());
                sec = Integer.parseInt(edSecond.getText().toString());

                ans = first * sec;

                txt.setText(""+ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first , sec , ans;

                first = Integer.parseInt(edFirst.getText().toString());
                sec = Integer.parseInt(edSecond.getText().toString());

                ans = first / sec;

                txt.setText(""+ans);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            new AlertDialog.Builder(MainActivity.this)
                    .setIcon(R.drawable.ic_baseline_warning_24)
                    .setTitle("Exit")
                    .setMessage("Are you sure you want to exit this app")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }).setNeutralButton("Help", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Press Yes to exit this app", Toast.LENGTH_SHORT).show();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).show();
            }
        });


    }

    @Override
    public void onBackPressed() {
            new AlertDialog.Builder(MainActivity.this)
                    .setIcon(R.drawable.ic_baseline_warning_24)
                    .setTitle("Exit")
                    .setMessage("Are you sure you want to exit this app")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    }).setNeutralButton("Help", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Press Yes to exit this app", Toast.LENGTH_SHORT).show();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).show();
        }
    }

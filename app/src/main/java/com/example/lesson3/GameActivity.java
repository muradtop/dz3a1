package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btn1, btn2, btn3;
    Button btnOne, btnTwo, btnThree;
    boolean isjorno, isjotaro, issindzi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialization();
        listeners();
        initView();

    }



    private void initialization() {
        imImage = findViewById(R.id.im_image);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btnOne = findViewById(R.id.btn_One);
        btnTwo = findViewById(R.id.btn_twu);
        btnThree = findViewById(R.id.btn_three);

    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                imImage.setImageResource(R.drawable.jorno);
                 isjorno= true;
                isjotaro = false;
                issindzi = false;
                break;
            case R.id.btn_2:
                imImage.setImageResource(R.drawable.jotaro);
                isjotaro = true;
                issindzi = false;
                isjorno = false;
                break;
            case R.id.btn_3:
                imImage.setImageResource(R.drawable.sindzi);
                issindzi = true;
                isjorno = false;
                isjotaro = false;
                break;
        }

    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isjorno) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_SHORT).show();

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isjotaro) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_LONG).show();
                return;
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (issindzi) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else  
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_LONG).show();
                return;
            }
        });

    }
    private void initView() {
        imImage =findViewById(R.id.im_image);
        btnOne = findViewById(R.id.btn_1);
        btnTwo = findViewById(R.id.btn_2);
        btnThree = findViewById(R.id.btn_3);
    }



    }






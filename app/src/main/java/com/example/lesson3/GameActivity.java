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
    boolean isPen,isBook,isChair;




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
                imImage.setImageResource(R.drawable.pen);
                isPen = true;
                isBook = false;
                isChair = false;
                break;
            case R.id.btn_2:
                imImage.setImageResource(R.drawable.book);
                isBook= true;
                isChair= false;
                isPen = false;
                break;
            case R.id.btn_3:
                imImage.setImageResource(R.drawable.chair);
                isChair = true;
                isPen = false;
                isBook= false;
                break;
        }

    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPen) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_SHORT).show();

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBook) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_LONG).show();
                return;
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChair) {
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






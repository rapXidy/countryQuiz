package com.example.countryquiz;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.countryquiz.R.drawable.frenchFlag;
import static com.example.countryquiz.R.drawable.haitiFlag;

public class MainActivity extends AppCompatActivity {

    public ImageView nigeria, china, georgia, canada, southAfrica, haiti, marcedonia, france, austria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nigeria = findViewById(R.id.imgnigeria);
        china = findViewById(R.id.imgchina);
        georgia = findViewById(R.id.imggeorgia);
        canada = findViewById(R.id.imgcanada);
        southAfrica = findViewById(R.id.imgsouthAfrica);
        haiti = findViewById(R.id.imghaiti);
        marcedonia = findViewById(R.id.imgmarcedonia);
        france = findViewById(R.id.imgfrance);
        austria = findViewById(R.id.imgaustria);

    }

    public void clickNig(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.nigeriaFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);

    }

    public void clickChina(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chinaFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }


    public void clickAustria(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.austriaFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }

    public void clickSouthAfrica(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.southAfricaFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }

    public void clickHaiti(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), haitiFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }

    public void clickFrance(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.frenchFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }

    public void clickMarcedonia(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.marcedoniaFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }

    public void clickCanada(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.canadaflag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }

    public void clickGeorgia(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.georgiaFlag);
        Intent intent = new Intent(new Intent(MainActivity.this, Questions.class));
        intent.putExtra("Bitmap", bitmap);
        startActivity(intent);
    }
}
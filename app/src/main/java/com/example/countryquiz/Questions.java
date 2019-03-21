package com.example.countryquiz;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Questions extends AppCompatActivity {

    public ImageView imgChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        imgChange = findViewById(R.id.imgChange);

        Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        imgChange.setImageBitmap(bitmap);
    }
}

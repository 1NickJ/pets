package com.lambdaschool.pets4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout listLayout;
    TextView textView;
    String[] animals = {"lion","giraffe","fish","monkey","Zebra", "cat", "dog", "lizard", "elephant","snake","sloth","beetle", "gazelle", "horse", "deer","sheep","bear","armadillo"};
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listLayout = findViewById(R.id.list_layout);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int arraySize = animals.length;
                for (int i = 0; i < arraySize; i++) {
                    textView.append(animals[i]);
                    textView.append("\n");
                }
            }
                });
    }
}

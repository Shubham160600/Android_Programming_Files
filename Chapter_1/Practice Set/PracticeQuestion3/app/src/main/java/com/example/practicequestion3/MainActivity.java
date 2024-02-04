package com.example.practicequestion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText myEditText;
    private TextView myTextView;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = findViewById(R.id.editTextNumber);
        myTextView = findViewById(R.id.textView2);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder str = new StringBuilder();
                String s1 = myEditText.getText().toString();
                int v1 = Integer.parseInt(s1);
                for (int i = 1; i <= 10; i++) {
                    str.append(v1 + " * " + i + " = " + (v1 * i) + "\n");
                }
                myTextView.setText(str);
            }
        });
    }
}
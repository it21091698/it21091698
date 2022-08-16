package com.example.mycalculater;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.etYear);
        btn=findViewById(R.id.btnCalculate);
        tv=findViewById(R.id.tvAge);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer birthYear = Integer.parseInt(et.getText().toString());
                Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
                Integer age = currentYear - birthYear ;

                tv.setText("Your age is " + age + " Years");
            }
        });
    }

    public void calAge(View view)
    {

    }



}
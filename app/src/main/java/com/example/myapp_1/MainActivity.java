package com.example.myapp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public EditText String_input;
    public TextView String_output_1;

    public void Check_String(View v) {
        String_input = findViewById(R.id.String_input_1);
        String_output_1 = findViewById(R.id.String_output);
        String_output_1.setText("");

        String string_check = String_input.getText().toString();

        boolean check = true;
        try {
            double check_number = Double.parseDouble(string_check);
        }
        catch (NumberFormatException nfe) {
            check = false;
        }

        if (!check) {
            String_output_1.setText("This is a string");;
        } else {
            String_output_1.setText("This is a number");
        }
    }
}
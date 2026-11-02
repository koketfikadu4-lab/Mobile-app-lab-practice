package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etPhone;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et1);
        etPhone = findViewById(R.id.et2);
        btnSubmit = findViewById(R.id.button1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String phone = etPhone.getText().toString().trim();

                if (name.isEmpty()) {
                    etName.setError("Please enter your name");
                    return;
                }
                if (phone.isEmpty()) {
                    etPhone.setError("Please enter your phone number");
                    return;
                }

                Toast.makeText(getApplicationContext(),
                        "Hello " + name + " (" + phone + ")",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}

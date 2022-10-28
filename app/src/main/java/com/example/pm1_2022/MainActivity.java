package com.example.pm1_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    Button btnmostrar,btnsuma,btnresta,btnmultipli,btndivision;
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        t1 = (TextView) findViewById(R.id.txtvsuma);
        t2 = (TextView) findViewById(R.id.txtvresta);
        t3 = (TextView) findViewById(R.id.txtvmult);
        t4 = (TextView) findViewById(R.id.txtvdiv);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmultipli = (Button) findViewById(R.id.btnmultipli);
        btndivision = (Button) findViewById(R.id.btndivision);



        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String valor1= txtnum1.getText().toString();
               String valor2=txtnum2.getText().toString();

               int total = Integer.parseInt(valor1) + Integer.parseInt(valor2);

               String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);


            }
        });


        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= txtnum1.getText().toString();
                String valor2=txtnum2.getText().toString();

                int total = Integer.parseInt(valor1) - Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });



        btnmultipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= txtnum1.getText().toString();
                String valor2=txtnum2.getText().toString();

                int total = Integer.parseInt(valor1) * Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });



        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= txtnum1.getText().toString();
                String valor2=txtnum2.getText().toString();

                int total = Integer.parseInt(valor1) / Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });

    }
}
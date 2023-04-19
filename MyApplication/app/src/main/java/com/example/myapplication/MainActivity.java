package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 =findViewById(R.id.numero1);
        numero2 =findViewById(R.id.numero2);
        resultado =findViewById(R.id.resultado);
    }
    public void sumar(View view){
        String valor1=numero1.getText().toString();
        String valor2=numero2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int suma=num1+num2;
        String res =String.valueOf(suma);
        resultado.setText(res);
    }

    public void multiplicar(View view){
        String valor1=numero1.getText().toString();
        String valor2=numero2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int suma=num1*num2;
        String res =String.valueOf(suma);
        resultado.setText(res);
    }

    public void dividir(View view){
        String valor1=numero1.getText().toString();
        String valor2=numero2.getText().toString();


        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        if(num2!= 0){
            int suma=num1*num2;
            String res =String.valueOf(suma);
            resultado.setText(res);
        }}
        public void restar(View view){
            String valor1 = numero1.getText().toString();
            String valor2 = numero2.getText().toString();


            int num1 = Integer.parseInt(valor1);
            int num2 = Integer.parseInt(valor2);
            if (num1 >= num2) {
                int suma = num1 * num2;
                String res = String.valueOf(suma);
                resultado.setText(res);
            }
        }}

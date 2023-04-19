package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numero1,numero2;
    private TextView resultado;
    private RadioButton radioButtonSuma, radioButtonResta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1=findViewById(R.id.numero1);
        numero2=findViewById(R.id.numero2);
        resultado=findViewById(R.id.textViewResultado);
        radioButtonSuma=findViewById(R.id.radioButtonSuma);
        radioButtonResta=findViewById(R.id.radioButtonResta);
    }
    public void sumaResta(View view){
        String valor1=numero1.getText().toString();
        String valor2=numero2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);

        if(radioButtonSuma.isChecked()){
            int resul=num1+num2;
            String res =String.valueOf(resul);
            resultado.setText(res);


        } else if(radioButtonResta.isChecked()){
            int resul=num1-num2;
            String res =String.valueOf(resul);
            resultado.setText(res);

        }

    }
}
package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero1, editTextNumero2;
    private TextView textViewResultado;
    private CheckBox checkBoxSumar, checkBoxRestar;

    //Definir un objeto de la clase spinner
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        textViewResultado = findViewById(R.id.textViewResultado);
        checkBoxSumar = findViewById(R.id.checkBoxSumar);
        checkBoxRestar = findViewById(R.id.checkBoxRestar);

        //Obtenemos la referencia al control visual del activity_main
        spinner = findViewById(R.id.spinner);


        //Definimos un arreglo con una lista de string que le pasaremos como opcines al spinner
        String []opciones = {"Sumar", "Restar", "Multipliacar", "Dividir"};

        //Definimos y cremos un objeto de la clase ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);

        //Llamamos al método setAdapter de la clase spinner y le pasamos como referencia el adapter que creamos anteriormente

        spinner.setAdapter(adapter);

    }

    public void sumaryRestar(View view){

        String valor1 = editTextNumero1.getText().toString();
        String valor2 = editTextNumero2.getText().toString();

        String seleccion = spinner.getSelectedItem().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        String result = "";

        if(checkBoxSumar.isChecked() == true){
            int sumar = numero1 + numero2;
            result =  "La suma es" + sumar;
        }

        if(checkBoxRestar.isChecked() == true){
            int resta = numero1 - numero2;
            result = result + ". La resta es" + resta;

        }

        if(seleccion.equals("Sumar")){

            int sumar = numero1 + numero2;
            String resultado = String.valueOf(sumar);
            textViewResultado.setText(resultado);
            System.out.println("SI, suma");


        }else if (seleccion.equals("Restar")){

            int resta = numero1 - numero2;
            String resultado = String.valueOf(resta);
            textViewResultado.setText(resultado);


        } else if (seleccion.equals("Multipliacar")){

            int multi = numero1 * numero2;
            String resultado = String.valueOf(multi);
            textViewResultado.setText(resultado);


        }else if (seleccion.equals("Dividir")){

            int divi = numero1 / numero2;
            String resultado = String.valueOf(divi);
            textViewResultado.setText(resultado);


        }

        //textViewResultado.setText(result);

    }
}
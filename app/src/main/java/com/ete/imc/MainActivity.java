package com.ete.imc;

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

public void CalcularImc(View v){

    EditText altura = findViewById(R.id.altura);
    Double alt = Double.parseDouble(altura.getText().toString());

    EditText peso = findViewById(R.id.peso);
    Double peso1 = Double.parseDouble(peso.getText().toString());

    TextView resultado = findViewById(R.id.resultado);

    Double imc = peso1/(alt*alt);

    if(imc < 18.5){
        resultado.setText("abaixo do peso : "+imc.shortValue());
    }else if(imc >= 18.6 && imc <= 24.9){
        resultado.setText("peso ideal : "+imc.shortValue());
    }else if(imc >=25.9 && imc <= 29.9 ) {
        resultado.setText("levemente acima do peso : IMC : "+imc.shortValue());
    }else if(imc >= 30.0 && imc <= 34.9){
        resultado.setText("obesidade grau 1 :  IMC :  "+imc.shortValue());
    }else if(imc >= 35.0 && imc <= 39.9){
        resultado.setText("obseidade grau2 severa :  IMC :  "+imc.shortValue());
    }else if(imc > 40){
        resultado.setText("obesidade 3 mórbida :  IMC :  "+imc.shortValue());
//modigi
    }
}

}

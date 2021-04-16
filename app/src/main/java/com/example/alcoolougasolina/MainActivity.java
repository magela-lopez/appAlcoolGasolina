package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText priceAlcoolTxt;
    private EditText priceGasolinaTxt;
    private EditText resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceAlcoolTxt = findViewById(R.id.price_alcool);
        priceGasolinaTxt = findViewById(R.id.price_gasolina);
        resultTxt = findViewById(R.id.resultado);

    }

    public void Calculo(View view){

        if(priceAlcoolTxt.getText().toString().isEmpty()){
            resultTxt.setText("Preço do Alcool vazio");
        }else if (priceGasolinaTxt.getText().toString().isEmpty()){
            resultTxt.setText("Preço da Gasolina vazio");
        }else if(priceGasolinaTxt.getText().toString().isEmpty() && priceAlcoolTxt.getText().toString().isEmpty()){
            resultTxt.setText("Indique os preços dos combustiveis");
        }else{
            double pAlcool = Float.parseFloat(priceAlcoolTxt.getText().toString());
            double pGasolina = Float.parseFloat(priceGasolinaTxt.getText().toString());

            double res = pGasolina * 0.7;

            if(res >= pAlcool ){
                resultTxt.setText("Melhor abastecer com Alcool");
            }else{
                resultTxt.setText("Melhor abastecer com Gasolina");
            }
        }

    }
}
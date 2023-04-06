package com.example.kiszcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inicial, mensal, meses, taxa;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicial = findViewById(R.id.inicial);
        mensal = findViewById(R.id.mensal);
        meses = findViewById(R.id.meses);
        taxa = findViewById(R.id.taxa);
        resultado = findViewById(R.id.resultado);
    }

    public void Calcular(View view){
        double vl_inicial = Double.parseDouble(inicial.getText().toString());
        double vl_mensal = Double.parseDouble(mensal.getText().toString());
        double qtd_meses = Double.parseDouble(meses.getText().toString());
        double vl_taxa = Double.parseDouble(taxa.getText().toString());

        double result = (vl_inicial * Math.pow((1 + vl_taxa),qtd_meses)) + (vl_mensal * Math.pow((1 + vl_taxa),qtd_meses));
        resultado.setText(String.format("Valor total: %.2f",result));

    }

}
package com.foc.pmdm.u2.calculadorafoc1617;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvVisor;

    // TODO: usar números decimales
    // TODO: controlar el tamaño máximo de los números

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvVisor=(TextView)findViewById(R.id.tvVisor);

        // Vamos a establecer "por codigo" el listener de los botones
        Button bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(this); // Usamos la referencia al propio activity

        // TODO: hacerlo con todos los demas botones. 2 formas de hacer:
        //              * Crear un array con los ids y recorrerlo en un bucle for
        //              * Buscar una referencia al TableLayout y recorrer recursivamente los controles y sus hijos
        //                  asignando a todos aquellos que sean botones el listener
    }


    void limpiaVisor()
    {
        tvVisor.setText(R.string.valorInicial);
    }

    String strPrimeroOperador;
    int idOperadorPulsado;
    public void onClick(View v)
    {
        Button btBotonPulsado=(Button)v;
        switch(v.getId())
        {
            case R.id.bt1:
            case R.id.bt2:
            case R.id.bt3:
            case R.id.bt4:
            case R.id.bt5:
            case R.id.bt6:
            case R.id.bt7:
            case R.id.bt8:
            case R.id.bt9:
                // TODO: Añadir el boton 0
                // TODO: Eliminar el 0 inicial
                String strTextoVisor=tvVisor.getText().toString();
                strTextoVisor=strTextoVisor+btBotonPulsado.getText();
                tvVisor.setText(strTextoVisor);
                break;

            case R.id.btMas:
            case R.id.btMenos:
                strPrimeroOperador=tvVisor.getText().toString();
                idOperadorPulsado=v.getId();
                break;
            case R.id.btIgual:
                String strSegundoOperador=tvVisor.getText().toString();
                switch(idOperadorPulsado)
                {
                    // TODO: Convertir los operadores a numericos

                    case R.id.btMas:
                        // TODO: hacer operacion mas
                        break;

                    case R.id.btMenos:
                        // TODO: hacer operacion menos
                        break;

                    // TODO: Operador multiplicación
                    // TODO: Operador división
                }
                break;
            case R.id.btBorrado:
                limpiaVisor();
                break;
        }

    }
}

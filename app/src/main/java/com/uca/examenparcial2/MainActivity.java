package com.uca.examenparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pregunta, respuesta;
    Button respuestaBT, siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pregunta = (TextView) findViewById(R.id.preguntaid);
        respuesta = (TextView) findViewById(R.id.respuestaID);
        respuestaBT = (Button) findViewById(R.id.respuestaid);
        siguiente = (Button) findViewById(R.id.siguienteid);
    }
    public void respuesta(View v) {
        respuesta.setText("Un objeto es la plantilla de una clase");
    }
    public void siguiente(View v) {
        pregunta.setText("2 ¿Cuáles son las diferencias de atributo y método?");
    }

    {
        respuesta.setText("El atributo son caracteristicas del objeto "+ " El metodo son las acciones que realizara el objeto");
    }

    {
        pregunta.setText("3 ¿Qué es una clase?");
    }

    {
        respuesta.setText("Define características y funciones de un objeto");
    }

    {
        pregunta.setText("4 Es el proceso de definir los atributos y métodos de una clase");
    }

    {
        respuesta.setText("Abstracción");
    }
    {
        pregunta.setText("5 Las siguientes clases hijo mantienen características tales como atributos y métodos otorgandole a las clases el derecho de padre");
    }

    {
        respuesta.setText("Herencia");
    }

    {
        pregunta.setText("6 Protege la información de manipulaciones no autorizadas");
    }

    {
        respuesta.setText("Encapsulamiento");
    }
}
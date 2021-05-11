package com.example.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import andorid.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí" +
                       "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde\",\n" +
                       "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso" +
                         "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen
        Ball=findViewById(R.id.btn);
        //referencia texto
        respuesta = findViewById(R.id.respuestavista);

        //proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.tihs, "Consulta tu suerte", Toast.LENGTH_SHORT).show();

    }
    @Overrride
    public void onClick(View v){
        //Creación metodo switch
    switch(v.getId()){
        case R.id.btn:
            int rand = new Random().nextInt(respuestaArray.length);
            respuesta.setText(respuestaArray[rand]);

            break;
    }

    }
}
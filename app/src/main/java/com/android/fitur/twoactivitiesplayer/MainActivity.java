package com.android.fitur.twoactivitiesplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Fitur on 15/09/2015.
 */
public class MainActivity extends Activity{
    //todo: no siempre vuelve a aparecer la barra en la aplicacion

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

        Button boton=(Button)findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TouchActivity.class);
                intent.putExtra("TIME",0);
                intent.putExtra("STATUS",true);
                intent.putExtra("MODE",0);
                startActivity(intent);
            }
        });

    }
}

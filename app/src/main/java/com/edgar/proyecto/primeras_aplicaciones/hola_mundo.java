package com.edgar.proyecto.primeras_aplicaciones;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class hola_mundo extends ActionBarActivity {
    EditText campo;
    Button enviar;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        campo = (EditText) findViewById(R.id.campo);
        enviar = (Button) findViewById(R.id.boton);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:
                msg = "Bienvenido "+campo.getText().toString() + " a mi aplicacion";
                Intent intent = new Intent(getBaseContext(),Mensaje.class);
                intent.putExtra("valor",msg);
                 startActivity(intent);
                break;
            default: break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hola_mundo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.edgar.proyecto.primeras_aplicaciones;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class PrincipalActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
        if (id == R.id.hola) {
            Intent a = new Intent(getBaseContext(),hola_mundo.class);
            startActivity(a);
            return true;
        }
        if (id == R.id.checkbox) {
            Intent a = new Intent(getBaseContext(),checkbox.class);
            startActivity(a);
            return true;
        }
        if (id == R.id.listview) {
            Intent a = new Intent(getBaseContext(),listview.class);
            startActivity(a);
            return true;
        }
        if (id == R.id.textview) {
            Intent a = new Intent(getBaseContext(),textview.class);
            startActivity(a);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

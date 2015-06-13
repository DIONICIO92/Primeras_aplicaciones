package com.edgar.proyecto.primeras_aplicaciones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class checkbox extends ActionBarActivity {
    TextView textView;
    Button boton;
    CheckBox ch1, ch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        textView = (TextView) findViewById(R.id.textview);
        boton = (Button) findViewById(R.id.enviar);
        ch1 = (CheckBox) findViewById(R.id.chk1);
        ch2 = (CheckBox) findViewById(R.id.chk2);

    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.enviar:
             if(ch1.isChecked()==true){
                 textView.setText("Buenos dias amigo");
             }if(ch2.isChecked()==true){
                    textView.setText("Buenos dias amiga");
                }
             break;
        default:
            break;
    }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checkbox, menu);
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

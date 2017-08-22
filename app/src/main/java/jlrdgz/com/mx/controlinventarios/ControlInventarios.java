package jlrdgz.com.mx.controlinventarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ControlInventarios extends AppCompatActivity {

    public void lanzarAltaUsuario (View view) {
        Intent i=new Intent(this,AltaUsuario.class);
        startActivity(i);
    }

    public void lanzarModificaInfo (View view) {
        Intent j=new Intent(this,ModificaInfo.class);
        startActivity(j);
    }

    public void lanzarAsiignaEquipo (View view) {
        Intent k=new Intent(this,AsignaEquipo.class);
        startActivity(k);
    }

    public void lanzarBajaEquipo (View view) {
        Intent m=new Intent(this,BajaEquipo.class);
        startActivity(m);
    }

    public void lanzarFallaEquipo (View view) {
        Intent o=new Intent(this,FallaEquipo.class);
        startActivity(o);
    }

    public void lanzarFaltante (View view) {
        Intent p=new Intent(this,Faltante.class);
        startActivity(p);
    }

    public void lanzarReporte (View view) {
        Intent q=new Intent(this,GenerarReporte.class);
        startActivity(q);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_inventarios);
    }
}

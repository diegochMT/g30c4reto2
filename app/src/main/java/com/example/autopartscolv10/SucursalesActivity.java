package com.example.autopartscolv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SucursalesActivity extends AppCompatActivity {

    private Button btnSelecionar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opProductos) {
            Intent intent = new Intent(getApplicationContext(), ProductosActivity.class);
            startActivity(intent);
        }

        if (id == R.id.opServicios) {
            Intent intent2 = new Intent(getApplicationContext(), ServiciosActivity.class);
            startActivity(intent2);
        }

        if (id == R.id.opSucursales) {
            Intent intent3 = new Intent(getApplicationContext(), SucursalesActivity.class);
            startActivity(intent3);
        }
        if (id == R.id.Carrito) {
            Intent intent4 = new Intent(this, CarritoActivity.class);
            Bundle bundel = new Bundle();

            intent4.putExtras(bundel);
            startActivity(intent4);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Sucursales");
        getSupportActionBar().setSubtitle("Seleccione una Sucursal");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        btnSelecionar = (Button) findViewById(R.id.btnSelec);

        btnSelecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(), " Este boton lo llevara a la sucursal seleccionada",Toast.LENGTH_LONG).show();
            }
        });
    }
}
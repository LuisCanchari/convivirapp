package edu.cientifica.convivirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actEstCuenta(View view) {
        Intent intent = new Intent(this,estadoCuentaActivity.class);
        startActivity(intent);
    }

    public void actResidentes(View view) {
    }

    public void actGastos(View view) {
    }
}
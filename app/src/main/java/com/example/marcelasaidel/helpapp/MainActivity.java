package com.example.marcelasaidel.helpapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Chamada para tela de Desmaio
    public void changeActivityDesmaio(View view) {
        Intent intent = new Intent(this, atvDesmaio.class);
        startActivity(intent);

    }

    //Chamada para tela de Queimadura
    public void changeActivityQueimadura(View view) {
        Intent intent = new Intent(this, atvQueimadura.class);
        startActivity(intent);

    }

    //Chamada para tela de Convulsão
    public void changeActivityConvulsao(View view) {
        Intent intent = new Intent(this, atvConvulsao.class);
        startActivity(intent);

    }

    //Chamada para tela de Fraturas
    public void changeActivityFratura(View view) {
        Intent intent = new Intent(this, atvFratura.class);
        startActivity(intent);

    }


    //Chamada para tela de Infarto
    public void changeActivityInfarto(View view) {
        Intent intent = new Intent(this, atvInfarto.class);
        startActivity(intent);

    }



}

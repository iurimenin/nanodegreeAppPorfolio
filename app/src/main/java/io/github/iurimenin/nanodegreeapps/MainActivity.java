package io.github.iurimenin.nanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton appCompatButtonPopularMovies = (AppCompatButton) findViewById(R.id.appCompatButtonPopularMovies);
        AppCompatButton appCompatButtonStockHawk = (AppCompatButton) findViewById(R.id.appCompatButtonStockHawk);
        AppCompatButton appCompatButtonBuildItBigger = (AppCompatButton) findViewById(R.id.appCompatButtonBuildItBigger);
        AppCompatButton appCompatButtonMakeYoutAppMaterial = (AppCompatButton) findViewById(R.id.appCompatButtonMakeYoutAppMaterial);
        AppCompatButton appCompatButtonGoUbiquitous = (AppCompatButton) findViewById(R.id.appCompatButtonGoUbiquitous);
        AppCompatButton appCompatButtonCapstone = (AppCompatButton) findViewById(R.id.appCompatButtonCapstone);

        appCompatButtonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.will_laucnh_movies_app, Toast.LENGTH_LONG).show();
            }
        });

        appCompatButtonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.will_laucnh_stock_app, Toast.LENGTH_LONG).show();
            }
        });

        appCompatButtonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.will_laucnh_build_it_app, Toast.LENGTH_LONG).show();
            }
        });

        appCompatButtonMakeYoutAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.will_laucnh_material_app, Toast.LENGTH_LONG).show();
            }
        });

        appCompatButtonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.will_laucnh_ubiquitous_app, Toast.LENGTH_LONG).show();
            }
        });

        appCompatButtonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, R.string.will_laucnh_capstone_app, Toast.LENGTH_LONG).show();
            }
        });

    }
}

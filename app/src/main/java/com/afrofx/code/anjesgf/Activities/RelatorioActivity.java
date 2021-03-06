package com.afrofx.code.anjesgf.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.afrofx.code.anjesgf.R;

/**
 * Created by Afro FX on 2/14/2018.
 */

public class RelatorioActivity extends AppCompatActivity {



    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.topbar_relatorio_screen);

        toolbar = (Toolbar) findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_relatorio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.but_vender) {
            Toast.makeText(getApplication(), "Criar Relatorio", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == android.R.id.home) {
            startActivity(new Intent(RelatorioActivity.this, MainScreenActivity.class));
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

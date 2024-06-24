package uz.gita.infoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.salah).setOnClickListener(v -> {
            goNext("Mohammed Salah");
        });
        findViewById(R.id.levandovski).setOnClickListener(v -> {
            goNext("Robert Lewandowski");
        });
        findViewById(R.id.ronaldo).setOnClickListener(v -> {
            goNext("Cristiano Ronaldo");
        });
        findViewById(R.id.messi).setOnClickListener(v -> {
            goNext("Lionel Messi");
        });
        findViewById(R.id.haaland).setOnClickListener(v -> {
            goNext("Erling Haaland");
        });
        findViewById(R.id.mbappe).setOnClickListener(v -> {
            goNext("Kylian Mbappe");
        });
        findViewById(R.id.nemar).setOnClickListener(v -> {
            goNext("Neymar J.R.");
        });
        findViewById(R.id.shoma).setOnClickListener(v -> {
            goNext("Eldor Shomurodov");
        });
        findViewById(R.id.son).setOnClickListener(v -> {
            goNext("Son Heung Min");
        });
        findViewById(R.id.benzema).setOnClickListener(v -> {
            goNext("Karim Benzema");
        });

        findViewById(R.id.info).setOnClickListener(v ->{
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setMessage("Hi, I am Mirzaliyev Po'lat from Uzbekistan. I made this app as a homework that was given by \"Gita Academy\". I made this app for learning purposes, not for commercial purposes");
            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        });

    }

    private void goNext(String name) {
        Intent intent = new Intent(this,InfoActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
}
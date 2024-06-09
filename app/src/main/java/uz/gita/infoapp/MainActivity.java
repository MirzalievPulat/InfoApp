package uz.gita.infoapp;

import androidx.appcompat.app.AppCompatActivity;

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


    }

    private void goNext(String name) {
        Intent intent = new Intent(this,InfoActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
}
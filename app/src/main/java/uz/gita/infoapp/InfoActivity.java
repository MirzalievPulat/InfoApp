package uz.gita.infoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.Objects;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String n = getIntent().getStringExtra("name");
        CollapsingToolbarLayout nameOfFootballer = findViewById(R.id.name);
        TextView about = findViewById(R.id.about);
        ImageView imageView = findViewById(R.id.iv_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        switch (Objects.requireNonNull(n)) {
            case "Mohammed Salah": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.salah2);
                about.setText(R.string.salah);
                break;
            }
            case "Robert Lewandowski": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.lewan2);
                about.setText(R.string.lewan);
                break;
            }
            case "Cristiano Ronaldo": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.ronaldo2);
                about.setText(R.string.ronaldo);
                break;
            }
            case "Lionel Messi": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.messi2);
                about.setText(R.string.messi);
                break;
            }
            case "Erling Haaland": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.haaland2);
                about.setText(R.string.haaland);
                break;
            }
            case "Kylian Mbappe": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.mbappe2);
                about.setText(R.string.kylian);
                break;
            }
            case "Neymar J.R.": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.neymar2);
                about.setText(R.string.neymar);
                break;
            }
            case "Eldor Shomurodov": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.shoma2);
                about.setText(R.string.shoma);
                break;
            }
            case "Son Heung Min": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.son2);
                about.setText(R.string.son);
                break;
            }
            case "Karim Benzema": {
                nameOfFootballer.setTitle(n);
                imageView.setImageResource(R.drawable.benzema2);
                about.setText(R.string.benzema);
                break;
            }

        }
    }
}
package uz.gita.infoapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String n = getIntent().getStringExtra("name");
        TextView nameOfFootballer = findViewById(R.id.name);
        TextView about = findViewById(R.id.about);

        switch (Objects.requireNonNull(n)) {
            case "Mohammed Salah": {
                nameOfFootballer.setText(n);
                about.setText(R.string.salah);
                break;
            }
            case "Robert Lewandowski": {
                nameOfFootballer.setText(n);
                about.setText(R.string.lewan);
                break;
            }
            case "Cristiano Ronaldo": {
                nameOfFootballer.setText(n);
                about.setText(R.string.ronaldo);
                break;
            }
            case "Lionel Messi": {
                nameOfFootballer.setText(n);
                about.setText(R.string.messi);
                break;
            }
            case "Erling Haaland": {
                nameOfFootballer.setText(n);
                about.setText(R.string.haaland);
                break;
            }
            case "Kylian Mbappe": {
                nameOfFootballer.setText(n);
                about.setText(R.string.kylian);
                break;
            }
            case "Neymar J.R.": {
                nameOfFootballer.setText(n);
                about.setText(R.string.neymar);
                break;
            }
            case "Eldor Shomurodov": {
                nameOfFootballer.setText(n);
                about.setText(R.string.shoma);
                break;
            }
            case "Son Heung Min": {
                nameOfFootballer.setText(n);
                about.setText(R.string.son);
                break;
            }
            case "Karim Benzema": {
                nameOfFootballer.setText(n);
                about.setText(R.string.benzema);
                break;
            }

        }
    }
}
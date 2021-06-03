package learn.geekbrains.calc_launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String ACTION_CALC = "gb.calc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.run_calc).setOnClickListener(b -> {
            Intent intent = new Intent();
            intent.setAction(ACTION_CALC);

            ActivityInfo activityInfo = intent.resolveActivityInfo(getPackageManager(), intent.getFlags());
            if (activityInfo != null) {
                startActivity(intent);
            }
        });
    }
}
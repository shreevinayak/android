package mad.practicals.pr13;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar simpleProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleProgressBar = findViewById(R.id.simpleProgressBar);
        Button Start = findViewById(R.id.startButton);
        Start.setOnClickListener(v->simpleProgressBar.setVisibility(View.VISIBLE));
    }
}
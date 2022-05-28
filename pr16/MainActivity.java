package mad.practicals.pr16;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button date = findViewById(R.id.datePicker);
        Button time = findViewById(R.id.timePicker);

        EditText Etxt1 = findViewById(R.id.date);
        EditText Etxt2 = findViewById(R.id.time);

        TimePicker clock = findViewById(R.id.clock);
        DatePicker cal = findViewById(R.id.cal);

        date.setOnClickListener(v->{
            clock.setVisibility(View.INVISIBLE);
            cal.setVisibility(View.VISIBLE);


            int day = cal.getDayOfMonth();
            int month = cal.getMonth() + 1;
            int year = cal.getYear();

            Etxt1.setText(day + " / " + month + " / " + year);
        });

        time.setOnClickListener(v->{
            cal.setVisibility(View.INVISIBLE);
            clock.setVisibility(View.VISIBLE);

            int hours = clock.getHour();
            int min = clock.getMinute();

            Etxt2.setText(hours + " : " + min);
        });
    }
}
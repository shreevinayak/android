package mad.practicals.pr21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.broadcast);
        b1.setOnClickListener(v ->{
            broadCastIntent();
        });
    }

    public void broadCastIntent(){
        Intent intent = new Intent();
        intent.setAction("mad.practicals.pr21.myReciever");
        sendBroadcast(intent);
    }
}
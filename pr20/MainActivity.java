package mad.practicals.pr20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1,b2;
        b1 = findViewById(R.id.start);
        b2 = findViewById(R.id.stop);

        TextView txt = findViewById(R.id.state);

        
        
        WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        boolean state = wifi.isWifiEnabled();
        txt.setText("state");
        b1.setOnClickListener(view -> {
            wifi.setWifiEnabled(true);
            if(state){
                txt.setText("On");
            }else{
                txt.setText("Off");
            }

        });
        b2.setOnClickListener(view -> {
            wifi.setWifiEnabled(false);
            if (state) {
                txt.setText("On");
            } else {
                txt.setText("Off");
            }
        });

    }
}
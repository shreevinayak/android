package mad.practicals.pr18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        Button go = findViewById(R.id.go);
        Button startDialer = findViewById(R.id.dialer);
        Button fact = findViewById(R.id.fact);

        EditText eTxt1 = findViewById(R.id.url);
        StringBuilder url = new StringBuilder();


        go.setOnClickListener(v->{
            url.append(eTxt1.getText());

            Intent intentObj = new Intent(Intent.ACTION_VIEW);
            intentObj.setData(Uri.parse("https://"+url));
            startActivity(intentObj);
        });

        startDialer.setOnClickListener(v->{
            Intent intentObj2 = new Intent(Intent.ACTION_DIAL);
            startActivity(intentObj2);
        });

        fact.setOnClickListener(v->{
            Intent intentObj3 = new Intent(getBaseContext(),factorial.class);
            startActivity(intentObj3);
        });
    }
}
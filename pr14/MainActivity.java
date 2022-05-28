package mad.practicals.pr14;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] lang = {"Android","Java","Php","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_main,lang);
        ListView list = findViewById(R.id.list1);
        list.setAdapter(adapter);

        int img2 = R.drawable.ic_launcher_background;
        ImageView img = findViewById(R.id.imageView);
        Button changebtn = findViewById(R.id.change);

        changebtn.setOnClickListener(v ->img.setImageResource(img2));
    }
}
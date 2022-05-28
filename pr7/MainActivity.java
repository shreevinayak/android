package mad.practicals.pr7;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Button b1 = findViewById(R.id.submit);

      final EditText mET1 = findViewById(R.id.username);
      final EditText mET2 = findViewById(R.id.password);
      final TextView mTV1 = findViewById(R.id.txt2);
      final TextView mTV2 = findViewById(R.id.txt3);

      b1.setOnClickListener(v -> {
         Editable username = mET1.getText();
         Editable password = mET2.getText();
         mTV1.setText(username);
         mTV2.setText(password);
      });
   }
}
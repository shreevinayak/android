package mad.practicals.pr8;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
   AutoCompleteTextView autoCompleteText;
   String[] arr1 = { "Emerging Trends in Computer and Technology", "Entrepreneurship Development",
         "Webpage Design using PHP", "Programming With Python",
         "Mobile Android Development", "Management" };

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      autoCompleteText = findViewById(R.id.autoComplete);
      ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, arr1);
      autoCompleteText.setAdapter(adapter);
   }
}
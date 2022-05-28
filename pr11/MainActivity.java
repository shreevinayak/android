package mad.practicals.pr11;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Button order = findViewById(R.id.order);
      CheckBox pizza = findViewById(R.id.pizza);
      CheckBox coffee = findViewById(R.id.coffee);
      StringBuilder res = new StringBuilder();

      order.setOnClickListener(v -> {
         if (pizza.isChecked()) {
            res.append("Pizza\n");
         }
         if (coffee.isChecked()) {
            res.append("Coffee\n");
         }
         Toast.makeText(this, res.toString(), Toast.LENGTH_SHORT).show();
      });

   }
}
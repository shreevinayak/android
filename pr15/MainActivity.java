package mad.practicals.pr15;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn);

        b1.setOnClickListener(view -> {
            Toast.makeText(this, "Message for you: \nYou have got mail!", Toast.LENGTH_SHORT).show();
        });

        Button order = findViewById(R.id.order);
        CheckBox pizza = findViewById(R.id.pizza);
        CheckBox coffee = findViewById(R.id.coffee);
        CheckBox burger = findViewById(R.id.burger);


        StringBuilder str = new StringBuilder();
        str.append("Selected Items : \n");
        order.setOnClickListener(v -> {
            int total = 0;
            if (pizza.isChecked()){
                str.append("Pizza 100Rs\n");
                total += 100;
            }
            if (coffee.isChecked()){
                str.append("Coffee 50Rs\n");
                total += 50;
            }
            if (burger.isChecked()){
                str.append("Burger 120Rs\n");
                total += 120;
            }
            str.append("Total: "+total + "\n");
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        });
    }
}
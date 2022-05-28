package mad.practicals.pr18;

import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class factorial extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);

        TextView txt = findViewById(R.id.output);
        EditText eTxt = findViewById(R.id.num);
        String num = String.valueOf(eTxt.getText());
        int i,fact=1;
        int number= Integer.parseInt(num);
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        txt.setText(fact);
    }
}

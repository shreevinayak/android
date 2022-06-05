package mad.practicals.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   Button login;
   EditText user, pass;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      user = findViewById(R.id.user);
      pass = findViewById(R.id.pass);
      login = findViewById(R.id.login);
      login.setEnabled(false);

      user.addTextChangedListener(watcher);
      pass.addTextChangedListener(watcher);
   }

   TextWatcher watcher = new TextWatcher() {
      @Override
      public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

      }

      @Override
      public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
         if (!user.getText().toString().isEmpty() && !pass.getText().toString().isEmpty()) {
            login.setEnabled(true);
         } else {
            login.setEnabled(false);
         }
      }

      @Override
      public void afterTextChanged(Editable editable) {

      }
   };

}

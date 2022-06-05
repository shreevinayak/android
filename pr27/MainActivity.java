package mad.practicals.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button login;
   EditText user, pass;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      login = findViewById(R.id.login);
      user = findViewById(R.id.user);
      pass = findViewById(R.id.pass);

      login.setOnClickListener(v -> {
         String username = user.getText().toString();
         String password = pass.getText().toString();

         if (username.isEmpty() && password.isEmpty()) {
            Toast.makeText(this, "Enter Credentials", Toast.LENGTH_SHORT).show();
         } else {
            if (username.equals("admin") && password.equals("admin")) {
               Toast.makeText(this, "Logged In Successfull", Toast.LENGTH_SHORT).show();
            } else if (!username.equals("admin")) {
               Toast.makeText(this, "Invalid Username", Toast.LENGTH_SHORT).show();
            } else {
               Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
            }
         }
      });
   }
}
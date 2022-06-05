package mad.practicals.email;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class email extends Activity {

   EditText email, subject, message;
   Button send;
   String rEmail, sub, mess;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      email = findViewById(R.id.email);
      subject = findViewById(R.id.subject);
      message = findViewById(R.id.message);
      send = findViewById(R.id.send);

      send.setOnClickListener(v -> {
         rEmail = email.getText().toString();
         sub = subject.getText().toString();
         mess = message.getText().toString();

         Intent emailIntent = new Intent(Intent.ACTION_SEND);

         emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { rEmail });
         emailIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
         emailIntent.putExtra(Intent.EXTRA_TEXT, mess);
         emailIntent.setType("message/rfc822"); // To declare it as email

         startActivity(emailIntent);

      });

   }
}

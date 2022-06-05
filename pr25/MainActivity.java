package mad.practicals.pr25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Button blinkBTN = findViewById(R.id.btn);
      ImageView imageView = findViewById(R.id.img);
      blinkBTN.setOnClickListener(v -> {
         Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
         Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
         imageView.startAnimation(animation1);
         imageView.startAnimation(animation);
      });

   }
}
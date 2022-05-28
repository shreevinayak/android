package mad.practicals.pr22;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {
   TextView txt;
   List list;
   SensorManager sMgr;
   SensorEventListener sel = new SensorEventListener() {
      @SuppressLint("SetTextI18n")
      @Override
      public void onSensorChanged(SensorEvent sensorEvent) {
         float[] values = sensorEvent.values;
         txt.setText("x: " + values[0] + "\ny: " + values[1] + "\nz: " + values[2]);
      }

      @Override
      public void onAccuracyChanged(Sensor sensor, int i) {

      }
   };

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      txt = findViewById(R.id.txt);

      sMgr = (SensorManager) this.getSystemService(SENSOR_SERVICE);
      list = sMgr.getSensorList(Sensor.TYPE_ACCELEROMETER);
      if (list.size() > 0) {
         sMgr.registerListener(sel, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
      } else {
         Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();
      }
   }

   @Override
   protected void onStop() {
      if (list.size() > 0) {
         sMgr.unregisterListener(sel);
      }
      super.onStop();
   }
}
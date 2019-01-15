package admin.comlab.com.zodiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Calendar calendar;
    private int year, month, day;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View view) {
        datePicker = findViewById(R.id.datepicker);
        TextView textView = findViewById(R.id.id);
        month = datePicker.getMonth() + 1;
        day = datePicker.getDayOfMonth();
        if (month == 12) {

            if (day < 22)
                textView.setText("astro sign = Sagittarius");

            else
                textView.setText("astro sign = Sagittarius");
        } else if (month == 1) {
            if (day < 20)
                textView.setText("astro sign = Capricorn");

            else
                textView.setText("astro sign = aquarius");

        } else if (month == 2) {
            if (day < 19)
                textView.setText("astro sign = aquarius");

            else
                textView.setText("astro sign = pisces");

        } else if (month == 3) {
            if (day < 21)
                textView.setText("astro sign = Pisces");

            else
                textView.setText("astro sign = aries");
        } else if (month == 4) {
            if (day < 20)
                textView.setText("astro sign = Aries");
            else
                textView.setText("astro sign = taurus");
        } else if (month == 5) {
            if (day < 21)
                textView.setText("astro sign = Taurus");

            else
                textView.setText("astro sign = gemini");

        } else if (month == 6) {
            if (day < 21)
                textView.setText("astro sign = Gemini");

            else
                textView.setText("astro sign = cancer");
        } else if (month == 7) {
            if (day < 23)
                textView.setText("astro sign = Cancer");
            else
                textView.setText("astro sign = leo");
        } else if (month == 8) {
            if (day < 23)
                textView.setText("astro sign = Leo");

            else
                textView.setText("astro sign = virgo");
        } else if (month == 9) {
            if (day < 23)
                textView.setText("astro sign = Virgo");
            else
                textView.setText("astro sign = libra");
        } else if (month == 10) {
            if (day < 23)
                textView.setText("astro sign = Libra");
            else
                textView.setText("astro sign = scorpio");
        } else if (month == 11) {
            if (day < 22)
                textView.setText("astro sign = scorpio");
            else
                textView.setText("astro sign = sagittarius");
        }
    }
}

package keyone.keytwo.lesson2_dz_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Counters counters;


    // пользовательский элемент счетчика

    private TextView textCounter_1;
    private TextView textCounter_2;
    private TextView textCounter_3;
    private TextView textCounter_4;
    private TextView textCounter_5;
    private TextView textCounter_6;
    private TextView textCounter_7;
    private TextView textCounter_8;
    private TextView textCounter_9;
    private TextView textCounter_0;
    private TextView textCounter_plus;
    private TextView textCounter_minus;
    private TextView textCounter_delenie;
    private TextView textCounter_umnogenie;
    private TextView textCounter_ravno;

    // кнопки

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_plus;
    private Button button_minus;
    private Button button_delenie;
    private Button button_umnogenie;
    private Button button_ravno;

    // создаем onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knopki);

        counters = new Counters();
        initView();

    }


    // Получить пользовательский элемент по идентификатору
    private void initView() {
        textCounter_1 = findViewById(R.id.textView_1);
        textCounter_2 = findViewById(R.id.textView_2);
        textCounter_3 = findViewById(R.id.textView_3);
        textCounter_4 = findViewById(R.id.textView_4);
        textCounter_5 = findViewById(R.id.textView_5);
        textCounter_6 = findViewById(R.id.textView_6);
        textCounter_7 = findViewById(R.id.textView_7);
        textCounter_8 = findViewById(R.id.textView_8);
        textCounter_9 = findViewById(R.id.textView_9);
        textCounter_0 = findViewById(R.id.textView_0);
        textCounter_plus = findViewById(R.id.textView_plus);
        textCounter_minus = findViewById(R.id.textView_minus);
        textCounter_umnogenie = findViewById(R.id.textView_umnogenie);
        textCounter_delenie = findViewById(R.id.textView_delenie);
        textCounter_ravno = findViewById(R.id.textView_ravno);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_0 = findViewById(R.id.button_0);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_umnogenie = findViewById(R.id.button_umnogenie);
        button_delenie = findViewById(R.id.button_delenie);
        button_ravno = findViewById(R.id.button_ravno);
    }

    // // Установить текст на TextView
    private void setTextCounter(TextView textCounter, int counter) {
        textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
    }
}

//    @Override
//    public void onClick(View v) {
//        counters.increaseCounter_1();
//        textCounter_1.setText(String.format(Locale.getDefault(), "увеличивает %id", counters.getCounter_1()));
//    }
//    @Override
//    public void onClick(View v) {
//        counters.increaseCounter_2();
//        textCounter_1.setText(String.format(Locale.getDefault(), "увеличивает %id", counters.getCounter_2()));
//    }
//}
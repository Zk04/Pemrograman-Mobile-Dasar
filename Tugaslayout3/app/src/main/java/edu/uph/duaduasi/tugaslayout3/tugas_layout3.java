package edu.uph.duaduasi.tugaslayout3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tugas_layout3 extends AppCompatActivity {

    TextView textView6;

    TextView textView8;

    TextView textView13;

    TextView textView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_layout3);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("Davidsen Cuaca");
        textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("03081220040");
        textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setText("Sistem Informasi");
        textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setText("Menonton film");
    }
}
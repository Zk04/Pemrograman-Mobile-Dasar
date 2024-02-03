package edu.uph.duaduasi.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class latihan extends AppCompatActivity {

    EditText editText;

    RadioGroup radioGroup;
    CheckBox checkedBox_traveling, checkBox_reading, checkBox_coding;
    ImageButton imageButton2, imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        editText = findViewById(R.id.editTextText);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        checkedBox_traveling = findViewById(R.id.checkbox_Traveling);
        checkBox_coding = findViewById(R.id.checkbox_coding);
        checkBox_reading = findViewById(R.id.checkbox_Reading);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(" ");
                radioGroup.clearCheck();
                if (checkedBox_traveling.isChecked()) {
                    checkedBox_traveling.setChecked(false);
                }
                if (checkBox_coding.isChecked()) {
                    checkBox_coding.setChecked(false);
                }
                if (checkBox_reading.isChecked()) {
                    checkBox_reading.setChecked(false);
                }
                Toast.makeText(latihan.this, "Resetting actions", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                String radioButton = "";
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton selectedRadio = findViewById(selectedId);
                    radioButton = selectedRadio.getText().toString();
                }
                StringBuilder checkBoxText = new StringBuilder();
                if (checkedBox_traveling.isChecked()) {
                    checkBoxText.append(checkedBox_traveling.getText());
                    checkBoxText.append(" ");
                }
                if (checkBox_coding.isChecked()) {
                    checkBoxText.append(checkBox_coding.getText());
                    checkBoxText.append(" ");
                }
                if (checkBox_reading.isChecked()) {
                    checkBoxText.append(checkBox_reading.getText());
                    checkBoxText.append(" ");
                }
                String fullText = "Hasil: " + inputText + " , " + radioButton + " ,  " + checkBoxText;
                Toast.makeText(latihan.this, fullText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package sg.edu.rp.c346.id20026955.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvModCode;
    TextView tvModName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvModCode = findViewById(R.id.textViewModCode);
        tvModName = findViewById(R.id.textViewModuleName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);


        Intent intentReceived = getIntent();
        int c = intentReceived.getIntExtra("modCode", 300);


        if (c == (346)) {
            tvModCode.setText("Module Code: C346");
            tvModName.setText("Module Name: Android Programming");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W62E");

        } else if (c == (338)) {
            tvModCode.setText("Module Code: C338");
            tvModName.setText("Module Name: AI and Machine Learning");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62J");
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        }
}
package org.hse.baseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button_for_stud = findViewById(R.id.button_for_stud);
        View button_for_prep = findViewById(R.id.button_for_prep);

        button_for_stud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButtonForStud();
            }
        });
        button_for_prep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButtonForPrep();
            }
        });
    }

    private void clickButtonForStud(){
        CharSequence text = getString(R.string.toast_rasp_for_stud);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }

    private void clickButtonForPrep(){
        CharSequence text = getString(R.string.toast_rasp_for_prep);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();

    }
}
package com.e.watch;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView tvOutput;
    private EditText etText;
    private Button btnCLick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = findViewById(R.id.tvtext);
        etText = findViewById(R.id.etText);
        btnCLick = findViewById(R.id.btnShow);



        btnCLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(etText.getText().toString());
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import org.telegram.messenger.R;

public class CounterActivity extends Activity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);

        TextView counterText = findViewById(R.id.counter_text);
        Button hiddenButton = findViewById(R.id.hidden_button);
        RelativeLayout rootLayout = findViewById(R.id.root_layout);

        rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterText.setText(String.valueOf(counter));
            }
        });

        hiddenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 10) {
                    Intent intent = new Intent(CounterActivity.this, LaunchActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
package com.fenggeliu.interactive;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button liuButton = (Button) findViewById(R.id.liuButton);

        liuButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView liuText = (TextView) findViewById(R.id.liuText);
                        liuText.setText("Good Job Hoss");
                    }
                }
        );

        liuButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView liuText = (TextView)findViewById(R.id.liuText);
                        liuText.setText("Holy Carp, that was a long one!");
                        return false;
                    }
                }
        );

    }
}


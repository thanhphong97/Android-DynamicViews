package com.yosta.android_dynamicinstance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private LinearLayout layout;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onInitViews();
        onInitEvents();
    }

    private void onInitViews() {
        button = (Button) findViewById(R.id.btn_add);
        layout = (LinearLayout) findViewById(R.id.layout_container);
        editText = (EditText) findViewById(R.id.et_btn_name);
    }

    private void onInitEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonName = editText.getText().toString();
                onAutoGenerateButton(buttonName);
            }
        });
    }

    private void onAutoGenerateButton(String buttonName) {
        Button button = new Button(this);
        button.setText(buttonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });
        button.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(button);
    }
}

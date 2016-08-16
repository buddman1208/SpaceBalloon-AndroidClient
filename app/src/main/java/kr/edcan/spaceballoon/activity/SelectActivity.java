package kr.edcan.spaceballoon.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kr.edcan.spaceballoon.R;

public class SelectActivity extends AppCompatActivity {

    Button bt, getter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        bt = (Button) findViewById(R.id.bt_mode);
        getter = (Button) findViewById(R.id.getter_mode);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        getter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DataGetActivity.class));
                finish();
            }
        });
    }
}

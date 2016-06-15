package kr.edcan.spaceballoon.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.edcan.spaceballoon.R;
import kr.edcan.spaceballoon.utils.SpaceBalloonHelper;
import kr.edcan.spaceballoon.utils.SpaceBalloonService;

public class MainActivity extends AppCompatActivity {

    SpaceBalloonService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service = SpaceBalloonHelper.getServiceInstance();

    }
}

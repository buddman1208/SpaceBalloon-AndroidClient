package kr.edcan.spaceballoon.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;
import kr.edcan.spaceballoon.R;
import kr.edcan.spaceballoon.model.SpaceData;

public class DataGetActivity extends AppCompatActivity {

    TextView average;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_get);
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        RealmResults r = realm.where(SpaceData.class).findAll();
        average.setText("현재 " + r.size() + "개의 데이터가 있습니다.\n온도의 평균은 " + r.average("temp") + "입니다");
        realm.commitTransaction();
    }
}

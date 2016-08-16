package kr.edcan.spaceballoon;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by JunseokOh on 2016. 8. 17..
 */
public class ApplicationLauncher extends Application {
    @Override
    public void onCreate() {
        RealmConfiguration realmConfig = new RealmConfiguration.Builder(getApplicationContext()).build();
        Realm.setDefaultConfiguration(realmConfig);
        super.onCreate();
    }
}

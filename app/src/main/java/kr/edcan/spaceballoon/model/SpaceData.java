package kr.edcan.spaceballoon.model;

import io.realm.RealmObject;

/**
 * Created by KOHA_CLOUD on 16. 6. 15..
 */
public class SpaceData extends RealmObject{
    private String temp, humid, isChimsu;

    public SpaceData(String temp, String humid, String isChimsu) {
        this.temp = temp;
        this.humid = humid;
        this.isChimsu = isChimsu;
    }

    public String getTemp() {
        return temp;
    }

    public String getHumid() {
        return humid;
    }

    public String getIsChimsu() {
        return isChimsu;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setHumid(String humid) {
        this.humid = humid;
    }

    public void setIsChimsu(String isChimsu) {
        this.isChimsu = isChimsu;
    }
}

package kr.edcan.spaceballoon.model;

import io.realm.RealmObject;

/**
 * Created by KOHA_CLOUD on 16. 6. 15..
 */
public class SpaceData extends RealmObject{
    private int temp, humid, isChimsu;

    public SpaceData() {
    }

    public SpaceData(int temp, int humid, int isChimsu) {
        this.temp = temp;
        this.humid = humid;
        this.isChimsu = isChimsu;
    }

    public int getTemp() {
        return temp;
    }

    public int getHumid() {
        return humid;
    }

    public int getIsChimsu() {
        return isChimsu;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setHumid(int humid) {
        this.humid = humid;
    }

    public void setIsChimsu(int isChimsu) {
        this.isChimsu = isChimsu;
    }
}

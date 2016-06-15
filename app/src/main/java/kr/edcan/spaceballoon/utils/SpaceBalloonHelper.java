package kr.edcan.spaceballoon.utils;

import android.content.Context;

import retrofit2.Retrofit;

/**
 * Created by KOHA_CLOUD on 16. 6. 15..
 */
public class SpaceBalloonHelper {
    private Context context;

    public SpaceBalloonHelper(Context context) {
        this.context = context;
    }
    public static Retrofit retrofit;
    public static SpaceBalloonService getServiceInstance(){
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://malang.moe:9000/")
                    .build();
        }
        return retrofit.create(SpaceBalloonService.class);
    }
}

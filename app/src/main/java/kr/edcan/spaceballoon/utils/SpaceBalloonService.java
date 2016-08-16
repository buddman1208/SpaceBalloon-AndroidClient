package kr.edcan.spaceballoon.utils;

import kr.edcan.spaceballoon.model.SpaceData;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by KOHA_CLOUD on 16. 6. 15..
 */
public interface SpaceBalloonService {

    /*
    * Example API*/
    @FormUrlEncoded
    @POST("/")
    Call<SpaceData> call(@Field("Example") String example);

}

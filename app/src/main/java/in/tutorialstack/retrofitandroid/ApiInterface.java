package in.tutorialstack.retrofitandroid;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("users")
    Call<ResponseModel> getUsers(@Query("page") int page);
}

package in.tutorialstack.retrofitandroid;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ResponseModel implements Serializable {
    @SerializedName("page")
    int Page;

    @SerializedName("per_page")
    int PerPage;

    @SerializedName("total")
    int Total;

    @SerializedName("total_pages")
    int TotalPages;

    @SerializedName("data")
    List<UserModel> users;

    public int getPage() {
        return Page;
    }

    public int getTotalPages() {
        return TotalPages;
    }

    public List<UserModel> getUsers() {
        return users;
    }
}

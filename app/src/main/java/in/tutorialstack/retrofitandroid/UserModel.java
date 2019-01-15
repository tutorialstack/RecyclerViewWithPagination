package in.tutorialstack.retrofitandroid;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserModel implements Serializable {
    @SerializedName("id")
    int Id;

    @SerializedName("first_name")
    String FirstName;

    @SerializedName("last_name")
    String LastName;

    @SerializedName("avatar")
    String Avatar;

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAvatar() {
        return Avatar;
    }
}
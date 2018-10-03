package mmvmdemo.sajjanjain.com.mmvmdemo.model;

import android.text.TextUtils;
import android.util.Patterns;


public class User {
    private String mEmail,mPassword;

    public User(String email, String password) {
        mEmail = email;
        mPassword = password;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(final String email) {
        mEmail = email;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(final String password) {
        mPassword = password;
    }

    public boolean isInputDataValid(){
        return !TextUtils.isEmpty(getEmail())
                    && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                        && getPassword().length() > 5;

    }
}

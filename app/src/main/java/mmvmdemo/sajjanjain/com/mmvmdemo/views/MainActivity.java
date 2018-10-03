package mmvmdemo.sajjanjain.com.mmvmdemo.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import mmvmdemo.sajjanjain.com.mmvmdemo.R;
import mmvmdemo.sajjanjain.com.mmvmdemo.databinding.ActivityMainBinding;
import mmvmdemo.sajjanjain.com.mmvmdemo.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mActivityMainBinding.setViewModel(new LoginViewModel());
        mActivityMainBinding.executePendingBindings();
    }


    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}

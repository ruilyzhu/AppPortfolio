package com.ruily.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onItemClick(View view){
        String appName = null;
        switch (view.getId()){
            case R.id.btn_spotify:
                appName="spotify";
                break;
            case R.id.btn_scores:
                appName="scores";
                break;
            case R.id.btn_library:
                appName="library";
                break;
            case R.id.btn_build:
                appName="build";
                break;
            case R.id.btn_xyz:
                appName="xyz";
                break;
            case R.id.btn_capstone:
                appName="capstone";
                break;
        }
        Toast.makeText(this, String.format("This button will launch my %s app",appName), Toast.LENGTH_SHORT).show();
    }
}

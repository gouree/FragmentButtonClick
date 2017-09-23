package com.example.gouree.fragmentbuttonclick;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements OnNameSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //creating an instance of Fragment2 and sending value parameter to it
    @Override
    public void setName(String value) {
        FragmentTwo f2 = (FragmentTwo) getFragmentManager().findFragmentById(R.id.frag2);
        f2.updateInfo(value);
    }
}

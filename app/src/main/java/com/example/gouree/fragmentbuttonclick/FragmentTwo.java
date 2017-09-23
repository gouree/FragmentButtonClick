package com.example.gouree.fragmentbuttonclick;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by omsai on 23/09/2017.
 */

public class FragmentTwo extends Fragment
{
    TextView t1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        //create view and inflate fragment 2 layout
        View view =inflater.inflate(R.layout.fragment2,container,false);
        t1 = (TextView) view.findViewById(R.id.text2);
        t1.setVisibility(view.GONE);
        return view;


    }

    // method to set value of text view to value passed by fragment 1

    public void updateInfo(String val)
    {

        t1.setText(val);
        t1.setVisibility(View.VISIBLE);

    }
}

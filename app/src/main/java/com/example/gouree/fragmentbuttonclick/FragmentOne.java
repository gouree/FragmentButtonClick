package com.example.gouree.fragmentbuttonclick;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by omsai on 23/09/2017.
 */

public class FragmentOne extends Fragment implements OnNameSetListener
{

    //create instances of button and interface
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    OnNameSetListener o;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment1,container,false);
        b1= (Button) view.findViewById(R.id.lay1);
        b2= (Button) view.findViewById(R.id.lay2);
        b3= (Button) view.findViewById(R.id.lay3);
        b4= (Button) view.findViewById(R.id.lay4);

        //on click of buttons  pass corresponding string value to interface
       b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Layout 1 Selected", Toast.LENGTH_SHORT).show();
               String val ="WELCOME TO LAYOUT 1";
                o.setName(val);
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Layout 2 Selected", Toast.LENGTH_SHORT).show();
                String val ="WELCOME TO LAYOUT 2";
                o.setName(val);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Layout 3 Selected", Toast.LENGTH_SHORT).show();
               String val ="WELCOME TO LAYOUT 3";
                o.setName(val);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Layout 4 Selected", Toast.LENGTH_SHORT).show();
                String val ="WELCOME TO LAYOUT 4";
                o.setName(val);
            }
        });
        return view;
    }

    //attach the activity and set interface
    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {

                o = (OnNameSetListener) activity;
        }
        catch(Exception e)
            {

            }

    }

    //override interface method
    @Override
    public void setName(String value) {

    }
}

package taqbir.alam.com.javaforfun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class FragmentClass_MainMenu extends android.support.v4.app.Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ImageButton basics_button;
        ImageButton conditionals_button;
        ImageButton loops_button;
        ImageButton arrays_button;

        View v =  inflater.inflate(R.layout.fragment_mainmenu, container, false);

        basics_button = v.findViewById(R.id.basics_btn);
        basics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragmentBasics();
            }
        });

        conditionals_button = v.findViewById(R.id.conditionals_btn);
        conditionals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragmentConditionals();
            }
        });

        loops_button = v.findViewById(R.id.loops_btn);
        loops_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragmentLoops();
            }
        });

        arrays_button = v.findViewById(R.id.arrays_btn);
        arrays_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragmentArrays();
            }
        });


        return v;

    }

    public void ChangeFragmentBasics() {
        Fragment fragment;

        fragment = new FragmentClass_Basics(); //basics page fragment class
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment1, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }


    public void ChangeFragmentConditionals() {
        Fragment fragment;

        fragment = new FragmentClass_Conditionals(); //basics page fragment class
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment1, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }


    public void ChangeFragmentLoops() {
        Fragment fragment;

        fragment = new FragmentClass_Loops(); //basics page fragment class
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment1, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }


    public void ChangeFragmentArrays() {
        Fragment fragment;

        fragment = new FragmentClass_Arrays(); //basics page fragment class
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment1, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

}

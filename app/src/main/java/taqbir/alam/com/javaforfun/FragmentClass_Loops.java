package taqbir.alam.com.javaforfun;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentClass_Loops extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_loops, container, false);


        Button wl_hit = (Button)v.findViewById(R.id.loops_button_wl_hitbox);
        wl_hit.setVisibility(View.VISIBLE);
        wl_hit.setBackgroundColor(Color.TRANSPARENT);
        wl_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Loops_WL(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        Button dw_hit = (Button)v.findViewById(R.id.loops_button_dw_hitbox);
        dw_hit.setVisibility(View.VISIBLE);
        dw_hit.setBackgroundColor(Color.TRANSPARENT);
        dw_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Loops_DW(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        Button fl_hit = (Button)v.findViewById(R.id.loops_button_fl_hitbox);
        fl_hit.setVisibility(View.VISIBLE);
        fl_hit.setBackgroundColor(Color.TRANSPARENT);
        fl_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Loops_FL(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        Button loops_ex = (Button)v.findViewById(R.id.beginsample3);
        loops_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Loops_Exercises(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        Button coverupbtn4 = (Button)v.findViewById(R.id.coverupbtn4);
        coverupbtn4.setVisibility(View.VISIBLE);
        coverupbtn4.setBackgroundColor(Color.TRANSPARENT);


        // Inflate the layout for this fragment
        return v;
    }
}

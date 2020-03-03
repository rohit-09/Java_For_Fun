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


public class FragmentClass_Arrays extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_arrays, container, false);


        Button ab_hit = (Button)v.findViewById(R.id.arrays_button_basics_hitbox);
        ab_hit.setVisibility(View.VISIBLE);
        ab_hit.setBackgroundColor(Color.TRANSPARENT);
        ab_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Arrays_ArrayBasics(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        Button arrays_ex = (Button)v.findViewById(R.id.beginsample4);
        arrays_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Arrays_Exercises(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });




        Button coverupbtn = (Button)v.findViewById(R.id.coverupbtn);
        coverupbtn.setVisibility(View.VISIBLE);
        coverupbtn.setBackgroundColor(Color.TRANSPARENT);

        Button coverupbtn2 = (Button)v.findViewById(R.id.coverupbtn2);
        coverupbtn2.setVisibility(View.VISIBLE);
        coverupbtn2.setBackgroundColor(Color.TRANSPARENT);


        return v;
    }
}

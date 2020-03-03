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


public class FragmentClass_Conditionals extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_conditionals, container, false);

        Button ie_hit = (Button)v.findViewById(R.id.conditionals_button_ie_hitbox);
        ie_hit.setVisibility(View.VISIBLE);
        ie_hit.setBackgroundColor(Color.TRANSPARENT);
        ie_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Conditionals_IE(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        Button sc_hit = (Button)v.findViewById(R.id.conditionals_button_sc_hitbox);
        sc_hit.setVisibility(View.VISIBLE);
        sc_hit.setBackgroundColor(Color.TRANSPARENT);
        sc_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Conditionals_SC(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        Button conditionals_ex = (Button)v.findViewById(R.id.beginsample2);
        conditionals_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Conditionals_Exercises(); //basics page fragment class
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

        Button coverupbtn3 = (Button)v.findViewById(R.id.coverupbtn3);
        coverupbtn3.setVisibility(View.VISIBLE);
        coverupbtn3.setBackgroundColor(Color.TRANSPARENT);



        return v;
    }

}

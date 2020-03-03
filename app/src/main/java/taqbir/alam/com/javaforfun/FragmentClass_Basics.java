package taqbir.alam.com.javaforfun;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class FragmentClass_Basics extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_basics, container, false);

        //Arrow Buttons to navigate
        ImageButton ps = (ImageButton)v.findViewById(R.id.basics_button_ps);
        ImageButton jc = (ImageButton)v.findViewById(R.id.basics_button_jc);
        ImageButton vd = (ImageButton)v.findViewById(R.id.basics_button_vd);
        ImageButton opr = (ImageButton)v.findViewById(R.id.basics_button_opr);
        ImageButton str = (ImageButton)v.findViewById(R.id.basics_button_str);
        ImageButton usrinpt = (ImageButton)v.findViewById(R.id.basics_button_usrinpt);
        Button basics_ex = (Button)v.findViewById(R.id.beginsample1);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityClass_Basics_PS.class));
            }
        });

        jc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityClass_Basics_JC.class));
            }
        });

        vd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityClass_Basics_VD.class));
            }
        });

        opr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_OPR(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_STR(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        usrinpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_USRINPT(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        basics_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_Exercises(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });







        //Increasing button hitbox

        Button ps_hit = (Button)v.findViewById(R.id.basics_button_ps_hitbox);
        ps_hit.setVisibility(View.VISIBLE);
        ps_hit.setBackgroundColor(Color.TRANSPARENT);
        ps_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityClass_Basics_PS.class));
            }
        });


        Button jc_hit = (Button)v.findViewById(R.id.basics_button_jc_hitbox);
        jc_hit.setVisibility(View.VISIBLE);
        jc_hit.setBackgroundColor(Color.TRANSPARENT);
        jc_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityClass_Basics_JC.class));
            }
        });


        Button vd_hit = (Button)v.findViewById(R.id.basics_button_vd_hitbox);
        vd_hit.setVisibility(View.VISIBLE);
        vd_hit.setBackgroundColor(Color.TRANSPARENT);
        vd_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ActivityClass_Basics_VD.class));
            }
        });


        Button opr_hit = (Button)v.findViewById(R.id.basics_button_opr_hitbox);
        opr_hit.setVisibility(View.VISIBLE);
        opr_hit.setBackgroundColor(Color.TRANSPARENT);
        opr_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_OPR(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        Button str_hit = (Button)v.findViewById(R.id.basics_button_str_hitbox);
        str_hit.setVisibility(View.VISIBLE);
        str_hit.setBackgroundColor(Color.TRANSPARENT);
        str_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_STR(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        Button usrinpt_hit = (Button)v.findViewById(R.id.basics_button_usrinpt_hitbox);
        usrinpt_hit.setVisibility(View.VISIBLE);
        usrinpt_hit.setBackgroundColor(Color.TRANSPARENT);
        usrinpt_hit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;

                fragment = new FragmentClass_Basics_USRINPT(); //basics page fragment class
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment1, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });





        // Inflate the layout for this fragment
        return v;
    }

}

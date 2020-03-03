package taqbir.alam.com.javaforfun;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class FragmentClass_Nav_Rate_Us extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_nav_rate_us, container, false);

        Button coverupbtn10 = (Button)v.findViewById(R.id.coverupbtn10);
        coverupbtn10.setVisibility(View.VISIBLE);
        coverupbtn10.setBackgroundColor(Color.TRANSPARENT);

        Button coverupbtn11 = (Button)v.findViewById(R.id.coverupbtn11);
        coverupbtn11.setVisibility(View.VISIBLE);
        coverupbtn11.setBackgroundColor(Color.TRANSPARENT);



        // Inflate the layout for this fragment
        return v;
    }

}

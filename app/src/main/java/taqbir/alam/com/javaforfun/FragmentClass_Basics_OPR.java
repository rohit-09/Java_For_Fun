package taqbir.alam.com.javaforfun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentClass_Basics_OPR.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentClass_Basics_OPR#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentClass_Basics_OPR extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_basics_opr, container, false);
    }

}

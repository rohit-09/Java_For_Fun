package taqbir.alam.com.javaforfun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FragmentClass_Loops_Exercises extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_loops_exercises, container, false);

        Button submit101 = v.findViewById(R.id.submit101);
        Button submit102 = v.findViewById(R.id.submit102);

        final EditText editText101 = v.findViewById(R.id.editText101);
        final EditText editText102 = v.findViewById(R.id.editText102);
        final EditText editText103 = v.findViewById(R.id.editText103);

        submit101.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText101.getText().toString().equals("0") && editText102.getText().toString().equals("10") && editText103.getText().toString().equals("num")){
                    Toast.makeText(getActivity(), "CORRECT!",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getActivity(), "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Button show101 = v.findViewById(R.id.show101);
        show101.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                editText101.setText("0");
                editText102.setText("10");
                editText103.setText("num");
            }
        });


        final EditText editText17 = v.findViewById(R.id.editText17);
        final EditText editText18 = v.findViewById(R.id.editText18);

        submit102.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText17.getText().toString().equals("0") && editText18.getText().toString().equals("i")){
                    Toast.makeText(getActivity(), "CORRECT!",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getActivity(), "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Button show102 = v.findViewById(R.id.show102);
        show102.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                editText17.setText("0");
                editText18.setText("i");
            }
        });


        // Inflate the layout for this fragment
        return v;
    }

}

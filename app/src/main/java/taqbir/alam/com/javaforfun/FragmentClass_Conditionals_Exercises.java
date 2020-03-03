package taqbir.alam.com.javaforfun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FragmentClass_Conditionals_Exercises extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_conditionals_exercises, container, false);


        Button submit101 = v.findViewById(R.id.submit101);
        Button submit102 = v.findViewById(R.id.submit102);

        final EditText editText101 = v.findViewById(R.id.editText101);
        final EditText editText102 = v.findViewById(R.id.editText102);
        final EditText editText103 = v.findViewById(R.id.editText103);

        submit101.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText101.getText().toString().equals("Scanner") && (editText102.getText().toString().equals("number>100") || editText102.getText().toString().equals("number > 100")) && editText103.getText().toString().equals("else")){
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
                editText101.setText("Scanner");
                editText102.setText("number>100");
                editText103.setText("else");
            }
        });


        final EditText editText108 = v.findViewById(R.id.editText108);
        final EditText editText107 = v.findViewById(R.id.editText107);


        submit102.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText108.getText().toString().equals("grade") && (editText107.getText().toString().equals("c") || editText107.getText().toString().equals("C"))){
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
                editText108.setText("grade");
                editText107.setText("C");
            }
        });





        return v;
    }
}

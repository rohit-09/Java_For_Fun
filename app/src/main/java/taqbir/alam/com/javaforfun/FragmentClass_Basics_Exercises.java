package taqbir.alam.com.javaforfun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FragmentClass_Basics_Exercises extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_basics_exercises, container, false);

        Button submit1 = v.findViewById(R.id.submit1);
        Button submit2 = v.findViewById(R.id.submit103);
        Button submit3 = v.findViewById(R.id.submit3);

        final EditText editText1 = v.findViewById(R.id.editText1);
        final EditText editText2 = v.findViewById(R.id.editText2);
        final EditText editText3 = v.findViewById(R.id.editText3);




            submit1.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    if(editText1.getText().toString().equals("String") && editText2.getText().toString().equals("Hello World") && editText3.getText().toString().equals("System")){
                        Toast.makeText(getActivity(), "CORRECT!",
                                Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getActivity(), "INCORRECT",
                                Toast.LENGTH_LONG).show();
                    }
                }
            });


        final EditText editText4 = v.findViewById(R.id.editText4);
        //final EditText editText5 = v.findViewById(R.id.editText5);
        final EditText editText6 = v.findViewById(R.id.editText6);
        final EditText editText7 = v.findViewById(R.id.editText7);
        final EditText editText8 = v.findViewById(R.id.editText8);


        submit2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText4.getText().toString().equals("int") && editText7.getText().toString().equals("num1") && editText6.getText().toString().equals("*")  && editText8.getText().toString().equals("multiply")){
                    Toast.makeText(getActivity(), "CORRECT!",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getActivity(), "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
            }
        });


        Button show1 = v.findViewById(R.id.show1);
        show1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                editText1.setText("String");
                editText2.setText("Hello World");
                editText3.setText("System");
            }
        });

        Button show2 = v.findViewById(R.id.show2);
        show2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                editText4.setText("int");
                editText7.setText("num1");
                editText6.setText("*");
                editText8.setText("multiply");
            }
        });


        final EditText editText9 = v.findViewById(R.id.editText9);
        final EditText editText10 = v.findViewById(R.id.editText10);
        final EditText editText11 = v.findViewById(R.id.editText11);

        submit3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText9.getText().toString().equals("Scanner") && editText10.getText().toString().equals("System.in") && editText11.getText().toString().equals("Double()")){
                    Toast.makeText(getActivity(), "CORRECT!",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getActivity(), "INCORRECT",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Button show3 = v.findViewById(R.id.show3);
        show3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                editText9.setText("Scanner");
                editText10.setText("System.in");
                editText11.setText("Double()");
            }
        });






        return v;
    }

}

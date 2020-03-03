package taqbir.alam.com.javaforfun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FragmentClass_Arrays_Exercises extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_arrays_exercises, container, false);

        Button submit101 = v.findViewById(R.id.submit101);
        Button submit102 = v.findViewById(R.id.submit102);

        final EditText editText101 = v.findViewById(R.id.editText101);
        final EditText editText102 = v.findViewById(R.id.editText102);
        final EditText editText103 = v.findViewById(R.id.editText103);
        final EditText editText = v.findViewById(R.id.editText);
        final EditText editText5 = v.findViewById(R.id.editText5);
        final EditText editText12 = v.findViewById(R.id.editText12);
        final EditText editText13 = v.findViewById(R.id.editText13);
        final EditText editText14 = v.findViewById(R.id.editText14);

        submit101.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText101.getText().toString().equals("[]") && editText102.getText().toString().equals("new") && editText103.getText().toString().equals("[5]") && editText.getText().toString().equals("0") && editText5.getText().toString().equals("2") && editText12.getText().toString().equals("3") && editText13.getText().toString().equals("6") && editText14.getText().toString().equals("4")){
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
                editText101.setText("[]");
                editText102.setText("new");
                editText103.setText("[5]");
                editText.setText("0");
                editText5.setText("2");
                editText12.setText("3");
                editText13.setText("6");
                editText14.setText("4");
            }
        });


        final EditText editText108 = v.findViewById(R.id.editText108);
        final EditText editText15 = v.findViewById(R.id.editText15);
        final EditText editText16 = v.findViewById(R.id.editText16);


        submit102.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(editText108.getText().toString().equals("for") && (editText15.getText().toString().equals("arr.length()")||editText15.getText().toString().equals("3")) && editText16.getText().toString().equals("arr[i]")){
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
                editText108.setText("for");
                editText15.setText("arr.length()");
                editText16.setText("arr[i]");
            }
        });


        return v;
    }
}

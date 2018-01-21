package Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import nl.hsleiden.politiebrochureapp.R;

public class BeoordeelFragment extends Fragment {

    View view;
    Button submitButton;
    EditText editText;

    public BeoordeelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.view =inflater.inflate(R.layout.fragment_beoordeel, container, false);

        submitButton = view.findViewById(R.id.submitButton);
        editText = view.findViewById(R.id.editText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ingevoerdeTekst = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("tekst", ingevoerdeTekst);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                StatistiekenFragment statistiekenFragment = new StatistiekenFragment();
                statistiekenFragment.setArguments(bundle);
                Toast.makeText(getActivity().getApplicationContext(), "Uw beoordeling is opgeslagen!", Toast.LENGTH_SHORT).show();
                fragmentTransaction.replace(R.id.flcontent, statistiekenFragment).commit();
            }
        });


        return view;
    }


}

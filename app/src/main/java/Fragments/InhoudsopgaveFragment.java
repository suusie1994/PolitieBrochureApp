package Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import nl.hsleiden.politiebrochureapp.MainActivity;
import nl.hsleiden.politiebrochureapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InhoudsopgaveFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InhoudsopgaveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InhoudsopgaveFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public InhoudsopgaveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InhoudsopgaveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InhoudsopgaveFragment newInstance(String param1, String param2) {
        InhoudsopgaveFragment fragment = new InhoudsopgaveFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inhoudsopgave, container, false);
        String[] inhoudsopgaveItemsList = {"Colofon",
                                            "Inhoudsopgave",
                                            "Waarom een handreiking?",
                                            "1. Algemeen",
                                            "1.1 Wat is een licht verstandelijke beperking?",
                                            "1.2 Hoe herken je een LVB?",
                                            "1.3 Wat is een passende communicatie en bejegening?",
                                            "1.4 Contact op straat",
                                            "2. Verdachten",
                                            "2.1 Aanhouden en overbrengen",
                                            "2.2 Aankomst, fouilleren en insluiten",
                                            "2.3 Voorgeleiding",
                                            "2.4 Verhoor",
                                            "2.5 Arrestantenzorg",
                                            "2.6 In vrijheidstelling",
                                            "3. Slachtoffers/getuigen/betrokkenen",
                                            "3.1 Inzicht in eigen slachtofferschap en nut politie",
                                            "3.2 Het eerste contact",
                                            "3.3 Aanwezigheid en rol begeleiding",
                                            "3.4 Haalbaarheid en wenselijkheid van aangifte",
                                            "3.5 Een goede aangifte...",
                                            "3.6 Doorverwijze",
                                            "4. Extra informatie",
                                            "Over de Handreiking",
                                            "Over ontwikkelaar",
                                            "Beoordeel de app!"};

        ListView listView = view.findViewById(R.id.inhoudsopgave_list_view);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                inhoudsopgaveItemsList
        );
        listView.setAdapter(stringArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment = null;
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                switch (position) {
                    case 0:
                        fragment = new ColofonFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 1:
                        fragment = new InhoudsopgaveFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 2:
                        fragment = new WaaromEenHandreikingFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 3:
                        fragment = new Hoofdstuk1Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 4:
                        fragment = new Hoofdstuk1Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 5:
                        fragment = new Hoofdstuk1Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 6:
                        fragment = new Hoofdstuk1Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 7:
                        fragment = new Hoofdstuk1Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 8:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 9:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 10:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 11:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 12:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 13:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 14:
                        fragment = new Hoofdstuk2Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 15:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 16:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 17:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 18:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 19:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 20:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 21:
                        fragment = new Hoofdstuk3Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 22:
                        fragment = new Hoofdstuk4Fragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 23:
                        fragment = new AboutHandreikingFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 24:
                        fragment = new AboutHandreikingFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    case 25:
                        fragment = new AboutAppFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                        break;
                    default:
                        fragment = new TitelbladFragment();
                        transaction.replace(R.id.flcontent,fragment);
                        transaction.addToBackStack(null);
                }
                transaction.commit();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

package Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import nl.hsleiden.politiebrochureapp.R;


public class AboutAppFragment extends Fragment {

    RequestQueue requestQueue;
    String getUrl ="http://136.144.169.28:8080/api/developers";

    TextView textView;
    TextView textView2;

    public AboutAppFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_app, container, false);
        textView = view.findViewById(R.id.naam);
        requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, getUrl, (String) null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try{
                    textView.setText("");
                    for (int i = 0; i < response.length(); i++) {
                        JSONObject developer = response.getJSONObject(i);

                        Integer id = developer.getInt("id");
                        String naam = developer.getString("name");
                        String email = developer.getString("email");

                        textView.append(naam + "\n" + email);

                    }
                } catch (Exception e) { }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Error: \n\n" + error.toString());
            }
        }); requestQueue.add(jsonArrayRequest);
        return view;
    }

}

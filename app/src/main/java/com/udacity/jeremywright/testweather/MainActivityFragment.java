package com.udacity.jeremywright.testweather;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] dummyValues = {"Today - Sunny - 88/ 63",
                "Sep 24 - Rainy - 106/ 55",
                "Sep 25 - Cloudy - 76/ 27",
                "Sep 26 - Fire - 150/ -23",
                "Sep 27 - Snow - 17/ 77",
                "Sep 28 - None - --/ 00"};

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forcast, R.id.list_item_forecast_textview, dummyValues);

        ListView forecastList = (ListView)rootView.findViewById(R.id.listview_forecast);
        forecastList.setAdapter(forecastAdapter);

        return rootView;
    }
}

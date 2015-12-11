package com.lxj.smartyalbum;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Locale;

/**
 * Created by LUXJ on 2015/12/11.
 */
public class PlanetFragment extends Fragment {
    public static final String ARG_PLANET_NUMBER = "planet_number";

    public PlanetFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_planet, container, false);
        int i = getArguments().getInt(ARG_PLANET_NUMBER);
        String planet = getResources().getStringArray(R.array.planets_array)[i];

        int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
                "drawable", getActivity().getPackageName());
        int color = 0;
        switch (i) {
            case 1:
                color = getResources().getColor(R.color.zero);
                break;
            case 2:
                color = getResources().getColor(R.color.one);
                break;
            case 3:
                color = getResources().getColor(R.color.two);
                break;
            case 4:
                color = getResources().getColor(R.color.three);
                break;
            case 5:
                color = getResources().getColor(R.color.four);
                break;
            case 6:
                color = getResources().getColor(R.color.five);
                break;
            case 7:
                color = getResources().getColor(R.color.six);
                break;

        }
        ((ImageView) rootView.findViewById(R.id.image)).setBackgroundColor(color);
        getActivity().setTitle(planet);
        return rootView;
    }
}

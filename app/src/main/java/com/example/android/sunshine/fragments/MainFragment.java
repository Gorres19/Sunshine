package com.example.android.sunshine.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.sunshine.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view for the MainActivity.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> content = new ArrayList<String>();



        return RootView;
    }
}

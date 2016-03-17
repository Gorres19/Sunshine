package com.example.android.sunshine.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.sunshine.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment, new PlaceholderFragment())
                    .commit();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public static class PlaceholderFragment extends Fragment {

        private ArrayAdapter<String> ForecastAdapter;
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View RootView = inflater.inflate(R.layout.fragment_main, container, false);

            String[] forecastArray = {
                    "Today - Sunny - 88/63",
                    "Tomorrow - Foggy - 70/46",
                    "Weds - Cloudy = 72/63",
                    "Thurs - Rainy - 64/51",
                    "Fri - Foggy - 60/46",
                    "Sat - Sunny - 76/68",
            };
           List<String> weeklyForecast = new ArrayList<String>(
                   Arrays.asList(forecastArray)
           );

           ForecastAdapter = new ArrayAdapter<String>(
                    getActivity(),
                    R.layout.list_item_forecast,
                    R.id.list_item_forecast_textview,
                    weeklyForecast
            );

            ListView listView = (ListView) RootView.findViewById(
                    R.id.listView_forecast);
            listView.setAdapter(ForecastAdapter);

            return RootView;
        }
    }
}

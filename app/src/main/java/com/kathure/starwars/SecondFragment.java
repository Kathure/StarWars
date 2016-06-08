package com.kathure.starwars;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by kathure on 07/06/16.
 */

public class SecondFragment extends Fragment {

    ListView theListView;
    @TargetApi(Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View secondFragment = (ListView) inflater.inflate(R.layout.Second_layout, container, false);

        String[] Episodes = {"IV - A New Hope", "V - The Empire Strikes Back",
                "VI - Return of the Jedi", "I - The Phantom Menace", " II - Attack of the Clones",
                "III - Revenge of the Sith", " VII - The Force Awakens"

        };
        ListAdapter leAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Episodes);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(leAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });gi
        return secondFragment;

    }
}

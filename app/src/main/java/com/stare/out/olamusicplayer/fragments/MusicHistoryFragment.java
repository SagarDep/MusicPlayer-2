package com.stare.out.olamusicplayer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stare.out.olamusicplayer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicHistoryFragment extends Fragment {


    public MusicHistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music_history, container, false);
    }

}

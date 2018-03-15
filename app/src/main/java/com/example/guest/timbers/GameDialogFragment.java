package com.example.guest.timbers;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.fragment_game_dialog, container, false);

        String dataToShow = getArguments().getString("dataToShow");

        TextView mGameLabel = (TextView) rootView.findViewById(R.id.gameLabel);
        mGameLabel.setText(dataToShow);


        return rootView;
    }


}

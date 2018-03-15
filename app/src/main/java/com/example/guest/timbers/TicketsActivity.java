package com.example.guest.timbers;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TicketsActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.findGameButton) Button mFindGameButton;
    @BindView(R.id.dateEditText) EditText mDateEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);
        ButterKnife.bind(this);

        mFindGameButton.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v == mFindGameButton) {
            String date = mDateEditText.getText().toString();
            FragmentManager fm = getFragmentManager();
            GameDialogFragment gameDialogFragment = new GameDialogFragment();
            gameDialogFragment.show(fm, "Sample Fragment");

        }
    }
}

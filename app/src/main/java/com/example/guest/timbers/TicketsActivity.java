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

            Intent intent = getIntent();
            String[] opponents = intent.getStringArrayExtra("opponents");
            String[] date = intent.getStringArrayExtra("date");

            String inputDate = mDateEditText.getText().toString();

            int index = 0;
            for (int i = 0; i< date.length; i++) {
                if (inputDate.equals(date[i])) {
                    index = i;
                }
            }

            String dataToShow = opponents[index];


            //passing data to fragment
            Bundle bundle = new Bundle();
            bundle.putString("dataToShow", dataToShow);

            GameDialogFragment gameDialogFragment = new GameDialogFragment();
            gameDialogFragment.setArguments(bundle);

            FragmentManager fm = getFragmentManager();
            gameDialogFragment.show(fm, "Sample Fragment");

        }
    }
}

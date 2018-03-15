package com.example.guest.timbers;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ScheduleActivity extends AppCompatActivity {
    @BindView(R.id.scheduleTextView) TextView mScheduleTextView;
    @BindView(R.id.listView) ListView mListView;

    private String[] opponents = new String [] { "Galaxy", "Red Bulls", "Dallas", "Fire", "Orlando", "Minnesota", "New York", "Earthquakes", "Sounders", "Rapids"
    };

    private String[] date = new String [] {"3/4", "3/10", "3/24", "3/31", "4/8", "4/14", "4/22", "5/5", "5/13", "5/19"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ButterKnife.bind(this);

        GameArrayAdapter adapter = new GameArrayAdapter(this, android.R.layout.simple_list_item_1, opponents, date);
        mListView.setAdapter(adapter);
    }
}

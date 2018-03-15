package com.example.guest.timbers;


import android.content.Context;
import android.widget.ArrayAdapter;

public class GameArrayAdapter extends ArrayAdapter{
    private Context mContext;
    private String[] mOpponents;
    private String[] mDate;

    public GameArrayAdapter(Context mContext, int resource, String[] mOpponents, String[] mDate){
        super(mContext, resource);
        this.mContext = mContext;
        this.mOpponents = mOpponents;
        this.mDate = mDate;
    }

    @Override
    public Object getItem(int position) {
        String opponent = mOpponents[position];
        String date = mDate[position];
        return String.format("%s \nGame Date: %s", opponent, date);
    }

    @Override
    public int getCount() {
        return mOpponents.length;
    }
}

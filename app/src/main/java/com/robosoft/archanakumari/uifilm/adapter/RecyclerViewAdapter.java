package com.robosoft.archanakumari.uifilm.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.robosoft.archanakumari.uifilm.R;

/**
 * Created by archanakumari on 1/1/16.
 */
public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.LayoutHolder>{

    private View mOneRow;
    private Context mContext;
    static int sCount = 0;
    static int sCountSecondLayout = 0;
    private int mRatings[] = {3,4,5};
    private String mName[] = {"BEGUN","YARIN","ASIRBAAD"};

    private int mNumberList[] = {R.drawable.image26,R.drawable.twoseven,R.drawable.twoeight};
    private int mMoviesList[] = {R.drawable.avengers,R.drawable.intothewild,R.drawable.lifeofpi,R.drawable.thedarknight,R.drawable.bodygaurd,R.drawable.threeidiots,R.drawable.kkht,R.drawable.border,R.drawable.namastelandan};
    private String mMoviesname[] = {"The Avengers","Into the Wild","Life of Pi","The Dark Knight","Bodygaurd","3-Idiots","Kuchh Kuchh hota hai","Border","Nameste Landan"};
    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public LayoutHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0||viewType==4||viewType==8) {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childone, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");
        }
        else
        {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childtwo, parent, false);
        }
        LayoutHolder layoutHolder = new LayoutHolder(mOneRow);
        return layoutHolder;
    }

    @Override
    public void onBindViewHolder(LayoutHolder holder, int position) {

        if (position == 0 || position == 4 || position == 8) {

            holder.mImageoflayoutone.setImageResource(mNumberList[sCount]);
            holder.mTextheading.setText(mName[sCount]);
            holder.mTextFilm.setText("3 Film");
            sCount++;

        } else {
            holder.mImageoflayouttwo.setImageResource(mMoviesList[sCountSecondLayout]);
            holder.mTextMoviename.setText(mMoviesname[sCountSecondLayout]);
            holder.mRatingbar.setNumStars(5);
            holder.mAlarm.setImageResource(R.drawable.ic_alarm_white_18dp);
            holder.mTextAlarm.setText("SEANS");
            sCountSecondLayout++;
        }


    }

    @Override
    public int getItemCount() {
        return 12;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }



    class LayoutHolder extends RecyclerView.ViewHolder{

        private ImageView mImageoflayoutone;
        private TextView mTextheading;
        private TextView mTextFilm;
        private ImageView mImageoflayouttwo;
        private TextView mTextMoviename;
        private RatingBar mRatingbar;
        private ImageView mAlarm;
        private TextView mTextAlarm;

        public LayoutHolder(View itemView) {
            super(itemView);
            mImageoflayoutone = (ImageView) itemView.findViewById(R.id.imag26);
            mTextheading = (TextView) itemView.findViewById(R.id.text1);
            mTextFilm = (TextView) itemView.findViewById(R.id.tex2);
            mImageoflayouttwo = (ImageView) itemView.findViewById(R.id.imag);
            mTextMoviename = (TextView) itemView.findViewById(R.id.text);
            mRatingbar = (RatingBar) itemView.findViewById(R.id.ratingBar);
            mAlarm = (ImageView) itemView.findViewById(R.id.alarm);
            mTextAlarm = (TextView) itemView.findViewById(R.id.alarmtext);

        }
    }
}

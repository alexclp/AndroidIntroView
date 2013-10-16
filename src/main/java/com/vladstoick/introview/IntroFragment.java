package com.vladstoick.introview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
/**
 * Created by Vlad on 10/14/13.
 */
public class IntroFragment extends SherlockFragment {
    public static final String TAG_ITEM = "TAGITEM";

    TextView mIntroTextView;
    ImageView mImageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_intro, container, false);
        mImageView = (ImageView) rootView.findViewById(R.id.introImageView);
        mIntroTextView = (TextView) rootView.findViewById(R.id.introTextView);
        IntroPage introView = (IntroPage) getArguments().get(TAG_ITEM);
        mIntroTextView.setText(introView.text);
        mImageView.setImageResource(introView.imgResource);
        return rootView;
    }
}

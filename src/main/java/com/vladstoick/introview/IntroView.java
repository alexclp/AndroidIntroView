package com.vladstoick.introview;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

import java.util.ArrayList;

/**
 * Created by Vlad on 10/15/13.
 */
public class IntroView extends SherlockFragment implements Button.OnClickListener{
    public interface OnSkipClickListener{
        public void onSkipClicked();
    }
    IntroPagerAdapter mAdapter;
    ViewPager mViewPager;
    Button mSkipButton;
    TextView mPageTextView;
    int size;
    private OnSkipClickListener onSkipClickListener;
    public IntroView(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.defaultfragment, container, false);
        mViewPager = (ViewPager) rootView.findViewById(R.id.intro_container);
        mSkipButton = (Button) rootView.findViewById(R.id.skipButton);
        mPageTextView = (TextView) rootView.findViewById(R.id.pageTextView);
        mSkipButton.setOnClickListener(this);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
                mPageTextView.setText((i+1) + " / " + size );
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        return rootView;
    }
    public void setData(ArrayList<IntroPage> pages){
        size = pages.size();
        mAdapter = new IntroPagerAdapter(getChildFragmentManager(),pages);
        mViewPager.setAdapter(mAdapter);
        mPageTextView.setText(1 + " / " + size );
    }

    @Override
    public void onClick(View v) {
        onSkipClickListener.onSkipClicked();
    }

    public void setOnSkipClickListener(OnSkipClickListener onSkipClickListener) {
        this.onSkipClickListener = onSkipClickListener;
    }
}

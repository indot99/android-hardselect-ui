package org.richcode.hardselect.ViewPager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NonSwipeViewPager extends ViewPager {

    private boolean mIsEnabled;

    public NonSwipeViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        mIsEnabled = true;
    }

    public NonSwipeViewPager(Context context) {
        super(context);
        mIsEnabled = true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.mIsEnabled = enabled;
    }


}

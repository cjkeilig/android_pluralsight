package com.example.unouser.squareview;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by unouser on 2/25/2018.
 */

public class SquareView extends View {
    public SquareView(Context context) {
        super(context);

    }

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int height = getMeasuredHeight();
        int width = getMeasuredWidth();
        int size = Math.min(width, height);
        setMeasuredDimension(size,size);
    }
}

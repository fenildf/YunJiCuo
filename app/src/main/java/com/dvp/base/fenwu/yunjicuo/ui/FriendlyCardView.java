/*
 * Copyright (c) 2015 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package com.dvp.base.fenwu.yunjicuo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import com.dvp.base.fenwu.yunjicuo.R;


/**
 * A friendly card view that has consistent padding across API levels.
 */
public class FriendlyCardView extends CardView
{

    public FriendlyCardView(Context context) {
        super(context);

        init(getContext(), null, 0);
    }

    public FriendlyCardView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(getContext(), attrs, 0);
    }

    public FriendlyCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(getContext(), attrs, defStyleAttr);
    }


    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CardView, defStyleAttr,
                R.style.CardView_Light);
        setMaxCardElevation(a.getDimension(R.styleable.CardView_cardMaxElevation,
                getCardElevation()));
        a.recycle();

        setUseCompatPadding(true);
        setPreventCornerOverlap(false);
    }
}

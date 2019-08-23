package com.example.usingwindowinsets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MyFrameLayout extends CoordinatorLayout {
    public MyFrameLayout(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public MyFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0, 0);
    }

    public MyFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr, 0);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int i) {
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        int childCount = getChildCount();
        for (int index = 0; index < childCount; ++index)
            getChildAt(index).dispatchApplyWindowInsets(insets);
        return insets;
    }
}

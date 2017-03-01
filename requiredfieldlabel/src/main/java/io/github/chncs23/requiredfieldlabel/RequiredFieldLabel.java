package io.github.chncs23.requiredfieldlabel;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class RequiredFieldLabel extends TextView {

    private static int starColor = Color.RED;

    public RequiredFieldLabel(Context context) {
        super(context);
    }

    public RequiredFieldLabel(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override public void setText(CharSequence text, BufferType type) {
        SpannableString spannableString = new SpannableString(String.format("%s *", text.toString()));
        spannableString.setSpan(new ForegroundColorSpan(starColor), spannableString.length() - 1,
                spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        super.setText(spannableString, type);
    }

    public static void setStarColor(@ColorInt int color) {
        RequiredFieldLabel.starColor = color;
    }
}

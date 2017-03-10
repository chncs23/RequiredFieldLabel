package io.github.chncs23.requiredfieldlabel;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class RequiredFieldLabel extends AppCompatTextView {

    private static int starColor = Color.RED;
    private static boolean isHaveRequiredField = true;

    public RequiredFieldLabel(Context context) {
        super(context);
    }

    public RequiredFieldLabel(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override public void setText(CharSequence text, BufferType type) {
        if (isHaveRequiredField) {
            SpannableString spannableString = new SpannableString(String.format("%s *", text.toString()));
            spannableString.setSpan(new ForegroundColorSpan(starColor), spannableString.length() - 1,
                    spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            super.setText(spannableString, type);
        } else {
            super.setText(text, type);
        }
    }

    public static void setStarColor(@ColorInt int color) {
        RequiredFieldLabel.starColor = color;
    }

    public void hideRequiredField() {
        isHaveRequiredField = false;
        this.setText(getText().toString().replace(" *", ""));
    }

    public void showRequiredField() {
        isHaveRequiredField = true;
        this.setText(getText().toString().replace(" *", ""));
    }
}

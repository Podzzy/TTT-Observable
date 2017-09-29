package edu.csi5230.jj.tttproject;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import java.util.Observer;
import java.util.Observable;

/**
 * Created by JJ on 9/26/2017.
 */

public class TTTButton extends android.support.v7.widget.AppCompatButton implements Observer {

    int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public TTTButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    private void init(final AttributeSet attrs) {
        if (attrs != null) {
            String packageName = "http://schemas.android.com/apk/res-auto";
            index = attrs.getAttributeIntValue(packageName, "index",0);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        String symbol = (String) arg;
        setText(symbol);

    }
}

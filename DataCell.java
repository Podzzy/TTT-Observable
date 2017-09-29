package edu.csi5230.jj.tttproject;

import java.util.Observable;

/**
 * Created by JJ on 9/27/2017.
 */

public class DataCell extends Observable {

    private String value = null;

    public DataCell(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }
}

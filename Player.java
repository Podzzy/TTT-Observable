package edu.csi5230.jj.tttproject;

/**
 * Created by JJ on 9/27/2017.
 */

public class Player {

    private String playername;
    private String symbol;


    public Player(String playername, String symbol) {
        this.playername = playername;
        this.symbol = symbol;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

package edu.csi5230.jj.tttproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Player[] players = new Player[2];
    Player currentPlayer = null;
    DataCell[] cells = new DataCell[9];

    TTTButton button1 = null;
    TTTButton button2 = null;
    TTTButton button3 = null;
    TTTButton button4 = null;
    TTTButton button5 = null;
    TTTButton button6 = null;
    TTTButton button7 = null;
    TTTButton button8 = null;
    TTTButton button9 = null;

    TextView startText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        players[0] = new Player("JJ Pods", "X");
        players[1] = new Player("Madison G", "O");
        startText = (TextView) findViewById(R.id.textStart);
        button1 = (TTTButton)findViewById(R.id.button1);
        button1.setIndex(1);
        button2 = (TTTButton)findViewById(R.id.button2);
        button2.setIndex(2);
        button3 = (TTTButton)findViewById(R.id.button3);
        button3.setIndex(3);
        button4 = (TTTButton)findViewById(R.id.button4);
        button4.setIndex(4);
        button5 = (TTTButton)findViewById(R.id.button5);
        button6 = (TTTButton)findViewById(R.id.button6);
        button7 = (TTTButton)findViewById(R.id.button7);
        button8 = (TTTButton)findViewById(R.id.button8);
        button9 = (TTTButton)findViewById(R.id.button9);


        TTTButton[] tttButton = {button1,button2,button3,button4,button5,button6,button7,button8,button9};


        for (int i = 0; i < 9; i++) {


            cells[i] = new DataCell("");
            cells[i].addObserver(tttButton[i]);


            final TTTButton current = tttButton[i];

            current.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //current.setText("bleh");
                    int index = current.getIndex();
                    cells[index].setValue(currentPlayer.getSymbol());
                    swapPlayer();


                }
            });




        }



    }

    public void swapPlayer(){
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];
    }



}

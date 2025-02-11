
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {
    /*  
        * Play the game of Concentration
        * 
        * The runner creates a game board and shows the board. It gets a 2-tile selection from the user,
        * checks if the cards at the 2 tile locations match, and then re-displays the board. 
        */
    
        public static void main(String[] args)
        {

        

        Board board = new Board();
        new Game(board);
        }
    }


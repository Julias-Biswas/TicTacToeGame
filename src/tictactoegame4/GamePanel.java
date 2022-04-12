/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame4;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class GamePanel implements ActionListener
{
    
    JFrame jf ;
    JButton jb1 , jb2 , jb3 , jb4 , jb5 , jb6 , jb7 , jb8 , jb9 ;
    
    Color color ;
    
    String xo_value = "" , title_str = "" ;
    int count = 0 ;
    boolean win = false ;
    
    String player1 , player2 ;
    String player_who_wins ;
    
    boolean first_turn = true ;
    int total_series ;
    int series_count = 1 ;
    
    String who_win_series_player_name ;
    int player1_win_count = 0 , player2_win_count = 0 ;
    
    GamePanel( String player1 , String player2 , int total_series )
    {
        
        this.player1 = player1 ;
        this.player2 = player2 ;
        this.total_series = total_series ;
        
    }
    
    void openGamePanel()
    {
        
        jf = new JFrame(); 
        jf.setTitle(player1+" (X) turns");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridLayout(3,3));
        
        jb1 = new JButton(); 
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2 = new JButton(); 
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3 = new JButton(); 
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4 = new JButton(); 
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7 = new JButton(); 
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8 = new JButton(); 
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9 = new JButton(); 
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        count = count + 1 ;
        if( first_turn == true )
        {
            xo_value = "X" ;
            title_str = "0" ;
            color = Color.YELLOW;
            jf.setTitle(player2+"("+title_str+")"+" turns");
            
            first_turn = false ;
        }
        else
        {
            xo_value = "0" ;
            title_str = "X" ;
            color = Color.RED;
            jf.setTitle(player1+"("+title_str+")"+" turns");
            
            first_turn = true ;
            
        }
        
        Font font = new Font("Arial" , 1 , 100);
        
        if( ae.getSource() == jb1 )
        {
            jb1.setFont(font);
            jb1.setText(xo_value);
            jb1.setBackground(color);
            jb1.setEnabled(false);
        }
        if( ae.getSource() == jb2 )
        {
            jb2.setFont(font);
            jb2.setText(xo_value);
            jb2.setBackground(color);
            jb2.setEnabled(false);
        }
        if( ae.getSource() == jb3 )
        {
            jb3.setFont(font);
            jb3.setText(xo_value);
            jb3.setBackground(color);
            jb3.setEnabled(false);
        }
        if( ae.getSource() == jb4 )
        {
            jb4.setFont(font);
            jb4.setText(xo_value);
            jb4.setBackground(color);
            jb4.setEnabled(false);
        }
        if( ae.getSource() == jb5 )
        {
            jb5.setFont(font);
            jb5.setText(xo_value);
            jb5.setBackground(color);
            jb5.setEnabled(false);
        }
        if( ae.getSource() == jb6 )
        {
            jb6.setFont(font);
            jb6.setText(xo_value);
            jb6.setBackground(color);
            jb6.setEnabled(false);
        }
        if( ae.getSource() == jb7 )
        {
            jb7.setFont(font);
            jb7.setText(xo_value);
            jb7.setBackground(color);
            jb7.setEnabled(false);
        }
        if( ae.getSource() == jb8 )
        {
            jb8.setFont(font);
            jb8.setText(xo_value);
            jb8.setBackground(color);
            jb8.setEnabled(false);
        }
        if( ae.getSource() == jb9 )
        {
            jb9.setFont(font);
            jb9.setText(xo_value);
            jb9.setBackground(color);
            jb9.setEnabled(false);
            
        }
        winningPossibilities();
        
    }
    
    void winningPossibilities()
    {
        /*   Horizontal winning possibilities  */
        if( jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() && jb3.getText() != "" )
        {
            win = true ;
        }
        else if( jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb6.getText() != "" )
        {
            win = true ;
        }
        else if( jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb9.getText() != "" )
        {
            win = true ;
        }
        /*   Vertical winning possibilities  */
        else if( jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb7.getText() != "" )
        {
            win = true ;
        }
        else if( jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb8.getText() != "" )
        {
            win = true ;
        }
        else if( jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb9.getText() != "" )
        {
            win = true ;
        }
        /*   Diagonal winning possibilities  */
        else if( jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb9.getText() != "" )
        {
            win = true ;
        }
        else if( jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb7.getText() != "" )
        {
            win = true ;
        }
        /*  Game draw  */
        else
        {
            win = false ;
        }
        whoWins();
    }
    
    void whoWins()
    {
        if( win == true )
        {
            series_count = series_count + 1 ;
            
            if( xo_value.equals("X") )
            {
                player_who_wins = player1 ;
                
                player1_win_count = player1_win_count + 1 ;
                
            }
            else
            {
                player_who_wins = player2 ;
                
                player2_win_count = player2_win_count + 1 ;
                
            }
            
            String win_Title = player_who_wins+"("+xo_value+")"+" win" ;
            jf.setTitle(win_Title);
            JOptionPane.showMessageDialog(jf, win_Title);
            restartGame();
        }
        else if( win == false && count == 10 )
        {
            series_count = series_count + 1 ;
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
        else if( win == false && count == 9 )
        {
            series_count = series_count + 1 ;
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
    }
    
    void restartGame()
    {
        System.out.println("Total Series : "+total_series);
        System.out.println("Series Count : "+series_count);
        
        if( total_series >= series_count )
        {
            int i = JOptionPane.showConfirmDialog(jf, "Do you want to play game again ?");
        
            if( i == 0 )
            {
                color = null ;
                win = false ;
                count = 0 ;

                if( player_who_wins.equals(player1) )
                {
                    first_turn = true ;
                }
                else
                {
                    first_turn = false ;
                }



                jf.setTitle(player_who_wins +"("+xo_value+")"+" turns");

                jb1.setBackground(color);
                jb1.setText("");
                jb1.setEnabled(true);

                jb2.setBackground(color);
                jb2.setText("");
                jb2.setEnabled(true);

                jb3.setBackground(color);
                jb3.setText("");
                jb3.setEnabled(true);

                jb4.setBackground(color);
                jb4.setText("");
                jb4.setEnabled(true);

                jb5.setBackground(color);
                jb5.setText("");
                jb5.setEnabled(true);

                jb6.setBackground(color);
                jb6.setText("");
                jb6.setEnabled(true);

                jb7.setBackground(color);
                jb7.setText("");
                jb7.setEnabled(true);

                jb8.setBackground(color);
                jb8.setText("");
                jb8.setEnabled(true);

                jb9.setBackground(color);
                jb9.setText("");
                jb9.setEnabled(true);
            }
            else if( i == 1 )
            {
                System.exit(0);
            }
            else if( i == 2 )
            {
                jb1.setEnabled(false);
                jb2.setEnabled(false);
                jb3.setEnabled(false);
                jb4.setEnabled(false);
                jb5.setEnabled(false);
                jb6.setEnabled(false);
                jb7.setEnabled(false);
                jb8.setEnabled(false);
                jb9.setEnabled(false);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(jf, "Series is completed...!!!");
            
            if( player1_win_count > player2_win_count )
            {
                //JOptionPane.showMessageDialog(jf, player1+" win the series.....!!!!!");
                new WhoWinsSeries(player1+" win the series.");
                jf.setVisible(false);
                
                jb1.setEnabled(false);
                jb2.setEnabled(false);
                jb3.setEnabled(false);
                jb4.setEnabled(false);
                jb5.setEnabled(false);
                jb6.setEnabled(false);
                jb7.setEnabled(false);
                jb8.setEnabled(false);
                jb9.setEnabled(false);
            }
            else if( player1_win_count < player2_win_count )
            {
                //JOptionPane.showMessageDialog(jf, player2+" win the series.....!!!!!");
                new WhoWinsSeries(player2+" win the series.");
                jf.setVisible(false);
                
                jb1.setEnabled(false);
                jb2.setEnabled(false);
                jb3.setEnabled(false);
                jb4.setEnabled(false);
                jb5.setEnabled(false);
                jb6.setEnabled(false);
                jb7.setEnabled(false);
                jb8.setEnabled(false);
                jb9.setEnabled(false);
            }
            else
            {
                //JOptionPane.showMessageDialog(jf, "Series Draw.....!!!!!");
                new WhoWinsSeries("Series Draw.");
                jf.setVisible(false);
            }
            
        }
        
    }
    
}

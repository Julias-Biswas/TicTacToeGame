/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import validations.Validations;

/**
 *
 * @author julia
 */
public class UserPanel implements ActionListener
{
    JFrame jf ;
    JLabel jl1 , jl2 , jl3 ;
    JTextField jt1 , jt2 ;
    JComboBox combobox ;
    JButton jb ;
    
    UserPanel()
    {
        jf = new JFrame("Tic Tac Toe Game by Julias");
        jf.setSize(600, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        
        jl1 = new JLabel("First player name : (X) ");
        jl1.setBounds(50,80, 150, 30);
        jf.add(jl1);
        
        jt1 = new JTextField();
        jt1.setBounds(230, 80, 250, 30);
        jf.add(jt1);
        
        jl2 = new JLabel("Second player name : (0) ");
        jl2.setBounds(50,140, 150, 30);
        jf.add(jl2);
        
        jt2 = new JTextField();
        jt2.setBounds(230, 140, 250, 30);
        jf.add(jt2);
        
        jl3 = new JLabel("Select Series : ");
        jl3.setBounds(50,200, 150, 30);
        jf.add(jl3);
        
        String[] series = {"Select Series", "3" , "5" , "7" , "9" , "11" , "13" , "15"};
        combobox = new JComboBox(series);
        combobox.setBounds(230, 200, 250, 30);
        jf.add(combobox);
        
        jb = new JButton("Start Game");
        jb.setBounds(200, 300, 200, 50);
        jb.addActionListener(this);
        jf.add(jb);
        
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if( ae.getSource() == jb )
        {
            String player1 = jt1.getText();
            String player2 = jt2.getText();
            
            String series = (String) combobox.getSelectedItem();
            
            
            Validations v = new Validations();
            
            if( !v.nameValidate1(player1) )
            {
                JOptionPane.showMessageDialog(jf, "Name 1 is invalid", "Error" , JOptionPane.ERROR_MESSAGE);
            }
            else if( !v.nameValidate2(player2) )
            {
                JOptionPane.showMessageDialog(jf, "Name 2 is invalid", "Error" , JOptionPane.ERROR_MESSAGE);
            }
            else if(series.equals("Select Series"))
            {
                JOptionPane.showMessageDialog(jf, "Select Series is invalid", "Error" , JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                GamePanel gp = new GamePanel(player1 , player2 , Integer.parseInt(series) );
                gp.openGamePanel();

                jf.setVisible(false);
            }
        }
    }
}

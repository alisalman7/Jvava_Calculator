/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_calculator_p;

/**
 *
 * @author DELLLssss
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Java_Calculator_p {

    public static void main(String[] args) {
        
    public class Frame extends JFrame
   {
    private final JTextField Number1;
    private final JTextField Number2;
    private final JTextField additionResult;
    private final JTextField subResult;
    private final JTextField muResult;
        
    private final JCheckBox additionBox;
    private final JCheckBox muBox;
    private final JCheckBox subBox;

    private int x;
    private int y;
    private int z;
    
    
    public Frame()
    {
        super("calculator");
        setLayout(new FlowLayout());
        
        Number1 = new JTextField("type a 1st number ",20);
        Number1.setFont(new Font("Serif",Font.PLAIN,14));
        
        Number2 = new JTextField("type a 2nd number",20);
        Number2.setFont(new Font ("serif",Font.PLAIN,14));
        
        additionResult = new JTextField("Result",20);
        additionResult.setFont(new Font("Serif",Font.PLAIN,14));
        additionBox=new JCheckBox("ADD");
        
        subResult = new JTextField("Result",20);
        subResult.setFont(new Font("Serif",Font.PLAIN,14));
        subBox=new JCheckBox("Sub");
        
        muResult = new JTextField("Result",20);
        muResult.setFont(new Font("Serif",Font.PLAIN,14));
        muBox=new JCheckBox("Multi");
        add(Number1);
        add(Number2);
        
        add(additionBox);
        add(additionResult);
        
        add(subBox);
        add(subResult);
        
        add(muBox);
        add(muResult);
        
        CheckboxHandler handler =new CheckboxHandler();
        additionBox.addItemListener(handler);
                
        CheckboxHandler handler1 =new CheckboxHandler();
       subBox.addItemListener(handler1);
       
       CheckboxHandler handler2 =new CheckboxHandler();
       muBox.addItemListener(handler2);
    }
    private class CheckboxHandler implements ItemListener
    {
    @Override
    public void itemStateChanged(ItemEvent event)
    {
        x=Integer.parseInt(Number1.getText());
        y=Integer.parseInt(Number2.getText());
        
        if(additionBox.isSelected())
        {
            z=x+y;
            additionResult.setText(Integer.toString(z));
        }
        if(subBox.isSelected())
        {
            z=x-y;
            subResult.setText(Integer.toString(z));
        }
        if(muBox.isSelected())
        {
            z=x*y;
            muResult.setText(Integer.toString(z));
        }
        
    }
  }
}
    }


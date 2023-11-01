package com.speakertimer;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Robot;
public class JMenuFrame extends JFrame implements ActionListener
{
    JMenuBar bar;
    JMenu menu ;
    String[] items;
    JMenuItem[] menuItems;
    JButton start;
    Robot robot;
    public void prepareAndShowGUI()
    {
        try
        {
            robot = new Robot();
        }
        catch (Exception ex){}
        bar = new JMenuBar();
        menu = new JMenu("File");
        items =  new String[]{"Open","Save","Save As","Quit"};
        menuItems = new JMenuItem[items.length];
        start = new JButton("Click me");
        for (int i = 0 ; i < items.length ; i++)
        {
            menuItems[i] = new JMenuItem(items[i]);
            menuItems[i].addActionListener(this);
            menu.add(menuItems[i]);
        }
        bar.add(menu);
        setJMenuBar(bar);
        start.addActionListener(this);
        getContentPane().add(start,BorderLayout.SOUTH);
        setPreferredSize(new Dimension(300,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        if ("Click me".equals(evt.getActionCommand()))
        {
            menu.doClick();
            if (robot!=null)
            {
                for (int i = 0 ; i<=2 ; i++) //Suppose you want to select 3rd MenuItem
                {
                    if (!menuItems[i].isEnabled())
                    {
                        continue;
                    }
                    robot.keyPress(KeyEvent.VK_DOWN);
                    robot.keyRelease(KeyEvent.VK_UP);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,evt.getActionCommand()+" is pressed","Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String st[])
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            public void run()
            {
                JMenuFrame mf = new JMenuFrame();
                mf.prepareAndShowGUI();
            }
        });
    }
}
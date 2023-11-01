package com.speakertimer;


import javax.swing.*;
import java.awt.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static String[] talks = {"‘Maghintay kay Jehova Nang May Pananabik’—Paano?",
            "Simposyum: Tularan ang mga Naghintay Nang May Pananabik • Habakuk",
            "Simposyum: Tularan ang mga Naghintay Nang May Pananabik • Juan",
            "Simposyum: Tularan ang mga Naghintay Nang May Pananabik • Ana",
            "Ano Pa ang Hinihintay Mo?",
            "Pag-aalay at Bautismo",
            "Pahayag Pangmadla: Sulit Pa Rin Bang Maging Matiisin?",
            "Sumaryo ng Bantayan",
            "Simposyum: Hintayin si Jehova . . . Kapag Pakiramdam Mo Nag-iisa Ka",
            "Simposyum: Hintayin si Jehova . . . Kapag Nakagawa Ka ng mga Pagkakamali",
            "Simposyum: Hintayin si Jehova . . . Kapag Parang Nagtatagumpay ang Masasama",
            "“May Gantimpala Para sa Matuwid”"};
    static Timer timer = new Timer();
    static JTextField overtime = new JTextField("30");
    static JButton start = new JButton("start");
    static JButton reset = new JButton("reset");
    static JButton stop = new JButton("stop");
    static JMenuBar menuBar = new JMenuBar();
    static JMenu menuPrograms = new JMenu("Programs");
    static JMenu menuMorningProgram = new JMenu("Morning");
    static JMenu menuAfternoonProgram = new JMenu("Afternoon");
    static JMenu menuSettings = new JMenu("Settings");
    static JMenuItem talk1 = new JMenuItem(talks[0]);
    static JMenuItem talk2 = new JMenuItem(talks[1]);
    static JMenuItem talk3 = new JMenuItem(talks[2]);
    static JMenuItem talk4 = new JMenuItem(talks[3]);
    static JMenuItem talk5 = new JMenuItem(talks[4]);
    static JMenuItem talk6 = new JMenuItem(talks[5]);
    static JMenuItem talk7 = new JMenuItem(talks[6]);
    static JMenuItem talk8 = new JMenuItem(talks[7]);
    static JMenuItem talk9 = new JMenuItem(talks[8]);
    static JMenuItem talk10 = new JMenuItem(talks[9]);
    static JMenuItem talk11 = new JMenuItem(talks[10]);
    static JMenuItem talk12 = new JMenuItem(talks[11]);
    static JFrame frame = new JFrame("Counter");
    static SimpleDateFormat timeFormat = new SimpleDateFormat("MMMMMM dd, yyyy - hh:mm:ss a");
    static int ticker = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static String time = timeFormat.format(Calendar.getInstance().getTime());
    static JLabel timeLabel = new JLabel(time);
    static JTextField talkOutline = new JTextField("‘Maghintay kay Jehova Nang May Pananabik’!");
    static JLabel counterLabel = new JLabel("00:00:00");

    public static void main(String[] args) throws InterruptedException {
        timeLabel.setBounds(10, 10, 650, 60);
        timeLabel.setFont(new Font("Serif", Font.BOLD, 40));

        talkOutline.setBounds(225, 80, 1475, 60);
        talkOutline.setHorizontalAlignment(JTextField.CENTER);
        talkOutline.setFont(new Font("Serif", Font.BOLD, 40));
        talkOutline.setForeground(new Color(27, 71, 13));
        talkOutline.setBackground(new Color(235, 235, 235));

        overtime.setBounds(925, 155, 50, 30);
        overtime.setFont(new Font("Serif", Font.BOLD, 20));
        overtime.setHorizontalAlignment(JTextField.CENTER);
        overtime.setToolTipText("in minutes");

        start.setBounds(800, 200, 100, 20);

        reset.setBounds(900, 200, 100, 20);
        reset.setEnabled(false);
        reset.setToolTipText("This will set the timer back to 0");

        stop.setBounds(1000, 200, 100, 20);
        stop.setEnabled(false);
        stop.setToolTipText("This will pause and save the time data");

        talk1.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("28");
                    talkOutline.setText(talks[0]);
                }
            }
        });
        talk2.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("21");
                    talkOutline.setText(talks[1]);
                }
            }
        });
        talk3.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("18");
                    talkOutline.setText(talks[2]);
                }
            }
        });
        talk4.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("18");
                    talkOutline.setText(talks[3]);
                }
            }
        });
        talk5.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("15");
                    talkOutline.setText(talks[4]);
                }
            }
        });
        talk6.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("30");
                    talkOutline.setText(talks[5]);
                }
            }
        });
        talk7.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("29");
                    talkOutline.setText(talks[6]);
                }
            }
        });
        talk8.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("30");
                    talkOutline.setText(talks[7]);
                }
            }
        });
        talk9.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("21");
                    talkOutline.setText(talks[8]);
                }
            }
        });
        talk10.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("18");
                    talkOutline.setText(talks[9]);
                }
            }
        });
        talk11.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("18");
                    talkOutline.setText(talks[10]);
                }
            }
        });
        talk12.addActionListener(e -> {
            if (e.getSource() instanceof JMenuItem) {
                JMenuItem item = (JMenuItem) e.getSource();
                if (item.isSelected() || item.isArmed()) {
                    overtime.setText("35");
                    talkOutline.setText(talks[11]);
                }
            }
        });

        counterLabel.setBounds(50, 150, 2000, 700);
        counterLabel.setFont(new Font("Serif", Font.BOLD, 500));
        counterLabel.setForeground(new Color(27, 71, 13));
        String magenta = "\u001B[33m";
        String resetColor = "\u001B[0m";
        String red = "\u001B[31m";
        start.addActionListener(e -> {
            start.setText("start");
            talkOutline.setEnabled(false);
            reset.setEnabled(false);
            stop.setEnabled(true);
            start.setEnabled(false);
            overtime.setEditable(false);
            stopTimer();
            task = new TimerTask() {
                @Override
                public void run() {
                    runThisTImer();
                }
            };
            timer = new Timer();
            runTimer();
        });
        reset.addActionListener(e -> {
            start.setText("start");
            talkOutline.setEnabled(true);
            reset.setEnabled(false);
            stop.setEnabled(false);
            start.setEnabled(true);
            overtime.setEditable(true);
            stopTimer();
            ticker = 0;
            seconds = 0;
            minutes = 0;
            hours = 0;
            counterLabel.setForeground(new Color(27, 71, 13));
            updateLabel();
            task = new TimerTask() {
                @Override
                public void run() {
                    runThisTImer();
                }
            };
            timer = new Timer();
        });
        stop.addActionListener(e -> {
            start.setText("resume");
            reset.setEnabled(true);
            stop.setEnabled(false);
            start.setEnabled(true);
            talkOutline.setEnabled(true);
            overtime.setEditable(true);
            stopTimer();
            System.out.println(String.format("‘Maghintay kay Jehova Nang May Pananabik’—Paano? : " + magenta + "00:03:34" + resetColor));
            System.out.println(String.format("‘10:05 Simposyum: Tularan ang mga Naghintay Nang May Pananabik:\n" +
                    "\t• Habakuk : " + magenta + "00:02:09" + resetColor + "\n" +
                    "\t• Juan : " + red + "%02d:%02d:%02d", hours, minutes, seconds));
        });
        menuPrograms.add(menuMorningProgram);
        menuPrograms.add(menuAfternoonProgram);
        menuMorningProgram.add(talk1);
        menuMorningProgram.add(talk2);
        menuMorningProgram.add(talk3);
        menuMorningProgram.add(talk4);
        menuMorningProgram.add(talk5);
        menuMorningProgram.add(talk6);
        menuAfternoonProgram.add(talk7);
        menuAfternoonProgram.add(talk8);
        menuAfternoonProgram.add(talk9);
        menuAfternoonProgram.add(talk10);
        menuAfternoonProgram.add(talk11);
        menuAfternoonProgram.add(talk12);

        menuBar.add(menuPrograms);
        menuBar.add(menuSettings);
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.add(timeLabel);
        frame.add(talkOutline);
        frame.add(start);
        frame.add(reset);
        frame.add(stop);
        frame.add(overtime);
        frame.add(counterLabel);
        frame.setSize(900, 720);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        setTime();

    }


    public static void setTime() throws InterruptedException {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            timeLabel.setForeground(Color.BLACK);
            Thread.sleep(1000);
        }
    }

    public static TimerTask task = new TimerTask() {
        @Override
        public void run() {
            runThisTImer();
        }
    };

    public static void runTimer() {
        timer.schedule(task, 0, 1000);
    }

    public static void stopTimer() {
        timer.cancel();
        timer.purge();
    }

    public static void runThisTImer() {
        ticker++;
        seconds++;
        minutes = ticker / 60;
        hours = minutes / 60;
        if (seconds > 59) {
            seconds = 0;
        }
        if (minutes > 59) {
            minutes = 0;
        }
        if (hours > 11) {
            hours = 0;
        }
        updateLabel();
        int userInput = Integer.parseInt(overtime.getText());
        if (minutes >= userInput) {
            counterLabel.setForeground(Color.RED);
        }
    }

    public static void updateLabel() {
        counterLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

}


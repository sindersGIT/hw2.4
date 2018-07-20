package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyWindow extends JFrame {
    send s = new send();
    String mylist;



    String name;
    public MyWindow(String name) {



        setTitle("DZchat");
        setBounds(100, 100, 500, 600);
        ImageIcon icon = new ImageIcon("src/img/DZchat.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        centerPanel.setBackground(Color.green);
        bottomPanel.setBackground(Color.gray);

        bottomPanel.setPreferredSize(new Dimension(1,40));

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        centerPanel.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout());

        JButton jb = new JButton("Send");
        JButton jb2 = new JButton("обновить");


        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        centerPanel.add(jsp, BorderLayout.CENTER);
        JTextField jtf = new JTextField();

        bottomPanel.add(jtf);
        bottomPanel.add(jb);
        bottomPanel.add(jb2);

        jtf.setPreferredSize(new Dimension(300,28));
        jta.setEditable(false);

        jb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //  name = jtf.getText();
                    jta.append(name+": "+jtf.getText() + "\n");
                    s.messegelist=s.messegelist+(name+": "+jtf.getText() + "\n");
                    mylist=s.messegelist;
                    jtf.setText("");
                    jtf.grabFocus();
                }
            });
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText(s.messegelist);



            }
        });
        setVisible(true);













    }
    //getPressedIcon()
}

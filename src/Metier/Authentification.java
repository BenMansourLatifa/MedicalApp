package Metier;
import DAO.Repository.Login;
import Model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Authentification extends JFrame {
    private Login login;
    private JLabel Close;
    private JButton ExitButton;
    private JPanel LeftSidePAnel;
    private JPanel RightSidePanel;
    private JTextField email;
    private JButton loginButton;
    private JLabel loginicon;
    private JLabel loginlabel;
    private JLabel logo;
    private JPasswordField mdp;
    public Authentification() {

        login=new Login();
        LeftSidePAnel = new JPanel();
        loginicon = new JLabel();
        loginlabel = new JLabel();
        RightSidePanel = new JPanel();
        email = new JTextField();
        mdp = new JPasswordField();
        loginButton = new JButton();
        ExitButton = new JButton();
        Close = new JLabel();
        logo = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new Dimension(996, 450));
        getContentPane().setLayout(null);

        LeftSidePAnel.setBackground(new Color(0, 161, 229));
        LeftSidePAnel.setPreferredSize(new Dimension(100, 40));
        LeftSidePAnel.setLayout(null);

        loginicon.setIcon(new ImageIcon(getClass().getResource("../Images/Login.PNG")));
        LeftSidePAnel.add(loginicon);
        loginicon.setBounds(130, 130, 120, 180);

        loginlabel.setFont(new Font("Serif", 3, 24));
        loginlabel.setForeground(new Color(255, 255, 255));
        loginlabel.setText("Authentification");
        LeftSidePAnel.add(loginlabel);
        loginlabel.setBounds(100, 350, 164, 32);

        getContentPane().add(LeftSidePAnel);
        LeftSidePAnel.setBounds(0, 0, 369, 460);

        RightSidePanel.setBackground(new Color(204, 153, 255));
        RightSidePanel.setLayout(null);
        getContentPane().add(RightSidePanel);
        RightSidePanel.setBounds(996, 0, 0, 460);

        email.setBackground(new Color(244, 249, 253));
        email.setFont(new Font("Segoe UI Symbol", 0, 13));
        email.setForeground(new Color(153, 153, 153));
        email.setText("EMAIL");
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 161, 229)));

        getContentPane().add(email);
        email.setBounds(480, 160, 410, 50);

        mdp.setBackground(new Color(244, 249, 253));
        mdp.setFont(new Font("Segoe UI Symbol", 0, 13));
        mdp.setForeground(new Color(153, 153, 153));
        mdp.setText("Mot de passe");
        mdp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 161, 229)));

        getContentPane().add(mdp);
        mdp.setBounds(480, 240, 410, 42);

        loginButton.setBackground(new Color(244, 249, 253));
        loginButton.setFont(new Font("Segoe UI", 1, 13));
        loginButton.setForeground(new Color(0, 161, 229));
        loginButton.setText("Login");
        loginButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user=login.getUser(email.getText(),mdp.getText());
                if(user!=null){
                    new MainInterface().setVisible(true);

                }
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(480, 360, 130, 35);

        ExitButton.setBackground(new Color(244, 249, 253));
        ExitButton.setFont(new Font("Segoe UI", 1, 13));
        ExitButton.setForeground(new Color(0, 161, 229));
        ExitButton.setText("Exit");
        ExitButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(750, 360, 130, 35);

        Close.setBackground(new Color(0, 0, 0));
        Close.setFont(new Font("Tahoma", 1, 24));
        Close.setForeground(new Color(0, 161, 229));
        Close.setText("X");
        Close.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        getContentPane().add(Close);
        Close.setBounds(962, 13, 16, 29);
        logo.setIcon(new ImageIcon(getClass().getResource("../Images/logo.PNG")));
        getContentPane().add(logo);
        logo.setBounds(590, 50, 187, 67);

        pack();
        setLocationRelativeTo(null);
    }


}

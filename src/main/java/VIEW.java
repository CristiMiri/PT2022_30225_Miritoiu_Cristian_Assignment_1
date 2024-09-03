import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("ALL")
public class VIEW extends JFrame {

    private static final long serialVersionUID = 1L;
    int input = 0;
    private JPanel contentPane;
    private JTextField txt_First_P;
    private JTextField txt_Second_P;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private JButton btn_0;
    private JButton btnX;
    private JButton btnDel;
    private JButton btn_minus;
    private JButton btn_plus;
    private JButton btn_power;
    private JButton btnAdd;
    private JButton btnSubstract;
    private JButton btnMultiplicate;
    private JButton btnDivide;
    private JButton btnDerivate;
    private JButton btnIntegrate;

    /**
     * Launch the application.
     */

    /**
     * Create the frame.
     */
    public VIEW() {
        setVisible(true);
        setResizable(false);
        setTitle("Polynom Calculator\r\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 604);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(7, 128, 208));
        contentPane.setForeground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        JLabel lblNewLabel = new JLabel("Polynomial Calculator");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setBounds(73, 11, 192, 21);
        contentPane.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("First Polynomial =");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(10, 63, 121, 19);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Second Polynomial =");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(10, 104, 141, 19);
        contentPane.add(lblNewLabel_1_1);

        txt_First_P = new JTextField();
        txt_First_P.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txt_First_P.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                input = 1;
            }
        });
        txt_First_P.setBounds(183, 64, 243, 26);
        contentPane.add(txt_First_P);
        txt_First_P.setColumns(10);

        txt_Second_P = new JTextField();
        txt_Second_P.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txt_Second_P.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                input = 0;
            }
        });
        txt_Second_P.setColumns(10);
        txt_Second_P.setBounds(183, 102, 242, 26);
        contentPane.add(txt_Second_P);

        btnMultiplicate = new JButton("Multiplicate\r\n");
        btnMultiplicate.setBackground(Color.ORANGE);
        btnMultiplicate.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnMultiplicate.setBounds(10, 223, 155, 51);
        contentPane.add(btnMultiplicate);

        btnDivide = new JButton("Divide\r\n");
        btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnDivide.setBackground(Color.ORANGE);
        btnDivide.setBounds(247, 223, 155, 51);
        contentPane.add(btnDivide);

        btnAdd = new JButton("Add\r\n");
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAdd.setBackground(Color.ORANGE);
        btnAdd.setBounds(10, 174, 155, 51);
        contentPane.add(btnAdd);

        btnSubstract = new JButton("Substract\r\n");
        btnSubstract.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSubstract.setBackground(Color.ORANGE);
        btnSubstract.setBounds(247, 174, 155, 51);
        contentPane.add(btnSubstract);

        btnIntegrate = new JButton("Integrate");
        btnIntegrate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnIntegrate.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnIntegrate.setBackground(Color.ORANGE);
        btnIntegrate.setBounds(10, 271, 155, 51);
        contentPane.add(btnIntegrate);

        btnDerivate = new JButton("Derivate");
        btnDerivate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnDerivate.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnDerivate.setBackground(Color.ORANGE);
        btnDerivate.setBounds(247, 271, 155, 51);
        contentPane.add(btnDerivate);

        btn_1 = new JButton("1");
        btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '1');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '1');
            }
        });
        btn_1.setBackground(new Color(255, 182, 193));
        btn_1.setBounds(88, 362, 50, 50);
        contentPane.add(btn_1);

        btn_2 = new JButton("2");
        btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_2.setBackground(new Color(255, 182, 193));
        btn_2.setBounds(141, 362, 50, 50);
        btn_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '2');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '2');
            }
        });
        contentPane.add(btn_2);

        btn_3 = new JButton("3");
        btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_3.setBackground(new Color(255, 182, 193));
        btn_3.setBounds(193, 362, 50, 50);
        btn_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '3');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '3');
            }
        });
        contentPane.add(btn_3);

        btn_4 = new JButton("4");
        btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_4.setBackground(new Color(255, 182, 193));
        btn_4.setBounds(245, 362, 50, 50);
        btn_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '4');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '4');
            }
        });
        contentPane.add(btn_4);

        btn_5 = new JButton("5");
        btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_5.setBackground(new Color(255, 182, 193));
        btn_5.setBounds(298, 363, 50, 50);
        btn_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '5');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '5');
            }
        });
        contentPane.add(btn_5);

        btn_6 = new JButton("6");
        btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_6.setBackground(new Color(255, 182, 193));
        btn_6.setBounds(88, 414, 50, 50);
        btn_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '6');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '6');
            }
        });
        contentPane.add(btn_6);

        btn_7 = new JButton("7");
        btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_7.setBackground(new Color(255, 182, 193));
        btn_7.setBounds(141, 414, 50, 50);
        btn_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '7');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '7');
            }
        });
        contentPane.add(btn_7);

        btn_8 = new JButton("8");
        btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_8.setBackground(new Color(255, 182, 193));
        btn_8.setBounds(193, 414, 50, 50);
        btn_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '8');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '8');
            }
        });
        contentPane.add(btn_8);

        btn_9 = new JButton("9");
        btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_9.setBackground(new Color(255, 182, 193));
        btn_9.setBounds(245, 414, 50, 50);
        btn_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '9');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '9');
            }
        });
        contentPane.add(btn_9);

        btn_0 = new JButton("0");
        btn_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_0.setBackground(new Color(255, 182, 193));
        btn_0.setBounds(298, 414, 50, 50);
        btn_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '0');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '0');
            }
        });
        contentPane.add(btn_0);

        btn_minus = new JButton("-");
        btn_minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_minus.setBackground(new Color(0, 191, 255));
        btn_minus.setBounds(88, 467, 50, 50);
        btn_minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '-');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '-');
            }
        });
        contentPane.add(btn_minus);

        btn_plus = new JButton("+");
        btn_plus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_plus.setBackground(new Color(0, 191, 255));
        btn_plus.setBounds(141, 467, 50, 50);
        btn_plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '+');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '+');
            }
        });
        contentPane.add(btn_plus);

        btn_power = new JButton("^");
        btn_power.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_power.setBackground(new Color(0, 191, 255));
        btn_power.setBounds(193, 467, 50, 50);
        btn_power.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + '^');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + '^');
            }
        });
        contentPane.add(btn_power);

        btnX = new JButton("X");
        btnX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnX.setBackground(new Color(0, 191, 255));
        btnX.setBounds(245, 466, 50, 50);
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1)
                    txt_First_P.setText(txt_First_P.getText() + 'X');
                else
                    txt_Second_P.setText(txt_Second_P.getText() + 'X');
            }
        });
        contentPane.add(btnX);

        btnDel = new JButton("Del");
        btnDel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (input == 1) {
                    String s = txt_First_P.getText().substring(0, txt_First_P.getText().length() - 1);
                    txt_First_P.setText(s);
                } else {
                    String s = txt_Second_P.getText().substring(0, txt_Second_P.getText().length() - 1);
                    txt_Second_P.setText(s);
                }
            }
        });
        btnDel.setForeground(Color.RED);
        btnDel.setFont(new Font("Arial", Font.PLAIN, 10));
        btnDel.setHorizontalAlignment(SwingConstants.LEFT);
        btnDel.setBackground(new Color(0, 191, 255));
        btnDel.setBounds(298, 466, 50, 50);
        contentPane.add(btnDel);
    }


    public void Dialog_Result(String res) {
        final JDialog d = new JDialog();
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setVisible(true);
        d.setBounds(100, 100, 358, 188);
        d.getContentPane().setLayout(new BorderLayout());
        JPanel contentPanel = new JPanel();
        d.getContentPane().add(contentPanel);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        d.getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Result :");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(10, 11, 102, 29);
        contentPanel.add(lblNewLabel);
        JTextField textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBounds(10, 65, 300, 29);
        textField.setText(res);
        contentPanel.add(textField);
        textField.setColumns(10);
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.dispose();
            }
        });
        okButton.setActionCommand("OK");
        okButton.setBounds(270, 117, 60, 30);
        contentPanel.add(okButton);

    }

    public void Dialog_Division(String cat, String rest) {
        final JDialog d = new JDialog();
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setVisible(true);
        d.setBounds(100, 100, 358, 188);
        d.getContentPane().setLayout(new BorderLayout());
        JPanel contentPanel = new JPanel();
        d.getContentPane().add(contentPanel);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        d.getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel Cat = new JLabel("Cat :\r\n");
        Cat.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Cat.setBounds(10, 11, 62, 19);
        contentPanel.add(Cat);

        JLabel Rest = new JLabel("Rest :");
        Rest.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Rest.setBounds(173, 11, 62, 19);
        contentPanel.add(Rest);

        JTextField textCat = new JTextField();
        textCat.setEditable(false);
        textCat.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textCat.setBounds(10, 60, 136, 25);
        textCat.setColumns(10);
        textCat.setText(cat);
        contentPanel.add(textCat);

        JTextField textRest = new JTextField();
        textRest.setEditable(false);
        textRest.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textRest.setColumns(10);
        textRest.setBounds(173, 60, 136, 25);
        textRest.setText(rest);
        contentPanel.add(textRest);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.dispose();
            }
        });
        okButton.setActionCommand("OK");
        okButton.setBounds(270, 117, 60, 30);
        contentPanel.add(okButton);
    }

    public static void Dialog_error(String error) {
        Frame f = new Frame();
        JOptionPane.showMessageDialog(f, error, "Eroare", JOptionPane.ERROR_MESSAGE);
    }

    public String getFirst_P() {
        if (txt_First_P.getText().isEmpty())
            VIEW.Dialog_error("Polinom Invalid");
        return txt_First_P.getText();
    }

    public String getSeconf_P() {
        if (txt_Second_P.getText().isEmpty())
            VIEW.Dialog_error("Polinom Invalid");
        return txt_Second_P.getText();
    }

    public void Addition(ActionListener a) {
        btnAdd.addActionListener(a);
    }

    public void Substaction(ActionListener a) {
        btnSubstract.addActionListener(a);
    }

    public void Multiplication(ActionListener a) {
        btnMultiplicate.addActionListener(a);
    }

    public void Division(ActionListener a) {
        btnDivide.addActionListener(a);
    }

    public void derivate(ActionListener a) {
        btnDerivate.addActionListener(a);
    }

    public void Integrate(ActionListener a) {
        btnIntegrate.addActionListener(a);
    }

}

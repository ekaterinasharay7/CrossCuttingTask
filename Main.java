import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
public class Main implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton button;
    JTextField textField;
    JCheckBox checkBox;
    Main() {
        frame = new JFrame("Main");
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(new Dimension(300, 300));
        //button = new JButton("Запустить!");
        //button.addActionListener(this);
        //button.setBounds(10, 10, 100, 100);
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(100,100);
        label.setText("Choose name of the input file:");
        JCheckBox checkbox1 = new JCheckBox("input.txt");
        checkbox1.setBounds(150,100, 50,50);
        JCheckBox checkbox2 = new JCheckBox("input.json");
        checkbox2.setBounds(150,150, 50,50);
        JCheckBox checkbox3 = new JCheckBox("input.xml");
        checkbox3.setBounds(150,200, 50,50);
        final JLabel label1 = new JLabel();
        label1.setBounds(100,250,80,30);
        label1.setSize(100,100);
        //label1.setText("Do you want to archive your output file:");






        panel.add(label);
        //panel.add(label1);
        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(checkbox3);
        frame.add(panel);



        frame.setVisible(true);


    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        ExecuteMain.executeMain();
        //Main main = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
           button.setText("Запуск прошел успешно!");
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasjframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Hafizh
 */

class FrameLogin extends JFrame implements ActionListener{
    JLabel SelamatDatang = new JLabel("Selamat Datang!");
    JLabel ket = new JLabel("Silahkan masuk untuk melanjutkan");
    JLabel user = new JLabel("Username");
    JTextField inputuser = new JTextField();
    JLabel pw = new JLabel("Password");
    JTextField inputpw = new JTextField();
    JRadioButton pilihL = new JRadioButton("Laki-laki", true);
    JRadioButton pilihP = new JRadioButton("Perempuan");
    JButton log = new JButton("Login");
    
    FrameLogin(){
        setVisible(true);
        setSize(580, 650);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(SelamatDatang);
        SelamatDatang.setBounds(30, 10, 300, 50);
        SelamatDatang.setFont (SelamatDatang.getFont().deriveFont(26.0f));
        
        add(ket);
        ket.setBounds(30, 50, 300, 32);
        ket.setFont (ket.getFont().deriveFont(16.0f));
        
        add(user);
        user.setBounds(30, 100, 300, 32);
        user.setFont (user.getFont().deriveFont(16.0f));
        add(inputuser);
        inputuser.setBounds(30, 130, 430, 32);
        inputuser.setFont (inputuser.getFont().deriveFont(16.0f));
        
        add(pw);
        pw.setBounds(30, 180, 300, 32);
        pw.setFont (pw.getFont().deriveFont(16.0f));
        add(inputpw);
        inputpw.setBounds(30, 210, 430, 32);
        inputpw.setFont (inputpw.getFont().deriveFont(16.0f));
        
        ButtonGroup pilihJK = new ButtonGroup();
        pilihJK.add(pilihL);
        pilihJK.add(pilihP);
        
        add(pilihL);
        pilihL.setBounds(30, 260, 100, 32);
        pilihL.setFont (pilihL.getFont().deriveFont(16.0f));
        add(pilihP);
        pilihP.setBounds(150, 260, 150, 32);
        pilihP.setFont (pilihP.getFont().deriveFont(16.0f));
        
        add(log);
        log.setBounds(30, 320, 430, 32);
        log.setFont (log.getFont().deriveFont(16.0f));
        log.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inputuser.getText().isEmpty() || inputpw.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lengkapi semua inputan !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        try {
            
            String username = inputuser.getText();
            String jenisKelamin = pilihL.isSelected() ? "l" : "p";
            
            if (username.isEmpty()) {
                throw new Exception("Jangan kosong, Cuy!");
            }
            
            new FrameHome(username, jenisKelamin);
            this.dispose();
        } catch (Exception error) {
        
        
        }
        
    }
    
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjframe;
import BangunDatar.BangunPersegi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Hafizh
 */

class FrameHome extends JFrame implements ActionListener{
    JLabel wel = new JLabel();
    JLabel masuk = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel panjang = new JLabel("Panjang");
    JTextField p = new JTextField();
    JLabel lebar = new JLabel("Lebar");
    JTextField l = new JTextField();
    JLabel tinggi = new JLabel("Tinggi");
    JTextField t = new JTextField();
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas");
    JLabel keliling = new JLabel("Keliling");
    JLabel volume = new JLabel("Volume");
    JLabel lp = new JLabel("Luas Permukaan");
    JLabel hluas = new JLabel("[hasil berupa angka]");
    JLabel hkeliling = new JLabel("[hasil berupa angka]");
    JLabel hvolume = new JLabel("[hasil berupa angka]");
    JLabel hlp = new JLabel("[hasil berupa angka]");
    
    
    
    FrameHome(String username, String jenisKelamin){
        setVisible(true);
        setSize(580, 650);
        setTitle("Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        String jK = (jenisKelamin == "l") ? "Mr. " : "Mrs. ";
        
        add(wel);
        wel.setText("Welcome " + jK + username);
        wel.setBounds(30, 10, 450, 50);
        wel.setFont (wel.getFont().deriveFont(26.0f));
        
        add(masuk);
        masuk.setBounds(30, 50, 500, 32);
        masuk.setFont (masuk.getFont().deriveFont(16.0f));
        
        add(panjang);
        panjang.setBounds(30, 100, 100, 32);
        panjang.setFont (panjang.getFont().deriveFont(16.0f));
        add(p);
        p.setBounds(150, 100, 380, 32);
        p.setFont (p.getFont().deriveFont(16.0f));
        
        add(lebar);
        lebar.setBounds(30, 150, 100, 32);
        lebar.setFont (lebar.getFont().deriveFont(16.0f));
        add(l);
        l.setBounds(150, 150, 380, 32);
        l.setFont (l.getFont().deriveFont(16.0f));
        
        add(tinggi);
        tinggi.setBounds(30, 200, 100, 32);
        tinggi.setFont (tinggi.getFont().deriveFont(16.0f));
        add(t);
        t.setBounds(150, 200, 380, 32);
        t.setFont (t.getFont().deriveFont(16.0f));
        
        add(hitung);
        hitung.setBounds(30, 270, 500, 32);
        hitung.setFont (hitung.getFont().deriveFont(16.0f));
        
        add(reset);
        reset.setBounds(30, 320, 500, 32);
        reset.setFont (reset.getFont().deriveFont(16.0f));
        
        add(hasil);
        hasil.setBounds(260, 380, 100, 32);
        hasil.setFont (hasil.getFont().deriveFont(16.0f));
        
        add(luas);
        luas.setBounds(30, 420, 150, 32);
        luas.setFont (luas.getFont().deriveFont(16.0f));
        
        add(keliling);
        keliling.setBounds(30, 450, 150, 32);
        keliling.setFont (keliling.getFont().deriveFont(16.0f));
        
        add(volume);
        volume.setBounds(30, 480, 150, 32);
        volume.setFont (volume.getFont().deriveFont(16.0f));
        
        add(lp);
        lp.setBounds(30, 510, 150, 32);
        lp.setFont (lp.getFont().deriveFont(16.0f));
        
        add(hluas);
        hluas.setBounds(180, 420, 200, 32);
        hluas.setFont (hluas.getFont().deriveFont(16.0f));
        
        add(hkeliling);
        hkeliling.setBounds(180, 450, 200, 32);
        hkeliling.setFont (hkeliling.getFont().deriveFont(16.0f));
        
        add(hvolume);
        hvolume.setBounds(180, 480, 200, 32);
        hvolume.setFont (hvolume.getFont().deriveFont(16.0f));
        
        add(hlp);
        hlp.setBounds(180, 510, 200, 32);
        hlp.setFont (hlp.getFont().deriveFont(16.0f));
        
        hitung.addActionListener(this);
        reset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(p.getText().isEmpty() || l.getText().isEmpty() || t.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Lengkapi semua inputan !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        try{
        if (e.getSource() == hitung) {
        
            double pj = Double.parseDouble(p.getText());
            double lb = Double.parseDouble(l.getText());
            double tg = Double.parseDouble(t.getText());
        
            BangunPersegi bangun1 = new BangunPersegi(pj, lb, tg);
            
                String hasilLuas = String.valueOf(bangun1.Luas());
                String hasilKeliling = String.valueOf(bangun1.Keliling());
                String hasilVolume = String.valueOf(bangun1.Volume());
                String hasilLuasPermukaan = String.valueOf(bangun1.LuasPermukaan());

                hluas.setText(hasilLuas);
                hkeliling.setText(hasilKeliling);
                hvolume.setText(hasilVolume);
                hlp.setText(hasilLuasPermukaan);
        } else if (e.getSource() == reset) {
            p.setText("");
            l.setText("");
            t.setText("");
            hluas.setText("");
            hkeliling.setText("");
            hvolume.setText("");
            hlp.setText("");
        }
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan input berupa angka.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
        
}
    

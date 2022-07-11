package myHouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class ControlPanel extends JPanel {
    
    MyHouseColors colors = new MyHouseColors();
    
    JButton btnDia_Noche = new JButton();
    JButton btnOPEN_CLOSE_Cochera = new JButton("Abrir Cochera");
    JButton btnON_OFF_Luces = new JButton();
    
    public ControlPanel() {
        setBounds(0, 620, 1000, 130);
        setLayout(null);
        
        diaDefault();
        
        add(btnDia_Noche);
        btnDia_Noche.setBounds(40, 40, 200, 50);
        btnDia_Noche.addActionListener(this::btnDiaNocheActionPerformed);
        
        add(btnOPEN_CLOSE_Cochera);
        btnOPEN_CLOSE_Cochera.setBounds(280 + 125, 40, 200, 50);
        btnOPEN_CLOSE_Cochera.addActionListener(this::btnOC_CocheraActionPerformed);
    
        add(btnON_OFF_Luces);
        btnON_OFF_Luces.setBounds(510 + 125 + 125, 40, 200, 50);
        btnON_OFF_Luces.addActionListener(this::btnLucesActionPerformed);
    }
    
    private void btnLucesActionPerformed(ActionEvent event) {
        if (btnON_OFF_Luces.getText().equals("Encender Luces"))
            LucesOnOff(colors.getLamparaNoche(), colors.getLamparaBrilloColorON(), "Apagar Luces");
        
        else
            LucesOnOff(colors.getLamparaDia(), colors.getLamparaBrilloColorOFF(), "Encender Luces");
        
        MyHouse.drawShapes.repaint();
    }
    
    
    private void btnDiaNocheActionPerformed(ActionEvent event) {
        if (MyHouse.drawShapes.getBackground().equals(colors.getDia()))
            noche();
        else
            diaDefault();
    }
    
    private void btnOC_CocheraActionPerformed(ActionEvent event) {
        if (btnOPEN_CLOSE_Cochera.getText().equals("Abrir Cochera")){
            MyHouse.drawShapes.setCocheraON_OFF(colors.getFondoCocheraON());
            btnOPEN_CLOSE_Cochera.setText("Cerrar Cochera");
            carroVisible(colors.getColorCoche1(), Color.WHITE, Color.BLACK, colors.getDia());
        }
        else {
            MyHouse.drawShapes.setCocheraON_OFF(colors.getFondoCocheraOFF());
            btnOPEN_CLOSE_Cochera.setText("Abrir Cochera");
            carroVisible(colors.getTransparent(), colors.getTransparent(), colors.getTransparent(), colors.getTransparent());
        }
        MyHouse.drawShapes.repaint();
    }
    

    private void noche(){
        setBackground(colors.getPanelDARK());
        
        btnDia_Noche.setText("DIA");
        btnDia_Noche.setForeground(Color.BLACK);
        btnDia_Noche.setBackground(Color.orange);
        
        btnOPEN_CLOSE_Cochera.setBackground(Color.orange);
        btnOPEN_CLOSE_Cochera.setForeground(Color.BLACK);
        
        btnON_OFF_Luces.setForeground(Color.BLACK);
        btnON_OFF_Luces.setBackground(Color.orange);
        
        MyHouse.drawShapes.setBackground(colors.getNoche());
        MyHouse.drawShapes.setParedColor(colors.getParedNoche());
        MyHouse.drawShapes.setParedColor_2(colors.getParedNocheLado());
        MyHouse.drawShapes.setSol_lunaColor(colors.getLuna());
        MyHouse.drawShapes.setCespedColor(colors.getCespedNoche());
        MyHouse.drawShapes.setPisoColor(colors.getPisoNoche());
        LucesOnOff(colors.getLamparaNoche(), colors.getLamparaBrilloColorON(), "Apagar Luces");
    }
    
    private void diaDefault(){
        setBackground(colors.getPanelLIGHT());
        
        btnDia_Noche.setText("NOCHE");
        btnDia_Noche.setForeground(Color.WHITE);
        btnDia_Noche.setBackground(Color.DARK_GRAY);
    
        btnOPEN_CLOSE_Cochera.setBackground(Color.DARK_GRAY);
        btnOPEN_CLOSE_Cochera.setForeground(Color.WHITE);
        
        btnON_OFF_Luces.setForeground(Color.WHITE);
        btnON_OFF_Luces.setBackground(Color.DARK_GRAY);
        
        MyHouse.drawShapes.setBackground(colors.getDia());
        MyHouse.drawShapes.setParedColor(colors.getParedDia());
        MyHouse.drawShapes.setParedColor_2(colors.getParedDiaLado());
        MyHouse.drawShapes.setSol_lunaColor(colors.getSol());
        MyHouse.drawShapes.setCespedColor(colors.getCespedDia());
        MyHouse.drawShapes.setPisoColor(colors.getPisoDia());
        LucesOnOff(colors.getLamparaDia(), colors.getLamparaBrilloColorOFF(), "Encender Luces");
    }
    
    private void LucesOnOff(Color lamparaColor, Color lamparaBrilloColor, String s) {
        MyHouse.drawShapes.setLamparaColor(lamparaColor);
        MyHouse.drawShapes.setLamparaBrilloColor(lamparaBrilloColor);
        btnON_OFF_Luces.setText(s);
    }
    
    
    private void carroVisible(Color colorCoche1, Color white, Color black, Color dia) {
        MyHouse.drawShapes.setCarroColor1(colorCoche1);
        MyHouse.drawShapes.setCarroCOlor2(white);
        MyHouse.drawShapes.setCarroColor3(black);
        MyHouse.drawShapes.setCarroColor4(dia);
    }
}

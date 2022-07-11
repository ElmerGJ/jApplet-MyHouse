package myHouse;

import javax.swing.*;
import java.awt.*;

public class ShapesPanel extends JPanel{
    
    MyHouseColors colors = new MyHouseColors();
    
    private Color paredColor = colors.getParedDia();
    private Color paredColor_2 = colors.getParedDiaLado();
    private Color sol_lunaColor = colors.getSol();
    private Color pisoColor = colors.getPisoDia();
    private Color cespedColor = colors.getCespedDia();
    private Color LamparaColor = colors.getLamparaDia();
    private Color LamparaBrilloColor = colors.getLamparaBrilloColorOFF();
    private Color cocheraON_OFF = colors.getFondoCocheraOFF();
    private Color carroColor1 = colors.getTransparent();
    private Color carroCOlor2 = colors.getTransparent();
    private Color carroColor3 = colors.getTransparent();
    private Color carroColor4 = colors.getTransparent();
    
    
    public Color getCarroColor1() {
        return carroColor1;
    }
    
    public void setCarroColor1(Color carroColor1) {
        this.carroColor1 = carroColor1;
    }
    
    public Color getCarroCOlor2() {
        return carroCOlor2;
    }
    
    public void setCarroCOlor2(Color carroCOlor2) {
        this.carroCOlor2 = carroCOlor2;
    }
    
    public Color getCarroColor3() {
        return carroColor3;
    }
    
    public void setCarroColor3(Color carroColor3) {
        this.carroColor3 = carroColor3;
    }
    
    public Color getCarroColor4() {
        return carroColor4;
    }
    
    public void setCarroColor4(Color carroColor4) {
        this.carroColor4 = carroColor4;
    }
    
    public Color getCocheraON_OFF() {
        return cocheraON_OFF;
    }
    
    public void setCocheraON_OFF(Color cocheraON_OFF) {
        this.cocheraON_OFF = cocheraON_OFF;
    }
    
    public Color getLamparaBrilloColor() {
        return LamparaBrilloColor;
    }
    
    public void setLamparaBrilloColor(Color lamparaBrilloColor) {
        LamparaBrilloColor = lamparaBrilloColor;
    }
    
    public Color getLamparaColor() {
        return LamparaColor;
    }
    
    public void setLamparaColor(Color lamparaColor) {
        LamparaColor = lamparaColor;
    }
    
    public Color getCespedColor() {
        return cespedColor;
    }
    
    public void setCespedColor(Color cespedColor) {
        this.cespedColor = cespedColor;
    }
    
    public Color getPisoColor() {
        return pisoColor;
    }
    
    public void setPisoColor(Color pisoColor) {
        this.pisoColor = pisoColor;
    }
    
    public Color getSol_lunaColor() {
        return sol_lunaColor;
    }
    
    public void setSol_lunaColor(Color sol_lunaColor) {
        this.sol_lunaColor = sol_lunaColor;
    }
    
    public void setParedColor(Color paredColor) {
        this.paredColor = paredColor;
    }
    
    public void setParedColor_2(Color paredColor_2) {
        this.paredColor_2 = paredColor_2;
    }
    
    public Color getParedColor() {
        return paredColor;
    }
    
    public Color getParedColor_2() {
        return paredColor_2;
    }
    
    
    
    public ShapesPanel() {
        setBounds(0, 0, 1000, 620);
        setBackground(colors.getDia());
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="FORMAS">
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    
        
        int initialPointX; //variable para establecer un punto donde comienzan los poligonos en X
        int initialPointY; //variable para establecer un punto donde comienzan los poligonos en Y
        
        //LUNA y SOL
        g.setColor(getSol_lunaColor());
        g.fillOval(30, 30, 100, 100);
        
        //CESPED
        g.setColor(getCespedColor());
        int[] xPoints = new int[]{0, 117, 883, 1000};
        int[] yPoints = new int[]{620, 520, 520, 620};
        g.fillPolygon(xPoints, yPoints, 4);
        
    
        
        //PISO COCHERA
        g.setColor(getPisoColor());
        xPoints = new int[]{35, 114, 375, 375, 340};
        yPoints = new int[]{620, 550, 550, 575, 620};
        g.fillPolygon(xPoints, yPoints, 5);
        //---------------------------------
    
        //PISO ENTRADA
        xPoints = new int[]{535, 580, 775, 820};
        yPoints = new int[]{620, 575, 575, 620};
        g.fillPolygon(xPoints, yPoints, 4);
        //---------------------------------
        
        
        //TECHOS
        g.setColor(colors.getTechoOUT());
        g.fillRect(100, 350, 275, 20); //Techo Cochera
        g.fillRect(100, 155, 310, 20); //Techo Piso Superior IZQ
        g.fillRect(350, 80, 600, 20); //Techo Piso Superior DER
        g.setColor(colors.getTechoIN());
        xPoints = new int[]{100, 410, 410, 142};
        yPoints = new int[]{175, 175, 195, 195};
        g.fillPolygon(xPoints, yPoints, 4);
        xPoints = new int[]{350, 950, 900, 400};
        yPoints = new int[]{100, 100, 125, 125};
        g.fillPolygon(xPoints, yPoints, 4);
        //---------------------------------
        
        
        //PAREDES SUPERIORES-----------------------------------------------
        g.setColor(colors.getParedSuperiorIZQ());
        g.fillRect(160, 188, 250, 162); //Pared Superior IZQ
        
        //lineas
        g.setColor(colors.getLineas3());
        initialPointX = 194;
        for (int i = 0; i < 6; i++) {
            g.fillRect(160, initialPointX, 250, 2);
            initialPointX += 24;
        }
        
        g.setColor(colors.getMarcos());
        g.fillRect(410, 125,480, 205);//Pared Superior DER back
        g.setColor(colors.getParedSuperiorDER());
        g.fillRect(715, 120, 170, 200); //Pared Superior DER front
        g.setColor(colors.getLineas1());
        //lineas
        g.fillRect(715, 180, 170, 5);
        g.fillRect(715, 250, 170, 5);
        //-----------------------------------------------------------------
    
    
        //PAREDES INFERIORES
        g.setColor(getParedColor_2());
        g.fillRect(580, 330, 20, 235); //Pared Frontal IZQ LADO
        g.setColor(getParedColor());
        g.fillRect(375, 325, 205, 250); //Pared Frontal IZQ
        g.fillRect(600, 330, 290, 245); //Pared Frontal DER
        g.fillRect(114, 370, 310, 180); //Pared Cochera
        
        
        //TECHO ENTRADA
        g.setColor(colors.getTechoOUT());
        g.fillRect(580, 325, 195, 5);
        g.setColor(colors.getTechoIN());
        xPoints = new int[]{580, 775, 755, 600};
        yPoints = new int[]{330, 330, 340, 340};
        g.fillPolygon(xPoints, yPoints, 4);
        
        
        //VENTANAS Y PUERTA
        
        //marcos
        g.setColor(colors.getMarcos());
        g.fillRect(175, 230, 220, 71); //Ventana superior IZQ
        g.fillRect(417, 365, 121, 100); //Ventana frontal
        g.fillRect(625, 365, 120, 190); //Puerta
        
        //ventanas y puertas
        g.setColor(colors.getVentanas());
        g.fillRect(410, 120, 95, 205); //Ventanas Superiores DER 1
        g.fillRect(510, 120, 95, 205); //Ventanas Superiores DER 2
        g.fillRect(610, 120, 95, 205); //Ventanas Superiores DER 3
        g.fillRect(180, 235, 102, 60); //Ventana superior IZQ 1
        g.fillRect(288, 235, 102, 60); //Ventana superior IZQ 2
        g.fillRect(422, 370, 111, 90); //Ventana frontal
        g.fillRect(630, 370, 110, 180); //Puerta
        g.setColor(colors.getPuertaPerilla());
        g.fillRect(627, 457, 12, 26);
        
        
        //ESCALONES
        g.setColor(colors.getEscalones());
        xPoints = new int[]{580, 580, 600, 600, 755, 755, 775, 775};
        yPoints = new int[]{575, 565, 565, 555, 555, 565, 565, 575};
        g.fillPolygon(xPoints, yPoints, 8);
        //--------------------------------------------------------------
    
        
        
        //PUERTA COCHERA
        g.setColor(colors.getLineas2());
        g.fillRect(139, 386, 236, 164); // Fondo
        g.setColor(colors.getPuertaCochera());
        g.fillRect(147, 395, 228, 155); //Puerta
        g.setColor(colors.getLineas2());
        initialPointX = 406; //Lineas
        for (int i = 0; i < 6; i++) {
            g.fillRect(147, initialPointX, 228, 4);
            initialPointX +=24;
        }
    
        
        
        //FONDO COCHERA
        g.setColor(getCocheraON_OFF());
        g.fillRect(147, 395, 228, 155); // Fondo
        
        //<editor-fold desc="C A R R O">
        //fondo
        g.setColor(getCarroColor1());
        xPoints = new int[]{218, 211, 211, 193, 193, 331, 331, 311, 311, 306};
        yPoints = new int[]{422, 428, 468, 487, 530, 530, 487, 468, 428, 422};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
        
        g.setColor(getCarroCOlor2());
        g.fillOval(210, 495, 20, 20);
        g.fillOval(295, 495, 20, 20);
    
        g.setColor(getCarroColor3());
        g.fillRect(243, 499, 45, 3);
        g.fillRect(243, 505, 45, 3);
    
        g.fillRect(208, 530, 20, 15);
        g.fillRect(300, 530, 20, 15);
    
        g.setColor(getCarroColor4());
        g.fillRect(230, 440, 64, 29);
        //-----------------------------------------------------------------------
        //</editor-fold>
        
        
        
        //DISEÑOS PARED FRONTAL
        g.setColor(colors.getDesigns());
        g.fillRect(776, 385, 134, 20);
        g.fillRect(776, 424, 134, 20);
        g.fillRect(410, 455, 135, 16);
        
        g.setColor(colors.getLineas2());
        initialPointX = 405;
        for (int i = 0; i < 2; i++) {
            xPoints = new int[]{890, 910, 890};
            yPoints = new int[]{initialPointX, initialPointX, initialPointX + 11};
            g.fillPolygon(xPoints, yPoints, 3);
            initialPointX +=39;
        }
        
        
        //<editor-fold desc="L A M P A R A S"> -------------------------------------------------------------------------
        initialPointX = 124; //Lamparas de Techo Superior IZQ
        for (int i = 0; i < 4; i++) {
            g.setColor(getLamparaColor());
            g.fillOval(initialPointX, 178, 20, 4);
            g.setColor(getLamparaBrilloColor());
            xPoints = new int[]{initialPointX, initialPointX + 20, initialPointX + 30, initialPointX - 10};
            yPoints = new int[]{178, 178, 200, 200};
            g.fillPolygon(xPoints, yPoints, 4);
            initialPointX +=85;
        }
        
        initialPointX = 400; //Lamparas de Techo Superior DER
        for (int i = 0; i < 6; i++) {
            g.setColor(getLamparaColor());
            g.fillOval(initialPointX, 108, 20, 4);
            g.setColor(getLamparaBrilloColor());
            xPoints = new int[]{initialPointX, initialPointX + 20, initialPointX + 30, initialPointX - 10};
            yPoints = new int[]{108, 108, 130, 130};
            g.fillPolygon(xPoints, yPoints, 4);
            initialPointX +=96;
        }
    
        initialPointX = 610; //Lamparas de Puerta
        for (int i = 0; i < 3; i++) {
            g.setColor(getLamparaColor());
            g.fillOval(initialPointX, 333, 15, 4);
            g.setColor(getLamparaBrilloColor());
            xPoints = new int[]{initialPointX, initialPointX + 15, initialPointX + 30, initialPointX - 10};
            yPoints = new int[]{333, 333, 345, 345};
            g.fillPolygon(xPoints, yPoints, 4);
            initialPointX +=60;
        }
        //</editor-fold>------------------------------------------------------------------------------------------------
        
    }
    //</editor-fold>
    
}

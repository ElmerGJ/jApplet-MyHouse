package myHouse;

import javax.swing.*;

public class MyHouse extends JApplet {
    static ShapesPanel drawShapes = new ShapesPanel();
    
    
    public void init(){
        setLayout(null);
        getContentPane().add(drawShapes);
        getContentPane().add(new ControlPanel());
    }
    
}

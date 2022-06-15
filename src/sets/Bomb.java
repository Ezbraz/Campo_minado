package sets;

import javax.swing.*;

public class Bomb extends Location
{

    // construtor da classe
    public Bomb(int x, int y, String representation)
    {
        super(x, y, representation);
        bomba = new ImageIcon("field.png");
    }
    public ImageIcon bomba = new ImageIcon("bomb.png");

    // Printa a representação no campo
    public String printRepresentation()
    {
        if(marked == true && hidden == true)
        {
            return "P ";
        }
        else if(hidden == false)
        {
            return "B ";
        }
        else
        {
            return "  ";
        }
    }
}

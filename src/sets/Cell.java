package sets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cell extends JButton {

    private Location type;
    private Field field;
    ImageIcon campo = new ImageIcon("grama.png");
    ImageIcon bomba = new ImageIcon("bomb.png");
    private Color mineColor = new Color(52, 46,35);


    public Cell(Location type, Field field)
    {
        this.type = type;
        this.field = field;
        this.setFocusable(false);
        this.setIcon(campo);
        this.setBackground(Color.getColor("", mineColor));
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setForeground(Color.white);


        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                if(e.getButton() == MouseEvent.BUTTON1)
                {
                    clickButtonLeft();
                }
                else if(e.getButton() == MouseEvent.BUTTON3)
                {
                    clickButtonRight();
                }
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

    }

    public Location getType()
    {
        return type;
    }

    // Ações que são executadas apos ser clicado
    public void clickButtonLeft()
    {
        if(field.getRunning() == true)
        {
            field.selectCell(this);
            field.printField();
            setText(type.printRepresentation());
            field.gameStatus();
            this.setIcon(null);
            if(this.type instanceof Bomb){
                for(int i=0; i<Main.TAMGRID*Main.TAMGRID; i++){
                    if(Grid.cellGrid.get(i).type instanceof Bomb){
                        Grid.cellGrid.get(i).setIcon(null);
                        Grid.cellGrid.get(i).setIcon(bomba);

                    }
                }
            }
        }
    }

    public void clickButtonRight()
    {
        if(field.getRunning() == true)
        {
            field.markLocationCell(this);
            field.printField();
            setText(type.printRepresentation());
            field.gameStatus();
        }
    }
}

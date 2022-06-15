package sets;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Grid extends JPanel {

    private int limite = Main.TAMGRID * Main.TAMGRID;
    public static ArrayList<Cell> cellGrid = new ArrayList<Cell>();
    private Field field;


    public Grid(GridLayout g, Field field)
    {
        super(g);
        this.field = field;
        cellGrid = this.field.getCellsList();
        addCells();
    }

    // Adiciona as Cells de cellGrid a janela
    public void addCells()
    {
        for (Cell c : cellGrid)
        {
            add(c);
        }
    }
}
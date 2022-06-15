package sets;

public class Main
{
    public static final int LARGURA = 720, ALTURA = 720;
    public static final int TAMGRID = 10;
    public static final int BOMBCHANCE = 25;

    public static void main(String[] args)
    {
        boolean game = true;
        Field field = new Field(TAMGRID,TAMGRID, BOMBCHANCE);
        new Window(LARGURA, ALTURA, TAMGRID, "Minesweeper", field);
        field.printField();
    }
}
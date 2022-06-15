package sets;

public class Ground extends Location
{
    int bombsAround;

    // construtor da classe
    public Ground(int x, int y, String representation)
    {
        super(x, y, representation);
    }

    // Recebe um numero e adiciona a variavel bombsAround
    public void setBombNumber(int number)
    {
        bombsAround = number;
    }

    // Printa a representação no campo
    public String printRepresentation()
    {
        if(marked == true && hidden == true)
        {
            return "P ";
        }
        else if(hidden == false)
        {
            return bombsAround + " ";
        }
        else
        {
            return "  ";
        }
    }
}

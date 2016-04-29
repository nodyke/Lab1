package Figures;

/**
 * Created by Nodyke on 03.03.2016.
 */
public class Square
        extends Figure
    implements ICircleIN
{
    float k;

    public  Square(ISquareIN a)
    {
        super("Квадрат");
        k=a.setK();

    }
    public double square()
    {
        return k*k;
    }
    public double diag()
    {
        return Math.sqrt(2)*k;
    }
    public float setR()
    {
        return k;
    }
}

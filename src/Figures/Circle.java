package Figures;

/**
 * Created by Nodyke on 03.03.2016.
 */
public class Circle
        extends Figure
{
    float r;
    public Circle(ICircleIN a)
    {

        super("Круг");
        r=a.setR();
    }
    public double square()
    {
        return Math.PI*r*r;
    }
    public double lenght()
    {
        return 2*Math.PI*r;
    }
}

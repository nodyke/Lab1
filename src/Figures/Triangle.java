package Figures;

/**
 * Created by Nodyke on 03.03.2016.
 */
public class Triangle
        extends Figure
{
    float h,x;

    public Triangle(ITriangleIN a)
    {
        super("Треугольник");
        h=a.setH();
        x=a.setX();


    }
    public double square()
    {
        return h*x/2;
    }
    public double perimetr()
    {
        if (x==h) return (x+x+2*Math.sqrt(x));
        else return (h*(Math.sqrt(5)+Math.sqrt(5)+2)/2);
    }
}

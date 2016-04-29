package Figures.impl;

import Figures.*;

/**
 *@author Nodyke ;
 */
public class Restangle
extends Figure
    implements ICircleIN, ITriangleIN, AllipsIn, ISquareIN
{
    private float a,b;
    static String name="Прямоугольник";
    protected float getA()
    {
        return a;
    }
    protected float getB()
    {
        return b;
    }
    protected void setA(float n)
    {
        a=n;
    }
    protected void setB(float n)
    {
        b=n;
    }
    public Restangle (float a,float b)
    /**
     * @param a side a
     *          @param b side b;
     */
    {

        super(name);
        setA(a);
        setB(b);
    }
    public Restangle(IRestangleIN a)
    {
        super("Прямоугольник");
        setA(a.setA());
        setB(a.setB());
    }
    public float setR()
    /**
     * @see Метод вычисляет радиус вписанной окружности
     */
    {
        if (getA()<=getB()) return getA();
        else return getB();
    }
    public float setH()
    {
        if (getA()<=getB()) return getA();
        else return getB();
    }
    public float setX()
    {
        if ((getA()<=getB())&&(getB()/getA()>=2)) return 2*getA();
        if ((getA()<=getB())&&(getB()/getA()<2)) return getA();
        if ((getA()>getB())&&(getA()/getB()>=2)) return 2*getB();
        return getB();
    }
    public double square()
    {
        return a*b;
    }
    public float setSMOC()
    {
        if (getA()<=getB()) return getA();
        else return getB();
    }
    public float setBGOC()
    {
        if (getA()<=getB()) return getB();
        else return getA();
    }
    public float setK()
    {
        if (getA()<=getB())return getA();
        else return getB();
    }
}

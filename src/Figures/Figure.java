package Figures;

/**
 * Created by Nodyke on 03.03.2016.
 */
public abstract class Figure

{

    protected final String name;

    public Figure(String name) {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }
//    protected void setName(String name)
//    {
//        this.name=name;
//    }
    abstract public double square();



}

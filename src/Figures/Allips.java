package Figures;

/**
 * Created by Nodyke on 03.03.2016.
 */
public class Allips
        extends Figure
{
    private float smoc,bgoc;
      public  Allips(AllipsIn a)
    {
        super("Эллипс");
        this.smoc=a.setSMOC();
        bgoc=a.setBGOC();
    }

    public double square()
    {
        return Math.PI*smoc*bgoc;
    }
    public float sumr()
    {
        return smoc+bgoc;
    }
}

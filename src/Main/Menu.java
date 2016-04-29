package Main;

import Figures.*;
import Figures.impl.Restangle;

import java.util.*;

/**
 * Created by Nodyke on 04.03.2016.
 *  @author Nodyke ;
 */
public class Menu {
    public int podmenu() {
        int count = 1;
        int choice = -1;
        Scanner in = new Scanner(System.in);
        ArrayList<String> ALmenu2 = new ArrayList<>();
        ALmenu2.add((count++) + "-" + "Circle");
        ALmenu2.add((count++) + "-" + "Triangle");
        ALmenu2.add((count++) + "-" + "Square");
        ALmenu2.add((count) + "-" + "Allips");
        do {
            for (String a : ALmenu2
                    ) {
                System.out.println(a);

            }
            if (in.hasNextInt())
                choice = in.nextInt();
            else in.next();


        }
        while ((choice > ALmenu2.size()) || (choice < -1));
        return choice;


    }

    public void start() {
        int choice = -1;
        Scanner in = new Scanner(System.in);
        List<Figure> Figures = new ArrayList<>();
        List<String> ALmenu = new ArrayList<>();
        ALmenu.add(1 + " - Create");
        ALmenu.add(2 + " - Remove");
        ALmenu.add(3 + " - Calculate Area");
        ALmenu.add(0 + " - exit");
        Map<Class<? extends Figure>, Integer> CountOfObjectes = new HashMap<>();
//        CountOfObjectes.put("Круг", 0);
//        CountOfObjectes.put("Треугольник", 0);
//        CountOfObjectes.put("Квадрат", 0);
//        CountOfObjectes.put("Эллипс", 0);
        while (true) {
            do {
                for (String a : ALmenu) {
                    System.out.println(a);

                }

                if (in.hasNextInt())
                    choice = in.nextInt();
                else in.next();

            }
            while ((choice > ALmenu.size()) || (choice <= -1));


            switch (choice) {
                case 1:
                    createObject(Figures,CountOfObjectes, podmenu());
                    break;
                case 2:
                    removeObject(Figures, CountOfObjectes, podmenu());
                    break;
                case 3:
                   getSquare(Figures,CountOfObjectes,podmenu());
                    break;
                case 0:
                    return;
            }
        }
    }

    public void removeObject(List<Figure> Figures,  Map<Class<? extends Figure>, Integer> CountOfObjectes, int type) {
        int count;
        Class <? extends Figure> a=getTypeObject(type);
        for (int i=0;i<Figures.size();i++)
        {
            if (Figures.get(i).getClass().equals(a))
            {
                count=Integer.parseInt(CountOfObjectes.get(a).toString());
                CountOfObjectes.put(a,--count);
                Figures.remove(i);
                return;
            }

        }
System.out.println("This type of Object can't be found");

    }

    public Restangle createRestangle() {
        float a = -1, b = -1;
        do {

            Scanner in1 = new Scanner(System.in);
            System.out.println("Enter side а: ");
            if (in1.hasNextFloat())
                a = in1.nextFloat();
            else in1.next();
            System.out.println("Enter side b: ");
            if (in1.hasNextFloat())
                b = in1.nextFloat();
            else in1.next();
        }
        while ((a <= 0) && (b <= 0));

        return new Restangle(a, b);
    }

    public void createObject(List <Figure> Figures, Map<Class<? extends Figure>, Integer> CountOfObjectes, int type) {
        Figure pe = null;
        int count=0;
        switch (type) {
            case 1:

                ICircleIN per = createRestangle();
                pe = new Circle(per);
                break;
            case 2:
                ITriangleIN per1 = createRestangle();
                pe = new Triangle(per1);
                break;
            case 3:
                ISquareIN per2 = createRestangle();
                pe = new Square(per2);
               break;
            case 4:
                AllipsIn per3 = createRestangle();
                pe = new Allips(per3);
                break;
        }
        Class<? extends Figure> a=getTypeObject(type);
        if (CountOfObjectes.get(a)!=null) count=Integer.parseInt(CountOfObjectes.get(a).toString());
        CountOfObjectes.put(a,++count);
        Figures.add(pe);
    }

    public void getSquare(List<Figure> Figures, Map<Class<? extends Figure>,Integer> CountOfObjectes, int podmenu) {
       for (int i=0;i<Figures.size();i++)
           if (Figures.get(i).getClass().equals(getTypeObject(podmenu)))
               System.out.println("Area figure № "+i+" = "+Figures.get(i).square());
        for (Map.Entry<Class<? extends Figure>,Integer> entry: CountOfObjectes.entrySet())
        {
            System.out.println("Numbers of "+entry.getKey().getSimpleName()+" = "+entry.getValue());
        }
        System.out.println("Numbers of "+Figure.class.getSimpleName()+"= "+Figures.size());




        }



public Class<? extends Figure> getTypeObject (int type)
    {
        switch (type)
        {
            case 1:
                return Circle.class;
            case 2:
                return Triangle.class;
            case 3:
                return Square.class;
            case 4:
                return Allips.class;
            default:
                return null;
        }
    }
}


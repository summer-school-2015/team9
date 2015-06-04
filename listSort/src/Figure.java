/**
 * Created by User on 04/06/2015.
 */
public class Figure implements Comparable<Figure> {

    public static double S;
    public static String ftype;

    Figure(int rad) {
        S = (Math.PI) * rad * rad;
        ftype = "CIRCLE";
    }

    Figure(String type, int a, int b) {
        if (type.equals("Rectangle")) {
            S = a * b;
            ftype = "RECTANGLE";
        } else if(type.equals("Triangle")) {
            S = 0.5 * a * b;
            ftype = "TRIANGLE";
        }

    }

    @Override
    public int compareTo(Figure o) {
        if (this.S == o.S) {
            return 0;
        }else{
            if (this.S > o.S) {
                return 1;
            }
            else {
                return -1;
            }
        }

    }

}

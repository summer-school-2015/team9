import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\MyGit\\team9\\Task.txt");
        int i;
        List<Figure> list = new ArrayList<Figure>();
        Scanner sc=null;
        try {
            sc = new Scanner(file);
            int n = sc.nextInt();
                while(sc.hasNext()) {
                    String st = sc.next();


                    switch (st.charAt(0)){
                        case'C':
                            int r = sc.nextInt();
                            list.add(new Figure(r));

                            break;
                        case'T':
                            int a = sc.nextInt();
                            int b = sc.nextInt();
                            list.add(new Figure("Triangle", a, b));
                            System.out.println(list.get(0).ftype);

                            break;
                        case'R':
                            int c = sc.nextInt();
                            int d = sc.nextInt();
                            list.add(new Figure("Rectangle", c, d));

                            break;
                    }
            }



            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j).ftype + ": " + list.get(j).S + " ");
            }
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j).ftype + ": " + list.get(j).S + " ");
                }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

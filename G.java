
import java.util.Scanner;
import java.io.*;

public class G {
    static String path = "C:\\Users\\shadi\\Desktop";
    static File f = new File(path);
    Scanner in = new Scanner(System.in);
    private String name;
    private int age;
    private static int number;
    private int[] degri = new int[5];
    private String plise;
    private int sum = 0;
    private int avg;

    public void setpl() {
        plise = in.next();
    }

    public void setna() {
        name = in.next();
    }

    void setage() {
        age = in.nextInt();
    }

    void setnu() {
        number = number + 1;
    }

    void setde() {
        int i;
        for (i = 0; i < degri.length; i++) {
            degri[i] = in.nextInt();
            sum = sum + degri[i];
        }
        avg = sum / (i - 1);

    }

    String getpl() {
        return plise;
    }

    String getna() {
        return name;
    }

    int getage() {
        return age;
    }

    int getnu() {
        return number;
    }

    int[] getde() {
        return degri;
    }

    void getdep() {
        for (int i = 0; i < degri.length; i++) {
            System.out.println(degri[i]);
        }
        print("sum:" + sum + "\n avg:" + avg);

    }

    void print1(G[][] p) {
        int[] n = sarch(p);
        System.out.println("name:" + p[n[0]][n[1]].getna());
        System.out.println("id:" + p[n[0]][n[1]].getnu());
        System.out.println("age:" + p[n[0]][n[1]].getage());
        System.out.println("place:" + p[n[0]][n[1]].getpl());
        System.out.println("classs number:" + (n[0] + 1));

    }

    public int[] sarch(G[][] ar) {
        System.out.println("Enter id ");
        int nm = in.nextInt();
        int i = 0, j = 0, k = 0;
        int num[] = new int[2];
        d: {
            for (k = 0; k < ar.length; k++) {
                for (i = 0; i < ar.length; i++) {
                    if (ar[0][0] != null) {
                        if (ar[k][i].getnu() == nm) {
                            num[0] = k;
                            num[1] = i;

                            break d;
                        }
                    } else {
                        num[0] = -1;
                        num[1] = -1;

                    }
                }
            }

        }

        return num;
    }

    static void print(Object p) {
        System.out.println(p);
    }

    public void printall(G[][] prin) {
        out: {
            for (int i = 0; i < prin.length; i++) {
                for (int k = 0; k < prin[i].length; k++) {
                    if (prin[i][k] != null) {

                        print(prin[i][k].getnu() + " : " + prin[i][k].getna() + "\n" + prin[i][k].getna() + ""
                                + prin[i][k].getage() + "" + prin[i][k].getpl());
                    } else
                        break out;
                }
            }
        }
    }

    public void input_da(G[][] cla) {
        int tu = 0;
        out: {
            do {
                print("enter win you studi");
                int ind;
                for (int i = 0; i < cla.length; i++) {
                    for (int j = 0; j < cla[j].length; j++) {
                        if (cla[i][j] == null) {
                            cla[i][j] = new G();
                            System.out.println("anter name of sttudnt");
                            cla[i][j].setna();
                            System.out.println("anter age of studnt");
                            cla[i][j].setage();
                            cla[i][j].setnu();
                            System.out.println("anter where is it plice");
                            cla[i][j].setpl();
                            System.out.println("enter number 1 to out \n and 2 for enter new studnt ");
                            tu = in.nextInt();
                            if (tu == 2)
                                break out;
                        }
                    }
                }
            } while (tu != 2);
        }
    }
}

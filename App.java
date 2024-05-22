
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number of class");
        int number_class = in.nextInt();
        System.out.println("enter when they sudi");
        int namder_studnt = in.nextInt();
        int ind = 0, j = 0;
        G[][] info_st = new G[number_class][namder_studnt];
        G mathod = new G();
        boolean t = true;

        do {
            mathod.print("1- Use app as a teacher \n2- Use app as a Student \n3-Exit ");

            int choise = in.nextInt();
            switch (choise) {
                case 1:
                    boolean out_C_t = true;
                    do {
                        mathod.print(
                                "1- add Data Student\n2- all studnt\n3-Update Name of St\n4-enter degri\n5- Exit ");
                        choise = in.nextInt();
                        switch (choise) {
                            case 1:
                                mathod.input_da(info_st);
                                break;
                            case 2:
                                mathod.printall(info_st);
                                break;
                            case 3:
                                int[] temp = new int[2];
                                temp = mathod.sarch(info_st);
                                boolean f2 = false;
                                do {
                                    if (temp[0] != -1) {
                                        System.out.println("1: to infmhsin\2-thing info");
                                        int inf = in.nextInt();
                                        switch (inf) {
                                            case 1:
                                                mathod.print1(info_st);
                                                break;
                                            case 2:

                                                boolean out_c_info = true;
                                                do {

                                                    System.out.println(
                                                            " 1: to tching age \n 2: to tching degry \n 3: to tching live\n4- tching name \n 5:to out");
                                                    int th = in.nextInt();
                                                    switch (th) {
                                                        case 1:
                                                            info_st[temp[0]][temp[1]].setage();
                                                            break;
                                                        case 2:
                                                            info_st[temp[0]][temp[1]].setde();
                                                            break;
                                                        case 3:
                                                            info_st[temp[0]][temp[1]].setpl();
                                                            break;
                                                        case 4:
                                                            info_st[temp[0]][temp[1]].setna();
                                                            break;
                                                        case 5:
                                                            out_c_info = false;
                                                            break;
                                                        default:
                                                            mathod.print("enter number 1 to 4");
                                                            break;
                                                    }
                                                } while (out_c_info);

                                        }
                                    } else
                                        System.out.println("ther isnt any studnt in thes number");
                                } while (f2);
                                break;
                            case 4:
                                temp = new int[2];
                                temp = mathod.sarch(info_st);
                                if (temp[0] != -1) {
                                    info_st[temp[0]][temp[1]].setde();

                                }
                                mathod.print("therr is not any studnt in thes id");
                                break;
                            case 5:
                                t = false;
                                break;

                            default:
                                mathod.print("enter number 1 to 4");
                                break;
                        }

                    } while (out_C_t);
                    break;
                case 2:
                    boolean out_c_st = true;
                    do {

                        int temp[] = new int[2];
                        temp = mathod.sarch(info_st);
                        mathod.print("1- see your info\n2-degri");
                        choise = in.nextInt();
                        if (temp[0] != -1) {
                            switch (choise) {
                                case 1:
                                    mathod.print1(info_st);
                                    break;
                                case 2:
                                    info_st[temp[0]][temp[1]].getdep();

                                    break;
                                case 3:
                                    out_c_st = false;
                                    break;
                                default:
                                    break;
                            }
                        }

                    } while (out_c_st);

                    break;

                default:
                    mathod.print("enter number 1 -2");

                    break;
            }

        } while (t);
        in.close();
    }
}

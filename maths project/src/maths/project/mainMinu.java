
package maths.project;

import java.util.Scanner;
import static maths.project.equations.*;
import static maths.project.differentiation.*;
import static maths.project.integration.*;
import static maths.project.simplfecation.*;
import static maths.project.Trigonometric_functions.*;
import static maths.project.Trigonometric_reverse_functions.*;

public class mainMinu {

    private Scanner in = new Scanner(System.in);

    public void main_equations() {
        for (;;) {
            System.out.print("\n\t ***** Equations *****\n"
                    + "      ^*^*^*^*^*^*^*^*^*^*^*^*^*^\n     1- Eigen & EigenVectors  (third  order)"
                    + "\n     2- constant Coefficients (second order)  "
                    + "\n     3- Eular_Cauchy          (second order) \n     4- malthus               (first  order) \n\t\t0- Exit\n"
                    + "      --------------------------\n   >> ");
            String Equationtype = in.next();
            switch (Equationtype) {
                case "1":
                    System.out.print("\n       _________________________"
                            + "\n        >>> A = matrix  2*2 <<<\n    a11 = ");
                    String javaerror = in.nextLine();
                    double a11 = in.nextDouble();
                    System.out.print("    a12 = ");
                    double a12 = in.nextDouble();
                    System.out.print("    a21 = ");
                    double a21 = in.nextDouble();
                    System.out.print("    a22 = ");
                    double a22 = in.nextDouble();
                    eigen(a11, a12, a21, a22);
                    System.out.println("\n ______________________________________");
                    continue;
                case "4":
                    System.out.print("\n           _________________"
                            + "\n            >>> Ay`= Ky <<<\n    A = ");
                    double A = in.nextDouble();
                    System.out.print("    K = ");
                    double k = in.nextDouble();
                    System.out.println("    y = " + malthus((k / A))
                            + "\n ______________________________________");
                    continue;
                case "0":
                    break;
                case "2":
                    System.out.print("\n      _________________________"
                            + "\n      >>> Ay``+ By`+ Cy = 0 <<<\n    A = ");
                    double a = in.nextDouble();
                    System.out.print("    B = ");
                    double b = in.nextDouble();
                    System.out.print("    C = ");
                    double c = in.nextDouble();
                    System.out.println("    y = " + constant_coefficients(a, b, c)
                            + "\n ______________________________________");
                    continue;
                case "3":
                    System.out.print("\n    ________________________________"
                            + "\n    >>> Ax^3y``+ Bx^2y`+ Cxy = 0 <<<\n    A = ");
                    double a1 = in.nextDouble();
                    System.out.print("    B = ");
                    double b1 = in.nextDouble();
                    System.out.print("    C = ");
                    double c1 = in.nextDouble();
                    System.out.println("    y = " + eular_cauchy(a1, b1, c1)
                            + "\n ______________________________________");
                    continue;
                default:
                    System.out.println("<< Wrong Input ! Please Try Again >> ");
                    continue;
            }
            break;
        }
    }

    public void main_diff() {// Trigonometric reverse functions
        for (;;) {
            System.out.print("\n       ***** Differentiation *****\n"
                    + "     ^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^\n"
                    + "       1-  chain \n       2-  multiply  \n       3-  div "
                    + "\n       4-  sqrt \n       5-  exp\n       6-  log\n       7-  F(x)^power"
                    + "\n       8-  C^F(x)"
                    + "\n       9-  Trigonometric functions\n       10- Trigonometric reverse funs"
                    + "\n       11- Complix\n       0-  Exit\n"
                    + "     -------------------------------\n   >> ");
            String difftype = in.next();
            switch (difftype) {
                case "0":
                    break;
                case "1":
                    System.out.println("\n      _________________________"
                                     + "\n       >>> (Ax^(a)+Bx^(b)) <<<");
                    System.out.print("   F = ");
                    String java_Error = in.nextLine();
                    String ych = in.nextLine();
                    System.out.println("   F`= " + shape(chainDiff(ych, 'x'))
                            + "\n ______________________________________");
                    continue;
                case "2":
                    System.out.println("\n    _____________________________"
                                     + "\n    >>> (Ax^(a)+c)*(Bx^(b)+C) <<<");
                    System.out.print("   Y = ");
                    String javaError = in.nextLine();
                    String ymu = in.nextLine();
                    System.out.println("   Y`= " + multiplyDiff(ymu, 'x')
                            + "\n ______________________________________");
                    continue;
                case "3":
                    System.out.println("\n    _____________________________"
                                     + "\n    >>> (Ax^(a)+c)/(Bx^(b)+C) <<<");
                    System.out.print("   Y = ");
                    String javaerror = in.nextLine();
                    String ydi = in.nextLine();
                    System.out.println("   Y`= " + devDiff(ydi, 'x')
                            + "\n ______________________________________");
                    continue;
                case "4":
                    System.out.println("\n     _______________________"
                                     + "\n      >>> sqrt (Ax^a+c) <<<");
                    System.out.print("   Y = ");
                    String java_error = in.nextLine();
                    String ysq = in.nextLine();
                    System.out.println("   Y`= " + SqrtDiff(ysq, 'x')
                            + "\n ______________________________________");
                    continue;
                case "5":
                    System.out.println("\n     _______________________"
                                     + "\n     >>> K exp(Ax^(a)+c) <<<");
                    System.out.print("   Y = ");
                    String Java_error = in.nextLine();
                    String yex = in.nextLine();
                    System.out.println("   Y`= " + expDiff(yex, 'x')
                            + "\n ______________________________________");
                    continue;
                case "6":
                    System.out.println("\n       ___________________"
                            + "\n        >>> log(f(x)) <<<");
                    System.out.print("   Y = ");
                    String Javaerr = in.nextLine();
                    String yl = in.nextLine();
                    System.out.println("   Y`= " + logDiff(yl, 'x')
                            + "\n ______________________________________");
                    continue;
                case "7":
                    System.out.println("\n       __________________"
                                     + "\n       >>> (f(x))^(a) <<<");
                    System.out.print("   Y = ");
                    String J_Err = in.nextLine();
                    String ypo = in.nextLine();
                    System.out.println("   Y`= " + powerDiff(ypo, 'x')
                            + "\n ______________________________________");
                    continue;
                case "8":
                    System.out.println("\n       __________________"
                             + "\n        >>> A^(f(x)) <<<");
                    System.out.print("   Y = ");
                    String JError = in.nextLine();
                    String yp = in.nextLine();
                    System.out.println("   Y`= " + fun_power_x_Diff(yp, 'x')
                            + "\n ______________________________________");
                    continue;
                case "9":
                    for (;;) {
                        System.out.print("\n     *** Trigonometric functions ***"
                                + "\n     ^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^\n"
                                + "\n       1- sin        2- cos\n       3- tan"
                                + "        4- cot\n       5- sec        6- csc\n\t     0- Exit"
                                + "\n     -------------------------------\n   >> ");
                        String Trtype = in.next();
                        switch (Trtype) {
                            case "0":
                                break;
                            case "1":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> sin(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Je = in.nextLine();
                                String ys = in.nextLine();
                                System.out.println("   Y`= " + sinDiff(ys, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "2":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> cos(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jlsdke = in.nextLine();
                                String yc = in.nextLine();
                                System.out.println("   Y`= " + cosDiff(yc, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "3":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> tan(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jwxdjie = in.nextLine();
                                String yt = in.nextLine();
                                System.out.println("   Y`= " + TanDiff(yt, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "4":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> cot(f(x)) <<<");
                                System.out.print("   Y = ");
                                String J_eerrrr = in.nextLine();
                                String yct = in.nextLine();
                                System.out.println("   Y`= " + CotDiff(yct, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "5":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> sec(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jaavaaa_e = in.nextLine();
                                String yse = in.nextLine();
                                System.out.println("   Y`= " + SecDiff(yse, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "6":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> csc(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Java_e = in.nextLine();
                                String ycs = in.nextLine();
                                System.out.println("   Y`= " + CscDiff(ycs, 'x')
                                        + "\n ______________________________________");
                                continue;
                            default:
                                System.out.println("<< Wrong Input ! Please Try Again >>");
                                continue;
                        }
                        break;
                    }
                    continue;
                case "10":
                    for (;;) {
                        System.out.print("\n    Trigonometric reverse functions"
                                + "\n    ^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^\n"
                                + "\n       1-  sinh      2- arcsinh \n       3-  cosh      4- arccosh"
                                + "\n       5-  tanh      6- arctanh\n       7-  coth      8- arccoth"
                                + "\n       9-  sech     10- arcsech\n       11- csch     12- arccsch"
                                + "\n               0- Exit\n     -------------------------------\n   >> ");
                        String Trtype = in.next();
                        switch (Trtype) {
                            case "0":
                                break;
                            case "1":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> sinh(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Je = in.nextLine();
                                String ys = in.nextLine();
                                System.out.println("   Y`= " + sinhDiff(ys, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "2":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> cosh(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jlsdke = in.nextLine();
                                String yc = in.nextLine();
                                System.out.println("   Y`= " + coshDiff(yc, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "3":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> tanh(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jwxdjie = in.nextLine();
                                String yt = in.nextLine();
                                System.out.println("   Y`= " + tanhDiff(yt, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "4":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> coth(f(x)) <<<");
                                System.out.print("   Y = ");
                                String J_eerrrr = in.nextLine();
                                String yct = in.nextLine();
                                System.out.println("   Y`= " + cothDiff(yct, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "5":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> sech(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jaavaaa_e = in.nextLine();
                                String yse = in.nextLine();
                                System.out.println("   Y`= " + sechDiff(yse, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "6":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> csch(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Java_e = in.nextLine();
                                String ycs = in.nextLine();
                                System.out.println("   Y`= " + cschDiff(ycs, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "7":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> arcsinh(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jke = in.nextLine();
                                String yas = in.nextLine();
                                System.out.println("   Y`= " + arcSinhDiff(yas, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "8":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> arccosh(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jlke = in.nextLine();
                                String yac = in.nextLine();
                                System.out.println("   Y`= " + arcCoshDiff(yac, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "9":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> arctanh(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jwxdie = in.nextLine();
                                String yat = in.nextLine();
                                System.out.println("   Y`= " + arcTanhDiff(yat, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "10":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> arccoth(f(x)) <<<");
                                System.out.print("   Y = ");
                                String J_err = in.nextLine();
                                String yact = in.nextLine();
                                System.out.println("   Y`= " + arcCothDiff(yact, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "11":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> arcsech(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Jaaa_e = in.nextLine();
                                String yase = in.nextLine();
                                System.out.println("   Y`= " + arcSechDiff(yase, 'x')
                                        + "\n ______________________________________");
                                continue;
                            case "12":
                                System.out.println("\n       ___________________"
                                        + "\n        >>> arccsch(f(x)) <<<");
                                System.out.print("   Y = ");
                                String Ja_e = in.nextLine();
                                String yacs = in.nextLine();
                                System.out.println("   Y`= " + arcCschDiff(yacs, 'x')
                                        + "\n ______________________________________");
                                continue;
                        }
                        break;
                    }
                    continue;
                case "11":
                    System.out.print("\n ______________________________________\n   F = ");
                    String J_Error = in.nextLine();
                    String f = in.nextLine();
                    System.out.println("   Y`= " + shape(Advanced.AdvancedDiff(f, 'x'))
                            + "\n ______________________________________");
                    continue;
                default:
                    System.out.println("<< Wrong Input ! Please Try Again >> ");
                    continue;
            }
            break;
        }
    }

    public void main_int() {
        for (;;) {
            System.out.print("\n \t***** integration *****\n"
                    + "      ^*^*^*^*^*^*^*^*^*^*^*^*^*^\n       1- chain "
                    + "     2- exp\n       3- log        4- div"
                    + "\n       5- sin        6- cos\n       7- Sqrt       8- multiply"
                    + "\n              0- Exit\n"
                    + "      ---------------------------\n   >> ");
            String inttype = in.next();
            switch (inttype) {
                case "0":
                    break;
                case "1":
                    System.out.println("\n       _________________________"
                                      +"\n        >>> (Ax^(a)+Bx^(b)) <<<");
                    System.out.print("   y`= ");
                    String java_error = in.nextLine();
                    String dy = in.nextLine();
                    System.out.println("   y = " + chainInt(dy, 'x'));
                    continue;
                case "2":System.out.println("\n       _________________________"
                                           +"\n          >>> exp(F(x)) <<<");
                    System.out.print("   y`= ");
                    String java_Error = in.nextLine();
                    String dye = in.nextLine();
                    System.out.println("   y = " + expInt(dye, 'x'));
                    continue;
                case "3":System.out.println("\n       _________________________"
                                           +"\n          >>> log(F(x)) <<<");
                    System.out.print("   y`= ");
                    String javaerror = in.nextLine();
                    String dyg = in.nextLine();
                    System.out.println("   y = " + logInt(dyg, 'x'));
                    continue;
                case "4":System.out.println("\n       _________________________"
                                           +"\n        >>> (F`(x))/(F(x)) <<<");
                    System.out.print("   y`= ");
                    String javaError = in.nextLine();
                    String dyl = in.nextLine();
                    System.out.println("   y = " + divInt(dyl, 'x'));
                    continue;
                case "5":System.out.println("\n       _________________________"
                                           +"\n          >>> sin(F(x)) <<<");
                    System.out.print("   y`= ");
                    String java_err = in.nextLine();
                    String dys = in.nextLine();
                    System.out.println("   y = " + sinInt(dys, 'x'));
                    continue;
                case "6":System.out.println("\n       _________________________"
                                           +"\n          >>> cos(F(x)) <<<");
                    System.out.print("   y`= ");
                    String javaerr = in.nextLine();
                    String dyc = in.nextLine();
                    System.out.println("   y = " + cosInt(dyc, 'x'));
                    continue;
                case "7":System.out.println("\n       __________________________"
                                           +"\n       >>> (F`(x))/Sqrt(F(x)) <<<");
                    System.out.print("   y`= ");
                    String jError = in.nextLine();
                    String dyds = in.nextLine();
                    System.out.println("   y = " + SqrtInt(dyds, 'x'));
                    continue;
                case "8":System.out.println("\n       _________________________"
                                           +"\n         >>> (g(x))*(F(x)) <<<");
                    System.out.print("   y`= ");
                    String jEror = in.nextLine();
                    String dym = in.nextLine();
                    System.out.println("   y = " + integByParts(dym, 'x'));
                    continue;
                default:
                    System.out.println("<< Wrong Input ! Please Try Again >> ");
                    continue;
            }
            break;
        }
    }
}

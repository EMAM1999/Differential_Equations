
package maths.project;

import java.util.Scanner;
import static maths.project.simplfecation.*;

public class MathsProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        equations eq = new equations();
        integration Int = new integration();
//        differation dif = new differation();
        simplfecation sim = new simplfecation();
        differentiation diff = new differentiation();
        mainMinu main = new mainMinu();
//        System.out.println(Int.function_Int("((3x+x^2)^(2))*(3+2x)",'x'));
//        System.out.println(shape(differentiation.chainDiff("3x+x^2", 'x')));





        System.out.println("Calculate The Differentiation Equation :)\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (;;) {
            System.out.print("\n  ** Enter The Type Of The Operation **"
                    + "\n  v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v\n       1- Equations"
                    + "\n       2- Differentiation "
                    + "\n       3- Integration    \n  -------------------------------------\n   >> ");
            String type = in.next();
            switch (type) {
                case "1":
                    main.main_equations();
                    break;
                case "2":
                    main.main_diff();
                    break;
                case "3":
                    main.main_int();
                    break;
                default:
                    System.out.println("<< Wrong Input ! Please Try Again >> ");
            }
        }
    }
}
//
//
//
//
//
//
//
//
//
//        }
//
//        String A = "", x = "", a = "", dy = "";    
//
//        for (int i = 0; i < y.length(); i++) {
//            switch (y.charAt(i)) {
//                case '-':
//                    if (i == 0) { 
//                        if (y.charAt(1) != 'x' && y.charAt(1) != 'X') {
//                            A += y.charAt(i);
//                        } else {
//                            A = "-1";
//                        }
//                    } else if (x+a != "x^" || x+a != "X^") { 
//                        int B;
//                        int b;
//                        if (A == "") { 
//                            if (a == "") {
//                                dy += 1+"+";
//                            } else {
//                                b = Integer.parseInt(a) - 1;
//                                B = Integer.parseInt(a);
//                                dy += B + x + b+"+";
//                            }
//                           
//                        }  else if (a == "") { 
//                            B = Integer.parseInt(A);
//                            dy += B+"+";
//                        } else {
//                            b = (Integer.parseInt(a)) - 1;
//                            System.out.println(i);
//                            B = Integer.parseInt(a) * Integer.parseInt(A);
//                            dy += B + x + b + "+";
//                        }
//                        A = x = a = "";
//                        if (y.charAt(i + 1) == 'x' || y.charAt(i + 1) == 'X') {
//                            A = "-1";
//                        } else {
//                            A += y.charAt(i);
//                        }
//                    } else if (a == "") {
//                        a += y.charAt(i);
//                    }
//                    break;
//                case '+':
//                    int B;
//                    int b;
//                    if (A == "") {
//                        if (a == "") {
//                            dy += 1 + "+";
//                        } else {
//                            b = Integer.parseInt(a) - 1;
//                            B = Integer.parseInt(a);
//                            dy += B + x + b + "+";
//                        }
//                    } else if (x == "") {
//                    } else if (a == "") {
//                        B = Integer.parseInt(A);
//                        dy += B + "+";
//                    } else {
//                        b = (Integer.parseInt(a)) - 1;
//                        B = Integer.parseInt(a) * Integer.parseInt(A);
//                        dy += B + x + b + "+";
//                    }
//                    A = x = a = "";
//                    break;
//                case '0':
//                case '1':
//                case '2':
//                case '3':
//                case '4':
//                case '5':
//                case '6':
//                case '7':
//                case '8':
//                case '9':
//                    if (x == "") {
//                        A += y.charAt(i);
//                    } else {
//                        a += y.charAt(i);
//                    }
//                    break;
//                case 'x':
//                case 'X':
//                case '^':
//                    x += y.charAt(i);
//                    break;
//            }
//        }
//
//        String d = dy;
//        dy = "";
//        for (int i = 0; i < d.length() - 1; i++) {
//            dy += d.charAt(i);
//        }
//        int B;
//        int b;
//        if (A == "") {
//            if (a == "") {
//                dy += "+"+1;
//            } else {
//                b = (Integer.parseInt(a)) - 1;
//                B = Integer.parseInt(a);
//                dy += B + x + b++;
//            }
//        } else if (x == "") {
//            if (dy == "") {
//                dy = "0";
//            }
//        } else if (a == "") {
//            B = Integer.parseInt(A);
//            dy += B;
//        } else {
//            b = (Integer.parseInt(a)) - 1;
//            B = Integer.parseInt(a) * Integer.parseInt(A);
//            dy += B + x + b;
//        }
//        System.out.println(dy);
//        int b = (Integer.parseInt(a)) - 1;
//        int B = (Integer.parseInt(a)) * (Integer.parseInt(A));
//        dy += B + x + b++;
//        A = x = a = "";
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(in.readLine());
////        int coun = st.countTokens();
//        boolean fristtoken = true;
//        String output = "y' =";
//
//        while (st.hasMoreTokens()) {
//            boolean isPos;
//            int power;
//            int coefficient;
//            String input = st.nextToken();
//            if (fristtoken) {
//                if (input.charAt(0) == '-') {
//                    isPos = false;
//
//                } else {
//                    isPos = true;
//                }
//                int coefficientend = 0;
//                for (int i = (isPos) ? (0) : (1); i < input.length(); i++) {
//                    if (input.charAt(i) > '9' || input.charAt(i) < '0') {
//                        coefficientend = i - 1;
//                        break;
//                    }
//
//                }
//                coefficient = Integer.parseInt(input.substring(((isPos) ? (0) : (1)), coefficientend));
//                power = Integer.parseInt(input.substring(coefficientend + 2));
//                System.out.println(coefficient + "x^" +power);}
//        }


package maths.project;

import static maths.project.simplfecation.*;
//import static maths.project.integration.*;
//import static maths.project.Advanced.*;
//import static maths.project.differentiation.*;

public class equations {

    public static String malthus(double f) {
        return "C exp(" + f + "t)";
    }

    public static void eigen(double a11, double a12, double a21, double a22) {
        double y1 = roundTo(((a11 + a22) + Math.sqrt(power((a11 + a22), 2) - (4 * (a11 * a22 - a21 * a12)))) / 2,1);
        double y2 = (((a11 + a22) - Math.sqrt(power((a11 + a22), 2) - (4 * (a11 * a22 - a21 * a12)))) / 2);
        System.out.println("   [ "+y1 + ", " + y2 + "] Are The EigenValues");
        double x11 = 1;
        double x12 = 2;
        double x21 = roundTo(((y1 - a11) / a12)*x11,1);
        double x22 = roundTo(((y2 - a11) / a12)*x12,1);
        System.out.print("   X1 = [ 1, 2]T  ,  X2 = [ " + x21 + ", " + x22 + "]T\n\t  Are The EigenVectors");

//        String k = "";
//        if (AdvancedDiff(m, 'y').equals(AdvancedDiff(n, 'x'))) {
//            u = chainInt(m, 'x');
//            k=n.replace(chainDiff(u,'y'),"");
    }

    public static String constant_coefficients(double A, double B, double C) {
        double t1, t2;
        double s = (B * B) - (4 * A * C);
        String y = "";
        if (s > 0) {
            t1 = (-B + Math.sqrt(s)) / (2 * A);
            t2 = (-B - Math.sqrt(s)) / (2 * A);
            y += "C1exp(" + simplfecation.roundTo(t1, 3) + "x)+C2exp(" + simplfecation.roundTo(t2, 3) + "x)";
        } else if (s == 0) {
            t1 = (-B) / (2 * A);
            y += "(C1+C2x)exp(" + simplfecation.roundTo(t1, 3) + "x)";
        } else if (s < 0) {
            t1 = (-B) / (2);
            t2 = (Math.sqrt(-s)) / (2);
            y += "(Acos(" + simplfecation.roundTo(t2, 3) + "x)+Bsin(" + simplfecation.roundTo(t2, 3) + "x))exp(" + simplfecation.roundTo(t1, 3) + "x)";
        }
        return shape(y);
    }

    public static String eular_cauchy(double A, double b, double C) {
        double t1, t2, B = b - 1;
        double s = (B * B) - (4 * A * C);
        String y = "";
        if (s > 0) {
            t1 = (-B + Math.sqrt(s)) / (2 * A);
            t2 = (-B - Math.sqrt(s)) / (2 * A);
            y += "C1 x^(" + simplfecation.roundTo(t1, 3) + "x)+C2 x^(" + simplfecation.roundTo(t2, 3) + ")";
        } else if (s == 0) {
            t1 = (-B) / (2 * A);
            y += "(C1+C2 lnx) x^(" + simplfecation.roundTo(t1, 3) + ")";
        } else if (s < 0) {
            t1 = (-B) / (2);
            t2 = roundTo((Math.sqrt(-s)) / (2), 3);
            if (t1 != 0) {
                y += "(Acos(" + simplfecation.roundTo(t2, 3) + "lnx)+Bsin(" + simplfecation.roundTo(t2, 3) + "lnx)) x^(" + simplfecation.roundTo(t1, 3) + ")";
            } else {
                y += "(Acos(" + simplfecation.roundTo(t2, 3) + "lnx)+Bsin(" + simplfecation.roundTo(t2, 3) + "lnx))";
            }
        }
        return shape(y);

    }

}

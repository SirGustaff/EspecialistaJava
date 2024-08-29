public class NumeroUtil {

    static int maiorNumero(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    static int maiorNumero(int x, int y, int z) {
        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }

    static double maiorNumero(double x, double y) {
        if (x > y)
            return x;
        else
            return y;
    }

    static double maiorNumero(double x, double y, double z) {
        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }
}

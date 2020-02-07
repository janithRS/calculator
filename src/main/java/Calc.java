public class Calc{
    public static void add(List<double> args[], String op) {
        double tot;
        if (op.equals("+") ) {
            for (int i=0; i <= args.length; i++;){
                tot += args[i];
            }
        }
    }
}
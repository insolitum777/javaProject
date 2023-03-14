package methodOverLoading;

import com.sun.source.tree.BreakTree;

public class Isprime {


    public boolean IsPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
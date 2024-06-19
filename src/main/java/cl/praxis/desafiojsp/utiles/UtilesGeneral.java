package cl.praxis.desafiojsp.utiles;

public class UtilesGeneral {

    public int getFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }
}

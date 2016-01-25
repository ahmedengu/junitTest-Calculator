/**
 * Created by Ahmed Kamel Taha on 31/12/2015.
 */
public class Calculator {

    public Calculator() {

    }

    public int add (int x, int y){

           if(x<0&&y<0)
               throw new IllegalArgumentException("IllegalArgumentException");
            else
        return x+y;
    }

    public int mult(int x, int y) {
        return x*y;
    }

    public int sub(int x, int y) {
        return x-y;
    }

    public int div(int x, int y) {
        if (y==0)
            throw new IllegalArgumentException("IllegalArgumentException");
        else
        return x/y;
    }

    public int advCalc(int x, int y,char s) {
        switch (s){
            case '+':
                if(x<0&&y<0)
                    throw new IllegalArgumentException("IllegalArgumentException");
                else
                    return x+y;

            case '-':
                return x-y;
            case '*':
                return x*y;

            case '/':
                if (y==0)
                    throw new IllegalArgumentException("IllegalArgumentException");
                else
                    return x/y;
            }
        return x;
    }
}

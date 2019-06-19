import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc  {

    public static void main(String [] args) throws IOException {
        //exception handling is presented in isValid
        //enter data until we get the correct expression
        InputData example;
        while (true){
            example = new InputData();
            if (example.isValid()) {
                break;
            }
            System.out.println("Not a valid expression. Enter the correct expression");
        }

        //the expression is displayed on the screen by the overloaded method toString
        System.out.print(example);

        //the  calculation result
        MathOperations result = new MathOperations(example);

        //output the result in the same form as the entered data
        if (example.getIsRom()){
            System.out.println(example.intToStr(result.getResult()));
        } else {
            System.out.println(result.getResult());
        }
    }
}

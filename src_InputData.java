import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//this class is responsible for entering data and processing them
//in the output we get all the data necessary for the correct expression
//the implemented interfaces provide conversion to roman characters and back

public class InputData implements StringToInteger, IntegerToString{
    private int num1;
    private String  operation;
    private int num2;
    private boolean isRom;

    private String num1Str, operationStr, num2Str;
    //enter input data
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public InputData() throws IOException {
        System.out.print("Enter number1: ");
        num1Str = reader.readLine().trim();
        System.out.print("Enter operation: ");
        operationStr = reader.readLine().trim();
        System.out.print("Enter number2: ");
        num2Str = reader.readLine().trim();

    }
    // displaying the entered expression
    @Override
    public String  toString(){
        return this.num1Str + " " + this.operationStr + " " + this.num2Str + " = ";
    }

    //converting a number of string to int
    public int convert(String string){
        if (isRom(num1Str)) {
            return strToInt(string);
        } else {
            return Integer.parseInt(string);
        }
    }

    //getters of the received data
    public int getNum1() {
        num1 = convert(num1Str);
        return num1;
    }

    public int getNum2() {
        num2 = convert(num2Str);
        return num2;
    }
    public boolean getIsRom(){
        return isRom(num1Str);
    }

    public String  getOperation() {
        operation = operationStr;
        return operation;
    }
    //convert roman to arabic numerals
    public int strToInt (String string){
        int result = -1;
        switch (string.toUpperCase().trim()) {
            case "I": {
                result = 1;
                break;
            }
            case "II": {
                result = 2;
                break;
            }
            case "III": {
                result = 3;
                break;
            }
            case "IV": {
                result = 4;
                break;
            }
            case "V": {
                result = 5;
                break;
            }
            case "VI": {
                result = 6;
                break;
            }
            case "VII": {
                result = 7;
                break;
            }
            case "VIII": {
                result = 8;
                break;
            }
            case "IX": {
                result = 9;
                break;
            }
            case "X": {
                result = 10;
                break;
            }
            default: {
                result = -1;
                break;
            }
        }
        return result;
    }
    //validation of the expression
    public boolean isValid(){
        boolean result = false;
        try {
            result = isArab(num1Str) && isArab(num2Str) ;
        } catch (NumberFormatException e){
            result = isRom(num1Str) && isRom(num2Str);
        }
        result = result && ("*".equals(operationStr) || "+".equals(operationStr) || "-".equals(operationStr) || "/".equals(operationStr));
        return result;
    }


}

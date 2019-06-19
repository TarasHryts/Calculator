public interface StringToInteger {

    //converts characters
    public int strToInt (String string);
    //validation of the expression
    public boolean isValid();
    //checks expression type
    public default boolean isRom(String string){
        if (strToInt(string) > 0) {
            return true;
        } else {
            return false;
        }
    }
    public default boolean  isArab(String string){
        if (Integer.parseInt(string) >= 0 && Integer.parseInt(string) <= 10){
            return true;
        } else {
            return false;
        }
    }

}

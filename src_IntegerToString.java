public interface IntegerToString {
    //converts arabic to roman numerals
    public default String intToStr (int num){
        String str;
        switch (num){
            case 1:{
                str = "I";
                break;
            }
            case 2:{
                str = "II";
                break;
            }
            case 3:{
                str = "III";
                break;
            }
            case 4:{
                str = "IV";
                break;
            }
            case 5:{
                str = "V";
                break;
            }
            case 6:{
                str = "VI";
                break;
            }
            case 7:{
                str = "VII";
                break;
            }
            case 8:{
                str = "VIII";
                break;
            }
            case 9:{
                str = "IX";
                break;
            }
            case 10:{
                str = "X";
                break;
            }
            case 11:{
                str = "XI";
                break;
            }
            case 12:{
                str = "XII";
                break;
            }
            case 13:{
                str = "XIII";
                break;
            }
            case 14:{
                str = "XIV";
                break;
            }
            case 15:{
                str = "XV";
                break;
            }
            case 16:{
                str = "XVI";
                break;
            }
            case 17:{
                str = "XVII";
                break;
            }
            case 18:{
                str = "XVIII";
                break;
            }
            case 19:{
                str = "XIX";
                break;
            }
            case 20:{
                str = "XX";
                break;
            }
            case 21:{
                str = "XXI";
                break;
            }
            case 22:{
                str = "XXII";
                break;
            }
            case 23:{
                str = "XXIII";
                break;
            }
            case 24:{
                str = "XXIV";
                break;
            }
            case 25:{
                str = "XXV";
                break;
            }
            case 26:{
                str = "XXVI";
                break;
            }
            case 27:{
                str = "XXVII";
                break;
            }
            case 28:{
                str = "XXVIII";
                break;
            }
            case 29:{
                str = "XXIX";
                break;
            }
            case 30:{
                str = "XXX";
                break;
            }
            default: {
                str = "Data Out Of Range";
            }
        }
        return str;
    }
}



public class Check {

public static boolean checkPESEL(String pesel){

    return (checkLenghth(pesel)&&chceckSum(pesel)&&checkMonth(pesel));
}

  public static boolean chceckSum(String pesel){
    int[] numbers = {1,3,7,9,1,3,7,9,1,3,1};
    int sum = 0;
    for (int i = 0; i <11 ; i++) {
        sum += numbers[i] * Integer.valueOf(pesel.charAt(i));

    }
    if(sum % 10 == 0){
        return true;
    }else{
        return false;
    }
}

    public static boolean checkMonth(String pesel) {
        String month = pesel.substring(2, 4);
        int monthInt = Integer.valueOf(month);
        if (monthInt > 0 && monthInt < 13) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDay(String pesel){
            String day = pesel.substring(4,6);
            int dayInt = Integer.valueOf(day);
            if(dayInt>0 && dayInt <32){
                return true;
            }else {
                return false;
            }


}

    public static boolean checkLenghth(String pesel){
    if (pesel.length() != 11) {

        return false;
    }

    return true;
}


}

public class Main {
    public static String yearNew(int year ) {
        String result;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          result = year + " является весокосным";
        } else {
            result = year + " не является весокосным";
        }
        return result;
    }

    public static void main(String[] args) {
        int year = 2056;
        System.out.println(yearNew(year));
    }
}
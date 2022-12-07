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
    public static String osNew ( int OS, int DeviceYear) {
        String resultOs = " ";
        if (OS == 0) {
            if (DeviceYear >= 2015) {
                resultOs = "Установите приложения для iOS по ссылке";
            } else {
                resultOs = "Установите облегченную версию приложения для iOS по ссылке";
            }
        }
            if (OS == 1) {
                if (DeviceYear >= 2015) {
                    resultOs = "Установите приложения для Android по ссылке";
                } else {
                    resultOs = "Установите облегченную версию приложения для Android по ссылке";
                }
            }
        return resultOs;
    }
    public static String deliveryNew(int Distance){
        String resultDistance;
        int deliverTime = 1;
        if (Distance > 0) {
            deliverTime += (Distance + 20) / 40;
            resultDistance = "Доставка займет " + deliverTime + " дней";

        } else {
            resultDistance = "Доставка не возможна";
        }
        return resultDistance;

    }



    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2056;
        System.out.println(yearNew(year));

        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2012;
        System.out.println(osNew(clientOs, clientDeviceYear));

        System.out.println("Задание 3");
        int deliveryDistance = 50;
        System.out.println(deliveryNew(deliveryDistance));


    }
}
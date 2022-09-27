package phone;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public String toString() {
        return number + ", " + model + ", " + weight;
    }

    public static void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public static void getNumber(String number) {
        System.out.println(number);
    }

    public static void receiveCall(String name, String number) {
        System.out.println("Calling " + name + ", number: " + number);
    }


}

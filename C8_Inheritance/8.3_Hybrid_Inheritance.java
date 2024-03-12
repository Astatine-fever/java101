package Chapter8_INHERITANCE;
import java.util.Scanner;

class vehicle {

    void lights(int no_of_lights) {
        System.out.println(" There are " + no_of_lights + " lights in this vehicle");
    }

    void wheels(int no_of_wheels) {
        System.out.println(" There are " + no_of_wheels + "wheels in this vehicle");
    }

    vehicle() {
        System.out.println(" All vehicle have engine");
    }

    void passenger(int no_of_passengers) {
        System.out.println(" This vehicle can hold  " + no_of_passengers + " passengers");
    }

    void fuel(String fuel_type) {
        System.out.println(" This vehicle runs on  " + fuel_type);
    }
}

class two_wheeler extends vehicle {

    two_wheeler() {
        System.out.println(" This is a two wheeler");
    }

}

class four_wheeler extends vehicle {
    four_wheeler() {
        System.out.println(" This is a four wheeler");
    }
}

class vehicle_classification {
    public static void main(String[] args) {
        int no_of_lights, no_of_passengers, no_of_wheels;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter No of Passengers : ");
        no_of_passengers = sc.nextInt();
        System.out.println(" Enter No of Lights : ");
        no_of_lights = sc.nextInt();
        System.out.println(" Enter No of Wheels : ");
        no_of_wheels = sc.nextInt();

        if (no_of_wheels > 2 || no_of_passengers > 3) {
            four_wheeler fw = new four_wheeler();
            fw.lights(no_of_lights);
            fw.passenger(no_of_passengers);
            fw.wheels(no_of_wheels);
        } else {
            two_wheeler tw = new two_wheeler();
            tw.lights(no_of_lights);
            tw.passenger(no_of_passengers);
            tw.wheels(no_of_wheels);

        }
    }
}
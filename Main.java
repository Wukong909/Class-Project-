
import java.util.Scanner;

class Workout {
    String type;
    int duration;

    public void showWorkout() {
        System.out.println("Workout Type: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class RunningWorkout extends Workout {
    double distance;

    public void showDetails() {
        super.showWorkout();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Calories Burned: " + (distance * 60));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RunningWorkout workout = new RunningWorkout();

        System.out.print("Push ups: ");
        workout.type = input.nextLine();

        System.out.print("25 minutes : ");
        workout.duration = input.nextInt();

        System.out.print("60 kms: ");
        workout.distance = input.nextDouble();

        workout.showDetails();

        input.close();
    }
}

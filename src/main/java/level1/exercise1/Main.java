package level1.exercise1;

public class Main {

    public static void main(String[] args) {

        Worker onlineWorker = new OnlineWorker(
                "Arnau",
                "Casals",
                20
        );

        Worker onsiteWorker = new OnsiteWorker(
                "Paco",
                "Ramirez",
                30
        );

        System.out.println(onlineWorker.getName() + " salary: "
                + onlineWorker.calculateSalary(160));

        System.out.println(onsiteWorker.getName() + " salary: "
                + onsiteWorker.calculateSalary(160));

    }
}
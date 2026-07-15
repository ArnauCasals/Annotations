package level1.exercise2;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        OnlineWorker onlineWorker = new OnlineWorker(
                "Arnau",
                "Casals",
                20
        );

        OnsiteWorker onsiteWorker = new OnsiteWorker(
                "Paco",
                "Ramirez",
                30
        );

        System.out.println("=== Salaries ===");
        System.out.println(onlineWorker.getName() + " salary: " + onlineWorker.calculateSalary(160));
        System.out.println(onsiteWorker.getName() + " salary: " + onsiteWorker.calculateSalary(160));

        System.out.println("\n=== Deprecated methods ===");
        onlineWorker.oldInternetConnection();
        onsiteWorker.oldFuelSystem();
    }
}
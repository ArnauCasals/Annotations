package level1.exercise1;

public class OnsiteWorker extends Worker {

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }
    private static double gasoline = 100;

    @Override
    public double calculateSalary(int workedHours) {
        return workedHours * getHourlyRate() + gasoline;
    }

}

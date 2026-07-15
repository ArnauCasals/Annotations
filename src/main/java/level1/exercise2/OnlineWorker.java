package level1.exercise2;

public class OnlineWorker extends Worker {

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    private static final double INTERNET_FLAT_RATE = 40;

    @Override
    public double calculateSalary(int workedHours) {
        return workedHours * getHourlyRate() + INTERNET_FLAT_RATE;
    }
    @Deprecated
    public void oldInternetConnection() {
        System.out.println("Using the old internet connection.");
    }
}


package level1.exercise1;

public class Worker {

    private final String name;
    private final String surname;
    private final double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateSalary(int workedHours) {
        return workedHours * hourlyRate;
    }
}
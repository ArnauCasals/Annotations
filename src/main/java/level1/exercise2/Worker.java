package level1.exercise2;

public class Worker {

    private String name;
    private String surname;
    private double hourlyRate;

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
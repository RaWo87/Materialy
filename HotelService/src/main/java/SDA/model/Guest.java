package SDA.model;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String lastName;
    private LocalDate birthDate;

    public Guest(String name, String lastName, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name; }

    public String getLastName() {
        return lastName; }

    public LocalDate getBirthDate() {
        return birthDate; }
}

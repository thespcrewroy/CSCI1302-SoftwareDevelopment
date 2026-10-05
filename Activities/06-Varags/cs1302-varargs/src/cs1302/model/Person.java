package cs1302.model;

/**
 * Represents a person with a name and salary.
 */
public class Person {

    private final String name;
    private final double salary;

    /**
     * Construct a {@code Person} object with the specified
     * {@code name} and {@code salary}.
     *
     * @param name The name of the person.
     * @param salary The yearly salary of the person.
     */
    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    } // Person

    /**
     * Returns this person's name.
     *
     * @return This person's name.
     */
    public String getName() {
        return this.name;
    } // getName

    /**
     * Returns this person's yearly salary.
     *
     * @return This person's yearly salary.
     */
    public double getSalary() {
        return this.salary;
    } // getSalary

} // Person

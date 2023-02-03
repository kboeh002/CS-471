
public class Kitten {
    private String name;
    private Person owner;
    private int age;

    public Kitten(String newName, Person newOwner) {
        name = newName;
        owner = new Person(newOwner.getName());
        age = 0;
    }

    // mutator and accessor for name and owner
    public String getName() {
        return name;
    }

    public Person getOwner() {
        return owner;
    }
    // kitten name mutator should be "<name> the Feline."

    public void setName(String n) {
        name = n + "the Feline.";
    }

    public void setOwner(Person own) {
        owner = new Person(own.getName());
    }

    // only accessor for the age
    public int getAge() {
        return age;
    }

    // void haveBirthday() --> age++;
    public void haveBirthday() {
        age++;
    }

    // toString() returns "<name> is <age> and belongs to <owner name>"
    public String toString() {
        return name + " is " + age + " and belongs to " + owner.getName();
    }
}

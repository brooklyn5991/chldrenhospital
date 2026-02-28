public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;


    // Make sure this constructor matches: new Person("Ethan", 1, 110, 7);
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public void increaseWeight() {
        this.weight++;
    }


}
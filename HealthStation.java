public class HealthStation {

    int count = 0;

    public HealthStation() {
    }

    public int weigh(Person person) {
        count++;
        return person.getWeight();
    }

    public int height(Person person) {
        return person.getHeight();
    }

    public void feed(Person person) {
        person.increaseWeight();
    }

    public int weighings() {
        return count;
    }
}
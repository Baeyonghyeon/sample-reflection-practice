public class Duck extends Animal{
    private final String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void nextYear(){
        this.age++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

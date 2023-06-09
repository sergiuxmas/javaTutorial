package wrapper;

public class Person {
    private String name;
    private int age;
    private Integer carCount;

    public Person(String name) {
        this.name = name;
    }

    /*
    external library as database, API
     */
    public Integer getCarsFromSource(String carName){
        if (carName.equals("Toyota")){
            return 1;
        }
        return null;
    }

    /*
    service
     */
    public void readCarCount(String carName) {
        carCount = getCarsFromSource(carName);
    }

    public Person(int carCount) {
        this.carCount = carCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getCarCount() {
        return carCount;
    }
}

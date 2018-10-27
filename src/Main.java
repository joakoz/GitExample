public class Main {

    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio");

        System.out.println(reksio.getNumberOfLegs());
       reksio.setNumberOfLegs(3);
        System.out.println(reksio.numberOfLegs);
        reksio.bark();
        Dog.sayHau();


        }
}

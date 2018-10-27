public class Dog {
    String name;
    private int numberOfLegs;

    public Dog(){
        this.numberOfLegs = 4;
    }

    public Dog(String name) {
        this();
        this.name = name;


    }

    public void bark() {
        System.out.println("hua hua");
    }

    public int getNumberOfLegs(){
    return numberOfLegs;}

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static  void sayHau (){
        System.out.println("Hou");
    }
}


    //funkcja publiczna, void oznacza puste
    // tutaj tworzymy schemat bez konkretnego obiektu
    // this oznacza konkretny obiekt
    // publik to konstruktor - czyli wrzucanie wartości do obiektu nowego
   // this(); - wywołuje też inny konstruktor

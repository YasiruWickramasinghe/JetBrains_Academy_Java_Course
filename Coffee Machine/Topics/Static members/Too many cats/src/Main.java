class Cat{
    String name;
    int age;
    static int counter;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter+=1;
        if (counter > 5) {System.out.println("You have too many cats");}
    }
    public static int getNumberOfCats() {
        return counter;
    }
}
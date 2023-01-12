class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        if (name == null) {
            System.out.println("there are null exeption");
        } else {
            System.out.println(name.length());
        }
    }
}
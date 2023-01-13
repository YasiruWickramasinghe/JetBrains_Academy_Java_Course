public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        for (Secret status : Secret.values()) {
            String name = status.name();

            if (name.startsWith("STAR")){
                counter += 1;
            }
        }


        System.out.println(counter);
    }

}

// sample enum for inspiration
enum Secret {
    STAR, CRASH, START
}

/*class UnexpectedResults {
    public static void main(String[] args) {
        System.out.println("main() started");
        count(1, 10);
        System.out.println("main() complete");
    }

    public static void count(int start, int to) {
        System.out.println("count() started");
        while (start < to) {
            System.out.println(start);
            start++;
        }
        System.out.println("count() complete");
    }
}*/

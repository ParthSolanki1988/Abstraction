public class Main {
    public static void main(String[] args) {
        Sports sports = new Badminton();
        sports.play();

        System.out.println("\n");

        Sports sports1 = new Cricket();
        sports1.play();

        System.out.println("\n");

        Sports sports2 = new Football();
        sports2.play();
    }
}
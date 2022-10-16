public class Task {
    public static void main(String[] args) {
        boolean hasFriend = false;
        int time = 18;
        int lastTimeMovie = 20;
        int money = 200;
        int ticketPrice = 100;

        if(time >= 8 && time <= 23){
            System.out.println("Time to walk");
            if(hasFriend){
                System.out.println("With friend");
            } else {
                System.out.println("Alone");
                if(time <= lastTimeMovie && ticketPrice <= money){
                    System.out.println("To the cinema");
                } else {
                    System.out.println("Walk around");
                }
            }
        } else {
            System.out.println("You fall asleep");
        }
    }
}
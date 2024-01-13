public class DogWalker {

    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        System.out.println("(" + x + "," + y + ")");

        for(int i = 0; i < input; i++){

            // Table of Contents
            // 0 = North +1
            // 1 = South -1
            // 2 = East +1
            // 3 = West -1

            int random = (int)(Math.random() * 4);
            switch (random){
                case 0:
                x++;
                break;

                case 1:
                x--;
                break;

                case 2:
                y++;
                break;

                case 3:
                y--;
                break;
            }
            System.out.println("(" + x + "," + y + ")");
        }
        
        double x2 = x * x;
        double y2 = y * y;

        System.out.println("Squared distance = " + (x2 + y2));
    }
}

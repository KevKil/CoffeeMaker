package coffeeMachine.com;

import java.util.Scanner;

public class CoffeeNoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initial coffee machine has
        int water = 400;
        int milk = 540;
        int beans = 120;
        int dispCup = 9;
        int money = 550;
        String action;

        do {
            // Switch statement for selection of action
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1": // For expresso

                            int espWat = 250;
                            int espBeans = 16;
                            int espPrice = 4;

                            if (water < espWat) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < espBeans) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (dispCup == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                            }


                            water -= espWat; // to reduce water in machine
                            beans -= espBeans; // to reduce beans in machine
                            money += espPrice; // to add money in machine
                            dispCup--; // to reduce cups by one

                            break;

                        case "2": // For latte
                            int latWat = 350;
                            int latMilk = 75;
                            int latBeans = 20;
                            int latPrice = 7;

                            if (water < latWat) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < latBeans) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (milk < latMilk) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (dispCup == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                            }

                            water -= latWat; // reduce water
                            milk -= latMilk; // reduce milk
                            beans -= latBeans; // reduce beans
                            money += latPrice; // add money
                            dispCup--; // reduce cups

                            break;

                        case "3": // for cappuccino
                            int capWat = 200;
                            int capMilk = 100;
                            int capBeans = 12;
                            int capPrice = 6;


                            if (water < capWat) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < capBeans) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (milk < capMilk) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (dispCup == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            water -= capWat; // reduce water
                            milk -= capMilk; // reduce milk
                            beans -= capBeans; // reduce beans
                            money += capPrice; // add money
                            dispCup--; // reduce cups

                            break;

                        case "back": // back to first loop
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int addW = scanner.nextInt();
                    water += addW;
                    System.out.println("Write how many ml of milk you want to add:");
                    int addM = scanner.nextInt();
                    milk += addM;
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int addB = scanner.nextInt();
                    beans += addB;
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int addDC = scanner.nextInt();
                    dispCup += addDC;

                    break;
                case "take":
                    System.out.printf("I gave you %d", money);
                    money = 0;
                    break;

                case "remaining":
                    //Print statements for machine state
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water\n", water);
                    System.out.printf("%d ml of milk\n", milk);
                    System.out.printf("%d g of coffee beans\n", beans);
                    System.out.printf("%d disposable cups\n", dispCup);
                    System.out.printf("%d of money\n", money);
                    break;
                case "exit":
                    break;
            }
        } while (!"exit".equals(action));
    }

}

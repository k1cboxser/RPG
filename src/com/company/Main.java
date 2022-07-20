package com.company;

public class Main {
    public  static  String[] herousAttacType = {"Physical", "Magical", "Kinetik"};
    public static  int[] herousHealth = {270,288,260};
    public static  int[] herousDamage = {20,15,25};

    public static int bossHealth = 700;
    public static  int bossDamage = 50;
    public static String bossDefenceType = "";

    public  static  int roundNumbers = 0;

    public static void main(String[] args) {
        printStatistics();
        bossHilts();
        printStatistics();
        heroHilts();
        printStatistics();
        bossAttack();
        printStatistics();
        heroAttack();
        printStatistics();
        bossAttack2();
        printStatistics();
        heroAttack2();
        printStatistics();
        bossAttack3();
        printStatistics();
        heroAttack3();
        printStatistics();
        bossAttack4();
        printStatistics();
        heroAttack4();
        printStatistics();
        bossAttack5();
        printStatistics();

    }

    private static void bossHilts() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
           herousHealth[i] = herousHealth[i]- bossDamage;
        }
    }
    private static void heroHilts() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            bossHealth  = bossHealth - herousDamage[i];
        }
    }
    private static void bossAttack() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            herousHealth[i] = herousHealth[i]- bossDamage;
        }
    }
    private static void heroAttack() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            bossHealth  = bossHealth - herousDamage[i];
        }
    }
    private static void bossAttack2() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            herousHealth[i] = herousHealth[i]- bossDamage;
        }
    }
    private static void heroAttack2() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            bossHealth  = bossHealth - herousDamage[i];
        }
    }
    private static void bossAttack3() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            herousHealth[i] = herousHealth[i]- bossDamage;
        }
    }
    private static void heroAttack3() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            bossHealth  = bossHealth - herousDamage[i];
        }
    }
    private static void bossAttack4() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            herousHealth[i] = herousHealth[i]- bossDamage;
        }
    }
    private static void heroAttack4() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            bossHealth  = bossHealth - herousDamage[i];
        }
    }
    private static void bossAttack5() {
        roundNumbers++;
        for (int i = 0; i < herousHealth.length; i++) {
            herousHealth[i] = herousHealth[i]- bossDamage;
        }
    }




    private static void printStatistics() {
        System.out.println("************** ROUND " + roundNumbers + " ***************");
        System.out.println("Boss health: " +bossHealth +" [" + bossDamage +"] ");
        for (int i = 0; i < herousHealth.length; i++) {
            System.out.println("Hero " + herousAttacType[i] +
                    " health "+herousHealth[i] +
                    " [" +herousDamage[i] + "]" );

        }
    }


}

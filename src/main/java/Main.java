public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }


    public static void ex1() {

        String[] myArray = {"ala", "iwona", "agnieszka", "martyna"};
        String[] myArray2 = new String[myArray.length];


        for (int i = 0; i < myArray2.length; i++) {

            myArray2[i] = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
        }

        System.out.println(myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3]);
        System.out.println(myArray2[0] + " " + myArray2[1] + " " + myArray2[2] + " " + myArray2[3]);
        System.out.println("----------------------------------");
    }

    public static void ex2() {
        String[] myArray = {"ala", "iwona", "agnieszka", "martyna", "ALA"};
        String[] myArray2 = new String[myArray.length];
        String[] myArray3 = new String[myArray2.length];
        System.out.println(myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3] + " " + myArray[4]);

        for (int i = 0; i < myArray2.length; i++) {

            myArray2[i] = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
        }

        for (int i = 0; i < myArray3.length; i++) {

            myArray3[i] = myArray2[i].substring(0, 1) + myArray2[i].substring(1).toLowerCase();

        }
        System.out.println(myArray3[0] + " " + myArray3[1] + " " + myArray3[2] + " " + myArray3[3] + " " + myArray3[4]);
        System.out.println("----------------------------------");
    }

    public static void ex3() {
        // enter the myArray2.length
        String[] myArray2 = new String[0];

        if (myArray2.length == 0) {
            System.out.println(myArray2.length - 1);

        } else {
            System.out.println(myArray2.length);
        }
        System.out.println("----------------------------------");
    }

    public static void ex4() {

        String[] myArray1 = {"jan", "kowalski", "marian", "boczek"};
        System.out.println(myArray1[0] + " " + myArray1[1] + " " + myArray1[2] + " " + myArray1[3]);
        String[] myArray2 = new String[myArray1.length];
        String[] myArray3 = new String[myArray2.length / 2];

        for (int i = 0; i < myArray1.length; i++) {

            myArray2[i] = myArray1[i].substring(0, 1).toUpperCase() + myArray1[i].substring(1);

        }

        int j = 0;
        int l = 1;
        int n = 0;
        int m = 0;


        for (int i = 0; i < myArray3.length; i++) {

            myArray3[i] = myArray2[j + m] + " " + myArray2[l + m];
            m = n + 2;
        }
        System.out.println(myArray3[0] + ", " + myArray3[1]);
        System.out.println("----------------------------------");
    }

    public static void ex5() {

        String[] myArray1 = {"jan", "michal", "iwona", "aga", "ela", "marcin"};


        int men = 0;
        int women = 0;
        int index = 0;
        String lastLetter = null;


        for (int i = 0; i < myArray1.length; i++) {
            lastLetter = myArray1[i].substring(myArray1[i].length() - 1);


            if (lastLetter.equals("a")) {

                women++;

            } else {
                men++;

            }

        }
        System.out.println("male :" + men + "," + "female :" + women);
        System.out.println("----------------------------------");
    }

    public static void ex6() {

        User user1 = new User("Jan", 18);
        User user2 = new User("Michal", 23);
        User user3 = new User("Adam", 12);

        User[] userTable = new User[3];
        userTable[0] = user1;
        userTable[1] = user2;
        userTable[2] = user3;

        // System.out.println(userTable[0]);

        for (int i = 0; i < userTable.length; i++) {

            if (userTable[i].getAge() >= 18) {

                System.out.println( userTable[i]);
            }

        }

    }
}






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

        String[] myArray = {"ala", "iwona", "agnieszka", "martyna", "dupa", "roman", "giertych", "jaroslaw", "kaczynski"};
        String[] myArray2 = new String[myArray.length];

        for (int i = 0; i < myArray2.length; i++) {

            myArray2[i] = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
        }


        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + " ");
        }

        System.out.println("\n----------------------------------");
    }

    public static void ex2() {
        String[] myArray = {"ala", "iwona", "agnieszka", "martyna", "ALA", "LUKASZ", "ADAM", "malysz", "EustACHy"};
        String[] myArray2 = new String[myArray.length];
        String[] myArray3 = new String[myArray2.length];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        for (int i = 0; i < myArray2.length; i++) {

            myArray2[i] = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
            myArray3[i] = myArray2[i].substring(0, 1) + myArray2[i].substring(1).toLowerCase();
        }
        System.out.println("\n");

        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + " ");
        }
        System.out.println("\n----------------------------------");
    }

    public static void ex3() {

        String[] myArray2 = {};

        if (myArray2.length == 0) {
            System.out.println(myArray2.length - 1);

        } else {
            System.out.println(myArray2.length);
        }
        System.out.println("----------------------------------");
    }

    public static void ex4() {

        String[] myArray1 = {"jan", "kowalski", "marian", "boczek", "MARIAN", "kRZAKLEWSki", "jóZEF", "oLeksY"};

        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + " ");
        }
        System.out.println("\n");
        String[] myArray2 = new String[myArray1.length];
        String[] myArray3 = new String[myArray2.length];
        String[] myArray4 = new String[myArray2.length / 2];

        for (int i = 0; i < myArray1.length; i++) {

            myArray2[i] = myArray1[i].substring(0, 1).toUpperCase() + myArray1[i].substring(1);
            myArray3[i] = myArray2[i].substring(0, 1) + myArray2[i].substring(1).toLowerCase();

        }

        for (int i = 0; i < myArray4.length; i++) {
            int j = 1;
            if (i % 2 == 0) {
                myArray4[i] = myArray3[i + i] + " " + myArray3[i + i + j];

            } else if (i % 2 != 0) {

                myArray4[i] = myArray3[i + i] + " " + myArray3[i + i + j];

            }
        }

        for (int i = 0; i < myArray4.length; i++) {
            System.out.print(myArray4[i] + ", ");
        }
        System.out.println("\n----------------------------------");
    }

    public static void ex5() {

        String[] myArray1 = {"jan", "michal", "iwona", "aga", "ela", "marcin", "ania", "roman", "katarzyna", "jola", "jarek"};


        int men = 0;
        int women = 0;
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

        User[] userTable = {new User("Janek", 18), new User("Michal", 23), new User("Adam", 12)};


        for (int i = 0; i < userTable.length; i++) {

            if (userTable[i].getAge() >= 18) {

                System.out.println(userTable[i]);
            }
        }
    }
}








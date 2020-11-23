public class Main {

    public static void main(String[] args) {
        //   ex1();
        //  ex2();
        //     ex3();
               ex4();
        //   ex5();
        //   ex6();
    }

    public static void ex1() {
        String[] names = {"ala", "iwona", "agnieszka", "martyna", "dupa", "roman", "giertych", "jaroslaw", "kaczynski"};
        String[] upperCaseNames = new String[names.length];
        for (int i = 0; i < upperCaseNames.length; i++) {
            upperCaseNames[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
        }
        printArrayInitial(names);
        printArrayFinal(upperCaseNames);
    }

    public static void ex2() {
        String[] names = {"ala", "iwona", "agnieszka", "martyna", "ALA", "LUKASZ", "ADAM", "malysz", "EustACHy"};
        String[] upperCaseNames = new String[names.length];
        String[] lowerCaseNames = new String[upperCaseNames.length];
        for (int i = 0; i < upperCaseNames.length; i++) {

            upperCaseNames[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
            lowerCaseNames[i] = upperCaseNames[i].substring(0, 1) + upperCaseNames[i].substring(1).toLowerCase();
        }
        printArrayInitial(names);
        printArrayFinal(lowerCaseNames);
    }

    public static void ex3() {
        String[] myArray = {};
        if (myArray.length == 0) {
            System.out.println(myArray.length - 1);
        } else {
            System.out.println(myArray.length);
        }
        printSeparator();
    }

    public static void ex4() {
        String[] firstNamelastNameSeparately = {"jan", "kowalski", "marian", "boczek", "MARIAN", "kRZAKLEWSki", "jóZEF", "oLeksY"};
        String[] upperCaseNames = new String[firstNamelastNameSeparately.length];
        String[] lowerCaseNames = new String[upperCaseNames.length];
        String[] firstNamelastNameCombined = new String[lowerCaseNames.length / 2];
        for (int i = 0; i < firstNamelastNameSeparately.length; i++) {
            upperCaseNames[i] = firstNamelastNameSeparately[i].substring(0, 1).toUpperCase() + firstNamelastNameSeparately[i].substring(1);
            lowerCaseNames[i] = upperCaseNames[i].substring(0, 1) + upperCaseNames[i].substring(1).toLowerCase();
        }
        int NEXT_FIELD_OFFSET = 1;
        for (int i = 0; i < firstNamelastNameCombined.length; i++) {
            firstNamelastNameCombined[i] = lowerCaseNames[i + i] + " " + lowerCaseNames[i + i + NEXT_FIELD_OFFSET];
        }
        printArrayInitial(firstNamelastNameSeparately);
        printArrayFinal(firstNamelastNameCombined);
    }

    public static void ex5() {
        String[] names = {"jan", "michal", "iwona", "aga", "ela", "marcin", "ania", "roman", "katarzyna", "jola", "jarek"};
        int men = 0;
        int women = 0;
        String lastLetter = null;
        for (int i = 0; i < names.length; i++) {
            lastLetter = names[i].substring(names[i].length() - 1);
            if (lastLetter.equals("a")) {
                women++;
            } else {
                men++;
            }
        }
        System.out.println("male :" + men + "," + "female :" + women);
        printSeparator();
    }

    public static void ex6() {
        User[] userTable = {new User("Janek", 18), new User("Michal", 23), new User("Adam", 12)};
        for (int i = 0; i < userTable.length; i++) {
            if (userTable[i].getAge() >= 18) {
                System.out.println(userTable[i]);
            }
        }
    }

    public static void printArrayFinal(String[] print) {
        System.out.println("\n");
        for (int i = 0; i < print.length; i++) {
            System.out.print(print[i] + " ");
        }
        System.out.println("\n----------------------------------");
    }

    public static void printSeparator() {
        System.out.println(("----------------------------------"));
    }

    public static void printArrayInitial(String[] initialTable) {
        for (int i = 0; i < initialTable.length; i++) {
            System.out.print(initialTable[i] + " ");
        }
    }
}






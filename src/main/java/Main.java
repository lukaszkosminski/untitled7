public class Main {

    public static void main(String[] args) {

        String[] myArray = {"ala", "iwona", "agnieszka", "martyna"};
        String[] myArray2 = new String[myArray.length];


        for (int i = 0; i < myArray2.length; i++) {

            myArray2[i] = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
        }

        System.out.println(myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3]);
        System.out.println(myArray2[0] + " " + myArray2[1] + " " + myArray2[2] + " " + myArray2[3]);
    }
}








public class Main {

    public static void main(String[] args) {


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
    }
}








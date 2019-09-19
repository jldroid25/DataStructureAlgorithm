public class LabeledContinueStatement {

    public static void main(String[] args) {

        /*
        Labeled break continue is used when you want to
        continue labeled for loop rather than current loop.

        You have a two-dimensional matrix which contains only 0 and 1.
        You want to skip a row if row starts with 1.

         */

        int[][] arr = {
                { 1, 0, 0 },
                { 0, 0, 0 },
                { 1, 1, 1 },
                { 0, 1, 1 }};

        //Label break
        outer: for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][0] == 1){
                    System.out.println("Skipping row: " + i + " as it started with 1\n");
                    continue outer;
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }
}

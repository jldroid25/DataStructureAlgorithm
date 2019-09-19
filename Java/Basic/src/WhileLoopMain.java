public class WhileLoopMain {

    public static void main(String[] args) {

        WhileLoopMain bse = new WhileLoopMain();

        int arr[] = {32, 45, 53, 65, 43, 23};

        System.out.println(bse.findElementInArr(arr, 53));
    }

    public String  findElementInArr(int arr[], int elementTobeFound){

        int i = 0;

        while (i < arr.length){

            if (arr[i] == elementTobeFound){
                System.out.println(elementTobeFound + " is present in the array");
                return  "PRESENT";
            }
            i++;
        }
        return "NOT PRESENT";
    }
}

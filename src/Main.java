public class Main {
    public static void main(String[] args){
    }

    public static void reverseMassive() {
        int arr[] = {1,2,3};
        int reverseMass = 0;
        for (int i = arr.length - 1; i > 0; i = i -1) {
            reverseMass = arr.length - 1;
            arr[i] = reverseMass;

        }
        System.out.println(arr);


    }
}
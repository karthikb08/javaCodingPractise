public class removeDuplicateArray {
    public static void main(String[] args) {

        int[] arr = {2,2,3,3,4,6,6};
        int rd = removeDuplicateArrayMethod(arr);
        for(int i=0;i<rd;i++){
            System.out.println(arr[i]);
        }
    }
    public static int removeDuplicateArrayMethod(int[] arr){
        int rd=0;
        arr[rd] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
            }
        }
        return  rd+1;
    }
}

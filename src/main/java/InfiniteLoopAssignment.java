public class InfiniteLoopAssignment {
    public static void main(String[] args) {
        for(int i =0; i>=0;i++){
            System.out.println(i);
        }


        int num=0;
        while(num>=0){
            num++;
            System.out.println(num);
        }

        for(int k =0; k<=0; k--){
            System.out.println(k);
        }
    }


}

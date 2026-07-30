// public class SolidRhombus {
//     public static void main(String[] args) {
//         int k=4;
//         int f=9;
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=9;j++){
//                 if((i==i && j>k && j<f)){
//                     System.out.print("*");

//                 }else{
//                     System.out.print(" ");
//                 }

//             }

//             k--;
//             f--;
//             System.out.println();
//         }
//     }
// }

public class SolidRhombus {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1; j<=5;j++){
                System.err.print("*");
            }
            System.out.println();
        }
        
    }
}

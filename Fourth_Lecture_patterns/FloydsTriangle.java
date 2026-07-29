// public class FloydsTriangle {
//         public static void main(String args[]) {
        
//             for(int i=1;i<=15;i++){
//                 if(i==1 ||i==3 || i==6 ||i==10 || i==15){
//                     System.out.println(i+" ");
//                 }else{
//                     System.out.print(i+" ");
//                 }
//             }


//     }
// }


public class FloydsTriangle {
        public static void main(String args[]) {
            int numbers=1;
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){ 
                    System.out.print(numbers+" ");
                    numbers++;
                }
                System.out.println();
            }


    }
}



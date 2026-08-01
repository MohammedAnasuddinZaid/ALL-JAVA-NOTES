import java.util.Scanner;
public class SearchIn3DMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int searchh[][]= new int[a][b];

        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                searchh[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                if(searchh[i][j] == x){
                    System.out.print(i+j);
                }
                

            }
        }



    }
}

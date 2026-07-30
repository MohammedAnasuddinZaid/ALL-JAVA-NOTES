import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int fac=1;
        if(n<0){
            System.out.print("Invalid NUMBER");
            return;
        }
        for(int a=n ; a>=1 ; a-- ){
            
            fac=fac*a;
            
        }
        System.out.print(fac);

    }


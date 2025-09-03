package PRACTICE.PATTERN;


public class FIRST {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'a';
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++){
               System.out.print(ch + "  ");
            ch++;
            }
            System.out.println();
        }
    }

}


//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=(n-i+1);j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//}

//for (int i=1;i<=n;i++){
//        for (int j=1;j<=n;j++){
//        System.out.print("* ");
//            }
//                    System.out.println();


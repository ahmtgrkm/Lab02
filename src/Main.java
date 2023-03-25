import java.util.Scanner;

//try something

class Lab02_20190808046 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Lütfen ikinci dereceden denklemin a,b ve " +
                        "c katsayılarını giriniz");
                System.out.print("a=");
        double a= input.nextDouble();
        System.out.print("b=");
        double b= input.nextDouble();
        System.out.print("c=");
        double c= input.nextDouble();
   double diskriminant=(b*b)-(4*a*c);
                if (diskriminant<0) {
                    System.out.println("Denklemin gerçek kökü yoktur.");
                }
                if (diskriminant>0) {
                    double x1 = ((-1 * b) + Math.sqrt(diskriminant)) / (2 * a);
                    double x2 = ((-1 * b) - Math.sqrt(diskriminant)) / (2 * a);
                    System.out.println("Denklemin birinci kökü=" + x1);
                    System.out.println("Denklemin ikinci kökü=" + x2);
                }
                if (diskriminant== 0){
                    double x1 = -b /2*a ;
                            System.out.println("Denklemin birbirine eşit " +
                                    "iki kökü vardır .Bunlar ="+x1);
                }
    }
}

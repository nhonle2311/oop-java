import java.util.Scanner;

public class QuadraticEquation {
    double a, b , c;
    public QuadraticEquation(){

    }
    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return  (this.b * this.b) - 4 * (this.a * this.c);
    }
    public double getRoot1(){
        return -this.b + Math.sqrt(this.b * this.b - 4 * this.a*this.c) / 2 * this.a;
    }
    public double getRoot2(){
        return -this.b - Math.sqrt(this.b * this.b - 4 * this.a*this.c) / 2 * this.a;
    }
    public double getRoot12(){
        return -this.b / 2 * this.a;
    }
}

class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a");
        double a = scanner.nextDouble();
        System.out.println("b");
        double b = scanner.nextDouble();
        System.out.println("c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() >= 0){
            System.out.println("có hai nghiệm phân biệt \n" +"r1 = "+ quadraticEquation.getRoot1() + "\n r2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("có nghiệm kép r1 = r2 " + quadraticEquation.getRoot12() );
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
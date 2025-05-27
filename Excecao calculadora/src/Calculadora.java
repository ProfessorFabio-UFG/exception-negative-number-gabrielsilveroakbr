import java.util.Scanner;
public class Calculadora {
    private int a;
    private int b;
    Scanner sc = new Scanner(System.in);
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int soma(int a,int b){
        return a+b;
    }
    public int subtrair(int a,int b){
        return a-b;
    }
    public int multiplicar(int a, int b){
        return a*b;
    }
    public double dividir(int a, int b) {
        try{
            if(b == 0){
                throw new DividirporzeroException("Não podel dividir por zero");
            }
            return (double) a/b;
            }catch (DividirporzeroException e){
            System.out.println("Tente outro valor:");
            b = sc.nextInt();
            sc.nextLine();
        }catch (Exception e){
            System.out.println("Erro inesperado");
            sc.nextLine();
        }
        return (double) a/b;
    }
    public double raiz_quadrada(int a){
        try{
            if(a < 0){
                throw new RaizdeNumeronegativoException("Não existe raíz real");
            }
            return (double) Math.sqrt(a);
        } catch (RaizdeNumeronegativoException e) {
            System.out.println("Não existe raíz real de número negativo");
            System.out.println("Tente outro valor");
            a = sc.nextInt();
            sc.nextLine();
        }
        return (double) Math.sqrt(a);
    }
}

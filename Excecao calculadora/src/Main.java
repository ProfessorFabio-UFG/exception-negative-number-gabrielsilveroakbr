import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int resposta;
        Scanner sc = new Scanner(System.in);
        Calculadora calculo = new Calculadora(a,b);
        boolean respostaValida = false;
        while(!respostaValida){
            try{
                System.out.println("-----------O que quer calcular?----------------");
                System.out.println("-------------Opções-----------\n 1. Soma.\n 2. Subtração.\n 3. Multiplicação.\n 4. Divisão.\n 5. Raíz quadrada");
                sc.nextLine();
                resposta = sc.nextInt();
                if (1 > resposta || resposta >4 && resposta != 5){
                    throw new RespostainvalidaException("Resposta inválida resposta deve ser entre 1 e 5");
                } else if (resposta == 5) {
                    respostaValida = true;
                    System.out.println("Valor para raíz: ");
                    a = sc.nextInt();
                    sc.nextLine();
                    System.out.println(calculo.raiz_quadrada(a));
                }else{
                respostaValida = true;
                System.out.println("Primeiro valor: ");
                a = sc.nextInt();
                sc.nextLine();
                System.out.println("Segundo valor: ");
                b = sc.nextInt();
                sc.nextLine();
                if (resposta == 1) {
                    System.out.println(calculo.soma(a,b));
                } else if (resposta == 2) {
                    System.out.println(calculo.subtrair(a,b));
                } else if (resposta == 3){
                    System.out.println(calculo.multiplicar(a,b));
                } else if (resposta == 4) {
                    System.out.println(calculo.dividir(a,b));
                }
                }
            } catch (RespostainvalidaException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println("Ocorreu um erro inesperado morra de bom grado");
            }
        }
        }
    }






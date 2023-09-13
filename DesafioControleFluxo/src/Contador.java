import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
        scan.close();
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++)  {
            System.out.println("Imprimindo o número: " + i);
        }    
	}
}

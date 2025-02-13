public class Operadores {
    public static void main(String[] args ) {
        
        int numero = 5;

        numero ++;

        System.out.println(numero);

        int a, b;
        a = 5;
        b = 5;

        String resultado = a==b ? "Verdadeiro" : "falso";

        System.out.println(resultado);
        
        if(a > b){
            System.out.println("Primeiro numero maior que o segundo");
        } 
        
        else if (b > a) {
            System.out.println("Segundo numero maior que o primeiro");
        }
        else {
            System.out.println("OS DOIS SÃO IGUAIS");
        }

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 || condicao2){
System.out.println("UMA DAS CONDIÇÕES É VERDADEIRA");
        }

        if (condicao1 && condicao2) {
            System.out.println("AS DUAS SÃO VERDADEIRAS");

        }

    }
}
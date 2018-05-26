public class ExerciciosCap02 {
    public static void main(String[] args) {
        Exercicio04();
        Exercicio05();
        Exercicio06();
        Exercicio07();
        Exercicio08();

        Exercicio09();
        Exercicio10();
        Exercicio11();
    }
    public static void Exercicio04() {
        for (int i = 1; i <= 04; i++) {
            for (int j = 1; j <= 04; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Exercicio05() {
        for (int i = 1; i <= 07; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Exercicio06() {
        for (int i = 1; i <= 05; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Exercicio07() {
        for (int i = 1; i <= 05; i++) {
            for (int espacos = 5; espacos >= i; espacos--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

    public static void Exercicio08() {
        for (int i = 1; i <= 05; i++) {
            for (int espacos = 5; espacos >= i; espacos--) {
                System.out.print(" ");
            }
            for (int numeros = 1; numeros <= (5 - (5-i)); numeros++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    //inicio do exercicio 0209
    public static void Exercicio09() {
        exer09Linha();
        exer09Caracteres();
        exer09Numeros();
        exer09Linha();
    }
    public static void exer09Linha(){
        for (int i = 1; i <=40; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void exer09Caracteres() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("_-^-");
        }
        System.out.println();
    }
    public static void exer09Numeros(){
        for (int numeros = 1; numeros <= 2; numeros++) {
            for (int i = 1; i<=9; i++) {
                System.out.print(i+""+i);
            }
            System.out.print("00");
        }
        System.out.println();
    }
    //fim do exercicio 0209

    // inicio do Exercicio 0210
    public static void Exercicio10() {
        exer10Barras();
        exer10Numeros();
    }
    public static void exer10Barras() {
        for (int i = 1; i <= 06; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }
    public static void exer10Numeros() {
        for (int i = 1; i <= 06; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
        System.out.println();
    }
    //fim do exercicio 10

    // inicio do Exercicio 0211
    public static final int NUM_INTERVALO = 9;
    public static final int NUM_REPETICOES = 5;
    public static void Exercicio11() {
        exer11Barras();
        exer11Numeros();
    }
    public static void exer11Barras() {
        for (int i = 1; i <= NUM_REPETICOES; i++) {
            for (int j = 1; j <= NUM_INTERVALO; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }
    public static void exer11Numeros() {
        for (int i = 1; i <= NUM_REPETICOES; i++) {
            for (int j = 1; j <= NUM_INTERVALO; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
        System.out.println();
    }
    //fim do exercicio 11
}


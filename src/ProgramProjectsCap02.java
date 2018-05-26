public class ProgramProjectsCap02 {
    public static void main(String[] args){
        //lateralEsquerda();
        //meio();
        //lateralDireita();
        //programa1();
        programa2();
    }

    public static void programa1() {
        for (int i = 6; i >= 1; i--) {
            //Asteriscos a esquerda
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            //espaços a Esquerda
            for (int espacos = 6; espacos >= i; espacos--) {
                System.out.print(" ");
            }
            //barras a esquerda
            for (int j = 1; j <= i*2; j++) {
                System.out.print("/");
            }
            System.out.print(" ");
            //barras a direita
            for (int j = 12; j >= (i * 2) - 1; j--) {
                System.out.print("\\");
            }
            System.out.print(" ");
            //espaços a direita
            for (int espacos = 6; espacos >= i; espacos--) {
                System.out.print(" ");
            }
            //Asteriscos a direita
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //inicio do programa 02
    public static void programa2() {
        linha();
        acento();
        acento();
        linha();
        letra();
        letra();
        linha();
    }

    public static void linha(){
        System.out.print("+");
        for (int i = 1; i <= 6; i++ ){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void acento(){
        System.out.println("|  ^^  |");
        System.out.println("| ^  ^ |");
        System.out.println("|^    ^|");
    }

    public static void letra(){
        System.out.println("|v    v|");
        System.out.println("| v  v |");
        System.out.println("|  vv  |");
    }
    //fim do programa 2
}


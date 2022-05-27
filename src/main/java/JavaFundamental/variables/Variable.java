package JavaFundamental.variables;

public class Variable {
    public static void main(String[] args) {
        int i;
        //int i; error already declared
        int I;
        //int 1a; error variable with number as initial character
        int _1a;
        int $aq;

        final int j = 5;

        int asnr24678md;
        //int asnr246 78md;

        int asnr2$4678_md = 10;
        //int asnr2$46%78_md = 10;  error % invalid character

        i = 1;
        I = 2;
        _1a = 3;
        $aq = 4;
        //j = 6; error j is final
        asnr24678md = 7;

        int quantidadeDeProdutos = 11;
        //int QuantidadeDeProdutos = 12;
        final int NUMERO_TENTATIVAS = 13;
        //final int numeroTentativas = 14;

        int qdtProd;

        System.out.println(i);



    }
}

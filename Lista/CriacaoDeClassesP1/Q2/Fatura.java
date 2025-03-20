package Lista.Q2;

public class Fatura {
    String desc, id;
    int quantidade;
    float preco;

    void inicializaFatura(String d, String i, int q, float p){
        desc = d;
        id = i;
        quantidade = q;
        preco = p;
    }

    int validacaoQuantidade(){
        if (quantidade < 0) {
            return quantidade = 0;
        } else{
            return (quantidade);
        }
    }

    float validacaoPreco(){
        if (preco < 0){
            return preco = 0;
        } else{
            return preco;
        }
    }

    float calculaTotal(){
        return quantidade * preco;
    }
}

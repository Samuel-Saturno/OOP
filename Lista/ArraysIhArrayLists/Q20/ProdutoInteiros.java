package Lista.ArraysArrayLists.Q20;

public class ProdutoInteiros {
    private int[] num;
    private int tamanho = 10, quant = 0;
    
    public ProdutoInteiros(){
        if (tamanho == quant) {
            tamanho = tamanho*2;
        }
        this.num = new int[tamanho];
    }

    public int produtos(int n){
        int prod;

        if (n > 0) {
            num[quant] = n;
            if (quant > 0) {
                prod = num[quant] * num[quant-1];
                return prod;
            }

            quant++;
            return prod = num[quant];
        } else {
            if (quant > 0) {
                prod = num[quant] * num[quant-1];
                return prod;
            }

            return prod = num[quant];
        }
    }
}

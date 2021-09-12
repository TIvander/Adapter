public class PagamentoAdapter extends Moeda{

    public float valorMoeda(Moeda moeda){
        if(moeda.tipo.equals("USD")){
            return 5.25f;
        } else if(moeda.tipo.equals("R$")){
          return 1.00f;
        } else {
            return 5.25f;
        }
    }
}

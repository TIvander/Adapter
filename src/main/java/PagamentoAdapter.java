public class PagamentoAdapter extends Moeda{

    public float valorMoeda(Moeda moeda){
        if(moeda.tipo.equals("USD") || moeda.tipo.equals("usd")){
            return 5.25f;
        } else if(moeda.tipo.equals("R$") || moeda.tipo.equals("r$")){
          return 1.00f;
        } else {
            return 0.0f;
        }
    }
}

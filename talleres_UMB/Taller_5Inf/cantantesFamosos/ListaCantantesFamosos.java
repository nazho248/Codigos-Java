package cantantesFamosos;
import java.util.ArrayList;

public class ListaCantantesFamosos {


    private ArrayList<CantanteFamoso> listacantantesFamosos;



    public ListaCantantesFamosos() {
        listacantantesFamosos = new ArrayList<>();
    }

    public ListaCantantesFamosos ordenarPorVentas() {
        ListaCantantesFamosos listaOrdenada = new ListaCantantesFamosos();
        for (int i = 0; i < listacantantesFamosos.size(); i++) {
            CantanteFamoso cantante = listacantantesFamosos.get(i);
            int j = 0;
            while (j < listaOrdenada.listacantantesFamosos.size() && cantante.getCantVentas() < listaOrdenada.listacantantesFamosos.get(j).getCantVentas()) {
                j++;
            }
            listaOrdenada.listacantantesFamosos.add(j, cantante);
        }
        return listaOrdenada;
    }

    public CantanteFamoso get (int i) {
        return listacantantesFamosos.get(i);
    }

    public void eliminarCantanteFamoso(int posicion) {
        listacantantesFamosos.remove(posicion);
    }

    public void agregarCantanteFamoso(CantanteFamoso cantanteFamoso) {
        listacantantesFamosos.add(cantanteFamoso);
    }

    @Override
    public String toString() {
        return "ListaCantantesFamosos \n -------------- \n" + listacantantesFamosos + "";
    }

}

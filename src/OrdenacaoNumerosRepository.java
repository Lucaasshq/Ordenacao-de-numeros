import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumerosRepository implements Comparable<Integer> {

        private final List<Integer> numeros;

        public OrdenacaoNumerosRepository() {
            numeros = new ArrayList<>();
        }

        public void adicionarNum(Integer num) {
            this.numeros.add(num);
        }


        public List<Integer> ordemAscendente() {
            Collections.sort(this.numeros);
            return this.numeros;
        }

        public List<Integer> ordemDescendente() {
            Collections.sort(this.numeros.reversed());
            return this.numeros;
        }

        @Override
        public int compareTo(Integer num) {
            return Integer.compare(this.numeros.get(0), num);
        }

    public static void main(String[] args) {

            OrdenacaoNumerosRepository repository = new OrdenacaoNumerosRepository();
            repository.adicionarNum(5);
            repository.adicionarNum(4);
            repository.adicionarNum(2);
            repository.adicionarNum(50);
            System.out.println("Ordem ascendente:" + repository.ordemAscendente());
            System.out.println("Ordem descendente:" + repository.ordemDescendente());
    }




}


package DesenvolviimentoJavaBasico.Datas;

import java.sql.Date;

public class ExercicoDate {
    public static void main(String[] args) {
        Date definida = new Date(1273892400000l);
        Date aniverssario = new Date(527828400000L);
        System.out.println(aniverssario);
        int compara = aniverssario.compareTo(definida);
        if (compara > 0) {
            System.out.println("Data é posterior a " + definida);
        } else if (compara < 0) {

            System.out.println("Data é anterior a " + definida);
        } else {
            System.out.println("Data é a mesma");
        }

    }
}

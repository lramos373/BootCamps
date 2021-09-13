package DesenvolviimentoJavaBasico.Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExercicioLocalDate {
    public static void main(String[] args) {

        LocalDateTime dia = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println(dia);
        dia= dia.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(dia);

    }
}

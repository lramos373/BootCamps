package DesenvolviimentoJavaBasico;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDateFormat {
    public static void main(String[] args) {


        Date dia = new Date();

        SimpleDateFormat formatar =new SimpleDateFormat( "DD/MM/YYYY " + "e a Hora é : "+ "HH:MM:SS: MMMM");

        String dataFormatada = formatar.format(dia);

        System.out.println(dataFormatada);
    }
}

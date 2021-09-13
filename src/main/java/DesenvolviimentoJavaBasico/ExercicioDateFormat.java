package DesenvolviimentoJavaBasico;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDateFormat {
    public static void main(String[] args) {


        Date dia = new Date();
// MEU JAVA DEU CONFLITO QUANDO UTILIZEI DD (dia no ano ) SS( MILISEGUNDOS)
        SimpleDateFormat formatar =new SimpleDateFormat( "dd/MM/yyyy " + "HH:mm:ss: MMMM");

        String dataFormatada = formatar.format(dia);

        System.out.println(dataFormatada);
    }
}

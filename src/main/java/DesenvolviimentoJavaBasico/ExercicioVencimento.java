package DesenvolviimentoJavaBasico;

import java.util.Calendar;

public class ExercicioVencimento {
    public static void main(String[] args) {
        Calendar vencimento = Calendar.getInstance();
        vencimento.set(2021,8,4);

        System.out.println("Data de vencimento é: "+ vencimento.getTime());

        vencimento.add(Calendar.DATE, 10);

        int dia = vencimento.get(Calendar.DAY_OF_WEEK);


        if( dia == 7 ) {
            vencimento.add(Calendar.DATE, 2);
            System.out.println("Sua data limite de pagamento é:"+ vencimento.getTime());

        }else if (dia ==1){
            vencimento.add(Calendar.DATE, 1);
            System.out.println("Sua data limite de pagamento é:"+ vencimento.getTime());
        }else {
            System.out.println("Sua data limite de pagamento é:"+ vencimento.getTime());
        }

    }
}

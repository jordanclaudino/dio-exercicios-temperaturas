import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioTemperatura {


    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        String jan = JOptionPane.showInputDialog("Escreva a média de Janeiro");
        list.add(Double.valueOf(jan));
        String fev = JOptionPane.showInputDialog("Escreva a média de Fevereiro");
        list.add(Double.valueOf(fev));
        String mar = JOptionPane.showInputDialog("Escreva a média de Março");
        list.add(Double.valueOf(mar));
        String abr = JOptionPane.showInputDialog("Escreva a média de Abril");
        list.add(Double.valueOf(abr));
        String mai = JOptionPane.showInputDialog("Escreva a média de Maio");
        list.add(Double.valueOf(mai));
        String jun = JOptionPane.showInputDialog("Escreva a média de Junho");
        list.add(Double.valueOf(jun));

        Iterator<Double> iterator = list.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / list.size();
        System.out.println("A média Semestral é: " + media);
        System.out.println("Temperaturas acima da média: ");

        if (Double.valueOf(jan) > media) {
            System.out.println("1 - Janeiro -> " + jan);
        }
        if (Double.valueOf(fev) > media) {
            System.out.println("2 - Fevereiro -> " + fev);
        }
        if (Double.valueOf(mar) > media) {
            System.out.println("3 - Março -> " + mar);
        }
        if (Double.valueOf(abr) > media) {
            System.out.println("4 - Abril -> " + abr);
        }
        if (Double.valueOf(mai) > media) {
            System.out.println("5 - Maio -> " + mai);
        }
        if (Double.valueOf(jun) > media) {
            System.out.println("6 - Junho -> " + jun);
        }


    }
}


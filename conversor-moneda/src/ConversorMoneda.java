import javax.swing.JOptionPane;

public class ConversorMoneda {

	public static void main(String[] args) {
		Function f = new Function();

		while (true) {

			String opcion = (JOptionPane.showInputDialog(null, "Escoja una opción ", "Menu", JOptionPane.PLAIN_MESSAGE,
					null, new Object[] { "Conversor de moneda", "Conversor de Temperatura" }, "Escoja")).toString();

			if (opcion == "Conversor de moneda") {
				String input = JOptionPane.showInputDialog("Escriba un valor: ");
				if (f.check(input) == true) {
					double Minput = Double.parseDouble(input);
					f.Convertir(Minput);

					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if ((respuesta == 0) && (f.check(input) == true)) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						break;
					}

				} else {

					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
			} else if (opcion == "Conversor de Temperatura") {
				String input = JOptionPane.showInputDialog("Inserta un valor de temperatura para convertir");
				if (f.check(input) == true) {
					double Minput = Double.parseDouble(input);
					f.ConvertirTemperatura(Minput);

					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if ((respuesta == 0) && (f.check(input) == true)) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						break;

					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
			}
		}
	}

}

import javax.swing.JOptionPane;

public class Function {

	public void Convertir(Double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Escoja la moneda que usted desea convertir a su divisa",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Reales a Dólares", "De Reales a Euros", "De Reales a Libras",
						"De Reales a Peso Argentino", "De Reales a Peso Chileno", "De Dólares a Reales",
						"De Euros a Reales", "De Libras Esterlinas a Reales", "De Peso Argentino a Reales",
						"De Peso Chileno a Reales" },
				"Escoja")).toString();
		if (opcion == "De Reales a Dólares") {
			double monedaDolar = Minput / 5.13;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Usted tiene $ " + monedaDolar + "Dólares");
		} else if (opcion == "De Reales a Euros") {
			double monedaEuro = Minput / 10.85;
			monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Usted tiene $ " + monedaEuro + "Euros");
		} else if (opcion == "De Reales a Libras Esterlinas") {
			double monedaLibra = Minput / 6.33;
			monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaLibra + " Libras Esterlinas");
		} else if (opcion == "De Reales a Peso Argentino") {
			double monedaPesoArg = Minput / 0.039;
			monedaPesoArg = (double) Math.round(monedaPesoArg * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaPesoArg + " Pesos Argentinos");
		} else if (opcion == "De reales a Peso Chileno") {
			double monedaPesoChln = Minput / 0.0040;
			monedaPesoChln = (double) Math.round(monedaPesoChln * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaPesoChln + " Pesos Chilenos");
		} else if (opcion == "De Dólares a Reales") {
			double monedaDolar = Minput * 5.13;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaDolar + " Reales");
		} else if (opcion == "De Euros a Reales") {
			double MonedaEuro = Minput * 10.85;
			MonedaEuro = (double) Math.round(MonedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $" + MonedaEuro + " Reales");
		} else if (opcion == "De Libras Esterlinas a Reales") {
			double monedaLibra = Minput * 6.33;
			monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaLibra + " Reales");
		} else if (opcion == "De Peso Argentino a Reales") {
			double monedaPesoArg = Minput * 29.68;
			monedaPesoArg = (double) Math.round(monedaPesoArg * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaPesoArg + " Reales");
		} else if (opcion == "De Peso Chileno a Reales") {
			double monedaPesoChln = Minput * 3.04;
			monedaPesoChln = (double) Math.round(monedaPesoChln * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Usted tiene $ " + monedaPesoChln + " Reales");
		}

	}

	public void ConvertirTemperatura(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Grados Celsius a Grados Farenheit", "Grados Celsius a Kelvin",
						"Grados Farenheit a Grados Celsius", "Kelvin a Grados Celsius", "Kelvin a Gradsos Farenheit" },
				"Selección")).toString();

		if (opcion == "Grados Celsius a Grados Farenheit") {
			double farenheit = Minput * 1.8 + 32;
			farenheit = (double) Math.round(farenheit * 100d) / 100;
			JOptionPane.showMessageDialog(null, +Minput + " Grados Celsius son " + farenheit + " Grados Farenheit ");
		} else if (opcion == "Grados Celsius a Kelvin") {
			double kelvin = Minput + 273.15;
			kelvin = (double) Math.round((kelvin) * 100d) / 100;
			JOptionPane.showMessageDialog(null, +Minput + " Grados Celsius son " + kelvin + " Kelvin");
		} else if (opcion == "Grados Farenheit a Grados Celsius") {
			double celsius = (Minput - 32) / 1.8;
			celsius = (double) Math.round(celsius * 100d) / 100;
			JOptionPane.showMessageDialog(null, +Minput + " Grados Farenheit son " + celsius + " Celsius.");
		} else if (opcion == "Kelvin a Grados Celsius") {
			double kelvinCelsius = Minput - 273.15;
			kelvinCelsius = (double) Math.round(kelvinCelsius * 100d) / 100;
			JOptionPane.showMessageDialog(null, +Minput + " Kelvin son " + kelvinCelsius + " Celsius");
		} else if (opcion == "Kelvin a Grados Farenheit") {
			double kelvinFarenheit = (Minput - 273.15) * 9 / 5 + 32;
			kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
			JOptionPane.showMessageDialog(null, " Kelvin son " + kelvinFarenheit + " Farenheit");
		}
	}

	public boolean check(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}

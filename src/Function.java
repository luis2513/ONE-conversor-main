import javax.swing.*;

public class Function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
    public void ConvertirMonedas( double valorRecibido) {
        String opcion = (JOptionPane.showInputDialog(null, "Elige una moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar",
                        "De Pesos a Euro",
                        "De Pesos a Libra Esterlinas",
                        "De Pesos a Yen",
                        "De Pesos a Won",
                        "De Dolar a Pesos",
                        "De Euros a Pesos",
                        "De Libra esterlinas a Pesos",
                        "De Yen a Pesos",
                        "De Won a Pesos"},
                "Seleccion")).toString();

        switch (opcion) {
            case "De Pesos a Dolar":
                monedas.ConvertirPesosColombianosADolar(valorRecibido);
                break;
            case "De Pesos a Euro":
                monedas.ConvertirPesosColombianosAEuro(valorRecibido);
                break;

            case "De Pesos a Libra Esterlinas":
                monedas.ConvertirPesosColombianosALibrasEsterlinas(valorRecibido);
                break;
            case "De Pesos a Yen":
                monedas.ConvertirPesosColombianosAYen(valorRecibido);
                break;
            case "De Pesos a Won":
                monedas.ConvertirPesoscolombianosAWon(valorRecibido);
                break;
            case "De Dolar a Pesos":
                monedas.ConvertirDolarAPesoscolombianos(valorRecibido);
                break;
            case "De Euros a Pesos":
                monedas.ConvertirEuroAPesoscolombianos(valorRecibido);
                break;
            case "De Libra esterlinas a Pesos":
                monedas.ConvertirLibrasEsterlinasAPesoscolombianos(valorRecibido);
                break;
            case "De Yen a Pesos":
                monedas.ConvertirYenAPesoscolombianos(valorRecibido);
                break;
            case "De Won a Pesos":
                monedas.ConvertirWonAPesoscolombianos(valorRecibido);
                break;


        }
    }

    public void ConvertirTemperaturas( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una temperatura a convertir",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Celsius a Fahrenheit":
                temperaturas.ConvertirCelsiusAFahrenheith(valorRecibido);
                break;
            case "De Fahrenheit a Celsius":
                temperaturas.ConvertirFahrenheithACelsius(valorRecibido);
                break;

        }


    }
}

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    public void ConvertirPesosColombianosADolar(double valorRecibido){
        double monedaDolar = valorRecibido / 4700.0;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }

    public void ConvertirPesosColombianosAEuro(double valorRecibido){
        double monedaEuro = valorRecibido / 5025.0;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }

    public void ConvertirDolarAPesoscolombianos(double valorRecibido){
        double monedaPesos = valorRecibido / 0.000212;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }

    public void ConvertirEuroAPesoscolombianos(double valorRecibido){
        double monedaPesos = valorRecibido / 0.00019;
        monedaPesos = (double) Math.round(100d * monedaPesos)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }

    public void ConvertirPesosColombianosALibrasEsterlinas(double valorRecibido){
        double monedaEsterlinas = valorRecibido / 5660.3138;
        monedaEsterlinas = (double) Math.round(monedaEsterlinas * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEsterlinas + " libras");
    }

    public void ConvertirPesosColombianosAYen(double valorRecibido){
        double monedaYen = valorRecibido / 0.029;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
    }

    public void ConvertirLibrasEsterlinasAPesoscolombianos(double valorRecibido){
        double monedaPesos = valorRecibido / 0.00018;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }

    public void ConvertirYenAPesoscolombianos(double valorRecibido){
        double monedaPesos = valorRecibido / 34.57;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }

    public void ConvertirWonAPesoscolombianos(double valorRecibido){
        double monedaWon = valorRecibido / 0.2762;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " wones");
    }

    public void ConvertirPesoscolombianosAWon(double valorRecibido){
        double monedaPesos = valorRecibido / 3.62;
        monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesos + " Pesos");
    }

}

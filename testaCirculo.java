public class TestaCirculo {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();

        circulo1.raio = 5.0;
        circulo2.raio = 3.0;

        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        circulo2.calcularArea();
        circulo2.calcularPerimetro();
    }
}
public class Circulo {
    
    double raio;

    void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }

    void calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
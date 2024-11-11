public class testeFiguras {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(4.0);
        FiguraGeometrica retangulo = new Retangulo(3.0, 5.0);
        FiguraGeometrica circulo = new Circulo(2.5);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
    }
}

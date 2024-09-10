public class testaCachorro {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Cachorro cachorro3 = new Cachorro();

        cachorro1.raca = "Pastor Alemão";
        cachorro1.tamanho = 60; 
        cachorro1.cor = "Preto e Marrom";
        cachorro1.tem_rabo = true;

        cachorro2.raca = "Poodle";
        cachorro2.tamanho = 30;
        cachorro2.cor = "Branco";
        cachorro2.tem_rabo = false; 

        cachorro3.raca = "Vira-lata";
        cachorro3.tamanho = 45;
        cachorro3.cor = "Caramelo";
        cachorro3.tem_rabo = true;

        cachorro1.late();
        cachorro2.late();
        cachorro3.late();
    }
}
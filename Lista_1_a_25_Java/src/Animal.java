public interface Animal {
    // 20 - Crie uma interface Animal com métodos como fazerSom() e mover(). Implemente essa interface em classes como Cachorro e Gato.
    public void fazerSom();
    public void mover();
}
class Cachorro implements Animal{

    @Override
    public void fazerSom() {
        System.out.println("Woof!!!");
    }

    @Override
    public void mover() {
        System.out.println("Andou para frente !");
    }
}

class Gato implements Animal{

    @Override
    public void fazerSom() {
        System.out.println("Miau!!!");
    }

    @Override
    public void mover() {
        System.out.println("Andou para frente !");
    }
}

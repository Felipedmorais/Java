public class number2 {
    private number1 motor;

    public number2(number1 motor) {
        this.motor = motor;
    }

    public void ligarCarro(){
        motor.ligar();
        System.out.println("Carro Ligado!");
    }

}

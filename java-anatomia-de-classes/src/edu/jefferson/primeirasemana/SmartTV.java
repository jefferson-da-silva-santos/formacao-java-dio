package edu.jefferson.primeirasemana;

public class SmartTV {
    private boolean on = false;
    private int channel = 0;
    private int volume = 0;

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void toggleOnSmartTV() {
        boolean isTvCon = isOn();
        setOn(!isTvCon);
        channel = on ? 1 : 0;
        System.out.println("A TV agora está " + ( on ? "Ligada" : "Desligada"));
    }

    public void acressValumeTV() {
        volume++;
        System.out.println("Valume atual: " + volume);
    }

    public void decressValumeTV() {
        volume--;
        System.out.println("Valume atual: " + volume);
    }

    public void acressChanel() {
        channel++;
        System.out.println("Canal atual: " + channel);
    }

    public void decressChannel() {
        channel--;
        System.out.println("Canal atual: " + channel);
    }

    public void alterChannel(int _channel) {
       channel = _channel;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

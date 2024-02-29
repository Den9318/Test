public class Machine {

    private String transmission;
    private String body;


    public Machine(String transmission) {
        this.transmission = transmission;

    }

    public Machine(String transmission, String body) {
        this.transmission = transmission;
        this.body = body;
    }

    public String getTransmission (){
        return transmission;
    }
    public String getBody (){
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "[transmission]='" + transmission + '\'' +

                ", [body]='" + body + '\'' +
                '}';
    }
}


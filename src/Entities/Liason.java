package Entities;

public class Liason {
    private int idLiason;
    private String nomLiason;
    private String dateLiason;
    private String heureLiason;
    private Port portDestination;
    private Port portDepart;

    public Liason(int idLiason, String nomLiason, String dateLiason, String heureLiason, Port portDestination, Port portDepart) {
        this.idLiason = idLiason;
        this.nomLiason = nomLiason;
        this.dateLiason = dateLiason;
        this.heureLiason = heureLiason;
        this.portDestination = portDestination;
        this.portDepart = portDepart;
    }

    public int getIdLiason() {
        return idLiason;
    }

    public String getNomLiason() {
        return nomLiason;
    }

    public String getDateLiason() {
        return dateLiason;
    }

    public String getHeureLiason() {
        return heureLiason;
    }

    public Port getPortDestination() {
        return portDestination;
    }

    public Port getPortDepart() {
        return portDepart;
    }
}

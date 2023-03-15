package Entities;

import java.util.ArrayList;

public class Secteur
{
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Liason> lesLiasons;

    public Secteur(int idSecteur, String nomSecteur) {
        this.idSecteur = idSecteur;
        this.nomSecteur = nomSecteur;
        lesLiasons = new ArrayList<>();
    }

    public int getIdSecteur() {
        return idSecteur;
    }

    public String getNomSecteur() {
        return nomSecteur;
    }

    public ArrayList<Liason> getLesLiasons() {
        return lesLiasons;
    }

    public void AjouterLiason(Liason uneLiason)
    {
        lesLiasons.add(uneLiason);
    }

    public ArrayList<Liason> lesLiasonsDunPortDeDepart(Port portDepart)
    {
        ArrayList<Liason> desLiasons = new ArrayList<>();

        for(Liason uneLiason : lesLiasons)
        {
            if(uneLiason.getPortDepart().getIdPort() == portDepart.getIdPort())
            {
                desLiasons.add(uneLiason);
            }
        }

        return desLiasons;
    }

    public ArrayList<Liason> lesLiaisonsDunPortDeDepartEtDuneDate(Port unPortDepart, String uneDate)
    {
        ArrayList<Liason> desLiasons = new ArrayList<>();

        for(Liason uneLiason : lesLiasons)
        {
            //if(uneLiason.getPortDepart().getIdPort() == unPortDepart.getIdPort() && uneLiason.getDateLiason().compareTo(uneDate) == 0)
            if(uneLiason.getPortDepart().getIdPort() == unPortDepart.getIdPort() && uneLiason.getDateLiason().equals(uneDate))
            {
                desLiasons.add(uneLiason);
            }
        }

        return desLiasons;
    }

    public String ObtenirHeureDuneLiason(Liason uneLiason)
    {
        String heure = "";

        for(Liason liason : lesLiasons)
        {
            if (liason.getHeureLiason().equals(uneLiason.getHeureLiason()))
            {
                heure = liason.getHeureLiason();
            }
        }

        return heure;
    }


}

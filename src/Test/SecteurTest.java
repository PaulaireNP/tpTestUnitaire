package Test;

import Entities.Liason;
import Entities.Port;
import Entities.Secteur;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SecteurTest {

    private Secteur unSecteur;
    private Liason liason1;
    private Liason liason2;
    private Liason liason3;
    private Port portDestination1;
    private Port portDestination2;
    private Port portDepart1;
    private Port portDepart2;

    @BeforeEach
    void setUp() {
        unSecteur = new Secteur(1,"La Rochelle");
        portDepart1 = new Port(1,"Chibron");
        portDestination1 = new Port(1,"Le Palais");
        liason1 = new Liason(1,"Liason n1","15/03/2023","9:03",portDestination1,portDepart1);

        portDepart2 = new Port(2,"Molène");
        portDestination2 = new Port(2,"Belle île en mer");
        liason2 = new Liason(2,"Liason n2","15/03/2023","11:30",portDestination2,portDepart2);

        liason3 = new Liason(3,"Liason n3","16/03/2023","18:00",portDestination1,portDepart1);
    }

    @org.junit.jupiter.api.Test
    void lesLiasonsDunPortDeDepart()
    {
        unSecteur.AjouterLiason(liason1);

        unSecteur.AjouterLiason(liason2);

        unSecteur.AjouterLiason(liason3);

        ArrayList<Liason> expected = unSecteur.lesLiasonsDunPortDeDepart(portDepart1);

        ArrayList<Liason> actual = new ArrayList<>();
        actual.add(liason1);
        actual.add(liason3);

        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void lesLiaisonsDunPortDeDepartEtDuneDate()
    {

    }

    @org.junit.jupiter.api.Test
    void obtenirHeureDuneLiason()
    {
        unSecteur.AjouterLiason(liason1);

        unSecteur.AjouterLiason(liason2);

        String expected = unSecteur.ObtenirHeureDuneLiason(liason1);
        String actual = "9:03";
        assertEquals(expected,actual);

        expected = unSecteur.ObtenirHeureDuneLiason(liason2);
        actual = "11:30";
        assertEquals(expected,actual);

        expected = unSecteur.ObtenirHeureDuneLiason(liason3);
        actual = "";
        assertEquals(expected,actual);
    }
}
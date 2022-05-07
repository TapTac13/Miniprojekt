import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class tests {

    @Test
    void testNaestenHaltepunktAnzeigen(){
        Fahrer fahrer1 = new Fahrer("Kevin", 01234, 69);
        Routenverwaltung rv = new Routenverwaltung(fahrer1);

        Haltepunkt hpEnd = new Haltepunkt("FHDW");
        Haltepunkt hpAnfang = new Haltepunkt("HBF");

        Route route1 = new Route(hpAnfang, hpEnd);

        List<Haltepunkt> zwischenStops = new ArrayList<>();
        zwischenStops.add(new Haltepunkt("Marienstraße"));
        zwischenStops.add(new Haltepunkt("Braunschweiger Platz"));

        route1.setZwischenStops(zwischenStops);
        rv.setRoute(route1);

        assertEquals(rv.nächstenHaltepunktEinsehen().getAdresse(), "Marienstraße");
        rv.haltePunktBestätigen();
        assertEquals(rv.nächstenHaltepunktEinsehen().getAdresse(), "Braunschweiger Platz");
    }

    @Test
    void testletzenHaltepunktEinsehen(){
        Fahrer fahrer1 = new Fahrer("Kevin", 01234, 69);

        Routenverwaltung rv = new Routenverwaltung(fahrer1);

        Haltepunkt hpEnd = new Haltepunkt("FHDW");
        Haltepunkt hpAnfang = new Haltepunkt("HBF");

        Route route1 = new Route(hpAnfang, hpEnd);

        List<Haltepunkt> zwischenStops = new ArrayList<>();
        zwischenStops.add(new Haltepunkt("Marienstraße"));
        zwischenStops.add(new Haltepunkt("Braunschweiger Platz"));

        route1.setZwischenStops(zwischenStops);
        rv.setRoute(route1);

        assertEquals(rv.letztenHaltepunktEinsehen().getAdresse(), "FHDW");
    }

    // Hallo Mama ich bin im Fernsehen!
    // Hallo i bims eins Test ^^
}
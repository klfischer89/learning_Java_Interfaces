/*
* Beispielanwendung: die Testklasse für das Interface
*/
 
public class InterfaceTest
{
  public static boolean transportMachbar (Transportierbar tDetails)
  {
    float gewicht = tDetails.gewicht();
    float laenge = tDetails.laenge();
    float breite = tDetails.breite();
 
    float gewichtProFlaeche = gewicht/(laenge*breite);
 
    if (gewichtProFlaeche < tDetails.MAX_GEWICHT_PRO_FLAECHE)
    {
      return true;
    }
    
    return false;
  }
 
  public static float berechneVolumen (Transportierbar tDetails)
  {
    float volumen = tDetails.laenge()*tDetails.breite()*tDetails.hoehe();
 
    return volumen;
  }
 
  public static String erstelleBeschriftung (Transportierbar tDetails)
  {
    String text = tDetails.beschriftung();
 
    if (tDetails.zerbrechlich())
    {
      return "-Zerbrechlich- " + text;
    }
 
    return text;
  }
 
  public static void main (String[] args)
  {
    // erzeugen eines Tisch- und Schaf-Objekts
    Tisch myTisch = new Tisch ("2014.AE Esstisch", false, 27.3F, 3.0F, 2.2F, 1.3F);
    Schaf mySchaf = new Schaf ("Cloud", true, 42.9F, 1.1F, 0.82F, 0.55F);
 
    System.out.println("\nTransportdetails fuer den Tisch:\n");
    System.out.println("Volumen:             " + berechneVolumen(myTisch) + " m^3");
    System.out.println("Verpackungsaufdruck: " + erstelleBeschriftung(myTisch));
    System.out.println("Transport machbar:   " + transportMachbar(myTisch));
 
    System.out.println("\n\nTransportdetails fuer das Schaf:\n");
    System.out.println("Volumen:             " + berechneVolumen(mySchaf) + " m^3");
    System.out.println("Verpackungsaufdruck: " + erstelleBeschriftung(mySchaf));
    System.out.println("Transport machbar:   " + transportMachbar(mySchaf));
  }
}
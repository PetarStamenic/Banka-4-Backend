package rs.edu.raf.korisnik.servis;

public interface KodServis {
    void dodajKod(String email, String kod, Long expirationDate, boolean reset);
    boolean dobarKod(String email, String kod, boolean reset);
}

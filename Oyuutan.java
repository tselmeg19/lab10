package lab10_2;

public class Oyuutan {
    private String oyuutniiKod;
    private String oyuutniiNer;
    private final Salbar salbar;

    public Oyuutan(String oyuutniiKod, String oyuutniiNer, Salbar salbar) {
        this.oyuutniiKod = oyuutniiKod;
        this.oyuutniiNer = oyuutniiNer;
        this.salbar = salbar;
    }

    public String getOyuutniiKod() {
        return oyuutniiKod;
    }

    public String getOyuutniiNer() {
        return oyuutniiNer;
    }

    public Salbar getSalbar() {
        return salbar;
    }

    @Override
    public String toString() {
        return "Оюутан " + oyuutniiKod + " кодтой " + oyuutniiNer + " нь " + salbar.getSalbarNer() + " салбарт харьяалагдана.";
    }
}
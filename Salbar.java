package lab10_2;
class Salbar {
private final int salbarDugaar;
private final String salbarNer;
private final String salbarErhlegchNer;

public Salbar(int salbarDugaar, String salbarNer, String salbarErhlegchNer) {
    this.salbarDugaar = salbarDugaar;
    this.salbarNer = salbarNer;
    this.salbarErhlegchNer = salbarErhlegchNer;
}

public int getSalbarDugaar() {
    return salbarDugaar;
}

public String getSalbarNer() {
    return salbarNer;
}

public String getSalbarErhlegchNer() {
    return salbarErhlegchNer;
}

@Override
public String toString() {
    return salbarDugaar + " " + salbarNer + " салбарын эрхлэгч: " + salbarErhlegchNer;
}
}


package buildings;

public class Building {

    public int hely;
    public int fenntartok;
    public int koltseg_ko;
    public int koltseg_fa;
    public int koltseg_agyag;

    public int getHely() {
        return hely;
    }

    public void setHely(int hely) {
        this.hely = hely;
    }

    public int getFenntartok() {
        return fenntartok;
    }

    public void setFenntartok(int fenntartok) {
        this.fenntartok = fenntartok;
    }

    public int getKoltseg_ko() {
        return koltseg_ko;
    }

    public void setKoltseg_ko(int koltseg_ko) {
        this.koltseg_ko = koltseg_ko;
    }

    public int getKoltseg_fa() {
        return koltseg_fa;
    }

    public void setKoltseg_fa(int koltseg_fa) {
        this.koltseg_fa = koltseg_fa;
    }

    public int getKoltseg_agyag() {
        return koltseg_agyag;
    }

    public void setKoltseg_agyag(int koltseg_agyag) {
        this.koltseg_agyag = koltseg_agyag;
    }

    @Override
    public String toString() {
        return "Building [hely=" + hely + ", fenntartok=" + fenntartok + ", koltseg_ko=" + koltseg_ko + ", koltseg_fa="
                + koltseg_fa + ", koltseg_agyag=" + koltseg_agyag + "]";
    }

}

package buildings;

public class HazConfig implements BuildingConfig {

    private final int HELY = 50;
    private final int FENTTARTOK = 15;
    private final int KOLTSEG_KO = 0;
    private final int KOLTSEG_FA = 77;
    private final int KOLTSEG_AGYAG = 77;

    @Override
    public int getHely() {
        return HELY;
    }

    @Override
    public int getFenntartok() {
        return FENTTARTOK;
    }

    @Override
    public int getKo() {
        return KOLTSEG_KO;
    }

    @Override
    public int getFa() {
        return KOLTSEG_FA;
    }

    @Override
    public int getAgyag() {
        return KOLTSEG_AGYAG;
    }

}

package buildings;

public class BarakkConfig implements BuildingConfig {

    private final int HELY = 40;
    private final int FENTTARTOK = 15;
    private final int KOLTSEG_KO = 88;
    private final int KOLTSEG_FA = 44;
    private final int KOLTSEG_AGYAG = 44;

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

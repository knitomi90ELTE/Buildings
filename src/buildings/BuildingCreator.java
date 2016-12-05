package buildings;

public class BuildingCreator {

    public Building createBuilding(BuildingConfig config) {
        Building building = new Building();
        building.setHely(config.getHely());
        building.setFenntartok(config.getFenntartok());
        building.setKoltseg_ko(config.getKo());
        building.setKoltseg_fa(config.getFa());
        building.setKoltseg_agyag(config.getAgyag());
        return building;
    }

}

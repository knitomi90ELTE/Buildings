package buildings;

public class Main {

    public static void main(String[] args) {
        BuildingCreator buildingCreator = new BuildingCreator();
        Building haz = buildingCreator.createBuilding(new HazConfig());
        Building barakk = buildingCreator.createBuilding(new BarakkConfig());
        System.out.println(haz);
        System.out.println(barakk);
    }

}

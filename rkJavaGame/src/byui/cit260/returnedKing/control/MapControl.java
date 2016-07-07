/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import byui.cit260.returnedKing.model.Scene;

/**
 *
 * @author michaelcavey
 */
public class MapControl {

    public static Map createMap() {
        // create the map
        Map map = new Map(5, 5);

        // create list of the different scenes in the game
        Scene[] scenes = createScenes();

        // assigns the different scences to locations in the map
        assignScenesToLocations(map, scenes);

        movePlayerToStartingLocation(map);
        return map;
    }

    public static void movePlayerToStartingLocation(Map map) {
//        movePlayer(map, 2, 2); TEST <visited>
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }

    public enum SceneType {

        monastery,
        graveyard,
        northRoad,
        prison,
        warriorVillage,
        cornfield,
        farmersVillage,
        northGate,
        forest,
        tavern,
        westRoad,
        westGate,
        castle,
        eastGate,
        eastRoad,
        kingsHouse,
        huntingReserve,
        southGate,
        township,
        church,
        wizardsHamlet,
        secretCave,
        southRoad,
        harborTown,
        seaport;
    }

    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene monasteryScene = new Scene();
        monasteryScene.setDescription(" Monastery: "
                + "\n This scene is the starting point for a Monk."
                + "\n You'll be lucky if you ever return.");
        monasteryScene.setMapSymbol("MM");
        scenes[SceneType.monastery.ordinal()] = monasteryScene;

        Scene graveyardScene = new Scene();
        graveyardScene.setDescription(" Graveyard:"
                + "\n Rest one day to gain 15 Stamina points."
                + "\n See if you can find some useful items."
                + "\n Read the gravestones to learn more.");
        graveyardScene.setMapSymbol("GY");
        scenes[SceneType.graveyard.ordinal()] = graveyardScene;

        Scene northRoadScene = new Scene();
        northRoadScene.setDescription(" North Road:"
                + "\n Prison guard blocks forward movement."
                + "\n You cannot move forward in your present direction."
                + "\n You will be rerouted if you choose not to fight.");
        northRoadScene.setMapSymbol("NR");
        scenes[SceneType.northRoad.ordinal()] = northRoadScene;

        Scene prisonScene = new Scene();
        prisonScene.setDescription(" Prison:"
                + "\n Learn what you can inside and outside the prison."
                + "\n Earn 20 coins for working a job as a guard.");
        prisonScene.setMapSymbol("PP");
        scenes[SceneType.prison.ordinal()] = prisonScene;

        Scene warriorVillageScene = new Scene();
        warriorVillageScene.setDescription(" Warrior Village:"
                + "\n This scene is the starting point for a Warrior."
                + "\n You'll be lucky if you ever return.");
        warriorVillageScene.setMapSymbol("WV");
        scenes[SceneType.warriorVillage.ordinal()] = warriorVillageScene;

        Scene cornfieldScene = new Scene();
        cornfieldScene.setDescription(" Cornfield:"
                + "\n Rest one day to gain 15 Stamina points."
                + "\n Glean from the fields to replenish food."
                + "\n Work with the farmer to earn 10 coins.");
        cornfieldScene.setMapSymbol("CF");
        scenes[SceneType.cornfield.ordinal()] = cornfieldScene;

        Scene farmersVillageScene = new Scene();
        farmersVillageScene.setDescription(" Farming Village:"
                + "\n The farm village is a great place to replenish your supplies."
                + "\n Ask around for a job to earn more coin."
                + "\n The villagers are friendly, but skeptical of strangers.");
        farmersVillageScene.setMapSymbol("FV");
        scenes[SceneType.farmersVillage.ordinal()] = farmersVillageScene;

        Scene northGateScene = new Scene();
        northGateScene.setDescription(" North Gate to Castle:"
                + "\n The north gate is the main enterance to the castle."
                + "\n Twenty guards guard the enterance with hundreds more inside."
                + "\n Villagers may pass only if they give up their arms.");
        northGateScene.setMapSymbol("NG");
        scenes[SceneType.northGate.ordinal()] = northGateScene;

        Scene forestScene = new Scene();
        forestScene.setDescription("ADD DESCRIPTION OF forest LATER");
        forestScene.setMapSymbol("FF");
        scenes[SceneType.forest.ordinal()] = forestScene;

        Scene tavernScene = new Scene();
        tavernScene.setDescription("ADD DESCRIPTION OF tavern LATER");
        tavernScene.setMapSymbol("TT");
        scenes[SceneType.tavern.ordinal()] = tavernScene;

        Scene westRoadScene = new Scene();
        westRoadScene.setDescription(" West Road:"
                + "\n Rogue warrior blocks forward movement."
                + "\n You cannot move forward in your present direction."
                + "\n You will be rerouted if you choose not to fight.");
        westRoadScene.setMapSymbol("WR");
        scenes[SceneType.westRoad.ordinal()] = westRoadScene;

        Scene westGateScene = new Scene();
        westGateScene.setDescription(" West Gate to Castle:"
                + "\n The West gate is always locked."
                + "\n No guards are stationed at the enterance because a swamp "
                + "\n filled with crocodiles and snakes prevent access."
                + "\n Nobody has ever fought their way through.");
        westGateScene.setMapSymbol("WG");
        scenes[SceneType.westGate.ordinal()] = westGateScene;

        Scene castleScene = new Scene();
        castleScene.setDescription("ADD DESCRIPTION OF castle LATER");
        castleScene.setMapSymbol("XX");
        scenes[SceneType.castle.ordinal()] = castleScene;

        Scene eastGateScene = new Scene();
        eastGateScene.setDescription(" East Gate to Castle:"
                + "\n The east gate is monatored by a corrupt guard."
                + "\n For 100 coins the guard will allow you to pass, no questions asked."
                + "\n Postitutes from town and the tavern are allowed access.");
        eastGateScene.setMapSymbol("EG");
        scenes[SceneType.eastGate.ordinal()] = eastGateScene;

        Scene eastRoadScene = new Scene();
        eastRoadScene.setDescription(" East Road:"
                + "\n Bandit blocks forward movement."
                + "\n You cannot move forward in your present direction."
                + "\n You will be rerouted if you choose not to fight.");
        eastRoadScene.setMapSymbol("ER");
        scenes[SceneType.eastRoad.ordinal()] = eastRoadScene;

        Scene kingsHouseScene = new Scene();
        kingsHouseScene.setDescription("ADD DESCRIPTION OF kingsHouse LATER");
        kingsHouseScene.setMapSymbol("KH");
        scenes[SceneType.kingsHouse.ordinal()] = kingsHouseScene;

        Scene huntingReserveScene = new Scene();
        huntingReserveScene.setDescription("ADD DESCRIPTION OF huntingReserve LATER");
        huntingReserveScene.setMapSymbol("HR");
        scenes[SceneType.huntingReserve.ordinal()] = huntingReserveScene;

        Scene southGateScene = new Scene();
        southGateScene.setDescription(" South Gate to Castle:"
                + "\n The south gate is always locked."
                + "\n One guard protects the enterance."
                + "\n A password is required to be allowed into the castle.");
        southGateScene.setMapSymbol("SG");
        scenes[SceneType.southGate.ordinal()] = southGateScene;

        Scene townshipScene = new Scene();
        townshipScene.setDescription(" Township:"
                + "\n The township brings back many fond childhood memories."
                + "\n Your father would walk the streets with you without fear."
                + "\n This is the place you escaped to when fleeing your murderous uncle.");
        townshipScene.setMapSymbol("TS");
        scenes[SceneType.township.ordinal()] = townshipScene;

        Scene churchScene = new Scene();
        churchScene.setDescription("ADD DESCRIPTION OF church LATER");
        churchScene.setMapSymbol("CC");
        scenes[SceneType.church.ordinal()] = churchScene;

        Scene wizardsHamletScene = new Scene();
        wizardsHamletScene.setDescription(" Wizard Hamlet:"
                + "\n This scene is the starting point for the Wizard."
                + "\n You'll be lucky if you ever return.");
        wizardsHamletScene.setMapSymbol("WH");
        scenes[SceneType.wizardsHamlet.ordinal()] = wizardsHamletScene;

        Scene secretCaveScene = new Scene();
        secretCaveScene.setDescription(" Secret Cave:"
                + "\n Rest one day to gain 20 Stamina points."
                + "\n See if you can find some useful items."
                + "\n The skeletons should tell you something.");
        secretCaveScene.setMapSymbol("SC");
        scenes[SceneType.secretCave.ordinal()] = secretCaveScene;

        Scene southRoadScene = new Scene();
        southRoadScene.setDescription(" South Road:"
                + "\n Drucken sailor blocks forward movement."
                + "\n You cannot move forward in your present direction."
                + "\n You will be rerouted if you choose not to fight.");
        southRoadScene.setMapSymbol("SR");
        scenes[SceneType.southRoad.ordinal()] = southRoadScene;

        Scene harborTownScene = new Scene();
        harborTownScene.setDescription("ADD DESCRIPTION OF harborTown LATER");
        harborTownScene.setMapSymbol("HT");
        scenes[SceneType.harborTown.ordinal()] = harborTownScene;

        Scene seaportScene = new Scene();
        seaportScene.setDescription(" Seaport:"
                + "\n The seaport is a dangerous place that plays by its own rules."
                + "\n Foriegn travelers have never been subject to the King's rule."
                + "\n Neither have they been rebelous. They only defend their iberty");
        seaportScene.setMapSymbol("SP");
        scenes[SceneType.seaport.ordinal()] = seaportScene;

        return scenes;

    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.monastery.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.graveyard.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.northRoad.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.prison.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.warriorVillage.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.cornfield.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.farmersVillage.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.northGate.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.tavern.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.westRoad.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.westGate.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.castle.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.eastGate.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.eastRoad.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.kingsHouse.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.huntingReserve.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.southGate.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.township.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.church.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.wizardsHamlet.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.secretCave.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.southRoad.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.harborTown.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.seaport.ordinal()]);
    }

}

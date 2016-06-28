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
//        movePlayer(map, 2, 2);
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
        monasteryScene.setDescription("ADD DESCRIPTION OF monastery LATER");
        monasteryScene.setMapSymbol("MM");
        scenes[SceneType.monastery.ordinal()] = monasteryScene;
        
        Scene graveyardScene = new Scene();
        graveyardScene.setDescription("ADD DESCRIPTION OF graveyard LATER");
        graveyardScene.setMapSymbol("GY");
        scenes[SceneType.graveyard.ordinal()] = graveyardScene;
        
        Scene northRoadScene = new Scene();
        northRoadScene.setDescription("ADD DESCRIPTION OF northRoad LATER");
        northRoadScene.setMapSymbol("NR");
        scenes[SceneType.northRoad.ordinal()] = northRoadScene;
        
        Scene prisonScene = new Scene();
        prisonScene.setDescription("ADD DESCRIPTION OF prison LATER");
        prisonScene.setMapSymbol("PP");
        scenes[SceneType.prison.ordinal()] = prisonScene;
        
        Scene warriorVillageScene = new Scene();
        warriorVillageScene.setDescription("ADD DESCRIPTION OF warriorVillage LATER");
        warriorVillageScene.setMapSymbol("WV");
        scenes[SceneType.warriorVillage.ordinal()] = warriorVillageScene;
        
        Scene cornfieldScene = new Scene();
        cornfieldScene.setDescription("ADD DESCRIPTION OF cornfield LATER");
        cornfieldScene.setMapSymbol("CF");
        scenes[SceneType.cornfield.ordinal()] = cornfieldScene;
        
        Scene farmersVillageScene = new Scene();
        farmersVillageScene.setDescription("ADD DESCRIPTION OF farmersVillage LATER");
        farmersVillageScene.setMapSymbol("FV");
        scenes[SceneType.farmersVillage.ordinal()] = farmersVillageScene;
        
        Scene northGateScene = new Scene();
        northGateScene.setDescription("ADD DESCRIPTION OF northGate LATER");
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
        westRoadScene.setDescription("ADD DESCRIPTION OF westRoad LATER");
        westRoadScene.setMapSymbol("WR");
        scenes[SceneType.westRoad.ordinal()] = westRoadScene;
        
        Scene westGateScene = new Scene();
        westGateScene.setDescription("ADD DESCRIPTION OF westGate LATER");
        westGateScene.setMapSymbol("WG");
        scenes[SceneType.westGate.ordinal()] = westGateScene;
        
        Scene castleScene = new Scene();
        castleScene.setDescription("ADD DESCRIPTION OF castle LATER");
        castleScene.setMapSymbol("XX");
        scenes[SceneType.castle.ordinal()] = castleScene;
        
        Scene eastGateScene = new Scene();
        eastGateScene.setDescription("ADD DESCRIPTION OF eastGate LATER");
        eastGateScene.setMapSymbol("EG");
        scenes[SceneType.eastGate.ordinal()] = eastGateScene;
        
        Scene eastRoadScene = new Scene();
        eastRoadScene.setDescription("ADD DESCRIPTION OF eastRoad LATER");
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
        southGateScene.setDescription("ADD DESCRIPTION OF southGate LATER");
        southGateScene.setMapSymbol("SG");
        scenes[SceneType.southGate.ordinal()] = southGateScene;
        
        Scene townshipScene = new Scene();
        townshipScene.setDescription("ADD DESCRIPTION OF township LATER");
        townshipScene.setMapSymbol("TS");
        scenes[SceneType.township.ordinal()] = townshipScene;
        
        Scene churchScene = new Scene();
        churchScene.setDescription("ADD DESCRIPTION OF church LATER");
        churchScene.setMapSymbol("CC");
        scenes[SceneType.church.ordinal()] = churchScene;
        
        Scene wizardsHamletScene = new Scene();
        wizardsHamletScene.setDescription("ADD DESCRIPTION OF wizardsHamlet LATER");
        wizardsHamletScene.setMapSymbol("WH");
        scenes[SceneType.wizardsHamlet.ordinal()] = wizardsHamletScene;
        
        Scene secretCaveScene = new Scene();
        secretCaveScene.setDescription("ADD DESCRIPTION OF secretCave LATER");
        secretCaveScene.setMapSymbol("SC");
        scenes[SceneType.secretCave.ordinal()] = secretCaveScene;
        
        Scene southRoadScene = new Scene();
        southRoadScene.setDescription("ADD DESCRIPTION OF southRoad LATER");
        southRoadScene.setMapSymbol("SR");
        scenes[SceneType.southRoad.ordinal()] = southRoadScene;
        
        Scene harborTownScene = new Scene();
        harborTownScene.setDescription("ADD DESCRIPTION OF harborTown LATER");
        harborTownScene.setMapSymbol("HT");
        scenes[SceneType.harborTown.ordinal()] = harborTownScene;
        
        Scene seaportScene = new Scene();
        seaportScene.setDescription("ADD DESCRIPTION OF seaport LATER");
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


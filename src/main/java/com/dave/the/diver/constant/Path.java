package com.dave.the.diver.constant;

public class Path {

    /***********************************
     ** API
     ***********************************/
    public static final String API = "/api";

    /***********************************
     ** Data
     ***********************************/
    public static final String DATA = API + "/data";
    public static final String DATA_FISH = DATA + "/fish";
    public static final String DATA_REGION = DATA + "/region";
    public static final String DATA_TIME = DATA + "/time";
    public static final String DATA_PLANT = DATA + "/plant";
    public static final String DATA_PLANT_SOURCE = DATA + "/plant-source";
    public static final String DATA_SEASONING = DATA + "/seasoning";
    public static final String DATA_SEASONING_SOURCE = DATA + "/seasoning-source";
    public static final String DATA_SOURCE = DATA + "/source";
    public static final String DATA_DISH = DATA + "/dish";
    public static final String DATA_PARTY = DATA + "/party";
    public static final String DATA_UNLOCK = DATA + "/unlock";
    public static final String DATA_RECIPE = DATA + "/recipe";

    /***********************************
     ** Fish
     ***********************************/
    public static final String FISH = API + "/fish";
    public static final String FISH_DETAIL = FISH + "/{id}";

    /***********************************
     ** Plant
     ***********************************/
    public static final String PLANT = API + "/plant";
    public static final String PLANT_DETAIL = PLANT + "/{id}";

    /***********************************
     ** Seasoning
     ***********************************/
    public static final String SEASONING = API + "/seasoning";
    public static final String SEASONING_DETAIL = SEASONING + "/{id}";

    /***********************************
     ** Dish
     ***********************************/
    public static final String DISH = API + "/dish";
    public static final String DISH_DETAIL = DISH + "/{id}";

    /***********************************
     ** Dish Level
     ***********************************/
    public static final String DISH_LEVEL = API + "/dish-level";
}

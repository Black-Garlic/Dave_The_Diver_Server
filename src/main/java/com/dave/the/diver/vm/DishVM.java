package com.dave.the.diver.vm;

import lombok.Getter;
import lombok.Setter;

public class DishVM {

    @Getter
    @Setter
    public static class DishLevelList {
        private String profileId;
    }

    @Getter
    @Setter
    public static class Update {
        private String profileId;
        private String dishId;
        private int dishLevel;
    }
}

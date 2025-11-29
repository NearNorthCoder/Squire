/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mahoghomes.model;

import gg.squire.mahoghomes.model.RequiredMaterials;

public enum RequiredMaterialsByTier {
    JESS(new RequiredMaterials(9, 11, 0, 1), new RequiredMaterials(9, 11, 0, 1), new RequiredMaterials(12, 15, 0, 1), new RequiredMaterials(14, 15, 0, 1)),
    NOELLA(new RequiredMaterials(11, 12, 0, 0), new RequiredMaterials(11, 12, 0, 0), new RequiredMaterials(12, 15, 0, 0), new RequiredMaterials(13, 15, 0, 0)),
    ROSS(new RequiredMaterials(8, 11, 0, 1), new RequiredMaterials(8, 11, 0, 1), new RequiredMaterials(8, 11, 1, 1), new RequiredMaterials(10, 11, 0, 1)),
    LARRY(new RequiredMaterials(8, 12, 0, 1), new RequiredMaterials(8, 12, 0, 1), new RequiredMaterials(9, 12, 0, 1), new RequiredMaterials(12, 12, 0, 1)),
    NORMAN(new RequiredMaterials(11, 11, 1, 1), new RequiredMaterials(10, 11, 1, 1), new RequiredMaterials(10, 13, 1, 1), new RequiredMaterials(12, 13, 1, 1)),
    TAU(new RequiredMaterials(8, 12, 0, 1), new RequiredMaterials(8, 12, 0, 1), new RequiredMaterials(9, 13, 0, 1), new RequiredMaterials(12, 13, 0, 1)),
    BARBARA(new RequiredMaterials(3, 8, 0, 1), new RequiredMaterials(3, 8, 0, 1), new RequiredMaterials(9, 10, 0, 1), new RequiredMaterials(9, 10, 0, 1)),
    LEELA(new RequiredMaterials(8, 9, 0, 1), new RequiredMaterials(8, 9, 0, 1), new RequiredMaterials(9, 10, 0, 1), new RequiredMaterials(12, 13, 0, 1)),
    MARIAH(new RequiredMaterials(7, 11, 0, 1), new RequiredMaterials(7, 11, 0, 1), new RequiredMaterials(11, 14, 0, 1), new RequiredMaterials(13, 14, 0, 1)),
    BOB(new RequiredMaterials(13, 14, 0, 0), new RequiredMaterials(13, 14, 0, 0), new RequiredMaterials(13, 17, 0, 0), new RequiredMaterials(16, 17, 0, 0)),
    JEFF(new RequiredMaterials(11, 13, 0, 0), new RequiredMaterials(11, 13, 0, 0), new RequiredMaterials(11, 16, 0, 0), new RequiredMaterials(15, 16, 0, 0)),
    SARAH(new RequiredMaterials(11, 11, 0, 1), new RequiredMaterials(11, 11, 0, 1), new RequiredMaterials(11, 11, 0, 1), new RequiredMaterials(11, 11, 0, 1));

    private final RequiredMaterials beginner;
    private final RequiredMaterials novice;
    private final RequiredMaterials adept;
    private final RequiredMaterials expert;

    public RequiredMaterials getByTier(int tier) {
        switch (tier) {
            case 1: {
                return this.beginner;
            }
            case 2: {
                return this.novice;
            }
            case 3: {
                return this.adept;
            }
            case 4: {
                return this.expert;
            }
        }
        return null;
    }

    private RequiredMaterialsByTier(RequiredMaterials beginner, RequiredMaterials novice, RequiredMaterials adept, RequiredMaterials expert) {
        this.beginner = beginner;
        this.novice = novice;
        this.adept = adept;
        this.expert = expert;
    }
}


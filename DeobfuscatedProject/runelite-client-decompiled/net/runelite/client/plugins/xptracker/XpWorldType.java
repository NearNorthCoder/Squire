/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.WorldType
 */
package net.runelite.client.plugins.xptracker;

import net.runelite.api.Client;
import net.runelite.api.WorldType;

enum XpWorldType {
    NORMAL,
    TOURNEY,
    DMM{

        @Override
        int modifier(Client client) {
            return 5;
        }
    }
    ,
    LEAGUE{

        @Override
        int modifier(Client client) {
            return 5;
        }
    };


    int modifier(Client client) {
        return 1;
    }

    static XpWorldType of(WorldType type) {
        switch (type) {
            case NOSAVE_MODE: {
                return TOURNEY;
            }
            case DEADMAN: {
                return DMM;
            }
            case SEASONAL: {
                return LEAGUE;
            }
        }
        return NORMAL;
    }
}


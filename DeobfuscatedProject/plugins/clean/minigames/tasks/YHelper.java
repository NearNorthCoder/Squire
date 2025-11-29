/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;

public class YHelper
extends MinigamesTaskBase {
    private final  WorldPoint ay;

    static {
        y.llIIllIlIllIIl();
    }

    public WorldPoint L() {
        return this.ay;
    }

    @Override
    public boolean c(o o2) {
        Movement.setDestination((WorldPoint)this.ay);
        return lIIlIlllIIlI[0];
    }

    public YHelper(String string, WorldPoint worldPoint) {
        super(string);
        this.ay = worldPoint;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Hitsplat
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 */
package gg.squire.gorillas.tasks;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Hitsplat;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;

public class FHelper {
    private  WorldArea y;
    private  List<Hitsplat> K;
    private  Player J;

    public FHelper(Player player) {
        this.J = player;
        this.K = new ArrayList<Hitsplat>();
    }

    public void a(WorldArea worldArea) {
        this.y = worldArea;
    }

    public Player D() {
        return this.J;
    }

    public List<Hitsplat> E() {
        return this.K;
    }

    public WorldArea r() {
        return this.y;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.movement.Movement;
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.CHelper;
import gg.squire.hydra.tasks.GameEnum;

@TaskDesc(name="Walking back to start")
public class WalkingBackToStartTask
extends Task {

    private final  c bd;
    private final  a bc;

    private static boolean lIIIllllllIlIII(Object object) {
        return object != null;
    }

    private static boolean lIIIllllllIlIlI(int n2) {
        return n2 > 0;
    }

    static {
        B.lIIIllllllIIllI();
        B.lIIIllllllIIlIl();
    }

    private static void lIIIllllllIIlIl() {
        llllIIlIlIIl = new String[llllIIlIlIlI[1]];
        B.llllIIlIlIIl[B.llllIIlIlIlI[0]] = "Alchemical Hydra";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B var1;
        if (B.lIIIllllllIIlll(this.bc.g() ? 1 : 0)) {
            return llllIIlIlIlI[0];
        }
        if (B.lIIIllllllIlIII(var1.bc.k())) {
            return llllIIlIlIlI[0];
        }
        String[] stringArray = new String[llllIIlIlIlI[1]];
        stringArray[B.llllIIlIlIlI[0]] = llllIIlIlIIl[llllIIlIlIlI[0]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (B.lIIIllllllIlIII(var2)) {
            return llllIIlIlIlI[0];
        }
        if (B.lIIIllllllIlIIl(var1.bc.e(), llllIIlIlIlI[2]) && B.lIIIllllllIlIlI(TileItems.getAll().size())) {
            return llllIIlIlIlI[0];
        }
        WorldPoint var3 = k.POISON.Z().toWorld();
        if (B.lIIIllllllIlIll(var3.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return llllIIlIlIlI[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return llllIIlIlIlI[1];
    }

    private static boolean lIIIllllllIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllllIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WalkingBackToStartTask(a a2, c c2) {
        this.bc = a2;
        this.bd = c2;
    }

    private static boolean lIIIllllllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var4);
    }
}


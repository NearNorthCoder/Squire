/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.GameEnum4;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Collecting Snape Grass")
public class CollectingSnapeGrassTask
extends Task {
    private static final  WorldPoint gW;
    private static final  WorldPoint gX;

    private static final  WorldArea gU;
    private static final  int gS;
    @Inject
    private  SecondariesConfig gK;
    private static final  int gT;
    private static final  WorldArea gV;

    /*
     * WARNING - void declaration
     */
    protected boolean t(int n2) {
        void llIIllIlllIIlIl;
        Client client = Static.getClient();
        int[] nArray = client.getMapRegions();
        int n3 = nArray.length;
        int llIIllIlllIIlII = lIIIIIllI[0];
        while (bS.lllIlIIIll(llIIllIlllIIlII, (int)llIIllIlllIIlIl)) {
            void llIIllIlllIlIII;
            void llIIllIlllIIllI;
            void llIIllIlllIIIll = llIIllIlllIIllI[llIIllIlllIIlII];
            if (bS.lllIlIIlII((int)llIIllIlllIIIll, (int)llIIllIlllIlIII)) {
                return lIIIIIllI[2];
            }
            ++llIIllIlllIIlII;

            if (((0xFF ^ 0x96 ^ (0xEA ^ 0xA4)) & (0xD1 ^ 0xB6 ^ (0x13 ^ 0x53) ^ -1)) == 0) continue;
            return ((128 + 127 - 117 + 34 ^ 33 + 102 - 94 + 114) & (0xAE ^ 0xA7 ^ (0xB2 ^ 0x8C) ^ -1)) != 0;
        }
        return lIIIIIllI[0];
    }

    private static boolean lllIlIIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (bS.lllIIllllI((Object)this.gK.secondary(), (Object)bO.SNAPE_GRASS)) {
            return lIIIIIllI[0];
        }
        if (bS.lllIIlllll(Inventory.isFull() ? 1 : 0)) {
            return lIIIIIllI[0];
        }
        if (bS.lllIlIIIII(gX.distanceTo((Locatable)Players.getLocal()), lIIIIIllI[1])) {
            Movement.walkTo((WorldPoint)gX);

            return lIIIIIllI[2];
        }
        TileItem llIIllIlllIllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (bS.lllIIlllll(tileItem.getName().equals(lIIIIIlIl[lIIIIIllI[2]]) ? 1 : 0) && bS.lllIIlllll(gV.contains(tileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = lIIIIIllI[2];

                }
            } else {
                n2 = lIIIIIllI[0];
            }
            return n2 != 0;
        });
        if (bS.lllIlIIIIl(llIIllIlllIllll)) {
            if (bS.lllIlIIIlI(Players.getLocal().getWorldLocation().equals((Object)gX) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)gX);
                return lIIIIIllI[2];
            }
            return lIIIIIllI[0];
        }
        var1_1.interact(lIIIIIlIl[lIIIIIllI[0]]);
        return lIIIIIllI[2];
    }

    private static boolean lllIIllllI(Object object, Object object2) {
        return object != object2;
    }

    static {
        bS.lllIIlllIl();
        bS.lllIIlllII();
        gS = lIIIIIllI[3];
        gT = lIIIIIllI[4];
        gU = new WorldArea(lIIIIIllI[5], lIIIIIllI[6], lIIIIIllI[7], lIIIIIllI[7], lIIIIIllI[0]);
        gV = new WorldArea(lIIIIIllI[8], lIIIIIllI[9], lIIIIIllI[7], lIIIIIllI[7], lIIIIIllI[0]);
        gW = new WorldPoint(lIIIIIllI[10], lIIIIIllI[11], lIIIIIllI[0]);
        gX = new WorldPoint(lIIIIIllI[12], lIIIIIllI[13], lIIIIIllI[0]);
    }

    private static boolean lllIlIIlII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(llIIllIllIlIlII);
    }

    private static boolean lllIlIIIIl(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lllIIlllII() {
        lIIIIIlIl = new String[lIIIIIllI[14]];
        bS.lIIIIIlIl[bS.lIIIIIllI[0]] = "Take";
        bS.lIIIIIlIl[bS.lIIIIIllI[2]] = "Snape grass";
    }
}


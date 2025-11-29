/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking Gorilla", priority=50)
@Singleton
public class AttackingGorillaTask
extends Task {
    private static final  int Z;

    private static final  RectangularArea Y;

    private static void lllllIllllllIl() {
        llIIllIIIIll = new String[llIIllIIIlII[11]];
        o.llIIllIIIIll[o.llIIllIIIlII[1]] = "Moving to gorilla center {} {} - {}";
        o.llIIllIIIIll[o.llIIllIIIlII[3]] = "Tortured atttacking us, moving...";
        o.llIIllIIIIll[o.llIIllIIIlII[4]] = "Cannot find a gorilla to attack";
        o.llIIllIIIIll[o.llIIllIIIlII[2]] = "Attack";
        o.llIIllIIIIll[o.llIIllIIIlII[5]] = "gorilla";
        o.llIIllIIIIll[o.llIIllIIIlII[6]] = "Tortured gorilla";
    }

        return String.valueOf(var1);
    }

    private static boolean llllllIIIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llllllIIIIIIIl(Object object) {
        return object != null;
    }

    static {
        o.lllllIlllllllI();
        o.lllllIllllllIl();
        Z = llIIllIIIlII[0];
        Y = new RectangularArea(llIIllIIIlII[7], llIIllIIIlII[8], llIIllIIIlII[9], llIIllIIIlII[10], llIIllIIIlII[1]);
    }

    private static boolean llllllIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIllllllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        o var2;
        if (o.lllllIllllllll(Locations.isRegionLoaded((int)llIIllIIIlII[0]) ? 1 : 0)) {
            return llIIllIIIlII[1];
        }
        if (o.lllllIllllllll(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.llllllIIIIIIII(var2.N() ? 1 : 0)) {
            Object[] objectArray = new Object[llIIllIIIlII[2]];
            objectArray[o.llIIllIIIlII[1]] = Y.contains(Players.getLocal().getWorldLocation());
            objectArray[o.llIIllIIIlII[3]] = var2.N();
            objectArray[o.llIIllIIIlII[4]] = Players.getLocal().getWorldLocation();
            Log.info((String)llIIllIIIIll[llIIllIIIlII[1]], (Object[])objectArray);
            Movement.setDestination((WorldPoint)Y.getCenter());
            return llIIllIIIlII[3];
        }
        Player var3 = Players.getLocal();
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIIII(nPC.getName().equals(llIIllIIIIll[llIIllIIIlII[6]]) ? 1 : 0) && o.llllllIIIIIlIl(nPC.getInteracting(), var3)) {
                n2 = llIIllIIIlII[3];

                if (1 > 1) {
                    return ((0x12 ^ 0x51 ^ (0x25 ^ 0x47)) & (108 + 103 - 78 + 37 ^ 46 + 23 - 14 + 84 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        });
        if (o.llllllIIIIIIIl(var4)) {
            Log.info((String)llIIllIIIIll[llIIllIIIlII[3]]);
            Movement.setDestination((WorldPoint)new WorldPoint(Y.getMinX(), Y.getMinY(), llIIllIIIlII[1]));
            return llIIllIIIlII[3];
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIlIl(nPC.getInteracting(), Players.getLocal()) && o.llllllIIIIIIII(Y.contains((Locatable)nPC) ? 1 : 0) && o.llllllIIIIIIII(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
                n2 = llIIllIIIlII[3];

                if (-(0x86 ^ 0x82) > 0) {
                    return false;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        });
        if (o.llllllIIIIIIlI(var5) && o.llllllIIIIIIlI(var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIIlI(nPC.getInteracting()) && o.llllllIIIIIIII(Y.contains((Locatable)nPC) ? 1 : 0) && o.llllllIIIIIIII(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
                n2 = llIIllIIIlII[3];

                if (-(0x95 ^ 0x8E ^ (0x7A ^ 0x65)) > 0) {
                    return ((128 + 28 - 88 + 171 ^ 52 + 105 - 65 + 75) & (0xAF ^ 0xC0 ^ (0x82 ^ 0xA5) ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        }))) {
            Log.info((String)llIIllIIIIll[llIIllIIIlII[4]]);
            return llIIllIIIlII[1];
        }
        if (o.llllllIIIIIIIl(Players.getLocal().getInteracting())) {
            return llIIllIIIlII[1];
        }
        var3_3.interact(llIIllIIIIll[llIIllIIIlII[2]]);
        this.sleep(llIIllIIIlII[5]);
        return llIIllIIIlII[3];
    }

    private static boolean llllllIIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean N() {
        void var6;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int var7 = llIIllIIIlII[1];
        while (o.llllllIIIIIIll(var7, (int)var6)) {
            void var8;
            void var9 = var8[var7];
            if (o.llllllIIIIIlII((int)var9, llIIllIIIlII[0])) {
                boolean bl;
                if (o.llllllIIIIIIIl(NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(llIIllIIIIll[llIIllIIIlII[5]])))) {
                    bl = llIIllIIIlII[3];

                    if (((0x7F ^ 0x2D ^ (0x43 ^ 0x58)) & (27 + 159 - -33 + 17 ^ 33 + 70 - 31 + 93 ^ -1)) != 0) {
                        return ((0x23 ^ 0x67 ^ (0x34 ^ 0x3E)) & (37 + 69 - 31 + 61 ^ 145 + 77 - 142 + 118 ^ -1)) != 0;
                    }
                } else {
                    bl = llIIllIIIlII[1];
                }
                return bl;
            }
            ++var7;

            if (((0x72 ^ 0x68 ^ (0x4F ^ 0xC)) & (0xA6 ^ 0x9A ^ (0x41 ^ 0x24) ^ -1)) == 0) continue;
            return false;
        }
        return llIIllIIIlII[1];
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Traversing to Cerberus", priority=155)
public class TraversingToCerberusTask
extends Task {
    private final  SquireCerberus aQ;
    private final  a aS;
    private static  String[] lIlIIllIl;
    private final  SquireCerberusConfig aR;
    private static  int[] lIlIIlllI;

    @Inject
    public TraversingToCerberusTask(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.aQ = squireCerberus;
        this.aR = squireCerberusConfig;
        this.aS = a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        A var1;
        if (A.var2(this.aQ.r() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        if (A.var2(var1.aS.l() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        if (A.var3(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        String[] stringArray = new String[lIlIIlllI[1]];
        stringArray[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[0]];
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if (A.var5(var1.aS.k()) && A.var6(var4)) {
            var1.aS.a(var4);
        }
        if (A.var6(var4)) {
            return lIlIIlllI[0];
        }
        if (A.var6(var1.aS.b())) {
            Log.info((String)lIlIIllIl[lIlIIlllI[1]]);
            return var1.aS.c();
        }
        String[] stringArray2 = new String[lIlIIlllI[1]];
        stringArray2[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[2]];
        TileObject var7 = TileObjects.getNearest((String[])stringArray2);
        if (A.var6(var7)) {
            Log.info((String)lIlIIllIl[lIlIIlllI[3]]);
            WorldPoint var8 = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)new WorldPoint(var8.getX(), var8.getY() + lIlIIlllI[4], var8.getPlane()));
            return lIlIIlllI[1];
        }
        String[] stringArray3 = new String[lIlIIlllI[1]];
        stringArray3[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[5]];
        TileObject var8 = TileObjects.getNearest((String[])stringArray3);
        if (A.var5(var8)) {
            WorldPoint var9 = new WorldPoint(lIlIIlllI[6], lIlIIlllI[7], lIlIIlllI[0]);
            return Movement.walkTo((WorldPoint)var9);
        }
        Log.info((String)lIlIIllIl[lIlIIlllI[8]]);
        var3_4.interact(lIlIIllIl[lIlIIlllI[9]]);
        this.sleep(lIlIIlllI[9]);
        return lIlIIlllI[1];
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIlIIlllI[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIlIIlllI[0];
        while (A.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0x5C ^ 0x3C ^ (0x23 ^ 0x47)) != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var21() {
        lIlIIllIl = new String[lIlIIlllI[10]];
        A.lIlIIllIl[A.lIlIIlllI[0]] = "Cerberus";
        A.lIlIIllIl[A.lIlIIlllI[1]] = "Passing flames";
        A.lIlIIllIl[A.lIlIIlllI[2]] = "Portcullis";
        A.lIlIIllIl[A.lIlIIlllI[3]] = "We are inside the Cerb lair, but there are no flames.";
        A.lIlIIllIl[A.lIlIIlllI[5]] = "Iron Winch";
        A.lIlIIllIl[A.lIlIIlllI[8]] = "Turning winch";
        A.lIlIIllIl[A.lIlIIlllI[9]] = "Turn";
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static void var34() {
        lIlIIlllI = new int[12];
        A.lIlIIlllI[0] = (0x12 ^ 0x4F) & ~(0xC2 ^ 0x9F);
        A.lIlIIlllI[1] = 1;
        A.lIlIIlllI[2] = 2;
        A.lIlIIlllI[3] = 3;
        A.lIlIIlllI[4] = 92 + 2 - 73 + 110 ^ 32 + 127 - 55 + 36;
        A.lIlIIlllI[5] = 0x8C ^ 0xB1 ^ (3 ^ 0x3A);
        A.lIlIIlllI[6] = -(0xFFFFFE73 & 0x7BBD) & (0xFFFFFFFD & 0x7F3F);
        A.lIlIIlllI[7] = 0xFFFFD5EE & 0x2EF5;
        A.lIlIIlllI[8] = 80 + 138 - 153 + 93 ^ 147 + 86 - 199 + 121;
        A.lIlIIlllI[9] = 0x20 ^ 0x26;
        A.lIlIIlllI[10] = 0x8C ^ 0x8B;
        A.lIlIIlllI[11] = 0x65 ^ 0x5E ^ (0x65 ^ 0x56);
    }

    static {
        A.var34();
        A.var21();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var6(Object object) {
        return object != null;
    }
}


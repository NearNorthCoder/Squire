/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.util.List;
import javax.inject.Inject;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Repairing struts", priority=25, blocking=true)
public class RepairingStrutsTask
extends MiningTaskBase {
    private final  WorldPoint aa;
    private final  WorldPoint ab;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[13];
        D.var1[0] = 0xFFFFEEAE & 0x1FF9;
        D.var1[1] = 0xFFFFFF29 & 0x16FF;
        D.var1[2] = (0xB ^ 0x4F) & ~(0x14 ^ 0x50);
        D.var1[3] = 0xFFFFFF9F & 0xEFD;
        D.var1[4] = -(0xFFFFED9D & 0x1BEF) & (0xFFFFDFFF & 0x3FAF);
        D.var1[5] = 1;
        D.var1[6] = 2;
        D.var1[7] = 0xFFFFFF7B & 0x9AF;
        D.var1[8] = 0xFFFFFFFF & 0x2EEB;
        D.var1[9] = 3;
        D.var1[10] = 0x54 ^ 0x5C;
        D.var1[11] = 1 ^ (0xC7 ^ 0xC2);
        D.var1[12] = 0x6B ^ 0x3B ^ (0x6C ^ 0x39);
    }

    static {
        D.var4();
        D.var5();
    }

    @Inject
    public RepairingStrutsTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
        this.aa = new WorldPoint(var1[0], var1[1], var1[2]);
        this.ab = new WorldPoint(var1[3], var1[4], var1[2]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var3_4;
        D var6;
        if (D.var7(this.Z.M())) {
            return var1[2];
        }
        if (D.var7(var6.Z.J() ? 1 : 0)) {
            return var1[2];
        }
        String[] stringArray = new String[var1[5]];
        stringArray[D.var1[2]] = var2[var1[2]];
        List var8 = TileObjects.getAll((String[])stringArray);
        if (D.var9(var8.size(), var1[6])) {
            return var1[2];
        }
        if (D.var7(Movement.shouldWalk() ? 1 : 0)) {
            return var1[2];
        }
        Player var10 = Players.getLocal();
        int[] nArray = new int[var1[5]];
        nArray[D.var1[2]] = var1[7];
        if (D.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (D.var11(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[var1[5]];
                nArray2[D.var1[2]] = var1[8];
                if (D.var11(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[var1[5]];
                    nArray3[D.var1[2]] = var1[8];
                    Inventory.getFirst((int[])nArray3).drop();
                    return var1[5];
                }
            }
            String[] stringArray2 = new String[var1[5]];
            stringArray2[D.var1[2]] = var2[var1[5]];
            TileObject var12 = TileObjects.getNearest((WorldPoint)var6.aa, (String[])stringArray2);
            if (D.var3(var12)) {
                return var1[2];
            }
            if (D.var13(var12.distanceTo((Locatable)var10), var1[6])) {
                Movement.walkTo((WorldPoint)var6.aa);
                0;
                return var1[5];
            }
            var12.interact(var2[var1[6]]);
            return var1[5];
        }
        String[] stringArray3 = new String[var1[5]];
        stringArray3[D.var1[2]] = var2[var1[9]];
        TileObject var12 = TileObjects.getNearest((String[])stringArray3);
        if (D.var3(var12)) {
            return var1[2];
        }
        if (D.var13(var12.distanceTo((Locatable)var10), var1[10])) {
            Movement.walkTo((WorldPoint)var6.ab);
            0;
            return var1[5];
        }
        var3_4.interact(var2[var1[11]]);
        return var1[5];
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var2 = new String[var1[12]];
        D.var2[D.var1[2]] = "Broken strut";
        D.var2[D.var1[5]] = "Crate";
        D.var2[D.var1[6]] = "Search";
        D.var2[D.var1[9]] = "Broken strut";
        D.var2[D.var1[11]] = "Hammer";
    }

    private static boolean var13(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[2];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[2];
        while (D.var9(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var23);
    }
}


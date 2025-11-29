/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Walking to boss")
public class WalkingToBossTask
extends WhispererTaskBase {
    private static final  int J;
    private static final  int E;
    private static final  RegionPoint K;
    private static final  int I;
    private static final  int L;
    private static final  int H;
    private static final  int O;
    private static final  WorldPoint C;
    private static final  int P;
    private static final  int F;
    private static final  int G;
    private static final  int N;
    private static final  int M;
    private static final  WorldPoint D;

    static {
        l.var3();
        l.var4();
        L = 1;
        E = 2;
        P = var1[16];
        J = var1[10];
        M = var1[12];
        O = var1[15];
        H = 7;
        I = 9;
        N = var1[18];
        G = 5;
        F = 4;
        C = new WorldPoint(var1[19], var1[20], 0);
        D = new WorldPoint(var1[21], var1[22], 0);
        K = new RegionPoint(var1[23], var1[24], 0, var1[10]);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean p() {
        TileObject var27;
        l var28;
        if ((this.p.b1)) {
            return 0;
        }
        var28.w.b(var28.w.c());
        0;
        if ((var28.p.c2)) {
            int[] nArray = new int[3];
            nArray[0] = 4;
            var27 = TileObjects.getNearest((int[])nArray);
            if var27 != null {
                var27.interact(var2[0]);
                return 3;
            }
        }
        if ((var28.p.c5)) {
            if ((Dialog.isOpen( != 0) ? 1 : 0) && (Dialog.hasOption(StringlIlIllIlIllll[3]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[0] = var2[6];
                Dialog.chooseOption((String[])stringArray);
                0;
                return 3;
            }
            int[] nArray = new int[3];
            nArray[0] = 7;
            var27 = TileObjects.getNearest((int[])nArray);
            if var27 != null {
                var27.interact(var2[8]);
                return 3;
            }
        }
        if (!(var28.p.c(9 == 0) ? 1 : 0) || (var28.p.c(var1[10] != 0) ? 1 : 0)) {
            var27 = var28.p.a(K);
            Movement.setDestination((WorldPoint)var27);
            return 3;
        }
        String[] stringArray = new String[3];
        stringArray[0] = var2[var1[11]];
        if ((Inventory.contains((String[] != 0)stringArray) ? 1 : 0) && (Vars.getBit((int)var1[12]) == 3)) {
            if ((Dialog.isOpen( != 0) ? 1 : 0) && (Dialog.isViewingOptions( != 0) ? 1 : 0)) {
                Dialog.chooseOption((int)var1[11]);
                0;
            }
            String[] stringArray2 = new String[3];
            stringArray2[0] = var2[var1[13]];
            var27 = Inventory.getFirst((String[])stringArray2);
            var27.interact(var2[var1[14]]);
            return 3;
        }
        if ((var28.p.c(var1[15] != 0) ? 1 : 0)) {
            int[] nArray = new int[3];
            nArray[0] = var1[16];
            var27 = TileObjects.getNearest((int[])nArray);
            if var27 != null {
                var27.interact(var2[var1[17]]);
                return 3;
            }
        }
        if (!(C.isInScene(var28.j == 0) ? 1 : 0) || (var28.p.b(var1[18] != 0) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)D);
            0;
            return 3;
        }
        Movement.walkTo((WorldPoint)C);
        0;
        return 3;
    }

    @Override
    public boolean run() {
        if ((this.f.b( != 0) ? 1 : 0)) {
            return 0;
        }
        return this.p();
    }
}


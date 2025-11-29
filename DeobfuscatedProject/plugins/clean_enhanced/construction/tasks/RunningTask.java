/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import gg.squire.construction.tasks.GameEnum13;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Running")
public class RunningTask
extends Task {
    private final  M cc;
    private static  int[] llIlIIIll;
    private final  LureConfig cd;
    private static  String[] llIIlIlll;

    private static void var1() {
        llIIlIlll = new String[llIlIIIll[3]];
        Q.llIIlIlll[Q.llIlIIIll[0]] = "Wield";
        Q.llIIlIlll[Q.llIlIIIll[1]] = "Wield";
    }

    private static boolean var2(Object object) {
        return object == null;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = llIlIIIll[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = llIlIIIll[0];
        while (Q.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        llIlIIIll = new int[4];
        Q.llIlIIIll[0] = (0x13 ^ 0x78 ^ (0x38 ^ 0x42)) & (66 + 179 - 241 + 181 ^ 156 + 58 - 147 + 101 ^ -1);
        Q.llIlIIIll[1] = 1;
        Q.llIlIIIll[2] = 0x80 ^ 0x8F;
        Q.llIlIIIll[3] = 2;
    }

    static {
        Q.var14();
        Q.var1();
    }

    private boolean aN() {
        if (Q.var15(Movement.getRunEnergy(), llIlIIIll[2])) {
            return llIlIIIll[0];
        }
        if (Q.var16(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        return llIlIIIll[0];
    }

    @Inject
    public RunningTask(M m2, LureConfig lureConfig) {
        this.cc = m2;
        this.cd = lureConfig;
    }

    public boolean run() {
        Q var17;
        if (Q.var16(this.cc.aI() ? 1 : 0)) {
            return llIlIIIll[0];
        }
        if (Q.var18(var17.aN() ? 1 : 0)) {
            return llIlIIIll[1];
        }
        Player var19 = Players.getLocal();
        if (Q.var2(var19)) {
            return llIlIIIll[0];
        }
        N var20 = var17.cc.aG();
        if (Q.var2(var17.cc.a(llIlIIIll[0], null))) {
            if (Q.var16(var20.aJ().equals((Object)var19.getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var20.aJ());
                0;
            }
            int[] nArray = new int[llIlIIIll[1]];
            nArray[Q.llIlIIIll[0]] = var17.cd.primaryWeaponID();
            if (Q.var16(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIIll[1]];
                nArray2[Q.llIlIIIll[0]] = var17.cd.primaryWeaponID();
                if (Q.var18(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIlIIIll[1]];
                    nArray3[Q.llIlIIIll[0]] = var17.cd.primaryWeaponID();
                    Inventory.getFirst((int[])nArray3).interact(llIIlIlll[llIlIIIll[0]]);
                }
            }
            if (Q.var18(var17.cd.usingSecondary() ? 1 : 0)) {
                int[] nArray4 = new int[llIlIIIll[1]];
                nArray4[Q.llIlIIIll[0]] = var17.cd.secondaryWeaponID();
                if (Q.var16(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[llIlIIIll[1]];
                    nArray5[Q.llIlIIIll[0]] = var17.cd.secondaryWeaponID();
                    if (Q.var18(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[llIlIIIll[1]];
                        nArray6[Q.llIlIIIll[0]] = var17.cd.secondaryWeaponID();
                        Inventory.getFirst((int[])nArray6).interact(llIIlIlll[llIlIIIll[1]]);
                    }
                }
            }
            return llIlIIIll[0];
        }
        WorldPoint var21 = Movement.getDestination();
        if (Q.var2(var21)) {
            WorldPoint worldPoint;
            if (Q.var18(var19.getWorldLocation().equals((Object)var20.aJ()) ? 1 : 0)) {
                worldPoint = var20.aK();
                0;
                if (1 <= 0) {
                    return ((0x18 ^ 0x7C ^ (0xD8 ^ 0xA2)) & (0x27 ^ 0xA ^ (0x8F ^ 0xBC) ^ -1)) != 0;
                }
            } else {
                worldPoint = var20.aJ();
            }
            Movement.walkTo((WorldPoint)worldPoint);
            0;
            return llIlIIIll[1];
        }
        if (Q.var18(var20.aJ().equals((Object)var21) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var20.aK());
            0;
            0;
            if null != null {
                return ((0x3C ^ 0x57 ^ (0xC6 ^ 0x83)) & (0x1D ^ 0x3D ^ (0x2A ^ 0x24) ^ -1)) != 0;
            }
        } else {
            Movement.walkTo((WorldPoint)var20.aJ());
            0;
        }
        return llIlIIIll[1];
    }

    private static boolean var15(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}


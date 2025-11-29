/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Killing Giant Rats", priority=5001)
public class KillingGiantRatsTask
extends Task {

    private final  SquireScurriusConfig af;
    private final  SquireScurrius ae;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var3;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (t.var4(Static.getClient().getVarbitValue(var1[2]), var1[3])) {
            Prayer[] prayerArray = new Prayer[var1[4]];
            prayerArray[t.var1[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[t.var1[1]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[t.var1[5]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            0;
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            var3.add(Prayer.PIETY);
            0;
        }
        int[] nArray = new int[var1[5]];
        nArray[t.var1[0]] = d.C;
        nArray[t.var1[1]] = d.D;
        Projectile var5 = Projectiles.getNearest((int[])nArray);
        if (t.var6(var5) && t.var7(var5.getRemainingCycles(), var1[6])) {
            if (t.var8(var5.getId(), d.C)) {
                var3.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                0;
                if (2 < 0) {
                    return null;
                }
            } else {
                var3.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if ((136 + 183 - 220 + 89 ^ 144 + 136 - 254 + 158) == -1) {
                    return null;
                }
            }
        } else {
            var3.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    private static void var9() {
        var2 = new String[var1[7]];
        t.var2[t.var1[0]] = "Scurrius";
        t.var2[t.var1[1]] = "Attack";
        t.var2[t.var1[5]] = "Eat";
        t.var2[t.var1[4]] = "Giant rat";
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (t.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var21(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t var22;
        if (t.var23(this.ae.c() ? 1 : 0)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[t.var1[0]] = var2[var1[0]];
        NPC var24 = NPCs.getNearest((String[])stringArray);
        if (t.var23(var22.af.focusRats() ? 1 : 0) && t.var6(var24)) {
            return var1[0];
        }
        Iterator var25 = Static.getClient().getGraphicsObjects().iterator();
        while (t.var26(var25.hasNext() ? 1 : 0)) {
            GraphicsObject var27 = (GraphicsObject)var25.next();
            if (t.var8(var27.getId(), d.B)) {
                return var1[0];
            }
            0;
            if (3 > 0) continue;
            return ((0xF2 ^ 0xB0) & ~(0xEB ^ 0xA9)) != 0;
        }
        var25 = NPCs.getNearest(nPC -> {
            int n2;
            if (t.var26(nPC.getName().equals(var2[var1[4]]) ? 1 : 0) && t.var23(nPC.isDead() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((0xA6 ^ 0xA2) <= 0) {
                    return ((0x5C ^ 0x46) & ~(0x42 ^ 0x58)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (t.var21(var25)) {
            int var27 = Inventory.getCount(item -> {
                String[] stringArray = new String[var1[1]];
                stringArray[t.var1[0]] = var2[var1[5]];
                return item.hasAction(stringArray);
            });
            if (t.var10(var27, var22.af.food())) {
                var22.ae.e(var1[1]);
                return var1[1];
            }
            return var1[0];
        }
        var2_2.interact(var2[var1[1]]);
        return var1[1];
    }

    @Inject
    public KillingGiantRatsTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ae = squireScurrius;
        this.af = squireScurriusConfig;
    }

    private static void var28() {
        var1 = new int[8];
        t.var1[0] = (0x8B ^ 0x9A) & ~(3 ^ 0x12);
        t.var1[1] = 1;
        t.var1[2] = -(0xFFFFFEAF & 0x717B) & (0xFFFFFFEF & 0x7F7F);
        t.var1[3] = 0x10 ^ 0x79 ^ (0x2A ^ 0x4B);
        t.var1[4] = 3;
        t.var1[5] = 2;
        t.var1[6] = 0xB0 ^ 0xAE;
        t.var1[7] = 0x9D ^ 0x99;
    }

    private static boolean var26(int n2) {
        return n2 != 0;
    }

    static {
        t.var28();
        t.var9();
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }
}


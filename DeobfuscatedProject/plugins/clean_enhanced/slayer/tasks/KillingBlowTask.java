/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.NPCManager
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import com.openosrs.client.game.NPCManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Killing Blow", blocking=true)
public class KillingBlowTask
extends Task {
    
    private final  SquireSkipperPlugin H;
    
    private final  NPCManager I;

    private static boolean var3(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        l var4;
        if (l.var5(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        b var6 = var4.H.b();
        if (l.var7((Object)var6, (Object)b.LIZARDS)) {
            return var1[0];
        }
        List var8 = NPCs.getAll(nPC -> {
            int n2;
            if (l.var9(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[var1[1]];
                stringArray[l.var1[0]] = var2[var1[0]];
                if (l.var10(nPC.hasAction(stringArray) ? 1 : 0) && l.var11(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), var1[4])) {
                    n2 = var1[1];
                    0;
                    if (((0xB0 ^ 0x98 ^ (0x82 ^ 0x8A)) & (87 + 52 - 124 + 146 ^ 66 + 40 - 93 + 116 ^ -1)) == 0) return n2 != 0;
                    return ((0x1D ^ 0x31 ^ (0x34 ^ 0x31)) & (91 + 2 - 64 + 99 ^ 13 + 168 - 113 + 101 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        int[] nArray = new int[var1[1]];
        nArray[l.var1[0]] = var1[2];
        Item var12 = Inventory.getFirst((int[])nArray);
        if (l.var13(var8.isEmpty() ? 1 : 0)) {
            Iterator var14 = var8.iterator();
            while (l.var10(var14.hasNext() ? 1 : 0)) {
                NPC var15 = (NPC)var14.next();
                int var16 = var4.b(var15);
                if (l.var3(var16, var1[3]) && l.var11(var16, var1[1])) {
                    System.out.println(var16);
                    NPC var17 = (NPC)var8.get(var1[0]);
                    if (l.var18(var12) && l.var9(Players.getLocal().getInteracting(), var17)) {
                        var12.useOn((Actor)var17);
                        var4.sleep(var1[4]);
                        return var1[1];
                    }
                }
                0;
                if (1 == 1) continue;
                return ((0x44 ^ 0x32 ^ (0xB4 ^ 0x97)) & (0x85 ^ 0xAA ^ (0x5E ^ 0x24) ^ -1)) != 0;
            }
        }
        return var1[0];
    }

    static {
        l.var19();
        l.var20();
    }

    private static boolean var11(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var21(int n2) {
        return n2 >= 0;
    }

    private static void var20() {
        var2 = new String[var1[1]];
        l.var2[l.var1[0]] = "Attack";
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var7(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var28(int n2) {
        return n2 <= 0;
    }

    /*
     * WARNING - void declaration
     */
    private int b(NPC nPC) {
        void var2_2;
        void var3_3;
        void var4_4;
        l var29;
        void var30;
        if (!l.var18(nPC) || l.var5(nPC.getName())) {
            return var1[3];
        }
        int var31 = var30.getHealthScale();
        int var32 = var30.getHealthRatio();
        Integer var33 = var29.I.getHealth(var30.getId());
        if (!l.var21(var32) || l.var28(var31)) {
            return var1[3];
        }
        return (int)((float)(var4_4.intValue() * var3_3 / var2_2) + 0.5f);
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static boolean var9(Object object, Object object2) {
        return object == object2;
    }

    private static void var19() {
        var1 = new int[7];
        l.var1[0] = (0x1C ^ 0x69 ^ (0xE4 ^ 0x96)) & (0x88 ^ 0x95 ^ (0x4D ^ 0x57) ^ -1);
        l.var1[1] = 1;
        l.var1[2] = -(0xFFFFE777 & 0x7DDD) & (0xFFFFFFFE & 0x7F7D);
        l.var1[3] = -1;
        l.var1[4] = 0xBF ^ 0xBB;
        l.var1[5] = 0x4E ^ 0x6A ^ (0x7F ^ 0x53);
        l.var1[6] = 2;
    }

    @Inject
    public KillingBlowTask(SquireSkipperPlugin squireSkipperPlugin, NPCManager nPCManager) {
        this.H = squireSkipperPlugin;
        this.I = nPCManager;
    }

    private static boolean var18(Object object) {
        return object != null;
    }
}


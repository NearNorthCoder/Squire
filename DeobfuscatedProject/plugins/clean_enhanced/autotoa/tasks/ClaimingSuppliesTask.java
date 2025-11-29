/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Claiming supplies", priority=50, blocking=true)
public class ClaimingSuppliesTask
extends AutotoaManager {
    @Inject
    protected  TOAConfig d;
    private  boolean hJ;
    private final  C hI;
    private static final  int hF;
    
    @Inject
    protected  z cV;
    private final  B hH;
    
    private static final  int[] hG;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static void var10() {
        var2 = new String[var1[9]];
        cb.var2[cb.var1[0]] = "Helpful Spirit";
        cb.var2[cb.var1[1]] = "Eat";
        cb.var2[cb.var1[3]] = "Choose";
        cb.var2[cb.var1[4]] = "Claim";
        cb.var2[cb.var1[5]] = "Eat";
    }

    static {
        cb.var11();
        cb.var10();
        hF = var1[2];
        int[] nArray = new int[var1[4]];
        nArray[cb.var1[0]] = var1[6];
        nArray[cb.var1[1]] = var1[7];
        nArray[cb.var1[3]] = var1[8];
        hG = nArray;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static void var11() {
        var1 = new int[11];
        cb.var1[0] = (219 + 137 - 205 + 91 ^ 7 + 158 - 119 + 148) & (2 ^ (0x2D ^ 0x1F) ^ -1);
        cb.var1[1] = 1;
        cb.var1[2] = -(0xFFFFEF3D & 0x54D7) & (0xFFFFF77D & 0x4F9F);
        cb.var1[3] = 2;
        cb.var1[4] = 3;
        cb.var1[5] = 0x2E ^ 0x2A;
        cb.var1[6] = 0x4E ^ 0x6B ^ (0x11 ^ 0x32);
        cb.var1[7] = 0xA1 ^ 0xA8;
        cb.var1[8] = 0x50 ^ 0x5C;
        cb.var1[9] = 0x64 ^ 0x61;
        cb.var1[10] = 0x80 ^ 0x88;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        Widget var20;
        int llllllllllllllllIIlIllIllIllIIIl2;
        int n2;
        cb var21;
        if (cb.var12(this.bb() ? 1 : 0)) {
            this.hJ = var1[0];
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[cb.var1[0]] = var2[var1[0]];
        NPC var22 = NPCs.getNearest((String[])stringArray);
        if (cb.var9(var22)) {
            return var1[0];
        }
        if (cb.var23(var21.hJ)) {
            return var1[0];
        }
        if (cb.var23(Inventory.isFull() ? 1 : 0)) {
            if (cb.var23(var21.cV.c(var21.cV.a(var21.d.meleeGearAkkha())) ? 1 : 0)) {
                return var1[1];
            }
            Item llllllllllllllllIIlIllIllIllIIIl2 = Inventory.getFirst(item -> item.hasAction(var2[var1[5]]::equals));
            if (cb.var24(llllllllllllllllIIlIllIllIllIIIl2)) {
                llllllllllllllllIIlIllIllIllIIIl2.interact(var2[var1[1]]);
                return var1[1];
            }
            var21.bh();
            return var1[1];
        }
        if (!cb.var12(var21.hI.av().containsKey((Object)e.LIQUID_ADRENALINE) ? 1 : 0) || cb.var23(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (3 == -1) {
                return ((0x2D ^ 0x69) & ~(0x7C ^ 0x38)) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlIllIllIllIIIl2 = var1[0];
        }
        if (cb.var23(var21.d.dehydration() ? 1 : 0)) {
            llllllllllllllllIIlIllIllIllIIIl2 = var1[0];
        }
        if (cb.var23(Widgets.isVisible((Widget)(var20 = Widgets.get((int)var1[2], (int)hG[var1[0]]))) ? 1 : 0)) {
            int n3;
            if (cb.var23(llllllllllllllllIIlIllIllIllIIIl2)) {
                n3 = hG[var1[0]];
                0;
                if (3 > (56 + 70 - 73 + 140 ^ 105 + 17 - -60 + 15)) {
                    return ((0xFF ^ 0x9F ^ (0x6F ^ 0x30)) & (64 + 89 - 128 + 128 ^ 6 + 157 - 162 + 165 ^ -1)) != 0;
                }
            } else {
                n3 = hG[var1[3]];
            }
            int var25 = n3;
            Widgets.get((int)var1[2], (int)var25).interact(var2[var1[3]]);
            var21.hI.a(Widgets.get((int)var1[2], (int)(var25 - var1[3])));
            var21.hJ = var1[1];
            return var1[1];
        }
        var1_1.interact(var2[var1[4]]);
        return var1[1];
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var1[0];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var1[0];
        while (cb.var13(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if ((0x17 ^ 0x13) > -1) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ClaimingSuppliesTask(Client client, B b2, C c2) {
        super(client);
        this.hJ = var1[0];
        this.hH = b2;
        this.hI = c2;
    }

    private static boolean var24(Object object) {
        return object != null;
    }
}


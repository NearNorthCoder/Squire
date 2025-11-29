/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Attacking final warden", priority=40)
public class AttackingFinalWardenTask
extends AutotoaManager {
    private final  C gL;

    private  boolean gM;
    private final  y gK;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        int n2;
        boolean bl2;
        void var3;
        bL var4;
        int[] nArray = new int[var2[1]];
        nArray[bL.var2[0]] = var2[2];
        nArray[bL.var2[3]] = var2[4];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bL.var5(nPC)) {
            return var2[0];
        }
        if (bL.var6(var4.cq() ? 1 : 0)) {
            if (bL.var7(var4.gM)) {
                var4.gM = var2[3];
                var4.gK.h(var2[0]);
            }
            if (bL.var7(var4.gL.as() ? 1 : 0)) {
                return var2[0];
            }
        }
        int n3 = var3.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation());
        if (!bL.var6(var4.cq() ? 1 : 0) || bL.var6(n3)) {
            bl2 = var2[3];
            0;
            
        } else {
            bl2 = var2[0];
        }
        boolean var8 = bl2;
        var4.a((NPC)var3, var8);
        0;
        var3.interact(var1[var2[0]]);
        Item var9 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bL.var6(var4.cq() ? 1 : 0)) {
            n2 = var2[3];
            0;
            if (((0xB2 ^ 0xA2) & ~(0x8B ^ 0x9B)) == 2) {
                return ((0x95 ^ 0xBF) & ~(0xA0 ^ 0x8A)) != 0;
            }
        } else if (bL.var10(var9) && bL.var6(var4.Q(var9) ? 1 : 0)) {
            n2 = var2[5];
            0;
            if (-2 >= 0) {
                return ((0xDA ^ 0xAE ^ (0xD9 ^ 0xA7)) & (0x70 ^ 0x13 ^ (8 ^ 0x61) ^ -1)) != 0;
            }
        } else {
            n2 = var2[6];
        }
        var4.sleep(n2);
        return var2[3];
    }

    private static void var11() {
        var1 = new String[var2[5]];
        bL.var1[bL.var2[0]] = "Attack";
        bL.var1[bL.var2[3]] = "shadow";
        bL.var1[bL.var2[1]] = "twisted bow";
        bL.var1[bL.var2[6]] = "fang";
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        bL.var18();
        bL.var11();
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private boolean Q(Item item) {
        int n2;
        String string = item.getName().toLowerCase();
        if (!bL.var7(string.contains(var1[var2[3]]) ? 1 : 0) || !bL.var7(string.contains(var1[var2[1]]) ? 1 : 0) || bL.var6(string.contains(var1[var2[6]]) ? 1 : 0)) {
            n2 = var2[3];
            0;
            if (-1 >= 2) {
                return ((0x28 ^ 0x42 ^ (0x1E ^ 0x29)) & (0x65 ^ 0x25 ^ (0x70 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    private static void var18() {
        var2 = new int[9];
        bL.var2[0] = (0x3B ^ 0x27 ^ (0xAA ^ 0x83)) & (0xB3 ^ 0x92 ^ (0x14 ^ 0) ^ -1);
        bL.var2[1] = 2;
        bL.var2[2] = 0xFFFFBFFB & 0x6DF5;
        bL.var2[3] = 1;
        bL.var2[4] = 0xFFFFBFFF & 0x6DF2;
        bL.var2[5] = 0x5C ^ 0x58;
        bL.var2[6] = 3;
        bL.var2[7] = 0x95 ^ 0xA7;
        bL.var2[8] = 0x8E ^ 0xAE ^ (0x8F ^ 0xA7);
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.gM = var2[0];
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    protected AttackingFinalWardenTask(Client client, z z2, TOAConfig tOAConfig, y y2, C c2) {
        super(client, z2, tOAConfig);
        this.gM = var2[0];
        this.gK = y2;
        this.gL = c2;
    }

    @Override
    public int bt() {
        int n2;
        if (bL.var6(this.cq() ? 1 : 0)) {
            n2 = var2[7];
            0;
            if null != null {
                return (62 + 126 - 187 + 153 ^ 143 + 65 - 68 + 33) & (0x6B ^ 0x36 ^ (0x7A ^ 0x10) ^ -1);
            }
        } else {
            n2 = var2[3];
        }
        return n2;
    }
}


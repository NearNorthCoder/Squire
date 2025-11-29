/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking mage scarab", priority=25, blocking=true)
public class AttackingMageScarabTask
extends AutotoaManager {

    private static void var3() {
        var1 = new String[var2[2]];
        ba.var1[ba.var2[0]] = "Attack";
        ba.var1[ba.var2[1]] = "Arcane Scarab";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    protected AttackingMageScarabTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        ba.var12();
        ba.var3();
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriMager();
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    private static void var12() {
        var2 = new int[3];
        ba.var2[0] = (0x21 ^ 0x64) & ~(0x7A ^ 0x3F);
        ba.var2[1] = 1;
        ba.var2[2] = 2;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[0];
        while (ba.var13(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (((0xCC ^ 0x98) & ~(0x3E ^ 0x6A)) < (0x38 ^ 0x3C)) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var26;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (ba.var5(nPC.getName().equals(var1[var2[1]]) ? 1 : 0) && ba.var15(nPC.isDead() ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (((44 + 162 - 194 + 202 ^ 36 + 6 - -27 + 65) & (123 + 89 - 190 + 186 ^ 98 + 42 - 57 + 45 ^ -1)) > 0) {
                    return ((39 + 3 - -9 + 93 ^ 42 + 61 - 28 + 61) & (0x2F ^ 0x10 ^ (0x61 ^ 0x46) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (ba.var4(nPC2)) {
            return var2[0];
        }
        Actor var27 = Players.getLocal().getInteracting();
        if (ba.var14(var27) && ba.var5(var27.equals(var26) ? 1 : 0)) {
            return var2[1];
        }
        this.bp();
        nPC2.interact(var1[var2[0]]);
        return var2[1];
    }
}


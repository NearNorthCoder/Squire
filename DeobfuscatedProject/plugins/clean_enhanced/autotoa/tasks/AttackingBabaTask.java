/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking baba")
public class AttackingBabaTask
extends AutotoaManager {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var2 = new int[6];
        aL.var2[0] = (0x62 ^ 0x40 ^ (0x3A ^ 6)) & (2 ^ 0x67 ^ (0xEE ^ 0x95) ^ -1);
        aL.var2[1] = 0xFFFFEF8F & 0x3E74;
        aL.var2[2] = 1;
        aL.var2[3] = 0x43 ^ 0x47;
        aL.var2[4] = 2;
        aL.var2[5] = 0xB8 ^ 0xB0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        aL.var4();
        aL.var11();
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static void var11() {
        var1 = new String[var2[4]];
        aL.var1[aL.var2[0]] = "Attack";
        aL.var1[aL.var2[2]] = "Boulder";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        aL var13;
        if (aL.var3(this.cW.redX() ? 1 : 0)) {
            return var2[0];
        }
        NPC var14 = var13.bB();
        if (aL.var12(var14)) {
            return var2[0];
        }
        if (aL.var15(var14.getId(), var2[1])) {
            return var2[0];
        }
        if (aL.var16(NPCs.getNearest(nPC -> {
            int n2;
            if (aL.var3(nPC.getName().equals(var1[var2[2]]) ? 1 : 0) && aL.var17(nPC.distanceTo((Locatable)Players.getLocal()), var2[3])) {
                n2 = var2[2];
                0;
                if (-(0x61 ^ 9 ^ (0x5D ^ 0x30)) >= 0) {
                    return ((40 + 111 - -6 + 72 ^ 22 + 68 - -54 + 17) & (0xFE ^ 0x86 ^ (0xB9 ^ 0x85) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }))) {
            return var2[0];
        }
        this.a((NPC)var1_1, var2[2]);
        0;
        var1_1.interact(var1[var2[0]]);
        return var2[2];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    @Inject
    protected AttackingBabaTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }
}


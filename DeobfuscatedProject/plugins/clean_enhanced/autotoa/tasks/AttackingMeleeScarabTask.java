/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@Singleton
@TaskDesc(name="Attacking melee scarab", priority=16, blocking=true)
public class AttackingMeleeScarabTask
extends AutotoaManager {
    
    private  boolean eC;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        if (bb.var3(this.eC)) {
            configStorageBox = this.cW.kephriMelee();
            0;
            if (3 < 0) {
                return null;
            }
        } else {
            bb var4;
            configStorageBox = var4.cW.kephriRanger();
        }
        return configStorageBox;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (bb.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((0xA4 ^ 0xB9 ^ (0x71 ^ 0x2E)) & (0x5B ^ 0x4D ^ (0xD3 ^ 0x87) ^ -1)) >= -1) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void var17() {
        var1 = new String[var2[5]];
        bb.var1[bb.var2[0]] = "Soldier Scarab";
        bb.var1[bb.var2[2]] = "Attack";
        bb.var1[bb.var2[3]] = "Spitting Scarab";
        bb.var1[bb.var2[4]] = "Soldier Scarab";
    }

    static {
        bb.var18();
        bb.var17();
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    @Inject
    protected AttackingMeleeScarabTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, null);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        Actor llllllllllllllllIlIIlllIIlIlllll2;
        Object var33;
        bb var34;
        void var35;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bb.var3(List.of(var1[var2[3]], var1[var2[4]]).contains(nPC.getName()) ? 1 : 0) && bb.var19(nPC.isDead() ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (((0xBF ^ 0xA0 ^ (0x57 ^ 0x67)) & (83 + 22 - -126 + 2 ^ 10 + 47 - -110 + 31 ^ -1)) > 0) {
                    return ((2 + 108 - 48 + 134 ^ 95 + 127 - 86 + 17) & (64 + 93 - 116 + 172 ^ 76 + 27 - 78 + 111 ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (bb.var5(nPC2)) {
            return var2[0];
        }
        var34.eC = var35.getName().equals(var1[var2[0]]);
        if (bb.var19(Reachable.isInteractable((Locatable)var35) ? 1 : 0)) {
            int llllllllllllllllIlIIlllIIlIlllll2 = var2[0];
            var33 = var34.cV.a(var34.br());
            int var36 = ((Object)var33).length;
            int var37 = var2[0];
            while (bb.var15(var37, var36)) {
                Object var38 = var33[var37];
                if (bb.var39((int)var38, var2[1])) {
                    llllllllllllllllIlIIlllIIlIlllll2 = var2[2];
                }
                ++var37;
                0;
                if (-2 < 0) continue;
                return ((3 ^ 0x55 ^ (0x42 ^ 0x1A)) & (12 + 52 - 11 + 78 ^ 84 + 8 - -10 + 39 ^ -1)) != 0;
            }
            if (bb.var19(llllllllllllllllIlIIlllIIlIlllll2)) {
                return var2[0];
            }
        }
        if (bb.var20(llllllllllllllllIlIIlllIIlIlllll2 = Players.getLocal().getInteracting()) && bb.var3(llllllllllllllllIlIIlllIIlIlllll2.equals(var35) ? 1 : 0)) {
            return var2[2];
        }
        var33 = var34.bU();
        WorldPoint var36 = Players.getLocal().getWorldLocation();
        if (bb.var19(var33.isEmpty() ? 1 : 0) && (!bb.var19(var33.contains(var36) ? 1 : 0) || bb.var19(var35.getWorldArea().isInMeleeDistance(var36) ? 1 : 0))) {
            return var2[2];
        }
        this.bp();
        nPC2.interact(var1[var2[2]]);
        return var2[2];
    }

    private static void var18() {
        var2 = new int[7];
        bb.var2[0] = (0xA2 ^ 0xBA) & ~(0x84 ^ 0x9C);
        bb.var2[1] = -(0xFFFFBE77 & 0x459D) & (0xFFFFFFFF & 0x6E9F);
        bb.var2[2] = 1;
        bb.var2[3] = 2;
        bb.var2[4] = 3;
        bb.var2[5] = 36 + 104 - -32 + 2 ^ 64 + 129 - 177 + 154;
        bb.var2[6] = 0x9F ^ 0xBD ^ (0x6B ^ 0x41);
    }

    private static boolean var39(int n2, int n3) {
        return n2 == n3;
    }
}


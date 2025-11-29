/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
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
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
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

@TaskDesc(name="Dodging volatile baboon", priority=100, blocking=true)
public class DodgingVolatileBaboonTask
extends AutotoaManager {

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[1];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[1];
        while (aX.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 <= ((0xA1 ^ 0x9C) & ~(0xB ^ 0x36))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    private static void var15() {
        var1 = new String[var2[3]];
        aX.var1[aX.var2[1]] = "Volatile Baboon";
        aX.var1[aX.var2[0]] = "No safe spot found, tanking baboon";
        aX.var1[aX.var2[5]] = "Volatile Baboon";
    }

    private static boolean var16(int n2, int n3) {
        return n2 <= n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var3_3;
        aX var24;
        void var25;
        String[] stringArray = new String[var2[0]];
        stringArray[aX.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aX.var23(nPC)) {
            return var2[1];
        }
        if (aX.var14(var25.getAnimation(), var2[2])) {
            return var2[1];
        }
        WorldPoint var26 = Players.getLocal().getWorldLocation();
        if (aX.var27(var26.distanceTo((Locatable)var25), var2[3])) {
            return var2[1];
        }
        WorldPoint var28 = var26.toWorldArea().offset(var2[4]).toWorldPointList().stream().filter(worldPoint -> {
            String[] stringArray = new String[var2[0]];
            stringArray[aX.var2[1]] = var1[var2[5]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl2;
                if (aX.var29(nPC.getAnimation(), var2[2])) {
                    bl2 = var2[0];
                    0;
                    if (1 <= -1) {
                        return ((0x83 ^ 0x8B) & ~(0x39 ^ 0x31)) != 0;
                    }
                } else {
                    bl2 = var2[1];
                }
                return bl2;
            }).noneMatch(nPC -> {
                boolean bl2;
                if (aX.var16(nPC.getWorldLocation().distanceTo(worldPoint), var2[5])) {
                    bl2 = var2[0];
                    0;
                    
                } else {
                    bl2 = var2[1];
                }
                return bl2;
            });
        }).filter(worldPoint -> {
            boolean bl2;
            if (aX.var30(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = var2[0];
                0;
                if (-2 > 0) {
                    return ((35 + 66 - 88 + 158 ^ 143 + 4 - 58 + 73) & (35 + 52 - 71 + 127 ^ 89 + 85 - 169 + 129 ^ -1) & ((0x3A ^ 0x77 ^ (0x73 ^ 0xB)) & (51 + 146 - 145 + 111 ^ 115 + 87 - 178 + 126 ^ -1) ^ -1)) != 0;
                }
            } else {
                bl2 = var2[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var26))).orElse(null);
        if (aX.var23(var28)) {
            Log.info((String)var1[var2[0]]);
            return var2[1];
        }
        this.g((WorldPoint)var3_3);
        return var2[0];
    }

    private static boolean var27(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected DodgingVolatileBaboonTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var31() {
        var2 = new int[7];
        aX.var2[0] = 1;
        aX.var2[1] = (1 + 17 - -85 + 57 ^ 101 + 1 - 63 + 98) & (0x87 ^ 0xAD ^ 3 ^ -1);
        aX.var2[2] = -1;
        aX.var2[3] = 3;
        aX.var2[4] = 0x48 ^ 0x6E ^ (0x11 ^ 0x32);
        aX.var2[5] = 2;
        aX.var2[6] = 0xB0 ^ 0xB8;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var30(int n2) {
        return n2 == 0;
    }

    private static boolean var29(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aX.var31();
        aX.var15();
    }
}


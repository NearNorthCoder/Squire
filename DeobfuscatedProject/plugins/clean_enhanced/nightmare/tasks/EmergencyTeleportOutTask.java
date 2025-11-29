/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Emergency Teleport out", priority=0x7FFFFFFF)
public class EmergencyTeleportOutTask
extends Task {
    private static final  Logger da;
    
    private final  h de;
    private static final  int db;
    
    private final  SquireNightmareConfig dd;
    private final  SquireNightmarePlugin dc;

    private static void var3() {
        var2 = new String[var1[13]];
        G.var2[G.var1[0]] = "Disturb";
        G.var2[G.var1[2]] = "[EmergencyTeleport]: Teleporting out because we're below {} hp and there's a DANGEROUS SLEEPWALKER ascending.";
        G.var2[G.var1[6]] = "[EmergencyTeleport]: We're out of food and we're not even in the final phase, teleporting out.";
        G.var2[G.var1[1]] = "NO PRAYER; emergency teleporting out to bank";
        G.var2[G.var1[7]] = "prayer";
        G.var2[G.var1[8]] = "restore";
        G.var2[G.var1[9]] = "sanfew";
        G.var2[G.var1[10]] = "Sleepwalker";
        G.var2[G.var1[12]] = "Eat";
    }

    private static void var4() {
        var1 = new int[14];
        G.var1[0] = (0x4D ^ 0x47 ^ (0x64 ^ 0x38)) & (0xD3 ^ 0xA0 ^ (0x23 ^ 6) ^ -1);
        G.var1[1] = 3;
        G.var1[2] = 1;
        G.var1[3] = 0xFFFFB7BD & 0x69E6;
        G.var1[4] = -(0xFFFFCC37 & 0x7FEB) & (0xFFFFEDBF & 0x7FFE);
        G.var1[5] = 0xFFFFBB92 & 0x6FFF;
        G.var1[6] = 2;
        G.var1[7] = 0x9A ^ 0x89 ^ (0x5C ^ 0x4B);
        G.var1[8] = 112 + 77 - 149 + 157 ^ 80 + 127 - 98 + 83;
        G.var1[9] = 0x5B ^ 0x12 ^ (0x46 ^ 9);
        G.var1[10] = 0xA2 ^ 0xB9 ^ (0x6B ^ 0x77);
        G.var1[11] = -(0xFFFFFFA9 & 0x48D7) & (0xFFFFEFFB & 0x79FF);
        G.var1[12] = 0x5E ^ 0x56;
        G.var1[13] = 82 + 40 - 28 + 48 ^ 77 + 126 - 125 + 57;
    }

    private static boolean var5(int n2) {
        return n2 <= 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (G.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    private static boolean var25(int n2) {
        return n2 == 0;
    }

    static {
        G.var4();
        G.var3();
        db = var1[3];
        da = LoggerFactory.getLogger(EmergencyTeleportOutTask.class);
    }

    public boolean run() {
        G var26;
        if (G.var27(this.dd.assistantMode() ? 1 : 0)) {
            return var1[0];
        }
        if (G.var25(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (G.var28(Players.getLocal().getWorldLocation().getPlane(), var1[1])) {
            return var1[0];
        }
        if (G.var27(var26.dc.s() ? 1 : 0)) {
            return var1[0];
        }
        NPC var29 = SquireNightmarePlugin.d();
        if (G.var24(var29)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[2]];
        stringArray[G.var1[0]] = var2[var1[0]];
        if (G.var27(var29.hasAction(stringArray) ? 1 : 0)) {
            return var1[0];
        }
        if (G.var30(var29.getAnimation(), var1[3])) {
            return var1[0];
        }
        if (G.var30(var29.getAnimation(), var1[4])) {
            return var1[0];
        }
        if (G.var27(var29.isDead() ? 1 : 0)) {
            return var1[0];
        }
        int var31 = Inventory.getCount((boolean)var1[2], item -> {
            String[] stringArray = new String[var1[2]];
            stringArray[G.var1[0]] = var2[var1[12]];
            return item.hasAction(stringArray);
        });
        if (G.var12(Combat.getCurrentHealth(), var26.dd.hpToTeleportOut()) && G.var5(var31)) {
            if (G.var30(var29.getId(), var1[5])) {
                NPC var32 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (G.var27(nPC.getName().equals(var2[var1[10]]) ? 1 : 0) && G.var30(nPC.getAnimation(), var1[11])) {
                        n2 = var1[2];
                        0;
                        if (((0xAD ^ 0xA4 ^ (0x8D ^ 0x9B)) & (0x24 ^ 0x1F ^ (3 ^ 0x27) ^ -1)) == -1) {
                            return ((126 + 32 - 103 + 90 ^ 0 + 18 - -32 + 131) & (131 + 162 - 264 + 160 ^ 119 + 15 - 62 + 81 ^ -1)) != 0;
                        }
                    } else {
                        n2 = var1[0];
                    }
                    return n2 != 0;
                });
                if (G.var33(var32)) {
                    Log.warn((String)var2[var1[2]]);
                    return var26.dc.m();
                }
                return var1[0];
            }
            Log.warn((String)var2[var1[6]]);
            return var26.dc.m();
        }
        Item var32 = Inventory.getFirst(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!G.var25(string.contains(var2[var1[7]]) ? 1 : 0) || !G.var25(string.contains(var2[var1[8]]) ? 1 : 0) || G.var27(string.contains(var2[var1[9]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if ((2 & ~2) != 0) {
                    return ((0x6A ^ 0x31) & ~(0xD8 ^ 0x83)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (G.var24(var32) && G.var5(Skills.getBoostedLevel((SkiSkill.PRAYER)) && G.var28(var29.getId(), var1[5])) {
            Log.warn((String)var2[var1[1]]);
            return var26.dc.m();
        }
        return var1[0];
    }

    private static boolean var30(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var28(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public EmergencyTeleportOutTask(SquireNightmarePlugin squireNightmarePlugin, SquireNightmareConfig squireNightmareConfig, h h2) {
        this.dc = squireNightmarePlugin;
        this.dd = squireNightmareConfig;
        this.de = h2;
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean var27(int n2) {
        return n2 != 0;
    }

    private static boolean var33(Object object) {
        return object != null;
    }
}


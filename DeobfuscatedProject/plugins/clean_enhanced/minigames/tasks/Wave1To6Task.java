/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@TaskDesc(name="wave 1 to 6 Task", priority=10)
public class Wave1To6Task
extends Task {

    private final  f aA;
    private final  SquireFightCavesConfig aB;
    private final  n aC;

    @Inject
    public Wave1To6Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aA = f2;
        this.aB = squireFightCavesConfig;
        this.aC = n2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if ((0x6E ^ 0x15 ^ (0x25 ^ 0x5B)) > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public boolean run() {
        int n2 = f.p();
        if (!(n2 <= 0) || (Static.getClient( == 0).isInInstancedRegion() ? 1 : 0)) {
            return 1;
        }
        SquireFightCavesPlugin.f = 2;
        NPC var19 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var20;
            if ((!(nPC.getId() != var1[10]) || (nPC.getId() == var1[11])) && (var20.isDead( == 0) ? 1 : 0)) {
                bl = 2;
                0;
                if null != null {
                    return ((0x1A ^ 0x28 ^ 3) & (0x80 ^ 0xB4 ^ (0x31 ^ 0x34) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        NPC var21 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var22;
            if ((!(nPC.getId() != 8) || (nPC.getId() == 9)) && (var22.isDead( == 0) ? 1 : 0)) {
                bl = 2;
                0;
                if (((0xF9 ^ 0xB4) & ~(0x2C ^ 0x61)) != 0) {
                    return ((0xAB ^ 0x96) & ~(0xB2 ^ 0x8F)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        NPC var23 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getId() == 7) && (nPC.isDead( == 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (2 == (0x42 ^ 0x4E ^ (0x59 ^ 0x51))) {
                    return ((87 + 132 - 160 + 187 ^ 65 + 84 - 110 + 124) & (0x8E ^ 0xC7 ^ (0x30 ^ 0x2C) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if (var19 != null && (!(Players.getLocal( != null).getInteracting()) || (Players.getLocal( != null).getInteracting()) && (Players.getLocal().getInteracting().getName() != Players.getLocal().getInteracting().getName()2))) && (var19.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[1];
            var19.interact(var2[2]);
            return 1;
        }
        if (var23 != null && (Players.getLocal( == null).getInteracting()) && (var23.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[3];
            var23.interact(var2[4]);
            return 1;
        }
        if (var21 != null && (Players.getLocal( == null).getInteracting()) && (var21.isDead( == 0) ? 1 : 0)) {
            SquireFightCavesPlugin.h = var2[5];
            var21.interact(var2[6]);
            return 1;
        }
        return 1;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

}


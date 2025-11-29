/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Drinking boost", priority=9999)
public class DrinkingBoostTask
extends Task {
    private final  SquireDukeSucellus aK;

    private final  SquireDukeSucellusConfig aL;
    private final  Client aJ;

    public boolean run() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(var1[0]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[2];
                if ((nPC.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (((0xB9 ^ 0x85) & ~(0x4D ^ 0x71)) <= 0) return n2 != 0;
                    return ((0x9E ^ 0xAB) & ~(0x2C ^ 0x19)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if nPC2 == null {
            return 0;
        }
        return Combat.drinkBoostingPotion((int)1);
    }

    @Inject
    public DrinkingBoostTask(Client client, SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aJ = client;
        this.aK = squireDukeSucellus;
        this.aL = squireDukeSucellusConfig;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }
}


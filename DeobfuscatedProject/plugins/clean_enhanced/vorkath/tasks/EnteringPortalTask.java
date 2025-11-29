/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;

@TaskDesc(name="Entering portal", priority=1000, blocking=true)
public class EnteringPortalTask
extends BankingTask {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    @Inject
    protected EnteringPortalTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var2[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var2[0];
        while (p.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if ((0x6F ^ 1 ^ (0xF2 ^ 0x99)) > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var1_1;
        p var18;
        if (!p.var6(this.bU.c() ? 1 : 0) || p.var6(this.R() ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[p.var2[0]] = var2[2];
        TileObject var19 = TileObjects.getNearest((int[])nArray);
        if (p.var4(var19)) {
            return var2[0];
        }
        BankLoadout var20 = var18.T();
        if (p.var3(var20.needsToBank() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var21(Combat.getMissingHealth()) && p.var5(Skills.getBoostedLevel((SkiSkill.PRAYER), Skills.getLevel((SkiSkill.PRAYER))) {
            var18.bU.a(var2[0]);
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[1];
    }

    private static boolean var21(int n2) {
        return n2 <= 0;
    }

    private static void var22() {
        var1 = new String[var2[1]];
        p.var1[p.var2[0]] = "Enter";
    }

    @Override
    public boolean Q() {
        return var2[0];
    }

    private static void var23() {
        var2 = new int[3];
        p.var2[0] = (0x80 ^ 0xA7) & ~(0x34 ^ 0x13);
        p.var2[1] = 1;
        p.var2[2] = 0xFFFFFF7F & 0x6895;
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    static {
        p.var23();
        p.var22();
    }
}


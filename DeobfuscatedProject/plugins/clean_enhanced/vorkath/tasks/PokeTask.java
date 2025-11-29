/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Poke", priority=250, blocking=true)
public class PokeTask
extends VorkathManager {

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new String[var2[1]];
        z.var1[z.var2[0]] = "Poke";
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (z.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Override
    public boolean Q() {
        z var16;
        NPC nPC = this.cg.c(var2[0]);
        if (z.var3(nPC)) {
            return var2[0];
        }
        if (z.var17(var16.V() ? 1 : 0)) {
            var16.x.a(var2[1]);
            return var2[0];
        }
        if (z.var18(Players.getLocal().isMoving() ? 1 : 0)) {
            return var2[0];
        }
        nPC.interact(var1[var2[0]]);
        return var2[1];
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static void var19() {
        var2 = new int[2];
        z.var2[0] = (0x94 ^ 0x8C) & ~(2 ^ 0x1A);
        z.var2[1] = 1;
    }

    @Inject
    protected PokeTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.var19();
        z.var4();
    }
}


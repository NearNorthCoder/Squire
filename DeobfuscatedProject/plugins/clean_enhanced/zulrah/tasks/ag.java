/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

public abstract class ag
extends Task {
    protected final  SquireZulrahConfig aC;
    @Inject
    protected  SquireZulrah E;

    private final  Client aD;

    public abstract boolean ac();

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
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        if ((this.ag( == 0) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        NPC var13 = NPCs.getNearest((String[])stringArray);
        if var13 != null {
            return 0;
        }
        return this.ac();
    }

    protected ag(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aD = client;
        this.aC = squireZulrahConfig;
    }

    private boolean ag() {
        ag var14;
        if ((this.aD.isInInstancedRegion( == 0) ? 1 : 0)) {
            this.E.b(0);
            return 0;
        }
        int[] var15 = var14.aD.getMapRegions();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            int var18 = var15[var17];
            if (!(var18 != 2) || (var18 == 3)) {
                return 1;
            }
            ++var17;
            0;
            if null == null continue;
            return ((0xA4 ^ 0xBE) & ~(0x7A ^ 0x60)) != 0;
        }
        return 0;
    }
}


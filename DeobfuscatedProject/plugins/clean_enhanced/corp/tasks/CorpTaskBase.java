/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 */
package gg.squire.corp.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.corp.SquireCorpConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;

public abstract class CorpTaskBase
extends Task {
    private static final  int n;
    private static final  int m;
    
    @Inject
    protected  SquireCorpConfig o;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        a.var13();
        a.var14();
        n = 3;
        m = 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean g() {
        void var15;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int var16 = 1;
        while ((var16 < (int)var15)) {
            void var17;
            void var18 = var17[var16];
            if (!((int)var18 != 2) || ((int)var18 == 3)) {
                return 0;
            }
            ++var16;
            0;
            if (-1 == -1) continue;
            return ((0x34 ^ 0x65) & ~(0x3B ^ 0x6A)) != 0;
        }
        return 1;
    }

    public NPC f() {
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        return NPCs.getNearest((String[])stringArray);
    }

}


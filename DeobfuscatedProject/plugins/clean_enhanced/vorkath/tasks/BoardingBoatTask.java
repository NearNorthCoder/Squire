/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Boarding boat", priority=105, blocking=true)
public class BoardingBoatTask
extends VorkathTaskBase {
    
    private static final  WorldPoint cs;
    
    private final  SquireVorkathPlugin ct;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (M.var3(this.ct.f() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[M.var2[0]] = var1[var2[0]];
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if (M.var5(var4)) {
            Movement.walkTo((WorldPoint)cs);
            0;
            return var2[1];
        }
        var1_1.interact(var1[var2[1]]);
        return var2[1];
    }

    @Inject
    protected BoardingBoatTask(Client client, SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
        super(client, squireVorkathConfig);
        this.ct = squireVorkathPlugin;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    static {
        M.var7();
        M.var8();
        cs = new WorldPoint(var2[2], var2[3], var2[0]);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var7() {
        var2 = new int[5];
        M.var2[0] = (0xB2 ^ 0xBF ^ (0xA1 ^ 0xB3)) & (1 ^ (0x5C ^ 0x42) ^ -1);
        M.var2[1] = 1;
        M.var2[2] = 0xFFFFDFD4 & 0x2A7B;
        M.var2[3] = 0xFFFF9E7F & 0x6FEE;
        M.var2[4] = 2;
    }

    private static void var8() {
        var1 = new String[var2[4]];
        M.var1[M.var2[0]] = "Torfinn";
        M.var1[M.var2[1]] = "Ungael";
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[0];
        while (M.var6(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (1 < (77 + 44 - -16 + 17 ^ 34 + 140 - 135 + 119)) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}


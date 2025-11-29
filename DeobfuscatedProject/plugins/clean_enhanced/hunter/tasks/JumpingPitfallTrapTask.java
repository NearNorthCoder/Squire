/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Jumping Pitfall Trap", priority=20, blocking=true)
public class JumpingPitfallTrapTask
extends HunterManager {

    static {
        w.var3();
        w.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        w.var1[w.var2[0]] = "Jump";
    }

    private static void var3() {
        var2 = new int[4];
        w.var2[0] = (0x35 ^ 0x79) & ~(0x45 ^ 9);
        w.var2[1] = 2;
        w.var2[2] = 0x2F ^ 0x29;
        w.var2[3] = 1;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var2[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var2[0];
        while (w.var5(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var17;
        w var18;
        TileObject tileObject = this.F();
        if (w.var6(tileObject)) {
            return var2[0];
        }
        NPC var19 = var18.E();
        if (w.var6(var19)) {
            return var2[0];
        }
        if (w.var20(((GameObject)var17).getWorldArea().contains(var19.getWorldLocation()) ? 1 : 0)) {
            return var2[0];
        }
        var17.interact(var1[var2[0]]);
        if (w.var5(var17.distanceTo((Locatable)Players.getLocal()), var2[1]) && w.var5(var19.distanceTo((Locatable)Players.getLocal()), var2[1])) {
            var18.sleep(var2[2]);
            return var2[3];
        }
        this.sleep(var2[1]);
        return var2[3];
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    @Inject
    public JumpingPitfallTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }
}


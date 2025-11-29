/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GameEnum;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Grinding sword", priority=100, blocking=true)
public class GrindingSwordTask
extends GiantsfoundryTaskBase {

    private static final  int ap;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[5];
        q.var1[0] = 0xFFFFACEF & 0x77FE;
        q.var1[1] = 0xF5 ^ 0xA9 ^ (0xF4 ^ 0xAC);
        q.var1[2] = 1;
        q.var1[3] = (0x51 ^ 0x41) & ~(0x5C ^ 0x4C);
        q.var1[4] = 2;
    }

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (q.var5(player.getAnimation(), var1[0])) {
            this.sleep(var1[1]);
            return var1[2];
        }
        return this.N();
    }

    private static void var6() {
        var2 = new String[var1[4]];
        q.var2[q.var1[3]] = "Grindstone is null";
        q.var2[q.var1[2]] = "Use";
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.s();
        if (q.var3(tileObject)) {
            Log.info((String)var2[var1[3]]);
            return var1[3];
        }
        tileObject.interact(var2[var1[2]]);
        this.sleep(var1[1]);
        return var1[2];
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public GrindingSwordTask(a a2) {
        super(a2, g.GRINDSTONE);
    }

    static {
        q.var4();
        q.var6();
        ap = var1[0];
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = var1[3];
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = var1[3];
        while (q.var7(var16, var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var11);
    }
}


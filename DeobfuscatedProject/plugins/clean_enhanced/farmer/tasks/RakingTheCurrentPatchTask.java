/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Vars;

@TaskDesc(name="Raking the current patch", priority=10)
public class RakingTheCurrentPatchTask
extends aX {

    @Inject
    public RakingTheCurrentPatchTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, au.WEEDS);
    }

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
            if (((0x94 ^ 0xAE ^ 42 + 57 - 33 + 61) & (0xB0 ^ 0x89 ^ (0xC1 ^ 0xBD) ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Override
    public boolean J(N n2) {
        if ((Vars.getBit(int0))) {
            return 1;
        }
        this.sleep(2);
        return this.a(n2, tileObject -> tileObject.interact(var1[1]::equals));
    }

}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;

@TaskDesc(name="Clearing dead crop", priority=5, blocking=true)
public class ClearingDeadCropTask
extends aX {

    @Override
    public boolean J(N n2) {
        this.sleep(3);
        return this.a(n2, tileObject -> tileObject.interact(var2[2]::equals));
    }

    @Override
    public boolean bv() {
        if ((super.bv( != 0) ? 1 : 0)) {
            this.sleep(0);
            return 1;
        }
        return 2;
    }

    @Inject
    public ClearingDeadCropTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (((Object)an2.aZ() == (Object)an2.aZ()2)n.DEAD)) {
                bl = 1;
                0;
                if (2 < -1) {
                    return ((0x55 ^ 0x58) & ~(0x9C ^ 0x91)) != 0;
                }
            } else {
                bl = 2;
            }
            return bl;
        });
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 2;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 2;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 <= ((0x61 ^ 0x73) & ~(0x43 ^ 0x51))) continue;
            return null;
        }
        return String.valueOf(var6);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import gg.squire.nightmarezone.tasks.AHelper;

@TaskDesc(name="Using special attack", priority=50)
public class UsingSpecialAttackTask
extends Task {
    private  a i;
    
    private final  Client ak;
    private  boolean f;
    private final  SquireNightmareZone ai;
    private final  SquireNightmareZoneConfig aj;

    static {
        m.lIIlllllIIIIIIl();
        m.lIIllllIlllllII();
    }

    private static void lIIllllIlllllII() {
        lIIIlIIlIIlll = new String[lIIIlIIlIlIIl[4]];
        m.lIIIlIIlIIlll[m.lIIIlIIlIlIIl[0]] = "None";
        m.lIIIlIIlIIlll[m.lIIIlIIlIlIIl[1]] = "No Spec Gear selected";
        m.lIIIlIIlIIlll[m.lIIIlIIlIlIIl[3]] = "Using spec";
    }

    public boolean run() {
        m var1;
        if (m.lIIlllllIIIIIlI(this.aj.powerSurge() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIll(var1.aj.specGear().getSelected().equals(lIIIlIIlIIlll[lIIIlIIlIlIIl[0]]) ? 1 : 0)) {
            Log.error((String)lIIIlIIlIIlll[lIIIlIIlIlIIl[1]]);
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIlI(var1.ak.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIlI(var1.ai.g() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIIll(Combat.isSpecEnabled() ? 1 : 0)) {
            return lIIIlIIlIlIIl[0];
        }
        if (m.lIIlllllIIIIlII(Combat.getSpecEnergy(), lIIIlIIlIlIIl[2])) {
            return lIIIlIIlIlIIl[0];
        }
        Combat.toggleSpec();
        System.out.println(lIIIlIIlIIlll[lIIIlIIlIlIIl[3]]);
        return lIIIlIIlIlIIl[1];
    }

    @Inject
    public UsingSpecialAttackTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.f = lIIIlIIlIlIIl[0];
        this.ai = squireNightmareZone;
        this.aj = squireNightmareZoneConfig;
        this.ak = client;
    }

    private static boolean lIIlllllIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIIIIIll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var2);
    }

    private static boolean lIIlllllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }
}


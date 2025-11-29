/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging trident (sea trident)", priority=1200, blocking=true, register=true)
public class RechargingTridentSeaTridentTask
extends NightmareTaskBase {

    private static boolean lIIIlllIlllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIlllIIII() {
        llllIIIIllIl = new String[llllIIIIllll[8]];
        L.llllIIIIllIl[L.llllIIIIllll[13]] = "Current staff {} does not contains staff ids {}";
    }

    @Inject
    public RechargingTridentSeaTridentTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = List.of(Integer.valueOf(llllIIIIllll[0]), Integer.valueOf(llllIIIIllll[1]), Integer.valueOf(llllIIIIllll[2]), Integer.valueOf(llllIIIIllll[3]), Integer.valueOf(llllIIIIllll[4]));
        this.dq = Map.of(llllIIIIllll[5], llllIIIIllll[6], llllIIIIllll[7], llllIIIIllll[8], llllIIIIllll[9], llllIIIIllll[8], llllIIIIllll[10], llllIIIIllll[11]);
        this.dr = List.of(Integer.valueOf(llllIIIIllll[12]), Integer.valueOf(llllIIIIllll[10]), Integer.valueOf(llllIIIIllll[7]), Integer.valueOf(llllIIIIllll[9]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static boolean lIIIlllIlllIIlI(int n2) {
        return n2 != 0;
    }

    static {
        L.lIIIlllIlllIIIl();
        L.lIIIlllIlllIIII();
    }

    @Override
    public boolean bY() {
        L var1;
        if (L.lIIIlllIlllIIlI(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIIIIllll[13];
        }
        if (L.lIIIlllIlllIIll(var1.cW.n() ? 1 : 0)) {
            return llllIIIIllll[13];
        }
        if (L.lIIIlllIlllIIlI(var1.cW.ae() ? 1 : 0)) {
            return llllIIIIllll[13];
        }
        if (L.lIIIlllIlllIIlI(var1.dp.contains(var1.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIIIIllll[14]];
            objectArray[L.llllIIIIllll[13]] = var1.ca();
            objectArray[L.llllIIIIllll[8]] = var1.dp;
            Log.info((String)llllIIIIllIl[llllIIIIllll[13]], (Object[])objectArray);
            return llllIIIIllll[13];
        }
        return this.cf();
    }

}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.client.game.ItemVariationMapping
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.client.game.ItemVariationMapping;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging trident", priority=1200, blocking=true, register=true)
public class RechargingTridentTask
extends NightmareTaskBase {

    private static boolean lIIIllllIllIlll(int n2) {
        return n2 == 0;
    }

    static {
        O.lIIIllllIllIlIl();
        O.lIIIllllIllIlII();
    }

    private static void lIIIllllIllIlII() {
        llllIIlIIIIl = new String[llllIIlIIIlI[2]];
        O.llllIIlIIIIl[O.llllIIlIIIlI[7]] = "Current staff {} does not contains staff ids {}";
    }

    @Override
    public boolean bY() {
        O var1;
        if (O.lIIIllllIllIllI(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIIlIIIlI[7];
        }
        if (O.lIIIllllIllIlll(var1.cW.n() ? 1 : 0)) {
            return llllIIlIIIlI[7];
        }
        if (O.lIIIllllIllIllI(var1.cW.ae() ? 1 : 0)) {
            return llllIIlIIIlI[7];
        }
        if (O.lIIIllllIllIllI(var1.dp.contains(var1.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIIlIIIlI[8]];
            objectArray[O.llllIIlIIIlI[7]] = var1.ca();
            objectArray[O.llllIIlIIIlI[2]] = var1.dp;
            Log.info((String)llllIIlIIIIl[llllIIlIIIlI[7]], (Object[])objectArray);
            return llllIIlIIIlI[7];
        }
        return this.cf();
    }

    private static boolean lIIIllllIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public RechargingTridentTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)llllIIlIIIlI[0]);
        this.dq = Map.of(llllIIlIIIlI[1], llllIIlIIIlI[2], llllIIlIIIlI[3], llllIIlIIIlI[2], llllIIlIIIlI[4], llllIIlIIIlI[2], llllIIlIIIlI[5], llllIIlIIIlI[6]);
        this.dr = List.of(Integer.valueOf(llllIIlIIIlI[1]), Integer.valueOf(llllIIlIIIlI[5]), Integer.valueOf(llllIIlIIIlI[3]), Integer.valueOf(llllIIlIIIlI[4]));
        this.do = this.dp.size() + this.dr.size();
    }
}


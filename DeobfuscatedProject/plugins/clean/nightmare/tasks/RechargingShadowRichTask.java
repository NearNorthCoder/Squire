/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.game.ItemVariationMapping
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
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
import net.runelite.client.game.ItemVariationMapping;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging Shadow (rich)", priority=1200, blocking=true, register=true)
public class RechargingShadowRichTask
extends NightmareTaskBase {

    private static boolean lIIlIIIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    static {
        M.lIIlIIIlIIIIlII();
        M.lIIlIIIlIIIIIll();
    }

    @Override
    public boolean bY() {
        M var1;
        if (M.lIIlIIIlIIIIlIl(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIlIlIlll[5];
        }
        if (M.lIIlIIIlIIIIllI(var1.cW.n() ? 1 : 0)) {
            return llllIlIlIlll[5];
        }
        if (M.lIIlIIIlIIIIlIl(var1.cW.ae() ? 1 : 0)) {
            return llllIlIlIlll[5];
        }
        if (M.lIIlIIIlIIIIlIl(var1.dp.contains(var1.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIlIlIlll[2]];
            objectArray[M.llllIlIlIlll[5]] = var1.ca();
            objectArray[M.llllIlIlIlll[6]] = var1.dp;
            Log.info((String)llllIlIlIllI[llllIlIlIlll[5]], (Object[])objectArray);
            return llllIlIlIlll[5];
        }
        return this.cf();
    }

    @Inject
    public RechargingShadowRichTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)llllIlIlIlll[0]);
        this.dq = Map.of(llllIlIlIlll[1], llllIlIlIlll[2], llllIlIlIlll[3], llllIlIlIlll[4]);
        this.dr = List.of(Integer.valueOf(llllIlIlIlll[1]), Integer.valueOf(llllIlIlIlll[3]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static void lIIlIIIlIIIIIll() {
        llllIlIlIllI = new String[llllIlIlIlll[6]];
        M.llllIlIlIllI[M.llllIlIlIlll[5]] = "Current staff {} does not contains staff ids {}";
    }

    private static boolean lIIlIIIlIIIIllI(int n2) {
        return n2 == 0;
    }
}


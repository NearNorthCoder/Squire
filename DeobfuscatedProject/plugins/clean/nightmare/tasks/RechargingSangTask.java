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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.game.ItemVariationMapping;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Recharging sang", priority=1200, blocking=true, register=true)
public class RechargingSangTask
extends NightmareTaskBase {

    @Inject
    public RechargingSangTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)llllIlIIIIII[0]);
        this.dq = Map.of(llllIlIIIIII[1], llllIlIIIIII[2]);
        this.dr = List.of(Integer.valueOf(llllIlIIIIII[1]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static boolean lIIlIIIIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIIlIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        K.lIIlIIIIIlIIIII();
        K.lIIlIIIIIIllllI();
    }

    private static void lIIlIIIIIIllllI() {
        llllIIllllll = new String[llllIlIIIIII[5]];
        K.llllIIllllll[K.llllIlIIIIII[3]] = "Current staff {} does not contains staff ids {}";
    }

    @Override
    public boolean bY() {
        K var1;
        if (K.lIIlIIIIIlIIIIl(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIlI(var1.cW.n() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIIl(var1.cW.ae() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIIl(var1.dp.contains(var1.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIlIIIIII[4]];
            objectArray[K.llllIlIIIIII[3]] = var1.ca();
            objectArray[K.llllIlIIIIII[5]] = var1.dp;
            Log.info((String)llllIIllllll[llllIlIIIIII[3]], (Object[])objectArray);
            return llllIlIIIIII[3];
        }
        return this.cf();
    }
}


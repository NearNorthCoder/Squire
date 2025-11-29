/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.game.ItemVariationMapping
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;

/* TASK: Recharging sang -> RechargingsangTask */
@TaskDesc(name="Recharging sang", priority=1200, blocking=true, register=true)
public class RechargingSangTask
extends N_Unknown {
    private static /* synthetic */ int[] llllIlIIIIII;
    private static /* synthetic */ String[] llllIIllllll;

    private static void lIIlIIIIIlIIIII() {
        llllIlIIIIII = new int[7];
        K.llllIlIIIIII[0] = 0xFFFFD7FB & 0x7F37;
        K.llllIlIIIIII[1] = 0xFFFFF6BD & 0xB77;
        K.llllIlIIIIII[2] = 3;
        K.llllIlIIIIII[3] = (0x8F ^ 0x84) & ~(0x5E ^ 0x55);
        K.llllIlIIIIII[4] = 2;
        K.llllIlIIIIII[5] = 1;
        K.llllIlIIIIII[6] = 0x55 ^ 0x5D;
    }

    @Inject
    public K(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
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

    private static String lIIlIIIIIIlllIl(String var5, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llllIlIIIIII[6]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llllIlIIIIII[4], var4);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    static {
        K.lIIlIIIIIlIIIII();
        K.lIIlIIIIIIllllI();
    }

    private static void lIIlIIIIIIllllI() {
        llllIIllllll = new String[llllIlIIIIII[5]];
        K.llllIIllllll[K.llllIlIIIIII[3]] = K."Current staff {} does not contains staff ids {}";
    }

    @Override
    public boolean bY() {
        K var6;
        if (K.lIIlIIIIIlIIIIl(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIlI(var6.cW.n() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIIl(var6.cW.ae() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIIl(var6.dp.contains(var6.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIlIIIIII[4]];
            objectArray[K.llllIlIIIIII[3]] = var6.ca();
            objectArray[K.llllIlIIIIII[5]] = var6.dp;
            Log.info((String)llllIIllllll[llllIlIIIIII[3]], (Object[])objectArray);
            return llllIlIIIIII[3];
        }
        return this.cf();
    }
}


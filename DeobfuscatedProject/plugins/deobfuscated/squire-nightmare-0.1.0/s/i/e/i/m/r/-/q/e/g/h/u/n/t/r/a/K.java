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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Recharging sang", priority=1200, blocking=true, register=true)
public class K
extends N {
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

    private static String lIIlIIIIIIlllIl(String lllllllllllllllIIlIllIllllllIIIl, String lllllllllllllllIIlIllIlllllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllllIlllI.getBytes(StandardCharsets.UTF_8)), llllIlIIIIII[6]), "DES");
            Cipher lllllllllllllllIIlIllIllllllIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllllllIIll.init(llllIlIIIIII[4], lllllllllllllllIIlIllIllllllIlII);
            return new String(lllllllllllllllIIlIllIllllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllllllIIlI) {
            lllllllllllllllIIlIllIllllllIIlI.printStackTrace();
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
        K lllllllllllllllIIlIllIlllllllIIl;
        if (K.lIIlIIIIIlIIIIl(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIlI(lllllllllllllllIIlIllIlllllllIIl.cW.n() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIIl(lllllllllllllllIIlIllIlllllllIIl.cW.ae() ? 1 : 0)) {
            return llllIlIIIIII[3];
        }
        if (K.lIIlIIIIIlIIIIl(lllllllllllllllIIlIllIlllllllIIl.dp.contains(lllllllllllllllIIlIllIlllllllIIl.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIlIIIIII[4]];
            objectArray[K.llllIlIIIIII[3]] = lllllllllllllllIIlIllIlllllllIIl.ca();
            objectArray[K.llllIlIIIIII[5]] = lllllllllllllllIIlIllIlllllllIIl.dp;
            Log.info((String)llllIIllllll[llllIlIIIIII[3]], (Object[])objectArray);
            return llllIlIIIIII[3];
        }
        return this.cf();
    }
}


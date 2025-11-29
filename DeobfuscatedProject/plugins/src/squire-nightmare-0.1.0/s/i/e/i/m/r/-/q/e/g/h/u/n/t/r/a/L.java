/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Recharging trident (sea trident)", priority=1200, blocking=true, register=true)
public class L
extends N {
    private static /* synthetic */ String[] llllIIIIllIl;
    private static /* synthetic */ int[] llllIIIIllll;

    private static boolean lIIIlllIlllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIlllIIII() {
        llllIIIIllIl = new String[llllIIIIllll[8]];
        L.llllIIIIllIl[L.llllIIIIllll[13]] = L.lIIIlllIllIllII("DtkvhnlpEWojptnb346ps9tdU8t2L1EwlEH7fTetaKR6Ki/2FJRgNif7m4+OgNZA", "IJCvf");
    }

    @Inject
    public L(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = List.of(Integer.valueOf(llllIIIIllll[0]), Integer.valueOf(llllIIIIllll[1]), Integer.valueOf(llllIIIIllll[2]), Integer.valueOf(llllIIIIllll[3]), Integer.valueOf(llllIIIIllll[4]));
        this.dq = Map.of(llllIIIIllll[5], llllIIIIllll[6], llllIIIIllll[7], llllIIIIllll[8], llllIIIIllll[9], llllIIIIllll[8], llllIIIIllll[10], llllIIIIllll[11]);
        this.dr = List.of(Integer.valueOf(llllIIIIllll[12]), Integer.valueOf(llllIIIIllll[10]), Integer.valueOf(llllIIIIllll[7]), Integer.valueOf(llllIIIIllll[9]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static String lIIIlllIllIllII(String lllllllllllllllIIllIIIIIlIlIIIII, String lllllllllllllllIIllIIIIIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), llllIIIIllll[15]), "DES");
            Cipher lllllllllllllllIIllIIIIIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIIIlIlIIIlI.init(llllIIIIllll[14], lllllllllllllllIIllIIIIIlIlIIIll);
            return new String(lllllllllllllllIIllIIIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIlIlIIIIl) {
            lllllllllllllllIIllIIIIIlIlIIIIl.printStackTrace();
            return null;
        }
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
        L lllllllllllllllIIllIIIIIlIlIlIII;
        if (L.lIIIlllIlllIIlI(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIIIIllll[13];
        }
        if (L.lIIIlllIlllIIll(lllllllllllllllIIllIIIIIlIlIlIII.cW.n() ? 1 : 0)) {
            return llllIIIIllll[13];
        }
        if (L.lIIIlllIlllIIlI(lllllllllllllllIIllIIIIIlIlIlIII.cW.ae() ? 1 : 0)) {
            return llllIIIIllll[13];
        }
        if (L.lIIIlllIlllIIlI(lllllllllllllllIIllIIIIIlIlIlIII.dp.contains(lllllllllllllllIIllIIIIIlIlIlIII.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIIIIllll[14]];
            objectArray[L.llllIIIIllll[13]] = lllllllllllllllIIllIIIIIlIlIlIII.ca();
            objectArray[L.llllIIIIllll[8]] = lllllllllllllllIIllIIIIIlIlIlIII.dp;
            Log.info((String)llllIIIIllIl[llllIIIIllll[13]], (Object[])objectArray);
            return llllIIIIllll[13];
        }
        return this.cf();
    }

    private static void lIIIlllIlllIIIl() {
        llllIIIIllll = new int[16];
        L.llllIIIIllll[0] = -(0xFFFFE371 & 0x5CFF) & (0xFFFFEEFE & 0x7FF5);
        L.llllIIIIllll[1] = 0xFFFFBEAB & 0x6FD7;
        L.llllIIIIllll[2] = -(0xFFFF8E6F & 0x79DD) & (0xFFFFDFFF & 0x7F5E);
        L.llllIIIIllll[3] = 0xFFFFFF5D & 0x57B2;
        L.llllIIIIllll[4] = 0xFFFFFEF5 & 0x2F8B;
        L.llllIIIIllll[5] = 0xFFFFBFEB & 0x43F7;
        L.llllIIIIllll[6] = 0x5E ^ 0x54;
        L.llllIIIIllll[7] = 0xFFFFF6BF & 0xB70;
        L.llllIIIIllll[8] = " ".length();
        L.llllIIIIllll[9] = 0xFFFF8EFB & 0x7336;
        L.llllIIIIllll[10] = 0xFFFFDE6B & 0x23BE;
        L.llllIIIIllll[11] = 0xCC ^ 0x97 ^ (0x68 ^ 0x36);
        L.llllIIIIllll[12] = -(0xFFFFAC6E & 0x5BF3) & (0xFFFFFBFF & 0x3EE7);
        L.llllIIIIllll[13] = " ".length() & ~" ".length();
        L.llllIIIIllll[14] = "  ".length();
        L.llllIIIIllll[15] = 0x12 ^ 0x1A;
    }
}


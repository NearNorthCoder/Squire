/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.client.game.ItemVariationMapping
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Recharging trident", priority=1200, blocking=true, register=true)
public class O
extends N {
    private static /* synthetic */ int[] llllIIlIIIlI;
    private static /* synthetic */ String[] llllIIlIIIIl;

    private static boolean lIIIllllIllIlll(int n2) {
        return n2 == 0;
    }

    private static String lIIIllllIllIIll(String lllllllllllllllIIlIllllIllIlIlll, String lllllllllllllllIIlIllllIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllllIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllllIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllllIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllllIllIllIIl.init(llllIIlIIIlI[8], lllllllllllllllIIlIllllIllIllIlI);
            return new String(lllllllllllllllIIlIllllIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllllIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllllIllIllIII) {
            lllllllllllllllIIlIllllIllIllIII.printStackTrace();
            return null;
        }
    }

    static {
        O.lIIIllllIllIlIl();
        O.lIIIllllIllIlII();
    }

    private static void lIIIllllIllIlIl() {
        llllIIlIIIlI = new int[9];
        O.llllIIlIIIlI[0] = -(0xFFFFBD9D & 0x4BF7) & (0xFFFFBBF7 & Short.MAX_VALUE);
        O.llllIIlIIIlI[1] = -(0xFFFFD57F & 0x2FE2) & (0xFFFFB7F7 & 0x7FEF);
        O.llllIIlIIIlI[2] = " ".length();
        O.llllIIlIIIlI[3] = 0xFFFFC6B2 & 0x3B7D;
        O.llllIIlIIIlI[4] = 0xFFFFEFF3 & 0x123E;
        O.llllIIlIIIlI[5] = -(0xFFFFF6CE & 0x7933) & (0xFFFFFF7B & 0x72AF);
        O.llllIIlIIIlI[6] = 0x73 ^ 0x3E ^ (0x56 ^ 0x1E);
        O.llllIIlIIIlI[7] = (0x98 ^ 0xB0 ^ (0x69 ^ 0x3F) & ~(0x68 ^ 0x3E)) & (77 + 104 - 132 + 105 ^ 51 + 32 - 57 + 152 ^ -" ".length());
        O.llllIIlIIIlI[8] = "  ".length();
    }

    private static void lIIIllllIllIlII() {
        llllIIlIIIIl = new String[llllIIlIIIlI[2]];
        O.llllIIlIIIIl[O.llllIIlIIIlI[7]] = O.lIIIllllIllIIll("z84v8uQvTIXxOJ/TXW0IiARs0hjoA+DTY2fNhmmFCYv1RK6nnfteCetpYxPV4cvI", "JFWAw");
    }

    @Override
    public boolean bY() {
        O lllllllllllllllIIlIllllIllIlllll;
        if (O.lIIIllllIllIllI(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIIlIIIlI[7];
        }
        if (O.lIIIllllIllIlll(lllllllllllllllIIlIllllIllIlllll.cW.n() ? 1 : 0)) {
            return llllIIlIIIlI[7];
        }
        if (O.lIIIllllIllIllI(lllllllllllllllIIlIllllIllIlllll.cW.ae() ? 1 : 0)) {
            return llllIIlIIIlI[7];
        }
        if (O.lIIIllllIllIllI(lllllllllllllllIIlIllllIllIlllll.dp.contains(lllllllllllllllIIlIllllIllIlllll.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIIlIIIlI[8]];
            objectArray[O.llllIIlIIIlI[7]] = lllllllllllllllIIlIllllIllIlllll.ca();
            objectArray[O.llllIIlIIIlI[2]] = lllllllllllllllIIlIllllIllIlllll.dp;
            Log.info((String)llllIIlIIIIl[llllIIlIIIlI[7]], (Object[])objectArray);
            return llllIIlIIIlI[7];
        }
        return this.cf();
    }

    private static boolean lIIIllllIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public O(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)llllIIlIIIlI[0]);
        this.dq = Map.of(llllIIlIIIlI[1], llllIIlIIIlI[2], llllIIlIIIlI[3], llllIIlIIIlI[2], llllIIlIIIlI[4], llllIIlIIIlI[2], llllIIlIIIlI[5], llllIIlIIIlI[6]);
        this.dr = List.of(Integer.valueOf(llllIIlIIIlI[1]), Integer.valueOf(llllIIlIIIlI[5]), Integer.valueOf(llllIIlIIIlI[3]), Integer.valueOf(llllIIlIIIlI[4]));
        this.do = this.dp.size() + this.dr.size();
    }
}


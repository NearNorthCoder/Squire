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
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.game.ItemVariationMapping;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Recharging Shadow (rich)", priority=1200, blocking=true, register=true)
public class M
extends N {
    private static /* synthetic */ int[] llllIlIlIlll;
    private static /* synthetic */ String[] llllIlIlIllI;

    private static boolean lIIlIIIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    static {
        M.lIIlIIIlIIIIlII();
        M.lIIlIIIlIIIIIll();
    }

    private static String lIIlIIIlIIIIIII(String lllllllllllllllIIlIllIIlIllIllIl, String lllllllllllllllIIlIllIIlIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIlIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIlIlllIIIl.init(llllIlIlIlll[2], lllllllllllllllIIlIllIIlIlllIIlI);
            return new String(lllllllllllllllIIlIllIIlIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIlIlllIIII) {
            lllllllllllllllIIlIllIIlIlllIIII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bY() {
        M lllllllllllllllIIlIllIIlIlllIlll;
        if (M.lIIlIIIlIIIIlIl(this.cV.useFireSpells() ? 1 : 0)) {
            return llllIlIlIlll[5];
        }
        if (M.lIIlIIIlIIIIllI(lllllllllllllllIIlIllIIlIlllIlll.cW.n() ? 1 : 0)) {
            return llllIlIlIlll[5];
        }
        if (M.lIIlIIIlIIIIlIl(lllllllllllllllIIlIllIIlIlllIlll.cW.ae() ? 1 : 0)) {
            return llllIlIlIlll[5];
        }
        if (M.lIIlIIIlIIIIlIl(lllllllllllllllIIlIllIIlIlllIlll.dp.contains(lllllllllllllllIIlIllIIlIlllIlll.ca()) ? 1 : 0)) {
            Object[] objectArray = new Object[llllIlIlIlll[2]];
            objectArray[M.llllIlIlIlll[5]] = lllllllllllllllIIlIllIIlIlllIlll.ca();
            objectArray[M.llllIlIlIlll[6]] = lllllllllllllllIIlIllIIlIlllIlll.dp;
            Log.info((String)llllIlIlIllI[llllIlIlIlll[5]], (Object[])objectArray);
            return llllIlIlIlll[5];
        }
        return this.cf();
    }

    @Inject
    public M(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.dp = ItemVariationMapping.getVariations((int)llllIlIlIlll[0]);
        this.dq = Map.of(llllIlIlIlll[1], llllIlIlIlll[2], llllIlIlIlll[3], llllIlIlIlll[4]);
        this.dr = List.of(Integer.valueOf(llllIlIlIlll[1]), Integer.valueOf(llllIlIlIlll[3]));
        this.do = this.dp.size() + this.dr.size();
    }

    private static void lIIlIIIlIIIIIll() {
        llllIlIlIllI = new String[llllIlIlIlll[6]];
        M.llllIlIlIllI[M.llllIlIlIlll[5]] = M.lIIlIIIlIIIIIII("WI1HzYNpPHgUFJFWgxkHoTPpajcwOSs1tR6RkNuoaIxxdHtlSDcvar+ML+m4uB23", "azDHH");
    }

    private static void lIIlIIIlIIIIlII() {
        llllIlIlIlll = new int[7];
        M.llllIlIlIlll[0] = -(0xFFFFFDD1 & 0x72F) & (0xFFFFEFBF & 0x7FCB);
        M.llllIlIlIlll[1] = 0xFFFFEE36 & 0x13FF;
        M.llllIlIlIlll[2] = "  ".length();
        M.llllIlIlIlll[3] = 0xFFFF8277 & 0x7FBA;
        M.llllIlIlIlll[4] = 0xB9 ^ 0xBC;
        M.llllIlIlIlll[5] = (46 + 164 - 83 + 57 ^ 48 + 14 - 50 + 160) & (0xDF ^ 0x96 ^ (0x21 ^ 0x7C) ^ -" ".length());
        M.llllIlIlIlll[6] = " ".length();
    }

    private static boolean lIIlIIIlIIIIllI(int n2) {
        return n2 == 0;
    }
}


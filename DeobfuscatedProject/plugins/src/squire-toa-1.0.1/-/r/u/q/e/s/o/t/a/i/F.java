/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class F
extends z {
    private static /* synthetic */ int[] lIlIIIIlIIlII;
    private static /* synthetic */ String[] lIlIIIIlIIIll;

    @Inject
    public F(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override
    public List<Prayer> E() {
        return List.of(this.H());
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickObelisk();
    }

    @Override
    public boolean C() {
        return this.aS.a(nPC -> nPC.getName().equals(lIlIIIIlIIIll[lIlIIIIlIIlII[1]]));
    }

    private static void lIllIllIlIlIIll() {
        lIlIIIIlIIlII = new int[4];
        F.lIlIIIIlIIlII[0] = -(0xFFFFC4CF & 0x7FB8) & (0xFFFFFFD7 & Short.MAX_VALUE);
        F.lIlIIIIlIIlII[1] = (0xD1 ^ 0xB4 ^ (0x2B ^ 0x2C)) & (0x57 ^ 0xE ^ (0x48 ^ 0x73) ^ -" ".length());
        F.lIlIIIIlIIlII[2] = " ".length();
        F.lIlIIIIlIIlII[3] = "  ".length();
    }

    @Override
    public int F() {
        return lIlIIIIlIIlII[0];
    }

    static {
        F.lIllIllIlIlIIll();
        F.lIllIllIlIlIIlI();
    }

    private static String lIllIllIlIlIIIl(String llllllllllllllIlllIIlIlIlIIIlIll, String llllllllllllllIlllIIlIlIlIIIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIlIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIlIIIllll.init(lIlIIIIlIIlII[3], llllllllllllllIlllIIlIlIlIIlIIII);
            return new String(llllllllllllllIlllIIlIlIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlIlIIIlllI) {
            llllllllllllllIlllIIlIlIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIlIIIll = new String[lIlIIIIlIIlII[2]];
        F.lIlIIIIlIIIll[F.lIlIIIIlIIlII[1]] = F.lIllIllIlIlIIIl("WIl/Xuh8kVg=", "EtGNA");
    }
}


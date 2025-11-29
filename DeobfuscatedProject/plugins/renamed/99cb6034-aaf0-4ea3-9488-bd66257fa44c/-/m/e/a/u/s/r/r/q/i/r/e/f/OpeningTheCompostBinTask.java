/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;

/* TASK: Opening the compost bin -> OpeningthecompostbinTask */
@TaskDesc(name="Opening the compost bin", priority=35, blocking=true)
public class OpeningTheCompostBinTask
extends aN_Unknown {
    private static /* synthetic */ String[] lIlllllIIllI;
    private static /* synthetic */ int[] lIlllllIIlll;

    private static boolean lllIllllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        aR.lllIllllIlllII();
        aR.lllIllllIllIll();
    }

    @Inject
    public aR(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static void lllIllllIlllII() {
        lIlllllIIlll = new int[3];
        aR.lIlllllIIlll[0] = 1;
        aR.lIlllllIIlll[1] = (0x5B ^ 0x3B) & ~(0xF4 ^ 0x94);
        aR.lIlllllIIlll[2] = 2;
    }

    private static boolean lllIllllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIllllIllIlI(String var3, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlllllIIlll[2], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean I(N n2) {
        int n3;
        an an2 = n2.aI();
        au au2 = an2.aY();
        if (aR.lllIllllIlllIl((Object)an2.aZ(), (Object)n.GROWING) && aR.lllIllllIllllI(an2.bb(), au2.bc() - lIlllllIIlll[0])) {
            n3 = lIlllllIIlll[0];
            0;
            if (2 != 2) {
                return ((0x5A ^ 0x4D ^ (0x6F ^ 0x7C)) & (111 + 56 - 111 + 77 ^ 64 + 25 - 61 + 101 ^ -1)) != 0;
            }
        } else {
            n3 = lIlllllIIlll[1];
        }
        return n3 != 0;
    }

    @Override
    public boolean b(TileObject tileObject) {
        tileObject.interact(lIlllllIIllI[lIlllllIIlll[1]]);
        return lIlllllIIlll[0];
    }

    private static void lllIllllIllIll() {
        lIlllllIIllI = new String[lIlllllIIlll[0]];
        aR.lIlllllIIllI[aR.lIlllllIIlll[1]] = aR."Open";
    }
}


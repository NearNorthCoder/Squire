/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.NEnum;
import -.r.u.q.e.s.o.t.a.i.z_Unknown;
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

/* TASK: Handling Obelisk Prayers -> HandlingobeliskprayersTask */
@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class HandlingObeliskPrayersTask
extends z_Unknown {
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
        F.lIlIIIIlIIlII[1] = (0xD1 ^ 0xB4 ^ (0x2B ^ 0x2C)) & (0x57 ^ 0xE ^ (0x48 ^ 0x73) ^ -1);
        F.lIlIIIIlIIlII[2] = 1;
        F.lIlIIIIlIIlII[3] = 2;
    }

    @Override
    public int F() {
        return lIlIIIIlIIlII[0];
    }

    static {
        F.lIllIllIlIlIIll();
        F.lIllIllIlIlIIlI();
    }

    private static String lIllIllIlIlIIIl(String var2, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIIIlIIlII[3], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIlIIIll = new String[lIlIIIIlIIlII[2]];
        F.lIlIIIIlIIIll[F.lIlIIIIlIIlII[1]] = F."Obelisk";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.VEnum;

/* TASK: Handling Obelisk Prayers -> HandlingobeliskprayersTask */
@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class HandlingObeliskPrayersTask
extends W_Unknown {
    private static /* synthetic */ int[] llIlIlIlIII;
    private static /* synthetic */ String[] llIlIlIIlll;

    @Override
    public boolean aL() {
        return this.cm.a(nPC -> nPC.getName().equals(llIlIlIIlll[llIlIlIlIII[1]]));
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Override
    public List<Prayer> aN() {
        return List.of(this.aQ());
    }

    private static String lIlIIllIllIlll(String var4, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llIlIlIlIII[3]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIlIlIlIII[4], var1);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    static {
        aD.lIlIIllIlllIIl();
        aD.lIlIIllIlllIII();
    }

    private static void lIlIIllIlllIII() {
        llIlIlIIlll = new String[llIlIlIlIII[2]];
        aD.llIlIlIIlll[aD.llIlIlIlIII[1]] = aD."Obelisk";
    }

    @Override
    public int aO() {
        return llIlIlIlIII[0];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Inject
    public aD(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static void lIlIIllIlllIIl() {
        llIlIlIlIII = new int[5];
        aD.llIlIlIlIII[0] = 0xFFFFBBFC & 0x7F53;
        aD.llIlIlIlIII[1] = (7 ^ 0x57) & ~(0xFF ^ 0xAF);
        aD.llIlIlIlIII[2] = 1;
        aD.llIlIlIlIII[3] = 0x2F ^ 0x27;
        aD.llIlIlIlIII[4] = 2;
    }
}


package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
@TaskDesc(name = "Handling Obelisk Prayers", priority = Integer.MAX_VALUE)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aD  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aD.class */
public class aD extends W {
    private static /* synthetic */ int[] llIlIlIlIII;
    private static /* synthetic */ String[] llIlIlIIlll;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        return this.cm.a(npc -> {
            return npc.getName().equals(llIlIlIIlll[llIlIlIlIII[1]]);
        });
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return aL();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        return List.of(aQ());
    }

    private static String lIlIIllIllIlll(String llllllllllllllllIIllIIllIlIIIllI, String llllllllllllllllIIllIIllIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlIII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIlIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIllIlIIIlll) {
            llllllllllllllllIIllIIllIlIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIllIlllIIl();
        lIlIIllIlllIII();
    }

    private static void lIlIIllIlllIII() {
        llIlIlIIlll = new String[llIlIlIlIII[2]];
        llIlIlIIlll[llIlIlIlIII[1]] = lIlIIllIllIlll("C9WM19r3L2U=", "eSjtW");
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return llIlIlIlIII[0];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    @Inject
    public aD(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static void lIlIIllIlllIIl() {
        llIlIlIlIII = new int[5];
        llIlIlIlIII[0] = (-17412) & 32595;
        llIlIlIlIII[1] = (7 ^ 87) & ((255 ^ 175) ^ (-1));
        llIlIlIlIII[2] = " ".length();
        llIlIlIlIII[3] = 47 ^ 39;
        llIlIlIlIII[4] = "  ".length();
    }
}

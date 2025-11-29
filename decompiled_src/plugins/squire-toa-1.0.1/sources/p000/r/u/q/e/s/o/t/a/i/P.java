package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Handling Kephri Prayers")
/* renamed from: -.r.u.q.e.s.o.t.a.i.P  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/P.class */
public class P extends z {
    private static /* synthetic */ String[] lIlIIIIIlllIl;
    private static /* synthetic */ int[] lIlIIIIIllllI;

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public EnumC0013n J() {
        return this.aT.prayerModeKephri();
    }

    private static String lIllIllIlIIIIlI(String llllllllllllllIlllIIlIlIllIlIIlI, String llllllllllllllIlllIIlIlIllIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllllI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIllllI[3], llllllllllllllIlllIIlIlIllIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIllIlIIll) {
            llllllllllllllIlllIIlIlIllIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean I() {
        return lIlIIIIIllllI[0];
    }

    private static boolean lIllIllIlIIIllI(Object obj) {
        return obj != null;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public int F() {
        return lIlIIIIIllllI[4];
    }

    private static boolean lIllIllIlIIlIII(int i) {
        return i != 0;
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public boolean C() {
        SquireTOA squireTOA = this.aS;
        int[] iArr = new int[lIlIIIIIllllI[2]];
        iArr[lIlIIIIIllllI[1]] = lIlIIIIIllllI[5];
        iArr[lIlIIIIIllllI[0]] = lIlIIIIIllllI[6];
        iArr[lIlIIIIIllllI[3]] = lIlIIIIIllllI[7];
        return squireTOA.a(iArr);
    }

    @Override // p000.r.u.q.e.s.o.t.a.i.z
    public List<Prayer> E() {
        String[] strArr = new String[lIlIIIIIllllI[0]];
        strArr[lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIllIllIlIIIllI(nearest) && lIllIllIlIIIlll(nearest.distanceTo(Players.getLocal()), lIlIIIIIllllI[2]) && lIllIllIlIIlIII(Reachable.isInteractable(nearest) ? 1 : 0)) {
            return List.of(H(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] strArr2 = new String[lIlIIIIIllllI[3]];
        strArr2[lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[0]];
        strArr2[lIlIIIIIllllI[0]] = lIlIIIIIlllIl[lIlIIIIIllllI[3]];
        return lIllIllIlIIIllI(NPCs.getNearest(strArr2)) ? List.of(H(), Prayer.PROTECT_FROM_MISSILES) : List.of(H());
    }

    private static String lIllIllIlIIIIll(String llllllllllllllIlllIIlIlIllllIlll, String llllllllllllllIlllIIlIlIllllIllI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIlllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIlllllIIl.init(lIlIIIIIllllI[3], llllllllllllllIlllIIlIlIlllllIlI);
            return new String(llllllllllllllIlllIIlIlIlllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIlllllIII) {
            llllllllllllllIlllIIlIlIlllllIII.printStackTrace();
            return null;
        }
    }

    private static String lIllIllIlIIIIIl(String llllllllllllllIlllIIlIlIlllIIlll, String llllllllllllllIlllIIlIlIlllIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIlIlIlllIIlII = llllllllllllllIlllIIlIlIlllIIllI.toCharArray();
        int llllllllllllllIlllIIlIlIlllIIIll = lIlIIIIIllllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIllllI[1];
        while (lIllIllIlIIlIIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIIlIlIlllIIlII[llllllllllllllIlllIIlIlIlllIIIll % llllllllllllllIlllIIlIlIlllIIlII.length]));
            "".length();
            llllllllllllllIlllIIlIlIlllIIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIllIlIIIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIllIlIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIllIlIIIlIl() {
        lIlIIIIIllllI = new int[9];
        lIlIIIIIllllI[0] = " ".length();
        lIlIIIIIllllI[1] = (217 ^ 133) & ((83 ^ 15) ^ (-1));
        lIlIIIIIllllI[2] = "   ".length();
        lIlIIIIIllllI[3] = "  ".length();
        lIlIIIIIllllI[4] = (-((-9237) & 25783)) & (-9) & 30718;
        lIlIIIIIllllI[5] = (-(53 ^ 4)) & (-16905) & 28671;
        lIlIIIIIllllI[6] = (-20517) & 32236;
        lIlIIIIIllllI[7] = (-((-10689) & 27127)) & (-1) & 28159;
        lIlIIIIIllllI[8] = 24 ^ 16;
    }

    @Inject
    public P(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static void lIllIllIlIIIlII() {
        lIlIIIIIlllIl = new String[lIlIIIIIllllI[2]];
        lIlIIIIIlllIl[lIlIIIIIllllI[1]] = lIllIllIlIIIIIl("JzgvBw8RJWMwBRUlIgE=", "tWCcf");
        lIlIIIIIlllIl[lIlIIIIIllllI[0]] = lIllIllIlIIIIlI("IJMQV5/CGIt8BcdtjWadAQ==", "MNfcV");
        lIlIIIIIlllIl[lIlIIIIIllllI[3]] = lIllIllIlIIIIll("cGVLMX54xbs46wYwQ/9QOQ==", "MLhmZ");
    }

    static {
        lIllIllIlIIIlIl();
        lIllIllIlIIIlII();
    }
}

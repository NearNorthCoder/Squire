package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling Kephri Prayers", priority = Integer.MAX_VALUE)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bj  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bj.class */
public class C0037bj extends W {
    private static /* synthetic */ String[] lIllllIIIIl;
    private static /* synthetic */ int[] lIllllIIlIl;
    private /* synthetic */ int eZ;

    private static boolean lIIllIlIIllIll(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return lIllllIIlIl[4];
    }

    private static String lIIllIlIIlIlIl(String llllllllllllllllIlIIlIllIllIlIIl, String llllllllllllllllIlIIlIllIllIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIllIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIllIllIlIll.init(lIllllIIlIl[3], llllllllllllllllIlIIlIllIllIllII);
            return new String(llllllllllllllllIlIIlIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIllIllIlIlI) {
            llllllllllllllllIlIIlIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        if (lIIllIlIIllIll(bW() ? 1 : 0)) {
            this.eZ = lIllllIIlIl[1];
        }
        if (lIIllIlIIlllII(this.eZ)) {
            this.eZ -= lIllllIIlIl[2];
            return List.of(aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        String[] strArr = new String[lIllllIIlIl[2]];
        strArr[lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIlIIlllIl(nearest) && lIIllIlIIllllI(nearest.getWorldArea().distanceTo(Players.getLocal()), lIllllIIlIl[3]) && lIIllIlIIllIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            return List.of(aQ(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] strArr2 = new String[lIllllIIlIl[3]];
        strArr2[lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[2]];
        strArr2[lIllllIIlIl[2]] = lIllllIIIIl[lIllllIIlIl[3]];
        return lIIllIlIIlllIl(NPCs.getNearest(strArr2)) ? List.of(aQ(), Prayer.PROTECT_FROM_MISSILES) : List.of(aQ());
    }

    private static boolean lIIllIlIIlllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIlIlIIIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIIllIlIIllIlI();
        lIIllIlIIlIlll();
    }

    private static boolean lIIllIlIlIIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllIlIIllllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIIllIlIIlIllI(String llllllllllllllllIlIIlIllIlIllIIl, String llllllllllllllllIlIIlIllIlIllIII) {
        String llllllllllllllllIlIIlIllIlIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIllIlIlIlll = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIlIllIlIllIII.toCharArray();
        int llllllllllllllllIlIIlIllIlIlIlIl = lIllllIIlIl[0];
        char[] charArray2 = llllllllllllllllIlIIlIllIlIllIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllllIIlIl[0];
        while (lIIllIlIlIIIIl(i, length)) {
            char llllllllllllllllIlIIlIllIlIllIlI = charArray2[i];
            llllllllllllllllIlIIlIllIlIlIlll.append((char) (llllllllllllllllIlIIlIllIlIllIlI ^ charArray[llllllllllllllllIlIIlIllIlIlIlIl % charArray.length]));
            "".length();
            llllllllllllllllIlIIlIllIlIlIlIl++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIlIllIlIlIlll);
    }

    private static boolean lIIllIlIIlllII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    private boolean bW() {
        int i = lIllllIIlIl[0];
        for (GraphicsObject graphicsObject : Static.getClient().getGraphicsObjects()) {
            if (lIIllIlIIlllll(graphicsObject.getId(), lIllllIIlIl[9])) {
                i++;
            }
            "".length();
            if ("  ".length() <= 0) {
                return ((((155 + 119) - 255) + 170) ^ (((110 + 29) - 48) + 50)) & (((((35 + 22) - 30) + 101) ^ (((146 + 67) - 178) + 141)) ^ (-" ".length()));
            }
        }
        if (lIIllIlIlIIIII(i, lIllllIIlIl[1])) {
            ?? r0 = lIllllIIlIl[2];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllllIIlIl[0];
    }

    private static boolean lIIllIlIIlllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return lIllllIIlIl[2];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        SquireAutoTOA squireAutoTOA = this.cm;
        int[] iArr = new int[lIllllIIlIl[5]];
        iArr[lIllllIIlIl[0]] = lIllllIIlIl[6];
        iArr[lIllllIIlIl[2]] = lIllllIIlIl[7];
        iArr[lIllllIIlIl[3]] = lIllllIIlIl[8];
        return squireAutoTOA.a(iArr);
    }

    private static void lIIllIlIIllIlI() {
        lIllllIIlIl = new int[10];
        lIllllIIlIl[0] = ((157 ^ 160) ^ (14 ^ 116)) & (((205 ^ 167) ^ (54 ^ 27)) ^ (-" ".length()));
        lIllllIIlIl[1] = 129 ^ 135;
        lIllllIIlIl[2] = " ".length();
        lIllllIIlIl[3] = "  ".length();
        lIllllIIlIl[4] = (-132) & 14295;
        lIllllIIlIl[5] = "   ".length();
        lIllllIIlIl[6] = (-16441) & 28159;
        lIllllIIlIl[7] = (-564) & 12283;
        lIllllIIlIl[8] = (-16407) & 28127;
        lIllllIIlIl[9] = (-6017) & 8165;
    }

    private static void lIIllIlIIlIlll() {
        lIllllIIIIl = new String[lIllllIIlIl[5]];
        lIllllIIIIl[lIllllIIlIl[0]] = lIIllIlIIlIlIl("WLlY44f4XF2q5v4/zQGWCQ==", "fLKEj");
        lIllllIIIIl[lIllllIIlIl[2]] = lIIllIlIIlIllI("Bgg+ACc8FjBUADYZJRUx", "UxWtS");
        lIllllIIIIl[lIllllIIlIl[3]] = lIIllIlIIlIlIl("Wv16Y0xxP76oiaqd5Yen0Q==", "XgGSn");
    }

    @Inject
    public C0037bj(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.eZ = lIllllIIlIl[0];
    }
}

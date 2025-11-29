package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bG  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bG.class */
public abstract class bG extends AbstractC0015ao {
    private static final /* synthetic */ int go;
    private static /* synthetic */ String[] llIlIIIIlIl;
    private static final /* synthetic */ int gn;
    private static /* synthetic */ int[] llIlIIIIllI;

    private static String lIlIIlIIlIIIIl(String llllllllllllllllIIlllIIIIllIlIlI, String llllllllllllllllIIlllIIIIllIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIllI[19]), "DES");
            Cipher llllllllllllllllIIlllIIIIllIllII = Cipher.getInstance("DES");
            llllllllllllllllIIlllIIIIllIllII.init(llIlIIIIllI[11], llllllllllllllllIIlllIIIIllIllIl);
            return new String(llllllllllllllllIIlllIIIIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIIIllIlIll) {
            llllllllllllllllIIlllIIIIllIlIll.printStackTrace();
            return null;
        }
    }

    public NPC co() {
        int[] iArr = new int[llIlIIIIllI[8]];
        iArr[llIlIIIIllI[7]] = llIlIIIIllI[9];
        iArr[llIlIIIIllI[2]] = llIlIIIIllI[10];
        iArr[llIlIIIIllI[11]] = llIlIIIIllI[12];
        iArr[llIlIIIIllI[13]] = llIlIIIIllI[14];
        iArr[llIlIIIIllI[15]] = llIlIIIIllI[16];
        iArr[llIlIIIIllI[17]] = llIlIIIIllI[18];
        return NPCs.getNearest(iArr);
    }

    private static boolean lIlIIlIIlIlIIl(Object obj) {
        return obj == null;
    }

    static {
        lIlIIlIIlIIlIl();
        lIlIIlIIlIIlII();
        gn = llIlIIIIllI[0];
        go = llIlIIIIllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        if (lIlIIlIIlIIllI(this.cw.j(llIlIIIIllI[1]) ? 1 : 0)) {
            return llIlIIIIllI[2];
        }
        int llllllllllllllllIIlllIIIIlllIllI = aX();
        if (lIlIIlIIlIIlll(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[3]) && lIlIIlIIlIIlll(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[4]) && lIlIIlIIlIIlll(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[5]) && !lIlIIlIIlIlIII(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[6])) {
            return llIlIIIIllI[7];
        }
        ?? r0 = llIlIIIIllI[2];
        "".length();
        return ((38 ^ 109) ^ (213 ^ 154)) > ((((130 + 107) - 220) + 118) ^ (((42 + 98) - 29) + 20)) ? ((((146 + 192) - 232) + 139) ^ (((76 + 91) - 112) + 117)) & (((34 ^ 59) ^ (46 ^ 110)) ^ (-" ".length())) : r0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public bG(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIIlIIlIlIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean aS() {
        if (lIlIIlIIlIlIIl(NPCs.getNearest(npc -> {
            if (lIlIIlIIlIIllI(npc.getName().contains(llIlIIIIlIl[llIlIIIIllI[2]]) ? 1 : 0)) {
                String[] strArr = new String[llIlIIIIllI[2]];
                strArr[llIlIIIIllI[7]] = llIlIIIIlIl[llIlIIIIllI[11]];
                if (lIlIIlIIlIIllI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llIlIIIIllI[2];
                    "".length();
                    return " ".length() != " ".length() ? ((((199 + 92) - 96) + 55) ^ (((41 + 54) - 39) + 138)) & (((190 ^ 199) ^ (103 ^ 38)) ^ (-" ".length())) : r0;
                }
            }
            return llIlIIIIllI[7];
        }))) {
            ?? r0 = llIlIIIIllI[2];
            "".length();
            return ((12 ^ 74) & ((255 ^ 185) ^ (-1))) >= (109 ^ 105) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIIllI[7];
    }

    private static void lIlIIlIIlIIlII() {
        llIlIIIIlIl = new String[llIlIIIIllI[13]];
        llIlIIIIlIl[llIlIIIIllI[7]] = lIlIIlIIlIIIIl("Fu4bILPFWds=", "GbpUi");
        llIlIIIIlIl[llIlIIIIllI[2]] = lIlIIlIIlIIIlI("GyUVBA8nLA==", "TGphf");
        llIlIIIIlIl[llIlIIIIllI[11]] = lIlIIlIIlIIIll("kuxmGJefngM=", "jNiji");
    }

    private static String lIlIIlIIlIIIll(String llllllllllllllllIIlllIIIIlIIIlIl, String llllllllllllllllIIlllIIIIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIIllI[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIIIlIIIllI) {
            llllllllllllllllIIlllIIIIlIIIllI.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bi() {
        return llIlIIIIllI[0];
    }

    private static boolean lIlIIlIIlIIlll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        return llIlIIIIllI[7];
    }

    private static boolean lIlIIlIIlIlIII(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIlIIlIIIlI(String llllllllllllllllIIlllIIIIlIllIlI, String llllllllllllllllIIlllIIIIlIllIIl) {
        String llllllllllllllllIIlllIIIIlIllIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllIIIIlIllIIl.toCharArray();
        int llllllllllllllllIIlllIIIIlIlIllI = llIlIIIIllI[7];
        char[] charArray2 = llllllllllllllllIIlllIIIIlIllIlI2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllllIIlllIIIIlIIlllI = llIlIIIIllI[7];
        while (lIlIIlIIlIlIll(llllllllllllllllIIlllIIIIlIIlllI, length)) {
            char llllllllllllllllIIlllIIIIlIllIll = charArray2[llllllllllllllllIIlllIIIIlIIlllI];
            sb.append((char) (llllllllllllllllIIlllIIIIlIllIll ^ charArray[llllllllllllllllIIlllIIIIlIlIllI % charArray.length]));
            "".length();
            llllllllllllllllIIlllIIIIlIlIllI++;
            llllllllllllllllIIlllIIIIlIIlllI++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIlIIlIIllI(int i) {
        return i != 0;
    }

    private static boolean lIlIIlIIlIlIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        String[] strArr = new String[llIlIIIIllI[2]];
        strArr[llIlIIIIllI[7]] = llIlIIIIlIl[llIlIIIIllI[7]];
        if (!lIlIIlIIlIlIIl(NPCs.getNearest(strArr)) || lIlIIlIIlIlIlI(co())) {
            ?? r0 = llIlIIIIllI[2];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIIllI[7];
    }

    private static void lIlIIlIIlIIlIl() {
        llIlIIIIllI = new int[20];
        llIlIIIIllI[0] = (-((-2702) & 20111)) & (-13) & 32605;
        llIlIIIIllI[1] = (-((-8662) & 26591)) & (-7) & 32607;
        llIlIIIIllI[2] = " ".length();
        llIlIIIIllI[3] = (-((-1075) & 17979)) & (-4101) & 32765;
        llIlIIIIllI[4] = (-(46 ^ 39)) & (-16390) & 28159;
        llIlIIIIllI[5] = (-((-28131) & 32743)) & (-16385) & 32759;
        llIlIIIIllI[6] = (-4620) & 16383;
        llIlIIIIllI[7] = ((((44 + 37) - (-41)) + 8) ^ (((128 + 69) - 99) + 37)) & (((77 ^ 6) ^ (31 ^ 81)) ^ (-" ".length()));
        llIlIIIIllI[8] = 38 ^ 32;
        llIlIIIIllI[9] = (-20487) & 32239;
        llIlIIIIllI[10] = (-(122 ^ 107)) & (-20482) & 32251;
        llIlIIIIllI[11] = "  ".length();
        llIlIIIIllI[12] = (-((-2307) & 18711)) & (-1) & 28159;
        llIlIIIIllI[13] = "   ".length();
        llIlIIIIllI[14] = (-16403) & 28158;
        llIlIIIIllI[15] = (146 ^ 197) ^ (26 ^ 73);
        llIlIIIIllI[16] = (-"   ".length()) & (-1) & 11759;
        llIlIIIIllI[17] = 33 ^ 36;
        llIlIIIIllI[18] = (-((-11362) & 28259)) & (-17) & 28671;
        llIlIIIIllI[19] = 96 ^ 104;
    }
}

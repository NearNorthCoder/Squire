package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Gathering harpoon", priority = 100, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.s  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/s.class */
public class s extends l {
    private static /* synthetic */ String[] lIIllIllIIIlI;
    private static /* synthetic */ int[] lIIllIllIlIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIIlIlIIIIl(this.ar.m() ? 1 : 0)) {
            ?? r0 = lIIllIllIlIlI[0];
            "".length();
            return (-(158 ^ 154)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIllIlIlI[1];
    }

    private static boolean lIllIIIlIlIIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        if (lIllIIIlIlIIIlI(Inventory.getCount(item -> {
            return item.getName().toLowerCase().endsWith(lIIllIllIIIlI[lIIllIllIlIlI[3]]);
        }), lIIllIllIlIlI[0])) {
            int[] iArr = new int[lIIllIllIlIlI[0]];
            iArr[lIIllIllIlIlI[1]] = lIIllIllIlIlI[2];
            Inventory.getFirst(iArr).interact(lIIllIllIIIlI[lIIllIllIlIlI[1]]);
            return lIIllIllIlIlI[0];
        }
        c N = this.ar.N();
        Locatable S = N.S();
        if (lIllIIIlIlIIIll(S) && lIllIIIlIlIIIIl(this.au.a(S) ? 1 : 0)) {
            S.interact(lIIllIllIIIlI[lIIllIllIlIlI[0]]);
            return lIIllIllIlIlI[0];
        }
        this.au.b(N.Y());
        "".length();
        return lIIllIllIlIlI[0];
    }

    private static void lIllIIIlIlIIIII() {
        lIIllIllIlIlI = new int[5];
        lIIllIllIlIlI[0] = " ".length();
        lIIllIllIlIlI[1] = ((((138 + 58) - 138) + 83) ^ (((10 + 26) - (-112)) + 2)) & (((56 ^ 74) ^ (196 ^ 173)) ^ (-" ".length()));
        lIIllIllIlIlI[2] = (-4161) & 4471;
        lIIllIllIlIlI[3] = "  ".length();
        lIIllIllIlIlI[4] = "   ".length();
    }

    @Inject
    protected s(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIlIIlllll() {
        lIIllIllIIIlI = new String[lIIllIllIlIlI[4]];
        lIIllIllIIIlI[lIIllIllIlIlI[1]] = lIllIIIlIIIlIIl("qSB1YElik2Y=", "cozLK");
        lIIllIllIIIlI[lIIllIllIlIlI[0]] = lIllIIIlIIllllI("GBgsAw==", "LyGft");
        lIIllIllIIIlI[lIIllIllIlIlI[3]] = lIllIIIlIIIlIIl("L4ozuXwugU8=", "jvoVD");
    }

    private static boolean lIllIIIlIlIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlIlIIIll(Object obj) {
        return obj != null;
    }

    static {
        lIllIIIlIlIIIII();
        lIllIIIlIIlllll();
    }

    private static boolean lIllIIIlIlIIIIl(int i) {
        return i == 0;
    }

    private static String lIllIIIlIIIlIIl(String llllllllllllllIlllIlllIIllllIlII, String llllllllllllllIlllIlllIIllllIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllIlIlI[3], llllllllllllllIlllIlllIIllllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIllllIlIl) {
            llllllllllllllIlllIlllIIllllIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIllllI(String llllllllllllllIlllIlllIIlllIIlII, String llllllllllllllIlllIlllIIlllIIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllIIlllIIIll.toCharArray();
        int llllllllllllllIlllIlllIIlllIIIII = lIIllIllIlIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIlllIIllIllIII = lIIllIllIlIlI[1];
        while (lIllIIIlIlIIlII(llllllllllllllIlllIlllIIllIllIII, length)) {
            sb.append((char) (charArray2[llllllllllllllIlllIlllIIllIllIII] ^ charArray[llllllllllllllIlllIlllIIlllIIIII % charArray.length]));
            "".length();
            llllllllllllllIlllIlllIIlllIIIII++;
            llllllllllllllIlllIlllIIllIllIII++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}

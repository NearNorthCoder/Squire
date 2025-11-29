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
@TaskDesc(name = "Gathering buckets", priority = 100, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.q  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/q.class */
public class q extends l {
    private static /* synthetic */ int[] lIIllIllIllII;
    private static /* synthetic */ String[] lIIllIllIlIll;

    private static void lIllIIIlIlIIlll() {
        lIIllIllIlIll = new String[lIIllIllIllII[3]];
        lIIllIllIlIll[lIIllIllIllII[1]] = lIllIIIlIlIIlIl("G0KG2zU9f6Q=", "SPaBS");
        lIIllIllIlIll[lIIllIllIllII[0]] = lIllIIIlIlIIlIl("YnqwO2WzvlA=", "aenzS");
        lIIllIllIlIll[lIIllIllIllII[2]] = lIllIIIlIlIIllI("FSAGIBQj", "WUeKq");
    }

    private static boolean lIllIIIlIlIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIIlIlIllII(int i) {
        return i == 0;
    }

    private static void lIllIIIlIlIlIII() {
        lIIllIllIllII = new int[4];
        lIIllIllIllII[0] = " ".length();
        lIIllIllIllII[1] = ((((59 + 114) - (-9)) + 17) ^ (((18 + 89) - 70) + 128)) & (((91 ^ 104) ^ (44 ^ 125)) ^ (-" ".length()));
        lIIllIllIllII[2] = "  ".length();
        lIIllIllIllII[3] = "   ".length();
    }

    private static String lIllIIIlIlIIlIl(String llllllllllllllIlllIlllIIlIlllIll, String llllllllllllllIlllIlllIIlIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIlIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIlIllllIl.init(lIIllIllIllII[2], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIlIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIlIllllII) {
            llllllllllllllIlllIlllIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIlIlIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIIlIlIlIIl(this.ar.p(), this.as.numberOfBuckets())) {
            ?? r0 = lIIllIllIllII[0];
            "".length();
            return " ".length() <= ((107 ^ 103) & ((68 ^ 72) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIllIllII[1];
    }

    @Inject
    protected q(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlIlIlIIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        if (lIllIIIlIlIlIlI(this.ar.p(), this.as.numberOfBuckets())) {
            Inventory.getFirst(item -> {
                return item.getName().contains(lIIllIllIlIll[lIIllIllIllII[2]]);
            }).interact(lIIllIllIlIll[lIIllIllIllII[1]]);
            return lIIllIllIllII[0];
        }
        c N = this.ar.N();
        Locatable O = N.O();
        if (lIllIIIlIlIlIll(O) && lIllIIIlIlIllII(this.au.a(O) ? 1 : 0)) {
            O.interact(lIIllIllIlIll[lIIllIllIllII[0]]);
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            this.au.b(N.aa());
            "".length();
        }
        return lIIllIllIllII[0];
    }

    static {
        lIllIIIlIlIlIII();
        lIllIIIlIlIIlll();
    }

    private static String lIllIIIlIlIIllI(String llllllllllllllIlllIlllIIlIlIlIll, String llllllllllllllIlllIlllIIlIlIlIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlllIIlIlIlIII = llllllllllllllIlllIlllIIlIlIlIlI.toCharArray();
        int llllllllllllllIlllIlllIIlIlIIlll = lIIllIllIllII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIllIllII[1];
        while (lIllIIIlIlIllIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIlllIIlIlIlIII[llllllllllllllIlllIlllIIlIlIIlll % llllllllllllllIlllIlllIIlIlIlIII.length]));
            "".length();
            llllllllllllllIlllIlllIIlIlIIlll++;
            i++;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlIlIllIl(int i, int i2) {
        return i < i2;
    }
}

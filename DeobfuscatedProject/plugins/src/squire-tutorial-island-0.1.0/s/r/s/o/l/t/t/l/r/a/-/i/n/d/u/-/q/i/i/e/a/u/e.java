/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.runelite.api.Client
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.j;

public abstract class e
implements j {
    protected /* synthetic */ boolean N;
    private /* synthetic */ String P;
    private static /* synthetic */ int[] lIlIIlIIIllII;
    private /* synthetic */ j Q;
    private static /* synthetic */ String[] lIlIIlIIIlIll;
    private /* synthetic */ String O;

    private static void lIlllIIlIIIIlII() {
        lIlIIlIIIlIll = new String[lIlIIlIIIllII[2]];
        e.lIlIIlIIIlIll[e.lIlIIlIIIllII[0]] = e.lIlllIIlIIIIIll("nW5nhmjOtag=", "bEyid");
        e.lIlIIlIIIlIll[e.lIlIIlIIIllII[1]] = e.lIlllIIlIIIIIll("jc7xX5my098=", "nPSKY");
    }

    private static String lIlllIIlIIIIIll(String llllllllllllllIlllIIIIlIIIlIlIIl, String llllllllllllllIlllIIIIlIIIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIIIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIllII[3]), "DES");
            Cipher llllllllllllllIlllIIIIlIIIlIlIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIlIIIlIlIll.init(lIlIIlIIIllII[2], llllllllllllllIlllIIIIlIIIlIllII);
            return new String(llllllllllllllIlllIIIIlIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlIIIlIlIlI) {
            llllllllllllllIlllIIIIlIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean j() {
        return this.N;
    }

    @Override
    public void d(String string) {
        this.P = string;
    }

    @Override
    public j n() {
        return this.Q;
    }

    @Override
    public void c(String string) {
        this.O = string;
    }

    @Override
    public abstract String k();

    @Override
    public abstract boolean a(Client var1);

    @Override
    public void a(j j2) {
        this.Q = j2;
    }

    private static boolean lIlllIIlIIIIllI(Object object) {
        return object != null;
    }

    private static void lIlllIIlIIIIlIl() {
        lIlIIlIIIllII = new int[4];
        e.lIlIIlIIIllII[0] = (0x9A ^ 0xAC ^ (0x26 ^ 0x21)) & (0x6B ^ 0x19 ^ (0x59 ^ 0x1A) ^ -" ".length());
        e.lIlIIlIIIllII[1] = " ".length();
        e.lIlIIlIIIllII[2] = "  ".length();
        e.lIlIIlIIIllII[3] = 0x4F ^ 0x20 ^ (0x50 ^ 0x37);
    }

    private static boolean lIlllIIlIIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        e.lIlllIIlIIIIlIl();
        e.lIlllIIlIIIIlII();
    }

    /*
     * WARNING - void declaration
     */
    public void e(String string) {
        void llllllllllllllIlllIIIIlIIIllIIll;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.l();
        if (e.lIlllIIlIIIIllI(string2)) {
            String string3;
            stringBuilder.append(string2);
            "".length();
            if (e.lIlllIIlIIIIlll(string2.isEmpty() ? 1 : 0)) {
                string3 = lIlIIlIIIlIll[lIlIIlIIIllII[0]];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                string3 = lIlIIlIIIlIll[lIlIIlIIIllII[1]];
            }
            stringBuilder.append(string3);
            "".length();
        }
        if (e.lIlllIIlIIIIllI(llllllllllllllIlllIIIIlIIIllIIll)) {
            void llllllllllllllIlllIIIIlIIIllIIlI;
            llllllllllllllIlllIIIIlIIIllIIlI.append((String)llllllllllllllIlllIIIIlIIIllIIll);
            "".length();
        }
        this.O = String.valueOf(stringBuilder);
    }

    public e() {
        this.N = lIlIIlIIIllII[0];
        this.Q = null;
    }

    @Override
    @Nullable
    public String l() {
        return this.O;
    }

    @Override
    @Nullable
    public String m() {
        return this.P;
    }
}


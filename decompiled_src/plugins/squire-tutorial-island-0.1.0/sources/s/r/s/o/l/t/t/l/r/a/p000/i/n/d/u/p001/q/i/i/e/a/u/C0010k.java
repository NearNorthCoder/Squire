package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.k  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/k.class */
public class C0010k extends AbstractC0004e {
    private final /* synthetic */ boolean ae;
    private /* synthetic */ String af;
    private static /* synthetic */ String[] lIlIIIllIIlII;
    private static /* synthetic */ int[] lIlIIIllIIlIl;
    private final /* synthetic */ List<C0003d> ad;

    private static boolean lIlllIIIIIlllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlllIIIIIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIIIIIllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.AbstractC0004e, s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    public boolean a(Client client) {
        Player localPlayer = client.getLocalPlayer();
        if (lIlllIIIIIllIll(localPlayer) && lIlllIIIIIllIll(this.ad)) {
            WorldPoint fromLocalInstance = WorldPoint.fromLocalInstance(client, localPlayer.getLocalLocation());
            if (lIlllIIIIIlllII(this.ad.stream().anyMatch(c0003d -> {
                return c0003d.a(fromLocalInstance);
            }) ? 1 : 0, this.ae ? 1 : 0)) {
                ?? r0 = lIlIIIllIIlIl[1];
                "".length();
                return (-(17 ^ 21)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIllIIlIl[0];
        }
        return lIlIIIllIIlIl[0];
    }

    private static void lIlllIIIIIllIII() {
        lIlIIIllIIlII = new String[lIlIIIllIIlIl[1]];
        lIlIIIllIIlII[lIlIIIllIIlIl[0]] = lIlllIIIIIlIlll("nWzR0fsuEOw=", "DVGUX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public C0010k(WorldPoint... worldPointArr) {
        this.ad = (List) Stream.of((Object[]) worldPointArr).map(C0003d::new).collect(C0008i.x());
        this.ae = lIlIIIllIIlIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public C0010k(String str, C0003d c0003d) {
        this(str, lIlIIIllIIlIl[0], c0003d);
    }

    public C0010k(boolean z, C0003d... c0003dArr) {
        this.ad = C0008i.a(c0003dArr);
        this.ae = z;
    }

    private static String lIlllIIIIIlIlll(String llllllllllllllIlllIIIlIIlllllIlI, String llllllllllllllIlllIIIlIIlllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIllllllII.init(lIlIIIllIIlIl[2], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIlllllIll) {
            llllllllllllllIlllIIIlIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIIllIll(Object obj) {
        return obj != null;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.AbstractC0004e, s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0009j
    @Nonnull
    public String k() {
        if (lIlllIIIIIlllIl(this.af)) {
            String str = lIlIIIllIIlII[lIlIIIllIIlIl[0]];
            "".length();
            if ((-((39 ^ 115) ^ (214 ^ 134))) > 0) {
                return null;
            }
            return str;
        }
        return this.af;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public C0010k(C0003d... c0003dArr) {
        this.ad = C0008i.a(c0003dArr);
        this.ae = lIlIIIllIIlIl[1];
    }

    static {
        lIlllIIIIIllIIl();
        lIlllIIIIIllIII();
    }

    private static void lIlllIIIIIllIIl() {
        lIlIIIllIIlIl = new int[3];
        lIlIIIllIIlIl[0] = ((((155 + 78) - 219) + 145) ^ (((48 + 44) - (-5)) + 98)) & (((92 ^ 42) ^ (53 ^ 31)) ^ (-" ".length()));
        lIlIIIllIIlIl[1] = " ".length();
        lIlIIIllIIlIl[2] = "  ".length();
    }

    public C0010k(boolean z, WorldPoint... worldPointArr) {
        this.ad = (List) Stream.of((Object[]) worldPointArr).map(C0003d::new).collect(C0008i.x());
        this.ae = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0010k(String str, boolean z, C0003d c0003d) {
        boolean z2;
        this.af = str;
        if (lIlllIIIIIllIlI(z ? 1 : 0)) {
            int i = lIlIIIllIIlIl[1];
            "".length();
            z2 = i;
            if ("   ".length() == "  ".length()) {
                throw null;
            }
        } else {
            z2 = lIlIIIllIIlIl[0];
        }
        this.ae = z2;
        C0003d[] c0003dArr = new C0003d[lIlIIIllIIlIl[1]];
        c0003dArr[lIlIIIllIIlIl[0]] = c0003d;
        this.ad = C0008i.a(c0003dArr);
    }
}

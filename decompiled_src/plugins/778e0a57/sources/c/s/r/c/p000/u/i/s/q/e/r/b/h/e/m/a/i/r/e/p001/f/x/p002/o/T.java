package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@TaskDesc(name = "Setting up Auto Rooms", priority = 50000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.T  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/T.class */
public class T extends U {
    private static /* synthetic */ int[] lIlIIlllIIll;
    private static /* synthetic */ String[] lIlIIlllIIlI;

    private static boolean llIllIllIIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void llIllIllIIIIIl() {
        lIlIIlllIIlI = new String[lIlIIlllIIll[1]];
        lIlIIlllIIlI[lIlIIlllIIll[0]] = llIllIllIIIIII("jkSygAaAoXKORLKABoChcobgRvK6hNBJ", "thsJh");
    }

    private static void llIllIllIIIIlI() {
        lIlIIlllIIll = new int[3];
        lIlIIlllIIll[0] = ((((139 + 42) - 139) + 148) ^ (((161 + 58) - 84) + 40)) & (((170 ^ 141) ^ (97 ^ 87)) ^ (-" ".length()));
        lIlIIlllIIll[1] = " ".length();
        lIlIIlllIIll[2] = "  ".length();
    }

    private static boolean llIllIllIIIllI(int i) {
        return i != 0;
    }

    private static boolean llIllIllIIIlll(Object obj) {
        return obj == null;
    }

    private static boolean llIllIllIIIlII(int i, int i2) {
        return i < i2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllIllIIIIll(this.bS.getPlane())) {
            return lIlIIlllIIll[0];
        }
        C0039n c0039n = null;
        int i = lIlIIlllIIll[0];
        int i2 = lIlIIlllIIll[0];
        do {
            if (llIllIllIIIlII(i2, this.co.D().size())) {
                C0039n c0039n2 = this.co.D().get(i2);
                if (llIllIllIIIlIl(c0039n2) && llIllIllIIIllI(c0039n2.a((Locatable) this.bS) ? 1 : 0)) {
                    i = i2;
                    System.out.println(lIlIIlllIIlI[lIlIIlllIIll[0]]);
                    c0039n = this.co.D().get(i2);
                    System.out.println("Found room: " + String.valueOf(c0039n.bw));
                    "".length();
                    if ((true ^ true) != (true ^ true)) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i2++;
                    "".length();
                }
            }
            if (llIllIllIIIlll(c0039n)) {
                return lIlIIlllIIll[1];
            }
            this.co.a(c0039n);
            if (llIllIllIIlIII(c0039n.bw, N.END) && llIllIllIIIlII(i + lIlIIlllIIll[1], this.co.D().size())) {
                this.co.b(this.co.D().get(i + lIlIIlllIIll[1]));
            }
            this.co.h(i);
            return lIlIIlllIIll[0];
        } while (0 == 0);
        return (true ^ true) & ((true ^ true) ^ true);
    }

    private static String llIllIllIIIIII(String lllllllllllllllIllIlIlllIIlllIll, String lllllllllllllllIllIlIlllIIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlllIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlllIIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlllIIllllIl.init(lIlIIlllIIll[2], secretKeySpec);
            return new String(lllllllllllllllIllIlIlllIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlllIIllllII) {
            lllllllllllllllIllIlIlllIIllllII.printStackTrace();
            return null;
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        return lIlIIlllIIll[1];
    }

    private static boolean llIllIllIIIIll(int i) {
        return i == 0;
    }

    static {
        llIllIllIIIIlI();
        llIllIllIIIIIl();
    }

    private static boolean llIllIllIIIlIl(Object obj) {
        return obj != null;
    }

    @Inject
    protected T(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }
}

package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
@TaskDesc(name = "Clearing dead crop", priority = 5, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aW  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aW.class */
public class aW extends aX {
    private static /* synthetic */ int[] llIIIIIIlIlI;
    private static /* synthetic */ String[] llIIIIIIlIIl;

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean J(N n) {
        sleep(llIIIIIIlIlI[3]);
        return a(n, tileObject -> {
            String str = llIIIIIIlIIl[llIIIIIIlIlI[2]];
            tileObject.interact((v1) -> {
                return r1.equals(v1);
            });
        });
    }

    private static boolean llllIIIlIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIIIlIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static void llllIIIlIIIIIl() {
        llIIIIIIlIIl = new String[llIIIIIIlIlI[1]];
        llIIIIIIlIIl[llIIIIIIlIlI[2]] = llllIIIlIIIIII("CTU8DyU=", "JYYnW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean bv() {
        if (llllIIIlIIIIll(super.bv() ? 1 : 0)) {
            sleep(llIIIIIIlIlI[0]);
            return llIIIIIIlIlI[1];
        }
        return llIIIIIIlIlI[2];
    }

    static {
        llllIIIlIIIIlI();
        llllIIIlIIIIIl();
    }

    @Inject
    public aW(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client, c0014an -> {
            if (llllIIIlIIIlII(c0014an.aZ(), EnumC0039n.DEAD)) {
                ?? r0 = llIIIIIIlIlI[1];
                "".length();
                return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIIIlIlI[2];
        });
    }

    private static void llllIIIlIIIIlI() {
        llIIIIIIlIlI = new int[4];
        llIIIIIIlIlI[0] = (8 ^ 44) ^ (176 ^ 144);
        llIIIIIIlIlI[1] = " ".length();
        llIIIIIIlIlI[2] = (168 ^ 154) & ((126 ^ 76) ^ (-1));
        llIIIIIIlIlI[3] = "   ".length();
    }

    private static boolean llllIIIlIIIIll(int i) {
        return i != 0;
    }

    private static String llllIIIlIIIIII(String lllllllllllllllIlIlIlllIIIIIIIII, String lllllllllllllllIlIlIllIlllllllll) {
        String lllllllllllllllIlIlIlllIIIIIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIllIlllllllIl = lllllllllllllllIlIlIllIlllllllll.toCharArray();
        int lllllllllllllllIlIlIllIlllllllII = llIIIIIIlIlI[2];
        char[] charArray = lllllllllllllllIlIlIlllIIIIIIIII2.toCharArray();
        int length = charArray.length;
        int i = llIIIIIIlIlI[2];
        while (llllIIIlIIIlIl(i, length)) {
            char lllllllllllllllIlIlIllIlllllIIll = charArray[i];
            sb.append((char) (lllllllllllllllIlIlIllIlllllIIll ^ lllllllllllllllIlIlIllIlllllllIl[lllllllllllllllIlIlIllIlllllllII % lllllllllllllllIlIlIllIlllllllIl.length]));
            "".length();
            lllllllllllllllIlIlIllIlllllllII++;
            i++;
            "".length();
            if ((-" ".length()) > ((97 ^ 115) & ((67 ^ 81) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}

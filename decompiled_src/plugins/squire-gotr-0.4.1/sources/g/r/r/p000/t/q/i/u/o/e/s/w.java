package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Entering essence portal", priority = 5, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.w  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/w.class */
public class w extends h {
    private static /* synthetic */ String[] llIIlllllIIl;
    private static /* synthetic */ int[] llIIlllllIlI;

    private static String lllllllllIIIII(String lllllllllllllllIlIIlIllIIIIlIIII, String lllllllllllllllIlIIlIllIIIIIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllIIIIIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIllIIIIIllll.toCharArray();
        int lllllllllllllllIlIIlIllIIIIIllII = llIIlllllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlllllIlI[1];
        while (lllllllllIlIll(i, length)) {
            lllllllllllllllIlIIlIllIIIIIlllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlIllIIIIIllII % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIllIIIIIllII++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIllIIIIIlllI);
    }

    private static boolean lllllllllIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllllllllIllIl(Object obj) {
        return obj == null;
    }

    private static void lllllllllIIlII() {
        llIIlllllIlI = new int[6];
        llIIlllllIlI[0] = " ".length();
        llIIlllllIlI[1] = ((246 ^ 152) ^ (94 ^ 63)) & (((((160 + 83) - 145) + 78) ^ (((164 + 180) - 220) + 67)) ^ (-" ".length()));
        llIIlllllIlI[2] = "   ".length();
        llIIlllllIlI[3] = (((8 + 0) - (-68)) + 84) ^ (((90 + 84) - 79) + 75);
        llIIlllllIlI[4] = (38 ^ 81) ^ (246 ^ 159);
        llIIlllllIlI[5] = "  ".length();
    }

    private static boolean lllllllllIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lllllllllIlIll(int i, int i2) {
        return i < i2;
    }

    private static void lllllllllIIIIl() {
        llIIlllllIIl = new String[llIIlllllIlI[0]];
        llIIlllllIIl[llIIlllllIlI[1]] = lllllllllIIIII("AhYDHCA=", "GxwyR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIIlllllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (lllllllllIIlll(this.aV.g() ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        if (!lllllllllIIlll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0) || lllllllllIlIIl(SquireGOTRPlugin.h.contains(Players.getLocal()) ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        int q = this.aV.q() - this.aV.p();
        if (lllllllllIlIlI(q, llIIlllllIlI[2])) {
            return llIIlllllIlI[1];
        }
        if (lllllllllIlIll(q, llIIlllllIlI[3]) && lllllllllIllII(this.aV.a(), llIIlllllIlI[3])) {
            return llIIlllllIlI[1];
        }
        Instant J = this.aV.J();
        GameObject C = this.aV.C();
        if (lllllllllIllIl(C)) {
            return llIIlllllIlI[1];
        }
        if (!lllllllllIlllI(J) || lllllllllIlIIl(Instant.now().isAfter(J.plus((long) (llIIlllllIlI[4] - (C.distanceTo(Players.getLocal()) / llIIlllllIlI[2])), (TemporalUnit) ChronoUnit.SECONDS)) ? 1 : 0)) {
            return llIIlllllIlI[1];
        }
        if (lllllllllIIlll(b(C) ? 1 : 0)) {
            C.interact(llIIlllllIIl[llIIlllllIlI[1]]);
            c(llIIlllllIlI[5], () -> {
                return a(C.getWorldLocation());
            });
        }
        return llIIlllllIlI[0];
    }

    private static boolean lllllllllIllII(int i, int i2) {
        return i > i2;
    }

    static {
        lllllllllIIlII();
        lllllllllIIIIl();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllllIlI[0]];
        enumC0002cArr[llIIlllllIlI[1]] = EnumC0002c.ACTIVE;
    }

    private static boolean lllllllllIlIIl(int i) {
        return i != 0;
    }

    private static boolean lllllllllIIlll(int i) {
        return i == 0;
    }
}

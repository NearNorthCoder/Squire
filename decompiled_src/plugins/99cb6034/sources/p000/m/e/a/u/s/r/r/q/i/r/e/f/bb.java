package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Vars;
@TaskDesc(name = "Raking the current patch", priority = 10)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.bb  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/bb.class */
public class bb extends aX {
    private static /* synthetic */ String[] llIIIIlIIIll;
    private static /* synthetic */ int[] llIIIIlIIlII;

    private static boolean llllIIlIIIlllI(int i, int i2) {
        return i < i2;
    }

    @Inject
    public bb(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(c0031f, squireFarmerConfig, client, EnumC0021au.WEEDS);
    }

    private static boolean llllIIlIIIllIl(int i) {
        return i != 0;
    }

    private static String llllIIlIIIlIlI(String lllllllllllllllIlIlIllIIIllIIIIl, String lllllllllllllllIlIlIllIIIllIIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIlIllIIIlIllllI = lllllllllllllllIlIlIllIIIllIIIII.toCharArray();
        int lllllllllllllllIlIlIllIIIlIlllIl = llIIIIlIIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIIlIIlII[1];
        while (llllIIlIIIlllI(i, length)) {
            char lllllllllllllllIlIlIllIIIllIIIlI = charArray[i];
            sb.append((char) (lllllllllllllllIlIlIllIIIllIIIlI ^ lllllllllllllllIlIlIllIIIlIllllI[lllllllllllllllIlIlIllIIIlIlllIl % lllllllllllllllIlIlIllIIIlIllllI.length]));
            "".length();
            lllllllllllllllIlIlIllIIIlIlllIl++;
            i++;
            "".length();
            if ((((148 ^ 174) ^ (((42 + 57) - 33) + 61)) & (((176 ^ 137) ^ (193 ^ 189)) ^ (-" ".length()))) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llllIIlIIIllII();
        llllIIlIIIlIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.aX
    public boolean J(N n) {
        if (llllIIlIIIllIl(Vars.getBit(llIIIIlIIlII[0]))) {
            return llIIIIlIIlII[1];
        }
        sleep(llIIIIlIIlII[2]);
        return a(n, tileObject -> {
            String str = llIIIIlIIIll[llIIIIlIIlII[1]];
            tileObject.interact((v1) -> {
                return r1.equals(v1);
            });
        });
    }

    private static void llllIIlIIIllII() {
        llIIIIlIIlII = new int[4];
        llIIIIlIIlII[0] = (-523) & 6079;
        llIIIIlIIlII[1] = ((((129 + 125) - 190) + 87) ^ (((112 + 55) - 151) + 140)) & (((73 ^ 87) ^ (178 ^ 167)) ^ (-" ".length()));
        llIIIIlIIlII[2] = 66 ^ 70;
        llIIIIlIIlII[3] = " ".length();
    }

    private static void llllIIlIIIlIll() {
        llIIIIlIIIll = new String[llIIIIlIIlII[3]];
        llIIIIlIIIll[llIIIIlIIlII[1]] = llllIIlIIIlIlI("FzIFLw==", "ESnJg");
    }
}

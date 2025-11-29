package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Watering Plant", priority = 20, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.v  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/v.class */
public class v extends r {
    private static /* synthetic */ int[] lIIlllllIlIII;
    private static /* synthetic */ String[] lIIlllllIIlll;

    static {
        lIllIlIlllIIIII();
        lIllIlIllIlllll();
    }

    private static boolean lIllIlIlllIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIlIlllIIIlI(Object obj) {
        return obj == null;
    }

    private static void lIllIlIlllIIIII() {
        lIIlllllIlIII = new int[6];
        lIIlllllIlIII[0] = " ".length();
        lIIlllllIlIII[1] = ((((235 + 102) - 258) + 165) ^ (((69 + 100) - 95) + 125)) & (((36 ^ 60) ^ (0 ^ 43)) ^ (-" ".length()));
        lIIlllllIlIII[2] = (-((-5419) & 21935)) & (-785) & 30653;
        lIIlllllIlIII[3] = "  ".length();
        lIIlllllIlIII[4] = (-((-23923) & 32639)) & (-16417) & 30463;
        lIIlllllIlIII[5] = (-25380) & 30719;
    }

    private static boolean lIllIlIlllIIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIlIlllIIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIIlllllIlIII[0]];
        iArr[lIIlllllIlIII[1]] = lIIlllllIlIII[2];
        Item first = Inventory.getFirst(iArr);
        if (lIllIlIlllIIIIl(Inventory.contains(item -> {
            if (lIllIlIlllIIlII(item.getId(), lIIlllllIlIII[4]) && lIllIlIlllIIlIl(item.getId(), lIIlllllIlIII[5])) {
                ?? r0 = lIIlllllIlIII[0];
                "".length();
                return (-((51 ^ 57) ^ (100 ^ 106))) > 0 ? ((((127 + 130) - 80) + 6) ^ (((31 + 29) - 54) + 128)) & (((73 ^ 55) ^ (106 ^ 37)) ^ (-" ".length())) : r0;
            }
            return lIIlllllIlIII[1];
        }) ? 1 : 0) && lIllIlIlllIIIlI(first)) {
            return lIIlllllIlIII[1];
        }
        GameObject a = this.Z.a(lIIlllllIIlll[lIIlllllIlIII[1]]);
        if (lIllIlIlllIIIlI(a)) {
            return lIIlllllIlIII[1];
        }
        a.interact(lIIlllllIIlll[lIIlllllIlIII[0]]);
        if (lIllIlIlllIIIll(a.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldArea()) ? 1 : 0)) {
            sleep(lIIlllllIlIII[3]);
        }
        return lIIlllllIlIII[0];
    }

    private static String lIllIlIllIllllI(String llllllllllllllIlllIIllIIlllllIII, String llllllllllllllIlllIIllIIllllIlll) {
        String llllllllllllllIlllIIllIIlllllIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIllllIllI = new StringBuilder();
        char[] llllllllllllllIlllIIllIIllllIlIl = llllllllllllllIlllIIllIIllllIlll.toCharArray();
        int llllllllllllllIlllIIllIIllllIlII = lIIlllllIlIII[1];
        char[] charArray = llllllllllllllIlllIIllIIlllllIII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIlllIIllIIlllIllII = lIIlllllIlIII[1];
        while (lIllIlIlllIIllI(llllllllllllllIlllIIllIIlllIllII, length)) {
            llllllllllllllIlllIIllIIllllIllI.append((char) (charArray[llllllllllllllIlllIIllIIlllIllII] ^ llllllllllllllIlllIIllIIllllIlIl[llllllllllllllIlllIIllIIllllIlII % llllllllllllllIlllIIllIIllllIlIl.length]));
            "".length();
            llllllllllllllIlllIIllIIllllIlII++;
            llllllllllllllIlllIIllIIlllIllII++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIllIIllllIllI);
    }

    private static boolean lIllIlIlllIIIIl(int i) {
        return i == 0;
    }

    @Inject
    protected v(i iVar) {
        super(iVar);
    }

    private static void lIllIlIllIlllll() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        lIIlllllIIlll[lIIlllllIlIII[1]] = lIllIlIllIllllI("BRszMiA=", "RzGWR");
        lIIlllllIIlll[lIIlllllIlIII[0]] = lIllIlIllIllllI("Li4ANyE=", "yOtRS");
    }

    private static boolean lIllIlIlllIIIll(int i) {
        return i != 0;
    }
}

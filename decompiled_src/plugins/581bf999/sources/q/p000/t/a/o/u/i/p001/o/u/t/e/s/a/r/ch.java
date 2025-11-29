package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Creating TOA Party", priority = 5, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ch  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ch.class */
public class ch extends ck {
    private static /* synthetic */ String[] llIllIllllI;
    private static /* synthetic */ int[] llIllIlllll;
    private static final /* synthetic */ int hQ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        if (!lIlIlIlIlIllIl(Vars.getBit(llIllIlllll[0]), llIllIlllll[1]) && !lIlIlIlIlIlllI(((BankLoadout) this.hY.loadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            Widget widget = this.cu.getWidget(llIllIlllll[3]);
            if (lIlIlIlIlIlllI(Widgets.isVisible(widget) ? 1 : 0)) {
                Log.info(llIllIllllI[llIllIlllll[2]]);
                widget.interact(llIllIllllI[llIllIlllll[1]]);
                return llIllIlllll[1];
            }
            int[] iArr = new int[llIllIlllll[4]];
            iArr[llIllIlllll[2]] = llIllIlllll[5];
            iArr[llIllIlllll[1]] = llIllIlllll[6];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIlIlIlIlIllll(nearest)) {
                Log.info(llIllIllllI[llIllIlllll[4]]);
                nearest.interact(llIllIllllI[llIllIlllll[7]]);
                return llIllIlllll[1];
            }
            return llIllIlllll[2];
        }
        return llIllIlllll[2];
    }

    private static boolean lIlIlIlIlIlllI(int i) {
        return i != 0;
    }

    private static String lIlIlIlIlIlIIl(String llllllllllllllllIIlIlIllllIlIllI, String llllllllllllllllIIlIlIllllIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIllllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllllIlIlll.getBytes(StandardCharsets.UTF_8)), llIllIlllll[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlllll[4], llllllllllllllllIIlIlIllllIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIllllIllIIl) {
            llllllllllllllllIIlIlIllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIlIlIlI(String llllllllllllllllIIlIlIllllIIlIll, String llllllllllllllllIIlIlIllllIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIlllll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIllllIIllII) {
            llllllllllllllllIIlIlIllllIIllII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIlIllII();
        lIlIlIlIlIlIll();
        hQ = llIllIlllll[0];
    }

    private static void lIlIlIlIlIllII() {
        llIllIlllll = new int[10];
        llIllIlllll[0] = (-((-24583) & 26183)) & (-55) & 15999;
        llIllIlllll[1] = " ".length();
        llIllIlllll[2] = ((((108 + 44) - 150) + 130) ^ (((113 + 73) - 84) + 41)) & (((9 ^ 40) ^ (15 ^ 37)) ^ (-" ".length()));
        llIllIlllll[3] = (-14378) & 50608233;
        llIllIlllll[4] = "  ".length();
        llIllIlllll[5] = (-2) & 46069;
        llIllIlllll[6] = (-19465) & 65533;
        llIllIlllll[7] = "   ".length();
        llIllIlllll[8] = 97 ^ 101;
        llIllIlllll[9] = (81 ^ 15) ^ (197 ^ 147);
    }

    private static boolean lIlIlIlIlIllIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected ch(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIlIlIlIlIlIll() {
        llIllIllllI = new String[llIllIlllll[8]];
        llIllIllllI[llIllIlllll[2]] = lIlIlIlIlIlIIl("FdZk7jWgBRxeaIQ8opQk43UUVXwS4Ed5L7Tr0tzm5D4=", "MDtns");
        llIllIllllI[llIllIlllll[1]] = lIlIlIlIlIlIlI("a2NCnEunAXuwwZrc5xVwlw==", "MPzZw");
        llIllIllllI[llIllIlllll[4]] = lIlIlIlIlIlIIl("qBZLGcpjmDpoY+4+LfetVL1X1ewvpQNGhzITF1BaJwkrj1SUg05ozg==", "ZEArp");
        llIllIllllI[llIllIlllll[7]] = lIlIlIlIlIlIIl("p1K/BxwNSqw=", "nisoj");
    }

    private static boolean lIlIlIlIlIllll(Object obj) {
        return obj != null;
    }
}

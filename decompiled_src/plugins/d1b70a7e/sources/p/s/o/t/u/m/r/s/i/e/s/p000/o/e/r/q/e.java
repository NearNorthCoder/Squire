package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Cooking fish", priority = 5, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.e  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/e.class */
public class e extends l {
    private static /* synthetic */ int[] lIIllIlllIIII;
    private static /* synthetic */ String[] lIIllIllIllll;

    @Inject
    protected e(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static String lIllIIIlIlllIIl(String llllllllllllllIlllIlllIIIIlIIIll, String llllllllllllllIlllIlllIIIIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIII[8]), "DES");
            Cipher llllllllllllllIlllIlllIIIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIIIlIIlIl.init(lIIllIlllIIII[4], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIIIlIIlII) {
            llllllllllllllIlllIlllIIIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIllIlll(String llllllllllllllIlllIlllIIIIIlIllI, String llllllllllllllIlllIlllIIIIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIIIIllIII.init(lIIllIlllIIII[4], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIIIIlIlll) {
            llllllllllllllIlllIlllIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIIIII(Object obj) {
        return obj != null;
    }

    private int d() {
        int[] iArr = new int[lIIllIlllIIII[0]];
        iArr[lIIllIlllIIII[1]] = lIIllIlllIIII[6];
        return Inventory.getCount(iArr);
    }

    private static boolean lIllIIIlIllllll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIIlIllllIl(int i) {
        return i != 0;
    }

    private static boolean lIllIIIlIllllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        c N = this.ar.N();
        SceneEntity V = N.V();
        int[] iArr = new int[lIIllIlllIIII[0]];
        iArr[lIIllIlllIIII[1]] = lIIllIlllIIII[2];
        GameObject nearest = TileObjects.getNearest(iArr);
        Player local = Players.getLocal();
        if ((!lIllIIIlIllllll(local.getAnimation(), lIIllIlllIIII[3]) || lIllIIIlIllllIl(local.isMoving() ? 1 : 0)) && lIllIIIlIllllII(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIlllIIII[0];
        }
        if (lIllIIIlIllllIl(nearest instanceof GameObject ? 1 : 0) && lIllIIIlIllllIl(nearest.getWorldArea().contains(local.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllll[lIIllIlllIIII[1]]);
            if (lIllIIIllIIIIII(this.au.a(V))) {
                return this.au.b(V);
            }
            V.interact(lIIllIllIllll[lIIllIlllIIII[0]]);
            return lIIllIlllIIII[1];
        } else if (lIllIIIllIIIIIl(V)) {
            System.out.println(lIIllIllIllll[lIIllIlllIIII[4]]);
            return this.ar.f(N.ah());
        } else if (lIllIIIlIllllIl(this.au.a((Locatable) V) ? 1 : 0)) {
            return this.au.b(V);
        } else {
            V.interact(lIIllIllIllll[lIIllIlllIIII[5]]);
            sleep(lIIllIlllIIII[4]);
            return lIIllIlllIIII[0];
        }
    }

    private static boolean lIllIIIlIlllllI(int i, int i2) {
        return i >= i2;
    }

    private static void lIllIIIlIlllIlI() {
        lIIllIllIllll = new String[lIIllIlllIIII[7]];
        lIIllIllIllll[lIIllIlllIIII[1]] = lIllIIIlIllIlll("d42ZDF+GcyPAV3werBjEUQ==", "KbUrO");
        lIIllIllIllll[lIIllIlllIIII[0]] = lIllIIIlIllIlll("6OyHo1C3zuk=", "PHFry");
        lIIllIllIllll[lIIllIlllIIII[4]] = lIllIIIlIlllIII("EQ8LJh1DBxZhFhYCCQ==", "cneAx");
        lIIllIllIllll[lIIllIlllIIII[5]] = lIllIIIlIlllIIl("zoiDku2woKU=", "psRRb");
    }

    static {
        lIllIIIlIlllIll();
        lIllIIIlIlllIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if ((!lIllIIIlIllllII(this.as.cookFish() ? 1 : 0) || lIllIIIlIllllIl(this.as.solo() ? 1 : 0)) && lIllIIIlIllllII(this.ar.L() ? 1 : 0) && lIllIIIlIllllIl(d()) && lIllIIIlIlllllI(this.au.f(), this.as.numberOfFish())) {
            ?? r0 = lIIllIlllIIII[0];
            "".length();
            return (-" ".length()) >= 0 ? ((((112 + 90) - 75) + 10) ^ (((84 + 33) - 87) + 103)) & (((73 ^ 115) ^ (152 ^ 174)) ^ (-" ".length())) : r0;
        }
        return lIIllIlllIIII[1];
    }

    private static boolean lIllIIIllIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIIlIlllIll() {
        lIIllIlllIIII = new int[9];
        lIIllIlllIIII[0] = " ".length();
        lIIllIlllIIII[1] = (29 ^ 27) & ((90 ^ 92) ^ (-1));
        lIIllIlllIIII[2] = (-385) & 41390;
        lIIllIlllIIII[3] = (-((-3722) & 32415)) & (-73) & 29661;
        lIIllIlllIIII[4] = "  ".length();
        lIIllIlllIIII[5] = "   ".length();
        lIIllIlllIIII[6] = (-4129) & 29692;
        lIIllIlllIIII[7] = (26 ^ 92) ^ (23 ^ 85);
        lIIllIlllIIII[8] = (138 ^ 183) ^ (0 ^ 53);
    }

    private static boolean lIllIIIllIIIIIl(Object obj) {
        return obj == null;
    }

    private static String lIllIIIlIlllIII(String llllllllllllllIlllIlllIIIIlllIII, String llllllllllllllIlllIlllIIIIllIlll) {
        String llllllllllllllIlllIlllIIIIlllIII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIIIllIllI = new StringBuilder();
        char[] llllllllllllllIlllIlllIIIIllIlIl = llllllllllllllIlllIlllIIIIllIlll.toCharArray();
        int llllllllllllllIlllIlllIIIIllIlII = lIIllIlllIIII[1];
        char[] charArray = llllllllllllllIlllIlllIIIIlllIII2.toCharArray();
        int length = charArray.length;
        int i = lIIllIlllIIII[1];
        while (lIllIIIllIIIIlI(i, length)) {
            char llllllllllllllIlllIlllIIIIlllIIl = charArray[i];
            llllllllllllllIlllIlllIIIIllIllI.append((char) (llllllllllllllIlllIlllIIIIlllIIl ^ llllllllllllllIlllIlllIIIIllIlIl[llllllllllllllIlllIlllIIIIllIlII % llllllllllllllIlllIlllIIIIllIlIl.length]));
            "".length();
            llllllllllllllIlllIlllIIIIllIlII++;
            i++;
            "".length();
            if ((30 ^ 26) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIIIIllIllI);
    }
}

package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@Singleton
@TaskDesc(name = "Placing cannon base", priority = 20, blocking = true)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.B  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/B.class */
public class B extends Task {
    private static final /* synthetic */ int az;
    private final /* synthetic */ C0002c aD;
    private static final /* synthetic */ int aA;
    private /* synthetic */ int aE = lIllIIlIlIlIl[0];
    private static final /* synthetic */ int aB;
    private static /* synthetic */ String[] lIllIIlIlIIll;
    private static /* synthetic */ int[] lIllIIlIlIlIl;
    private final /* synthetic */ l aC;

    public int Q() {
        return this.aE;
    }

    private static boolean llIIIllIIIlIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean N() {
        return lIllIIlIlIlIl[0];
    }

    private static boolean llIIIllIIIlIlIl(Object obj) {
        return obj == null;
    }

    private static String llIIIllIIIIIlll(String llllllllllllllIllIIlIIllllIIIIIl, String llllllllllllllIllIIlIIllllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIllllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIlIlIl[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIllllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIllllIIIIlI) {
            llllllllllllllIllIIlIIllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIIlIII(String llllllllllllllIllIIlIIlllIllIlII, String llllllllllllllIllIIlIIlllIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlllIllIIll.getBytes(StandardCharsets.UTF_8)), lIllIIlIlIlIl[11]), "DES");
            Cipher llllllllllllllIllIIlIIlllIllIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIlllIllIllI.init(lIllIIlIlIlIl[9], secretKeySpec);
            return new String(llllllllllllllIllIIlIIlllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIlllIllIlIl) {
            llllllllllllllIllIIlIIlllIllIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public B(l lVar, C0002c c0002c) {
        this.aC = lVar;
        this.aD = c0002c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    public boolean run() {
        if (llIIIllIIIlIIIl(this.aC.B() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int tickCount = Static.getClient().getTickCount();
        if (llIIIllIIIlIIIl(this.aC.A() ? 1 : 0) && llIIIllIIIlIIIl(this.aC.D() ? 1 : 0) && llIIIllIIIlIIlI(tickCount, this.aE) && ((!llIIIllIIIlIIll(this.aC.z(), lIllIIlIlIlIl[1]) || llIIIllIIIlIIlI(tickCount - this.aE, lIllIIlIlIlIl[2])) && llIIIllIIIlIlII(this.aC.G() ? 1 : 0))) {
            if (llIIIllIIIlIlII(Inventory.isFull() ? 1 : 0)) {
                int[] iArr = new int[lIllIIlIlIlIl[3]];
                iArr[lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[4];
                Item first = Inventory.getFirst(iArr);
                if (llIIIllIIIlIlIl(first)) {
                    first = Inventory.getFirst(item -> {
                        String str = lIllIIlIlIIll[lIllIIlIlIlIl[7]];
                        return item.hasAction((v1) -> {
                            return r1.equals(v1);
                        });
                    });
                }
                if (llIIIllIIIlIlIl(first)) {
                    return lIllIIlIlIlIl[0];
                }
                first.interact(lIllIIlIlIIll[lIllIIlIlIlIl[0]]);
            }
            int[] iArr2 = new int[lIllIIlIlIlIl[3]];
            iArr2[lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[5];
            TileObjects.getNearest(iArr2).interact(lIllIIlIlIIll[lIllIIlIlIlIl[3]]);
            return lIllIIlIlIlIl[3];
        }
        if (llIIIllIIIlIllI((tickCount + lIllIIlIlIlIl[6]) - lIllIIlIlIlIl[7], this.aE)) {
            Movement.walkTo(this.aD.i());
            "".length();
        }
        if (llIIIllIIIlIlII(this.aC.G() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int[] iArr3 = new int[lIllIIlIlIlIl[3]];
        iArr3[lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
        if (llIIIllIIIlIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
            return N();
        }
        Player local = Players.getLocal();
        WorldPoint h = this.aD.h();
        if (!llIIIllIIIlIlII(local.getWorldLocation().equals(h) ? 1 : 0)) {
            if (llIIIllIIIlIIIl(local.isMoving() ? 1 : 0)) {
                Movement.walkTo(h);
                "".length();
            }
            return lIllIIlIlIlIl[3];
        }
        int[] iArr4 = new int[lIllIIlIlIlIl[3]];
        iArr4[lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
        Inventory.getFirst(iArr4).interact(lIllIIlIlIIll[lIllIIlIlIlIl[9]]);
        this.aE = tickCount + lIllIIlIlIlIl[6];
        return lIllIIlIlIlIl[3];
    }

    private static boolean llIIIllIIIlIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIIIllIIIIIllI(String llllllllllllllIllIIlIIllllIlIllI, String llllllllllllllIllIIlIIllllIlIlIl) {
        String llllllllllllllIllIIlIIllllIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIllllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIllllIlIlII = new StringBuilder();
        char[] llllllllllllllIllIIlIIllllIlIIll = llllllllllllllIllIIlIIllllIlIlIl.toCharArray();
        int llllllllllllllIllIIlIIllllIlIIlI = lIllIIlIlIlIl[0];
        char[] charArray = llllllllllllllIllIIlIIllllIlIllI2.toCharArray();
        int length = charArray.length;
        int i = lIllIIlIlIlIl[0];
        while (llIIIllIIIlIllI(i, length)) {
            char llllllllllllllIllIIlIIllllIlIlll = charArray[i];
            llllllllllllllIllIIlIIllllIlIlII.append((char) (llllllllllllllIllIIlIIllllIlIlll ^ llllllllllllllIllIIlIIllllIlIIll[llllllllllllllIllIIlIIllllIlIIlI % llllllllllllllIllIIlIIllllIlIIll.length]));
            "".length();
            llllllllllllllIllIIlIIllllIlIIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIIllllIlIlII);
    }

    static {
        llIIIllIIIlIIII();
        llIIIllIIIIllII();
        aB = lIllIIlIlIlIl[2];
        az = lIllIIlIlIlIl[6];
        aA = lIllIIlIlIlIl[1];
    }

    private static boolean llIIIllIIIlIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIllIIIlIIll(int i, int i2) {
        return i <= i2;
    }

    private static void llIIIllIIIlIIII() {
        lIllIIlIlIlIl = new int[12];
        lIllIIlIlIlIl[0] = (98 ^ 57) & ((80 ^ 11) ^ (-1));
        lIllIIlIlIlIl[1] = (35 ^ 22) ^ (239 ^ 195);
        lIllIIlIlIlIl[2] = ((37 + 4) - (-14)) + 145;
        lIllIIlIlIlIl[3] = " ".length();
        lIllIIlIlIlIl[4] = (-((-30731) & 32031)) & (-1) & 8183;
        lIllIIlIlIlIl[5] = 45 ^ 42;
        lIllIIlIlIlIl[6] = (-24620) & 26619;
        lIllIIlIlIlIl[7] = "   ".length();
        lIllIIlIlIlIl[8] = (31 ^ 114) ^ (76 ^ 39);
        lIllIIlIlIlIl[9] = "  ".length();
        lIllIIlIlIlIl[10] = (68 ^ 4) ^ (109 ^ 41);
        lIllIIlIlIlIl[11] = 119 ^ 127;
    }

    private static boolean llIIIllIIIlIIlI(int i, int i2) {
        return i > i2;
    }

    private static void llIIIllIIIIllII() {
        lIllIIlIlIIll = new String[lIllIIlIlIlIl[10]];
        lIllIIlIlIIll[lIllIIlIlIlIl[0]] = llIIIllIIIIIllI("EhYG", "Wwrgl");
        lIllIIlIlIIll[lIllIIlIlIlIl[3]] = llIIIllIIIIIllI("PjAIEkQbKQ==", "nYkyi");
        lIllIIlIlIIll[lIllIIlIlIlIl[9]] = llIIIllIIIIIlll("S+zdkdwby9I=", "WoXzu");
        lIllIIlIlIIll[lIllIIlIlIlIl[7]] = llIIIllIIIIlIII("5WxkzNIwuB4=", "xVlow");
    }
}

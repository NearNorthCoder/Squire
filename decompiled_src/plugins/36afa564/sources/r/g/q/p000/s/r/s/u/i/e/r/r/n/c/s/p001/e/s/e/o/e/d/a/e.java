package r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Completing Minigame")
/* renamed from: r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.e  reason: invalid package */
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:r/g/q/-/s/r/s/u/i/e/r/r/n/c/s/-/e/s/e/o/e/d/a/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIIllIIlIIlII;
    private static final /* synthetic */ WorldPoint v;
    private static final /* synthetic */ int w;
    private final /* synthetic */ SquireSorceressGardenConfig x;
    private static /* synthetic */ String[] lIIllIIlIIIll;

    private static boolean lIlIlllllIIlIlI(int i) {
        return i != 0;
    }

    private void B() {
        Movement.walkTo(v);
        "".length();
    }

    @Inject
    public e(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.x = squireSorceressGardenConfig;
    }

    private static boolean lIlIlllllIIlllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private void C() {
        if (lIlIlllllIIlIlI(this.x.pickHerbs() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlIlllllIIlIlI(tileObject.getName().equals(lIIllIIlIIIll[lIIllIIlIIlII[4]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIllIIlIIlII[1]];
                    strArr[lIIllIIlIIlII[0]] = lIIllIIlIIIll[lIIllIIlIIlII[5]];
                    if (lIlIlllllIIlIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIllIIlIIlII[1];
                        "".length();
                        return ((25 ^ 92) & ((98 ^ 39) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIllIIlIIlII[0];
            });
            if (lIlIlllllIIllll(nearest)) {
                return;
            }
            nearest.interact(lIIllIIlIIIll[lIIllIIlIIlII[0]]);
            return;
        }
        TileObject A = A();
        if (lIlIlllllIIllll(A)) {
            return;
        }
        A.interact(lIIllIIlIIIll[lIIllIIlIIlII[1]]);
    }

    private static boolean lIlIlllllIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllllIIllII(Object obj) {
        return obj != null;
    }

    private void y() {
        if (!lIlIlllllIIlIll(Movement.isRunEnabled() ? 1 : 0) || lIlIlllllIIllIl(Movement.getRunEnergy(), lIIllIIlIIlII[2])) {
            return;
        }
        Movement.toggleRun();
    }

    private static String lIlIlllllIIIlll(String llllllllllllllIllllIIIlIIIllIlII, String llllllllllllllIllllIIIlIIIllIIll) {
        String llllllllllllllIllllIIIlIIIllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIlIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIlIIIllIIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIlIIIllIIll.toCharArray();
        int llllllllllllllIllllIIIlIIIllIIII = lIIllIIlIIlII[0];
        char[] charArray2 = llllllllllllllIllllIIIlIIIllIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIlIIlII[0];
        while (lIlIlllllIIllIl(i, length)) {
            char llllllllllllllIllllIIIlIIIllIlIl = charArray2[i];
            llllllllllllllIllllIIIlIIIllIIlI.append((char) (llllllllllllllIllllIIIlIIIllIlIl ^ charArray[llllllllllllllIllllIIIlIIIllIIII % charArray.length]));
            "".length();
            llllllllllllllIllllIIIlIIIllIIII++;
            i++;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIlIIIllIIlI);
    }

    private static String lIlIlllllIIIllI(String llllllllllllllIllllIIIlIIlIIIlII, String llllllllllllllIllllIIIlIIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIlIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIlIIlII[4], llllllllllllllIllllIIIlIIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlIIlIIIlIl) {
            llllllllllllllIllllIIIlIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIIIlIl(String llllllllllllllIllllIIIlIIIIlllll, String llllllllllllllIllllIIIlIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIlIIIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIlIIIlIIIIl.init(lIIllIIlIIlII[4], secretKeySpec);
            return new String(llllllllllllllIllllIIIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlIIIlIIIII) {
            llllllllllllllIllllIIIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean z() {
        if (lIlIlllllIIlIll(Inventory.isFull() ? 1 : 0) && lIlIlllllIIlIll(Bank.isOpen() ? 1 : 0) && lIlIlllllIIlIlI(Movement.shouldWalk() ? 1 : 0) && !lIlIlllllIIlllI(this.x.botActivity(), a.MINIGAME)) {
            return lIIllIIlIIlII[0];
        }
        ?? r0 = lIIllIIlIIlII[1];
        "".length();
        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    static {
        lIlIlllllIIlIIl();
        lIlIlllllIIlIII();
        w = lIIllIIlIIlII[3];
        v = new WorldPoint(lIIllIIlIIlII[6], lIIllIIlIIlII[7], lIIllIIlIIlII[0]);
    }

    private static boolean lIlIlllllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlllllIIlIIl() {
        lIIllIIlIIlII = new int[10];
        lIIllIIlIIlII[0] = ((159 ^ 190) ^ (120 ^ 81)) & (((212 ^ 156) ^ (97 ^ 33)) ^ (-" ".length()));
        lIIllIIlIIlII[1] = " ".length();
        lIIllIIlIIlII[2] = (((113 + 129) - 123) + 11) ^ (((40 + 11) - (-15)) + 89);
        lIIllIIlIIlII[3] = (-((-16975) & 20351)) & (-1) & 16319;
        lIIllIIlIIlII[4] = "  ".length();
        lIIllIIlIIlII[5] = "   ".length();
        lIIllIIlIIlII[6] = (-((-11747) & 15862)) & (-17409) & 24439;
        lIIllIIlIIlII[7] = (-((-16625) & 27387)) & (-16517) & 32767;
        lIIllIIlIIlII[8] = (38 ^ 120) ^ (57 ^ 99);
        lIIllIIlIIlII[9] = (203 ^ 193) ^ "  ".length();
    }

    private static boolean lIlIlllllIIlIll(int i) {
        return i == 0;
    }

    private TileObject A() {
        int[] iArr = new int[lIIllIIlIIlII[1]];
        iArr[lIIllIIlIIlII[0]] = lIIllIIlIIlII[3];
        return TileObjects.getNearest(iArr);
    }

    private boolean a(TileObject tileObject) {
        return Reachable.isInteractable(tileObject);
    }

    private static void lIlIlllllIIlIII() {
        lIIllIIlIIIll = new String[lIIllIIlIIlII[8]];
        lIIllIIlIIIll[lIIllIIlIIlII[0]] = lIlIlllllIIIlIl("4JzAkYOQ5G0=", "xTaRK");
        lIIllIIlIIIll[lIIllIIlIIlII[1]] = lIlIlllllIIIllI("RgDMNMTaBZ/IhKGgT2E+1g==", "IWRmQ");
        lIIllIIlIIIll[lIIllIIlIIlII[4]] = lIlIlllllIIIlll("EigUNj0=", "ZMfTN");
        lIIllIIlIIIll[lIIllIIlIIlII[5]] = lIlIlllllIIIlIl("J19Ug17Vi3o=", "gXPaX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (lIlIlllllIIlIlI(z() ? 1 : 0)) {
            return lIIllIIlIIlII[0];
        }
        y();
        TileObject A = A();
        if (lIlIlllllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIlIIlII[0];
        }
        if (!lIlIlllllIIllII(A) || lIlIlllllIIlIll(a(A) ? 1 : 0)) {
            return Movement.walkTo(v);
        }
        C();
        return lIIllIIlIIlII[1];
    }
}

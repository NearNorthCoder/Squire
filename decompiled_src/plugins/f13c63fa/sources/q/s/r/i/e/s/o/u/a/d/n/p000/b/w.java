package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.w  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/w.class */
public class w extends Task {
    private static final /* synthetic */ int ar;
    private static /* synthetic */ String[] llIllllIIII;
    private /* synthetic */ int aw = llIllllIIlI[0];
    private final /* synthetic */ d av;
    private static final /* synthetic */ int as;
    private static final /* synthetic */ int at;
    private static /* synthetic */ int[] llIllllIIlI;
    private final /* synthetic */ e au;

    private static void lIlIlIllllIlIl() {
        llIllllIIII = new String[llIllllIIlI[10]];
        llIllllIIII[llIllllIIlI[0]] = lIlIlIllllIIlI("rHWurwTl9ts=", "xistm");
        llIllllIIII[llIllllIIlI[3]] = lIlIlIllllIIll("Hj4HPkY7Jw==", "NWdUk");
        llIllllIIII[llIllllIIlI[9]] = lIlIlIllllIIll("Pz0kQzEc", "lXPnD");
        llIllllIIII[llIllllIIlI[7]] = lIlIlIllllIlII("ARLxZRysWGs=", "VixcT");
    }

    @Inject
    public w(e eVar, d dVar) {
        this.au = eVar;
        this.av = dVar;
    }

    private static boolean lIlIllIIIIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean M() {
        return llIllllIIlI[0];
    }

    public int Q() {
        return this.aw;
    }

    static {
        lIlIlIllllllII();
        lIlIlIllllIlIl();
        ar = llIllllIIlI[6];
        as = llIllllIIlI[1];
        at = llIllllIIlI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    public boolean run() {
        if (lIlIlIllllllIl(this.au.t() ? 1 : 0)) {
            return llIllllIIlI[0];
        }
        int tickCount = Static.getClient().getTickCount();
        if (lIlIlIllllllIl(this.au.s() ? 1 : 0) && lIlIlIllllllIl(this.au.v() ? 1 : 0) && lIlIlIlllllllI(tickCount, this.aw) && ((!lIlIlIllllllll(this.au.r(), llIllllIIlI[1]) || lIlIlIlllllllI(tickCount - this.aw, llIllllIIlI[2])) && lIlIllIIIIIIII(this.au.y() ? 1 : 0))) {
            if (lIlIllIIIIIIII(Inventory.isFull() ? 1 : 0)) {
                int[] iArr = new int[llIllllIIlI[3]];
                iArr[llIllllIIlI[0]] = llIllllIIlI[4];
                Item first = Inventory.getFirst(iArr);
                if (lIlIllIIIIIIIl(first)) {
                    first = Inventory.getFirst(item -> {
                        String str = llIllllIIII[llIllllIIlI[7]];
                        return item.hasAction((v1) -> {
                            return r1.equals(v1);
                        });
                    });
                }
                if (lIlIllIIIIIIIl(first)) {
                    return llIllllIIlI[0];
                }
                first.interact(llIllllIIII[llIllllIIlI[0]]);
            }
            int[] iArr2 = new int[llIllllIIlI[3]];
            iArr2[llIllllIIlI[0]] = llIllllIIlI[5];
            TileObjects.getNearest(iArr2).interact(llIllllIIII[llIllllIIlI[3]]);
            return llIllllIIlI[3];
        }
        if (lIlIllIIIIIIlI((tickCount + llIllllIIlI[6]) - llIllllIIlI[7], this.aw)) {
            Movement.walkTo(this.av.p());
            "".length();
        }
        if (lIlIllIIIIIIII(this.au.y() ? 1 : 0)) {
            return llIllllIIlI[0];
        }
        int[] iArr3 = new int[llIllllIIlI[3]];
        iArr3[llIllllIIlI[0]] = llIllllIIlI[8];
        if (lIlIlIllllllIl(Inventory.contains(iArr3) ? 1 : 0)) {
            return M();
        }
        Player local = Players.getLocal();
        WorldPoint o = this.av.o();
        if (!lIlIllIIIIIIII(local.getWorldLocation().equals(o) ? 1 : 0)) {
            if (lIlIlIllllllIl(local.isMoving() ? 1 : 0)) {
                Movement.walkTo(o);
                "".length();
            }
            return llIllllIIlI[3];
        }
        int[] iArr4 = new int[llIllllIIlI[3]];
        iArr4[llIllllIIlI[0]] = llIllllIIlI[8];
        Inventory.getFirst(iArr4).interact(llIllllIIII[llIllllIIlI[9]]);
        this.aw = tickCount + llIllllIIlI[6];
        return llIllllIIlI[3];
    }

    private static boolean lIlIllIIIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlIllllllII() {
        llIllllIIlI = new int[12];
        llIllllIIlI[0] = ((34 ^ 108) ^ (3 ^ 15)) & (((((169 + 207) - 159) + 13) ^ (((146 + 56) - 186) + 148)) ^ (-" ".length()));
        llIllllIIlI[1] = (153 ^ 198) ^ (209 ^ 151);
        llIllllIIlI[2] = (((((86 + 102) - 25) + 12) + (((108 + 24) - 120) + 145)) - ((-21025) & 21347)) + ((182 + 75) - 137) + 71;
        llIllllIIlI[3] = " ".length();
        llIllllIIlI[4] = (-16645) & 23527;
        llIllllIIlI[5] = (53 ^ 106) ^ (253 ^ 165);
        llIllllIIlI[6] = (-((-11085) & 31599)) & (-8201) & 30714;
        llIllllIIlI[7] = "   ".length();
        llIllllIIlI[8] = 155 ^ 157;
        llIllllIIlI[9] = "  ".length();
        llIllllIIlI[10] = (((82 + 5) - (-29)) + 12) ^ (((104 + 35) - 73) + 66);
        llIllllIIlI[11] = (209 ^ 165) ^ (83 ^ 47);
    }

    private static String lIlIlIllllIIll(String llllllllllllllllIIlIlIIllIIllllI, String llllllllllllllllIIlIlIIllIIlllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIllIIlllII = new StringBuilder();
        char[] llllllllllllllllIIlIlIIllIIllIll = llllllllllllllllIIlIlIIllIIlllIl.toCharArray();
        int llllllllllllllllIIlIlIIllIIllIlI = llIllllIIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIllllIIlI[0];
        while (lIlIllIIIIIIlI(i, length)) {
            char llllllllllllllllIIlIlIIllIIlllll = charArray[i];
            llllllllllllllllIIlIlIIllIIlllII.append((char) (llllllllllllllllIIlIlIIllIIlllll ^ llllllllllllllllIIlIlIIllIIllIll[llllllllllllllllIIlIlIIllIIllIlI % llllllllllllllllIIlIlIIllIIllIll.length]));
            "".length();
            llllllllllllllllIIlIlIIllIIllIlI++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIIllIIlllII);
    }

    private static boolean lIlIlIlllllllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIIIIIIIl(Object obj) {
        return obj == null;
    }

    private static String lIlIlIllllIlII(String llllllllllllllllIIlIlIIllIlIlllI, String llllllllllllllllIIlIlIIllIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIllIllIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIllIllIIII.init(llIllllIIlI[9], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIllIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIllIlIllll) {
            llllllllllllllllIIlIlIIllIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllllllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIllllllIl(int i) {
        return i == 0;
    }

    private static String lIlIlIllllIIlI(String llllllllllllllllIIlIlIIllIlllIll, String llllllllllllllllIIlIlIIllIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllIlllIII.getBytes(StandardCharsets.UTF_8)), llIllllIIlI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllIIlI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIllIllllII) {
            llllllllllllllllIIlIlIIllIllllII.printStackTrace();
            return null;
        }
    }
}

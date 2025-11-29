package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Prep Make Pots", priority = 21001, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bd  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bd.class */
public class bd extends bg {
    private static /* synthetic */ String[] lIlIIlllIlII;
    /* synthetic */ boolean ei;
    private static /* synthetic */ int[] lIlIIlllIlIl;

    private static boolean llIllIllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIllIllIIlllI(int i) {
        return i == 0;
    }

    private static boolean llIllIllIlIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected bd(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ei = lIlIIlllIlIl[0];
    }

    private static String llIllIllIIlIIl(String lllllllllllllllIllIlIlllIIIIIIlI, String lllllllllllllllIllIlIlllIIIIIIIl) {
        String lllllllllllllllIllIlIlllIIIIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlllIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIllIlIllIllllllll = lllllllllllllllIllIlIlllIIIIIIIl.toCharArray();
        int lllllllllllllllIllIlIllIlllllllI = lIlIIlllIlIl[0];
        char[] charArray = lllllllllllllllIllIlIlllIIIIIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlllIlIl[0];
        while (llIllIllIIllIl(i, length)) {
            lllllllllllllllIllIlIlllIIIIIIII.append((char) (charArray[i] ^ lllllllllllllllIllIlIllIllllllll[lllllllllllllllIllIlIllIlllllllI % lllllllllllllllIllIlIllIllllllll.length]));
            "".length();
            lllllllllllllllIllIlIllIlllllllI++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlIlllIIIIIIII);
    }

    private static boolean llIllIllIlIIIl(int i) {
        return i <= 0;
    }

    private static void llIllIllIIlIll() {
        lIlIIlllIlII = new String[lIlIIlllIlIl[7]];
        lIlIIlllIlII[lIlIIlllIlIl[0]] = llIllIllIIlIIl("KCUuBh8=", "kIKgq");
        lIlIIlllIlII[lIlIIlllIlIl[1]] = llIllIllIIlIlI("mJ+6+bvj7Wspin3o4QGeOg==", "qBxxL");
        lIlIIlllIlII[lIlIIlllIlIl[5]] = llIllIllIIlIIl("IDMQBwtfJQ==", "xVbnh");
    }

    private static boolean llIllIllIlIIll(Object obj) {
        return obj == null;
    }

    private static boolean llIllIllIIllll(int i, int i2) {
        return i > i2;
    }

    private static String llIllIllIIlIlI(String lllllllllllllllIllIlIlllIIIlIIlI, String lllllllllllllllIllIlIlllIIIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlllIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlllIIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlllIIIlIlII.init(lIlIIlllIlIl[5], lllllllllllllllIllIlIlllIIIlIlIl);
            return new String(lllllllllllllllIllIlIlllIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlllIIIlIIll) {
            lllllllllllllllIllIlIlllIIIlIIll.printStackTrace();
            return null;
        }
    }

    static {
        llIllIllIIllII();
        llIllIllIIlIll();
    }

    private static void llIllIllIIllII() {
        lIlIIlllIlIl = new int[8];
        lIlIIlllIlIl[0] = (159 ^ 193) & ((83 ^ 13) ^ (-1));
        lIlIIlllIlIl[1] = " ".length();
        lIlIIlllIlIl[2] = (-((-4133) & 15462)) & (-1) & 32237;
        lIlIIlllIlIl[3] = (-10773) & 31679;
        lIlIIlllIlIl[4] = (217 ^ 177) ^ (200 ^ 165);
        lIlIIlllIlIl[5] = "  ".length();
        lIlIIlllIlIl[6] = (-((-28755) & 30463)) & (-17) & 22525;
        lIlIIlllIlIl[7] = "   ".length();
    }

    private static boolean llIllIllIlIIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        if (llIllIllIIllIl(eh(), ed())) {
            return lIlIIlllIlIl[0];
        }
        int[] iArr = new int[lIlIIlllIlIl[1]];
        iArr[lIlIIlllIlIl[0]] = em;
        TileObjects.getNearest(iArr);
        if (llIllIllIIlllI(Inventory.isFull() ? 1 : 0) && llIllIllIIllll(eg(), ek())) {
            int[] iArr2 = new int[lIlIIlllIlIl[1]];
            iArr2[lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
            if (llIllIllIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIIlllIlIl[0];
            }
        }
        int[] iArr3 = new int[lIlIIlllIlIl[1]];
        iArr3[lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
        if (llIllIllIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIlIIlllIlIl[1]];
            iArr4[lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
            List all = Inventory.getAll(iArr4);
            int i = lIlIIlllIlIl[4];
            Iterator it = all.iterator();
            do {
                if (llIllIllIlIIII(it.hasNext() ? 1 : 0)) {
                    Item item = (Item) it.next();
                    if (llIllIllIlIIIl(i)) {
                        "".length();
                        if (0 != 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        i--;
                        item.interact(lIlIIlllIlII[lIlIIlllIlIl[0]]);
                        "".length();
                    }
                }
                return lIlIIlllIlIl[1];
            } while ("  ".length() != 0);
            return ((80 ^ 75) ^ (81 ^ 87)) & (((((13 + 60) - (-29)) + 25) ^ (236 ^ 142)) ^ (-" ".length()));
        } else if (llIllIllIlIIII(Production.isOpen() ? 1 : 0)) {
            if (llIllIllIIllIl(cq(), this.el)) {
                this.ei = lIlIIlllIlIl[1];
                Production.chooseOption(lIlIIlllIlII[lIlIIlllIlIl[1]]);
                sleep(lIlIIlllIlIl[5]);
                return lIlIIlllIlIl[1];
            }
            this.ei = lIlIIlllIlIl[0];
            Production.chooseOption(lIlIIlllIlII[lIlIIlllIlIl[5]]);
            sleep(lIlIIlllIlIl[5]);
            return lIlIIlllIlIl[1];
        } else {
            int[] iArr5 = new int[lIlIIlllIlIl[1]];
            iArr5[lIlIIlllIlIl[0]] = lIlIIlllIlIl[6];
            Item first = Inventory.getFirst(iArr5);
            int[] iArr6 = new int[lIlIIlllIlIl[1]];
            iArr6[lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
            Item first2 = Inventory.getFirst(iArr6);
            if (!llIllIllIlIIlI(first2) || llIllIllIlIIll(first)) {
                return lIlIIlllIlIl[0];
            }
            System.out.println("CraftRestore: " + this.ei + " | count: " + cq());
            if (llIllIllIIlllI(this.ei ? 1 : 0) && llIllIllIlIIII(this.bS.isAnimating() ? 1 : 0)) {
                return lIlIIlllIlIl[1];
            }
            if (llIllIllIlIIII(this.ei ? 1 : 0) && llIllIllIlIIII(this.bS.isAnimating() ? 1 : 0) && llIllIllIIllIl(cq(), this.el)) {
                return lIlIIlllIlIl[1];
            }
            first2.useOn(first);
            return lIlIIlllIlIl[1];
        }
    }
}

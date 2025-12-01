package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Looting", priority = 10, blocking = true)
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.j  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/j.class */
public class j extends Task {
    private static /* synthetic */ int[] lIIlllIlllIl;
    private final /* synthetic */ SquireBlueDragonKiller F;
    private static /* synthetic */ String[] lIIlllIlllII;

    private static void llIlIIIlIlIIIl() {
        lIIlllIlllII = new String[lIIlllIlllIl[3]];
        lIIlllIlllII[lIIlllIlllIl[0]] = llIlIIIlIIllll("9T84yfzHnLg=", "lZZsq");
        lIIlllIlllII[lIIlllIlllIl[1]] = llIlIIIlIIllll("jzarfLLzuSE=", "JvJyE");
        lIIlllIlllII[lIIlllIlllIl[2]] = llIlIIIlIlIIII("ZHUZsEPYfO4=", "surZA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    public boolean run() {
        if (llIlIIIlIlIIll(this.F.c().isEmpty() ? 1 : 0)) {
            return lIIlllIlllIl[0];
        }
        if (llIlIIIlIlIIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlllIlllIl[1];
        } else if (llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[lIIlllIlllIl[1]];
                strArr[lIIlllIlllIl[0]] = lIIlllIlllII[lIIlllIlllIl[2]];
                return item.hasAction(strArr);
            });
            if (llIlIIIlIlIlII(first)) {
                this.F.c().clear();
                return lIIlllIlllIl[0];
            }
            first.interact(lIIlllIlllII[lIIlllIlllIl[0]]);
            sleep(lIIlllIlllIl[2]);
            return lIIlllIlllIl[1];
        } else {
            Iterator<d> it = this.F.c().iterator();
            do {
                if (llIlIIIlIlIIll(it.hasNext() ? 1 : 0)) {
                    d next = it.next();
                    WorldPoint o = next.o();
                    int[] iArr = new int[lIIlllIlllIl[1]];
                    iArr[lIIlllIlllIl[0]] = next.r();
                    TileItem firstAt = TileItems.getFirstAt(o, iArr);
                    if (llIlIIIlIlIlII(firstAt)) {
                        this.F.c().remove(next);
                        "".length();
                        "".length();
                        if ((100 ^ 96) < " ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else if (llIlIIIlIlIIll(a(firstAt) ? 1 : 0)) {
                        firstAt.interact(lIIlllIlllII[lIIlllIlllIl[1]]);
                        return lIIlllIlllIl[1];
                    } else {
                        "".length();
                    }
                }
                return lIIlllIlllIl[0];
            } while ("   ".length() >= (-" ".length()));
            return (true ^ true) & ((true ^ true) ^ true);
        }
    }

    private static boolean llIlIIIlIlIIll(int i) {
        return i != 0;
    }

    private static void llIlIIIlIlIIlI() {
        lIIlllIlllIl = new int[5];
        lIIlllIlllIl[0] = ((3 ^ 62) ^ (110 ^ 18)) & (((177 ^ 181) ^ (32 ^ 101)) ^ (-" ".length()));
        lIIlllIlllIl[1] = " ".length();
        lIIlllIlllIl[2] = "  ".length();
        lIIlllIlllIl[3] = "   ".length();
        lIIlllIlllIl[4] = (((65 + 4) - (-32)) + 75) ^ (((130 + 70) - 170) + 154);
    }

    private static boolean llIlIIIlIlIlII(Object obj) {
        return obj == null;
    }

    @Inject
    public j(SquireBlueDragonKiller squireBlueDragonKiller) {
        this.F = squireBlueDragonKiller;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (llIlIIIlIlIIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(TileItem tileItem) {
        if (llIlIIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            if (llIlIIIlIlIIll(tileItem.isStackable() ? 1 : 0)) {
                int[] iArr = new int[lIIlllIlllIl[1]];
                iArr[lIIlllIlllIl[0]] = tileItem.getId();
            }
            return lIIlllIlllIl[0];
        }
        ?? r0 = lIIlllIlllIl[1];
        "".length();
        return (-" ".length()) > 0 ? ((59 ^ 100) ^ (197 ^ 128)) & (((216 ^ 194) ^ ((93 ^ 103) & ((85 ^ 111) ^ (-1)))) ^ (-" ".length())) : r0;
    }

    private static String llIlIIIlIIllll(String lllllllllllllllIlllIlIlIIllIlIII, String lllllllllllllllIlllIlIlIIllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIlllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIIllIlIIl) {
            lllllllllllllllIlllIlIlIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIlIlIIII(String lllllllllllllllIlllIlIlIIlllIlIl, String lllllllllllllllIlllIlIlIIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIlllIlII.getBytes(StandardCharsets.UTF_8)), lIIlllIlllIl[4]), "DES");
            Cipher lllllllllllllllIlllIlIlIIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIlIIlllIlll.init(lIIlllIlllIl[2], secretKeySpec);
            return new String(lllllllllllllllIlllIlIlIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIIlllIIIl) {
            lllllllllllllllIlllIlIlIIlllIIIl.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIIlIlIIlI();
        llIlIIIlIlIIIl();
    }
}

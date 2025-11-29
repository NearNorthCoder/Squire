package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Prep Deposit inventory", priority = 21004, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aY  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aY.class */
public class aY extends bg {
    private static /* synthetic */ String[] lIlIllIlIlII;
    private static /* synthetic */ int[] lIlIllIlIlIl;

    private static boolean lllIIIIIlIIllI(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIIIIlIIIlI(String lllllllllllllllIllIIlIlIIIllllIl, String lllllllllllllllIllIIlIlIIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIlIIIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIlIIIllllll.init(lIlIllIlIlIl[5], secretKeySpec);
            return new String(lllllllllllllllIllIIlIlIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlIIIlllllI) {
            lllllllllllllllIllIIlIlIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIIIIIlIlIll(int i, int i2) {
        return i != i2;
    }

    static {
        lllIIIIIlIIlIl();
        lllIIIIIlIIlII();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (lllIIIIIlIlIII(net.unethicalite.api.items.Inventory.getCount(r0), c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aY.lIlIllIlIlIl[2]) != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dY() {
        List<Item> a = D.bC().a(item -> {
            if (lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[7]) && lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[8]) && !lllIIIIIlIllII(item.getId(), lIlIllIlIlIl[9])) {
                return lIlIllIlIlIl[0];
            }
            ?? r0 = lIlIllIlIlIl[1];
            "".length();
            return (154 ^ 158) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        if (lllIIIIIlIIllI(cq(), this.el)) {
            return lIlIllIlIlIl[0];
        }
        if (lllIIIIIlIIlll(D.bC().bH() ? 1 : 0)) {
            int[] iArr = new int[lIlIllIlIlIl[1]];
            iArr[lIlIllIlIlIl[0]] = el().size();
        }
        if (lllIIIIIlIIlll(a.isEmpty() ? 1 : 0)) {
            return lIlIllIlIlIl[0];
        }
        if (!lllIIIIIlIIlll(D.bJ() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lllIIIIIlIIlll(tileObject.getName().toLowerCase().contains(lIlIllIlIlII[lIlIllIlIlIl[10]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIllIlIlIl[1]];
                    strArr[lIlIllIlIlIl[0]] = lIlIllIlIlII[lIlIllIlIlIl[2]];
                    if (lllIIIIIlIIlll(tileObject.hasAction(strArr) ? 1 : 0) && lllIIIIIlIIlll(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                        ?? r0 = lIlIllIlIlIl[1];
                        "".length();
                        return 0 != 0 ? ((102 ^ 6) ^ (134 ^ 185)) & (((((23 + 140) - 0) + 88) ^ (((154 + 56) - 91) + 45)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIllIlIlIl[0];
            });
            if (lllIIIIIlIlIIl(nearest)) {
                System.out.println(lIlIllIlIlII[lIlIllIlIlIl[5]]);
                return lIlIllIlIlIl[0];
            }
            nearest.interact(lIlIllIlIlII[lIlIllIlIlIl[6]]);
            return lIlIllIlIlIl[1];
        } else if (lllIIIIIlIIlll(dZ() ? 1 : 0)) {
            D.bK();
            "".length();
            return lIlIllIlIlIl[1];
        } else {
            Widget widget = Widgets.get(lIlIllIlIlIl[3], lIlIllIlIlIl[4], a.get(lIlIllIlIlIl[0]).getSlot());
            if (lllIIIIIlIlIIl(widget)) {
                System.out.println(lIlIllIlIlII[lIlIllIlIlIl[0]]);
            }
            widget.interact(lIlIllIlIlII[lIlIllIlIlIl[1]]);
            return lIlIllIlIlIl[1];
        }
    }

    private static boolean lllIIIIIlIlIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIIIIIlIlIlI(int i) {
        return i == 0;
    }

    private static void lllIIIIIlIIlIl() {
        lIlIllIlIlIl = new int[12];
        lIlIllIlIlIl[0] = ((90 ^ 113) ^ (74 ^ 92)) & (((80 ^ 15) ^ (60 ^ 94)) ^ (-" ".length()));
        lIlIllIlIlIl[1] = " ".length();
        lIlIllIlIlIl[2] = (27 ^ 13) ^ (30 ^ 13);
        lIlIllIlIlIl[3] = (-((-16683) & 31531)) & (-225) & 15343;
        lIlIllIlIlIl[4] = 62 ^ 56;
        lIlIllIlIlIl[5] = "  ".length();
        lIlIllIlIlIl[6] = "   ".length();
        lIlIllIlIlIl[7] = (-((-16493) & 28287)) & (-65) & 32767;
        lIlIllIlIlIl[8] = (-1089) & 21999;
        lIlIllIlIlIl[9] = (-9297) & 30206;
        lIlIllIlIlIl[10] = 134 ^ 130;
        lIlIllIlIlIl[11] = (95 ^ 121) ^ (109 ^ 67);
    }

    private List<Item> ea() {
        return D.bC().a(item -> {
            if (lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[7]) && lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[8]) && !lllIIIIIlIllII(item.getId(), lIlIllIlIlIl[9])) {
                return lIlIllIlIlIl[0];
            }
            ?? r0 = lIlIllIlIlIl[1];
            "".length();
            return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
    }

    @Inject
    protected aY(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void lllIIIIIlIIlII() {
        lIlIllIlIlII = new String[lIlIllIlIlIl[4]];
        lIlIllIlIlII[lIlIllIlIlIl[0]] = lllIIIIIlIIIlI("/Iit1m99Oqm3UvJMAAbuU1e5vkMpszRg", "ImtGy");
        lIlIllIlIlII[lIlIllIlIlIl[1]] = lllIIIIIlIIIll("KEhI5bO2bWh8e3ZR+VG/MA==", "kUQCJ");
        lIlIllIlIlII[lIlIllIlIlIl[5]] = lllIIIIIlIIIlI("6eN+EyI2JJFgbjVCMLWYNyGFEnFw/9Ou", "jvJBC");
        lIlIllIlIlII[lIlIllIlIlIl[6]] = lllIIIIIlIIIlI("h2QAozaMB3U=", "vCYkW");
        lIlIllIlIlII[lIlIllIlIlIl[10]] = lllIIIIIlIIIll("9NNxwZq+Rzc=", "iGYKR");
        lIlIllIlIlII[lIlIllIlIlIl[2]] = lllIIIIIlIIIlI("WgSWbpmPR/U=", "guWSW");
    }

    private static String lllIIIIIlIIIll(String lllllllllllllllIllIIlIlIIlIIlIlI, String lllllllllllllllIllIIlIlIIlIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIl[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIlIlIl[5], lllllllllllllllIllIIlIlIIlIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlIIlIIlIll) {
            lllllllllllllllIllIIlIlIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean dZ() {
        if (lllIIIIIlIlIlI(ea().isEmpty() ? 1 : 0)) {
            int[] iArr = new int[lIlIllIlIlIl[1]];
            iArr[lIlIllIlIlIl[0]] = el().size();
            if (!lllIIIIIlIlIII(Inventory.getCount(iArr), lIlIllIlIlIl[2])) {
                return lIlIllIlIlIl[0];
            }
        }
        ?? r0 = lIlIllIlIlIl[1];
        "".length();
        return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean lllIIIIIlIllII(int i, int i2) {
        return i == i2;
    }
}

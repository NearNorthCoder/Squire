package g.r.r.p000.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Emptying pouches", priority = 20)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.A  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/A.class */
public class A extends h {
    private static /* synthetic */ String[] llIlIIIIIIll;
    private static /* synthetic */ int[] llIlIIIIIlIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIlIIIIIlIl[2];
    }

    private static boolean lIIIIIIIIIlIlII(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIIIlIlll(int i) {
        return i == 0;
    }

    private static void lIIIIIIIIIlIIlI() {
        llIlIIIIIIll = new String[llIlIIIIIlIl[4]];
        llIlIIIIIIll[llIlIIIIIlIl[1]] = lIIIIIIIIIIlIII("I5nrNuIFq6Y=", "ReyMH");
        llIlIIIIIIll[llIlIIIIIlIl[2]] = lIIIIIIIIIIlIII("jq5aKhTicgc=", "zshCs");
        llIlIIIIIIll[llIlIIIIIlIl[0]] = lIIIIIIIIIIlIII("VIPCMBBO4dE=", "TuEOV");
    }

    private static void lIIIIIIIIIlIIll() {
        llIlIIIIIlIl = new int[5];
        llIlIIIIIlIl[0] = "  ".length();
        llIlIIIIIlIl[1] = (153 ^ 180) & ((62 ^ 19) ^ (-1)) & (((50 ^ 5) & ((110 ^ 89) ^ (-1))) ^ (-1));
        llIlIIIIIlIl[2] = " ".length();
        llIlIIIIIlIl[3] = 12 ^ 9;
        llIlIIIIIlIl[4] = "   ".length();
    }

    private static boolean lIIIIIIIIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIIIIIIIIlIII(String lllllllllllllllIlIIlIlIlIIIIlIlI, String lllllllllllllllIlIIlIlIlIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIIIIllII.init(llIlIIIIIlIl[0], lllllllllllllllIlIIlIlIlIIIIllIl);
            return new String(lllllllllllllllIlIIlIlIlIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIlIIIIlIll) {
            lllllllllllllllIlIIlIlIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIlIllI(Object obj) {
        return obj == null;
    }

    static {
        lIIIIIIIIIlIIll();
        lIIIIIIIIIlIIlI();
    }

    private static boolean lIIIIIIIIIllIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!lIIIIIIIIIlIlII(this.aV.g() ? 1 : 0) && !lIIIIIIIIIlIlIl(Inventory.getFreeSlots(), llIlIIIIIlIl[3])) {
            String[] strArr = new String[llIlIIIIIlIl[2]];
            strArr[llIlIIIIIlIl[1]] = llIlIIIIIIll[llIlIIIIIlIl[1]];
            if (lIIIIIIIIIlIllI(TileObjects.getNearest(strArr))) {
                return llIlIIIIIlIl[1];
            }
            int i = llIlIIIIIlIl[1];
            int lllllllllllllllIlIIlIlIlIIIlIllI = llIlIIIIIlIl[0];
            Iterator it = Inventory.getAll(item -> {
                return item.getName().endsWith(llIlIIIIIIll[llIlIIIIIlIl[0]]);
            }).iterator();
            while (true) {
                if (!lIIIIIIIIIlIlII(it.hasNext() ? 1 : 0)) {
                    break;
                }
                Item item2 = (Item) it.next();
                e c = e.c(item2.getId());
                if (lIIIIIIIIIlIllI(c)) {
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return "  ".length() & ("  ".length() ^ (-1));
                    }
                } else if (lIIIIIIIIIlIlll(lllllllllllllllIlIIlIlIlIIIlIllI)) {
                    "".length();
                    if (!(true ^ true)) {
                        return " ".length() & (" ".length() ^ (-1));
                    }
                } else {
                    if (lIIIIIIIIIllIII(c.ae())) {
                        int min = Math.min(Inventory.getFreeSlots() - i, c.ae());
                        if (lIIIIIIIIIllIIl(min)) {
                            "".length();
                            if (0 != 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            item2.interact(llIlIIIIIIll[llIlIIIIIlIl[2]]);
                            c.d(-min);
                            i += min;
                            lllllllllllllllIlIIlIlIlIIIlIllI--;
                            this.aV.r();
                        }
                    }
                    "".length();
                    if ("   ".length() < ((38 ^ 57) & ((125 ^ 98) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            if (lIIIIIIIIIllIII(i)) {
                ?? r0 = llIlIIIIIlIl[2];
                "".length();
                return (-" ".length()) != (-" ".length()) ? ((94 ^ 109) ^ (85 ^ 4)) & (((((214 + 179) - 214) + 69) ^ (((66 + 84) - 132) + 136)) ^ (-" ".length())) : r0;
            }
            return llIlIIIIIlIl[1];
        }
        return llIlIIIIIlIl[1];
    }

    private static boolean lIIIIIIIIIllIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIlIIIIIlIl[0]];
        enumC0002cArr[llIlIIIIIlIl[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIlIIIIIlIl[2]] = EnumC0002c.FINISHING;
    }
}

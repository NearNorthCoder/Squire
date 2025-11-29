package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Filling rune pouches", priority = 20, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.B  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/B.class */
public class B extends h {
    private static /* synthetic */ int[] llIIllllIlll;
    private static /* synthetic */ String[] llIIllllIlIl;

    private static boolean llllllllIllllI(int i) {
        return i <= 0;
    }

    private static String llllllllIIlllI(String lllllllllllllllIlIIlIllIIlIlIlIl, String lllllllllllllllIlIIlIllIIlIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIlIlIlII.getBytes(StandardCharsets.UTF_8)), llIIllllIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllllIlll[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIIlIlIIIl) {
            lllllllllllllllIlIIlIllIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIllIIl(int i) {
        return i != 0;
    }

    private static void llllllllIlIIII() {
        llIIllllIlIl = new String[llIIllllIlll[0]];
        llIIllllIlIl[llIIllllIlll[1]] = llllllllIIlllI("YSiFEgns9L4=", "yltDJ");
        llIIllllIlIl[llIIllllIlll[2]] = llllllllIIllll("TGw0y8k7aAE=", "NEYNH");
    }

    private static boolean llllllllIllIlI(Object obj) {
        return obj == null;
    }

    private static boolean llllllllIllIII(int i) {
        return i == 0;
    }

    static {
        llllllllIlIlll();
        llllllllIlIIII();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllllIlll[0]];
        enumC0002cArr[llIIllllIlll[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIllllIlll[2]] = EnumC0002c.FINISHING;
    }

    private static String llllllllIIllll(String lllllllllllllllIlIIlIllIIllIIIlI, String lllllllllllllllIlIIlIllIIllIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllIlll[0], lllllllllllllllIlIIlIllIIllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIIllIIIll) {
            lllllllllllllllIlIIlIllIIllIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v64, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (llllllllIllIII(this.aV.g() ? 1 : 0)) {
            return llIIllllIlll[1];
        }
        if (llllllllIllIIl(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[llIIllllIlll[2]];
            iArr[llIIllllIlll[1]] = llIIllllIlll[3];
            if (!llllllllIllIII(Inventory.contains(iArr) ? 1 : 0)) {
                int i = llIIllllIlll[1];
                int[] iArr2 = new int[llIIllllIlll[2]];
                iArr2[llIIllllIlll[1]] = llIIllllIlll[3];
                int count = Inventory.getCount(iArr2);
                int i2 = llIIllllIlll[0];
                Iterator it = Inventory.getAll(item -> {
                    return item.getName().endsWith(llIIllllIlIl[llIIllllIlll[2]]);
                }).iterator();
                while (true) {
                    if (!llllllllIllIIl(it.hasNext() ? 1 : 0)) {
                        break;
                    }
                    Item item2 = (Item) it.next();
                    if (llllllllIllIII(i2)) {
                        "".length();
                        if ((35 ^ 39) == " ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        e c = e.c(item2.getId());
                        if (llllllllIllIlI(c)) {
                            "".length();
                            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            if (llllllllIllIll(item2.getId(), llIIllllIlll[4]) && llllllllIllIll(item2.getId(), llIIllllIlll[5]) && llllllllIllIll(item2.getId(), llIIllllIlll[6]) && !llllllllIlllII(item2.getId(), llIIllllIlll[7])) {
                                c.a(llIIllllIlll[1]);
                            } else {
                                c.a(llIIllllIlll[2]);
                                "".length();
                                if ((-" ".length()) >= ((243 ^ 176) & ((241 ^ 178) ^ (-1)))) {
                                    return (true ^ true) & ((true ^ true) ^ true);
                                }
                            }
                            if (llllllllIlllIl(c.ae(), c.ac())) {
                                int lllllllllllllllIlIIlIllIIllIlIlI = Math.min(count, c.ac() - c.ae());
                                if (llllllllIllllI(lllllllllllllllIlIIlIllIIllIlIlI)) {
                                    "".length();
                                    if (0 != 0) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                } else {
                                    c.d(lllllllllllllllIlIIlIllIIllIlIlI);
                                    item2.interact(llIIllllIlIl[llIIllllIlll[1]]);
                                    i = llIIllllIlll[2];
                                    i2--;
                                    count -= lllllllllllllllIlIIlIllIIllIlIlI;
                                }
                            }
                            "".length();
                            if (0 != 0) {
                                return ((70 ^ 54) ^ (82 ^ 99)) & (((42 ^ 63) ^ (108 ^ 56)) ^ (-" ".length()));
                            }
                        }
                    }
                }
                if (llllllllIllIIl(i)) {
                    this.aV.n();
                }
                return i;
            }
        }
        return llIIllllIlll[1];
    }

    private static void llllllllIlIlll() {
        llIIllllIlll = new int[9];
        llIIllllIlll[0] = "  ".length();
        llIIllllIlll[1] = (65 ^ 23) & ((223 ^ 137) ^ (-1));
        llIIllllIlll[2] = " ".length();
        llIIllllIlll[3] = (-((-12433) & 13969)) & (-4353) & 32767;
        llIIllllIlll[4] = (-8809) & 14319;
        llIIllllIlll[5] = (-83) & 5595;
        llIIllllIlll[6] = (-((-8875) & 27387)) & (-545) & 24571;
        llIIllllIlll[7] = (-4865) & 31650;
        llIIllllIlll[8] = 167 ^ 175;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIIllllIlll[2];
    }

    private static boolean llllllllIlllII(int i, int i2) {
        return i == i2;
    }

    private static boolean llllllllIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllllIllIll(int i, int i2) {
        return i != i2;
    }
}

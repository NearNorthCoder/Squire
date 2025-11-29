package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Claiming supplies", priority = 50, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cb  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cb.class */
public class cb extends Z {
    @Inject
    protected /* synthetic */ TOAConfig d;
    private /* synthetic */ boolean hJ;
    private final /* synthetic */ C hI;
    private static final /* synthetic */ int hF;
    private static /* synthetic */ int[] llIllIlIIlI;
    @Inject
    protected /* synthetic */ C0077z cV;
    private final /* synthetic */ B hH;
    private static /* synthetic */ String[] llIllIlIIIl;
    private static final /* synthetic */ int[] hG;

    private static String lIlIlIIllIlIIl(String llllllllllllllllIIlIllIllIlIIlll, String llllllllllllllllIIlIllIllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIllIlIlIIl.init(llIllIlIIlI[3], secretKeySpec);
            return new String(llllllllllllllllIIlIllIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIllIlIlIII) {
            llllllllllllllllIIlIllIllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIllIlllI(Object obj) {
        return obj == null;
    }

    private static void lIlIlIIllIlIll() {
        llIllIlIIIl = new String[llIllIlIIlI[9]];
        llIllIlIIIl[llIllIlIIlI[0]] = lIlIlIIllIlIII("ETcgKgssPmwJHTAgJS4=", "YRLZm");
        llIllIlIIIl[llIllIlIIlI[1]] = lIlIlIIllIlIIl("FYW6BfgWK4o=", "IWMQO");
        llIllIlIIIl[llIllIlIIlI[3]] = lIlIlIIllIlIII("LDIfPTIK", "oZpRA");
        llIllIlIIIl[llIllIlIIlI[4]] = lIlIlIIllIlIII("IigiJBs=", "aDCMv");
        llIllIlIIIl[llIllIlIIlI[5]] = lIlIlIIllIlIlI("URLvb63314A=", "DLhjp");
    }

    static {
        lIlIlIIllIllII();
        lIlIlIIllIlIll();
        hF = llIllIlIIlI[2];
        int[] iArr = new int[llIllIlIIlI[4]];
        iArr[llIllIlIIlI[0]] = llIllIlIIlI[6];
        iArr[llIllIlIIlI[1]] = llIllIlIIlI[7];
        iArr[llIllIlIIlI[3]] = llIllIlIIlI[8];
        hG = iArr;
    }

    private static boolean lIlIlIIllIllIl(int i) {
        return i == 0;
    }

    private static void lIlIlIIllIllII() {
        llIllIlIIlI = new int[11];
        llIllIlIIlI[0] = ((((219 + 137) - 205) + 91) ^ (((7 + 158) - 119) + 148)) & (("  ".length() ^ (45 ^ 31)) ^ (-" ".length()));
        llIllIlIIlI[1] = " ".length();
        llIllIlIIlI[2] = (-((-4291) & 21719)) & (-2179) & 20383;
        llIllIlIIlI[3] = "  ".length();
        llIllIlIIlI[4] = "   ".length();
        llIllIlIIlI[5] = 46 ^ 42;
        llIllIlIIlI[6] = (78 ^ 107) ^ (17 ^ 50);
        llIllIlIIlI[7] = 161 ^ 168;
        llIllIlIIlI[8] = 80 ^ 92;
        llIllIlIIlI[9] = 100 ^ 97;
        llIllIlIIlI[10] = 128 ^ 136;
    }

    private static boolean lIlIlIIlllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIIllIlIlI(String llllllllllllllllIIlIllIllIIllIlI, String llllllllllllllllIIlIllIllIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), llIllIlIIlI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIllIIllIll) {
            llllllllllllllllIIlIllIllIIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v52, types: [boolean] */
    public boolean run() {
        int i;
        int i2;
        if (lIlIlIIllIllIl(bb() ? 1 : 0)) {
            this.hJ = llIllIlIIlI[0];
            return llIllIlIIlI[0];
        }
        String[] strArr = new String[llIllIlIIlI[1]];
        strArr[llIllIlIIlI[0]] = llIllIlIIIl[llIllIlIIlI[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIlIlIIllIlllI(nearest) && !lIlIlIIllIllll(this.hJ ? 1 : 0)) {
            if (lIlIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
                if (lIlIlIIllIllll(this.cV.c(this.cV.a(this.d.meleeGearAkkha())) ? 1 : 0)) {
                    return llIllIlIIlI[1];
                }
                Item first = Inventory.getFirst(item -> {
                    String str = llIllIlIIIl[llIllIlIIlI[5]];
                    return item.hasAction((v1) -> {
                        return r1.equals(v1);
                    });
                });
                if (lIlIlIIlllIIII(first)) {
                    first.interact(llIllIlIIIl[llIllIlIIlI[1]]);
                    return llIllIlIIlI[1];
                }
                bh();
                return llIllIlIIlI[1];
            }
            if (!lIlIlIIllIllIl(this.hI.av().containsKey(EnumC0056e.LIQUID_ADRENALINE) ? 1 : 0) || lIlIlIIllIllll(Inventory.contains(item2 -> {
                return EnumC0056e.LIQUID_ADRENALINE.d(item2.getId());
            }) ? 1 : 0)) {
                i = llIllIlIIlI[1];
                "".length();
                if ("   ".length() == (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = llIllIlIIlI[0];
            }
            int i3 = i;
            if (lIlIlIIllIllll(this.d.dehydration() ? 1 : 0)) {
                i3 = llIllIlIIlI[0];
            }
            if (!lIlIlIIllIllll(Widgets.isVisible(Widgets.get(llIllIlIIlI[2], hG[llIllIlIIlI[0]])) ? 1 : 0)) {
                nearest.interact(llIllIlIIIl[llIllIlIIlI[4]]);
                return llIllIlIIlI[1];
            }
            if (lIlIlIIllIllll(i3)) {
                i2 = hG[llIllIlIIlI[0]];
                "".length();
                if ("   ".length() > ((((56 + 70) - 73) + 140) ^ (((105 + 17) - (-60)) + 15))) {
                    return ((255 ^ 159) ^ (111 ^ 48)) & (((((64 + 89) - 128) + 128) ^ (((6 + 157) - 162) + 165)) ^ (-" ".length()));
                }
            } else {
                i2 = hG[llIllIlIIlI[3]];
            }
            int i4 = i2;
            Widgets.get(llIllIlIIlI[2], i4).interact(llIllIlIIIl[llIllIlIIlI[3]]);
            this.hI.a(Widgets.get(llIllIlIIlI[2], i4 - llIllIlIIlI[3]));
            this.hJ = llIllIlIIlI[1];
            return llIllIlIIlI[1];
        }
        return llIllIlIIlI[0];
    }

    private static String lIlIlIIllIlIII(String llllllllllllllllIIlIllIllIIIlIlI, String llllllllllllllllIIlIllIllIIIlIIl) {
        String llllllllllllllllIIlIllIllIIIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIllIIIlIII = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIllIllIIIlIIl.toCharArray();
        int llllllllllllllllIIlIllIllIIIIIIl = llIllIlIIlI[0];
        char[] charArray2 = llllllllllllllllIIlIllIllIIIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = llIllIlIIlI[0];
        while (lIlIlIIlllIIIl(i, length)) {
            char llllllllllllllllIIlIllIllIIIlIll = charArray2[i];
            llllllllllllllllIIlIllIllIIIlIII.append((char) (llllllllllllllllIIlIllIllIIIlIll ^ charArray[llllllllllllllllIIlIllIllIIIIIIl % charArray.length]));
            "".length();
            llllllllllllllllIIlIllIllIIIIIIl++;
            i++;
            "".length();
            if ((23 ^ 19) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIllIllIIIlIII);
    }

    private static boolean lIlIlIIllIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected cb(Client client, B b, C c) {
        super(client);
        this.hJ = llIllIlIIlI[0];
        this.hH = b;
        this.hI = c;
    }

    private static boolean lIlIlIIlllIIII(Object obj) {
        return obj != null;
    }
}

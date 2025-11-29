/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.RunePouch$RuneSlot
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class l {
    private static /* synthetic */ int[] llllIIIIIlIl;
    private static /* synthetic */ String[] llllIIIIIlII;
    private static final /* synthetic */ Logger bP;

    private static boolean lIIIlllIlIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean bi() {
        void lllllllllllllllIIllIIIIlllllIlII;
        List list = Inventory.getAll(item -> {
            int n2;
            if (l.lIIIlllIlIIlllI(item.getName().toLowerCase().endsWith(llllIIIIIlII[llllIIIIIlIl[7]]) ? 1 : 0) && l.lIIIlllIlIlIIII(item.getQuantity(), llllIIIIIlIl[8])) {
                n2 = llllIIIIIlIl[3];
                "".length();
                if (-(0x2E ^ 0x34 ^ (0x6E ^ 0x70)) >= 0) {
                    return ((12 + 177 - 111 + 118 ^ 159 + 103 - 239 + 142) & (0x55 ^ 0x2D ^ (0x9B ^ 0x82) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llllIIIIIlIl[0];
            }
            return n2 != 0;
        });
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIIIlII[llllIIIIIlIl[6]]));
        if (!l.lIIIlllIlIIlllI(l.bh() ? 1 : 0) || !l.lIIIlllIlIIlIll(list.isEmpty() ? 1 : 0) || l.lIIIlllIlIIllIl(item2)) {
            return llllIIIIIlIl[0];
        }
        Iterator lllllllllllllllIIllIIIIlllllIIlI = lllllllllllllllIIllIIIIlllllIlII.iterator();
        while (l.lIIIlllIlIIlllI(lllllllllllllllIIllIIIIlllllIIlI.hasNext() ? 1 : 0)) {
            l lllllllllllllllIIllIIIIlllllIlIl;
            Item lllllllllllllllIIllIIIIlllllIIIl = (Item)lllllllllllllllIIllIIIIlllllIIlI.next();
            if (l.lIIIlllIlIIlIll(lllllllllllllllIIllIIIIlllllIlIl.a(lllllllllllllllIIllIIIIlllllIIIl.getName()) ? 1 : 0)) {
                void lllllllllllllllIIllIIIIlllllIIll;
                lllllllllllllllIIllIIIIlllllIIIl.useOn((Item)lllllllllllllllIIllIIIIlllllIIll);
            }
            "".length();
            if (null == null) continue;
            return ((0x7D ^ 0x16 ^ (0xFB ^ 0xB5)) & (0x7D ^ 0x1B ^ (0x18 ^ 0x5B) ^ -" ".length())) != 0;
        }
        return llllIIIIIlIl[3];
    }

    private static boolean lIIIlllIlIIlIlI(Object object) {
        return object != null;
    }

    static {
        l.lIIIlllIlIIlIIl();
        l.lIIIlllIlIIlIII();
        bP = LoggerFactory.getLogger(l.class);
    }

    private static boolean lIIIlllIlIIllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlllIlIIlIll(int n2) {
        return n2 == 0;
    }

    public String toString() {
        return llllIIIIIlII[llllIIIIIlIl[1]];
    }

    private static boolean lIIIlllIlIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlllIlIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIIIlllIlIIlIIl() {
        llllIIIIIlIl = new int[12];
        l.llllIIIIIlIl[0] = (0x7E ^ 0x47 ^ (0xBA ^ 0xB2)) & (44 + 89 - 34 + 48 ^ 39 + 126 - 46 + 43 ^ -" ".length());
        l.llllIIIIIlIl[1] = "   ".length();
        l.llllIIIIIlIl[2] = 0xF ^ 0xB;
        l.llllIIIIIlIl[3] = " ".length();
        l.llllIIIIIlIl[4] = "  ".length();
        l.llllIIIIIlIl[5] = 0x9F ^ 0x9A;
        l.llllIIIIIlIl[6] = 0x44 ^ 0x42;
        l.llllIIIIIlIl[7] = 0xAE ^ 0xA9;
        l.llllIIIIIlIl[8] = 0xFFFFBECC & 0x7FB3;
        l.llllIIIIIlIl[9] = 0x1D ^ 0x15;
        l.llllIIIIIlIl[10] = 0xCC ^ 0xC5;
        l.llllIIIIIlIl[11] = 0x6F ^ 0x1B ^ (0xFF ^ 0x81);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean bh() {
        void lllllllllllllllIIllIIIIllllllllI;
        int lllllllllllllllIIllIIIIlllllllIl;
        RunePouch.RuneSlot[] runeSlotArray = RunePouch.RuneSlot.values();
        int n2 = llllIIIIIlIl[0];
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[10]])))) {
            lllllllllllllllIIllIIIIlllllllIl = llllIIIIIlIl[1];
        }
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[9]])))) {
            lllllllllllllllIIllIIIIlllllllIl = llllIIIIIlIl[2];
        }
        if (l.lIIIlllIlIIlIll(lllllllllllllllIIllIIIIlllllllIl)) {
            return llllIIIIIlIl[0];
        }
        bP.debug(llllIIIIIlII[llllIIIIIlIl[0]], (Object)((void)lllllllllllllllIIllIIIIllllllllI).length, Arrays.stream(lllllllllllllllIIllIIIIllllllllI).collect(Collectors.toList()));
        int lllllllllllllllIIllIIIIlllllllII = llllIIIIIlIl[0];
        while (l.lIIIlllIlIIllII(lllllllllllllllIIllIIIIlllllllII, lllllllllllllllIIllIIIIlllllllIl)) {
            String lllllllllllllllIIllIIIIllllllIll = lllllllllllllllIIllIIIIllllllllI[lllllllllllllllIIllIIIIlllllllII].getRuneName();
            if (l.lIIIlllIlIIllIl(lllllllllllllllIIllIIIIllllllIll)) {
                bP.debug(llllIIIIIlII[llllIIIIIlIl[3]], (Object)lllllllllllllllIIllIIIIlllllllII);
                return llllIIIIIlIl[3];
            }
            ++lllllllllllllllIIllIIIIlllllllII;
            "".length();
            if (-"   ".length() < 0) continue;
            return ((0x25 ^ 0x21) & ~(0x6B ^ 0x6F)) != 0;
        }
        return llllIIIIIlIl[0];
    }

    public int hashCode() {
        int n2 = llllIIIIIlIl[3];
        return llllIIIIIlIl[3];
    }

    private static String lIIIlllIlIIIllI(String lllllllllllllllIIllIIIIlllIIlIlI, String lllllllllllllllIIllIIIIlllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlllIIIlll.getBytes(StandardCharsets.UTF_8)), llllIIIIIlIl[9]), "DES");
            Cipher lllllllllllllllIIllIIIIlllIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIIlllIIllII.init(llllIIIIIlIl[4], lllllllllllllllIIllIIIIlllIIllIl);
            return new String(lllllllllllllllIIllIIIIlllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIlllIIlIll) {
            lllllllllllllllIIllIIIIlllIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIlIIIlIl(String lllllllllllllllIIllIIIIllIllIlIl, String lllllllllllllllIIllIIIIllIllIlII) {
        lllllllllllllllIIllIIIIllIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIIllIlllIII = new StringBuilder();
        char[] lllllllllllllllIIllIIIIllIllIlll = lllllllllllllllIIllIIIIllIllIlII.toCharArray();
        int lllllllllllllllIIllIIIIllIllIllI = llllIIIIIlIl[0];
        char[] lllllllllllllllIIllIIIIllIllIIII = lllllllllllllllIIllIIIIllIllIlIl.toCharArray();
        int lllllllllllllllIIllIIIIllIlIllll = lllllllllllllllIIllIIIIllIllIIII.length;
        int lllllllllllllllIIllIIIIllIlIlllI = llllIIIIIlIl[0];
        while (l.lIIIlllIlIIllII(lllllllllllllllIIllIIIIllIlIlllI, lllllllllllllllIIllIIIIllIlIllll)) {
            char lllllllllllllllIIllIIIIllIlllIll = lllllllllllllllIIllIIIIllIllIIII[lllllllllllllllIIllIIIIllIlIlllI];
            lllllllllllllllIIllIIIIllIlllIII.append((char)(lllllllllllllllIIllIIIIllIlllIll ^ lllllllllllllllIIllIIIIllIllIlll[lllllllllllllllIIllIIIIllIllIllI % lllllllllllllllIIllIIIIllIllIlll.length]));
            "".length();
            ++lllllllllllllllIIllIIIIllIllIllI;
            ++lllllllllllllllIIllIIIIllIlIlllI;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIIIllIlllIII);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        l lllllllllllllllIIllIIIIllllIIIll;
        void lllllllllllllllIIllIIIIllllIIIlI;
        if (l.lIIIlllIlIIllll(object, this)) {
            return llllIIIIIlIl[3];
        }
        if (l.lIIIlllIlIIlIll(lllllllllllllllIIllIIIIllllIIIlI instanceof l)) {
            return llllIIIIIlIl[0];
        }
        l lllllllllllllllIIllIIIIllllIIIIl = (l)lllllllllllllllIIllIIIIllllIIIlI;
        if (l.lIIIlllIlIIlIll(lllllllllllllllIIllIIIIllllIIIIl.a(lllllllllllllllIIllIIIIllllIIIll) ? 1 : 0)) {
            return llllIIIIIlIl[0];
        }
        return llllIIIIIlIl[3];
    }

    protected boolean a(Object object) {
        return object instanceof l;
    }

    private static String lIIIlllIlIIIlll(String lllllllllllllllIIllIIIIlllIlIlIl, String lllllllllllllllIIllIIIIlllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIlllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIlllIllIIl.init(llllIIIIIlIl[4], lllllllllllllllIIllIIIIlllIllIlI);
            return new String(lllllllllllllllIIllIIIIlllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIlllIllIII) {
            lllllllllllllllIIllIIIIlllIllIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIlIIlIII() {
        llllIIIIIlII = new String[llllIIIIIlIl[11]];
        l.llllIIIIIlII[l.llllIIIIIlIl[0]] = l.lIIIlllIlIIIlIl("NjQbIz1lZVQsM2UjCQ==", "EXtWN");
        l.llllIIIIIlII[l.llllIIIIIlIl[3]] = l.lIIIlllIlIIIllI("KkhNT8+3irxc7UZh2K0/gXlvQlbPRoiHMyKJ+7cqGGd32+jctrAIug==", "rqTRV");
        l.llllIIIIIlII[l.llllIIIIIlIl[4]] = l.lIIIlllIlIIIllI("HwULlUElAdbJ4NeuqQ6JCSl30W5hJtuskGa44GTumRTsPrYW+5CvLXOIE753OyYv6FBCcKe5NChX63kdK8sopz4NorRLw79/z+EOsdEcJB+kIugiCWf1FQ==", "bxLEl");
        l.llllIIIIIlII[l.llllIIIIIlIl[1]] = l.lIIIlllIlIIIlll("dlDYr2MIdHSfuJw3pl3UlUWBxuSOCOiv", "cstHN");
        l.llllIIIIIlII[l.llllIIIIIlIl[2]] = l.lIIIlllIlIIIlll("0yuwHQWC/We6nHX+SfteR1ZBUtnYZR8O", "ATCMm");
        l.llllIIIIIlII[l.llllIIIIIlIl[5]] = l.lIIIlllIlIIIllI("oyZ0zWwuZ+2KqKXOYPyuUg==", "FFMYY");
        l.llllIIIIIlII[l.llllIIIIIlIl[6]] = l.lIIIlllIlIIIllI("S9wSbjNKvg64BkBOiIRqYg==", "uhiNm");
        l.llllIIIIIlII[l.llllIIIIIlIl[7]] = l.lIIIlllIlIIIlll("uCmtyjQTsWY=", "UaWpM");
        l.llllIIIIIlII[l.llllIIIIIlIl[9]] = l.lIIIlllIlIIIlIl("IwogLCIiQyQwIiJDJio5JAs=", "GcVEL");
        l.llllIIIIIlII[l.llllIIIIIlIl[10]] = l.lIIIlllIlIIIllI("Zw6fxEVW/A5Ll+Eh2qQRow==", "IevRX");
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string) {
        int lllllllllllllllIIllIIIIllllIlIIl;
        RunePouch.RuneSlot[] runeSlotArray = RunePouch.RuneSlot.values();
        int n2 = llllIIIIIlIl[0];
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[5]])))) {
            lllllllllllllllIIllIIIIllllIlIIl = llllIIIIIlIl[1];
        }
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[2]])))) {
            lllllllllllllllIIllIIIIllllIlIIl = llllIIIIIlIl[2];
        }
        int lllllllllllllllIIllIIIIllllIlIII = llllIIIIIlIl[0];
        while (l.lIIIlllIlIIllII(lllllllllllllllIIllIIIIllllIlIII, lllllllllllllllIIllIIIIllllIlIIl)) {
            void lllllllllllllllIIllIIIIllllIlIll;
            void lllllllllllllllIIllIIIIllllIlIlI;
            String lllllllllllllllIIllIIIIllllIIlll = lllllllllllllllIIllIIIIllllIlIlI[lllllllllllllllIIllIIIIllllIlIII].getRuneName();
            if (l.lIIIlllIlIIllll(lllllllllllllllIIllIIIIllllIIlll, lllllllllllllllIIllIIIIllllIlIll)) {
                bP.debug(llllIIIIIlII[llllIIIIIlIl[4]], (Object)lllllllllllllllIIllIIIIllllIIlll, (Object)lllllllllllllllIIllIIIIllllIlIll);
                return llllIIIIIlIl[3];
            }
            ++lllllllllllllllIIllIIIIllllIlIII;
            "".length();
            if ("  ".length() > 0) continue;
            return ((0x3C ^ 0x16 ^ (0x9E ^ 0xA7)) & (0xCE ^ 0xAB ^ (0xED ^ 0x9B) ^ -" ".length())) != 0;
        }
        return llllIIIIIlIl[0];
    }
}


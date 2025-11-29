/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e;

@TaskDesc(name="Healing up", priority=1000)
public class D
extends a {
    private static /* synthetic */ int[] lIIlllIIIlIIl;
    public static final /* synthetic */ Predicate<String> av;
    private static /* synthetic */ String[] lIIlllIIIlIII;

    private static String lIllIIlIIllIllI(String llllllllllllllIlllIllIIllllIIIll, String llllllllllllllIlllIllIIllllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllllIIIII.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIIl[8]), "DES");
            Cipher llllllllllllllIlllIllIIllllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIllllIIlIl.init(lIIlllIIIlIIl[5], llllllllllllllIlllIllIIllllIIllI);
            return new String(llllllllllllllIlllIllIIllllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIllllIIlII) {
            llllllllllllllIlllIllIIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIlIIllIlll(String llllllllllllllIlllIllIIlllIIlllI, String llllllllllllllIlllIllIIlllIlIIlI) {
        llllllllllllllIlllIllIIlllIIlllI = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIlllIlIIIl = new StringBuilder();
        char[] llllllllllllllIlllIllIIlllIlIIII = llllllllllllllIlllIllIIlllIlIIlI.toCharArray();
        int llllllllllllllIlllIllIIlllIIllll = lIIlllIIIlIIl[0];
        char[] llllllllllllllIlllIllIIlllIIlIIl = llllllllllllllIlllIllIIlllIIlllI.toCharArray();
        int llllllllllllllIlllIllIIlllIIlIII = llllllllllllllIlllIllIIlllIIlIIl.length;
        int llllllllllllllIlllIllIIlllIIIlll = lIIlllIIIlIIl[0];
        while (D.lIllIIlIlIIIIll(llllllllllllllIlllIllIIlllIIIlll, llllllllllllllIlllIllIIlllIIlIII)) {
            char llllllllllllllIlllIllIIlllIlIlII = llllllllllllllIlllIllIIlllIIlIIl[llllllllllllllIlllIllIIlllIIIlll];
            llllllllllllllIlllIllIIlllIlIIIl.append((char)(llllllllllllllIlllIllIIlllIlIlII ^ llllllllllllllIlllIllIIlllIlIIII[llllllllllllllIlllIllIIlllIIllll % llllllllllllllIlllIllIIlllIlIIII.length]));
            0;
            ++llllllllllllllIlllIllIIlllIIllll;
            ++llllllllllllllIlllIllIIlllIIIlll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIlllIlIIIl);
    }

    private static boolean lIllIIlIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIlIIllllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public D(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIlIIlllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIlIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        D.lIllIIlIIlllIIl();
        D.lIllIIlIIlllIII();
        av = string -> {
            int n2;
            if (D.lIllIIlIlIIIIIl(string) && (!D.lIllIIlIlIIIIlI(string.equals(lIIlllIIIlIII[lIIlllIIIlIIl[6]]) ? 1 : 0) || D.lIllIIlIIlllIlI(string.equals(lIIlllIIIlIII[lIIlllIIIlIIl[7]]) ? 1 : 0))) {
                n2 = lIIlllIIIlIIl[1];
                0;
                if (3 < -1) {
                    return ((0x7E ^ 0x4B) & ~(0xA6 ^ 0x93)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            return n2 != 0;
        };
    }

    private boolean K() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (D.lIllIIlIlIIIIIl(item.getActions()) && D.lIllIIlIIlllIlI(item.hasAction(av) ? 1 : 0) && D.lIllIIlIlIIIIlI(item.getName().equals(lIIlllIIIlIII[lIIlllIIIlIIl[1]]) ? 1 : 0)) {
                n2 = lIIlllIIIlIIl[1];
                0;
                if ((49 + 4 - -42 + 87 ^ 157 + 68 - 150 + 103) <= 2) {
                    return ((0xB3 ^ 0xC1 ^ (0x6A ^ 0x35)) & (0x4B ^ 0x32 ^ (0x5D ^ 9) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            return n2 != 0;
        });
        if (D.lIllIIlIlIIIIII(item2)) {
            return lIIlllIIIlIIl[0];
        }
        item2.interact(av);
        return lIIlllIIIlIIl[1];
    }

    private static boolean lIllIIlIIlllIll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIIlIlIIIIIl(Object object) {
        return object != null;
    }

    private static void lIllIIlIIlllIIl() {
        lIIlllIIIlIIl = new int[9];
        D.lIIlllIIIlIIl[0] = (0x60 ^ 0x4B) & ~(0x9D ^ 0xB6);
        D.lIIlllIIIlIIl[1] = 1;
        D.lIIlllIIIlIIl[2] = 0xFFFFEEF3 & 0x71DD;
        D.lIIlllIIIlIIl[3] = 0x28 ^ 0x2D;
        D.lIIlllIIIlIIl[4] = 0x88 ^ 0x8E;
        D.lIIlllIIIlIIl[5] = 2;
        D.lIIlllIIIlIIl[6] = 3;
        D.lIIlllIIIlIIl[7] = 0x9E ^ 0x9A;
        D.lIIlllIIIlIIl[8] = 0x12 ^ 0x1A;
    }

    private static boolean lIllIIlIIllllII(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean l() {
        D llllllllllllllIlllIllIlIIIIIIIll;
        if (D.lIllIIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
            return lIIlllIIIlIIl[0];
        }
        int llllllllllllllIlllIllIlIIIIIIIlI = Inventory.getCount(item -> {
            int n2;
            if (D.lIllIIlIIlllIlI(item.hasAction(av) ? 1 : 0) && D.lIllIIlIlIIIIlI(item.getName().equals(lIIlllIIIlIII[lIIlllIIIlIIl[5]]) ? 1 : 0)) {
                n2 = lIIlllIIIlIIl[1];
                0;
                if (3 <= 2) {
                    return ((21 + 4 - -163 + 53 ^ 141 + 112 - 139 + 55) & (0x59 ^ 0x4A ^ (0xFF ^ 0xB4) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            return n2 != 0;
        });
        if (D.lIllIIlIIlllIll(llllllllllllllIlllIllIlIIIIIIIlI) && D.lIllIIlIIllllII((Object)llllllllllllllIlllIllIlIIIIIIIll.p.pickpocketFood(), (Object)e.NONE)) {
            return lIIlllIIIlIIl[0];
        }
        int[] nArray = new int[lIIlllIIIlIIl[1]];
        nArray[D.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
        int llllllllllllllIlllIllIlIIIIIIIIl = Inventory.contains((int[])nArray) ? 1 : 0;
        if (D.lIllIIlIIlllIlI(llllllllllllllIlllIllIlIIIIIIIIl) && D.lIllIIlIIllllIl(Combat.getMissingHealth(), lIIlllIIIlIIl[3])) {
            int[] nArray2 = new int[lIIlllIIIlIIl[1]];
            nArray2[D.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
            Inventory.getFirst((int[])nArray2).interact(lIIlllIIIlIII[lIIlllIIIlIIl[0]]);
            return lIIlllIIIlIIl[1];
        }
        if (D.lIllIIlIIlllIlI(llllllllllllllIlllIllIlIIIIIIIll.p.redemptionHeal() ? 1 : 0) && D.lIllIIlIIlllllI(Prayers.getPoints())) {
            int llllllllllllllIlllIllIlIIIIIIIII;
            int n2;
            if (D.lIllIIlIIllllll(Combat.getCurrentHealth(), lIIlllIIIlIIl[4])) {
                n2 = lIIlllIIIlIIl[1];
                0;
                if (((153 + 75 - 179 + 119 ^ 130 + 112 - 176 + 69) & (0x50 ^ 0x57 ^ (0x25 ^ 0xD) ^ -1)) != 0) {
                    return (((0x3C ^ 0x10) & ~(0x5A ^ 0x76) ^ (0x55 ^ 0x48)) & (0x25 ^ 0x42 ^ (0xDC ^ 0xA6) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIIlIIl[0];
            }
            if (D.lIllIIlIIlllIlI(llllllllllllllIlllIllIlIIIIIIIII = n2)) {
                return llllllllllllllIlllIllIlIIIIIIIll.K();
            }
            return lIIlllIIIlIIl[0];
        }
        if (D.lIllIIlIIllllll(Combat.getCurrentHealth(), llllllllllllllIlllIllIlIIIIIIIll.p.eatHP())) {
            return llllllllllllllIlllIllIlIIIIIIIll.K();
        }
        return lIIlllIIIlIIl[0];
    }

    private static void lIllIIlIIlllIII() {
        lIIlllIIIlIII = new String[lIIlllIIIlIIl[3]];
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[0]] = D."Eat";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[1]] = D."Blood pint";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[5]] = D."Blood pint";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[6]] = D."Eat";
        D.lIIlllIIIlIII[D.lIIlllIIIlIIl[7]] = D."Drink";
    }

    private static String lIllIIlIIllIlIl(String llllllllllllllIlllIllIIlllllIIII, String llllllllllllllIlllIllIIllllIllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIlllllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIlllllIIlI.init(lIIlllIIIlIIl[5], llllllllllllllIlllIllIIlllllIIll);
            return new String(llllllllllllllIlllIllIIlllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIlllllIIIl) {
            llllllllllllllIlllIllIIlllllIIIl.printStackTrace();
            return null;
        }
    }
}


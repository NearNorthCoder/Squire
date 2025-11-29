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

/* TASK: Healing up -> HealingupTask */
@TaskDesc(name="Healing up", priority=1000)
public class D
extends a {
    private static /* synthetic */ int[] lIIlllIIIlIIl;
    public static final /* synthetic */ Predicate<String> av;
    private static /* synthetic */ String[] lIIlllIIIlIII;

    private static String lIllIIlIIllIllI(String var18, String var9) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIIl[8]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIlllIIIlIIl[5], var22);
            return new String(var14.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
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

    private static String lIllIIlIIllIlll(String var7, String var12) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var1 = var12.toCharArray();
        int var3 = lIIlllIIIlIIl[0];
        char[] var8 = var7.toCharArray();
        int var16 = var8.length;
        int var5 = lIIlllIIIlIIl[0];
        while (D.lIllIIlIlIIIIll(var5, var16)) {
            char var23 = var8[var5];
            var13.append((char)(var23 ^ var1[var3 % var1.length]));
            0;
            ++var3;
            ++var5;
            0;
            
            return null;
        }
        return String.valueOf(var13);
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
                    return false;
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
        D var19;
        if (D.lIllIIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
            return lIIlllIIIlIIl[0];
        }
        int var20 = Inventory.getCount(item -> {
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
        if (D.lIllIIlIIlllIll(var20) && D.lIllIIlIIllllII((Object)var19.p.pickpocketFood(), (Object)e.NONE)) {
            return lIIlllIIIlIIl[0];
        }
        int[] nArray = new int[lIIlllIIIlIIl[1]];
        nArray[D.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
        int var6 = Inventory.contains((int[])nArray) ? 1 : 0;
        if (D.lIllIIlIIlllIlI(var6) && D.lIllIIlIIllllIl(Combat.getMissingHealth(), lIIlllIIIlIIl[3])) {
            int[] nArray2 = new int[lIIlllIIIlIIl[1]];
            nArray2[D.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
            Inventory.getFirst((int[])nArray2).interact(lIIlllIIIlIII[lIIlllIIIlIIl[0]]);
            return lIIlllIIIlIIl[1];
        }
        if (D.lIllIIlIIlllIlI(var19.p.redemptionHeal() ? 1 : 0) && D.lIllIIlIIlllllI(Prayers.getPoints())) {
            int var17;
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
            if (D.lIllIIlIIlllIlI(var17 = n2)) {
                return var19.K();
            }
            return lIIlllIIIlIIl[0];
        }
        if (D.lIllIIlIIllllll(Combat.getCurrentHealth(), var19.p.eatHP())) {
            return var19.K();
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

    private static String lIllIIlIIllIlIl(String var21, String var11) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIlllIIIlIIl[5], var15);
            return new String(var4.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }
}


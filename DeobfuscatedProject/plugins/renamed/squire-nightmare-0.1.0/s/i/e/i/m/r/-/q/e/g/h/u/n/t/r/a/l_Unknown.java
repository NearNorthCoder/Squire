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
public class l_Unknown {
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
        void var16;
        List list = Inventory.getAll(item -> {
            int n2;
            if (l.lIIIlllIlIIlllI(item.getName().toLowerCase().endsWith(llllIIIIIlII[llllIIIIIlIl[7]]) ? 1 : 0) && l.lIIIlllIlIlIIII(item.getQuantity(), llllIIIIIlIl[8])) {
                n2 = llllIIIIIlIl[3];
                0;
                if (-(0x2E ^ 0x34 ^ (0x6E ^ 0x70)) >= 0) {
                    return ((12 + 177 - 111 + 118 ^ 159 + 103 - 239 + 142) & (0x55 ^ 0x2D ^ (0x9B ^ 0x82) ^ -1)) != 0;
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
        Iterator var26 = var16.iterator();
        while (l.lIIIlllIlIIlllI(var26.hasNext() ? 1 : 0)) {
            l var6;
            Item var10 = (Item)var26.next();
            if (l.lIIIlllIlIIlIll(var6.a(var10.getName()) ? 1 : 0)) {
                void var25;
                var10.useOn((Item)var25);
            }
            0;
            
            return ((0x7D ^ 0x16 ^ (0xFB ^ 0xB5)) & (0x7D ^ 0x1B ^ (0x18 ^ 0x5B) ^ -1)) != 0;
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
        l.llllIIIIIlIl[0] = (0x7E ^ 0x47 ^ (0xBA ^ 0xB2)) & (44 + 89 - 34 + 48 ^ 39 + 126 - 46 + 43 ^ -1);
        l.llllIIIIIlIl[1] = 3;
        l.llllIIIIIlIl[2] = 0xF ^ 0xB;
        l.llllIIIIIlIl[3] = 1;
        l.llllIIIIIlIl[4] = 2;
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
        void var33;
        int var18;
        RunePouch.RuneSlot[] runeSlotArray = RunePouch.RuneSlot.values();
        int n2 = llllIIIIIlIl[0];
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[10]])))) {
            var18 = llllIIIIIlIl[1];
        }
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[9]])))) {
            var18 = llllIIIIIlIl[2];
        }
        if (l.lIIIlllIlIIlIll(var18)) {
            return llllIIIIIlIl[0];
        }
        bP.debug(llllIIIIIlII[llllIIIIIlIl[0]], (Object)((void)var33).length, Arrays.stream(var33).collect(Collectors.toList()));
        int var21 = llllIIIIIlIl[0];
        while (l.lIIIlllIlIIllII(var21, var18)) {
            String var9 = var33[var21].getRuneName();
            if (l.lIIIlllIlIIllIl(var9)) {
                bP.debug(llllIIIIIlII[llllIIIIIlIl[3]], (Object)var21);
                return llllIIIIIlIl[3];
            }
            ++var21;
            0;
            if (-3 < 0) continue;
            return false;
        }
        return llllIIIIIlIl[0];
    }

    public int hashCode() {
        int n2 = llllIIIIIlIl[3];
        return llllIIIIIlIl[3];
    }

    private static String lIIIlllIlIIIllI(String var4, String var19) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llllIIIIIlIl[9]), "DES");
            Cipher var35 = Cipher.getInstance("DES");
            var35.init(llllIIIIIlIl[4], var27);
            return new String(var35.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIlIIIlIl(String var5, String var28) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var20 = var28.toCharArray();
        int var34 = llllIIIIIlIl[0];
        char[] var1 = var5.toCharArray();
        int var13 = var1.length;
        int var31 = llllIIIIIlIl[0];
        while (l.lIIIlllIlIIllII(var31, var13)) {
            char var15 = var1[var31];
            var12.append((char)(var15 ^ var20[var34 % var20.length]));
            0;
            ++var34;
            ++var31;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        l var29;
        void var2;
        if (l.lIIIlllIlIIllll(object, this)) {
            return llllIIIIIlIl[3];
        }
        if (l.lIIIlllIlIIlIll(var2 instanceof l)) {
            return llllIIIIIlIl[0];
        }
        l var11 = (l)var2;
        if (l.lIIIlllIlIIlIll(var11.a(var29) ? 1 : 0)) {
            return llllIIIIIlIl[0];
        }
        return llllIIIIIlIl[3];
    }

    protected boolean a(Object object) {
        return object instanceof l;
    }

    private static String lIIIlllIlIIIlll(String var36, String var24) {
        try {
            SecretKeySpec var32 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(llllIIIIIlIl[4], var32);
            return new String(var22.doFinal(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIlIIlIII() {
        llllIIIIIlII = new String[llllIIIIIlIl[11]];
        l.llllIIIIIlII[l.llllIIIIIlIl[0]] = l."slots = {} {}";
        l.llllIIIIIlII[l.llllIIIIIlIl[3]] = l."Rune pouch slot {} is empty, filling...";
        l.llllIIIIIlII[l.llllIIIIIlIl[4]] = l."Rune pouch slot  has {} in it and we were checking to see if our pouch contained {}";
        l.llllIIIIIlII[l.llllIIIIIlIl[1]] = l."RunePouchManager()";
        l.llllIIIIIlII[l.llllIIIIIlIl[2]] = l."divine rune pouch";
        l.llllIIIIIlII[l.llllIIIIIlIl[5]] = l."rune pouch";
        l.llllIIIIIlII[l.llllIIIIIlIl[6]] = l."rune pouch";
        l.llllIIIIIlII[l.llllIIIIIlIl[7]] = l."rune";
        l.llllIIIIIlII[l.llllIIIIIlIl[9]] = l."divine rune pouch";
        l.llllIIIIIlII[l.llllIIIIIlIl[10]] = l."rune pouch";
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string) {
        int var23;
        RunePouch.RuneSlot[] runeSlotArray = RunePouch.RuneSlot.values();
        int n2 = llllIIIIIlIl[0];
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[5]])))) {
            var23 = llllIIIIIlIl[1];
        }
        if (l.lIIIlllIlIIlIlI(Inventory.getFirst(item -> item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[2]])))) {
            var23 = llllIIIIIlIl[2];
        }
        int var30 = llllIIIIIlIl[0];
        while (l.lIIIlllIlIIllII(var30, var23)) {
            void var8;
            void var17;
            String var3 = var17[var30].getRuneName();
            if (l.lIIIlllIlIIllll(var3, var8)) {
                bP.debug(llllIIIIIlII[llllIIIIIlIl[4]], (Object)var3, (Object)var8);
                return llllIIIIIlIl[3];
            }
            ++var30;
            0;
            if (2 > 0) continue;
            return ((0x3C ^ 0x16 ^ (0x9E ^ 0xA7)) & (0xCE ^ 0xAB ^ (0xED ^ 0x9B) ^ -1)) != 0;
        }
        return llllIIIIIlIl[0];
    }
}


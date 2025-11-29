/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Alching items", priority=15, blocking=true)
public class y
extends Task {
    private final /* synthetic */ a aV;
    public static final /* synthetic */ ImmutableSet<String> aU;
    private static /* synthetic */ String[] llllIlIIIlll;
    private static /* synthetic */ int[] llllIlIIlIII;

    private static void lIIlIIIIlIIlIIl() {
        llllIlIIlIII = new int[9];
        y.llllIlIIlIII[0] = (0x1F ^ 0x73 ^ (0x11 ^ 0x45)) & (0x5B ^ 0x3D ^ (0x66 ^ 0x38) ^ -1);
        y.llllIlIIlIII[1] = 30 + 110 - 104 + 102 ^ 128 + 80 - 207 + 142;
        y.llllIlIIlIII[2] = 1;
        y.llllIlIIlIII[3] = 2;
        y.llllIlIIlIII[4] = 3;
        y.llllIlIIlIII[5] = 0x88 ^ 0x8C;
        y.llllIlIIlIII[6] = 0x26 ^ 0x20;
        y.llllIlIIlIII[7] = 170 + 30 - 105 + 104 ^ 86 + 21 - -50 + 35;
        y.llllIlIIlIII[8] = 0x9D ^ 0x95;
    }

    private static boolean lIIlIIIIlIIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIlIIlIII() {
        llllIlIIIlll = new String[llllIlIIlIII[8]];
        y.llllIlIIIlll[y.llllIlIIlIII[0]] = y."Open";
        y.llllIlIIIlll[y.llllIlIIlIII[2]] = y." staff";
        y.llllIlIIIlll[y.llllIlIIlIII[3]] = y."d'hide";
        y.llllIlIIIlll[y.llllIlIIlIII[4]] = y."longsword";
        y.llllIlIIIlll[y.llllIlIIlIII[5]] = y."med helm";
        y.llllIlIIIlll[y.llllIlIIlIII[1]] = y."Rune ";
        y.llllIlIIIlll[y.llllIlIIlIII[6]] = y."battleaxe";
        y.llllIlIIIlll[y.llllIlIIlIII[7]] = y."Mystic";
    }

    static {
        y.lIIlIIIIlIIlIIl();
        y.lIIlIIIIlIIlIII();
        Object[] objectArray = new String[llllIlIIlIII[2]];
        objectArray[y.llllIlIIlIII[0]] = llllIlIIIlll[llllIlIIlIII[7]];
        aU = ImmutableSet.of((Object)llllIlIIIlll[llllIlIIlIII[2]], (Object)llllIlIIIlll[llllIlIIlIII[3]], (Object)llllIlIIIlll[llllIlIIlIII[4]], (Object)llllIlIIIlll[llllIlIIlIII[5]], (Object)llllIlIIIlll[llllIlIIlIII[1]], (Object)llllIlIIIlll[llllIlIIlIII[6]], (Object[])objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var2_2;
        SpellBook spellBook = SpellBook.getCurrent();
        if (y.lIIlIIIIlIIlIlI(spellBook, SpellBook.STANDARD)) {
            return llllIlIIlIII[0];
        }
        SpellBook.Standard lllllllllllllllIIlIlIIlIlllIIlll = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (y.lIIlIIIIlIIlIll(lllllllllllllllIIlIlIIlIlllIIlll.canCast() ? 1 : 0)) {
            return llllIlIIlIII[0];
        }
        Item lllllllllllllllIIlIlIIlIlllIIllI = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIlIIlIII[2]];
            stringArray[y.llllIlIIlIII[0]] = llllIlIIIlll[llllIlIIlIII[0]];
            if (y.lIIlIIIIlIIlIll(item.hasAction(stringArray) ? 1 : 0)) {
                Stream stream = aU.stream();
                String string = item.getName();
                Objects.requireNonNull(string);
                0;
                if (y.lIIlIIIIlIIllIl(stream.anyMatch(string::contains) ? 1 : 0)) {
                    n2 = llllIlIIlIII[2];
                    0;
                    if (((0xA6 ^ 0x9B ^ (0x56 ^ 0x36)) & (75 + 201 - 261 + 228 ^ 83 + 32 - 64 + 123 ^ -1)) == ((23 + 16 - -107 + 10 ^ 110 + 69 - 102 + 54) & (0xB5 ^ 0x82 ^ (0xF ^ 0x27) ^ -1))) return n2 != 0;
                    return ((111 + 19 - 10 + 7 ^ (0xA4 ^ 0x91)) & (0x68 ^ 0x7A ^ (0x59 ^ 1) ^ -1)) != 0;
                }
            }
            n2 = llllIlIIlIII[0];
            return n2 != 0;
        });
        if (y.lIIlIIIIlIIllII(lllllllllllllllIIlIlIIlIlllIIllI)) {
            return llllIlIIlIII[0];
        }
        Magic.cast((Spell)var2_2, (Item)var3_3);
        this.sleep(llllIlIIlIII[1]);
        return llllIlIIlIII[2];
    }

    private static String lIIlIIIIlIIIlll(String lllllllllllllllIIlIlIIlIllIIllIl, String lllllllllllllllIIlIlIIlIllIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIllIIllII.getBytes(StandardCharsets.UTF_8)), llllIlIIlIII[8]), "DES");
            Cipher lllllllllllllllIIlIlIIlIllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIllIlIIIl.init(llllIlIIlIII[3], lllllllllllllllIIlIlIIlIllIlIIlI);
            return new String(lllllllllllllllIIlIlIIlIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIllIlIIII) {
            lllllllllllllllIIlIlIIlIllIlIIII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlIIIlIl(String lllllllllllllllIIlIlIIlIlIllllll, String lllllllllllllllIIlIlIIlIlIlllllI) {
        lllllllllllllllIIlIlIIlIlIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIlIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIIlIlIIlIlIllllII = lllllllllllllllIIlIlIIlIlIlllllI.toCharArray();
        int lllllllllllllllIIlIlIIlIlIlllIll = llllIlIIlIII[0];
        char[] lllllllllllllllIIlIlIIlIlIllIlIl = lllllllllllllllIIlIlIIlIlIllllll.toCharArray();
        int lllllllllllllllIIlIlIIlIlIllIlII = lllllllllllllllIIlIlIIlIlIllIlIl.length;
        int lllllllllllllllIIlIlIIlIlIllIIll = llllIlIIlIII[0];
        while (y.lIIlIIIIlIIlllI(lllllllllllllllIIlIlIIlIlIllIIll, lllllllllllllllIIlIlIIlIlIllIlII)) {
            char lllllllllllllllIIlIlIIlIllIIIIII = lllllllllllllllIIlIlIIlIlIllIlIl[lllllllllllllllIIlIlIIlIlIllIIll];
            lllllllllllllllIIlIlIIlIlIllllIl.append((char)(lllllllllllllllIIlIlIIlIllIIIIII ^ lllllllllllllllIIlIlIIlIlIllllII[lllllllllllllllIIlIlIIlIlIlllIll % lllllllllllllllIIlIlIIlIlIllllII.length]));
            0;
            ++lllllllllllllllIIlIlIIlIlIlllIll;
            ++lllllllllllllllIIlIlIIlIlIllIIll;
            0;
            if (-(0x33 ^ 0x37) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIlIlIllllIl);
    }

    private static boolean lIIlIIIIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIlIIIllI(String lllllllllllllllIIlIlIIlIllIlllII, String lllllllllllllllIIlIlIIlIllIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIlIllIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIlIllIllllI.init(llllIlIIlIII[3], lllllllllllllllIIlIlIIlIllIlllll);
            return new String(lllllllllllllllIIlIlIIlIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIllIlllIl) {
            lllllllllllllllIIlIlIIlIllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIllII(Object object) {
        return object == null;
    }

    @Inject
    public y(a a2) {
        this.aV = a2;
    }

    private static boolean lIIlIIIIlIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlIIlIlI(Object object, Object object2) {
        return object != object2;
    }
}


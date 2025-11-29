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

/* TASK: Alching items -> AlchingTask */
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
        SpellBook.Standard var17 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (y.lIIlIIIIlIIlIll(var17.canCast() ? 1 : 0)) {
            return llllIlIIlIII[0];
        }
        Item var1 = Inventory.getFirst(item -> {
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
        if (y.lIIlIIIIlIIllII(var1)) {
            return llllIlIIlIII[0];
        }
        Magic.cast((Spell)var2_2, (Item)var3_3);
        this.sleep(llllIlIIlIII[1]);
        return llllIlIIlIII[2];
    }

    private static String lIIlIIIIlIIIlll(String var21, String var16) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llllIlIIlIII[8]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIlIIlIII[3], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlIIIlIl(String var8, String var19) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var9 = var19.toCharArray();
        int var18 = llllIlIIlIII[0];
        char[] var12 = var8.toCharArray();
        int var13 = var12.length;
        int var3 = llllIlIIlIII[0];
        while (y.lIIlIIIIlIIlllI(var3, var13)) {
            char var6 = var12[var3];
            var20.append((char)(var6 ^ var9[var18 % var9.length]));
            0;
            ++var18;
            ++var3;
            0;
            if (-(0x33 ^ 0x37) < 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean lIIlIIIIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIlIIIllI(String var15, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llllIlIIlIII[3], var11);
            return new String(var2.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
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


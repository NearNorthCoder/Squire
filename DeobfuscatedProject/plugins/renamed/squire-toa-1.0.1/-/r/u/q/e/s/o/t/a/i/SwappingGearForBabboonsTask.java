/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.events.MenuOptionClicked
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Ancient
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.y_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.MenuOptionClicked;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Swapping gear for babboons -> SwappinggearforbabboonsTask */
@TaskDesc(name="Swapping gear for babboons", register=true)
public class SwappingGearForBabboonsTask
extends y_Unknown {
    private static /* synthetic */ String[] lIIlllllIIIll;
    private static /* synthetic */ int[] lIIlllllIIlII;

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int var15;
        String string2 = string;
        int n2 = lIIlllllIIlII[0];
        switch (string2.hashCode()) {
            case 1911983736: {
                void var3;
                if (!M.lIllIlIlIIIIIll(var3.equals(lIIlllllIIIll[lIIlllllIIlII[1]]) ? 1 : 0)) break;
                var15 = lIIlllllIIlII[1];
                0;
                if (null == null) break;
                return null;
            }
            case 618003550: {
                void var3;
                if (!M.lIllIlIlIIIIIll(var3.equals(lIIlllllIIIll[lIIlllllIIlII[2]]) ? 1 : 0)) break;
                var15 = lIIlllllIIlII[2];
                0;
                if (-2 <= 0) break;
                return null;
            }
            case 556951929: {
                void var3;
                if (!M.lIllIlIlIIIIIll(var3.equals(lIIlllllIIIll[lIIlllllIIlII[3]]) ? 1 : 0)) break;
                var15 = lIIlllllIIlII[3];
                0;
                if (-1 <= 0) break;
                return null;
            }
            case -857618786: {
                void var3;
                if (!M.lIllIlIlIIIIIll(var3.equals(lIIlllllIIIll[lIIlllllIIlII[4]]) ? 1 : 0)) break;
                var15 = lIIlllllIIlII[4];
                0;
                if (((0xC8 ^ 0x8D) & ~(3 ^ 0x46)) == 0) break;
                return null;
            }
            case 1829704903: {
                void var3;
                if (!M.lIllIlIlIIIIIll(var3.equals(lIIlllllIIIll[lIIlllllIIlII[5]]) ? 1 : 0)) break;
                var15 = lIIlllllIIlII[5];
                0;
                if (null == null) break;
                return null;
            }
            case 1882859331: {
                void var3;
                if (!M.lIllIlIlIIIIIll(var3.equals(lIIlllllIIIll[lIIlllllIIlII[6]]) ? 1 : 0)) break;
                var15 = lIIlllllIIlII[6];
            }
        }
        switch (var15) {
            case 0: {
                M var21;
                if (M.lIllIlIlIIIIIll(var21.aL.autoBloodSpells() ? 1 : 0)) {
                    SpellBook.Ancient ancient;
                    if (M.lIllIlIlIIIIIll(SpellBook.Ancient.BLOOD_BARRAGE.canCast() ? 1 : 0)) {
                        ancient = SpellBook.Ancient.BLOOD_BARRAGE;
                        0;
                        if (3 < 0) {
                            return null;
                        }
                    } else {
                        ancient = SpellBook.Ancient.BLOOD_BURST;
                    }
                    var21.a((Spell)ancient);
                }
                return var21.a(var21.aL.mageGearBaboons());
            }
            case 1: 
            case 2: {
                M var21;
                return var21.a(var21.aL.mageGearBaboons());
            }
            case 3: {
                M var21;
                return var21.a(var21.aL.meleeGearBaboons());
            }
            case 4: 
            case 5: {
                M var21;
                return var21.a(var21.aL.rangeGearBaboons());
            }
        }
        return new int[lIIlllllIIlII[1]];
    }

    private static String lIllIlIIllllllI(String var20, String var8) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlllllIIlII[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIlllllIIlII[3], var22);
            return new String(var18.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public void b(MenuOptionClicked menuOptionClicked) {
        this.a(menuOptionClicked.getMenuEntry());
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!M.lIllIlIlIIIIlII(this.aL.rangeGearBaboons().isSelected() ? 1 : 0) || !M.lIllIlIlIIIIlII(this.aL.meleeGearBaboons().isSelected() ? 1 : 0) || M.lIllIlIlIIIIIll(this.aL.mageGearBaboons().isSelected() ? 1 : 0)) {
            bl = lIIlllllIIlII[2];
            0;
            if (((0xA5 ^ 0xC1 ^ (0x6E ^ 7)) & (114 + 153 - 253 + 148 ^ 20 + 15 - -55 + 85 ^ -1)) != 0) {
                return ((0x22 ^ 0x12 ^ (0xE5 ^ 0x99)) & (0x9A ^ 0x93 ^ (0x4A ^ 0xF) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllllIIlII[1];
        }
        return bl;
    }

    private static boolean lIllIlIlIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlIlIIIIIII(String var9, String var4) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var17 = var4.toCharArray();
        int var2 = lIIlllllIIlII[1];
        char[] var5 = var9.toCharArray();
        int var14 = var5.length;
        int var10 = lIIlllllIIlII[1];
        while (M.lIllIlIlIIIIlIl(var10, var14)) {
            char var16 = var5[var10];
            var11.append((char)(var16 ^ var17[var2 % var17.length]));
            0;
            ++var2;
            ++var10;
            0;
            if (3 <= (0xF8 ^ 0xBE ^ (0xF0 ^ 0xB2))) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lIllIlIlIIIIIlI() {
        lIIlllllIIlII = new int[9];
        M.lIIlllllIIlII[0] = -1;
        M.lIIlllllIIlII[1] = (0x4C ^ 0x75 ^ (0xFE ^ 0x8F)) & (199 + 65 - 101 + 42 ^ 80 + 25 - -23 + 5 ^ -1);
        M.lIIlllllIIlII[2] = 1;
        M.lIIlllllIIlII[3] = 2;
        M.lIIlllllIIlII[4] = 3;
        M.lIIlllllIIlII[5] = 0x9B ^ 0x9F;
        M.lIIlllllIIlII[6] = 0x70 ^ 0x75;
        M.lIIlllllIIlII[7] = 0x2A ^ 0x2C;
        M.lIIlllllIIlII[8] = 0xC6 ^ 0xAF ^ (0xEE ^ 0x8F);
    }

    @Inject
    public M(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static String lIllIlIIlllllll(String var12, String var1) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIlllllIIlII[3], var19);
            return new String(var7.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    static {
        M.lIllIlIlIIIIIlI();
        M.lIllIlIlIIIIIIl();
    }

    private static void lIllIlIlIIIIIIl() {
        lIIlllllIIIll = new String[lIIlllllIIlII[7]];
        M.lIIlllllIIIll[M.lIIlllllIIlII[1]] = M."Baboon Thrall";
        M.lIIlllllIIIll[M.lIIlllllIIlII[2]] = M."Baboon Brawler";
        M.lIIlllllIIIll[M.lIIlllllIIlII[3]] = M."Cursed Baboon";
        M.lIIlllllIIIll[M.lIIlllllIIlII[4]] = M."Baboon Thrower";
        M.lIIlllllIIIll[M.lIIlllllIIlII[5]] = M."Baboon Mage";
        M.lIIlllllIIIll[M.lIIlllllIIlII[6]] = M."Baboon Shaman";
    }

    private static boolean lIllIlIlIIIIlII(int n2) {
        return n2 == 0;
    }
}


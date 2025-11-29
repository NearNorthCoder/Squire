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

import -.r.u.q.e.s.o.t.a.i.y;
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

@TaskDesc(name="Swapping gear for babboons", register=true)
public class M
extends y {
    private static /* synthetic */ String[] lIIlllllIIIll;
    private static /* synthetic */ int[] lIIlllllIIlII;

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int llllllllllllllIlllIlIIIIllIIIlII;
        String string2 = string;
        int n2 = lIIlllllIIlII[0];
        switch (string2.hashCode()) {
            case 1911983736: {
                void llllllllllllllIlllIlIIIIllIIIlIl;
                if (!M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[1]]) ? 1 : 0)) break;
                llllllllllllllIlllIlIIIIllIIIlII = lIIlllllIIlII[1];
                "".length();
                if (null == null) break;
                return null;
            }
            case 618003550: {
                void llllllllllllllIlllIlIIIIllIIIlIl;
                if (!M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[2]]) ? 1 : 0)) break;
                llllllllllllllIlllIlIIIIllIIIlII = lIIlllllIIlII[2];
                "".length();
                if (-"  ".length() <= 0) break;
                return null;
            }
            case 556951929: {
                void llllllllllllllIlllIlIIIIllIIIlIl;
                if (!M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[3]]) ? 1 : 0)) break;
                llllllllllllllIlllIlIIIIllIIIlII = lIIlllllIIlII[3];
                "".length();
                if (-" ".length() <= 0) break;
                return null;
            }
            case -857618786: {
                void llllllllllllllIlllIlIIIIllIIIlIl;
                if (!M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[4]]) ? 1 : 0)) break;
                llllllllllllllIlllIlIIIIllIIIlII = lIIlllllIIlII[4];
                "".length();
                if (((0xC8 ^ 0x8D) & ~(3 ^ 0x46)) == 0) break;
                return null;
            }
            case 1829704903: {
                void llllllllllllllIlllIlIIIIllIIIlIl;
                if (!M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[5]]) ? 1 : 0)) break;
                llllllllllllllIlllIlIIIIllIIIlII = lIIlllllIIlII[5];
                "".length();
                if (null == null) break;
                return null;
            }
            case 1882859331: {
                void llllllllllllllIlllIlIIIIllIIIlIl;
                if (!M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlIl.equals(lIIlllllIIIll[lIIlllllIIlII[6]]) ? 1 : 0)) break;
                llllllllllllllIlllIlIIIIllIIIlII = lIIlllllIIlII[6];
            }
        }
        switch (llllllllllllllIlllIlIIIIllIIIlII) {
            case 0: {
                M llllllllllllllIlllIlIIIIllIIIlll;
                if (M.lIllIlIlIIIIIll(llllllllllllllIlllIlIIIIllIIIlll.aL.autoBloodSpells() ? 1 : 0)) {
                    SpellBook.Ancient ancient;
                    if (M.lIllIlIlIIIIIll(SpellBook.Ancient.BLOOD_BARRAGE.canCast() ? 1 : 0)) {
                        ancient = SpellBook.Ancient.BLOOD_BARRAGE;
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                    } else {
                        ancient = SpellBook.Ancient.BLOOD_BURST;
                    }
                    llllllllllllllIlllIlIIIIllIIIlll.a((Spell)ancient);
                }
                return llllllllllllllIlllIlIIIIllIIIlll.a(llllllllllllllIlllIlIIIIllIIIlll.aL.mageGearBaboons());
            }
            case 1: 
            case 2: {
                M llllllllllllllIlllIlIIIIllIIIlll;
                return llllllllllllllIlllIlIIIIllIIIlll.a(llllllllllllllIlllIlIIIIllIIIlll.aL.mageGearBaboons());
            }
            case 3: {
                M llllllllllllllIlllIlIIIIllIIIlll;
                return llllllllllllllIlllIlIIIIllIIIlll.a(llllllllllllllIlllIlIIIIllIIIlll.aL.meleeGearBaboons());
            }
            case 4: 
            case 5: {
                M llllllllllllllIlllIlIIIIllIIIlll;
                return llllllllllllllIlllIlIIIIllIIIlll.a(llllllllllllllIlllIlIIIIllIIIlll.aL.rangeGearBaboons());
            }
        }
        return new int[lIIlllllIIlII[1]];
    }

    private static String lIllIlIIllllllI(String llllllllllllllIlllIlIIIIlIIlIIll, String llllllllllllllIlllIlIIIIlIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllIIlII[8]), "DES");
            Cipher llllllllllllllIlllIlIIIIlIIlIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIlIIIIlIIlIlll.init(lIIlllllIIlII[3], llllllllllllllIlllIlIIIIlIIllIII);
            return new String(llllllllllllllIlllIlIIIIlIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIlIIlIllI) {
            llllllllllllllIlllIlIIIIlIIlIllI.printStackTrace();
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
            "".length();
            if (((0xA5 ^ 0xC1 ^ (0x6E ^ 7)) & (114 + 153 - 253 + 148 ^ 20 + 15 - -55 + 85 ^ -" ".length())) != 0) {
                return ((0x22 ^ 0x12 ^ (0xE5 ^ 0x99)) & (0x9A ^ 0x93 ^ (0x4A ^ 0xF) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIlllllIIlII[1];
        }
        return bl;
    }

    private static boolean lIllIlIlIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlIlIIIIIII(String llllllllllllllIlllIlIIIIlIllIlll, String llllllllllllllIlllIlIIIIlIllIllI) {
        llllllllllllllIlllIlIIIIlIllIlll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlIIIIlIllIlIl = new StringBuilder();
        char[] llllllllllllllIlllIlIIIIlIllIlII = llllllllllllllIlllIlIIIIlIllIllI.toCharArray();
        int llllllllllllllIlllIlIIIIlIllIIll = lIIlllllIIlII[1];
        char[] llllllllllllllIlllIlIIIIlIlIllIl = llllllllllllllIlllIlIIIIlIllIlll.toCharArray();
        int llllllllllllllIlllIlIIIIlIlIllII = llllllllllllllIlllIlIIIIlIlIllIl.length;
        int llllllllllllllIlllIlIIIIlIlIlIll = lIIlllllIIlII[1];
        while (M.lIllIlIlIIIIlIl(llllllllllllllIlllIlIIIIlIlIlIll, llllllllllllllIlllIlIIIIlIlIllII)) {
            char llllllllllllllIlllIlIIIIlIlllIII = llllllllllllllIlllIlIIIIlIlIllIl[llllllllllllllIlllIlIIIIlIlIlIll];
            llllllllllllllIlllIlIIIIlIllIlIl.append((char)(llllllllllllllIlllIlIIIIlIlllIII ^ llllllllllllllIlllIlIIIIlIllIlII[llllllllllllllIlllIlIIIIlIllIIll % llllllllllllllIlllIlIIIIlIllIlII.length]));
            "".length();
            ++llllllllllllllIlllIlIIIIlIllIIll;
            ++llllllllllllllIlllIlIIIIlIlIlIll;
            "".length();
            if ("   ".length() <= (0xF8 ^ 0xBE ^ (0xF0 ^ 0xB2))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlIIIIlIllIlIl);
    }

    private static void lIllIlIlIIIIIlI() {
        lIIlllllIIlII = new int[9];
        M.lIIlllllIIlII[0] = -" ".length();
        M.lIIlllllIIlII[1] = (0x4C ^ 0x75 ^ (0xFE ^ 0x8F)) & (199 + 65 - 101 + 42 ^ 80 + 25 - -23 + 5 ^ -" ".length());
        M.lIIlllllIIlII[2] = " ".length();
        M.lIIlllllIIlII[3] = "  ".length();
        M.lIIlllllIIlII[4] = "   ".length();
        M.lIIlllllIIlII[5] = 0x9B ^ 0x9F;
        M.lIIlllllIIlII[6] = 0x70 ^ 0x75;
        M.lIIlllllIIlII[7] = 0x2A ^ 0x2C;
        M.lIIlllllIIlII[8] = 0xC6 ^ 0xAF ^ (0xEE ^ 0x8F);
    }

    @Inject
    public M(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static String lIllIlIIlllllll(String llllllllllllllIlllIlIIIIlIlIIIII, String llllllllllllllIlllIlIIIIlIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlIIIIlIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlIIIIlIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlIIIIlIlIIlII.init(lIIlllllIIlII[3], llllllllllllllIlllIlIIIIlIlIIlIl);
            return new String(llllllllllllllIlllIlIIIIlIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlIIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlIIIIlIlIIIll) {
            llllllllllllllIlllIlIIIIlIlIIIll.printStackTrace();
            return null;
        }
    }

    static {
        M.lIllIlIlIIIIIlI();
        M.lIllIlIlIIIIIIl();
    }

    private static void lIllIlIlIIIIIIl() {
        lIIlllllIIIll = new String[lIIlllllIIlII[7]];
        M.lIIlllllIIIll[M.lIIlllllIIlII[1]] = M.lIllIlIIllllllI("I8cbTR3xCxQ/3bZSUOgxfA==", "APxmN");
        M.lIIlllllIIIll[M.lIIlllllIIlII[2]] = M.lIllIlIIlllllll("IncbkgealcOBdOdbDlXA/Q==", "HgEst");
        M.lIIlllllIIIll[M.lIIlllllIIlII[3]] = M.lIllIlIIlllllll("rWI8OSNFABnU49uFMi7zRQ==", "Gyjno");
        M.lIIlllllIIIll[M.lIIlllllIIlII[4]] = M.lIllIlIlIIIIIII("FQYlDAI5RxMLHzgQIhE=", "WgGcm");
        M.lIIlllllIIIll[M.lIIlllllIIlII[5]] = M.lIllIlIIlllllll("x2BfveqlGNrnqwLp4qZpVg==", "DPTZe");
        M.lIIlllllIIIll[M.lIIlllllIIlII[6]] = M.lIllIlIIllllllI("JoqXJZTxJBAeQFQAoTszpA==", "VHJiT");
    }

    private static boolean lIllIlIlIIIIlII(int n2) {
        return n2 == 0;
    }
}


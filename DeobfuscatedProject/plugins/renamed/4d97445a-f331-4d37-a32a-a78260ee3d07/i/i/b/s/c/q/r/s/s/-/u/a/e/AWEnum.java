/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class AWEnum
extends Enum<aW> {
    private final /* synthetic */ int level;
    public static final /* synthetic */ /* enum */ aW FALADOR;
    public static final /* synthetic */ /* enum */ aW PROGRESSIVE;
    public static final /* synthetic */ /* enum */ aW CAMELOT;
    private final /* synthetic */ Spell spell;
    private static final /* synthetic */ aW[] $VALUES;
    public static final /* synthetic */ /* enum */ aW LUMBRIDGE;
    private static /* synthetic */ String[] lIllIIlI;
    public static final /* synthetic */ /* enum */ aW VARROCK;
    private static /* synthetic */ int[] lIllIIll;

    private static boolean lIlIIIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIIIIl() {
        lIllIIll = new int[11];
        aW.lIllIIll[0] = 1;
        aW.lIllIIll[1] = (0x86 ^ 0xB1) & ~(0x83 ^ 0xB4);
        aW.lIllIIll[2] = 143 + 41 - 24 + 3 ^ 31 + 53 - -11 + 91;
        aW.lIllIIll[3] = 0x65 ^ 0x7A;
        aW.lIllIIll[4] = 2;
        aW.lIllIIll[5] = 0x47 ^ 0x62;
        aW.lIllIIll[6] = 3;
        aW.lIllIIll[7] = 0xE9 ^ 0xC4;
        aW.lIllIIll[8] = 0x7B ^ 0x7F;
        aW.lIllIIll[9] = 0x6D ^ 0x68;
        aW.lIllIIll[10] = 78 + 180 - 170 + 115 ^ 109 + 139 - 110 + 57;
    }

    public Spell co() {
        return this.spell;
    }

    public static aW[] values() {
        return (aW[])$VALUES.clone();
    }

    private static boolean lIlIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        aW.lIlIIIIIIl();
        aW.lIlIIIIIII();
        VARROCK = new aW((Spell)SpellBook.Standard.VARROCK_TELEPORT, lIllIIll[2]);
        LUMBRIDGE = new aW((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT, lIllIIll[3]);
        FALADOR = new aW((Spell)SpellBook.Standard.FALADOR_TELEPORT, lIllIIll[5]);
        CAMELOT = new aW((Spell)SpellBook.Standard.CAMELOT_TELEPORT, lIllIIll[7]);
        PROGRESSIVE = new aW((Spell)SpellBook.Standard.HOME_TELEPORT, lIllIIll[1]);
        aW[] aWArray = new aW[lIllIIll[9]];
        aWArray[aW.lIllIIll[1]] = VARROCK;
        aWArray[aW.lIllIIll[0]] = LUMBRIDGE;
        aWArray[aW.lIllIIll[4]] = FALADOR;
        aWArray[aW.lIllIIll[6]] = CAMELOT;
        aWArray[aW.lIllIIll[8]] = PROGRESSIVE;
        $VALUES = aWArray;
    }

    private static String lIIlllllIl(String llIlllIlllIlIIl, String llIlllIlllIllIl) {
        llIlllIlllIlIIl = new String(Base64.getDecoder().decode(llIlllIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIlllIllII = new StringBuilder();
        char[] llIlllIlllIlIll = llIlllIlllIllIl.toCharArray();
        int llIlllIlllIlIlI = lIllIIll[1];
        char[] llIlllIlllIIlII = llIlllIlllIlIIl.toCharArray();
        int llIlllIlllIIIll = llIlllIlllIIlII.length;
        int llIlllIlllIIIlI = lIllIIll[1];
        while (aW.lIlIIIIlII(llIlllIlllIIIlI, llIlllIlllIIIll)) {
            char llIlllIlllIllll = llIlllIlllIIlII[llIlllIlllIIIlI];
            llIlllIlllIllII.append((char)(llIlllIlllIllll ^ llIlllIlllIlIll[llIlllIlllIlIlI % llIlllIlllIlIll.length]));
            0;
            ++llIlllIlllIlIlI;
            ++llIlllIlllIIIlI;
            0;
            if (((9 ^ 0x10) & ~(0xBC ^ 0xA5)) >= -1) continue;
            return null;
        }
        return String.valueOf(llIlllIlllIllII);
    }

    private static String lIIlllllll(String llIlllIllllllII, String llIlllIllllllIl) {
        try {
            SecretKeySpec llIllllIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIllllllIl.getBytes(StandardCharsets.UTF_8)), lIllIIll[10]), "DES");
            Cipher llIllllIIIIIIII = Cipher.getInstance("DES");
            llIllllIIIIIIII.init(lIllIIll[4], llIllllIIIIIIIl);
            return new String(llIllllIIIIIIII.doFinal(Base64.getDecoder().decode(llIlllIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIllllllll) {
            llIlllIllllllll.printStackTrace();
            return null;
        }
    }

    private aW(Spell spell, int n3) {
        this.spell = spell;
        this.level = this.cp();
    }

    public boolean cn() {
        int n2;
        if (aW.lIlIIIIIlI(Skills.getBoostedLevel((Skill)Skill.MAGIC), this.level) && aW.lIlIIIIIll(this.spell.canCast() ? 1 : 0)) {
            n2 = lIllIIll[0];
            0;
            if (3 > 3) {
                return (((0xE5 ^ 0xC4) & ~(0x31 ^ 0x10) ^ (0x1A ^ 0x57)) & (0x87 ^ 0x8E ^ (0xC9 ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIlIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIllllllI(String llIllllIIIIlIIl, String llIllllIIIIlIII) {
        try {
            SecretKeySpec llIllllIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllllIIIIllIl = Cipher.getInstance("Blowfish");
            llIllllIIIIllIl.init(lIllIIll[4], llIllllIIIIlllI);
            return new String(llIllllIIIIllIl.doFinal(Base64.getDecoder().decode(llIllllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllIIIIllII) {
            llIllllIIIIllII.printStackTrace();
            return null;
        }
    }

    public int cp() {
        return this.level;
    }

    private static void lIlIIIIIII() {
        lIllIIlI = new String[lIllIIll[9]];
        aW.lIllIIlI[aW.lIllIIll[1]] = aW."VARROCK";
        aW.lIllIIlI[aW.lIllIIll[0]] = aW."LUMBRIDGE";
        aW.lIllIIlI[aW.lIllIIll[4]] = aW."FALADOR";
        aW.lIllIIlI[aW.lIllIIll[6]] = aW."CAMELOT";
        aW.lIllIIlI[aW.lIllIIll[8]] = aW."PROGRESSIVE";
    }

    public static aW valueOf(String string) {
        return Enum.valueOf(AWEnum.class, string);
    }
}


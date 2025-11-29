/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.rs.api.RSNPC
 *  net.unethicalite.api.game.Vars
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.rs.api.RSNPC;
import net.unethicalite.api.game.Vars;

public class j {
    private static /* synthetic */ int[] llIlIIIlIlII;
    private final /* synthetic */ NPC aQ;
    private static final /* synthetic */ int aO;
    private /* synthetic */ HeadIcon aR;
    private static final /* synthetic */ int aP;
    private /* synthetic */ int aS;
    private /* synthetic */ int aT;
    private /* synthetic */ Prayer aU;
    private static /* synthetic */ String[] llIlIIIlIIll;

    public void j(int n2) {
        this.aS += llIlIIIlIlII[1];
        this.aT = n2;
    }

    /*
     * WARNING - void declaration
     */
    public HeadIcon aD() {
        if (j.lIIIIIIlIIllIII(this.aQ)) {
            void lllllllllllllllIlIIIllIIllllllII;
            RSNPC rSNPC = (RSNPC)this.aQ;
            short[] sArray = rSNPC.getOverheadIcons();
            if (j.lIIIIIIlIIllIIl(sArray)) {
                return this.aR;
            }
            lllllllllllllllIlIIIllIIlllllllI.aR = HeadIcon.values()[lllllllllllllllIlIIIllIIllllllII[llIlIIIlIlII[0]]];
        }
        return this.aR;
    }

    public NPC aI() {
        return this.aQ;
    }

    private static void lIIIIIIlIIlIlll() {
        llIlIIIlIlII = new int[8];
        j.llIlIIIlIlII[0] = (0x47 ^ 0x5B) & ~(0xAE ^ 0xB2);
        j.llIlIIIlIlII[1] = 1;
        j.llIlIIIlIlII[2] = -(0xFFFFEC5F & 0x7BAD) & (0xFFFFFFFF & 0x7FDF);
        j.llIlIIIlIlII[3] = -(0xFFFFBAFB & 0x6D37) & (0xFFFFED7F & 0x3BFF);
        j.llIlIIIlIlII[4] = -(0xFFFFED37 & 0x7ED9) & (0xFFFFFFF7 & 0x6FFF);
        j.llIlIIIlIlII[5] = 3;
        j.llIlIIIlIlII[6] = 2;
        j.llIlIIIlIlII[7] = 3 ^ 0x7D ^ (0x61 ^ 0x17);
    }

    public int aJ() {
        return this.aS;
    }

    public Prayer aG() {
        return this.aU;
    }

    private static void lIIIIIIlIIlIllI() {
        llIlIIIlIIll = new String[llIlIIIlIlII[6]];
        j.llIlIIIlIIll[j.llIlIIIlIlII[0]] = j."_";
        j.llIlIIIlIIll[j.llIlIIIlIlII[1]] = j." ";
    }

    private static String lIIIIIIlIIlIlII(String lllllllllllllllIlIIIllIIlllIlllI, String lllllllllllllllIlIIIllIIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlllIllIl.getBytes(StandardCharsets.UTF_8)), llIlIIIlIlII[7]), "DES");
            Cipher lllllllllllllllIlIIIllIIllllIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIIllllIIII.init(llIlIIIlIlII[6], lllllllllllllllIlIIIllIIllllIIIl);
            return new String(lllllllllllllllIlIIIllIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIIlllIllll) {
            lllllllllllllllIlIIIllIIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIIllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public int aH() {
        int n2;
        int n3 = Vars.getBit((int)llIlIIIlIlII[2]);
        int n4 = n3 / llIlIIIlIlII[3];
        if (!j.lIIIIIIlIIllIll(n3) || j.lIIIIIIlIIlllII(n3, llIlIIIlIlII[4])) {
            n2 = llIlIIIlIlII[5];
            0;
            if ((0x83 ^ 0xAF ^ (0x91 ^ 0xB9)) == 0) {
                return (0x4E ^ 0xF ^ (0xF6 ^ 0x85)) & (150 + 233 - 311 + 169 ^ 8 + 35 - -104 + 48 ^ -1);
            }
        } else {
            void lllllllllllllllIlIIIllIIllllIllI;
            n2 = lllllllllllllllIlIIIllIIllllIllI + llIlIIIlIlII[1];
        }
        return n2;
    }

    public void aF() {
        Prayer prayer;
        if (j.lIIIIIIlIIllIlI(this.aU, Prayer.PROTECT_FROM_MISSILES)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (3 != 3) {
                return;
            }
        } else {
            prayer = Prayer.PROTECT_FROM_MISSILES;
        }
        this.aU = prayer;
    }

    public String aE() {
        String string = this.aD().toString();
        return string.charAt(llIlIIIlIlII[0]) + string.substring(llIlIIIlIlII[1]).replaceAll(llIlIIIlIIll[llIlIIIlIlII[0]], llIlIIIlIIll[llIlIIIlIlII[1]]).trim().toLowerCase();
    }

    private static boolean lIIIIIIlIIllIII(Object object) {
        return object != null;
    }

    static {
        j.lIIIIIIlIIlIlll();
        j.lIIIIIIlIIlIllI();
        aP = llIlIIIlIlII[3];
        aO = llIlIIIlIlII[2];
    }

    private static boolean lIIIIIIlIIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIIIIIlIIlIlIl(String lllllllllllllllIlIIIllIIlllIIIIl, String lllllllllllllllIlIIIllIIllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIIlllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIIlllIIIll.init(llIlIIIlIlII[6], lllllllllllllllIlIIIllIIlllIIlII);
            return new String(lllllllllllllllIlIIIllIIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIIlllIIIlI) {
            lllllllllllllllIlIIIllIIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    public j(NPC nPC) {
        this.aQ = nPC;
        this.aU = Prayer.PROTECT_FROM_MISSILES;
    }

    public void a(Prayer prayer) {
        this.aU = prayer;
    }

    public int aK() {
        return this.aT;
    }

    private static boolean lIIIIIIlIIllIll(int n2) {
        return n2 > 0;
    }
}


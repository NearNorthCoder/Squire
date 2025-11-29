/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ao;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

public abstract class bG
extends ao {
    private static final /* synthetic */ int go;
    private static /* synthetic */ String[] llIlIIIIlIl;
    private static final /* synthetic */ int gn;
    private static /* synthetic */ int[] llIlIIIIllI;

    private static String lIlIIlIIlIIIIl(String llllllllllllllllIIlllIIIIllIlIII, String llllllllllllllllIIlllIIIIllIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIllI[19]), "DES");
            Cipher llllllllllllllllIIlllIIIIllIllII = Cipher.getInstance("DES");
            llllllllllllllllIIlllIIIIllIllII.init(llIlIIIIllI[11], llllllllllllllllIIlllIIIIllIllIl);
            return new String(llllllllllllllllIIlllIIIIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIIIllIlIll) {
            llllllllllllllllIIlllIIIIllIlIll.printStackTrace();
            return null;
        }
    }

    public NPC co() {
        int[] nArray = new int[llIlIIIIllI[8]];
        nArray[bG.llIlIIIIllI[7]] = llIlIIIIllI[9];
        nArray[bG.llIlIIIIllI[2]] = llIlIIIIllI[10];
        nArray[bG.llIlIIIIllI[11]] = llIlIIIIllI[12];
        nArray[bG.llIlIIIIllI[13]] = llIlIIIIllI[14];
        nArray[bG.llIlIIIIllI[15]] = llIlIIIIllI[16];
        nArray[bG.llIlIIIIllI[17]] = llIlIIIIllI[18];
        return NPCs.getNearest((int[])nArray);
    }

    private static boolean lIlIIlIIlIlIIl(Object object) {
        return object == null;
    }

    static {
        bG.lIlIIlIIlIIlIl();
        bG.lIlIIlIIlIIlII();
        gn = llIlIIIIllI[0];
        go = llIlIIIIllI[1];
    }

    @Override
    public boolean bj() {
        boolean bl2;
        bG llllllllllllllllIIlllIIIIlllIlll;
        if (bG.lIlIIlIIlIIllI(this.cw.j(llIlIIIIllI[1]) ? 1 : 0)) {
            return llIlIIIIllI[2];
        }
        int llllllllllllllllIIlllIIIIlllIllI = llllllllllllllllIIlllIIIIlllIlll.aX();
        if (!bG.lIlIIlIIlIIlll(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[3]) || !bG.lIlIIlIIlIIlll(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[4]) || !bG.lIlIIlIIlIIlll(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[5]) || bG.lIlIIlIIlIlIII(llllllllllllllllIIlllIIIIlllIllI, llIlIIIIllI[6])) {
            bl2 = llIlIIIIllI[2];
            0;
            if ((0x26 ^ 0x6D ^ (0xD5 ^ 0x9A)) > (130 + 107 - 220 + 118 ^ 42 + 98 - 29 + 20)) {
                return ((146 + 192 - 232 + 139 ^ 76 + 91 - 112 + 117) & (0x22 ^ 0x3B ^ (0x2E ^ 0x6E) ^ -1)) != 0;
            }
        } else {
            bl2 = llIlIIIIllI[7];
        }
        return bl2;
    }

    @Inject
    protected bG(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIIlIIlIlIlI(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        boolean bl2;
        if (bG.lIlIIlIIlIlIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (bG.lIlIIlIIlIIllI(nPC.getName().contains(llIlIIIIlIl[llIlIIIIllI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlIIIIllI[2]];
                stringArray[bG.llIlIIIIllI[7]] = llIlIIIIlIl[llIlIIIIllI[11]];
                if (bG.lIlIIlIIlIIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIIIIllI[2];
                    0;
                    if (1 == 1) return n2 != 0;
                    return ((199 + 92 - 96 + 55 ^ 41 + 54 - 39 + 138) & (0xBE ^ 0xC7 ^ (0x67 ^ 0x26) ^ -1)) != 0;
                }
            }
            n2 = llIlIIIIllI[7];
            return n2 != 0;
        }))) {
            bl2 = llIlIIIIllI[2];
            0;
            if (((0xC ^ 0x4A) & ~(0xFF ^ 0xB9)) >= (0x6D ^ 0x69)) {
                return ((0x26 ^ 0x6C) & ~(0x1C ^ 0x56)) != 0;
            }
        } else {
            bl2 = llIlIIIIllI[7];
        }
        return bl2;
    }

    private static void lIlIIlIIlIIlII() {
        llIlIIIIlIl = new String[llIlIIIIllI[13]];
        bG.llIlIIIIlIl[bG.llIlIIIIllI[7]] = bG."Core";
        bG.llIlIIIIlIl[bG.llIlIIIIllI[2]] = bG."Obelisk";
        bG.llIlIIIIlIl[bG.llIlIIIIllI[11]] = bG."Attack";
    }

    private static String lIlIIlIIlIIIll(String llllllllllllllllIIlllIIIIlIIIIll, String llllllllllllllllIIlllIIIIlIIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIIIlIIIlll.init(llIlIIIIllI[11], llllllllllllllllIIlllIIIIlIIlIII);
            return new String(llllllllllllllllIIlllIIIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIIIlIIIllI) {
            llllllllllllllllIIlllIIIIlIIIllI.printStackTrace();
            return null;
        }
    }

    @Override
    public int bi() {
        return llIlIIIIllI[0];
    }

    private static boolean lIlIIlIIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean bn() {
        return llIlIIIIllI[7];
    }

    private static boolean lIlIIlIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIlIIIlI(String llllllllllllllllIIlllIIIIlIlIlIl, String llllllllllllllllIIlllIIIIlIllIIl) {
        llllllllllllllllIIlllIIIIlIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIIIlIllIII = new StringBuilder();
        char[] llllllllllllllllIIlllIIIIlIlIlll = llllllllllllllllIIlllIIIIlIllIIl.toCharArray();
        int llllllllllllllllIIlllIIIIlIlIllI = llIlIIIIllI[7];
        char[] llllllllllllllllIIlllIIIIlIlIIII = llllllllllllllllIIlllIIIIlIlIlIl.toCharArray();
        int llllllllllllllllIIlllIIIIlIIllll = llllllllllllllllIIlllIIIIlIlIIII.length;
        int llllllllllllllllIIlllIIIIlIIlllI = llIlIIIIllI[7];
        while (bG.lIlIIlIIlIlIll(llllllllllllllllIIlllIIIIlIIlllI, llllllllllllllllIIlllIIIIlIIllll)) {
            char llllllllllllllllIIlllIIIIlIllIll = llllllllllllllllIIlllIIIIlIlIIII[llllllllllllllllIIlllIIIIlIIlllI];
            llllllllllllllllIIlllIIIIlIllIII.append((char)(llllllllllllllllIIlllIIIIlIllIll ^ llllllllllllllllIIlllIIIIlIlIlll[llllllllllllllllIIlllIIIIlIlIllI % llllllllllllllllIIlllIIIIlIlIlll.length]));
            0;
            ++llllllllllllllllIIlllIIIIlIlIllI;
            ++llllllllllllllllIIlllIIIIlIIlllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIIIIlIllIII);
    }

    private static boolean lIlIIlIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        String[] stringArray = new String[llIlIIIIllI[2]];
        stringArray[bG.llIlIIIIllI[7]] = llIlIIIIlIl[llIlIIIIllI[7]];
        if (!bG.lIlIIlIIlIlIIl(NPCs.getNearest((String[])stringArray)) || bG.lIlIIlIIlIlIlI(this.co())) {
            bl2 = llIlIIIIllI[2];
            0;
            if (null != null) {
                return ((0x79 ^ 0x59) & ~(0xBA ^ 0x9A)) != 0;
            }
        } else {
            bl2 = llIlIIIIllI[7];
        }
        return bl2;
    }

    private static void lIlIIlIIlIIlIl() {
        llIlIIIIllI = new int[20];
        bG.llIlIIIIllI[0] = -(0xFFFFF572 & 0x4E8F) & (0xFFFFFFF3 & 0x7F5D);
        bG.llIlIIIIllI[1] = -(0xFFFFDE2A & 0x67DF) & (0xFFFFFFF9 & 0x7F5F);
        bG.llIlIIIIllI[2] = 1;
        bG.llIlIIIIllI[3] = -(0xFFFFFBCD & 0x463B) & (0xFFFFEFFB & 0x7FFD);
        bG.llIlIIIIllI[4] = -(0x2E ^ 0x27) & (0xFFFFBFFA & 0x6DFF);
        bG.llIlIIIIllI[5] = -(0xFFFF921D & 0x7FE7) & (0xFFFFBFFF & 0x7FF7);
        bG.llIlIIIIllI[6] = 0xFFFFEDF4 & 0x3FFF;
        bG.llIlIIIIllI[7] = (44 + 37 - -41 + 8 ^ 128 + 69 - 99 + 37) & (0x4D ^ 6 ^ (0x1F ^ 0x51) ^ -1);
        bG.llIlIIIIllI[8] = 0x26 ^ 0x20;
        bG.llIlIIIIllI[9] = 0xFFFFAFF9 & 0x7DEF;
        bG.llIlIIIIllI[10] = -(0x7A ^ 0x6B) & (0xFFFFAFFE & 0x7DFB);
        bG.llIlIIIIllI[11] = 2;
        bG.llIlIIIIllI[12] = -(0xFFFFF6FD & 0x4917) & (0xFFFFFFFF & 0x6DFF);
        bG.llIlIIIIllI[13] = 3;
        bG.llIlIIIIllI[14] = 0xFFFFBFED & 0x6DFE;
        bG.llIlIIIIllI[15] = 0x92 ^ 0xC5 ^ (0x1A ^ 0x49);
        bG.llIlIIIIllI[16] = -3 & (0xFFFFFFFF & 0x2DEF);
        bG.llIlIIIIllI[17] = 0x21 ^ 0x24;
        bG.llIlIIIIllI[18] = -(0xFFFFD39E & 0x6E63) & (0xFFFFFFEF & 0x6FFF);
        bG.llIlIIIIllI[19] = 0x60 ^ 0x68;
    }
}


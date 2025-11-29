/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i;

@TaskDesc(name="Walking to boss")
public class l
extends i {
    private static final /* synthetic */ int J;
    private static final /* synthetic */ int E;
    private static final /* synthetic */ RegionPoint K;
    private static final /* synthetic */ int I;
    private static final /* synthetic */ int L;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int O;
    private static final /* synthetic */ WorldPoint C;
    private static final /* synthetic */ int P;
    private static final /* synthetic */ int F;
    private static final /* synthetic */ int G;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ int M;
    private static final /* synthetic */ WorldPoint D;
    private static /* synthetic */ int[] lIlIllIllIIlI;
    private static /* synthetic */ String[] lIlIllIlIllll;

    static {
        l.llIIIIIlIlllllI();
        l.llIIIIIlIlllIll();
        L = lIlIllIllIIlI[1];
        E = lIlIllIllIIlI[2];
        P = lIlIllIllIIlI[16];
        J = lIlIllIllIIlI[10];
        M = lIlIllIllIIlI[12];
        O = lIlIllIllIIlI[15];
        H = lIlIllIllIIlI[7];
        I = lIlIllIllIIlI[9];
        N = lIlIllIllIIlI[18];
        G = lIlIllIllIIlI[5];
        F = lIlIllIllIIlI[4];
        C = new WorldPoint(lIlIllIllIIlI[19], lIlIllIllIIlI[20], lIlIllIllIIlI[0]);
        D = new WorldPoint(lIlIllIllIIlI[21], lIlIllIllIIlI[22], lIlIllIllIIlI[0]);
        K = new RegionPoint(lIlIllIllIIlI[23], lIlIllIllIIlI[24], lIlIllIllIIlI[0], lIlIllIllIIlI[10]);
    }

    private static boolean llIIIIIllIIIIIl(int n2) {
        return n2 == 0;
    }

    private static String llIIIIIlIllIllI(String llllllllllllllIllIlIIIlIlIIlllll, String llllllllllllllIllIlIIIlIlIIllllI) {
        llllllllllllllIllIlIIIlIlIIlllll = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIlIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIlIlIIlllIl = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIlIIlllII = llllllllllllllIllIlIIIlIlIIllllI.toCharArray();
        int llllllllllllllIllIlIIIlIlIIllIll = lIlIllIllIIlI[0];
        char[] llllllllllllllIllIlIIIlIlIIlIlIl = llllllllllllllIllIlIIIlIlIIlllll.toCharArray();
        int llllllllllllllIllIlIIIlIlIIlIlII = llllllllllllllIllIlIIIlIlIIlIlIl.length;
        int llllllllllllllIllIlIIIlIlIIlIIll = lIlIllIllIIlI[0];
        while (l.llIIIIIllIIIIll(llllllllllllllIllIlIIIlIlIIlIIll, llllllllllllllIllIlIIIlIlIIlIlII)) {
            char llllllllllllllIllIlIIIlIlIlIIIII = llllllllllllllIllIlIIIlIlIIlIlIl[llllllllllllllIllIlIIIlIlIIlIIll];
            llllllllllllllIllIlIIIlIlIIlllIl.append((char)(llllllllllllllIllIlIIIlIlIlIIIII ^ llllllllllllllIllIlIIIlIlIIlllII[llllllllllllllIllIlIIIlIlIIllIll % llllllllllllllIllIlIIIlIlIIlllII.length]));
            0;
            ++llllllllllllllIllIlIIIlIlIIllIll;
            ++llllllllllllllIllIlIIIlIlIIlIIll;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIlIlIIlllIl);
    }

    private static String llIIIIIlIlllIII(String llllllllllllllIllIlIIIlIIlllllIl, String llllllllllllllIllIlIIIlIIlllllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIlIIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIlIIlllllll.init(lIlIllIllIIlI[6], llllllllllllllIllIlIIIlIlIIIIIII);
            return new String(llllllllllllllIllIlIIIlIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIIllllllI) {
            llllllllllllllIllIlIIIlIIllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIIlIllIlll(String llllllllllllllIllIlIIIlIlIIIlIlI, String llllllllllllllIllIlIIIlIlIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIllIIlI[25]), "DES");
            Cipher llllllllllllllIllIlIIIlIlIIIllII = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIlIIIllII.init(lIlIllIllIIlI[6], llllllllllllllIllIlIIIlIlIIIllIl);
            return new String(llllllllllllllIllIlIIIlIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIlIIIlIll) {
            llllllllllllllIllIlIIIlIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIIIIII(Object object) {
        return object != null;
    }

    @Override
    protected boolean p() {
        TileObject llllllllllllllIllIlIIIlIlIlIlIlI;
        l llllllllllllllIllIlIIIlIlIlIlIll;
        if (l.llIIIIIlIllllll(this.p.b(lIlIllIllIIlI[1]) ? 1 : 0)) {
            return lIlIllIllIIlI[0];
        }
        llllllllllllllIllIlIIIlIlIlIlIll.w.b(llllllllllllllIllIlIIIlIlIlIlIll.w.c());
        0;
        if (l.llIIIIIlIllllll(llllllllllllllIllIlIIIlIlIlIlIll.p.c(lIlIllIllIIlI[2]) ? 1 : 0)) {
            int[] nArray = new int[lIlIllIllIIlI[3]];
            nArray[l.lIlIllIllIIlI[0]] = lIlIllIllIIlI[4];
            llllllllllllllIllIlIIIlIlIlIlIlI = TileObjects.getNearest((int[])nArray);
            if (l.llIIIIIllIIIIII(llllllllllllllIllIlIIIlIlIlIlIlI)) {
                llllllllllllllIllIlIIIlIlIlIlIlI.interact(lIlIllIlIllll[lIlIllIllIIlI[0]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (l.llIIIIIlIllllll(llllllllllllllIllIlIIIlIlIlIlIll.p.c(lIlIllIllIIlI[5]) ? 1 : 0)) {
            if (l.llIIIIIlIllllll(Dialog.isOpen() ? 1 : 0) && l.llIIIIIlIllllll(Dialog.hasOption((String)lIlIllIlIllll[lIlIllIllIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIllIIlI[3]];
                stringArray[l.lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[6]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return lIlIllIllIIlI[3];
            }
            int[] nArray = new int[lIlIllIllIIlI[3]];
            nArray[l.lIlIllIllIIlI[0]] = lIlIllIllIIlI[7];
            llllllllllllllIllIlIIIlIlIlIlIlI = TileObjects.getNearest((int[])nArray);
            if (l.llIIIIIllIIIIII(llllllllllllllIllIlIIIlIlIlIlIlI)) {
                llllllllllllllIllIlIIIlIlIlIlIlI.interact(lIlIllIlIllll[lIlIllIllIIlI[8]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (!l.llIIIIIllIIIIIl(llllllllllllllIllIlIIIlIlIlIlIll.p.c(lIlIllIllIIlI[9]) ? 1 : 0) || l.llIIIIIlIllllll(llllllllllllllIllIlIIIlIlIlIlIll.p.c(lIlIllIllIIlI[10]) ? 1 : 0)) {
            llllllllllllllIllIlIIIlIlIlIlIlI = llllllllllllllIllIlIIIlIlIlIlIll.p.a(K);
            Movement.setDestination((WorldPoint)llllllllllllllIllIlIIIlIlIlIlIlI);
            return lIlIllIllIIlI[3];
        }
        String[] stringArray = new String[lIlIllIllIIlI[3]];
        stringArray[l.lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[11]];
        if (l.llIIIIIlIllllll(Inventory.contains((String[])stringArray) ? 1 : 0) && l.llIIIIIllIIIIlI(Vars.getBit((int)lIlIllIllIIlI[12]), lIlIllIllIIlI[3])) {
            if (l.llIIIIIlIllllll(Dialog.isOpen() ? 1 : 0) && l.llIIIIIlIllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIllIllIIlI[11]);
                0;
            }
            String[] stringArray2 = new String[lIlIllIllIIlI[3]];
            stringArray2[l.lIlIllIllIIlI[0]] = lIlIllIlIllll[lIlIllIllIIlI[13]];
            llllllllllllllIllIlIIIlIlIlIlIlI = Inventory.getFirst((String[])stringArray2);
            llllllllllllllIllIlIIIlIlIlIlIlI.interact(lIlIllIlIllll[lIlIllIllIIlI[14]]);
            return lIlIllIllIIlI[3];
        }
        if (l.llIIIIIlIllllll(llllllllllllllIllIlIIIlIlIlIlIll.p.c(lIlIllIllIIlI[15]) ? 1 : 0)) {
            int[] nArray = new int[lIlIllIllIIlI[3]];
            nArray[l.lIlIllIllIIlI[0]] = lIlIllIllIIlI[16];
            llllllllllllllIllIlIIIlIlIlIlIlI = TileObjects.getNearest((int[])nArray);
            if (l.llIIIIIllIIIIII(llllllllllllllIllIlIIIlIlIlIlIlI)) {
                llllllllllllllIllIlIIIlIlIlIlIlI.interact(lIlIllIlIllll[lIlIllIllIIlI[17]]);
                return lIlIllIllIIlI[3];
            }
        }
        if (!l.llIIIIIllIIIIIl(C.isInScene(llllllllllllllIllIlIIIlIlIlIlIll.j) ? 1 : 0) || l.llIIIIIlIllllll(llllllllllllllIllIlIIIlIlIlIlIll.p.b(lIlIllIllIIlI[18]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)D);
            0;
            return lIlIllIllIIlI[3];
        }
        Movement.walkTo((WorldPoint)C);
        0;
        return lIlIllIllIIlI[3];
    }

    private static boolean llIIIIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIlIlllllI() {
        lIlIllIllIIlI = new int[26];
        l.lIlIllIllIIlI[0] = (72 + 30 - -24 + 103 ^ 88 + 97 - 21 + 11) & (0xA2 ^ 0x8E ^ (0x7C ^ 0x1A) ^ -1);
        l.lIlIllIllIIlI[1] = -(0xFFFFEEC7 & 0x59BE) & (0xFFFFFEE7 & 0x6DFF);
        l.lIlIllIllIIlI[2] = 0xFFFFAFDF & 0x7D7B;
        l.lIlIllIllIIlI[3] = 1;
        l.lIlIllIllIIlI[4] = 0xFFFFEBC7 & 0xD57D;
        l.lIlIllIllIIlI[5] = 0xFFFFB8EC & 0x6F77;
        l.lIlIllIllIIlI[6] = 2;
        l.lIlIllIllIIlI[7] = 0xFFFFC3DF & 0xFD67;
        l.lIlIllIllIIlI[8] = 3;
        l.lIlIllIllIIlI[9] = -(0xFFFFD3CB & 0x6EB7) & (0xFFFFEFE7 & 0x7BFE);
        l.lIlIllIllIIlI[10] = -(0xFFFFFEDD & 0x11BB) & (0xFFFFB9FB & Short.MAX_VALUE);
        l.lIlIllIllIIlI[11] = 0xCE ^ 0xB2 ^ (4 ^ 0x7C);
        l.lIlIllIllIIlI[12] = -(0x29 ^ 0x74) & (0xFFFFFFFF & 0x3B7F);
        l.lIlIllIllIIlI[13] = 103 + 139 - 131 + 39 ^ 52 + 145 - 162 + 112;
        l.lIlIllIllIIlI[14] = 0x73 ^ 0x75;
        l.lIlIllIllIIlI[15] = 0xFFFFB13D & 0x7EFA;
        l.lIlIllIllIIlI[16] = 0xFFFFFF57 & 0x68BD;
        l.lIlIllIllIIlI[17] = 0x95 ^ 0x92;
        l.lIlIllIllIIlI[18] = -(0xFFFFD5B2 & 0x2BEF) & (0xFFFFBFFF & 0x6FFB);
        l.lIlIllIllIIlI[19] = -(0xFFFFB3F6 & 0x7C0B) & (0xFFFFBFBF & 0x7BF7);
        l.lIlIllIllIIlI[20] = -(0xFFFFF243 & 0x3FBE) & (0xFFFFBFAF & 0x7FF7);
        l.lIlIllIllIIlI[21] = -(0xFFFFBDB9 & 0x76D7) & (0xFFFFBFFF & 0x7FFA);
        l.lIlIllIllIIlI[22] = 0xFFFFBEC7 & 0x57F9;
        l.lIlIllIllIIlI[23] = 0x3D ^ 0x1D;
        l.lIlIllIllIIlI[24] = 0xF3 ^ 0xA1 ^ (0x1C ^ 0x69);
        l.lIlIllIllIIlI[25] = 0x3F ^ 0x37;
    }

    private static void llIIIIIlIlllIll() {
        lIlIllIlIllll = new String[lIlIllIllIIlI[25]];
        l.lIlIllIlIllll[l.lIlIllIllIIlI[0]] = l."Climb-rope";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[3]] = l."The Cathedral.";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[6]] = l."The Cathedral";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[8]] = l."Use";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[11]] = l."Ring of shadows";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[13]] = l."Ring of shadows";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[14]] = l."Teleport";
        l.lIlIllIlIllll[l.lIlIllIllIIlI[17]] = l."Enter";
    }

    private static boolean llIIIIIllIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean run() {
        if (l.llIIIIIlIllllll(this.f.b() ? 1 : 0)) {
            return lIlIllIllIIlI[0];
        }
        return this.p();
    }
}


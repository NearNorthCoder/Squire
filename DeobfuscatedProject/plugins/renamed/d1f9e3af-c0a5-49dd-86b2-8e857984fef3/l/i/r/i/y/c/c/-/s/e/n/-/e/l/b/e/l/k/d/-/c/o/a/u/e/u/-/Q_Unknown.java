/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class Q_Unknown
implements W {
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldPoint bX;
    private static final /* synthetic */ int jA;
    private static /* synthetic */ String[] lIIlIIIll;
    static /* synthetic */ WorldPoint jF;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint jE;
    private static /* synthetic */ int[] lIIlIIlll;
    static /* synthetic */ int cl;
    static /* synthetic */ WorldPoint jD;
    static /* synthetic */ boolean jG;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldPoint jB;
    static /* synthetic */ WorldPoint jC;

    private static String llllIIllIlI(String lIIIlIIIlIIlIlI, String lIIIlIIIlIIlIIl) {
        lIIIlIIIlIIlIlI = new String(Base64.getDecoder().decode(lIIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIIlIIlIII = new StringBuilder();
        char[] lIIIlIIIlIIIlll = lIIIlIIIlIIlIIl.toCharArray();
        int lIIIlIIIlIIIllI = lIIlIIlll[1];
        char[] lIIIlIIIlIIIIII = lIIIlIIIlIIlIlI.toCharArray();
        int lIIIlIIIIllllll = lIIIlIIIlIIIIII.length;
        int lIIIlIIIIlllllI = lIIlIIlll[1];
        while (Q.llllIlIlIIl(lIIIlIIIIlllllI, lIIIlIIIIllllll)) {
            char lIIIlIIIlIIlIll = lIIIlIIIlIIIIII[lIIIlIIIIlllllI];
            lIIIlIIIlIIlIII.append((char)(lIIIlIIIlIIlIll ^ lIIIlIIIlIIIlll[lIIIlIIIlIIIllI % lIIIlIIIlIIIlll.length]));
            0;
            ++lIIIlIIIlIIIllI;
            ++lIIIlIIIIlllllI;
            0;
            if ((0xAF ^ 0xAB) >= 0) continue;
            return null;
        }
        return String.valueOf(lIIIlIIIlIIlIII);
    }

    private static void llllIlIIlIl() {
        lIIlIIIll = new String[lIIlIIlll[129]];
        Q.lIIlIIIll[Q.lIIlIIlll[1]] = Q."Finished buying items, switching back to quest";
        Q.lIIlIIIll[Q.lIIlIIlll[0]] = Q."Nav to bank";
        Q.lIIlIIIll[Q.lIIlIIlll[4]] = Q."Handling banking";
        Q.lIIlIIIll[Q.lIIlIIlll[7]] = Q."We are missing quest supplies, switching to BUYING";
        Q.lIIlIIIll[Q.lIIlIIlll[5]] = Q."We are missing quest supplies, switching to BUYING";
        Q.lIIlIIIll[Q.lIIlIIlll[14]] = Q."Drink";
        Q.lIIlIIIll[Q.lIIlIIlll[16]] = Q."Eat";
        Q.lIIlIIIll[Q.lIIlIIlll[18]] = Q."Nav to start";
        Q.lIIlIIIll[Q.lIIlIIlll[20]] = Q."Chancellor Hassan";
        Q.lIIlIIIll[Q.lIIlIIlll[22]] = Q."Nav to osman";
        Q.lIIlIIIll[Q.lIIlIIlll[24]] = Q."Osman";
        Q.lIIlIIIll[Q.lIIlIIlll[25]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[8]] = Q."Wear";
        Q.lIIlIIIll[Q.lIIlIIlll[34]] = Q."Nav to ned";
        Q.lIIlIIIll[Q.lIIlIIlll[35]] = Q."Ned";
        Q.lIIlIIIll[Q.lIIlIIlll[36]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[37]] = Q."Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[38]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[39]] = Q."Aggie";
        Q.lIIlIIIll[Q.lIIlIIlll[42]] = Q."Aggie";
        Q.lIIlIIIll[Q.lIIlIIlll[33]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[43]] = Q."Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[44]] = Q."Key print";
        Q.lIIlIIIll[Q.lIIlIIlll[46]] = Q."Nav to keli";
        Q.lIIlIIIll[Q.lIIlIIlll[52]] = Q."Lady Keli";
        Q.lIIlIIIll[Q.lIIlIIlll[45]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[53]] = Q."Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[54]] = Q."Key print";
        Q.lIIlIIIll[Q.lIIlIIlll[55]] = Q."Nav to osman";
        Q.lIIlIIIll[Q.lIIlIIlll[56]] = Q."Osman";
        Q.lIIlIIIll[Q.lIIlIIlll[57]] = Q."Draynor is";
        Q.lIIlIIIll[Q.lIIlIIlll[58]] = Q."go to leela";
        Q.lIIlIIIll[Q.lIIlIIlll[59]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[60]] = Q."Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[61]] = Q."Osman";
        Q.lIIlIIIll[Q.lIIlIIlll[62]] = Q."Draynor is";
        Q.lIIlIIIll[Q.lIIlIIlll[63]] = Q."go to leela";
        Q.lIIlIIIll[Q.lIIlIIlll[64]] = Q."Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[65]] = Q."Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[66]] = Q."Wear";
        Q.lIIlIIIll[Q.lIIlIIlll[67]] = Q."I'll get going.";
        Q.lIIlIIIll[Q.lIIlIIlll[68]] = Q."Nav to leela";
        Q.lIIlIIIll[Q.lIIlIIlll[69]] = Q."Leela";
        Q.lIIlIIIll[Q.lIIlIIlll[70]] = Q."Bronze key";
        Q.lIIlIIIll[Q.lIIlIIlll[73]] = Q."Nav to jail";
        Q.lIIlIIIll[Q.lIIlIIlll[74]] = Q."Give beer";
        Q.lIIlIIIll[Q.lIIlIIlll[75]] = Q."Joe";
        Q.lIIlIIIll[Q.lIIlIIlll[76]] = Q."Rope";
        Q.lIIlIIIll[Q.lIIlIIlll[77]] = Q."Tying up";
        Q.lIIlIIIll[Q.lIIlIIlll[78]] = Q."Rope";
        Q.lIIlIIIll[Q.lIIlIIlll[32]] = Q."Lady Keli";
        Q.lIIlIIIll[Q.lIIlIIlll[79]] = Q."Entering jail";
        Q.lIIlIIIll[Q.lIIlIIlll[80]] = Q."Bronze key";
        Q.lIIlIIIll[Q.lIIlIIlll[81]] = Q."Prison Gate";
        Q.lIIlIIIll[Q.lIIlIIlll[82]] = Q."Prince Ali";
        Q.lIIlIIIll[Q.lIIlIIlll[84]] = Q."Break";
        Q.lIIlIIIll[Q.lIIlIIlll[87]] = Q."Open gate";
        Q.lIIlIIIll[Q.lIIlIIlll[88]] = Q."Gate";
        Q.lIIlIIIll[Q.lIIlIIlll[89]] = Q."Open";
        Q.lIIlIIIll[Q.lIIlIIlll[90]] = Q."Nav to start";
        Q.lIIlIIIll[Q.lIIlIIlll[91]] = Q."Chancellor Hassan";
        Q.lIIlIIIll[Q.lIIlIIlll[97]] = Q."Prince Ali Rescue";
        Q.lIIlIIIll[Q.lIIlIIlll[99]] = Q."ring of wealth (";
        Q.lIIlIIIll[Q.lIIlIIlll[100]] = Q."glory";
        Q.lIIlIIIll[Q.lIIlIIlll[101]] = Q."glory";
        Q.lIIlIIIll[Q.lIIlIIlll[102]] = Q."glory";
        Q.lIIlIIIll[Q.lIIlIIlll[103]] = Q."glory";
        Q.lIIlIIIll[Q.lIIlIIlll[116]] = Q."Yes.";
        Q.lIIlIIIll[Q.lIIlIIlll[117]] = Q."Is there anything I can help you with?";
        Q.lIIlIIIll[Q.lIIlIIlll[118]] = Q."Could you make other things apart from rope?";
        Q.lIIlIIIll[Q.lIIlIIlll[119]] = Q."How about some sort of wig?";
        Q.lIIlIIIll[Q.lIIlIIlll[120]] = Q."I have them here. Please make me a wig.";
        Q.lIIlIIIll[Q.lIIlIIlll[121]] = Q."Can you make skin paste?";
        Q.lIIlIIIll[Q.lIIlIIlll[122]] = Q."Yes please. Mix me some skin paste.";
        Q.lIIlIIIll[Q.lIIlIIlll[123]] = Q."Heard of you? You're famous in Gielinor!";
        Q.lIIlIIIll[Q.lIIlIIlll[124]] = Q."What's your latest plan then?";
        Q.lIIlIIIll[Q.lIIlIIlll[125]] = Q."How do you know someone won't try to free him?";
        Q.lIIlIIIll[Q.lIIlIIlll[126]] = Q."Could I see the key please?";
        Q.lIIlIIIll[Q.lIIlIIlll[127]] = Q."Could I touch the key for a moment please?";
        Q.lIIlIIIll[Q.lIIlIIlll[128]] = Q."I have some beer here. Fancy one?";
    }

    private static boolean llllIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return lIIlIIlll[1];
    }

    private static boolean llllIlIlIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            Q.cS();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 < 0) {
            return 1 & (1 ^ -1);
        }
        return lIIlIIlll[83];
    }

    private static boolean llllIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (Q.llllIllIIlI(e.j(lIIlIIlll[2]), lIIlIIlll[98])) {
            bl = lIIlIIlll[0];
            0;
            if (((0x64 ^ 0x5E ^ (0x99 ^ 0x84)) & (0xB ^ 0x73 ^ (0 ^ 0x5F) ^ -1)) < 0) {
                return ((0x79 ^ 0x68 ^ (0x68 ^ 0x73)) & (0xAF ^ 0x8C ^ (0x63 ^ 0x4A) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIlll[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIlIIIllIlIIl;
        int[] nArray = new int[lIIlIIlll[8]];
        nArray[Q.lIIlIIlll[1]] = lIIlIIlll[9];
        nArray[Q.lIIlIIlll[0]] = lIIlIIlll[10];
        nArray[Q.lIIlIIlll[4]] = lIIlIIlll[11];
        nArray[Q.lIIlIIlll[7]] = lIIlIIlll[12];
        nArray[Q.lIIlIIlll[5]] = lIIlIIlll[13];
        nArray[Q.lIIlIIlll[14]] = lIIlIIlll[15];
        nArray[Q.lIIlIIlll[16]] = lIIlIIlll[17];
        nArray[Q.lIIlIIlll[18]] = lIIlIIlll[19];
        nArray[Q.lIIlIIlll[20]] = lIIlIIlll[21];
        nArray[Q.lIIlIIlll[22]] = lIIlIIlll[23];
        nArray[Q.lIIlIIlll[24]] = lIIlIIlll[6];
        nArray[Q.lIIlIIlll[25]] = lIIlIIlll[26];
        int[] nArray2 = nArray;
        int lIIIlIIIllIlIII = lIIlIIlll[1];
        while (Q.llllIlIlIIl(lIIIlIIIllIlIII, ((void)lIIIlIIIllIlIIl).length)) {
            int[] nArray3 = new int[lIIlIIlll[0]];
            nArray3[Q.lIIlIIlll[1]] = lIIIlIIIllIlIIl[lIIIlIIIllIlIII];
            if (Q.llllIlIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIlll[1];
            }
            ++lIIIlIIIllIlIII;
            0;
            if (-1 <= 0) continue;
            return ((0x3D ^ 0x5A ^ (0x71 ^ 0x1E)) & (0xC1 ^ 0xB0 ^ (0x10 ^ 0x69) ^ -1)) != 0;
        }
        return lIIlIIlll[0];
    }

    private static void llllIlIIllI() {
        lIIlIIlll = new int[130];
        Q.lIIlIIlll[0] = 1;
        Q.lIIlIIlll[1] = (0x90 ^ 0xBE) & ~(0xBC ^ 0x92);
        Q.lIIlIIlll[2] = -(0xFFFFEDFB & 0x7AEF) & (0xFFFFF9FB & 0x6FFF);
        Q.lIIlIIlll[3] = 0xFFFF9398 & 0x7FEF;
        Q.lIIlIIlll[4] = 2;
        Q.lIIlIIlll[5] = 0x1E ^ 0x4B ^ (0x68 ^ 0x39);
        Q.lIIlIIlll[6] = 0xFFFFFF7F & 0x7FD;
        Q.lIIlIIlll[7] = 3;
        Q.lIIlIIlll[8] = 81 + 130 - 171 + 110 ^ 24 + 98 - -31 + 1;
        Q.lIIlIIlll[9] = 0xFFFFFFD7 & 0x1F6F;
        Q.lIIlIIlll[10] = -(0xFFFFDA5B & 0x7DAF) & (0xFFFFFFFF & 0x5EEB);
        Q.lIIlIIlll[11] = -(0xFFFFC7A7 & 0x7879) & (0xFFFFF6FF & 0x4FFF);
        Q.lIIlIIlll[12] = -(0xFFFF95DF & 0x7A33) & (0xFFFFD7F7 & 0x3EFF);
        Q.lIIlIIlll[13] = -(0xFFFFEFC3 & 0x507D) & (0xFFFFFFDF & 0x47FF);
        Q.lIIlIIlll[14] = 0x79 ^ 0x7C;
        Q.lIIlIIlll[15] = -(0xFFFFEE6F & 0x51BB) & (0xFFFFD6FF & 0x6B7A);
        Q.lIIlIIlll[16] = 0xD6 ^ 0x9D ^ (0x5B ^ 0x16);
        Q.lIIlIIlll[17] = 0xFFFFFFFD & 0x78B;
        Q.lIIlIIlll[18] = 0xF9 ^ 0x94 ^ (0x5B ^ 0x31);
        Q.lIIlIIlll[19] = 0xFFFFDF9D & 0x27EF;
        Q.lIIlIIlll[20] = 0x28 ^ 0x20;
        Q.lIIlIIlll[21] = 0xFFFFADFD & 0x5B2F;
        Q.lIIlIIlll[22] = 0x54 ^ 0x34 ^ (0x45 ^ 0x2C);
        Q.lIIlIIlll[23] = -(0xFFFFEABF & 0x7D4B) & (0xFFFFFBFF & 0x6FFF);
        Q.lIIlIIlll[24] = 0x4B ^ 0xE ^ (0x50 ^ 0x1F);
        Q.lIIlIIlll[25] = 105 + 14 - -7 + 36 ^ 112 + 37 - 32 + 52;
        Q.lIIlIIlll[26] = 0xFFFF8FFF & 0x73BA;
        Q.lIIlIIlll[27] = 0xFFFFA97B & 0x57FF;
        Q.lIIlIIlll[28] = 0xFFFFBFDF & 0x6EEA;
        Q.lIIlIIlll[29] = 0xFFFFF177 & 0x3FD9;
        Q.lIIlIIlll[30] = -(0xFFFFB8F9 & 0x6F1F) & (0xFFFFEFFB & 0x3BFF);
        Q.lIIlIIlll[31] = 0xFFFFEBFE & 0x17E9;
        Q.lIIlIIlll[32] = 0x1C ^ 0x2E;
        Q.lIIlIIlll[33] = 0x60 ^ 0x35 ^ (0x2D ^ 0x6C);
        Q.lIIlIIlll[34] = 0x49 ^ 0x44;
        Q.lIIlIIlll[35] = 0x96 ^ 0x98;
        Q.lIIlIIlll[36] = 0x49 ^ 0x46;
        Q.lIIlIIlll[37] = 0x4E ^ 0x5E;
        Q.lIIlIIlll[38] = 30 + 62 - -22 + 41 ^ 18 + 123 - 139 + 136;
        Q.lIIlIIlll[39] = 0x26 ^ 0x48 ^ (1 ^ 0x7D);
        Q.lIIlIIlll[40] = 0xFFFF8E1B & 0x7DEF;
        Q.lIIlIIlll[41] = 0xFFFFCFFE & 0x3CB9;
        Q.lIIlIIlll[42] = 26 + 1 - -44 + 66 ^ 19 + 131 - 8 + 12;
        Q.lIIlIIlll[43] = 0xD9 ^ 0xA2 ^ (0xDA ^ 0xB4);
        Q.lIIlIIlll[44] = 53 + 90 - 88 + 100 ^ 19 + 56 - -24 + 42;
        Q.lIIlIIlll[45] = 0xB7 ^ 0xAE;
        Q.lIIlIIlll[46] = 0x45 ^ 0x52;
        Q.lIIlIIlll[47] = 0xFFFFBEFB & 0x4D3C;
        Q.lIIlIIlll[48] = -(0xFFFFDD55 & 0x63EB) & (0xFFFFDDEF & 0x6FFE);
        Q.lIIlIIlll[49] = -(0xFFFFDDE5 & 0x625B) & (0xFFFFCCEF & Short.MAX_VALUE);
        Q.lIIlIIlll[50] = -(0xFFFFDFAF & 0x3353) & (0xFFFFFF7F & 0x1FBB);
        Q.lIIlIIlll[51] = -(0xFFFFD41F & 0x6BF3) & (0xFFFFCEBF & 0x7DFF);
        Q.lIIlIIlll[52] = 0xE6 ^ 0x89 ^ (0xCE ^ 0xB9);
        Q.lIIlIIlll[53] = 0x6D ^ 0x77;
        Q.lIIlIIlll[54] = 0x7B ^ 0x60;
        Q.lIIlIIlll[55] = 0x74 ^ 0x68;
        Q.lIIlIIlll[56] = 0x4D ^ 0x50;
        Q.lIIlIIlll[57] = 0x29 ^ 0x37;
        Q.lIIlIIlll[58] = 0x5B ^ 0x67 ^ (0xA0 ^ 0x83);
        Q.lIIlIIlll[59] = 26 + 76 - -39 + 88 ^ 175 + 31 - 136 + 127;
        Q.lIIlIIlll[60] = 0x87 ^ 0x97 ^ (0x3F ^ 0xE);
        Q.lIIlIIlll[61] = 0x43 ^ 0x61;
        Q.lIIlIIlll[62] = 0xB7 ^ 0x94;
        Q.lIIlIIlll[63] = 0x84 ^ 0xA8 ^ (0x26 ^ 0x2E);
        Q.lIIlIIlll[64] = 0xB7 ^ 0x92;
        Q.lIIlIIlll[65] = 0x3B ^ 0x1D;
        Q.lIIlIIlll[66] = 0x71 ^ 0x56;
        Q.lIIlIIlll[67] = 0x38 ^ 0x50 ^ (0xDC ^ 0x9C);
        Q.lIIlIIlll[68] = 141 + 140 - 223 + 92 ^ 140 + 168 - 277 + 160;
        Q.lIIlIIlll[69] = 3 ^ 0x41 ^ (0xFE ^ 0x96);
        Q.lIIlIIlll[70] = 129 + 19 - 128 + 124 ^ 152 + 49 - 56 + 42;
        Q.lIIlIIlll[71] = 0xFFFFAC75 & 0x5FBB;
        Q.lIIlIIlll[72] = -(0xFFFFF2BD & 0x7D5A) & (0xFFFFFFBF & 0x7CFF);
        Q.lIIlIIlll[73] = 0xB6 ^ 0x9A;
        Q.lIIlIIlll[74] = 0xA7 ^ 0x8A;
        Q.lIIlIIlll[75] = 0xA6 ^ 0x88;
        Q.lIIlIIlll[76] = 9 ^ 0x25 ^ 3;
        Q.lIIlIIlll[77] = 0x48 ^ 0x21 ^ (4 ^ 0x5D);
        Q.lIIlIIlll[78] = 0x46 ^ 0x2A ^ (0xC6 ^ 0x9B);
        Q.lIIlIIlll[79] = 0xBF ^ 0x8C;
        Q.lIIlIIlll[80] = 0xED ^ 0xC2 ^ (0x86 ^ 0x9D);
        Q.lIIlIIlll[81] = 6 ^ 0x22 ^ (0x75 ^ 0x64);
        Q.lIIlIIlll[82] = 0x22 ^ 0x12 ^ (0x89 ^ 0x8F);
        Q.lIIlIIlll[83] = 0x23 ^ 0x47;
        Q.lIIlIIlll[84] = 0x10 ^ 0x27;
        Q.lIIlIIlll[85] = -(0xFFFFB36D & 0x4F9E) & (0xFFFFBFBF & 0x4FDF);
        Q.lIIlIIlll[86] = -(0x6A ^ 0x47) & (0xFFFFCDFF & 0x3EEF);
        Q.lIIlIIlll[87] = 0x78 ^ 0x35 ^ (0x44 ^ 0x31);
        Q.lIIlIIlll[88] = 33 + 59 - 39 + 89 ^ 67 + 75 - 53 + 94;
        Q.lIIlIIlll[89] = 0x39 ^ 3;
        Q.lIIlIIlll[90] = 0xAB ^ 0xC5 ^ (0x16 ^ 0x43);
        Q.lIIlIIlll[91] = 91 + 2 - -58 + 39 ^ 18 + 93 - 27 + 46;
        Q.lIIlIIlll[92] = -(0xFFFFFFE3 & 0x239D) & (0xFFFFEFFE & 0x7FAD);
        Q.lIIlIIlll[93] = -(0xFFFFF79B & 0x6867) & (0xFFFFF7FE & 0x7D7F);
        Q.lIIlIIlll[94] = -(0xFFFFE96B & 0x57B7) & (0xFFFFFFEF & 0x6FFE);
        Q.lIIlIIlll[95] = 0xFFFFEFAE & 0x71F9;
        Q.lIIlIIlll[96] = 0xFFFFAF7F & 0x57EC;
        Q.lIIlIIlll[97] = 0x21 ^ 0x1C;
        Q.lIIlIIlll[98] = 0x44 ^ 0x2A;
        Q.lIIlIIlll[99] = 23 + 17 - -53 + 65 ^ 2 + 158 - 3 + 3;
        Q.lIIlIIlll[100] = 3 ^ 0x3C;
        Q.lIIlIIlll[101] = 0x69 ^ 0x29;
        Q.lIIlIIlll[102] = 0xEC ^ 0xAD;
        Q.lIIlIIlll[103] = 0xAE ^ 0xAB ^ (0x14 ^ 0x53);
        Q.lIIlIIlll[104] = 0xFFFFCCEB & 0x3FF7;
        Q.lIIlIIlll[105] = -(0xFFFFE9D5 & 0x57AF) & (0xFFFFCDFF & 0x7FDD);
        Q.lIIlIIlll[106] = -(0xFFFFE471 & 0x5BAF) & (0xFFFFECFB & 0x5FFE);
        Q.lIIlIIlll[107] = -(0xFFFFA789 & 0x7BF7) & (0xFFFFAFFF & 0x7FEE);
        Q.lIIlIIlll[108] = 0xFFFFFF9F & 0xC7A;
        Q.lIIlIIlll[109] = -(0xFFFFBACD & 0x5777) & (0xFFFFBEFF & 0x5FFE);
        Q.lIIlIIlll[110] = 0xFFFFEEDF & 0x1D2D;
        Q.lIIlIIlll[111] = 0xFFFFEFFF & 0x1CBB;
        Q.lIIlIIlll[112] = 0xFFFFDEBE & 0x2D77;
        Q.lIIlIIlll[113] = 0xFFFFACAB & 0x5FFF;
        Q.lIIlIIlll[114] = 0xFFFFFE28 & 0xDFF;
        Q.lIIlIIlll[115] = -(0xFFFFDB9F & 0x7662) & (0xFFFFFFFF & 0x5EBF);
        Q.lIIlIIlll[116] = 0x6C ^ 0x22 ^ (0x9A ^ 0x97);
        Q.lIIlIIlll[117] = 96 + 138 - 67 + 42 ^ 68 + 93 - 92 + 80;
        Q.lIIlIIlll[118] = 0x78 ^ 0x3D;
        Q.lIIlIIlll[119] = 0xF1 ^ 0xAD ^ (0x7D ^ 0x67);
        Q.lIIlIIlll[120] = 0x74 ^ 0x71 ^ (0x17 ^ 0x55);
        Q.lIIlIIlll[121] = 0xDF ^ 0x97;
        Q.lIIlIIlll[122] = 0x39 ^ 0x70;
        Q.lIIlIIlll[123] = 0x5C ^ 6 ^ (0x87 ^ 0x97);
        Q.lIIlIIlll[124] = 0x8B ^ 0xC0;
        Q.lIIlIIlll[125] = 0 ^ 0x4C;
        Q.lIIlIIlll[126] = 0x8A ^ 0xC7;
        Q.lIIlIIlll[127] = 0x2F ^ 0x61;
        Q.lIIlIIlll[128] = 0x3B ^ 0x61 ^ (0x30 ^ 0x25);
        Q.lIIlIIlll[129] = 169 + 191 - 315 + 192 ^ 84 + 97 - 134 + 142;
    }

    private static boolean llllIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIlIII(int n2) {
        return n2 != 0;
    }

    private static void af() {
        block22: {
            d lIIIlIIIllIIlII;
            block21: {
                Object lIIIlIIIllIIlIl;
                block20: {
                    block19: {
                        int[] nArray = new int[lIIlIIlll[0]];
                        nArray[Q.lIIlIIlll[1]] = lIIlIIlll[28];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIlIIlll[28], lIIlIIlll[0], lIIlIIlll[92]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIIlIIlll[0]];
                        nArray2[Q.lIIlIIlll[1]] = lIIlIIlll[26];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIlIIIllIIlIl = new d(lIIlIIlll[26], lIIlIIlll[0], lIIlIIlll[93]);
                            bv.add((d)lIIIlIIIllIIlIl);
                            0;
                        }
                        int[] nArray3 = new int[lIIlIIlll[0]];
                        nArray3[Q.lIIlIIlll[1]] = lIIlIIlll[23];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIlIIIllIIlIl = new d(lIIlIIlll[23], lIIlIIlll[0], lIIlIIlll[93]);
                            bv.add((d)lIIIlIIIllIIlIl);
                            0;
                        }
                        int[] nArray4 = new int[lIIlIIlll[0]];
                        nArray4[Q.lIIlIIlll[1]] = lIIlIIlll[21];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIlIIIllIIlIl = new d(lIIlIIlll[21], lIIlIIlll[0], lIIlIIlll[93]);
                            bv.add((d)lIIIlIIIllIIlIl);
                            0;
                        }
                        int[] nArray5 = new int[lIIlIIlll[0]];
                        nArray5[Q.lIIlIIlll[1]] = lIIlIIlll[6];
                        if (!Q.llllIlIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIIlIIlll[0]];
                        nArray6[Q.lIIlIIlll[1]] = lIIlIIlll[6];
                        if (!Q.llllIlIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block20;
                        int[] nArray7 = new int[lIIlIIlll[0]];
                        nArray7[Q.lIIlIIlll[1]] = lIIlIIlll[6];
                        if (!Q.llllIlIlIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIlll[7])) break block20;
                    }
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[6], lIIlIIlll[7], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray = new int[lIIlIIlll[0]];
                nArray[Q.lIIlIIlll[1]] = lIIlIIlll[15];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[15], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray8 = new int[lIIlIIlll[0]];
                nArray8[Q.lIIlIIlll[1]] = lIIlIIlll[17];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[17], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray9 = new int[lIIlIIlll[0]];
                nArray9[Q.lIIlIIlll[1]] = lIIlIIlll[19];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[19], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray10 = new int[lIIlIIlll[0]];
                nArray10[Q.lIIlIIlll[1]] = lIIlIIlll[13];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[13], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray11 = new int[lIIlIIlll[0]];
                nArray11[Q.lIIlIIlll[1]] = lIIlIIlll[12];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[12], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray12 = new int[lIIlIIlll[0]];
                nArray12[Q.lIIlIIlll[1]] = lIIlIIlll[11];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[11], lIIlIIlll[7], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                int[] nArray13 = new int[lIIlIIlll[0]];
                nArray13[Q.lIIlIIlll[1]] = lIIlIIlll[10];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new d(lIIlIIlll[10], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((d)lIIIlIIIllIIlIl);
                    0;
                }
                if (Q.llllIlIlIlI(Bank.contains((Predicate)(lIIIlIIIllIIlIl = item -> item.getName().toLowerCase().contains(lIIlIIIll[lIIlIIlll[99]]))) ? 1 : 0)) {
                    lIIIlIIIllIIlII = new d(lIIlIIlll[94], lIIlIIlll[14], lIIlIIlll[95]);
                    bv.add(lIIIlIIIllIIlII);
                    0;
                }
                int[] nArray14 = new int[lIIlIIlll[0]];
                nArray14[Q.lIIlIIlll[1]] = lIIlIIlll[29];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    lIIIlIIIllIIlII = new d(lIIlIIlll[29], lIIlIIlll[5], i.bq);
                    bv.add(lIIIlIIIllIIlII);
                    0;
                }
                int[] nArray15 = new int[lIIlIIlll[0]];
                nArray15[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                if (!Q.llllIlIlIII(Bank.contains((int[])nArray15) ? 1 : 0)) break block21;
                int[] nArray16 = new int[lIIlIIlll[0]];
                nArray16[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                if (!Q.llllIlIlIII(Bank.contains((int[])nArray16) ? 1 : 0)) break block22;
                int[] nArray17 = new int[lIIlIIlll[0]];
                nArray17[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                if (!Q.llllIlIlIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIlIIlll[36])) break block22;
            }
            lIIIlIIIllIIlII = new d(lIIlIIlll[9], lIIlIIlll[67], lIIlIIlll[96]);
            bv.add(lIIIlIIIllIIlII);
            0;
        }
    }

    private static boolean llllIlIlIll(Object object) {
        return object != null;
    }

    private static boolean llllIlIllIl(int n2) {
        return n2 < 0;
    }

    @Override
    public String U() {
        return lIIlIIIll[lIIlIIlll[97]];
    }

    private static String llllIIllIIl(String lIIIlIIIlIllIII, String lIIIlIIIlIlIlll) {
        try {
            SecretKeySpec lIIIlIIIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIlIIlll[20]), "DES");
            Cipher lIIIlIIIlIlllII = Cipher.getInstance("DES");
            lIIIlIIIlIlllII.init(lIIlIIlll[4], lIIIlIIIlIlllIl);
            return new String(lIIIlIIIlIlllII.doFinal(Base64.getDecoder().decode(lIIIlIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIIlIllIll) {
            lIIIlIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static String llllIIllIll(String lIIIlIIIIllIlIl, String lIIIlIIIIllIlII) {
        try {
            SecretKeySpec lIIIlIIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIIIIllIlll = Cipher.getInstance("Blowfish");
            lIIIlIIIIllIlll.init(lIIlIIlll[4], lIIIlIIIIlllIII);
            return new String(lIIIlIIIIllIlll.doFinal(Base64.getDecoder().decode(lIIIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIIIllIllI) {
            lIIIlIIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIllII(int n2) {
        return n2 > 0;
    }

    public static void cS() {
        if (Q.llllIlIlIII(bt ? 1 : 0)) {
            b.a(bv);
            if (Q.llllIlIlIIl(bv.size(), lIIlIIlll[0])) {
                System.out.println(lIIlIIIll[lIIlIIlll[1]]);
                bt = lIIlIIlll[1];
            }
        }
        if (Q.llllIlIlIlI(bt ? 1 : 0)) {
            Object lIIIlIIIllIllIl;
            if (Q.llllIlIlIlI(Q.ab() ? 1 : 0) && Q.llllIlIlIIl(e.j(lIIlIIlll[2]), lIIlIIlll[0])) {
                lIIIlIIIllIllIl = BankLocation.getNearest();
                if (Q.llllIlIlIll(lIIIlIIIllIllIl) && Q.llllIlIlIlI(lIIIlIIIllIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[0]];
                    a.a((BankLocation)lIIIlIIIllIllIl);
                }
                if (Q.llllIlIlIll(lIIIlIIIllIllIl) && Q.llllIlIlIII(lIIIlIIIllIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (Q.llllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlll[3]);
                        0;
                    }
                    if (Q.llllIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[4]];
                        if (Q.llllIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIlll[5]);
                            0;
                        }
                        if (Q.llllIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIlll[4]);
                            0;
                        }
                        int[] nArray = new int[lIIlIIlll[0]];
                        nArray[Q.lIIlIIlll[1]] = lIIlIIlll[6];
                        if (Q.llllIlIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIlIIlll[0]];
                            nArray2[Q.lIIlIIlll[1]] = lIIlIIlll[6];
                            if (Q.llllIlIlIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIlIIlll[7])) {
                                Q.af();
                                System.out.println(lIIlIIIll[lIIlIIlll[7]]);
                                bt = lIIlIIlll[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIIlIIlll[8]];
                        nArray3[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                        nArray3[Q.lIIlIIlll[0]] = lIIlIIlll[10];
                        nArray3[Q.lIIlIIlll[4]] = lIIlIIlll[11];
                        nArray3[Q.lIIlIIlll[7]] = lIIlIIlll[12];
                        nArray3[Q.lIIlIIlll[5]] = lIIlIIlll[13];
                        nArray3[Q.lIIlIIlll[14]] = lIIlIIlll[15];
                        nArray3[Q.lIIlIIlll[16]] = lIIlIIlll[17];
                        nArray3[Q.lIIlIIlll[18]] = lIIlIIlll[19];
                        nArray3[Q.lIIlIIlll[20]] = lIIlIIlll[21];
                        nArray3[Q.lIIlIIlll[22]] = lIIlIIlll[23];
                        nArray3[Q.lIIlIIlll[24]] = lIIlIIlll[6];
                        nArray3[Q.lIIlIIlll[25]] = lIIlIIlll[26];
                        if (Q.llllIlIlIlI(e.b(nArray3) ? 1 : 0)) {
                            Q.af();
                            System.out.println(lIIlIIIll[lIIlIIlll[5]]);
                            bt = lIIlIIlll[0];
                            return;
                        }
                        int[] nArray4 = new int[lIIlIIlll[8]];
                        nArray4[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                        nArray4[Q.lIIlIIlll[0]] = lIIlIIlll[10];
                        nArray4[Q.lIIlIIlll[4]] = lIIlIIlll[11];
                        nArray4[Q.lIIlIIlll[7]] = lIIlIIlll[12];
                        nArray4[Q.lIIlIIlll[5]] = lIIlIIlll[13];
                        nArray4[Q.lIIlIIlll[14]] = lIIlIIlll[15];
                        nArray4[Q.lIIlIIlll[16]] = lIIlIIlll[17];
                        nArray4[Q.lIIlIIlll[18]] = lIIlIIlll[19];
                        nArray4[Q.lIIlIIlll[20]] = lIIlIIlll[21];
                        nArray4[Q.lIIlIIlll[22]] = lIIlIIlll[23];
                        nArray4[Q.lIIlIIlll[24]] = lIIlIIlll[6];
                        nArray4[Q.lIIlIIlll[25]] = lIIlIIlll[26];
                        if (Q.llllIlIlIII(e.b(nArray4) ? 1 : 0)) {
                            a.a(lIIlIIlll[10], lIIlIIlll[0]);
                            a.a(lIIlIIlll[12], lIIlIIlll[0]);
                            a.a(lIIlIIlll[13], lIIlIIlll[0]);
                            a.a(lIIlIIlll[15], lIIlIIlll[0]);
                            a.a(lIIlIIlll[17], lIIlIIlll[0]);
                            a.a(lIIlIIlll[21], lIIlIIlll[0]);
                            a.a(lIIlIIlll[19], lIIlIIlll[0]);
                            a.a(lIIlIIlll[23], lIIlIIlll[0]);
                            a.a(lIIlIIlll[26], lIIlIIlll[0]);
                            a.a(lIIlIIlll[27], lIIlIIlll[14]);
                            a.a(lIIlIIlll[9], lIIlIIlll[24]);
                            a.a(lIIlIIlll[28], lIIlIIlll[0]);
                            a.a(lIIlIIlll[6], lIIlIIlll[7]);
                            a.a(lIIlIIlll[11], lIIlIIlll[7]);
                            a.a(lIIlIIlll[29], lIIlIIlll[4]);
                            a.a(lIIlIIlll[30], lIIlIIlll[31]);
                        }
                    }
                }
            }
            if (Q.llllIlIlIII(Inventory.contains((int[])f.aV) ? 1 : 0) && Q.llllIlIlIIl(Movement.getRunEnergy(), lIIlIIlll[32])) {
                Inventory.getFirst((int[])f.aV).interact(lIIlIIIll[lIIlIIlll[14]]);
                Time.sleepTicks((int)lIIlIIlll[0]);
                0;
            }
            int[] nArray = new int[lIIlIIlll[0]];
            nArray[Q.lIIlIIlll[1]] = lIIlIIlll[27];
            if (Q.llllIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && Q.llllIlIllIl(Q.llllIlIIlll(e.u(), 50.0))) {
                int[] nArray5 = new int[lIIlIIlll[0]];
                nArray5[Q.lIIlIIlll[1]] = lIIlIIlll[27];
                Inventory.getFirst((int[])nArray5).interact(lIIlIIIll[lIIlIIlll[16]]);
                Time.sleepTicks((int)lIIlIIlll[0]);
                0;
            }
            if (Q.llllIlIlIII(Q.ab() ? 1 : 0) && Q.llllIlIlIlI(e.j(lIIlIIlll[2]))) {
                if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[18]];
                    Movement.walkTo((WorldPoint)bX);
                    0;
                    Time.sleepTicks((int)lIIlIIlll[0]);
                    0;
                }
                if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    g.a(lIIlIIIll[lIIlIIlll[20]], bR);
                }
            }
            if (Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[24])) {
                if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[22]];
                    Movement.walkTo((WorldPoint)jB);
                    0;
                    Time.sleepTicks((int)lIIlIIlll[0]);
                    0;
                }
                if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                    g.a(lIIlIIIll[lIIlIIlll[24]], bR);
                }
            }
            if (Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[33])) {
                WorldArea lIIIlIIIllIllII2;
                cl = lIIlIIlll[1];
                String[] stringArray = new String[lIIlIIlll[0]];
                stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[25]];
                if (Q.llllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jC), lIIlIIlll[4])) {
                        if (Q.llllIlIlIII(Inventory.contains(item -> item.getName().contains(lIIlIIIll[lIIlIIlll[103]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIIlIIIll[lIIlIIlll[102]])).interact(lIIlIIIll[lIIlIIlll[8]]);
                        }
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[34]];
                        Movement.walkTo((WorldPoint)jC);
                        0;
                        Time.sleepTicks((int)lIIlIIlll[0]);
                        0;
                    }
                    if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jC), lIIlIIlll[4])) {
                        g.a(lIIlIIIll[lIIlIIlll[35]], bR);
                    }
                }
                String[] stringArray2 = new String[lIIlIIlll[0]];
                stringArray2[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[36]];
                if (Q.llllIlIlIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIlIIlll[0]];
                    stringArray3[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[37]];
                    if (Q.llllIlIlIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIlIIlll[0]];
                        nArray6[Q.lIIlIIlll[1]] = lIIlIIlll[12];
                        if (Q.llllIlIlIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIIlIIlll[0]];
                            nArray7[Q.lIIlIIlll[1]] = lIIlIIlll[12];
                            String[] stringArray4 = new String[lIIlIIlll[0]];
                            stringArray4[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[38]];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((String[])stringArray4));
                            Time.sleepTicks((int)lIIlIIlll[4]);
                            0;
                        }
                        int[] nArray8 = new int[lIIlIIlll[0]];
                        nArray8[Q.lIIlIIlll[1]] = lIIlIIlll[12];
                        if (Q.llllIlIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIlIIlll[0]];
                            stringArray5[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[39]];
                            lIIIlIIIllIllIl = NPCs.getNearest((String[])stringArray5);
                            lIIIlIIIllIllII2 = new WorldArea(lIIlIIlll[40], lIIlIIlll[41], lIIlIIlll[14], lIIlIIlll[16], lIIlIIlll[1]);
                            if (!Q.llllIlIlIll(lIIIlIIIllIllIl) || Q.llllIlIlIll(lIIIlIIIllIllIl) && Q.llllIlIlIlI(Reachable.isInteractable((Locatable)lIIIlIIIllIllIl) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)jD);
                                0;
                                Time.sleepTicks((int)lIIlIIlll[0]);
                                0;
                            }
                            if (Q.llllIlIlIll(lIIIlIIIllIllIl)) {
                                g.a(lIIlIIIll[lIIlIIlll[42]], bR, lIIlIIlll[0]);
                            }
                        }
                    }
                }
                String[] stringArray6 = new String[lIIlIIlll[0]];
                stringArray6[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[33]];
                if (Q.llllIlIlIII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                    String[] stringArray7 = new String[lIIlIIlll[0]];
                    stringArray7[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[43]];
                    if (Q.llllIlIlIII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                        String[] stringArray8 = new String[lIIlIIlll[0]];
                        stringArray8[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[44]];
                        if (Q.llllIlIlIlI(Inventory.contains((String[])stringArray8) ? 1 : 0) && Q.llllIlIlIlI(jG ? 1 : 0)) {
                            if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jE), lIIlIIlll[18]) && Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[45])) {
                                AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[46]];
                                Movement.walkTo((WorldPoint)jE);
                                0;
                                Time.sleepTicks((int)lIIlIIlll[0]);
                                0;
                            }
                            if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jE), lIIlIIlll[18])) {
                                lIIIlIIIllIllIl = new WorldPoint(lIIlIIlll[47], lIIlIIlll[48], lIIlIIlll[1]);
                                lIIIlIIIllIllII2 = new WorldPoint(lIIlIIlll[47], lIIlIIlll[49], lIIlIIlll[1]);
                                if ((!Q.llllIlIlIlI(Players.getLocal().getWorldLocation().equals(lIIIlIIIllIllIl) ? 1 : 0) || Q.llllIlIlIII(Players.getLocal().getWorldLocation().equals((Object)lIIIlIIIllIllII2) ? 1 : 0)) && Q.llllIlIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIlll[50], lIIlIIlll[51], lIIlIIlll[1]));
                                    0;
                                    Time.sleepTicks((int)lIIlIIlll[7]);
                                    0;
                                }
                                g.a(lIIlIIIll[lIIlIIlll[52]], bR, lIIlIIlll[0]);
                            }
                        }
                    }
                }
                String[] stringArray9 = new String[lIIlIIlll[0]];
                stringArray9[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[45]];
                if (Q.llllIlIlIII(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                    String[] stringArray10 = new String[lIIlIIlll[0]];
                    stringArray10[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[53]];
                    if (Q.llllIlIlIII(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                        String[] stringArray11 = new String[lIIlIIlll[0]];
                        stringArray11[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[54]];
                        if (Q.llllIlIlIII(Inventory.contains((String[])stringArray11) ? 1 : 0) && Q.llllIlIlIlI(jG ? 1 : 0)) {
                            if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                                AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[55]];
                                Movement.walkTo((WorldPoint)jB);
                                0;
                                Time.sleepTicks((int)lIIlIIlll[0]);
                                0;
                            }
                            if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                                g.a(lIIlIIIll[lIIlIIlll[56]], bR);
                                lIIIlIIIllIllIl = Dialog.getOptions();
                                if (Q.llllIlIlIlI(lIIIlIIIllIllIl.isEmpty() ? 1 : 0)) {
                                    int lIIIlIIIllIllII2 = lIIlIIlll[1];
                                    while (Q.llllIlIlIIl(lIIIlIIIllIllII2, lIIIlIIIllIllIl.size())) {
                                        if (Q.llllIlIlIII(((Widget)lIIIlIIIllIllIl.get(lIIIlIIIllIllII2)).getText().contains(lIIlIIIll[lIIlIIlll[57]]) ? 1 : 0)) {
                                            System.out.println(lIIlIIIll[lIIlIIlll[58]]);
                                            jG = lIIlIIlll[0];
                                        }
                                        ++lIIIlIIIllIllII2;
                                        0;
                                        if (((0xE6 ^ 0x90 ^ (0x5B ^ 0x1B)) & (0xBD ^ 0x89 ^ 2 ^ -1)) <= 1) continue;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[20]) && Q.llllIlIlIlI(jG ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIlIIlll[0]];
                    stringArray12[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[59]];
                    if (Q.llllIlIlIII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        String[] stringArray13 = new String[lIIlIIlll[0]];
                        stringArray13[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[60]];
                        if (Q.llllIlIlIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            g.a(lIIlIIIll[lIIlIIlll[61]], bR);
                            lIIIlIIIllIllIl = Dialog.getOptions();
                            if (Q.llllIlIlIlI(lIIIlIIIllIllIl.isEmpty() ? 1 : 0)) {
                                int lIIIlIIIllIllII2 = lIIlIIlll[1];
                                while (Q.llllIlIlIIl(lIIIlIIIllIllII2, lIIIlIIIllIllIl.size())) {
                                    if (Q.llllIlIlIII(((Widget)lIIIlIIIllIllIl.get(lIIIlIIIllIllII2)).getText().contains(lIIlIIIll[lIIlIIlll[62]]) ? 1 : 0)) {
                                        System.out.println(lIIlIIIll[lIIlIIlll[63]]);
                                        jG = lIIlIIlll[0];
                                    }
                                    ++lIIIlIIIllIllII2;
                                    0;
                                    if (3 >= 3) continue;
                                    return;
                                }
                            }
                        }
                    }
                }
                if (Q.llllIlIlIII(jG ? 1 : 0)) {
                    String[] stringArray14 = new String[lIIlIIlll[0]];
                    stringArray14[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[64]];
                    if (Q.llllIlIlIII(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        String[] stringArray15 = new String[lIIlIIlll[0]];
                        stringArray15[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[65]];
                        if (Q.llllIlIlIII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                            if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jF), lIIlIIlll[16])) {
                                if (Q.llllIlIlIII(Inventory.contains(item -> item.getName().contains(lIIlIIIll[lIIlIIlll[101]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(lIIlIIIll[lIIlIIlll[100]])).interact(lIIlIIIll[lIIlIIlll[66]]);
                                }
                                if (Q.llllIlIlIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] stringArray16 = new String[lIIlIIlll[0]];
                                stringArray16[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[67]];
                                g.a(stringArray16);
                                AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[68]];
                                Movement.walkTo((WorldPoint)jF);
                                0;
                                Time.sleepTicks((int)lIIlIIlll[0]);
                                0;
                            }
                            if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jF), lIIlIIlll[16])) {
                                g.a(lIIlIIIll[lIIlIIlll[69]], bR);
                            }
                        }
                    }
                }
            }
            if (!Q.llllIllIIIl(e.j(lIIlIIlll[2]), lIIlIIlll[57]) || Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[58])) {
                String[] stringArray = new String[lIIlIIlll[0]];
                stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[70]];
                if (Q.llllIlIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIIlIIIllIllIl = new WorldArea(lIIlIIlll[71], lIIlIIlll[72], lIIlIIlll[24], lIIlIIlll[18], lIIlIIlll[1]);
                    g.a(bR);
                    if (Q.llllIlIlIlI(lIIIlIIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[73]];
                        Movement.walkTo((WorldPoint)jE);
                        0;
                        Time.sleepTicks((int)lIIlIIlll[0]);
                        0;
                    }
                    if (Q.llllIlIlIII(lIIIlIIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[74]];
                        g.a(lIIlIIIll[lIIlIIlll[75]], bR, lIIlIIlll[0]);
                    }
                }
            }
            if (Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[67])) {
                String[] stringArray = new String[lIIlIIlll[0]];
                stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[76]];
                if (Q.llllIlIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[77]];
                    String[] stringArray17 = new String[lIIlIIlll[0]];
                    stringArray17[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[78]];
                    String[] stringArray18 = new String[lIIlIIlll[0]];
                    stringArray18[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[32]];
                    Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                    Time.sleepTicks((int)lIIlIIlll[20]);
                    0;
                }
            }
            if (Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[32])) {
                lIIIlIIIllIllIl = new WorldArea(lIIlIIlll[71], lIIlIIlll[72], lIIlIIlll[14], lIIlIIlll[5], lIIlIIlll[1]);
                if (Q.llllIlIlIlI(lIIIlIIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[79]];
                    String[] stringArray = new String[lIIlIIlll[0]];
                    stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[80]];
                    String[] stringArray19 = new String[lIIlIIlll[0]];
                    stringArray19[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[81]];
                    Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray19));
                    Time.sleepTicks((int)lIIlIIlll[7]);
                    0;
                }
                if (Q.llllIlIlIII(lIIIlIIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lIIlIIIll[lIIlIIlll[82]], bR);
                }
            }
            if (Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[83])) {
                if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    WorldArea lIIIlIIIllIllII2;
                    lIIIlIIIllIllIl = new WorldArea(lIIlIIlll[71], lIIlIIlll[72], lIIlIIlll[14], lIIlIIlll[5], lIIlIIlll[1]);
                    if (Q.llllIlIlIII(lIIIlIIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Q.llllIlIlIlI(Equipment.contains((int[])f.aR) ? 1 : 0)) {
                        int[] nArray9 = new int[lIIlIIlll[0]];
                        nArray9[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                        if (Q.llllIlIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            int[] nArray10 = new int[lIIlIIlll[0]];
                            nArray10[Q.lIIlIIlll[1]] = lIIlIIlll[9];
                            Inventory.getFirst((int[])nArray10).interact(lIIlIIIll[lIIlIIlll[84]]);
                            Time.sleepTicks((int)e.c(lIIlIIlll[16], lIIlIIlll[20]));
                            0;
                        }
                    }
                    if (Q.llllIlIlIII((lIIIlIIIllIllII2 = new WorldArea(lIIlIIlll[51], lIIlIIlll[85], lIIlIIlll[52], lIIlIIlll[55], lIIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Q.llllIlIllll(Players.getLocal().getWorldLocation().getX(), lIIlIIlll[86])) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[87]];
                        String[] stringArray = new String[lIIlIIlll[0]];
                        stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[88]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIll[lIIlIIlll[89]]);
                        Time.sleepTicks((int)e.c(lIIlIIlll[5], lIIlIIlll[16]));
                        0;
                    }
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[90]];
                    Movement.walkTo((WorldPoint)bX);
                    0;
                    Time.sleepTicks((int)lIIlIIlll[0]);
                    0;
                }
                if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    if (Q.llllIlIlIIl(cl, lIIlIIlll[0])) {
                        an.pG += lIIlIIlll[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIlIIlll[0];
                        an.pG = lIIlIIlll[1];
                        cm = lIIlIIlll[1];
                    }
                    g.a(lIIlIIIll[lIIlIIlll[91]], bR);
                }
            }
            g.a(new String[lIIlIIlll[1]]);
        }
    }

    private static int llllIlIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        Q.llllIlIIllI();
        Q.llllIlIIlIl();
        jA = lIIlIIlll[2];
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIlIIlll[104], lIIlIIlll[105], lIIlIIlll[1]);
        jB = new WorldPoint(lIIlIIlll[106], lIIlIIlll[107], lIIlIIlll[1]);
        jC = new WorldPoint(lIIlIIlll[108], lIIlIIlll[109], lIIlIIlll[1]);
        jD = new WorldPoint(lIIlIIlll[110], lIIlIIlll[111], lIIlIIlll[1]);
        jE = new WorldPoint(lIIlIIlll[112], lIIlIIlll[113], lIIlIIlll[1]);
        jF = new WorldPoint(lIIlIIlll[114], lIIlIIlll[115], lIIlIIlll[1]);
        String[] stringArray = new String[lIIlIIlll[34]];
        stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[116]];
        stringArray[Q.lIIlIIlll[0]] = lIIlIIIll[lIIlIIlll[117]];
        stringArray[Q.lIIlIIlll[4]] = lIIlIIIll[lIIlIIlll[118]];
        stringArray[Q.lIIlIIlll[7]] = lIIlIIIll[lIIlIIlll[119]];
        stringArray[Q.lIIlIIlll[5]] = lIIlIIIll[lIIlIIlll[120]];
        stringArray[Q.lIIlIIlll[14]] = lIIlIIIll[lIIlIIlll[121]];
        stringArray[Q.lIIlIIlll[16]] = lIIlIIIll[lIIlIIlll[122]];
        stringArray[Q.lIIlIIlll[18]] = lIIlIIIll[lIIlIIlll[123]];
        stringArray[Q.lIIlIIlll[20]] = lIIlIIIll[lIIlIIlll[124]];
        stringArray[Q.lIIlIIlll[22]] = lIIlIIIll[lIIlIIlll[125]];
        stringArray[Q.lIIlIIlll[24]] = lIIlIIIll[lIIlIIlll[126]];
        stringArray[Q.lIIlIIlll[25]] = lIIlIIIll[lIIlIIlll[127]];
        stringArray[Q.lIIlIIlll[8]] = lIIlIIIll[lIIlIIlll[128]];
        bR = stringArray;
    }

    private static boolean llllIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }
}


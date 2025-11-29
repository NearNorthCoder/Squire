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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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

public class QHelper
implements W {
    static  boolean cm;
    static  WorldPoint bX;
    private static final  int jA;
    
    static  WorldPoint jF;
    public static  boolean bt;
    static  String[] bR;
    static  WorldPoint jE;
    
    static  int cl;
    static  WorldPoint jD;
    static  boolean jG;
    public static  List<d> bv;
    static  WorldPoint jB;
    static  WorldPoint jC;

        return String.valueOf(lIIIlIIIlIIlIII);
    }

    private static void llllIlIIlIl() {
        lIIlIIIll = new String[lIIlIIlll[129]];
        Q.lIIlIIIll[Q.lIIlIIlll[1]] = "Finished buying items, switching back to quest";
        Q.lIIlIIIll[Q.lIIlIIlll[0]] = "Nav to bank";
        Q.lIIlIIIll[Q.lIIlIIlll[4]] = "Handling banking";
        Q.lIIlIIIll[Q.lIIlIIlll[7]] = "We are missing quest supplies, switching to BUYING";
        Q.lIIlIIIll[Q.lIIlIIlll[5]] = "We are missing quest supplies, switching to BUYING";
        Q.lIIlIIIll[Q.lIIlIIlll[14]] = "Drink";
        Q.lIIlIIIll[Q.lIIlIIlll[16]] = "Eat";
        Q.lIIlIIIll[Q.lIIlIIlll[18]] = "Nav to start";
        Q.lIIlIIIll[Q.lIIlIIlll[20]] = "Chancellor Hassan";
        Q.lIIlIIIll[Q.lIIlIIlll[22]] = "Nav to osman";
        Q.lIIlIIIll[Q.lIIlIIlll[24]] = "Osman";
        Q.lIIlIIIll[Q.lIIlIIlll[25]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[8]] = "Wear";
        Q.lIIlIIIll[Q.lIIlIIlll[34]] = "Nav to ned";
        Q.lIIlIIIll[Q.lIIlIIlll[35]] = "Ned";
        Q.lIIlIIIll[Q.lIIlIIlll[36]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[37]] = "Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[38]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[39]] = "Aggie";
        Q.lIIlIIIll[Q.lIIlIIlll[42]] = "Aggie";
        Q.lIIlIIIll[Q.lIIlIIlll[33]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[43]] = "Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[44]] = "Key print";
        Q.lIIlIIIll[Q.lIIlIIlll[46]] = "Nav to keli";
        Q.lIIlIIIll[Q.lIIlIIlll[52]] = "Lady Keli";
        Q.lIIlIIIll[Q.lIIlIIlll[45]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[53]] = "Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[54]] = "Key print";
        Q.lIIlIIIll[Q.lIIlIIlll[55]] = "Nav to osman";
        Q.lIIlIIIll[Q.lIIlIIlll[56]] = "Osman";
        Q.lIIlIIIll[Q.lIIlIIlll[57]] = "Draynor is";
        Q.lIIlIIIll[Q.lIIlIIlll[58]] = "go to leela";
        Q.lIIlIIIll[Q.lIIlIIlll[59]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[60]] = "Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[61]] = "7C";
        Q.lIIlIIIll[Q.lIIlIIlll[62]] = "Draynor is";
        Q.lIIlIIIll[Q.lIIlIIlll[63]] = "go to leela";
        Q.lIIlIIIll[Q.lIIlIIlll[64]] = "Wig";
        Q.lIIlIIIll[Q.lIIlIIlll[65]] = "Paste";
        Q.lIIlIIIll[Q.lIIlIIlll[66]] = "Wear";
        Q.lIIlIIIll[Q.lIIlIIlll[67]] = "I'll get going.";
        Q.lIIlIIIll[Q.lIIlIIlll[68]] = "Nav to leela";
        Q.lIIlIIIll[Q.lIIlIIlll[69]] = "Leela";
        Q.lIIlIIIll[Q.lIIlIIlll[70]] = "Bronze key";
        Q.lIIlIIIll[Q.lIIlIIlll[73]] = "Nav to jail";
        Q.lIIlIIIll[Q.lIIlIIlll[74]] = "Give beer";
        Q.lIIlIIIll[Q.lIIlIIlll[75]] = "Joe";
        Q.lIIlIIIll[Q.lIIlIIlll[76]] = "Rope";
        Q.lIIlIIIll[Q.lIIlIIlll[77]] = "Tying up";
        Q.lIIlIIIll[Q.lIIlIIlll[78]] = "Rope";
        Q.lIIlIIIll[Q.lIIlIIlll[32]] = "Lady Keli";
        Q.lIIlIIIll[Q.lIIlIIlll[79]] = "Entering jail";
        Q.lIIlIIIll[Q.lIIlIIlll[80]] = "Bronze key";
        Q.lIIlIIIll[Q.lIIlIIlll[81]] = "Prison Gate";
        Q.lIIlIIIll[Q.lIIlIIlll[82]] = "Prince Ali";
        Q.lIIlIIIll[Q.lIIlIIlll[84]] = "Break";
        Q.lIIlIIIll[Q.lIIlIIlll[87]] = "Open gate";
        Q.lIIlIIIll[Q.lIIlIIlll[88]] = "Gate";
        Q.lIIlIIIll[Q.lIIlIIlll[89]] = "Open";
        Q.lIIlIIIll[Q.lIIlIIlll[90]] = "Nav to start";
        Q.lIIlIIIll[Q.lIIlIIlll[91]] = "Chancellor Hassan";
        Q.lIIlIIIll[Q.lIIlIIlll[97]] = "Prince Ali Rescue";
        Q.lIIlIIIll[Q.lIIlIIlll[99]] = "ring of wealth (";
        Q.lIIlIIIll[Q.lIIlIIlll[100]] = "glory";
        Q.lIIlIIIll[Q.lIIlIIlll[101]] = "glory";
        Q.lIIlIIIll[Q.lIIlIIlll[102]] = "glory";
        Q.lIIlIIIll[Q.lIIlIIlll[103]] = "glory";
        Q.lIIlIIIll[Q.lIIlIIlll[116]] = "Yes.";
        Q.lIIlIIIll[Q.lIIlIIlll[117]] = "Is there anything I can help you with?";
        Q.lIIlIIIll[Q.lIIlIIlll[118]] = "Could you make other things apart from rope?";
        Q.lIIlIIIll[Q.lIIlIIlll[119]] = "How about some sort of wig?";
        Q.lIIlIIIll[Q.lIIlIIlll[120]] = "I have them here. Please make me a wig.";
        Q.lIIlIIIll[Q.lIIlIIlll[121]] = "Can you make skin paste?";
        Q.lIIlIIIll[Q.lIIlIIlll[122]] = "Yes please. Mix me some skin paste.";
        Q.lIIlIIIll[Q.lIIlIIlll[123]] = "Heard of you? You're famous in Gielinor!";
        Q.lIIlIIIll[Q.lIIlIIlll[124]] = "What's your latest plan then?";
        Q.lIIlIIIll[Q.lIIlIIlll[125]] = "How do you know someone won't try to free him?";
        Q.lIIlIIIll[Q.lIIlIIlll[126]] = "Could I see the key please?";
        Q.lIIlIIIll[Q.lIIlIIlll[127]] = "Could I touch the key for a moment please?";
        Q.lIIlIIIll[Q.lIIlIIlll[128]] = "I have some beer here. Fancy one?";
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

            if (-1 <= 0) continue;
            return ((0x3D ^ 0x5A ^ (0x71 ^ 0x1E)) & (0xC1 ^ 0xB0 ^ (0x10 ^ 0x69) ^ -1)) != 0;
        }
        return lIIlIIlll[0];
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
                            d d2 = new DHelper(lIIlIIlll[28], lIIlIIlll[0], lIIlIIlll[92]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIlIIlll[0]];
                        nArray2[Q.lIIlIIlll[1]] = lIIlIIlll[26];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[26], lIIlIIlll[0], lIIlIIlll[93]);
                            bv.add((DHelper) IIIlIIIllIIlIl);

                        }
                        int[] nArray3 = new int[lIIlIIlll[0]];
                        nArray3[Q.lIIlIIlll[1]] = lIIlIIlll[23];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[23], lIIlIIlll[0], lIIlIIlll[93]);
                            bv.add((DHelper) IIIlIIIllIIlIl);

                        }
                        int[] nArray4 = new int[lIIlIIlll[0]];
                        nArray4[Q.lIIlIIlll[1]] = lIIlIIlll[21];
                        if (Q.llllIlIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[21], lIIlIIlll[0], lIIlIIlll[93]);
                            bv.add((DHelper) IIIlIIIllIIlIl);

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
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[6], lIIlIIlll[7], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray = new int[lIIlIIlll[0]];
                nArray[Q.lIIlIIlll[1]] = lIIlIIlll[15];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[15], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray8 = new int[lIIlIIlll[0]];
                nArray8[Q.lIIlIIlll[1]] = lIIlIIlll[17];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[17], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray9 = new int[lIIlIIlll[0]];
                nArray9[Q.lIIlIIlll[1]] = lIIlIIlll[19];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[19], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray10 = new int[lIIlIIlll[0]];
                nArray10[Q.lIIlIIlll[1]] = lIIlIIlll[13];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[13], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray11 = new int[lIIlIIlll[0]];
                nArray11[Q.lIIlIIlll[1]] = lIIlIIlll[12];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[12], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray12 = new int[lIIlIIlll[0]];
                nArray12[Q.lIIlIIlll[1]] = lIIlIIlll[11];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[11], lIIlIIlll[7], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                int[] nArray13 = new int[lIIlIIlll[0]];
                nArray13[Q.lIIlIIlll[1]] = lIIlIIlll[10];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lIIIlIIIllIIlIl = new DHelper(lIIlIIlll[10], lIIlIIlll[0], lIIlIIlll[93]);
                    bv.add((DHelper) IIIlIIIllIIlIl);

                }
                if (Q.llllIlIlIlI(Bank.contains((Predicate)(lIIIlIIIllIIlIl = item -> item.getName().toLowerCase().contains(lIIlIIIll[lIIlIIlll[99]]))) ? 1 : 0)) {
                    lIIIlIIIllIIlII = new DHelper(lIIlIIlll[94], lIIlIIlll[14], lIIlIIlll[95]);
                    bv.add(lIIIlIIIllIIlII);

                }
                int[] nArray14 = new int[lIIlIIlll[0]];
                nArray14[Q.lIIlIIlll[1]] = lIIlIIlll[29];
                if (Q.llllIlIlIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    lIIIlIIIllIIlII = new DHelper(lIIlIIlll[29], lIIlIIlll[5], i.bq);
                    bv.add(lIIIlIIIllIIlII);

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
            lIIIlIIIllIIlII = new DHelper(lIIlIIlll[9], lIIlIIlll[67], lIIlIIlll[96]);
            bv.add(lIIIlIIIllIIlII);

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

                    }
                    if (Q.llllIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[4]];
                        if (Q.llllIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIlll[5]);

                        }
                        if (Q.llllIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIlll[4]);

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

            }
            int[] nArray = new int[lIIlIIlll[0]];
            nArray[Q.lIIlIIlll[1]] = lIIlIIlll[27];
            if (Q.llllIlIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && Q.llllIlIllIl(Q.llllIlIIlll(e.u(), 50.0))) {
                int[] nArray5 = new int[lIIlIIlll[0]];
                nArray5[Q.lIIlIIlll[1]] = lIIlIIlll[27];
                Inventory.getFirst((int[])nArray5).interact(lIIlIIIll[lIIlIIlll[16]]);
                Time.sleepTicks((int)lIIlIIlll[0]);

            }
            if (Q.llllIlIlIII(Q.ab() ? 1 : 0) && Q.llllIlIlIlI(e.j(lIIlIIlll[2]))) {
                if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[18]];
                    Movement.walkTo((WorldPoint)bX);

                    Time.sleepTicks((int)lIIlIIlll[0]);

                }
                if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    g.a(lIIlIIIll[lIIlIIlll[20]], bR);
                }
            }
            if (Q.llllIllIIII(e.j(lIIlIIlll[2]), lIIlIIlll[24])) {
                if (Q.llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[22]];
                    Movement.walkTo((WorldPoint)jB);

                    Time.sleepTicks((int)lIIlIIlll[0]);

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

                        Time.sleepTicks((int)lIIlIIlll[0]);

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

                                Time.sleepTicks((int)lIIlIIlll[0]);

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

                                Time.sleepTicks((int)lIIlIIlll[0]);

                            }
                            if (Q.llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jE), lIIlIIlll[18])) {
                                lIIIlIIIllIllIl = new WorldPoint(lIIlIIlll[47], lIIlIIlll[48], lIIlIIlll[1]);
                                lIIIlIIIllIllII2 = new WorldPoint(lIIlIIlll[47], lIIlIIlll[49], lIIlIIlll[1]);
                                if ((!Q.llllIlIlIlI(Players.getLocal().getWorldLocation().equals(lIIIlIIIllIllIl) ? 1 : 0) || Q.llllIlIlIII(Players.getLocal().getWorldLocation().equals((Object)lIIIlIIIllIllII2) ? 1 : 0)) && Q.llllIlIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIlll[50], lIIlIIlll[51], lIIlIIlll[1]));

                                    Time.sleepTicks((int)lIIlIIlll[7]);

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

                                Time.sleepTicks((int)lIIlIIlll[0]);

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

                                Time.sleepTicks((int)lIIlIIlll[0]);

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

                        Time.sleepTicks((int)lIIlIIlll[0]);

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

                        }
                    }
                    if (Q.llllIlIlIII((lIIIlIIIllIllII2 = new WorldArea(lIIlIIlll[51], lIIlIIlll[85], lIIlIIlll[52], lIIlIIlll[55], lIIlIIlll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Q.llllIlIllll(Players.getLocal().getWorldLocation().getX(), lIIlIIlll[86])) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[87]];
                        String[] stringArray = new String[lIIlIIlll[0]];
                        stringArray[Q.lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[88]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIll[lIIlIIlll[89]]);
                        Time.sleepTicks((int)e.c(lIIlIIlll[5], lIIlIIlll[16]));

                    }
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[90]];
                    Movement.walkTo((WorldPoint)bX);

                    Time.sleepTicks((int)lIIlIIlll[0]);

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


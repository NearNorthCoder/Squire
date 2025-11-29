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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class H
implements K {
    static /* synthetic */ WorldPoint jb;
    static /* synthetic */ WorldPoint jd;
    static /* synthetic */ WorldPoint jc;
    private static /* synthetic */ String[] lIlllIIIIl;
    private static final /* synthetic */ int iY;
    static /* synthetic */ WorldPoint cV;
    static /* synthetic */ WorldPoint iZ;
    static /* synthetic */ boolean je;
    static /* synthetic */ WorldPoint ja;
    private static /* synthetic */ int[] lIlllIIIll;
    public static /* synthetic */ List<d> bp;
    static /* synthetic */ int dc;
    static /* synthetic */ boolean dd;
    static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean bn;

    @Override
    public String ae() {
        return lIlllIIIIl[lIlllIIIll[97]];
    }

    @Override
    public int ad() {
        try {
            H.cH();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (81 + 176 - 167 + 97 ^ 51 + 17 - 31 + 103) & (0x54 ^ 0x5D ^ (0x41 ^ 0x7F) ^ -1);
        }
        return lIlllIIIll[83];
    }

    private static void lIIlllIIIIIll() {
        lIlllIIIIl = new String[lIlllIIIll[129]];
        H.lIlllIIIIl[H.lIlllIIIll[1]] = H."Finished buying items, switching back to quest";
        H.lIlllIIIIl[H.lIlllIIIll[0]] = H."Nav to bank";
        H.lIlllIIIIl[H.lIlllIIIll[4]] = H."Handling banking";
        H.lIlllIIIIl[H.lIlllIIIll[7]] = H."We are missing quest supplies, switching to BUYING";
        H.lIlllIIIIl[H.lIlllIIIll[5]] = H."We are missing quest supplies, switching to BUYING";
        H.lIlllIIIIl[H.lIlllIIIll[14]] = H."Drink";
        H.lIlllIIIIl[H.lIlllIIIll[16]] = H."Eat";
        H.lIlllIIIIl[H.lIlllIIIll[18]] = H."Nav to start";
        H.lIlllIIIIl[H.lIlllIIIll[20]] = H."Chancellor Hassan";
        H.lIlllIIIIl[H.lIlllIIIll[22]] = H."Nav to osman";
        H.lIlllIIIIl[H.lIlllIIIll[24]] = H."Osman";
        H.lIlllIIIIl[H.lIlllIIIll[25]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[8]] = H."Wear";
        H.lIlllIIIIl[H.lIlllIIIll[34]] = H."Nav to ned";
        H.lIlllIIIIl[H.lIlllIIIll[35]] = H."Ned";
        H.lIlllIIIIl[H.lIlllIIIll[36]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[37]] = H."Paste";
        H.lIlllIIIIl[H.lIlllIIIll[38]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[39]] = H."Aggie";
        H.lIlllIIIIl[H.lIlllIIIll[42]] = H."Aggie";
        H.lIlllIIIIl[H.lIlllIIIll[33]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[43]] = H."Paste";
        H.lIlllIIIIl[H.lIlllIIIll[44]] = H."Key print";
        H.lIlllIIIIl[H.lIlllIIIll[46]] = H."Nav to keli";
        H.lIlllIIIIl[H.lIlllIIIll[52]] = H."Lady Keli";
        H.lIlllIIIIl[H.lIlllIIIll[45]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[53]] = H."Paste";
        H.lIlllIIIIl[H.lIlllIIIll[54]] = H."Key print";
        H.lIlllIIIIl[H.lIlllIIIll[55]] = H."Nav to osman";
        H.lIlllIIIIl[H.lIlllIIIll[56]] = H."Osman";
        H.lIlllIIIIl[H.lIlllIIIll[57]] = H."Draynor is";
        H.lIlllIIIIl[H.lIlllIIIll[58]] = H."go to leela";
        H.lIlllIIIIl[H.lIlllIIIll[59]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[60]] = H."Paste";
        H.lIlllIIIIl[H.lIlllIIIll[61]] = H."Osman";
        H.lIlllIIIIl[H.lIlllIIIll[62]] = H."Draynor is";
        H.lIlllIIIIl[H.lIlllIIIll[63]] = H."go to leela";
        H.lIlllIIIIl[H.lIlllIIIll[64]] = H."Wig";
        H.lIlllIIIIl[H.lIlllIIIll[65]] = H."Paste";
        H.lIlllIIIIl[H.lIlllIIIll[66]] = H."Wear";
        H.lIlllIIIIl[H.lIlllIIIll[67]] = H."I'll get going.";
        H.lIlllIIIIl[H.lIlllIIIll[68]] = H."Nav to leela";
        H.lIlllIIIIl[H.lIlllIIIll[69]] = H."Leela";
        H.lIlllIIIIl[H.lIlllIIIll[70]] = H."Bronze key";
        H.lIlllIIIIl[H.lIlllIIIll[73]] = H."Nav to jail";
        H.lIlllIIIIl[H.lIlllIIIll[74]] = H."Give beer";
        H.lIlllIIIIl[H.lIlllIIIll[75]] = H."Joe";
        H.lIlllIIIIl[H.lIlllIIIll[76]] = H."Rope";
        H.lIlllIIIIl[H.lIlllIIIll[77]] = H."Tying up";
        H.lIlllIIIIl[H.lIlllIIIll[78]] = H."Rope";
        H.lIlllIIIIl[H.lIlllIIIll[32]] = H."Lady Keli";
        H.lIlllIIIIl[H.lIlllIIIll[79]] = H."Entering jail";
        H.lIlllIIIIl[H.lIlllIIIll[80]] = H."Bronze key";
        H.lIlllIIIIl[H.lIlllIIIll[81]] = H."Prison Gate";
        H.lIlllIIIIl[H.lIlllIIIll[82]] = H."Prince Ali";
        H.lIlllIIIIl[H.lIlllIIIll[84]] = H."Break";
        H.lIlllIIIIl[H.lIlllIIIll[87]] = H."Open gate";
        H.lIlllIIIIl[H.lIlllIIIll[88]] = H."Gate";
        H.lIlllIIIIl[H.lIlllIIIll[89]] = H."Open";
        H.lIlllIIIIl[H.lIlllIIIll[90]] = H."Nav to start";
        H.lIlllIIIIl[H.lIlllIIIll[91]] = H."Chancellor Hassan";
        H.lIlllIIIIl[H.lIlllIIIll[97]] = H."Prince Ali Rescue";
        H.lIlllIIIIl[H.lIlllIIIll[99]] = H."ring of wealth (";
        H.lIlllIIIIl[H.lIlllIIIll[100]] = H."glory";
        H.lIlllIIIIl[H.lIlllIIIll[101]] = H."glory";
        H.lIlllIIIIl[H.lIlllIIIll[102]] = H."glory";
        H.lIlllIIIIl[H.lIlllIIIll[103]] = H."glory";
        H.lIlllIIIIl[H.lIlllIIIll[116]] = H."Yes.";
        H.lIlllIIIIl[H.lIlllIIIll[117]] = H."Is there anything I can help you with?";
        H.lIlllIIIIl[H.lIlllIIIll[118]] = H."Could you make other things apart from rope?";
        H.lIlllIIIIl[H.lIlllIIIll[119]] = H."How about some sort of wig?";
        H.lIlllIIIIl[H.lIlllIIIll[120]] = H."I have them here. Please make me a wig.";
        H.lIlllIIIIl[H.lIlllIIIll[121]] = H."Can you make skin paste?";
        H.lIlllIIIIl[H.lIlllIIIll[122]] = H."Yes please. Mix me some skin paste.";
        H.lIlllIIIIl[H.lIlllIIIll[123]] = H."Heard of you? You're famous in Gielinor!";
        H.lIlllIIIIl[H.lIlllIIIll[124]] = H."What's your latest plan then?";
        H.lIlllIIIIl[H.lIlllIIIll[125]] = H."How do you know someone won't try to free him?";
        H.lIlllIIIIl[H.lIlllIIIll[126]] = H."Could I see the key please?";
        H.lIlllIIIIl[H.lIlllIIIll[127]] = H."Could I touch the key for a moment please?";
        H.lIlllIIIIl[H.lIlllIIIll[128]] = H."I have some beer here. Fancy one?";
    }

    public static void cH() {
        if (H.lIIlllIIIIllI(bn ? 1 : 0)) {
            b.a(bp);
            if (H.lIIlllIIIIlll(bp.size(), lIlllIIIll[0])) {
                System.out.println(lIlllIIIIl[lIlllIIIll[1]]);
                bn = lIlllIIIll[1];
            }
        }
        if (H.lIIlllIIIlIII(bn ? 1 : 0)) {
            Object lllllllllllllllllllIIIIIIIIIllII;
            if (H.lIIlllIIIlIII(H.al() ? 1 : 0) && H.lIIlllIIIIlll(e.j(lIlllIIIll[2]), lIlllIIIll[0])) {
                lllllllllllllllllllIIIIIIIIIllII = BankLocation.getNearest();
                if (H.lIIlllIIIlIIl(lllllllllllllllllllIIIIIIIIIllII) && H.lIIlllIIIlIII(lllllllllllllllllllIIIIIIIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[0]];
                    a.a((BankLocation)lllllllllllllllllllIIIIIIIIIllII);
                }
                if (H.lIIlllIIIlIIl(lllllllllllllllllllIIIIIIIIIllII) && H.lIIlllIIIIllI(lllllllllllllllllllIIIIIIIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.lIIlllIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIIll[3]);
                        0;
                    }
                    if (H.lIIlllIIIIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[4]];
                        if (H.lIIlllIIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIIIll[5]);
                            0;
                        }
                        if (H.lIIlllIIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIIIll[4]);
                            0;
                        }
                        int[] nArray = new int[lIlllIIIll[0]];
                        nArray[H.lIlllIIIll[1]] = lIlllIIIll[6];
                        if (H.lIIlllIIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIlllIIIll[0]];
                            nArray2[H.lIlllIIIll[1]] = lIlllIIIll[6];
                            if (H.lIIlllIIIIlll(Bank.getFirst((int[])nArray2).getQuantity(), lIlllIIIll[7])) {
                                H.O();
                                System.out.println(lIlllIIIIl[lIlllIIIll[7]]);
                                bn = lIlllIIIll[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIlllIIIll[8]];
                        nArray3[H.lIlllIIIll[1]] = lIlllIIIll[9];
                        nArray3[H.lIlllIIIll[0]] = lIlllIIIll[10];
                        nArray3[H.lIlllIIIll[4]] = lIlllIIIll[11];
                        nArray3[H.lIlllIIIll[7]] = lIlllIIIll[12];
                        nArray3[H.lIlllIIIll[5]] = lIlllIIIll[13];
                        nArray3[H.lIlllIIIll[14]] = lIlllIIIll[15];
                        nArray3[H.lIlllIIIll[16]] = lIlllIIIll[17];
                        nArray3[H.lIlllIIIll[18]] = lIlllIIIll[19];
                        nArray3[H.lIlllIIIll[20]] = lIlllIIIll[21];
                        nArray3[H.lIlllIIIll[22]] = lIlllIIIll[23];
                        nArray3[H.lIlllIIIll[24]] = lIlllIIIll[6];
                        nArray3[H.lIlllIIIll[25]] = lIlllIIIll[26];
                        if (H.lIIlllIIIlIII(e.b(nArray3) ? 1 : 0)) {
                            H.O();
                            System.out.println(lIlllIIIIl[lIlllIIIll[5]]);
                            bn = lIlllIIIll[0];
                            return;
                        }
                        int[] nArray4 = new int[lIlllIIIll[8]];
                        nArray4[H.lIlllIIIll[1]] = lIlllIIIll[9];
                        nArray4[H.lIlllIIIll[0]] = lIlllIIIll[10];
                        nArray4[H.lIlllIIIll[4]] = lIlllIIIll[11];
                        nArray4[H.lIlllIIIll[7]] = lIlllIIIll[12];
                        nArray4[H.lIlllIIIll[5]] = lIlllIIIll[13];
                        nArray4[H.lIlllIIIll[14]] = lIlllIIIll[15];
                        nArray4[H.lIlllIIIll[16]] = lIlllIIIll[17];
                        nArray4[H.lIlllIIIll[18]] = lIlllIIIll[19];
                        nArray4[H.lIlllIIIll[20]] = lIlllIIIll[21];
                        nArray4[H.lIlllIIIll[22]] = lIlllIIIll[23];
                        nArray4[H.lIlllIIIll[24]] = lIlllIIIll[6];
                        nArray4[H.lIlllIIIll[25]] = lIlllIIIll[26];
                        if (H.lIIlllIIIIllI(e.b(nArray4) ? 1 : 0)) {
                            a.a(lIlllIIIll[10], lIlllIIIll[0]);
                            a.a(lIlllIIIll[12], lIlllIIIll[0]);
                            a.a(lIlllIIIll[13], lIlllIIIll[0]);
                            a.a(lIlllIIIll[15], lIlllIIIll[0]);
                            a.a(lIlllIIIll[17], lIlllIIIll[0]);
                            a.a(lIlllIIIll[21], lIlllIIIll[0]);
                            a.a(lIlllIIIll[19], lIlllIIIll[0]);
                            a.a(lIlllIIIll[23], lIlllIIIll[0]);
                            a.a(lIlllIIIll[26], lIlllIIIll[0]);
                            a.a(lIlllIIIll[27], lIlllIIIll[14]);
                            a.a(lIlllIIIll[9], lIlllIIIll[24]);
                            a.a(lIlllIIIll[28], lIlllIIIll[0]);
                            a.a(lIlllIIIll[6], lIlllIIIll[7]);
                            a.a(lIlllIIIll[11], lIlllIIIll[7]);
                            a.a(lIlllIIIll[29], lIlllIIIll[4]);
                            a.a(lIlllIIIll[30], lIlllIIIll[31]);
                        }
                    }
                }
            }
            if (H.lIIlllIIIIllI(Inventory.contains((int[])f.aU) ? 1 : 0) && H.lIIlllIIIIlll(Movement.getRunEnergy(), lIlllIIIll[32])) {
                Inventory.getFirst((int[])f.aU).interact(lIlllIIIIl[lIlllIIIll[14]]);
                Time.sleepTicks((int)lIlllIIIll[0]);
                0;
            }
            int[] nArray = new int[lIlllIIIll[0]];
            nArray[H.lIlllIIIll[1]] = lIlllIIIll[27];
            if (H.lIIlllIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0) && H.lIIlllIIIlIll(H.lIIlllIIIIlIl(e.u(), 50.0))) {
                int[] nArray5 = new int[lIlllIIIll[0]];
                nArray5[H.lIlllIIIll[1]] = lIlllIIIll[27];
                Inventory.getFirst((int[])nArray5).interact(lIlllIIIIl[lIlllIIIll[16]]);
                Time.sleepTicks((int)lIlllIIIll[0]);
                0;
            }
            if (H.lIIlllIIIIllI(H.al() ? 1 : 0) && H.lIIlllIIIlIII(e.j(lIlllIIIll[2]))) {
                if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[18]];
                    Movement.walkTo((WorldPoint)cV);
                    0;
                    Time.sleepTicks((int)lIlllIIIll[0]);
                    0;
                }
                if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    g.a(lIlllIIIIl[lIlllIIIll[20]], cy);
                }
            }
            if (H.lIIlllIIIlllI(e.j(lIlllIIIll[2]), lIlllIIIll[24])) {
                if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[22]];
                    Movement.walkTo((WorldPoint)iZ);
                    0;
                    Time.sleepTicks((int)lIlllIIIll[0]);
                    0;
                }
                if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                    g.a(lIlllIIIIl[lIlllIIIll[24]], cy);
                }
            }
            if (H.lIIlllIIIlllI(e.j(lIlllIIIll[2]), lIlllIIIll[33])) {
                WorldArea lllllllllllllllllllIIIIIIIIIlIll2;
                dc = lIlllIIIll[1];
                String[] stringArray = new String[lIlllIIIll[0]];
                stringArray[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[25]];
                if (H.lIIlllIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(ja), lIlllIIIll[4])) {
                        if (H.lIIlllIIIIllI(Inventory.contains(item -> item.getName().contains(lIlllIIIIl[lIlllIIIll[103]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(lIlllIIIIl[lIlllIIIll[102]])).interact(lIlllIIIIl[lIlllIIIll[8]]);
                        }
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[34]];
                        Movement.walkTo((WorldPoint)ja);
                        0;
                        Time.sleepTicks((int)lIlllIIIll[0]);
                        0;
                    }
                    if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(ja), lIlllIIIll[4])) {
                        g.a(lIlllIIIIl[lIlllIIIll[35]], cy);
                    }
                }
                String[] stringArray2 = new String[lIlllIIIll[0]];
                stringArray2[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[36]];
                if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIlllIIIll[0]];
                    stringArray3[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[37]];
                    if (H.lIIlllIIIlIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        int[] nArray6 = new int[lIlllIIIll[0]];
                        nArray6[H.lIlllIIIll[1]] = lIlllIIIll[12];
                        if (H.lIIlllIIIIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIlllIIIll[0]];
                            nArray7[H.lIlllIIIll[1]] = lIlllIIIll[12];
                            String[] stringArray4 = new String[lIlllIIIll[0]];
                            stringArray4[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[38]];
                            Inventory.getFirst((int[])nArray7).useOn(Inventory.getFirst((String[])stringArray4));
                            Time.sleepTicks((int)lIlllIIIll[4]);
                            0;
                        }
                        int[] nArray8 = new int[lIlllIIIll[0]];
                        nArray8[H.lIlllIIIll[1]] = lIlllIIIll[12];
                        if (H.lIIlllIIIlIII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            String[] stringArray5 = new String[lIlllIIIll[0]];
                            stringArray5[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[39]];
                            lllllllllllllllllllIIIIIIIIIllII = NPCs.getNearest((String[])stringArray5);
                            lllllllllllllllllllIIIIIIIIIlIll2 = new WorldArea(lIlllIIIll[40], lIlllIIIll[41], lIlllIIIll[14], lIlllIIIll[16], lIlllIIIll[1]);
                            if (!H.lIIlllIIIlIIl(lllllllllllllllllllIIIIIIIIIllII) || H.lIIlllIIIlIIl(lllllllllllllllllllIIIIIIIIIllII) && H.lIIlllIIIlIII(Reachable.isInteractable((Locatable)lllllllllllllllllllIIIIIIIIIllII) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)jb);
                                0;
                                Time.sleepTicks((int)lIlllIIIll[0]);
                                0;
                            }
                            if (H.lIIlllIIIlIIl(lllllllllllllllllllIIIIIIIIIllII)) {
                                g.a(lIlllIIIIl[lIlllIIIll[42]], cy, lIlllIIIll[0]);
                            }
                        }
                    }
                }
                String[] stringArray6 = new String[lIlllIIIll[0]];
                stringArray6[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[33]];
                if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                    String[] stringArray7 = new String[lIlllIIIll[0]];
                    stringArray7[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[43]];
                    if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                        String[] stringArray8 = new String[lIlllIIIll[0]];
                        stringArray8[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[44]];
                        if (H.lIIlllIIIlIII(Inventory.contains((String[])stringArray8) ? 1 : 0) && H.lIIlllIIIlIII(je ? 1 : 0)) {
                            if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(jc), lIlllIIIll[18]) && H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[45])) {
                                AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[46]];
                                Movement.walkTo((WorldPoint)jc);
                                0;
                                Time.sleepTicks((int)lIlllIIIll[0]);
                                0;
                            }
                            if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(jc), lIlllIIIll[18])) {
                                lllllllllllllllllllIIIIIIIIIllII = new WorldPoint(lIlllIIIll[47], lIlllIIIll[48], lIlllIIIll[1]);
                                lllllllllllllllllllIIIIIIIIIlIll2 = new WorldPoint(lIlllIIIll[47], lIlllIIIll[49], lIlllIIIll[1]);
                                if ((!H.lIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIIIIIIIIIllII) ? 1 : 0) || H.lIIlllIIIIllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIIIIIIIlIll2) ? 1 : 0)) && H.lIIlllIIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)new WorldPoint(lIlllIIIll[50], lIlllIIIll[51], lIlllIIIll[1]));
                                    0;
                                    Time.sleepTicks((int)lIlllIIIll[7]);
                                    0;
                                }
                                g.a(lIlllIIIIl[lIlllIIIll[52]], cy, lIlllIIIll[0]);
                            }
                        }
                    }
                }
                String[] stringArray9 = new String[lIlllIIIll[0]];
                stringArray9[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[45]];
                if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                    String[] stringArray10 = new String[lIlllIIIll[0]];
                    stringArray10[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[53]];
                    if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                        String[] stringArray11 = new String[lIlllIIIll[0]];
                        stringArray11[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[54]];
                        if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray11) ? 1 : 0) && H.lIIlllIIIlIII(je ? 1 : 0)) {
                            if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                                AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[55]];
                                Movement.walkTo((WorldPoint)iZ);
                                0;
                                Time.sleepTicks((int)lIlllIIIll[0]);
                                0;
                            }
                            if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                                g.a(lIlllIIIIl[lIlllIIIll[56]], cy);
                                lllllllllllllllllllIIIIIIIIIllII = Dialog.getOptions();
                                if (H.lIIlllIIIlIII(lllllllllllllllllllIIIIIIIIIllII.isEmpty() ? 1 : 0)) {
                                    int lllllllllllllllllllIIIIIIIIIlIll2 = lIlllIIIll[1];
                                    while (H.lIIlllIIIIlll(lllllllllllllllllllIIIIIIIIIlIll2, lllllllllllllllllllIIIIIIIIIllII.size())) {
                                        if (H.lIIlllIIIIllI(((Widget)lllllllllllllllllllIIIIIIIIIllII.get(lllllllllllllllllllIIIIIIIIIlIll2)).getText().contains(lIlllIIIIl[lIlllIIIll[57]]) ? 1 : 0)) {
                                            System.out.println(lIlllIIIIl[lIlllIIIll[58]]);
                                            je = lIlllIIIll[0];
                                        }
                                        ++lllllllllllllllllllIIIIIIIIIlIll2;
                                        0;
                                        if (3 != 0) continue;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[20]) && H.lIIlllIIIlIII(je ? 1 : 0)) {
                    String[] stringArray12 = new String[lIlllIIIll[0]];
                    stringArray12[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[59]];
                    if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        String[] stringArray13 = new String[lIlllIIIll[0]];
                        stringArray13[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[60]];
                        if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            g.a(lIlllIIIIl[lIlllIIIll[61]], cy);
                            lllllllllllllllllllIIIIIIIIIllII = Dialog.getOptions();
                            if (H.lIIlllIIIlIII(lllllllllllllllllllIIIIIIIIIllII.isEmpty() ? 1 : 0)) {
                                int lllllllllllllllllllIIIIIIIIIlIll2 = lIlllIIIll[1];
                                while (H.lIIlllIIIIlll(lllllllllllllllllllIIIIIIIIIlIll2, lllllllllllllllllllIIIIIIIIIllII.size())) {
                                    if (H.lIIlllIIIIllI(((Widget)lllllllllllllllllllIIIIIIIIIllII.get(lllllllllllllllllllIIIIIIIIIlIll2)).getText().contains(lIlllIIIIl[lIlllIIIll[62]]) ? 1 : 0)) {
                                        System.out.println(lIlllIIIIl[lIlllIIIll[63]]);
                                        je = lIlllIIIll[0];
                                    }
                                    ++lllllllllllllllllllIIIIIIIIIlIll2;
                                    0;
                                    if (null == null) continue;
                                    return;
                                }
                            }
                        }
                    }
                }
                if (H.lIIlllIIIIllI(je ? 1 : 0)) {
                    String[] stringArray14 = new String[lIlllIIIll[0]];
                    stringArray14[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[64]];
                    if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        String[] stringArray15 = new String[lIlllIIIll[0]];
                        stringArray15[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[65]];
                        if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                            if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(jd), lIlllIIIll[16])) {
                                if (H.lIIlllIIIIllI(Inventory.contains(item -> item.getName().contains(lIlllIIIIl[lIlllIIIll[101]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(lIlllIIIIl[lIlllIIIll[100]])).interact(lIlllIIIIl[lIlllIIIll[66]]);
                                }
                                if (H.lIIlllIIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] stringArray16 = new String[lIlllIIIll[0]];
                                stringArray16[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[67]];
                                g.a(stringArray16);
                                AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[68]];
                                Movement.walkTo((WorldPoint)jd);
                                0;
                                Time.sleepTicks((int)lIlllIIIll[0]);
                                0;
                            }
                            if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(jd), lIlllIIIll[16])) {
                                g.a(lIlllIIIIl[lIlllIIIll[69]], cy);
                            }
                        }
                    }
                }
            }
            if (!H.lIIlllIIIllll(e.j(lIlllIIIll[2]), lIlllIIIll[57]) || H.lIIlllIIIlllI(e.j(lIlllIIIll[2]), lIlllIIIll[58])) {
                String[] stringArray = new String[lIlllIIIll[0]];
                stringArray[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[70]];
                if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIllII = new WorldArea(lIlllIIIll[71], lIlllIIIll[72], lIlllIIIll[24], lIlllIIIll[18], lIlllIIIll[1]);
                    g.a(cy);
                    if (H.lIIlllIIIlIII(lllllllllllllllllllIIIIIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[73]];
                        Movement.walkTo((WorldPoint)jc);
                        0;
                        Time.sleepTicks((int)lIlllIIIll[0]);
                        0;
                    }
                    if (H.lIIlllIIIIllI(lllllllllllllllllllIIIIIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[74]];
                        g.a(lIlllIIIIl[lIlllIIIll[75]], cy, lIlllIIIll[0]);
                    }
                }
            }
            if (H.lIIlllIIIlllI(e.j(lIlllIIIll[2]), lIlllIIIll[67])) {
                String[] stringArray = new String[lIlllIIIll[0]];
                stringArray[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[76]];
                if (H.lIIlllIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[77]];
                    String[] stringArray17 = new String[lIlllIIIll[0]];
                    stringArray17[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[78]];
                    String[] stringArray18 = new String[lIlllIIIll[0]];
                    stringArray18[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[32]];
                    Inventory.getFirst((String[])stringArray17).useOn((Actor)NPCs.getNearest((String[])stringArray18));
                    Time.sleepTicks((int)lIlllIIIll[20]);
                    0;
                }
            }
            if (H.lIIlllIIIlllI(e.j(lIlllIIIll[2]), lIlllIIIll[32])) {
                lllllllllllllllllllIIIIIIIIIllII = new WorldArea(lIlllIIIll[71], lIlllIIIll[72], lIlllIIIll[14], lIlllIIIll[5], lIlllIIIll[1]);
                if (H.lIIlllIIIlIII(lllllllllllllllllllIIIIIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[79]];
                    String[] stringArray = new String[lIlllIIIll[0]];
                    stringArray[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[80]];
                    String[] stringArray19 = new String[lIlllIIIll[0]];
                    stringArray19[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[81]];
                    Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray19));
                    Time.sleepTicks((int)lIlllIIIll[7]);
                    0;
                }
                if (H.lIIlllIIIIllI(lllllllllllllllllllIIIIIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lIlllIIIIl[lIlllIIIll[82]], cy);
                }
            }
            if (H.lIIlllIIIlllI(e.j(lIlllIIIll[2]), lIlllIIIll[83])) {
                if (H.lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    WorldArea lllllllllllllllllllIIIIIIIIIlIll2;
                    lllllllllllllllllllIIIIIIIIIllII = new WorldArea(lIlllIIIll[71], lIlllIIIll[72], lIlllIIIll[14], lIlllIIIll[5], lIlllIIIll[1]);
                    if (H.lIIlllIIIIllI(lllllllllllllllllllIIIIIIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lIIlllIIIlIII(Equipment.contains((int[])f.aQ) ? 1 : 0)) {
                        int[] nArray9 = new int[lIlllIIIll[0]];
                        nArray9[H.lIlllIIIll[1]] = lIlllIIIll[9];
                        if (H.lIIlllIIIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                            int[] nArray10 = new int[lIlllIIIll[0]];
                            nArray10[H.lIlllIIIll[1]] = lIlllIIIll[9];
                            Inventory.getFirst((int[])nArray10).interact(lIlllIIIIl[lIlllIIIll[84]]);
                            Time.sleepTicks((int)e.c(lIlllIIIll[16], lIlllIIIll[20]));
                            0;
                        }
                    }
                    if (H.lIIlllIIIIllI((lllllllllllllllllllIIIIIIIIIlIll2 = new WorldArea(lIlllIIIll[51], lIlllIIIll[85], lIlllIIIll[52], lIlllIIIll[55], lIlllIIIll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().getX(), lIlllIIIll[86])) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[87]];
                        String[] stringArray = new String[lIlllIIIll[0]];
                        stringArray[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[88]];
                        TileObjects.getNearest((String[])stringArray).interact(lIlllIIIIl[lIlllIIIll[89]]);
                        Time.sleepTicks((int)e.c(lIlllIIIll[5], lIlllIIIll[16]));
                        0;
                    }
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[90]];
                    Movement.walkTo((WorldPoint)cV);
                    0;
                    Time.sleepTicks((int)lIlllIIIll[0]);
                    0;
                }
                if (H.lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    if (H.lIIlllIIIIlll(dc, lIlllIIIll[0])) {
                        Z.oc += lIlllIIIll[0];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlllIIIll[0];
                        Z.oc = lIlllIIIll[1];
                        dd = lIlllIIIll[1];
                    }
                    g.a(lIlllIIIIl[lIlllIIIll[91]], cy);
                }
            }
            g.a(new String[lIlllIIIll[1]]);
        }
    }

    private static boolean lIIlllIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void O() {
        block22: {
            d lllllllllllllllllllIIIIIIIIIIIll;
            block21: {
                Object lllllllllllllllllllIIIIIIIIIIlII;
                block20: {
                    block19: {
                        int[] nArray = new int[lIlllIIIll[0]];
                        nArray[H.lIlllIIIll[1]] = lIlllIIIll[28];
                        if (H.lIIlllIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlllIIIll[28], lIlllIIIll[0], lIlllIIIll[92]);
                            bp.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIlllIIIll[0]];
                        nArray2[H.lIlllIIIll[1]] = lIlllIIIll[26];
                        if (H.lIIlllIIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[26], lIlllIIIll[0], lIlllIIIll[93]);
                            bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                            0;
                        }
                        int[] nArray3 = new int[lIlllIIIll[0]];
                        nArray3[H.lIlllIIIll[1]] = lIlllIIIll[23];
                        if (H.lIIlllIIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[23], lIlllIIIll[0], lIlllIIIll[93]);
                            bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                            0;
                        }
                        int[] nArray4 = new int[lIlllIIIll[0]];
                        nArray4[H.lIlllIIIll[1]] = lIlllIIIll[21];
                        if (H.lIIlllIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[21], lIlllIIIll[0], lIlllIIIll[93]);
                            bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                            0;
                        }
                        int[] nArray5 = new int[lIlllIIIll[0]];
                        nArray5[H.lIlllIIIll[1]] = lIlllIIIll[6];
                        if (!H.lIIlllIIIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIlllIIIll[0]];
                        nArray6[H.lIlllIIIll[1]] = lIlllIIIll[6];
                        if (!H.lIIlllIIIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block20;
                        int[] nArray7 = new int[lIlllIIIll[0]];
                        nArray7[H.lIlllIIIll[1]] = lIlllIIIll[6];
                        if (!H.lIIlllIIIIlll(Bank.getFirst((int[])nArray7).getQuantity(), lIlllIIIll[7])) break block20;
                    }
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[6], lIlllIIIll[7], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray = new int[lIlllIIIll[0]];
                nArray[H.lIlllIIIll[1]] = lIlllIIIll[15];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[15], lIlllIIIll[0], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray8 = new int[lIlllIIIll[0]];
                nArray8[H.lIlllIIIll[1]] = lIlllIIIll[17];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[17], lIlllIIIll[0], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray9 = new int[lIlllIIIll[0]];
                nArray9[H.lIlllIIIll[1]] = lIlllIIIll[19];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[19], lIlllIIIll[0], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray10 = new int[lIlllIIIll[0]];
                nArray10[H.lIlllIIIll[1]] = lIlllIIIll[13];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[13], lIlllIIIll[0], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray11 = new int[lIlllIIIll[0]];
                nArray11[H.lIlllIIIll[1]] = lIlllIIIll[12];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[12], lIlllIIIll[0], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray12 = new int[lIlllIIIll[0]];
                nArray12[H.lIlllIIIll[1]] = lIlllIIIll[11];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[11], lIlllIIIll[7], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                int[] nArray13 = new int[lIlllIIIll[0]];
                nArray13[H.lIlllIIIll[1]] = lIlllIIIll[10];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIlII = new d(lIlllIIIll[10], lIlllIIIll[0], lIlllIIIll[93]);
                    bp.add((d)lllllllllllllllllllIIIIIIIIIIlII);
                    0;
                }
                if (H.lIIlllIIIlIII(Bank.contains((Predicate)(lllllllllllllllllllIIIIIIIIIIlII = item -> item.getName().toLowerCase().contains(lIlllIIIIl[lIlllIIIll[99]]))) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIIll = new d(lIlllIIIll[94], lIlllIIIll[14], lIlllIIIll[95]);
                    bp.add(lllllllllllllllllllIIIIIIIIIIIll);
                    0;
                }
                int[] nArray14 = new int[lIlllIIIll[0]];
                nArray14[H.lIlllIIIll[1]] = lIlllIIIll[29];
                if (H.lIIlllIIIlIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    lllllllllllllllllllIIIIIIIIIIIll = new d(lIlllIIIll[29], lIlllIIIll[5], j.bZ);
                    bp.add(lllllllllllllllllllIIIIIIIIIIIll);
                    0;
                }
                int[] nArray15 = new int[lIlllIIIll[0]];
                nArray15[H.lIlllIIIll[1]] = lIlllIIIll[9];
                if (!H.lIIlllIIIIllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block21;
                int[] nArray16 = new int[lIlllIIIll[0]];
                nArray16[H.lIlllIIIll[1]] = lIlllIIIll[9];
                if (!H.lIIlllIIIIllI(Bank.contains((int[])nArray16) ? 1 : 0)) break block22;
                int[] nArray17 = new int[lIlllIIIll[0]];
                nArray17[H.lIlllIIIll[1]] = lIlllIIIll[9];
                if (!H.lIIlllIIIIlll(Bank.getFirst((int[])nArray17).getQuantity(), lIlllIIIll[36])) break block22;
            }
            lllllllllllllllllllIIIIIIIIIIIll = new d(lIlllIIIll[9], lIlllIIIll[67], lIlllIIIll[96]);
            bp.add(lllllllllllllllllllIIIIIIIIIIIll);
            0;
        }
    }

    static {
        H.lIIlllIIIIlII();
        H.lIIlllIIIIIll();
        iY = lIlllIIIll[2];
        bp = new ArrayList<d>();
        cV = new WorldPoint(lIlllIIIll[104], lIlllIIIll[105], lIlllIIIll[1]);
        iZ = new WorldPoint(lIlllIIIll[106], lIlllIIIll[107], lIlllIIIll[1]);
        ja = new WorldPoint(lIlllIIIll[108], lIlllIIIll[109], lIlllIIIll[1]);
        jb = new WorldPoint(lIlllIIIll[110], lIlllIIIll[111], lIlllIIIll[1]);
        jc = new WorldPoint(lIlllIIIll[112], lIlllIIIll[113], lIlllIIIll[1]);
        jd = new WorldPoint(lIlllIIIll[114], lIlllIIIll[115], lIlllIIIll[1]);
        String[] stringArray = new String[lIlllIIIll[34]];
        stringArray[H.lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[116]];
        stringArray[H.lIlllIIIll[0]] = lIlllIIIIl[lIlllIIIll[117]];
        stringArray[H.lIlllIIIll[4]] = lIlllIIIIl[lIlllIIIll[118]];
        stringArray[H.lIlllIIIll[7]] = lIlllIIIIl[lIlllIIIll[119]];
        stringArray[H.lIlllIIIll[5]] = lIlllIIIIl[lIlllIIIll[120]];
        stringArray[H.lIlllIIIll[14]] = lIlllIIIIl[lIlllIIIll[121]];
        stringArray[H.lIlllIIIll[16]] = lIlllIIIIl[lIlllIIIll[122]];
        stringArray[H.lIlllIIIll[18]] = lIlllIIIIl[lIlllIIIll[123]];
        stringArray[H.lIlllIIIll[20]] = lIlllIIIIl[lIlllIIIll[124]];
        stringArray[H.lIlllIIIll[22]] = lIlllIIIIl[lIlllIIIll[125]];
        stringArray[H.lIlllIIIll[24]] = lIlllIIIIl[lIlllIIIll[126]];
        stringArray[H.lIlllIIIll[25]] = lIlllIIIIl[lIlllIIIll[127]];
        stringArray[H.lIlllIIIll[8]] = lIlllIIIIl[lIlllIIIll[128]];
        cy = stringArray;
    }

    private static void lIIlllIIIIlII() {
        lIlllIIIll = new int[130];
        H.lIlllIIIll[0] = 1;
        H.lIlllIIIll[1] = (119 + 103 - 75 + 96 ^ 131 + 132 - 178 + 76) & (3 ^ 0x3A ^ (0x51 ^ 0x3A) ^ -1);
        H.lIlllIIIll[2] = 0xFFFFA9D1 & 0x573F;
        H.lIlllIIIll[3] = -(0xFFFFF475 & 0x6FCF) & (0xFFFFFFDF & 0x77EC);
        H.lIlllIIIll[4] = 2;
        H.lIlllIIIll[5] = 0x9C ^ 0xB2 ^ (0x3E ^ 0x14);
        H.lIlllIIIll[6] = 0xFFFFAF7F & 0x57FD;
        H.lIlllIIIll[7] = 3;
        H.lIlllIIIll[8] = 0x75 ^ 0x79;
        H.lIlllIIIll[9] = 0xFFFFDF5F & 0x3FE7;
        H.lIlllIIIll[10] = 0xFFFFEEF5 & 0x17EB;
        H.lIlllIIIll[11] = 0xFFFF9FDF & 0x66FF;
        H.lIlllIIIll[12] = -(0xFFFFBFB7 & 0x7159) & (0xFFFFB7F5 & Short.MAX_VALUE);
        H.lIlllIIIll[13] = 0xFFFFFFBF & 0x7DF;
        H.lIlllIIIll[14] = 0xB5 ^ 0xB0;
        H.lIlllIIIll[15] = 0xFFFFD27E & 0x2FD1;
        H.lIlllIIIll[16] = 51 + 65 - 6 + 80 ^ 32 + 100 - 5 + 57;
        H.lIlllIIIll[17] = 0xFFFFFF9D & 0x7EB;
        H.lIlllIIIll[18] = 0x6C ^ 0x6B;
        H.lIlllIIIll[19] = -(0xFFFFBF7B & 0x48D5) & (0xFFFFBFFD & 0x4FDF);
        H.lIlllIIIll[20] = 0x8F ^ 0x87;
        H.lIlllIIIll[21] = -(0xFFFF95FD & 0x7E43) & (0xFFFF9FFF & 0x7D6D);
        H.lIlllIIIll[22] = 0x78 ^ 0x71;
        H.lIlllIIIll[23] = -(0xFFFFAF59 & 0x54AF) & (0xFFFFC7FD & 0x3FFF);
        H.lIlllIIIll[24] = 0x84 ^ 0x8E;
        H.lIlllIIIll[25] = 0xBA ^ 0xB2 ^ 3;
        H.lIlllIIIll[26] = 0xFFFFDFBA & 0x23FF;
        H.lIlllIIIll[27] = 0xFFFFC37F & 0x3DFB;
        H.lIlllIIIll[28] = -(0xFFFF9FBF & 0x6176) & (0xFFFFEFFF & 0x3FFF);
        H.lIlllIIIll[29] = -(0xFFFFD6BF & 0x69C9) & (0xFFFFFDFF & 0x73D9);
        H.lIlllIIIll[30] = -(0xFFFFB85D & 0x7FB3) & (0xFFFFBBF7 & 0x7FFB);
        H.lIlllIIIll[31] = -(0xFFFFF81F & 0x5FF7) & (0xFFFFDBFF & 0x7FFE);
        H.lIlllIIIll[32] = 0x73 ^ 0x41;
        H.lIlllIIIll[33] = 0x98 ^ 0xC0 ^ (0x49 ^ 5);
        H.lIlllIIIll[34] = 83 + 186 - 185 + 123 ^ 16 + 12 - -115 + 51;
        H.lIlllIIIll[35] = 0xAA ^ 0xA4;
        H.lIlllIIIll[36] = 0x52 ^ 0x3A ^ (0x60 ^ 7);
        H.lIlllIIIll[37] = 0xDA ^ 0x8C ^ (0xF8 ^ 0xBE);
        H.lIlllIIIll[38] = 0x9F ^ 0x8E;
        H.lIlllIIIll[39] = 85 + 94 - 3 + 4 ^ 137 + 23 - 107 + 113;
        H.lIlllIIIll[40] = 0xFFFF9E7B & 0x6D8F;
        H.lIlllIIIll[41] = -(0xFFFFB37F & 0x5FC3) & (0xFFFFDFFA & 0x3FFF);
        H.lIlllIIIll[42] = 0x9E ^ 0xA4 ^ (0xAA ^ 0x83);
        H.lIlllIIIll[43] = 1 ^ 0x21 ^ (0x97 ^ 0xA2);
        H.lIlllIIIll[44] = 9 ^ 0x1F;
        H.lIlllIIIll[45] = 0x14 ^ 0xD;
        H.lIlllIIIll[46] = 0x48 ^ 0x5F;
        H.lIlllIIIll[47] = 0xFFFFBCFD & 0x4F3A;
        H.lIlllIIIll[48] = 0xFFFFCDBF & 0x3EEE;
        H.lIlllIIIll[49] = -(0xFFFFF3F3 & 0x3D5D) & (0xFFFFFDFF & 0x3FFF);
        H.lIlllIIIll[50] = 0xFFFFDE3F & 0x2DF9;
        H.lIlllIIIll[51] = 0xFFFF9DFF & 0x6EAD;
        H.lIlllIIIll[52] = 0xD8 ^ 0xC0;
        H.lIlllIIIll[53] = 100 + 91 - 146 + 120 ^ 71 + 52 - -32 + 36;
        H.lIlllIIIll[54] = 0xE ^ 6 ^ (0x32 ^ 0x21);
        H.lIlllIIIll[55] = 152 + 82 - 98 + 83 ^ 184 + 85 - 193 + 123;
        H.lIlllIIIll[56] = 0xA8 ^ 0xB5;
        H.lIlllIIIll[57] = 0xD9 ^ 0xC7;
        H.lIlllIIIll[58] = 0xD8 ^ 0xC7;
        H.lIlllIIIll[59] = 119 + 82 - 77 + 60 ^ 102 + 37 - 76 + 89;
        H.lIlllIIIll[60] = 61 + 87 - 118 + 101 ^ 137 + 21 - 28 + 32;
        H.lIlllIIIll[61] = 0x18 ^ 0x77 ^ (0x4E ^ 3);
        H.lIlllIIIll[62] = 0x41 ^ 0x62;
        H.lIlllIIIll[63] = 0x60 ^ 0 ^ (0xF7 ^ 0xB3);
        H.lIlllIIIll[64] = 0x59 ^ 0x7C;
        H.lIlllIIIll[65] = 0xAE ^ 0x88;
        H.lIlllIIIll[66] = 146 + 213 - 318 + 187 ^ 48 + 185 - 183 + 145;
        H.lIlllIIIll[67] = 0x3C ^ 0x32 ^ (0x9E ^ 0xB8);
        H.lIlllIIIll[68] = 0xA6 ^ 0x8F;
        H.lIlllIIIll[69] = 0x12 ^ 0x7D ^ (0x49 ^ 0xC);
        H.lIlllIIIll[70] = 0x40 ^ 0x6B;
        H.lIlllIIIll[71] = -(115 + 175 - 186 + 93) & (0xFFFFFCF7 & 0xFFD);
        H.lIlllIIIll[72] = 0xFFFF9EA8 & 0x6DFF;
        H.lIlllIIIll[73] = 0xE8 ^ 0xA8 ^ (0x18 ^ 0x74);
        H.lIlllIIIll[74] = 0xEB ^ 0xC6;
        H.lIlllIIIll[75] = 0x2C ^ 0x47 ^ (0xF3 ^ 0xB6);
        H.lIlllIIIll[76] = 0x50 ^ 0x7F;
        H.lIlllIIIll[77] = 0x17 ^ 0x5C ^ (0x48 ^ 0x33);
        H.lIlllIIIll[78] = 0xED ^ 0x81 ^ (5 ^ 0x58);
        H.lIlllIIIll[79] = 0x34 ^ 7;
        H.lIlllIIIll[80] = 0x9B ^ 0xAF;
        H.lIlllIIIll[81] = 0xB6 ^ 0x83;
        H.lIlllIIIll[82] = 0xF1 ^ 0xC7;
        H.lIlllIIIll[83] = 0xEA ^ 0x8E;
        H.lIlllIIIll[84] = 70 + 160 - 125 + 69 ^ 47 + 81 - 114 + 139;
        H.lIlllIIIll[85] = 0xFFFFAC97 & 0x5FFC;
        H.lIlllIIIll[86] = 0xFFFFBCC3 & 0x4FFF;
        H.lIlllIIIll[87] = 0x51 ^ 0x69;
        H.lIlllIIIll[88] = 0xA7 ^ 0xAC ^ (0x3C ^ 0xE);
        H.lIlllIIIll[89] = 0x1F ^ 0x19 ^ (0x90 ^ 0xAC);
        H.lIlllIIIll[90] = 0x7C ^ 0x47;
        H.lIlllIIIll[91] = 0 ^ 0x3C;
        H.lIlllIIIll[92] = -(0xFFFFA0B6 & 0x7FDD) & (0xFFFFEDBF & 0x7EFF);
        H.lIlllIIIll[93] = -(0xFFFFBBA7 & 0x6E5A) & (0xFFFFFFFD & 0x3F7F);
        H.lIlllIIIll[94] = -(0xFFFFDD0F & 0x63F3) & (0xFFFFFFCF & 0x6FFE);
        H.lIlllIIIll[95] = 0xFFFFE5F9 & 0x7BAE;
        H.lIlllIIIll[96] = 0xFFFFBFFF & 0x476C;
        H.lIlllIIIll[97] = 0xF0 ^ 0xA8 ^ (0xCA ^ 0xAF);
        H.lIlllIIIll[98] = 0xF ^ 0x61;
        H.lIlllIIIll[99] = 0xBC ^ 0x9C ^ (0x78 ^ 0x66);
        H.lIlllIIIll[100] = 1 + 46 - -37 + 54 ^ 173 + 152 - 173 + 29;
        H.lIlllIIIll[101] = 0xD5 ^ 0x95;
        H.lIlllIIIll[102] = 0x3C ^ 0x7D;
        H.lIlllIIIll[103] = 0x30 ^ 0x72;
        H.lIlllIIIll[104] = 0xFFFFDEE3 & 0x2DFF;
        H.lIlllIIIll[105] = -(0xFFFFE8A3 & 0x37DD) & (0xFFFFACFD & 0x7FDB);
        H.lIlllIIIll[106] = 0xFFFF9DFE & 0x6EDB;
        H.lIlllIIIll[107] = 0xFFFFDC6E & 0x2FFF;
        H.lIlllIIIll[108] = -(0xFFFFB69F & 0x6BE1) & (0xFFFFAFDE & 0x7EBB);
        H.lIlllIIIll[109] = -(0xFFFFF7D7 & 0x596E) & (0xFFFFDDFF & Short.MAX_VALUE);
        H.lIlllIIIll[110] = -(0xFFFFE3D3 & 0x7F7F) & (0xFFFFFFFF & 0x6F5F);
        H.lIlllIIIll[111] = -(0xFFFFBDAD & 0x5357) & (0xFFFFDFBF & 0x3DFF);
        H.lIlllIIIll[112] = -(0xFFFFF3E7 & 0x4FDA) & (0xFFFFEFF7 & 0x5FFF);
        H.lIlllIIIll[113] = -(0xFFFFB95F & 0x67F5) & (0xFFFFFFFF & 0x2DFF);
        H.lIlllIIIll[114] = 0xFFFFCCAE & 0x3F79;
        H.lIlllIIIll[115] = -(0xFFFFD2FF & 0x6F42) & (0xFFFFDFFF & 0x6EFF);
        H.lIlllIIIll[116] = 0xE9 ^ 0xB5 ^ (0xA7 ^ 0xB8);
        H.lIlllIIIll[117] = 0xA6 ^ 0xAF ^ (0xD1 ^ 0x9C);
        H.lIlllIIIll[118] = 0x4B ^ 0xE;
        H.lIlllIIIll[119] = 0x28 ^ 0x6E;
        H.lIlllIIIll[120] = 0x6C ^ 0x75 ^ (0x9A ^ 0xC4);
        H.lIlllIIIll[121] = 147 + 195 - 285 + 139 ^ 61 + 19 - 25 + 85;
        H.lIlllIIIll[122] = 0xFC ^ 0xB5;
        H.lIlllIIIll[123] = 0xC2 ^ 0x88;
        H.lIlllIIIll[124] = 0x10 ^ 0x5B;
        H.lIlllIIIll[125] = 0x8C ^ 0xC0;
        H.lIlllIIIll[126] = 0x37 ^ 0xF ^ (0xDF ^ 0xAA);
        H.lIlllIIIll[127] = 0x5C ^ 0x12;
        H.lIlllIIIll[128] = 0x26 ^ 0x69;
        H.lIlllIIIll[129] = 0xF4 ^ 0xA4;
    }

    private static boolean lIIlllIIIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIllIlllIlIl(String llllllllllllllllllIlllllllllIIIl, String llllllllllllllllllIlllllllllIlIl) {
        llllllllllllllllllIlllllllllIIIl = new String(Base64.getDecoder().decode(llllllllllllllllllIlllllllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllllllllIlII = new StringBuilder();
        char[] llllllllllllllllllIlllllllllIIll = llllllllllllllllllIlllllllllIlIl.toCharArray();
        int llllllllllllllllllIlllllllllIIlI = lIlllIIIll[1];
        char[] llllllllllllllllllIllllllllIllII = llllllllllllllllllIlllllllllIIIl.toCharArray();
        int llllllllllllllllllIllllllllIlIll = llllllllllllllllllIllllllllIllII.length;
        int llllllllllllllllllIllllllllIlIlI = lIlllIIIll[1];
        while (H.lIIlllIIIIlll(llllllllllllllllllIllllllllIlIlI, llllllllllllllllllIllllllllIlIll)) {
            char llllllllllllllllllIlllllllllIlll = llllllllllllllllllIllllllllIllII[llllllllllllllllllIllllllllIlIlI];
            llllllllllllllllllIlllllllllIlII.append((char)(llllllllllllllllllIlllllllllIlll ^ llllllllllllllllllIlllllllllIIll[llllllllllllllllllIlllllllllIIlI % llllllllllllllllllIlllllllllIIll.length]));
            0;
            ++llllllllllllllllllIlllllllllIIlI;
            ++llllllllllllllllllIllllllllIlIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlllllllllIlII);
    }

    @Override
    public boolean ac() {
        return lIlllIIIll[1];
    }

    private static boolean lIIlllIIIlIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (H.lIIlllIIlIIII(e.j(lIlllIIIll[2]), lIlllIIIll[98])) {
            bl = lIlllIIIll[0];
            0;
            if ((0xBF ^ 0xAB ^ (0x24 ^ 0x35)) == 0) {
                return ((0x11 ^ 0x35 ^ (0x8A ^ 0xA5)) & (0x7F ^ 0x4B ^ (0xF9 ^ 0xC6) ^ -1)) != 0;
            }
        } else {
            bl = lIlllIIIll[1];
        }
        return bl;
    }

    private static boolean lIIlllIIIlIIl(Object object) {
        return object != null;
    }

    private static String lIIllIlllIlII(String llllllllllllllllllIlllllllIlIlII, String llllllllllllllllllIlllllllIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllIlllllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllllllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlllllllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlllllllIlIllI.init(lIlllIIIll[4], llllllllllllllllllIlllllllIlIlll);
            return new String(llllllllllllllllllIlllllllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlllllllIlIlIl) {
            llllllllllllllllllIlllllllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlllIllI(String llllllllllllllllllIlllllllIlllll, String llllllllllllllllllIlllllllIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIllllllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllllllIllllI.getBytes(StandardCharsets.UTF_8)), lIlllIIIll[20]), "DES");
            Cipher llllllllllllllllllIllllllllIIIll = Cipher.getInstance("DES");
            llllllllllllllllllIllllllllIIIll.init(lIlllIIIll[4], llllllllllllllllllIllllllllIIlII);
            return new String(llllllllllllllllllIllllllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllllllllIIIlI) {
            llllllllllllllllllIllllllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean al() {
        void lllllllllllllllllllIIIIIIIIIlIII;
        int[] nArray = new int[lIlllIIIll[8]];
        nArray[H.lIlllIIIll[1]] = lIlllIIIll[9];
        nArray[H.lIlllIIIll[0]] = lIlllIIIll[10];
        nArray[H.lIlllIIIll[4]] = lIlllIIIll[11];
        nArray[H.lIlllIIIll[7]] = lIlllIIIll[12];
        nArray[H.lIlllIIIll[5]] = lIlllIIIll[13];
        nArray[H.lIlllIIIll[14]] = lIlllIIIll[15];
        nArray[H.lIlllIIIll[16]] = lIlllIIIll[17];
        nArray[H.lIlllIIIll[18]] = lIlllIIIll[19];
        nArray[H.lIlllIIIll[20]] = lIlllIIIll[21];
        nArray[H.lIlllIIIll[22]] = lIlllIIIll[23];
        nArray[H.lIlllIIIll[24]] = lIlllIIIll[6];
        nArray[H.lIlllIIIll[25]] = lIlllIIIll[26];
        int[] nArray2 = nArray;
        int lllllllllllllllllllIIIIIIIIIIlll = lIlllIIIll[1];
        while (H.lIIlllIIIIlll(lllllllllllllllllllIIIIIIIIIIlll, ((void)lllllllllllllllllllIIIIIIIIIlIII).length)) {
            int[] nArray3 = new int[lIlllIIIll[0]];
            nArray3[H.lIlllIIIll[1]] = lllllllllllllllllllIIIIIIIIIlIII[lllllllllllllllllllIIIIIIIIIIlll];
            if (H.lIIlllIIIlIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlllIIIll[1];
            }
            ++lllllllllllllllllllIIIIIIIIIIlll;
            0;
            if (1 <= (97 + 116 - 55 + 31 ^ 70 + 129 - 41 + 27)) continue;
            return ((0x8D ^ 0x86 ^ (0x78 ^ 0x59)) & (0xDC ^ 0xB8 ^ (0x3A ^ 0x74) ^ -1)) != 0;
        }
        return lIlllIIIll[0];
    }

    private static int lIIlllIIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlllIIIllll(int n2, int n3) {
        return n2 != n3;
    }
}


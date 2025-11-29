/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.F;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.al;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.l;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class D
implements W {
    public static /* synthetic */ String[] bR;
    private static /* synthetic */ int[] lIllIIllI;
    private static /* synthetic */ String[] lIllIIlII;
    public static final /* synthetic */ WorldPoint dK;
    public static final /* synthetic */ WorldPoint dM;
    public static final /* synthetic */ WorldPoint dS;
    public static final /* synthetic */ WorldPoint dO;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint dT;
    public static final /* synthetic */ WorldPoint dR;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldArea dV;
    public static final /* synthetic */ WorldPoint dN;
    public static final /* synthetic */ WorldPoint dQ;
    public static final /* synthetic */ WorldPoint dP;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int dU;
    static /* synthetic */ WorldArea dW;
    public static final /* synthetic */ WorldPoint dL;
    static /* synthetic */ int cl;

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void llIllIllIllIIl;
        int[] nArray = new int[lIllIIllI[6]];
        nArray[D.lIllIIllI[1]] = lIllIIllI[14];
        nArray[D.lIllIIllI[0]] = lIllIIllI[12];
        nArray[D.lIllIIllI[4]] = lIllIIllI[15];
        int[] nArray2 = nArray;
        int llIllIllIllIII = lIllIIllI[1];
        while (D.lIIlIllIlllI(llIllIllIllIII, ((void)llIllIllIllIIl).length)) {
            int[] nArray3 = new int[lIllIIllI[0]];
            nArray3[D.lIllIIllI[1]] = llIllIllIllIIl[llIllIllIllIII];
            if (D.lIIlIllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIllIIllI[1];
            }
            ++llIllIllIllIII;
            0;
            if (-1 <= 3) continue;
            return ((58 + 72 - 97 + 146 ^ 147 + 150 - 160 + 43) & (0x75 ^ 0x57 ^ (0xA9 ^ 0x8C) ^ -1)) != 0;
        }
        return lIllIIllI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void bz() {
        if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dK), lIllIIllI[4])) {
            void llIllIllIlllII;
            void llIllIllIlllIl;
            void llIllIllIlllll;
            AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[89]];
            WorldArea worldArea = new WorldArea(lIllIIllI[90], lIllIIllI[91], lIllIIllI[92], lIllIIllI[93], lIllIIllI[1]);
            WorldPoint worldPoint = new WorldPoint(lIllIIllI[94], lIllIIllI[95], lIllIIllI[1]);
            WorldArea worldArea2 = new WorldArea(lIllIIllI[96], lIllIIllI[97], lIllIIllI[35], lIllIIllI[7], lIllIIllI[1]);
            WorldArea worldArea3 = new WorldArea(lIllIIllI[98], lIllIIllI[99], lIllIIllI[20], lIllIIllI[16], lIllIIllI[1]);
            if (D.lIIlIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (D.lIIlIllIllll(llIllIllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst((int[])f.aN).interact(lIllIIlII[lIllIIllI[100]]);
                Time.sleepTicks((int)lIllIIllI[16]);
                0;
            }
            if (D.lIIlIllIllll(F.hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)F.hr);
                0;
            }
            if (D.lIIlIllIllIl(F.hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(llIllIllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(llIllIllIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(F.gv));
                0;
                Time.sleepTicks((int)lIllIIllI[0]);
                0;
            }
            if (!D.lIIlIllIllll(llIllIllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.lIIlIllIllIl(llIllIllIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllI[0]];
                stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[101]];
                TileObjects.getNearest((String[])stringArray).interact(lIllIIlII[lIllIIllI[102]]);
                Time.sleepTicks((int)lIllIIllI[7]);
                0;
            }
            if ((!D.lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.lIIlIllIllIl(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dK), lIllIIllI[4])) {
                Movement.walkTo((WorldPoint)dK);
                0;
                Time.sleepTicks((int)lIllIIllI[0]);
                0;
            }
        }
    }

    private static String lIIlIlIllIIl(String llIllIllIIIllI, String llIllIllIIIlIl) {
        try {
            SecretKeySpec llIllIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIllI[20]), "DES");
            Cipher llIllIllIIlIlI = Cipher.getInstance("DES");
            llIllIllIIlIlI.init(lIllIIllI[4], llIllIllIIlIll);
            return new String(llIllIllIIlIlI.doFinal(Base64.getDecoder().decode(llIllIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIllIIlIIl) {
            llIllIllIIlIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            D.by();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (153 + 128 - 278 + 182 ^ 43 + 136 - 139 + 119) & (1 ^ 0x65 ^ (0xD8 ^ 0x9A) ^ -1);
        }
        return lIllIIllI[108];
    }

    private static boolean lIIlIlllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIlIllIlI(String llIllIlIlllIIl, String llIllIlIlllIII) {
        try {
            SecretKeySpec llIllIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIlIllllIl = Cipher.getInstance("Blowfish");
            llIllIlIllllIl.init(lIllIIllI[4], llIllIlIlllllI);
            return new String(llIllIlIllllIl.doFinal(Base64.getDecoder().decode(llIllIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlIllllII) {
            llIllIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    public static void by() {
        block83: {
            Object llIllIlllIIlll;
            BankLocation llIllIlllIlIII2;
            block84: {
                block89: {
                    block86: {
                        block88: {
                            block87: {
                                block85: {
                                    if (D.lIIlIllIllIl(bt ? 1 : 0)) {
                                        b.a(bv);
                                        if (D.lIIlIllIlllI(bv.size(), lIllIIllI[0])) {
                                            System.out.println(lIllIIlII[lIllIIllI[1]]);
                                            bt = lIllIIllI[1];
                                        }
                                    }
                                    if (!D.lIIlIllIllll(bt ? 1 : 0)) break block83;
                                    if (D.lIIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lIllIIllI[2])) {
                                        l.Y();
                                    }
                                    if (D.lIIlIlllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIllIIllI[2]) && D.lIIlIllIlllI(Skills.getLevel((Skill)Skill.PRAYER), lIllIIllI[3])) {
                                        al.dD();
                                    }
                                    if (D.lIIlIlllIIII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIllI[3]) && D.lIIlIllIllIl(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.ba).interact(lIllIIlII[lIllIIllI[0]]);
                                    }
                                    if (!D.lIIlIllIllll(D.ab() ? 1 : 0) || !D.lIIlIllIlllI(e.j(dU), lIllIIllI[0]) || !D.lIIlIlllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIllIIllI[2]) || !D.lIIlIlllIIII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIllI[3])) break block84;
                                    llIllIlllIlIII2 = BankLocation.getNearest();
                                    if (D.lIIlIlllIIIl(llIllIlllIlIII2) && D.lIIlIllIllll(llIllIlllIlIII2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[4]];
                                        a.a(llIllIlllIlIII2);
                                    }
                                    if (!D.lIIlIlllIIIl(llIllIlllIlIII2) || !D.lIIlIllIllIl(llIllIlllIlIII2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block84;
                                    if (D.lIIlIllIllll(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIllI[5]);
                                        0;
                                    }
                                    if (!D.lIIlIllIllIl(Bank.isOpen() ? 1 : 0)) break block84;
                                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[6]];
                                    if (D.lIIlIlllIIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIllIIllI[7]);
                                        0;
                                    }
                                    if (D.lIIlIlllIIlI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIllIIllI[4]);
                                        0;
                                    }
                                    int[] nArray = new int[lIllIIllI[0]];
                                    nArray[D.lIllIIllI[1]] = lIllIIllI[8];
                                    if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block85;
                                    int[] nArray2 = new int[lIllIIllI[0]];
                                    nArray2[D.lIllIIllI[1]] = lIllIIllI[8];
                                    if (!D.lIIlIlllIIII(Bank.getFirst((int[])nArray2).getQuantity(), lIllIIllI[9])) break block86;
                                }
                                int[] nArray = new int[lIllIIllI[0]];
                                nArray[D.lIllIIllI[1]] = lIllIIllI[10];
                                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block87;
                                int[] nArray3 = new int[lIllIIllI[0]];
                                nArray3[D.lIllIIllI[1]] = lIllIIllI[10];
                                if (!D.lIIlIlllIIII(Bank.getFirst((int[])nArray3).getQuantity(), lIllIIllI[9])) break block86;
                            }
                            int[] nArray = new int[lIllIIllI[0]];
                            nArray[D.lIllIIllI[1]] = lIllIIllI[11];
                            if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                            int[] nArray4 = new int[lIllIIllI[0]];
                            nArray4[D.lIllIIllI[1]] = lIllIIllI[11];
                            if (!D.lIIlIlllIIII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIllI[9])) break block86;
                        }
                        int[] nArray = new int[lIllIIllI[0]];
                        nArray[D.lIllIIllI[1]] = lIllIIllI[12];
                        if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block89;
                        int[] nArray5 = new int[lIllIIllI[0]];
                        nArray5[D.lIllIIllI[1]] = lIllIIllI[12];
                        if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray5).getQuantity(), lIllIIllI[13])) break block89;
                    }
                    D.af();
                    System.out.println(lIllIIlII[lIllIIllI[7]]);
                    bt = lIllIIllI[0];
                    return;
                }
                int[] nArray = new int[lIllIIllI[13]];
                nArray[D.lIllIIllI[1]] = lIllIIllI[14];
                nArray[D.lIllIIllI[0]] = lIllIIllI[12];
                nArray[D.lIllIIllI[4]] = lIllIIllI[15];
                nArray[D.lIllIIllI[6]] = lIllIIllI[11];
                nArray[D.lIllIIllI[7]] = lIllIIllI[10];
                nArray[D.lIllIIllI[16]] = lIllIIllI[8];
                if (D.lIIlIllIllll(e.b(nArray) ? 1 : 0)) {
                    D.af();
                    System.out.println(lIllIIlII[lIllIIllI[16]]);
                    bt = lIllIIllI[0];
                    return;
                }
                while (D.lIIlIllIllll(z.bi() ? 1 : 0)) {
                    z.bg();
                    Time.sleepTicks((int)lIllIIllI[0]);
                    0;
                    0;
                    if (((9 + 66 - 61 + 115 ^ 94 + 94 - 59 + 52) & (9 ^ 0x1A ^ (0xBF ^ 0x98) ^ -1)) != 1) continue;
                    return;
                }
                if (D.lIIlIllIllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIllIIllI[13]);
                    0;
                }
                int[] nArray6 = new int[lIllIIllI[17]];
                nArray6[D.lIllIIllI[1]] = lIllIIllI[14];
                nArray6[D.lIllIIllI[0]] = lIllIIllI[12];
                nArray6[D.lIllIIllI[4]] = lIllIIllI[15];
                nArray6[D.lIllIIllI[6]] = lIllIIllI[18];
                nArray6[D.lIllIIllI[7]] = lIllIIllI[11];
                nArray6[D.lIllIIllI[16]] = lIllIIllI[10];
                nArray6[D.lIllIIllI[13]] = lIllIIllI[8];
                if (D.lIIlIllIllIl(e.b(nArray6) ? 1 : 0)) {
                    a.a(lIllIIllI[18], lIllIIllI[7]);
                    a.b(f.aN, lIllIIllI[0]);
                    a.a(lIllIIllI[12], lIllIIllI[13]);
                    a.a(lIllIIllI[19], lIllIIllI[20]);
                    a.a(lIllIIllI[15], lIllIIllI[6]);
                    a.a(lIllIIllI[14], lIllIIllI[21]);
                    int[] nArray7 = new int[lIllIIllI[0]];
                    nArray7[D.lIllIIllI[1]] = lIllIIllI[8];
                    if (D.lIIlIllIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lIllIIllI[0]];
                        nArray8[D.lIllIIllI[1]] = lIllIIllI[8];
                        if (D.lIIlIllIlllI(Inventory.getCount((int[])nArray8), lIllIIllI[0])) {
                            Bank.withdraw((int)lIllIIllI[8], (int)lIllIIllI[22], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIllIIllI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIllIIllI[0]];
                                nArray[D.lIllIIllI[1]] = lIllIIllI[8];
                                if (D.lIIlIlllIIlI(Inventory.getCount((int[])nArray))) {
                                    bl = lIllIIllI[0];
                                    0;
                                    if (1 < 0) {
                                        return ((0x7D ^ 0x1E ^ (0x3F ^ 0x65)) & (0x4F ^ 0x29 ^ (0xEE ^ 0xB1) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIllIIllI[1];
                                }
                                return bl;
                            }, (int)lIllIIllI[5]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[lIllIIllI[0]];
                    nArray9[D.lIllIIllI[1]] = lIllIIllI[11];
                    if (D.lIIlIllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lIllIIllI[0]];
                        nArray10[D.lIllIIllI[1]] = lIllIIllI[11];
                        if (D.lIIlIllIlllI(Inventory.getCount((int[])nArray10), lIllIIllI[0])) {
                            Bank.withdraw((int)lIllIIllI[11], (int)lIllIIllI[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIllIIllI[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIllIIllI[0]];
                                nArray[D.lIllIIllI[1]] = lIllIIllI[11];
                                if (D.lIIlIlllIIlI(Inventory.getCount((int[])nArray))) {
                                    bl = lIllIIllI[0];
                                    0;
                                    if (1 >= (0xAC ^ 0xA8)) {
                                        return (3 & ~3) != 0;
                                    }
                                } else {
                                    bl = lIllIIllI[1];
                                }
                                return bl;
                            }, (int)lIllIIllI[5]);
                            0;
                        }
                    }
                    if (D.lIIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), lIllIIllI[2])) {
                        a.a(lIllIIllI[10], lIllIIllI[22]);
                    }
                }
            }
            if (D.lIIlIllIllIl(Inventory.contains((int[])f.aV) ? 1 : 0) && D.lIIlIllIlllI(Movement.getRunEnergy(), lIllIIllI[24])) {
                Inventory.getFirst((int[])f.aV).interact(lIllIIlII[lIllIIllI[13]]);
                Time.sleepTicks((int)lIllIIllI[0]);
                0;
            }
            if (D.lIIlIlllIIll(D.lIIlIllIllII(e.u(), 50.0))) {
                int[] nArray = new int[lIllIIllI[0]];
                nArray[D.lIllIIllI[1]] = lIllIIllI[19];
                if (D.lIIlIllIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[lIllIIllI[0]];
                    nArray11[D.lIllIIllI[1]] = lIllIIllI[19];
                    Inventory.getFirst((int[])nArray11).interact(lIllIIlII[lIllIIllI[17]]);
                    Time.sleepTicks((int)lIllIIllI[0]);
                    0;
                }
            }
            if (D.lIIlIllIllIl(D.ab() ? 1 : 0) && D.lIIlIllIlllI(e.j(dU), lIllIIllI[0])) {
                if (D.lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    D.bz();
                }
                if (D.lIIlIllIllIl(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lIllIIlII[lIllIIllI[20]], bR);
                }
            }
            if ((!D.lIIlIlllIlII(e.j(dU), lIllIIllI[0]) || !D.lIIlIlllIlII(e.j(dU), lIllIIllI[4]) || D.lIIlIlllIlIl(e.j(dU), lIllIIllI[6])) && D.lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIllI[20]) && D.lIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[25]];
                    Movement.walkTo((WorldPoint)dL);
                    0;
                    Time.sleepTicks((int)lIllIIllI[0]);
                    0;
                }
                if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIllI[20])) {
                    g.a(lIllIIlII[lIllIIllI[21]], bR);
                }
            }
            if (D.lIIlIlllIlIl(e.j(dU), lIllIIllI[7])) {
                cl = lIllIIllI[1];
                if (D.lIIlIllIllll(Vars.getBit((int)lIllIIllI[26]))) {
                    if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIllI[7])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[27]];
                        Movement.walkTo((WorldPoint)dN);
                        0;
                        Time.sleepTicks((int)lIllIIllI[0]);
                        0;
                    }
                    if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIllI[7])) {
                        String[] stringArray = new String[lIllIIllI[0]];
                        stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[28]];
                        String[] stringArray2 = new String[lIllIIllI[0]];
                        stringArray2[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[2]];
                        if (D.lIIlIllIllIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIllIIllI[0]];
                            stringArray3[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[29]];
                            TileObjects.getNearest((String[])stringArray3).interact(lIllIIlII[lIllIIllI[30]]);
                            Time.sleepTicks((int)lIllIIllI[6]);
                            0;
                        }
                        String[] stringArray4 = new String[lIllIIllI[0]];
                        stringArray4[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[31]];
                        String[] stringArray5 = new String[lIllIIllI[0]];
                        stringArray5[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[32]];
                        if (D.lIIlIllIllll(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                            g.a(lIllIIlII[lIllIIllI[33]], bR);
                        }
                    }
                }
                if (D.lIIlIlllIlIl(Vars.getBit((int)lIllIIllI[26]), lIllIIllI[0]) && D.lIIlIllIllll(Vars.getBit((int)lIllIIllI[34]))) {
                    if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIllI[13])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[35]];
                        Movement.walkTo((WorldPoint)dO);
                        0;
                        Time.sleepTicks((int)lIllIIllI[0]);
                        0;
                    }
                    if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIllI[13])) {
                        g.a(lIllIIlII[lIllIIllI[36]], bR);
                    }
                }
                if (D.lIIlIlllIlIl(Vars.getBit((int)lIllIIllI[26]), lIllIIllI[0]) && D.lIIlIlllIlIl(Vars.getBit((int)lIllIIllI[34]), lIllIIllI[0]) && D.lIIlIllIllll(Vars.getBit((int)lIllIIllI[37]))) {
                    if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dP), lIllIIllI[13])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[38]];
                        Movement.walkTo((WorldPoint)dP);
                        0;
                        Time.sleepTicks((int)lIllIIllI[0]);
                        0;
                    }
                    if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dP), lIllIIllI[13])) {
                        g.a(lIllIIlII[lIllIIllI[39]], bR);
                    }
                }
                if (D.lIIlIlllIlIl(Vars.getBit((int)lIllIIllI[26]), lIllIIllI[0]) && D.lIIlIlllIlIl(Vars.getBit((int)lIllIIllI[34]), lIllIIllI[0]) && D.lIIlIlllIlIl(Vars.getBit((int)lIllIIllI[37]), lIllIIllI[0])) {
                    if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dQ), lIllIIllI[4])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[40]];
                        Movement.walkTo((WorldPoint)dQ);
                        0;
                        Time.sleepTicks((int)lIllIIllI[0]);
                        0;
                    }
                    if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dQ), lIllIIllI[4])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[41]];
                        if (D.lIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIllI[0]];
                            stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[42]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIIlII[lIllIIllI[43]]);
                            Time.sleepTicks((int)lIllIIllI[6]);
                            0;
                        }
                        int llIllIlllIlIII2 = Vars.getBit((int)lIllIIllI[44]);
                        llIllIlllIIlll = Dialog.getOptions();
                        if (D.lIIlIllIllll(llIllIlllIIlll.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + llIllIlllIlIII2);
                            if (D.lIIlIllIllll(llIllIlllIlIII2)) {
                                String[] stringArray = new String[lIllIIllI[0]];
                                stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[45]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (D.lIIlIlllIlIl(llIllIlllIlIII2, lIllIIllI[0])) {
                                String[] stringArray = new String[lIllIIllI[0]];
                                stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[46]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (D.lIIlIlllIlIl(llIllIlllIlIII2, lIllIIllI[4])) {
                                String[] stringArray = new String[lIllIIllI[0]];
                                stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[47]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (D.lIIlIlllIlIl(llIllIlllIlIII2, lIllIIllI[6])) {
                                String[] stringArray = new String[lIllIIllI[0]];
                                stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[48]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            Time.sleepTicks((int)lIllIIllI[4]);
                            0;
                        }
                    }
                }
            }
            if (D.lIIlIlllIlIl(e.j(dU), lIllIIllI[16])) {
                llIllIlllIlIII2 = new WorldArea(lIllIIllI[49], lIllIIllI[50], lIllIIllI[17], lIllIIllI[16], lIllIIllI[1]);
                if (D.lIIlIllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                    llIllIlllIIlll = new WorldArea(lIllIIllI[51], lIllIIllI[50], lIllIIllI[28], lIllIIllI[13], lIllIIllI[1]);
                    WorldArea llIllIlllIIllI = new WorldArea(lIllIIllI[51], lIllIIllI[52], lIllIIllI[7], lIllIIllI[16], lIllIIllI[1]);
                    WorldArea llIllIlllIIlIl = new WorldArea(lIllIIllI[53], lIllIIllI[54], lIllIIllI[7], lIllIIllI[4], lIllIIllI[1]);
                    WorldArea llIllIlllIIlII = new WorldArea(lIllIIllI[53], lIllIIllI[52], lIllIIllI[6], lIllIIllI[6], lIllIIllI[1]);
                    if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dR), lIllIIllI[4]) && D.lIIlIllIllll(llIllIlllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(llIllIlllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(llIllIlllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.lIIlIllIllll(llIllIlllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[55]];
                        Movement.walkTo((WorldPoint)dR);
                        0;
                        Time.sleepTicks((int)lIllIIllI[0]);
                        0;
                    }
                    if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dR), lIllIIllI[4]) && D.lIIlIllIllll(llIllIlllIlIII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIllI[0]];
                        stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[56]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIlII[lIllIIllI[57]]);
                        Time.sleepTicks((int)lIllIIllI[4]);
                        0;
                    }
                    if (D.lIIlIllIllIl(llIllIlllIlIII2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIllI[58], lIllIIllI[59], lIllIIllI[1])), lIllIIllI[4])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIllI[58], lIllIIllI[59], lIllIIllI[1]));
                            0;
                            Time.sleepTicks((int)lIllIIllI[0]);
                            0;
                        }
                        if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIllI[58], lIllIIllI[59], lIllIIllI[1])), lIllIIllI[4])) {
                            String[] stringArray = new String[lIllIIllI[0]];
                            stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[60]];
                            String[] stringArray6 = new String[lIllIIllI[0]];
                            stringArray6[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[61]];
                            if (D.lIIlIllIllIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lIllIIllI[0]];
                                stringArray7[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[62]];
                                TileObjects.getNearest((String[])stringArray7).interact(lIllIIlII[lIllIIllI[63]]);
                                Time.sleepTicks((int)lIllIIllI[4]);
                                0;
                            }
                            String[] stringArray8 = new String[lIllIIllI[0]];
                            stringArray8[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[64]];
                            String[] stringArray9 = new String[lIllIIllI[0]];
                            stringArray9[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[65]];
                            if (D.lIIlIllIllll(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIllIIllI[0]];
                                stringArray10[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[66]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIllIIlII[lIllIIllI[67]]);
                                Time.sleepTicks((int)lIllIIllI[16]);
                                0;
                            }
                        }
                        if (!D.lIIlIllIllll(llIllIlllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !D.lIIlIllIllll(llIllIlllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !D.lIIlIllIllll(llIllIlllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.lIIlIllIllIl(llIllIlllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIllI[0]];
                            stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[68]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIIlII[lIllIIllI[69]]);
                            Time.sleepTicks((int)lIllIIllI[16]);
                            0;
                        }
                    }
                }
                if (D.lIIlIlllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIllIIllI[0])) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[70]];
                    String[] stringArray = new String[lIllIIllI[0]];
                    stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[3]];
                    if (D.lIIlIlllIIIl(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray11 = new String[lIllIIllI[0]];
                        stringArray11[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[71]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIllIIlII[lIllIIllI[72]]);
                        Time.sleepTicks((int)lIllIIllI[16]);
                        0;
                    }
                    String[] stringArray12 = new String[lIllIIllI[0]];
                    stringArray12[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[73]];
                    if (D.lIIlIlllIIIl(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[lIllIIllI[0]];
                        stringArray13[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(lIllIIlII[lIllIIllI[24]]);
                        Time.sleepTicks((int)lIllIIllI[4]);
                        0;
                    }
                }
            }
            if (D.lIIlIlllIlIl(e.j(dU), lIllIIllI[13])) {
                if (D.lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    D.bz();
                }
                if (D.lIIlIllIllIl(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lIllIIlII[lIllIIllI[75]], bR);
                }
            }
            if (D.lIIlIlllIlIl(e.j(dU), lIllIIllI[17])) {
                if (D.lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIllIIllI[25])) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[76]];
                    Movement.walkTo((WorldPoint)dT);
                    0;
                    Time.sleepTicks((int)lIllIIllI[4]);
                    0;
                }
                if (D.lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIllIIllI[25])) {
                    if (D.lIIlIllIllll(l.ad() ? 1 : 0)) {
                        l.ae();
                    }
                    String[] stringArray = new String[lIllIIllI[0]];
                    stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[77]];
                    llIllIlllIlIII2 = NPCs.getNearest((String[])stringArray);
                    llIllIlllIIlll = NPCs.getNearest(nPC -> {
                        int n2;
                        if (D.lIIlIllIllIl(nPC.getName().contains(lIllIIlII[lIllIIllI[111]]) ? 1 : 0) && D.lIIlIlllllII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIllIIllI[0];
                            0;
                            if (3 > 3) {
                                return ((0x68 ^ 0x52 ^ (0x21 ^ 0x4E)) & (119 + 142 - 206 + 96 ^ 152 + 187 - 271 + 126 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIllIIllI[1];
                        }
                        return n2 != 0;
                    });
                    if (D.lIIlIlllIIIl(llIllIlllIlIII2) && D.lIIlIllllIII(llIllIlllIIlll)) {
                        String[] stringArray14 = new String[lIllIIllI[0]];
                        stringArray14[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[78]];
                        if (D.lIIlIllIllll(llIllIlllIlIII2.hasAction(stringArray14) ? 1 : 0)) {
                            g.a(lIllIIlII[lIllIIllI[79]], bR);
                        }
                        String[] stringArray15 = new String[lIllIIllI[0]];
                        stringArray15[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[80]];
                        if (D.lIIlIllIllIl(llIllIlllIlIII2.hasAction(stringArray15) ? 1 : 0) && D.lIIlIllllIII(Players.getLocal().getInteracting())) {
                            AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[81]];
                            if (D.lIIlIllIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (D.lIIlIllIlllI(Prayers.getPoints(), lIllIIllI[40]) && D.lIIlIllIllIl(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aS).interact(lIllIIlII[lIllIIllI[82]]);
                        Time.sleepTicks((int)lIllIIllI[0]);
                        0;
                    }
                    g.a(bR);
                }
            }
            if (D.lIIlIlllIlIl(e.j(dU), lIllIIllI[20])) {
                String[] stringArray = new String[lIllIIllI[0]];
                stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[83]];
                if (D.lIIlIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[84]];
                    String[] stringArray16 = new String[lIllIIllI[0]];
                    stringArray16[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[85]];
                    TileItems.getNearest((String[])stringArray16).interact(lIllIIlII[lIllIIllI[86]]);
                    Time.sleepTicks((int)lIllIIllI[7]);
                    0;
                }
                String[] stringArray17 = new String[lIllIIllI[0]];
                stringArray17[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[87]];
                if (D.lIIlIllIllIl(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                    if (D.lIIlIllIllIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (D.lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        D.bz();
                    }
                    if (D.lIIlIllIllIl(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (D.lIIlIllIlllI(cl, lIllIIllI[0])) {
                            an.mV += lIllIIllI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIllIIllI[0];
                            an.mV = lIllIIllI[1];
                            cm = lIllIIllI[1];
                        }
                        g.a(lIllIIlII[lIllIIllI[88]], bR);
                    }
                }
            }
            g.a(bR);
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (D.lIIlIlllIIII(e.j(dU), lIllIIllI[25])) {
            bl = lIllIIllI[0];
            0;
            if ((0xAA ^ 0xAE) < 0) {
                return ((0x52 ^ 0x79) & ~(0x6C ^ 0x47)) != 0;
            }
        } else {
            bl = lIllIIllI[1];
        }
        return bl;
    }

    private static String lIIlIlIllIll(String llIllIlIlIlIll, String llIllIlIlIIlIl) {
        llIllIlIlIlIll = new String(Base64.getDecoder().decode(llIllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlIlIlIIl = new StringBuilder();
        char[] llIllIlIlIlIII = llIllIlIlIIlIl.toCharArray();
        int llIllIlIlIIlll = lIllIIllI[1];
        char[] llIllIlIlIIIIl = llIllIlIlIlIll.toCharArray();
        int llIllIlIlIIIII = llIllIlIlIIIIl.length;
        int llIllIlIIlllll = lIllIIllI[1];
        while (D.lIIlIllIlllI(llIllIlIIlllll, llIllIlIlIIIII)) {
            char llIllIlIlIllII = llIllIlIlIIIIl[llIllIlIIlllll];
            llIllIlIlIlIIl.append((char)(llIllIlIlIllII ^ llIllIlIlIlIII[llIllIlIlIIlll % llIllIlIlIlIII.length]));
            0;
            ++llIllIlIlIIlll;
            ++llIllIlIIlllll;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(llIllIlIlIlIIl);
    }

    private static boolean lIIlIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlllIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIlIllIlIlI() {
        lIllIIlII = new String[lIllIIllI[140]];
        D.lIllIIlII[D.lIllIIllI[1]] = D."Finished buying items, switching back to quest";
        D.lIllIIlII[D.lIllIIllI[0]] = D."Drop";
        D.lIllIIlII[D.lIllIIllI[4]] = D."Nav to bank";
        D.lIllIIlII[D.lIllIIllI[6]] = D."Handling banking";
        D.lIllIIlII[D.lIllIIllI[7]] = D."We are missing runes, switching to BUYING";
        D.lIllIIlII[D.lIllIIllI[16]] = D."We are missing quest supplies, switching to BUYING";
        D.lIllIIlII[D.lIllIIllI[13]] = D."Drink";
        D.lIllIIlII[D.lIllIIllI[17]] = D."Eat";
        D.lIllIIlII[D.lIllIIllI[20]] = D."King Bolren";
        D.lIllIIlII[D.lIllIIllI[25]] = D."Nav to commander";
        D.lIllIIlII[D.lIllIIllI[21]] = D."Commander Montai";
        D.lIllIIlII[D.lIllIIllI[27]] = D."Nav to tracker";
        D.lIllIIlII[D.lIllIIllI[28]] = D."Door";
        D.lIllIIlII[D.lIllIIllI[2]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[29]] = D."Door";
        D.lIllIIlII[D.lIllIIllI[30]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[31]] = D."Door";
        D.lIllIIlII[D.lIllIIllI[32]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[33]] = D."Tracker gnome 2";
        D.lIllIIlII[D.lIllIIllI[35]] = D."Nav to tracker";
        D.lIllIIlII[D.lIllIIllI[36]] = D."Tracker gnome 1";
        D.lIllIIlII[D.lIllIIllI[38]] = D."Nav to tracker";
        D.lIllIIlII[D.lIllIIllI[39]] = D."Tracker gnome 3";
        D.lIllIIlII[D.lIllIIllI[40]] = D."Nav to ballista";
        D.lIllIIlII[D.lIllIIllI[41]] = D."Firing";
        D.lIllIIlII[D.lIllIIllI[42]] = D."Ballista";
        D.lIllIIlII[D.lIllIIllI[43]] = D."Fire";
        D.lIllIIlII[D.lIllIIllI[45]] = D."0001";
        D.lIllIIlII[D.lIllIIllI[46]] = D."0002";
        D.lIllIIlII[D.lIllIIllI[47]] = D."0003";
        D.lIllIIlII[D.lIllIIllI[48]] = D."0004";
        D.lIllIIlII[D.lIllIIllI[55]] = D."Nav to crumble";
        D.lIllIIlII[D.lIllIIllI[56]] = D."Crumbled wall";
        D.lIllIIlII[D.lIllIIllI[57]] = D."Climb-over";
        D.lIllIIlII[D.lIllIIllI[60]] = D."Door";
        D.lIllIIlII[D.lIllIIllI[61]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[62]] = D."Door";
        D.lIllIIlII[D.lIllIIllI[63]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[64]] = D."Door";
        D.lIllIIlII[D.lIllIIllI[65]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[66]] = D."Ladder";
        D.lIllIIlII[D.lIllIIllI[67]] = D."Climb-up";
        D.lIllIIlII[D.lIllIIllI[68]] = D."Ladder";
        D.lIllIIlII[D.lIllIIllI[69]] = D."Climb-up";
        D.lIllIIlII[D.lIllIIllI[70]] = D."Grab orb";
        D.lIllIIlII[D.lIllIIllI[3]] = D."Closed chest";
        D.lIllIIlII[D.lIllIIllI[71]] = D."Closed chest";
        D.lIllIIlII[D.lIllIIllI[72]] = D."Open";
        D.lIllIIlII[D.lIllIIllI[73]] = D."Open chest";
        D.lIllIIlII[D.lIllIIllI[74]] = D."Open chest";
        D.lIllIIlII[D.lIllIIllI[24]] = D."Search";
        D.lIllIIlII[D.lIllIIllI[75]] = D."King Bolren";
        D.lIllIIlII[D.lIllIIllI[76]] = D."Travel to final fight";
        D.lIllIIlII[D.lIllIIllI[77]] = D."Khazard warlord";
        D.lIllIIlII[D.lIllIIllI[78]] = D."Attack";
        D.lIllIIlII[D.lIllIIllI[79]] = D."Khazard warlord";
        D.lIllIIlII[D.lIllIIllI[80]] = D."Attack";
        D.lIllIIlII[D.lIllIIllI[81]] = D."Handle fight";
        D.lIllIIlII[D.lIllIIllI[82]] = D."Drink";
        D.lIllIIlII[D.lIllIIllI[83]] = D."Orbs of protection";
        D.lIllIIlII[D.lIllIIllI[84]] = D."Taking orbs";
        D.lIllIIlII[D.lIllIIllI[85]] = D."Orbs of protection";
        D.lIllIIlII[D.lIllIIllI[86]] = D."Take";
        D.lIllIIlII[D.lIllIIllI[87]] = D."Orbs of protection";
        D.lIllIIlII[D.lIllIIllI[88]] = D."King Bolren";
        D.lIllIIlII[D.lIllIIllI[89]] = D."Nav to start";
        D.lIllIIlII[D.lIllIIllI[100]] = D."Castle Wars";
        D.lIllIIlII[D.lIllIIllI[101]] = D."Loose Railing";
        D.lIllIIlII[D.lIllIIllI[102]] = D."Squeeze-through";
        D.lIllIIlII[D.lIllIIllI[109]] = D."Tree Gnome Village";
        D.lIllIIlII[D.lIllIIllI[110]] = D."ring of wealth (";
        D.lIllIIlII[D.lIllIIllI[111]] = D."trooper";
        D.lIllIIlII[D.lIllIIllI[130]] = D."Can I help at all?";
        D.lIllIIlII[D.lIllIIllI[131]] = D."I would be glad to help.";
        D.lIllIIlII[D.lIllIIllI[132]] = D."Ok, I'll gather some wood.";
        D.lIllIIlII[D.lIllIIllI[133]] = D."I'll try my best.";
        D.lIllIIlII[D.lIllIIllI[134]] = D."I will find the warlord and bring back the orbs.";
        D.lIllIIlII[D.lIllIIllI[135]] = D."Yes.";
    }

    private static boolean lIIlIlllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        D.lIIlIllIlIll();
        D.lIIlIllIlIlI();
        dK = new WorldPoint(lIllIIllI[112], lIllIIllI[113], lIllIIllI[1]);
        dL = new WorldPoint(lIllIIllI[114], lIllIIllI[115], lIllIIllI[1]);
        dM = new WorldPoint(lIllIIllI[116], lIllIIllI[117], lIllIIllI[1]);
        dN = new WorldPoint(lIllIIllI[118], lIllIIllI[119], lIllIIllI[1]);
        dO = new WorldPoint(lIllIIllI[120], lIllIIllI[121], lIllIIllI[1]);
        dP = new WorldPoint(lIllIIllI[122], lIllIIllI[123], lIllIIllI[1]);
        dQ = new WorldPoint(lIllIIllI[124], lIllIIllI[125], lIllIIllI[1]);
        dR = new WorldPoint(lIllIIllI[124], lIllIIllI[126], lIllIIllI[1]);
        dS = new WorldPoint(lIllIIllI[127], lIllIIllI[54], lIllIIllI[1]);
        dT = new WorldPoint(lIllIIllI[128], lIllIIllI[129], lIllIIllI[1]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIllIIllI[13]];
        stringArray[D.lIllIIllI[1]] = lIllIIlII[lIllIIllI[130]];
        stringArray[D.lIllIIllI[0]] = lIllIIlII[lIllIIllI[131]];
        stringArray[D.lIllIIllI[4]] = lIllIIlII[lIllIIllI[132]];
        stringArray[D.lIllIIllI[6]] = lIllIIlII[lIllIIllI[133]];
        stringArray[D.lIllIIllI[7]] = lIllIIlII[lIllIIllI[134]];
        stringArray[D.lIllIIllI[16]] = lIllIIlII[lIllIIllI[135]];
        bR = stringArray;
        dU = lIllIIllI[136];
        dV = new WorldArea(lIllIIllI[137], lIllIIllI[113], lIllIIllI[21], lIllIIllI[13], lIllIIllI[1]);
        dW = new WorldArea(lIllIIllI[138], lIllIIllI[139], lIllIIllI[48], lIllIIllI[30], lIllIIllI[1]);
    }

    private static boolean lIIlIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIllIl(int n2) {
        return n2 != 0;
    }

    private static int lIIlIllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIlllllII(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean S() {
        return lIllIIllI[1];
    }

    private static boolean lIIlIllllIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIlllIIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIlllIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public String U() {
        return lIllIIlII[lIllIIllI[109]];
    }

    private static void lIIlIllIlIll() {
        lIllIIllI = new int[141];
        D.lIllIIllI[0] = 1;
        D.lIllIIllI[1] = (0x2A ^ 0x7E ^ (0x4B ^ 0x40)) & (13 + 244 - 207 + 197 ^ 100 + 51 - 113 + 130 ^ -1);
        D.lIllIIllI[2] = 0xB1 ^ 0xBC;
        D.lIllIIllI[3] = 0x74 ^ 0x21 ^ (0x52 ^ 0x2A);
        D.lIllIIllI[4] = 2;
        D.lIllIIllI[5] = 0xFFFFFB89 & 0x17FE;
        D.lIllIIllI[6] = 3;
        D.lIllIIllI[7] = 0xBE ^ 0xBA;
        D.lIllIIllI[8] = -(0xFFFFFFC5 & 0x4DFB) & (0xFFFFDFEE & 0x6FFF);
        D.lIllIIllI[9] = -(0xFFFFBF17 & 0x4CEE) & (0xFFFFEFEF & 0x1FFD);
        D.lIllIIllI[10] = -(0xFFFF9EC7 & 0x79FB) & (0xFFFF9AFF & 0x7FEF);
        D.lIllIIllI[11] = -(0xFFFFF41E & 0x6BF7) & (0xFFFFEF3F & 0x72FF);
        D.lIllIIllI[12] = -(0xFFFFDCBB & 0x7B4D) & (0xFFFFFDFF & 0x5FEF);
        D.lIllIIllI[13] = 2 + 30 - -27 + 89 ^ 110 + 84 - 97 + 49;
        D.lIllIIllI[14] = 0xFFFFBF4F & 0x5FF7;
        D.lIllIIllI[15] = -(0xFFFFE0FF & 0x7F55) & (0xFFFFEFF6 & 0x79DF);
        D.lIllIIllI[16] = 0x79 ^ 0x7C;
        D.lIllIIllI[17] = 0x85 ^ 0xAD ^ (8 ^ 0x27);
        D.lIllIIllI[18] = -(0xFFFFDE8B & 0x6377) & (0xFFFFF3D3 & 0x7F7F);
        D.lIllIIllI[19] = 0xFFFFB77F & 0x49FB;
        D.lIllIIllI[20] = 0x6D ^ 0x65;
        D.lIllIIllI[21] = 0xB3 ^ 0xB9;
        D.lIllIIllI[22] = -(0xFFFFEA87 & 0x5F7A) & (0xFFFFFFFD & 0x4BF7);
        D.lIllIIllI[23] = 0xFFFFC5FE & 0x3FDD;
        D.lIllIIllI[24] = 0x3C ^ 0xE;
        D.lIllIIllI[25] = 0x9C ^ 0xAB ^ (0xAF ^ 0x91);
        D.lIllIIllI[26] = -(0xFFFFDF93 & 0x3DEF) & (0xFFFF9FDA & Short.MAX_VALUE);
        D.lIllIIllI[27] = 164 + 131 - 104 + 13 ^ 26 + 7 - -160 + 6;
        D.lIllIIllI[28] = 0x32 ^ 0x75 ^ (0x58 ^ 0x13);
        D.lIllIIllI[29] = 0x7F ^ 0x7A ^ (0x34 ^ 0x3F);
        D.lIllIIllI[30] = 136 + 80 - 92 + 43 ^ 84 + 23 - -16 + 45;
        D.lIllIIllI[31] = 18 + 5 - -62 + 51 ^ 37 + 123 - 82 + 74;
        D.lIllIIllI[32] = 178 + 26 - 18 + 24 ^ 17 + 93 - -36 + 49;
        D.lIllIIllI[33] = 0x4F ^ 0x5D;
        D.lIllIIllI[34] = -(0xFFFFFD2F & 0x77F9) & (0xFFFFFF7F & 0x77FF);
        D.lIllIIllI[35] = 0xDA ^ 0x8F ^ (0x78 ^ 0x3E);
        D.lIllIIllI[36] = 0x43 ^ 0x57;
        D.lIllIIllI[37] = -(0xFFFFDB73 & 0x7CAF) & (0xFFFFDF7B & 0x7AFF);
        D.lIllIIllI[38] = 0x93 ^ 0x8B ^ (0x57 ^ 0x5A);
        D.lIllIIllI[39] = 0x3D ^ 0x2B;
        D.lIllIIllI[40] = 0xE7 ^ 0xA6 ^ (0xDA ^ 0x8C);
        D.lIllIIllI[41] = 0x33 ^ 0x2B;
        D.lIllIIllI[42] = 0x25 ^ 0x3C;
        D.lIllIIllI[43] = 0xCD ^ 0x9B ^ (3 ^ 0x4F);
        D.lIllIIllI[44] = -(0xFFFFF9DF & 0x7FA6) & (0xFFFFFBDF & Short.MAX_VALUE);
        D.lIllIIllI[45] = 0x73 ^ 0x68;
        D.lIllIIllI[46] = 6 + 47 - -81 + 10 ^ 13 + 81 - 40 + 86;
        D.lIllIIllI[47] = 0x7E ^ 0x63;
        D.lIllIIllI[48] = 0x53 ^ 0x4D;
        D.lIllIIllI[49] = -(0xFFFFD727 & 0x7CFD) & (0xFFFFDFEF & 0x7DFD);
        D.lIllIIllI[50] = 0xFFFF8DBF & 0x7EF6;
        D.lIllIIllI[51] = -(0xFFFFFA9F & 0x776C) & (0xFFFFFBCF & Short.MAX_VALUE);
        D.lIllIIllI[52] = 0xFFFFECB3 & 0x1FFF;
        D.lIllIIllI[53] = 0xFFFFADEE & 0x5BD7;
        D.lIllIIllI[54] = 0xFFFF8FF7 & 0x7CBD;
        D.lIllIIllI[55] = 0xA2 ^ 0xBD;
        D.lIllIIllI[56] = 0x23 ^ 3;
        D.lIllIIllI[57] = 0xDA ^ 0xBF ^ (0x7C ^ 0x38);
        D.lIllIIllI[58] = -(0xFFFFF43D & 0x3FE7) & (0xFFFFBFEF & 0x7DFF);
        D.lIllIIllI[59] = -(0xFFFFEB6F & 0x76D3) & (0xFFFFFFFB & 0x6EFF);
        D.lIllIIllI[60] = 153 + 71 - 85 + 39 ^ 62 + 22 - 26 + 86;
        D.lIllIIllI[61] = 0x5C ^ 0x49 ^ (0xA7 ^ 0x91);
        D.lIllIIllI[62] = 0x2E ^ 0x16 ^ (0x1C ^ 0);
        D.lIllIIllI[63] = 0x35 ^ 0x1D ^ (0x8F ^ 0x82);
        D.lIllIIllI[64] = 0x72 ^ 0x54;
        D.lIllIIllI[65] = 0x92 ^ 0xB5;
        D.lIllIIllI[66] = 21 + 90 - 44 + 75 ^ 131 + 140 - 174 + 69;
        D.lIllIIllI[67] = 0x50 ^ 0x46 ^ (0x30 ^ 0xF);
        D.lIllIIllI[68] = 0x78 ^ 0x5D ^ (0x5C ^ 0x53);
        D.lIllIIllI[69] = 0xE ^ 0x25;
        D.lIllIIllI[70] = 0xD6 ^ 0x86 ^ (0xC ^ 0x70);
        D.lIllIIllI[71] = 0x73 ^ 0xB ^ (0xFB ^ 0xAD);
        D.lIllIIllI[72] = 7 ^ 0x28;
        D.lIllIIllI[73] = 0xB7 ^ 0x87;
        D.lIllIIllI[74] = 0x45 ^ 0x17 ^ (0xDE ^ 0xBD);
        D.lIllIIllI[75] = 47 + 45 - 50 + 113 ^ 38 + 96 - 94 + 128;
        D.lIllIIllI[76] = 0x57 ^ 0x63;
        D.lIllIIllI[77] = (0x2E ^ 0x22) & ~(0x9F ^ 0x93) ^ (0x92 ^ 0xA7);
        D.lIllIIllI[78] = 0x27 ^ 0x72 ^ (0x69 ^ 0xA);
        D.lIllIIllI[79] = 0x37 ^ 0;
        D.lIllIIllI[80] = 0x97 ^ 0xAF;
        D.lIllIIllI[81] = 0x42 ^ 0x7B;
        D.lIllIIllI[82] = 0x60 ^ 0x5A;
        D.lIllIIllI[83] = 0x3E ^ 5;
        D.lIllIIllI[84] = 0xFD ^ 0xC1;
        D.lIllIIllI[85] = 0xAC ^ 0x91;
        D.lIllIIllI[86] = 3 ^ 0x3D;
        D.lIllIIllI[87] = 0xF5 ^ 0x85 ^ (0x32 ^ 0x7D);
        D.lIllIIllI[88] = 0x35 ^ 0x75;
        D.lIllIIllI[89] = 0xBA ^ 0x8E ^ (0xCD ^ 0xB8);
        D.lIllIIllI[90] = -(0xFFFFFAEF & 0x5795) & (0xFFFFDBEE & 0x7FF7);
        D.lIllIIllI[91] = -(0xFFFFFE9B & 0x656F) & (0xFFFFFFFE & 0x6FFB);
        D.lIllIIllI[92] = 108 + 144 - 226 + 204;
        D.lIllIIllI[93] = (5 ^ 0x42) + (0xDB ^ 0xBD) - (0x7F ^ 0x2C) + (0x24 ^ 0x64);
        D.lIllIIllI[94] = -(0xFFFFE47F & 0x5F91) & (0xFFFFCDF7 & 0x7FFB);
        D.lIllIIllI[95] = -(0xFFFFC6A1 & 0x79FF) & (0xFFFFFCFB & 0x4FF7);
        D.lIllIIllI[96] = -(0xFFFFF7FF & 0x2C09) & (0xFFFFADFF & 0x7FDF);
        D.lIllIIllI[97] = 0xFFFFEF5B & 0x1CF6;
        D.lIllIIllI[98] = 0xFFFFF9F2 & 0xFDF;
        D.lIllIIllI[99] = -(0xFFFFBF6A & 0x719F) & (0xFFFFFDFF & 0x3F5D);
        D.lIllIIllI[100] = 0x56 ^ 0x14;
        D.lIllIIllI[101] = 8 + 160 - -24 + 63 ^ 175 + 98 - 189 + 104;
        D.lIllIIllI[102] = 236 + 52 - 204 + 155 ^ 114 + 170 - 204 + 91;
        D.lIllIIllI[103] = (0x21 ^ 0x6D) + (0xA6 ^ 0x88) - -(0x65 ^ 0x43) + (0x65 ^ 0x4D);
        D.lIllIIllI[104] = 0xFFFFBFDD & 0x6EEE;
        D.lIllIIllI[105] = 0xFFFFE7B9 & 0x79EE;
        D.lIllIIllI[106] = -(0xF5 ^ 0x94) & (0xFFFFBEFD & 0x7BFA);
        D.lIllIIllI[107] = 0xFFFF97AC & 0x6BD7;
        D.lIllIIllI[108] = 0x63 ^ 0x22 ^ (0xAA ^ 0x8F);
        D.lIllIIllI[109] = 0xEE ^ 0xAB;
        D.lIllIIllI[110] = 0x85 ^ 0xC3;
        D.lIllIIllI[111] = 4 ^ 0x43;
        D.lIllIIllI[112] = -(0xFFFFFE5B & 0x33B5) & (0xFFFFFFFF & 0x3BFB);
        D.lIllIIllI[113] = 0xFFFF9CFF & 0x6F5F;
        D.lIllIIllI[114] = 0xFFFFD9DF & 0x2FF8;
        D.lIllIIllI[115] = -(0xFFFFBB69 & 0x45FF) & (0xFFFFDDFF & 0x2FEF);
        D.lIllIIllI[116] = 0xFFFFE9FC & 0x1FDF;
        D.lIllIIllI[117] = -(0xFFFFFFEF & 0x4318) & (0xFFFFEFBF & 0x5FFF);
        D.lIllIIllI[118] = -(0xFFFFF767 & 0x3ABA) & (0xFFFFBBFF & Short.MAX_VALUE);
        D.lIllIIllI[119] = 0xFFFFEDB5 & 0x1EFE;
        D.lIllIIllI[120] = -(0xFFFF9E3D & 0x67FF) & (0xFFFFCFFF & 0x3FFF);
        D.lIllIIllI[121] = 0xFFFF9FBE & 0x6CFD;
        D.lIllIIllI[122] = 0xFFFF8FEA & 0x79D5;
        D.lIllIIllI[123] = 0xFFFFADA7 & 0x5EFC;
        D.lIllIIllI[124] = 0xFFFFBBCF & 0x4DFE;
        D.lIllIIllI[125] = 0xFFFFBE9B & 0x4DED;
        D.lIllIIllI[126] = 0xFFFF8EB6 & 0x7DFB;
        D.lIllIIllI[127] = 0xFFFFA9EF & 0x5FD7;
        D.lIllIIllI[128] = -(0xFFFFBE67 & 0x67B9) & (0xFFFFAFFF & 0x7FBA);
        D.lIllIIllI[129] = 0xFFFF8FFA & 0x7CE7;
        D.lIllIIllI[130] = 26 + 59 - -129 + 20 ^ 107 + 143 - 127 + 39;
        D.lIllIIllI[131] = 126 + 23 - -83 + 17 ^ 15 + 108 - 42 + 95;
        D.lIllIIllI[132] = 0xD1 ^ 0x9B;
        D.lIllIIllI[133] = 0xA0 ^ 0x88 ^ (0x64 ^ 7);
        D.lIllIIllI[134] = 45 + 172 - 83 + 96 ^ 149 + 160 - 213 + 74;
        D.lIllIIllI[135] = 111 + 69 - 165 + 207 ^ 31 + 132 - 115 + 99;
        D.lIllIIllI[136] = 0x2E ^ 0x68 ^ (0x1B ^ 0x32);
        D.lIllIIllI[137] = -(0xFFFFADF6 & 0x720F) & (0xFFFFEFFF & 0x39EF);
        D.lIllIIllI[138] = 0xFFFFCBD9 & 0x3DF7;
        D.lIllIIllI[139] = 0xFFFFBCD9 & 0x4F7F;
        D.lIllIIllI[140] = 0x93 ^ 0xA4 ^ (0xD8 ^ 0xA1);
    }

    private static boolean lIIlIlllIIIl(Object object) {
        return object != null;
    }

    private static void af() {
        block33: {
            d llIllIllIlIlII;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                Object llIllIllIlIlIl;
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[lIllIIllI[0]];
                                                        nArray[D.lIllIIllI[1]] = lIllIIllI[12];
                                                        if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[lIllIIllI[0]];
                                                        nArray2[D.lIllIIllI[1]] = lIllIIllI[12];
                                                        if (!D.lIIlIllIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[lIllIIllI[0]];
                                                        nArray3[D.lIllIIllI[1]] = lIllIIllI[12];
                                                        if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIllIIllI[13])) break block23;
                                                    }
                                                    llIllIllIlIlIl = new d(lIllIIllI[12], lIllIIllI[13], lIllIIllI[103]);
                                                    bv.add((d)llIllIllIlIlIl);
                                                    0;
                                                }
                                                if (D.lIIlIllIllll(Bank.contains((Predicate)(llIllIllIlIlIl = item -> item.getName().toLowerCase().contains(lIllIIlII[lIllIIllI[110]]))) ? 1 : 0)) {
                                                    llIllIllIlIlII = new d(lIllIIllI[104], lIllIIllI[16], lIllIIllI[105]);
                                                    bv.add(llIllIllIlIlII);
                                                    0;
                                                }
                                                int[] nArray = new int[lIllIIllI[0]];
                                                nArray[D.lIllIIllI[1]] = lIllIIllI[15];
                                                if (D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[lIllIIllI[0]];
                                                    nArray4[D.lIllIIllI[1]] = lIllIIllI[15];
                                                    if (D.lIIlIllIlllI(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIllI[7])) {
                                                        int[] nArray5 = new int[lIllIIllI[0]];
                                                        nArray5[D.lIllIIllI[1]] = lIllIIllI[15];
                                                        llIllIllIlIlII = new d(lIllIIllI[15], lIllIIllI[7] - Bank.getFirst((int[])nArray5).getQuantity(), lIllIIllI[106]);
                                                        bv.add(llIllIllIlIlII);
                                                        0;
                                                    }
                                                }
                                                int[] nArray6 = new int[lIllIIllI[0]];
                                                nArray6[D.lIllIIllI[1]] = lIllIIllI[10];
                                                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                                int[] nArray7 = new int[lIllIIllI[0]];
                                                nArray7[D.lIllIIllI[1]] = lIllIIllI[10];
                                                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block25;
                                                int[] nArray8 = new int[lIllIIllI[0]];
                                                nArray8[D.lIllIIllI[1]] = lIllIIllI[10];
                                                if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray8).getQuantity(), lIllIIllI[9])) break block25;
                                            }
                                            llIllIllIlIlII = new d(lIllIIllI[10], lIllIIllI[9], lIllIIllI[21]);
                                            bv.add(llIllIllIlIlII);
                                            0;
                                        }
                                        int[] nArray = new int[lIllIIllI[0]];
                                        nArray[D.lIllIIllI[1]] = lIllIIllI[8];
                                        if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray9 = new int[lIllIIllI[0]];
                                        nArray9[D.lIllIIllI[1]] = lIllIIllI[8];
                                        if (!D.lIIlIllIllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block27;
                                        int[] nArray10 = new int[lIllIIllI[0]];
                                        nArray10[D.lIllIIllI[1]] = lIllIIllI[8];
                                        if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray10).getQuantity(), lIllIIllI[9])) break block27;
                                    }
                                    llIllIllIlIlII = new d(lIllIIllI[8], lIllIIllI[9], lIllIIllI[21]);
                                    bv.add(llIllIllIlIlII);
                                    0;
                                }
                                int[] nArray = new int[lIllIIllI[0]];
                                nArray[D.lIllIIllI[1]] = lIllIIllI[11];
                                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray11 = new int[lIllIIllI[0]];
                                nArray11[D.lIllIIllI[1]] = lIllIIllI[11];
                                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block29;
                                int[] nArray12 = new int[lIllIIllI[0]];
                                nArray12[D.lIllIIllI[1]] = lIllIIllI[11];
                                if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray12).getQuantity(), lIllIIllI[9])) break block29;
                            }
                            llIllIllIlIlII = new d(lIllIIllI[11], lIllIIllI[9], lIllIIllI[21]);
                            bv.add(llIllIllIlIlII);
                            0;
                        }
                        int[] nArray = new int[lIllIIllI[0]];
                        nArray[D.lIllIIllI[1]] = lIllIIllI[15];
                        if (D.lIIlIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIllIllIlIlII = new d(lIllIIllI[15], lIllIIllI[7], lIllIIllI[106]);
                            bv.add(llIllIllIlIlII);
                            0;
                        }
                        int[] nArray13 = new int[lIllIIllI[0]];
                        nArray13[D.lIllIIllI[1]] = lIllIIllI[18];
                        if (!D.lIIlIllIllIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[lIllIIllI[0]];
                        nArray14[D.lIllIIllI[1]] = lIllIIllI[18];
                        if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray14).getQuantity(), lIllIIllI[7])) break block31;
                    }
                    llIllIllIlIlII = new d(lIllIIllI[18], lIllIIllI[7], i.bq);
                    bv.add(llIllIllIlIlII);
                    0;
                }
                int[] nArray = new int[lIllIIllI[0]];
                nArray[D.lIllIIllI[1]] = lIllIIllI[14];
                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                int[] nArray15 = new int[lIllIIllI[0]];
                nArray15[D.lIllIIllI[1]] = lIllIIllI[14];
                if (!D.lIIlIllIllIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block33;
                int[] nArray16 = new int[lIllIIllI[0]];
                nArray16[D.lIllIIllI[1]] = lIllIIllI[14];
                if (!D.lIIlIllIlllI(Bank.getFirst((int[])nArray16).getQuantity(), lIllIIllI[30])) break block33;
            }
            llIllIllIlIlII = new d(lIllIIllI[14], lIllIIllI[66], lIllIIllI[107]);
            bv.add(llIllIllIlIlII);
            0;
        }
    }
}


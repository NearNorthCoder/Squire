/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class N
implements S {
    static /* synthetic */ int bS;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint ig;
    public static /* synthetic */ int if;
    private static /* synthetic */ String[] lllIllllII;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] lllIllllIl;
    public static /* synthetic */ List<d> bu;
    static /* synthetic */ int ck;

    private static String llIIlIlIIlIII(String var14, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lllIllllIl[3], var6);
            return new String(var22.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIllll(Object object) {
        return object != null;
    }

    private static void ae() {
        d var7;
        Object var13;
        block8: {
            block7: {
                int[] nArray = new int[lllIllllIl[1]];
                nArray[N.lllIllllIl[0]] = lllIllllIl[9];
                if (!N.llIIlIlIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[lllIllllIl[1]];
                nArray2[N.lllIllllIl[0]] = lllIllllIl[9];
                if (!N.llIIlIlIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block8;
                int[] nArray3 = new int[lllIllllIl[1]];
                nArray3[N.lllIllllIl[0]] = lllIllllIl[9];
                if (!N.llIIlIlIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIllllIl[10])) break block8;
            }
            var13 = new d(lllIllllIl[9], lllIllllIl[10], lllIllllIl[25]);
            bu.add((d)var13);
            0;
        }
        int[] nArray = new int[lllIllllIl[1]];
        nArray[N.lllIllllIl[0]] = lllIllllIl[12];
        if (N.llIIlIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var13 = new d(lllIllllIl[12], lllIllllIl[18], lllIllllIl[25]);
            bu.add((d)var13);
            0;
        }
        if (N.llIIlIlIIlllI(Bank.contains((Predicate)(var13 = item -> item.getName().toLowerCase().contains(lllIllllII[lllIllllIl[33]]))) ? 1 : 0)) {
            var7 = new d(lllIllllIl[26], lllIllllIl[8], lllIllllIl[27]);
            bu.add(var7);
            0;
        }
        int[] nArray4 = new int[lllIllllIl[1]];
        nArray4[N.lllIllllIl[0]] = lllIllllIl[13];
        if (N.llIIlIlIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var7 = new d(lllIllllIl[13], lllIllllIl[28], lllIllllIl[25]);
            bu.add(var7);
            0;
        }
        if (N.llIIlIlIIlllI(Bank.contains((int[])f.aU) ? 1 : 0)) {
            var7 = new d(lllIllllIl[29], lllIllllIl[8], i.bp);
            bu.add(var7);
            0;
        }
    }

    private static void llIIlIlIIlIlI() {
        lllIllllII = new String[lllIllllIl[32]];
        N.lllIllllII[N.lllIllllIl[0]] = N."Buying items";
        N.lllIllllII[N.lllIllllIl[1]] = N."Finished buying items, switching back to questing";
        N.lllIllllII[N.lllIllllIl[3]] = N."Drink";
        N.lllIllllII[N.lllIllllIl[5]] = N."Navigating to bank";
        N.lllIllllII[N.lllIllllIl[6]] = N."Opening bank";
        N.lllIllllII[N.lllIllllIl[8]] = N."Handling banking";
        N.lllIllllII[N.lllIllllIl[11]] = N."We are missing supplies, switching to BUYING";
        N.lllIllllII[N.lllIllllIl[14]] = N."We are missing supplies, switching to BUYING";
        N.lllIllllII[N.lllIllllIl[16]] = N."Nav to start";
        N.lllIllllII[N.lllIllllIl[17]] = N."Fred the Farmer";
        N.lllIllllII[N.lllIllllIl[18]] = N."Nav to start";
        N.lllIllllII[N.lllIllllIl[19]] = N."Fred the Farmer";
        N.lllIllllII[N.lllIllllIl[20]] = N."Talk-to";
        N.lllIllllII[N.lllIllllIl[22]] = N."I'm looking for a quest.";
        N.lllIllllII[N.lllIllllIl[23]] = N."Yes, okay. I can do that.";
        N.lllIllllII[N.lllIllllIl[24]] = N."Yes.";
        N.lllIllllII[N.lllIllllIl[31]] = N."Sheep shearer quest";
        N.lllIllllII[N.lllIllllIl[33]] = N."ring of wealth (";
        N.lllIllllII[N.lllIllllIl[36]] = N."I'm looking for a quest.";
        N.lllIllllII[N.lllIllllIl[37]] = N."Yes, okay. I can do that.";
        N.lllIllllII[N.lllIllllIl[10]] = N."Yes.";
    }

    private static String llIIlIlIIlIIl(String var20, String var24) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lllIllllIl[16]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lllIllllIl[3], var9);
            return new String(var12.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void dg() {
        List var18;
        if (N.llIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[lllIllllIl[1]];
            stringArray[N.lllIllllIl[0]] = lllIllllII[lllIllllIl[19]];
            List list = NPCs.getAll((String[])stringArray);
            if (N.llIIlIlIlIIII(list.size())) {
                ((NPC)list.get(lllIllllIl[0])).interact(lllIllllII[lllIllllIl[20]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIllllIl[21]);
                0;
            }
        }
        if (N.llIIlIlIIllII(Dialog.isOpen() ? 1 : 0) && N.llIIlIlIIllII(Dialog.isViewingOptions() ? 1 : 0) && N.llIIlIlIIlllI((var18 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
            int var23 = lllIllllIl[0];
            while (N.llIIlIlIIllIl(var23, var18.size())) {
                if (N.llIIlIlIIllII(((Widget)var18.get(var23)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIllllIl[1]];
                    stringArray[N.lllIllllIl[0]] = ((Widget)var18.get(var23)).getText();
                    Dialog.chooseOption((String[])stringArray);
                    0;
                    0;
                    if (2 < 3) break;
                    return;
                }
                if (N.llIIlIlIIllII(((Widget)var18.get(var23)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[23]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIllllIl[1]];
                    stringArray[N.lllIllllIl[0]] = ((Widget)var18.get(var23)).getText();
                    Dialog.chooseOption((String[])stringArray);
                    0;
                    0;
                    if (2 == 2) break;
                    return;
                }
                if (N.llIIlIlIIllII(((Widget)var18.get(var23)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIllllIl[1]];
                    stringArray[N.lllIllllIl[0]] = ((Widget)var18.get(var23)).getText();
                    Dialog.chooseOption((String[])stringArray);
                    0;
                    0;
                    if (3 >= 1) break;
                    return;
                }
                if (N.llIIlIlIIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
                    0;
                    if (-2 < 0) break;
                    return;
                }
                ++var23;
                0;
                if (((0x82 ^ 0xAB) & ~(9 ^ 0x20)) == 0) continue;
                return;
            }
        }
    }

    private static boolean llIIlIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIlIIllII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[32])) {
            bl = lllIllllIl[1];
            0;
            if (-(0x35 ^ 0x30) >= 0) {
                return (1 & ~1) != 0;
            }
        } else {
            bl = lllIllllIl[0];
        }
        return bl;
    }

    static {
        N.llIIlIlIIlIll();
        N.llIIlIlIIlIlI();
        bu = new ArrayList<d>();
        if = lllIllllIl[9];
        ig = new WorldPoint(lllIllllIl[34], lllIllllIl[35], lllIllllIl[0]);
        String[] stringArray = new String[lllIllllIl[5]];
        stringArray[N.lllIllllIl[0]] = lllIllllII[lllIllllIl[36]];
        stringArray[N.lllIllllIl[1]] = lllIllllII[lllIllllIl[37]];
        stringArray[N.lllIllllIl[3]] = lllIllllII[lllIllllIl[10]];
        bQ = stringArray;
    }

    private static boolean llIIlIlIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bz() {
        int n2;
        int[] nArray = new int[lllIllllIl[1]];
        nArray[N.lllIllllIl[0]] = lllIllllIl[9];
        if (N.llIIlIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllllIl[1]];
            nArray2[N.lllIllllIl[0]] = lllIllllIl[9];
            if (N.llIIlIlIlIlIl(Inventory.getAll((int[])nArray2).size(), lllIllllIl[10])) {
                n2 = lllIllllIl[1];
                0;
                if (null == null) return n2 != 0;
                return (3 & (3 ^ -1)) != 0;
            }
        }
        n2 = lllIllllIl[0];
        return n2 != 0;
    }

    private static String llIIlIlIIIlll(String var3, String var15) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var21 = var15.toCharArray();
        int var11 = lllIllllIl[0];
        char[] var16 = var3.toCharArray();
        int var17 = var16.length;
        int var2 = lllIllllIl[0];
        while (N.llIIlIlIIllIl(var2, var17)) {
            char var19 = var16[var2];
            var4.append((char)(var19 ^ var21[var11 % var21.length]));
            0;
            ++var11;
            ++var2;
            0;
            if (((135 + 0 - 70 + 118 ^ 83 + 115 - 118 + 73) & (22 + 50 - 38 + 127 ^ 29 + 19 - -52 + 43 ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean llIIlIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIlIlIIlIll() {
        lllIllllIl = new int[38];
        N.lllIllllIl[0] = (128 + 220 - 330 + 234 ^ 40 + 125 - 98 + 103) & (0xCE ^ 0x99 ^ 1 ^ -1);
        N.lllIllllIl[1] = 1;
        N.lllIllllIl[2] = 0x57 ^ 0x65;
        N.lllIllllIl[3] = 2;
        N.lllIllllIl[4] = (0x24 ^ 2) + (0x86 ^ 0xAD) - (0x3A ^ 0x7C) + (136 + 22 - -7 + 3);
        N.lllIllllIl[5] = 3;
        N.lllIllllIl[6] = 0x98 ^ 0x85 ^ (0x1B ^ 2);
        N.lllIllllIl[7] = 0xFFFF979A & 0x7BED;
        N.lllIllllIl[8] = 0x58 ^ 0x5D;
        N.lllIllllIl[9] = -(0xFFFFD92B & 0x7FF5) & (0xFFFFDFFF & Short.MAX_VALUE);
        N.lllIllllIl[10] = 142 + 72 - 74 + 35 ^ 3 + 11 - -27 + 146;
        N.lllIllllIl[11] = 15 + 128 - 141 + 182 ^ 147 + 148 - 209 + 104;
        N.lllIllllIl[12] = 0xFFFFDF59 & 0x3FEE;
        N.lllIllllIl[13] = 0xFFFFFF4F & 0x1FF7;
        N.lllIllllIl[14] = 123 + 77 - 79 + 58 ^ 90 + 103 - 175 + 162;
        N.lllIllllIl[15] = -(101 + 52 - 48 + 44) & (0xFFFFBFFD & 0x5FDF);
        N.lllIllllIl[16] = 0x39 ^ 0x31;
        N.lllIllllIl[17] = 0x48 ^ 0x41;
        N.lllIllllIl[18] = 0x99 ^ 0x93;
        N.lllIllllIl[19] = 80 + 62 - 108 + 100 ^ 57 + 57 - 58 + 85;
        N.lllIllllIl[20] = 0x6C ^ 0x60;
        N.lllIllllIl[21] = 0xFFFFAFB9 & 0x5BFE;
        N.lllIllllIl[22] = 0x8E ^ 0x83;
        N.lllIllllIl[23] = 108 + 59 - 98 + 118 ^ 28 + 28 - -119 + 6;
        N.lllIllllIl[24] = 0xAD ^ 0xA2;
        N.lllIllllIl[25] = 0xFFFFAF7D & 0x57EE;
        N.lllIllllIl[26] = 0xFFFFEFDE & 0x3EED;
        N.lllIllllIl[27] = 0xFFFFE5BD & 0x7BEA;
        N.lllIllllIl[28] = 132 + 68 - 141 + 99 ^ 27 + 70 - -39 + 46;
        N.lllIllllIl[29] = -(0xFFFFEE8B & 0x59FF) & (0xFFFFFFDB & 0x79FF);
        N.lllIllllIl[30] = 0xDF ^ 0xA1 ^ (0x63 ^ 0x79);
        N.lllIllllIl[31] = 0x85 ^ 0x98 ^ (0x8C ^ 0x81);
        N.lllIllllIl[32] = 0x95 ^ 0x80;
        N.lllIllllIl[33] = 0x6A ^ 0x7B;
        N.lllIllllIl[34] = 0xFFFFBCF7 & 0x4F7D;
        N.lllIllllIl[35] = -(0xFFFFFDCD & 0x333A) & (0xFFFFFDFF & 0x3FCF);
        N.lllIllllIl[36] = 0x6E ^ 0x7C;
        N.lllIllllIl[37] = 11 + 79 - 29 + 101 ^ 48 + 88 - 91 + 132;
    }

    @Override
    public String U() {
        return lllIllllII[lllIllllIl[31]];
    }

    private static boolean llIIlIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    public static void df() {
        block22: {
            block23: {
                BankLocation var1;
                block24: {
                    block26: {
                        block25: {
                            if (N.llIIlIlIIllII(bs ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[0]];
                                b.a(bu);
                                if (N.llIIlIlIIllIl(bu.size(), lllIllllIl[1])) {
                                    System.out.println(lllIllllII[lllIllllIl[1]]);
                                    bs = lllIllllIl[0];
                                }
                            }
                            if (!N.llIIlIlIIlllI(bs ? 1 : 0)) break block22;
                            if (N.llIIlIlIIllII(Inventory.contains((int[])f.aU) ? 1 : 0) && N.llIIlIlIIllIl(Movement.getRunEnergy(), lllIllllIl[2]) && N.llIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aU).interact(lllIllllII[lllIllllIl[3]]);
                                Time.sleepTicks((int)lllIllllIl[1]);
                                0;
                            }
                            if (!N.llIIlIlIIllIl(e.j(lllIllllIl[4]), lllIllllIl[1])) break block23;
                            if (!N.llIIlIlIIlllI(N.bz() ? 1 : 0)) break block24;
                            var1 = BankLocation.getNearest();
                            if (N.llIIlIlIIllll(var1) && N.llIIlIlIIlllI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[5]];
                                a.a(var1);
                            }
                            if (!N.llIIlIlIIllll(var1) || !N.llIIlIlIIllII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block24;
                            if (N.llIIlIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[6]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllllIl[7]);
                                0;
                            }
                            if (!N.llIIlIlIIllII(Bank.isOpen() ? 1 : 0)) break block24;
                            AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[8]];
                            if (N.llIIlIlIlIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIllllIl[5]);
                                0;
                            }
                            if (N.llIIlIlIlIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIllllIl[3]);
                                0;
                            }
                            int[] nArray = new int[lllIllllIl[1]];
                            nArray[N.lllIllllIl[0]] = lllIllllIl[9];
                            if (N.llIIlIlIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIllllIl[1]];
                                nArray2[N.lllIllllIl[0]] = lllIllllIl[9];
                                if (N.llIIlIlIIllIl(Bank.getFirst((int[])nArray2).getQuantity(), lllIllllIl[10])) {
                                    N.ae();
                                    System.out.println(lllIllllII[lllIllllIl[11]]);
                                    bs = lllIllllIl[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lllIllllIl[1]];
                            nArray3[N.lllIllllIl[0]] = lllIllllIl[9];
                            if (!N.llIIlIlIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[lllIllllIl[1]];
                            nArray4[N.lllIllllIl[0]] = lllIllllIl[12];
                            if (!N.llIIlIlIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                            int[] nArray5 = new int[lllIllllIl[1]];
                            nArray5[N.lllIllllIl[0]] = lllIllllIl[13];
                            if (!N.llIIlIlIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block26;
                        }
                        N.ae();
                        System.out.println(lllIllllII[lllIllllIl[14]]);
                        bs = lllIllllIl[1];
                        return;
                    }
                    Bank.withdraw((int)lllIllllIl[9], (int)lllIllllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Bank.withdraw((int)lllIllllIl[12], (int)lllIllllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Bank.withdraw((int)lllIllllIl[15], (int)lllIllllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    a.b(f.be, lllIllllIl[1]);
                }
                if (N.llIIlIlIIllII(N.bz() ? 1 : 0)) {
                    if (N.llIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        if (N.llIIlIlIIllIl(bS, lllIllllIl[1])) {
                            e.v();
                            bS += lllIllllIl[1];
                        }
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[16]];
                        Movement.walkTo((WorldPoint)ig);
                        0;
                    }
                    if (N.llIIlIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        String[] stringArray = new String[lllIllllIl[1]];
                        stringArray[N.lllIllllIl[0]] = lllIllllII[lllIllllIl[17]];
                        var1 = NPCs.getNearest((String[])stringArray);
                        if (N.llIIlIlIIllll(var1) && N.llIIlIlIlIIIl(var1.getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                            e.v();
                        }
                        if (N.llIIlIlIIllIl(ck, lllIllllIl[1])) {
                            ac.mM += lllIllllIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIllllIl[1];
                            ac.mM = lllIllllIl[0];
                            cl = lllIllllIl[0];
                        }
                        N.dg();
                    }
                }
            }
            if (!N.llIIlIlIlIIll(e.j(lllIllllIl[4]), lllIllllIl[1]) || N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[10])) {
                if (N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[1])) {
                    if (N.llIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[18]];
                        Movement.walkTo((WorldPoint)ig);
                        0;
                        Time.sleepTicks((int)lllIllllIl[1]);
                        0;
                    }
                    N.dg();
                }
                if (N.llIIlIlIlIlII(e.j(lllIllllIl[4]), lllIllllIl[10])) {
                    N.dg();
                }
            }
            g.a(new String[lllIllllIl[0]]);
        }
    }

    @Override
    public boolean S() {
        return lllIllllIl[0];
    }

    private static boolean llIIlIlIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIlIIlllI(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            N.df();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-3 > 0) {
            return (1 ^ 0x24 ^ (0x40 ^ 0x72)) & (0 ^ 8 ^ (0x66 ^ 0x79) ^ -1);
        }
        return lllIllllIl[30];
    }

    private static boolean llIIlIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }
}


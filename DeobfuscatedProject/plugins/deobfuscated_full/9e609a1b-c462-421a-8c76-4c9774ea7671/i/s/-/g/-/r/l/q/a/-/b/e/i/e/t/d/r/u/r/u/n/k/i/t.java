/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.u;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

public class t
implements M {
    private static /* synthetic */ String[] fE;
    static /* synthetic */ WorldPoint fD;
    static /* synthetic */ WorldPoint fy;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ String[] lIIIlllllIIll;
    public static /* synthetic */ List<d> bA;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ boolean fx;
    static /* synthetic */ WorldPoint fA;
    private final /* synthetic */ int fF = 0;
    static /* synthetic */ WorldPoint fC;
    static /* synthetic */ WorldPoint fz;
    private static final /* synthetic */ String fw;
    static /* synthetic */ WorldPoint fB;
    static /* synthetic */ WorldPoint fd;
    private static final /* synthetic */ HashMap<Integer, String> fv;
    static /* synthetic */ int co;
    private static /* synthetic */ int[] lIIIlllllIlll;
    public static /* synthetic */ boolean by;

    private static boolean lIlIIllIIllllII(int n2) {
        return n2 != 0;
    }

    public t() {
        this.fF = lIIIlllllIlll[0];
    }

    @Override
    public int Y() {
        try {
            t.bg();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x48 ^ 0x4C) < (0x1D ^ 0x19)) {
            return (0x36 ^ 0x27) & ~(0x1F ^ 0xE);
        }
        return lIIIlllllIlll[86];
    }

    private static void bh() {
        if (!t.lIlIIllIlIIIllI(fE) || t.lIlIIllIIlllllI(Vars.getBit((int)lIIIlllllIlll[70])) && t.lIlIIllIIlllllI(Vars.getBit((int)lIIIlllllIlll[71]))) {
            return;
        }
        String[] stringArray = new String[lIIIlllllIlll[10]];
        stringArray[t.lIIIlllllIlll[0]] = fv.get(Vars.getBit((int)lIIIlllllIlll[70]));
        stringArray[t.lIIIlllllIlll[1]] = fv.get(Vars.getBit((int)lIIIlllllIlll[71]));
        stringArray[t.lIIIlllllIlll[3]] = fv.get(Vars.getBit((int)lIIIlllllIlll[72]));
        stringArray[t.lIIIlllllIlll[5]] = fv.get(Vars.getBit((int)lIIIlllllIlll[73]));
        stringArray[t.lIIIlllllIlll[4]] = fv.get(Vars.getBit((int)lIIIlllllIlll[74]));
        fE = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lIIIlllllIIll[lIIIlllllIlll[75]], fE);
        System.out.println(string);
    }

    private static boolean lIlIIllIlIIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllIlIIIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var15;
        int[] nArray = new int[lIIIlllllIlll[3]];
        nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
        nArray[t.lIIIlllllIlll[1]] = lIIIlllllIlll[8];
        int[] nArray2 = nArray;
        int var8 = lIIIlllllIlll[0];
        while (t.lIlIIllIIllllIl(var8, ((void)var15).length)) {
            int[] nArray3 = new int[lIIIlllllIlll[1]];
            nArray3[t.lIIIlllllIlll[0]] = var15[var8];
            if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllllIlll[0];
            }
            ++var8;
            0;
            if ((2 + 16 - 17 + 163 ^ 66 + 14 - 48 + 128) == (0x67 ^ 0x16 ^ (0xFD ^ 0x88))) continue;
            return ((0x6A ^ 0x1B ^ (0x68 ^ 0x5B)) & (0xF ^ 0x3A ^ (0xE9 ^ 0x9E) ^ -1)) != 0;
        }
        return lIIIlllllIlll[1];
    }

    @Override
    public String Z() {
        return lIIIlllllIIll[lIIIlllllIlll[87]];
    }

    private static String lIlIIllIIlIIlII(String var27, String var7) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIIIlllllIlll[3], var12);
            return new String(var10.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIIlIIIlI(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var19.toCharArray();
        int var16 = lIIIlllllIlll[0];
        char[] var21 = var18.toCharArray();
        int var5 = var21.length;
        int var25 = lIIIlllllIlll[0];
        while (t.lIlIIllIIllllIl(var25, var5)) {
            char var20 = var21[var25];
            var22.append((char)(var20 ^ var23[var16 % var23.length]));
            0;
            ++var16;
            ++var25;
            0;
            if (((33 + 119 - 8 + 98 ^ 95 + 76 - 26 + 52) & (0x74 ^ 0x4D ^ (0xA ^ 4) ^ -1)) < 3) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (t.lIlIIllIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[5])) {
            bl = lIIIlllllIlll[1];
            0;
            if (-1 > 2) {
                return ((0xFB ^ 0xBD ^ (4 ^ 0x17)) & (203 + 103 - 297 + 242 ^ 115 + 26 - 98 + 131 ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllllIlll[0];
        }
        return bl;
    }

    static {
        t.lIlIIllIIlllIlI();
        t.lIlIIllIIlIllll();
        fw = lIIIlllllIIll[lIIIlllllIlll[90]];
        fv = new u();
        bA = new ArrayList<d>();
        fd = new WorldPoint(lIIIlllllIlll[91], lIIIlllllIlll[92], lIIIlllllIlll[0]);
        fy = new WorldPoint(lIIIlllllIlll[93], lIIIlllllIlll[94], lIIIlllllIlll[0]);
        fz = new WorldPoint(lIIIlllllIlll[93], lIIIlllllIlll[95], lIIIlllllIlll[3]);
        fA = new WorldPoint(lIIIlllllIlll[96], lIIIlllllIlll[97], lIIIlllllIlll[0]);
        fB = new WorldPoint(lIIIlllllIlll[96], lIIIlllllIlll[98], lIIIlllllIlll[0]);
        fC = new WorldPoint(lIIIlllllIlll[99], lIIIlllllIlll[100], lIIIlllllIlll[1]);
        fD = new WorldPoint(lIIIlllllIlll[101], lIIIlllllIlll[102], lIIIlllllIlll[0]);
        String[] stringArray = new String[lIIIlllllIlll[31]];
        stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[103]];
        stringArray[t.lIIIlllllIlll[1]] = lIIIlllllIIll[lIIIlllllIlll[104]];
        stringArray[t.lIIIlllllIlll[3]] = lIIIlllllIIll[lIIIlllllIlll[105]];
        stringArray[t.lIIIlllllIlll[5]] = lIIIlllllIIll[lIIIlllllIlll[106]];
        stringArray[t.lIIIlllllIlll[4]] = lIIIlllllIIll[lIIIlllllIlll[107]];
        stringArray[t.lIIIlllllIlll[10]] = lIIIlllllIIll[lIIIlllllIlll[108]];
        stringArray[t.lIIIlllllIlll[16]] = lIIIlllllIIll[lIIIlllllIlll[109]];
        stringArray[t.lIIIlllllIlll[18]] = lIIIlllllIIll[lIIIlllllIlll[110]];
        stringArray[t.lIIIlllllIlll[19]] = lIIIlllllIIll[lIIIlllllIlll[111]];
        stringArray[t.lIIIlllllIlll[20]] = lIIIlllllIIll[lIIIlllllIlll[112]];
        stringArray[t.lIIIlllllIlll[12]] = lIIIlllllIIll[lIIIlllllIlll[113]];
        stringArray[t.lIIIlllllIlll[23]] = lIIIlllllIIll[lIIIlllllIlll[114]];
        stringArray[t.lIIIlllllIlll[25]] = lIIIlllllIIll[lIIIlllllIlll[115]];
        stringArray[t.lIIIlllllIlll[26]] = lIIIlllllIIll[lIIIlllllIlll[116]];
        stringArray[t.lIIIlllllIlll[27]] = lIIIlllllIIll[lIIIlllllIlll[117]];
        stringArray[t.lIIIlllllIlll[28]] = lIIIlllllIIll[lIIIlllllIlll[118]];
        stringArray[t.lIIIlllllIlll[29]] = lIIIlllllIIll[lIIIlllllIlll[119]];
        stringArray[t.lIIIlllllIlll[30]] = lIIIlllllIIll[lIIIlllllIlll[120]];
        bW = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static void bi() {
        void var4;
        BankLocation bankLocation = BankLocation.getNearest();
        if (t.lIlIIllIIllllll(bankLocation) && t.lIlIIllIIlllllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[76]];
            a.a(bankLocation);
        }
        if (t.lIlIIllIIllllll(var4) && t.lIlIIllIIllllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllIlll[2]);
                0;
                Time.sleepTicks((int)lIIIlllllIlll[5]);
                0;
            }
            if (t.lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[77]];
                if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllllIlll[1]];
                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0) && t.lIlIIllIlIIIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIIlllllIlll[4]);
                        0;
                    }
                }
                if (t.lIlIIllIlIIIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllllIlll[3]);
                    0;
                }
                if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllllIlll[1]];
                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                        a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                        a.a(lIIIlllllIlll[48], lIIIlllllIlll[1]);
                        a.a(lIIIlllllIlll[24], lIIIlllllIlll[1]);
                        a.a(lIIIlllllIlll[46], lIIIlllllIlll[1]);
                        Time.sleepTicks((int)lIIIlllllIlll[1]);
                        0;
                        int[] nArray2 = new int[lIIIlllllIlll[1]];
                        nArray2[t.lIIIlllllIlll[0]] = lIIIlllllIlll[11];
                        if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lIIIlllllIlll[78], lIIIlllllIlll[1]);
                        }
                        a.a(lIIIlllllIlll[17], Inventory.getFreeSlots() - lIIIlllllIlll[1]);
                    }
                }
                if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                    int[] nArray = new int[lIIIlllllIlll[1]];
                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                    if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (t.lIlIIllIIlllllI(Equipment.contains((int[])f.aW) ? 1 : 0) && t.lIlIIllIIlllllI(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            a.b(f.aW, lIIIlllllIlll[1]);
                        }
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aW).interact(lIIIlllllIIll[lIIIlllllIlll[79]]);
                            Time.sleepTicks((int)lIIIlllllIlll[5]);
                            0;
                        }
                        if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIlllllIlll[10]);
                            0;
                        }
                        if (t.lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                            a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                            a.a(lIIIlllllIlll[7], lIIIlllllIlll[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIIlllllI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean X() {
        return lIIIlllllIlll[0];
    }

    private static boolean lIlIIllIlIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIlIIIIIl(int n2) {
        return n2 < 0;
    }

    private static int lIlIIllIIlllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllIlIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIlIIllIIlIIIll(String var1, String var3) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIIlllllIlll[19]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIIIlllllIlll[3], var26);
            return new String(var17.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIIlIllll() {
        lIIIlllllIIll = new String[lIIIlllllIlll[121]];
        t.lIIIlllllIIll[t.lIIIlllllIlll[0]] = t."Finished buying items, switching back to quest";
        t.lIIIlllllIIll[t.lIIIlllllIlll[1]] = t."Nav to bank";
        t.lIIIlllllIIll[t.lIIIlllllIlll[3]] = t."Handling banking";
        t.lIIIlllllIIll[t.lIIIlllllIlll[5]] = t."We are missing quest supplies, switching to BUYING";
        t.lIIIlllllIIll[t.lIIIlllllIlll[4]] = t."We are missing quest supplies, switching to BUYING";
        t.lIIIlllllIIll[t.lIIIlllllIlll[10]] = t."Wear";
        t.lIIIlllllIIll[t.lIIIlllllIlll[16]] = t."Drink";
        t.lIIIlllllIIll[t.lIIIlllllIlll[18]] = t."Eat";
        t.lIIIlllllIIll[t.lIIIlllllIlll[19]] = t."Nav to start";
        t.lIIIlllllIIll[t.lIIIlllllIlll[20]] = t."Aris";
        t.lIIIlllllIIll[t.lIIIlllllIlll[12]] = t."Nav to sir pyrsin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[23]] = t."Sir Prysin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[25]] = t."Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[26]] = t."Nav to captain";
        t.lIIIlllllIIll[t.lIIIlllllIlll[27]] = t."Captain Rovin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[28]] = t."Bucket of water";
        t.lIIIlllllIIll[t.lIIIlllllIlll[29]] = t."Nav to drain";
        t.lIIIlllllIIll[t.lIIIlllllIlll[30]] = t."Bucket of water";
        t.lIIIlllllIIll[t.lIIIlllllIlll[31]] = t."Drain";
        t.lIIIlllllIIll[t.lIIIlllllIlll[32]] = t."Bucket of water";
        t.lIIIlllllIIll[t.lIIIlllllIlll[33]] = t."Nav to sewer key";
        t.lIIIlllllIIll[t.lIIIlllllIlll[34]] = t."Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[35]] = t."Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[36]] = t."Open";
        t.lIIIlllllIIll[t.lIIIlllllIlll[37]] = t."Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[9]] = t."Open";
        t.lIIIlllllIIll[t.lIIIlllllIlll[38]] = t."Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[39]] = t."Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[40]] = t."Climb-down";
        t.lIIIlllllIIll[t.lIIIlllllIlll[41]] = t."Manhole";
        t.lIIIlllllIIll[t.lIIIlllllIlll[42]] = t."Climb-down";
        t.lIIIlllllIIll[t.lIIIlllllIlll[43]] = t."Rusty key";
        t.lIIIlllllIIll[t.lIIIlllllIlll[44]] = t."Rusty key";
        t.lIIIlllllIIll[t.lIIIlllllIlll[45]] = t."Take";
        t.lIIIlllllIIll[t.lIIIlllllIlll[47]] = t."Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[49]] = t."Bones";
        t.lIIIlllllIIll[t.lIIIlllllIlll[50]] = t."Bones";
        t.lIIIlllllIIll[t.lIIIlllllIlll[51]] = t."Nav to wizard";
        t.lIIIlllllIIll[t.lIIIlllllIlll[52]] = t."Wizard Traiborn";
        t.lIIIlllllIIll[t.lIIIlllllIlll[53]] = t."Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[54]] = t."Nav to sir pyrsin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[55]] = t."Sir Prysin";
        t.lIIIlllllIIll[t.lIIIlllllIlll[56]] = t."Silverlight";
        t.lIIIlllllIIll[t.lIIIlllllIlll[57]] = t."Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[58]] = t."Weakened Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[59]] = t."Nav to demon";
        t.lIIIlllllIIll[t.lIIIlllllIlll[60]] = t."Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[61]] = t."Weakened Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[62]] = t."Attack";
        t.lIIIlllllIIll[t.lIIIlllllIlll[63]] = t."Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[15]] = t."Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[64]] = t."Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[65]] = t."Attack";
        t.lIIIlllllIIll[t.lIIIlllllIlll[66]] = t."Banishing";
        t.lIIIlllllIIll[t.lIIIlllllIlll[67]] = t."[";
        t.lIIIlllllIIll[t.lIIIlllllIlll[68]] = t."Weakened Delrith";
        t.lIIIlllllIIll[t.lIIIlllllIlll[69]] = t."Banishing";
        t.lIIIlllllIIll[t.lIIIlllllIlll[75]] = t.", ";
        t.lIIIlllllIIll[t.lIIIlllllIlll[76]] = t."Nav to bank";
        t.lIIIlllllIIll[t.lIIIlllllIlll[77]] = t."Handling banking";
        t.lIIIlllllIIll[t.lIIIlllllIlll[79]] = t."Wear";
        t.lIIIlllllIIll[t.lIIIlllllIlll[87]] = t."Demon Slayer";
        t.lIIIlllllIIll[t.lIIIlllllIlll[88]] = t."ring of wealth (";
        t.lIIIlllllIIll[t.lIIIlllllIlll[89]] = t."wizard";
        t.lIIIlllllIIll[t.lIIIlllllIlll[90]] = t."Now what was that incantation again?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[103]] = t."Yes.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[104]] = t."The Demon Slayer Quest";
        t.lIIIlllllIIll[t.lIIIlllllIlll[105]] = t."Okay, where is he? I'll kill him for you!";
        t.lIIIlllllIIll[t.lIIIlllllIlll[106]] = t."So how did Wally kill Delrith?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[107]] = t."What is the magical incantation?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[108]] = t."Aris said I should come and talk to you.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[109]] = t."I need to find Silverlight.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[110]] = t."He's back and unfortunately I've got to deal with him.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[111]] = t."So give me the keys!";
        t.lIIIlllllIIll[t.lIIIlllllIlll[112]] = t."Yes I know, but this is important.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[113]] = t."There's a demon who wants to invade this city.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[114]] = t."Yes, very.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[115]] = t."It's not them who are going to fight the demon, it's me.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[116]] = t."Sir Prysin said you would give me the key.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[117]] = t."Why did he give you one of the keys then?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[118]] = t."Talk about Demon Slayer.";
        t.lIIIlllllIIll[t.lIIIlllllIlll[119]] = t."Well, have you got any keys knocking around?";
        t.lIIIlllllIIll[t.lIIIlllllIlll[120]] = t."I'll get the bones for you.";
    }

    private static boolean lIlIIllIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void W() {
        block17: {
            d var2;
            block16: {
                block15: {
                    block14: {
                        Object var28;
                        block13: {
                            block12: {
                                int[] nArray = new int[lIIIlllllIlll[1]];
                                nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIIIlllllIlll[1]];
                                nArray2[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIIIlllllIlll[1]];
                                nArray3[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                if (!t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllllIlll[9])) break block13;
                            }
                            var28 = new d(lIIIlllllIlll[7], lIIIlllllIlll[9], lIIIlllllIlll[80]);
                            bA.add((d)var28);
                            0;
                        }
                        int[] nArray = new int[lIIIlllllIlll[1]];
                        nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[8];
                        if (t.lIlIIllIIlllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var28 = new d(lIIIlllllIlll[8], lIIIlllllIlll[1], lIIIlllllIlll[81]);
                            bA.add((d)var28);
                            0;
                        }
                        if (t.lIlIIllIIlllllI(Bank.contains((Predicate)(var28 = item -> item.getName().toLowerCase().contains(lIIIlllllIIll[lIIIlllllIlll[88]]))) ? 1 : 0)) {
                            var2 = new d(lIIIlllllIlll[82], lIIIlllllIlll[10], lIIIlllllIlll[83]);
                            bA.add(var2);
                            0;
                        }
                        int[] nArray4 = new int[lIIIlllllIlll[1]];
                        nArray4[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[lIIIlllllIlll[1]];
                        nArray5[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[lIIIlllllIlll[1]];
                        nArray6[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (!t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllllIlll[10])) break block15;
                    }
                    var2 = new d(lIIIlllllIlll[17], lIIIlllllIlll[12], lIIIlllllIlll[84]);
                    bA.add(var2);
                    0;
                }
                int[] nArray = new int[lIIIlllllIlll[1]];
                nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[11];
                if (t.lIlIIllIIlllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var2 = new d(lIIIlllllIlll[11], lIIIlllllIlll[4], h.bv);
                    bA.add(var2);
                    0;
                }
                int[] nArray7 = new int[lIIIlllllIlll[1]];
                nArray7[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIIIlllllIlll[1]];
                nArray8[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (!t.lIlIIllIIllllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lIIIlllllIlll[1]];
                nArray9[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                if (!t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlllllIlll[28])) break block17;
            }
            var2 = new d(lIIIlllllIlll[6], lIIIlllllIlll[54], lIIIlllllIlll[85]);
            bA.add(var2);
            0;
        }
    }

    private static boolean lIlIIllIlIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIllIIllllll(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIlIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIIllIIlllIlI() {
        lIIIlllllIlll = new int[122];
        t.lIIIlllllIlll[0] = (0x4E ^ 0xF) & ~(0x7B ^ 0x3A);
        t.lIIIlllllIlll[1] = 1;
        t.lIIIlllllIlll[2] = -(0xFFFFAC7B & 0x77B7) & (0xFFFFFFBA & 0x37FF);
        t.lIIIlllllIlll[3] = 2;
        t.lIIIlllllIlll[4] = 0x75 ^ 0x71;
        t.lIIIlllllIlll[5] = 3;
        t.lIIIlllllIlll[6] = -(0xFFFFF975 & 0x66AB) & (0xFFFFFF67 & Short.MAX_VALUE);
        t.lIIIlllllIlll[7] = -(0xFFFFBDD7 & 0x7FA9) & (0xFFFFBFAF & 0x7FDE);
        t.lIIIlllllIlll[8] = -(0xFFFFB9F7 & 0x6E4F) & (0xFFFFAFEF & 0x7FDF);
        t.lIIIlllllIlll[9] = 0x8B ^ 0x92;
        t.lIIIlllllIlll[10] = 0x66 ^ 0x63;
        t.lIIIlllllIlll[11] = -(0xFFFFDEE5 & 0x6B3F) & (0xFFFFFF7F & 0x7BF5);
        t.lIIIlllllIlll[12] = 107 + 58 - 99 + 71 ^ 49 + 44 - 8 + 46;
        t.lIIIlllllIlll[13] = -(0xFFFFFAFD & 0x7D1F) & (0xFFFFFBFF & Short.MAX_VALUE);
        t.lIIIlllllIlll[14] = -(0xFFFFB797 & 0x5C7B) & (0xFFFFF7FA & 0x1FFF);
        t.lIIIlllllIlll[15] = 0x2E ^ 0x1C;
        t.lIIIlllllIlll[16] = 0x76 ^ 0x70;
        t.lIIIlllllIlll[17] = 0xFFFFCD7B & 0x33FF;
        t.lIIIlllllIlll[18] = 0xE1 ^ 0xAA ^ (0x42 ^ 0xE);
        t.lIIIlllllIlll[19] = 0x1B ^ 0x3D ^ (0xE9 ^ 0xC7);
        t.lIIIlllllIlll[20] = 184 + 138 - 148 + 31 ^ 156 + 147 - 151 + 44;
        t.lIIIlllllIlll[21] = -(0xFFFFF79D & 0x7A63) & (0xFFFFFFFF & 0x7E7F);
        t.lIIIlllllIlll[22] = 0xFFFF9D8D & 0x6FFF;
        t.lIIIlllllIlll[23] = 0x6E ^ 0 ^ (0x29 ^ 0x4C);
        t.lIIIlllllIlll[24] = 0xFFFFDD72 & 0x2BED;
        t.lIIIlllllIlll[25] = 0x44 ^ 0x2E ^ (0x46 ^ 0x20);
        t.lIIIlllllIlll[26] = 0xB1 ^ 0x88 ^ (0x7F ^ 0x4B);
        t.lIIIlllllIlll[27] = 0x41 ^ 0x21 ^ (0x44 ^ 0x2A);
        t.lIIIlllllIlll[28] = 0x1C ^ 0x13;
        t.lIIIlllllIlll[29] = 0x15 ^ 0x61 ^ (0x55 ^ 0x31);
        t.lIIIlllllIlll[30] = 0x4A ^ 0x5B;
        t.lIIIlllllIlll[31] = 78 + 113 - 176 + 117 ^ 48 + 1 - -89 + 12;
        t.lIIIlllllIlll[32] = 117 + 70 - 66 + 13 ^ 57 + 21 - -14 + 57;
        t.lIIIlllllIlll[33] = 0x18 ^ 0xC;
        t.lIIIlllllIlll[34] = 0xA8 ^ 0xBD;
        t.lIIIlllllIlll[35] = 0x84 ^ 0xB8 ^ (0x53 ^ 0x79);
        t.lIIIlllllIlll[36] = 0x30 ^ 0x46 ^ (0xE4 ^ 0x85);
        t.lIIIlllllIlll[37] = 0x83 ^ 0x89 ^ (0x59 ^ 0x4B);
        t.lIIIlllllIlll[38] = 0x2F ^ 0x35;
        t.lIIIlllllIlll[39] = 0x2B ^ 0x30;
        t.lIIIlllllIlll[40] = 0x7A ^ 0x50 ^ (0x1E ^ 0x28);
        t.lIIIlllllIlll[41] = 77 + 79 - 91 + 92 ^ 27 + 40 - 31 + 92;
        t.lIIIlllllIlll[42] = 0xE0 ^ 0xBD ^ (0x2E ^ 0x6D);
        t.lIIIlllllIlll[43] = 135 + 48 - 101 + 68 ^ 129 + 37 - 44 + 15;
        t.lIIIlllllIlll[44] = 0x8F ^ 0xBE ^ (0xBD ^ 0xAC);
        t.lIIIlllllIlll[45] = 64 + 12 - -1 + 98 ^ 140 + 53 - 88 + 37;
        t.lIIIlllllIlll[46] = 0xFFFFD97B & 0x2FE5;
        t.lIIIlllllIlll[47] = 0x89 ^ 0x84 ^ (0x31 ^ 0x1E);
        t.lIIIlllllIlll[48] = 0xFFFFDB5F & 0x2DFF;
        t.lIIIlllllIlll[49] = 118 + 80 - 194 + 153 ^ 85 + 100 - 175 + 180;
        t.lIIIlllllIlll[50] = 0xA8 ^ 0x8C;
        t.lIIIlllllIlll[51] = 0x9E ^ 0xBB;
        t.lIIIlllllIlll[52] = 0x95 ^ 0xB3;
        t.lIIIlllllIlll[53] = 0x9B ^ 0xBC;
        t.lIIIlllllIlll[54] = 0x18 ^ 0x6B ^ (0xE1 ^ 0xBA);
        t.lIIIlllllIlll[55] = 0x14 ^ 0x3E ^ 3;
        t.lIIIlllllIlll[56] = 89 + 16 - 27 + 61 ^ 61 + 28 - -55 + 17;
        t.lIIIlllllIlll[57] = 0x17 ^ 0x3C;
        t.lIIIlllllIlll[58] = 103 + 16 - -25 + 12 ^ 22 + 103 - 52 + 103;
        t.lIIIlllllIlll[59] = 0x7F ^ 0x52;
        t.lIIIlllllIlll[60] = 73 + 63 - 39 + 46 ^ 24 + 128 - 5 + 14;
        t.lIIIlllllIlll[61] = 0x43 ^ 0x6C;
        t.lIIIlllllIlll[62] = 0x4D ^ 0x7D;
        t.lIIIlllllIlll[63] = 0x99 ^ 0xA8;
        t.lIIIlllllIlll[64] = 0x56 ^ 0x65;
        t.lIIIlllllIlll[65] = 0xB4 ^ 0x80;
        t.lIIIlllllIlll[66] = 0x2E ^ 0x1B;
        t.lIIIlllllIlll[67] = 0x26 ^ 0x52 ^ (0xFD ^ 0xBF);
        t.lIIIlllllIlll[68] = 0xEB ^ 0xC0 ^ (0xDC ^ 0xC0);
        t.lIIIlllllIlll[69] = 0x79 ^ 0x45 ^ (0x34 ^ 0x30);
        t.lIIIlllllIlll[70] = -(0xFFFFF1BB & 0x3F5E) & (0xFFFFFB1F & 0x3FFB);
        t.lIIIlllllIlll[71] = -(0xFFFFA7B9 & 0x7DFF) & (0xFFFFAFFF & 0x7FBB);
        t.lIIIlllllIlll[72] = 0xFFFF9BA7 & 0x6E5C;
        t.lIIIlllllIlll[73] = -(0xFFFFD5E7 & 0x7F99) & (0xFFFFDFD7 & 0x7FAD);
        t.lIIIlllllIlll[74] = 0xFFFFCF5F & 0x3AA6;
        t.lIIIlllllIlll[75] = 0x20 ^ 0x19;
        t.lIIIlllllIlll[76] = 0x6E ^ 0x17 ^ (0x68 ^ 0x2B);
        t.lIIIlllllIlll[77] = 0xE3 ^ 0xB3 ^ (0xFD ^ 0x96);
        t.lIIIlllllIlll[78] = 0xFFFFB973 & 0x77DF;
        t.lIIIlllllIlll[79] = 0x31 ^ 0xD;
        t.lIIIlllllIlll[80] = -(0xFFFFF1EF & 0x5F7B) & (0xFFFFDBFF & 0x77FE);
        t.lIIIlllllIlll[81] = 0xFFFFDFD3 & 0x27AC;
        t.lIIIlllllIlll[82] = -(0xFFFFD3F1 & 0x7C2F) & (0xFFFFFEEF & 0x7FFC);
        t.lIIIlllllIlll[83] = -(0xD0 ^ 0x93) & (0xFFFFE1EE & 0x7FFB);
        t.lIIIlllllIlll[84] = -(0xFFFFFFDB & 0x1EE7) & (0xFFFFDFEF & 0x3FFE);
        t.lIIIlllllIlll[85] = 0xFFFFDFFD & 0x276E;
        t.lIIIlllllIlll[86] = 0xF3 ^ 0x97;
        t.lIIIlllllIlll[87] = 0x85 ^ 0xB8;
        t.lIIIlllllIlll[88] = 0x4D ^ 8 ^ (0x4F ^ 0x34);
        t.lIIIlllllIlll[89] = 0xB2 ^ 0x8D;
        t.lIIIlllllIlll[90] = 178 + 153 - 189 + 86 ^ 151 + 14 - 137 + 136;
        t.lIIIlllllIlll[91] = -(0xFFFFFB57 & 0x37ED) & (0xFFFFBFFF & 0x7FC7);
        t.lIIIlllllIlll[92] = -(0xFFFFFE4D & 0x31BB) & (0xFFFFBFFD & 0x7D6A);
        t.lIIIlllllIlll[93] = 0xFFFFBEE7 & 0x4D9C;
        t.lIIIlllllIlll[94] = 0xFFFFCDD7 & 0x3FB8;
        t.lIIIlllllIlll[95] = -(0xFFFFFA71 & 0x55DF) & (0xFFFFDFFF & 0x7DF9);
        t.lIIIlllllIlll[96] = -(0xFFFFE3D7 & 0x3D2E) & (0xFFFFBFDF & 0x6DBF);
        t.lIIIlllllIlll[97] = 0xFFFFAFFD & 0x5DAA;
        t.lIIIlllllIlll[98] = 0xFFFFF6AB & 0x2FFD;
        t.lIIIlllllIlll[99] = -(0xFFFFAE7D & 0x53D7) & (0xFFFFAE7F & 0x5FFD);
        t.lIIIlllllIlll[100] = -(47 + 78 - 44 + 49) & (0xFFFFDCFB & 0x2FDF);
        t.lIIIlllllIlll[101] = -(0xFFFFF177 & 0x6FC9) & (0xFFFFEFFB & 0x7DDF);
        t.lIIIlllllIlll[102] = -(0xFFFFFE97 & 0x737D) & (0xFFFFFFBF & 0x7F7F);
        t.lIIIlllllIlll[103] = 0x32 ^ 0x73;
        t.lIIIlllllIlll[104] = 0x51 ^ 0x19 ^ (0x9B ^ 0x91);
        t.lIIIlllllIlll[105] = 14 + 143 - 106 + 177 ^ 52 + 87 - 54 + 82;
        t.lIIIlllllIlll[106] = 0x57 ^ 0x1A ^ (0xB2 ^ 0xBB);
        t.lIIIlllllIlll[107] = 0x8A ^ 0xA6 ^ (0x6A ^ 3);
        t.lIIIlllllIlll[108] = 0x3B ^ 0x7D;
        t.lIIIlllllIlll[109] = 0x3C ^ 0x7B;
        t.lIIIlllllIlll[110] = 5 ^ 0x4D;
        t.lIIIlllllIlll[111] = 0x59 ^ 0x60 ^ (0xD1 ^ 0xA1);
        t.lIIIlllllIlll[112] = 48 + 108 - 137 + 178 ^ 98 + 37 - 19 + 27;
        t.lIIIlllllIlll[113] = 0x9E ^ 0x92 ^ (0x60 ^ 0x27);
        t.lIIIlllllIlll[114] = 0xD8 ^ 0x94;
        t.lIIIlllllIlll[115] = 0x77 ^ 0x67 ^ (0xF0 ^ 0xAD);
        t.lIIIlllllIlll[116] = 0xD7 ^ 0x99;
        t.lIIIlllllIlll[117] = 33 + 97 - 4 + 15 ^ 121 + 10 - 38 + 101;
        t.lIIIlllllIlll[118] = 0xEC ^ 0xBC;
        t.lIIIlllllIlll[119] = 6 ^ 0x59 ^ (0x82 ^ 0x8C);
        t.lIIIlllllIlll[120] = 0x8C ^ 0x80 ^ (0xF5 ^ 0xAB);
        t.lIIIlllllIlll[121] = 144 + 7 - 30 + 101 ^ 43 + 59 - 1 + 40;
    }

    private static boolean lIlIIllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public static void bg() {
        block77: {
            block78: {
                Object var9;
                block80: {
                    block79: {
                        if (t.lIlIIllIIllllII(by ? 1 : 0)) {
                            b.a(bA);
                            if (t.lIlIIllIIllllIl(bA.size(), lIIIlllllIlll[1])) {
                                System.out.println(lIIIlllllIIll[lIIIlllllIlll[0]]);
                                by = lIIIlllllIlll[0];
                            }
                        }
                        if (!t.lIlIIllIIlllllI(by ? 1 : 0)) break block77;
                        if (t.lIlIIllIIlllllI(t.S() ? 1 : 0) && t.lIlIIllIIlllllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            var9 = BankLocation.getNearest();
                            if (t.lIlIIllIIllllll(var9) && t.lIlIIllIIlllllI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[1]];
                                a.a((BankLocation)var9);
                            }
                            if (t.lIlIIllIIllllll(var9) && t.lIlIIllIIllllII(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllllIlll[2]);
                                    0;
                                }
                                if (t.lIlIIllIIllllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[3]];
                                    if (t.lIlIIllIlIIIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIlllllIlll[4]);
                                        0;
                                    }
                                    if (t.lIlIIllIlIIIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIlllllIlll[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIIlllllIlll[5]];
                                    nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                                    nArray[t.lIIIlllllIlll[1]] = lIIIlllllIlll[7];
                                    nArray[t.lIIIlllllIlll[3]] = lIIIlllllIlll[8];
                                    if (t.lIlIIllIIlllllI(e.b(nArray) ? 1 : 0)) {
                                        t.W();
                                        System.out.println(lIIIlllllIIll[lIIIlllllIlll[5]]);
                                        by = lIIIlllllIlll[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIIlllllIlll[1]];
                                    nArray2[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                    if (t.lIlIIllIIllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lIIIlllllIlll[1]];
                                        nArray3[t.lIIIlllllIlll[0]] = lIIIlllllIlll[7];
                                        if (t.lIlIIllIIllllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllllIlll[9])) {
                                            t.W();
                                            System.out.println(lIIIlllllIIll[lIIIlllllIlll[4]]);
                                            by = lIIIlllllIlll[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lIIIlllllIlll[5]];
                                    nArray4[t.lIIIlllllIlll[0]] = lIIIlllllIlll[6];
                                    nArray4[t.lIIIlllllIlll[1]] = lIIIlllllIlll[7];
                                    nArray4[t.lIIIlllllIlll[3]] = lIIIlllllIlll[8];
                                    if (t.lIlIIllIIllllII(e.b(nArray4) ? 1 : 0)) {
                                        if (t.lIlIIllIIlllllI(Equipment.contains((int[])f.aW) ? 1 : 0) && t.lIlIIllIIlllllI(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                                            a.b(f.aW, lIIIlllllIlll[1]);
                                        }
                                        if (t.lIlIIllIIllllII(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aW).interact(lIIIlllllIIll[lIIIlllllIlll[10]]);
                                            Time.sleepTicks((int)lIIIlllllIlll[5]);
                                            0;
                                        }
                                        if (t.lIlIIllIIlllllI(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lIIIlllllIlll[5]);
                                            0;
                                        }
                                        a.a(lIIIlllllIlll[11], lIIIlllllIlll[1]);
                                        a.a(lIIIlllllIlll[8], lIIIlllllIlll[1]);
                                        a.a(lIIIlllllIlll[6], lIIIlllllIlll[12]);
                                        a.a(lIIIlllllIlll[13], lIIIlllllIlll[14]);
                                    }
                                }
                            }
                        }
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])f.ba) ? 1 : 0) && t.lIlIIllIIllllIl(Movement.getRunEnergy(), lIIIlllllIlll[15])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIIlllllIIll[lIIIlllllIlll[16]]);
                            Time.sleepTicks((int)lIIIlllllIlll[1]);
                            0;
                        }
                        int[] nArray = new int[lIIIlllllIlll[1]];
                        nArray[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray) ? 1 : 0) && t.lIlIIllIlIIIIIl(t.lIlIIllIIlllIll(e.v(), 55.0))) {
                            int[] nArray5 = new int[lIIIlllllIlll[1]];
                            nArray5[t.lIIIlllllIlll[0]] = lIIIlllllIlll[17];
                            Inventory.getFirst((int[])nArray5).interact(lIIIlllllIIll[lIIIlllllIlll[18]]);
                        }
                        if (t.lIlIIllIIllllII(t.S() ? 1 : 0) && t.lIlIIllIIlllllI(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllllIlll[4]) && t.lIlIIllIIlllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[19]];
                                Movement.walkTo((WorldPoint)fd);
                                0;
                                Time.sleepTicks((int)lIIIlllllIlll[1]);
                                0;
                            }
                            if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIIlllllIlll[4])) {
                                g.a(lIIIlllllIIll[lIIIlllllIlll[20]], bW);
                            }
                        }
                        if (t.lIlIIllIlIIIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[1])) {
                            var9 = new WorldArea(lIIIlllllIlll[21], lIIIlllllIlll[22], lIIIlllllIlll[19], lIIIlllllIlll[18], lIIIlllllIlll[0]);
                            if (t.lIlIIllIIlllllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[12]];
                                Movement.walkTo((WorldPoint)fy);
                                0;
                                Time.sleepTicks((int)lIIIlllllIlll[1]);
                                0;
                            }
                            if (t.lIlIIllIIllllII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lIIIlllllIIll[lIIIlllllIlll[23]], bW);
                            }
                        }
                        if (!t.lIlIIllIlIIIlII(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIIIlllllIlll[3])) break block78;
                        co = lIIIlllllIlll[0];
                        int[] nArray6 = new int[lIIIlllllIlll[1]];
                        nArray6[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                        if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllllIlll[1]];
                            stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[25]];
                            if (t.lIlIIllIIlllllI(Equipment.contains((String[])stringArray) ? 1 : 0) && t.lIlIIllIIlllllI(fx ? 1 : 0)) {
                                if (!t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fz), lIIIlllllIlll[4]) || t.lIlIIllIlIIIlIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllllIlll[3])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[26]];
                                    Movement.walkTo((WorldPoint)fz);
                                    0;
                                    Time.sleepTicks((int)lIIIlllllIlll[1]);
                                    0;
                                }
                                if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fz), lIIIlllllIlll[4])) {
                                    g.a(lIIIlllllIIll[lIIIlllllIlll[27]], bW);
                                }
                            }
                        }
                        int[] nArray7 = new int[lIIIlllllIlll[1]];
                        nArray7[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray7) ? 1 : 0) && t.lIlIIllIIlllllI(fx ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllllIlll[1]];
                            stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[28]];
                            if (t.lIlIIllIIllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fA), lIIIlllllIlll[4])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[29]];
                                    Movement.walkTo((WorldPoint)fA);
                                    0;
                                    Time.sleepTicks((int)lIIIlllllIlll[1]);
                                    0;
                                }
                                if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fA), lIIIlllllIlll[4])) {
                                    String[] stringArray2 = new String[lIIIlllllIlll[1]];
                                    stringArray2[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[30]];
                                    String[] stringArray3 = new String[lIIIlllllIlll[1]];
                                    stringArray3[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)lIIIlllllIlll[10]);
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[lIIIlllllIlll[1]];
                            stringArray4[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[32]];
                            if (t.lIlIIllIIlllllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fB), lIIIlllllIlll[4])) {
                                    AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[33]];
                                    String[] stringArray5 = new String[lIIIlllllIlll[1]];
                                    stringArray5[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[34]];
                                    if (t.lIlIIllIIllllll(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[lIIIlllllIlll[1]];
                                        stringArray6[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[35]];
                                        String[] stringArray7 = new String[lIIIlllllIlll[1]];
                                        stringArray7[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[36]];
                                        if (t.lIlIIllIIllllII(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIIIlllllIlll[1]];
                                            stringArray8[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lIIIlllllIIll[lIIIlllllIlll[9]]);
                                            Time.sleepTicks((int)lIIIlllllIlll[3]);
                                            0;
                                        }
                                    }
                                    String[] stringArray9 = new String[lIIIlllllIlll[1]];
                                    stringArray9[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[38]];
                                    if (t.lIlIIllIIllllll(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[lIIIlllllIlll[1]];
                                        stringArray10[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[39]];
                                        String[] stringArray11 = new String[lIIIlllllIlll[1]];
                                        stringArray11[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[40]];
                                        if (t.lIlIIllIIllllII(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[lIIIlllllIlll[1]];
                                            stringArray12[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lIIIlllllIIll[lIIIlllllIlll[42]]);
                                            Time.sleepTicks((int)lIIIlllllIlll[3]);
                                            0;
                                        }
                                    }
                                    Movement.walkTo((WorldPoint)fB);
                                    0;
                                    Time.sleepTicks((int)lIIIlllllIlll[1]);
                                    0;
                                }
                                if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fB), lIIIlllllIlll[4])) {
                                    String[] stringArray13 = new String[lIIIlllllIlll[1]];
                                    stringArray13[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[43]];
                                    if (t.lIlIIllIIllllll(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[lIIIlllllIlll[1]];
                                        stringArray14[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lIIIlllllIIll[lIIIlllllIlll[45]]);
                                        Time.sleepTicks((int)lIIIlllllIlll[4]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIIlllllIlll[1]];
                        nArray8[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                        if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIIIlllllIlll[1]];
                            nArray9[t.lIIIlllllIlll[0]] = lIIIlllllIlll[46];
                            if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                fx = lIIIlllllIlll[1];
                            }
                        }
                        if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllllIlll[1]];
                            stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[47]];
                            if (t.lIlIIllIIlllllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIlllllIlll[1]];
                                nArray10[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                                if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[lIIIlllllIlll[1]];
                                    stringArray15[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[49]];
                                    if (t.lIlIIllIIlllllI(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        t.bi();
                                    }
                                    String[] stringArray16 = new String[lIIIlllllIlll[1]];
                                    stringArray16[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[50]];
                                    if (t.lIlIIllIIllllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (t.lIlIIllIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(fC), lIIIlllllIlll[3])) {
                                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[51]];
                                            Movement.walkTo((WorldPoint)fC);
                                            0;
                                            Time.sleepTicks((int)lIIIlllllIlll[1]);
                                            0;
                                        }
                                        if (t.lIlIIllIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(fC), lIIIlllllIlll[3])) {
                                            g.a(lIIIlllllIIll[lIIIlllllIlll[52]], bW);
                                        }
                                    }
                                }
                            }
                        }
                        if (t.lIlIIllIIllllII(fx ? 1 : 0)) {
                            int[] nArray11 = new int[lIIIlllllIlll[1]];
                            nArray11[t.lIIIlllllIlll[0]] = lIIIlllllIlll[48];
                            if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllllIlll[1]];
                                stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[53]];
                                if (t.lIlIIllIIlllllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[lIIIlllllIlll[1]];
                                    nArray12[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                                    if (t.lIlIIllIIlllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        t.bi();
                                    }
                                    int[] nArray13 = new int[lIIIlllllIlll[1]];
                                    nArray13[t.lIIIlllllIlll[0]] = lIIIlllllIlll[24];
                                    if (t.lIlIIllIIllllII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        var9 = new WorldArea(lIIIlllllIlll[21], lIIIlllllIlll[22], lIIIlllllIlll[19], lIIIlllllIlll[18], lIIIlllllIlll[0]);
                                        if (t.lIlIIllIIlllllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[54]];
                                            Movement.walkTo((WorldPoint)fy);
                                            0;
                                            Time.sleepTicks((int)lIIIlllllIlll[1]);
                                            0;
                                        }
                                        if (t.lIlIIllIIllllII(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lIIIlllllIIll[lIIIlllllIlll[55]], bW);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lIIIlllllIlll[1]];
                        stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[56]];
                        if (!t.lIlIIllIIllllII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[lIIIlllllIlll[1]];
                        stringArray17[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[57]];
                        if (t.lIlIIllIlIIIllI(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[lIIIlllllIlll[1]];
                            stringArray18[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[58]];
                            if (t.lIlIIllIlIIIllI(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[59]];
                                Movement.walkTo((WorldPoint)fD);
                                0;
                                Time.sleepTicks((int)lIIIlllllIlll[1]);
                                0;
                            }
                        }
                        String[] stringArray19 = new String[lIIIlllllIlll[1]];
                        stringArray19[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[60]];
                        if (!t.lIlIIllIlIIIllI(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[lIIIlllllIlll[1]];
                        stringArray20[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[61]];
                        if (!t.lIlIIllIIllllll(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (t.lIlIIllIlIIIllI(fE)) {
                        t.bh();
                    }
                    if (t.lIlIIllIIllllll(var9 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (t.lIlIIllIIllllII(nPC.getName().contains(lIIIlllllIIll[lIIIlllllIlll[89]]) ? 1 : 0) && t.lIlIIllIlIIlIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIIlllllIlll[1];
                            0;
                            if (((12 + 106 - 83 + 203 ^ 42 + 156 - 81 + 53) & (51 + 35 - -104 + 25 ^ 31 + 87 - -2 + 27 ^ -1)) != 0) {
                                return false;
                            }
                        } else {
                            n2 = lIIIlllllIlll[0];
                        }
                        return n2 != 0;
                    })) && t.lIlIIllIlIIIllI(Players.getLocal().getInteracting())) {
                        var9.interact(lIIIlllllIIll[lIIIlllllIlll[62]]);
                        Time.sleepTicks((int)lIIIlllllIlll[3]);
                        0;
                    }
                    if (t.lIlIIllIlIIIllI(var9) && t.lIlIIllIlIIIllI(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[lIIIlllllIlll[1]];
                        stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[63]];
                        if (t.lIlIIllIIllllll(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[lIIIlllllIlll[1]];
                            stringArray21[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[15]];
                            if (t.lIlIIllIIlllllI(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && t.lIlIIllIIlllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[lIIIlllllIlll[1]];
                                stringArray22[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lIIIlllllIIll[lIIIlllllIlll[65]]);
                            }
                        }
                    }
                    if (t.lIlIIllIIllllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[66]];
                        List var14 = Dialog.getOptions();
                        if (t.lIlIIllIIlllllI(var14.isEmpty() ? 1 : 0)) {
                            int var6 = lIIIlllllIlll[0];
                            while (t.lIlIIllIIllllIl(var6, var14.size())) {
                                if (t.lIlIIllIIllllII(((Widget)var14.get(var6)).getText().contains(lIIIlllllIIll[lIIIlllllIlll[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlllllIlll[1]];
                                    stringArray[t.lIIIlllllIlll[0]] = ((Widget)var14.get(var6)).getText();
                                    Dialog.chooseOption((String[])stringArray);
                                    0;
                                    Time.sleepTicks((int)lIIIlllllIlll[3]);
                                    0;
                                    0;
                                    if (1 > ((18 + 41 - -27 + 78 ^ 145 + 27 - 125 + 113) & (0xB4 ^ 0x94 ^ (0xBA ^ 0x9E) ^ -1))) break;
                                    return;
                                }
                                ++var6;
                                0;
                                if (1 != 3) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIIlllllIlll[1]];
                stringArray[t.lIIIlllllIlll[0]] = lIIIlllllIIll[lIIIlllllIlll[68]];
                if (t.lIlIIllIIllllll(NPCs.getNearest((String[])stringArray))) {
                    if (t.lIlIIllIIllllIl(co, lIIIlllllIlll[1]) && t.lIlIIllIIlllllI(cp ? 1 : 0)) {
                        P.lB += lIIIlllllIlll[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllllIlll[1];
                        P.lB = lIIIlllllIlll[0];
                        cp = lIIIlllllIlll[1];
                    }
                    if (t.lIlIIllIIllllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllIIll[lIIIlllllIlll[69]];
                        var9 = Dialog.getOptions();
                        if (t.lIlIIllIIlllllI(var9.isEmpty() ? 1 : 0)) {
                            int var14 = lIIIlllllIlll[0];
                            while (t.lIlIIllIIllllIl(var14, var9.size())) {
                                String var6 = fE[var14];
                                int var24 = lIIIlllllIlll[0];
                                while (t.lIlIIllIIllllIl(var24, var9.size())) {
                                    if (t.lIlIIllIIllllII(((Widget)var9.get(var24)).getText().contains(var6) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)var9.get(var24)).getText());
                                        Time.sleepTicks((int)lIIIlllllIlll[3]);
                                        0;
                                        String[] stringArray23 = new String[lIIIlllllIlll[1]];
                                        stringArray23[t.lIIIlllllIlll[0]] = ((Widget)var9.get(var24)).getText();
                                        Dialog.chooseOption((String[])stringArray23);
                                        0;
                                        Time.sleepTicks((int)lIIIlllllIlll[12]);
                                        0;
                                        0;
                                        if (3 != 2) break;
                                        return;
                                    }
                                    ++var24;
                                    0;
                                    if (-2 < 0) continue;
                                    return;
                                }
                                ++var14;
                                0;
                                if (1 < (0x17 ^ 0x13)) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(bW);
        }
    }
}


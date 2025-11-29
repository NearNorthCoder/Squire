/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class ab
implements ac {
    public static final /* synthetic */ String[] mM;
    private static /* synthetic */ int[] llIlIIlIll;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint mS;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ String[] llIlIIIllI;
    static /* synthetic */ int cG;
    static /* synthetic */ int di;
    private static final /* synthetic */ WorldPoint mO;
    private static final /* synthetic */ WorldPoint mQ;
    public static /* synthetic */ long g;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ WorldPoint mR;
    private static final /* synthetic */ WorldPoint mN;
    private static final /* synthetic */ WorldPoint mP;

    private static void Q() {
        d var9;
        Object var13;
        int[] nArray = new int[llIlIIlIll[1]];
        nArray[ab.llIlIIlIll[0]] = llIlIIlIll[10];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIIlIll[10], llIlIIlIll[1], llIlIIlIll[46]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIIlIll[1]];
        nArray2[ab.llIlIIlIll[0]] = llIlIIlIll[14];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var13 = new d(llIlIIlIll[14], llIlIIlIll[1], llIlIIlIll[47]);
            bv.add((d)var13);
            0;
        }
        int[] nArray3 = new int[llIlIIlIll[1]];
        nArray3[ab.llIlIIlIll[0]] = llIlIIlIll[4];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var13 = new d(llIlIIlIll[4], llIlIIlIll[48], llIlIIlIll[49]);
            bv.add((d)var13);
            0;
        }
        if (ab.lIllIIlIIIIIl(Bank.contains((Predicate)(var13 = item -> item.getName().toLowerCase().contains(llIlIIIllI[llIlIIlIll[56]]))) ? 1 : 0)) {
            var9 = new d(llIlIIlIll[50], llIlIIlIll[7], llIlIIlIll[51]);
            bv.add(var9);
            0;
        }
        int[] nArray4 = new int[llIlIIlIll[1]];
        nArray4[ab.llIlIIlIll[0]] = llIlIIlIll[11];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var9 = new d(llIlIIlIll[11], llIlIIlIll[15], llIlIIlIll[52]);
            bv.add(var9);
            0;
        }
        int[] nArray5 = new int[llIlIIlIll[1]];
        nArray5[ab.llIlIIlIll[0]] = llIlIIlIll[16];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var9 = new d(llIlIIlIll[16], llIlIIlIll[15], llIlIIlIll[52]);
            bv.add(var9);
            0;
        }
        int[] nArray6 = new int[llIlIIlIll[1]];
        nArray6[ab.llIlIIlIll[0]] = llIlIIlIll[13];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var9 = new d(llIlIIlIll[13], llIlIIlIll[53], llIlIIlIll[52]);
            bv.add(var9);
            0;
        }
        int[] nArray7 = new int[llIlIIlIll[1]];
        nArray7[ab.llIlIIlIll[0]] = llIlIIlIll[12];
        if (ab.lIllIIlIIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var9 = new d(llIlIIlIll[12], llIlIIlIll[7], j.cf);
            bv.add(var9);
            0;
        }
    }

    private static String lIllIIIlIIIll(String var10, String var19) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var15 = llIlIIlIll[0];
        char[] var1 = var10.toCharArray();
        int var20 = var1.length;
        int var12 = llIlIIlIll[0];
        while (ab.lIllIIlIIIIII(var12, var20)) {
            char var2 = var1[var12];
            var18.append((char)(var2 ^ var21[var15 % var21.length]));
            0;
            ++var15;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIllIIlIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIllIIIlIIlII(String var8, String var14) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIlIIlIll[3], var7);
            return new String(var4.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIIIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIlIIlIll[1]];
        stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[45]];
        if (ab.lIllIIIllllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[llIlIIlIll[1]];
            nArray[ab.llIlIIlIll[0]] = llIlIIlIll[4];
            if (ab.lIllIIIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIlIIlIll[1];
                0;
                if (((140 + 47 - 83 + 54 ^ 74 + 156 - 123 + 92) & (0xB7 ^ 0x8D ^ (0xF ^ 0x6C) ^ -1)) == 0) return n2 != 0;
                return ((0xC7 ^ 0x86 ^ (0x48 ^ 0x4F)) & (0x66 ^ 0x5E ^ (0x56 ^ 0x28) ^ -1)) != 0;
            }
        }
        n2 = llIlIIlIll[0];
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return llIlIIlIll[0];
    }

    private static boolean lIllIIlIIIlII(Object object) {
        return object != null;
    }

    @Override
    public String ag() {
        return llIlIIIllI[llIlIIlIll[55]];
    }

    private static int lIllIIIllllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public int af() {
        try {
            ab.ex();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 1) {
            return (0x69 ^ 0x1E ^ (0x41 ^ 0x17)) & (0xB2 ^ 0xBE ^ (0x46 ^ 0x6B) ^ -1);
        }
        return llIlIIlIll[54];
    }

    public static void ex() {
        if (ab.lIllIIIllllll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[0]];
            b.a(bv);
            if (ab.lIllIIlIIIIII(bv.size(), llIlIIlIll[1])) {
                System.out.println(llIlIIIllI[llIlIIlIll[1]]);
                bt = llIlIIlIll[0];
            }
        }
        if (ab.lIllIIlIIIIIl(bt ? 1 : 0)) {
            block49: {
                BankLocation var17;
                if (ab.lIllIIIllllll(Inventory.contains((int[])f.ba) ? 1 : 0) && ab.lIllIIlIIIIII(Movement.getRunEnergy(), llIlIIlIll[2])) {
                    Inventory.getFirst((int[])f.ba).interact(llIlIIIllI[llIlIIlIll[3]]);
                    Time.sleepTicks((int)llIlIIlIll[1]);
                    0;
                }
                if (ab.lIllIIlIIIIlI(ab.lIllIIIllllIl(e.w(), 70.0))) {
                    int[] nArray = new int[llIlIIlIll[1]];
                    nArray[ab.llIlIIlIll[0]] = llIlIIlIll[4];
                    if (ab.lIllIIIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIlIIlIll[1]];
                        nArray2[ab.llIlIIlIll[0]] = llIlIIlIll[4];
                        Inventory.getFirst((int[])nArray2).interact(llIlIIIllI[llIlIIlIll[5]]);
                    }
                }
                if (ab.lIllIIlIIIIIl(Movement.isRunEnabled() ? 1 : 0) && ab.lIllIIlIIIIll(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (ab.lIllIIlIIIIIl(ab.an() ? 1 : 0) && ab.lIllIIlIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    var17 = BankLocation.getNearest();
                    if (ab.lIllIIlIIIlII(var17) && ab.lIllIIlIIIIIl(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[6]];
                        a.a(var17);
                        Time.sleepTicks((int)llIlIIlIll[3]);
                        0;
                    }
                    if (ab.lIllIIlIIIlII(var17) && ab.lIllIIIllllll(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[7]];
                        if (ab.lIllIIlIIIIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIlIll[8]);
                            0;
                        }
                        if (ab.lIllIIIllllll(Bank.isOpen() ? 1 : 0)) {
                            if (ab.lIllIIlIIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIlIIlIll[6]);
                                0;
                            }
                            if (ab.lIllIIlIIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIlIIlIll[3]);
                                0;
                            }
                            int[] nArray = new int[llIlIIlIll[9]];
                            nArray[ab.llIlIIlIll[0]] = llIlIIlIll[10];
                            nArray[ab.llIlIIlIll[1]] = llIlIIlIll[11];
                            nArray[ab.llIlIIlIll[3]] = llIlIIlIll[12];
                            nArray[ab.llIlIIlIll[5]] = llIlIIlIll[13];
                            nArray[ab.llIlIIlIll[6]] = llIlIIlIll[4];
                            nArray[ab.llIlIIlIll[7]] = llIlIIlIll[14];
                            if (ab.lIllIIlIIIIIl(e.c(nArray) ? 1 : 0)) {
                                ab.Q();
                                System.out.println(llIlIIIllI[llIlIIlIll[9]]);
                                bt = llIlIIlIll[1];
                                return;
                            }
                            int[] nArray3 = new int[llIlIIlIll[9]];
                            nArray3[ab.llIlIIlIll[0]] = llIlIIlIll[10];
                            nArray3[ab.llIlIIlIll[1]] = llIlIIlIll[11];
                            nArray3[ab.llIlIIlIll[3]] = llIlIIlIll[12];
                            nArray3[ab.llIlIIlIll[5]] = llIlIIlIll[13];
                            nArray3[ab.llIlIIlIll[6]] = llIlIIlIll[4];
                            nArray3[ab.llIlIIlIll[7]] = llIlIIlIll[14];
                            if (ab.lIllIIIllllll(e.c(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)llIlIIlIll[11], (int)llIlIIlIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIIlIll[1]);
                                0;
                                Bank.withdraw((int)llIlIIlIll[14], (int)llIlIIlIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIIlIll[1]);
                                0;
                                Bank.withdraw((int)llIlIIlIll[16], (int)llIlIIlIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIIlIll[1]);
                                0;
                                Bank.withdraw((int)llIlIIlIll[13], (int)llIlIIlIll[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIIlIll[1]);
                                0;
                                Bank.withdraw((int)llIlIIlIll[10], (int)llIlIIlIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)llIlIIlIll[1]);
                                0;
                                a.b(f.ba, llIlIIlIll[6]);
                                a.a(llIlIIlIll[4], llIlIIlIll[15]);
                                a.b(f.bk, llIlIIlIll[1]);
                            }
                        }
                    }
                }
                if (ab.lIllIIlIIIIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && ab.lIllIIIllllll(ab.an() ? 1 : 0)) {
                    if (ab.lIllIIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(mN), llIlIIlIll[3])) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[17]];
                        if (ab.lIllIIlIIIIII(cG, llIlIIlIll[1])) {
                            e.x();
                            cG += llIlIIlIll[1];
                        }
                        Movement.walkTo((WorldPoint)mN);
                        0;
                        Time.sleepTicks((int)llIlIIlIll[1]);
                        0;
                    }
                    if (ab.lIllIIlIIIllI(Players.getLocal().getWorldLocation().distanceTo(mN), llIlIIlIll[3])) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[18]];
                        if (ab.lIllIIlIIIIIl(ab.lIllIIIlllllI(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (ab.lIllIIIllllll(ab.lIllIIIlllllI(g, 0L)) && ab.lIllIIlIIIIll(ab.lIllIIIlllllI(e.a(g), 30000L))) {
                            cG = llIlIIlIll[0];
                            g = System.currentTimeMillis();
                        }
                        if (ab.lIllIIlIIIIII(cG, llIlIIlIll[1])) {
                            e.x();
                            cG += llIlIIlIll[1];
                        }
                        if (ab.lIllIIIllllll(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[llIlIIlIll[1]];
                            nArray[ab.llIlIIlIll[0]] = llIlIIlIll[4];
                            Inventory.getFirst((int[])nArray).interact(llIlIIIllI[llIlIIlIll[19]]);
                            Time.sleepTicks((int)llIlIIlIll[3]);
                            0;
                        }
                        o.c.k.i.-.l.o.f.-.n.c.t.e.s.g.a(llIlIIIllI[llIlIIlIll[15]], mM, llIlIIlIll[1]);
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[1])) {
                    di = llIlIIlIll[0];
                    String[] stringArray = new String[llIlIIlIll[1]];
                    stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[20]];
                    if (ab.lIllIIlIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        o.c.k.i.-.l.o.f.-.n.c.t.e.s.g.a(mM);
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[3])) {
                    if (ab.lIllIIIllllll(Inventory.contains(item -> item.getName().contains(llIlIIIllI[llIlIIlIll[61]])) ? 1 : 0) && ab.lIllIIlIIIIIl(Equipment.contains(item -> item.getName().contains(llIlIIIllI[llIlIIlIll[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(llIlIIIllI[llIlIIlIll[53]])).interact(llIlIIIllI[llIlIIlIll[21]]);
                    }
                    if (ab.lIllIIIllllll(Inventory.contains(item -> item.getName().contains(llIlIIIllI[llIlIIlIll[59]])) ? 1 : 0) && ab.lIllIIlIIIIIl(Equipment.contains(item -> item.getName().contains(llIlIIIllI[llIlIIlIll[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(llIlIIIllI[llIlIIlIll[57]])).interact(llIlIIIllI[llIlIIlIll[22]]);
                    }
                    if (ab.lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals((Object)mO) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[23]];
                        Movement.walkTo((WorldPoint)mO);
                        0;
                        Time.sleepTicks((int)llIlIIlIll[1]);
                        0;
                    }
                    if (ab.lIllIIIllllll(Players.getLocal().getWorldLocation().equals((Object)mO) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIlIll[1]];
                        stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[24]];
                        Inventory.getFirst((String[])stringArray).interact(llIlIIIllI[llIlIIlIll[25]]);
                        Time.sleepTicks((int)llIlIIlIll[3]);
                        0;
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[5])) {
                    if (ab.lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals((Object)mP) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[26]];
                        Movement.walkTo((WorldPoint)mP);
                        0;
                        Time.sleepTicks((int)llIlIIlIll[1]);
                        0;
                    }
                    if (ab.lIllIIIllllll(Players.getLocal().getWorldLocation().equals((Object)mP) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIlIll[1]];
                        stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[27]];
                        Inventory.getFirst((String[])stringArray).interact(llIlIIIllI[llIlIIlIll[28]]);
                        Time.sleepTicks((int)llIlIIlIll[3]);
                        0;
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[6])) {
                    if (ab.lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals((Object)mQ) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[29]];
                        Movement.walkTo((WorldPoint)mQ);
                        0;
                        Time.sleepTicks((int)llIlIIlIll[1]);
                        0;
                    }
                    if (ab.lIllIIIllllll(Players.getLocal().getWorldLocation().equals((Object)mQ) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIlIll[1]];
                        stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[30]];
                        Inventory.getFirst((String[])stringArray).interact(llIlIIIllI[llIlIIlIll[31]]);
                        Time.sleepTicks((int)llIlIIlIll[3]);
                        0;
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[7])) {
                    if (ab.lIllIIlIIIIIl(Players.getLocal().getWorldLocation().equals((Object)mR) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[32]];
                        Movement.walkTo((WorldPoint)mR);
                        0;
                        Time.sleepTicks((int)llIlIIlIll[1]);
                        0;
                    }
                    if (ab.lIllIIIllllll(Players.getLocal().getWorldLocation().equals((Object)mR) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIlIll[1]];
                        stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[33]];
                        Inventory.getFirst((String[])stringArray).interact(llIlIIIllI[llIlIIlIll[34]]);
                        Time.sleepTicks((int)llIlIIlIll[3]);
                        0;
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[9])) {
                    if (ab.lIllIIlIIIlIl(Players.getLocal().getWorldLocation().distanceTo(mS), llIlIIlIll[5])) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[35]];
                        Movement.walkTo((WorldPoint)mS);
                        0;
                        Time.sleepTicks((int)llIlIIlIll[1]);
                        0;
                    }
                    if (ab.lIllIIlIIIllI(Players.getLocal().getWorldLocation().distanceTo(mS), llIlIIlIll[5])) {
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[36]];
                        if (ab.lIllIIlIIIIII(di, llIlIIlIll[1])) {
                            aN.sN += llIlIIlIll[1];
                            aN.u(AccBuilderSotf.m);
                            di += llIlIIlIll[1];
                            aN.sN = llIlIIlIll[0];
                            dj = llIlIIlIll[0];
                        }
                        o.c.k.i.-.l.o.f.-.n.c.t.e.s.g.a(llIlIIIllI[llIlIIlIll[37]], mM);
                    }
                }
                if (ab.lIllIIlIIIlll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[17])) {
                    o.c.k.i.-.l.o.f.-.n.c.t.e.s.g.a(mM);
                }
                do {
                    int[] nArray = new int[llIlIIlIll[1]];
                    nArray[ab.llIlIIlIll[0]] = llIlIIlIll[38];
                    if (!ab.lIllIIIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (ab.lIllIIlIIIlII(Widgets.get((int)llIlIIlIll[39]))) {
                        Widget var23;
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[40]];
                        int[] nArray4 = new int[llIlIIlIll[1]];
                        nArray4[ab.llIlIIlIll[0]] = llIlIIlIll[38];
                        Inventory.getFirst((int[])nArray4).interact(llIlIIIllI[llIlIIlIll[41]]);
                        Time.sleepTicks((int)llIlIIlIll[6]);
                        0;
                        AccBuilderSotf.c = llIlIIIllI[llIlIIlIll[42]];
                        var17 = Widgets.get((int)llIlIIlIll[39], (int)llIlIIlIll[23]);
                        if (ab.lIllIIlIIIlII(var17)) {
                            var17.interact(llIlIIIllI[llIlIIlIll[43]]);
                            Time.sleepTicks((int)llIlIIlIll[1]);
                            0;
                        }
                        if (ab.lIllIIlIIIlII(var23 = Widgets.get((int)llIlIIlIll[39], (int)llIlIIlIll[35]))) {
                            var23.interact(llIlIIIllI[llIlIIlIll[44]]);
                            Time.sleepTicks((int)llIlIIlIll[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)llIlIIlIll[1]);
                    0;
                    0;
                } while (null == null);
                return;
            }
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.g.a(new String[llIlIIlIll[0]]);
        }
    }

    private static void lIllIIIllIIll() {
        llIlIIIllI = new String[llIlIIlIll[88]];
        ab.llIlIIIllI[ab.llIlIIlIll[0]] = ab."Buying items";
        ab.llIlIIIllI[ab.llIlIIlIll[1]] = ab."Finished buying items, switching back to quest";
        ab.llIlIIIllI[ab.llIlIIlIll[3]] = ab."Drink";
        ab.llIlIIIllI[ab.llIlIIlIll[5]] = ab."Eat";
        ab.llIlIIIllI[ab.llIlIIlIll[6]] = ab."Nav to bank";
        ab.llIlIIIllI[ab.llIlIIlIll[7]] = ab."Handling banking";
        ab.llIlIIIllI[ab.llIlIIlIll[9]] = ab."We are missing quest supplies, switching to BUYING";
        ab.llIlIIIllI[ab.llIlIIlIll[17]] = ab."Nav to start";
        ab.llIlIIIllI[ab.llIlIIlIll[18]] = ab."Interact npc";
        ab.llIlIIIllI[ab.llIlIIlIll[19]] = ab."Drop";
        ab.llIlIIIllI[ab.llIlIIlIll[15]] = ab."Veos";
        ab.llIlIIIllI[ab.llIlIIlIll[20]] = ab."Treasure scroll";
        ab.llIlIIIllI[ab.llIlIIlIll[21]] = ab."Wear";
        ab.llIlIIIllI[ab.llIlIIlIll[22]] = ab."Wear";
        ab.llIlIIIllI[ab.llIlIIlIll[23]] = ab."Nav to dig 1";
        ab.llIlIIIllI[ab.llIlIIlIll[24]] = ab."Spade";
        ab.llIlIIIllI[ab.llIlIIlIll[25]] = ab."Dig";
        ab.llIlIIIllI[ab.llIlIIlIll[26]] = ab."Nav to dig 2";
        ab.llIlIIIllI[ab.llIlIIlIll[27]] = ab."Spade";
        ab.llIlIIIllI[ab.llIlIIlIll[28]] = ab."Dig";
        ab.llIlIIIllI[ab.llIlIIlIll[29]] = ab."Nav to dig 3";
        ab.llIlIIIllI[ab.llIlIIlIll[30]] = ab."Spade";
        ab.llIlIIIllI[ab.llIlIIlIll[31]] = ab."Dig";
        ab.llIlIIIllI[ab.llIlIIlIll[32]] = ab."Nav to dig 4";
        ab.llIlIIIllI[ab.llIlIIlIll[33]] = ab."Spade";
        ab.llIlIIIllI[ab.llIlIIlIll[34]] = ab."Dig";
        ab.llIlIIIllI[ab.llIlIIlIll[35]] = ab."Nav to veos finish";
        ab.llIlIIIllI[ab.llIlIIlIll[36]] = ab."Interact npc";
        ab.llIlIIIllI[ab.llIlIIlIll[37]] = ab."Veos";
        ab.llIlIIIllI[ab.llIlIIlIll[40]] = ab."Rubbing lamp";
        ab.llIlIIIllI[ab.llIlIIlIll[41]] = ab."Rub";
        ab.llIlIIIllI[ab.llIlIIlIll[42]] = ab."Selecting slayer";
        ab.llIlIIIllI[ab.llIlIIlIll[43]] = ab."Slayer";
        ab.llIlIIIllI[ab.llIlIIlIll[44]] = ab."Confirm";
        ab.llIlIIIllI[ab.llIlIIlIll[45]] = ab."Spade";
        ab.llIlIIIllI[ab.llIlIIlIll[55]] = ab."X marks the spot quest";
        ab.llIlIIIllI[ab.llIlIIlIll[56]] = ab."ring of wealth (";
        ab.llIlIIIllI[ab.llIlIIlIll[57]] = ab."wealth";
        ab.llIlIIIllI[ab.llIlIIlIll[58]] = ab."wealth";
        ab.llIlIIIllI[ab.llIlIIlIll[59]] = ab."wealth";
        ab.llIlIIIllI[ab.llIlIIlIll[53]] = ab."glory";
        ab.llIlIIIllI[ab.llIlIIlIll[60]] = ab."glory";
        ab.llIlIIIllI[ab.llIlIIlIll[61]] = ab."glory";
        ab.llIlIIIllI[ab.llIlIIlIll[62]] = ab."Ok, I'm up for an adventure.";
        ab.llIlIIIllI[ab.llIlIIlIll[63]] = ab."A glass of your finest ale please.";
        ab.llIlIIIllI[ab.llIlIIlIll[64]] = ab."Morgan needs your help!";
        ab.llIlIIIllI[ab.llIlIIlIll[65]] = ab."Yes.";
        ab.llIlIIIllI[ab.llIlIIlIll[66]] = ab."I'm looking for a quest!";
        ab.llIlIIIllI[ab.llIlIIlIll[67]] = ab."Ok, let me help then.";
        ab.llIlIIIllI[ab.llIlIIlIll[68]] = ab."Father Aereck sent me to talk to you.";
        ab.llIlIIIllI[ab.llIlIIlIll[69]] = ab."He's got a ghost haunting his graveyard.";
        ab.llIlIIIllI[ab.llIlIIlIll[70]] = ab."Yep, now tell me what the problem is.";
        ab.llIlIIIllI[ab.llIlIIlIll[71]] = ab."Sure.";
        ab.llIlIIIllI[ab.llIlIIlIll[72]] = ab."I'm wearing an amulet of ghost speak!";
        ab.llIlIIIllI[ab.llIlIIlIll[73]] = ab."Yes, I'm sure.";
        ab.llIlIIIllI[ab.llIlIIlIll[48]] = ab."How can I help?";
        ab.llIlIIIllI[ab.llIlIIlIll[74]] = ab."I'm looking for a quest.";
        ab.llIlIIIllI[ab.llIlIIlIll[75]] = ab."Can I help?";
    }

    private static String lIllIIIlIIlIl(String var16, String var5) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llIlIIlIll[18]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIlIIlIll[3], var22);
            return new String(var11.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIllllII() {
        llIlIIlIll = new int[89];
        ab.llIlIIlIll[0] = 3 & ~3;
        ab.llIlIIlIll[1] = 1;
        ab.llIlIIlIll[2] = 68 + 49 - 32 + 50 ^ 9 + 7 - -77 + 100;
        ab.llIlIIlIll[3] = 2;
        ab.llIlIIlIll[4] = -(0xFFFFA60F & 0x7FF5) & (0xFFFFE77F & 0x3FFF);
        ab.llIlIIlIll[5] = 3;
        ab.llIlIIlIll[6] = 0x79 ^ 0x7D;
        ab.llIlIIlIll[7] = 0xE ^ 0xB;
        ab.llIlIIlIll[8] = -(0xFFFFD93D & 0x6ED7) & (0xFFFFFBDD & 0x5FBE);
        ab.llIlIIlIll[9] = 0x77 ^ 0x71;
        ab.llIlIIlIll[10] = -(0xFFFFD167 & 0x7FB9) & (0xFFFFFFFB & 0x7FEE);
        ab.llIlIIlIll[11] = 0xFFFFDF59 & 0x3FEE;
        ab.llIlIIlIll[12] = 0xFFFFFB51 & 0x35FF;
        ab.llIlIIlIll[13] = -(46 + 83 - -8 + 24) & (0xFFFFBFF7 & 0x5FEF);
        ab.llIlIIlIll[14] = -(0xFFFFEEF2 & 0x7D0F) & (0xFFFFEFFD & 0x7FBB);
        ab.llIlIIlIll[15] = 0x69 ^ 0xB ^ (0xEC ^ 0x84);
        ab.llIlIIlIll[16] = -(0xFFFFB56F & 0x6AB1) & (0xFFFFFF6B & 0x3FFD);
        ab.llIlIIlIll[17] = 3 + 88 - 40 + 108 ^ 126 + 52 - 89 + 63;
        ab.llIlIIlIll[18] = 0x6E ^ 0x66;
        ab.llIlIIlIll[19] = 69 + 126 - 30 + 36 ^ 7 + 112 - -42 + 31;
        ab.llIlIIlIll[20] = 0x75 ^ 0x4A ^ (0x84 ^ 0xB0);
        ab.llIlIIlIll[21] = 85 + 128 - 143 + 66 ^ 42 + 28 - -49 + 13;
        ab.llIlIIlIll[22] = 0x5B ^ 0x3F ^ (0x78 ^ 0x11);
        ab.llIlIIlIll[23] = 0xA0 ^ 0xBA ^ (0xA8 ^ 0xBC);
        ab.llIlIIlIll[24] = 0x5F ^ 0x50;
        ab.llIlIIlIll[25] = 1 ^ 0x34 ^ (0x25 ^ 0);
        ab.llIlIIlIll[26] = 0xB ^ 0x1A;
        ab.llIlIIlIll[27] = 4 ^ 0x27 ^ (9 ^ 0x38);
        ab.llIlIIlIll[28] = 0x1F ^ 0xC;
        ab.llIlIIlIll[29] = 0xD0 ^ 0xC4;
        ab.llIlIIlIll[30] = 0x8D ^ 0x98;
        ab.llIlIIlIll[31] = 157 + 203 - 275 + 124 ^ 17 + 34 - -77 + 71;
        ab.llIlIIlIll[32] = 24 + 119 - 80 + 101 ^ 21 + 68 - 52 + 142;
        ab.llIlIIlIll[33] = 4 ^ 0x12 ^ (8 ^ 6);
        ab.llIlIIlIll[34] = 0x22 ^ 0x16 ^ (0xEC ^ 0xC1);
        ab.llIlIIlIll[35] = 1 ^ 0x1B;
        ab.llIlIIlIll[36] = 70 + 23 - 65 + 148 ^ 169 + 114 - 181 + 69;
        ab.llIlIIlIll[37] = 0xAC ^ 0x8B ^ (0 ^ 0x3B);
        ab.llIlIIlIll[38] = 0xFFFFFBAA & 0x5E75;
        ab.llIlIIlIll[39] = (0xB6 ^ 0xAF) + 2 - -(62 + 104 - 135 + 114) + (0x50 ^ 0x14);
        ab.llIlIIlIll[40] = 0x74 ^ 0x4F ^ (0xA9 ^ 0x8F);
        ab.llIlIIlIll[41] = 0x1B ^ 5;
        ab.llIlIIlIll[42] = 0xAC ^ 0xB3;
        ab.llIlIIlIll[43] = 0x1A ^ 0x3A;
        ab.llIlIIlIll[44] = 0x9A ^ 0xBB;
        ab.llIlIIlIll[45] = 0x56 ^ 0x74;
        ab.llIlIIlIll[46] = 0xFFFFFEBF & 0x3F5C;
        ab.llIlIIlIll[47] = 0xFFFFBF4D & 0x57BE;
        ab.llIlIIlIll[48] = 0x59 ^ 0x72 ^ (0xB8 ^ 0xA4);
        ab.llIlIIlIll[49] = 0xFFFFB1FF & 0x4FF4;
        ab.llIlIIlIll[50] = -(0xFFFF9B67 & 0x7599) & (0xFFFFFFDC & 0x3FEF);
        ab.llIlIIlIll[51] = -(0xFFFFFEDF & 0x1B62) & (0xFFFFFFF9 & 0x7BEF);
        ab.llIlIIlIll[52] = -(0xFFFFDCBD & 0x3BD3) & (0xFFFFFFFF & 0x1FFC);
        ab.llIlIIlIll[53] = 0x14 ^ 0x37 ^ (0xA2 ^ 0xA9);
        ab.llIlIIlIll[54] = 0x54 ^ 0x31 ^ 1;
        ab.llIlIIlIll[55] = 0x5A ^ 0x79;
        ab.llIlIIlIll[56] = 0xDB ^ 0x84 ^ (0x1B ^ 0x60);
        ab.llIlIIlIll[57] = 0x67 ^ 0x42;
        ab.llIlIIlIll[58] = 0xE7 ^ 0xC1;
        ab.llIlIIlIll[59] = 0xCA ^ 0xA7 ^ (0x58 ^ 0x12);
        ab.llIlIIlIll[60] = 0x53 ^ 0x40 ^ (0xB7 ^ 0x8D);
        ab.llIlIIlIll[61] = 0x5A ^ 0x12 ^ (0xC ^ 0x6E);
        ab.llIlIIlIll[62] = 0x43 ^ 0x68;
        ab.llIlIIlIll[63] = 0x1C ^ 0x30;
        ab.llIlIIlIll[64] = 0x48 ^ 0x65;
        ab.llIlIIlIll[65] = 0xF8 ^ 0xC5 ^ (0x7C ^ 0x6F);
        ab.llIlIIlIll[66] = 99 + 93 - 188 + 179 ^ 125 + 142 - 206 + 91;
        ab.llIlIIlIll[67] = 0xC3 ^ 0xB8 ^ (0xD5 ^ 0x9E);
        ab.llIlIIlIll[68] = 0x95 ^ 0xA4;
        ab.llIlIIlIll[69] = 82 + 32 - 63 + 86 ^ 178 + 65 - 124 + 68;
        ab.llIlIIlIll[70] = 0x13 ^ 0x20;
        ab.llIlIIlIll[71] = 0x6E ^ 0x5A;
        ab.llIlIIlIll[72] = 0x9F ^ 0xAA;
        ab.llIlIIlIll[73] = 0x13 ^ 0x62 ^ (0x3B ^ 0x7C);
        ab.llIlIIlIll[74] = 31 + 41 - 47 + 149 ^ 96 + 133 - 95 + 16;
        ab.llIlIIlIll[75] = 0x7C ^ 0x45;
        ab.llIlIIlIll[76] = 0xFFFF8FDF & 0x7CBD;
        ab.llIlIIlIll[77] = 0xFFFFBDEB & 0x4EBC;
        ab.llIlIIlIll[78] = -(0xFFFFF73F & 0x29C2) & (0xFFFFAFFF & 0x7D9F);
        ab.llIlIIlIll[79] = 0xFFFFBCBF & 0x4FC9;
        ab.llIlIIlIll[80] = 0xFFFF8FFB & 0x7C87;
        ab.llIlIIlIll[81] = 0xFFFF8D9D & 0x7EEE;
        ab.llIlIIlIll[82] = 0xFFFF8FED & 0x7C37;
        ab.llIlIIlIll[83] = 0xFFFFFDC5 & 0xEFA;
        ab.llIlIIlIll[84] = -(0xA2 ^ 0x83) & (0xFFFF9EE6 & 0x6D3F);
        ab.llIlIIlIll[85] = -(0xFFFFBFDD & 0x5267) & (0xFFFF9FFF & 0x7EFF);
        ab.llIlIIlIll[86] = 0xFFFFFFFF & 0xBEE;
        ab.llIlIIlIll[87] = 0xFFFFEFBE & 0x1CEF;
        ab.llIlIIlIll[88] = 0x21 ^ 0x1B;
    }

    private static int lIllIIIlllllI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIllIIlIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIlIIIIlI(int n2) {
        return n2 < 0;
    }

    static {
        ab.lIllIIIllllII();
        ab.lIllIIIllIIll();
        String[] stringArray = new String[llIlIIlIll[24]];
        stringArray[ab.llIlIIlIll[0]] = llIlIIIllI[llIlIIlIll[62]];
        stringArray[ab.llIlIIlIll[1]] = llIlIIIllI[llIlIIlIll[63]];
        stringArray[ab.llIlIIlIll[3]] = llIlIIIllI[llIlIIlIll[64]];
        stringArray[ab.llIlIIlIll[5]] = llIlIIIllI[llIlIIlIll[65]];
        stringArray[ab.llIlIIlIll[6]] = llIlIIIllI[llIlIIlIll[66]];
        stringArray[ab.llIlIIlIll[7]] = llIlIIIllI[llIlIIlIll[67]];
        stringArray[ab.llIlIIlIll[9]] = llIlIIIllI[llIlIIlIll[68]];
        stringArray[ab.llIlIIlIll[17]] = llIlIIIllI[llIlIIlIll[69]];
        stringArray[ab.llIlIIlIll[18]] = llIlIIIllI[llIlIIlIll[70]];
        stringArray[ab.llIlIIlIll[19]] = llIlIIIllI[llIlIIlIll[71]];
        stringArray[ab.llIlIIlIll[15]] = llIlIIIllI[llIlIIlIll[72]];
        stringArray[ab.llIlIIlIll[20]] = llIlIIIllI[llIlIIlIll[73]];
        stringArray[ab.llIlIIlIll[21]] = llIlIIIllI[llIlIIlIll[48]];
        stringArray[ab.llIlIIlIll[22]] = llIlIIIllI[llIlIIlIll[74]];
        stringArray[ab.llIlIIlIll[23]] = llIlIIIllI[llIlIIlIll[75]];
        mM = stringArray;
        mN = new WorldPoint(llIlIIlIll[76], llIlIIlIll[77], llIlIIlIll[0]);
        mO = new WorldPoint(llIlIIlIll[78], llIlIIlIll[79], llIlIIlIll[0]);
        mP = new WorldPoint(llIlIIlIll[80], llIlIIlIll[81], llIlIIlIll[0]);
        mQ = new WorldPoint(llIlIIlIll[82], llIlIIlIll[83], llIlIIlIll[0]);
        mR = new WorldPoint(llIlIIlIll[84], llIlIIlIll[85], llIlIIlIll[0]);
        mS = new WorldPoint(llIlIIlIll[86], llIlIIlIll[87], llIlIIlIll[0]);
        bv = new ArrayList<d>();
        cG = llIlIIlIll[0];
    }

    private static boolean lIllIIlIIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIllllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (ab.lIllIIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIlIIlIll[18])) {
            int[] nArray = new int[llIlIIlIll[1]];
            nArray[ab.llIlIIlIll[0]] = llIlIIlIll[38];
            if (ab.lIllIIlIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIlIIlIll[1];
                0;
                if ((0x68 ^ 0x6C) > -1) return n2 != 0;
                return false;
            }
        }
        n2 = llIlIIlIll[0];
        return n2 != 0;
    }

    private static boolean lIllIIlIIIlll(int n2, int n3) {
        return n2 == n3;
    }
}


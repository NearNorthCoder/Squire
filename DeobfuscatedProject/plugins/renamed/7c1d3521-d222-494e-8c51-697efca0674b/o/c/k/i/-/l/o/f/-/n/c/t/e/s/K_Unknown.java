/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.Q_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ax_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class K_Unknown
implements ac {
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] cE;
    private static /* synthetic */ int[] llIIIIlIII;
    public static final /* synthetic */ WorldPoint gl;
    static /* synthetic */ boolean dj;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint gk;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIIIIIlll;

    static {
        K.lIlIIIllIllll();
        K.lIlIIIllIlllI();
        gk = new WorldPoint(llIIIIlIII[67], llIIIIlIII[68], llIIIIlIII[4]);
        gl = new WorldPoint(llIIIIlIII[69], llIIIIlIII[70], llIIIIlIII[4]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIIlIII[23]];
        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[71]];
        stringArray[K.llIIIIlIII[3]] = llIIIIIlll[llIIIIlIII[72]];
        stringArray[K.llIIIIlIII[1]] = llIIIIIlll[llIIIIlIII[73]];
        stringArray[K.llIIIIlIII[12]] = llIIIIIlll[llIIIIlIII[74]];
        stringArray[K.llIIIIlIII[7]] = llIIIIIlll[llIIIIlIII[75]];
        stringArray[K.llIIIIlIII[15]] = llIIIIIlll[llIIIIlIII[76]];
        stringArray[K.llIIIIlIII[17]] = llIIIIIlll[llIIIIlIII[77]];
        stringArray[K.llIIIIlIII[8]] = llIIIIIlll[llIIIIlIII[78]];
        cE = stringArray;
    }

    private static boolean lIlIIIlllIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIIIIlIII[4];
    }

    private static String lIlIIIllIlIll(String var8, String var10) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var19 = llIIIIlIII[4];
        char[] var17 = var8.toCharArray();
        int var6 = var17.length;
        int var5 = llIIIIlIII[4];
        while (K.lIlIIIlllIIII(var5, var6)) {
            char var18 = var17[var5];
            var20.append((char)(var18 ^ var12[var19 % var12.length]));
            0;
            ++var19;
            ++var5;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    @Override
    public int af() {
        try {
            System.out.println("678: " + e.j(llIIIIlIII[5]));
            K.cy();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == ((0xAE ^ 0xA9 ^ (0x1D ^ 0x4E)) & (195 + 82 - 275 + 194 ^ 37 + 92 - 15 + 30 ^ -1))) {
            return (69 + 58 - 47 + 90 ^ 74 + 16 - -37 + 25) & (0xCF ^ 0xA6 ^ (0x55 ^ 0xE) ^ -1);
        }
        return llIIIIlIII[57];
    }

    private static void Q() {
        block16: {
            d var2;
            block15: {
                Object var9;
                block14: {
                    block13: {
                        int[] nArray = new int[llIIIIlIII[3]];
                        nArray[K.llIIIIlIII[4]] = llIIIIlIII[19];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIIIIlIII[19], llIIIIlIII[2], j.cf);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llIIIIlIII[3]];
                        nArray2[K.llIIIIlIII[4]] = llIIIIlIII[11];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var9 = new d(llIIIIlIII[11], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((d)var9);
                            0;
                        }
                        int[] nArray3 = new int[llIIIIlIII[3]];
                        nArray3[K.llIIIIlIII[4]] = llIIIIlIII[14];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var9 = new d(llIIIIlIII[14], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((d)var9);
                            0;
                        }
                        int[] nArray4 = new int[llIIIIlIII[3]];
                        nArray4[K.llIIIIlIII[4]] = llIIIIlIII[18];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var9 = new d(llIIIIlIII[18], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((d)var9);
                            0;
                        }
                        int[] nArray5 = new int[llIIIIlIII[3]];
                        nArray5[K.llIIIIlIII[4]] = llIIIIlIII[16];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var9 = new d(llIIIIlIII[16], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((d)var9);
                            0;
                        }
                        int[] nArray6 = new int[llIIIIlIII[3]];
                        nArray6[K.llIIIIlIII[4]] = llIIIIlIII[13];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var9 = new d(llIIIIlIII[13], llIIIIlIII[3], llIIIIlIII[52]);
                            bv.add((d)var9);
                            0;
                        }
                        int[] nArray7 = new int[llIIIIlIII[3]];
                        nArray7[K.llIIIIlIII[4]] = llIIIIlIII[10];
                        if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[llIIIIlIII[3]];
                        nArray8[K.llIIIIlIII[4]] = llIIIIlIII[10];
                        if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[llIIIIlIII[3]];
                        nArray9[K.llIIIIlIII[4]] = llIIIIlIII[10];
                        if (!K.lIlIIIlllIIII(Bank.getFirst((int[])nArray9).getQuantity(), llIIIIlIII[2])) break block14;
                    }
                    var9 = new d(llIIIIlIII[10], llIIIIlIII[2], llIIIIlIII[53]);
                    bv.add((d)var9);
                    0;
                }
                if (K.lIlIIIlllIlII(Bank.contains((Predicate)(var9 = item -> item.getName().toLowerCase().contains(llIIIIIlll[llIIIIlIII[59]]))) ? 1 : 0)) {
                    var2 = new d(llIIIIlIII[54], llIIIIlIII[15], llIIIIlIII[55]);
                    bv.add(var2);
                    0;
                }
                int[] nArray = new int[llIIIIlIII[3]];
                nArray[K.llIIIIlIII[4]] = llIIIIlIII[9];
                if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[llIIIIlIII[3]];
                nArray10[K.llIIIIlIII[4]] = llIIIIlIII[9];
                if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[llIIIIlIII[3]];
                nArray11[K.llIIIIlIII[4]] = llIIIIlIII[9];
                if (!K.lIlIIIlllIIII(Bank.getFirst((int[])nArray11).getQuantity(), llIIIIlIII[2])) break block16;
            }
            var2 = new d(llIIIIlIII[9], llIIIIlIII[56], llIIIIlIII[52]);
            bv.add(var2);
            0;
        }
    }

    public static void cz() {
        String[] stringArray = new String[llIIIIlIII[3]];
        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[46]];
        if (K.lIlIIIllllIIl(NPCs.getNearest((String[])stringArray))) {
            if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                if (K.lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)gk);
                0;
                Time.sleepTicks((int)llIIIIlIII[3]);
                0;
            }
            if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[47]];
                String[] stringArray2 = new String[llIIIIlIII[3]];
                stringArray2[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[48]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIIIIlll[llIIIIlIII[0]]);
                Time.sleepTicks((int)llIIIIlIII[1]);
                0;
            }
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (K.lIlIIIllllIlI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = llIIIIlIII[3];
            0;
            
            }
        } else {
            bl = llIIIIlIII[4];
        }
        return bl;
    }

    private static boolean lIlIIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static void cy() {
        if (K.lIlIIIlllIIII(e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            Q.ds();
        }
        if (K.lIlIIIlllIIII(Skills.getLevel((Skill)Skill.COOKING), llIIIIlIII[2]) && K.lIlIIIlllIIIl(e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            ax.gz();
        }
        if (K.lIlIIIlllIIlI(Skills.getLevel((Skill)Skill.COOKING), llIIIIlIII[2]) && K.lIlIIIlllIIIl(e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            if (K.lIlIIIlllIIll(bt ? 1 : 0)) {
                b.a(bv);
                if (K.lIlIIIlllIIII(bv.size(), llIIIIlIII[3])) {
                    System.out.println(llIIIIIlll[llIIIIlIII[4]]);
                    bt = llIIIIlIII[4];
                }
            }
            if (K.lIlIIIlllIlII(bt ? 1 : 0)) {
                BankLocation var4;
                if (K.lIlIIIlllIlII(K.an() ? 1 : 0) && K.lIlIIIlllIlII(e.j(llIIIIlIII[5]))) {
                    var4 = BankLocation.getNearest();
                    if (K.lIlIIIlllIlIl(var4) && K.lIlIIIlllIlII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[3]];
                        a.a(var4);
                    }
                    if (K.lIlIIIlllIlIl(var4) && K.lIlIIIlllIIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (K.lIlIIIlllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlIII[6]);
                            0;
                        }
                        if (K.lIlIIIlllIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[1]];
                            if (K.lIlIIIlllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIlIII[7]);
                                0;
                            }
                            if (K.lIlIIIlllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIlIII[1]);
                                0;
                            }
                            int[] nArray = new int[llIIIIlIII[8]];
                            nArray[K.llIIIIlIII[4]] = llIIIIlIII[9];
                            nArray[K.llIIIIlIII[3]] = llIIIIlIII[10];
                            nArray[K.llIIIIlIII[1]] = llIIIIlIII[11];
                            nArray[K.llIIIIlIII[12]] = llIIIIlIII[13];
                            nArray[K.llIIIIlIII[7]] = llIIIIlIII[14];
                            nArray[K.llIIIIlIII[15]] = llIIIIlIII[16];
                            nArray[K.llIIIIlIII[17]] = llIIIIlIII[18];
                            if (K.lIlIIIlllIlII(e.c(nArray) ? 1 : 0)) {
                                K.Q();
                                System.out.println(llIIIIIlll[llIIIIlIII[12]]);
                                bt = llIIIIlIII[3];
                                return;
                            }
                            int[] nArray2 = new int[llIIIIlIII[8]];
                            nArray2[K.llIIIIlIII[4]] = llIIIIlIII[9];
                            nArray2[K.llIIIIlIII[3]] = llIIIIlIII[10];
                            nArray2[K.llIIIIlIII[1]] = llIIIIlIII[11];
                            nArray2[K.llIIIIlIII[12]] = llIIIIlIII[13];
                            nArray2[K.llIIIIlIII[7]] = llIIIIlIII[14];
                            nArray2[K.llIIIIlIII[15]] = llIIIIlIII[16];
                            nArray2[K.llIIIIlIII[17]] = llIIIIlIII[18];
                            if (K.lIlIIIlllIIll(e.c(nArray2) ? 1 : 0)) {
                                a.a(llIIIIlIII[9], llIIIIlIII[2]);
                                a.a(llIIIIlIII[10], llIIIIlIII[2]);
                                a.a(llIIIIlIII[11], llIIIIlIII[3]);
                                a.a(llIIIIlIII[13], llIIIIlIII[3]);
                                a.a(llIIIIlIII[14], llIIIIlIII[3]);
                                a.a(llIIIIlIII[16], llIIIIlIII[3]);
                                a.a(llIIIIlIII[18], llIIIIlIII[3]);
                                a.a(llIIIIlIII[19], llIIIIlIII[1]);
                                a.a(llIIIIlIII[20], llIIIIlIII[6]);
                            }
                        }
                    }
                }
                if (K.lIlIIIlllIIll(Inventory.contains((int[])f.ba) ? 1 : 0) && K.lIlIIIlllIIII(Movement.getRunEnergy(), llIIIIlIII[21])) {
                    Inventory.getFirst((int[])f.ba).interact(llIIIIIlll[llIIIIlIII[7]]);
                    Time.sleepTicks((int)llIIIIlIII[3]);
                    0;
                }
                if (K.lIlIIIlllIlII(e.j(llIIIIlIII[5])) && K.lIlIIIlllIIll(K.an() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[15]];
                    if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                        if (K.lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)gk);
                        0;
                        Time.sleepTicks((int)llIIIIlIII[3]);
                        0;
                    }
                    if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                        AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[17]];
                        g.a(llIIIIIlll[llIIIIlIII[8]], cE);
                    }
                }
                if (K.lIlIIIlllIIIl(e.j(llIIIIlIII[5]), llIIIIlIII[3])) {
                    int[] nArray = new int[llIIIIlIII[3]];
                    nArray[K.llIIIIlIII[4]] = llIIIIlIII[22];
                    if (K.lIlIIIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIIlIII[3]];
                        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[23]];
                        if (K.lIlIIIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            di = llIIIIlIII[4];
                            if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gl), llIIIIlIII[7])) {
                                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[24]];
                                var4 = new WorldArea(llIIIIlIII[25], llIIIIlIII[26], llIIIIlIII[27], llIIIIlIII[28], llIIIIlIII[4]);
                                if (K.lIlIIIlllIlII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (K.lIlIIIlllIIll(Inventory.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[66]])) ? 1 : 0) && K.lIlIIIlllIlII(Equipment.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[65]])).interact(llIIIIIlll[llIIIIlIII[2]]);
                                    }
                                    if (K.lIlIIIlllIIll(Equipment.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[64]])) ? 1 : 0) && K.lIlIIIlllIIIl(Players.getLocal().getAnimation(), llIIIIlIII[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[63]])).interact(llIIIIIlll[llIIIIlIII[30]]);
                                        Time.sleepTicks((int)llIIIIlIII[7]);
                                        0;
                                    }
                                }
                                if (K.lIlIIIlllIIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gl);
                                    0;
                                    Time.sleepTicks((int)llIIIIlIII[3]);
                                    0;
                                }
                            }
                            if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gl), llIIIIlIII[7])) {
                                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[31]];
                                if (K.lIlIIIlllIIll(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[llIIIIlIII[3]];
                                    stringArray2[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(llIIIIIlll[llIIIIlIII[34]]);
                                    Time.sleepTicks((int)llIIIIlIII[12]);
                                    0;
                                }
                                if (K.lIlIIIlllIlII(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)llIIIIlIII[32], (int)llIIIIlIII[35], (int)llIIIIlIII[3]).interact(llIIIIIlll[llIIIIlIII[36]]);
                                    Time.sleepTicks((int)llIIIIlIII[1]);
                                    0;
                                }
                                int[] nArray3 = new int[llIIIIlIII[3]];
                                nArray3[K.llIIIIlIII[4]] = llIIIIlIII[22];
                                if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray3) ? 1 : 0) && K.lIlIIIlllIlII(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)llIIIIlIII[32], (int)llIIIIlIII[3], (int)llIIIIlIII[30]).interact(llIIIIIlll[llIIIIlIII[35]]);
                                    Time.sleepTicks((int)llIIIIlIII[3]);
                                    0;
                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[llIIIIlIII[3]];
                    nArray4[K.llIIIIlIII[4]] = llIIIIlIII[22];
                    if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIIlIII[3]];
                        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[37]];
                        if (K.lIlIIIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIIIlIII[3]];
                            nArray5[K.llIIIIlIII[4]] = llIIIIlIII[22];
                            if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray5) ? 1 : 0) && K.lIlIIIlllIlII(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)llIIIIlIII[32], (int)llIIIIlIII[3], (int)llIIIIlIII[30]).interact(llIIIIIlll[llIIIIlIII[38]]);
                                Time.sleepTicks((int)llIIIIlIII[3]);
                                0;
                            }
                            int[] nArray6 = new int[llIIIIlIII[3]];
                            nArray6[K.llIIIIlIII[4]] = llIIIIlIII[18];
                            String[] stringArray3 = new String[llIIIIlIII[3]];
                            stringArray3[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)llIIIIlIII[1]);
                            0;
                        }
                    }
                    String[] stringArray = new String[llIIIIlIII[3]];
                    stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[40]];
                    if (K.lIlIIIlllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                            if (K.lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (K.lIlIIIlllIIll(Inventory.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[62]])) ? 1 : 0) && K.lIlIIIlllIlII(Equipment.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[60]])).interact(llIIIIIlll[llIIIIlIII[41]]);
                                Time.sleepTicks((int)llIIIIlIII[1]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)gk);
                            0;
                            Time.sleepTicks((int)llIIIIlIII[3]);
                            0;
                        }
                        if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                            AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[42]];
                            if (K.lIlIIIlllIIII(di, llIIIIlIII[3])) {
                                aN.rB += llIIIIlIII[3];
                                aN.u(AccBuilderSotf.m);
                                di += llIIIIlIII[3];
                                aN.rB = llIIIIlIII[4];
                                dj = llIIIIlIII[4];
                            }
                            g.a(llIIIIIlll[llIIIIlIII[43]], cE);
                        }
                    }
                }
                if (K.lIlIIIlllIIIl(e.j(llIIIIlIII[5]), llIIIIlIII[1])) {
                    String[] stringArray = new String[llIIIIlIII[3]];
                    stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[44]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIIIlll[llIIIIlIII[45]]);
                    Time.sleepTicks((int)llIIIIlIII[1]);
                    0;
                }
            }
        }
    }

    private static boolean lIlIIIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIllllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlllIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIIIIIlll[llIIIIlIII[58]];
    }

    private static boolean lIlIIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIIIllIllll() {
        llIIIIlIII = new int[79];
        K.llIIIIlIII[0] = 0x1D ^ 0;
        K.llIIIIlIII[1] = 2;
        K.llIIIIlIII[2] = 0x8F ^ 0x85;
        K.llIIIIlIII[3] = 1;
        K.llIIIIlIII[4] = (0x83 ^ 0x9F ^ (0xF7 ^ 0xBA)) & (2 ^ (0xF2 ^ 0xA1) ^ -1);
        K.llIIIIlIII[5] = 0xFFFFABEF & 0x56B6;
        K.llIIIIlIII[6] = -(0xFFFFE556 & 0x5EFB) & (0xFFFFFFDD & 0x57FB);
        K.llIIIIlIII[7] = 0x79 ^ 0x21 ^ (0x5A ^ 6);
        K.llIIIIlIII[8] = 0x40 ^ 0x47;
        K.llIIIIlIII[9] = 0xFFFFBF5F & 0x5FE7;
        K.llIIIIlIII[10] = 0xFFFFDFFC & 0x3F4B;
        K.llIIIIlIII[11] = -(0xFFFFF4B5 & 0x7B4B) & (0xFFFFF9F9 & 0x7FFE);
        K.llIIIIlIII[12] = 3;
        K.llIIIIlIII[13] = (0xB ^ 0x5A) + (58 + 118 - 115 + 122) - (23 + 101 - 34 + 153) + (68 + 7 - -70 + 55);
        K.llIIIIlIII[14] = -(0xFFFFFB85 & 0x447B) & (0xFFFFEF75 & 0x57FF);
        K.llIIIIlIII[15] = 0xB0 ^ 0xB5;
        K.llIIIIlIII[16] = 0xFFFFEA2E & 0x1DF5;
        K.llIIIIlIII[17] = 0x66 ^ 0x1C ^ (0x63 ^ 0x1F);
        K.llIIIIlIII[18] = -(0xFFFFF986 & 0x4FFD) & (0xFFFFFBD7 & 0x4FFB);
        K.llIIIIlIII[19] = -(0xFFFFECA1 & 0x1FFF) & (0xFFFFBFFD & 0x7DF3);
        K.llIIIIlIII[20] = -(0xFFFFDCCF & 0x2B3D) & (0xFFFFABEF & 0x5FFF);
        K.llIIIIlIII[21] = 0x5E ^ 0x6C;
        K.llIIIIlIII[22] = 0xFFFFCFF6 & 0x39DF;
        K.llIIIIlIII[23] = 0x7F ^ 0x6B ^ (0x10 ^ 0xC);
        K.llIIIIlIII[24] = 0x14 ^ 0x1D;
        K.llIIIIlIII[25] = -(0xFFFFD75B & 0x3AA7) & (0xFFFFBFFF & 0x5EDF);
        K.llIIIIlIII[26] = -(0xFFFFF7BB & 0x7BCD) & (0xFFFFFFFF & 0x7FFE);
        K.llIIIIlIII[27] = 0xEA ^ 0x9C;
        K.llIIIIlIII[28] = (0xE ^ 0x2B) + (0x14 ^ 0x4F) - (0x38 ^ 0x7B) + (0x40 ^ 0xC);
        K.llIIIIlIII[29] = -1;
        K.llIIIIlIII[30] = 30 + 69 - 7 + 39 ^ 116 + 16 - -4 + 0;
        K.llIIIIlIII[31] = 0xA ^ 6;
        K.llIIIIlIII[32] = 0xFFFFF5EF & 0xB3C;
        K.llIIIIlIII[33] = 0x72 ^ 0x7F;
        K.llIIIIlIII[34] = 0xB ^ 5;
        K.llIIIIlIII[35] = 0xED ^ 0xA7 ^ (0xC5 ^ 0x9F);
        K.llIIIIlIII[36] = 0x57 ^ 0x3B ^ (0xA2 ^ 0xC1);
        K.llIIIIlIII[37] = 1 ^ 0x10;
        K.llIIIIlIII[38] = 0xF ^ 0x1D;
        K.llIIIIlIII[39] = 0xA8 ^ 0xA7 ^ (0x22 ^ 0x3E);
        K.llIIIIlIII[40] = 0x14 ^ 0;
        K.llIIIIlIII[41] = 0x3F ^ 0x2A;
        K.llIIIIlIII[42] = 0xD3 ^ 0xC5;
        K.llIIIIlIII[43] = 1 ^ (0x5D ^ 0x4B);
        K.llIIIIlIII[44] = 0x61 ^ 0x34 ^ (0x41 ^ 0xC);
        K.llIIIIlIII[45] = 152 + 118 - 206 + 100 ^ 75 + 74 - 22 + 62;
        K.llIIIIlIII[46] = 0x12 ^ 8;
        K.llIIIIlIII[47] = 0x56 ^ 0x71 ^ (1 ^ 0x3D);
        K.llIIIIlIII[48] = 0x3C ^ 0x20;
        K.llIIIIlIII[49] = 0x1A ^ 4;
        K.llIIIIlIII[50] = 0x64 ^ 0x46 ^ (0x96 ^ 0xAB);
        K.llIIIIlIII[51] = 0xFFFFBB3C & 0x67EB;
        K.llIIIIlIII[52] = 0xFFFFC7FF & 0x3B84;
        K.llIIIIlIII[53] = 0xFFFFEF7E & 0x17ED;
        K.llIIIIlIII[54] = -(0x50 ^ 0x74) & (0xFFFFFEEF & 0x2FFF);
        K.llIIIIlIII[55] = -(0xFFFFDA37 & 0x37DE) & (0xFFFFF3FD & 0x7FBF);
        K.llIIIIlIII[56] = 0x74 ^ 5 ^ (0xC ^ 0x55);
        K.llIIIIlIII[57] = 2 ^ (0x34 ^ 0x52);
        K.llIIIIlIII[58] = 0x60 ^ 0x13 ^ (0x3E ^ 0x6D);
        K.llIIIIlIII[59] = 0x65 ^ 0x44;
        K.llIIIIlIII[60] = 0x59 ^ 0x7B;
        K.llIIIIlIII[61] = 0x84 ^ 0xA7;
        K.llIIIIlIII[62] = 0x81 ^ 0xA5;
        K.llIIIIlIII[63] = 0x10 ^ 0x1A ^ (0x4F ^ 0x60);
        K.llIIIIlIII[64] = 0x14 ^ 0x32;
        K.llIIIIlIII[65] = 0xA6 ^ 0x81;
        K.llIIIIlIII[66] = 0x78 ^ 0x51;
        K.llIIIIlIII[67] = 0xFFFFEDD7 & 0x1EAF;
        K.llIIIIlIII[68] = -(0xFFFFF533 & 0x2BCE) & (0xFFFFEDDF & 0x3FAF);
        K.llIIIIlIII[69] = 0xFFFFAFB7 & 0x5D7E;
        K.llIIIIlIII[70] = -(0xFFFFF17F & 0x1EB9) & (0xFFFFDFFF & 0x3CFB);
        K.llIIIIlIII[71] = 0x11 ^ 0x3B;
        K.llIIIIlIII[72] = 0xAA ^ 0x81;
        K.llIIIIlIII[73] = 85 + 85 - 91 + 67 ^ 142 + 99 - 137 + 86;
        K.llIIIIlIII[74] = 0x49 ^ 0x64;
        K.llIIIIlIII[75] = 0x8F ^ 0xA1;
        K.llIIIIlIII[76] = 0x2B ^ 0x6D ^ (0x22 ^ 0x4B);
        K.llIIIIlIII[77] = 0x4A ^ 0x7A;
        K.llIIIIlIII[78] = 0x1C ^ 0x69 ^ (0x6C ^ 0x28);
    }

    private static boolean lIlIIIlllIllI(int n2) {
        return n2 > 0;
    }

    private static void lIlIIIllIlllI() {
        llIIIIIlll = new String[llIIIIlIII[21]];
        K.llIIIIIlll[K.llIIIIlIII[4]] = K."Finished buying items, switching back to quest";
        K.llIIIIIlll[K.llIIIIlIII[3]] = K."Nav to bank";
        K.llIIIIIlll[K.llIIIIlIII[1]] = K."Handling banking";
        K.llIIIIIlll[K.llIIIIlIII[12]] = K."We are missing quest supplies, switching to BUYING";
        K.llIIIIIlll[K.llIIIIlIII[7]] = K."Drink";
        K.llIIIIIlll[K.llIIIIlIII[15]] = K."Nav to start";
        K.llIIIIIlll[K.llIIIIlIII[17]] = K."Handling dialog";
        K.llIIIIIlll[K.llIIIIlIII[8]] = K."Cook";
        K.llIIIIIlll[K.llIIIIlIII[23]] = K."Dirty blast";
        K.llIIIIIlll[K.llIIIIlIII[24]] = K."Nav to rotten tomato";
        K.llIIIIIlll[K.llIIIIlIII[2]] = K."Wear";
        K.llIIIIIlll[K.llIIIIlIII[30]] = K."PvP Arena";
        K.llIIIIIlll[K.llIIIIlIII[31]] = K."Getting tomato";
        K.llIIIIIlll[K.llIIIIlIII[33]] = K."Fadli";
        K.llIIIIIlll[K.llIIIIlIII[34]] = K."Buy";
        K.llIIIIIlll[K.llIIIIlIII[36]] = K."Buy 1";
        K.llIIIIIlll[K.llIIIIlIII[35]] = K."Close";
        K.llIIIIIlll[K.llIIIIlIII[37]] = K."Dirty blast";
        K.llIIIIIlll[K.llIIIIlIII[38]] = K."Close";
        K.llIIIIIlll[K.llIIIIlIII[39]] = K."Fruit blast";
        K.llIIIIIlll[K.llIIIIlIII[40]] = K."Dirty blast";
        K.llIIIIIlll[K.llIIIIlIII[41]] = K."Wear";
        K.llIIIIIlll[K.llIIIIlIII[42]] = K."Handling dialog";
        K.llIIIIIlll[K.llIIIIlIII[43]] = K."Cook";
        K.llIIIIIlll[K.llIIIIlIII[44]] = K."Door";
        K.llIIIIIlll[K.llIIIIlIII[45]] = K."Open";
        K.llIIIIIlll[K.llIIIIlIII[46]] = K."Aris";
        K.llIIIIIlll[K.llIIIIlIII[47]] = K."Entering room";
        K.llIIIIIlll[K.llIIIIlIII[48]] = K."Door";
        K.llIIIIIlll[K.llIIIIlIII[0]] = K."Open";
        K.llIIIIIlll[K.llIIIIlIII[49]] = K."Eye of newt";
        K.llIIIIIlll[K.llIIIIlIII[50]] = K."Fruit blast";
        K.llIIIIIlll[K.llIIIIlIII[58]] = K."RFD start quest";
        K.llIIIIIlll[K.llIIIIlIII[59]] = K."ring of wealth (";
        K.llIIIIIlll[K.llIIIIlIII[60]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[61]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[62]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[63]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[64]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[65]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[56]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[66]] = K."dueling";
        K.llIIIIIlll[K.llIIIIlIII[71]] = K."Can you make me a cake?";
        K.llIIIIIlll[K.llIIIIlIII[72]] = K."I'm always happy to help a cook in distress.";
        K.llIIIIIlll[K.llIIIIlIII[73]] = K."Actually, I know where to find this stuff.";
        K.llIIIIIlll[K.llIIIIlIII[74]] = K."Yes.";
        K.llIIIIIlll[K.llIIIIlIII[75]] = K."What's wrong?";
        K.llIIIIIlll[K.llIIIIlIII[76]] = K."Do you have any other quests for me?";
        K.llIIIIIlll[K.llIIIIlIII[77]] = K."Angry! It makes me angry!";
        K.llIIIIIlll[K.llIIIIlIII[78]] = K."What seems to be the problem?";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIIIlIII[3]];
        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[49]];
        if (K.lIlIIIlllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIIIIlIII[3]];
            nArray[K.llIIIIlIII[4]] = llIIIIlIII[14];
            if (K.lIlIIIlllIllI(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[llIIIIlIII[3]];
                stringArray2[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[50]];
                if (K.lIlIIIlllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIIIlIII[3]];
                    nArray2[K.llIIIIlIII[4]] = llIIIIlIII[18];
                    if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[llIIIIlIII[3]];
                        nArray3[K.llIIIIlIII[4]] = llIIIIlIII[11];
                        if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = llIIIIlIII[3];
                            0;
                            if ((0x5F ^ 0x23 ^ (0xEA ^ 0x92)) == (0x4F ^ 5 ^ (0xC5 ^ 0x8B))) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = llIIIIlIII[4];
        return n2 != 0;
    }

    private static String lIlIIIllIllII(String var3, String var14) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIIIlIII[23]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIIIIlIII[1], var11);
            return new String(var22.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIIIllIllIl(String var21, String var15) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIIIIlIII[1], var1);
            return new String(var13.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIIl(int n2, int n3) {
        return n2 == n3;
    }
}


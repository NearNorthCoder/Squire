/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.W;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.aa;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.r;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class q
implements S {
    static /* synthetic */ WorldArea cV;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ WorldPoint cP;
    private static /* synthetic */ String[] llllIIIlll;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ WorldArea cG;
    static /* synthetic */ WorldPoint cQ;
    private static /* synthetic */ int[] llllIIlIll;
    static /* synthetic */ WorldArea cU;
    public static /* synthetic */ String cm;
    static /* synthetic */ WorldPoint cS;
    static /* synthetic */ int ck;
    static final /* synthetic */ int cO;
    static /* synthetic */ WorldPoint cn;
    static /* synthetic */ WorldPoint cT;
    public static /* synthetic */ String h;
    static /* synthetic */ boolean cl;
    static /* synthetic */ WorldPoint cR;
    public static /* synthetic */ List<d> bu;

    @Override
    public boolean V() {
        int n2;
        if (q.llIIllIlllIlI(e.j(llllIIlIll[9]), llllIIlIll[6]) && q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
            n2 = llllIIlIll[0];
            0;
            if (null != null) {
                return ((0x57 ^ 0) & ~(0x25 ^ 0x72)) != 0;
            }
        } else {
            n2 = llllIIlIll[1];
        }
        return n2 != 0;
    }

    private static String llIIllIIlIIlI(String lllllllllllllllllIlIllIIllIlIllI, String lllllllllllllllllIlIllIIllIlIlIl) {
        lllllllllllllllllIlIllIIllIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIIllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIIllIllIIl = new StringBuilder();
        char[] lllllllllllllllllIlIllIIllIllIII = lllllllllllllllllIlIllIIllIlIlIl.toCharArray();
        int lllllllllllllllllIlIllIIllIlIlll = llllIIlIll[1];
        char[] lllllllllllllllllIlIllIIllIlIIIl = lllllllllllllllllIlIllIIllIlIllI.toCharArray();
        int lllllllllllllllllIlIllIIllIlIIII = lllllllllllllllllIlIllIIllIlIIIl.length;
        int lllllllllllllllllIlIllIIllIIllll = llllIIlIll[1];
        while (q.llIIllIlllIII(lllllllllllllllllIlIllIIllIIllll, lllllllllllllllllIlIllIIllIlIIII)) {
            char lllllllllllllllllIlIllIIllIlllII = lllllllllllllllllIlIllIIllIlIIIl[lllllllllllllllllIlIllIIllIIllll];
            lllllllllllllllllIlIllIIllIllIIl.append((char)(lllllllllllllllllIlIllIIllIlllII ^ lllllllllllllllllIlIllIIllIllIII[lllllllllllllllllIlIllIIllIlIlll % lllllllllllllllllIlIllIIllIllIII.length]));
            0;
            ++lllllllllllllllllIlIllIIllIlIlll;
            ++lllllllllllllllllIlIllIIllIIllll;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIllIIllIllIIl);
    }

    public static void aV() {
        if (q.llIIllIllIlll(bs ? 1 : 0)) {
            b.a(bu);
            if (q.llIIllIlllIII(bu.size(), llllIIlIll[0])) {
                System.out.println(llllIIIlll[llllIIlIll[1]]);
                bs = llllIIlIll[1];
            }
        }
        if (q.llIIllIlllIIl(bs ? 1 : 0)) {
            NPC lllllllllllllllllIlIllIlIIIIllIl2;
            Object lllllllllllllllllIlIllIlIIIIlllI;
            if (q.llIIllIlllIII(Skills.getLevel((Skill)Skill.AGILITY), llllIIlIll[2])) {
                cm = llllIIIlll[llllIIlIll[0]];
                W.ds();
            }
            if (q.llIIllIlllIlI(Skills.getLevel((Skill)Skill.AGILITY), llllIIlIll[2]) && q.llIIllIlllIII(Skills.getLevel((Skill)Skill.PRAYER), llllIIlIll[3])) {
                cm = llllIIIlll[llllIIlIll[4]];
                aa.eA();
            }
            if (q.llIIllIlllIII(e.j(llllIIlIll[5]), llllIIlIll[6]) && q.llIIllIlllIlI(Skills.getLevel((Skill)Skill.AGILITY), llllIIlIll[2]) && q.llIIllIlllIlI(Skills.getLevel((Skill)Skill.PRAYER), llllIIlIll[3])) {
                if (q.llIIllIllIlll(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aZ).interact(llllIIIlll[llllIIlIll[7]]);
                }
                cm = llllIIIlll[llllIIlIll[8]];
                r.aY();
            }
            if (q.llIIllIlllIIl(q.aa() ? 1 : 0) && q.llIIllIlllIlI(Skills.getLevel((Skill)Skill.AGILITY), llllIIlIll[2]) && q.llIIllIlllIlI(Skills.getLevel((Skill)Skill.PRAYER), llllIIlIll[3]) && q.llIIllIlllIII(e.j(llllIIlIll[9]), llllIIlIll[0]) && q.llIIllIlllIll(e.j(llllIIlIll[5]), llllIIlIll[6])) {
                lllllllllllllllllIlIllIlIIIIlllI = BankLocation.getNearest();
                if (q.llIIllIllllII(lllllllllllllllllIlIllIlIIIIlllI) && q.llIIllIlllIIl(lllllllllllllllllIlIllIlIIIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[10]];
                    a.a((BankLocation)lllllllllllllllllIlIllIlIIIIlllI);
                }
                if (q.llIIllIllllII(lllllllllllllllllIlIllIlIIIIlllI) && q.llIIllIllIlll(lllllllllllllllllIlIllIlIIIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.llIIllIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlIll[11]);
                        0;
                    }
                    if (q.llIIllIllIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[12]];
                        if (q.llIIllIllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIlIll[8]);
                            0;
                        }
                        if (q.llIIllIllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIlIll[4]);
                            0;
                        }
                        int[] nArray = new int[llllIIlIll[13]];
                        nArray[q.llllIIlIll[1]] = llllIIlIll[14];
                        nArray[q.llllIIlIll[0]] = llllIIlIll[15];
                        nArray[q.llllIIlIll[4]] = llllIIlIll[16];
                        nArray[q.llllIIlIll[7]] = llllIIlIll[17];
                        nArray[q.llllIIlIll[8]] = llllIIlIll[18];
                        nArray[q.llllIIlIll[10]] = llllIIlIll[19];
                        nArray[q.llllIIlIll[12]] = llllIIlIll[20];
                        nArray[q.llllIIlIll[21]] = llllIIlIll[22];
                        nArray[q.llllIIlIll[23]] = llllIIlIll[24];
                        nArray[q.llllIIlIll[25]] = llllIIlIll[26];
                        nArray[q.llllIIlIll[27]] = llllIIlIll[28];
                        nArray[q.llllIIlIll[29]] = llllIIlIll[30];
                        nArray[q.llllIIlIll[31]] = llllIIlIll[32];
                        nArray[q.llllIIlIll[33]] = llllIIlIll[34];
                        nArray[q.llllIIlIll[35]] = llllIIlIll[36];
                        nArray[q.llllIIlIll[37]] = llllIIlIll[38];
                        if (q.llIIllIlllIIl(e.b(nArray) ? 1 : 0)) {
                            q.ae();
                            System.out.println(llllIIIlll[llllIIlIll[21]]);
                            bs = llllIIlIll[0];
                            return;
                        }
                        int[] nArray2 = new int[llllIIlIll[13]];
                        nArray2[q.llllIIlIll[1]] = llllIIlIll[14];
                        nArray2[q.llllIIlIll[0]] = llllIIlIll[15];
                        nArray2[q.llllIIlIll[4]] = llllIIlIll[16];
                        nArray2[q.llllIIlIll[7]] = llllIIlIll[17];
                        nArray2[q.llllIIlIll[8]] = llllIIlIll[18];
                        nArray2[q.llllIIlIll[10]] = llllIIlIll[19];
                        nArray2[q.llllIIlIll[12]] = llllIIlIll[20];
                        nArray2[q.llllIIlIll[21]] = llllIIlIll[22];
                        nArray2[q.llllIIlIll[23]] = llllIIlIll[24];
                        nArray2[q.llllIIlIll[25]] = llllIIlIll[26];
                        nArray2[q.llllIIlIll[27]] = llllIIlIll[28];
                        nArray2[q.llllIIlIll[29]] = llllIIlIll[30];
                        nArray2[q.llllIIlIll[31]] = llllIIlIll[32];
                        nArray2[q.llllIIlIll[33]] = llllIIlIll[34];
                        nArray2[q.llllIIlIll[35]] = llllIIlIll[36];
                        nArray2[q.llllIIlIll[37]] = llllIIlIll[38];
                        if (q.llIIllIllIlll(e.b(nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llllIIlIll[0]];
                            nArray3[q.llllIIlIll[1]] = llllIIlIll[38];
                            if (q.llIIllIlllIIl(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                                a.a(llllIIlIll[38], llllIIlIll[0]);
                                int[] nArray4 = new int[llllIIlIll[0]];
                                nArray4[q.llllIIlIll[1]] = llllIIlIll[38];
                                if (q.llIIllIllIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llllIIlIll[0]];
                                    nArray5[q.llllIIlIll[1]] = llllIIlIll[38];
                                    Inventory.getFirst((int[])nArray5).interact(llllIIIlll[llllIIlIll[23]]);
                                    Time.sleepTicks((int)llllIIlIll[0]);
                                    0;
                                }
                            }
                            if (q.llIIllIlllIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)llllIIlIll[8]);
                                0;
                            }
                            if (q.llIIllIllIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a(llllIIlIll[15], llllIIlIll[0]);
                                a.a(llllIIlIll[16], llllIIlIll[0]);
                                a.a(llllIIlIll[17], llllIIlIll[0]);
                                a.a(llllIIlIll[18], llllIIlIll[0]);
                                a.a(llllIIlIll[19], llllIIlIll[4]);
                                a.a(llllIIlIll[20], llllIIlIll[39]);
                                a.a(llllIIlIll[22], llllIIlIll[0]);
                                a.a(llllIIlIll[24], llllIIlIll[12]);
                                a.a(llllIIlIll[40], llllIIlIll[41]);
                                Bank.withdraw((String)llllIIIlll[llllIIlIll[25]], (int)llllIIlIll[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                a.a(llllIIlIll[28], llllIIlIll[0]);
                                a.a(llllIIlIll[30], llllIIlIll[0]);
                                a.a(llllIIlIll[26], llllIIlIll[12]);
                                a.a(llllIIlIll[36], llllIIlIll[27]);
                                a.a(llllIIlIll[14], llllIIlIll[27]);
                                a.a(llllIIlIll[34], llllIIlIll[0]);
                                a.a(llllIIlIll[32], llllIIlIll[0]);
                            }
                        }
                    }
                }
            }
            if (q.llIIllIllIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && q.llIIllIlllIII(Movement.getRunEnergy(), llllIIlIll[42])) {
                Inventory.getFirst((int[])f.aU).interact(llllIIIlll[llllIIlIll[27]]);
                Time.sleepTicks((int)llllIIlIll[0]);
                0;
            }
            if (q.llIIllIlllllI(q.llIIllIllIllI(e.u(), 50.0))) {
                int[] nArray = new int[llllIIlIll[0]];
                nArray[q.llllIIlIll[1]] = llllIIlIll[32];
                if (q.llIIllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[llllIIlIll[0]];
                    nArray6[q.llllIIlIll[1]] = llllIIlIll[32];
                    Inventory.getFirst((int[])nArray6).interact(llllIIIlll[llllIIlIll[29]]);
                    Time.sleepTicks((int)llllIIlIll[4]);
                    0;
                }
            }
            if (q.llIIllIllIlll(q.aa() ? 1 : 0) && q.llIIllIlllIIl(e.j(llllIIlIll[9]))) {
                cm = llllIIIlll[llllIIlIll[31]];
                if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[33]];
                    if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llllIIlIll[43])) {
                        int[] nArray = new int[llllIIlIll[0]];
                        nArray[q.llllIIlIll[1]] = llllIIlIll[38];
                        if (q.llIIllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray7 = new int[llllIIlIll[0]];
                            nArray7[q.llllIIlIll[1]] = llllIIlIll[38];
                            if (q.llIIllIlllIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllIIlIll[0]];
                                nArray8[q.llllIIlIll[1]] = llllIIlIll[38];
                                Inventory.getFirst((int[])nArray8).interact(llllIIIlll[llllIIlIll[35]]);
                            }
                        }
                        int[] nArray9 = new int[llllIIlIll[0]];
                        nArray9[q.llllIIlIll[1]] = llllIIlIll[36];
                        if (q.llIIllIllIlll(Inventory.contains((int[])nArray9) ? 1 : 0) && q.llIIllIlllIll(Players.getLocal().getAnimation(), llllIIlIll[44])) {
                            int[] nArray10 = new int[llllIIlIll[0]];
                            nArray10[q.llllIIlIll[1]] = llllIIlIll[36];
                            Inventory.getFirst((int[])nArray10).interact(llllIIIlll[llllIIlIll[37]]);
                            Time.sleepTicks((int)llllIIlIll[4]);
                            0;
                        }
                    }
                    if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(b.I), llllIIlIll[43])) {
                        if (q.llIIllIllIlll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cn);
                        0;
                        Time.sleepTicks((int)llllIIlIll[0]);
                        0;
                    }
                }
                if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[13]];
                    g.a(llllIIIlll[llllIIlIll[45]], bQ);
                }
            }
            if (!q.llIIlllIIIIIl(e.j(llllIIlIll[9]), llllIIlIll[10]) || !q.llIIlllIIIIIl(e.j(llllIIlIll[9]), llllIIlIll[27]) || q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[37])) {
                int[] nArray = new int[llllIIlIll[0]];
                nArray[q.llllIIlIll[1]] = llllIIlIll[26];
                if (q.llIIllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[46]];
                    String[] stringArray = new String[llllIIlIll[0]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[47]];
                    Inventory.getFirst((String[])stringArray).interact(llllIIIlll[llllIIlIll[43]]);
                    Time.sleepTicks((int)llllIIlIll[4]);
                    0;
                }
                int[] nArray11 = new int[llllIIlIll[0]];
                nArray11[q.llllIIlIll[1]] = llllIIlIll[26];
                if (q.llIIllIlllIIl(Inventory.contains((int[])nArray11) ? 1 : 0) && q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[27])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[48]];
                    int[] nArray12 = new int[llllIIlIll[0]];
                    nArray12[q.llllIIlIll[1]] = llllIIlIll[34];
                    if (q.llIIllIllIlll(Inventory.contains((int[])nArray12) ? 1 : 0) && q.llIIllIlllIll(Players.getLocal().getAnimation(), llllIIlIll[44])) {
                        int[] nArray13 = new int[llllIIlIll[0]];
                        nArray13[q.llllIIlIll[1]] = llllIIlIll[34];
                        Inventory.getFirst((int[])nArray13).interact(llllIIIlll[llllIIlIll[49]]);
                        Time.sleepTicks((int)llllIIlIll[4]);
                        0;
                    }
                }
                if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[27]) && q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cP), llllIIlIll[27])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[50]];
                    Movement.walkTo((WorldPoint)cP);
                    0;
                    Time.sleepTicks((int)llllIIlIll[0]);
                    0;
                }
                if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cP), llllIIlIll[27])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[51]];
                    lllllllllllllllllIlIllIlIIIIlllI = NPCs.getAll(nPC -> {
                        int n2;
                        if (!q.llIIllIlllIIl(nPC.getName().contains(llllIIIlll[llllIIlIll[152]]) ? 1 : 0) || q.llIIllIllIlll(nPC.getName().contains(llllIIIlll[llllIIlIll[153]]) ? 1 : 0)) {
                            n2 = llllIIlIll[0];
                            0;
                            if (null != null) {
                                return (3 & (3 ^ -1)) != 0;
                            }
                        } else {
                            n2 = llllIIlIll[1];
                        }
                        return n2 != 0;
                    });
                    if (q.llIIllIlllIIl(lllllllllllllllllIlIllIlIIIIlllI.isEmpty() ? 1 : 0) && q.llIIllIllllII(lllllllllllllllllIlIllIlIIIIllIl2 = (NPC)lllllllllllllllllIlIllIlIIIIlllI.stream().filter(nPC -> {
                        boolean bl;
                        if (q.llIIlllIIIIII(nPC.getWorldLocation().distanceTo(cP), llllIIlIll[4])) {
                            bl = llllIIlIll[0];
                            0;
                            if (1 < 1) {
                                return ((0x7F ^ 4 ^ (0xE9 ^ 0xAA)) & (0xFF ^ 0x9C ^ (0x98 ^ 0xC3) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIIlIll[1];
                        }
                        return bl;
                    }).findAny().orElse(null))) {
                        int lllllllllllllllllIlIllIlIIIIllII = llllIIlIll[0];
                        int lllllllllllllllllIlIllIlIIIIlIll = Static.getClient().getWorld();
                        while (q.llIIllIllIlll(lllllllllllllllllIlIllIlIIIIllII)) {
                            if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIlIll[52], llllIIlIll[53], llllIIlIll[1])), llllIIlIll[4])) {
                                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[54]];
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIIlIll[52], llllIIlIll[53], llllIIlIll[1]));
                                0;
                                Time.sleepTicks((int)llllIIlIll[0]);
                                0;
                            }
                            if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIlIll[52], llllIIlIll[53], llllIIlIll[1])), llllIIlIll[4])) {
                                e.k(e.t());
                            }
                            if (!q.llIIlllIIIIIl(Static.getClient().getWorld(), lllllllllllllllllIlIllIlIIIIlIll)) continue;
                            lllllllllllllllllIlIllIlIIIIllII = llllIIlIll[1];
                            0;
                            if (2 < (0x1B ^ 0x1F)) break;
                            return;
                        }
                    }
                    g.a(llllIIIlll[llllIIlIll[2]], bQ);
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[43])) {
                if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cP), llllIIlIll[27])) {
                    if (q.llIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[55]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[56]]);
                        Time.sleepTicks((int)llllIIlIll[4]);
                        0;
                    }
                    g.a(bQ);
                }
                if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cQ), llllIIlIll[42])) {
                    if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[57]];
                        Movement.walkTo((WorldPoint)cR);
                        0;
                        Time.sleepTicks((int)llllIIlIll[0]);
                        0;
                    }
                    if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10])) {
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[58]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[59]]);
                        Time.sleepTicks((int)llllIIlIll[4]);
                        0;
                    }
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[54]) && q.llIIllIllIlll(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                ck = llllIIlIll[1];
                lllllllllllllllllIlIllIlIIIIlllI = new WorldPoint(llllIIlIll[60], llllIIlIll[61], llllIIlIll[1]);
                lllllllllllllllllIlIllIlIIIIllIl2 = new WorldPoint(llllIIlIll[60], llllIIlIll[62], llllIIlIll[1]);
                WorldPoint lllllllllllllllllIlIllIlIIIIllII = new WorldPoint(llllIIlIll[60], llllIIlIll[63], llllIIlIll[1]);
                WorldPoint lllllllllllllllllIlIllIlIIIIlIll = new WorldPoint(llllIIlIll[60], llllIIlIll[64], llllIIlIll[1]);
                if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10]) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIllIlIIIIlllI) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllIl2) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIlIll) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllII) ? 1 : 0) && q.llIIllIlllIIl(cU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[65]];
                    Movement.walkTo((WorldPoint)cR);
                    0;
                    Time.sleepTicks((int)llllIIlIll[0]);
                    0;
                }
                if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10]) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIllIlIIIIlllI) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllIl2) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIlIll) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllII) ? 1 : 0)) {
                    String[] stringArray = new String[llllIIlIll[0]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[66]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[67]]);
                    Time.sleepTicks((int)llllIIlIll[4]);
                    0;
                }
                if (!q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIllIlIIIIlllI) ? 1 : 0) || !q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllIl2) ? 1 : 0) || !q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIlIll) ? 1 : 0) || q.llIIllIllIlll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllII) ? 1 : 0)) {
                    String[] stringArray = new String[llllIIlIll[0]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[68]];
                    TileObject lllllllllllllllllIlIllIlIIIIlIlI = TileObjects.getNearest((String[])stringArray);
                    if (q.llIIllIllllII(lllllllllllllllllIlIllIlIIIIlIlI)) {
                        String[] stringArray2 = new String[llllIIlIll[0]];
                        stringArray2[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[69]];
                        if (q.llIIllIllIlll(lllllllllllllllllIlIllIlIIIIlIlI.hasAction(stringArray2) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[70]];
                            lllllllllllllllllIlIllIlIIIIlIlI.interact(llllIIIlll[llllIIlIll[71]]);
                            Time.sleepTicks((int)llllIIlIll[4]);
                            0;
                        }
                    }
                }
                if (q.llIIllIllIlll(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIlIll) ? 1 : 0)) {
                    String[] stringArray = new String[llllIIlIll[0]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[72]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[73]]);
                    Time.sleepTicks((int)llllIIlIll[4]);
                    0;
                }
                if (q.llIIllIllIlll(cU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(lllllllllllllllllIlIllIlIIIIlllI) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllIl2) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIlIll) ? 1 : 0) && q.llIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIllIlIIIIllII) ? 1 : 0)) {
                    if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cS), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[74]];
                        Movement.walkTo((WorldPoint)cS);
                        0;
                        Time.sleepTicks((int)llllIIlIll[0]);
                        0;
                    }
                    if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cS), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[75]];
                        g.a(llllIIIlll[llllIIlIll[76]], bQ);
                    }
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[77])) {
                if (q.llIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llllIIlIll[0]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[78]];
                    lllllllllllllllllIlIllIlIIIIlllI = NPCs.getAll((String[])stringArray);
                    if (q.llIIllIllllIl(lllllllllllllllllIlIllIlIIIIlllI.size())) {
                        ((NPC)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).interact(llllIIIlll[llllIIlIll[3]]);
                        Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIIlIll[79]);
                        0;
                    }
                }
                if (q.llIIllIllIlll(Dialog.isOpen() ? 1 : 0)) {
                    if (!q.llIIllIlllIIl(Dialog.canContinueNPC() ? 1 : 0) || q.llIIllIllIlll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                    if (q.llIIllIlllIIl((lllllllllllllllllIlIllIlIIIIlllI = Widgets.getChildren((int)llllIIlIll[80], (int)llllIIlIll[0], widget -> widget.isVisible())).isEmpty() ? 1 : 0)) {
                        int lllllllllllllllllIlIllIlIIIIllIl2 = llllIIlIll[1];
                        while (q.llIIllIlllIII(lllllllllllllllllIlIllIlIIIIllIl2, lllllllllllllllllIlIllIlIIIIlllI.size())) {
                            if ((!q.llIIllIlllIIl(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[81]]) ? 1 : 0) || q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[82]]) ? 1 : 0)) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[83]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            if (q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[84]]) ? 1 : 0) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[42]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            if ((!q.llIIllIlllIIl(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[85]]) ? 1 : 0) || q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[77]]) ? 1 : 0)) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[86]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            if (q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[87]]) ? 1 : 0) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[88]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            if (q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[89]]) ? 1 : 0) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[90]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            if (q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[91]]) ? 1 : 0) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[92]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            if (q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[93]]) ? 1 : 0) && q.llIIllIllIlll(((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getText().contains(llllIIIlll[llllIIlIll[94]]) ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getX(), (int)((Widget)lllllllllllllllllIlIllIlIIIIlllI.get(lllllllllllllllllIlIllIlIIIIllIl2)).getClickPoint().getY(), (boolean)llllIIlIll[0]);
                                Time.sleepTicks((int)llllIIlIll[4]);
                                0;
                            }
                            ++lllllllllllllllllIlIllIlIIIIllIl2;
                            0;
                            if (((0xD8 ^ 0x96 ^ 2) & (0xDF ^ 0xA9 ^ (0x3F ^ 5) ^ -1)) == 0) continue;
                            return;
                        }
                    }
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[88])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[95]];
                String[] stringArray = new String[llllIIlIll[0]];
                stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[96]];
                TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[97]]);
                Time.sleepTicks((int)llllIIlIll[8]);
                0;
                g.a(bQ);
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[93])) {
                if (q.llIIllIlllIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cT), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[98]];
                        Movement.walkTo((WorldPoint)cT);
                        0;
                        Time.sleepTicks((int)llllIIlIll[0]);
                        0;
                    }
                    if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cT), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[99]];
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[100]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[101]]);
                        Time.sleepTicks((int)llllIIlIll[8]);
                        0;
                        g.a(bQ);
                    }
                }
                if (q.llIIllIllIlll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[102]];
                    g.a(llllIIIlll[llllIIlIll[103]], bQ);
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[98])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[104]];
                if (q.llIIllIlllIIl(Vars.getBit((int)llllIIlIll[105]))) {
                    if (q.llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        g.a(llllIIIlll[llllIIlIll[106]], bQ);
                    }
                    g.a(bQ);
                }
                if (q.llIIllIlllIll(Vars.getBit((int)llllIIlIll[105]), llllIIlIll[4])) {
                    if (q.llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[107]];
                        NPCs.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[108]]);
                    }
                    g.a(llllIIIlll[llllIIlIll[109]], bQ);
                }
                if (q.llIIllIlllIll(Vars.getBit((int)llllIIlIll[105]), llllIIlIll[12])) {
                    if (q.llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[110]];
                        NPCs.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[111]]);
                    }
                    g.a(llllIIIlll[llllIIlIll[112]], bQ);
                }
                if (q.llIIllIlllIll(Vars.getBit((int)llllIIlIll[105]), llllIIlIll[21])) {
                    if (q.llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[113]];
                        NPCs.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[114]]);
                    }
                    g.a(llllIIIlll[llllIIlIll[115]], bQ);
                }
                if (q.llIIllIlllIll(Vars.getBit((int)llllIIlIll[105]), llllIIlIll[37])) {
                    if (q.llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIll[0]];
                        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[116]];
                        NPCs.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[117]]);
                    }
                    g.a(llllIIIlll[llllIIlIll[118]], bQ);
                }
                if (q.llIIllIlllIll(Vars.getBit((int)llllIIlIll[105]), llllIIlIll[59])) {
                    String[] stringArray = new String[llllIIlIll[4]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[120]];
                    stringArray[q.llllIIlIll[0]] = llllIIIlll[llllIIlIll[121]];
                    g.a(llllIIIlll[llllIIlIll[119]], stringArray);
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[100])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[122]];
                g.a(llllIIIlll[llllIIlIll[123]], bQ);
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[103])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[124]];
                g.a(bQ);
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[114])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[125]];
                if (q.llIIllIlllIII(Prayers.getPoints(), llllIIlIll[43]) && q.llIIllIllIlll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aR).interact(llllIIIlll[llllIIlIll[126]]);
                    Time.sleepTicks((int)llllIIlIll[0]);
                    0;
                }
                if (q.llIIllIlllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                int[] nArray = new int[llllIIlIll[0]];
                nArray[q.llllIIlIll[1]] = llllIIlIll[38];
                if (q.llIIllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray14 = new int[llllIIlIll[0]];
                    nArray14[q.llllIIlIll[1]] = llllIIlIll[38];
                    if (q.llIIllIlllIIl(Equipment.contains((int[])nArray14) ? 1 : 0)) {
                        int[] nArray15 = new int[llllIIlIll[0]];
                        nArray15[q.llllIIlIll[1]] = llllIIlIll[38];
                        Inventory.getFirst((int[])nArray15).interact(llllIIIlll[llllIIlIll[127]]);
                    }
                }
                if (q.llIIlllIIIIlI(Players.getLocal().getInteracting())) {
                    int[] nArray16 = new int[llllIIlIll[0]];
                    nArray16[q.llllIIlIll[1]] = llllIIlIll[128];
                    if (q.llIIllIllllII(NPCs.getNearest((int[])nArray16))) {
                        int[] nArray17 = new int[llllIIlIll[0]];
                        nArray17[q.llllIIlIll[1]] = llllIIlIll[128];
                        NPCs.getNearest((int[])nArray17).interact(llllIIIlll[llllIIlIll[129]]);
                        Time.sleepTicks((int)llllIIlIll[4]);
                        0;
                    }
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[119])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[130]];
                if (q.llIIllIllIlll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                g.a(llllIIIlll[llllIIlIll[131]], bQ);
            }
            if (!q.llIIlllIIIIIl(e.j(llllIIlIll[9]), llllIIlIll[124]) || !q.llIIlllIIIIIl(e.j(llllIIlIll[9]), llllIIlIll[130]) || !q.llIIlllIIIIIl(e.j(llllIIlIll[9]), llllIIlIll[132]) || q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[133])) {
                if (q.llIIllIllIlll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[132]];
                    String[] stringArray = new String[llllIIlIll[0]];
                    stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[134]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIIIlll[llllIIlIll[135]]);
                    Time.sleepTicks((int)llllIIlIll[8]);
                    0;
                    g.a(bQ);
                }
                if (q.llIIllIlllIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[133]];
                        if (q.llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(b.I), llllIIlIll[43])) {
                            if (q.llIIllIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cn);
                            0;
                            Time.sleepTicks((int)llllIIlIll[0]);
                            0;
                        }
                    }
                    if (q.llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[136]];
                        if (q.llIIllIlllIII(ck, llllIIlIll[0])) {
                            ac.kP += llllIIlIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllIIlIll[0];
                            ac.kP = llllIIlIll[1];
                            cl = llllIIlIll[1];
                        }
                        g.a(llllIIIlll[llllIIlIll[137]], bQ);
                    }
                }
            }
            if (q.llIIllIlllIll(e.j(llllIIlIll[9]), llllIIlIll[6])) {
                int[] nArray = new int[llllIIlIll[0]];
                nArray[q.llllIIlIll[1]] = llllIIlIll[36];
                if (q.llIIllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0) && q.llIIllIlllIll(Players.getLocal().getAnimation(), llllIIlIll[44])) {
                    int[] nArray18 = new int[llllIIlIll[0]];
                    nArray18[q.llllIIlIll[1]] = llllIIlIll[36];
                    Inventory.getFirst((int[])nArray18).interact(llllIIIlll[llllIIlIll[138]]);
                    Time.sleepTicks((int)llllIIlIll[4]);
                    0;
                }
            }
        }
    }

    private static boolean llIIllIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void ae() {
        d lllllllllllllllllIlIllIlIIIIIllI;
        Object lllllllllllllllllIlIllIlIIIIIlll;
        block52: {
            block51: {
                block50: {
                    block49: {
                        block48: {
                            block47: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block43: {
                                                block42: {
                                                    block41: {
                                                        block40: {
                                                            block39: {
                                                                block38: {
                                                                    block37: {
                                                                        block36: {
                                                                            block35: {
                                                                                int[] nArray = new int[llllIIlIll[0]];
                                                                                nArray[q.llllIIlIll[1]] = llllIIlIll[38];
                                                                                if (q.llIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                    d d2 = new d(llllIIlIll[38], llllIIlIll[0], llllIIlIll[140]);
                                                                                    bu.add(d2);
                                                                                    0;
                                                                                }
                                                                                int[] nArray2 = new int[llllIIlIll[0]];
                                                                                nArray2[q.llllIIlIll[1]] = llllIIlIll[16];
                                                                                if (q.llIIllIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[16], llllIIlIll[0], llllIIlIll[141]);
                                                                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray3 = new int[llllIIlIll[0]];
                                                                                nArray3[q.llllIIlIll[1]] = llllIIlIll[17];
                                                                                if (q.llIIllIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                                                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[17], llllIIlIll[0], llllIIlIll[141]);
                                                                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray4 = new int[llllIIlIll[0]];
                                                                                nArray4[q.llllIIlIll[1]] = llllIIlIll[18];
                                                                                if (q.llIIllIlllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                                                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[18], llllIIlIll[0], llllIIlIll[141]);
                                                                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray5 = new int[llllIIlIll[0]];
                                                                                nArray5[q.llllIIlIll[1]] = llllIIlIll[22];
                                                                                if (q.llIIllIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                                                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[22], llllIIlIll[0], llllIIlIll[141]);
                                                                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                                                    0;
                                                                                }
                                                                                int[] nArray6 = new int[llllIIlIll[0]];
                                                                                nArray6[q.llllIIlIll[1]] = llllIIlIll[19];
                                                                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block35;
                                                                                int[] nArray7 = new int[llllIIlIll[0]];
                                                                                nArray7[q.llllIIlIll[1]] = llllIIlIll[19];
                                                                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block36;
                                                                                int[] nArray8 = new int[llllIIlIll[0]];
                                                                                nArray8[q.llllIIlIll[1]] = llllIIlIll[19];
                                                                                if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray8).getQuantity(), llllIIlIll[4])) break block36;
                                                                            }
                                                                            lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[19], llllIIlIll[4], llllIIlIll[141]);
                                                                            bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[llllIIlIll[0]];
                                                                        nArray[q.llllIIlIll[1]] = llllIIlIll[32];
                                                                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                        int[] nArray9 = new int[llllIIlIll[0]];
                                                                        nArray9[q.llllIIlIll[1]] = llllIIlIll[32];
                                                                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block38;
                                                                        int[] nArray10 = new int[llllIIlIll[0]];
                                                                        nArray10[q.llllIIlIll[1]] = llllIIlIll[32];
                                                                        if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray10).getQuantity(), llllIIlIll[43])) break block38;
                                                                    }
                                                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[32], llllIIlIll[43], llllIIlIll[142]);
                                                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llllIIlIll[0]];
                                                                nArray[q.llllIIlIll[1]] = llllIIlIll[20];
                                                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                                                int[] nArray11 = new int[llllIIlIll[0]];
                                                                nArray11[q.llllIIlIll[1]] = llllIIlIll[20];
                                                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block40;
                                                                int[] nArray12 = new int[llllIIlIll[0]];
                                                                nArray12[q.llllIIlIll[1]] = llllIIlIll[20];
                                                                if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray12).getQuantity(), llllIIlIll[39])) break block40;
                                                            }
                                                            lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[20], llllIIlIll[39], llllIIlIll[114]);
                                                            bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llllIIlIll[0]];
                                                        nArray[q.llllIIlIll[1]] = llllIIlIll[24];
                                                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                                        int[] nArray13 = new int[llllIIlIll[0]];
                                                        nArray13[q.llllIIlIll[1]] = llllIIlIll[24];
                                                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray13) ? 1 : 0)) break block42;
                                                        int[] nArray14 = new int[llllIIlIll[0]];
                                                        nArray14[q.llllIIlIll[1]] = llllIIlIll[24];
                                                        if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray14).getQuantity(), llllIIlIll[12])) break block42;
                                                    }
                                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[24], llllIIlIll[12], llllIIlIll[41]);
                                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                                    0;
                                                }
                                                int[] nArray = new int[llllIIlIll[0]];
                                                nArray[q.llllIIlIll[1]] = llllIIlIll[26];
                                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                                int[] nArray15 = new int[llllIIlIll[0]];
                                                nArray15[q.llllIIlIll[1]] = llllIIlIll[26];
                                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block44;
                                                int[] nArray16 = new int[llllIIlIll[0]];
                                                nArray16[q.llllIIlIll[1]] = llllIIlIll[26];
                                                if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray16).getQuantity(), llllIIlIll[12])) break block44;
                                            }
                                            lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[26], llllIIlIll[25], llllIIlIll[41]);
                                            bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                            0;
                                        }
                                        int[] nArray = new int[llllIIlIll[0]];
                                        nArray[q.llllIIlIll[1]] = llllIIlIll[28];
                                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                        int[] nArray17 = new int[llllIIlIll[0]];
                                        nArray17[q.llllIIlIll[1]] = llllIIlIll[28];
                                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray17) ? 1 : 0)) break block46;
                                        int[] nArray18 = new int[llllIIlIll[0]];
                                        nArray18[q.llllIIlIll[1]] = llllIIlIll[28];
                                        if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray18).getQuantity(), llllIIlIll[7])) break block46;
                                    }
                                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]);
                                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                                    0;
                                }
                                int[] nArray = new int[llllIIlIll[0]];
                                nArray[q.llllIIlIll[1]] = llllIIlIll[30];
                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                                int[] nArray19 = new int[llllIIlIll[0]];
                                nArray19[q.llllIIlIll[1]] = llllIIlIll[30];
                                if (!q.llIIllIllIlll(Bank.contains((int[])nArray19) ? 1 : 0)) break block48;
                                int[] nArray20 = new int[llllIIlIll[0]];
                                nArray20[q.llllIIlIll[1]] = llllIIlIll[30];
                                if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray20).getQuantity(), llllIIlIll[21])) break block48;
                            }
                            lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[30], llllIIlIll[21], i.bp);
                            bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                            0;
                        }
                        int[] nArray = new int[llllIIlIll[0]];
                        nArray[q.llllIIlIll[1]] = llllIIlIll[36];
                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                        int[] nArray21 = new int[llllIIlIll[0]];
                        nArray21[q.llllIIlIll[1]] = llllIIlIll[36];
                        if (!q.llIIllIllIlll(Bank.contains((int[])nArray21) ? 1 : 0)) break block50;
                        int[] nArray22 = new int[llllIIlIll[0]];
                        nArray22[q.llllIIlIll[1]] = llllIIlIll[36];
                        if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray22).getQuantity(), llllIIlIll[27])) break block50;
                    }
                    lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[36], llllIIlIll[27], e.c(llllIIlIll[144], llllIIlIll[145]));
                    bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
                    0;
                }
                int[] nArray = new int[llllIIlIll[0]];
                nArray[q.llllIIlIll[1]] = llllIIlIll[34];
                if (!q.llIIllIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block51;
                int[] nArray23 = new int[llllIIlIll[0]];
                nArray23[q.llllIIlIll[1]] = llllIIlIll[34];
                if (!q.llIIllIllIlll(Bank.contains((int[])nArray23) ? 1 : 0)) break block52;
                int[] nArray24 = new int[llllIIlIll[0]];
                nArray24[q.llllIIlIll[1]] = llllIIlIll[34];
                if (!q.llIIllIlllIII(Bank.getFirst((int[])nArray24).getQuantity(), llllIIlIll[10])) break block52;
            }
            lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[34], llllIIlIll[10], e.c(llllIIlIll[146], llllIIlIll[147]));
            bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
            0;
        }
        int[] nArray = new int[llllIIlIll[0]];
        nArray[q.llllIIlIll[1]] = llllIIlIll[15];
        if (q.llIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllIlIllIlIIIIIlll = new d(llllIIlIll[15], llllIIlIll[0], llllIIlIll[141]);
            bu.add((d)lllllllllllllllllIlIllIlIIIIIlll);
            0;
        }
        if (q.llIIllIlllIIl(Bank.contains((Predicate)(lllllllllllllllllIlIllIlIIIIIlll = item -> item.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]))) ? 1 : 0)) {
            lllllllllllllllllIlIllIlIIIIIllI = new d(llllIIlIll[148], llllIIlIll[10], llllIIlIll[149]);
            bu.add(lllllllllllllllllIlIllIlIIIIIllI);
            0;
        }
        int[] nArray25 = new int[llllIIlIll[0]];
        nArray25[q.llllIIlIll[1]] = llllIIlIll[14];
        if (q.llIIllIlllIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lllllllllllllllllIlIllIlIIIIIllI = new d(llllIIlIll[14], llllIIlIll[73], llllIIlIll[150]);
            bu.add(lllllllllllllllllIlIllIlIIIIIllI);
            0;
        }
    }

    private static void llIIllIllIlIl() {
        llllIIlIll = new int[196];
        q.llllIIlIll[0] = 1;
        q.llllIIlIll[1] = (108 + 129 - 138 + 45 ^ 106 + 91 - 52 + 10) & (0x52 ^ 0x65 ^ (0x8F ^ 0xB3) ^ -1);
        q.llllIIlIll[2] = 57 + 37 - 50 + 91 ^ 55 + 82 - -7 + 13;
        q.llllIIlIll[3] = 179 + 19 - 110 + 149 ^ 53 + 12 - 49 + 176;
        q.llllIIlIll[4] = 2;
        q.llllIIlIll[5] = -(0xFFFF949D & 0x7BE3) & (0xFFFFD5F3 & 0x3BBF);
        q.llllIIlIll[6] = 0xE6 ^ 0x88;
        q.llllIIlIll[7] = 3;
        q.llllIIlIll[8] = 0x65 ^ 0x61;
        q.llllIIlIll[9] = -(0xFFFFF677 & 0x5FED) & (0xFFFFDFF7 & 0x77EF);
        q.llllIIlIll[10] = 0x65 ^ 0x60;
        q.llllIIlIll[11] = 0xFFFFB3AC & 0x5FDB;
        q.llllIIlIll[12] = 10 + 45 - -21 + 59 ^ 51 + 74 - 120 + 124;
        q.llllIIlIll[13] = 59 + 131 - 31 + 15 ^ 26 + 28 - -120 + 16;
        q.llllIIlIll[14] = -(0xFFFFEAFD & 0x759B) & (0xFFFFFFDF & Short.MAX_VALUE);
        q.llllIIlIll[15] = -(0xFFFFFDCF & 0x7339) & (0xFFFFFDBF & 0x77FF);
        q.llllIIlIll[16] = -(0xFFFFFBEE & 0x7E77) & (0xFFFFFFF7 & 0x7FFD);
        q.llllIIlIll[17] = -(0xFFFFF757 & 0x7AA9) & (0xFFFFFFDF & 0x772F);
        q.llllIIlIll[18] = 0xFFFFE53F & 0x1FFB;
        q.llllIIlIll[19] = 0xFFFF9517 & 0x6FE9;
        q.llllIIlIll[20] = 0xFFFFAE43 & 0x57BF;
        q.llllIIlIll[21] = 0x44 ^ 0x43;
        q.llllIIlIll[22] = 0xFFFFAF2B & 0x59FF;
        q.llllIIlIll[23] = 0x48 ^ 0x35 ^ (0x1E ^ 0x6B);
        q.llllIIlIll[24] = -(0xFFFFFBBD & 0x7476) & (0xFFFFFFF3 & 0x73FF);
        q.llllIIlIll[25] = 0x9C ^ 0x95;
        q.llllIIlIll[26] = -(0xFFFFCEA6 & 0x755B) & (0xFFFFFFDB & 0x4FBF);
        q.llllIIlIll[27] = 0xCA ^ 0xC0;
        q.llllIIlIll[28] = -(0xFFFFF5FF & 0x5E3D) & (0xFFFFFDFE & 0x5FBF);
        q.llllIIlIll[29] = 0xBE ^ 0xB5;
        q.llllIIlIll[30] = -(0xFFFFDDA7 & 0x2EF9) & (0xFFFFFDFB & 0x3FF5);
        q.llllIIlIll[31] = 0x1E ^ 0x12;
        q.llllIIlIll[32] = 0xFFFFFBAF & 0x5D1;
        q.llllIIlIll[33] = 136 + 8 - 30 + 38 ^ 98 + 118 - 84 + 17;
        q.llllIIlIll[34] = -(0xFFFFFAF7 & 0x271B) & (0xFFFFEFBF & 0x7EFF);
        q.llllIIlIll[35] = 0x1E ^ 0x10;
        q.llllIIlIll[36] = 0xFFFFDEFB & 0x6DA7;
        q.llllIIlIll[37] = 0xFA ^ 0xBA ^ (0x75 ^ 0x3A);
        q.llllIIlIll[38] = 0xFFFF9775 & 0x6DBF;
        q.llllIIlIll[39] = (0x4D ^ 0x36) + (93 + 192 - 94 + 26) - (140 + 121 - 47 + 17) + (0x2D ^ 0x59);
        q.llllIIlIll[40] = -(0xFFFFCAFB & 0x750D) & (0xFFFFDBFB & 0x67EF);
        q.llllIIlIll[41] = -(0xFFFFB7FF & 0x7C18) & (0xFFFFF7FF & 0x3FFF);
        q.llllIIlIll[42] = 0x50 ^ 0x62;
        q.llllIIlIll[43] = 0x45 ^ 0x15 ^ (0x75 ^ 0x31);
        q.llllIIlIll[44] = -1;
        q.llllIIlIll[45] = 7 ^ 0x16;
        q.llllIIlIll[46] = 0x69 ^ 0x7B;
        q.llllIIlIll[47] = 0x40 ^ 0x66 ^ (0x80 ^ 0xB5);
        q.llllIIlIll[48] = 0x94 ^ 0x81;
        q.llllIIlIll[49] = 26 + 21 - 18 + 123 ^ 115 + 111 - 96 + 12;
        q.llllIIlIll[50] = 0x57 ^ 0x1B ^ (0xFA ^ 0xA1);
        q.llllIIlIll[51] = 0x7E ^ 0x66;
        q.llllIIlIll[52] = -(0xFFFFB61D & 0x7BE3) & (0xFFFFBFFF & 0x7FDB);
        q.llllIIlIll[53] = 0xFFFF8ECC & 0x7DFB;
        q.llllIIlIll[54] = 0x99 ^ 0x80;
        q.llllIIlIll[55] = 0x34 ^ 0x2F;
        q.llllIIlIll[56] = 0x4C ^ 0x50;
        q.llllIIlIll[57] = 0x67 ^ 0x7A;
        q.llllIIlIll[58] = 0x43 ^ 0x5D;
        q.llllIIlIll[59] = 0x2F ^ 0x30;
        q.llllIIlIll[60] = -(0xFFFFD227 & 0x7DD9) & (0xFFFFFDAE & 0x5FFF);
        q.llllIIlIll[61] = 0xFFFFAD73 & 0x5FEF;
        q.llllIIlIll[62] = 0xFFFF8FFE & 0x7D65;
        q.llllIIlIll[63] = -(0xFFFFDA9F & 0x77F3) & (0xFFFFFFF7 & 0x5FFF);
        q.llllIIlIll[64] = -(0xFFFFB7DD & 0x6A3B) & (0xFFFFAF7E & Short.MAX_VALUE);
        q.llllIIlIll[65] = 96 + 35 - 53 + 148 ^ 46 + 176 - 80 + 52;
        q.llllIIlIll[66] = 0x78 ^ 0x59;
        q.llllIIlIll[67] = 2 ^ 0x20;
        q.llllIIlIll[68] = 100 + 126 - 62 + 3 ^ 78 + 4 - -36 + 14;
        q.llllIIlIll[69] = 0x65 ^ 0x39 ^ (1 ^ 0x79);
        q.llllIIlIll[70] = 0x96 ^ 0xB3;
        q.llllIIlIll[71] = 142 + 33 - 43 + 48 ^ 38 + 50 - -1 + 57;
        q.llllIIlIll[72] = 0xB2 ^ 0x88 ^ (0x7E ^ 0x63);
        q.llllIIlIll[73] = 0x3C ^ 0x6A ^ (0xC5 ^ 0xBB);
        q.llllIIlIll[74] = 0x52 ^ 0x7B;
        q.llllIIlIll[75] = 0x5F ^ 0x75;
        q.llllIIlIll[76] = 0x8C ^ 0xA7;
        q.llllIIlIll[77] = 0x7E ^ 0x4A;
        q.llllIIlIll[78] = 0x19 ^ 0x35;
        q.llllIIlIll[79] = -(0xFFFFFFBC & 0x7447) & (0xFFFFFFBB & Short.MAX_VALUE);
        q.llllIIlIll[80] = (0x68 ^ 5) + (0 + 32 - -35 + 72) - (0xD3 ^ 0xA9) + (0x7D ^ 0x20);
        q.llllIIlIll[81] = 0x65 ^ 6 ^ (0xEC ^ 0xA1);
        q.llllIIlIll[82] = 0xDE ^ 0x8A ^ (0xF9 ^ 0x82);
        q.llllIIlIll[83] = 62 + 7 - -70 + 20 ^ 4 + 92 - -55 + 24;
        q.llllIIlIll[84] = 0x92 ^ 0xAD ^ (0x64 ^ 0x6A);
        q.llllIIlIll[85] = 0xF3 ^ 0xC0;
        q.llllIIlIll[86] = 0xF5 ^ 0xBE ^ (0x68 ^ 0x16);
        q.llllIIlIll[87] = 0x56 ^ 0x60;
        q.llllIIlIll[88] = 0xA3 ^ 0x94;
        q.llllIIlIll[89] = 0xC0 ^ 0x97 ^ (0xCB ^ 0xA4);
        q.llllIIlIll[90] = 47 + 14 - 5 + 71 ^ (0x64 ^ 0x22);
        q.llllIIlIll[91] = 0x6D ^ 0x57;
        q.llllIIlIll[92] = 0x70 ^ 0x4B;
        q.llllIIlIll[93] = 0x8C ^ 0xA4 ^ (0xB0 ^ 0xA4);
        q.llllIIlIll[94] = 0x2D ^ 0x51 ^ (0x40 ^ 1);
        q.llllIIlIll[95] = 0x4C ^ 0x72;
        q.llllIIlIll[96] = 0x67 ^ 5 ^ (0x58 ^ 5);
        q.llllIIlIll[97] = 92 + 26 - 66 + 145 ^ 131 + 49 - 113 + 66;
        q.llllIIlIll[98] = 0x4D ^ 0xC;
        q.llllIIlIll[99] = 73 + 167 - 1 + 8 ^ 17 + 142 - 11 + 33;
        q.llllIIlIll[100] = 0xE3 ^ 0xA0;
        q.llllIIlIll[101] = 0x24 ^ 0x3E ^ (0x4C ^ 0x12);
        q.llllIIlIll[102] = 0x60 ^ 0x25;
        q.llllIIlIll[103] = 0xD7 ^ 0x91;
        q.llllIIlIll[104] = 185 + 198 - 277 + 146 ^ 100 + 72 - 136 + 151;
        q.llllIIlIll[105] = -(0xFFFFFF92 & 0x767F) & (0xFFFFFFFB & 0x7FD5);
        q.llllIIlIll[106] = 0x11 ^ 0x59;
        q.llllIIlIll[107] = 0x30 ^ 0x79;
        q.llllIIlIll[108] = 143 + 143 - 91 + 46 ^ 20 + 41 - -70 + 56;
        q.llllIIlIll[109] = 0xE6 ^ 0xAD;
        q.llllIIlIll[110] = 1 + 181 - -45 + 14 ^ 84 + 180 - 238 + 163;
        q.llllIIlIll[111] = 0x23 ^ 0x59 ^ (0xB8 ^ 0x8F);
        q.llllIIlIll[112] = 0x35 ^ 0x6E ^ (0x3D ^ 0x28);
        q.llllIIlIll[113] = 0x55 ^ 0x1A;
        q.llllIIlIll[114] = 0xD7 ^ 0xB7 ^ (0x18 ^ 0x28);
        q.llllIIlIll[115] = 0x9B ^ 0x96 ^ (0xFB ^ 0xA7);
        q.llllIIlIll[116] = 70 + 53 - -30 + 95 ^ 154 + 14 - 108 + 110;
        q.llllIIlIll[117] = 0xC3 ^ 0x90;
        q.llllIIlIll[118] = 0x4F ^ 0x1B;
        q.llllIIlIll[119] = 0xC6 ^ 0x93;
        q.llllIIlIll[120] = 0x64 ^ 0x32;
        q.llllIIlIll[121] = 0x63 ^ 0x34;
        q.llllIIlIll[122] = 216 + 23 - 55 + 42 ^ 132 + 65 - 142 + 131;
        q.llllIIlIll[123] = 0xAF ^ 0xB3 ^ (0x3B ^ 0x7E);
        q.llllIIlIll[124] = 0x5A ^ 0x3B ^ (0x60 ^ 0x5B);
        q.llllIIlIll[125] = 6 ^ 0x7A ^ (0x23 ^ 4);
        q.llllIIlIll[126] = 0x4C ^ 0x10;
        q.llllIIlIll[127] = 0x72 ^ 0x2F;
        q.llllIIlIll[128] = 0xFFFFFFFF & 0x13BE;
        q.llllIIlIll[129] = 124 + 144 - 167 + 142 ^ 76 + 103 - 54 + 48;
        q.llllIIlIll[130] = 0x5D ^ 2;
        q.llllIIlIll[131] = 0x23 ^ 0x16 ^ (0x68 ^ 0x3D);
        q.llllIIlIll[132] = 0xC0 ^ 0x95 ^ (0xB9 ^ 0x8D);
        q.llllIIlIll[133] = 0x1C ^ 0x78;
        q.llllIIlIll[134] = 0x39 ^ 0x5B;
        q.llllIIlIll[135] = 0x5B ^ 0x38;
        q.llllIIlIll[136] = 0xF9 ^ 0x9C;
        q.llllIIlIll[137] = 1 ^ 0x76 ^ (0x4A ^ 0x5B);
        q.llllIIlIll[138] = 0x17 ^ 0x3F ^ (0x5A ^ 0x15);
        q.llllIIlIll[139] = 0xE2 ^ 0x8A;
        q.llllIIlIll[140] = 0xFFFFB95A & 0xDEFD;
        q.llllIIlIll[141] = -(0xFFFFBAFD & 0x4D06) & (0xFFFFBB2B & 0x6FFF);
        q.llllIIlIll[142] = -(0xFFFFFFB7 & 0x5BE9) & (0xFFFFDFFF & 0x7FEC);
        q.llllIIlIll[143] = 0xFFFFAFE6 & 0x7EF9;
        q.llllIIlIll[144] = -(0xFFFFF375 & 0x4FEE) & (0xFFFFDBFF & Short.MAX_VALUE);
        q.llllIIlIll[145] = 0xFFFFDE7D & 0x3DA2;
        q.llllIIlIll[146] = 0xFFFFB33D & 0x6DF6;
        q.llllIIlIll[147] = -(0xFFFFDBF5 & 0x74AB) & (0xFFFFF7FC & 0x7DBF);
        q.llllIIlIll[148] = -(0xFFFF9FB5 & 0x617B) & (0xFFFFBFFE & 0x6FFD);
        q.llllIIlIll[149] = -(0x3E ^ 0x7C) & (0xFFFFF9EB & 0x67FD);
        q.llllIIlIll[150] = 0xFFFF9FED & 0x6396;
        q.llllIIlIll[151] = 0xCD ^ 0xA4;
        q.llllIIlIll[152] = 0xD8 ^ 0xB2;
        q.llllIIlIll[153] = 0xD0 ^ 0x8C ^ (0x15 ^ 0x22);
        q.llllIIlIll[154] = -(0xFFFFBB9B & 0x6465) & (0xFFFFADBF & 0x7FEF);
        q.llllIIlIll[155] = -(0xFFFFAFD7 & 0x726D) & (0xFFFFBFDF & 0x6FF7);
        q.llllIIlIll[156] = 0xFFFF8DC3 & 0x7FFE;
        q.llllIIlIll[157] = -(0xFFFFF23F & 0x7FCA) & (0xFFFFFFDF & 0x7EFD);
        q.llllIIlIll[158] = -(0xFFFFF8F9 & 0x6717) & (0xFFFFEDFF & 0x7FBA);
        q.llllIIlIll[159] = -(0xFFFFB65B & 0x6BE7) & (0xFFFFAFF6 & 0x7F7F);
        q.llllIIlIll[160] = 0xFFFFCD7F & 0x3FDF;
        q.llllIIlIll[161] = 0xFFFF8DBF & 0x7FF4;
        q.llllIIlIll[162] = 0xFFFFBFFF & 0x4D72;
        q.llllIIlIll[163] = -(0xFFFFF153 & 0x7EED) & (0xFFFFFFEA & 0x7DF7);
        q.llllIIlIll[164] = 0xFFFFE771 & 0x3EEF;
        q.llllIIlIll[165] = 0xFFFF9DEF & 0x6FBB;
        q.llllIIlIll[166] = -(0xFFFFEB3F & 0x56F5) & (0xFFFFCFBF & Short.MAX_VALUE);
        q.llllIIlIll[167] = 0xFFFFBD7E & 0x4FA9;
        q.llllIIlIll[168] = -(0xFFFFF762 & 0x589F) & (0xFFFFFFAD & 0x5DFF);
        q.llllIIlIll[169] = -(0xFFFFD1DD & 0x7EBF) & (0xFFFFF7FF & 0x7EFF);
        q.llllIIlIll[170] = 180 + 21 - 9 + 3 ^ 2 + 119 - 45 + 99;
        q.llllIIlIll[171] = 0x21 ^ 5 ^ (0x31 ^ 0x78);
        q.llllIIlIll[172] = 0x18 ^ 0x48 ^ (0x75 ^ 0x4A);
        q.llllIIlIll[173] = 0x4F ^ 0x3F;
        q.llllIIlIll[174] = 0x6F ^ 0x1E;
        q.llllIIlIll[175] = 0x13 ^ 0x22 ^ (0xC4 ^ 0x87);
        q.llllIIlIll[176] = 0x32 ^ 0x24 ^ (0xFB ^ 0x9E);
        q.llllIIlIll[177] = 0x70 ^ 4;
        q.llllIIlIll[178] = 0x21 ^ 0x54;
        q.llllIIlIll[179] = 0xFC ^ 0x8A;
        q.llllIIlIll[180] = 0xC ^ 0x7B;
        q.llllIIlIll[181] = 1 ^ (0x10 ^ 0x69);
        q.llllIIlIll[182] = 0x62 ^ 0x48 ^ (0x44 ^ 0x17);
        q.llllIIlIll[183] = 0xDF ^ 0xA6 ^ 3;
        q.llllIIlIll[184] = 0x6E ^ 0x27 ^ (0x83 ^ 0xB1);
        q.llllIIlIll[185] = 10 + 138 - 6 + 98 ^ 69 + 113 - 71 + 29;
        q.llllIIlIll[186] = 0x35 ^ 0x48;
        q.llllIIlIll[187] = 0x46 ^ 0x11 ^ (0xEF ^ 0xC6);
        q.llllIIlIll[188] = 115 + 120 - 218 + 110;
        q.llllIIlIll[189] = 36 + 56 - 47 + 83;
        q.llllIIlIll[190] = 4 + 76 - 30 + 79;
        q.llllIIlIll[191] = 126 + 100 - 124 + 28;
        q.llllIIlIll[192] = (0xB ^ 4) + (0x98 ^ 0x91) - -(0x20 ^ 0x16) + (0x9E ^ 0xAB);
        q.llllIIlIll[193] = 23 + 129 - 120 + 100;
        q.llllIIlIll[194] = 86 + 45 - 20 + 22;
        q.llllIIlIll[195] = 31 + 12 - -81 + 10;
    }

    private static boolean llIIllIlllllI(int n2) {
        return n2 < 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[llllIIlIll[0]];
        nArray[q.llllIIlIll[1]] = llllIIlIll[15];
        if (q.llIIllIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllIIlIll[0]];
            nArray2[q.llllIIlIll[1]] = llllIIlIll[16];
            if (q.llIIllIllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llllIIlIll[0]];
                nArray3[q.llllIIlIll[1]] = llllIIlIll[17];
                if (q.llIIllIllIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llllIIlIll[0]];
                    nArray4[q.llllIIlIll[1]] = llllIIlIll[18];
                    if (q.llIIllIllIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llllIIlIll[0]];
                        nArray5[q.llllIIlIll[1]] = llllIIlIll[19];
                        if (q.llIIllIllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llllIIlIll[0]];
                            nArray6[q.llllIIlIll[1]] = llllIIlIll[20];
                            if (q.llIIllIllIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[llllIIlIll[0]];
                                nArray7[q.llllIIlIll[1]] = llllIIlIll[22];
                                if (q.llIIllIllIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[llllIIlIll[0]];
                                    nArray8[q.llllIIlIll[1]] = llllIIlIll[24];
                                    if (q.llIIllIllIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[llllIIlIll[0]];
                                        nArray9[q.llllIIlIll[1]] = llllIIlIll[40];
                                        if (q.llIIllIllIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            String[] stringArray = new String[llllIIlIll[0]];
                                            stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[139]];
                                            if (q.llIIllIllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                int[] nArray10 = new int[llllIIlIll[0]];
                                                nArray10[q.llllIIlIll[1]] = llllIIlIll[26];
                                                if (q.llIIllIllIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                                    int[] nArray11 = new int[llllIIlIll[0]];
                                                    nArray11[q.llllIIlIll[1]] = llllIIlIll[36];
                                                    if (q.llIIllIllIlll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                                        int[] nArray12 = new int[llllIIlIll[0]];
                                                        nArray12[q.llllIIlIll[1]] = llllIIlIll[34];
                                                        if (q.llIIllIllIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                                            int[] nArray13 = new int[llllIIlIll[0]];
                                                            nArray13[q.llllIIlIll[1]] = llllIIlIll[28];
                                                            if (q.llIIllIllIlll(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                                                n2 = llllIIlIll[0];
                                                                0;
                                                                if (((0xDF ^ 0x87) & ~(0x54 ^ 0xC)) == 0) return n2 != 0;
                                                                return ((0x35 ^ 0x3C) & ~(0x16 ^ 0x1F)) != 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llllIIlIll[1];
        return n2 != 0;
    }

    private static boolean llIIllIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlllIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIllIlIIlII() {
        llllIIIlll = new String[llllIIlIll[195]];
        q.llllIIIlll[q.llllIIlIll[1]] = q."Finished buying items, switching back to quest";
        q.llllIIIlll[q.llllIIlIll[0]] = q."- Agility";
        q.llllIIIlll[q.llllIIlIll[4]] = q."- Prayer";
        q.llllIIIlll[q.llllIIlIll[7]] = q."Drop";
        q.llllIIIlll[q.llllIIlIll[8]] = q."- Nature Spirit";
        q.llllIIIlll[q.llllIIlIll[10]] = q."Nav to bank";
        q.llllIIIlll[q.llllIIlIll[12]] = q."Handling banking";
        q.llllIIIlll[q.llllIIlIll[21]] = q."We are missing quest supplies, switching to BUYING";
        q.llllIIIlll[q.llllIIlIll[23]] = q."Wield";
        q.llllIIIlll[q.llllIIlIll[25]] = q."Druid pouch";
        q.llllIIIlll[q.llllIIlIll[27]] = q."Drink";
        q.llllIIIlll[q.llllIIlIll[29]] = q."Eat";
        q.llllIIIlll[q.llllIIlIll[31]] = q."";
        q.llllIIIlll[q.llllIIlIll[33]] = q."Nav to start";
        q.llllIIIlll[q.llllIIlIll[35]] = q."Wield";
        q.llllIIIlll[q.llllIIlIll[37]] = q."Break";
        q.llllIIIlll[q.llllIIlIll[13]] = q."Starting quest";
        q.llllIIIlll[q.llllIIlIll[45]] = q."Vanstrom Klause";
        q.llllIIIlll[q.llllIIlIll[46]] = q."Filling pouch";
        q.llllIIIlll[q.llllIIlIll[47]] = q."Druid pouch";
        q.llllIIIlll[q.llllIIlIll[43]] = q."Fill";
        q.llllIIIlll[q.llllIIlIll[48]] = q."Breaking tab";
        q.llllIIIlll[q.llllIIlIll[49]] = q."Break";
        q.llllIIIlll[q.llllIIlIll[50]] = q."Nav to boat";
        q.llllIIIlll[q.llllIIlIll[51]] = q."Handle boat chat";
        q.llllIIIlll[q.llllIIlIll[54]] = q."Nav to hop spot";
        q.llllIIIlll[q.llllIIlIll[2]] = q."Cyreg Paddlehorn";
        q.llllIIIlll[q.llllIIlIll[55]] = q."Swamp Boaty";
        q.llllIIIlll[q.llllIIlIll[56]] = q."Board";
        q.llllIIIlll[q.llllIIlIll[57]] = q."Nav to bridge";
        q.llllIIIlll[q.llllIIlIll[58]] = q."Tree";
        q.llllIIIlll[q.llllIIlIll[59]] = q."Climb";
        q.llllIIIlll[q.llllIIlIll[65]] = q."Nav to bridge";
        q.llllIIIlll[q.llllIIlIll[66]] = q."Tree";
        q.llllIIIlll[q.llllIIlIll[67]] = q."Climb";
        q.llllIIIlll[q.llllIIlIll[68]] = q."Broken rope bridge";
        q.llllIIIlll[q.llllIIlIll[69]] = q."Repair";
        q.llllIIIlll[q.llllIIlIll[70]] = q."Repairing bridge";
        q.llllIIIlll[q.llllIIlIll[71]] = q."Repair";
        q.llllIIIlll[q.llllIIlIll[72]] = q."Tree";
        q.llllIIIlll[q.llllIIlIll[73]] = q."Climb";
        q.llllIIIlll[q.llllIIlIll[74]] = q."Nav to door";
        q.llllIIIlll[q.llllIIlIll[75]] = q."Handling chat";
        q.llllIIIlll[q.llllIIlIll[76]] = q."Curpile Fyod";
        q.llllIIIlll[q.llllIIlIll[78]] = q."Curpile Fyod";
        q.llllIIIlll[q.llllIIlIll[3]] = q."Talk-to";
        q.llllIIIlll[q.llllIIlIll[81]] = q."Who is the only female in the Myreque?";
        q.llllIIIlll[q.llllIIlIll[82]] = q."female";
        q.llllIIIlll[q.llllIIlIll[83]] = q."Sani Piliu";
        q.llllIIIlll[q.llllIIlIll[84]] = q."leader";
        q.llllIIIlll[q.llllIIlIll[42]] = q."Veliaf Hurtz";
        q.llllIIIlll[q.llllIIlIll[85]] = q."boatman's";
        q.llllIIIlll[q.llllIIlIll[77]] = q."boatman";
        q.llllIIIlll[q.llllIIlIll[86]] = q."Cyreg Paddlehorn";
        q.llllIIIlll[q.llllIIlIll[87]] = q."scholar?";
        q.llllIIIlll[q.llllIIlIll[88]] = q."Polmafi Ferdygris";
        q.llllIIIlll[q.llllIIlIll[89]] = q."vampyre family";
        q.llllIIIlll[q.llllIIlIll[90]] = q."Drakan";
        q.llllIIIlll[q.llllIIlIll[91]] = q."youngest";
        q.llllIIIlll[q.llllIIlIll[92]] = q."Ivan Strom";
        q.llllIIIlll[q.llllIIlIll[93]] = q."Myreque mean?";
        q.llllIIIlll[q.llllIIlIll[94]] = q."Hidden in Myre";
        q.llllIIIlll[q.llllIIlIll[95]] = q."Entering doors";
        q.llllIIIlll[q.llllIIlIll[96]] = q."Wooden doors";
        q.llllIIIlll[q.llllIIlIll[97]] = q."Open";
        q.llllIIIlll[q.llllIIlIll[98]] = q."Nav to cave";
        q.llllIIIlll[q.llllIIlIll[99]] = q."Entering cave";
        q.llllIIIlll[q.llllIIlIll[100]] = q."Cave entrance";
        q.llllIIIlll[q.llllIIlIll[101]] = q."Enter";
        q.llllIIIlll[q.llllIIlIll[102]] = q."Talking";
        q.llllIIIlll[q.llllIIlIll[103]] = q."Veliaf Hurtz";
        q.llllIIIlll[q.llllIIlIll[104]] = q."Talking";
        q.llllIIIlll[q.llllIIlIll[106]] = q."Harold Evans";
        q.llllIIIlll[q.llllIIlIll[107]] = q."Radigad Ponfit";
        q.llllIIIlll[q.llllIIlIll[108]] = q."Talk-to";
        q.llllIIIlll[q.llllIIlIll[109]] = q."Radigad Ponfit";
        q.llllIIIlll[q.llllIIlIll[110]] = q."Sani Piliu";
        q.llllIIIlll[q.llllIIlIll[111]] = q."Talk-to";
        q.llllIIIlll[q.llllIIlIll[112]] = q."Sani Piliu";
        q.llllIIIlll[q.llllIIlIll[113]] = q."Polmafi Ferdygris";
        q.llllIIIlll[q.llllIIlIll[114]] = q."Talk-to";
        q.llllIIIlll[q.llllIIlIll[115]] = q."Polmafi Ferdygris";
        q.llllIIIlll[q.llllIIlIll[116]] = q."Ivan Strom";
        q.llllIIIlll[q.llllIIlIll[117]] = q."Talk-to";
        q.llllIIIlll[q.llllIIlIll[118]] = q."Ivan Strom";
        q.llllIIIlll[q.llllIIlIll[119]] = q."Veliaf Hurtz";
        q.llllIIIlll[q.llllIIlIll[120]] = q."Let's talk about the weapons.";
        q.llllIIIlll[q.llllIIlIll[121]] = q."I'll be back later.";
        q.llllIIIlll[q.llllIIlIll[122]] = q."Talking";
        q.llllIIIlll[q.llllIIlIll[123]] = q."Veliaf Hurtz";
        q.llllIIIlll[q.llllIIlIll[124]] = q."Handling chat";
        q.llllIIIlll[q.llllIIlIll[125]] = q."BOSS FIGHT";
        q.llllIIIlll[q.llllIIlIll[126]] = q."Drink";
        q.llllIIIlll[q.llllIIlIll[127]] = q."Wield";
        q.llllIIIlll[q.llllIIlIll[129]] = q."Attack";
        q.llllIIIlll[q.llllIIlIll[130]] = q."Talking";
        q.llllIIIlll[q.llllIIlIll[131]] = q."Veliaf Hurtz";
        q.llllIIIlll[q.llllIIlIll[132]] = q."Exiting cave";
        q.llllIIIlll[q.llllIIlIll[134]] = q."Cave entrance";
        q.llllIIIlll[q.llllIIlIll[135]] = q."Enter";
        q.llllIIIlll[q.llllIIlIll[133]] = q."Nav to start";
        q.llllIIIlll[q.llllIIlIll[136]] = q."Finishing quest";
        q.llllIIIlll[q.llllIIlIll[137]] = q."Stranger";
        q.llllIIIlll[q.llllIIlIll[138]] = q."Break";
        q.llllIIIlll[q.llllIIlIll[139]] = q."Druid pouch";
        q.llllIIIlll[q.llllIIlIll[151]] = q."ring of wealth (";
        q.llllIIIlll[q.llllIIlIll[152]] = q."Loar Shadow";
        q.llllIIIlll[q.llllIIlIll[153]] = q."Afflicted";
        q.llllIIIlll[q.llllIIlIll[170]] = q."Why do they need help? Are they in trouble?";
        q.llllIIIlll[q.llllIIlIll[171]] = q."Perhaps I could help you out here.";
        q.llllIIIlll[q.llllIIlIll[6]] = q."Yes, I'll do it!";
        q.llllIIIlll[q.llllIIlIll[172]] = q."Yes.";
        q.llllIIIlll[q.llllIIlIll[173]] = q."Well, I guess they'll just die without weapons.";
        q.llllIIIlll[q.llllIIlIll[174]] = q."Resourceful enough to get their own steel weapons?";
        q.llllIIIlll[q.llllIIlIll[175]] = q."If you don't tell me, their deaths are on your head!";
        q.llllIIIlll[q.llllIIlIll[176]] = q."Why do you say that this place is 'forsaken'?";
        q.llllIIIlll[q.llllIIlIll[177]] = q."Give wooden planks to Cyreg";
        q.llllIIIlll[q.llllIIlIll[178]] = q."Yes, I'll pay the ten gold.";
        q.llllIIIlll[q.llllIIlIll[179]] = q."Yes, I'll pay ten gold.";
        q.llllIIIlll[q.llllIIlIll[180]] = q."Yes. I'll pay the ten gold.";
        q.llllIIIlll[q.llllIIlIll[181]] = q."I've come to help the Myreque. I've brought weapons.";
        q.llllIIIlll[q.llllIIlIll[182]] = q."Sani Piliu";
        q.llllIIIlll[q.llllIIlIll[183]] = q."Veliaf Hurtz";
        q.llllIIIlll[q.llllIIlIll[184]] = q."Cyreg Paddlehorn";
        q.llllIIIlll[q.llllIIlIll[185]] = q."Drakan";
        q.llllIIIlll[q.llllIIlIll[186]] = q."Ivan Strom";
        q.llllIIIlll[q.llllIIlIll[187]] = q."Hidden in Myre";
        q.llllIIIlll[q.llllIIlIll[188]] = q."Polmafi Ferdygris";
        q.llllIIIlll[q.llllIIlIll[189]] = q."How do I get out of here?";
        q.llllIIIlll[q.llllIIlIll[190]] = q."Ok, thanks.";
        q.llllIIIlll[q.llllIIlIll[191]] = q."What kind of a man are you to say that you don't care?";
        q.llllIIIlll[q.llllIIlIll[192]] = q."Here are some planks for you.";
        q.llllIIIlll[q.llllIIlIll[193]] = q."Let's talk about the weapons.";
        q.llllIIIlll[q.llllIIlIll[194]] = q."";
    }

    private static boolean llIIllIllIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return llllIIlIll[1];
    }

    private static boolean llIIlllIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIIllIIlIIIl(String lllllllllllllllllIlIllIIllllIllI, String lllllllllllllllllIlIllIIllllIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIlllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIllIIlllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIllIIlllllIlI.init(llllIIlIll[4], lllllllllllllllllIlIllIIlllllIll);
            return new String(lllllllllllllllllIlIllIIlllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIIlllllIIl) {
            lllllllllllllllllIlIllIIlllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIllllII(Object object) {
        return object != null;
    }

    private static boolean llIIlllIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIllIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static int llIIllIllIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String llIIllIIlIIII(String lllllllllllllllllIlIllIIlllIlIll, String lllllllllllllllllIlIllIIlllIlIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIlllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIlllIlIII.getBytes(StandardCharsets.UTF_8)), llllIIlIll[23]), "DES");
            Cipher lllllllllllllllllIlIllIIlllIllIl = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIIlllIllIl.init(llllIIlIll[4], lllllllllllllllllIlIllIIlllIlllI);
            return new String(lllllllllllllllllIlIllIIlllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIIlllIllII) {
            lllllllllllllllllIlIllIIlllIllII.printStackTrace();
            return null;
        }
    }

    static {
        q.llIIllIllIlIl();
        q.llIIllIlIIlII();
        cO = llllIIlIll[9];
        bu = new ArrayList<d>();
        cn = new WorldPoint(llllIIlIll[154], llllIIlIll[155], llllIIlIll[1]);
        cP = new WorldPoint(llllIIlIll[156], llllIIlIll[157], llllIIlIll[1]);
        cQ = new WorldPoint(llllIIlIll[158], llllIIlIll[159], llllIIlIll[1]);
        cR = new WorldPoint(llllIIlIll[60], llllIIlIll[160], llllIIlIll[1]);
        cS = new WorldPoint(llllIIlIll[161], llllIIlIll[162], llllIIlIll[1]);
        cT = new WorldPoint(llllIIlIll[163], llllIIlIll[164], llllIIlIll[1]);
        cU = new WorldArea(llllIIlIll[165], llllIIlIll[64], llllIIlIll[48], llllIIlIll[2], llllIIlIll[1]);
        cV = new WorldArea(llllIIlIll[166], llllIIlIll[167], llllIIlIll[94], llllIIlIll[129], llllIIlIll[1]);
        cG = new WorldArea(llllIIlIll[168], llllIIlIll[169], llllIIlIll[48], llllIIlIll[49], llllIIlIll[1]);
        String[] stringArray = new String[llllIIlIll[54]];
        stringArray[q.llllIIlIll[1]] = llllIIIlll[llllIIlIll[170]];
        stringArray[q.llllIIlIll[0]] = llllIIIlll[llllIIlIll[171]];
        stringArray[q.llllIIlIll[4]] = llllIIIlll[llllIIlIll[6]];
        stringArray[q.llllIIlIll[7]] = llllIIIlll[llllIIlIll[172]];
        stringArray[q.llllIIlIll[8]] = llllIIIlll[llllIIlIll[173]];
        stringArray[q.llllIIlIll[10]] = llllIIIlll[llllIIlIll[174]];
        stringArray[q.llllIIlIll[12]] = llllIIIlll[llllIIlIll[175]];
        stringArray[q.llllIIlIll[21]] = llllIIIlll[llllIIlIll[176]];
        stringArray[q.llllIIlIll[23]] = llllIIIlll[llllIIlIll[177]];
        stringArray[q.llllIIlIll[25]] = llllIIIlll[llllIIlIll[178]];
        stringArray[q.llllIIlIll[27]] = llllIIIlll[llllIIlIll[179]];
        stringArray[q.llllIIlIll[29]] = llllIIIlll[llllIIlIll[180]];
        stringArray[q.llllIIlIll[31]] = llllIIIlll[llllIIlIll[181]];
        stringArray[q.llllIIlIll[33]] = llllIIIlll[llllIIlIll[182]];
        stringArray[q.llllIIlIll[35]] = llllIIIlll[llllIIlIll[183]];
        stringArray[q.llllIIlIll[37]] = llllIIIlll[llllIIlIll[184]];
        stringArray[q.llllIIlIll[13]] = llllIIIlll[llllIIlIll[185]];
        stringArray[q.llllIIlIll[45]] = llllIIIlll[llllIIlIll[186]];
        stringArray[q.llllIIlIll[46]] = llllIIIlll[llllIIlIll[187]];
        stringArray[q.llllIIlIll[47]] = llllIIIlll[llllIIlIll[188]];
        stringArray[q.llllIIlIll[43]] = llllIIIlll[llllIIlIll[189]];
        stringArray[q.llllIIlIll[48]] = llllIIIlll[llllIIlIll[190]];
        stringArray[q.llllIIlIll[49]] = llllIIIlll[llllIIlIll[191]];
        stringArray[q.llllIIlIll[50]] = llllIIIlll[llllIIlIll[192]];
        stringArray[q.llllIIlIll[51]] = llllIIIlll[llllIIlIll[193]];
        bQ = stringArray;
        cm = llllIIIlll[llllIIlIll[194]];
        h = "In search of Myreque " + cm;
    }

    private static boolean llIIllIlllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            q.aV();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x33 ^ 0x37) >= 0) {
            return (3 ^ 0x1D) & ~(0x95 ^ 0x8B) & ~((0xD6 ^ 0xC0) & ~(0xBD ^ 0xAB));
        }
        return llllIIlIll[133];
    }

    @Override
    public String U() {
        return h;
    }

    private static boolean llIIllIlllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIllIllllIl(int n2) {
        return n2 > 0;
    }
}


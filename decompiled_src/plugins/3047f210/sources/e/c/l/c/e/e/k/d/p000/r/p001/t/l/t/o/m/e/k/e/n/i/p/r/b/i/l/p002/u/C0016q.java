package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/q.class */
public class C0016q implements S {
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
    public static /* synthetic */ List<C0003d> bu;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIllIlllIlI(C0004e.j(llllIIlIll[9]), llllIIlIll[6]) && llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
            ?? r0 = llllIIlIll[0];
            "".length();
            return 0 != 0 ? true & ((true ^ true) ^ true) : r0;
        }
        return llllIIlIll[1];
    }

    private static String llIIllIIlIIlI(String lllllllllllllllllIlIllIIllIllIll, String lllllllllllllllllIlIllIIllIllIlI) {
        String lllllllllllllllllIlIllIIllIllIll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIIllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIIllIllIIl = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIllIIllIllIlI.toCharArray();
        int lllllllllllllllllIlIllIIllIlIlll = llllIIlIll[1];
        char[] charArray2 = lllllllllllllllllIlIllIIllIllIll2.toCharArray();
        int length = charArray2.length;
        int i = llllIIlIll[1];
        while (llIIllIlllIII(i, length)) {
            char lllllllllllllllllIlIllIIllIlllII = charArray2[i];
            lllllllllllllllllIlIllIIllIllIIl.append((char) (lllllllllllllllllIlIllIIllIlllII ^ charArray[lllllllllllllllllIlIllIIllIlIlll % charArray.length]));
            "".length();
            lllllllllllllllllIlIllIIllIlIlll++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIllIIllIllIIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1004, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1046, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v207, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v207, types: [boolean] */
    public static void aV() {
        if (llIIllIllIlll(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIIllIlllIII(bu.size(), llllIIlIll[0])) {
                System.out.println(llllIIIlll[llllIIlIll[1]]);
                bs = llllIIlIll[1];
            }
        }
        if (llIIllIlllIIl(bs ? 1 : 0)) {
            if (llIIllIlllIII(Skills.getLevel(Skill.AGILITY), llllIIlIll[2])) {
                cm = llllIIIlll[llllIIlIll[0]];
                W.ds();
            }
            if (llIIllIlllIlI(Skills.getLevel(Skill.AGILITY), llllIIlIll[2]) && llIIllIlllIII(Skills.getLevel(Skill.PRAYER), llllIIlIll[3])) {
                cm = llllIIIlll[llllIIlIll[4]];
                aa.eA();
            }
            if (llIIllIlllIII(C0004e.j(llllIIlIll[5]), llllIIlIll[6]) && llIIllIlllIlI(Skills.getLevel(Skill.AGILITY), llllIIlIll[2]) && llIIllIlllIlI(Skills.getLevel(Skill.PRAYER), llllIIlIll[3])) {
                if (llIIllIllIlll(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.aZ).interact(llllIIIlll[llllIIlIll[7]]);
                }
                cm = llllIIIlll[llllIIlIll[8]];
                C0017r.aY();
            }
            if (llIIllIlllIIl(aa() ? 1 : 0) && llIIllIlllIlI(Skills.getLevel(Skill.AGILITY), llllIIlIll[2]) && llIIllIlllIlI(Skills.getLevel(Skill.PRAYER), llllIIlIll[3]) && llIIllIlllIII(C0004e.j(llllIIlIll[9]), llllIIlIll[0]) && llIIllIlllIll(C0004e.j(llllIIlIll[5]), llllIIlIll[6])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIllIllllII(nearest) && llIIllIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[10]];
                    C0000a.a(nearest);
                }
                if (llIIllIllllII(nearest) && llIIllIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIllIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIlIll[11]);
                        "".length();
                    }
                    if (llIIllIllIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[12]];
                        if (llIIllIllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIlIll[8]);
                            "".length();
                        }
                        if (llIIllIllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIIlIll[4]);
                            "".length();
                        }
                        int[] iArr = new int[llllIIlIll[13]];
                        iArr[llllIIlIll[1]] = llllIIlIll[14];
                        iArr[llllIIlIll[0]] = llllIIlIll[15];
                        iArr[llllIIlIll[4]] = llllIIlIll[16];
                        iArr[llllIIlIll[7]] = llllIIlIll[17];
                        iArr[llllIIlIll[8]] = llllIIlIll[18];
                        iArr[llllIIlIll[10]] = llllIIlIll[19];
                        iArr[llllIIlIll[12]] = llllIIlIll[20];
                        iArr[llllIIlIll[21]] = llllIIlIll[22];
                        iArr[llllIIlIll[23]] = llllIIlIll[24];
                        iArr[llllIIlIll[25]] = llllIIlIll[26];
                        iArr[llllIIlIll[27]] = llllIIlIll[28];
                        iArr[llllIIlIll[29]] = llllIIlIll[30];
                        iArr[llllIIlIll[31]] = llllIIlIll[32];
                        iArr[llllIIlIll[33]] = llllIIlIll[34];
                        iArr[llllIIlIll[35]] = llllIIlIll[36];
                        iArr[llllIIlIll[37]] = llllIIlIll[38];
                        if (llIIllIlllIIl(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(llllIIIlll[llllIIlIll[21]]);
                            bs = llllIIlIll[0];
                            return;
                        }
                        int[] iArr2 = new int[llllIIlIll[13]];
                        iArr2[llllIIlIll[1]] = llllIIlIll[14];
                        iArr2[llllIIlIll[0]] = llllIIlIll[15];
                        iArr2[llllIIlIll[4]] = llllIIlIll[16];
                        iArr2[llllIIlIll[7]] = llllIIlIll[17];
                        iArr2[llllIIlIll[8]] = llllIIlIll[18];
                        iArr2[llllIIlIll[10]] = llllIIlIll[19];
                        iArr2[llllIIlIll[12]] = llllIIlIll[20];
                        iArr2[llllIIlIll[21]] = llllIIlIll[22];
                        iArr2[llllIIlIll[23]] = llllIIlIll[24];
                        iArr2[llllIIlIll[25]] = llllIIlIll[26];
                        iArr2[llllIIlIll[27]] = llllIIlIll[28];
                        iArr2[llllIIlIll[29]] = llllIIlIll[30];
                        iArr2[llllIIlIll[31]] = llllIIlIll[32];
                        iArr2[llllIIlIll[33]] = llllIIlIll[34];
                        iArr2[llllIIlIll[35]] = llllIIlIll[36];
                        iArr2[llllIIlIll[37]] = llllIIlIll[38];
                        if (llIIllIllIlll(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llllIIlIll[0]];
                            iArr3[llllIIlIll[1]] = llllIIlIll[38];
                            if (llIIllIlllIIl(Equipment.contains(iArr3) ? 1 : 0)) {
                                C0000a.a(llllIIlIll[38], llllIIlIll[0]);
                                int[] iArr4 = new int[llllIIlIll[0]];
                                iArr4[llllIIlIll[1]] = llllIIlIll[38];
                                if (llIIllIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[llllIIlIll[0]];
                                    iArr5[llllIIlIll[1]] = llllIIlIll[38];
                                    Inventory.getFirst(iArr5).interact(llllIIIlll[llllIIlIll[23]]);
                                    Time.sleepTicks(llllIIlIll[0]);
                                    "".length();
                                }
                            }
                            if (llIIllIlllIIl(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(llllIIlIll[8]);
                                "".length();
                            }
                            if (llIIllIllIlll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a(llllIIlIll[15], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[16], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[17], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[18], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[19], llllIIlIll[4]);
                                C0000a.a(llllIIlIll[20], llllIIlIll[39]);
                                C0000a.a(llllIIlIll[22], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[24], llllIIlIll[12]);
                                C0000a.a(llllIIlIll[40], llllIIlIll[41]);
                                Bank.withdraw(llllIIIlll[llllIIlIll[25]], llllIIlIll[0], Bank.WithdrawMode.ITEM);
                                C0000a.a(llllIIlIll[28], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[30], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[26], llllIIlIll[12]);
                                C0000a.a(llllIIlIll[36], llllIIlIll[27]);
                                C0000a.a(llllIIlIll[14], llllIIlIll[27]);
                                C0000a.a(llllIIlIll[34], llllIIlIll[0]);
                                C0000a.a(llllIIlIll[32], llllIIlIll[0]);
                            }
                        }
                    }
                }
            }
            if (llIIllIllIlll(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIllIlllIII(Movement.getRunEnergy(), llllIIlIll[42])) {
                Inventory.getFirst(C0005f.aU).interact(llllIIIlll[llllIIlIll[27]]);
                Time.sleepTicks(llllIIlIll[0]);
                "".length();
            }
            if (llIIllIlllllI(llIIllIllIllI(C0004e.u(), 50.0d))) {
                int[] iArr6 = new int[llllIIlIll[0]];
                iArr6[llllIIlIll[1]] = llllIIlIll[32];
                if (llIIllIllIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llllIIlIll[0]];
                    iArr7[llllIIlIll[1]] = llllIIlIll[32];
                    Inventory.getFirst(iArr7).interact(llllIIIlll[llllIIlIll[29]]);
                    Time.sleepTicks(llllIIlIll[4]);
                    "".length();
                }
            }
            if (llIIllIllIlll(aa() ? 1 : 0) && llIIllIlllIIl(C0004e.j(llllIIlIll[9]))) {
                cm = llllIIIlll[llllIIlIll[31]];
                if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[33]];
                    if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(C0001b.I), llllIIlIll[43])) {
                        int[] iArr8 = new int[llllIIlIll[0]];
                        iArr8[llllIIlIll[1]] = llllIIlIll[38];
                        if (llIIllIllIlll(Inventory.contains(iArr8) ? 1 : 0)) {
                            int[] iArr9 = new int[llllIIlIll[0]];
                            iArr9[llllIIlIll[1]] = llllIIlIll[38];
                            if (llIIllIlllIIl(Equipment.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llllIIlIll[0]];
                                iArr10[llllIIlIll[1]] = llllIIlIll[38];
                                Inventory.getFirst(iArr10).interact(llllIIIlll[llllIIlIll[35]]);
                            }
                        }
                        int[] iArr11 = new int[llllIIlIll[0]];
                        iArr11[llllIIlIll[1]] = llllIIlIll[36];
                        if (llIIllIllIlll(Inventory.contains(iArr11) ? 1 : 0) && llIIllIlllIll(Players.getLocal().getAnimation(), llllIIlIll[44])) {
                            int[] iArr12 = new int[llllIIlIll[0]];
                            iArr12[llllIIlIll[1]] = llllIIlIll[36];
                            Inventory.getFirst(iArr12).interact(llllIIIlll[llllIIlIll[37]]);
                            Time.sleepTicks(llllIIlIll[4]);
                            "".length();
                        }
                    }
                    if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(C0001b.I), llllIIlIll[43])) {
                        if (llIIllIllIlll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(cn);
                        "".length();
                        Time.sleepTicks(llllIIlIll[0]);
                        "".length();
                    }
                }
                if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[13]];
                    C0006g.a(llllIIIlll[llllIIlIll[45]], bQ);
                }
            }
            if (!llIIlllIIIIIl(C0004e.j(llllIIlIll[9]), llllIIlIll[10]) || !llIIlllIIIIIl(C0004e.j(llllIIlIll[9]), llllIIlIll[27]) || llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[37])) {
                int[] iArr13 = new int[llllIIlIll[0]];
                iArr13[llllIIlIll[1]] = llllIIlIll[26];
                if (llIIllIllIlll(Inventory.contains(iArr13) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[46]];
                    String[] strArr = new String[llllIIlIll[0]];
                    strArr[llllIIlIll[1]] = llllIIIlll[llllIIlIll[47]];
                    Inventory.getFirst(strArr).interact(llllIIIlll[llllIIlIll[43]]);
                    Time.sleepTicks(llllIIlIll[4]);
                    "".length();
                }
                int[] iArr14 = new int[llllIIlIll[0]];
                iArr14[llllIIlIll[1]] = llllIIlIll[26];
                if (llIIllIlllIIl(Inventory.contains(iArr14) ? 1 : 0) && llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[27])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[48]];
                    int[] iArr15 = new int[llllIIlIll[0]];
                    iArr15[llllIIlIll[1]] = llllIIlIll[34];
                    if (llIIllIllIlll(Inventory.contains(iArr15) ? 1 : 0) && llIIllIlllIll(Players.getLocal().getAnimation(), llllIIlIll[44])) {
                        int[] iArr16 = new int[llllIIlIll[0]];
                        iArr16[llllIIlIll[1]] = llllIIlIll[34];
                        Inventory.getFirst(iArr16).interact(llllIIIlll[llllIIlIll[49]]);
                        Time.sleepTicks(llllIIlIll[4]);
                        "".length();
                    }
                }
                if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[27]) && llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cP), llllIIlIll[27])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[50]];
                    Movement.walkTo(cP);
                    "".length();
                    Time.sleepTicks(llllIIlIll[0]);
                    "".length();
                }
                if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cP), llllIIlIll[27])) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[51]];
                    List all = NPCs.getAll(npc -> {
                        if (!llIIllIlllIIl(npc.getName().contains(llllIIIlll[llllIIlIll[152]]) ? 1 : 0) || llIIllIllIlll(npc.getName().contains(llllIIIlll[llllIIlIll[153]]) ? 1 : 0)) {
                            ?? r0 = llllIIlIll[0];
                            "".length();
                            return 0 != 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                        }
                        return llllIIlIll[1];
                    });
                    if (llIIllIlllIIl(all.isEmpty() ? 1 : 0) && llIIllIllllII((NPC) all.stream().filter(npc2 -> {
                        if (llIIlllIIIIII(npc2.getWorldLocation().distanceTo(cP), llllIIlIll[4])) {
                            ?? r0 = llllIIlIll[0];
                            "".length();
                            return " ".length() < " ".length() ? ((127 ^ 4) ^ (233 ^ 170)) & (((255 ^ 156) ^ (152 ^ 195)) ^ (-" ".length())) : r0;
                        }
                        return llllIIlIll[1];
                    }).findAny().orElse(null))) {
                        int i = llllIIlIll[0];
                        int world = Static.getClient().getWorld();
                        while (true) {
                            if (!llIIllIllIlll(i)) {
                                break;
                            }
                            if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIlIll[52], llllIIlIll[53], llllIIlIll[1])), llllIIlIll[4])) {
                                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[54]];
                                Movement.walkTo(new WorldPoint(llllIIlIll[52], llllIIlIll[53], llllIIlIll[1]));
                                "".length();
                                Time.sleepTicks(llllIIlIll[0]);
                                "".length();
                            }
                            if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIIlIll[52], llllIIlIll[53], llllIIlIll[1])), llllIIlIll[4])) {
                                C0004e.k(C0004e.t());
                            }
                            if (llIIlllIIIIIl(Static.getClient().getWorld(), world)) {
                                int i2 = llllIIlIll[1];
                                "".length();
                                if ("  ".length() >= (27 ^ 31)) {
                                    return;
                                }
                            }
                        }
                    }
                    C0006g.a(llllIIIlll[llllIIlIll[2]], bQ);
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[43])) {
                if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cP), llllIIlIll[27])) {
                    if (llIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr2 = new String[llllIIlIll[0]];
                        strArr2[llllIIlIll[1]] = llllIIIlll[llllIIlIll[55]];
                        TileObjects.getNearest(strArr2).interact(llllIIIlll[llllIIlIll[56]]);
                        Time.sleepTicks(llllIIlIll[4]);
                        "".length();
                    }
                    C0006g.a(bQ);
                }
                if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cQ), llllIIlIll[42])) {
                    if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[57]];
                        Movement.walkTo(cR);
                        "".length();
                        Time.sleepTicks(llllIIlIll[0]);
                        "".length();
                    }
                    if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10])) {
                        String[] strArr3 = new String[llllIIlIll[0]];
                        strArr3[llllIIlIll[1]] = llllIIIlll[llllIIlIll[58]];
                        TileObjects.getNearest(strArr3).interact(llllIIIlll[llllIIlIll[59]]);
                        Time.sleepTicks(llllIIlIll[4]);
                        "".length();
                    }
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[54]) && llIIllIllIlll(cV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                ck = llllIIlIll[1];
                WorldPoint worldPoint = new WorldPoint(llllIIlIll[60], llllIIlIll[61], llllIIlIll[1]);
                WorldPoint worldPoint2 = new WorldPoint(llllIIlIll[60], llllIIlIll[62], llllIIlIll[1]);
                WorldPoint worldPoint3 = new WorldPoint(llllIIlIll[60], llllIIlIll[63], llllIIlIll[1]);
                WorldPoint worldPoint4 = new WorldPoint(llllIIlIll[60], llllIIlIll[64], llllIIlIll[1]);
                if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10]) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && llIIllIlllIIl(cU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[65]];
                    Movement.walkTo(cR);
                    "".length();
                    Time.sleepTicks(llllIIlIll[0]);
                    "".length();
                }
                if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIIlIll[10]) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                    String[] strArr4 = new String[llllIIlIll[0]];
                    strArr4[llllIIlIll[1]] = llllIIIlll[llllIIlIll[66]];
                    TileObjects.getNearest(strArr4).interact(llllIIIlll[llllIIlIll[67]]);
                    Time.sleepTicks(llllIIlIll[4]);
                    "".length();
                }
                if (!llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) || !llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) || llIIllIllIlll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                    String[] strArr5 = new String[llllIIlIll[0]];
                    strArr5[llllIIlIll[1]] = llllIIIlll[llllIIlIll[68]];
                    TileObject nearest2 = TileObjects.getNearest(strArr5);
                    if (llIIllIllllII(nearest2)) {
                        String[] strArr6 = new String[llllIIlIll[0]];
                        strArr6[llllIIlIll[1]] = llllIIIlll[llllIIlIll[69]];
                        if (llIIllIllIlll(nearest2.hasAction(strArr6) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[70]];
                            nearest2.interact(llllIIIlll[llllIIlIll[71]]);
                            Time.sleepTicks(llllIIlIll[4]);
                            "".length();
                        }
                    }
                }
                if (llIIllIllIlll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                    String[] strArr7 = new String[llllIIlIll[0]];
                    strArr7[llllIIlIll[1]] = llllIIIlll[llllIIlIll[72]];
                    TileObjects.getNearest(strArr7).interact(llllIIIlll[llllIIlIll[73]]);
                    Time.sleepTicks(llllIIlIll[4]);
                    "".length();
                }
                if (llIIllIllIlll(cU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && llIIllIlllIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                    if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cS), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[74]];
                        Movement.walkTo(cS);
                        "".length();
                        Time.sleepTicks(llllIIlIll[0]);
                        "".length();
                    }
                    if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cS), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[75]];
                        C0006g.a(llllIIIlll[llllIIlIll[76]], bQ);
                    }
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[77])) {
                if (llIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr8 = new String[llllIIlIll[0]];
                    strArr8[llllIIlIll[1]] = llllIIIlll[llllIIlIll[78]];
                    List all2 = NPCs.getAll(strArr8);
                    if (llIIllIllllIl(all2.size())) {
                        ((NPC) all2.get(llllIIlIll[1])).interact(llllIIIlll[llllIIlIll[3]]);
                        Time.sleepUntil(() -> {
                            return Dialog.isOpen();
                        }, llllIIlIll[79]);
                        "".length();
                    }
                }
                if (llIIllIllIlll(Dialog.isOpen() ? 1 : 0)) {
                    if (!llIIllIlllIIl(Dialog.canContinueNPC() ? 1 : 0) || llIIllIllIlll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                    List children = Widgets.getChildren(llllIIlIll[80], llllIIlIll[0], widget -> {
                        return widget.isVisible();
                    });
                    if (llIIllIlllIIl(children.isEmpty() ? 1 : 0)) {
                        int i3 = llllIIlIll[1];
                        while (llIIllIlllIII(i3, children.size())) {
                            if ((!llIIllIlllIIl(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[81]]) ? 1 : 0) || llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[82]]) ? 1 : 0)) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[83]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            if (llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[84]]) ? 1 : 0) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[42]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            if ((!llIIllIlllIIl(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[85]]) ? 1 : 0) || llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[77]]) ? 1 : 0)) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[86]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            if (llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[87]]) ? 1 : 0) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[88]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            if (llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[89]]) ? 1 : 0) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[90]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            if (llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[91]]) ? 1 : 0) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[92]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            if (llIIllIllIlll(((Widget) children.get(llllIIlIll[1])).getText().contains(llllIIIlll[llllIIlIll[93]]) ? 1 : 0) && llIIllIllIlll(((Widget) children.get(i3)).getText().contains(llllIIIlll[llllIIlIll[94]]) ? 1 : 0)) {
                                Mouse.click(((Widget) children.get(i3)).getClickPoint().getX(), ((Widget) children.get(i3)).getClickPoint().getY(), (boolean) llllIIlIll[0]);
                                Time.sleepTicks(llllIIlIll[4]);
                                "".length();
                            }
                            i3++;
                            "".length();
                            if ((((216 ^ 150) ^ "  ".length()) & (((223 ^ 169) ^ (63 ^ 5)) ^ (-" ".length()))) != 0) {
                                return;
                            }
                        }
                    }
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[88])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[95]];
                String[] strArr9 = new String[llllIIlIll[0]];
                strArr9[llllIIlIll[1]] = llllIIIlll[llllIIlIll[96]];
                TileObjects.getNearest(strArr9).interact(llllIIIlll[llllIIlIll[97]]);
                Time.sleepTicks(llllIIlIll[8]);
                "".length();
                C0006g.a(bQ);
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[93])) {
                if (llIIllIlllIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cT), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[98]];
                        Movement.walkTo(cT);
                        "".length();
                        Time.sleepTicks(llllIIlIll[0]);
                        "".length();
                    }
                    if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cT), llllIIlIll[10])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[99]];
                        String[] strArr10 = new String[llllIIlIll[0]];
                        strArr10[llllIIlIll[1]] = llllIIIlll[llllIIlIll[100]];
                        TileObjects.getNearest(strArr10).interact(llllIIIlll[llllIIlIll[101]]);
                        Time.sleepTicks(llllIIlIll[8]);
                        "".length();
                        C0006g.a(bQ);
                    }
                }
                if (llIIllIllIlll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[102]];
                    C0006g.a(llllIIIlll[llllIIlIll[103]], bQ);
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[98])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[104]];
                if (llIIllIlllIIl(Vars.getBit(llllIIlIll[105]))) {
                    if (llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        C0006g.a(llllIIIlll[llllIIlIll[106]], bQ);
                    }
                    C0006g.a(bQ);
                }
                if (llIIllIlllIll(Vars.getBit(llllIIlIll[105]), llllIIlIll[4])) {
                    if (llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] strArr11 = new String[llllIIlIll[0]];
                        strArr11[llllIIlIll[1]] = llllIIIlll[llllIIlIll[107]];
                        NPCs.getNearest(strArr11).interact(llllIIIlll[llllIIlIll[108]]);
                    }
                    C0006g.a(llllIIIlll[llllIIlIll[109]], bQ);
                }
                if (llIIllIlllIll(Vars.getBit(llllIIlIll[105]), llllIIlIll[12])) {
                    if (llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] strArr12 = new String[llllIIlIll[0]];
                        strArr12[llllIIlIll[1]] = llllIIIlll[llllIIlIll[110]];
                        NPCs.getNearest(strArr12).interact(llllIIIlll[llllIIlIll[111]]);
                    }
                    C0006g.a(llllIIIlll[llllIIlIll[112]], bQ);
                }
                if (llIIllIlllIll(Vars.getBit(llllIIlIll[105]), llllIIlIll[21])) {
                    if (llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] strArr13 = new String[llllIIlIll[0]];
                        strArr13[llllIIlIll[1]] = llllIIIlll[llllIIlIll[113]];
                        NPCs.getNearest(strArr13).interact(llllIIIlll[llllIIlIll[114]]);
                    }
                    C0006g.a(llllIIIlll[llllIIlIll[115]], bQ);
                }
                if (llIIllIlllIll(Vars.getBit(llllIIlIll[105]), llllIIlIll[37])) {
                    if (llIIllIlllIIl(Dialog.canContinue() ? 1 : 0)) {
                        String[] strArr14 = new String[llllIIlIll[0]];
                        strArr14[llllIIlIll[1]] = llllIIIlll[llllIIlIll[116]];
                        NPCs.getNearest(strArr14).interact(llllIIIlll[llllIIlIll[117]]);
                    }
                    C0006g.a(llllIIIlll[llllIIlIll[118]], bQ);
                }
                if (llIIllIlllIll(Vars.getBit(llllIIlIll[105]), llllIIlIll[59])) {
                    String str = llllIIIlll[llllIIlIll[119]];
                    String[] strArr15 = new String[llllIIlIll[4]];
                    strArr15[llllIIlIll[1]] = llllIIIlll[llllIIlIll[120]];
                    strArr15[llllIIlIll[0]] = llllIIIlll[llllIIlIll[121]];
                    C0006g.a(str, strArr15);
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[100])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[122]];
                C0006g.a(llllIIIlll[llllIIlIll[123]], bQ);
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[103])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[124]];
                C0006g.a(bQ);
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[114])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[125]];
                if (llIIllIlllIII(Prayers.getPoints(), llllIIlIll[43]) && llIIllIllIlll(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.aR).interact(llllIIIlll[llllIIlIll[126]]);
                    Time.sleepTicks(llllIIlIll[0]);
                    "".length();
                }
                if (llIIllIlllIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                int[] iArr17 = new int[llllIIlIll[0]];
                iArr17[llllIIlIll[1]] = llllIIlIll[38];
                if (llIIllIllIlll(Inventory.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llllIIlIll[0]];
                    iArr18[llllIIlIll[1]] = llllIIlIll[38];
                    if (llIIllIlllIIl(Equipment.contains(iArr18) ? 1 : 0)) {
                        int[] iArr19 = new int[llllIIlIll[0]];
                        iArr19[llllIIlIll[1]] = llllIIlIll[38];
                        Inventory.getFirst(iArr19).interact(llllIIIlll[llllIIlIll[127]]);
                    }
                }
                if (llIIlllIIIIlI(Players.getLocal().getInteracting())) {
                    int[] iArr20 = new int[llllIIlIll[0]];
                    iArr20[llllIIlIll[1]] = llllIIlIll[128];
                    if (llIIllIllllII(NPCs.getNearest(iArr20))) {
                        int[] iArr21 = new int[llllIIlIll[0]];
                        iArr21[llllIIlIll[1]] = llllIIlIll[128];
                        NPCs.getNearest(iArr21).interact(llllIIIlll[llllIIlIll[129]]);
                        Time.sleepTicks(llllIIlIll[4]);
                        "".length();
                    }
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[119])) {
                AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[130]];
                if (llIIllIllIlll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                C0006g.a(llllIIIlll[llllIIlIll[131]], bQ);
            }
            if (!llIIlllIIIIIl(C0004e.j(llllIIlIll[9]), llllIIlIll[124]) || !llIIlllIIIIIl(C0004e.j(llllIIlIll[9]), llllIIlIll[130]) || !llIIlllIIIIIl(C0004e.j(llllIIlIll[9]), llllIIlIll[132]) || llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[133])) {
                if (llIIllIllIlll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[132]];
                    String[] strArr16 = new String[llllIIlIll[0]];
                    strArr16[llllIIlIll[1]] = llllIIIlll[llllIIlIll[134]];
                    TileObjects.getNearest(strArr16).interact(llllIIIlll[llllIIlIll[135]]);
                    Time.sleepTicks(llllIIlIll[8]);
                    "".length();
                    C0006g.a(bQ);
                }
                if (llIIllIlllIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[133]];
                        if (llIIllIllllll(Players.getLocal().getWorldLocation().distanceTo(C0001b.I), llllIIlIll[43])) {
                            if (llIIllIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(cn);
                            "".length();
                            Time.sleepTicks(llllIIlIll[0]);
                            "".length();
                        }
                    }
                    if (llIIlllIIIIII(Players.getLocal().getWorldLocation().distanceTo(cn), llllIIlIll[8])) {
                        AccBuilderTempleTrek.c = llllIIIlll[llllIIlIll[136]];
                        if (llIIllIlllIII(ck, llllIIlIll[0])) {
                            ac.kP += llllIIlIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllIIlIll[0];
                            ac.kP = llllIIlIll[1];
                            cl = llllIIlIll[1];
                        }
                        C0006g.a(llllIIIlll[llllIIlIll[137]], bQ);
                    }
                }
            }
            if (llIIllIlllIll(C0004e.j(llllIIlIll[9]), llllIIlIll[6])) {
                int[] iArr22 = new int[llllIIlIll[0]];
                iArr22[llllIIlIll[1]] = llllIIlIll[36];
                if (llIIllIllIlll(Inventory.contains(iArr22) ? 1 : 0) && llIIllIlllIll(Players.getLocal().getAnimation(), llllIIlIll[44])) {
                    int[] iArr23 = new int[llllIIlIll[0]];
                    iArr23[llllIIlIll[1]] = llllIIlIll[36];
                    Inventory.getFirst(iArr23).interact(llllIIIlll[llllIIlIll[138]]);
                    Time.sleepTicks(llllIIlIll[4]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIIllIlllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ba, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[4]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0243, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[43]) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02cd, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[39]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0356, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[12]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03df, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[12]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0468, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[7]) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04f2, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[21]) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0578, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[27]) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x060c, code lost:
        if (llIIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0016q.llllIIlIll[10]) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11 = new int[llllIIlIll[0]];
        iArr11[llllIIlIll[1]] = llllIIlIll[38];
        if (llIIllIlllIIl(Bank.contains(iArr11) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIll[38], llllIIlIll[0], llllIIlIll[140]));
            "".length();
        }
        int[] iArr12 = new int[llllIIlIll[0]];
        iArr12[llllIIlIll[1]] = llllIIlIll[16];
        if (llIIllIlllIIl(Bank.contains(iArr12) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIll[16], llllIIlIll[0], llllIIlIll[141]));
            "".length();
        }
        int[] iArr13 = new int[llllIIlIll[0]];
        iArr13[llllIIlIll[1]] = llllIIlIll[17];
        if (llIIllIlllIIl(Bank.contains(iArr13) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIll[17], llllIIlIll[0], llllIIlIll[141]));
            "".length();
        }
        int[] iArr14 = new int[llllIIlIll[0]];
        iArr14[llllIIlIll[1]] = llllIIlIll[18];
        if (llIIllIlllIIl(Bank.contains(iArr14) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIll[18], llllIIlIll[0], llllIIlIll[141]));
            "".length();
        }
        int[] iArr15 = new int[llllIIlIll[0]];
        iArr15[llllIIlIll[1]] = llllIIlIll[22];
        if (llIIllIlllIIl(Bank.contains(iArr15) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIll[22], llllIIlIll[0], llllIIlIll[141]));
            "".length();
        }
        int[] iArr16 = new int[llllIIlIll[0]];
        iArr16[llllIIlIll[1]] = llllIIlIll[19];
        if (llIIllIllIlll(Bank.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llllIIlIll[0]];
            iArr17[llllIIlIll[1]] = llllIIlIll[19];
            if (llIIllIllIlll(Bank.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[llllIIlIll[0]];
                iArr18[llllIIlIll[1]] = llllIIlIll[19];
            }
            iArr = new int[llllIIlIll[0]];
            iArr[llllIIlIll[1]] = llllIIlIll[32];
            if (llIIllIllIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr19 = new int[llllIIlIll[0]];
                iArr19[llllIIlIll[1]] = llllIIlIll[32];
                if (llIIllIllIlll(Bank.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[llllIIlIll[0]];
                    iArr20[llllIIlIll[1]] = llllIIlIll[32];
                }
                iArr2 = new int[llllIIlIll[0]];
                iArr2[llllIIlIll[1]] = llllIIlIll[20];
                if (llIIllIllIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr21 = new int[llllIIlIll[0]];
                    iArr21[llllIIlIll[1]] = llllIIlIll[20];
                    if (llIIllIllIlll(Bank.contains(iArr21) ? 1 : 0)) {
                        int[] iArr22 = new int[llllIIlIll[0]];
                        iArr22[llllIIlIll[1]] = llllIIlIll[20];
                    }
                    iArr3 = new int[llllIIlIll[0]];
                    iArr3[llllIIlIll[1]] = llllIIlIll[24];
                    if (llIIllIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr23 = new int[llllIIlIll[0]];
                        iArr23[llllIIlIll[1]] = llllIIlIll[24];
                        if (llIIllIllIlll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llllIIlIll[0]];
                            iArr24[llllIIlIll[1]] = llllIIlIll[24];
                        }
                        iArr4 = new int[llllIIlIll[0]];
                        iArr4[llllIIlIll[1]] = llllIIlIll[26];
                        if (llIIllIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr25 = new int[llllIIlIll[0]];
                            iArr25[llllIIlIll[1]] = llllIIlIll[26];
                            if (llIIllIllIlll(Bank.contains(iArr25) ? 1 : 0)) {
                                int[] iArr26 = new int[llllIIlIll[0]];
                                iArr26[llllIIlIll[1]] = llllIIlIll[26];
                            }
                            iArr5 = new int[llllIIlIll[0]];
                            iArr5[llllIIlIll[1]] = llllIIlIll[28];
                            if (llIIllIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr27 = new int[llllIIlIll[0]];
                                iArr27[llllIIlIll[1]] = llllIIlIll[28];
                                if (llIIllIllIlll(Bank.contains(iArr27) ? 1 : 0)) {
                                    int[] iArr28 = new int[llllIIlIll[0]];
                                    iArr28[llllIIlIll[1]] = llllIIlIll[28];
                                }
                                iArr6 = new int[llllIIlIll[0]];
                                iArr6[llllIIlIll[1]] = llllIIlIll[30];
                                if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr29 = new int[llllIIlIll[0]];
                                    iArr29[llllIIlIll[1]] = llllIIlIll[30];
                                    if (llIIllIllIlll(Bank.contains(iArr29) ? 1 : 0)) {
                                        int[] iArr30 = new int[llllIIlIll[0]];
                                        iArr30[llllIIlIll[1]] = llllIIlIll[30];
                                    }
                                    iArr7 = new int[llllIIlIll[0]];
                                    iArr7[llllIIlIll[1]] = llllIIlIll[36];
                                    if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                        int[] iArr31 = new int[llllIIlIll[0]];
                                        iArr31[llllIIlIll[1]] = llllIIlIll[36];
                                        if (llIIllIllIlll(Bank.contains(iArr31) ? 1 : 0)) {
                                            int[] iArr32 = new int[llllIIlIll[0]];
                                            iArr32[llllIIlIll[1]] = llllIIlIll[36];
                                        }
                                        iArr8 = new int[llllIIlIll[0]];
                                        iArr8[llllIIlIll[1]] = llllIIlIll[34];
                                        if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                            int[] iArr33 = new int[llllIIlIll[0]];
                                            iArr33[llllIIlIll[1]] = llllIIlIll[34];
                                            if (llIIllIllIlll(Bank.contains(iArr33) ? 1 : 0)) {
                                                int[] iArr34 = new int[llllIIlIll[0]];
                                                iArr34[llllIIlIll[1]] = llllIIlIll[34];
                                            }
                                            iArr9 = new int[llllIIlIll[0]];
                                            iArr9[llllIIlIll[1]] = llllIIlIll[15];
                                            if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                                bu.add(new C0003d(llllIIlIll[15], llllIIlIll[0], llllIIlIll[141]));
                                                "".length();
                                            }
                                            if (llIIllIlllIIl(Bank.contains(item -> {
                                                return item.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                                            }) ? 1 : 0)) {
                                                bu.add(new C0003d(llllIIlIll[148], llllIIlIll[10], llllIIlIll[149]));
                                                "".length();
                                            }
                                            iArr10 = new int[llllIIlIll[0]];
                                            iArr10[llllIIlIll[1]] = llllIIlIll[14];
                                            if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                                return;
                                            }
                                            bu.add(new C0003d(llllIIlIll[14], llllIIlIll[73], llllIIlIll[150]));
                                            "".length();
                                            return;
                                        }
                                        bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                                        "".length();
                                        iArr9 = new int[llllIIlIll[0]];
                                        iArr9[llllIIlIll[1]] = llllIIlIll[15];
                                        if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                        }
                                        if (llIIllIlllIIl(Bank.contains(item2 -> {
                                            return item2.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                                        }) ? 1 : 0)) {
                                        }
                                        iArr10 = new int[llllIIlIll[0]];
                                        iArr10[llllIIlIll[1]] = llllIIlIll[14];
                                        if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                        }
                                    }
                                    bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
                                    "".length();
                                    iArr8 = new int[llllIIlIll[0]];
                                    iArr8[llllIIlIll[1]] = llllIIlIll[34];
                                    if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                    }
                                    bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                                    "".length();
                                    iArr9 = new int[llllIIlIll[0]];
                                    iArr9[llllIIlIll[1]] = llllIIlIll[15];
                                    if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                    }
                                    if (llIIllIlllIIl(Bank.contains(item22 -> {
                                        return item22.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                                    }) ? 1 : 0)) {
                                    }
                                    iArr10 = new int[llllIIlIll[0]];
                                    iArr10[llllIIlIll[1]] = llllIIlIll[14];
                                    if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                    }
                                }
                                bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
                                "".length();
                                iArr7 = new int[llllIIlIll[0]];
                                iArr7[llllIIlIll[1]] = llllIIlIll[36];
                                if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                                }
                                bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
                                "".length();
                                iArr8 = new int[llllIIlIll[0]];
                                iArr8[llllIIlIll[1]] = llllIIlIll[34];
                                if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                                }
                                bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                                "".length();
                                iArr9 = new int[llllIIlIll[0]];
                                iArr9[llllIIlIll[1]] = llllIIlIll[15];
                                if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                }
                                if (llIIllIlllIIl(Bank.contains(item222 -> {
                                    return item222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                                }) ? 1 : 0)) {
                                }
                                iArr10 = new int[llllIIlIll[0]];
                                iArr10[llllIIlIll[1]] = llllIIlIll[14];
                                if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                }
                            }
                            bu.add(new C0003d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]));
                            "".length();
                            iArr6 = new int[llllIIlIll[0]];
                            iArr6[llllIIlIll[1]] = llllIIlIll[30];
                            if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
                            }
                            bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
                            "".length();
                            iArr7 = new int[llllIIlIll[0]];
                            iArr7[llllIIlIll[1]] = llllIIlIll[36];
                            if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                            }
                            bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
                            "".length();
                            iArr8 = new int[llllIIlIll[0]];
                            iArr8[llllIIlIll[1]] = llllIIlIll[34];
                            if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                            "".length();
                            iArr9 = new int[llllIIlIll[0]];
                            iArr9[llllIIlIll[1]] = llllIIlIll[15];
                            if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            if (llIIllIlllIIl(Bank.contains(item2222 -> {
                                return item2222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                            }) ? 1 : 0)) {
                            }
                            iArr10 = new int[llllIIlIll[0]];
                            iArr10[llllIIlIll[1]] = llllIIlIll[14];
                            if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                        }
                        bu.add(new C0003d(llllIIlIll[26], llllIIlIll[25], llllIIlIll[41]));
                        "".length();
                        iArr5 = new int[llllIIlIll[0]];
                        iArr5[llllIIlIll[1]] = llllIIlIll[28];
                        if (llIIllIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]));
                        "".length();
                        iArr6 = new int[llllIIlIll[0]];
                        iArr6[llllIIlIll[1]] = llllIIlIll[30];
                        if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
                        "".length();
                        iArr7 = new int[llllIIlIll[0]];
                        iArr7[llllIIlIll[1]] = llllIIlIll[36];
                        if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
                        "".length();
                        iArr8 = new int[llllIIlIll[0]];
                        iArr8[llllIIlIll[1]] = llllIIlIll[34];
                        if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                        "".length();
                        iArr9 = new int[llllIIlIll[0]];
                        iArr9[llllIIlIll[1]] = llllIIlIll[15];
                        if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        if (llIIllIlllIIl(Bank.contains(item22222 -> {
                            return item22222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                        }) ? 1 : 0)) {
                        }
                        iArr10 = new int[llllIIlIll[0]];
                        iArr10[llllIIlIll[1]] = llllIIlIll[14];
                        if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                    }
                    bu.add(new C0003d(llllIIlIll[24], llllIIlIll[12], llllIIlIll[41]));
                    "".length();
                    iArr4 = new int[llllIIlIll[0]];
                    iArr4[llllIIlIll[1]] = llllIIlIll[26];
                    if (llIIllIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIIlIll[26], llllIIlIll[25], llllIIlIll[41]));
                    "".length();
                    iArr5 = new int[llllIIlIll[0]];
                    iArr5[llllIIlIll[1]] = llllIIlIll[28];
                    if (llIIllIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]));
                    "".length();
                    iArr6 = new int[llllIIlIll[0]];
                    iArr6[llllIIlIll[1]] = llllIIlIll[30];
                    if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
                    "".length();
                    iArr7 = new int[llllIIlIll[0]];
                    iArr7[llllIIlIll[1]] = llllIIlIll[36];
                    if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
                    "".length();
                    iArr8 = new int[llllIIlIll[0]];
                    iArr8[llllIIlIll[1]] = llllIIlIll[34];
                    if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                    "".length();
                    iArr9 = new int[llllIIlIll[0]];
                    iArr9[llllIIlIll[1]] = llllIIlIll[15];
                    if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    if (llIIllIlllIIl(Bank.contains(item222222 -> {
                        return item222222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[llllIIlIll[0]];
                    iArr10[llllIIlIll[1]] = llllIIlIll[14];
                    if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bu.add(new C0003d(llllIIlIll[20], llllIIlIll[39], llllIIlIll[114]));
                "".length();
                iArr3 = new int[llllIIlIll[0]];
                iArr3[llllIIlIll[1]] = llllIIlIll[24];
                if (llIIllIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIIlIll[24], llllIIlIll[12], llllIIlIll[41]));
                "".length();
                iArr4 = new int[llllIIlIll[0]];
                iArr4[llllIIlIll[1]] = llllIIlIll[26];
                if (llIIllIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIIlIll[26], llllIIlIll[25], llllIIlIll[41]));
                "".length();
                iArr5 = new int[llllIIlIll[0]];
                iArr5[llllIIlIll[1]] = llllIIlIll[28];
                if (llIIllIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]));
                "".length();
                iArr6 = new int[llllIIlIll[0]];
                iArr6[llllIIlIll[1]] = llllIIlIll[30];
                if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
                "".length();
                iArr7 = new int[llllIIlIll[0]];
                iArr7[llllIIlIll[1]] = llllIIlIll[36];
                if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
                "".length();
                iArr8 = new int[llllIIlIll[0]];
                iArr8[llllIIlIll[1]] = llllIIlIll[34];
                if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
                "".length();
                iArr9 = new int[llllIIlIll[0]];
                iArr9[llllIIlIll[1]] = llllIIlIll[15];
                if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                if (llIIllIlllIIl(Bank.contains(item2222222 -> {
                    return item2222222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[llllIIlIll[0]];
                iArr10[llllIIlIll[1]] = llllIIlIll[14];
                if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bu.add(new C0003d(llllIIlIll[32], llllIIlIll[43], llllIIlIll[142]));
            "".length();
            iArr2 = new int[llllIIlIll[0]];
            iArr2[llllIIlIll[1]] = llllIIlIll[20];
            if (llIIllIllIlll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[20], llllIIlIll[39], llllIIlIll[114]));
            "".length();
            iArr3 = new int[llllIIlIll[0]];
            iArr3[llllIIlIll[1]] = llllIIlIll[24];
            if (llIIllIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[24], llllIIlIll[12], llllIIlIll[41]));
            "".length();
            iArr4 = new int[llllIIlIll[0]];
            iArr4[llllIIlIll[1]] = llllIIlIll[26];
            if (llIIllIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[26], llllIIlIll[25], llllIIlIll[41]));
            "".length();
            iArr5 = new int[llllIIlIll[0]];
            iArr5[llllIIlIll[1]] = llllIIlIll[28];
            if (llIIllIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]));
            "".length();
            iArr6 = new int[llllIIlIll[0]];
            iArr6[llllIIlIll[1]] = llllIIlIll[30];
            if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
            "".length();
            iArr7 = new int[llllIIlIll[0]];
            iArr7[llllIIlIll[1]] = llllIIlIll[36];
            if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
            "".length();
            iArr8 = new int[llllIIlIll[0]];
            iArr8[llllIIlIll[1]] = llllIIlIll[34];
            if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
            "".length();
            iArr9 = new int[llllIIlIll[0]];
            iArr9[llllIIlIll[1]] = llllIIlIll[15];
            if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            if (llIIllIlllIIl(Bank.contains(item22222222 -> {
                return item22222222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[llllIIlIll[0]];
            iArr10[llllIIlIll[1]] = llllIIlIll[14];
            if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bu.add(new C0003d(llllIIlIll[19], llllIIlIll[4], llllIIlIll[141]));
        "".length();
        iArr = new int[llllIIlIll[0]];
        iArr[llllIIlIll[1]] = llllIIlIll[32];
        if (llIIllIllIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[32], llllIIlIll[43], llllIIlIll[142]));
        "".length();
        iArr2 = new int[llllIIlIll[0]];
        iArr2[llllIIlIll[1]] = llllIIlIll[20];
        if (llIIllIllIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[20], llllIIlIll[39], llllIIlIll[114]));
        "".length();
        iArr3 = new int[llllIIlIll[0]];
        iArr3[llllIIlIll[1]] = llllIIlIll[24];
        if (llIIllIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[24], llllIIlIll[12], llllIIlIll[41]));
        "".length();
        iArr4 = new int[llllIIlIll[0]];
        iArr4[llllIIlIll[1]] = llllIIlIll[26];
        if (llIIllIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[26], llllIIlIll[25], llllIIlIll[41]));
        "".length();
        iArr5 = new int[llllIIlIll[0]];
        iArr5[llllIIlIll[1]] = llllIIlIll[28];
        if (llIIllIllIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[28], llllIIlIll[8], llllIIlIll[143]));
        "".length();
        iArr6 = new int[llllIIlIll[0]];
        iArr6[llllIIlIll[1]] = llllIIlIll[30];
        if (llIIllIllIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[30], llllIIlIll[21], C0008i.bp));
        "".length();
        iArr7 = new int[llllIIlIll[0]];
        iArr7[llllIIlIll[1]] = llllIIlIll[36];
        if (llIIllIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[36], llllIIlIll[27], C0004e.c(llllIIlIll[144], llllIIlIll[145])));
        "".length();
        iArr8 = new int[llllIIlIll[0]];
        iArr8[llllIIlIll[1]] = llllIIlIll[34];
        if (llIIllIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIIlIll[34], llllIIlIll[10], C0004e.c(llllIIlIll[146], llllIIlIll[147])));
        "".length();
        iArr9 = new int[llllIIlIll[0]];
        iArr9[llllIIlIll[1]] = llllIIlIll[15];
        if (llIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        if (llIIllIlllIIl(Bank.contains(item222222222 -> {
            return item222222222.getName().toLowerCase().contains(llllIIIlll[llllIIlIll[151]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[llllIIlIll[0]];
        iArr10[llllIIlIll[1]] = llllIIlIll[14];
        if (llIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    private static void llIIllIllIlIl() {
        llllIIlIll = new int[196];
        llllIIlIll[0] = " ".length();
        llllIIlIll[1] = ((((108 + 129) - 138) + 45) ^ (((106 + 91) - 52) + 10)) & (((82 ^ 101) ^ (143 ^ 179)) ^ (-" ".length()));
        llllIIlIll[2] = (((57 + 37) - 50) + 91) ^ (((55 + 82) - (-7)) + 13);
        llllIIlIll[3] = (((179 + 19) - 110) + 149) ^ (((53 + 12) - 49) + 176);
        llllIIlIll[4] = "  ".length();
        llllIIlIll[5] = (-((-27491) & 31715)) & (-10765) & 15295;
        llllIIlIll[6] = 230 ^ 136;
        llllIIlIll[7] = "   ".length();
        llllIIlIll[8] = 101 ^ 97;
        llllIIlIll[9] = (-((-2441) & 24557)) & (-8201) & 30703;
        llllIIlIll[10] = 101 ^ 96;
        llllIIlIll[11] = (-19540) & 24539;
        llllIIlIll[12] = (((10 + 45) - (-21)) + 59) ^ (((51 + 74) - 120) + 124);
        llllIIlIll[13] = (((59 + 131) - 31) + 15) ^ (((26 + 28) - (-120)) + 16);
        llllIIlIll[14] = (-((-5379) & 30107)) & (-33) & 32767;
        llllIIlIll[15] = (-((-561) & 29497)) & (-577) & 30719;
        llllIIlIll[16] = (-((-1042) & 32375)) & (-9) & 32765;
        llllIIlIll[17] = (-((-2217) & 31401)) & (-33) & 30511;
        llllIIlIll[18] = (-6849) & 8187;
        llllIIlIll[19] = (-27369) & 28649;
        llllIIlIll[20] = (-20925) & 22463;
        llllIIlIll[21] = 68 ^ 67;
        llllIIlIll[22] = (-20693) & 23039;
        llllIIlIll[23] = (72 ^ 53) ^ (30 ^ 107);
        llllIIlIll[24] = (-((-1091) & 29814)) & (-13) & 29695;
        llllIIlIll[25] = 156 ^ 149;
        llllIIlIll[26] = (-((-12634) & 30043)) & (-37) & 20415;
        llllIIlIll[27] = 202 ^ 192;
        llllIIlIll[28] = (-((-2561) & 24125)) & (-514) & 24511;
        llllIIlIll[29] = 190 ^ 181;
        llllIIlIll[30] = (-((-8793) & 12025)) & (-517) & 16373;
        llllIIlIll[31] = 30 ^ 18;
        llllIIlIll[32] = (-1105) & 1489;
        llllIIlIll[33] = (((136 + 8) - 30) + 38) ^ (((98 + 118) - 84) + 17);
        llllIIlIll[34] = (-((-1289) & 10011)) & (-4161) & 32511;
        llllIIlIll[35] = 30 ^ 16;
        llllIIlIll[36] = (-8453) & 28071;
        llllIIlIll[37] = (250 ^ 186) ^ (117 ^ 58);
        llllIIlIll[38] = (-26763) & 28095;
        llllIIlIll[39] = (((77 ^ 54) + (((93 + 192) - 94) + 26)) - (((140 + 121) - 47) + 17)) + (45 ^ 89);
        llllIIlIll[40] = (-((-13573) & 29965)) & (-9221) & 26607;
        llllIIlIll[41] = (-((-18433) & 31768)) & (-2049) & 16383;
        llllIIlIll[42] = 80 ^ 98;
        llllIIlIll[43] = (69 ^ 21) ^ (117 ^ 49);
        llllIIlIll[44] = -" ".length();
        llllIIlIll[45] = 7 ^ 22;
        llllIIlIll[46] = 105 ^ 123;
        llllIIlIll[47] = (64 ^ 102) ^ (128 ^ 181);
        llllIIlIll[48] = 148 ^ 129;
        llllIIlIll[49] = (((26 + 21) - 18) + 123) ^ (((115 + 111) - 96) + 12);
        llllIIlIll[50] = (87 ^ 27) ^ (250 ^ 161);
        llllIIlIll[51] = 126 ^ 102;
        llllIIlIll[52] = (-((-18915) & 31715)) & (-16385) & 32731;
        llllIIlIll[53] = (-28980) & 32251;
        llllIIlIll[54] = 153 ^ 128;
        llllIIlIll[55] = 52 ^ 47;
        llllIIlIll[56] = 76 ^ 80;
        llllIIlIll[57] = 103 ^ 122;
        llllIIlIll[58] = 67 ^ 93;
        llllIIlIll[59] = 47 ^ 48;
        llllIIlIll[60] = (-((-11737) & 32217)) & (-594) & 24575;
        llllIIlIll[61] = (-21133) & 24559;
        llllIIlIll[62] = (-28674) & 32101;
        llllIIlIll[63] = (-((-9569) & 30707)) & (-9) & 24575;
        llllIIlIll[64] = (-((-18467) & 27195)) & (-20610) & 32767;
        llllIIlIll[65] = (((96 + 35) - 53) + 148) ^ (((46 + 176) - 80) + 52);
        llllIIlIll[66] = 120 ^ 89;
        llllIIlIll[67] = 2 ^ 32;
        llllIIlIll[68] = (((100 + 126) - 62) + 3) ^ (((78 + 4) - (-36)) + 14);
        llllIIlIll[69] = (101 ^ 57) ^ (1 ^ 121);
        llllIIlIll[70] = 150 ^ 179;
        llllIIlIll[71] = (((142 + 33) - 43) + 48) ^ (((38 + 50) - (-1)) + 57);
        llllIIlIll[72] = (178 ^ 136) ^ (126 ^ 99);
        llllIIlIll[73] = (60 ^ 106) ^ (197 ^ 187);
        llllIIlIll[74] = 82 ^ 123;
        llllIIlIll[75] = 95 ^ 117;
        llllIIlIll[76] = 140 ^ 167;
        llllIIlIll[77] = 126 ^ 74;
        llllIIlIll[78] = 25 ^ 53;
        llllIIlIll[79] = (-((-68) & 29767)) & (-69) & 32767;
        llllIIlIll[80] = (((104 ^ 5) + (((0 + 32) - (-35)) + 72)) - (211 ^ 169)) + (125 ^ 32);
        llllIIlIll[81] = (101 ^ 6) ^ (236 ^ 161);
        llllIIlIll[82] = (222 ^ 138) ^ (249 ^ 130);
        llllIIlIll[83] = (((62 + 7) - (-70)) + 20) ^ (((4 + 92) - (-55)) + 24);
        llllIIlIll[84] = (146 ^ 173) ^ (100 ^ 106);
        llllIIlIll[85] = 243 ^ 192;
        llllIIlIll[86] = (245 ^ 190) ^ (104 ^ 22);
        llllIIlIll[87] = 86 ^ 96;
        llllIIlIll[88] = 163 ^ 148;
        llllIIlIll[89] = (192 ^ 151) ^ (203 ^ 164);
        llllIIlIll[90] = (((47 + 14) - 5) + 71) ^ (100 ^ 34);
        llllIIlIll[91] = 109 ^ 87;
        llllIIlIll[92] = 112 ^ 75;
        llllIIlIll[93] = (140 ^ 164) ^ (176 ^ 164);
        llllIIlIll[94] = (45 ^ 81) ^ (64 ^ 1);
        llllIIlIll[95] = 76 ^ 114;
        llllIIlIll[96] = (103 ^ 5) ^ (88 ^ 5);
        llllIIlIll[97] = (((92 + 26) - 66) + 145) ^ (((131 + 49) - 113) + 66);
        llllIIlIll[98] = 77 ^ 12;
        llllIIlIll[99] = (((73 + 167) - 1) + 8) ^ (((17 + 142) - 11) + 33);
        llllIIlIll[100] = 227 ^ 160;
        llllIIlIll[101] = (36 ^ 62) ^ (76 ^ 18);
        llllIIlIll[102] = 96 ^ 37;
        llllIIlIll[103] = 215 ^ 145;
        llllIIlIll[104] = (((185 + 198) - 277) + 146) ^ (((100 + 72) - 136) + 151);
        llllIIlIll[105] = (-((-110) & 30335)) & (-5) & 32725;
        llllIIlIll[106] = 17 ^ 89;
        llllIIlIll[107] = 48 ^ 121;
        llllIIlIll[108] = (((143 + 143) - 91) + 46) ^ (((20 + 41) - (-70)) + 56);
        llllIIlIll[109] = 230 ^ 173;
        llllIIlIll[110] = (((1 + 181) - (-45)) + 14) ^ (((84 + 180) - 238) + 163);
        llllIIlIll[111] = (35 ^ 89) ^ (184 ^ 143);
        llllIIlIll[112] = (53 ^ 110) ^ (61 ^ 40);
        llllIIlIll[113] = 85 ^ 26;
        llllIIlIll[114] = (215 ^ 183) ^ (24 ^ 40);
        llllIIlIll[115] = (155 ^ 150) ^ (251 ^ 167);
        llllIIlIll[116] = (((70 + 53) - (-30)) + 95) ^ (((154 + 14) - 108) + 110);
        llllIIlIll[117] = 195 ^ 144;
        llllIIlIll[118] = 79 ^ 27;
        llllIIlIll[119] = 198 ^ 147;
        llllIIlIll[120] = 100 ^ 50;
        llllIIlIll[121] = 99 ^ 52;
        llllIIlIll[122] = (((216 + 23) - 55) + 42) ^ (((132 + 65) - 142) + 131);
        llllIIlIll[123] = (175 ^ 179) ^ (59 ^ 126);
        llllIIlIll[124] = (90 ^ 59) ^ (96 ^ 91);
        llllIIlIll[125] = (6 ^ 122) ^ (35 ^ 4);
        llllIIlIll[126] = 76 ^ 16;
        llllIIlIll[127] = 114 ^ 47;
        llllIIlIll[128] = (-1) & 5054;
        llllIIlIll[129] = (((124 + 144) - 167) + 142) ^ (((76 + 103) - 54) + 48);
        llllIIlIll[130] = 93 ^ 2;
        llllIIlIll[131] = (35 ^ 22) ^ (104 ^ 61);
        llllIIlIll[132] = (192 ^ 149) ^ (185 ^ 141);
        llllIIlIll[133] = 28 ^ 120;
        llllIIlIll[134] = 57 ^ 91;
        llllIIlIll[135] = 91 ^ 56;
        llllIIlIll[136] = 249 ^ 156;
        llllIIlIll[137] = (1 ^ 118) ^ (74 ^ 91);
        llllIIlIll[138] = (23 ^ 63) ^ (90 ^ 21);
        llllIIlIll[139] = 226 ^ 138;
        llllIIlIll[140] = (-18086) & 57085;
        llllIIlIll[141] = (-((-17667) & 19718)) & (-17621) & 28671;
        llllIIlIll[142] = (-((-73) & 23529)) & (-8193) & 32748;
        llllIIlIll[143] = (-20506) & 32505;
        llllIIlIll[144] = (-((-3211) & 20462)) & (-9217) & 32767;
        llllIIlIll[145] = (-8579) & 15778;
        llllIIlIll[146] = (-19651) & 28150;
        llllIIlIll[147] = (-((-9227) & 29867)) & (-2052) & 32191;
        llllIIlIll[148] = (-((-24651) & 24955)) & (-16386) & 28669;
        llllIIlIll[149] = (-(62 ^ 124)) & (-1557) & 26621;
        llllIIlIll[150] = (-24595) & 25494;
        llllIIlIll[151] = 205 ^ 164;
        llllIIlIll[152] = 216 ^ 178;
        llllIIlIll[153] = (208 ^ 140) ^ (21 ^ 34);
        llllIIlIll[154] = (-((-17509) & 25701)) & (-21057) & 32751;
        llllIIlIll[155] = (-((-20521) & 29293)) & (-16417) & 28663;
        llllIIlIll[156] = (-29245) & 32766;
        llllIIlIll[157] = (-((-3521) & 32714)) & (-33) & 32509;
        llllIIlIll[158] = (-((-1799) & 26391)) & (-4609) & 32698;
        llllIIlIll[159] = (-((-18853) & 27623)) & (-20490) & 32639;
        llllIIlIll[160] = (-12929) & 16351;
        llllIIlIll[161] = (-29249) & 32756;
        llllIIlIll[162] = (-16385) & 19826;
        llllIIlIll[163] = (-((-3757) & 32493)) & (-22) & 32247;
        llllIIlIll[164] = (-6287) & 16111;
        llllIIlIll[165] = (-25105) & 28603;
        llllIIlIll[166] = (-((-5313) & 22261)) & (-12353) & 32767;
        llllIIlIll[167] = (-17026) & 20393;
        llllIIlIll[168] = (-((-2206) & 22687)) & (-83) & 24063;
        llllIIlIll[169] = (-((-11811) & 32447)) & (-2049) & 32511;
        llllIIlIll[170] = (((180 + 21) - 9) + 3) ^ (((2 + 119) - 45) + 99);
        llllIIlIll[171] = (33 ^ 5) ^ (49 ^ 120);
        llllIIlIll[172] = (24 ^ 72) ^ (117 ^ 74);
        llllIIlIll[173] = 79 ^ 63;
        llllIIlIll[174] = 111 ^ 30;
        llllIIlIll[175] = (19 ^ 34) ^ (196 ^ 135);
        llllIIlIll[176] = (50 ^ 36) ^ (251 ^ 158);
        llllIIlIll[177] = 112 ^ 4;
        llllIIlIll[178] = 33 ^ 84;
        llllIIlIll[179] = 252 ^ 138;
        llllIIlIll[180] = 12 ^ 123;
        llllIIlIll[181] = " ".length() ^ (16 ^ 105);
        llllIIlIll[182] = (98 ^ 72) ^ (68 ^ 23);
        llllIIlIll[183] = (223 ^ 166) ^ "   ".length();
        llllIIlIll[184] = (110 ^ 39) ^ (131 ^ 177);
        llllIIlIll[185] = (((10 + 138) - 6) + 98) ^ (((69 + 113) - 71) + 29);
        llllIIlIll[186] = 53 ^ 72;
        llllIIlIll[187] = (70 ^ 17) ^ (239 ^ 198);
        llllIIlIll[188] = ((115 + 120) - 218) + 110;
        llllIIlIll[189] = ((36 + 56) - 47) + 83;
        llllIIlIll[190] = ((4 + 76) - 30) + 79;
        llllIIlIll[191] = ((126 + 100) - 124) + 28;
        llllIIlIll[192] = (((11 ^ 4) + (152 ^ 145)) - (-(32 ^ 22))) + (158 ^ 171);
        llllIIlIll[193] = ((23 + 129) - 120) + 100;
        llllIIlIll[194] = ((86 + 45) - 20) + 22;
        llllIIlIll[195] = ((31 + 12) - (-81)) + 10;
    }

    private static boolean llIIllIlllllI(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIIlIll[0]];
        iArr[llllIIlIll[1]] = llllIIlIll[15];
        if (llIIllIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllIIlIll[0]];
            iArr2[llllIIlIll[1]] = llllIIlIll[16];
            if (llIIllIllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llllIIlIll[0]];
                iArr3[llllIIlIll[1]] = llllIIlIll[17];
                if (llIIllIllIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llllIIlIll[0]];
                    iArr4[llllIIlIll[1]] = llllIIlIll[18];
                    if (llIIllIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llllIIlIll[0]];
                        iArr5[llllIIlIll[1]] = llllIIlIll[19];
                        if (llIIllIllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llllIIlIll[0]];
                            iArr6[llllIIlIll[1]] = llllIIlIll[20];
                            if (llIIllIllIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[llllIIlIll[0]];
                                iArr7[llllIIlIll[1]] = llllIIlIll[22];
                                if (llIIllIllIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[llllIIlIll[0]];
                                    iArr8[llllIIlIll[1]] = llllIIlIll[24];
                                    if (llIIllIllIlll(Inventory.contains(iArr8) ? 1 : 0)) {
                                        int[] iArr9 = new int[llllIIlIll[0]];
                                        iArr9[llllIIlIll[1]] = llllIIlIll[40];
                                        if (llIIllIllIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                                            String[] strArr = new String[llllIIlIll[0]];
                                            strArr[llllIIlIll[1]] = llllIIIlll[llllIIlIll[139]];
                                            if (llIIllIllIlll(Inventory.contains(strArr) ? 1 : 0)) {
                                                int[] iArr10 = new int[llllIIlIll[0]];
                                                iArr10[llllIIlIll[1]] = llllIIlIll[26];
                                                if (llIIllIllIlll(Inventory.contains(iArr10) ? 1 : 0)) {
                                                    int[] iArr11 = new int[llllIIlIll[0]];
                                                    iArr11[llllIIlIll[1]] = llllIIlIll[36];
                                                    if (llIIllIllIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                                                        int[] iArr12 = new int[llllIIlIll[0]];
                                                        iArr12[llllIIlIll[1]] = llllIIlIll[34];
                                                        if (llIIllIllIlll(Inventory.contains(iArr12) ? 1 : 0)) {
                                                            int[] iArr13 = new int[llllIIlIll[0]];
                                                            iArr13[llllIIlIll[1]] = llllIIlIll[28];
                                                            if (llIIllIllIlll(Inventory.contains(iArr13) ? 1 : 0)) {
                                                                ?? r0 = llllIIlIll[0];
                                                                "".length();
                                                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
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
        return llllIIlIll[1];
    }

    private static boolean llIIllIllllll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlllIIIIIl(int i, int i2) {
        return i != i2;
    }

    private static void llIIllIlIIlII() {
        llllIIIlll = new String[llllIIlIll[195]];
        llllIIIlll[llllIIlIll[1]] = llIIllIIlIIII("Bzcw0vrRTs2ozyWmtjXkqQgdfWKWFkV7E6Ygx/3b1f1PuR365L4WhDc1XcDBzZxD", "hlTdC");
        llllIIIlll[llllIIlIll[0]] = llIIllIIlIIIl("3l4gfzYpbudiOn7WtjkKAQ==", "GNbNc");
        llllIIIlll[llllIIlIll[4]] = llIIllIIlIIII("QvTM3Qs4rhqdQeP5m11MXQ==", "UOflA");
        llllIIIlll[llllIIlIll[7]] = llIIllIIlIIIl("RrhbjQrb8ww=", "Mowyp");
        llllIIIlll[llllIIlIll[8]] = llIIllIIlIIIl("JcfBu4VIHSM8up8CKZVpsA==", "SCQxa");
        llllIIIlll[llllIIlIll[10]] = llIIllIIlIIII("+vQoYhWHJywg1AJXtb7YNA==", "BlHiq");
        llllIIIlll[llllIIlIll[12]] = llIIllIIlIIlI("Pws5NQgeBDBxBhYEPDgKEA==", "wjWQd");
        llllIIIlll[llllIIlIll[21]] = llIIllIIlIIII("xy/AHw9a8Hc+NTXW7yMG2WnxPDEAWDvUPALQAFxU4Z9MbAbM8sfSwpSJF3mMSo5yq3QODb9eYSg=", "kKoGl");
        llllIIIlll[llllIIlIll[23]] = llIIllIIlIIIl("jSqps4dR0jM=", "swqjI");
        llllIIIlll[llllIIlIll[25]] = llIIllIIlIIII("cGhpVcUaSkPDQ9cd62FkSg==", "jsNjL");
        llllIIIlll[llllIIlIll[27]] = llIIllIIlIIIl("BKQxvCAmdsM=", "czSuK");
        llllIIIlll[llllIIlIll[29]] = llIIllIIlIIIl("TCSiSwZO0bg=", "Hgbel");
        llllIIIlll[llllIIlIll[31]] = llIIllIIlIIIl("mj9IiPa2Evk=", "zbZjh");
        llllIIIlll[llllIIlIll[33]] = llIIllIIlIIII("2DkCs7WySSSAKMvUitxXtw==", "kauuB");
        llllIIIlll[llllIIlIll[35]] = llIIllIIlIIII("f7y1A/xjVx0=", "LxLur");
        llllIIIlll[llllIIlIll[37]] = llIIllIIlIIII("RiapCGmN7Ak=", "EBXAY");
        llllIIIlll[llllIIlIll[13]] = llIIllIIlIIIl("k3xB/F1c9gI6sNe6j35o8A==", "AFBGI");
        llllIIIlll[llllIIlIll[45]] = llIIllIIlIIIl("8xY5FGFeJyRJCJuKugGybg==", "Zupla");
        llllIIIlll[llllIIlIll[46]] = llIIllIIlIIIl("/Udw0eBQ+GievLAXK3PAxg==", "Burdt");
        llllIIIlll[llllIIlIll[47]] = llIIllIIlIIIl("y6g2+Ne4TWccGiKeTNN+QA==", "fkYOk");
        llllIIIlll[llllIIlIll[43]] = llIIllIIlIIII("McINgoZMolk=", "LxzKL");
        llllIIIlll[llllIIlIll[48]] = llIIllIIlIIII("rzR6dZSJ/4+u9dwRODejUQ==", "lQBUW");
        llllIIIlll[llllIIlIll[49]] = llIIllIIlIIII("2uAzivFUvSQ=", "IOrVg");
        llllIIIlll[llllIIlIll[50]] = llIIllIIlIIlI("GTUvRjc4dDsJIiM=", "WTYfC");
        llllIIIlll[llllIIlIll[51]] = llIIllIIlIIII("fS2pIMRNijEDerXcZjR9SF/hUFJvlP5T", "pspZS");
        llllIIIlll[llllIIlIll[54]] = llIIllIIlIIIl("ueeB4Ka72YDrRfOTVdylVg==", "jLffJ");
        llllIIIlll[llllIIlIll[2]] = llIIllIIlIIlI("ETAqCQ5yGTkIDT4sMAMbPA==", "RIXli");
        llllIIIlll[llllIIlIll[55]] = llIIllIIlIIIl("KuwZqON7uP4Y5ifR4HR2Kg==", "NfPRa");
        llllIIIlll[llllIIlIll[56]] = llIIllIIlIIIl("C8biB+ZBWdA=", "Qapij");
        llllIIIlll[llllIIlIll[57]] = llIIllIIlIIII("qvgdkJhMlpCoa4wxnsJ7wg==", "wAIxx");
        llllIIIlll[llllIIlIll[58]] = llIIllIIlIIIl("Y7Ga8y8/h0Q=", "NoHyw");
        llllIIIlll[llllIIlIll[59]] = llIIllIIlIIIl("r0mBhicACVQ=", "BsWrp");
        llllIIIlll[llllIIlIll[65]] = llIIllIIlIIlI("JgoHZRoHSxM3BwwMFA==", "hkqEn");
        llllIIIlll[llllIIlIll[66]] = llIIllIIlIIII("q+rPZ0X4tLk=", "IRlIb");
        llllIIIlll[llllIIlIll[67]] = llIIllIIlIIlI("LiUjCCU=", "mIJeG");
        llllIIIlll[llllIIlIll[68]] = llIIllIIlIIIl("MN8nOkLYd7FDqfPQ2QP1QEN2rlvpjstt", "tgmAS");
        llllIIIlll[llllIIlIll[69]] = llIIllIIlIIlI("GDQAGTk4", "JQpxP");
        llllIIIlll[llllIIlIll[70]] = llIIllIIlIIlI("OQYTDTgZCg0LcQkRCgg2Dg==", "kcclQ");
        llllIIIlll[llllIIlIll[71]] = llIIllIIlIIIl("lkOE9o8YSVk=", "iLHLa");
        llllIIIlll[llllIIlIll[72]] = llIIllIIlIIlI("IQAtLQ==", "urHHc");
        llllIIIlll[llllIIlIll[73]] = llIIllIIlIIII("x+g7pbJiXHE=", "pQaKD");
        llllIIIlll[llllIIlIll[74]] = llIIllIIlIIIl("EJqPqhI362RSjotP2WvCVQ==", "zzbzI");
        llllIIIlll[llllIIlIll[75]] = llIIllIIlIIII("AvTmr0SvCeP6rvJ3cO7abw==", "Befsm");
        llllIIIlll[llllIIlIll[76]] = llIIllIIlIIII("Jmz+vZGIO125ENY9GiSf+g==", "xKeWS");
        llllIIIlll[llllIIlIll[78]] = llIIllIIlIIlI("BREqCBEqAXg+ASkA", "FdXxx");
        llllIIIlll[llllIIlIll[3]] = llIIllIIlIIIl("ehhRtBiefbI=", "zVoIN");
        llllIIIlll[llllIIlIll[81]] = llIIllIIlIIlI("NAsVZSIQQw4tLkMMFCkyQwUfKCoPBlosJUMXEiBrLhoIIDoWBkU=", "cczEK");
        llllIIIlll[llllIIlIll[82]] = llIIllIIlIIIl("T6kxJGtSkcc=", "HacZD");
        llllIIIlll[llllIIlIll[83]] = llIIllIIlIIII("ruMP0lEcCmbhFAXExP6Fsw==", "jiZTT");
        llllIIIlll[llllIIlIll[84]] = llIIllIIlIIII("D+6t3lKyAN8=", "POhnI");
        llllIIIlll[llllIIlIll[42]] = llIIllIIlIIIl("e3nyMAlmShpYLxeP0EhD2w==", "JQkiX");
        llllIIIlll[llllIIlIll[85]] = llIIllIIlIIII("Leeq6ceqdal0r4KvX+48lQ==", "nPtkT");
        llllIIIlll[llllIIlIll[77]] = llIIllIIlIIII("XDpGHis2pys=", "WUhfq");
        llllIIIlll[llllIIlIll[86]] = llIIllIIlIIII("9Mw7zq+a6sfJQdLAAlq+LKnqts7pW60Z", "ipmDS");
        llllIIIlll[llllIIlIll[87]] = llIIllIIlIIII("oj94QZDt2v3I8Cd7faQ8XA==", "TjpOg");
        llllIIIlll[llllIIlIll[88]] = llIIllIIlIIlI("BhoBJwMwHE0MByQRFC0QPwY=", "VumJb");
        llllIIIlll[llllIIlIll[89]] = llIIllIIlIIII("h0TuI/1ZL3Qm1G9Xtb/3qA==", "kflyu");
        llllIIIlll[llllIIlIll[90]] = llIIllIIlIIlI("JiIQBQQM", "bPqne");
        llllIIIlll[llllIIlIll[91]] = llIIllIIlIIIl("QjwiISxNKSOZd7a4wfC20Q==", "WTsTk");
        llllIIIlll[llllIIlIll[92]] = llIIllIIlIIIl("AmMDTJOu51Y1RM1P9d7bSw==", "ZgfxP");
        llllIIIlll[llllIIlIll[93]] = llIIllIIlIIII("dluZOg9pVbiUYbqVKlkEuw==", "iAtNJ");
        llllIIIlll[llllIIlIll[94]] = llIIllIIlIIlI("Kio3AiYMYzoIYy86IQM=", "bCSfC");
        llllIIIlll[llllIIlIll[95]] = llIIllIIlIIlI("PQUiFjURBTFTIxcEJAA=", "xkVsG");
        llllIIIlll[llllIIlIll[96]] = llIIllIIlIIlI("ExUsLDcqWicnPTYJ", "DzCHR");
        llllIIIlll[llllIIlIll[97]] = llIIllIIlIIII("FkBxY1GXxCg=", "VTPYh");
        llllIIIlll[llllIIlIll[98]] = llIIllIIlIIlI("JycURyUGZgEGJww=", "iFbgQ");
        llllIIIlll[llllIIlIll[99]] = llIIllIIlIIlI("Ez0EAR4/PRdEDzclFQ==", "VSpdl");
        llllIIIlll[llllIIlIll[100]] = llIIllIIlIIIl("+CVkPZcMJlu4PN9W2e29Pg==", "NxckI");
        llllIIIlll[llllIIlIll[101]] = llIIllIIlIIII("NXN8u0KnqEc=", "pzowN");
        llllIIIlll[llllIIlIll[102]] = llIIllIIlIIII("ez6SO9yH7hk=", "qmsqH");
        llllIIIlll[llllIIlIll[103]] = llIIllIIlIIIl("2vu9tzb7SWozibMYlyG/3g==", "IuEPz");
        llllIIIlll[llllIIlIll[104]] = llIIllIIlIIIl("HfJ6NfBBmDw=", "FWnQR");
        llllIIIlll[llllIIlIll[106]] = llIIllIIlIIIl("hLTvXUNld92Y0wMRc1/06g==", "CxlJQ");
        llllIIIlll[llllIIlIll[107]] = llIIllIIlIIIl("ySIexihxRL0D/VknkNd/fg==", "Dgezn");
        llllIIIlll[llllIIlIll[108]] = llIIllIIlIIIl("lJZ5OHa1jOQ=", "bUhmv");
        llllIIIlll[llllIIlIll[109]] = llIIllIIlIIII("zTqltwIGz9vJAbr2PeWyoA==", "qROET");
        llllIIIlll[llllIIlIll[110]] = llIIllIIlIIII("c2GrCRaKWzF0oB8TM9FCHw==", "LXqkb");
        llllIIIlll[llllIIlIll[111]] = llIIllIIlIIII("SvISkIL/aqk=", "NvSik");
        llllIIIlll[llllIIlIll[112]] = llIIllIIlIIlI("Eg4fCFgRBh0IDQ==", "Aoqax");
        llllIIIlll[llllIIlIll[113]] = llIIllIIlIIlI("NSoZGCcDLFUzIxchDBI0DDY=", "eEuuF");
        llllIIIlll[llllIIlIll[114]] = llIIllIIlIIIl("oPaMq/O1tX4=", "VSknz");
        llllIIIlll[llllIIlIll[115]] = llIIllIIlIIlI("MRs4FAIHHXQ/BhMQLR4RCAc=", "atTyc");
        llllIIIlll[llllIIlIll[116]] = llIIllIIlIIII("VRhryNY295VDyq6MtDi+WA==", "ESbBB");
        llllIIIlll[llllIIlIll[117]] = llIIllIIlIIlI("Fgc7B2E2CQ==", "BfWlL");
        llllIIIlll[llllIIlIll[118]] = llIIllIIlIIlI("OT8RDGUjPQINKA==", "pIpbE");
        llllIIIlll[llllIIlIll[119]] = llIIllIIlIIlI("HRA4LyQtVRwzNz8P", "KuTFE");
        llllIIIlll[llllIIlIll[120]] = llIIllIIlIIII("FUCHVRPTVdY+aUh3587xSjxlttGCEYHRlRFiXZGPS6E=", "iNpCq");
        llllIIIlll[llllIIlIll[121]] = llIIllIIlIIlI("J08CJGcMDU4qJg0DTiQmGg0cZg==", "nhnHG");
        llllIIIlll[llllIIlIll[122]] = llIIllIIlIIII("fS/5k8ouAWY=", "eward");
        llllIIIlll[llllIIlIll[123]] = llIIllIIlIIII("G7vjMLXrE0IFQmmWAbCFzg==", "FYZBu");
        llllIIIlll[llllIIlIll[124]] = llIIllIIlIIII("CDJlOL7cd0LUZJpKE8Zirg==", "rYkQR");
        llllIIIlll[llllIIlIll[125]] = llIIllIIlIIlI("GiEUPVkeJwAmLQ==", "XnGny");
        llllIIIlll[llllIIlIll[126]] = llIIllIIlIIIl("mpg0kOhMeQI=", "avlmB");
        llllIIIlll[llllIIlIll[127]] = llIIllIIlIIlI("Jj83JjM=", "qVRJW");
        llllIIIlll[llllIIlIll[129]] = llIIllIIlIIII("ooVXBuRA0p8=", "xUSlv");
        llllIIIlll[llllIIlIll[130]] = llIIllIIlIIlI("FSM0DCMvJQ==", "ABXgJ");
        llllIIIlll[llllIIlIll[131]] = llIIllIIlIIlI("GjAtOwQqdQknFzgv", "LUARe");
        llllIIIlll[llllIIlIll[132]] = llIIllIIlIIlI("MBk4GCIbBnEPKgME", "uaQlK");
        llllIIIlll[llllIIlIll[134]] = llIIllIIlIIII("aC9niZWmRekz+tvdBA22LQ==", "EBjaG");
        llllIIIlll[llllIIlIll[135]] = llIIllIIlIIIl("xmVbmaHTl0Y=", "SvYJS");
        llllIIIlll[llllIIlIll[133]] = llIIllIIlIIII("uB9bDxnE+8sKMzlvnLo5eg==", "PySQi");
        llllIIIlll[llllIIlIll[136]] = llIIllIIlIIIl("4DYMyDSDr+CmIP4EAo35ig==", "ZlfkM");
        llllIIIlll[llllIIlIll[137]] = llIIllIIlIIII("o597poiH1yki84oBzWFFdA==", "cFapY");
        llllIIIlll[llllIIlIll[138]] = llIIllIIlIIII("nnHJ0Z26PuQ=", "qcMEJ");
        llllIIIlll[llllIIlIll[139]] = llIIllIIlIIIl("gC4HBvHYpIRi2roszipXMQ==", "ceVeg");
        llllIIIlll[llllIIlIll[151]] = llIIllIIlIIlI("JRMlJmM4HGs2JjYWPyljfw==", "WzKAC");
        llllIIIlll[llllIIlIll[152]] = llIIllIIlIIlI("PQQjCFIiAyMeHQY=", "qkBzr");
        llllIIIlll[llllIIlIll[153]] = llIIllIIlIIIl("HdiHZgyPJfXeuhDOVwiazQ==", "bqKmK");
        llllIIIlll[llllIIlIll[170]] = llIIllIIlIIIl("oSl7+e+3dBb/ViHnCAn/7PqbqniM6GASbZVePmOixTNtNrjIT+lq4fnDq1q7CGrI", "irFsy");
        llllIIIlll[llllIIlIll[171]] = llIIllIIlIIIl("sGnMl99+5xPVMPE7TtZi5YOg4k5hdLuK6p3i7rduLBS5Dq0XB+3C7w==", "qcXRS");
        llllIIIlll[llllIIlIll[6]] = llIIllIIlIIlI("LRAaQE09UgUATRAaSQUZVQ==", "tuilm");
        llllIIIlll[llllIIlIll[172]] = llIIllIIlIIII("mxl7pn7ty10=", "UuNGd");
        llllIIIlll[llllIIlIll[173]] = llIIllIIlIIlI("PBU9NkFLOXE9GA4DInoZAxUofQEHUDsvHh9QNTMISwc4LgUEBSV6Gg4RITUDGF4=", "kpQZm");
        llllIIIlll[llllIIlIll[174]] = llIIllIIlIIlI("HDAEPDw8NhI1PCJ1Ej0mOzIfcz0hdRA2PW4hHzYgPHUYJCduJgM2LCJ1ADYoPjoZIHY=", "NUwSI");
        llllIIIlll[llllIIlIll[175]] = llIIllIIlIIlI("Oj9uCScGeSofJlQtbgQtHzVuHS1feToYLRorbhQtEi0mA2gSKytQJx15Nx89AXkmFSkXeA==", "sYNpH");
        llllIIIlll[llllIIlIll[176]] = llIIllIIlIIII("Ng/3pvCTRqF2wdmdwmAIZTHtL+HbGZ9X6csCShLUZo6wsZmDpVl7J4GSycjrDaGK", "mrpuo");
        llllIIIlll[llllIIlIll[177]] = llIIllIIlIIlI("CComPHI4LD89NyFjIDUzISgjeSYgYxMgICok", "OCPYR");
        llllIIIlll[llllIIlIll[178]] = llIIllIIlIIIl("oY4oPNjnfxxBeAhqsRWQRKgEF8Gbv7M5YLI35aCa+oE=", "YPCRB");
        llllIIIlll[llllIIlIll[179]] = llIIllIIlIIIl("Z1akFE9nuISoVtCupANkXJ405RCVslre", "jRTVg");
        llllIIIlll[llllIIlIll[180]] = llIIllIIlIIII("lWbLP6QrxtKMIK5Hhk3jTTitzBS4gXXAnPUZO7YwvZc=", "LjpAs");
        llllIIIlll[llllIIlIll[181]] = llIIllIIlIIII("1xyshfuEEcXVzvrG43PlOyu8K8dyhhEIKl3+TdUe8Z5X0GCAlBo3qAbRwodckkwMv4CVvJStD48=", "ChxcD");
        llllIIIlll[llllIIlIll[182]] = llIIllIIlIIII("/jyDXazVPOibYe2DsJESRA==", "gpwJm");
        llllIIIlll[llllIIlIll[183]] = llIIllIIlIIIl("nPQ/BV8oziu2V82e7jc+Nw==", "MxdmH");
        llllIIIlll[llllIIlIll[184]] = llIIllIIlIIlI("LTIiMxJOGzEyEQIuODkHAA==", "nKPVu");
        llllIIIlll[llllIIlIll[185]] = llIIllIIlIIlI("HRc1GiQ3", "YeTqE");
        llllIIIlll[llllIIlIll[186]] = llIIllIIlIIII("ukwAVikB0O6dA5K4mGi/HQ==", "BxUCK");
        llllIIIlll[llllIIlIll[187]] = llIIllIIlIIIl("uuegBW8smkDHxC6XKmbZuA==", "IqRPM");
        llllIIIlll[llllIIlIll[188]] = llIIllIIlIIlI("ETodPC4nPFEXKjMxCDY9KCY=", "AUqQO");
        llllIIIlll[llllIIlIll[189]] = llIIllIIlIIIl("jFtQ6ehxumn3J/Vr4LAfEkwsLbortVDdOi0prJZJZzw=", "MDlKd");
        llllIIIlll[llllIIlIll[190]] = llIIllIIlIIIl("5069cm+4EF4kElAkNE+YHQ==", "ZIqde");
        llllIIIlll[llllIIlIll[191]] = llIIllIIlIIIl("sigZNqGrucf60KxfCH+iEUqE3Lad5Ae8SxMGivDFv/ifRQT6x1p8JcMPnQUbss+V801ko/2q8d0=", "XDbma");
        llllIIIlll[llllIIlIll[192]] = llIIllIIlIIII("7p7ygTVWoqUy2ceQVhe2jJ5VExQwvcZFMbKDOut3rq0=", "NdbGr");
        llllIIIlll[llllIIlIll[193]] = llIIllIIlIIII("cL+5+VPias5ixxUxN67NjwCmAbcoyoivwcwMXsHZX3k=", "fMQTl");
        llllIIIlll[llllIIlIll[194]] = llIIllIIlIIIl("TsYVRzWBr/0=", "IObPq");
    }

    private static boolean llIIllIllIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIIlIll[1];
    }

    private static boolean llIIlllIIIIII(int i, int i2) {
        return i <= i2;
    }

    private static String llIIllIIlIIIl(String lllllllllllllllllIlIllIIlllllIII, String lllllllllllllllllIlIllIIllllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIIlllllIIl) {
            lllllllllllllllllIlIllIIlllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIllllII(Object obj) {
        return obj != null;
    }

    private static boolean llIIlllIIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIllIlllIll(int i, int i2) {
        return i == i2;
    }

    private static int llIIllIllIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String llIIllIIlIIII(String lllllllllllllllllIlIllIIlllIlIll, String lllllllllllllllllIlIllIIlllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIlllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIlllIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIll[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIll[4], lllllllllllllllllIlIllIIlllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIlllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIIlllIllII) {
            lllllllllllllllllIlIllIIlllIllII.printStackTrace();
            return null;
        }
    }

    static {
        llIIllIllIlIl();
        llIIllIlIIlII();
        cO = llllIIlIll[9];
        bu = new ArrayList();
        cn = new WorldPoint(llllIIlIll[154], llllIIlIll[155], llllIIlIll[1]);
        cP = new WorldPoint(llllIIlIll[156], llllIIlIll[157], llllIIlIll[1]);
        cQ = new WorldPoint(llllIIlIll[158], llllIIlIll[159], llllIIlIll[1]);
        cR = new WorldPoint(llllIIlIll[60], llllIIlIll[160], llllIIlIll[1]);
        cS = new WorldPoint(llllIIlIll[161], llllIIlIll[162], llllIIlIll[1]);
        cT = new WorldPoint(llllIIlIll[163], llllIIlIll[164], llllIIlIll[1]);
        cU = new WorldArea(llllIIlIll[165], llllIIlIll[64], llllIIlIll[48], llllIIlIll[2], llllIIlIll[1]);
        cV = new WorldArea(llllIIlIll[166], llllIIlIll[167], llllIIlIll[94], llllIIlIll[129], llllIIlIll[1]);
        cG = new WorldArea(llllIIlIll[168], llllIIlIll[169], llllIIlIll[48], llllIIlIll[49], llllIIlIll[1]);
        String[] strArr = new String[llllIIlIll[54]];
        strArr[llllIIlIll[1]] = llllIIIlll[llllIIlIll[170]];
        strArr[llllIIlIll[0]] = llllIIIlll[llllIIlIll[171]];
        strArr[llllIIlIll[4]] = llllIIIlll[llllIIlIll[6]];
        strArr[llllIIlIll[7]] = llllIIIlll[llllIIlIll[172]];
        strArr[llllIIlIll[8]] = llllIIIlll[llllIIlIll[173]];
        strArr[llllIIlIll[10]] = llllIIIlll[llllIIlIll[174]];
        strArr[llllIIlIll[12]] = llllIIIlll[llllIIlIll[175]];
        strArr[llllIIlIll[21]] = llllIIIlll[llllIIlIll[176]];
        strArr[llllIIlIll[23]] = llllIIIlll[llllIIlIll[177]];
        strArr[llllIIlIll[25]] = llllIIIlll[llllIIlIll[178]];
        strArr[llllIIlIll[27]] = llllIIIlll[llllIIlIll[179]];
        strArr[llllIIlIll[29]] = llllIIIlll[llllIIlIll[180]];
        strArr[llllIIlIll[31]] = llllIIIlll[llllIIlIll[181]];
        strArr[llllIIlIll[33]] = llllIIIlll[llllIIlIll[182]];
        strArr[llllIIlIll[35]] = llllIIIlll[llllIIlIll[183]];
        strArr[llllIIlIll[37]] = llllIIIlll[llllIIlIll[184]];
        strArr[llllIIlIll[13]] = llllIIIlll[llllIIlIll[185]];
        strArr[llllIIlIll[45]] = llllIIIlll[llllIIlIll[186]];
        strArr[llllIIlIll[46]] = llllIIIlll[llllIIlIll[187]];
        strArr[llllIIlIll[47]] = llllIIIlll[llllIIlIll[188]];
        strArr[llllIIlIll[43]] = llllIIIlll[llllIIlIll[189]];
        strArr[llllIIlIll[48]] = llllIIIlll[llllIIlIll[190]];
        strArr[llllIIlIll[49]] = llllIIIlll[llllIIlIll[191]];
        strArr[llllIIlIll[50]] = llllIIIlll[llllIIlIll[192]];
        strArr[llllIIlIll[51]] = llllIIIlll[llllIIlIll[193]];
        bQ = strArr;
        cm = llllIIIlll[llllIIlIll[194]];
        h = "In search of Myreque " + cm;
    }

    private static boolean llIIllIlllIlI(int i, int i2) {
        return i >= i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            aV();
            "".length();
            if ((-(51 ^ 55)) >= 0) {
                return (3 ^ 29) & ((149 ^ 139) ^ (-1)) & (((214 ^ 192) & ((189 ^ 171) ^ (-1))) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllIIlIll[133];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return h;
    }

    private static boolean llIIllIlllIIl(int i) {
        return i == 0;
    }

    private static boolean llIIllIllllIl(int i) {
        return i > 0;
    }
}

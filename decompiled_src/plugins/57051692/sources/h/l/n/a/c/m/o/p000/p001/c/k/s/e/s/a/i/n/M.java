package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.M  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/M.class */
public class M implements K {
    public static /* synthetic */ int js;
    private static /* synthetic */ int[] lIlIlIllIl;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ String[] lIlIlIlIll;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ int jr;
    static /* synthetic */ WorldArea ju;
    public static /* synthetic */ int jt;
    static /* synthetic */ WorldArea jv;
    static /* synthetic */ WorldArea jw;
    private static /* synthetic */ WorldPoint jx;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void cO() {
        if (lIIlIIIlllIlI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[0]];
            C0001b.a(bp);
            if (lIIlIIIlllIll(bp.size(), lIlIlIllIl[1])) {
                System.out.println(lIlIlIlIll[lIlIlIllIl[1]]);
                bn = lIlIlIllIl[0];
            }
        }
        if (lIIlIIIllllII(bn ? 1 : 0) && lIIlIIIlllIll(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[2])) {
            if (lIIlIIIllllII(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIllllIl(nearest) && lIIlIIIllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[3]];
                    if (lIIlIIIlllIlI(new WorldArea(lIlIlIllIl[4], lIlIlIllIl[5], lIlIlIllIl[6], lIlIlIllIl[7], lIlIlIllIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIlIlIllIl[8], lIlIlIllIl[9], lIlIlIllIl[0]);
                        if (lIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlIllIl[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIlIlIllIl[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIIlIIIllllIl(nearest) && lIIlIIIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[10]];
                    if (lIIlIIIllllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIlIllIl[11]);
                        "".length();
                    }
                    if (lIIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIIIllllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIlIllIl[1]);
                            "".length();
                        }
                        if (lIIlIIIllllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIlIllIl[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIlIlIllIl[12]];
                    iArr[lIlIlIllIl[0]] = lIlIlIllIl[13];
                    iArr[lIlIlIllIl[1]] = lIlIlIllIl[14];
                    iArr[lIlIlIllIl[3]] = lIlIlIllIl[15];
                    iArr[lIlIlIllIl[10]] = lIlIlIllIl[16];
                    iArr[lIlIlIllIl[17]] = lIlIlIllIl[18];
                    iArr[lIlIlIllIl[2]] = lIlIlIllIl[19];
                    iArr[lIlIlIllIl[20]] = lIlIlIllIl[21];
                    iArr[lIlIlIllIl[22]] = lIlIlIllIl[23];
                    iArr[lIlIlIllIl[24]] = lIlIlIllIl[25];
                    iArr[lIlIlIllIl[26]] = lIlIlIllIl[27];
                    if (lIIlIIIllllII(C0004e.b(iArr) ? 1 : 0)) {
                        O();
                        System.out.println(lIlIlIlIll[lIlIlIllIl[17]]);
                        bn = lIlIlIllIl[1];
                        return;
                    }
                    int[] iArr2 = new int[lIlIlIllIl[12]];
                    iArr2[lIlIlIllIl[0]] = lIlIlIllIl[13];
                    iArr2[lIlIlIllIl[1]] = lIlIlIllIl[14];
                    iArr2[lIlIlIllIl[3]] = lIlIlIllIl[15];
                    iArr2[lIlIlIllIl[10]] = lIlIlIllIl[16];
                    iArr2[lIlIlIllIl[17]] = lIlIlIllIl[18];
                    iArr2[lIlIlIllIl[2]] = lIlIlIllIl[19];
                    iArr2[lIlIlIllIl[20]] = lIlIlIllIl[21];
                    iArr2[lIlIlIllIl[22]] = lIlIlIllIl[23];
                    iArr2[lIlIlIllIl[24]] = lIlIlIllIl[25];
                    iArr2[lIlIlIllIl[26]] = lIlIlIllIl[27];
                    if (lIIlIIIlllIlI(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIlIlIllIl[28], lIlIlIllIl[1]);
                        C0000a.a(lIlIlIllIl[29], lIlIlIllIl[1]);
                        C0000a.a(lIlIlIllIl[30], lIlIlIllIl[1]);
                        C0000a.a(lIlIlIllIl[31], lIlIlIllIl[1]);
                        C0000a.a(lIlIlIllIl[32], lIlIlIllIl[1]);
                        C0000a.a(lIlIlIllIl[33], lIlIlIllIl[1]);
                        C0000a.a(lIlIlIllIl[34], lIlIlIllIl[1]);
                        int[] iArr3 = new int[lIlIlIllIl[1]];
                        iArr3[lIlIlIllIl[0]] = lIlIlIllIl[28];
                        if (lIIlIIIllllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlIlIllIl[1]];
                            iArr4[lIlIlIllIl[0]] = lIlIlIllIl[28];
                            if (lIIlIIIllllII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIlIlIllIl[1]];
                                iArr5[lIlIlIllIl[0]] = lIlIlIllIl[28];
                                if (lIIlIIIllllII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIlIlIllIl[35], lIlIlIllIl[1]);
                                }
                            }
                        }
                        C0000a.a(lIlIlIllIl[18], lIlIlIllIl[1]);
                        C0004e.l(lIlIlIllIl[28]);
                        C0004e.l(lIlIlIllIl[29]);
                        C0004e.l(lIlIlIllIl[30]);
                        C0004e.l(lIlIlIllIl[31]);
                        C0004e.l(lIlIlIllIl[32]);
                        Time.sleepTicks(lIlIlIllIl[1]);
                        "".length();
                        C0004e.l(lIlIlIllIl[34]);
                        C0004e.l(lIlIlIllIl[36]);
                        C0004e.l(lIlIlIllIl[33]);
                        C0004e.l(lIlIlIllIl[35]);
                        C0004e.l(lIlIlIllIl[18]);
                        Time.sleepTicks(lIlIlIllIl[10]);
                        "".length();
                        if (lIIlIIIllllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIlIlIllIl[20]);
                            "".length();
                        }
                        if (lIIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (lIIlIIIlllIll(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[37])) {
                                C0000a.a(lIlIlIllIl[13], lIlIlIllIl[12]);
                                C0000a.a(lIlIlIllIl[14], lIlIlIllIl[12]);
                                C0000a.a(lIlIlIllIl[21], lIlIlIllIl[12]);
                                C0000a.a(lIlIlIllIl[15], lIlIlIllIl[12]);
                                C0000a.b(C0005f.be, lIlIlIllIl[1]);
                                C0000a.a(lIlIlIllIl[27], lIlIlIllIl[1]);
                                C0000a.a(lIlIlIllIl[19], lIlIlIllIl[2]);
                                C0000a.a(lIlIlIllIl[23], lIlIlIllIl[38]);
                            }
                            if (lIIlIIlIIIIII(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[37])) {
                                C0000a.a(lIlIlIllIl[13], lIlIlIllIl[12]);
                                C0000a.a(lIlIlIllIl[21], lIlIlIllIl[12]);
                                C0000a.a(lIlIlIllIl[25], lIlIlIllIl[12]);
                                C0000a.b(C0005f.be, lIlIlIllIl[1]);
                                C0000a.a(lIlIlIllIl[27], lIlIlIllIl[1]);
                                C0000a.a(lIlIlIllIl[19], lIlIlIllIl[24]);
                                C0000a.a(lIlIlIllIl[23], lIlIlIllIl[12]);
                            }
                        }
                    }
                }
            }
            if (lIIlIIIlllIlI(al() ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIl[1]];
                strArr[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[2]];
                if (lIIlIIIlllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIlIllIl[1]];
                    strArr2[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[20]];
                    Inventory.getFirst(strArr2).interact(lIlIlIlIll[lIlIlIllIl[22]]);
                }
                if (lIIlIIIlllIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIIIlllIll(Movement.getRunEnergy(), lIlIlIllIl[39])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIlIlIll[lIlIlIllIl[24]]);
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllllI(Combat.getMissingHealth(), lIlIlIllIl[40])) {
                    int[] iArr6 = new int[lIlIlIllIl[1]];
                    iArr6[lIlIlIllIl[0]] = lIlIlIllIl[23];
                    if (lIIlIIIlllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIlIllIl[1]];
                        iArr7[lIlIlIllIl[0]] = lIlIlIllIl[23];
                        Inventory.getFirst(iArr7).interact(lIlIlIlIll[lIlIlIllIl[26]]);
                        Time.sleepTicks(lIlIlIllIl[3]);
                        "".length();
                    }
                }
                if (lIIlIIIlllllI(Movement.getRunEnergy(), lIlIlIllIl[41]) && lIIlIIIllllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIIlIIIlllIll(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[42])) {
                    cP();
                }
                if ((!lIIlIIlIIIIII(C0004e.j(lIlIlIllIl[43]), lIlIlIllIl[44]) || lIIlIIIlllIll(C0004e.j(lIlIlIllIl[45]), lIlIlIllIl[2])) && lIIlIIlIIIIII(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[42]) && lIIlIIIlllIll(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[44])) {
                    cQ();
                }
                if (lIIlIIlIIIIII(C0004e.j(lIlIlIllIl[43]), lIlIlIllIl[44]) && lIIlIIlIIIIII(C0004e.j(lIlIlIllIl[45]), lIlIlIllIl[2])) {
                    if (lIIlIIlIIIIII(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[42]) && lIIlIIIlllIll(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[37])) {
                        cQ();
                    }
                    if (lIIlIIlIIIIII(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[37]) && lIIlIIIlllIll(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[44])) {
                        cR();
                    }
                }
                if (lIIlIIlIIIIII(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[44])) {
                    cS();
                }
            }
        }
    }

    private static void cQ() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[76], lIlIlIllIl[77], lIlIlIllIl[78], lIlIlIllIl[79], lIlIlIllIl[1]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[76], lIlIlIllIl[77], lIlIlIllIl[78], lIlIlIllIl[79], lIlIlIllIl[3]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[76], lIlIlIllIl[77], lIlIlIllIl[78], lIlIlIllIl[79], lIlIlIllIl[10]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[80], lIlIlIllIl[81], lIlIlIllIl[69], lIlIlIllIl[64], lIlIlIllIl[0]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[82], lIlIlIllIl[81], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[83], lIlIlIllIl[84], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[10]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[85], lIlIlIllIl[86], lIlIlIllIl[26], lIlIlIllIl[22], lIlIlIllIl[1]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[85], lIlIlIllIl[87], lIlIlIllIl[12], lIlIlIllIl[24], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[88], lIlIlIllIl[89], lIlIlIllIl[75], lIlIlIllIl[40], lIlIlIllIl[10]);
        WorldArea worldArea10 = new WorldArea(lIlIlIllIl[90], lIlIlIllIl[91], lIlIlIllIl[66], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea11 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[93], lIlIlIllIl[22], lIlIlIllIl[26], lIlIlIllIl[10]);
        WorldArea worldArea12 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[94], lIlIlIllIl[12], lIlIlIllIl[22], lIlIlIllIl[10]);
        if (lIIlIIIllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[95]];
            if (lIIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIlIIIlllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIlIlIllIl[96], lIlIlIllIl[52], lIlIlIllIl[0]));
            "".length();
            Time.sleepTicks(lIlIlIllIl[1]);
            "".length();
        }
        if (lIIlIIlIIIIIl(Players.getLocal().getAnimation(), lIlIlIllIl[62]) && lIIlIIIllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIlIlIllIl[1]];
            strArr[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIIlIIIllllIl(nearest) && lIIlIIIlllIlI(cT() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[98]];
                System.out.println(lIlIlIlIll[lIlIlIllIl[99]]);
                nearest.interact(lIlIlIlIll[lIlIlIllIl[100]]);
                Time.sleepTicks(lIlIlIllIl[10]);
                "".length();
            }
            if (lIIlIIIllllII(cT() ? 1 : 0)) {
                if (lIIlIIIlllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIlIlIllIl[1]];
                    strArr2[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[102]];
                    TileObjects.getNearest(strArr2).interact(lIlIlIlIll[lIlIlIllIl[103]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return "   ".length() < " ".length() ? (true ^ true) & (true ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIlIlIllIl[1]];
                    strArr3[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[105]];
                    TileObjects.getNearest(strArr3).interact(lIlIlIlIll[lIlIlIllIl[106]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIlIlIllIl[1]];
                    strArr4[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[108]];
                    TileObjects.getNearest(strArr4).interact(lIlIlIlIll[lIlIlIllIl[109]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return "   ".length() == "  ".length() ? ((59 ^ 86) ^ (91 ^ 10)) & (((((124 + 33) - 147) + 136) ^ (((13 + 153) - 65) + 73)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIlIlIllIl[1]];
                    strArr5[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[111]];
                    TileObjects.getNearest(strArr5).interact(lIlIlIlIll[lIlIlIllIl[112]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIlIlIllIl[1]];
                    strArr6[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[39]];
                    TileObjects.getNearest(strArr6).interact(lIlIlIlIll[lIlIlIllIl[7]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return "   ".length() < 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIlIlIllIl[1]];
                    iArr[lIlIlIllIl[0]] = lIlIlIllIl[115];
                    TileObjects.getNearest(iArr).interact(lIlIlIlIll[lIlIlIllIl[116]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (77 ^ 73) <= "   ".length() ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIlIlIllIl[1]];
                    iArr2[lIlIlIllIl[0]] = lIlIlIllIl[118];
                    TileObjects.getNearest(iArr2).interact(lIlIlIlIll[lIlIlIllIl[119]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? ((183 ^ 158) ^ (118 ^ 124)) & (((124 ^ 104) ^ (17 ^ 38)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIlIlIllIl[1]];
                    iArr3[lIlIlIllIl[0]] = lIlIlIllIl[121];
                    TileObjects.getNearest(iArr3).interact(lIlIlIlIll[lIlIlIllIl[122]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return " ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
                if (lIIlIIIlllIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIlIlIllIl[1]];
                    strArr7[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[124]];
                    TileObjects.getNearest(strArr7).interact(lIlIlIlIll[lIlIlIllIl[44]]);
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-(178 ^ 183)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            cO();
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return (123 ^ 119) & ((118 ^ 122) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIlIllIl[186];
    }

    private static boolean lIIlIIIllllII(int i) {
        return i == 0;
    }

    private static String lIIlIIIlIllII(String lllllllllllllllllllIlIIllIIllIIl, String lllllllllllllllllllIlIIllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIllIIllIlI) {
            lllllllllllllllllllIlIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlllIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIlllIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIlIlIll(String lllllllllllllllllllIlIIllIlIlllI, String lllllllllllllllllllIlIIllIlIlIII) {
        String lllllllllllllllllllIlIIllIlIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIllIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIlIIllIlIlIII.toCharArray();
        int lllllllllllllllllllIlIIllIlIlIlI = lIlIlIllIl[0];
        char[] charArray2 = lllllllllllllllllllIlIIllIlIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIllIl[0];
        while (lIIlIIIlllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIlIIllIlIlIlI % charArray.length]));
            "".length();
            lllllllllllllllllllIlIIllIlIlIlI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlIIIIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIIlIIIlllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.M.lIlIlIllIl[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIIlIIIlllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.M.lIlIlIllIl[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIlIlIllIl[1]];
        iArr4[lIlIlIllIl[0]] = lIlIlIllIl[16];
        if (lIIlIIIllllII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[16], lIlIlIllIl[1], lIlIlIllIl[195]));
            "".length();
        }
        int[] iArr5 = new int[lIlIlIllIl[1]];
        iArr5[lIlIlIllIl[0]] = lIlIlIllIl[18];
        if (lIIlIIIllllII(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[18], lIlIlIllIl[3], lIlIlIllIl[196]));
            "".length();
        }
        int[] iArr6 = new int[lIlIlIllIl[1]];
        iArr6[lIlIlIllIl[0]] = lIlIlIllIl[27];
        if (lIIlIIIllllII(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[27], lIlIlIllIl[3], lIlIlIllIl[196]));
            "".length();
        }
        int[] iArr7 = new int[lIlIlIllIl[1]];
        iArr7[lIlIlIllIl[0]] = lIlIlIllIl[13];
        if (lIIlIIIllllII(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[13], lIlIlIllIl[12], lIlIlIllIl[197]));
            "".length();
        }
        int[] iArr8 = new int[lIlIlIllIl[1]];
        iArr8[lIlIlIllIl[0]] = lIlIlIllIl[21];
        if (lIIlIIIllllII(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[21], lIlIlIllIl[12], lIlIlIllIl[198]));
            "".length();
        }
        int[] iArr9 = new int[lIlIlIllIl[1]];
        iArr9[lIlIlIllIl[0]] = lIlIlIllIl[15];
        if (lIIlIIIllllII(Bank.contains(iArr9) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[15], lIlIlIllIl[12], lIlIlIllIl[198]));
            "".length();
        }
        int[] iArr10 = new int[lIlIlIllIl[1]];
        iArr10[lIlIlIllIl[0]] = lIlIlIllIl[14];
        if (lIIlIIIllllII(Bank.contains(iArr10) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIllIl[14], lIlIlIllIl[12], lIlIlIllIl[198]));
            "".length();
        }
        int[] iArr11 = new int[lIlIlIllIl[1]];
        iArr11[lIlIlIllIl[0]] = lIlIlIllIl[23];
        if (lIIlIIIlllIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIlIlIllIl[1]];
            iArr12[lIlIlIllIl[0]] = lIlIlIllIl[23];
            if (lIIlIIIlllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIlIlIllIl[1]];
                iArr13[lIlIlIllIl[0]] = lIlIlIllIl[23];
            }
            iArr = new int[lIlIlIllIl[1]];
            iArr[lIlIlIllIl[0]] = lIlIlIllIl[25];
            if (lIIlIIIlllIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIlIlIllIl[1]];
                iArr14[lIlIlIllIl[0]] = lIlIlIllIl[25];
                if (lIIlIIIlllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIlIllIl[1]];
                    iArr15[lIlIlIllIl[0]] = lIlIlIllIl[25];
                }
                iArr2 = new int[lIlIlIllIl[1]];
                iArr2[lIlIlIllIl[0]] = lIlIlIllIl[201];
                if (lIIlIIIllllII(Bank.contains(iArr2) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIlIllIl[201], lIlIlIllIl[1], lIlIlIllIl[202]));
                    "".length();
                }
                iArr3 = new int[lIlIlIllIl[1]];
                iArr3[lIlIlIllIl[0]] = lIlIlIllIl[19];
                if (lIIlIIIllllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIlIllIl[19], lIlIlIllIl[40], C0009j.bZ));
                    "".length();
                    return;
                }
                return;
            }
            bp.add(new C0003d(lIlIlIllIl[25], lIlIlIllIl[12], lIlIlIllIl[200]));
            "".length();
            iArr2 = new int[lIlIlIllIl[1]];
            iArr2[lIlIlIllIl[0]] = lIlIlIllIl[201];
            if (lIIlIIIllllII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIlIlIllIl[1]];
            iArr3[lIlIlIllIl[0]] = lIlIlIllIl[19];
            if (lIIlIIIllllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bp.add(new C0003d(js, lIlIlIllIl[44], lIlIlIllIl[199]));
        "".length();
        iArr = new int[lIlIlIllIl[1]];
        iArr[lIlIlIllIl[0]] = lIlIlIllIl[25];
        if (lIIlIIIlllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlIllIl[25], lIlIlIllIl[12], lIlIlIllIl[200]));
        "".length();
        iArr2 = new int[lIlIlIllIl[1]];
        iArr2[lIlIlIllIl[0]] = lIlIlIllIl[201];
        if (lIIlIIIllllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlIlIllIl[1]];
        iArr3[lIlIlIllIl[0]] = lIlIlIllIl[19];
        if (lIIlIIIllllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static void cP() {
        new WorldArea(lIlIlIllIl[46], lIlIlIllIl[47], lIlIlIllIl[12], lIlIlIllIl[20], lIlIlIllIl[0]);
        WorldArea worldArea = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[48], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[50], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[1]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[51], lIlIlIllIl[52], lIlIlIllIl[53], lIlIlIllIl[54], lIlIlIllIl[3]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[55], lIlIlIllIl[56], lIlIlIllIl[24], lIlIlIllIl[12], lIlIlIllIl[3]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[57], lIlIlIllIl[58], lIlIlIllIl[49], lIlIlIllIl[12], lIlIlIllIl[0]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[59], lIlIlIllIl[60], lIlIlIllIl[12], lIlIlIllIl[20], lIlIlIllIl[0]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[47], lIlIlIllIl[61], lIlIlIllIl[20], lIlIlIllIl[0]);
        if (lIIlIIIllllII(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[12]];
            C0004e.b(jx);
            Time.sleepTicks(lIlIlIllIl[1]);
            "".length();
        }
        if (!(lIIlIIIllllII(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIlIIIlllIlI(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIlIIlIIIIIl(Players.getLocal().getAnimation(), lIlIlIllIl[62]) && lIIlIIIllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIIlIIIlllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[49]];
                String[] strArr = new String[lIlIlIllIl[1]];
                strArr[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[63]];
                TileObjects.getNearest(strArr).interact(lIlIlIlIll[lIlIlIllIl[64]]);
                Time.sleepTicks(lIlIlIllIl[3]);
                "".length();
            }
            if (lIIlIIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[53]];
                String[] strArr2 = new String[lIlIlIllIl[1]];
                strArr2[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[38]];
                TileObjects.getNearest(strArr2).interact(lIlIlIlIll[lIlIlIllIl[65]]);
                Time.sleepTicks(lIlIlIllIl[3]);
                "".length();
            }
            if (lIIlIIIlllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[66]];
                String[] strArr3 = new String[lIlIlIllIl[1]];
                strArr3[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[54]];
                TileObjects.getNearest(strArr3).interact(lIlIlIlIll[lIlIlIllIl[67]]);
                Time.sleepTicks(lIlIlIllIl[3]);
                "".length();
            }
            if (lIIlIIIlllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[40]];
                String[] strArr4 = new String[lIlIlIllIl[1]];
                strArr4[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[68]];
                TileObjects.getNearest(strArr4).interact(lIlIlIlIll[lIlIlIllIl[61]]);
                Time.sleepTicks(lIlIlIllIl[2]);
                "".length();
            }
            if (lIIlIIIlllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[69]];
                String[] strArr5 = new String[lIlIlIllIl[1]];
                strArr5[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[70]];
                TileObjects.getNearest(strArr5).interact(lIlIlIlIll[lIlIlIllIl[41]]);
                Time.sleepTicks(lIlIlIllIl[17]);
                "".length();
            }
            if (lIIlIIIlllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[71]];
                String[] strArr6 = new String[lIlIlIllIl[1]];
                strArr6[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[72]];
                TileObjects.getNearest(strArr6).interact(lIlIlIlIll[lIlIlIllIl[73]]);
                Time.sleepTicks(lIlIlIllIl[10]);
                "".length();
            }
            if (lIIlIIIlllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[74]];
                String[] strArr7 = new String[lIlIlIllIl[1]];
                strArr7[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[42]];
                TileObjects.getNearest(strArr7).interact(lIlIlIlIll[lIlIlIllIl[75]]);
                Time.sleepTicks(lIlIlIllIl[17]);
                "".length();
            }
        }
    }

    private static boolean lIIlIIIlllllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIllllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIlIIIIII(Skills.getLevel(Skill.AGILITY), lIlIlIllIl[2])) {
            ?? r0 = lIlIlIllIl[1];
            "".length();
            return (-"  ".length()) > 0 ? ((((128 + 11) - 5) + 1) ^ (((50 + 67) - 8) + 80)) & (((((29 + 24) - (-94)) + 9) ^ (((22 + 28) - (-37)) + 79)) ^ (-" ".length())) : r0;
        }
        return lIlIlIllIl[0];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIlIlIll[lIlIlIllIl[203]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    private static boolean cT() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[80], lIlIlIllIl[81], lIlIlIllIl[69], lIlIlIllIl[64], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[82], lIlIlIllIl[81], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[83], lIlIlIllIl[84], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[10]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[189], lIlIlIllIl[190], lIlIlIllIl[24], lIlIlIllIl[2], lIlIlIllIl[1]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[85], lIlIlIllIl[87], lIlIlIllIl[12], lIlIlIllIl[24], lIlIlIllIl[10]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[191], lIlIlIllIl[192], lIlIlIllIl[73], lIlIlIllIl[38], lIlIlIllIl[10]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[90], lIlIlIllIl[91], lIlIlIllIl[66], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[93], lIlIlIllIl[22], lIlIlIllIl[26], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[94], lIlIlIllIl[12], lIlIlIllIl[22], lIlIlIllIl[10]);
        WorldArea worldArea10 = new WorldArea(lIlIlIllIl[127], lIlIlIllIl[128], lIlIlIllIl[49], lIlIlIllIl[12], lIlIlIllIl[3]);
        WorldArea worldArea11 = new WorldArea(lIlIlIllIl[129], lIlIlIllIl[127], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[3]);
        WorldArea worldArea12 = new WorldArea(lIlIlIllIl[130], lIlIlIllIl[131], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[3]);
        WorldArea worldArea13 = new WorldArea(lIlIlIllIl[132], lIlIlIllIl[133], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea14 = new WorldArea(lIlIlIllIl[134], lIlIlIllIl[9], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea15 = new WorldArea(lIlIlIllIl[135], lIlIlIllIl[136], lIlIlIllIl[68], lIlIlIllIl[53], lIlIlIllIl[10]);
        WorldArea worldArea16 = new WorldArea(lIlIlIllIl[137], lIlIlIllIl[138], lIlIlIllIl[63], lIlIlIllIl[64], lIlIlIllIl[3]);
        WorldArea worldArea17 = new WorldArea(lIlIlIllIl[164], lIlIlIllIl[133], lIlIlIllIl[64], lIlIlIllIl[12], lIlIlIllIl[10]);
        WorldArea worldArea18 = new WorldArea(lIlIlIllIl[165], lIlIlIllIl[139], lIlIlIllIl[38], lIlIlIllIl[53], lIlIlIllIl[3]);
        WorldArea worldArea19 = new WorldArea(lIlIlIllIl[166], lIlIlIllIl[134], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea20 = new WorldArea(lIlIlIllIl[167], lIlIlIllIl[136], lIlIlIllIl[70], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea21 = new WorldArea(lIlIlIllIl[168], lIlIlIllIl[169], lIlIlIllIl[54], lIlIlIllIl[63], lIlIlIllIl[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIlIlIllIl[68]];
        worldAreaArr[lIlIlIllIl[0]] = worldArea;
        worldAreaArr[lIlIlIllIl[1]] = worldArea2;
        worldAreaArr[lIlIlIllIl[3]] = worldArea3;
        worldAreaArr[lIlIlIllIl[10]] = worldArea4;
        worldAreaArr[lIlIlIllIl[17]] = worldArea5;
        worldAreaArr[lIlIlIllIl[2]] = worldArea6;
        worldAreaArr[lIlIlIllIl[20]] = worldArea7;
        worldAreaArr[lIlIlIllIl[22]] = worldArea8;
        worldAreaArr[lIlIlIllIl[24]] = worldArea9;
        worldAreaArr[lIlIlIllIl[26]] = worldArea10;
        worldAreaArr[lIlIlIllIl[12]] = worldArea11;
        worldAreaArr[lIlIlIllIl[49]] = worldArea12;
        worldAreaArr[lIlIlIllIl[63]] = worldArea13;
        worldAreaArr[lIlIlIllIl[64]] = worldArea14;
        worldAreaArr[lIlIlIllIl[53]] = worldArea15;
        worldAreaArr[lIlIlIllIl[38]] = worldArea16;
        worldAreaArr[lIlIlIllIl[65]] = worldArea17;
        worldAreaArr[lIlIlIllIl[66]] = worldArea18;
        worldAreaArr[lIlIlIllIl[54]] = worldArea19;
        worldAreaArr[lIlIlIllIl[67]] = worldArea20;
        worldAreaArr[lIlIlIllIl[40]] = worldArea21;
        int[] iArr = new int[lIlIlIllIl[1]];
        iArr[lIlIlIllIl[0]] = lIlIlIllIl[193];
        if (lIIlIIIllllIl(TileItems.getNearest(iArr))) {
            System.out.println(lIlIlIlIll[lIlIlIllIl[194]]);
            int lllllllllllllllllllIlIlIIIIIIIll = lIlIlIllIl[0];
            while (lIIlIIIlllIll(lllllllllllllllllllIlIlIIIIIIIll, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[lllllllllllllllllllIlIlIIIIIIIll];
                int[] iArr2 = new int[lIlIlIllIl[1]];
                iArr2[lIlIlIllIl[0]] = lIlIlIllIl[193];
                if (lIIlIIIlllIlI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIIlIIIlllIlI(worldAreaArr[lllllllllllllllllllIlIlIIIIIIIll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIllIl[1];
                }
                lllllllllllllllllllIlIlIIIIIIIll++;
                "".length();
                if ((((14 ^ 35) ^ (17 ^ 39)) & (((((62 + 1) - (-53)) + 23) ^ (((0 + 116) - 13) + 41)) ^ (-" ".length()))) > 0) {
                    return ((209 ^ 159) ^ (1 ^ 106)) & (((170 ^ 196) ^ (255 ^ 180)) ^ (-" ".length()));
                }
            }
        }
        return lIlIlIllIl[0];
    }

    private static void cR() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[1]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[3]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[10]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[127], lIlIlIllIl[128], lIlIlIllIl[49], lIlIlIllIl[12], lIlIlIllIl[3]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[129], lIlIlIllIl[127], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[3]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[130], lIlIlIllIl[131], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[3]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[132], lIlIlIllIl[133], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[134], lIlIlIllIl[9], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea10 = new WorldArea(lIlIlIllIl[135], lIlIlIllIl[136], lIlIlIllIl[68], lIlIlIllIl[53], lIlIlIllIl[10]);
        WorldArea worldArea11 = new WorldArea(lIlIlIllIl[137], lIlIlIllIl[138], lIlIlIllIl[63], lIlIlIllIl[64], lIlIlIllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIlIlIllIl[137], lIlIlIllIl[139], lIlIlIllIl[0]);
        if (lIIlIIIlllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIIIllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIlIllIl[1]);
            "".length();
        }
        if (lIIlIIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlIlIllIl[1]);
                "".length();
            }
            if (lIIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIlIlIllIl[1]];
                strArr[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[142]];
                TileObjects.getNearest(strArr).interact(lIlIlIlIll[lIlIlIllIl[143]]);
                Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return 0 != 0 ? ((47 ^ 100) ^ (246 ^ 162)) & (((5 ^ 62) ^ (44 ^ 8)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIllIl[0];
                }, lIlIlIllIl[104]);
                "".length();
                Time.sleepTicks(lIlIlIllIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIlIlIllIl[1]];
        strArr2[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIlIIIllllIl(nearest) && lIIlIIIlllIlI(cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[145]];
            System.out.println(lIlIlIlIll[lIlIlIllIl[146]]);
            nearest.interact(lIlIlIlIll[lIlIlIllIl[147]]);
            Time.sleepTicks(lIlIlIllIl[10]);
            "".length();
        }
        if (lIIlIIIllllII(cT() ? 1 : 0)) {
            if (lIIlIIIlllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[233]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[234], lIlIlIllIl[131], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return 0 != 0 ? ((142 ^ 180) ^ (76 ^ 57)) & (((203 ^ 179) ^ (24 ^ 47)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[148]];
                    nearest2.interact(lIlIlIlIll[lIlIlIllIl[149]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return ((((108 + 82) - 51) + 55) ^ (((163 + 125) - 112) + 22)) <= (-" ".length()) ? ((48 ^ 10) ^ (149 ^ 171)) & (((((72 + 125) - 192) + 127) ^ (((125 + 28) - 126) + 101)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIlIIIlllIlI(tileObject2.getName().contains(lIlIlIlIll[lIlIlIllIl[232]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[131], lIlIlIllIl[225], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest3)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIlIlIlIll[lIlIlIllIl[151]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIlIIIlllIlI(tileObject3.getName().contains(lIlIlIlIll[lIlIlIllIl[230]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[139], lIlIlIllIl[231], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (((((85 + 54) - 30) + 44) ^ (((63 + 63) - 74) + 92)) & (((((143 + 104) - 109) + 7) ^ (((81 + 112) - 52) + 11)) ^ (-" ".length()))) != 0 ? ((((167 + 152) - 241) + 133) ^ (((115 + 97) - 201) + 120)) & (((167 ^ 136) ^ (((23 + 42) - (-5)) + 57)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest4)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIlIlIlIll[lIlIlIllIl[153]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return " ".length() > ((217 ^ 159) ^ (4 ^ 70)) ? ((82 ^ 34) ^ (121 ^ 65)) & (((73 ^ 12) ^ (163 ^ 174)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIlIIIlllIlI(tileObject4.getName().contains(lIlIlIlIll[lIlIlIllIl[227]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[228], lIlIlIllIl[229], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (((((15 + 29) - (-11)) + 101) ^ (((83 + 1) - 77) + 147)) & (((84 ^ 42) ^ (247 ^ 143)) ^ (-" ".length()))) != (((59 ^ 23) ^ (25 ^ 56)) & (((((86 + 4) - (-51)) + 18) ^ (((7 + 68) - 8) + 79)) ^ (-" ".length()))) ? ((177 ^ 198) ^ (206 ^ 147)) & (((((131 + 57) - 74) + 63) ^ (((10 + 65) - (-8)) + 72)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest5)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIlIlIlIll[lIlIlIllIl[155]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIlIIIlllIlI(tileObject5.getName().contains(lIlIlIlIll[lIlIlIllIl[226]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[9], lIlIlIllIl[130], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest6)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIlIlIlIll[lIlIlIllIl[157]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIIlIIIlllIlI(tileObject6.getName().contains(lIlIlIlIll[lIlIlIllIl[224]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[225], lIlIlIllIl[215], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (-(86 ^ 82)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest7)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIlIlIlIll[lIlIlIllIl[159]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (!lIIlIIIlllIlI(cT() ? 1 : 0) && lIIlIIIlllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIIlIIIlllIlI(tileObject7.getName().contains(lIlIlIlIll[lIlIlIllIl[221]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[222], lIlIlIllIl[223], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest8)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIlIlIlIll[lIlIlIllIl[161]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-" ".length()) == " ".length() ? ((19 ^ 90) ^ (246 ^ 157)) & (((65 ^ 4) ^ (17 ^ 118)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIlIIIllllll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIlIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIIIlllIIl() {
        lIlIlIllIl = new int[239];
        lIlIlIllIl[0] = (131 ^ 155) & ((176 ^ 168) ^ (-1));
        lIlIlIllIl[1] = " ".length();
        lIlIlIllIl[2] = 166 ^ 163;
        lIlIlIllIl[3] = "  ".length();
        lIlIlIllIl[4] = (-57) & 3519;
        lIlIlIllIl[5] = (-12889) & 16349;
        lIlIlIllIl[6] = 26 ^ 36;
        lIlIlIllIl[7] = (((38 + 46) - 62) + 107) ^ (((120 + 154) - 167) + 71);
        lIlIlIllIl[8] = (-((-2999) & 31678)) & (-65) & 32255;
        lIlIlIllIl[9] = (-4098) & 7577;
        lIlIlIllIl[10] = "   ".length();
        lIlIlIllIl[11] = (-((-19593) & 27885)) & (-3091) & 16382;
        lIlIlIllIl[12] = 38 ^ 44;
        lIlIlIllIl[13] = (-((-20751) & 29103)) & (-9) & 16367;
        lIlIlIllIl[14] = (-24616) & 32623;
        lIlIlIllIl[15] = (-((-3403) & 11727)) & (-17) & 16349;
        lIlIlIllIl[16] = (-((-1341) & 13821)) & (-16385) & 32717;
        lIlIlIllIl[17] = (((113 + 79) - 173) + 179) ^ (((120 + 156) - 199) + 117);
        lIlIlIllIl[18] = (-((-30926) & 31183)) & (-51) & 12287;
        lIlIlIllIl[19] = (-16903) & 29527;
        lIlIlIllIl[20] = 98 ^ 100;
        lIlIlIllIl[21] = (-8225) & 16234;
        lIlIlIllIl[22] = 128 ^ 135;
        lIlIlIllIl[23] = (-31823) & 32207;
        lIlIlIllIl[24] = 111 ^ 103;
        lIlIlIllIl[25] = (-13069) & 32687;
        lIlIlIllIl[26] = (((68 + 122) - 115) + 92) ^ (((88 + 54) - 57) + 89);
        lIlIlIllIl[27] = (-((-6829) & 7085)) & (-9253) & 30654;
        lIlIlIllIl[28] = (-((-16274) & 32701)) & (-4097) & 32383;
        lIlIlIllIl[29] = (-4132) & 15987;
        lIlIlIllIl[30] = (-4129) & 15982;
        lIlIlIllIl[31] = (-((-61) & 20926)) & (-1) & 32717;
        lIlIlIllIl[32] = (-20482) & 32339;
        lIlIlIllIl[33] = (-290) & 12139;
        lIlIlIllIl[34] = (-34) & 12001;
        lIlIlIllIl[35] = 42 ^ 114;
        lIlIlIllIl[36] = (-((-265) & 4605)) & (-8193) & 32767;
        lIlIlIllIl[37] = 5 ^ 45;
        lIlIlIllIl[38] = 37 ^ 42;
        lIlIlIllIl[39] = 130 ^ 176;
        lIlIlIllIl[40] = 211 ^ 199;
        lIlIlIllIl[41] = (((148 + 108) - 132) + 30) ^ (((71 + 111) - 88) + 37);
        lIlIlIllIl[42] = 71 ^ 89;
        lIlIlIllIl[43] = (-((-20481) & 24273)) & (-16385) & 20478;
        lIlIlIllIl[44] = (179 ^ 170) ^ (104 ^ 77);
        lIlIlIllIl[45] = (-((-1143) & 26239)) & (-6273) & 31675;
        lIlIlIllIl[46] = (-25619) & 28087;
        lIlIlIllIl[47] = (-16901) & 20335;
        lIlIlIllIl[48] = (-((-1122) & 9465)) & (-521) & 12287;
        lIlIlIllIl[49] = (70 ^ 94) ^ (96 ^ 115);
        lIlIlIllIl[50] = (-25089) & 28509;
        lIlIlIllIl[51] = (-8725) & 11189;
        lIlIlIllIl[52] = (-28681) & 32095;
        lIlIlIllIl[53] = (((129 + 117) - 177) + 79) ^ (((57 + 136) - 45) + 6);
        lIlIlIllIl[54] = 71 ^ 85;
        lIlIlIllIl[55] = (-8257) & 10739;
        lIlIlIllIl[56] = (-4130) & 7545;
        lIlIlIllIl[57] = (-17930) & 20411;
        lIlIlIllIl[58] = (-((-269) & 20911)) & (-5) & 24063;
        lIlIlIllIl[59] = (-((-419) & 21479)) & (-8203) & 31743;
        lIlIlIllIl[60] = (-17053) & 20479;
        lIlIlIllIl[61] = 148 ^ 130;
        lIlIlIllIl[62] = -" ".length();
        lIlIlIllIl[63] = (((156 + 13) - 153) + 158) ^ (((131 + 45) - 75) + 61);
        lIlIlIllIl[64] = 33 ^ 44;
        lIlIlIllIl[65] = 81 ^ 65;
        lIlIlIllIl[66] = (49 ^ 14) ^ (19 ^ 61);
        lIlIlIllIl[67] = 32 ^ 51;
        lIlIlIllIl[68] = (((44 + 57) - (-31)) + 32) ^ (((172 + 83) - 173) + 95);
        lIlIlIllIl[69] = (3 ^ 82) ^ (27 ^ 93);
        lIlIlIllIl[70] = 149 ^ 141;
        lIlIlIllIl[71] = 181 ^ 175;
        lIlIlIllIl[72] = (43 ^ 113) ^ (87 ^ 22);
        lIlIlIllIl[73] = 160 ^ 188;
        lIlIlIllIl[74] = 87 ^ 74;
        lIlIlIllIl[75] = 33 ^ 62;
        lIlIlIllIl[76] = (-((-17429) & 21909)) & (-33) & 7679;
        lIlIlIllIl[77] = (-4842) & 8191;
        lIlIlIllIl[78] = (((171 ^ 173) + (113 ^ 13)) - (145 ^ 192)) + (155 ^ 195);
        lIlIlIllIl[79] = 248 ^ 166;
        lIlIlIllIl[80] = (-((-2497) & 31689)) & (-353) & 32763;
        lIlIlIllIl[81] = (-((-6903) & 31487)) & (-4229) & 32221;
        lIlIlIllIl[82] = (-((-10113) & 30689)) & (-2) & 23789;
        lIlIlIllIl[83] = (-((-8223) & 24991)) & (-513) & 20478;
        lIlIlIllIl[84] = (-21003) & 24414;
        lIlIlIllIl[85] = (-4489) & 7678;
        lIlIlIllIl[86] = (-17059) & 20471;
        lIlIlIllIl[87] = (-((-18117) & 30453)) & (-16515) & 32251;
        lIlIlIllIl[88] = (-((-10249) & 14493)) & (-25345) & 32767;
        lIlIlIllIl[89] = (-8322) & 11703;
        lIlIlIllIl[90] = (-((-7413) & 15869)) & (-7) & 11679;
        lIlIlIllIl[91] = (-((-1377) & 6135)) & (-16393) & 24542;
        lIlIlIllIl[92] = (-((-10917) & 27645)) & (-12293) & 32254;
        lIlIlIllIl[93] = (-((-29697) & 30242)) & (-4245) & 8191;
        lIlIlIllIl[94] = (-12290) & 15699;
        lIlIlIllIl[95] = (37 ^ 125) ^ (244 ^ 140);
        lIlIlIllIl[96] = (-16967) & 20190;
        lIlIlIllIl[97] = (58 ^ 71) ^ (99 ^ 63);
        lIlIlIllIl[98] = (112 ^ 74) ^ (146 ^ 138);
        lIlIlIllIl[99] = 45 ^ 14;
        lIlIlIllIl[100] = (((140 + 32) - 77) + 90) ^ (((25 + 135) - 27) + 24);
        lIlIlIllIl[101] = 229 ^ 192;
        lIlIlIllIl[102] = 80 ^ 118;
        lIlIlIllIl[103] = 85 ^ 114;
        lIlIlIllIl[104] = (-((-4653) & 5679)) & (-4746) & 14271;
        lIlIlIllIl[105] = 115 ^ 90;
        lIlIlIllIl[106] = 150 ^ 188;
        lIlIlIllIl[107] = (((153 + 32) - 53) + 37) ^ (((36 + 84) - 5) + 15);
        lIlIlIllIl[108] = (7 ^ 16) ^ (67 ^ 120);
        lIlIlIllIl[109] = 60 ^ 17;
        lIlIlIllIl[110] = ((6 ^ 86) & ((123 ^ 43) ^ (-1))) ^ (127 ^ 81);
        lIlIlIllIl[111] = 7 ^ 40;
        lIlIlIllIl[112] = (121 ^ 53) ^ (204 ^ 176);
        lIlIlIllIl[113] = 35 ^ 18;
        lIlIlIllIl[114] = (116 ^ 21) ^ (36 ^ 113);
        lIlIlIllIl[115] = (-((-10357) & 27262)) & (-1) & 31739;
        lIlIlIllIl[116] = 47 ^ 26;
        lIlIlIllIl[117] = 19 ^ 37;
        lIlIlIllIl[118] = (-((-15763) & 32667)) & (-1025) & 32763;
        lIlIlIllIl[119] = (70 ^ 84) ^ (92 ^ 121);
        lIlIlIllIl[120] = (((65 + 40) - 71) + 136) ^ (((128 + 9) - 63) + 72);
        lIlIlIllIl[121] = (-1036) & 15871;
        lIlIlIllIl[122] = 74 ^ 115;
        lIlIlIllIl[123] = (((109 + 153) - 217) + 120) ^ (((139 + 16) - 79) + 83);
        lIlIlIllIl[124] = 87 ^ 108;
        lIlIlIllIl[125] = (-16449) & 19919;
        lIlIlIllIl[126] = (-24613) & 28078;
        lIlIlIllIl[127] = (-16450) & 19951;
        lIlIlIllIl[128] = (-((-24865) & 29501)) & (-1) & 8126;
        lIlIlIllIl[129] = (-65) & 3559;
        lIlIlIllIl[130] = (-16417) & 19899;
        lIlIlIllIl[131] = (-4101) & 7597;
        lIlIlIllIl[132] = (-16488) & 19959;
        lIlIlIllIl[133] = (-607) & 4095;
        lIlIlIllIl[134] = (-((-12217) & 16381)) & (-24617) & 32255;
        lIlIlIllIl[135] = (-8803) & 12287;
        lIlIlIllIl[136] = (-((-26771) & 31411)) & (-5) & 8111;
        lIlIlIllIl[137] = (-4673) & 8178;
        lIlIlIllIl[138] = (-20527) & 23999;
        lIlIlIllIl[139] = (-((-28173) & 32334)) & (-24577) & 32223;
        lIlIlIllIl[140] = 66 ^ 127;
        lIlIlIllIl[141] = 116 ^ 75;
        lIlIlIllIl[142] = (52 ^ 72) ^ (92 ^ 96);
        lIlIlIllIl[143] = 35 ^ 98;
        lIlIlIllIl[144] = (52 ^ 47) ^ (114 ^ 43);
        lIlIlIllIl[145] = (248 ^ 158) ^ (224 ^ 197);
        lIlIlIllIl[146] = 88 ^ 28;
        lIlIlIllIl[147] = (((155 + 79) - 44) + 53) ^ (((109 + 138) - 195) + 130);
        lIlIlIllIl[148] = 130 ^ 196;
        lIlIlIllIl[149] = 38 ^ 97;
        lIlIlIllIl[150] = 245 ^ 189;
        lIlIlIllIl[151] = 32 ^ 105;
        lIlIlIllIl[152] = 35 ^ 105;
        lIlIlIllIl[153] = (((34 + 106) - 17) + 20) ^ (((69 + 104) - 115) + 138);
        lIlIlIllIl[154] = 192 ^ 140;
        lIlIlIllIl[155] = 90 ^ 23;
        lIlIlIllIl[156] = 202 ^ 132;
        lIlIlIllIl[157] = 242 ^ 189;
        lIlIlIllIl[158] = (51 ^ 86) ^ (182 ^ 131);
        lIlIlIllIl[159] = (((184 + 180) - 325) + 156) ^ (((137 + 80) - 195) + 124);
        lIlIlIllIl[160] = (((7 + 36) - (-118)) + 67) ^ (((11 + 29) - (-16)) + 126);
        lIlIlIllIl[161] = (11 ^ 92) ^ (155 ^ 159);
        lIlIlIllIl[162] = (-((-729) & 13273)) & (-16513) & 31743;
        lIlIlIllIl[163] = (-((-3329) & 28546)) & (-1) & 28671;
        lIlIlIllIl[164] = (-((-11139) & 28643)) & (-8449) & 28671;
        lIlIlIllIl[165] = (-((-11211) & 31739)) & (-8513) & 31741;
        lIlIlIllIl[166] = (-28965) & 31671;
        lIlIlIllIl[167] = (-((-3717) & 20469)) & (-1031) & 20479;
        lIlIlIllIl[168] = (-((-8239) & 8511)) & (-4199) & 7158;
        lIlIlIllIl[169] = (-((-2755) & 31451)) & (-513) & 32665;
        lIlIlIllIl[170] = (-((-525) & 13149)) & (-16391) & 31743;
        lIlIlIllIl[171] = (-((-30113) & 30644)) & (-8265) & 12283;
        lIlIlIllIl[172] = (75 ^ 87) ^ (54 ^ 126);
        lIlIlIllIl[173] = 94 ^ 11;
        lIlIlIllIl[174] = (31 ^ 124) ^ (56 ^ 13);
        lIlIlIllIl[175] = (126 ^ 95) ^ (3 ^ 117);
        lIlIlIllIl[176] = (106 ^ 120) ^ (124 ^ 55);
        lIlIlIllIl[177] = 220 ^ 134;
        lIlIlIllIl[178] = (((27 + 44) - (-39)) + 44) ^ (((71 + 148) - 139) + 113);
        lIlIlIllIl[179] = 77 ^ 17;
        lIlIlIllIl[180] = (207 ^ 142) ^ (128 ^ 156);
        lIlIlIllIl[181] = (((209 + 60) - 43) + 2) ^ (((45 + 67) - 55) + 130);
        lIlIlIllIl[182] = (22 ^ 70) ^ (84 ^ 100);
        lIlIlIllIl[183] = 74 ^ 43;
        lIlIlIllIl[184] = 229 ^ 135;
        lIlIlIllIl[185] = 69 ^ 38;
        lIlIlIllIl[186] = (((165 + 149) - 302) + 189) ^ (((3 + 36) - (-16)) + 118);
        lIlIlIllIl[187] = (190 ^ 150) ^ (33 ^ 108);
        lIlIlIllIl[188] = (((160 + 130) - 126) + 36) ^ (((157 + 148) - 283) + 152);
        lIlIlIllIl[189] = (-28801) & 31991;
        lIlIlIllIl[190] = (-((-11925) & 28342)) & (-12937) & 32767;
        lIlIlIllIl[191] = (-8833) & 12014;
        lIlIlIllIl[192] = (-645) & 4031;
        lIlIlIllIl[193] = (-387) & 12235;
        lIlIlIllIl[194] = (168 ^ 187) ^ (1 ^ 117);
        lIlIlIllIl[195] = (-((-1034) & 9741)) & (-16513) & 30719;
        lIlIlIllIl[196] = (-3079) & 28078;
        lIlIlIllIl[197] = (-((-8756) & 32319)) & (-8305) & 32767;
        lIlIlIllIl[198] = (-((-9993) & 32522)) & (-1033) & 24511;
        lIlIlIllIl[199] = (-22529) & 24478;
        lIlIlIllIl[200] = (-((-8453) & 32013)) & (-1) & 32510;
        lIlIlIllIl[201] = (-274) & 12251;
        lIlIlIllIl[202] = (-6274) & 32223;
        lIlIlIllIl[203] = (50 ^ 4) ^ (30 ^ 64);
        lIlIlIllIl[204] = (((103 + 109) - 121) + 128) ^ (((173 + 131) - 196) + 70);
        lIlIlIllIl[205] = (98 ^ 32) ^ (179 ^ 155);
        lIlIlIllIl[206] = 28 ^ 119;
        lIlIlIllIl[207] = 215 ^ 187;
        lIlIlIllIl[208] = (((54 + 101) - 124) + 198) ^ (((5 + 41) - (-21)) + 69);
        lIlIlIllIl[209] = (-24913) & 27615;
        lIlIlIllIl[210] = (-8277) & 11741;
        lIlIlIllIl[211] = (209 ^ 147) ^ (167 ^ 139);
        lIlIlIllIl[212] = (-((-3741) & 32479)) & (-33) & 32239;
        lIlIlIllIl[213] = (20 ^ 97) ^ (85 ^ 79);
        lIlIlIllIl[214] = (-((-1093) & 5485)) & (-65) & 7167;
        lIlIlIllIl[215] = (-16482) & 19957;
        lIlIlIllIl[216] = 91 ^ 43;
        lIlIlIllIl[217] = (-21793) & 24502;
        lIlIlIllIl[218] = 40 ^ 89;
        lIlIlIllIl[219] = (-29021) & 31741;
        lIlIlIllIl[220] = (-12801) & 16293;
        lIlIlIllIl[221] = (139 ^ 132) ^ (241 ^ 140);
        lIlIlIllIl[222] = (-((-3330) & 11595)) & (-1) & 11775;
        lIlIlIllIl[223] = (-((-1924) & 10151)) & (-16385) & 28095;
        lIlIlIllIl[224] = (((156 + 159) - 141) + 39) ^ (((114 + 125) - 191) + 118);
        lIlIlIllIl[225] = (-12353) & 15855;
        lIlIlIllIl[226] = (((39 + 45) - (-66)) + 69) ^ (((69 + 116) - 139) + 129);
        lIlIlIllIl[227] = 202 ^ 191;
        lIlIlIllIl[228] = (-16906) & 20383;
        lIlIlIllIl[229] = (-28762) & 32253;
        lIlIlIllIl[230] = (10 ^ 7) ^ (60 ^ 71);
        lIlIlIllIl[231] = (-12865) & 16363;
        lIlIlIllIl[232] = 99 ^ 20;
        lIlIlIllIl[233] = 40 ^ 80;
        lIlIlIllIl[234] = (-((-1969) & 30709)) & (-11) & 32255;
        lIlIlIllIl[235] = (-25100) & 27567;
        lIlIlIllIl[236] = (-4689) & 7162;
        lIlIlIllIl[237] = (-12417) & 15853;
        lIlIlIllIl[238] = (95 ^ 64) ^ (250 ^ 156);
    }

    private static void cS() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[1]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[3]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[10]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[164], lIlIlIllIl[133], lIlIlIllIl[64], lIlIlIllIl[12], lIlIlIllIl[10]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[165], lIlIlIllIl[139], lIlIlIllIl[38], lIlIlIllIl[53], lIlIlIllIl[3]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[166], lIlIlIllIl[134], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[167], lIlIlIllIl[136], lIlIlIllIl[70], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[168], lIlIlIllIl[169], lIlIlIllIl[54], lIlIlIllIl[63], lIlIlIllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIlIlIllIl[170], lIlIlIllIl[171], lIlIlIllIl[0]);
        if (lIIlIIIlllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIIIllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIlIllIl[1]);
            "".length();
        }
        if (lIIlIIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlIlIllIl[1]);
                "".length();
            }
            if (lIIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIlIlIllIl[1]];
                strArr[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[175]];
                TileObjects.getNearest(strArr).interact(lIlIlIlIll[lIlIlIllIl[35]]);
                Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                }, lIlIlIllIl[104]);
                "".length();
                Time.sleepTicks(lIlIlIllIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIlIlIllIl[1]];
        strArr2[lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIlIIIllllIl(nearest) && lIIlIIIlllIlI(cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[177]];
            System.out.println(lIlIlIlIll[lIlIlIllIl[178]]);
            nearest.interact(lIlIlIlIll[lIlIlIllIl[179]]);
            Time.sleepTicks(lIlIlIllIl[10]);
            "".length();
        }
        if (lIIlIIIllllII(cT() ? 1 : 0)) {
            if (lIIlIIIlllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[218]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[219], lIlIlIllIl[220], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[180]];
                    nearest2.interact(lIlIlIlIll[lIlIlIllIl[79]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return ((165 ^ 137) & ((158 ^ 178) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIlIIIlllIlI(tileObject2.getName().contains(lIlIlIlIll[lIlIlIllIl[216]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[217], lIlIlIllIl[128], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (-" ".length()) >= (((((6 + 86) - 0) + 135) ^ (((56 + 33) - 10) + 82)) & (((165 ^ 185) ^ (127 ^ 33)) ^ (-" ".length()))) ? ((52 ^ 38) ^ (191 ^ 140)) & (((47 ^ 101) ^ (41 ^ 66)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest3)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIlIlIlIll[lIlIlIllIl[182]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIlIIIlllIlI(tileObject3.getName().contains(lIlIlIlIll[lIlIlIllIl[213]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[214], lIlIlIllIl[215], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest4)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIlIlIlIll[lIlIlIllIl[184]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-((194 ^ 156) ^ (214 ^ 140))) > 0 ? ((127 ^ 118) ^ (170 ^ 150)) & (((45 ^ 96) ^ (218 ^ 162)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (lIIlIIIlllIlI(cT() ? 1 : 0)) {
                return;
            }
            if (lIIlIIIlllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIlIIIlllIlI(tileObject4.getName().contains(lIlIlIlIll[lIlIlIllIl[211]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[209], lIlIlIllIl[212], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return (-((177 ^ 165) ^ (94 ^ 78))) >= 0 ? ((((46 + 143) - 140) + 124) ^ (((22 + 163) - 13) + 11)) & (((((115 + 52) - 102) + 69) ^ (((125 + 65) - 130) + 96)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest5)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIlIlIlIll[lIlIlIllIl[186]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-" ".length()) == (132 ^ 128) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
            if (!lIIlIIIlllIlI(cT() ? 1 : 0) && lIIlIIIlllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIlIIIlllIlI(tileObject5.getName().contains(lIlIlIlIll[lIlIlIllIl[208]]) ? 1 : 0) && lIIlIIlIIIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[209], lIlIlIllIl[210], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIllIl[0];
                });
                if (lIIlIIIllllIl(nearest6)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIlIlIlIll[lIlIlIllIl[188]]);
                    Time.sleepTicks(C0004e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIlIIIlllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlIlIllIl[1];
                            "".length();
                            return (-" ".length()) > 0 ? ((111 ^ 101) ^ (51 ^ 103)) & (((11 ^ 21) ^ (238 ^ 174)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIllIl[0];
                    }, lIlIlIllIl[104]);
                    "".length();
                    Time.sleepTicks(lIlIlIllIl[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean al() {
        if (lIIlIIlIIIIII(Skills.getBoostedLevel(Skill.AGILITY), lIlIlIllIl[37])) {
            int[] iArr = new int[lIlIlIllIl[1]];
            iArr[lIlIlIllIl[0]] = lIlIlIllIl[13];
            if (lIIlIIIlllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIllIl[1]];
                iArr2[lIlIlIllIl[0]] = lIlIlIllIl[25];
                if (lIIlIIIlllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIlIllIl[1]];
                    iArr3[lIlIlIllIl[0]] = lIlIlIllIl[23];
                    if (lIIlIIIlllIlI(Inventory.contains(iArr3) ? 1 : 0) && ((!lIIlIIIllllII(Inventory.contains(item -> {
                        return item.getName().contains(lIlIlIlIll[lIlIlIllIl[207]]);
                    }) ? 1 : 0) || lIIlIIIlllIlI(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIlIlIlIll[lIlIlIllIl[206]]);
                    }) ? 1 : 0)) && (!lIIlIIIllllII(Inventory.contains(C0005f.be) ? 1 : 0) || lIIlIIIlllIlI(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                        ?? r0 = lIlIlIllIl[1];
                        "".length();
                        return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return lIlIlIllIl[0];
        }
        int[] iArr4 = new int[lIlIlIllIl[1]];
        iArr4[lIlIlIllIl[0]] = lIlIlIllIl[13];
        if (lIIlIIIlllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIlIlIllIl[1]];
            iArr5[lIlIlIllIl[0]] = lIlIlIllIl[15];
            if (lIIlIIIlllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlIlIllIl[1]];
                iArr6[lIlIlIllIl[0]] = lIlIlIllIl[14];
                if (lIIlIIIlllIlI(Inventory.contains(iArr6) ? 1 : 0) && ((!lIIlIIIllllII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIlIlIlIll[lIlIlIllIl[205]]);
                }) ? 1 : 0) || lIIlIIIlllIlI(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIlIlIlIll[lIlIlIllIl[204]]);
                }) ? 1 : 0)) && (!lIIlIIIllllII(Inventory.contains(C0005f.be) ? 1 : 0) || lIIlIIIlllIlI(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                    ?? r02 = lIlIlIllIl[1];
                    "".length();
                    return (-"  ".length()) > 0 ? ((179 ^ 132) ^ (29 ^ 39)) & (((211 ^ 144) ^ (24 ^ 86)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIlIlIllIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlIllIl[0];
    }

    private static void lIIlIIIlllIII() {
        lIlIlIlIll = new String[lIlIlIllIl[238]];
        lIlIlIlIll[lIlIlIllIl[0]] = lIIlIIIlIlIlI("reUL3/OAhNj+akb/Qkskkw==", "BhQfi");
        lIlIlIlIll[lIlIlIllIl[1]] = lIIlIIIlIlIll("Lzo9LiABNjdnMRwqOik0STonIj4af3M0JAAnMC86BzRzJTIKOHMzPEkyNC4/ACcq", "iSSGS");
        lIlIlIlIll[lIlIlIllIl[3]] = lIIlIIIlIlIll("LAIDECUDFxwXJUIXGlkgAw0e", "bcuyB");
        lIlIlIlIll[lIlIlIllIl[10]] = lIIlIIIlIlIlI("pk2ARel9jXkWus2C2ErqQIDNsfgJl+Ev", "Wigld");
        lIlIlIlIll[lIlIlIllIl[17]] = lIIlIIIlIllII("psdvAVa+omS0TswSPWcsAbBWiVG2zCV3+x3pro+AZih6SLNzVEaxcvIBO2Ele47B3XTbakk49Yk=", "yKZef");
        lIlIlIlIll[lIlIlIllIl[2]] = lIIlIIIlIlIll("DC0sHA==", "ZDMpN");
        lIlIlIlIll[lIlIlIllIl[20]] = lIIlIIIlIlIlI("m2apeidrNrs=", "tSKQw");
        lIlIlIlIll[lIlIlIllIl[22]] = lIIlIIIlIllII("zEscdiROA5Q=", "yaGiO");
        lIlIlIlIll[lIlIlIllIl[24]] = lIIlIIIlIlIlI("dgDSWvEW4h8=", "vwftA");
        lIlIlIlIll[lIlIlIllIl[26]] = lIIlIIIlIlIll("Fycd", "RFitF");
        lIlIlIlIll[lIlIlIllIl[12]] = lIIlIIIlIlIll("NBAxTyEVUSABOhcUZww6DwM0Cg==", "zqGoU");
        lIlIlIlIll[lIlIlIllIl[49]] = lIIlIIIlIlIlI("CnBwZllx3ntNf6/LSuIQwg==", "MCAhW");
        lIlIlIlIll[lIlIlIllIl[63]] = lIIlIIIlIlIll("JyMpTTsKIC8DOg4=", "kLNmY");
        lIlIlIlIll[lIlIlIllIl[64]] = lIIlIIIlIllII("F/L7nf5p4p1q1CEy2S99Qg==", "pGToo");
        lIlIlIlIll[lIlIlIllIl[53]] = lIIlIIIlIllII("jRSSpD0tq7Gj55GN7mDsgw==", "oaBee");
        lIlIlIlIll[lIlIlIllIl[38]] = lIIlIIIlIlIlI("NXTgj1V3LRQd05e17zFn9w==", "ZhNFL");
        lIlIlIlIll[lIlIlIllIl[65]] = lIIlIIIlIlIll("GiMBAwN0IB4LEw==", "YOhna");
        lIlIlIlIll[lIlIlIllIl[66]] = lIIlIIIlIlIlI("8MyrDXMNpngPV/vznP25sg==", "lPrYU");
        lIlIlIlIll[lIlIlIllIl[54]] = lIIlIIIlIlIlI("XauZqX4Z9Wgq0p2Ai0nSkg==", "BZLma");
        lIlIlIlIll[lIlIlIllIl[67]] = lIIlIIIlIlIlI("8rki354qygg=", "xDXOl");
        lIlIlIlIll[lIlIlIllIl[40]] = lIIlIIIlIlIlI("NZKQWwY91tBw2XQ5HWpjpA==", "XjlSE");
        lIlIlIlIll[lIlIlIllIl[68]] = lIIlIIIlIlIlI("KUwRKsH8i3odUICsPPiw4A==", "tEsUZ");
        lIlIlIlIll[lIlIlIllIl[61]] = lIIlIIIlIlIlI("6rP6VCppQas=", "IVUWg");
        lIlIlIlIll[lIlIlIllIl[69]] = lIIlIIIlIlIll("NTYiGywfNCxWKhktJQ==", "vZKvN");
        lIlIlIlIll[lIlIlIllIl[70]] = lIIlIIIlIlIll("FzYIAlIhNgwJESs=", "CDmgr");
        lIlIlIlIll[lIlIlIllIl[41]] = lIIlIIIlIlIll("KwghDyVFACcVKQ==", "hdHbG");
        lIlIlIlIll[lIlIlIllIl[71]] = lIIlIIIlIlIlI("6WKM7zOUf8uLTNCLR/SgVw==", "oETNt");
        lIlIlIlIll[lIlIlIllIl[72]] = lIIlIIIlIlIll("DDU4PgIgOy5qDSYj", "CWKJc");
        lIlIlIlIll[lIlIlIllIl[73]] = lIIlIIIlIllII("WG9w3qwqb5DHPGr2Si6Qrg==", "JvrAA");
        lIlIlIlIll[lIlIlIllIl[74]] = lIIlIIIlIlIlI("ln2n9r4xUKYUzq+oRv32hA==", "JWqUi");
        lIlIlIlIll[lIlIlIllIl[42]] = lIIlIIIlIlIll("OBEYDiwUHw5aPR4DDg==", "wskzM");
        lIlIlIlIll[lIlIlIllIl[75]] = lIIlIIIlIlIll("NBM2ERIdB24AHxUNNhMf", "gbCtw");
        lIlIlIlIll[lIlIlIllIl[95]] = lIIlIIIlIlIlI("818aSU1kyXaOgFZMEg0XWQ==", "UivVY");
        lIlIlIlIll[lIlIlIllIl[97]] = lIIlIIIlIlIll("PzEfOEkdNk00GxMzCA==", "rPmSi");
        lIlIlIlIll[lIlIlIllIl[98]] = lIIlIIIlIlIlI("HNBTXwaYkOlaD2BTuNkXWg==", "Joklm");
        lIlIlIlIll[lIlIlIllIl[99]] = lIIlIIIlIlIll("LR05Pz5LHy0jMUsdInE9GR05Pz4=", "krLQZ");
        lIlIlIlIll[lIlIlIllIl[100]] = lIIlIIIlIllII("rOxONlRX94k=", "xvVhK");
        lIlIlIlIll[lIlIlIllIl[101]] = lIIlIIIlIllII("6nHF9V0W4bVfCiqMwVMAUw==", "bnHbe");
        lIlIlIlIll[lIlIlIllIl[102]] = lIIlIIIlIlIll("HT4nFRhvJjMeHA==", "OQRrp");
        lIlIlIlIll[lIlIlIllIl[103]] = lIIlIIIlIlIll("JTQBDhI=", "fXhcp");
        lIlIlIlIll[lIlIlIllIl[37]] = lIIlIIIlIlIll("MQQAHzwbGAhMLB4ZGwQqAVYDBSEX", "rvolO");
        lIlIlIlIll[lIlIlIllIl[105]] = lIIlIIIlIllII("+iu8xD9/OA8z+ZdBMuX9FA==", "PMZIE");
        lIlIlIlIll[lIlIlIllIl[106]] = lIIlIIIlIlIlI("8q0gt+pr4do=", "jIqGK");
        lIlIlIlIll[lIlIlIllIl[107]] = lIIlIIIlIlIlI("77Wn+sZc8po=", "IYIDw");
        lIlIlIlIll[lIlIlIllIl[108]] = lIIlIIIlIlIlI("cumWNkD2RVY=", "PcKXX");
        lIlIlIlIll[lIlIlIllIl[109]] = lIIlIIIlIllII("iKQzyVgotuY=", "JBOve");
        lIlIlIlIll[lIlIlIllIl[110]] = lIIlIIIlIllII("YOOlu/xjaE+HDagvKJVubg==", "HduzW");
        lIlIlIlIll[lIlIlIllIl[111]] = lIIlIIIlIllII("GVxRCuHehco=", "FGrBf");
        lIlIlIlIll[lIlIlIllIl[112]] = lIIlIIIlIlIlI("CaEJYikcQjo=", "oJFZy");
        lIlIlIlIll[lIlIlIllIl[113]] = lIIlIIIlIlIll("LBIqHA4IAGcLBhY=", "fgGlg");
        lIlIlIlIll[lIlIlIllIl[39]] = lIIlIIIlIllII("ZtaJtOr2dus=", "MUcpe");
        lIlIlIlIll[lIlIlIllIl[7]] = lIIlIIIlIllII("KsgOegzkwM0=", "Aaxjr");
        lIlIlIlIll[lIlIlIllIl[114]] = lIIlIIIlIlIll("By0ZCDEjP1QfOT14Rg==", "MXtxX");
        lIlIlIlIll[lIlIlIllIl[116]] = lIIlIIIlIllII("hXat1+AYG/8=", "dfUkq");
        lIlIlIlIll[lIlIlIllIl[117]] = lIIlIIIlIlIll("GTMLOSA9IUYuKCNmVQ==", "SFfII");
        lIlIlIlIll[lIlIlIllIl[119]] = lIIlIIIlIllII("Z4vCcD+voLs=", "iSdWQ");
        lIlIlIlIll[lIlIlIllIl[120]] = lIIlIIIlIlIll("MRI/NTwcRz8+Px8=", "ygMQP");
        lIlIlIlIll[lIlIlIllIl[122]] = lIIlIIIlIllII("JLM7b1I1JUI=", "htptv");
        lIlIlIlIll[lIlIlIllIl[123]] = lIIlIIIlIlIlI("2hCT1j3g+sd6vILk/LrUHSmsuxUkRThV", "Hihsc");
        lIlIlIlIll[lIlIlIllIl[124]] = lIIlIIIlIlIll("NA0THw==", "qitzg");
        lIlIlIlIll[lIlIlIllIl[44]] = lIIlIIIlIllII("i+nabTeTXBXEy+SNC/egEA==", "GzUbx");
        lIlIlIlIll[lIlIlIllIl[140]] = lIIlIIIlIlIll("JzIueTcGczs4LQg1MSpjCjwtKzAM", "iSXYC");
        lIlIlIlIll[lIlIlIllIl[6]] = lIIlIIIlIlIll("OCoFRAwZawAQGQQ/", "vKsdx");
        lIlIlIlIll[lIlIlIllIl[141]] = lIIlIIIlIlIll("GSIHOjwjOAFoKyUjFDst", "JVfHH");
        lIlIlIlIll[lIlIlIllIl[142]] = lIIlIIIlIlIll("HjQmH1k+Jy8W", "JUJsy");
        lIlIlIlIll[lIlIlIllIl[143]] = lIIlIIIlIllII("fXooTyCUP6g=", "vzxLf");
        lIlIlIlIll[lIlIlIllIl[144]] = lIIlIIIlIlIlI("kmDe98+cYwy6DzDUBj3rIw==", "pQVNB");
        lIlIlIlIll[lIlIlIllIl[145]] = lIIlIIIlIlIll("PTEaDR4OcBwFAgI=", "iPqdp");
        lIlIlIlIll[lIlIlIllIl[146]] = lIIlIIIlIlIll("JxohNBNBGDUoHEEaOnoQExohNBM=", "auTZw");
        lIlIlIlIll[lIlIlIllIl[147]] = lIIlIIIlIlIll("FiIvHA==", "BCDyB");
        lIlIlIlIll[lIlIlIllIl[148]] = lIIlIIIlIlIll("KSMCPSsNMU8qIxN2Xg==", "cVoMB");
        lIlIlIlIll[lIlIlIllIl[149]] = lIIlIIIlIlIlI("5SXuzH33FVw=", "ueUJl");
        lIlIlIlIll[lIlIlIllIl[150]] = lIIlIIIlIlIlI("tyyrhiBsa9Qjd9/mt40NTQ==", "TuYSE");
        lIlIlIlIll[lIlIlIllIl[151]] = lIIlIIIlIllII("TnbiMOk/a8Y=", "IoLmZ");
        lIlIlIlIll[lIlIlIllIl[152]] = lIIlIIIlIlIlI("qXyh34lJFEVC4Yu3/YYiZw==", "ZGVxC");
        lIlIlIlIll[lIlIlIllIl[153]] = lIIlIIIlIlIlI("DnlmnRXGIHM=", "rDjVd");
        lIlIlIlIll[lIlIlIllIl[154]] = lIIlIIIlIlIll("GwUAOgE/F00tCSFQWQ==", "QpmJh");
        lIlIlIlIll[lIlIlIllIl[155]] = lIIlIIIlIllII("mp094nzyh8M=", "ygCoW");
        lIlIlIlIll[lIlIlIllIl[156]] = lIIlIIIlIlIll("MgQ6CD8NCyg=", "deOdK");
        lIlIlIlIll[lIlIlIllIl[157]] = lIIlIIIlIlIll("MAYMATw=", "fgymH");
        lIlIlIlIll[lIlIlIllIl[158]] = lIIlIIIlIllII("Wlp37sHvvN/hUVNoLiFpuw==", "IAkME");
        lIlIlIlIll[lIlIlIllIl[159]] = lIIlIIIlIllII("oAgVXKTWS3E=", "Zlaiq");
        lIlIlIlIll[lIlIlIllIl[160]] = lIIlIIIlIlIlI("rLog7r9S72oTSedVJE0vqw==", "WHLHt");
        lIlIlIlIll[lIlIlIllIl[161]] = lIIlIIIlIlIlI("872zTGk/EHc=", "hOVLZ");
        lIlIlIlIll[lIlIlIllIl[172]] = lIIlIIIlIlIlI("uymdCCRpjVO0p7Si5KcQA+QvZi9BI+EN", "rCibM");
        lIlIlIlIll[lIlIlIllIl[173]] = lIIlIIIlIlIll("KhkgZyILWCUzNxYM", "dxVGV");
        lIlIlIlIll[lIlIlIllIl[174]] = lIIlIIIlIlIlI("uvI2AXeBt1FvyChJzuDQ4w==", "dPBip");
        lIlIlIlIll[lIlIlIllIl[175]] = lIIlIIIlIlIlI("DvZzzE8BOSY=", "VFnGT");
        lIlIlIlIll[lIlIlIllIl[35]] = lIIlIIIlIlIlI("ohVnrvXk7I4t9ZV8hx0zJA==", "RqoOS");
        lIlIlIlIll[lIlIlIllIl[176]] = lIIlIIIlIllII("MmYj4/jSkVAWrW1igezlwg==", "NMjRJ");
        lIlIlIlIll[lIlIlIllIl[177]] = lIIlIIIlIlIlI("oYkx4MG9mko2adiuK7Ud4A==", "WuqqI");
        lIlIlIlIll[lIlIlIllIl[178]] = lIIlIIIlIlIlI("mgVQWwAg1/FZsXUrnmaMh0vwsKiqWT+y", "ZQLaf");
        lIlIlIlIll[lIlIlIllIl[179]] = lIIlIIIlIllII("uMtIGuoNbnc=", "zsGwx");
        lIlIlIlIll[lIlIlIllIl[180]] = lIIlIIIlIlIll("CSw9OyItPnAsKjN5YQ==", "CYPKK");
        lIlIlIlIll[lIlIlIllIl[79]] = lIIlIIIlIlIll("Oy09Ow==", "qXPKZ");
        lIlIlIlIll[lIlIlIllIl[181]] = lIIlIIIlIllII("FYyfeoBBao5tMOG410S8/A==", "fxZTB");
        lIlIlIlIll[lIlIlIllIl[182]] = lIIlIIIlIlIll("GhMGNAo=", "YaiGy");
        lIlIlIlIll[lIlIlIllIl[183]] = lIIlIIIlIllII("LgADB+xhRl/PdJrYSLjTxw==", "pXYPq");
        lIlIlIlIll[lIlIlIllIl[184]] = lIIlIIIlIlIll("JScYGQ==", "oRuiI");
        lIlIlIlIll[lIlIlIllIl[185]] = lIIlIIIlIlIlI("UVz79jAGd/M9+GFwJ4TdYQ==", "IxsNm");
        lIlIlIlIll[lIlIlIllIl[186]] = lIIlIIIlIllII("m4OBWCWwNyg=", "elwqe");
        lIlIlIlIll[lIlIlIllIl[187]] = lIIlIIIlIlIll("Mi8+Ki0WPXMfIB8/", "xZSZD");
        lIlIlIlIll[lIlIlIllIl[188]] = lIIlIIIlIlIll("MyEGAg==", "yTkrZ");
        lIlIlIlIll[lIlIlIllIl[194]] = lIIlIIIlIlIlI("9zzUYJAm44Kn0csVhWUg42HH9Cwz+5KJ", "wUqDI");
        lIlIlIlIll[lIlIlIllIl[203]] = lIIlIIIlIlIll("CSwOJwc8Mg==", "HKgKn");
        lIlIlIlIll[lIlIlIllIl[204]] = lIIlIIIlIlIlI("3HYpozLpzXY=", "Jdxjp");
        lIlIlIlIll[lIlIlIllIl[205]] = lIIlIIIlIlIll("Ayc0OBgUIw==", "sFGKy");
        lIlIlIlIll[lIlIlIllIl[206]] = lIIlIIIlIllII("BpyNF0bCSIA=", "JRIpy");
        lIlIlIlIll[lIlIlIllIl[207]] = lIIlIIIlIlIll("FDUHOQADMQ==", "dTtJa");
        lIlIlIlIll[lIlIlIllIl[208]] = lIIlIIIlIllII("vtgdm2q+5XI=", "xCxHr");
        lIlIlIlIll[lIlIlIllIl[211]] = lIIlIIIlIllII("KNzgzy3YcZc=", "rSFIF");
        lIlIlIlIll[lIlIlIllIl[213]] = lIIlIIIlIlIll("Khck", "mvTzt");
        lIlIlIlIll[lIlIlIllIl[216]] = lIIlIIIlIllII("PHGwAgSDZBo3haAVdPexZw==", "FYqFS");
        lIlIlIlIll[lIlIlIllIl[218]] = lIIlIIIlIlIll("FjY/", "QWOQa");
        lIlIlIlIll[lIlIlIllIl[221]] = lIIlIIIlIlIlI("l6r07i+LFNg=", "MIapD");
        lIlIlIlIll[lIlIlIllIl[224]] = lIIlIIIlIlIll("KDQa", "oUjmx");
        lIlIlIlIll[lIlIlIllIl[226]] = lIIlIIIlIlIll("NjwtDWIQMjQEOw==", "fSAhO");
        lIlIlIlIll[lIlIlIllIl[227]] = lIIlIIIlIllII("+qWr0GcxWoY=", "nbnCO");
        lIlIlIlIll[lIlIlIllIl[230]] = lIIlIIIlIlIll("AzEq", "DPZmO");
        lIlIlIlIll[lIlIlIllIl[232]] = lIIlIIIlIllII("Y8FhFCU14PA=", "BoiZj");
        lIlIlIlIll[lIlIlIllIl[233]] = lIIlIIIlIlIll("NTEZ", "rPion");
    }

    private static String lIIlIIIlIlIlI(String lllllllllllllllllllIlIIllIIIlIlI, String lllllllllllllllllllIlIIllIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIllIIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIlIllIl[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllIl[3], lllllllllllllllllllIlIIllIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIllIIIllIl) {
            lllllllllllllllllllIlIIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIIIIII(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIlIIIlllIIl();
        lIIlIIIlllIII();
        bp = new ArrayList();
        jr = lIlIlIllIl[27];
        js = lIlIlIllIl[23];
        ju = new WorldArea(lIlIlIllIl[235], lIlIlIllIl[52], lIlIlIllIl[69], lIlIlIllIl[72], lIlIlIllIl[0]);
        jv = new WorldArea(lIlIlIllIl[235], lIlIlIllIl[52], lIlIlIllIl[69], lIlIlIllIl[72], lIlIlIllIl[1]);
        jw = new WorldArea(lIlIlIllIl[235], lIlIlIllIl[52], lIlIlIllIl[69], lIlIlIllIl[72], lIlIlIllIl[3]);
        jx = new WorldPoint(lIlIlIllIl[236], lIlIlIllIl[237], lIlIlIllIl[0]);
    }
}

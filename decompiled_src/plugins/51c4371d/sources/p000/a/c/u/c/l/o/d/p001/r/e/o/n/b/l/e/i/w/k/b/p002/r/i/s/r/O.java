package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.O  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/O.class */
public class O implements F {
    static final /* synthetic */ WorldPoint jf;
    private static /* synthetic */ String[] llIIllII;
    public static /* synthetic */ List<C0003d> bB;
    private final /* synthetic */ int jh = llIIlllI[0];
    static final /* synthetic */ WorldPoint jg;
    private static /* synthetic */ int[] llIIlllI;
    public static /* synthetic */ boolean bz;
    static final /* synthetic */ WorldPoint je;
    public static final /* synthetic */ WorldPoint jd;
    public static final /* synthetic */ WorldPoint ja;
    public static final /* synthetic */ WorldPoint jc;
    public static final /* synthetic */ WorldPoint jb;

    private static boolean lIlIlIlIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIlIllIlI(Object obj) {
        return obj != null;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIIllII[llIIlllI[75]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v332, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void cz() {
        if (lIlIlIlIlll(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llIIllII[llIIlllI[1]];
            C0001b.a(bB);
            if (lIlIlIllIII(bB.size(), llIIlllI[2])) {
                System.out.println(llIIllII[llIIlllI[2]]);
                bz = llIIlllI[1];
            }
        }
        if (lIlIlIllIIl(bz ? 1 : 0)) {
            if (lIlIlIllIIl(ac() ? 1 : 0) && lIlIlIllIII(Game.getWildyLevel(), llIIlllI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIllIlI(nearest) && lIlIlIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllII[llIIlllI[3]];
                    C0000a.a(nearest);
                }
                if (lIlIlIllIlI(nearest) && lIlIlIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllII[llIIlllI[4]];
                    if (lIlIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlllI[5]);
                        "".length();
                    }
                    if (lIlIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlllI[6]);
                            "".length();
                        }
                        if (lIlIlIllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIIlllI[4]];
                        iArr[llIIlllI[1]] = llIIlllI[7];
                        iArr[llIIlllI[2]] = llIIlllI[0];
                        iArr[llIIlllI[3]] = llIIlllI[8];
                        if (lIlIlIllIIl(C0004e.b(iArr) ? 1 : 0)) {
                            ag();
                            System.out.println(llIIllII[llIIlllI[6]]);
                            bz = llIIlllI[2];
                            return;
                        }
                        int[] iArr2 = new int[llIIlllI[4]];
                        iArr2[llIIlllI[1]] = llIIlllI[7];
                        iArr2[llIIlllI[2]] = llIIlllI[0];
                        iArr2[llIIlllI[3]] = llIIlllI[8];
                        if (lIlIlIlIlll(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIlIlIllIIl(Equipment.contains(C0005f.bg) ? 1 : 0)) {
                                C0000a.b(C0005f.bg, llIIlllI[2]);
                            }
                            C0000a.b(C0005f.bb, llIIlllI[2]);
                            C0000a.a(llIIlllI[9], llIIlllI[10]);
                            C0000a.b(llIIlllI[0], llIIlllI[11]);
                        }
                    }
                }
            }
            if (lIlIlIlIlll(ac() ? 1 : 0)) {
                if (lIlIlIlIlll(Inventory.contains(C0005f.bb) ? 1 : 0) && lIlIlIllIII(Movement.getRunEnergy(), llIIlllI[12])) {
                    Inventory.getFirst(C0005f.bb).interact(llIIllII[llIIlllI[13]]);
                    Time.sleepTicks(llIIlllI[2]);
                    "".length();
                }
                if (lIlIlIllIIl(Movement.isRunEnabled() ? 1 : 0) && lIlIlIlllII(Movement.getRunEnergy(), llIIlllI[14])) {
                    Movement.toggleRun();
                    Time.sleepTicks(llIIlllI[13]);
                    "".length();
                }
                if (lIlIlIllIII(Game.getWildyLevel(), llIIlllI[2])) {
                    AccBuilderBarrows.c = llIIllII[llIIlllI[15]];
                    if (lIlIlIlIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIlIllIIl(Dialog.isOpen() ? 1 : 0) && lIlIlIlIlll(Inventory.contains(C0005f.bg) ? 1 : 0) && lIlIlIlllIl(Players.getLocal().getAnimation(), llIIlllI[16])) {
                        Inventory.getFirst(C0005f.bg).interact(llIIllII[llIIlllI[17]]);
                        Time.sleepTicks(llIIlllI[3]);
                        "".length();
                    }
                    String[] strArr = new String[llIIlllI[3]];
                    strArr[llIIlllI[1]] = llIIllII[llIIlllI[18]];
                    strArr[llIIlllI[2]] = llIIllII[llIIlllI[19]];
                    C0006g.a(strArr);
                }
                if (lIlIlIllIll(Game.getWildyLevel())) {
                    int[] iArr3 = new int[llIIlllI[2]];
                    iArr3[llIIlllI[1]] = llIIlllI[0];
                    if (lIlIlIlIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIlIlIlllII(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                            AccBuilderBarrows.c = llIIllII[llIIlllI[21]];
                            WorldPoint[] worldPointArr = new WorldPoint[llIIlllI[20]];
                            worldPointArr[llIIlllI[1]] = new WorldPoint(llIIlllI[22], llIIlllI[23], llIIlllI[1]);
                            worldPointArr[llIIlllI[2]] = new WorldPoint(llIIlllI[24], llIIlllI[25], llIIlllI[1]);
                            worldPointArr[llIIlllI[3]] = new WorldPoint(llIIlllI[26], llIIlllI[27], llIIlllI[1]);
                            worldPointArr[llIIlllI[4]] = new WorldPoint(llIIlllI[28], llIIlllI[29], llIIlllI[1]);
                            worldPointArr[llIIlllI[6]] = new WorldPoint(llIIlllI[30], llIIlllI[31], llIIlllI[1]);
                            worldPointArr[llIIlllI[13]] = new WorldPoint(llIIlllI[32], llIIlllI[33], llIIlllI[1]);
                            worldPointArr[llIIlllI[15]] = new WorldPoint(llIIlllI[34], llIIlllI[35], llIIlllI[1]);
                            worldPointArr[llIIlllI[17]] = new WorldPoint(llIIlllI[36], llIIlllI[37], llIIlllI[1]);
                            worldPointArr[llIIlllI[18]] = new WorldPoint(llIIlllI[38], llIIlllI[37], llIIlllI[1]);
                            worldPointArr[llIIlllI[19]] = new WorldPoint(llIIlllI[39], llIIlllI[37], llIIlllI[1]);
                            worldPointArr[llIIlllI[21]] = new WorldPoint(llIIlllI[40], llIIlllI[37], llIIlllI[1]);
                            worldPointArr[llIIlllI[41]] = new WorldPoint(llIIlllI[42], llIIlllI[43], llIIlllI[1]);
                            worldPointArr[llIIlllI[44]] = new WorldPoint(llIIlllI[45], llIIlllI[43], llIIlllI[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(llIIlllI[2]);
                            "".length();
                        }
                        if (lIlIlIllllI(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                            AccBuilderBarrows.c = llIIllII[llIIlllI[41]];
                            String[] strArr2 = new String[llIIlllI[2]];
                            strArr2[llIIlllI[1]] = llIIllII[llIIlllI[44]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[llIIlllI[2]];
                            strArr3[llIIlllI[1]] = llIIllII[llIIlllI[20]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[llIIlllI[2]];
                            strArr4[llIIlllI[1]] = llIIllII[llIIlllI[46]];
                            if (lIlIlIlIlll(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(llIIllII[llIIlllI[47]]);
                            }
                            if (lIlIlIllIlI(nearest2)) {
                                String[] strArr5 = new String[llIIlllI[2]];
                                strArr5[llIIlllI[1]] = llIIllII[llIIlllI[48]];
                                if (lIlIlIllIIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[llIIlllI[2]];
                                    iArr4[llIIlllI[1]] = llIIlllI[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[llIIlllI[2]];
                                    strArr6[llIIlllI[1]] = llIIllII[llIIlllI[49]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(llIIlllI[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[llIIlllI[2]];
                    iArr5[llIIlllI[1]] = llIIlllI[0];
                    if (lIlIlIllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIIlllI[2]];
                        iArr6[llIIlllI[1]] = llIIlllI[50];
                        if (lIlIlIlIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIlIlIlllII(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                                AccBuilderBarrows.c = llIIllII[llIIlllI[51]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[llIIlllI[20]];
                                worldPointArr2[llIIlllI[1]] = new WorldPoint(llIIlllI[22], llIIlllI[23], llIIlllI[1]);
                                worldPointArr2[llIIlllI[2]] = new WorldPoint(llIIlllI[24], llIIlllI[25], llIIlllI[1]);
                                worldPointArr2[llIIlllI[3]] = new WorldPoint(llIIlllI[26], llIIlllI[27], llIIlllI[1]);
                                worldPointArr2[llIIlllI[4]] = new WorldPoint(llIIlllI[28], llIIlllI[29], llIIlllI[1]);
                                worldPointArr2[llIIlllI[6]] = new WorldPoint(llIIlllI[30], llIIlllI[31], llIIlllI[1]);
                                worldPointArr2[llIIlllI[13]] = new WorldPoint(llIIlllI[32], llIIlllI[33], llIIlllI[1]);
                                worldPointArr2[llIIlllI[15]] = new WorldPoint(llIIlllI[34], llIIlllI[35], llIIlllI[1]);
                                worldPointArr2[llIIlllI[17]] = new WorldPoint(llIIlllI[36], llIIlllI[37], llIIlllI[1]);
                                worldPointArr2[llIIlllI[18]] = new WorldPoint(llIIlllI[38], llIIlllI[37], llIIlllI[1]);
                                worldPointArr2[llIIlllI[19]] = new WorldPoint(llIIlllI[39], llIIlllI[37], llIIlllI[1]);
                                worldPointArr2[llIIlllI[21]] = new WorldPoint(llIIlllI[40], llIIlllI[37], llIIlllI[1]);
                                worldPointArr2[llIIlllI[41]] = new WorldPoint(llIIlllI[42], llIIlllI[43], llIIlllI[1]);
                                worldPointArr2[llIIlllI[44]] = new WorldPoint(llIIlllI[45], llIIlllI[43], llIIlllI[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(llIIlllI[2]);
                                "".length();
                            }
                            if (lIlIlIllllI(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                                AccBuilderBarrows.c = llIIllII[llIIlllI[52]];
                                if (!lIlIlIllIIl(Dialog.canLevelUpContinue() ? 1 : 0) || lIlIlIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[llIIlllI[2]];
                                strArr7[llIIlllI[1]] = llIIllII[llIIlllI[14]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[llIIlllI[2]];
                                strArr8[llIIlllI[1]] = llIIllII[llIIlllI[53]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[llIIlllI[2]];
                                strArr9[llIIlllI[1]] = llIIllII[llIIlllI[54]];
                                if (lIlIlIlIlll(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(llIIllII[llIIlllI[55]]);
                                }
                                if (lIlIlIllIlI(nearest4)) {
                                    String[] strArr10 = new String[llIIlllI[2]];
                                    strArr10[llIIlllI[1]] = llIIllII[llIIlllI[56]];
                                    if (lIlIlIllIIl(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIlIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[llIIlllI[2]];
                                            iArr7[llIIlllI[1]] = llIIlllI[50];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(llIIlllI[3]);
                                            "".length();
                                        }
                                        if (lIlIlIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIlIlIllIIl(options.isEmpty() ? 1 : 0)) {
                                                int i = llIIlllI[1];
                                                while (lIlIlIllIII(i, options.size())) {
                                                    int[] iArr8 = new int[llIIlllI[2]];
                                                    iArr8[llIIlllI[1]] = llIIlllI[50];
                                                    if (lIlIlIlllIl(((Item) Inventory.getAll(iArr8).get(llIIlllI[1])).getQuantity(), llIIlllI[2]) && lIlIlIlIlll(((Widget) options.get(i)).getText().contains(llIIllII[llIIlllI[57]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIlllI[2]);
                                                        Time.sleepTicks(llIIlllI[3]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[llIIlllI[2]];
                                                    iArr9[llIIlllI[1]] = llIIlllI[50];
                                                    if (lIlIlIlllIl(((Item) Inventory.getAll(iArr9).get(llIIlllI[1])).getQuantity(), llIIlllI[13]) && lIlIlIlIlll(((Widget) options.get(i)).getText().contains(llIIllII[llIIlllI[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIlllI[2]);
                                                        Time.sleepTicks(llIIlllI[3]);
                                                        "".length();
                                                    }
                                                    if (lIlIlIlIlll(((Widget) options.get(i)).getText().contains(llIIllII[llIIlllI[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) llIIlllI[2]);
                                                        Time.sleepTicks(llIIlllI[3]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ((-((5 ^ 70) ^ (105 ^ 47))) >= 0) {
                                                        return;
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
            int[] iArr10 = new int[llIIlllI[2]];
            iArr10[llIIlllI[1]] = llIIlllI[9];
            if (lIlIlIlIlll(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIlllI[2]];
                iArr11[llIIlllI[1]] = llIIlllI[0];
                if (!lIlIlIllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[llIIlllI[2]];
                iArr12[llIIlllI[1]] = llIIlllI[50];
                if (!lIlIlIllIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIlIlIllllI(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                AccBuilderBarrows.c = llIIllII[llIIlllI[60]];
                String[] strArr11 = new String[llIIlllI[2]];
                strArr11[llIIlllI[1]] = llIIllII[llIIlllI[61]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIlIlIllIlI(nearest6)) {
                    nearest6.interact(llIIllII[llIIlllI[62]]);
                }
            }
        }
    }

    private static boolean lIlIlIlllll(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIlIlIllI() {
        llIIlllI = new int[88];
        llIIlllI[0] = (-((-2) & 32099)) & (-129) & 32761;
        llIIlllI[1] = (56 ^ 13) & ((9 ^ 60) ^ (-1));
        llIIlllI[2] = " ".length();
        llIIlllI[3] = "  ".length();
        llIIlllI[4] = "   ".length();
        llIIlllI[5] = (-((-12553) & 32042)) & (-8193) & 32681;
        llIIlllI[6] = (43 ^ 78) ^ (31 ^ 126);
        llIIlllI[7] = (-3138) & 24303;
        llIIlllI[8] = (-((-25161) & 28271)) & (-16897) & 32631;
        llIIlllI[9] = (-3081) & 4075;
        llIIlllI[10] = (-((-16645) & 21974)) & (-33) & 15861;
        llIIlllI[11] = ((127 + 182) - 223) + 114;
        llIIlllI[12] = 39 ^ 21;
        llIIlllI[13] = (((45 + 5) - (-76)) + 11) ^ (((124 + 92) - 144) + 68);
        llIIlllI[14] = 33 ^ 53;
        llIIlllI[15] = (((16 + 114) - 2) + 31) ^ (((94 + 5) - (-8)) + 46);
        llIIlllI[16] = -" ".length();
        llIIlllI[17] = (94 ^ 34) ^ (110 ^ 21);
        llIIlllI[18] = (((84 + 66) - 119) + 153) ^ (((112 + 155) - 99) + 8);
        llIIlllI[19] = (97 ^ 24) ^ (228 ^ 148);
        llIIlllI[20] = 182 ^ 187;
        llIIlllI[21] = (162 ^ 139) ^ (189 ^ 158);
        llIIlllI[22] = (-((-1107) & 13430)) & (-1) & 15351;
        llIIlllI[23] = (-((-2885) & 19454)) & (-69) & 20479;
        llIIlllI[24] = (-24586) & 27611;
        llIIlllI[25] = (-((-9391) & 13743)) & (-1) & 8187;
        llIIlllI[26] = (-25649) & 28667;
        llIIlllI[27] = (-20743) & 24574;
        llIIlllI[28] = (-((-2405) & 31093)) & (-1033) & 32735;
        llIIlllI[29] = (-24579) & 28407;
        llIIlllI[30] = (-1066) & 4075;
        llIIlllI[31] = (-24591) & 28415;
        llIIlllI[32] = (-((-6801) & 23251)) & (-9217) & 28671;
        llIIlllI[33] = (-((-1221) & 26069)) & (-2) & 28671;
        llIIlllI[34] = (-20481) & 23479;
        llIIlllI[35] = (-((-11465) & 32218)) & (-1) & 24571;
        llIIlllI[36] = (-28673) & 31663;
        llIIlllI[37] = (-((-5801) & 30381)) & (-17) & 28415;
        llIIlllI[38] = (-((-2711) & 16087)) & (-16409) & 32767;
        llIIlllI[39] = (-((-6903) & 31479)) & (-5213) & 32764;
        llIIlllI[40] = (-((-8587) & 12783)) & (-1) & 7166;
        llIIlllI[41] = 29 ^ 22;
        llIIlllI[42] = (-((-7761) & 32345)) & (-4161) & 31707;
        llIIlllI[43] = (-((-17132) & 29423)) & (-16657) & 32767;
        llIIlllI[44] = (71 ^ 111) ^ (89 ^ 125);
        llIIlllI[45] = (-((-535) & 9751)) & (-20513) & 32687;
        llIIlllI[46] = (((9 + 65) - (-34)) + 58) ^ (((59 + 52) - (-45)) + 12);
        llIIlllI[47] = (242 ^ 135) ^ (71 ^ 61);
        llIIlllI[48] = (((85 + 27) - 56) + 119) ^ (((150 + 78) - 76) + 39);
        llIIlllI[49] = (58 ^ 20) ^ (9 ^ 54);
        llIIlllI[50] = (-26853) & 27389;
        llIIlllI[51] = (19 ^ 55) ^ (142 ^ 184);
        llIIlllI[52] = 54 ^ 37;
        llIIlllI[53] = 89 ^ 76;
        llIIlllI[54] = 132 ^ 146;
        llIIlllI[55] = 45 ^ 58;
        llIIlllI[56] = (((124 + 10) - 29) + 48) ^ (((1 + 3) - (-91)) + 34);
        llIIlllI[57] = 75 ^ 82;
        llIIlllI[58] = 79 ^ 85;
        llIIlllI[59] = 21 ^ 14;
        llIIlllI[60] = (((124 + 118) - 145) + 76) ^ (((10 + 147) - (-1)) + 19);
        llIIlllI[61] = 180 ^ 169;
        llIIlllI[62] = 29 ^ 3;
        llIIlllI[63] = (-((-998) & 14319)) & (-16641) & 32761;
        llIIlllI[64] = (-((-16485) & 20582)) & (-307) & 16383;
        llIIlllI[65] = (-5636) & 30635;
        llIIlllI[66] = (-169) & 8175;
        llIIlllI[67] = (164 ^ 186) ^ (149 ^ 163);
        llIIlllI[68] = (-21562) & 22461;
        llIIlllI[69] = (-513) & 274254;
        llIIlllI[70] = 5 ^ 57;
        llIIlllI[71] = 112 ^ 93;
        llIIlllI[72] = (-((-2241) & 18681)) & (-13318) & 30207;
        llIIlllI[73] = (-2565) & 64076;
        llIIlllI[74] = (65 ^ 30) ^ (9 ^ 50);
        llIIlllI[75] = 4 ^ 27;
        llIIlllI[76] = 213 ^ 182;
        llIIlllI[77] = (((138 + 88) - 219) + 147) ^ (((173 + 81) - 109) + 41);
        llIIlllI[78] = (-((-4353) & 28937)) & (-4131) & 31743;
        llIIlllI[79] = (-((-3330) & 32131)) & (-3) & 32647;
        llIIlllI[80] = (-28678) & 31671;
        llIIlllI[81] = (-24853) & 28669;
        llIIlllI[82] = (-17489) & 20438;
        llIIlllI[83] = (-((-2947) & 7043)) & (-24849) & 32765;
        llIIlllI[84] = (-((-8963) & 30566)) & (-9) & 24559;
        llIIlllI[85] = (-((-7223) & 32767)) & (-4098) & 32735;
        llIIlllI[86] = (-29249) & 32739;
        llIIlllI[87] = (((89 + 14) - 99) + 134) ^ (((73 + 110) - 32) + 20);
    }

    private static String lIlIlIIllll(String lIlIlIIlIIIIllI, String lIlIlIIlIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), llIIlllI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIlIIIIIlI) {
            lIlIlIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIllI();
        lIlIlIlIIlI();
        ja = new WorldPoint(llIIlllI[78], llIIlllI[79], llIIlllI[1]);
        jb = new WorldPoint(llIIlllI[80], llIIlllI[81], llIIlllI[1]);
        jc = new WorldPoint(llIIlllI[82], llIIlllI[83], llIIlllI[1]);
        jd = new WorldPoint(llIIlllI[84], llIIlllI[43], llIIlllI[1]);
        je = new WorldPoint(llIIlllI[1], llIIlllI[1], llIIlllI[1]);
        jf = new WorldPoint(llIIlllI[1], llIIlllI[1], llIIlllI[1]);
        jg = new WorldPoint(llIIlllI[85], llIIlllI[86], llIIlllI[1]);
        bB = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIIlllI[1];
    }

    private static boolean lIlIlIllllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIllIll(int i) {
        return i > 0;
    }

    private static String lIlIlIlIIII(String lIlIlIIIllllIIl, String lIlIlIIIllllIII) {
        try {
            SecretKeySpec lIlIlIIIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllI[3], lIlIlIIIlllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIllllIlI) {
            lIlIlIIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIII(int i, int i2) {
        return i < i2;
    }

    private static int cA() {
        return (lIlIlIllIII(Skills.getLevel(Skill.PRAYER), llIIlllI[70]) && lIlIlIlllll(Skills.getLevel(Skill.PRAYER), llIIlllI[71])) ? ((llIIlllI[69] - Skills.getExperience(Skill.PRAYER)) / llIIlllI[72]) + llIIlllI[21] : ((llIIlllI[73] - Skills.getExperience(Skill.PRAYER)) / llIIlllI[72]) + llIIlllI[62];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIlIlIlllll(Skills.getLevel(Skill.PRAYER), llIIlllI[76])) {
            ?? r0 = llIIlllI[2];
            "".length();
            return (163 ^ 167) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlllI[1];
    }

    private static boolean lIlIlIlllII(int i, int i2) {
        return i > i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            cz();
            "".length();
            if ("  ".length() == ((((49 + 47) - (-76)) + 8) ^ (((123 + 48) - 141) + 146))) {
                return ((68 ^ 47) ^ (1 ^ 8)) & (((133 ^ 181) ^ (244 ^ 166)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIlllI[74];
    }

    private static void lIlIlIlIIlI() {
        llIIllII = new String[llIIlllI[87]];
        llIIllII[llIIlllI[1]] = lIlIlIIllll("P54JRRUUJEPu7j1+CRZ4ig==", "IJOFC");
        llIIllII[llIIlllI[2]] = lIlIlIlIIII("IkkiKsEETdtEKPg8DVvjf3zwDjYzu8Fbz4td2CToeBgeNaD9aIdU5l8bTBStl7mq", "chhWx");
        llIIllII[llIIlllI[3]] = lIlIlIlIIII("sIsJeQdrfi3lN+kfHc38zoWmpN9LslTz", "KleUZ");
        llIIllII[llIIlllI[4]] = lIlIlIIllll("9/gLO/Y69pSzMpqHHJ7/zIiN1nYr8WZb", "fFRQM");
        llIIllII[llIIlllI[6]] = lIlIlIIllll("N/VSGh9I8FbIMSg/hcObdWP3H93J8xj8VJg7YYjYC30P8aiC4c+swVZ+kVEAC7Pw97stoqCX4IY=", "CbpAE");
        llIIllII[llIIlllI[13]] = lIlIlIlIIIl("KxknIhM=", "okNLx");
        llIIllII[llIIlllI[15]] = lIlIlIlIIIl("Ngw0PEgWBnguAQ4NIQ==", "biXYh");
        llIIllII[llIIlllI[17]] = lIlIlIIllll("8ju+xWWOOEI=", "PMwOP");
        llIIllII[llIIlllI[18]] = lIlIlIIllll("GLEDRbvMGOqtKkD7GS5Vtw==", "Vswtb");
        llIIllII[llIIlllI[19]] = lIlIlIlIIIl("BTkZGGZqJh0NLzo9ChVqPj1YDS88NxRBfntyLwgmLjcKDy85IVY=", "JRxaJ");
        llIIllII[llIIlllI[21]] = lIlIlIIllll("0UcSUONhWpa+sUPOqTxnBA==", "tOQZH");
        llIIllII[llIIlllI[41]] = lIlIlIlIIII("lMqJl2402T26gr90dtNBdQ==", "FOrVl");
        llIIllII[llIIlllI[44]] = lIlIlIlIIII("OH+h4igmIhMrnrqh5yEKIA==", "cdIUM");
        llIIllII[llIIlllI[20]] = lIlIlIIllll("bWquztmYKxzZO6A/Z+kLwQ==", "zCLCL");
        llIIllII[llIIlllI[46]] = lIlIlIIllll("poO6FECuxNw=", "GyMYW");
        llIIllII[llIIlllI[47]] = lIlIlIIllll("fuB6yBPtHCs=", "NgEoY");
        llIIllII[llIIlllI[48]] = lIlIlIlIIII("ByXjVOoGP8A=", "lInxn");
        llIIllII[llIIlllI[49]] = lIlIlIIllll("y5mjWwR+B6qQKcpH2Ia7WQ==", "aaXCt");
        llIIllII[llIIlllI[51]] = lIlIlIlIIIl("AhEfdzcjUAg7Ny0C", "LpiWC");
        llIIllII[llIIlllI[52]] = lIlIlIlIIIl("PAktLQQACSRiEgYJJjE=", "igCBp");
        llIIllII[llIIlllI[14]] = lIlIlIlIIII("LYU5YtH27HuCvf4ZOm+fdb22RhkAPpV8", "XJECi");
        llIIllII[llIIlllI[53]] = lIlIlIIllll("mA8tkU9cXhjcDH2Y1nnzRQ==", "laQCn");
        llIIllII[llIIlllI[54]] = lIlIlIIllll("V4G2nctQ+yo=", "yJYQs");
        llIIllII[llIIlllI[55]] = lIlIlIlIIIl("PSQoKw==", "rTMEt");
        llIIllII[llIIlllI[56]] = lIlIlIIllll("KtdiGk1Rf3A=", "UCCHD");
        llIIllII[llIIlllI[57]] = lIlIlIlIIII("yVov8he5VTDqzJaxKRW1bA==", "EVDXx");
        llIIllII[llIIlllI[58]] = lIlIlIlIIII("XDG4shhDR6f4gVi5YYJe8Q==", "tSHkM");
        llIIllII[llIIlllI[59]] = lIlIlIIllll("Wz+aEizMSIGOORdObPG0Dw==", "CMbYW");
        llIIllII[llIIlllI[60]] = lIlIlIlIIIl("JQwDFQMSEAQR", "vyjvj");
        llIIllII[llIIlllI[61]] = lIlIlIIllll("HkWqor13tH7IDk3fQyrJ9w==", "WtyUD");
        llIIllII[llIIlllI[62]] = lIlIlIlIIIl("NhkjCA==", "bxHmx");
        llIIllII[llIIlllI[75]] = lIlIlIlIIII("jcUGlLcr/zz6RW0n6p0W2A==", "fystI");
        llIIllII[llIIlllI[77]] = lIlIlIlIIII("rxmEX6EhoGT/AZdzn1s3r2G/jYpL2tfy", "AQcUC");
    }

    private static boolean lIlIlIlllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIllIIl(int i) {
        return i == 0;
    }

    private static void ag() {
        int[] iArr = new int[llIIlllI[2]];
        iArr[llIIlllI[1]] = llIIlllI[8];
        if (lIlIlIllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(llIIlllI[8], llIIlllI[13], C0008i.bw));
            "".length();
        }
        int[] iArr2 = new int[llIIlllI[2]];
        iArr2[llIIlllI[1]] = llIIlllI[0];
        if (lIlIlIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(llIIlllI[0], cA(), llIIlllI[63]));
            "".length();
        }
        int[] iArr3 = new int[llIIlllI[2]];
        iArr3[llIIlllI[1]] = llIIlllI[7];
        if (lIlIlIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llIIlllI[7], llIIlllI[3], llIIlllI[5]));
            "".length();
        }
        if (lIlIlIllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIllII[llIIlllI[77]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llIIlllI[64], llIIlllI[13], llIIlllI[65]));
            "".length();
        }
        int[] iArr4 = new int[llIIlllI[2]];
        iArr4[llIIlllI[1]] = llIIlllI[66];
        if (lIlIlIllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(llIIlllI[66], llIIlllI[67], llIIlllI[68]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIlIlIlIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        int[] iArr = new int[llIIlllI[2]];
        iArr[llIIlllI[1]] = llIIlllI[9];
        if (lIlIlIlIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlllI[2]];
            iArr2[llIIlllI[1]] = llIIlllI[9];
            if (lIlIlIlllll(Inventory.getFirst(iArr2).getQuantity(), llIIlllI[12])) {
                if (lIlIlIllIIl(Inventory.contains(C0005f.bg) ? 1 : 0)) {
                    if (lIlIlIlIlll(Equipment.contains(C0005f.bg) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlllI[2]];
                        iArr3[llIIlllI[1]] = llIIlllI[0];
                        if (lIlIlIllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIlllI[2]];
                            iArr4[llIIlllI[1]] = llIIlllI[50];
                        }
                    }
                }
                ?? r0 = llIIlllI[2];
                "".length();
                return (-" ".length()) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIlllI[1];
    }

    private static String lIlIlIlIIIl(String lIlIlIIlIIllIll, String lIlIlIIlIIllIlI) {
        String lIlIlIIlIIllIll2 = new String(Base64.getDecoder().decode(lIlIlIIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlIIlIIllIlI.toCharArray();
        int lIlIlIIlIIlIlll = llIIlllI[1];
        char[] charArray2 = lIlIlIIlIIllIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlllI[1];
        while (lIlIlIllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIlIlIIlIIlIlll % charArray.length]));
            "".length();
            lIlIlIIlIIlIlll++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}

package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import net.runelite.api.TileObject;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.R  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/R.class */
public class R implements InterfaceC0003ac {
    static /* synthetic */ WorldPoint lN;
    static /* synthetic */ WorldPoint de;
    private final /* synthetic */ int lQ = lllIIIllll[0];
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] lllIIIllII;
    static /* synthetic */ boolean dj;
    static /* synthetic */ String[] cE;
    public static /* synthetic */ boolean lI;
    static /* synthetic */ WorldPoint lO;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int di;
    static /* synthetic */ WorldPoint lK;
    private static final /* synthetic */ HashMap<Integer, String> lG;
    static /* synthetic */ WorldPoint lJ;
    private static /* synthetic */ String[] lP;
    static /* synthetic */ WorldPoint lM;
    private static /* synthetic */ int[] lllIIIllll;
    static /* synthetic */ WorldPoint lL;
    private static final /* synthetic */ String lH;

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            du();
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((77 ^ 18) ^ (34 ^ 54)) & (((105 ^ 89) ^ (105 ^ 18)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIIllll[86];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIIIIlIlIl(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIIIllll[5])) {
            ?? r0 = lllIIIllll[1];
            "".length();
            return (84 ^ 80) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIllll[0];
    }

    private static boolean llIIIIIIIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0b39, code lost:
        if (llIIIIIIIllIl(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0e30, code lost:
        r10 = r10 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0e5a, code lost:
        if (((((124 + 83) - 149) + 82) ^ (((132 + 135) - 177) + 46)) >= (-" ".length())) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0e5d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v198, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v295, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v551, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v554, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v576, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void du() {
        if (llIIIIIIIlIlI(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (llIIIIIIIlIll(bv.size(), lllIIIllll[1])) {
                System.out.println(lllIIIllII[lllIIIllll[0]]);
                bt = lllIIIllll[0];
            }
        }
        if (llIIIIIIIllII(bt ? 1 : 0)) {
            if (llIIIIIIIllII(an() ? 1 : 0) && llIIIIIIIllII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIIIIllIl(nearest) && llIIIIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIllII[lllIIIllll[1]];
                    C0000a.a(nearest);
                }
                if (llIIIIIIIllIl(nearest) && llIIIIIIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIllll[2]);
                        "".length();
                    }
                    if (llIIIIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllII[lllIIIllll[3]];
                        if (llIIIIIIIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIllll[4]);
                            "".length();
                        }
                        if (llIIIIIIIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIllll[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIIllll[5]];
                        iArr[lllIIIllll[0]] = lllIIIllll[6];
                        iArr[lllIIIllll[1]] = lllIIIllll[7];
                        iArr[lllIIIllll[3]] = lllIIIllll[8];
                        if (llIIIIIIIllII(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIllII[lllIIIllll[5]]);
                            bt = lllIIIllll[1];
                            return;
                        }
                        int[] iArr2 = new int[lllIIIllll[1]];
                        iArr2[lllIIIllll[0]] = lllIIIllll[7];
                        if (llIIIIIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lllIIIllll[1]];
                            iArr3[lllIIIllll[0]] = lllIIIllll[7];
                            if (llIIIIIIIlIll(Bank.getFirst(iArr3).getQuantity(), lllIIIllll[9])) {
                                Q();
                                System.out.println(lllIIIllII[lllIIIllll[4]]);
                                bt = lllIIIllll[1];
                                return;
                            }
                        }
                        int[] iArr4 = new int[lllIIIllll[5]];
                        iArr4[lllIIIllll[0]] = lllIIIllll[6];
                        iArr4[lllIIIllll[1]] = lllIIIllll[7];
                        iArr4[lllIIIllll[3]] = lllIIIllll[8];
                        if (llIIIIIIIlIlI(C0018e.c(iArr4) ? 1 : 0)) {
                            if (llIIIIIIIllII(Equipment.contains(C0019f.aW) ? 1 : 0) && llIIIIIIIllII(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                                C0000a.b(C0019f.aW, lllIIIllll[1]);
                            }
                            if (llIIIIIIIlIlI(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                                Inventory.getFirst(C0019f.aW).interact(lllIIIllII[lllIIIllll[10]]);
                                Time.sleepTicks(lllIIIllll[5]);
                                "".length();
                            }
                            if (llIIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lllIIIllll[5]);
                                "".length();
                            }
                            C0000a.a(lllIIIllll[11], lllIIIllll[1]);
                            C0000a.a(lllIIIllll[8], lllIIIllll[1]);
                            C0000a.a(lllIIIllll[6], lllIIIllll[12]);
                            C0000a.a(lllIIIllll[13], lllIIIllll[14]);
                        }
                    }
                }
            }
            if (llIIIIIIIlIlI(Inventory.contains(C0019f.ba) ? 1 : 0) && llIIIIIIIlIll(Movement.getRunEnergy(), lllIIIllll[15])) {
                Inventory.getFirst(C0019f.ba).interact(lllIIIllII[lllIIIllll[16]]);
                Time.sleepTicks(lllIIIllll[1]);
                "".length();
            }
            int[] iArr5 = new int[lllIIIllll[1]];
            iArr5[lllIIIllll[0]] = lllIIIllll[17];
            if (llIIIIIIIlIlI(Inventory.contains(iArr5) ? 1 : 0) && llIIIIIIIllll(llIIIIIIIlIIl(C0018e.w(), 55.0d))) {
                int[] iArr6 = new int[lllIIIllll[1]];
                iArr6[lllIIIllll[0]] = lllIIIllll[17];
                Inventory.getFirst(iArr6).interact(lllIIIllII[lllIIIllll[18]]);
            }
            if (llIIIIIIIlIlI(an() ? 1 : 0) && llIIIIIIIllII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                if (llIIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIllll[4]) && llIIIIIIIllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIllII[lllIIIllll[19]];
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(lllIIIllll[1]);
                    "".length();
                }
                if (llIIIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(de), lllIIIllll[4])) {
                    C0020g.a(lllIIIllII[lllIIIllll[20]], cE);
                }
            }
            if (llIIIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIIIllll[1])) {
                WorldArea worldArea = new WorldArea(lllIIIllll[21], lllIIIllll[22], lllIIIllll[19], lllIIIllll[18], lllIIIllll[0]);
                if (llIIIIIIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIllII[lllIIIllll[12]];
                    Movement.walkTo(lJ);
                    "".length();
                    Time.sleepTicks(lllIIIllll[1]);
                    "".length();
                }
                if (llIIIIIIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0020g.a(lllIIIllII[lllIIIllll[23]], cE);
                }
            }
            if (llIIIIIIlIIlI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lllIIIllll[3])) {
                di = lllIIIllll[0];
                int[] iArr7 = new int[lllIIIllll[1]];
                iArr7[lllIIIllll[0]] = lllIIIllll[24];
                if (llIIIIIIIllII(Inventory.contains(iArr7) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllll[1]];
                    strArr[lllIIIllll[0]] = lllIIIllII[lllIIIllll[25]];
                    if (llIIIIIIIllII(Equipment.contains(strArr) ? 1 : 0) && llIIIIIIIllII(lI ? 1 : 0)) {
                        if (!llIIIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(lK), lllIIIllll[4]) || llIIIIIIlIIll(Players.getLocal().getWorldLocation().getPlane(), lllIIIllll[3])) {
                            AccBuilderSotf.c = lllIIIllII[lllIIIllll[26]];
                            Movement.walkTo(lK);
                            "".length();
                            Time.sleepTicks(lllIIIllll[1]);
                            "".length();
                        }
                        if (llIIIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(lK), lllIIIllll[4])) {
                            C0020g.a(lllIIIllII[lllIIIllll[27]], cE);
                        }
                    }
                }
                int[] iArr8 = new int[lllIIIllll[1]];
                iArr8[lllIIIllll[0]] = lllIIIllll[24];
                if (llIIIIIIIlIlI(Inventory.contains(iArr8) ? 1 : 0) && llIIIIIIIllII(lI ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIllll[1]];
                    strArr2[lllIIIllll[0]] = lllIIIllII[lllIIIllll[28]];
                    if (llIIIIIIIlIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (llIIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(lL), lllIIIllll[4])) {
                            AccBuilderSotf.c = lllIIIllII[lllIIIllll[29]];
                            Movement.walkTo(lL);
                            "".length();
                            Time.sleepTicks(lllIIIllll[1]);
                            "".length();
                        }
                        if (llIIIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(lL), lllIIIllll[4])) {
                            String[] strArr3 = new String[lllIIIllll[1]];
                            strArr3[lllIIIllll[0]] = lllIIIllII[lllIIIllll[30]];
                            Item first = Inventory.getFirst(strArr3);
                            String[] strArr4 = new String[lllIIIllll[1]];
                            strArr4[lllIIIllll[0]] = lllIIIllII[lllIIIllll[31]];
                            first.useOn(TileObjects.getNearest(strArr4));
                            Time.sleepTicks(lllIIIllll[10]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lllIIIllll[1]];
                    strArr5[lllIIIllll[0]] = lllIIIllII[lllIIIllll[32]];
                    if (llIIIIIIIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (llIIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(lM), lllIIIllll[4])) {
                            AccBuilderSotf.c = lllIIIllII[lllIIIllll[33]];
                            String[] strArr6 = new String[lllIIIllll[1]];
                            strArr6[lllIIIllll[0]] = lllIIIllII[lllIIIllll[34]];
                            if (llIIIIIIIllIl(TileObjects.getNearest(strArr6))) {
                                String[] strArr7 = new String[lllIIIllll[1]];
                                strArr7[lllIIIllll[0]] = lllIIIllII[lllIIIllll[35]];
                                TileObject nearest2 = TileObjects.getNearest(strArr7);
                                String[] strArr8 = new String[lllIIIllll[1]];
                                strArr8[lllIIIllll[0]] = lllIIIllII[lllIIIllll[36]];
                                if (llIIIIIIIlIlI(nearest2.hasAction(strArr8) ? 1 : 0)) {
                                    String[] strArr9 = new String[lllIIIllll[1]];
                                    strArr9[lllIIIllll[0]] = lllIIIllII[lllIIIllll[37]];
                                    TileObjects.getNearest(strArr9).interact(lllIIIllII[lllIIIllll[9]]);
                                    Time.sleepTicks(lllIIIllll[3]);
                                    "".length();
                                }
                            }
                            String[] strArr10 = new String[lllIIIllll[1]];
                            strArr10[lllIIIllll[0]] = lllIIIllII[lllIIIllll[38]];
                            if (llIIIIIIIllIl(TileObjects.getNearest(strArr10))) {
                                String[] strArr11 = new String[lllIIIllll[1]];
                                strArr11[lllIIIllll[0]] = lllIIIllII[lllIIIllll[39]];
                                TileObject nearest3 = TileObjects.getNearest(strArr11);
                                String[] strArr12 = new String[lllIIIllll[1]];
                                strArr12[lllIIIllll[0]] = lllIIIllII[lllIIIllll[40]];
                                if (llIIIIIIIlIlI(nearest3.hasAction(strArr12) ? 1 : 0)) {
                                    String[] strArr13 = new String[lllIIIllll[1]];
                                    strArr13[lllIIIllll[0]] = lllIIIllII[lllIIIllll[41]];
                                    TileObjects.getNearest(strArr13).interact(lllIIIllII[lllIIIllll[42]]);
                                    Time.sleepTicks(lllIIIllll[3]);
                                    "".length();
                                }
                            }
                            Movement.walkTo(lM);
                            "".length();
                            Time.sleepTicks(lllIIIllll[1]);
                            "".length();
                        }
                        if (llIIIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(lM), lllIIIllll[4])) {
                            String[] strArr14 = new String[lllIIIllll[1]];
                            strArr14[lllIIIllll[0]] = lllIIIllII[lllIIIllll[43]];
                            if (llIIIIIIIllIl(TileObjects.getNearest(strArr14))) {
                                String[] strArr15 = new String[lllIIIllll[1]];
                                strArr15[lllIIIllll[0]] = lllIIIllII[lllIIIllll[44]];
                                TileObjects.getNearest(strArr15).interact(lllIIIllII[lllIIIllll[45]]);
                                Time.sleepTicks(lllIIIllll[4]);
                                "".length();
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lllIIIllll[1]];
                iArr9[lllIIIllll[0]] = lllIIIllll[24];
                if (llIIIIIIIlIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIIllll[1]];
                    iArr10[lllIIIllll[0]] = lllIIIllll[46];
                    if (llIIIIIIIlIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                        lI = lllIIIllll[1];
                    }
                }
                if (llIIIIIIIlIlI(lI ? 1 : 0)) {
                    String[] strArr16 = new String[lllIIIllll[1]];
                    strArr16[lllIIIllll[0]] = lllIIIllII[lllIIIllll[47]];
                    if (llIIIIIIIllII(Equipment.contains(strArr16) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIIIllll[1]];
                        iArr11[lllIIIllll[0]] = lllIIIllll[48];
                        if (llIIIIIIIllII(Inventory.contains(iArr11) ? 1 : 0)) {
                            String[] strArr17 = new String[lllIIIllll[1]];
                            strArr17[lllIIIllll[0]] = lllIIIllII[lllIIIllll[49]];
                            if (llIIIIIIIllII(Inventory.contains(strArr17) ? 1 : 0)) {
                                dw();
                            }
                            String[] strArr18 = new String[lllIIIllll[1]];
                            strArr18[lllIIIllll[0]] = lllIIIllII[lllIIIllll[50]];
                            if (llIIIIIIIlIlI(Inventory.contains(strArr18) ? 1 : 0)) {
                                if (llIIIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(lN), lllIIIllll[3])) {
                                    AccBuilderSotf.c = lllIIIllII[lllIIIllll[51]];
                                    Movement.walkTo(lN);
                                    "".length();
                                    Time.sleepTicks(lllIIIllll[1]);
                                    "".length();
                                }
                                if (llIIIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(lN), lllIIIllll[3])) {
                                    C0020g.a(lllIIIllII[lllIIIllll[52]], cE);
                                }
                            }
                        }
                    }
                }
                if (llIIIIIIIlIlI(lI ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIIllll[1]];
                    iArr12[lllIIIllll[0]] = lllIIIllll[48];
                    if (llIIIIIIIlIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                        String[] strArr19 = new String[lllIIIllll[1]];
                        strArr19[lllIIIllll[0]] = lllIIIllII[lllIIIllll[53]];
                        if (llIIIIIIIllII(Equipment.contains(strArr19) ? 1 : 0)) {
                            int[] iArr13 = new int[lllIIIllll[1]];
                            iArr13[lllIIIllll[0]] = lllIIIllll[24];
                            if (llIIIIIIIllII(Inventory.contains(iArr13) ? 1 : 0)) {
                                dw();
                            }
                            int[] iArr14 = new int[lllIIIllll[1]];
                            iArr14[lllIIIllll[0]] = lllIIIllll[24];
                            if (llIIIIIIIlIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                                WorldArea worldArea2 = new WorldArea(lllIIIllll[21], lllIIIllll[22], lllIIIllll[19], lllIIIllll[18], lllIIIllll[0]);
                                if (llIIIIIIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = lllIIIllII[lllIIIllll[54]];
                                    Movement.walkTo(lJ);
                                    "".length();
                                    Time.sleepTicks(lllIIIllll[1]);
                                    "".length();
                                }
                                if (llIIIIIIIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    C0020g.a(lllIIIllII[lllIIIllll[55]], cE);
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[lllIIIllll[1]];
                strArr20[lllIIIllll[0]] = lllIIIllII[lllIIIllll[56]];
                if (llIIIIIIIlIlI(Equipment.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lllIIIllll[1]];
                    strArr21[lllIIIllll[0]] = lllIIIllII[lllIIIllll[57]];
                    if (llIIIIIIlIlII(NPCs.getNearest(strArr21))) {
                        String[] strArr22 = new String[lllIIIllll[1]];
                        strArr22[lllIIIllll[0]] = lllIIIllII[lllIIIllll[58]];
                        if (llIIIIIIlIlII(NPCs.getNearest(strArr22))) {
                            AccBuilderSotf.c = lllIIIllII[lllIIIllll[59]];
                            Movement.walkTo(lO);
                            "".length();
                            Time.sleepTicks(lllIIIllll[1]);
                            "".length();
                        }
                    }
                    String[] strArr23 = new String[lllIIIllll[1]];
                    strArr23[lllIIIllll[0]] = lllIIIllII[lllIIIllll[60]];
                    if (llIIIIIIlIlII(NPCs.getNearest(strArr23))) {
                        String[] strArr24 = new String[lllIIIllll[1]];
                        strArr24[lllIIIllll[0]] = lllIIIllII[lllIIIllll[61]];
                    }
                    if (llIIIIIIlIlII(lP)) {
                        dv();
                    }
                    NPC nearest4 = NPCs.getNearest(npc -> {
                        if (llIIIIIIIlIlI(npc.getName().contains(lllIIIllII[lllIIIllll[89]]) ? 1 : 0) && llIIIIIIlIllI(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = lllIIIllll[1];
                            "".length();
                            return 0 != 0 ? ((((86 + 164) - 186) + 172) ^ (((58 + 84) - 131) + 151)) & (((65 ^ 59) ^ (164 ^ 144)) ^ (-" ".length())) : r0;
                        }
                        return lllIIIllll[0];
                    });
                    if (llIIIIIIIllIl(nearest4) && llIIIIIIlIlII(Players.getLocal().getInteracting())) {
                        nearest4.interact(lllIIIllII[lllIIIllll[62]]);
                        Time.sleepTicks(lllIIIllll[3]);
                        "".length();
                    }
                    if (llIIIIIIlIlII(nearest4) && llIIIIIIlIlII(Players.getLocal().getInteracting())) {
                        String[] strArr25 = new String[lllIIIllll[1]];
                        strArr25[lllIIIllll[0]] = lllIIIllII[lllIIIllll[63]];
                        if (llIIIIIIIllIl(NPCs.getNearest(strArr25))) {
                            String[] strArr26 = new String[lllIIIllll[1]];
                            strArr26[lllIIIllll[0]] = lllIIIllII[lllIIIllll[15]];
                            if (llIIIIIIIllII(NPCs.getNearest(strArr26).isDead() ? 1 : 0) && llIIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr27 = new String[lllIIIllll[1]];
                                strArr27[lllIIIllll[0]] = lllIIIllII[lllIIIllll[64]];
                                NPCs.getNearest(strArr27).interact(lllIIIllII[lllIIIllll[65]]);
                            }
                        }
                    }
                    if (llIIIIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIIllII[lllIIIllll[66]];
                        List options = Dialog.getOptions();
                        if (llIIIIIIIllII(options.isEmpty() ? 1 : 0)) {
                            int i = lllIIIllll[0];
                            do {
                                if (llIIIIIIIlIll(i, options.size())) {
                                    if (llIIIIIIIlIlI(((Widget) options.get(i)).getText().contains(lllIIIllII[lllIIIllll[67]]) ? 1 : 0)) {
                                        String[] strArr28 = new String[lllIIIllll[1]];
                                        strArr28[lllIIIllll[0]] = ((Widget) options.get(i)).getText();
                                        Dialog.chooseOption(strArr28);
                                        "".length();
                                        Time.sleepTicks(lllIIIllll[3]);
                                        "".length();
                                        "".length();
                                        if ((true ^ true) != (true ^ true)) {
                                            return;
                                        }
                                    } else {
                                        i++;
                                        "".length();
                                    }
                                }
                            } while (0 == 0);
                            return;
                        }
                    }
                    String[] strArr29 = new String[lllIIIllll[1]];
                    strArr29[lllIIIllll[0]] = lllIIIllII[lllIIIllll[68]];
                    if (llIIIIIIIllIl(NPCs.getNearest(strArr29))) {
                        if (llIIIIIIIlIll(di, lllIIIllll[1]) && llIIIIIIIllII(dj ? 1 : 0)) {
                            aN.te += lllIIIllll[1];
                            aN.u(AccBuilderSotf.m);
                            di += lllIIIllll[1];
                            aN.te = lllIIIllll[0];
                            dj = lllIIIllll[1];
                        }
                        if (llIIIIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIIllII[lllIIIllll[69]];
                            List options2 = Dialog.getOptions();
                            if (llIIIIIIIllII(options2.isEmpty() ? 1 : 0)) {
                                int i2 = lllIIIllll[0];
                                while (llIIIIIIIlIll(i2, options2.size())) {
                                    String lllllllllllllllllIlllIlllIIllIIl = lP[i2];
                                    int i3 = lllIIIllll[0];
                                    while (true) {
                                        if (!llIIIIIIIlIll(i3, options2.size())) {
                                            break;
                                        } else if (llIIIIIIIlIlI(((Widget) options2.get(i3)).getText().contains(lllllllllllllllllIlllIlllIIllIIl) ? 1 : 0)) {
                                            System.out.println("Selecting: " + ((Widget) options2.get(i3)).getText());
                                            Time.sleepTicks(lllIIIllll[3]);
                                            "".length();
                                            String[] strArr30 = new String[lllIIIllll[1]];
                                            strArr30[lllIIIllll[0]] = ((Widget) options2.get(i3)).getText();
                                            Dialog.chooseOption(strArr30);
                                            "".length();
                                            Time.sleepTicks(lllIIIllll[12]);
                                            "".length();
                                            "".length();
                                            if ("   ".length() == 0) {
                                                return;
                                            }
                                        } else {
                                            i3++;
                                            "".length();
                                            if (((((95 + 131) - 167) + 102) ^ (((84 + 140) - 114) + 54)) == 0) {
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
            C0020g.a(cE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0164, code lost:
        if (llIIIIIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.R.lllIIIllll[10]) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIIIIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.R.lllIIIllll[9]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lllIIIllll[1]];
        iArr5[lllIIIllll[0]] = lllIIIllll[7];
        if (llIIIIIIIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lllIIIllll[1]];
            iArr6[lllIIIllll[0]] = lllIIIllll[7];
            if (llIIIIIIIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lllIIIllll[1]];
                iArr7[lllIIIllll[0]] = lllIIIllll[7];
            }
            iArr = new int[lllIIIllll[1]];
            iArr[lllIIIllll[0]] = lllIIIllll[8];
            if (llIIIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lllIIIllll[8], lllIIIllll[1], lllIIIllll[81]));
                "".length();
            }
            if (llIIIIIIIllII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIIIllII[lllIIIllll[88]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(lllIIIllll[82], lllIIIllll[10], lllIIIllll[83]));
                "".length();
            }
            iArr2 = new int[lllIIIllll[1]];
            iArr2[lllIIIllll[0]] = lllIIIllll[17];
            if (llIIIIIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIIllll[1]];
                iArr8[lllIIIllll[0]] = lllIIIllll[17];
                if (llIIIIIIIlIlI(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIIIllll[1]];
                    iArr9[lllIIIllll[0]] = lllIIIllll[17];
                }
                iArr3 = new int[lllIIIllll[1]];
                iArr3[lllIIIllll[0]] = lllIIIllll[11];
                if (llIIIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(lllIIIllll[11], lllIIIllll[4], C0023j.cf));
                    "".length();
                }
                iArr4 = new int[lllIIIllll[1]];
                iArr4[lllIIIllll[0]] = lllIIIllll[6];
                if (llIIIIIIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIIllll[1]];
                    iArr10[lllIIIllll[0]] = lllIIIllll[6];
                    if (!llIIIIIIIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr11 = new int[lllIIIllll[1]];
                    iArr11[lllIIIllll[0]] = lllIIIllll[6];
                    if (!llIIIIIIIlIll(Bank.getFirst(iArr11).getQuantity(), lllIIIllll[28])) {
                        return;
                    }
                }
                bv.add(new C0017d(lllIIIllll[6], lllIIIllll[54], lllIIIllll[85]));
                "".length();
            }
            bv.add(new C0017d(lllIIIllll[17], lllIIIllll[12], lllIIIllll[84]));
            "".length();
            iArr3 = new int[lllIIIllll[1]];
            iArr3[lllIIIllll[0]] = lllIIIllll[11];
            if (llIIIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lllIIIllll[1]];
            iArr4[lllIIIllll[0]] = lllIIIllll[6];
            if (llIIIIIIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIIllll[6], lllIIIllll[54], lllIIIllll[85]));
            "".length();
        }
        bv.add(new C0017d(lllIIIllll[7], lllIIIllll[9], lllIIIllll[80]));
        "".length();
        iArr = new int[lllIIIllll[1]];
        iArr[lllIIIllll[0]] = lllIIIllll[8];
        if (llIIIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIIIIIIIllII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllIIIllII[lllIIIllll[88]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lllIIIllll[1]];
        iArr2[lllIIIllll[0]] = lllIIIllll[17];
        if (llIIIIIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIllll[17], lllIIIllll[12], lllIIIllll[84]));
        "".length();
        iArr3 = new int[lllIIIllll[1]];
        iArr3[lllIIIllll[0]] = lllIIIllll[11];
        if (llIIIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lllIIIllll[1]];
        iArr4[lllIIIllll[0]] = lllIIIllll[6];
        if (llIIIIIIIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(lllIIIllll[6], lllIIIllll[54], lllIIIllll[85]));
        "".length();
    }

    private static boolean llIIIIIIlIIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIIIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIIIIllIl(Object obj) {
        return obj != null;
    }

    private static void dw() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIIIIIIllIl(nearest) && llIIIIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIllII[lllIIIllll[76]];
            C0000a.a(nearest);
        }
        if (llIIIIIIIllIl(nearest) && llIIIIIIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllIIIllll[2]);
                "".length();
                Time.sleepTicks(lllIIIllll[5]);
                "".length();
            }
            if (llIIIIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = lllIIIllII[lllIIIllll[77]];
                if (llIIIIIIIlIlI(lI ? 1 : 0)) {
                    int[] iArr = new int[lllIIIllll[1]];
                    iArr[lllIIIllll[0]] = lllIIIllll[48];
                    if (llIIIIIIIllII(Inventory.contains(iArr) ? 1 : 0) && llIIIIIIIlllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIIIllll[4]);
                        "".length();
                    }
                }
                if (llIIIIIIIlllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lllIIIllll[3]);
                    "".length();
                }
                if (llIIIIIIIlIlI(lI ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIIllll[1]];
                    iArr2[lllIIIllll[0]] = lllIIIllll[48];
                    if (llIIIIIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                        C0000a.a(lllIIIllll[11], lllIIIllll[1]);
                        C0000a.a(lllIIIllll[6], lllIIIllll[12]);
                        C0000a.a(lllIIIllll[48], lllIIIllll[1]);
                        C0000a.a(lllIIIllll[24], lllIIIllll[1]);
                        C0000a.a(lllIIIllll[46], lllIIIllll[1]);
                        Time.sleepTicks(lllIIIllll[1]);
                        "".length();
                        int[] iArr3 = new int[lllIIIllll[1]];
                        iArr3[lllIIIllll[0]] = lllIIIllll[11];
                        if (llIIIIIIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            C0000a.a(lllIIIllll[78], lllIIIllll[1]);
                        }
                        C0000a.a(lllIIIllll[17], Inventory.getFreeSlots() - lllIIIllll[1]);
                    }
                }
                if (llIIIIIIIlIlI(lI ? 1 : 0)) {
                    int[] iArr4 = new int[lllIIIllll[1]];
                    iArr4[lllIIIllll[0]] = lllIIIllll[48];
                    if (llIIIIIIIllII(Inventory.contains(iArr4) ? 1 : 0)) {
                        if (llIIIIIIIllII(Equipment.contains(C0019f.aW) ? 1 : 0) && llIIIIIIIllII(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                            C0000a.b(C0019f.aW, lllIIIllll[1]);
                        }
                        if (llIIIIIIIlIlI(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                            Inventory.getFirst(C0019f.aW).interact(lllIIIllII[lllIIIllll[79]]);
                            Time.sleepTicks(lllIIIllll[5]);
                            "".length();
                        }
                        if (llIIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lllIIIllll[10]);
                            "".length();
                        }
                        if (llIIIIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a(lllIIIllll[11], lllIIIllll[1]);
                            C0000a.a(lllIIIllll[6], lllIIIllll[12]);
                            C0000a.a(lllIIIllll[7], lllIIIllll[9]);
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIIIIIlIIll(int i, int i2) {
        return i != i2;
    }

    private static void dv() {
        if (llIIIIIIlIlII(lP)) {
            if (llIIIIIIIllII(Vars.getBit(lllIIIllll[70])) && llIIIIIIIllII(Vars.getBit(lllIIIllll[71]))) {
                return;
            }
            String[] strArr = new String[lllIIIllll[10]];
            strArr[lllIIIllll[0]] = lG.get(Integer.valueOf(Vars.getBit(lllIIIllll[70])));
            strArr[lllIIIllll[1]] = lG.get(Integer.valueOf(Vars.getBit(lllIIIllll[71])));
            strArr[lllIIIllll[3]] = lG.get(Integer.valueOf(Vars.getBit(lllIIIllll[72])));
            strArr[lllIIIllll[5]] = lG.get(Integer.valueOf(Vars.getBit(lllIIIllll[73])));
            strArr[lllIIIllll[4]] = lG.get(Integer.valueOf(Vars.getBit(lllIIIllll[74])));
            lP = strArr;
            System.out.println("Say the following in order: " + String.join(lllIIIllII[lllIIIllll[75]], lP));
        }
    }

    private static boolean llIIIIIIIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIIIllll(int i) {
        return i < 0;
    }

    private static String lIlllllllIlIl(String lllllllllllllllllIlllIllIlllIIII, String lllllllllllllllllIlllIllIllIllll) {
        String lllllllllllllllllIlllIllIlllIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIllIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlllIllIllIllll.toCharArray();
        int lllllllllllllllllIlllIllIllIllII = lllIIIllll[0];
        char[] charArray2 = lllllllllllllllllIlllIllIlllIIII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIllll[0];
        while (llIIIIIIIlIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlllIllIllIllII % charArray.length]));
            "".length();
            lllllllllllllllllIlllIllIllIllII++;
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIIIllll[3]];
        iArr[lllIIIllll[0]] = lllIIIllll[6];
        iArr[lllIIIllll[1]] = lllIIIllll[8];
        int lllllllllllllllllIlllIlllIIlIIII = lllIIIllll[0];
        while (llIIIIIIIlIll(lllllllllllllllllIlllIlllIIlIIII, iArr.length)) {
            int[] iArr2 = new int[lllIIIllll[1]];
            iArr2[lllIIIllll[0]] = iArr[lllllllllllllllllIlllIlllIIlIIII];
            if (llIIIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIIIllll[0];
            }
            lllllllllllllllllIlllIlllIIlIIII++;
            "".length();
            if (0 != 0) {
                return ((((67 + 87) - (-4)) + 7) ^ (((46 + 108) - 135) + 129)) & (((103 ^ 79) ^ (92 ^ 69)) ^ (-" ".length()));
            }
        }
        return lllIIIllll[1];
    }

    private static int llIIIIIIIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIIIIlIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIIIIIlllI(int i) {
        return i > 0;
    }

    private static void llIIIIIIIlIII() {
        lllIIIllll = new int[122];
        lllIIIllll[0] = (106 ^ 61) & ((126 ^ 41) ^ (-1));
        lllIIIllll[1] = " ".length();
        lllIIIllll[2] = (-((-4611) & 32307)) & (-67) & 32762;
        lllIIIllll[3] = "  ".length();
        lllIIIllll[4] = (((142 + 100) - 168) + 117) ^ (((90 + 130) - 79) + 46);
        lllIIIllll[5] = "   ".length();
        lllIIIllll[6] = (-(((75 + 3) - (-84)) + 7)) & (-8193) & 16367;
        lllIIIllll[7] = (-22962) & 23487;
        lllIIIllll[8] = (-30757) & 32685;
        lllIIIllll[9] = 51 ^ 42;
        lllIIIllll[10] = 10 ^ 15;
        lllIIIllll[11] = (-19629) & 32253;
        lllIIIllll[12] = 97 ^ 107;
        lllIIIllll[13] = (-(43 ^ 34)) & (-7189) & 8191;
        lllIIIllll[14] = (-28689) & 29688;
        lllIIIllll[15] = (110 ^ 98) ^ (118 ^ 72);
        lllIIIllll[16] = 58 ^ 60;
        lllIIIllll[17] = (-((-8489) & 32557)) & (-1) & 24447;
        lllIIIllll[18] = 2 ^ 5;
        lllIIIllll[19] = (((133 + 25) - 69) + 59) ^ (((76 + 4) - (-40)) + 36);
        lllIIIllll[20] = (((80 + 130) - 116) + 54) ^ (((21 + 43) - (-35)) + 58);
        lllIIIllll[21] = (-1) & 3199;
        lllIIIllll[22] = (-20545) & 24013;
        lllIIIllll[23] = (((77 + 1) - (-105)) + 21) ^ (((28 + 142) - 6) + 35);
        lllIIIllll[24] = (-12959) & 15358;
        lllIIIllll[25] = (23 ^ 120) ^ (3 ^ 96);
        lllIIIllll[26] = 159 ^ 146;
        lllIIIllll[27] = 61 ^ 51;
        lllIIIllll[28] = 142 ^ 129;
        lllIIIllll[29] = (76 ^ 15) ^ (241 ^ 162);
        lllIIIllll[30] = (21 ^ 113) ^ (62 ^ 75);
        lllIIIllll[31] = 60 ^ 46;
        lllIIIllll[32] = (30 ^ 9) ^ (125 ^ 121);
        lllIIIllll[33] = (100 ^ 30) ^ (168 ^ 198);
        lllIIIllll[34] = (188 ^ 148) ^ (45 ^ 16);
        lllIIIllll[35] = (64 ^ 15) ^ (194 ^ 155);
        lllIIIllll[36] = 112 ^ 103;
        lllIIIllll[37] = 135 ^ 159;
        lllIIIllll[38] = (94 ^ 75) ^ (201 ^ 198);
        lllIIIllll[39] = 130 ^ 153;
        lllIIIllll[40] = 74 ^ 86;
        lllIIIllll[41] = (((40 + 8) - 43) + 151) ^ (((57 + 124) - 84) + 32);
        lllIIIllll[42] = 40 ^ 54;
        lllIIIllll[43] = (85 ^ 24) ^ (144 ^ 194);
        lllIIIllll[44] = ((155 ^ 165) & ((122 ^ 68) ^ (-1))) ^ (88 ^ 120);
        lllIIIllll[45] = 94 ^ 127;
        lllIIIllll[46] = (-((-8197) & 26143)) & (-8325) & 28671;
        lllIIIllll[47] = 91 ^ 121;
        lllIIIllll[48] = (-((-1069) & 29869)) & (-513) & 31711;
        lllIIIllll[49] = 116 ^ 87;
        lllIIIllll[50] = (((30 + 38) - 4) + 83) ^ (((95 + 181) - 166) + 73);
        lllIIIllll[51] = 93 ^ 120;
        lllIIIllll[52] = 116 ^ 82;
        lllIIIllll[53] = (((57 + 122) - 98) + 90) ^ (((57 + 110) - 130) + 103);
        lllIIIllll[54] = 46 ^ 6;
        lllIIIllll[55] = (((74 + 115) - 81) + 40) ^ (((3 + 41) - (-36)) + 109);
        lllIIIllll[56] = 90 ^ 112;
        lllIIIllll[57] = (156 ^ 140) ^ (42 ^ 17);
        lllIIIllll[58] = (140 ^ 139) ^ (84 ^ 127);
        lllIIIllll[59] = (55 ^ 95) ^ (68 ^ 1);
        lllIIIllll[60] = (86 ^ 10) ^ (57 ^ 75);
        lllIIIllll[61] = 90 ^ 117;
        lllIIIllll[62] = (165 ^ 143) ^ (189 ^ 167);
        lllIIIllll[63] = 188 ^ 141;
        lllIIIllll[64] = (53 ^ 80) ^ (61 ^ 107);
        lllIIIllll[65] = 134 ^ 178;
        lllIIIllll[66] = 114 ^ 71;
        lllIIIllll[67] = (22 ^ 108) ^ (57 ^ 117);
        lllIIIllll[68] = 156 ^ 171;
        lllIIIllll[69] = (103 ^ 23) ^ (51 ^ 123);
        lllIIIllll[70] = (-((-18485) & 30973)) & (-16406) & 31455;
        lllIIIllll[71] = (-((-1283) & 5559)) & (-16705) & 23543;
        lllIIIllll[72] = (-((-10242) & 27773)) & (-4225) & 24319;
        lllIIIllll[73] = (-17505) & 20069;
        lllIIIllll[74] = (-((-158) & 29087)) & (-1113) & 32607;
        lllIIIllll[75] = 135 ^ 190;
        lllIIIllll[76] = 112 ^ 74;
        lllIIIllll[77] = 117 ^ 78;
        lllIIIllll[78] = (-18945) & 31571;
        lllIIIllll[79] = 34 ^ 30;
        lllIIIllll[80] = (-19489) & 20148;
        lllIIIllll[81] = (-((-196) & 20731)) & (-10249) & 32703;
        lllIIIllll[82] = (-((-12804) & 29463)) & (-4129) & 32767;
        lllIIIllll[83] = (-7748) & 32747;
        lllIIIllll[84] = (-26817) & 27116;
        lllIIIllll[85] = (-((-5735) & 24311)) & (-12292) & 32767;
        lllIIIllll[86] = 233 ^ 141;
        lllIIIllll[87] = 186 ^ 135;
        lllIIIllll[88] = (((158 + 119) - 273) + 182) ^ (((26 + 77) - 17) + 46);
        lllIIIllll[89] = (42 ^ 12) ^ (165 ^ 188);
        lllIIIllll[90] = (242 ^ 133) ^ (21 ^ 34);
        lllIIIllll[91] = (-12853) & 16055;
        lllIIIllll[92] = (-21129) & 24552;
        lllIIIllll[93] = (-8500) & 11703;
        lllIIIllll[94] = (-12359) & 15830;
        lllIIIllll[95] = (-((-17483) & 30287)) & (-65) & 16365;
        lllIIIllll[96] = (-(11 ^ 110)) & (-12802) & 16127;
        lllIIIllll[97] = (-((-22585) & 31355)) & (-16390) & 28655;
        lllIIIllll[98] = (-4183) & 14079;
        lllIIIllll[99] = (-((-9265) & 30071)) & (-8705) & 32623;
        lllIIIllll[100] = (-12934) & 16095;
        lllIIIllll[101] = (-((-2195) & 7095)) & (-24641) & 32767;
        lllIIIllll[102] = (-29249) & 32619;
        lllIIIllll[103] = (206 ^ 172) ^ (14 ^ 45);
        lllIIIllll[104] = 194 ^ 128;
        lllIIIllll[105] = (50 ^ 95) ^ (113 ^ 95);
        lllIIIllll[106] = 232 ^ 172;
        lllIIIllll[107] = " ".length() ^ (37 ^ 97);
        lllIIIllll[108] = (235 ^ 178) ^ (74 ^ 85);
        lllIIIllll[109] = (76 ^ 60) ^ (106 ^ 93);
        lllIIIllll[110] = (235 ^ 184) ^ (71 ^ 92);
        lllIIIllll[111] = 215 ^ 158;
        lllIIIllll[112] = (((10 + 0) - (-207)) + 24) ^ (((43 + 11) - 36) + 169);
        lllIIIllll[113] = (((124 + 197) - 125) + 37) ^ (((153 + 88) - 144) + 65);
        lllIIIllll[114] = 116 ^ 56;
        lllIIIllll[115] = (((180 + 173) - 280) + 155) ^ (((131 + 32) - 18) + 24);
        lllIIIllll[116] = 225 ^ 175;
        lllIIIllll[117] = (((132 + 47) - 28) + 71) ^ (((52 + 9) - (-16)) + 68);
        lllIIIllll[118] = (20 ^ 112) ^ (149 ^ 161);
        lllIIIllll[119] = 77 ^ 28;
        lllIIIllll[120] = (((72 + 39) - 91) + 185) ^ (((107 + 50) - 110) + 112);
        lllIIIllll[121] = (((46 + 151) - 9) + 57) ^ (((159 + 42) - 190) + 155);
    }

    private static String lIlllllllIllI(String lllllllllllllllllIlllIllIlIllIIl, String lllllllllllllllllIlllIllIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIllIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), lllIIIllll[19]), "DES");
            Cipher lllllllllllllllllIlllIllIlIlllIl = Cipher.getInstance("DES");
            lllllllllllllllllIlllIllIlIlllIl.init(lllIIIllll[3], lllllllllllllllllIlllIllIlIllllI);
            return new String(lllllllllllllllllIlllIllIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIllIlIlllII) {
            lllllllllllllllllIlllIllIlIlllII.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIIIlIII();
        lIllllllllIll();
        lH = lllIIIllII[lllIIIllll[90]];
        lG = new S();
        bv = new ArrayList();
        de = new WorldPoint(lllIIIllll[91], lllIIIllll[92], lllIIIllll[0]);
        lJ = new WorldPoint(lllIIIllll[93], lllIIIllll[94], lllIIIllll[0]);
        lK = new WorldPoint(lllIIIllll[93], lllIIIllll[95], lllIIIllll[3]);
        lL = new WorldPoint(lllIIIllll[96], lllIIIllll[97], lllIIIllll[0]);
        lM = new WorldPoint(lllIIIllll[96], lllIIIllll[98], lllIIIllll[0]);
        lN = new WorldPoint(lllIIIllll[99], lllIIIllll[100], lllIIIllll[1]);
        lO = new WorldPoint(lllIIIllll[101], lllIIIllll[102], lllIIIllll[0]);
        String[] strArr = new String[lllIIIllll[31]];
        strArr[lllIIIllll[0]] = lllIIIllII[lllIIIllll[103]];
        strArr[lllIIIllll[1]] = lllIIIllII[lllIIIllll[104]];
        strArr[lllIIIllll[3]] = lllIIIllII[lllIIIllll[105]];
        strArr[lllIIIllll[5]] = lllIIIllII[lllIIIllll[106]];
        strArr[lllIIIllll[4]] = lllIIIllII[lllIIIllll[107]];
        strArr[lllIIIllll[10]] = lllIIIllII[lllIIIllll[108]];
        strArr[lllIIIllll[16]] = lllIIIllII[lllIIIllll[109]];
        strArr[lllIIIllll[18]] = lllIIIllII[lllIIIllll[110]];
        strArr[lllIIIllll[19]] = lllIIIllII[lllIIIllll[111]];
        strArr[lllIIIllll[20]] = lllIIIllII[lllIIIllll[112]];
        strArr[lllIIIllll[12]] = lllIIIllII[lllIIIllll[113]];
        strArr[lllIIIllll[23]] = lllIIIllII[lllIIIllll[114]];
        strArr[lllIIIllll[25]] = lllIIIllII[lllIIIllll[115]];
        strArr[lllIIIllll[26]] = lllIIIllII[lllIIIllll[116]];
        strArr[lllIIIllll[27]] = lllIIIllII[lllIIIllll[117]];
        strArr[lllIIIllll[28]] = lllIIIllII[lllIIIllll[118]];
        strArr[lllIIIllll[29]] = lllIIIllII[lllIIIllll[119]];
        strArr[lllIIIllll[30]] = lllIIIllII[lllIIIllll[120]];
        cE = strArr;
    }

    private static boolean llIIIIIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIllllllllIll() {
        lllIIIllII = new String[lllIIIllll[121]];
        lllIIIllII[lllIIIllll[0]] = lIlllllllIlII("3PDz3n8Mmf7WWsH4tMJVoDw8PoCRxzRoLr1CeZUQpXVTQ0gq9P3zG1AnPl2hf4WA", "dTycj");
        lllIIIllII[lllIIIllll[1]] = lIlllllllIlIl("AhMDYQcjUhcgHSc=", "LruAs");
        lllIIIllII[lllIIIllll[3]] = lIlllllllIlIl("LRkeNQYMFhdxCAQWGzgEAg==", "expQj");
        lllIIIllII[lllIIIllll[5]] = lIlllllllIlIl("BAhDFwM2TQ4fAiAEDRFRIhgGBQVzHhYGAT8EBgVdcx4UHwUwBQoYFnMZDFYzBjQqODY=", "Smcvq");
        lllIIIllII[lllIIIllll[4]] = lIlllllllIllI("05p2BDVOaP8GZ5fwN/D8XMvvnkeRqUCpQ/8JA9w52bHctSK0vWKfLpLrgFbOCjjKzSHVok6vVj8=", "FmXFQ");
        lllIIIllII[lllIIIllll[10]] = lIlllllllIllI("p6jDJmOXGEk=", "WKmJr");
        lllIIIllII[lllIIIllll[16]] = lIlllllllIlII("0wutZ5WwQ3E=", "iFfJG");
        lllIIIllII[lllIIIllll[18]] = lIlllllllIlIl("FyUb", "RDoZt");
        lllIIIllII[lllIIIllll[19]] = lIlllllllIlII("QU77spGoKzvH2/Yg69mlFA==", "ZRPdJ");
        lllIIIllII[lllIIIllll[20]] = lIlllllllIllI("eM7Twe3veWI=", "VbGfM");
        lllIIIllII[lllIIIllll[12]] = lIlllllllIllI("uB4UXf0+k3koWsWIy9zrb8s8ojsnS26Y", "ZDDby");
        lllIIIllII[lllIIIllll[23]] = lIlllllllIlIl("AT88TxsgLz0GJQ==", "RVNoK");
        lllIIIllII[lllIIIllll[25]] = lIlllllllIllI("fAc5ND7oo6pt+CHW6RS/wg==", "BEQqS");
        lllIIIllII[lllIIIllll[26]] = lIlllllllIllI("KnzdElrXf7EVSCRVJnOGPg==", "oovnn");
        lllIIIllII[lllIIIllll[27]] = lIlllllllIlIl("Ohg0DgYQF2QoCA8QKg==", "yyDzg");
        lllIIIllII[lllIIIllll[28]] = lIlllllllIllI("mIYHR+DZvM/D/QYw82UVbg==", "juFsN");
        lllIIIllII[lllIIIllll[29]] = lIlllllllIlII("qJdoKorWYb8QKzTnUJQi9A==", "xmIcd");
        lllIIIllII[lllIIIllll[30]] = lIlllllllIlII("VHi3x9+FqAIEGtDZUIJy4A==", "fAYRr");
        lllIIIllII[lllIIIllll[31]] = lIlllllllIllI("yUlWNlnrgRA=", "tnKeC");
        lllIIIllII[lllIIIllll[32]] = lIlllllllIllI("ig0AiPbp4LdZTWdH17H9ZA==", "wiLQD");
        lllIIIllII[lllIIIllll[33]] = lIlllllllIllI("Kliy3G43A0gqRTcvLvf1i9TijbrF3gd7", "Jybhm");
        lllIIIllII[lllIIIllll[34]] = lIlllllllIlII("me/OMrfyawc=", "SEgaZ");
        lllIIIllII[lllIIIllll[35]] = lIlllllllIlIl("OjQPLyobMA==", "wUaGE");
        lllIIIllII[lllIIIllll[36]] = lIlllllllIllI("bTEMGK6A1Bg=", "MAyBM");
        lllIIIllII[lllIIIllll[37]] = lIlllllllIlII("kC/4wKrGvY0=", "xBmtm");
        lllIIIllII[lllIIIllll[9]] = lIlllllllIllI("XM+xnsDGG7Y=", "ccyaN");
        lllIIIllII[lllIIIllll[38]] = lIlllllllIlIl("IDQtIh4BMA==", "mUCJq");
        lllIIIllII[lllIIIllll[39]] = lIlllllllIlIl("ISQjJjoAIA==", "lEMNU");
        lllIIIllII[lllIIIllll[40]] = lIlllllllIlII("3L9l6QZt76chIDbhmgxf1Q==", "RMcaq");
        lllIIIllII[lllIIIllll[41]] = lIlllllllIlII("ErqIDrVthow=", "GFFWt");
        lllIIIllII[lllIIIllll[42]] = lIlllllllIlII("ZrkvP9QGI6/jH3wkoFb+Kw==", "ElsJu");
        lllIIIllII[lllIIIllll[43]] = lIlllllllIlIl("FTMyGRRnLSQU", "GFAmm");
        lllIIIllII[lllIIIllll[44]] = lIlllllllIllI("flN7JH1DBHmAyaFkp2fPng==", "rYYwZ");
        lllIIIllII[lllIIIllll[45]] = lIlllllllIlIl("HyoAEg==", "KKkww");
        lllIIIllII[lllIIIllll[47]] = lIlllllllIlII("Yo4KwciWghhZBCP+BevX0A==", "TxxqJ");
        lllIIIllII[lllIIIllll[49]] = lIlllllllIlIl("JQ4jDwk=", "gaMjz");
        lllIIIllII[lllIIIllll[50]] = lIlllllllIllI("BzaQnMPMlRA=", "NmKHC");
        lllIIIllII[lllIIIllll[51]] = lIlllllllIlII("rMMAd+dierNebwuRAgY54g==", "DmPtf");
        lllIIIllII[lllIIIllll[52]] = lIlllllllIlIl("GT8iJAAqdgw3Eyc0Nzcc", "NVXEr");
        lllIIIllII[lllIIIllll[53]] = lIlllllllIllI("FDcSJ8IfLiMO2jWhboUNJQ==", "eDYwK");
        lllIIIllII[lllIIIllll[54]] = lIlllllllIlIl("KxQ6SRcKVT8AEUUFNRsQDBs=", "euLic");
        lllIIIllII[lllIIIllll[55]] = lIlllllllIllI("ljfhBXHlQa41JGuDfmJ0QQ==", "OtoGu");
        lllIIIllII[lllIIIllll[56]] = lIlllllllIlII("EDor1L+Ecp5fR36t1cTCIw==", "HkdcV");
        lllIIIllII[lllIIIllll[57]] = lIlllllllIlIl("ARUnOhExGA==", "EpKHx");
        lllIIIllII[lllIIIllll[58]] = lIlllllllIllI("S5afgQprwjNxfB8dQCO/qrAKDO/9Zs4y", "fWyFF");
        lllIIIllII[lllIIIllll[59]] = lIlllllllIlII("jsxaz8aJxiQkDmvTv74ldg==", "yMXjL");
        lllIIIllII[lllIIIllll[60]] = lIlllllllIlII("OL5SXoUGxtI=", "Kivra");
        lllIIIllII[lllIIIllll[61]] = lIlllllllIlII("opAplboU4ZtiyTkfWeczZLRzXw+jSIhS", "TOMNN");
        lllIIIllII[lllIIIllll[62]] = lIlllllllIllI("aG5QHyVCZwI=", "jtLyp");
        lllIIIllII[lllIIIllll[63]] = lIlllllllIlII("PqhH7/2Q1vc=", "ESMFa");
        lllIIIllII[lllIIIllll[15]] = lIlllllllIllI("tyPNGkcFwgc=", "iFKQy");
        lllIIIllII[lllIIIllll[64]] = lIlllllllIllI("M9h+qygpdXU=", "tQLUb");
        lllIIIllII[lllIIIllll[65]] = lIlllllllIlIl("FwEsFxk9", "VuXvz");
        lllIIIllII[lllIIIllll[66]] = lIlllllllIllI("VyhOQldOHFZB0R4ZN1ayQw==", "jafDE");
        lllIIIllII[lllIIIllll[67]] = lIlllllllIllI("h8jlCMkFpWA=", "SgPtx");
        lllIIIllII[lllIIIllll[68]] = lIlllllllIllI("pm7llQxvQPl8xuq/zaGsfD/f+omQsXfE", "oSgtO");
        lllIIIllII[lllIIIllll[69]] = lIlllllllIlII("DiLYrKidcD9MRS7sYyUPXw==", "ZTDTf");
        lllIIIllII[lllIIIllll[75]] = lIlllllllIlII("5Ktrs/CoDXY=", "Olwyp");
        lllIIIllII[lllIIIllll[76]] = lIlllllllIllI("VI4t2753JEujFR0zi3xdzg==", "ExFjw");
        lllIIIllII[lllIIIllll[77]] = lIlllllllIlIl("KzsPFTgKNAZRNgI0Chg6BA==", "cZaqT");
        lllIIIllII[lllIIIllll[79]] = lIlllllllIlII("HuZR43dQGhQ=", "AxbJm");
        lllIIIllII[lllIIIllll[87]] = lIlllllllIlIl("AQMfBSFlNR4LNiAU", "EfrjO");
        lllIIIllII[lllIIIllll[88]] = lIlllllllIllI("TUVhFw7uONzKQlKB0sQ2meI0CvVf5HIn", "lAPaX");
        lllIIIllII[lllIIIllll[89]] = lIlllllllIlIl("OAYjKiMr", "OoYKQ");
        lllIIIllII[lllIIIllll[90]] = lIlllllllIllI("Un3/40riR4Jufu0DEJXBN65wiPkPtITFFy/hWkf9yQGGWm50TEEWew==", "pCKhI");
        lllIIIllII[lllIIIllll[103]] = lIlllllllIlII("Q0FxX9uHVi0=", "XYvyV");
        lllIIIllII[lllIIIllll[104]] = lIlllllllIlIl("MSssUDQALiYeUDYvKAkVF2MYBRUWNw==", "eCIpp");
        lllIIIllII[lllIIIllll[105]] = lIlllllllIlIl("LQ45IV1CEjA9AwdFMStRCgBneDhFCTR4GgsJNHgZCwh4Ph4QRSE3BEM=", "beXXq");
        lllIIIllII[lllIIIllll[106]] = lIlllllllIllI("tOFZBzlEdtHCHqpVo1EwRAbl5BrDY96QgBzhu6L5dwk=", "EiHMN");
        lllIIIllII[lllIIIllll[107]] = lIlllllllIllI("GZ+vo5hG1b+VPLWPEPml5CQaoeihjUIXOqchHhvGNvQdGUa/j0Ej7g==", "CAyfd");
        lllIIIllII[lllIIIllll[108]] = lIlllllllIllI("nqB2zGhyPKxvSAK/miuGlCCY+lGOmxUsn/LDC4JHxe3Faq1Hc3uZiY5a/dqUuJ7H", "pniFI");
        lllIIIllII[lllIIIllll[109]] = lIlllllllIlIl("GEwKDgg1TBAETTcFCg9NAgUIHQgjAA0MBSVC", "Qldkm");
        lllIIIllII[lllIIIllll[110]] = lIlllllllIlII("8i5vCXA4TuPQAaVm8dzvVeqCR0U7O4XwfQBLy8BIZD55371uQbCB2IkAL+khiZtmjpKh+Uygf18=", "eKiML");
        lllIIIllII[lllIIIllll[111]] = lIlllllllIlIl("MBpFHQoVEEUXBkMBDR9DCBAcCUI=", "cuezc");
        lllIIIllII[lllIIIllll[112]] = lIlllllllIlIl("EgoDQgFrBB4NP2dPEhc8axsYCztrBgNCISYfHxA8KgEETA==", "KopbH");
        lllIIIllII[lllIIIllll[113]] = lIlllllllIllI("yB5+NS/aaIGqJtRsN40rl/XXKm9TlQLLlGYbCdVkE3g+in5WebXx8l98GUOTl1Kr", "VMKCF");
        lllIIIllII[lllIIIllll[114]] = lIlllllllIllI("O2AmFj4hUSjSk4hLpUtyVQ==", "oynHx");
        lllIIIllII[lllIIIllll[115]] = lIlllllllIlIl("GCRfNUg/PwxmHDk1FWYfOT9YJxo0cB8pAT83WDIHcTYRIQAlcAwuDXE0HSsHP3xYLxx2I1grDX8=", "QPxFh");
        lllIIIllII[lllIIIllll[116]] = lIlllllllIlII("9J5Gsu/RjsVIOZ2Kr0xTHOF+OHjLCN9kKjDORcajeALrqSAWeH/BDESl3yuA9tlD", "JByCj");
        lllIIIllII[lllIIIllll[117]] = lIlllllllIlIl("PhkRVgkAFUgeCEkWAQAISQgHA00GHw1WAg9RHB4ISRoNDx5JBQATA1Y=", "iqhvm");
        lllIIIllII[lllIIIllll[118]] = lIlllllllIllI("G6UMa7uL2E4At/On7Wq4bnAqplaj7rutrYVT/y+bbxw=", "CfkFh");
        lllIIIllII[lllIIIllll[119]] = lIlllllllIllI("VnGw0qtjMawKHKdmgofkIeTtHoIDauheNAR0pRnZ/TLpsDSehe8piueNs9QGuA9m", "lsQad");
        lllIIIllII[lllIIIllll[120]] = lIlllllllIlII("JBLZQasJy/S2Gif0m9U1cldQEMu50YLNIhzqtKJQOSY=", "hZFdv");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIIllll[0];
    }

    private static boolean llIIIIIIlIlII(Object obj) {
        return obj == null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIIllII[lllIIIllll[87]];
    }

    private static String lIlllllllIlII(String lllllllllllllllllIlllIlllIIIIIII, String lllllllllllllllllIlllIllIlllllll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlllIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlllIIIIIlI.init(lllIIIllll[3], lllllllllllllllllIlllIlllIIIIIll);
            return new String(lllllllllllllllllIlllIlllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlllIIIIIIl) {
            lllllllllllllllllIlllIlllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIllII(int i) {
        return i == 0;
    }
}

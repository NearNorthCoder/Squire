package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.K  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/K.class */
public class K implements W {
    static /* synthetic */ WorldPoint iY;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldPoint iV;
    private final /* synthetic */ int ja = lIlIIlIlI[0];
    static /* synthetic */ WorldPoint iX;
    static /* synthetic */ WorldPoint iT;
    static /* synthetic */ WorldPoint iW;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] iZ;
    private static /* synthetic */ String[] lIlIIlIIl;
    static /* synthetic */ int cl;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIlIIlIlI;
    static /* synthetic */ WorldPoint iU;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint bX;
    public static /* synthetic */ boolean iS;
    private static final /* synthetic */ String iR;
    private static final /* synthetic */ HashMap<Integer, String> iQ;

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0b39, code lost:
        if (lIIIlIlIllll(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v195, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v292, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v548, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v551, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v573, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ce() {
        if (lIIIlIlIllII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIlIlIllIl(bv.size(), lIlIIlIlI[1])) {
                System.out.println(lIlIIlIIl[lIlIIlIlI[0]]);
                bt = lIlIIlIlI[0];
            }
        }
        if (lIIIlIlIlllI(bt ? 1 : 0)) {
            if (lIIIlIlIlllI(ab() ? 1 : 0) && lIIIlIlIlllI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIlIlIllll(nearest) && lIIIlIlIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[1]];
                    C0000a.a(nearest);
                }
                if (lIIIlIlIllll(nearest) && lIIIlIlIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIlIlI[2]);
                        "".length();
                    }
                    if (lIIIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[3]];
                        if (lIIIlIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIlIlI[4]);
                            "".length();
                        }
                        if (lIIIlIllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIlIlI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIIlIlI[5]];
                        iArr[lIlIIlIlI[0]] = lIlIIlIlI[6];
                        iArr[lIlIIlIlI[1]] = lIlIIlIlI[7];
                        iArr[lIlIIlIlI[3]] = lIlIIlIlI[8];
                        if (lIIIlIlIlllI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIIlIIl[lIlIIlIlI[5]]);
                            bt = lIlIIlIlI[1];
                            return;
                        }
                        int[] iArr2 = new int[lIlIIlIlI[1]];
                        iArr2[lIlIIlIlI[0]] = lIlIIlIlI[7];
                        if (lIIIlIlIllII(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIlIIlIlI[1]];
                            iArr3[lIlIIlIlI[0]] = lIlIIlIlI[7];
                            if (lIIIlIlIllIl(Bank.getFirst(iArr3).getQuantity(), lIlIIlIlI[9])) {
                                af();
                                System.out.println(lIlIIlIIl[lIlIIlIlI[4]]);
                                bt = lIlIIlIlI[1];
                                return;
                            }
                        }
                        int[] iArr4 = new int[lIlIIlIlI[5]];
                        iArr4[lIlIIlIlI[0]] = lIlIIlIlI[6];
                        iArr4[lIlIIlIlI[1]] = lIlIIlIlI[7];
                        iArr4[lIlIIlIlI[3]] = lIlIIlIlI[8];
                        if (lIIIlIlIllII(C0004e.b(iArr4) ? 1 : 0)) {
                            if (lIIIlIlIlllI(Equipment.contains(C0005f.aR) ? 1 : 0) && lIIIlIlIlllI(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                                C0000a.b(C0005f.aR, lIlIIlIlI[1]);
                            }
                            if (lIIIlIlIllII(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                                Inventory.getFirst(C0005f.aR).interact(lIlIIlIIl[lIlIIlIlI[10]]);
                                Time.sleepTicks(lIlIIlIlI[5]);
                                "".length();
                            }
                            if (lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIlIIlIlI[5]);
                                "".length();
                            }
                            C0000a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                            C0000a.a(lIlIIlIlI[8], lIlIIlIlI[1]);
                            C0000a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                            C0000a.a(lIlIIlIlI[13], lIlIIlIlI[14]);
                        }
                    }
                }
            }
            if (lIIIlIlIllII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIlIlIllIl(Movement.getRunEnergy(), lIlIIlIlI[15])) {
                Inventory.getFirst(C0005f.aV).interact(lIlIIlIIl[lIlIIlIlI[16]]);
                Time.sleepTicks(lIlIIlIlI[1]);
                "".length();
            }
            int[] iArr5 = new int[lIlIIlIlI[1]];
            iArr5[lIlIIlIlI[0]] = lIlIIlIlI[17];
            if (lIIIlIlIllII(Inventory.contains(iArr5) ? 1 : 0) && lIIIlIllIIIl(lIIIlIlIlIll(C0004e.u(), 55.0d))) {
                int[] iArr6 = new int[lIlIIlIlI[1]];
                iArr6[lIlIIlIlI[0]] = lIlIIlIlI[17];
                Inventory.getFirst(iArr6).interact(lIlIIlIIl[lIlIIlIlI[18]]);
            }
            if (lIIIlIlIllII(ab() ? 1 : 0) && lIIIlIlIlllI(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                if (lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIlIlI[4]) && lIIIlIlIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[19]];
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIlIIlIlI[1]);
                    "".length();
                }
                if (lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIlIlI[4])) {
                    C0006g.a(lIlIIlIIl[lIlIIlIlI[20]], bR);
                }
            }
            if (lIIIlIllIlII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[1])) {
                WorldArea worldArea = new WorldArea(lIlIIlIlI[21], lIlIIlIlI[22], lIlIIlIlI[19], lIlIIlIlI[18], lIlIIlIlI[0]);
                if (lIIIlIlIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[12]];
                    Movement.walkTo(iT);
                    "".length();
                    Time.sleepTicks(lIlIIlIlI[1]);
                    "".length();
                }
                if (lIIIlIlIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIlIIlIIl[lIlIIlIlI[23]], bR);
                }
            }
            if (lIIIlIllIlII(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[3])) {
                cl = lIlIIlIlI[0];
                int[] iArr7 = new int[lIlIIlIlI[1]];
                iArr7[lIlIIlIlI[0]] = lIlIIlIlI[24];
                if (lIIIlIlIlllI(Inventory.contains(iArr7) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIlIlI[1]];
                    strArr[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[25]];
                    if (lIIIlIlIlllI(Equipment.contains(strArr) ? 1 : 0) && lIIIlIlIlllI(iS ? 1 : 0)) {
                        if (!lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iU), lIlIIlIlI[4]) || lIIIlIllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIlIIlIlI[3])) {
                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[26]];
                            Movement.walkTo(iU);
                            "".length();
                            Time.sleepTicks(lIlIIlIlI[1]);
                            "".length();
                        }
                        if (lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iU), lIlIIlIlI[4])) {
                            C0006g.a(lIlIIlIIl[lIlIIlIlI[27]], bR);
                        }
                    }
                }
                int[] iArr8 = new int[lIlIIlIlI[1]];
                iArr8[lIlIIlIlI[0]] = lIlIIlIlI[24];
                if (lIIIlIlIllII(Inventory.contains(iArr8) ? 1 : 0) && lIIIlIlIlllI(iS ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIlIlI[1]];
                    strArr2[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[28]];
                    if (lIIIlIlIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(iV), lIlIIlIlI[4])) {
                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[29]];
                            Movement.walkTo(iV);
                            "".length();
                            Time.sleepTicks(lIlIIlIlI[1]);
                            "".length();
                        }
                        if (lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iV), lIlIIlIlI[4])) {
                            String[] strArr3 = new String[lIlIIlIlI[1]];
                            strArr3[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[30]];
                            Item first = Inventory.getFirst(strArr3);
                            String[] strArr4 = new String[lIlIIlIlI[1]];
                            strArr4[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[31]];
                            first.useOn(TileObjects.getNearest(strArr4));
                            Time.sleepTicks(lIlIIlIlI[10]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIlIIlIlI[1]];
                    strArr5[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[32]];
                    if (lIIIlIlIlllI(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(iW), lIlIIlIlI[4])) {
                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[33]];
                            String[] strArr6 = new String[lIlIIlIlI[1]];
                            strArr6[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[34]];
                            if (lIIIlIlIllll(TileObjects.getNearest(strArr6))) {
                                String[] strArr7 = new String[lIlIIlIlI[1]];
                                strArr7[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[35]];
                                TileObject nearest2 = TileObjects.getNearest(strArr7);
                                String[] strArr8 = new String[lIlIIlIlI[1]];
                                strArr8[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[36]];
                                if (lIIIlIlIllII(nearest2.hasAction(strArr8) ? 1 : 0)) {
                                    String[] strArr9 = new String[lIlIIlIlI[1]];
                                    strArr9[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[37]];
                                    TileObjects.getNearest(strArr9).interact(lIlIIlIIl[lIlIIlIlI[9]]);
                                    Time.sleepTicks(lIlIIlIlI[3]);
                                    "".length();
                                }
                            }
                            String[] strArr10 = new String[lIlIIlIlI[1]];
                            strArr10[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[38]];
                            if (lIIIlIlIllll(TileObjects.getNearest(strArr10))) {
                                String[] strArr11 = new String[lIlIIlIlI[1]];
                                strArr11[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[39]];
                                TileObject nearest3 = TileObjects.getNearest(strArr11);
                                String[] strArr12 = new String[lIlIIlIlI[1]];
                                strArr12[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[40]];
                                if (lIIIlIlIllII(nearest3.hasAction(strArr12) ? 1 : 0)) {
                                    String[] strArr13 = new String[lIlIIlIlI[1]];
                                    strArr13[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[41]];
                                    TileObjects.getNearest(strArr13).interact(lIlIIlIIl[lIlIIlIlI[42]]);
                                    Time.sleepTicks(lIlIIlIlI[3]);
                                    "".length();
                                }
                            }
                            Movement.walkTo(iW);
                            "".length();
                            Time.sleepTicks(lIlIIlIlI[1]);
                            "".length();
                        }
                        if (lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iW), lIlIIlIlI[4])) {
                            String[] strArr14 = new String[lIlIIlIlI[1]];
                            strArr14[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[43]];
                            if (lIIIlIlIllll(TileObjects.getNearest(strArr14))) {
                                String[] strArr15 = new String[lIlIIlIlI[1]];
                                strArr15[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[44]];
                                TileObjects.getNearest(strArr15).interact(lIlIIlIIl[lIlIIlIlI[45]]);
                                Time.sleepTicks(lIlIIlIlI[4]);
                                "".length();
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lIlIIlIlI[1]];
                iArr9[lIlIIlIlI[0]] = lIlIIlIlI[24];
                if (lIIIlIlIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIlIlI[1]];
                    iArr10[lIlIIlIlI[0]] = lIlIIlIlI[46];
                    if (lIIIlIlIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                        iS = lIlIIlIlI[1];
                    }
                }
                if (lIIIlIlIllII(iS ? 1 : 0)) {
                    String[] strArr16 = new String[lIlIIlIlI[1]];
                    strArr16[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[47]];
                    if (lIIIlIlIlllI(Equipment.contains(strArr16) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIIlIlI[1]];
                        iArr11[lIlIIlIlI[0]] = lIlIIlIlI[48];
                        if (lIIIlIlIlllI(Inventory.contains(iArr11) ? 1 : 0)) {
                            String[] strArr17 = new String[lIlIIlIlI[1]];
                            strArr17[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[49]];
                            if (lIIIlIlIlllI(Inventory.contains(strArr17) ? 1 : 0)) {
                                cg();
                            }
                            String[] strArr18 = new String[lIlIIlIlI[1]];
                            strArr18[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[50]];
                            if (lIIIlIlIllII(Inventory.contains(strArr18) ? 1 : 0)) {
                                if (lIIIlIllIIlI(Players.getLocal().getWorldLocation().distanceTo(iX), lIlIIlIlI[3])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[51]];
                                    Movement.walkTo(iX);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIlI[1]);
                                    "".length();
                                }
                                if (lIIIlIllIIll(Players.getLocal().getWorldLocation().distanceTo(iX), lIlIIlIlI[3])) {
                                    C0006g.a(lIlIIlIIl[lIlIIlIlI[52]], bR);
                                }
                            }
                        }
                    }
                }
                if (lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] iArr12 = new int[lIlIIlIlI[1]];
                    iArr12[lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (lIIIlIlIllII(Inventory.contains(iArr12) ? 1 : 0)) {
                        String[] strArr19 = new String[lIlIIlIlI[1]];
                        strArr19[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[53]];
                        if (lIIIlIlIlllI(Equipment.contains(strArr19) ? 1 : 0)) {
                            int[] iArr13 = new int[lIlIIlIlI[1]];
                            iArr13[lIlIIlIlI[0]] = lIlIIlIlI[24];
                            if (lIIIlIlIlllI(Inventory.contains(iArr13) ? 1 : 0)) {
                                cg();
                            }
                            int[] iArr14 = new int[lIlIIlIlI[1]];
                            iArr14[lIlIIlIlI[0]] = lIlIIlIlI[24];
                            if (lIIIlIlIllII(Inventory.contains(iArr14) ? 1 : 0)) {
                                WorldArea worldArea2 = new WorldArea(lIlIIlIlI[21], lIlIIlIlI[22], lIlIIlIlI[19], lIlIIlIlI[18], lIlIIlIlI[0]);
                                if (lIIIlIlIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[54]];
                                    Movement.walkTo(iT);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIlI[1]);
                                    "".length();
                                }
                                if (lIIIlIlIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    C0006g.a(lIlIIlIIl[lIlIIlIlI[55]], bR);
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[lIlIIlIlI[1]];
                strArr20[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[56]];
                if (lIIIlIlIllII(Equipment.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lIlIIlIlI[1]];
                    strArr21[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[57]];
                    if (lIIIlIllIllI(NPCs.getNearest(strArr21))) {
                        String[] strArr22 = new String[lIlIIlIlI[1]];
                        strArr22[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[58]];
                        if (lIIIlIllIllI(NPCs.getNearest(strArr22))) {
                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[59]];
                            Movement.walkTo(iY);
                            "".length();
                            Time.sleepTicks(lIlIIlIlI[1]);
                            "".length();
                        }
                    }
                    String[] strArr23 = new String[lIlIIlIlI[1]];
                    strArr23[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[60]];
                    if (lIIIlIllIllI(NPCs.getNearest(strArr23))) {
                        String[] strArr24 = new String[lIlIIlIlI[1]];
                        strArr24[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[61]];
                    }
                    if (lIIIlIllIllI(iZ)) {
                        cf();
                    }
                    NPC nearest4 = NPCs.getNearest(npc -> {
                        if (lIIIlIlIllII(npc.getName().contains(lIlIIlIIl[lIlIIlIlI[89]]) ? 1 : 0) && lIIIlIlllIII(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIlIIlIlI[1];
                            "".length();
                            return (176 ^ 180) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIlI[0];
                    });
                    if (lIIIlIlIllll(nearest4) && lIIIlIllIllI(Players.getLocal().getInteracting())) {
                        nearest4.interact(lIlIIlIIl[lIlIIlIlI[62]]);
                        Time.sleepTicks(lIlIIlIlI[3]);
                        "".length();
                    }
                    if (lIIIlIllIllI(nearest4) && lIIIlIllIllI(Players.getLocal().getInteracting())) {
                        String[] strArr25 = new String[lIlIIlIlI[1]];
                        strArr25[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[63]];
                        if (lIIIlIlIllll(NPCs.getNearest(strArr25))) {
                            String[] strArr26 = new String[lIlIIlIlI[1]];
                            strArr26[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[15]];
                            if (lIIIlIlIlllI(NPCs.getNearest(strArr26).isDead() ? 1 : 0) && lIIIlIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr27 = new String[lIlIIlIlI[1]];
                                strArr27[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[64]];
                                NPCs.getNearest(strArr27).interact(lIlIIlIIl[lIlIIlIlI[65]]);
                            }
                        }
                    }
                    if (lIIIlIlIllII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[66]];
                        List options = Dialog.getOptions();
                        if (lIIIlIlIlllI(options.isEmpty() ? 1 : 0)) {
                            int i = lIlIIlIlI[0];
                            do {
                                if (lIIIlIlIllIl(i, options.size())) {
                                    if (lIIIlIlIllII(((Widget) options.get(i)).getText().contains(lIlIIlIIl[lIlIIlIlI[67]]) ? 1 : 0)) {
                                        String[] strArr28 = new String[lIlIIlIlI[1]];
                                        strArr28[lIlIIlIlI[0]] = ((Widget) options.get(i)).getText();
                                        Dialog.chooseOption(strArr28);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIlI[3]);
                                        "".length();
                                        "".length();
                                        if (((249 ^ 163) & ((239 ^ 181) ^ (-1))) < 0) {
                                            return;
                                        }
                                    } else {
                                        i++;
                                        "".length();
                                    }
                                }
                            } while (((114 ^ 57) ^ (251 ^ 180)) <= ((157 ^ 146) ^ (33 ^ 42)));
                            return;
                        }
                    }
                    String[] strArr29 = new String[lIlIIlIlI[1]];
                    strArr29[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[68]];
                    if (lIIIlIlIllll(NPCs.getNearest(strArr29))) {
                        if (lIIIlIlIllIl(cl, lIlIIlIlI[1]) && lIIIlIlIlllI(cm ? 1 : 0)) {
                            an.pP += lIlIIlIlI[1];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIlIIlIlI[1];
                            an.pP = lIlIIlIlI[0];
                            cm = lIlIIlIlI[1];
                        }
                        if (lIIIlIlIllII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[69]];
                            List options2 = Dialog.getOptions();
                            if (lIIIlIlIlllI(options2.isEmpty() ? 1 : 0)) {
                                int i2 = lIlIIlIlI[0];
                                while (lIIIlIlIllIl(i2, options2.size())) {
                                    String lllIlllIlllIIl = iZ[i2];
                                    int lllIlllIlllIII = lIlIIlIlI[0];
                                    while (true) {
                                        if (!lIIIlIlIllIl(lllIlllIlllIII, options2.size())) {
                                            break;
                                        } else if (lIIIlIlIllII(((Widget) options2.get(lllIlllIlllIII)).getText().contains(lllIlllIlllIIl) ? 1 : 0)) {
                                            System.out.println("Selecting: " + ((Widget) options2.get(lllIlllIlllIII)).getText());
                                            Time.sleepTicks(lIlIIlIlI[3]);
                                            "".length();
                                            String[] strArr30 = new String[lIlIIlIlI[1]];
                                            strArr30[lIlIIlIlI[0]] = ((Widget) options2.get(lllIlllIlllIII)).getText();
                                            Dialog.chooseOption(strArr30);
                                            "".length();
                                            Time.sleepTicks(lIlIIlIlI[12]);
                                            "".length();
                                            "".length();
                                            if ("  ".length() != "  ".length()) {
                                                return;
                                            }
                                        } else {
                                            lllIlllIlllIII++;
                                            "".length();
                                            if ("  ".length() <= 0) {
                                                return;
                                            }
                                        }
                                    }
                                    i2++;
                                    "".length();
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0006g.a(bR);
        }
    }

    private static void lIIIlIlIlIlI() {
        lIlIIlIlI = new int[122];
        lIlIIlIlI[0] = "  ".length() & ("  ".length() ^ (-1));
        lIlIIlIlI[1] = " ".length();
        lIlIIlIlI[2] = (-9304) & 14303;
        lIlIIlIlI[3] = "  ".length();
        lIlIIlIlI[4] = (((117 + 124) - 159) + 63) ^ (((77 + 138) - 97) + 31);
        lIlIIlIlI[5] = "   ".length();
        lIlIIlIlI[6] = (-((-4417) & 12657)) & (-129) & 16375;
        lIlIIlIlI[7] = (-((-17946) & 32443)) & (-1089) & 16111;
        lIlIIlIlI[8] = (-12311) & 14239;
        lIlIIlIlI[9] = (128 ^ 189) ^ (71 ^ 99);
        lIlIIlIlI[10] = 134 ^ 131;
        lIlIIlIlI[11] = (-1675) & 14299;
        lIlIIlIlI[12] = (168 ^ 139) ^ (59 ^ 18);
        lIlIIlIlI[13] = (-((-4835) & 32511)) & (-1) & 28671;
        lIlIIlIlI[14] = (-16387) & 17386;
        lIlIIlIlI[15] = (15 ^ 28) ^ (96 ^ 65);
        lIlIIlIlI[16] = 23 ^ 17;
        lIlIIlIlI[17] = (-((-665) & 32413)) & (-129) & 32255;
        lIlIIlIlI[18] = (41 ^ 51) ^ (46 ^ 51);
        lIlIIlIlI[19] = 79 ^ 71;
        lIlIIlIlI[20] = (((167 + 149) - 280) + 146) ^ (((155 + 45) - 52) + 43);
        lIlIIlIlI[21] = (-((-6245) & 23525)) & (-8193) & 28671;
        lIlIIlIlI[22] = (-((-11677) & 28637)) & (-4129) & 24557;
        lIlIIlIlI[23] = (119 ^ 76) ^ (246 ^ 198);
        lIlIIlIlI[24] = (-((-6193) & 32313)) & (-20) & 28539;
        lIlIIlIlI[25] = 48 ^ 60;
        lIlIIlIlI[26] = 71 ^ 74;
        lIlIIlIlI[27] = 133 ^ 139;
        lIlIIlIlI[28] = (149 ^ 175) ^ (55 ^ 2);
        lIlIIlIlI[29] = 22 ^ 6;
        lIlIIlIlI[30] = (((114 + 0) - 61) + 97) ^ (((133 + 124) - 196) + 74);
        lIlIIlIlI[31] = (((203 + 2) - 103) + 106) ^ (((119 + 35) - (-14)) + 26);
        lIlIIlIlI[32] = 143 ^ 156;
        lIlIIlIlI[33] = 64 ^ 84;
        lIlIIlIlI[34] = 133 ^ 144;
        lIlIIlIlI[35] = 128 ^ 150;
        lIlIIlIlI[36] = (((90 + 23) - 107) + 137) ^ (((40 + 83) - 12) + 41);
        lIlIIlIlI[37] = (200 ^ 147) ^ (67 ^ 0);
        lIlIIlIlI[38] = (10 ^ 51) ^ (53 ^ 22);
        lIlIIlIlI[39] = (176 ^ 183) ^ (176 ^ 172);
        lIlIIlIlI[40] = (179 ^ 148) ^ (126 ^ 69);
        lIlIIlIlI[41] = (((98 + 92) - 105) + 131) ^ (((196 + 92) - 99) + 8);
        lIlIIlIlI[42] = (29 ^ 51) ^ (42 ^ 26);
        lIlIIlIlI[43] = 188 ^ 163;
        lIlIIlIlI[44] = 63 ^ 31;
        lIlIIlIlI[45] = (((11 + 143) - 79) + 72) ^ (((171 + 174) - 338) + 171);
        lIlIIlIlI[46] = (-29697) & 32097;
        lIlIIlIlI[47] = 89 ^ 123;
        lIlIIlIlI[48] = (-" ".length()) & (-5153) & 7551;
        lIlIIlIlI[49] = 227 ^ 192;
        lIlIIlIlI[50] = (169 ^ 130) ^ (130 ^ 141);
        lIlIIlIlI[51] = (104 ^ 121) ^ (71 ^ 115);
        lIlIIlIlI[52] = (214 ^ 153) ^ (212 ^ 189);
        lIlIIlIlI[53] = 224 ^ 199;
        lIlIIlIlI[54] = (((103 + 49) - 125) + 104) ^ (((4 + 91) - (-2)) + 74);
        lIlIIlIlI[55] = 125 ^ 84;
        lIlIIlIlI[56] = (14 ^ 27) ^ (178 ^ 141);
        lIlIIlIlI[57] = (12 ^ 65) ^ (25 ^ 127);
        lIlIIlIlI[58] = 166 ^ 138;
        lIlIIlIlI[59] = 40 ^ 5;
        lIlIIlIlI[60] = (((50 + 119) - 143) + 109) ^ (((84 + 160) - 232) + 157);
        lIlIIlIlI[61] = " ".length() ^ (89 ^ 119);
        lIlIIlIlI[62] = (20 ^ 59) ^ (91 ^ 68);
        lIlIIlIlI[63] = 87 ^ 102;
        lIlIIlIlI[64] = (25 ^ 9) ^ (170 ^ 137);
        lIlIIlIlI[65] = (((78 + 16) - (-31)) + 47) ^ (((50 + 64) - (-3)) + 35);
        lIlIIlIlI[66] = (((20 + 24) - 23) + 120) ^ (((158 + 114) - 137) + 49);
        lIlIIlIlI[67] = 178 ^ 132;
        lIlIIlIlI[68] = (74 ^ 102) ^ (171 ^ 176);
        lIlIIlIlI[69] = 38 ^ 30;
        lIlIIlIlI[70] = (-16434) & 18995;
        lIlIIlIlI[71] = (-12393) & 14955;
        lIlIIlIlI[72] = (-((-20481) & 30115)) & (-4185) & 16382;
        lIlIIlIlI[73] = (-((-3367) & 11767)) & (-4361) & 15325;
        lIlIIlIlI[74] = (-30178) & 32743;
        lIlIIlIlI[75] = 70 ^ 127;
        lIlIIlIlI[76] = 82 ^ 104;
        lIlIIlIlI[77] = (212 ^ 186) ^ (27 ^ 78);
        lIlIIlIlI[78] = (-((-24641) & 28393)) & (-16389) & 32767;
        lIlIIlIlI[79] = 28 ^ 32;
        lIlIIlIlI[80] = (-((-7701) & 32341)) & (-7434) & 32733;
        lIlIIlIlI[81] = (-2064) & 3983;
        lIlIIlIlI[82] = (-16643) & 28622;
        lIlIIlIlI[83] = (-((-8201) & 13855)) & (-2114) & 32767;
        lIlIIlIlI[84] = (-14849) & 15148;
        lIlIIlIlI[85] = (-((-5681) & 30259)) & (-2065) & 28542;
        lIlIIlIlI[86] = 68 ^ 32;
        lIlIIlIlI[87] = 115 ^ 78;
        lIlIIlIlI[88] = (((52 + 100) - 91) + 102) ^ (((65 + 63) - 92) + 121);
        lIlIIlIlI[89] = (17 ^ 48) ^ (54 ^ 40);
        lIlIIlIlI[90] = 120 ^ 56;
        lIlIIlIlI[91] = (-((-1419) & 30655)) & (-1) & 32439;
        lIlIIlIlI[92] = (-8849) & 12272;
        lIlIIlIlI[93] = (-((-14513) & 31220)) & (-12841) & 32751;
        lIlIIlIlI[94] = (-25094) & 28565;
        lIlIIlIlI[95] = (-29267) & 32763;
        lIlIIlIlI[96] = (-((-209) & 29430)) & (-65) & 32511;
        lIlIIlIlI[97] = (-16470) & 19965;
        lIlIIlIlI[98] = (-22609) & 32505;
        lIlIIlIlI[99] = (-((-3249) & 28401)) & (-391) & 28655;
        lIlIIlIlI[100] = (-20518) & 23679;
        lIlIIlIlI[101] = (-4193) & 7419;
        lIlIIlIlI[102] = (-25221) & 28591;
        lIlIIlIlI[103] = (56 ^ 119) ^ (78 ^ 64);
        lIlIIlIlI[104] = 202 ^ 136;
        lIlIIlIlI[105] = 118 ^ 53;
        lIlIIlIlI[106] = 18 ^ 86;
        lIlIIlIlI[107] = 99 ^ 38;
        lIlIIlIlI[108] = (254 ^ 188) ^ (147 ^ 151);
        lIlIIlIlI[109] = 75 ^ 12;
        lIlIIlIlI[110] = 96 ^ 40;
        lIlIIlIlI[111] = (168 ^ 159) ^ (184 ^ 198);
        lIlIIlIlI[112] = (((156 + 87) - 217) + 227) ^ (((118 + 45) - 58) + 78);
        lIlIIlIlI[113] = 39 ^ 108;
        lIlIIlIlI[114] = 240 ^ 188;
        lIlIIlIlI[115] = 72 ^ 5;
        lIlIIlIlI[116] = 91 ^ 21;
        lIlIIlIlI[117] = 126 ^ 49;
        lIlIIlIlI[118] = 124 ^ 44;
        lIlIIlIlI[119] = (84 ^ 80) ^ (91 ^ 14);
        lIlIIlIlI[120] = (82 ^ 68) ^ (216 ^ 156);
        lIlIIlIlI[121] = 27 ^ 72;
    }

    private static boolean lIIIlIlIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIllIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIllIIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIlIlI[0];
    }

    private static String lIIIlIIlllII(String lllIlllIIIlIII, String lllIlllIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllIIIlIlI = Cipher.getInstance("Blowfish");
            lllIlllIIIlIlI.init(lIlIIlIlI[3], secretKeySpec);
            return new String(lllIlllIIIlIlI.doFinal(Base64.getDecoder().decode(lllIlllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlllIIIlIIl) {
            lllIlllIIIlIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0164, code lost:
        if (lIIIlIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.K.lIlIIlIlI[10]) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIIIlIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.K.lIlIIlIlI[9]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIlIIlIlI[1]];
        iArr5[lIlIIlIlI[0]] = lIlIIlIlI[7];
        if (lIIIlIlIllII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIlIIlIlI[1]];
            iArr6[lIlIIlIlI[0]] = lIlIIlIlI[7];
            if (lIIIlIlIllII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIlIIlIlI[1]];
                iArr7[lIlIIlIlI[0]] = lIlIIlIlI[7];
            }
            iArr = new int[lIlIIlIlI[1]];
            iArr[lIlIIlIlI[0]] = lIlIIlIlI[8];
            if (lIIIlIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIlIIlIlI[8], lIlIIlIlI[1], lIlIIlIlI[81]));
                "".length();
            }
            if (lIIIlIlIlllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlIIlIIl[lIlIIlIlI[88]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIlIIlIlI[82], lIlIIlIlI[10], lIlIIlIlI[83]));
                "".length();
            }
            iArr2 = new int[lIlIIlIlI[1]];
            iArr2[lIlIIlIlI[0]] = lIlIIlIlI[17];
            if (lIIIlIlIllII(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIlIlI[1]];
                iArr8[lIlIIlIlI[0]] = lIlIIlIlI[17];
                if (lIIIlIlIllII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIlIIlIlI[1]];
                    iArr9[lIlIIlIlI[0]] = lIlIIlIlI[17];
                }
                iArr3 = new int[lIlIIlIlI[1]];
                iArr3[lIlIIlIlI[0]] = lIlIIlIlI[11];
                if (lIIIlIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlIlI[11], lIlIIlIlI[4], C0008i.bq));
                    "".length();
                }
                iArr4 = new int[lIlIIlIlI[1]];
                iArr4[lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (lIIIlIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIlIlI[1]];
                    iArr10[lIlIIlIlI[0]] = lIlIIlIlI[6];
                    if (!lIIIlIlIllII(Bank.contains(iArr10) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr11 = new int[lIlIIlIlI[1]];
                    iArr11[lIlIIlIlI[0]] = lIlIIlIlI[6];
                    if (!lIIIlIlIllIl(Bank.getFirst(iArr11).getQuantity(), lIlIIlIlI[28])) {
                        return;
                    }
                }
                bv.add(new C0003d(lIlIIlIlI[6], lIlIIlIlI[54], lIlIIlIlI[85]));
                "".length();
            }
            bv.add(new C0003d(lIlIIlIlI[17], lIlIIlIlI[12], lIlIIlIlI[84]));
            "".length();
            iArr3 = new int[lIlIIlIlI[1]];
            iArr3[lIlIIlIlI[0]] = lIlIIlIlI[11];
            if (lIIIlIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIlIIlIlI[1]];
            iArr4[lIlIIlIlI[0]] = lIlIIlIlI[6];
            if (lIIIlIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIlIIlIlI[6], lIlIIlIlI[54], lIlIIlIlI[85]));
            "".length();
        }
        bv.add(new C0003d(lIlIIlIlI[7], lIlIIlIlI[9], lIlIIlIlI[80]));
        "".length();
        iArr = new int[lIlIIlIlI[1]];
        iArr[lIlIIlIlI[0]] = lIlIIlIlI[8];
        if (lIIIlIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIIIlIlIlllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIIlIIl[lIlIIlIlI[88]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIlIIlIlI[1]];
        iArr2[lIlIIlIlI[0]] = lIlIIlIlI[17];
        if (lIIIlIlIllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlIIlIlI[17], lIlIIlIlI[12], lIlIIlIlI[84]));
        "".length();
        iArr3 = new int[lIlIIlIlI[1]];
        iArr3[lIlIIlIlI[0]] = lIlIIlIlI[11];
        if (lIIIlIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIlIIlIlI[1]];
        iArr4[lIlIIlIlI[0]] = lIlIIlIlI[6];
        if (lIIIlIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlIIlIlI[6], lIlIIlIlI[54], lIlIIlIlI[85]));
        "".length();
    }

    private static boolean lIIIlIlIllll(Object obj) {
        return obj != null;
    }

    private static String lIIIlIIllllI(String lllIlllIIlllIl, String lllIlllIIlllII) {
        String lllIlllIIlllIl2 = new String(Base64.getDecoder().decode(lllIlllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIlllIIllIlI = lllIlllIIlllII.toCharArray();
        int lllIlllIIllIIl = lIlIIlIlI[0];
        char[] charArray = lllIlllIIlllIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIlI[0];
        while (lIIIlIlIllIl(i, length)) {
            char lllIlllIIllllI = charArray[i];
            sb.append((char) (lllIlllIIllllI ^ lllIlllIIllIlI[lllIlllIIllIIl % lllIlllIIllIlI.length]));
            "".length();
            lllIlllIIllIIl++;
            i++;
            "".length();
            if ((((173 ^ 133) ^ (75 ^ 39)) & (((148 ^ 146) ^ (103 ^ 37)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIlIIl[lIlIIlIlI[87]];
    }

    private static boolean lIIIlIllIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIlIIlIlI[3]];
        iArr[lIlIIlIlI[0]] = lIlIIlIlI[6];
        iArr[lIlIIlIlI[1]] = lIlIIlIlI[8];
        int i = lIlIIlIlI[0];
        while (lIIIlIlIllIl(i, iArr.length)) {
            int[] iArr2 = new int[lIlIIlIlI[1]];
            iArr2[lIlIIlIlI[0]] = iArr[i];
            if (lIIIlIlIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIIlIlI[0];
            }
            i++;
            "".length();
            if (" ".length() < 0) {
                return ((((122 + 64) - 48) + 20) ^ (((82 + 43) - 2) + 25)) & (((((112 + 66) - 147) + 110) ^ (((73 + 13) - (-27)) + 22)) ^ (-" ".length()));
            }
        }
        return lIlIIlIlI[1];
    }

    private static boolean lIIIlIllIIIl(int i) {
        return i < 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ce();
            "".length();
            if (0 != 0) {
                return (141 ^ 162) & ((76 ^ 99) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIlIlI[86];
    }

    static {
        lIIIlIlIlIlI();
        lIIIlIlIlIIl();
        iR = lIlIIlIIl[lIlIIlIlI[90]];
        iQ = new L();
        bv = new ArrayList();
        bX = new WorldPoint(lIlIIlIlI[91], lIlIIlIlI[92], lIlIIlIlI[0]);
        iT = new WorldPoint(lIlIIlIlI[93], lIlIIlIlI[94], lIlIIlIlI[0]);
        iU = new WorldPoint(lIlIIlIlI[93], lIlIIlIlI[95], lIlIIlIlI[3]);
        iV = new WorldPoint(lIlIIlIlI[96], lIlIIlIlI[97], lIlIIlIlI[0]);
        iW = new WorldPoint(lIlIIlIlI[96], lIlIIlIlI[98], lIlIIlIlI[0]);
        iX = new WorldPoint(lIlIIlIlI[99], lIlIIlIlI[100], lIlIIlIlI[1]);
        iY = new WorldPoint(lIlIIlIlI[101], lIlIIlIlI[102], lIlIIlIlI[0]);
        String[] strArr = new String[lIlIIlIlI[31]];
        strArr[lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[103]];
        strArr[lIlIIlIlI[1]] = lIlIIlIIl[lIlIIlIlI[104]];
        strArr[lIlIIlIlI[3]] = lIlIIlIIl[lIlIIlIlI[105]];
        strArr[lIlIIlIlI[5]] = lIlIIlIIl[lIlIIlIlI[106]];
        strArr[lIlIIlIlI[4]] = lIlIIlIIl[lIlIIlIlI[107]];
        strArr[lIlIIlIlI[10]] = lIlIIlIIl[lIlIIlIlI[108]];
        strArr[lIlIIlIlI[16]] = lIlIIlIIl[lIlIIlIlI[109]];
        strArr[lIlIIlIlI[18]] = lIlIIlIIl[lIlIIlIlI[110]];
        strArr[lIlIIlIlI[19]] = lIlIIlIIl[lIlIIlIlI[111]];
        strArr[lIlIIlIlI[20]] = lIlIIlIIl[lIlIIlIlI[112]];
        strArr[lIlIIlIlI[12]] = lIlIIlIIl[lIlIIlIlI[113]];
        strArr[lIlIIlIlI[23]] = lIlIIlIIl[lIlIIlIlI[114]];
        strArr[lIlIIlIlI[25]] = lIlIIlIIl[lIlIIlIlI[115]];
        strArr[lIlIIlIlI[26]] = lIlIIlIIl[lIlIIlIlI[116]];
        strArr[lIlIIlIlI[27]] = lIlIIlIIl[lIlIIlIlI[117]];
        strArr[lIlIIlIlI[28]] = lIlIIlIIl[lIlIIlIlI[118]];
        strArr[lIlIIlIlI[29]] = lIlIIlIIl[lIlIIlIlI[119]];
        strArr[lIlIIlIlI[30]] = lIlIIlIIl[lIlIIlIlI[120]];
        bR = strArr;
    }

    private static String lIIIlIIlllIl(String lllIllIllllIll, String lllIllIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIllllIlI.getBytes(StandardCharsets.UTF_8)), lIlIIlIlI[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIlllllII) {
            lllIllIlllllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIlIllIlll(Vars.getBit(QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[5])) {
            ?? r0 = lIlIIlIlI[1];
            "".length();
            return " ".length() < " ".length() ? ((75 ^ 4) ^ (192 ^ 129)) & (((34 ^ 61) ^ (214 ^ 199)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIlI[0];
    }

    private static boolean lIIIlIllIIll(int i, int i2) {
        return i <= i2;
    }

    private static int lIIIlIlIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIIlIllIlIl(int i, int i2) {
        return i != i2;
    }

    private static void cg() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIIlIlIllll(nearest) && lIIIlIlIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[76]];
            C0000a.a(nearest);
        }
        if (lIIIlIlIllll(nearest) && lIIIlIlIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlIIlIlI[2]);
                "".length();
                Time.sleepTicks(lIlIIlIlI[5]);
                "".length();
            }
            if (lIIIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[77]];
                if (lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] iArr = new int[lIlIIlIlI[1]];
                    iArr[lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (lIIIlIlIlllI(Inventory.contains(iArr) ? 1 : 0) && lIIIlIllIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIIlIlI[4]);
                        "".length();
                    }
                }
                if (lIIIlIllIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlIIlIlI[3]);
                    "".length();
                }
                if (lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIlIlI[1]];
                    iArr2[lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (lIIIlIlIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                        C0000a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                        C0000a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                        C0000a.a(lIlIIlIlI[48], lIlIIlIlI[1]);
                        C0000a.a(lIlIIlIlI[24], lIlIIlIlI[1]);
                        C0000a.a(lIlIIlIlI[46], lIlIIlIlI[1]);
                        Time.sleepTicks(lIlIIlIlI[1]);
                        "".length();
                        int[] iArr3 = new int[lIlIIlIlI[1]];
                        iArr3[lIlIIlIlI[0]] = lIlIIlIlI[11];
                        if (lIIIlIlIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            C0000a.a(lIlIIlIlI[78], lIlIIlIlI[1]);
                        }
                        C0000a.a(lIlIIlIlI[17], Inventory.getFreeSlots() - lIlIIlIlI[1]);
                    }
                }
                if (lIIIlIlIllII(iS ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIIlIlI[1]];
                    iArr4[lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (lIIIlIlIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        if (lIIIlIlIlllI(Equipment.contains(C0005f.aR) ? 1 : 0) && lIIIlIlIlllI(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                            C0000a.b(C0005f.aR, lIlIIlIlI[1]);
                        }
                        if (lIIIlIlIllII(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aR).interact(lIlIIlIIl[lIlIIlIlI[79]]);
                            Time.sleepTicks(lIlIIlIlI[5]);
                            "".length();
                        }
                        if (lIIIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIlIIlIlI[10]);
                            "".length();
                        }
                        if (lIIIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                            C0000a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                            C0000a.a(lIlIIlIlI[7], lIlIIlIlI[9]);
                        }
                    }
                }
            }
        }
    }

    private static void lIIIlIlIlIIl() {
        lIlIIlIIl = new String[lIlIIlIlI[121]];
        lIlIIlIIl[lIlIIlIlI[0]] = lIIIlIIlllII("zVZQB5PQeQeX5mgwaOxHo1KvQ77Py+LyM4UOqWQuBvvn9IRnkwtop3J6UBYAbZFh", "wgFZD");
        lIlIIlIIl[lIlIIlIlI[1]] = lIIIlIIlllIl("QQ4SsoUUn+nx9vMd1Mn75Q==", "ZYstP");
        lIlIIlIIl[lIlIIlIlI[3]] = lIIIlIIlllIl("nXBciYz2yGEl3F9gGum3RhIyP0dYIkfq", "ukAaV");
        lIlIIlIIl[lIlIIlIlI[5]] = lIIIlIIlllIl("W3kYJamu6/PyX0YSO4EvL6M6S2qPFrY+XAZpbXsHFmvXzA7izVmG8xmllbZAPYmzl5CIrAyOTUo=", "MXyNC");
        lIlIIlIIl[lIlIIlIlI[4]] = lIIIlIIlllIl("w0ujkTDkqUc9xyxQIIKaw08SuL5izspfhFQ1XXOwTYHMOKTBDaNDSzvp0HePziPj8R+b4AVtBYo=", "sKbxC");
        lIlIIlIIl[lIlIIlIlI[10]] = lIIIlIIlllIl("Q7brzLDlJ9Y=", "tZbLC");
        lIlIIlIIl[lIlIIlIlI[16]] = lIIIlIIllllI("NxQDBSc=", "sfjkL");
        lIlIIlIIl[lIlIIlIlI[18]] = lIIIlIIllllI("NjAT", "sQgaY");
        lIlIIlIIl[lIlIIlIlI[19]] = lIIIlIIlllIl("KFQHA4V0CUZt/NBuPPy2sw==", "VxbYV");
        lIlIIlIIl[lIlIIlIlI[20]] = lIIIlIIlllII("546ZR7lYxBs=", "rZmIM");
        lIlIIlIIl[lIlIIlIlI[12]] = lIIIlIIlllIl("o0Wn6tit4HAts+nfcPMER09SFyoH6Arf", "TrNwQ");
        lIlIIlIIl[lIlIIlIlI[23]] = lIIIlIIlllIl("EhSxTewefStrcBcy97lYSA==", "uoLcr");
        lIlIIlIIl[lIlIIlIlI[25]] = lIIIlIIllllI("AR0DDgsgGAYfBiY=", "Rtoxn");
        lIlIIlIIl[lIlIIlIlI[26]] = lIIIlIIlllIl("hL29EJO/jmew/wW9mNSYvQ==", "xUdOz");
        lIlIIlIIl[lIlIIlIlI[27]] = lIIIlIIllllI("ACUdJhgqKk0AFjUtAw==", "CDmRy");
        lIlIIlIIl[lIlIIlIlI[28]] = lIIIlIIlllIl("U6d1d+RyNoawBfukIePf2w==", "usNpI");
        lIlIIlIIl[lIlIIlIlI[29]] = lIIIlIIlllIl("96zQdKYFROK5xXp+iFEMZw==", "wpwcN");
        lIlIIlIIl[lIlIIlIlI[30]] = lIIIlIIlllII("dZ7Wv5V7yigxOnSXApXFxg==", "YZhel");
        lIlIIlIIl[lIlIIlIlI[31]] = lIIIlIIlllII("OOltjveSCW4=", "toXWN");
        lIlIIlIIl[lIlIIlIlI[32]] = lIIIlIIlllIl("33pDKegdZRxTJRwM3EhXRw==", "NvUXP");
        lIlIIlIIl[lIlIIlIlI[33]] = lIIIlIIlllIl("oY8XTf6vvf3WwIOlzdvZ1F06KlsoOJp8", "hNheC");
        lIlIIlIIl[lIlIIlIlI[34]] = lIIIlIIllllI("KwkIDCMKDQ==", "fhfdL");
        lIlIIlIIl[lIlIIlIlI[35]] = lIIIlIIlllIl("UJ60bP71X/w=", "MrCSZ");
        lIlIIlIIl[lIlIIlIlI[36]] = lIIIlIIllllI("FiYuFA==", "YVKzt");
        lIlIIlIIl[lIlIIlIlI[37]] = lIIIlIIllllI("LgIcHBgPBg==", "ccrtw");
        lIlIIlIIl[lIlIIlIlI[9]] = lIIIlIIlllIl("llIBxQ4QvFg=", "fzURr");
        lIlIIlIIl[lIlIIlIlI[38]] = lIIIlIIllllI("KyILEgEKJg==", "fCezn");
        lIlIIlIIl[lIlIIlIlI[39]] = lIIIlIIllllI("Hy0YOAI+KQ==", "RLvPm");
        lIlIIlIIl[lIlIIlIlI[40]] = lIIIlIIlllII("+u5TIKPwPZExLjHcOMaaiQ==", "JKvnr");
        lIlIIlIIl[lIlIIlIlI[41]] = lIIIlIIlllIl("ESBDY/TL7GQ=", "Wqcot");
        lIlIIlIIl[lIlIIlIlI[42]] = lIIIlIIlllII("4yDVuy4gRqGrYobHOshOtQ==", "BoSGa");
        lIlIIlIIl[lIlIIlIlI[43]] = lIIIlIIlllII("KhWv9aokeiC3ghn0HKOVlA==", "HPpsD");
        lIlIIlIIl[lIlIIlIlI[44]] = lIIIlIIllllI("CgYgEjh4GDYf", "XsSfA");
        lIlIIlIIl[lIlIIlIlI[45]] = lIIIlIIlllIl("WhyK/T3YzDw=", "FnQhd");
        lIlIIlIIl[lIlIIlIlI[47]] = lIIIlIIllllI("IBsgOQEBHiUoDAc=", "srLOd");
        lIlIIlIIl[lIlIIlIlI[49]] = lIIIlIIllllI("JTs4IAU=", "gTVEv");
        lIlIIlIIl[lIlIIlIlI[50]] = lIIIlIIlllIl("YXFMIRjpIeU=", "mSkcb");
        lIlIIlIIl[lIlIIlIlI[51]] = lIIIlIIlllII("7jM1FL2IKjXSGoQU16/8mQ==", "dqZFf");
        lIlIIlIIl[lIlIIlIlI[52]] = lIIIlIIllllI("OzwSMgAIdTwhEwU3ByEc", "lUhSr");
        lIlIIlIIl[lIlIIlIlI[53]] = lIIIlIIlllIl("6ZGsulWQYiEitVHMoke/yw==", "GHKJv");
        lIlIIlIIl[lIlIIlIlI[54]] = lIIIlIIlllII("EY0FOnnKrOsrUI0cgi8fM6xPEAzvG6OC", "Wdwvb");
        lIlIIlIIl[lIlIIlIlI[55]] = lIIIlIIlllIl("qI4lCQ2IZ7dNj8d2KIRVBA==", "iPSuT");
        lIlIIlIIl[lIlIIlIlI[56]] = lIIIlIIlllIl("b3WNl3Nqxenf8BxusuVGGw==", "RWXQX");
        lIlIIlIIl[lIlIIlIlI[57]] = lIIIlIIllllI("NjwDCDAGMQ==", "rYozY");
        lIlIIlIIl[lIlIIlIlI[58]] = lIIIlIIlllII("TxLlHILg8uMHMiX8aTJCnVQRsV8C1GAC", "EjYcZ");
        lIlIIlIIl[lIlIIlIlI[59]] = lIIIlIIlllII("z+7MbrAOmME0CRypiXm3HQ==", "BGpjP");
        lIlIIlIIl[lIlIIlIlI[60]] = lIIIlIIlllIl("ZDlXmEYVkSY=", "japEf");
        lIlIIlIIl[lIlIIlIlI[61]] = lIIIlIIllllI("PwkbOScGCR5yBg0ACDs2AA==", "hlzRB");
        lIlIIlIIl[lIlIIlIlI[62]] = lIIIlIIllllI("FRcjIDo/", "TcWAY");
        lIlIIlIIl[lIlIIlIlI[63]] = lIIIlIIllllI("PBc4IC0MGg==", "xrTRD");
        lIlIIlIIl[lIlIIlIlI[15]] = lIIIlIIlllII("HnO9SY14thY=", "Rnnix");
        lIlIIlIIl[lIlIIlIlI[64]] = lIIIlIIlllII("EX+kViJC/k0=", "WRRjv");
        lIlIIlIIl[lIlIIlIlI[65]] = lIIIlIIllllI("Bxs3MzUt", "FoCRV");
        lIlIIlIIl[lIlIIlIlI[66]] = lIIIlIIlllII("fOubacqBGNsmMrc20zLR7w==", "gdqyF");
        lIlIIlIIl[lIlIIlIlI[67]] = lIIIlIIlllIl("SRvcsXmuvb4=", "GFQEQ");
        lIlIIlIIl[lIlIIlIlI[68]] = lIIIlIIllllI("BSwIIgk8LA1pKDclGyAYOg==", "RIiIl");
        lIlIIlIIl[lIlIIlIlI[69]] = lIIIlIIlllII("5GrUyaOfsyHabfDT2zDK2Q==", "xmgyT");
        lIlIIlIIl[lIlIIlIlI[75]] = lIIIlIIlllII("0PulgLFJRmU=", "rbczH");
        lIlIIlIIl[lIlIIlIlI[76]] = lIIIlIIlllII("oYxmA4e2z+lq3zH9wcLerQ==", "axQUg");
        lIlIIlIIl[lIlIIlIlI[77]] = lIIIlIIlllIl("3Y4E+I3GEvzCVq7Y3BydMNcI3Xggg6aZ", "LnbaJ");
        lIlIIlIIl[lIlIIlIlI[79]] = lIIIlIIlllIl("MnnlRsC9+mg=", "JDyuP");
        lIlIIlIIl[lIlIIlIlI[87]] = lIIIlIIllllI("EQ0ECSV1OwUHMjAa", "UhifK");
        lIlIIlIIl[lIlIIlIlI[88]] = lIIIlIIllllI("MDMDAmEtPE0SJCM2GQ1hag==", "BZmeA");
        lIlIIlIIl[lIlIIlIlI[89]] = lIIIlIIlllIl("Ae9Nz1/kjr8=", "yqPLd");
        lIlIIlIIl[lIlIIlIlI[90]] = lIIIlIIllllI("HAcFRB86CQZEHzMbUhAAMxxSDQYxCRwQCSYBHQpIMw8TDQZt", "Rhrdh");
        lIlIIlIIl[lIlIIlIlI[103]] = lIIIlIIlllIl("ybFBc1np0a4=", "ElCnY");
        lIlIIlIIl[lIlIIlIlI[104]] = lIIIlIIlllII("xehXs0HXfAFlgfsmn8bKzeE0VwW255ni", "yqiCq");
        lIlIIlIIl[lIlIIlIlI[105]] = lIIIlIIllllI("Cx8YH29kAxEDMSFUEBVjLBFGRgpjGBVGKC0YFUYrLRlZACw2VAAJNmU=", "DtyfC");
        lIlIIlIIl[lIlIIlIlI[106]] = lIIIlIIllllI("Iw1rDgYHQi8PDVA1KgoFCUIgDwUcQg8DBQILPw5W", "pbKfi");
        lIlIIlIIl[lIlIIlIlI[107]] = lIIIlIIllllI("LyYiDWcRPWMNLx1uLhggES0iFWcRICAYKQwvNxAoFnE=", "xNCyG");
        lIlIIlIIl[lIlIIlIlI[108]] = lIIIlIIllllI("BCc9JWs2ND0yawx1Jz4kMDkwdigqODF2KisxdCIqKT50IiRlLDsjZQ==", "EUTVK");
        lIlIIlIIl[lIlIIlIlI[109]] = lIIIlIIllllI("PFkmKDQRWTwicRMQJilxJhAkOzQHFSEqOQFX", "uyHMQ");
        lIlIIlIIl[lIlIIlIlI[110]] = lIIIlIIlllII("4PmX/Yz2tOO9iHwkCi5jhGS2Ni0jw+dvXRJsmGS8qpdI9MkDpQXbvndVA3Do5zNiKpePUX9vN40=", "Yvxmm");
        lIlIIlIIl[lIlIIlIlI[111]] = lIIIlIIllllI("NjhvITATMm8rPEUjJyN5DjI2NXg=", "eWOFY");
        lIlIIlIIl[lIlIIlIlI[112]] = lIIIlIIlllIl("8rCVZGDWP8w//b2HZNjynhNVf01eCGgml3tcmnEs4DXZNEqwLgzbtg==", "ItzGk");
        lIlIIlIIl[lIlIIlIlI[113]] = lIIIlIIllllI("LgkVBAhdElAXTR4EHRkDWhYYGU0NAB4CHloVH1YEFBcREghaFRgfHloCGQIUVA==", "zapvm");
        lIlIIlIIl[lIlIIlIlI[114]] = lIIIlIIlllIl("la+e4Q5pZQNZQ9nHRMi6Gg==", "qbPbX");
        lIlIIlIIl[lIlIIlIlI[115]] = lIIIlIIlllIl("AHevRbrQFfS4yxdLHKDcPQPpsggUEQeqLsQDjiSy1s6q0GIs3eXxRGBH2Npvsi94XklwzOYtgFCR8QjAWxIYjQ==", "WnVtG");
        lIlIIlIIl[lIlIIlIlI[116]] = lIIIlIIlllIl("oT1cAWKci3ji9VMMceVYOqfi8Sblz4AqTLmr5sIJvZOEobHsAvHC8oy7ukn8Jz6z", "eyMNY");
        lIlIIlIIl[lIlIIlIlI[117]] = lIIIlIIlllIl("T57VMmFtLzi0pi9qBFlg/zxuXGFnfX2KKlMLX09gpttJI6+/J8jVKpQielcUSB4d", "gYmpx");
        lIlIIlIIl[lIlIIlIlI[118]] = lIIIlIIllllI("LCcBAEsZJAIeH1gCCAYEFmY+BwoBIx9F", "xFmkk");
        lIlIIlIIl[lIlIIlIlI[119]] = lIIIlIIlllIl("RrbQA2qaLgu9ZOxmHtbj5bEhTMsP0MzLI4zuldCbzqgGMMZmf4h8BQLjlBWmcXkr", "HjZuh");
        lIlIIlIIl[lIlIIlIlI[120]] = lIIIlIIlllII("HmnNQPzxFj4KDYxjYex7dzRiBJx7mEnRaqXv4rhVnuQ=", "PHbrb");
    }

    private static void cf() {
        if (lIIIlIllIllI(iZ)) {
            if (lIIIlIlIlllI(Vars.getBit(lIlIIlIlI[70])) && lIIIlIlIlllI(Vars.getBit(lIlIIlIlI[71]))) {
                return;
            }
            String[] strArr = new String[lIlIIlIlI[10]];
            strArr[lIlIIlIlI[0]] = iQ.get(Integer.valueOf(Vars.getBit(lIlIIlIlI[70])));
            strArr[lIlIIlIlI[1]] = iQ.get(Integer.valueOf(Vars.getBit(lIlIIlIlI[71])));
            strArr[lIlIIlIlI[3]] = iQ.get(Integer.valueOf(Vars.getBit(lIlIIlIlI[72])));
            strArr[lIlIIlIlI[5]] = iQ.get(Integer.valueOf(Vars.getBit(lIlIIlIlI[73])));
            strArr[lIlIIlIlI[4]] = iQ.get(Integer.valueOf(Vars.getBit(lIlIIlIlI[74])));
            iZ = strArr;
            System.out.println("Say the following in order: " + String.join(lIlIIlIIl[lIlIIlIlI[75]], iZ));
        }
    }

    private static boolean lIIIlIlIllII(int i) {
        return i != 0;
    }

    private static boolean lIIIlIlIlllI(int i) {
        return i == 0;
    }

    private static boolean lIIIlIllIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIllIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIlllIII(Object obj, Object obj2) {
        return obj == obj2;
    }
}

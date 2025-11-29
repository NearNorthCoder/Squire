package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.r  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/r.class */
public class C0017r implements W {
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint ci;
    private static /* synthetic */ WorldPoint cn;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ int[] lIIllIIIl;
    public static /* synthetic */ WorldPoint bX;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldPoint cj;
    static /* synthetic */ int cl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIIllIIII;

    private static boolean llllllllIlI(int i) {
        return i <= 0;
    }

    private static boolean lllllllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String llllllIlIIl(String lIIIIIlIllllIII, String lIIIIIlIlllIlll) {
        try {
            SecretKeySpec lIIIIIlIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIIl[16]), "DES");
            Cipher lIIIIIlIllllIlI = Cipher.getInstance("DES");
            lIIIIIlIllllIlI.init(lIIllIIIl[3], lIIIIIlIllllIll);
            return new String(lIIIIIlIllllIlI.doFinal(Base64.getDecoder().decode(lIIIIIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIlIllllIIl) {
            lIIIIIlIllllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llllllllIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[57])) {
            ?? r0 = lIIllIIIl[0];
            "".length();
            return (94 ^ 90) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIIIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x065c, code lost:
        if (lllllllIIll(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v473, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v495, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aG() {
        if (lllllllIIII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllllllIIIl(bv.size(), lIIllIIIl[0])) {
                System.out.println(lIIllIIII[lIIllIIIl[1]]);
                bt = lIIllIIIl[1];
            }
        }
        if (lllllllIIlI(bt ? 1 : 0)) {
            if (lllllllIIlI(ab() ? 1 : 0) && lllllllIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllllIIll(nearest) && lllllllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[0]];
                    C0000a.a(nearest);
                }
                if (lllllllIIll(nearest) && lllllllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllllllIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllIIIl[2]);
                        "".length();
                    }
                    if (lllllllIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[3]];
                        if (lllllllIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllIIIl[4]);
                            "".length();
                        }
                        if (lllllllIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllIIIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIllIIIl[5]];
                        iArr[lIIllIIIl[1]] = lIIllIIIl[6];
                        iArr[lIIllIIIl[0]] = lIIllIIIl[7];
                        iArr[lIIllIIIl[3]] = lIIllIIIl[8];
                        iArr[lIIllIIIl[9]] = lIIllIIIl[10];
                        iArr[lIIllIIIl[4]] = lIIllIIIl[11];
                        iArr[lIIllIIIl[12]] = lIIllIIIl[13];
                        if (lllllllIIlI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllIIII[lIIllIIIl[9]]);
                            bt = lIIllIIIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIllIIIl[5]];
                        iArr2[lIIllIIIl[1]] = lIIllIIIl[6];
                        iArr2[lIIllIIIl[0]] = lIIllIIIl[7];
                        iArr2[lIIllIIIl[3]] = lIIllIIIl[8];
                        iArr2[lIIllIIIl[9]] = lIIllIIIl[10];
                        iArr2[lIIllIIIl[4]] = lIIllIIIl[11];
                        iArr2[lIIllIIIl[12]] = lIIllIIIl[13];
                        if (lllllllIIII(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIllIIIl[3]];
                            iArr3[lIIllIIIl[1]] = lIIllIIIl[8];
                            iArr3[lIIllIIIl[0]] = lIIllIIIl[10];
                            C0000a.a(iArr3);
                            C0000a.a(lIIllIIIl[6], lIIllIIIl[14]);
                            C0000a.a(lIIllIIIl[7], lIIllIIIl[14]);
                            C0000a.a(lIIllIIIl[15], lIIllIIIl[14]);
                            C0000a.b(C0005f.aR, lIIllIIIl[0]);
                            C0000a.a(lIIllIIIl[11], lIIllIIIl[4]);
                            C0000a.a(lIIllIIIl[13], lIIllIIIl[16]);
                        }
                    }
                }
            }
            if (lllllllIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllllIIIl(Movement.getRunEnergy(), lIIllIIIl[17])) {
                Inventory.getFirst(C0005f.aV).interact(lIIllIIII[lIIllIIIl[4]]);
                Time.sleepTicks(lIIllIIIl[0]);
                "".length();
            }
            if (lllllllIIII(ab() ? 1 : 0) && lllllllIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                if (lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIIl[4])) {
                    if (lllllllIIII(Inventory.contains(C0005f.aR) ? 1 : 0) && lllllllIIlI(Equipment.contains(C0005f.aR) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aR).interact(lIIllIIII[lIIllIIIl[12]]);
                    }
                    if (lllllllIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[5]];
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIIllIIIl[0]);
                    "".length();
                }
                if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[18]];
                    cl = lIIllIIIl[1];
                    if (lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIIllIIIl[0]];
                        strArr[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[16]];
                        TileObjects.getNearest(strArr).interact(lIIllIIII[lIIllIIIl[19]]);
                        Time.sleepTicks(lIIllIIIl[3]);
                        "".length();
                    }
                    C0006g.a(bR);
                }
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[12])) {
                if (lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[14]];
                    Movement.walkTo(ci);
                    "".length();
                    Time.sleepTicks(lIIllIIIl[0]);
                    "".length();
                    if (lllllllIIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIllIIIl[20], lIIllIIIl[21], lIIllIIIl[1])) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[22]];
                        C0004e.c(new WorldPoint(lIIllIIIl[23], lIIllIIIl[24], lIIllIIIl[1]));
                        Time.sleepTicks(lIIllIIIl[5]);
                        "".length();
                    }
                }
                if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[25]];
                    C0006g.a(lIIllIIII[lIIllIIIl[26]], bR, lIIllIIIl[0]);
                }
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[14])) {
                if (lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[27]];
                    Movement.walkTo(cj);
                    "".length();
                    Time.sleepTicks(lIIllIIIl[0]);
                    "".length();
                }
                if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    int[] iArr4 = new int[lIIllIIIl[0]];
                    iArr4[lIIllIIIl[1]] = lIIllIIIl[8];
                    if (lllllllIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIllIIIl[0]];
                        iArr5[lIIllIIIl[1]] = lIIllIIIl[8];
                        Item first = Inventory.getFirst(iArr5);
                        String[] strArr2 = new String[lIIllIIIl[0]];
                        strArr2[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[28]];
                        first.useOn(TileObjects.getNearest(strArr2));
                        Time.sleepTicks(lIIllIIIl[3]);
                        "".length();
                    }
                }
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[28])) {
                int[] iArr6 = new int[lIIllIIIl[0]];
                iArr6[lIIllIIIl[1]] = lIIllIIIl[10];
                if (lllllllIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIIllIIIl[0]];
                    iArr7[lIIllIIIl[1]] = lIIllIIIl[10];
                    Inventory.getFirst(iArr7).interact(lIIllIIII[lIIllIIIl[29]]);
                }
                if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    String[] strArr3 = new String[lIIllIIIl[0]];
                    strArr3[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[30]];
                    TileObjects.getNearest(strArr3).interact(lIIllIIII[lIIllIIIl[31]]);
                    Time.sleepTicks(lIIllIIIl[9]);
                    "".length();
                }
                if (lllllllIlIl(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIIllIIIl[32], lIIllIIIl[33])), lIIllIIIl[34])) {
                    String[] strArr4 = new String[lIIllIIIl[0]];
                    strArr4[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[35]];
                }
                String[] strArr5 = new String[lIIllIIIl[0]];
                strArr5[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[36]];
                if (lllllllIIll(TileObjects.getNearest(strArr5))) {
                    if (lllllllIlIl(Players.getLocal().getLocalLocation().getY(), lIIllIIIl[37])) {
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr6 = new String[lIIllIIIl[0]];
                        strArr6[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[38]];
                        if (lllllllIllI(worldLocation.distanceTo(TileObjects.getNearest(strArr6).getWorldLocation()), lIIllIIIl[14])) {
                            String[] strArr7 = new String[lIIllIIIl[0]];
                            strArr7[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[39]];
                            if (llllllllIII(NPCs.getNearest(strArr7))) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[40]];
                                String[] strArr8 = new String[lIIllIIIl[0]];
                                strArr8[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[41]];
                                TileObjects.getNearest(strArr8).interact(lIIllIIII[lIIllIIIl[42]]);
                                Time.sleepTicks(lIIllIIIl[14]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr9 = new String[lIIllIIIl[0]];
                    strArr9[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[43]];
                    if (llllllllIII(NPCs.getNearest(strArr9)) && lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[44]];
                        String[] strArr10 = new String[lIIllIIIl[0]];
                        strArr10[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[45]];
                        TileObjects.getNearest(strArr10).interact(lIIllIIII[lIIllIIIl[46]]);
                        Time.sleepTicks(lIIllIIIl[12]);
                        "".length();
                        C0006g.a(bR);
                    }
                    C0006g.a(bR);
                }
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[36])) {
                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[47]];
                C0006g.a(lIIllIIII[lIIllIIIl[48]], bR);
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[42])) {
                if (lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    String[] strArr11 = new String[lIIllIIIl[0]];
                    strArr11[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[49]];
                    if (llllllllIII(NPCs.getNearest(strArr11))) {
                        String[] strArr12 = new String[lIIllIIIl[0]];
                        strArr12[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[50]];
                        if (lllllllIIlI(Equipment.contains(strArr12) ? 1 : 0)) {
                            String[] strArr13 = new String[lIIllIIIl[0]];
                            strArr13[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[51]];
                            if (lllllllIIII(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lIIllIIIl[0]];
                                strArr14[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[52]];
                                Inventory.getFirst(strArr14).interact(lIIllIIII[lIIllIIIl[53]]);
                            }
                        }
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[54]];
                        Movement.walkTo(cj);
                        "".length();
                        Time.sleepTicks(lIIllIIIl[0]);
                        "".length();
                    }
                }
                if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[55]];
                    String[] strArr15 = new String[lIIllIIIl[0]];
                    strArr15[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[56]];
                    if (lllllllIIll(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[lIIllIIIl[0]];
                        strArr16[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[57]];
                        TileObjects.getNearest(strArr16).interact(lIIllIIII[lIIllIIIl[58]]);
                        Time.sleepTicks(lIIllIIIl[9]);
                        "".length();
                    }
                }
                if (lllllllIlIl(Players.getLocal().getLocalLocation().getY(), lIIllIIIl[37])) {
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr17 = new String[lIIllIIIl[0]];
                    strArr17[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[59]];
                    if (lllllllIlIl(worldLocation2.distanceTo(TileObjects.getNearest(strArr17).getWorldLocation()), lIIllIIIl[18])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[60]];
                        String[] strArr18 = new String[lIIllIIIl[0]];
                        strArr18[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[61]];
                        TileObjects.getNearest(strArr18).interact(lIIllIIII[lIIllIIIl[62]]);
                        Time.sleepTicks(lIIllIIIl[14]);
                        "".length();
                    }
                }
                if (llllllllIII(Players.getLocal().getInteracting()) && lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr19 = new String[lIIllIIIl[0]];
                    strArr19[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[63]];
                    if (lllllllIIlI(Equipment.contains(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[lIIllIIIl[0]];
                        strArr20[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[64]];
                        if (lllllllIIII(Inventory.contains(strArr20) ? 1 : 0)) {
                            String[] strArr21 = new String[lIIllIIIl[0]];
                            strArr21[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[65]];
                            Inventory.getFirst(strArr21).interact(lIIllIIII[lIIllIIIl[66]]);
                        }
                    }
                    int[] iArr8 = new int[lIIllIIIl[0]];
                    iArr8[lIIllIIIl[1]] = lIIllIIIl[10];
                    if (lllllllIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIllIIIl[0]];
                        iArr9[lIIllIIIl[1]] = lIIllIIIl[10];
                        if (lllllllIIlI(Equipment.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIIllIIIl[0]];
                            iArr10[lIIllIIIl[1]] = lIIllIIIl[10];
                            Inventory.getFirst(iArr10).interact(lIIllIIII[lIIllIIIl[34]]);
                        }
                    }
                    String[] strArr22 = new String[lIIllIIIl[0]];
                    strArr22[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[67]];
                    NPCs.getNearest(strArr22).interact(lIIllIIII[lIIllIIIl[68]]);
                    Time.sleepTicks(lIIllIIIl[0]);
                    "".length();
                }
                if (llllllllIIl(llllllIllll(C0004e.u(), 60.0d))) {
                    int[] iArr11 = new int[lIIllIIIl[0]];
                    iArr11[lIIllIIIl[1]] = lIIllIIIl[13];
                    if (lllllllIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIIllIIIl[0]];
                        iArr12[lIIllIIIl[1]] = lIIllIIIl[13];
                        Inventory.getFirst(iArr12).interact(lIIllIIII[lIIllIIIl[69]]);
                        Time.sleepTicks(lIIllIIIl[0]);
                        "".length();
                    }
                }
                C0006g.a(bR);
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[47])) {
                String[] strArr23 = new String[lIIllIIIl[0]];
                strArr23[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[70]];
                if (lllllllIIlI(Inventory.contains(strArr23) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[71]];
                    String[] strArr24 = new String[lIIllIIIl[0]];
                    strArr24[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[72]];
                    TileObjects.getNearest(strArr24).interact(lIIllIIII[lIIllIIIl[73]]);
                    Time.sleepTicks(lIIllIIIl[4]);
                    "".length();
                }
                String[] strArr25 = new String[lIIllIIIl[0]];
                strArr25[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[74]];
                if (lllllllIIII(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[75]];
                        Movement.walkTo(ci);
                        "".length();
                        Time.sleepTicks(lIIllIIIl[0]);
                        "".length();
                        if (lllllllIIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIllIIIl[20], lIIllIIIl[21], lIIllIIIl[1])) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[76]];
                            C0004e.c(new WorldPoint(lIIllIIIl[23], lIIllIIIl[24], lIIllIIIl[1]));
                            Time.sleepTicks(lIIllIIIl[5]);
                            "".length();
                        }
                    }
                    if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[77]];
                        C0006g.a(lIIllIIII[lIIllIIIl[78]], bR, lIIllIIIl[0]);
                    }
                }
            }
            if (lllllllIlll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[52])) {
                if (lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ck), lIIllIIIl[9])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[79]];
                    Movement.walkTo(ck);
                    "".length();
                    Time.sleepTicks(lIIllIIIl[0]);
                    "".length();
                }
                if (lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ck), lIIllIIIl[9])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[80]];
                    if (lllllllIIIl(cl, lIIllIIIl[0])) {
                        an.pm += lIIllIIIl[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIllIIIl[0];
                        an.pm = lIIllIIIl[1];
                        cm = lIIllIIIl[1];
                    }
                    C0006g.a(lIIllIIII[lIIllIIIl[17]], bR);
                }
            }
        }
    }

    private static void llllllIllIl() {
        lIIllIIII = new String[lIIllIIIl[100]];
        lIIllIIII[lIIllIIIl[1]] = llllllIlIIl("tRYjBS9s/B9LqRqRREQDeGt1aXXAsSPYetHOCNJkgUk7O5FnS1c0iUBSeXaVdQet", "OLeRS");
        lIIllIIII[lIIllIIIl[0]] = llllllIlIlI("CwYnWBoqRzMZAC4=", "EgQxn");
        lIIllIIII[lIIllIIIl[3]] = llllllIlIll("jX9LG88i+Ivl1s0FfzsRRQ5N7TYhdBMN", "rVTCe");
        lIIllIIII[lIIllIIIl[9]] = llllllIlIll("iSBdhwlEm2IJCAPBgXGov9jMMRvhYyLebrm/aG1I2T/AWtFWDsjAhTQTrgeqqIbhqmZv6CRgMAk=", "Wgacw");
        lIIllIIII[lIIllIIIl[4]] = llllllIlIlI("CCMuJCI=", "LQGJI");
        lIIllIIII[lIIllIIIl[12]] = llllllIlIlI("AicwOQ==", "UBQKY");
        lIIllIIII[lIIllIIIl[5]] = llllllIlIll("vFClwaJFI5q1xgbfEvrdLw==", "eIKpL");
        lIIllIIII[lIIllIIIl[18]] = llllllIlIIl("opkNDFGSgX+CpnVdb0f3Qw==", "ItVWq");
        lIIllIIII[lIIllIIIl[16]] = llllllIlIll("zBatLenL9HCxLZazyjTFYA==", "CVUiP");
        lIIllIIII[lIIllIIIl[19]] = llllllIlIlI("Ox0uNBE=", "xuKWz");
        lIIllIIII[lIIllIIIl[14]] = llllllIlIlI("Cwo4ZhcqSz0nESQD", "EkNFc");
        lIIllIIII[lIIllIIIl[22]] = llllllIlIlI("HjwgFQxhaDYaDi4jPBgAbScgAg==", "MHUvg");
        lIIllIIII[lIIllIIIl[25]] = llllllIlIlI("IQgoDi4bDmQWJgcILA==", "uiDeG");
        lIIllIIII[lIIllIIIl[26]] = llllllIlIll("84CzhUoxN2Q=", "fIesL");
        lIIllIIII[lIIllIIIl[27]] = llllllIlIll("w8ffIWvfc2E3HH0ciF0rzA==", "ViYLo");
        lIIllIIII[lIIllIIIl[28]] = llllllIlIIl("7UP3GEtfYwan1C0BlaEpDQ==", "WBfyM");
        lIIllIIII[lIIllIIIl[29]] = llllllIlIlI("FBkCFBE=", "Cpgxu");
        lIIllIIII[lIIllIIIl[30]] = llllllIlIIl("l8pLSLObwZe5xBl9wwxQaA==", "xmyOS");
        lIIllIIII[lIIllIIIl[31]] = llllllIlIll("5QIwaJVXi4sdXF69OKJz4Q==", "SfzIa");
        lIIllIIII[lIIllIIIl[35]] = llllllIlIIl("KFZrora9RMQP07wZRgfXdQ==", "mbuMP");
        lIIllIIII[lIIllIIIl[36]] = llllllIlIll("w65ySFSGMvrfwsZxKBt3Zw==", "wmjDk");
        lIIllIIII[lIIllIIIl[38]] = llllllIlIIl("OZNIh0b1ooUTn5KXzemTNQ==", "hiPJb");
        lIIllIIII[lIIllIIIl[39]] = llllllIlIll("off2R57vyueIhVJwK+xy3g==", "RtREQ");
        lIIllIIII[lIIllIIIl[40]] = llllllIlIlI("CysdPDpoKAI0KmglGD47IyYTNA==", "HGtQX");
        lIIllIIII[lIIllIIIl[41]] = llllllIlIll("kdYQhQGXXd9u4udgp8Ey1w==", "bpBPr");
        lIIllIIII[lIIllIIIl[42]] = llllllIlIlI("EC8rKDh+LDQgKA==", "SCBEZ");
        lIIllIIII[lIIllIIIl[43]] = llllllIlIll("vJDjThguR+xj8pHwDBuGhA==", "ZHZni");
        lIIllIIII[lIIllIIIl[44]] = llllllIlIlI("IDg3MSMINTd0IgIzLzE=", "iVCTQ");
        lIIllIIII[lIIllIIIl[45]] = llllllIlIIl("mVMp415We8nFSDhWIrFlTQ==", "GZmUZ");
        lIIllIIII[lIIllIIIl[46]] = llllllIlIll("J2jBv5Svh14x5tRSUK3ESQ==", "krCxj");
        lIIllIIII[lIIllIIIl[47]] = llllllIlIlI("MCMTHQYYLhMRGh5tNAgdCyw=", "yMgxt");
        lIIllIIII[lIIllIIIl[48]] = llllllIlIIl("Fs4wzRpAd9w=", "VTVKh");
        lIIllIIII[lIIllIIIl[49]] = llllllIlIIl("+6kbSrOsxLM=", "hmDSC");
        lIIllIIII[lIIllIIIl[50]] = llllllIlIlI("OigAHAgHPwoXCkgqBhUJBCga", "hMirn");
        lIIllIIII[lIIllIIIl[51]] = llllllIlIlI("Nz8mPAQKKCw3BkU9IDUFCT88", "eZORb");
        lIIllIIII[lIIllIIIl[52]] = llllllIlIlI("FSQeJDAoMxQvMmcmGC0xKyQE", "GAwJV");
        lIIllIIII[lIIllIIIl[53]] = llllllIlIll("3TwWCWzErKY=", "KFYVk");
        lIIllIIII[lIIllIIIl[54]] = llllllIlIIl("UratkYAWkJ79cLBmF49B5w==", "kZFzj");
        lIIllIIII[lIIllIIIl[55]] = llllllIlIIl("ZyvE35vsLCgQwox5EjqWbQ==", "gtXqv");
        lIIllIIII[lIIllIIIl[56]] = llllllIlIIl("iqU/9tE97/NwphQSXR54pg==", "bBznX");
        lIIllIIII[lIIllIIIl[57]] = llllllIlIlI("BAMjIz4wEnEqPzsS", "WwQBP");
        lIIllIIII[lIIllIIIl[58]] = llllllIlIlI("DyQIAQVhLA4bCQ==", "LHalg");
        lIIllIIII[lIIllIIIl[59]] = llllllIlIIl("Nqs7div1HbXh88gUiQU9fQ==", "EKPqC");
        lIIllIIII[lIIllIIIl[60]] = llllllIlIlI("MD0ePzJTPgE3IlMzGz0zGDAQNw==", "sQwRP");
        lIIllIIII[lIIllIIIl[61]] = llllllIlIIl("il9lm/jxOKBvjlHT3SfxlA==", "fSjCl");
        lIIllIIII[lIIllIIIl[62]] = llllllIlIll("3wJ2JPcfLMAP/UuyEZaF3g==", "JgYQj");
        lIIllIIII[lIIllIIIl[63]] = llllllIlIIl("G5aEN7HM7SnSeZXSdm1QhXjRkRqhlzCD", "pueAx");
        lIIllIIII[lIIllIIIl[64]] = llllllIlIll("xUYTuiDKJqqon6kbrUzLJdAVeMbWBZXX", "iCLRU");
        lIIllIIII[lIIllIIIl[65]] = llllllIlIll("/EcCD0h1TLsv0epHmc1ZCin0ww2ziPgQ", "tulAW");
        lIIllIIII[lIIllIIIl[66]] = llllllIlIIl("VxHFu8q2osg=", "qYXmp");
        lIIllIIII[lIIllIIIl[34]] = llllllIlIIl("B86vKYHRVGo=", "HviNz");
        lIIllIIII[lIIllIIIl[67]] = llllllIlIll("HAvHtwlSMso=", "DDWjb");
        lIIllIIII[lIIllIIIl[68]] = llllllIlIlI("BC4YCDYu", "EZliU");
        lIIllIIII[lIIllIIIl[69]] = llllllIlIIl("BX0NH/PotMU=", "MsqjK");
        lIIllIIII[lIIllIIIl[70]] = llllllIlIlI("CwM5BQ43C2wRCTcY", "XlLwf");
        lIIllIIII[lIIllIIIl[71]] = llllllIlIIl("EO2Z42aPZoHJNQ1KvbsZvg==", "CXJiK");
        lIIllIIII[lIIllIIIl[72]] = llllllIlIll("dZlKq2yF/RCplEFJmavtYg==", "oosFl");
        lIIllIIII[lIIllIIIl[73]] = llllllIlIll("couibGOtGIeIcf5efopt0g==", "gcIBK");
        lIIllIIII[lIIllIIIl[74]] = llllllIlIIl("mCjDaeJpm+BAKh705sB9HQ==", "AWlLe");
        lIIllIIII[lIIllIIIl[75]] = llllllIlIll("uA1Rg1LEu+kfBpVZq75dbQ==", "kfsNK");
        lIIllIIII[lIIllIIIl[76]] = llllllIlIIl("LHRWKZIvvzV88aTLkwih0KGZlFL/dXRd", "tPAAf");
        lIIllIIII[lIIllIIIl[77]] = llllllIlIlI("MTUAPjgLM0wmMBc1BA==", "eTlUQ");
        lIIllIIII[lIIllIIIl[78]] = llllllIlIll("eyD6JFUwjuw=", "RIJxn");
        lIIllIIII[lIIllIIIl[79]] = llllllIlIIl("ek1aGeWGbY3wHgpis0Amgw==", "sFxLI");
        lIIllIIII[lIIllIIIl[80]] = llllllIlIlI("LhUVHz4UE1kHJwgdGA==", "ztytW");
        lIIllIIII[lIIllIIIl[17]] = llllllIlIlI("GBMQPSI=", "KcbTC");
        lIIllIIII[lIIllIIIl[86]] = llllllIlIll("LnDrRoh0J9KLjeZezOzeD4DH0JvJH5tE", "vXpUs");
        lIIllIIII[lIIllIIIl[87]] = llllllIlIll("q4LQjk27I3Q64mrD04Vod9EnP9baR1JU", "KPZPX");
        lIIllIIII[lIIllIIIl[96]] = llllllIlIll("8MMq/8ntSqQ=", "dddgJ");
        lIIllIIII[lIIllIIIl[97]] = llllllIlIIl("Plqf9EvhWGN/1TXueS++JBrGU/5IY3rP", "ZeFnr");
        lIIllIIII[lIIllIIIl[98]] = llllllIlIlI("BlgzKzwhE2c3PS4MYC85bxoiYzQjFGclOj1YKSwiYQ==", "OxGCU");
        lIIllIIII[lIIllIIIl[99]] = llllllIlIIl("pt2JLJg3joc=", "hWglP");
    }

    private static boolean lllllllIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllllllIIl(int i) {
        return i < 0;
    }

    private static void llllllIlllI() {
        lIIllIIIl = new int[101];
        lIIllIIIl[0] = " ".length();
        lIIllIIIl[1] = ((27 ^ 3) ^ (2 ^ 91)) & (((23 ^ 68) ^ (166 ^ 180)) ^ (-" ".length()));
        lIIllIIIl[2] = (-((-8961) & 11095)) & (-1057) & 8190;
        lIIllIIIl[3] = "  ".length();
        lIIllIIIl[4] = (((79 + 84) - 61) + 32) ^ (((129 + 116) - 218) + 103);
        lIIllIIIl[5] = "  ".length() ^ (189 ^ 185);
        lIIllIIIl[6] = (-16569) & 24575;
        lIIllIIIl[7] = (-(((125 + 124) - 70) + 3)) & (-1) & 8189;
        lIIllIIIl[8] = (-((-795) & 3935)) & (-16386) & 20479;
        lIIllIIIl[9] = "   ".length();
        lIIllIIIl[10] = (-((-6499) & 7151)) & (-24641) & 26623;
        lIIllIIIl[11] = (-3619) & 16243;
        lIIllIIIl[12] = 127 ^ 122;
        lIIllIIIl[13] = (-30721) & 31099;
        lIIllIIIl[14] = (3 ^ 121) ^ (236 ^ 156);
        lIIllIIIl[15] = (-8215) & 16223;
        lIIllIIIl[16] = 170 ^ 162;
        lIIllIIIl[17] = (6 ^ 43) ^ (30 ^ 114);
        lIIllIIIl[18] = 65 ^ 70;
        lIIllIIIl[19] = 107 ^ 98;
        lIIllIIIl[20] = (-29710) & 32751;
        lIIllIIIl[21] = (-8453) & 11757;
        lIIllIIIl[22] = "  ".length() ^ (15 ^ 6);
        lIIllIIIl[23] = (-((-5023) & 30655)) & (-1) & 28671;
        lIIllIIIl[24] = (-28931) & 32227;
        lIIllIIIl[25] = (60 ^ 78) ^ (105 ^ 23);
        lIIllIIIl[26] = 132 ^ 137;
        lIIllIIIl[27] = 133 ^ 139;
        lIIllIIIl[28] = 19 ^ 28;
        lIIllIIIl[29] = (68 ^ 15) ^ (97 ^ 58);
        lIIllIIIl[30] = 78 ^ 95;
        lIIllIIIl[31] = 4 ^ 22;
        lIIllIIIl[32] = (-1040) & 8015;
        lIIllIIIl[33] = (-((-14179) & 30579)) & (-9774) & 32509;
        lIIllIIIl[34] = (((4 + 27) - (-48)) + 91) ^ (((44 + 50) - 4) + 62);
        lIIllIIIl[35] = (((70 + 6) - 29) + 89) ^ (((115 + 32) - 25) + 33);
        lIIllIIIl[36] = "   ".length() ^ (141 ^ 154);
        lIIllIIIl[37] = (-((-535) & 10807)) & (-17428) & 32755;
        lIIllIIIl[38] = 149 ^ 128;
        lIIllIIIl[39] = 90 ^ 76;
        lIIllIIIl[40] = 51 ^ 36;
        lIIllIIIl[41] = 170 ^ 178;
        lIIllIIIl[42] = 126 ^ 103;
        lIIllIIIl[43] = (((61 + 58) - 82) + 126) ^ (((33 + 75) - (-70)) + 7);
        lIIllIIIl[44] = 170 ^ 177;
        lIIllIIIl[45] = 7 ^ 27;
        lIIllIIIl[46] = 26 ^ 7;
        lIIllIIIl[47] = (((166 + 78) - 51) + 30) ^ (((119 + 23) - 34) + 85);
        lIIllIIIl[48] = (((99 + 33) - 131) + 147) ^ (((68 + 132) - 199) + 138);
        lIIllIIIl[49] = (85 ^ 71) ^ (9 ^ 59);
        lIIllIIIl[50] = 171 ^ 138;
        lIIllIIIl[51] = 183 ^ 149;
        lIIllIIIl[52] = (((93 + 111) - 184) + 121) ^ (((91 + 128) - 204) + 159);
        lIIllIIIl[53] = (((32 + 46) - (-60)) + 13) ^ (((56 + 27) - (-75)) + 21);
        lIIllIIIl[54] = 176 ^ 149;
        lIIllIIIl[55] = 144 ^ 182;
        lIIllIIIl[56] = (83 ^ 16) ^ (230 ^ 130);
        lIIllIIIl[57] = 124 ^ 84;
        lIIllIIIl[58] = 92 ^ 117;
        lIIllIIIl[59] = 9 ^ 35;
        lIIllIIIl[60] = 92 ^ 119;
        lIIllIIIl[61] = (((155 + 151) - 292) + 151) ^ (((38 + 77) - 78) + 100);
        lIIllIIIl[62] = (231 ^ 165) ^ (75 ^ 36);
        lIIllIIIl[63] = (97 ^ 42) ^ (5 ^ 96);
        lIIllIIIl[64] = (33 ^ 76) ^ (213 ^ 151);
        lIIllIIIl[65] = 73 ^ 121;
        lIIllIIIl[66] = 26 ^ 43;
        lIIllIIIl[67] = (((87 + 13) - 47) + 188) ^ (((15 + 15) - (-133)) + 31);
        lIIllIIIl[68] = 149 ^ 161;
        lIIllIIIl[69] = 104 ^ 93;
        lIIllIIIl[70] = 188 ^ 138;
        lIIllIIIl[71] = 2 ^ 53;
        lIIllIIIl[72] = (161 ^ 137) ^ (111 ^ 127);
        lIIllIIIl[73] = 29 ^ 36;
        lIIllIIIl[74] = (167 ^ 157) ^ ((36 ^ 102) & ((219 ^ 153) ^ (-1)));
        lIIllIIIl[75] = 18 ^ 41;
        lIIllIIIl[76] = 176 ^ 140;
        lIIllIIIl[77] = (191 ^ 186) ^ (158 ^ 166);
        lIIllIIIl[78] = (25 ^ 101) ^ (114 ^ 48);
        lIIllIIIl[79] = 70 ^ 121;
        lIIllIIIl[80] = (186 ^ 130) ^ (217 ^ 161);
        lIIllIIIl[81] = (-((-18953) & 24157)) & (-2049) & 16252;
        lIIllIIIl[82] = (-17428) & 18327;
        lIIllIIIl[83] = (-((-28765) & 29055)) & (-20481) & 32750;
        lIIllIIIl[84] = (-7253) & 32252;
        lIIllIIIl[85] = (46 ^ 124) ^ (127 ^ 73);
        lIIllIIIl[86] = (((7 + 26) - (-71)) + 128) ^ (((140 + 103) - 113) + 40);
        lIIllIIIl[87] = (107 ^ 86) ^ (216 ^ 166);
        lIIllIIIl[88] = (-((-3201) & 16371)) & (-16385) & 32639;
        lIIllIIIl[89] = (-12353) & 15603;
        lIIllIIIl[90] = (-((-15753) & 32171)) & (-13314) & 32767;
        lIIllIIIl[91] = (-((-8606) & 29599)) & (-8225) & 32511;
        lIIllIIIl[92] = (-((-5133) & 14255)) & (-2) & 12271;
        lIIllIIIl[93] = (-((-6917) & 23493)) & (-545) & 20467;
        lIIllIIIl[94] = (-17293) & 20383;
        lIIllIIIl[95] = (-((-7393) & 32243)) & (-45) & 28159;
        lIIllIIIl[96] = 34 ^ 102;
        lIIllIIIl[97] = (213 ^ 196) ^ (127 ^ 43);
        lIIllIIIl[98] = 54 ^ 112;
        lIIllIIIl[99] = (251 ^ 190) ^ "  ".length();
        lIIllIIIl[100] = 137 ^ 193;
    }

    private static int llllllIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lllllllIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lllllllIlIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllllllIlII(int i) {
        return i > 0;
    }

    private static boolean lllllllIIlI(int i) {
        return i == 0;
    }

    static {
        llllllIlllI();
        llllllIllIl();
        bv = new ArrayList();
        bX = new WorldPoint(lIIllIIIl[88], lIIllIIIl[89], lIIllIIIl[1]);
        ci = new WorldPoint(lIIllIIIl[90], lIIllIIIl[91], lIIllIIIl[1]);
        cj = new WorldPoint(lIIllIIIl[92], lIIllIIIl[93], lIIllIIIl[1]);
        ck = new WorldPoint(lIIllIIIl[94], lIIllIIIl[95], lIIllIIIl[1]);
        cn = null;
        String[] strArr = new String[lIIllIIIl[4]];
        strArr[lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[96]];
        strArr[lIIllIIIl[0]] = lIIllIIII[lIIllIIIl[97]];
        strArr[lIIllIIIl[3]] = lIIllIIII[lIIllIIIl[98]];
        strArr[lIIllIIIl[9]] = lIIllIIII[lIIllIIIl[99]];
        bR = strArr;
    }

    private static boolean lllllllIIll(Object obj) {
        return obj != null;
    }

    private static String llllllIlIlI(String lIIIIIlIllIlIII, String lIIIIIlIllIIlll) {
        String str = new String(Base64.getDecoder().decode(lIIIIIlIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIIIlIllIIlll.toCharArray();
        int lIIIIIlIllIIlII = lIIllIIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIl[1];
        while (lllllllIIIl(i, length)) {
            char lIIIIIlIlIllIll = charArray2[i];
            sb.append((char) (lIIIIIlIlIllIll ^ charArray[lIIIIIlIllIIlII % charArray.length]));
            "".length();
            lIIIIIlIllIIlII++;
            i++;
            "".length();
            if ("   ".length() >= (134 ^ 130)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aG();
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (76 ^ 45) & ((13 ^ 108) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllIIIl[85];
    }

    private static String llllllIlIll(String lIIIIIlIlIlIIll, String lIIIIIlIlIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIlIlIlIlII) {
            lIIIIIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (lllllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0017r.lIIllIIIl[12]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIllIIIl[0]];
        iArr2[lIIllIIIl[1]] = lIIllIIIl[8];
        if (lllllllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIl[8], lIIllIIIl[0], lIIllIIIl[81]));
            "".length();
        }
        int[] iArr3 = new int[lIIllIIIl[0]];
        iArr3[lIIllIIIl[1]] = lIIllIIIl[10];
        if (lllllllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIl[10], lIIllIIIl[0], lIIllIIIl[81]));
            "".length();
        }
        int[] iArr4 = new int[lIIllIIIl[0]];
        iArr4[lIIllIIIl[1]] = lIIllIIIl[13];
        if (lllllllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIl[13], lIIllIIIl[50], lIIllIIIl[82]));
            "".length();
        }
        int[] iArr5 = new int[lIIllIIIl[0]];
        iArr5[lIIllIIIl[1]] = lIIllIIIl[11];
        if (lllllllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIl[11], lIIllIIIl[12], C0008i.bq));
            "".length();
        }
        if (lllllllIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllIIII[lIIllIIIl[87]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIIIl[83], lIIllIIIl[12], lIIllIIIl[84]));
            "".length();
        }
        int[] iArr6 = new int[lIIllIIIl[0]];
        iArr6[lIIllIIIl[1]] = lIIllIIIl[7];
        if (lllllllIIII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIllIIIl[0]];
            iArr7[lIIllIIIl[1]] = lIIllIIIl[7];
            if (lllllllIIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIllIIIl[0]];
                iArr8[lIIllIIIl[1]] = lIIllIIIl[7];
            }
            iArr = new int[lIIllIIIl[0]];
            iArr[lIIllIIIl[1]] = lIIllIIIl[6];
            if (lllllllIIlI(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIIllIIIl[6], lIIllIIIl[57], lIIllIIIl[82]));
            "".length();
            return;
        }
        bv.add(new C0003d(lIIllIIIl[7], lIIllIIIl[28], lIIllIIIl[82]));
        "".length();
        iArr = new int[lIIllIIIl[0]];
        iArr[lIIllIIIl[1]] = lIIllIIIl[6];
        if (lllllllIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean lllllllIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (lllllllIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        int[] iArr = new int[lIIllIIIl[0]];
        iArr[lIIllIIIl[1]] = lIIllIIIl[6];
        if (lllllllIlII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIllIIIl[0]];
            iArr2[lIIllIIIl[1]] = lIIllIIIl[8];
            if (lllllllIlII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIllIIIl[0]];
                iArr3[lIIllIIIl[1]] = lIIllIIIl[10];
                if (llllllllIlI(Inventory.getCount(iArr3))) {
                    int[] iArr4 = new int[lIIllIIIl[0]];
                    iArr4[lIIllIIIl[1]] = lIIllIIIl[10];
                }
                int[] iArr5 = new int[lIIllIIIl[0]];
                iArr5[lIIllIIIl[1]] = lIIllIIIl[13];
                if (lllllllIlII(Inventory.getCount(iArr5))) {
                    ?? r0 = lIIllIIIl[0];
                    "".length();
                    return ((82 ^ 19) & ((238 ^ 175) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIllIIIl[1];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIllIIII[lIIllIIIl[86]];
    }

    private static boolean llllllllIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIllIIIl[1];
    }
}

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
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.D  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/D.class */
public class D implements W {
    public static /* synthetic */ String[] bR;
    private static /* synthetic */ int[] lIllIIllI;
    private static /* synthetic */ String[] lIllIIlII;
    public static final /* synthetic */ WorldPoint dK;
    public static final /* synthetic */ WorldPoint dM;
    public static final /* synthetic */ WorldPoint dS;
    public static final /* synthetic */ WorldPoint dO;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint dT;
    public static final /* synthetic */ WorldPoint dR;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldArea dV;
    public static final /* synthetic */ WorldPoint dN;
    public static final /* synthetic */ WorldPoint dQ;
    public static final /* synthetic */ WorldPoint dP;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ int dU;
    static /* synthetic */ WorldArea dW;
    public static final /* synthetic */ WorldPoint dL;
    static /* synthetic */ int cl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIllIIllI[6]];
        iArr[lIllIIllI[1]] = lIllIIllI[14];
        iArr[lIllIIllI[0]] = lIllIIllI[12];
        iArr[lIllIIllI[4]] = lIllIIllI[15];
        int i = lIllIIllI[1];
        while (lIIlIllIlllI(i, iArr.length)) {
            int[] iArr2 = new int[lIllIIllI[0]];
            iArr2[lIllIIllI[1]] = iArr[i];
            if (lIIlIllIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIllIIllI[1];
            }
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return ((((58 + 72) - 97) + 146) ^ (((147 + 150) - 160) + 43)) & (((117 ^ 87) ^ (169 ^ 140)) ^ (-" ".length()));
            }
        }
        return lIllIIllI[0];
    }

    private static void bz() {
        if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dK), lIllIIllI[4])) {
            AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[89]];
            WorldArea worldArea = new WorldArea(lIllIIllI[90], lIllIIllI[91], lIllIIllI[92], lIllIIllI[93], lIllIIllI[1]);
            new WorldPoint(lIllIIllI[94], lIllIIllI[95], lIllIIllI[1]);
            WorldArea worldArea2 = new WorldArea(lIllIIllI[96], lIllIIllI[97], lIllIIllI[35], lIllIIllI[7], lIllIIllI[1]);
            WorldArea worldArea3 = new WorldArea(lIllIIllI[98], lIllIIllI[99], lIllIIllI[20], lIllIIllI[16], lIllIIllI[1]);
            if (lIIlIllIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIIlIllIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst(C0005f.aN).interact(lIllIIlII[lIllIIllI[100]]);
                Time.sleepTicks(lIllIIllI[16]);
                "".length();
            }
            if (lIIlIllIllll(F.hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(F.hr);
                "".length();
            }
            if (lIIlIllIllIl(F.hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of((Object[]) F.gv));
                "".length();
                Time.sleepTicks(lIllIIllI[0]);
                "".length();
            }
            if (!lIIlIllIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlIllIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr = new String[lIllIIllI[0]];
                strArr[lIllIIllI[1]] = lIllIIlII[lIllIIllI[101]];
                TileObjects.getNearest(strArr).interact(lIllIIlII[lIllIIllI[102]]);
                Time.sleepTicks(lIllIIllI[7]);
                "".length();
            }
            if ((!lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlIllIllIl(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dK), lIllIIllI[4])) {
                Movement.walkTo(dK);
                "".length();
                Time.sleepTicks(lIllIIllI[0]);
                "".length();
            }
        }
    }

    private static String lIIlIlIllIIl(String llIllIllIIlIII, String llIllIllIIIlll) {
        try {
            SecretKeySpec llIllIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllIIIlll.getBytes(StandardCharsets.UTF_8)), lIllIIllI[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIllI[4], llIllIllIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIllIIlIIl) {
            llIllIllIIlIIl.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            by();
            "".length();
            if (0 != 0) {
                return ((((153 + 128) - 278) + 182) ^ (((43 + 136) - 139) + 119)) & (((1 ^ 101) ^ (216 ^ 154)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIllIIllI[108];
    }

    private static boolean lIIlIlllIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlllIllI(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIlIllIlI(String llIllIlIlllIll, String llIllIlIlllIlI) {
        try {
            SecretKeySpec llIllIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIlIllllIl = Cipher.getInstance("Blowfish");
            llIllIlIllllIl.init(lIllIIllI[4], llIllIlIlllllI);
            return new String(llIllIlIllllIl.doFinal(Base64.getDecoder().decode(llIllIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIlIllllII) {
            llIllIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIlll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e6, code lost:
        if (lIIlIlllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[9]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0229, code lost:
        if (lIIlIlllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[9]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026c, code lost:
        if (lIIlIlllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[9]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02af, code lost:
        if (lIIlIllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[13]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02b2, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIlII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[7]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02cd, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v644, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v665, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v701, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void by() {
        if (lIIlIllIllIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIlIllIlllI(bv.size(), lIllIIllI[0])) {
                System.out.println(lIllIIlII[lIllIIllI[1]]);
                bt = lIllIIllI[1];
            }
        }
        if (lIIlIllIllll(bt ? 1 : 0)) {
            if (lIIlIllIlllI(Skills.getLevel(Skill.MAGIC), lIllIIllI[2])) {
                C0011l.Y();
            }
            if (lIIlIlllIIII(Skills.getLevel(Skill.MAGIC), lIllIIllI[2]) && lIIlIllIlllI(Skills.getLevel(Skill.PRAYER), lIllIIllI[3])) {
                al.dD();
            }
            if (lIIlIlllIIII(Skills.getLevel(Skill.PRAYER), lIllIIllI[3]) && lIIlIllIllIl(Inventory.contains(C0005f.ba) ? 1 : 0)) {
                Inventory.getFirst(C0005f.ba).interact(lIllIIlII[lIllIIllI[0]]);
            }
            if (lIIlIllIllll(ab() ? 1 : 0) && lIIlIllIlllI(C0004e.j(dU), lIllIIllI[0]) && lIIlIlllIIII(Skills.getLevel(Skill.MAGIC), lIllIIllI[2]) && lIIlIlllIIII(Skills.getLevel(Skill.PRAYER), lIllIIllI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIlllIIIl(nearest) && lIIlIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[4]];
                    C0000a.a(nearest);
                }
                if (lIIlIlllIIIl(nearest) && lIIlIllIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIllIllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIllI[5]);
                        "".length();
                    }
                    if (lIIlIllIllIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[6]];
                        if (lIIlIlllIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIllI[7]);
                            "".length();
                        }
                        if (lIIlIlllIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIllI[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIllIIllI[0]];
                        iArr[lIllIIllI[1]] = lIllIIllI[8];
                        if (lIIlIllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllIIllI[0]];
                            iArr2[lIllIIllI[1]] = lIllIIllI[8];
                        }
                        int[] iArr3 = new int[lIllIIllI[0]];
                        iArr3[lIllIIllI[1]] = lIllIIllI[10];
                        if (lIIlIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIllIIllI[0]];
                            iArr4[lIllIIllI[1]] = lIllIIllI[10];
                        }
                        int[] iArr5 = new int[lIllIIllI[0]];
                        iArr5[lIllIIllI[1]] = lIllIIllI[11];
                        if (lIIlIllIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIIllI[0]];
                            iArr6[lIllIIllI[1]] = lIllIIllI[11];
                        }
                        int[] iArr7 = new int[lIllIIllI[0]];
                        iArr7[lIllIIllI[1]] = lIllIIllI[12];
                        if (lIIlIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIllIIllI[0]];
                            iArr8[lIllIIllI[1]] = lIllIIllI[12];
                        }
                        int[] iArr9 = new int[lIllIIllI[13]];
                        iArr9[lIllIIllI[1]] = lIllIIllI[14];
                        iArr9[lIllIIllI[0]] = lIllIIllI[12];
                        iArr9[lIllIIllI[4]] = lIllIIllI[15];
                        iArr9[lIllIIllI[6]] = lIllIIllI[11];
                        iArr9[lIllIIllI[7]] = lIllIIllI[10];
                        iArr9[lIllIIllI[16]] = lIllIIllI[8];
                        if (lIIlIllIllll(C0004e.b(iArr9) ? 1 : 0)) {
                            af();
                            System.out.println(lIllIIlII[lIllIIllI[16]]);
                            bt = lIllIIllI[0];
                            return;
                        }
                        while (lIIlIllIllll(C0025z.bi() ? 1 : 0)) {
                            C0025z.bg();
                            Time.sleepTicks(lIllIIllI[0]);
                            "".length();
                            "".length();
                            if ((((((9 + 66) - 61) + 115) ^ (((94 + 94) - 59) + 52)) & (((9 ^ 26) ^ (191 ^ 152)) ^ (-" ".length()))) == " ".length()) {
                                return;
                            }
                        }
                        if (lIIlIllIllll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIllIIllI[13]);
                            "".length();
                        }
                        int[] iArr10 = new int[lIllIIllI[17]];
                        iArr10[lIllIIllI[1]] = lIllIIllI[14];
                        iArr10[lIllIIllI[0]] = lIllIIllI[12];
                        iArr10[lIllIIllI[4]] = lIllIIllI[15];
                        iArr10[lIllIIllI[6]] = lIllIIllI[18];
                        iArr10[lIllIIllI[7]] = lIllIIllI[11];
                        iArr10[lIllIIllI[16]] = lIllIIllI[10];
                        iArr10[lIllIIllI[13]] = lIllIIllI[8];
                        if (lIIlIllIllIl(C0004e.b(iArr10) ? 1 : 0)) {
                            C0000a.a(lIllIIllI[18], lIllIIllI[7]);
                            C0000a.b(C0005f.aN, lIllIIllI[0]);
                            C0000a.a(lIllIIllI[12], lIllIIllI[13]);
                            C0000a.a(lIllIIllI[19], lIllIIllI[20]);
                            C0000a.a(lIllIIllI[15], lIllIIllI[6]);
                            C0000a.a(lIllIIllI[14], lIllIIllI[21]);
                            int[] iArr11 = new int[lIllIIllI[0]];
                            iArr11[lIllIIllI[1]] = lIllIIllI[8];
                            if (lIIlIllIllIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIllIIllI[0]];
                                iArr12[lIllIIllI[1]] = lIllIIllI[8];
                                if (lIIlIllIlllI(Inventory.getCount(iArr12), lIllIIllI[0])) {
                                    Bank.withdraw(lIllIIllI[8], lIllIIllI[22], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllIIllI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIllIIllI[0]];
                                        iArr13[lIllIIllI[1]] = lIllIIllI[8];
                                        if (lIIlIlllIIlI(Inventory.getCount(iArr13))) {
                                            ?? r0 = lIllIIllI[0];
                                            "".length();
                                            return " ".length() < 0 ? ((125 ^ 30) ^ (63 ^ 101)) & (((79 ^ 41) ^ (238 ^ 177)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllIIllI[1];
                                    }, lIllIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr13 = new int[lIllIIllI[0]];
                            iArr13[lIllIIllI[1]] = lIllIIllI[11];
                            if (lIIlIllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIllIIllI[0]];
                                iArr14[lIllIIllI[1]] = lIllIIllI[11];
                                if (lIIlIllIlllI(Inventory.getCount(iArr14), lIllIIllI[0])) {
                                    Bank.withdraw(lIllIIllI[11], lIllIIllI[23], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllIIllI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIllIIllI[0]];
                                        iArr15[lIllIIllI[1]] = lIllIIllI[11];
                                        if (lIIlIlllIIlI(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIllIIllI[0];
                                            "".length();
                                            return " ".length() >= (172 ^ 168) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                                        }
                                        return lIllIIllI[1];
                                    }, lIllIIllI[5]);
                                    "".length();
                                }
                            }
                            if (lIIlIllIlllI(Skills.getLevel(Skill.MAGIC), lIllIIllI[2])) {
                                C0000a.a(lIllIIllI[10], lIllIIllI[22]);
                            }
                        }
                    }
                }
            }
            if (lIIlIllIllIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIllIlllI(Movement.getRunEnergy(), lIllIIllI[24])) {
                Inventory.getFirst(C0005f.aV).interact(lIllIIlII[lIllIIllI[13]]);
                Time.sleepTicks(lIllIIllI[0]);
                "".length();
            }
            if (lIIlIlllIIll(lIIlIllIllII(C0004e.u(), 50.0d))) {
                int[] iArr15 = new int[lIllIIllI[0]];
                iArr15[lIllIIllI[1]] = lIllIIllI[19];
                if (lIIlIllIllIl(Inventory.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIllIIllI[0]];
                    iArr16[lIllIIllI[1]] = lIllIIllI[19];
                    Inventory.getFirst(iArr16).interact(lIllIIlII[lIllIIllI[17]]);
                    Time.sleepTicks(lIllIIllI[0]);
                    "".length();
                }
            }
            if (lIIlIllIllIl(ab() ? 1 : 0) && lIIlIllIlllI(C0004e.j(dU), lIllIIllI[0])) {
                if (lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bz();
                }
                if (lIIlIllIllIl(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIllIIlII[lIllIIllI[20]], bR);
                }
            }
            if ((!lIIlIlllIlII(C0004e.j(dU), lIllIIllI[0]) || !lIIlIlllIlII(C0004e.j(dU), lIllIIllI[4]) || lIIlIlllIlIl(C0004e.j(dU), lIllIIllI[6])) && lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIllI[20]) && lIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[25]];
                    Movement.walkTo(dL);
                    "".length();
                    Time.sleepTicks(lIllIIllI[0]);
                    "".length();
                }
                if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIllI[20])) {
                    C0006g.a(lIllIIlII[lIllIIllI[21]], bR);
                }
            }
            if (lIIlIlllIlIl(C0004e.j(dU), lIllIIllI[7])) {
                cl = lIllIIllI[1];
                if (lIIlIllIllll(Vars.getBit(lIllIIllI[26]))) {
                    if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIllI[7])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[27]];
                        Movement.walkTo(dN);
                        "".length();
                        Time.sleepTicks(lIllIIllI[0]);
                        "".length();
                    }
                    if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIllI[7])) {
                        String[] strArr = new String[lIllIIllI[0]];
                        strArr[lIllIIllI[1]] = lIllIIlII[lIllIIllI[28]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        String[] strArr2 = new String[lIllIIllI[0]];
                        strArr2[lIllIIllI[1]] = lIllIIlII[lIllIIllI[2]];
                        if (lIIlIllIllIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[lIllIIllI[0]];
                            strArr3[lIllIIllI[1]] = lIllIIlII[lIllIIllI[29]];
                            TileObjects.getNearest(strArr3).interact(lIllIIlII[lIllIIllI[30]]);
                            Time.sleepTicks(lIllIIllI[6]);
                            "".length();
                        }
                        String[] strArr4 = new String[lIllIIllI[0]];
                        strArr4[lIllIIllI[1]] = lIllIIlII[lIllIIllI[31]];
                        TileObject nearest3 = TileObjects.getNearest(strArr4);
                        String[] strArr5 = new String[lIllIIllI[0]];
                        strArr5[lIllIIllI[1]] = lIllIIlII[lIllIIllI[32]];
                        if (lIIlIllIllll(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            C0006g.a(lIllIIlII[lIllIIllI[33]], bR);
                        }
                    }
                }
                if (lIIlIlllIlIl(Vars.getBit(lIllIIllI[26]), lIllIIllI[0]) && lIIlIllIllll(Vars.getBit(lIllIIllI[34]))) {
                    if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIllI[13])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[35]];
                        Movement.walkTo(dO);
                        "".length();
                        Time.sleepTicks(lIllIIllI[0]);
                        "".length();
                    }
                    if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIllI[13])) {
                        C0006g.a(lIllIIlII[lIllIIllI[36]], bR);
                    }
                }
                if (lIIlIlllIlIl(Vars.getBit(lIllIIllI[26]), lIllIIllI[0]) && lIIlIlllIlIl(Vars.getBit(lIllIIllI[34]), lIllIIllI[0]) && lIIlIllIllll(Vars.getBit(lIllIIllI[37]))) {
                    if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dP), lIllIIllI[13])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[38]];
                        Movement.walkTo(dP);
                        "".length();
                        Time.sleepTicks(lIllIIllI[0]);
                        "".length();
                    }
                    if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dP), lIllIIllI[13])) {
                        C0006g.a(lIllIIlII[lIllIIllI[39]], bR);
                    }
                }
                if (lIIlIlllIlIl(Vars.getBit(lIllIIllI[26]), lIllIIllI[0]) && lIIlIlllIlIl(Vars.getBit(lIllIIllI[34]), lIllIIllI[0]) && lIIlIlllIlIl(Vars.getBit(lIllIIllI[37]), lIllIIllI[0])) {
                    if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dQ), lIllIIllI[4])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[40]];
                        Movement.walkTo(dQ);
                        "".length();
                        Time.sleepTicks(lIllIIllI[0]);
                        "".length();
                    }
                    if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dQ), lIllIIllI[4])) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[41]];
                        if (lIIlIllIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lIllIIllI[0]];
                            strArr6[lIllIIllI[1]] = lIllIIlII[lIllIIllI[42]];
                            TileObjects.getNearest(strArr6).interact(lIllIIlII[lIllIIllI[43]]);
                            Time.sleepTicks(lIllIIllI[6]);
                            "".length();
                        }
                        int bit = Vars.getBit(lIllIIllI[44]);
                        if (lIIlIllIllll(Dialog.getOptions().isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + bit);
                            if (lIIlIllIllll(bit)) {
                                String[] strArr7 = new String[lIllIIllI[0]];
                                strArr7[lIllIIllI[1]] = lIllIIlII[lIllIIllI[45]];
                                Dialog.chooseOption(strArr7);
                                "".length();
                            }
                            if (lIIlIlllIlIl(bit, lIllIIllI[0])) {
                                String[] strArr8 = new String[lIllIIllI[0]];
                                strArr8[lIllIIllI[1]] = lIllIIlII[lIllIIllI[46]];
                                Dialog.chooseOption(strArr8);
                                "".length();
                            }
                            if (lIIlIlllIlIl(bit, lIllIIllI[4])) {
                                String[] strArr9 = new String[lIllIIllI[0]];
                                strArr9[lIllIIllI[1]] = lIllIIlII[lIllIIllI[47]];
                                Dialog.chooseOption(strArr9);
                                "".length();
                            }
                            if (lIIlIlllIlIl(bit, lIllIIllI[6])) {
                                String[] strArr10 = new String[lIllIIllI[0]];
                                strArr10[lIllIIllI[1]] = lIllIIlII[lIllIIllI[48]];
                                Dialog.chooseOption(strArr10);
                                "".length();
                            }
                            Time.sleepTicks(lIllIIllI[4]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIlllIlIl(C0004e.j(dU), lIllIIllI[16])) {
                WorldArea worldArea = new WorldArea(lIllIIllI[49], lIllIIllI[50], lIllIIllI[17], lIllIIllI[16], lIllIIllI[1]);
                if (lIIlIllIllll(Players.getLocal().getWorldLocation().getPlane())) {
                    WorldArea worldArea2 = new WorldArea(lIllIIllI[51], lIllIIllI[50], lIllIIllI[28], lIllIIllI[13], lIllIIllI[1]);
                    WorldArea worldArea3 = new WorldArea(lIllIIllI[51], lIllIIllI[52], lIllIIllI[7], lIllIIllI[16], lIllIIllI[1]);
                    WorldArea worldArea4 = new WorldArea(lIllIIllI[53], lIllIIllI[54], lIllIIllI[7], lIllIIllI[4], lIllIIllI[1]);
                    WorldArea worldArea5 = new WorldArea(lIllIIllI[53], lIllIIllI[52], lIllIIllI[6], lIllIIllI[6], lIllIIllI[1]);
                    if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dR), lIllIIllI[4]) && lIIlIllIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllIllll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[55]];
                        Movement.walkTo(dR);
                        "".length();
                        Time.sleepTicks(lIllIIllI[0]);
                        "".length();
                    }
                    if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dR), lIllIIllI[4]) && lIIlIllIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr11 = new String[lIllIIllI[0]];
                        strArr11[lIllIIllI[1]] = lIllIIlII[lIllIIllI[56]];
                        TileObjects.getNearest(strArr11).interact(lIllIIlII[lIllIIllI[57]]);
                        Time.sleepTicks(lIllIIllI[4]);
                        "".length();
                    }
                    if (lIIlIllIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIllI[58], lIllIIllI[59], lIllIIllI[1])), lIllIIllI[4])) {
                            Movement.walkTo(new WorldPoint(lIllIIllI[58], lIllIIllI[59], lIllIIllI[1]));
                            "".length();
                            Time.sleepTicks(lIllIIllI[0]);
                            "".length();
                        }
                        if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIllI[58], lIllIIllI[59], lIllIIllI[1])), lIllIIllI[4])) {
                            String[] strArr12 = new String[lIllIIllI[0]];
                            strArr12[lIllIIllI[1]] = lIllIIlII[lIllIIllI[60]];
                            TileObject nearest4 = TileObjects.getNearest(strArr12);
                            String[] strArr13 = new String[lIllIIllI[0]];
                            strArr13[lIllIIllI[1]] = lIllIIlII[lIllIIllI[61]];
                            if (lIIlIllIllIl(nearest4.hasAction(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lIllIIllI[0]];
                                strArr14[lIllIIllI[1]] = lIllIIlII[lIllIIllI[62]];
                                TileObjects.getNearest(strArr14).interact(lIllIIlII[lIllIIllI[63]]);
                                Time.sleepTicks(lIllIIllI[4]);
                                "".length();
                            }
                            String[] strArr15 = new String[lIllIIllI[0]];
                            strArr15[lIllIIllI[1]] = lIllIIlII[lIllIIllI[64]];
                            TileObject nearest5 = TileObjects.getNearest(strArr15);
                            String[] strArr16 = new String[lIllIIllI[0]];
                            strArr16[lIllIIllI[1]] = lIllIIlII[lIllIIllI[65]];
                            if (lIIlIllIllll(nearest5.hasAction(strArr16) ? 1 : 0)) {
                                String[] strArr17 = new String[lIllIIllI[0]];
                                strArr17[lIllIIllI[1]] = lIllIIlII[lIllIIllI[66]];
                                TileObjects.getNearest(strArr17).interact(lIllIIlII[lIllIIllI[67]]);
                                Time.sleepTicks(lIllIIllI[16]);
                                "".length();
                            }
                        }
                        if (!lIIlIllIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIIlIllIllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIIlIllIllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlIllIllIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr18 = new String[lIllIIllI[0]];
                            strArr18[lIllIIllI[1]] = lIllIIlII[lIllIIllI[68]];
                            TileObjects.getNearest(strArr18).interact(lIllIIlII[lIllIIllI[69]]);
                            Time.sleepTicks(lIllIIllI[16]);
                            "".length();
                        }
                    }
                }
                if (lIIlIlllIlIl(Players.getLocal().getWorldLocation().getPlane(), lIllIIllI[0])) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[70]];
                    String[] strArr19 = new String[lIllIIllI[0]];
                    strArr19[lIllIIllI[1]] = lIllIIlII[lIllIIllI[3]];
                    if (lIIlIlllIIIl(TileObjects.getNearest(strArr19))) {
                        String[] strArr20 = new String[lIllIIllI[0]];
                        strArr20[lIllIIllI[1]] = lIllIIlII[lIllIIllI[71]];
                        TileObjects.getNearest(strArr20).interact(lIllIIlII[lIllIIllI[72]]);
                        Time.sleepTicks(lIllIIllI[16]);
                        "".length();
                    }
                    String[] strArr21 = new String[lIllIIllI[0]];
                    strArr21[lIllIIllI[1]] = lIllIIlII[lIllIIllI[73]];
                    if (lIIlIlllIIIl(TileObjects.getNearest(strArr21))) {
                        String[] strArr22 = new String[lIllIIllI[0]];
                        strArr22[lIllIIllI[1]] = lIllIIlII[lIllIIllI[74]];
                        TileObjects.getNearest(strArr22).interact(lIllIIlII[lIllIIllI[24]]);
                        Time.sleepTicks(lIllIIllI[4]);
                        "".length();
                    }
                }
            }
            if (lIIlIlllIlIl(C0004e.j(dU), lIllIIllI[13])) {
                if (lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bz();
                }
                if (lIIlIllIllIl(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIllIIlII[lIllIIllI[75]], bR);
                }
            }
            if (lIIlIlllIlIl(C0004e.j(dU), lIllIIllI[17])) {
                if (lIIlIlllIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIllIIllI[25])) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[76]];
                    Movement.walkTo(dT);
                    "".length();
                    Time.sleepTicks(lIllIIllI[4]);
                    "".length();
                }
                if (lIIlIlllIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIllIIllI[25])) {
                    if (lIIlIllIllll(C0011l.ad() ? 1 : 0)) {
                        C0011l.ae();
                    }
                    String[] strArr23 = new String[lIllIIllI[0]];
                    strArr23[lIllIIllI[1]] = lIllIIlII[lIllIIllI[77]];
                    NPC nearest6 = NPCs.getNearest(strArr23);
                    NPC nearest7 = NPCs.getNearest(npc -> {
                        if (lIIlIllIllIl(npc.getName().contains(lIllIIlII[lIllIIllI[111]]) ? 1 : 0) && lIIlIlllllII(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIllIIllI[0];
                            "".length();
                            return "   ".length() > "   ".length() ? ((104 ^ 82) ^ (33 ^ 78)) & (((((119 + 142) - 206) + 96) ^ (((152 + 187) - 271) + 126)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIllI[1];
                    });
                    if (lIIlIlllIIIl(nearest6) && lIIlIllllIII(nearest7)) {
                        String[] strArr24 = new String[lIllIIllI[0]];
                        strArr24[lIllIIllI[1]] = lIllIIlII[lIllIIllI[78]];
                        if (lIIlIllIllll(nearest6.hasAction(strArr24) ? 1 : 0)) {
                            C0006g.a(lIllIIlII[lIllIIllI[79]], bR);
                        }
                        String[] strArr25 = new String[lIllIIllI[0]];
                        strArr25[lIllIIllI[1]] = lIllIIlII[lIllIIllI[80]];
                        if (lIIlIllIllIl(nearest6.hasAction(strArr25) ? 1 : 0) && lIIlIllllIII(Players.getLocal().getInteracting())) {
                            AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[81]];
                            if (lIIlIllIllll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (lIIlIllIlllI(Prayers.getPoints(), lIllIIllI[40]) && lIIlIllIllIl(Inventory.contains(C0005f.aS) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aS).interact(lIllIIlII[lIllIIllI[82]]);
                        Time.sleepTicks(lIllIIllI[0]);
                        "".length();
                    }
                    C0006g.a(bR);
                }
            }
            if (lIIlIlllIlIl(C0004e.j(dU), lIllIIllI[20])) {
                String[] strArr26 = new String[lIllIIllI[0]];
                strArr26[lIllIIllI[1]] = lIllIIlII[lIllIIllI[83]];
                if (lIIlIllIllll(Inventory.contains(strArr26) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllIIlII[lIllIIllI[84]];
                    String[] strArr27 = new String[lIllIIllI[0]];
                    strArr27[lIllIIllI[1]] = lIllIIlII[lIllIIllI[85]];
                    TileItems.getNearest(strArr27).interact(lIllIIlII[lIllIIllI[86]]);
                    Time.sleepTicks(lIllIIllI[7]);
                    "".length();
                }
                String[] strArr28 = new String[lIllIIllI[0]];
                strArr28[lIllIIllI[1]] = lIllIIlII[lIllIIllI[87]];
                if (lIIlIllIllIl(Inventory.contains(strArr28) ? 1 : 0)) {
                    if (lIIlIllIllIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (lIIlIllIllll(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        bz();
                    }
                    if (lIIlIllIllIl(dV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIllIlllI(cl, lIllIIllI[0])) {
                            an.mV += lIllIIllI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIllIIllI[0];
                            an.mV = lIllIIllI[1];
                            cm = lIllIIllI[1];
                        }
                        C0006g.a(lIllIIlII[lIllIIllI[88]], bR);
                    }
                }
            }
            C0006g.a(bR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIlllIIII(C0004e.j(dU), lIllIIllI[25])) {
            ?? r0 = lIllIIllI[0];
            "".length();
            return (170 ^ 174) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIllI[1];
    }

    private static String lIIlIlIllIll(String llIllIlIlIlIll, String llIllIlIlIlIlI) {
        String str = new String(Base64.getDecoder().decode(llIllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlIlIlIIl = new StringBuilder();
        char[] charArray = llIllIlIlIlIlI.toCharArray();
        int llIllIlIlIIlll = lIllIIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIllI[1];
        while (lIIlIllIlllI(i, length)) {
            char llIllIlIIllllI = charArray2[i];
            llIllIlIlIlIIl.append((char) (llIllIlIIllllI ^ charArray[llIllIlIlIIlll % charArray.length]));
            "".length();
            llIllIlIlIIlll++;
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llIllIlIlIlIIl);
    }

    private static boolean lIIlIllIllll(int i) {
        return i == 0;
    }

    private static boolean lIIlIlllIlII(int i, int i2) {
        return i != i2;
    }

    private static void lIIlIllIlIlI() {
        lIllIIlII = new String[lIllIIllI[140]];
        lIllIIlII[lIllIIllI[1]] = lIIlIlIllIIl("uDgBcMJBMIfmWtQ2lVQfhX2oFyzYMyCyUk9OmgBjsPNVbo2DI7dyGpLHG+XjwT7Y", "zaEWd");
        lIllIIlII[lIllIIllI[0]] = lIIlIlIllIIl("PhOVHK1rM9k=", "nkHbk");
        lIllIIlII[lIllIIllI[4]] = lIIlIlIllIIl("2KQh7syRWIkO7/j/L9dubw==", "SPWQs");
        lIllIIlII[lIllIIllI[6]] = lIIlIlIllIlI("p4kNB08inCwpuEFUORXF5A3hwRhq4u7j", "TVcIw");
        lIllIIlII[lIllIIllI[7]] = lIIlIlIllIlI("Cwzj6h/oDVcY6Wk0oZKFB+AHzx9YeRpYMqxgcXmRIM2sQ6V0BxaLB0SLDjudqSv5", "XSofy");
        lIllIIlII[lIllIIllI[16]] = lIIlIlIllIll("ECJTAj0iZx4KPDQuHQRvNjIWEDtnNAYTPysuFhBjZzQECjskLxoNKGczHEMNEh46LQg=", "GGscO");
        lIllIIlII[lIllIIllI[13]] = lIIlIlIllIIl("vkze/pBvL3U=", "YkciP");
        lIllIIlII[lIllIIllI[17]] = lIIlIlIllIlI("kEfingV2Q8Y=", "ExEpn");
        lIllIIlII[lIllIIllI[20]] = lIIlIlIllIIl("j5eAWuOSN7zESMhrV1h0nQ==", "sCkfo");
        lIllIIlII[lIllIIllI[25]] = lIIlIlIllIlI("eskX3AiO5n6fxFq2nRujrh0I+e9SAN9n", "YfwbZ");
        lIllIIlII[lIllIIllI[21]] = lIIlIlIllIlI("rWzd7nn+QBZPrl4AlQ3LYHaNYtXLWxwM", "YZvag");
        lIllIIlII[lIllIIllI[27]] = lIIlIlIllIlI("d8twHxsG7D4l48Syjv86+Q==", "SvHEH");
        lIllIIlII[lIllIIllI[28]] = lIIlIlIllIIl("Wlf+vzTKvF4=", "ynlnT");
        lIllIIlII[lIllIIllI[2]] = lIIlIlIllIlI("v2ZbKz4HyVA=", "Uyxra");
        lIllIIlII[lIllIIllI[29]] = lIIlIlIllIll("HCY7Ig==", "XITPF");
        lIllIIlII[lIllIIllI[30]] = lIIlIlIllIlI("L/Gagx0OZ04=", "EOHHQ");
        lIllIIlII[lIllIIllI[31]] = lIIlIlIllIIl("+xmcXvalnUA=", "FgRnh");
        lIllIIlII[lIllIIllI[32]] = lIIlIlIllIll("FhcuCg==", "YgKdC");
        lIllIIlII[lIllIIllI[33]] = lIIlIlIllIIl("P5pZQv19+d36I+9iXr65rw==", "NqrPF");
        lIllIIlII[lIllIIllI[35]] = lIIlIlIllIIl("FEGRRjHOYXSk+gNM0a8WZA==", "jiZls");
        lIllIIlII[lIllIIllI[36]] = lIIlIlIllIlI("AWo+lVBM7MteL2Sj9LoOfg==", "rxwgc");
        lIllIIlII[lIllIIllI[38]] = lIIlIlIllIll("JDY9UBEFdz8CBAk8LgI=", "jWKpe");
        lIllIIlII[lIllIIllI[39]] = lIIlIlIllIll("BSguKx00KG8vGD43KmhF", "QZOHv");
        lIllIIlII[lIllIIllI[40]] = lIIlIlIllIll("CTYlTAUodzENHSs+IBgQ", "GWSlq");
        lIllIIlII[lIllIIllI[41]] = lIIlIlIllIIl("eI0PyUXe9dI=", "vxUtq");
        lIllIIlII[lIllIIllI[42]] = lIIlIlIllIlI("l/T78fFUfKNExCIp0I+5gg==", "qdZCD");
        lIllIIlII[lIllIIllI[43]] = lIIlIlIllIll("KAEWPw==", "nhdZW");
        lIllIIlII[lIllIIllI[45]] = lIIlIlIllIll("WEJiXw==", "hrRnP");
        lIllIIlII[lIllIIllI[46]] = lIIlIlIllIlI("kgE1ciTx7b8=", "AWcMB");
        lIllIIlII[lIllIIllI[47]] = lIIlIlIllIll("al1mYw==", "ZmVPk");
        lIllIIlII[lIllIIllI[48]] = lIIlIlIllIIl("wFPqNK1lzAE=", "VmMfE");
        lIllIIlII[lIllIIllI[55]] = lIIlIlIllIlI("AjG+nJpm6pqYrUhGt6xDVQ==", "UupUY");
        lIllIIlII[lIllIIllI[56]] = lIIlIlIllIlI("TKSs5mRPWqabLwCsH/xxAw==", "SFAfu");
        lIllIIlII[lIllIIllI[57]] = lIIlIlIllIll("Oyo7KABVKSQgEA==", "xFREb");
        lIllIIlII[lIllIIllI[60]] = lIIlIlIllIIl("3dI56Xx0O64=", "fijlJ");
        lIllIIlII[lIllIIllI[61]] = lIIlIlIllIIl("BeoWWmbr2TI=", "HDVhk");
        lIllIIlII[lIllIIllI[62]] = lIIlIlIllIlI("Xbbq8uP/gpE=", "hEUix");
        lIllIIlII[lIllIIllI[63]] = lIIlIlIllIll("ChQOCg==", "EdkdL");
        lIllIIlII[lIllIIllI[64]] = lIIlIlIllIlI("4NsVQ3epEk0=", "YrLgr");
        lIllIIlII[lIllIIllI[65]] = lIIlIlIllIll("AzsiAg==", "LKGla");
        lIllIIlII[lIllIIllI[66]] = lIIlIlIllIIl("6Frqf0aX9BM=", "SHUMq");
        lIllIIlII[lIllIIllI[67]] = lIIlIlIllIll("KzozBwxFIyo=", "hVZjn");
        lIllIIlII[lIllIIllI[68]] = lIIlIlIllIlI("0gEka9Nmg98=", "BGwQr");
        lIllIIlII[lIllIIllI[69]] = lIIlIlIllIIl("QXyApXFS2ZBv90CK/UINIw==", "mhkBp");
        lIllIIlII[lIllIIllI[70]] = lIIlIlIllIIl("+z+fWDJn9WXD9+jLN5TOKg==", "BiVYU");
        lIllIIlII[lIllIIllI[3]] = lIIlIlIllIIl("98BuzkUDg56IGizOHE36Cw==", "qNMhE");
        lIllIIlII[lIllIIllI[71]] = lIIlIlIllIIl("4TWAuMRs/tMHOd+cO0kC7A==", "budlP");
        lIllIIlII[lIllIIllI[72]] = lIIlIlIllIll("JDo9Ig==", "kJXLJ");
        lIllIIlII[lIllIIllI[73]] = lIIlIlIllIlI("1q4G4bhvrUjRSbhWlq0n6g==", "KTKzU");
        lIllIIlII[lIllIIllI[74]] = lIIlIlIllIlI("j47O8uzL3XZFG/tPuAmNng==", "FgGYf");
        lIllIIlII[lIllIIllI[24]] = lIIlIlIllIIl("+guqgOqSHiY=", "OSbYB");
        lIllIIlII[lIllIIllI[75]] = lIIlIlIllIlI("d7RW1Ocaa1FJxa/IquEVeg==", "VBpan");
        lIllIIlII[lIllIIllI[76]] = lIIlIlIllIIl("VKu0J3Oi58I8IV3Ix8S62TdR5UtFVny1", "fTBnN");
        lIllIIlII[lIllIIllI[77]] = lIIlIlIllIIl("LF3NWr0kMKbkjT2EQqtQSA==", "QXrzy");
        lIllIIlII[lIllIIllI[78]] = lIIlIlIllIlI("0yCA1BmkLQs=", "LRnOT");
        lIllIIlII[lIllIIllI[79]] = lIIlIlIllIlI("hmpyS+iXvZ1y+2cWQAoUQQ==", "QNGJq");
        lIllIIlII[lIllIIllI[80]] = lIIlIlIllIlI("B/7NzJLG0ac=", "zmUow");
        lIllIIlII[lIllIIllI[81]] = lIIlIlIllIIl("vPHuvMnM2PAi7HpQyrd2jA==", "GuszB");
        lIllIIlII[lIllIIllI[82]] = lIIlIlIllIll("CgQ8OiU=", "NvUTN");
        lIllIIlII[lIllIIllI[83]] = lIIlIlIllIIl("5UO/qcNjjvixadVCaQm37QaY+nMGeOFc", "jzAak");
        lIllIIlII[lIllIIllI[84]] = lIIlIlIllIlI("8SVsuLOh461DZ3kUEC7vaw==", "yYhoT");
        lIllIIlII[lIllIIllI[85]] = lIIlIlIllIIl("QN5y3YbNqCOiSQd2JSElGveF0vXqsWYo", "jdlyC");
        lIllIIlII[lIllIIllI[86]] = lIIlIlIllIIl("GOssre+HMuY=", "IeNcN");
        lIllIIlII[lIllIIllI[87]] = lIIlIlIllIll("LhsFMHEOD0czIw4dAiAlCAYJ", "aigCQ");
        lIllIIlII[lIllIIllI[88]] = lIIlIlIllIIl("FmPoR+j110GrVEvqrAK3AQ==", "NMvlb");
        lIllIIlII[lIllIIllI[89]] = lIIlIlIllIIl("CV9mmONZTC45OYxFTYfhfQ==", "fCQrl");
        lIllIIlII[lIllIIllI[100]] = lIIlIlIllIIl("UOX0MMeOn2mhkMunYnD6fA==", "wABfV");
        lIllIIlII[lIllIIllI[101]] = lIIlIlIllIll("Ch88FA1mIjIOBC8eNA==", "FpSgh");
        lIllIIlII[lIllIIllI[102]] = lIIlIlIllIll("JyQ9LjEOMGU/PAY6PSw8", "tUHKT");
        lIllIIlII[lIllIIllI[109]] = lIIlIlIllIlI("SOPQDy1INXG5+EkpGIUsoneoWssqE2fn", "SXUqp");
        lIllIIlII[lIllIIllI[110]] = lIIlIlIllIll("FA0BKk4JAk86CwcIGyVOTg==", "fdoMn");
        lIllIIlII[lIllIIllI[111]] = lIIlIlIllIIl("NhBSP+wHjOE=", "NGswc");
        lIllIIlII[lIllIIllI[130]] = lIIlIlIllIIl("I3aQFPWjl8e6BjTQibiuqvQSFO0q5y90", "sfSrr");
        lIllIIlII[lIllIIllI[131]] = lIIlIlIllIll("EFYaPTE1Ek0wIXkRATMgeQICciw8Gh18", "YvmRD");
        lIllIIlII[lIllIIllI[132]] = lIIlIlIllIll("AyVcSCBrIhxIDi06GA0bbD0fBQxsOR8HDWI=", "LNphi");
        lIllIIlII[lIllIIllI[133]] = lIIlIlIllIll("Dn47AW0zKy5NID55NQg+M3c=", "GYWmM");
        lIllIIlII[lIllIIllI[134]] = lIIlIlIllIll("HHg6CAI5eCsIADF4OQkLdS8sEwI6KilBDzs8bQMcPDYqQQw0OyZBGj09bQ4cNytj", "UXMan");
        lIllIIlII[lIllIIllI[135]] = lIIlIlIllIIl("W6TAdcCXlDE=", "MySTa");
    }

    private static boolean lIIlIlllIlIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIIlIllIlIll();
        lIIlIllIlIlI();
        dK = new WorldPoint(lIllIIllI[112], lIllIIllI[113], lIllIIllI[1]);
        dL = new WorldPoint(lIllIIllI[114], lIllIIllI[115], lIllIIllI[1]);
        dM = new WorldPoint(lIllIIllI[116], lIllIIllI[117], lIllIIllI[1]);
        dN = new WorldPoint(lIllIIllI[118], lIllIIllI[119], lIllIIllI[1]);
        dO = new WorldPoint(lIllIIllI[120], lIllIIllI[121], lIllIIllI[1]);
        dP = new WorldPoint(lIllIIllI[122], lIllIIllI[123], lIllIIllI[1]);
        dQ = new WorldPoint(lIllIIllI[124], lIllIIllI[125], lIllIIllI[1]);
        dR = new WorldPoint(lIllIIllI[124], lIllIIllI[126], lIllIIllI[1]);
        dS = new WorldPoint(lIllIIllI[127], lIllIIllI[54], lIllIIllI[1]);
        dT = new WorldPoint(lIllIIllI[128], lIllIIllI[129], lIllIIllI[1]);
        bv = new ArrayList();
        String[] strArr = new String[lIllIIllI[13]];
        strArr[lIllIIllI[1]] = lIllIIlII[lIllIIllI[130]];
        strArr[lIllIIllI[0]] = lIllIIlII[lIllIIllI[131]];
        strArr[lIllIIllI[4]] = lIllIIlII[lIllIIllI[132]];
        strArr[lIllIIllI[6]] = lIllIIlII[lIllIIllI[133]];
        strArr[lIllIIllI[7]] = lIllIIlII[lIllIIllI[134]];
        strArr[lIllIIllI[16]] = lIllIIlII[lIllIIllI[135]];
        bR = strArr;
        dU = lIllIIllI[136];
        dV = new WorldArea(lIllIIllI[137], lIllIIllI[113], lIllIIllI[21], lIllIIllI[13], lIllIIllI[1]);
        dW = new WorldArea(lIllIIllI[138], lIllIIllI[139], lIllIIllI[48], lIllIIllI[30], lIllIIllI[1]);
    }

    private static boolean lIIlIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIllIl(int i) {
        return i != 0;
    }

    private static int lIIlIllIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIlllllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIllIIllI[1];
    }

    private static boolean lIIlIllllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlllIIll(int i) {
        return i < 0;
    }

    private static boolean lIIlIlllIIlI(int i) {
        return i > 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIllIIlII[lIllIIllI[109]];
    }

    private static void lIIlIllIlIll() {
        lIllIIllI = new int[141];
        lIllIIllI[0] = " ".length();
        lIllIIllI[1] = ((42 ^ 126) ^ (75 ^ 64)) & (((((13 + 244) - 207) + 197) ^ (((100 + 51) - 113) + 130)) ^ (-" ".length()));
        lIllIIllI[2] = 177 ^ 188;
        lIllIIllI[3] = (116 ^ 33) ^ (82 ^ 42);
        lIllIIllI[4] = "  ".length();
        lIllIIllI[5] = (-1143) & 6142;
        lIllIIllI[6] = "   ".length();
        lIllIIllI[7] = 190 ^ 186;
        lIllIIllI[8] = (-((-59) & 19963)) & (-8210) & 28671;
        lIllIIllI[9] = (-((-16617) & 19694)) & (-4113) & 8189;
        lIllIIllI[10] = (-((-24889) & 31227)) & (-25857) & 32751;
        lIllIIllI[11] = (-((-3042) & 27639)) & (-4289) & 29439;
        lIllIIllI[12] = (-((-9029) & 31565)) & (-513) & 24559;
        lIllIIllI[13] = (((2 + 30) - (-27)) + 89) ^ (((110 + 84) - 97) + 49);
        lIllIIllI[14] = (-16561) & 24567;
        lIllIIllI[15] = (-((-7937) & 32597)) & (-4106) & 31199;
        lIllIIllI[16] = 121 ^ 124;
        lIllIIllI[17] = (133 ^ 173) ^ (8 ^ 39);
        lIllIIllI[18] = (-((-8565) & 25463)) & (-3117) & 32639;
        lIllIIllI[19] = (-18561) & 18939;
        lIllIIllI[20] = 109 ^ 101;
        lIllIIllI[21] = 179 ^ 185;
        lIllIIllI[22] = (-((-5497) & 24442)) & (-3) & 19447;
        lIllIIllI[23] = (-14850) & 16349;
        lIllIIllI[24] = 60 ^ 14;
        lIllIIllI[25] = (156 ^ 171) ^ (175 ^ 145);
        lIllIIllI[26] = (-((-8301) & 15855)) & (-24614) & 32767;
        lIllIIllI[27] = (((164 + 131) - 104) + 13) ^ (((26 + 7) - (-160)) + 6);
        lIllIIllI[28] = (50 ^ 117) ^ (88 ^ 19);
        lIllIIllI[29] = (127 ^ 122) ^ (52 ^ 63);
        lIllIIllI[30] = (((136 + 80) - 92) + 43) ^ (((84 + 23) - (-16)) + 45);
        lIllIIllI[31] = (((18 + 5) - (-62)) + 51) ^ (((37 + 123) - 82) + 74);
        lIllIIllI[32] = (((178 + 26) - 18) + 24) ^ (((17 + 93) - (-36)) + 49);
        lIllIIllI[33] = 79 ^ 93;
        lIllIIllI[34] = (-((-721) & 30713)) & (-129) & 30719;
        lIllIIllI[35] = (218 ^ 143) ^ (120 ^ 62);
        lIllIIllI[36] = 67 ^ 87;
        lIllIIllI[37] = (-((-9357) & 31919)) & (-8325) & 31487;
        lIllIIllI[38] = (147 ^ 139) ^ (87 ^ 90);
        lIllIIllI[39] = 61 ^ 43;
        lIllIIllI[40] = (231 ^ 166) ^ (218 ^ 140);
        lIllIIllI[41] = 51 ^ 43;
        lIllIIllI[42] = 37 ^ 60;
        lIllIIllI[43] = (205 ^ 155) ^ (3 ^ 79);
        lIllIIllI[44] = (-((-1569) & 32678)) & (-1057) & 32767;
        lIllIIllI[45] = 115 ^ 104;
        lIllIIllI[46] = (((6 + 47) - (-81)) + 10) ^ (((13 + 81) - 40) + 86);
        lIllIIllI[47] = 126 ^ 99;
        lIllIIllI[48] = 83 ^ 77;
        lIllIIllI[49] = (-((-10457) & 31997)) & (-8209) & 32253;
        lIllIIllI[50] = (-29249) & 32502;
        lIllIIllI[51] = (-((-1377) & 30572)) & (-1073) & 32767;
        lIllIIllI[52] = (-4941) & 8191;
        lIllIIllI[53] = (-21010) & 23511;
        lIllIIllI[54] = (-28681) & 31933;
        lIllIIllI[55] = 162 ^ 189;
        lIllIIllI[56] = 35 ^ 3;
        lIllIIllI[57] = (218 ^ 191) ^ (124 ^ 56);
        lIllIIllI[58] = (-((-3011) & 16359)) & (-16401) & 32255;
        lIllIIllI[59] = (-((-5265) & 30419)) & (-5) & 28415;
        lIllIIllI[60] = (((153 + 71) - 85) + 39) ^ (((62 + 22) - 26) + 86);
        lIllIIllI[61] = (92 ^ 73) ^ (167 ^ 145);
        lIllIIllI[62] = (46 ^ 22) ^ (28 ^ 0);
        lIllIIllI[63] = (53 ^ 29) ^ (143 ^ 130);
        lIllIIllI[64] = 114 ^ 84;
        lIllIIllI[65] = 146 ^ 181;
        lIllIIllI[66] = (((21 + 90) - 44) + 75) ^ (((131 + 140) - 174) + 69);
        lIllIIllI[67] = (80 ^ 70) ^ (48 ^ 15);
        lIllIIllI[68] = (120 ^ 93) ^ (92 ^ 83);
        lIllIIllI[69] = 14 ^ 37;
        lIllIIllI[70] = (214 ^ 134) ^ (12 ^ 112);
        lIllIIllI[71] = (115 ^ 11) ^ (251 ^ 173);
        lIllIIllI[72] = 7 ^ 40;
        lIllIIllI[73] = 183 ^ 135;
        lIllIIllI[74] = (69 ^ 23) ^ (222 ^ 189);
        lIllIIllI[75] = (((47 + 45) - 50) + 113) ^ (((38 + 96) - 94) + 128);
        lIllIIllI[76] = 87 ^ 99;
        lIllIIllI[77] = ((46 ^ 34) & ((159 ^ 147) ^ (-1))) ^ (146 ^ 167);
        lIllIIllI[78] = (39 ^ 114) ^ (105 ^ 10);
        lIllIIllI[79] = 55 ^ 0;
        lIllIIllI[80] = 151 ^ 175;
        lIllIIllI[81] = 66 ^ 123;
        lIllIIllI[82] = 96 ^ 90;
        lIllIIllI[83] = 62 ^ 5;
        lIllIIllI[84] = 253 ^ 193;
        lIllIIllI[85] = 172 ^ 145;
        lIllIIllI[86] = 3 ^ 61;
        lIllIIllI[87] = (245 ^ 133) ^ (50 ^ 125);
        lIllIIllI[88] = 53 ^ 117;
        lIllIIllI[89] = (186 ^ 142) ^ (205 ^ 184);
        lIllIIllI[90] = (-((-1297) & 22421)) & (-9234) & 32759;
        lIllIIllI[91] = (-((-357) & 25967)) & (-2) & 28667;
        lIllIIllI[92] = ((108 + 144) - 226) + 204;
        lIllIIllI[93] = (((5 ^ 66) + (219 ^ 189)) - (127 ^ 44)) + (36 ^ 100);
        lIllIIllI[94] = (-((-7041) & 24465)) & (-12809) & 32763;
        lIllIIllI[95] = (-((-14687) & 31231)) & (-773) & 20471;
        lIllIIllI[96] = (-((-2049) & 11273)) & (-20993) & 32735;
        lIllIIllI[97] = (-4261) & 7414;
        lIllIIllI[98] = (-1550) & 4063;
        lIllIIllI[99] = (-((-16534) & 29087)) & (-513) & 16221;
        lIllIIllI[100] = 86 ^ 20;
        lIllIIllI[101] = (((8 + 160) - (-24)) + 63) ^ (((175 + 98) - 189) + 104);
        lIllIIllI[102] = (((236 + 52) - 204) + 155) ^ (((114 + 170) - 204) + 91);
        lIllIIllI[103] = (((33 ^ 109) + (166 ^ 136)) - (-(101 ^ 67))) + (101 ^ 77);
        lIllIIllI[104] = (-16419) & 28398;
        lIllIIllI[105] = (-6215) & 31214;
        lIllIIllI[106] = (-(245 ^ 148)) & (-16643) & 31738;
        lIllIIllI[107] = (-26708) & 27607;
        lIllIIllI[108] = (99 ^ 34) ^ (170 ^ 143);
        lIllIIllI[109] = 238 ^ 171;
        lIllIIllI[110] = 133 ^ 195;
        lIllIIllI[111] = 4 ^ 67;
        lIllIIllI[112] = (-((-421) & 13237)) & (-1) & 15355;
        lIllIIllI[113] = (-25345) & 28511;
        lIllIIllI[114] = (-9761) & 12280;
        lIllIIllI[115] = (-((-17559) & 17919)) & (-8705) & 12271;
        lIllIIllI[116] = (-5636) & 8159;
        lIllIIllI[117] = (-((-17) & 17176)) & (-4161) & 24575;
        lIllIIllI[118] = (-((-2201) & 15034)) & (-17409) & 32767;
        lIllIIllI[119] = (-4683) & 7934;
        lIllIIllI[120] = (-((-25027) & 26623)) & (-12289) & 16383;
        lIllIIllI[121] = (-24642) & 27901;
        lIllIIllI[122] = (-28694) & 31189;
        lIllIIllI[123] = (-21081) & 24316;
        lIllIIllI[124] = (-17457) & 19966;
        lIllIIllI[125] = (-16741) & 19949;
        lIllIIllI[126] = (-29002) & 32251;
        lIllIIllI[127] = (-22033) & 24535;
        lIllIIllI[128] = (-((-16793) & 26553)) & (-20481) & 32698;
        lIllIIllI[129] = (-28678) & 31975;
        lIllIIllI[130] = (((26 + 59) - (-129)) + 20) ^ (((107 + 143) - 127) + 39);
        lIllIIllI[131] = (((126 + 23) - (-83)) + 17) ^ (((15 + 108) - 42) + 95);
        lIllIIllI[132] = 209 ^ 155;
        lIllIIllI[133] = (160 ^ 136) ^ (100 ^ 7);
        lIllIIllI[134] = (((45 + 172) - 83) + 96) ^ (((149 + 160) - 213) + 74);
        lIllIIllI[135] = (((111 + 69) - 165) + 207) ^ (((31 + 132) - 115) + 99);
        lIllIIllI[136] = (46 ^ 104) ^ (27 ^ 50);
        lIllIIllI[137] = (-((-21002) & 29199)) & (-4097) & 14831;
        lIllIIllI[138] = (-13351) & 15863;
        lIllIIllI[139] = (-17191) & 20351;
        lIllIIllI[140] = (147 ^ 164) ^ (216 ^ 161);
    }

    private static boolean lIIlIlllIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a6, code lost:
        if (lIIlIllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x022f, code lost:
        if (lIIlIllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b8, code lost:
        if (lIIlIllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[9]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x036a, code lost:
        if (lIIlIllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[7]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIIlIllIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.D.lIllIIllI[13]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[lIllIIllI[0]];
        iArr8[lIllIIllI[1]] = lIllIIllI[12];
        if (lIIlIllIllIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIllIIllI[0]];
            iArr9[lIllIIllI[1]] = lIllIIllI[12];
            if (lIIlIllIllIl(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIllIIllI[0]];
                iArr10[lIllIIllI[1]] = lIllIIllI[12];
            }
            if (lIIlIllIllll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllIIlII[lIllIIllI[110]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIllIIllI[104], lIllIIllI[16], lIllIIllI[105]));
                "".length();
            }
            iArr = new int[lIllIIllI[0]];
            iArr[lIllIIllI[1]] = lIllIIllI[15];
            if (lIIlIllIllIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lIllIIllI[0]];
                iArr11[lIllIIllI[1]] = lIllIIllI[15];
                if (lIIlIllIlllI(Bank.getFirst(iArr11).getQuantity(), lIllIIllI[7])) {
                    int i = lIllIIllI[15];
                    int i2 = lIllIIllI[7];
                    int[] iArr12 = new int[lIllIIllI[0]];
                    iArr12[lIllIIllI[1]] = lIllIIllI[15];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr12).getQuantity(), lIllIIllI[106]));
                    "".length();
                }
            }
            iArr2 = new int[lIllIIllI[0]];
            iArr2[lIllIIllI[1]] = lIllIIllI[10];
            if (lIIlIllIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lIllIIllI[0]];
                iArr13[lIllIIllI[1]] = lIllIIllI[10];
                if (lIIlIllIllIl(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIllIIllI[0]];
                    iArr14[lIllIIllI[1]] = lIllIIllI[10];
                }
                iArr3 = new int[lIllIIllI[0]];
                iArr3[lIllIIllI[1]] = lIllIIllI[8];
                if (lIIlIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr15 = new int[lIllIIllI[0]];
                    iArr15[lIllIIllI[1]] = lIllIIllI[8];
                    if (lIIlIllIllIl(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lIllIIllI[0]];
                        iArr16[lIllIIllI[1]] = lIllIIllI[8];
                    }
                    iArr4 = new int[lIllIIllI[0]];
                    iArr4[lIllIIllI[1]] = lIllIIllI[11];
                    if (lIIlIllIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr17 = new int[lIllIIllI[0]];
                        iArr17[lIllIIllI[1]] = lIllIIllI[11];
                        if (lIIlIllIllIl(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIllIIllI[0]];
                            iArr18[lIllIIllI[1]] = lIllIIllI[11];
                        }
                        iArr5 = new int[lIllIIllI[0]];
                        iArr5[lIllIIllI[1]] = lIllIIllI[15];
                        if (lIIlIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                            bv.add(new C0003d(lIllIIllI[15], lIllIIllI[7], lIllIIllI[106]));
                            "".length();
                        }
                        iArr6 = new int[lIllIIllI[0]];
                        iArr6[lIllIIllI[1]] = lIllIIllI[18];
                        if (lIIlIllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr19 = new int[lIllIIllI[0]];
                            iArr19[lIllIIllI[1]] = lIllIIllI[18];
                        }
                        bv.add(new C0003d(lIllIIllI[18], lIllIIllI[7], C0008i.bq));
                        "".length();
                        iArr7 = new int[lIllIIllI[0]];
                        iArr7[lIllIIllI[1]] = lIllIIllI[14];
                        if (lIIlIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr20 = new int[lIllIIllI[0]];
                            iArr20[lIllIIllI[1]] = lIllIIllI[14];
                            if (!lIIlIllIllIl(Bank.contains(iArr20) ? 1 : 0)) {
                                return;
                            }
                            int[] iArr21 = new int[lIllIIllI[0]];
                            iArr21[lIllIIllI[1]] = lIllIIllI[14];
                            if (!lIIlIllIlllI(Bank.getFirst(iArr21).getQuantity(), lIllIIllI[30])) {
                                return;
                            }
                        }
                        bv.add(new C0003d(lIllIIllI[14], lIllIIllI[66], lIllIIllI[107]));
                        "".length();
                    }
                    bv.add(new C0003d(lIllIIllI[11], lIllIIllI[9], lIllIIllI[21]));
                    "".length();
                    iArr5 = new int[lIllIIllI[0]];
                    iArr5[lIllIIllI[1]] = lIllIIllI[15];
                    if (lIIlIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[lIllIIllI[0]];
                    iArr6[lIllIIllI[1]] = lIllIIllI[18];
                    if (lIIlIllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIllIIllI[18], lIllIIllI[7], C0008i.bq));
                    "".length();
                    iArr7 = new int[lIllIIllI[0]];
                    iArr7[lIllIIllI[1]] = lIllIIllI[14];
                    if (lIIlIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIllIIllI[14], lIllIIllI[66], lIllIIllI[107]));
                    "".length();
                }
                bv.add(new C0003d(lIllIIllI[8], lIllIIllI[9], lIllIIllI[21]));
                "".length();
                iArr4 = new int[lIllIIllI[0]];
                iArr4[lIllIIllI[1]] = lIllIIllI[11];
                if (lIIlIllIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIllIIllI[11], lIllIIllI[9], lIllIIllI[21]));
                "".length();
                iArr5 = new int[lIllIIllI[0]];
                iArr5[lIllIIllI[1]] = lIllIIllI[15];
                if (lIIlIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lIllIIllI[0]];
                iArr6[lIllIIllI[1]] = lIllIIllI[18];
                if (lIIlIllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIllIIllI[18], lIllIIllI[7], C0008i.bq));
                "".length();
                iArr7 = new int[lIllIIllI[0]];
                iArr7[lIllIIllI[1]] = lIllIIllI[14];
                if (lIIlIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIllIIllI[14], lIllIIllI[66], lIllIIllI[107]));
                "".length();
            }
            bv.add(new C0003d(lIllIIllI[10], lIllIIllI[9], lIllIIllI[21]));
            "".length();
            iArr3 = new int[lIllIIllI[0]];
            iArr3[lIllIIllI[1]] = lIllIIllI[8];
            if (lIIlIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIllI[8], lIllIIllI[9], lIllIIllI[21]));
            "".length();
            iArr4 = new int[lIllIIllI[0]];
            iArr4[lIllIIllI[1]] = lIllIIllI[11];
            if (lIIlIllIllIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIllI[11], lIllIIllI[9], lIllIIllI[21]));
            "".length();
            iArr5 = new int[lIllIIllI[0]];
            iArr5[lIllIIllI[1]] = lIllIIllI[15];
            if (lIIlIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIllIIllI[0]];
            iArr6[lIllIIllI[1]] = lIllIIllI[18];
            if (lIIlIllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIllI[18], lIllIIllI[7], C0008i.bq));
            "".length();
            iArr7 = new int[lIllIIllI[0]];
            iArr7[lIllIIllI[1]] = lIllIIllI[14];
            if (lIIlIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllIIllI[14], lIllIIllI[66], lIllIIllI[107]));
            "".length();
        }
        bv.add(new C0003d(lIllIIllI[12], lIllIIllI[13], lIllIIllI[103]));
        "".length();
        if (lIIlIllIllll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIIlII[lIllIIllI[110]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIllIIllI[0]];
        iArr[lIllIIllI[1]] = lIllIIllI[15];
        if (lIIlIllIllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIllIIllI[0]];
        iArr2[lIllIIllI[1]] = lIllIIllI[10];
        if (lIIlIllIllIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIllI[10], lIllIIllI[9], lIllIIllI[21]));
        "".length();
        iArr3 = new int[lIllIIllI[0]];
        iArr3[lIllIIllI[1]] = lIllIIllI[8];
        if (lIIlIllIllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIllI[8], lIllIIllI[9], lIllIIllI[21]));
        "".length();
        iArr4 = new int[lIllIIllI[0]];
        iArr4[lIllIIllI[1]] = lIllIIllI[11];
        if (lIIlIllIllIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIllI[11], lIllIIllI[9], lIllIIllI[21]));
        "".length();
        iArr5 = new int[lIllIIllI[0]];
        iArr5[lIllIIllI[1]] = lIllIIllI[15];
        if (lIIlIllIllll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIllIIllI[0]];
        iArr6[lIllIIllI[1]] = lIllIIllI[18];
        if (lIIlIllIllIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIllI[18], lIllIIllI[7], C0008i.bq));
        "".length();
        iArr7 = new int[lIllIIllI[0]];
        iArr7[lIllIIllI[1]] = lIllIIllI[14];
        if (lIIlIllIllIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllIIllI[14], lIllIIllI[66], lIllIIllI[107]));
        "".length();
    }
}

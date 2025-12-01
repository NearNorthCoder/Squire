package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.N  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/N.class */
public class N implements K {
    public static /* synthetic */ int[] cE;
    public static /* synthetic */ WorldArea cF;
    private static /* synthetic */ String[] lIlIIllIII;
    public static /* synthetic */ WorldArea cG;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ WorldPoint cI;
    private static /* synthetic */ int[] lIlIIllIIl;
    public static /* synthetic */ WorldArea cH;
    public static /* synthetic */ WorldPoint cJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIllIlIllll(Skills.getLevel(Skill.DEFENCE), lIlIIllIIl[2])) {
            ?? r0 = lIlIIllIIl[1];
            "".length();
            return (-(45 ^ 40)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIllIIl[0];
    }

    private static String lIIIllIlIIllI(String llllllllllllllllllllIIIlIIIIlllI, String llllllllllllllllllllIIIlIIIIllIl) {
        try {
            SecretKeySpec llllllllllllllllllllIIIlIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIIlIIIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIIlIIIlIIII.init(lIlIIllIIl[3], llllllllllllllllllllIIIlIIIlIIIl);
            return new String(llllllllllllllllllllIIIlIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIlIIIIllll) {
            llllllllllllllllllllIIIlIIIIllll.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIlIlIII();
        lIIIllIlIIlll();
        bp = new ArrayList();
        int[] iArr = new int[lIlIIllIIl[18]];
        iArr[lIlIIllIIl[0]] = lIlIIllIIl[16];
        iArr[lIlIIllIIl[1]] = lIlIIllIIl[17];
        iArr[lIlIIllIIl[3]] = lIlIIllIIl[42];
        iArr[lIlIIllIIl[4]] = lIlIIllIIl[44];
        iArr[lIlIIllIIl[6]] = lIlIIllIIl[40];
        iArr[lIlIIllIIl[10]] = lIlIIllIIl[45];
        iArr[lIlIIllIIl[14]] = lIlIIllIIl[47];
        iArr[lIlIIllIIl[15]] = lIlIIllIIl[49];
        cE = iArr;
        cF = new WorldArea(lIlIIllIIl[59], lIlIIllIIl[60], lIlIIllIIl[22], lIlIIllIIl[22], lIlIIllIIl[0]);
        cG = new WorldArea(lIlIIllIIl[61], lIlIIllIIl[62], lIlIIllIIl[32], lIlIIllIIl[26], lIlIIllIIl[0]);
        cH = new WorldArea(lIlIIllIIl[63], lIlIIllIIl[64], lIlIIllIIl[65], lIlIIllIIl[34], lIlIIllIIl[0]);
        cI = new WorldPoint(lIlIIllIIl[66], lIlIIllIIl[67], lIlIIllIIl[0]);
        ce = new WorldPoint(lIlIIllIIl[68], lIlIIllIIl[60], lIlIIllIIl[0]);
        cJ = new WorldPoint(lIlIIllIIl[69], lIlIIllIIl[70], lIlIIllIIl[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aH() {
        if (lIIIllIlIlIlI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[0]];
            C0001b.a(bp);
            if (lIIIllIlIlIll(bp.size(), lIlIIllIIl[1])) {
                System.out.println(lIlIIllIII[lIlIIllIIl[1]]);
                bn = lIlIIllIIl[0];
            }
        }
        if (lIIIllIlIllII(bn ? 1 : 0)) {
            if (lIIIllIlIllII(aK() ? 1 : 0) && lIIIllIlIlIll(Skills.getLevel(Skill.DEFENCE), lIlIIllIIl[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIllIlIllIl(nearest) && lIIIllIlIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[3]];
                    C0000a.a(nearest);
                }
                if (lIIIllIlIllIl(nearest) && lIIIllIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[4]];
                    if (lIIIllIlIllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIllIIl[5]);
                        "".length();
                    }
                    if (lIIIllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIllIlIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIllIIl[1]);
                            "".length();
                        }
                        if (lIIIllIlIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIllIIl[3]);
                            "".length();
                        }
                        if (lIIIllIlIllII(aL() ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIllIII[lIlIIllIIl[6]]);
                            bn = lIlIIllIIl[1];
                            return;
                        }
                        C0000a.a(cE, lIlIIllIIl[1]);
                        C0000a.a(lIlIIllIIl[7], lIlIIllIIl[8]);
                        C0000a.b(C0005f.aU, lIlIIllIIl[1]);
                        C0000a.a(lIlIIllIIl[9], lIlIIllIIl[10]);
                        C0000a.a(lIlIIllIIl[11], lIlIIllIIl[12]);
                    }
                }
            }
            if (lIIIllIlIlIlI(aK() ? 1 : 0)) {
                aJ();
                if (lIIIllIlIllll(Movement.getRunEnergy(), lIlIIllIIl[13]) && lIIIllIlIllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lIlIIllIIl[1]];
                strArr[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[10]];
                if (lIIIllIlIllII(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIllIIl[1]];
                    strArr2[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[14]];
                    if (lIIIllIlIllII(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lIlIIllIIl[1]];
                        strArr3[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[15]];
                        if (lIIIllIlIllII(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lIlIIllIIl[1]];
                            iArr[lIlIIllIIl[0]] = lIlIIllIIl[16];
                            if (lIIIllIlIllII(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIIllIIl[1]];
                                iArr2[lIlIIllIIl[0]] = lIlIIllIIl[17];
                            }
                        }
                    }
                }
                aM();
                if (lIIIllIllIIII(lIIIllIlIlIIl(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[lIlIIllIIl[1]];
                    iArr3[lIlIIllIIl[0]] = lIlIIllIIl[11];
                    if (lIIIllIlIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIllIIl[1]];
                        iArr4[lIlIIllIIl[0]] = lIlIIllIIl[11];
                        Inventory.getFirst(iArr4).interact(lIlIIllIII[lIlIIllIIl[18]]);
                        Time.sleepTicks(lIlIIllIIl[1]);
                        "".length();
                    }
                }
                if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[19]) && lIIIllIlIllll(Skills.getLevel(Skill.STRENGTH), lIlIIllIIl[19])) {
                    C0010k.aa();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023e, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0278, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b2, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02ec, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0326, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0360, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x039a, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aK() {
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[2])) {
            int[] iArr = new int[lIlIIllIIl[1]];
            iArr[lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (lIIIllIlIllII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIllIIl[1]];
                iArr2[lIlIIllIIl[0]] = lIlIIllIIl[17];
            }
            int[] iArr3 = new int[lIlIIllIIl[1]];
            iArr3[lIlIIllIIl[0]] = lIlIIllIIl[42];
            if (lIIIllIlIllII(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIlIIllIIl[1]];
                iArr4[lIlIIllIIl[0]] = lIlIIllIIl[42];
            }
            int[] iArr5 = new int[lIlIIllIIl[1]];
            iArr5[lIlIIllIIl[0]] = lIlIIllIIl[44];
            if (lIIIllIlIllII(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlIIllIIl[1]];
                iArr6[lIlIIllIIl[0]] = lIlIIllIIl[44];
            }
            int[] iArr7 = new int[lIlIIllIIl[1]];
            iArr7[lIlIIllIIl[0]] = lIlIIllIIl[40];
            if (lIIIllIlIllII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIllIIl[1]];
                iArr8[lIlIIllIIl[0]] = lIlIIllIIl[40];
            }
            int[] iArr9 = new int[lIlIIllIIl[1]];
            iArr9[lIlIIllIIl[0]] = lIlIIllIIl[45];
            if (lIIIllIlIllII(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIlIIllIIl[1]];
                iArr10[lIlIIllIIl[0]] = lIlIIllIIl[45];
            }
            int[] iArr11 = new int[lIlIIllIIl[1]];
            iArr11[lIlIIllIIl[0]] = lIlIIllIIl[47];
            if (lIIIllIlIllII(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIIllIIl[1]];
                iArr12[lIlIIllIIl[0]] = lIlIIllIIl[47];
            }
            int[] iArr13 = new int[lIlIIllIIl[1]];
            iArr13[lIlIIllIIl[0]] = lIlIIllIIl[49];
            if (lIIIllIlIllII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIlIIllIIl[1]];
                iArr14[lIlIIllIIl[0]] = lIlIIllIIl[49];
            }
            int[] iArr15 = new int[lIlIIllIIl[1]];
            iArr15[lIlIIllIIl[0]] = lIlIIllIIl[11];
            if (lIIIllIlIlIlI(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lIlIIllIIl[1];
                "".length();
                return 0 != 0 ? ((((92 + 151) - 71) + 1) ^ (((116 + 7) - 83) + 112)) & (((35 ^ 74) ^ (195 ^ 159)) ^ (-" ".length())) : r0;
            }
            return lIlIIllIIl[0];
        }
        int[] iArr16 = new int[lIlIIllIIl[1]];
        iArr16[lIlIIllIIl[0]] = lIlIIllIIl[16];
        if (lIIIllIlIllII(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIlIIllIIl[1]];
            iArr17[lIlIIllIIl[0]] = lIlIIllIIl[16];
        }
        int[] iArr18 = new int[lIlIIllIIl[1]];
        iArr18[lIlIIllIIl[0]] = lIlIIllIIl[42];
        if (lIIIllIlIllII(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIlIIllIIl[1]];
            iArr19[lIlIIllIIl[0]] = lIlIIllIIl[42];
        }
        int[] iArr20 = new int[lIlIIllIIl[1]];
        iArr20[lIlIIllIIl[0]] = lIlIIllIIl[44];
        if (lIIIllIlIllII(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lIlIIllIIl[1]];
            iArr21[lIlIIllIIl[0]] = lIlIIllIIl[44];
        }
        int[] iArr22 = new int[lIlIIllIIl[1]];
        iArr22[lIlIIllIIl[0]] = lIlIIllIIl[40];
        if (lIIIllIlIllII(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lIlIIllIIl[1]];
            iArr23[lIlIIllIIl[0]] = lIlIIllIIl[40];
        }
        int[] iArr24 = new int[lIlIIllIIl[1]];
        iArr24[lIlIIllIIl[0]] = lIlIIllIIl[45];
        if (lIIIllIlIllII(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lIlIIllIIl[1]];
            iArr25[lIlIIllIIl[0]] = lIlIIllIIl[45];
        }
        int[] iArr26 = new int[lIlIIllIIl[1]];
        iArr26[lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (lIIIllIlIllII(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lIlIIllIIl[1]];
            iArr27[lIlIIllIIl[0]] = lIlIIllIIl[47];
        }
        int[] iArr28 = new int[lIlIIllIIl[1]];
        iArr28[lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (lIIIllIlIllII(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lIlIIllIIl[1]];
            iArr29[lIlIIllIIl[0]] = lIlIIllIIl[49];
        }
        int[] iArr30 = new int[lIlIIllIIl[1]];
        iArr30[lIlIIllIIl[0]] = lIlIIllIIl[11];
        if (lIIIllIlIlIlI(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lIlIIllIIl[1];
            "".length();
            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return lIlIIllIIl[0];
    }

    private static boolean lIIIllIllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllIlIllII(int i) {
        return i == 0;
    }

    private static String lIIIllIlIIlIl(String llllllllllllllllllllIIIlIIlIIIll, String llllllllllllllllllllIIIlIIlIIIlI) {
        String llllllllllllllllllllIIIlIIlIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllllllIIIlIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllllIIIlIIlIIIlI.toCharArray();
        int llllllllllllllllllllIIIlIIIlllll = lIlIIllIIl[0];
        char[] charArray2 = llllllllllllllllllllIIIlIIlIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIIl[0];
        while (lIIIllIlIlIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllllIIIlIIIlllll % charArray.length]));
            "".length();
            llllllllllllllllllllIIIlIIIlllll++;
            i++;
            "".length();
            if ((-((183 ^ 186) ^ (39 ^ 46))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int lIIIllIlIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIIllIllIIII(int i) {
        return i < 0;
    }

    private static boolean lIIIllIlIlllI(int i) {
        return i > 0;
    }

    private static void lIIIllIlIlIII() {
        lIlIIllIIl = new int[72];
        lIlIIllIIl[0] = ((((104 + 136) - 233) + 180) ^ (((170 + 4) - 122) + 121)) & (((233 ^ 134) ^ (112 ^ 9)) ^ (-" ".length()));
        lIlIIllIIl[1] = " ".length();
        lIlIIllIIl[2] = 66 ^ 106;
        lIlIIllIIl[3] = "  ".length();
        lIlIIllIIl[4] = "   ".length();
        lIlIIllIIl[5] = (-8291) & 13290;
        lIlIIllIIl[6] = 84 ^ 80;
        lIlIIllIIl[7] = (-((-21217) & 30453)) & (-18433) & 28663;
        lIlIIllIIl[8] = (-((-9331) & 31863)) & (-1) & 23532;
        lIlIIllIIl[9] = (-((-807) & 25535)) & (-1) & 32735;
        lIlIIllIIl[10] = (((75 + 86) - 146) + 135) ^ (((81 + 18) - 4) + 52);
        lIlIIllIIl[11] = (-((-2427) & 19323)) & (-12293) & 29567;
        lIlIIllIIl[12] = (206 ^ 169) ^ "   ".length();
        lIlIIllIIl[13] = (((3 + 89) - (-48)) + 20) ^ (((92 + 32) - 86) + 137);
        lIlIIllIIl[14] = 129 ^ 135;
        lIlIIllIIl[15] = 120 ^ 127;
        lIlIIllIIl[16] = (-((-2745) & 23229)) & (-8777) & 30591;
        lIlIIllIIl[17] = (-24641) & 25973;
        lIlIIllIIl[18] = 43 ^ 35;
        lIlIIllIIl[19] = 38 ^ 50;
        lIlIIllIIl[20] = (162 ^ 172) ^ (46 ^ 41);
        lIlIIllIIl[21] = (237 ^ 193) ^ (110 ^ 72);
        lIlIIllIIl[22] = (((132 + 22) - 41) + 57) ^ (((51 + 53) - 70) + 127);
        lIlIIllIIl[23] = (((112 + 81) - 54) + 1) ^ (((98 + 99) - 112) + 43);
        lIlIIllIIl[24] = 148 ^ 153;
        lIlIIllIIl[25] = 122 ^ 116;
        lIlIIllIIl[26] = 128 ^ 144;
        lIlIIllIIl[27] = -" ".length();
        lIlIIllIIl[28] = (-23905) & 38886782;
        lIlIIllIIl[29] = (187 ^ 191) ^ (107 ^ 126);
        lIlIIllIIl[30] = (56 ^ 3) ^ (75 ^ 98);
        lIlIIllIIl[31] = (79 ^ 45) ^ (27 ^ 106);
        lIlIIllIIl[32] = 213 ^ 192;
        lIlIIllIIl[33] = (106 ^ 75) ^ (121 ^ 78);
        lIlIIllIIl[34] = 88 ^ 70;
        lIlIIllIIl[35] = (95 ^ 52) ^ (223 ^ 163);
        lIlIIllIIl[36] = (89 ^ 118) ^ (15 ^ 56);
        lIlIIllIIl[37] = (((170 + 98) - 153) + 71) ^ (((52 + 130) - 123) + 104);
        lIlIIllIIl[38] = (124 ^ 64) ^ (166 ^ 128);
        lIlIIllIIl[39] = 181 ^ 174;
        lIlIIllIIl[40] = (-((-1233) & 32753)) & (-19) & 32699;
        lIlIIllIIl[41] = (((136 + 5) - 104) + 146) ^ (((101 + 131) - 91) + 30);
        lIlIIllIIl[42] = (-14745) & 15867;
        lIlIIllIIl[43] = 43 ^ 54;
        lIlIIllIIl[44] = (-20809) & 21881;
        lIlIIllIIl[45] = (-((-18583) & 27607)) & (-18449) & 28671;
        lIlIIllIIl[46] = (78 ^ 108) ^ (165 ^ 152);
        lIlIIllIIl[47] = (-6485) & 8188;
        lIlIIllIIl[48] = (62 ^ 7) ^ (41 ^ 48);
        lIlIIllIIl[49] = (-((-1897) & 22378)) & (-1) & 31607;
        lIlIIllIIl[50] = (49 ^ 17) ^ " ".length();
        lIlIIllIIl[51] = (-((-903) & 32759)) & (-10) & 32765;
        lIlIIllIIl[52] = (-((-17002) & 25327)) & (-16419) & 32751;
        lIlIIllIIl[53] = (-((-2081) & 24420)) & (-1) & 57339;
        lIlIIllIIl[54] = (-((-417) & 5095)) & (-3074) & 32751;
        lIlIIllIIl[55] = (-((-1572) & 28207)) & (-5121) & 32255;
        lIlIIllIIl[56] = (-((-14002) & 30457)) & (-1281) & 32735;
        lIlIIllIIl[57] = 6 ^ 36;
        lIlIIllIIl[58] = (209 ^ 140) ^ (79 ^ 49);
        lIlIIllIIl[59] = (-257) & 3481;
        lIlIIllIIl[60] = (-((-25801) & 29902)) & (-8225) & 15615;
        lIlIIllIIl[61] = (-((-27108) & 31207)) & (-24577) & 31919;
        lIlIIllIIl[62] = (-271) & 3550;
        lIlIIllIIl[63] = (-((-1157) & 30605)) & (-135) & 32767;
        lIlIIllIIl[64] = (-((-11265) & 16129)) & (-24609) & 32639;
        lIlIIllIIl[65] = (53 ^ 18) ^ (155 ^ 140);
        lIlIIllIIl[66] = (-33) & 3245;
        lIlIIllIIl[67] = (-8977) & 12157;
        lIlIIllIIl[68] = (-((-16385) & 29505)) & (-16385) & 32758;
        lIlIIllIIl[69] = (-17185) & 20415;
        lIlIIllIIl[70] = (-((-1225) & 9694)) & (-523) & 12287;
        lIlIIllIIl[71] = (130 ^ 175) ^ (118 ^ 127);
    }

    private static boolean lIIIllIlIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0573, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05e2, code lost:
        return h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.N.lIlIIllIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02da, code lost:
        return h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.N.lIlIIllIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x032f, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0386, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03dd, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0434, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x048b, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e2, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0539, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (lIIIllIlIlIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aL() {
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[2])) {
            int[] iArr = new int[lIlIIllIIl[1]];
            iArr[lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (lIIIllIlIllII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIllIIl[1]];
                iArr2[lIlIIllIIl[0]] = lIlIIllIIl[17];
                if (lIIIllIlIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIIllIIl[1]];
                    iArr3[lIlIIllIIl[0]] = lIlIIllIIl[17];
                }
            }
            int[] iArr4 = new int[lIlIIllIIl[1]];
            iArr4[lIlIIllIIl[0]] = lIlIIllIIl[42];
            if (lIIIllIlIllII(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lIlIIllIIl[1]];
                iArr5[lIlIIllIIl[0]] = lIlIIllIIl[42];
                if (lIIIllIlIllII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIlIIllIIl[1]];
                    iArr6[lIlIIllIIl[0]] = lIlIIllIIl[42];
                }
            }
            int[] iArr7 = new int[lIlIIllIIl[1]];
            iArr7[lIlIIllIIl[0]] = lIlIIllIIl[44];
            if (lIIIllIlIllII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIllIIl[1]];
                iArr8[lIlIIllIIl[0]] = lIlIIllIIl[44];
                if (lIIIllIlIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIlIIllIIl[1]];
                    iArr9[lIlIIllIIl[0]] = lIlIIllIIl[44];
                }
            }
            int[] iArr10 = new int[lIlIIllIIl[1]];
            iArr10[lIlIIllIIl[0]] = lIlIIllIIl[40];
            if (lIIIllIlIllII(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIlIIllIIl[1]];
                iArr11[lIlIIllIIl[0]] = lIlIIllIIl[40];
                if (lIIIllIlIllII(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIlIIllIIl[1]];
                    iArr12[lIlIIllIIl[0]] = lIlIIllIIl[40];
                }
            }
            int[] iArr13 = new int[lIlIIllIIl[1]];
            iArr13[lIlIIllIIl[0]] = lIlIIllIIl[45];
            if (lIIIllIlIllII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIlIIllIIl[1]];
                iArr14[lIlIIllIIl[0]] = lIlIIllIIl[45];
                if (lIIIllIlIllII(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIIllIIl[1]];
                    iArr15[lIlIIllIIl[0]] = lIlIIllIIl[45];
                }
            }
            int[] iArr16 = new int[lIlIIllIIl[1]];
            iArr16[lIlIIllIIl[0]] = lIlIIllIIl[47];
            if (lIIIllIlIllII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIllIIl[1]];
                iArr17[lIlIIllIIl[0]] = lIlIIllIIl[47];
                if (lIIIllIlIllII(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlIIllIIl[1]];
                    iArr18[lIlIIllIIl[0]] = lIlIIllIIl[47];
                }
            }
            int[] iArr19 = new int[lIlIIllIIl[1]];
            iArr19[lIlIIllIIl[0]] = lIlIIllIIl[49];
            if (lIIIllIlIllII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIlIIllIIl[1]];
                iArr20[lIlIIllIIl[0]] = lIlIIllIIl[49];
                if (lIIIllIlIllII(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIlIIllIIl[1]];
                    iArr21[lIlIIllIIl[0]] = lIlIIllIIl[49];
                }
            }
            int[] iArr22 = new int[lIlIIllIIl[1]];
            iArr22[lIlIIllIIl[0]] = lIlIIllIIl[11];
            if (lIIIllIlIllII(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIlIIllIIl[1]];
                iArr23[lIlIIllIIl[0]] = lIlIIllIIl[11];
            }
            ?? r0 = lIlIIllIIl[1];
            "".length();
            return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[lIlIIllIIl[1]];
        iArr24[lIlIIllIIl[0]] = lIlIIllIIl[16];
        if (lIIIllIlIllII(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lIlIIllIIl[1]];
            iArr25[lIlIIllIIl[0]] = lIlIIllIIl[16];
            if (lIIIllIlIllII(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lIlIIllIIl[1]];
                iArr26[lIlIIllIIl[0]] = lIlIIllIIl[16];
            }
        }
        int[] iArr27 = new int[lIlIIllIIl[1]];
        iArr27[lIlIIllIIl[0]] = lIlIIllIIl[42];
        if (lIIIllIlIllII(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lIlIIllIIl[1]];
            iArr28[lIlIIllIIl[0]] = lIlIIllIIl[42];
            if (lIIIllIlIllII(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lIlIIllIIl[1]];
                iArr29[lIlIIllIIl[0]] = lIlIIllIIl[42];
            }
        }
        int[] iArr30 = new int[lIlIIllIIl[1]];
        iArr30[lIlIIllIIl[0]] = lIlIIllIIl[44];
        if (lIIIllIlIllII(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lIlIIllIIl[1]];
            iArr31[lIlIIllIIl[0]] = lIlIIllIIl[44];
            if (lIIIllIlIllII(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIlIIllIIl[1]];
                iArr32[lIlIIllIIl[0]] = lIlIIllIIl[44];
            }
        }
        int[] iArr33 = new int[lIlIIllIIl[1]];
        iArr33[lIlIIllIIl[0]] = lIlIIllIIl[40];
        if (lIIIllIlIllII(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lIlIIllIIl[1]];
            iArr34[lIlIIllIIl[0]] = lIlIIllIIl[40];
            if (lIIIllIlIllII(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lIlIIllIIl[1]];
                iArr35[lIlIIllIIl[0]] = lIlIIllIIl[40];
            }
        }
        int[] iArr36 = new int[lIlIIllIIl[1]];
        iArr36[lIlIIllIIl[0]] = lIlIIllIIl[45];
        if (lIIIllIlIllII(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lIlIIllIIl[1]];
            iArr37[lIlIIllIIl[0]] = lIlIIllIIl[45];
            if (lIIIllIlIllII(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lIlIIllIIl[1]];
                iArr38[lIlIIllIIl[0]] = lIlIIllIIl[45];
            }
        }
        int[] iArr39 = new int[lIlIIllIIl[1]];
        iArr39[lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (lIIIllIlIllII(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lIlIIllIIl[1]];
            iArr40[lIlIIllIIl[0]] = lIlIIllIIl[47];
            if (lIIIllIlIllII(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIlIIllIIl[1]];
                iArr41[lIlIIllIIl[0]] = lIlIIllIIl[47];
            }
        }
        int[] iArr42 = new int[lIlIIllIIl[1]];
        iArr42[lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (lIIIllIlIllII(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lIlIIllIIl[1]];
            iArr43[lIlIIllIIl[0]] = lIlIIllIIl[49];
            if (lIIIllIlIllII(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lIlIIllIIl[1]];
                iArr44[lIlIIllIIl[0]] = lIlIIllIIl[49];
            }
        }
        int[] iArr45 = new int[lIlIIllIIl[1]];
        iArr45[lIlIIllIIl[0]] = lIlIIllIIl[11];
        if (lIIIllIlIllII(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lIlIIllIIl[1]];
            iArr46[lIlIIllIIl[0]] = lIlIIllIIl[11];
        }
        ?? r02 = lIlIIllIIl[1];
        "".length();
        return (((((71 + 98) - 128) + 90) ^ (((80 + 2) - 42) + 120)) & (((188 ^ 182) ^ (99 ^ 74)) ^ (-" ".length()))) != 0 ? ((87 ^ 31) ^ (15 ^ 73)) & (((((82 + 43) - (-2)) + 10) ^ (((108 + 28) - 34) + 33)) ^ (-" ".length())) : r02;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIllIII[lIlIIllIIl[57]];
    }

    public static void ak() {
        if (lIIIllIlIllII(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[20]];
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(lIlIIllIIl[1]);
            "".length();
        }
        if (lIIIllIlIlIlI(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[21]];
            if (lIIIllIllIIIl(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIIllIlIlIlI(npc.getName().contains(lIlIIllIII[lIlIIllIIl[58]]) ? 1 : 0) && lIIIllIllIIIl(npc.getInteracting()) && lIIIllIlIllII(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIlIIllIIl[1];
                        "".length();
                        return (((199 ^ 163) ^ (216 ^ 154)) & (((((172 + 44) - 78) + 44) ^ (((7 + 29) - 32) + 140)) ^ (-" ".length()))) > 0 ? ((((101 + 62) - 62) + 53) ^ (((31 + 23) - (-89)) + 48)) & (((131 ^ 172) ^ (202 ^ 192)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIllIIl[0];
                });
                String[] strArr = new String[lIlIIllIIl[3]];
                strArr[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[22]];
                strArr[lIlIIllIIl[1]] = lIlIIllIII[lIlIIllIIl[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIIIllIllIIll(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lIlIIllIIl[1];
                        "".length();
                        return "   ".length() < 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                    }
                    return lIlIIllIIl[0];
                }).collect(Collectors.toList());
                if (lIIIllIlIllII(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lIlIIllIIl[0])).interact(lIlIIllIII[lIlIIllIIl[24]]);
                    Time.sleepTicks(lIlIIllIIl[3]);
                    "".length();
                }
                if (lIIIllIlIllIl(nearest) && lIIIllIlIllII(Players.getLocal().isMoving() ? 1 : 0) && lIIIllIlIlIlI(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lIlIIllIII[lIlIIllIIl[25]]);
                    Time.sleepTicks(lIlIIllIIl[3]);
                    "".length();
                }
            }
            if (lIIIllIlIllIl(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lIlIIllIIl[6]);
                "".length();
            }
        }
    }

    private static boolean lIIIllIlIlIll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIllIlIIlll() {
        lIlIIllIII = new String[lIlIIllIIl[71]];
        lIlIIllIII[lIlIIllIIl[0]] = lIIIllIlIIlII("KA+q/jc4cdv8eTKNcFQhWA==", "wLciY");
        lIlIIllIII[lIlIIllIIl[1]] = lIIIllIlIIlII("zbT/K/QM5c+BFchD37W5vZCOEMR89w2nkwRhKjCJ6MYGn/2cPe1ZYBdwCr2hh5AVFOT5rT9xQ8w=", "gNOGM");
        lIlIIllIII[lIlIIllIIl[3]] = lIIIllIlIIlIl("AAoyEzEvHy0UMW4fK1o0LwUv", "NkDzV");
        lIlIIllIII[lIlIIllIIl[4]] = lIIIllIlIIlIl("EQYHNT4wCQ5xMDgJAjg8Pg==", "YgiQR");
        lIlIIllIII[lIlIIllIIl[6]] = lIIIllIlIIllI("WzzLPn5xTG/SeeIlqfLiurMeyY6wKyTLATg+XsxHIagUIfArRvFjKbLSZnoZeifu", "nWzMq");
        lIlIIllIII[lIlIIllIIl[10]] = lIIIllIlIIlIl("HxE+BW4lADgGJyICIw==", "VcQkN");
        lIlIIllIII[lIlIIllIIl[14]] = lIIIllIlIIllI("leFRH/2aCDDnL0P/ZySb0g==", "yHqpi");
        lIlIIllIII[lIlIIllIIl[15]] = lIIIllIlIIllI("Mcw4rGEA6JCmCF9BBUYlRd6yQF1qhlkW", "ITsPG");
        lIlIIllIII[lIlIIllIIl[18]] = lIIIllIlIIllI("+BoIrBByF6E=", "VOnOE");
        lIlIIllIII[lIlIIllIIl[20]] = lIIIllIlIIlIl("Bi0FKT0/K0k2O3EvBjV0MD4MIw==", "QLiBT");
        lIlIIllIII[lIlIIllIIl[21]] = lIIIllIlIIlII("zEfWJ/0rw/HXpE/vXjo/nA==", "GEkXf");
        lIlIIllIII[lIlIIllIIl[22]] = lIIIllIlIIllI("KJ8ANFPYt2M=", "xeugz");
        lIlIIllIII[lIlIIllIIl[23]] = lIIIllIlIIllI("w+HiwPEc+8A=", "mLHXL");
        lIlIIllIII[lIlIIllIIl[24]] = lIIIllIlIIlIl("OBs6Dy8S", "yoNnL");
        lIlIIllIII[lIlIIllIIl[25]] = lIIIllIlIIlIl("KR0GGzMD", "hirzP");
        lIlIIllIII[lIlIIllIIl[13]] = lIIIllIlIIlIl("AB4xLnEzDjEgPSgKMSQ=", "AkEAQ");
        lIlIIllIII[lIlIIllIIl[26]] = lIIIllIlIIlII("Kl2LbYRR7iE=", "iIHkU");
        lIlIIllIII[lIlIIllIIl[29]] = lIIIllIlIIllI("7RcKgfb8guFWlQPtm6ufhg==", "MMRbE");
        lIlIIllIII[lIlIIllIIl[30]] = lIIIllIlIIllI("jzF7GE7YuCabQ0Hlmo32Hw==", "VcIru");
        lIlIIllIII[lIlIIllIIl[31]] = lIIIllIlIIlIl("FA0VNQU=", "CdpYa");
        lIlIIllIII[lIlIIllIIl[19]] = lIIIllIlIIlII("f+UPMCCF71Xf61p97zoKlQ==", "gsaPp");
        lIlIIllIII[lIlIIllIIl[32]] = lIIIllIlIIllI("/PmaFqAtoCs+Q6rMT36vrA==", "QceVQ");
        lIlIIllIII[lIlIIllIIl[33]] = lIIIllIlIIllI("y62WGSIs22A=", "OgziK");
        lIlIIllIII[lIlIIllIIl[35]] = lIIIllIlIIlII("M6INhyR+w9OJjfioSvE4n0jlo4bGHcw3", "DDXWf");
        lIlIIllIII[lIlIIllIIl[36]] = lIIIllIlIIllI("BitWpkTDU6vqKUMRX+Hxpd2ewL5fcR2j", "iDgJe");
        lIlIIllIII[lIlIIllIIl[37]] = lIIIllIlIIllI("5swaPq7th5g=", "wUITH");
        lIlIIllIII[lIlIIllIIl[38]] = lIIIllIlIIllI("azU01qdV+Og=", "rviZa");
        lIlIIllIII[lIlIIllIIl[39]] = lIIIllIlIIllI("tobTiMTp1JA=", "naHgJ");
        lIlIIllIII[lIlIIllIIl[41]] = lIIIllIlIIlIl("OAYKBg==", "ocktB");
        lIlIIllIII[lIlIIllIIl[43]] = lIIIllIlIIlII("rrmWRYrlEgs=", "wLSFa");
        lIlIIllIII[lIlIIllIIl[34]] = lIIIllIlIIllI("1PEsbW4n8k8=", "xDOMs");
        lIlIIllIII[lIlIIllIIl[46]] = lIIIllIlIIlIl("LQoKAA==", "zokrB");
        lIlIIllIII[lIlIIllIIl[48]] = lIIIllIlIIllI("2irWh1XTOWE=", "SrEGZ");
        lIlIIllIII[lIlIIllIIl[50]] = lIIIllIlIIlII("4mBAhd0ghjU=", "oefOi");
        lIlIIllIII[lIlIIllIIl[57]] = lIIIllIlIIlII("eY1p4kiU5xc=", "gYacX");
        lIlIIllIII[lIlIIllIIl[58]] = lIIIllIlIIllI("L0uBzom1gUk=", "EsDQw");
    }

    private static boolean lIIIllIlIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIlIllll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIIllIlIIlII(String llllllllllllllllllllIIIlIIllIIll, String llllllllllllllllllllIIIlIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIllIIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIllIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIlIIllIlII) {
            llllllllllllllllllllIIIlIIllIlII.printStackTrace();
            return null;
        }
    }

    public static void aJ() {
        if (lIIIllIllIIlI(Static.getClient().getVar(lIlIIllIIl[22]), lIlIIllIIl[1])) {
            Static.getClient().invokeMenuAction(lIlIIllIII[lIlIIllIIl[13]], lIlIIllIII[lIlIIllIIl[26]], lIlIIllIIl[1], MenuAction.CC_OP.getId(), lIlIIllIIl[27], lIlIIllIIl[28]);
        }
        if (lIIIllIlIlIll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[10])) {
            String[] strArr = new String[lIlIIllIIl[1]];
            strArr[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[29]];
            if (lIIIllIlIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIIllIIl[1]];
                strArr2[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[30]];
                Inventory.getFirst(strArr2).interact(lIlIIllIII[lIlIIllIIl[31]]);
            }
        }
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[10]) && lIIIllIlIlIll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[19])) {
            String[] strArr3 = new String[lIlIIllIIl[1]];
            strArr3[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[19]];
            if (lIIIllIlIlIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lIlIIllIIl[1]];
                strArr4[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[32]];
                Inventory.getFirst(strArr4).interact(lIlIIllIII[lIlIIllIIl[33]]);
            }
        }
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[19]) && lIIIllIlIlIll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[34])) {
            String[] strArr5 = new String[lIlIIllIIl[1]];
            strArr5[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[35]];
            if (lIIIllIlIlIlI(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lIlIIllIIl[1]];
                strArr6[lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[36]];
                Inventory.getFirst(strArr6).interact(lIlIIllIII[lIlIIllIIl[37]]);
            }
        }
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[34]) && lIIIllIlIlIll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[2])) {
            int[] iArr = new int[lIlIIllIIl[1]];
            iArr[lIlIIllIIl[0]] = lIlIIllIIl[16];
            if (lIIIllIlIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIllIIl[1]];
                iArr2[lIlIIllIIl[0]] = lIlIIllIIl[16];
                Inventory.getFirst(iArr2).interact(lIlIIllIII[lIlIIllIIl[38]]);
            }
        }
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[2])) {
            int[] iArr3 = new int[lIlIIllIIl[1]];
            iArr3[lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (lIIIllIlIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIlIIllIIl[1]];
                iArr4[lIlIIllIIl[0]] = lIlIIllIIl[17];
                Inventory.getFirst(iArr4).interact(lIlIIllIII[lIlIIllIIl[39]]);
            }
        }
        if (lIIIllIlIllll(Skills.getLevel(Skill.DEFENCE), lIlIIllIIl[34])) {
            int[] iArr5 = new int[lIlIIllIIl[1]];
            iArr5[lIlIIllIIl[0]] = lIlIIllIIl[40];
            if (lIIIllIlIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlIIllIIl[1]];
                iArr6[lIlIIllIIl[0]] = lIlIIllIIl[40];
                Inventory.getFirst(iArr6).interact(lIlIIllIII[lIlIIllIIl[41]]);
            }
            int[] iArr7 = new int[lIlIIllIIl[1]];
            iArr7[lIlIIllIIl[0]] = lIlIIllIIl[42];
            if (lIIIllIlIlIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIllIIl[1]];
                iArr8[lIlIIllIIl[0]] = lIlIIllIIl[42];
                Inventory.getFirst(iArr8).interact(lIlIIllIII[lIlIIllIIl[43]]);
            }
            int[] iArr9 = new int[lIlIIllIIl[1]];
            iArr9[lIlIIllIIl[0]] = lIlIIllIIl[44];
            if (lIIIllIlIlIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIlIIllIIl[1]];
                iArr10[lIlIIllIIl[0]] = lIlIIllIIl[44];
                Inventory.getFirst(iArr10).interact(lIlIIllIII[lIlIIllIIl[34]]);
            }
            int[] iArr11 = new int[lIlIIllIIl[1]];
            iArr11[lIlIIllIIl[0]] = lIlIIllIIl[45];
            if (lIIIllIlIlIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIIllIIl[1]];
                iArr12[lIlIIllIIl[0]] = lIlIIllIIl[45];
                Inventory.getFirst(iArr12).interact(lIlIIllIII[lIlIIllIIl[46]]);
            }
        }
        int[] iArr13 = new int[lIlIIllIIl[1]];
        iArr13[lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (lIIIllIlIlIlI(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIllIIl[1]];
            iArr14[lIlIIllIIl[0]] = lIlIIllIIl[47];
            Inventory.getFirst(iArr14).interact(lIlIIllIII[lIlIIllIIl[48]]);
        }
        int[] iArr15 = new int[lIlIIllIIl[1]];
        iArr15[lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (lIIIllIlIlIlI(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIlIIllIIl[1]];
            iArr16[lIlIIllIIl[0]] = lIlIIllIIl[49];
            Inventory.getFirst(iArr16).interact(lIlIIllIII[lIlIIllIIl[50]]);
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aH();
            "".length();
            if (((68 ^ 73) ^ (58 ^ 51)) <= "   ".length()) {
                return ((180 ^ 139) ^ (3 ^ 55)) & (((104 ^ 124) ^ (76 ^ 83)) ^ (-" ".length()));
            }
        } catch (Exception llllllllllllllllllllIIIlIIllllll) {
            llllllllllllllllllllIIIlIIllllll.printStackTrace();
        }
        return lIlIIllIIl[0];
    }

    public static void aM() {
        if (lIIIllIlIlIll(Skills.getLevel(Skill.DEFENCE), lIlIIllIIl[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    public static void O() {
        int[] iArr = new int[lIlIIllIIl[1]];
        iArr[lIlIIllIIl[0]] = lIlIIllIIl[9];
        if (lIIIllIlIllII(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[9], lIlIIllIIl[2], lIlIIllIIl[51]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIllIIl[1]];
        iArr2[lIlIIllIIl[0]] = lIlIIllIIl[52];
        if (lIIIllIlIllII(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[52], lIlIIllIIl[10], lIlIIllIIl[51]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIllIIl[1]];
        iArr3[lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (lIIIllIlIllII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[49], lIlIIllIIl[1], lIlIIllIIl[53]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIllIIl[1]];
        iArr4[lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (lIIIllIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[47], lIlIIllIIl[1], lIlIIllIIl[54]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIllIIl[1]];
        iArr5[lIlIIllIIl[0]] = lIlIIllIIl[11];
        if (lIIIllIlIllII(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[11], lIlIIllIIl[12], lIlIIllIIl[55]));
            "".length();
        }
        int[] iArr6 = new int[lIlIIllIIl[1]];
        iArr6[lIlIIllIIl[0]] = lIlIIllIIl[40];
        if (lIIIllIlIllII(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[40], lIlIIllIIl[1], lIlIIllIIl[56]));
            "".length();
        }
        int[] iArr7 = new int[lIlIIllIIl[1]];
        iArr7[lIlIIllIIl[0]] = lIlIIllIIl[44];
        if (lIIIllIlIllII(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[44], lIlIIllIIl[1], lIlIIllIIl[56]));
            "".length();
        }
        int[] iArr8 = new int[lIlIIllIIl[1]];
        iArr8[lIlIIllIIl[0]] = lIlIIllIIl[45];
        if (lIIIllIlIllII(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[45], lIlIIllIIl[1], lIlIIllIIl[56]));
            "".length();
        }
        int[] iArr9 = new int[lIlIIllIIl[1]];
        iArr9[lIlIIllIIl[0]] = lIlIIllIIl[42];
        if (lIIIllIlIllII(Bank.contains(iArr9) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[42], lIlIIllIIl[1], lIlIIllIIl[56]));
            "".length();
        }
        if (lIIIllIlIllll(Skills.getLevel(Skill.ATTACK), lIlIIllIIl[2])) {
            int[] iArr10 = new int[lIlIIllIIl[1]];
            iArr10[lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (lIIIllIlIllII(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIIl[17], lIlIIllIIl[1], lIlIIllIIl[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIlIIllIIl[1]];
        iArr11[lIlIIllIIl[0]] = lIlIIllIIl[16];
        if (lIIIllIlIllII(Bank.contains(iArr11) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIIl[16], lIlIIllIIl[1], lIlIIllIIl[56]));
            "".length();
        }
    }

    private static boolean lIIIllIllIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIllIIl[0];
    }

    private static boolean lIIIllIllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }
}

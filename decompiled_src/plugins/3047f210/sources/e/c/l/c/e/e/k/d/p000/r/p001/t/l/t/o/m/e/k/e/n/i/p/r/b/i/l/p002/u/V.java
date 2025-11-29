package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.V  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/V.class */
public class V implements S {
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ WorldArea ja;
    private static /* synthetic */ String[] lllllIlIIl;
    public static /* synthetic */ WorldArea jc;
    public static /* synthetic */ int[] iZ;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ WorldArea jb;
    public static /* synthetic */ WorldPoint je;
    public static /* synthetic */ WorldPoint jd;
    private static /* synthetic */ int[] lllllIlIlI;
    public static /* synthetic */ WorldPoint bw;

    private static String llIlIlIIIIIlI(String lllllllllllllllllIlIIlIlIIlIllIl, String lllllllllllllllllIlIIlIlIIlIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIlIlIIlIlIll = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIlIlIIlIllII.toCharArray();
        int lllllllllllllllllIlIIlIlIIlIlIIl = lllllIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllllIlIlI[0];
        while (llIlIlIIIIlll(i, length)) {
            char lllllllllllllllllIlIIlIlIIlIlllI = charArray2[i];
            lllllllllllllllllIlIIlIlIIlIlIll.append((char) (lllllllllllllllllIlIIlIlIIlIlllI ^ charArray[lllllllllllllllllIlIIlIlIIlIlIIl % charArray.length]));
            "".length();
            lllllllllllllllllIlIIlIlIIlIlIIl++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIlIlIIlIlIll);
    }

    public static void Z() {
        if (llIlIlIIIlIII(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[21]];
            Movement.walkTo(bw);
            "".length();
            Time.sleepTicks(lllllIlIlI[1]);
            "".length();
        }
        if (llIlIlIIIIllI(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[22]];
            if (llIlIlIIIllIl(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llIlIlIIIIllI(npc.getName().contains(lllllIlIIl[lllllIlIlI[60]]) ? 1 : 0) && llIlIlIIIllIl(npc.getInteracting()) && llIlIlIIIlIII(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllllIlIlI[1];
                        "".length();
                        return (((51 ^ 100) ^ (0 ^ 77)) & (((((217 + 21) - 209) + 189) ^ (((59 + 8) - (-48)) + 77)) ^ (-" ".length()))) > " ".length() ? ((((13 + 86) - (-84)) + 2) ^ (((66 + 21) - (-24)) + 18)) & (((135 ^ 136) ^ (134 ^ 177)) ^ (-" ".length())) : r0;
                    }
                    return lllllIlIlI[0];
                });
                String[] strArr = new String[lllllIlIlI[4]];
                strArr[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[23]];
                strArr[lllllIlIlI[1]] = lllllIlIIl[lllllIlIlI[24]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (llIlIlIIlIIII(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lllllIlIlI[1];
                        "".length();
                        return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllIlIlI[0];
                }).collect(Collectors.toList());
                if (llIlIlIIIlIII(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lllllIlIlI[0])).interact(lllllIlIIl[lllllIlIlI[25]]);
                    Time.sleepTicks(lllllIlIlI[4]);
                    "".length();
                }
                if (llIlIlIIIlIlI(nearest) && llIlIlIIIlIII(Players.getLocal().isMoving() ? 1 : 0) && llIlIlIIIIllI(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lllllIlIIl[lllllIlIlI[26]]);
                    Time.sleepTicks(lllllIlIlI[4]);
                    "".length();
                }
            }
            if (llIlIlIIIlIlI(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lllllIlIlI[7]);
                "".length();
            }
        }
    }

    private static boolean llIlIlIIIlIll(int i) {
        return i > 0;
    }

    private static boolean llIlIlIIIllII(int i) {
        return i < 0;
    }

    private static boolean llIlIlIIIllIl(Object obj) {
        return obj == null;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dz();
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((((140 + 82) - 118) + 79) ^ (((129 + 77) - 144) + 68)) & (((((39 + 151) - 182) + 162) ^ (((85 + 95) - 105) + 84)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return lllllIlIlI[0];
    }

    static {
        llIlIlIIIIlII();
        llIlIlIIIIIll();
        bu = new ArrayList();
        int[] iArr = new int[lllllIlIlI[19]];
        iArr[lllllIlIlI[0]] = lllllIlIlI[17];
        iArr[lllllIlIlI[1]] = lllllIlIlI[18];
        iArr[lllllIlIlI[4]] = lllllIlIlI[44];
        iArr[lllllIlIlI[5]] = lllllIlIlI[45];
        iArr[lllllIlIlI[7]] = lllllIlIlI[42];
        iArr[lllllIlIlI[11]] = lllllIlIlI[47];
        iArr[lllllIlIlI[15]] = lllllIlIlI[49];
        iArr[lllllIlIlI[16]] = lllllIlIlI[51];
        iZ = iArr;
        ja = new WorldArea(lllllIlIlI[61], lllllIlIlI[62], lllllIlIlI[23], lllllIlIlI[23], lllllIlIlI[0]);
        jb = new WorldArea(lllllIlIlI[63], lllllIlIlI[64], lllllIlIlI[33], lllllIlIlI[27], lllllIlIlI[0]);
        jc = new WorldArea(lllllIlIlI[65], lllllIlIlI[66], lllllIlIlI[67], lllllIlIlI[2], lllllIlIlI[0]);
        jd = new WorldPoint(lllllIlIlI[68], lllllIlIlI[69], lllllIlIlI[0]);
        bw = new WorldPoint(lllllIlIlI[70], lllllIlIlI[62], lllllIlIlI[0]);
        je = new WorldPoint(lllllIlIlI[71], lllllIlIlI[72], lllllIlIlI[0]);
    }

    private static boolean llIlIlIIIlllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0275, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dz() {
        if (llIlIlIIIIllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[0]];
            C0001b.a(bu);
            if (llIlIlIIIIlll(bu.size(), lllllIlIlI[1])) {
                System.out.println(lllllIlIIl[lllllIlIlI[1]]);
                bs = lllllIlIlI[0];
            }
        }
        if (llIlIlIIIlIII(bs ? 1 : 0)) {
            if (llIlIlIIIlIII(bz() ? 1 : 0) && (!llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[2]) || !llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[3]) || llIlIlIIIIlll(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[3]))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIlIIIlIlI(nearest) && llIlIlIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[4]];
                    C0000a.a(nearest);
                }
                if (llIlIlIIIlIlI(nearest) && llIlIlIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[5]];
                    if (llIlIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllIlIlI[6]);
                        "".length();
                    }
                    if (llIlIlIIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIlIIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllIlIlI[1]);
                            "".length();
                        }
                        if (llIlIlIIIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllIlIlI[4]);
                            "".length();
                        }
                        if (llIlIlIIIlIII(dB() ? 1 : 0)) {
                            ae();
                            System.out.println(lllllIlIIl[lllllIlIlI[7]]);
                            bs = lllllIlIlI[1];
                            return;
                        }
                        C0000a.a(iZ, lllllIlIlI[1]);
                        C0000a.a(lllllIlIlI[8], lllllIlIlI[9]);
                        C0000a.b(C0005f.aU, lllllIlIlI[1]);
                        C0000a.a(lllllIlIlI[10], lllllIlIlI[11]);
                        C0000a.a(lllllIlIlI[12], lllllIlIlI[13]);
                    }
                }
            }
            if (llIlIlIIIIllI(bz() ? 1 : 0)) {
                dA();
                if (llIlIlIIIlIIl(Movement.getRunEnergy(), lllllIlIlI[14]) && llIlIlIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lllllIlIlI[1]];
                strArr[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[11]];
                if (llIlIlIIIlIII(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllllIlIlI[1]];
                    strArr2[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[15]];
                    if (llIlIlIIIlIII(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllllIlIlI[1]];
                        strArr3[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[16]];
                        if (llIlIlIIIlIII(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lllllIlIlI[1]];
                            iArr[lllllIlIlI[0]] = lllllIlIlI[17];
                            if (llIlIlIIIlIII(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllllIlIlI[1]];
                                iArr2[lllllIlIlI[0]] = lllllIlIlI[18];
                            }
                        }
                    }
                }
                dC();
                if (llIlIlIIIllII(llIlIlIIIIlIl(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[lllllIlIlI[1]];
                    iArr3[lllllIlIlI[0]] = lllllIlIlI[12];
                    if (llIlIlIIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllllIlIlI[1]];
                        iArr4[lllllIlIlI[0]] = lllllIlIlI[12];
                        Inventory.getFirst(iArr4).interact(lllllIlIIl[lllllIlIlI[19]]);
                        Time.sleepTicks(lllllIlIlI[1]);
                        "".length();
                    }
                }
                if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[20]) && llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[20])) {
                    C0009j.Q();
                }
            }
        }
    }

    private static boolean llIlIlIIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIlIIIIIIl(String lllllllllllllllllIlIIlIlIIllllIl, String lllllllllllllllllIlIIlIlIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIlIIllllII.getBytes(StandardCharsets.UTF_8)), lllllIlIlI[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIlIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIlIIlllllI) {
            lllllllllllllllllIlIIlIlIIlllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllllIlIlI[0];
    }

    private static boolean llIlIlIIIlIII(int i) {
        return i == 0;
    }

    private static boolean llIlIlIIIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a5, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0226, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0260, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x029a, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d4, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x030e, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0348, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0382, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bz() {
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[39])) {
            int[] iArr = new int[lllllIlIlI[1]];
            iArr[lllllIlIlI[0]] = lllllIlIlI[18];
            if (llIlIlIIIlIII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIlIlI[1]];
                iArr2[lllllIlIlI[0]] = lllllIlIlI[18];
            }
            int[] iArr3 = new int[lllllIlIlI[1]];
            iArr3[lllllIlIlI[0]] = lllllIlIlI[44];
            if (llIlIlIIIlIII(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllllIlIlI[1]];
                iArr4[lllllIlIlI[0]] = lllllIlIlI[44];
            }
            int[] iArr5 = new int[lllllIlIlI[1]];
            iArr5[lllllIlIlI[0]] = lllllIlIlI[45];
            if (llIlIlIIIlIII(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllllIlIlI[1]];
                iArr6[lllllIlIlI[0]] = lllllIlIlI[45];
            }
            int[] iArr7 = new int[lllllIlIlI[1]];
            iArr7[lllllIlIlI[0]] = lllllIlIlI[42];
            if (llIlIlIIIlIII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllllIlIlI[1]];
                iArr8[lllllIlIlI[0]] = lllllIlIlI[42];
            }
            int[] iArr9 = new int[lllllIlIlI[1]];
            iArr9[lllllIlIlI[0]] = lllllIlIlI[47];
            if (llIlIlIIIlIII(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllllIlIlI[1]];
                iArr10[lllllIlIlI[0]] = lllllIlIlI[47];
            }
            int[] iArr11 = new int[lllllIlIlI[1]];
            iArr11[lllllIlIlI[0]] = lllllIlIlI[49];
            if (llIlIlIIIlIII(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllllIlIlI[1]];
                iArr12[lllllIlIlI[0]] = lllllIlIlI[49];
            }
            int[] iArr13 = new int[lllllIlIlI[1]];
            iArr13[lllllIlIlI[0]] = lllllIlIlI[51];
            if (llIlIlIIIlIII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllllIlIlI[1]];
                iArr14[lllllIlIlI[0]] = lllllIlIlI[51];
            }
            int[] iArr15 = new int[lllllIlIlI[1]];
            iArr15[lllllIlIlI[0]] = lllllIlIlI[12];
            if (llIlIlIIIIllI(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lllllIlIlI[1];
                "".length();
                return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllllIlIlI[0];
        }
        int[] iArr16 = new int[lllllIlIlI[1]];
        iArr16[lllllIlIlI[0]] = lllllIlIlI[17];
        if (llIlIlIIIlIII(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllllIlIlI[1]];
            iArr17[lllllIlIlI[0]] = lllllIlIlI[17];
        }
        int[] iArr18 = new int[lllllIlIlI[1]];
        iArr18[lllllIlIlI[0]] = lllllIlIlI[44];
        if (llIlIlIIIlIII(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lllllIlIlI[1]];
            iArr19[lllllIlIlI[0]] = lllllIlIlI[44];
        }
        int[] iArr20 = new int[lllllIlIlI[1]];
        iArr20[lllllIlIlI[0]] = lllllIlIlI[45];
        if (llIlIlIIIlIII(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lllllIlIlI[1]];
            iArr21[lllllIlIlI[0]] = lllllIlIlI[45];
        }
        int[] iArr22 = new int[lllllIlIlI[1]];
        iArr22[lllllIlIlI[0]] = lllllIlIlI[42];
        if (llIlIlIIIlIII(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lllllIlIlI[1]];
            iArr23[lllllIlIlI[0]] = lllllIlIlI[42];
        }
        int[] iArr24 = new int[lllllIlIlI[1]];
        iArr24[lllllIlIlI[0]] = lllllIlIlI[47];
        if (llIlIlIIIlIII(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllllIlIlI[1]];
            iArr25[lllllIlIlI[0]] = lllllIlIlI[47];
        }
        int[] iArr26 = new int[lllllIlIlI[1]];
        iArr26[lllllIlIlI[0]] = lllllIlIlI[49];
        if (llIlIlIIIlIII(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lllllIlIlI[1]];
            iArr27[lllllIlIlI[0]] = lllllIlIlI[49];
        }
        int[] iArr28 = new int[lllllIlIlI[1]];
        iArr28[lllllIlIlI[0]] = lllllIlIlI[51];
        if (llIlIlIIIlIII(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lllllIlIlI[1]];
            iArr29[lllllIlIlI[0]] = lllllIlIlI[51];
        }
        int[] iArr30 = new int[lllllIlIlI[1]];
        iArr30[lllllIlIlI[0]] = lllllIlIlI[12];
        if (llIlIlIIIIllI(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lllllIlIlI[1];
            "".length();
            return (-((79 ^ 49) ^ (56 ^ 67))) >= 0 ? ((63 ^ 59) ^ (90 ^ 82)) & (((((131 + 102) - 161) + 77) ^ (((140 + 144) - 262) + 131)) ^ (-" ".length())) : r02;
        }
        return lllllIlIlI[0];
    }

    private static String llIlIlIIIIIII(String lllllllllllllllllIlIIlIlIIIllIII, String lllllllllllllllllIlIIlIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIlIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIlIlIIIllIlI.init(lllllIlIlI[4], lllllllllllllllllIlIIlIlIIIllIll);
            return new String(lllllllllllllllllIlIIlIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIlIIIllIIl) {
            lllllllllllllllllIlIIlIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIIIll() {
        lllllIlIIl = new String[lllllIlIlI[73]];
        lllllIlIIl[lllllIlIlI[0]] = llIlIlIIIIIII("lloZvt+11MhhAs5d1SpDJA==", "fYDZA");
        lllllIlIIl[lllllIlIlI[1]] = llIlIlIIIIIIl("L2cGX6Hbxpt+BRD0r9XmcArrGZB5/xRH28q1MIdUuy6//OQcQWTxGpnx3EnkgyAUF+Xc1EUwKBk=", "nowFa");
        lllllIlIIl[lllllIlIlI[4]] = llIlIlIIIIIII("VdqJK6e0BKkECGRePBnW08GnT4vWrZvr", "REXwo");
        lllllIlIIl[lllllIlIlI[5]] = llIlIlIIIIIII("l8H1dA/XAi1yZz3JeNAlsRy6aMf7Ji3K", "eDOFT");
        lllllIlIIl[lllllIlIlI[7]] = llIlIlIIIIIIl("ZBHde2adpGg01wLoKQrIT+6KErm8qA+VF2AWVkHG43Wq3WJLvowel+Va1ownEUgJ", "coBKF");
        lllllIlIIl[lllllIlIlI[11]] = llIlIlIIIIIII("nlrCBZPOgWQl4sO2/Cs8kw==", "evqBg");
        lllllIlIIl[lllllIlIlI[15]] = llIlIlIIIIIIl("sgm3NHbKWFa6U63P2+4iQw==", "cIYgp");
        lllllIlIIl[lllllIlIlI[16]] = llIlIlIIIIIIl("DQIrbj3P95Q/Mzw51mefaO/VInbtD2Dp", "dulnv");
        lllllIlIIl[lllllIlIlI[19]] = llIlIlIIIIIIl("pVnE5gRnutg=", "ExrqK");
        lllllIlIIl[lllllIlIlI[21]] = llIlIlIIIIIII("C1OD9y2xTDSNwDg/uyqUFJfp5jiZbMye", "gwPhs");
        lllllIlIIl[lllllIlIlI[22]] = llIlIlIIIIIII("8Tvx/UbRq99Bl2O2JMof6w==", "GJxZF");
        lllllIlIIl[lllllIlIlI[23]] = llIlIlIIIIIlI("DAUk", "OjSrW");
        lllllIlIIl[lllllIlIlI[24]] = llIlIlIIIIIIl("9Se4e0QAd3Y=", "GcHPY");
        lllllIlIIl[lllllIlIlI[25]] = llIlIlIIIIIlI("IyAzNDcJ", "bTGUT");
        lllllIlIIl[lllllIlIlI[26]] = llIlIlIIIIIIl("F9yYrbF2Rxo=", "BmKEy");
        lllllIlIIl[lllllIlIlI[14]] = llIlIlIIIIIII("XYZ9HoTlIonG3lGxbbkuw6eNLhfQ5bdU", "muAkR");
        lllllIlIIl[lllllIlIlI[27]] = llIlIlIIIIIlI("LwMjIHUcEyMuOQcXIyo=", "nvWOU");
        lllllIlIIl[lllllIlIlI[28]] = llIlIlIIIIIlI("", "hmCuO");
        lllllIlIIl[lllllIlIlI[31]] = llIlIlIIIIIII("EwC1ifQhz6RO7bjGZG28SQ==", "eWqTQ");
        lllllIlIIl[lllllIlIlI[32]] = llIlIlIIIIIlI("Ah4ZKHk4Dx8rMD8NBA==", "KlvFY");
        lllllIlIIl[lllllIlIlI[20]] = llIlIlIIIIIIl("cbw3YllpXws=", "yRyTL");
        lllllIlIIl[lllllIlIlI[33]] = llIlIlIIIIIII("jCcQDhZq2KJbZFWkkJDBbA==", "EDwUf");
        lllllIlIIl[lllllIlIlI[34]] = llIlIlIIIIIlI("BxUoIDl0Ei4sOD0VLDc=", "TaMEU");
        lllllIlIIl[lllllIlIlI[35]] = llIlIlIIIIIIl("3noM5BUKcJg=", "Gyfje");
        lllllIlIIl[lllllIlIlI[36]] = llIlIlIIIIIII("y/TXrQicg88OMwjj4PAvL2UdA9kr0lgh", "CIdHm");
        lllllIlIIl[lllllIlIlI[37]] = llIlIlIIIIIlI("PQM7JTUZBm8+JBkHJjkmAg==", "pjOMG");
        lllllIlIIl[lllllIlIlI[38]] = llIlIlIIIIIII("iA68pLsTv60=", "QctIx");
        lllllIlIIl[lllllIlIlI[40]] = llIlIlIIIIIlI("GCYJCws=", "OOlgo");
        lllllIlIIl[lllllIlIlI[41]] = llIlIlIIIIIlI("NRwIDQE=", "bumae");
        lllllIlIIl[lllllIlIlI[43]] = llIlIlIIIIIIl("/SM6FJ9Osd8=", "rgVHf");
        lllllIlIIl[lllllIlIlI[2]] = llIlIlIIIIIlI("BQ0MAg==", "Rhmpz");
        lllllIlIIl[lllllIlIlI[46]] = llIlIlIIIIIIl("ROOYj/8AoQ4=", "nBWvH");
        lllllIlIIl[lllllIlIlI[48]] = llIlIlIIIIIlI("HTIyEQ==", "JWScg");
        lllllIlIIl[lllllIlIlI[50]] = llIlIlIIIIIII("YQnyUXRKT6I=", "beSpL");
        lllllIlIIl[lllllIlIlI[52]] = llIlIlIIIIIlI("HxwTHA==", "HyrnE");
        lllllIlIIl[lllllIlIlI[59]] = llIlIlIIIIIlI("eVJ4FB4/", "MbXGj");
        lllllIlIIl[lllllIlIlI[60]] = llIlIlIIIIIIl("pwSv+6DcSIo=", "eCsLc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[39])) {
            ?? r0 = lllllIlIlI[1];
            "".length();
            return (7 ^ 3) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIlIlI[0];
    }

    public static void dA() {
        if (llIlIlIIIlllI(Static.getClient().getVar(lllllIlIlI[23]), lllllIlIlI[1])) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[14]];
            Static.getClient().invokeMenuAction(lllllIlIIl[lllllIlIlI[27]], lllllIlIIl[lllllIlIlI[28]], lllllIlIlI[1], MenuAction.CC_OP.getId(), lllllIlIlI[29], lllllIlIlI[30]);
        }
        if (llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[11])) {
            String[] strArr = new String[lllllIlIlI[1]];
            strArr[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[31]];
            if (llIlIlIIIIllI(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllllIlIlI[1]];
                strArr2[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[32]];
                Inventory.getFirst(strArr2).interact(lllllIlIIl[lllllIlIlI[20]]);
            }
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[11]) && llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[20])) {
            String[] strArr3 = new String[lllllIlIlI[1]];
            strArr3[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[33]];
            if (llIlIlIIIIllI(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lllllIlIlI[1]];
                strArr4[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[34]];
                Inventory.getFirst(strArr4).interact(lllllIlIIl[lllllIlIlI[35]]);
            }
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[20]) && llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[2])) {
            String[] strArr5 = new String[lllllIlIlI[1]];
            strArr5[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[36]];
            if (llIlIlIIIIllI(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lllllIlIlI[1]];
                strArr6[lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[37]];
                Inventory.getFirst(strArr6).interact(lllllIlIIl[lllllIlIlI[38]]);
            }
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[2]) && llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[39])) {
            int[] iArr = new int[lllllIlIlI[1]];
            iArr[lllllIlIlI[0]] = lllllIlIlI[17];
            if (llIlIlIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIlIlI[1]];
                iArr2[lllllIlIlI[0]] = lllllIlIlI[17];
                Inventory.getFirst(iArr2).interact(lllllIlIIl[lllllIlIlI[40]]);
            }
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[39])) {
            int[] iArr3 = new int[lllllIlIlI[1]];
            iArr3[lllllIlIlI[0]] = lllllIlIlI[18];
            if (llIlIlIIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllllIlIlI[1]];
                iArr4[lllllIlIlI[0]] = lllllIlIlI[18];
                Inventory.getFirst(iArr4).interact(lllllIlIIl[lllllIlIlI[41]]);
            }
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[2])) {
            int[] iArr5 = new int[lllllIlIlI[1]];
            iArr5[lllllIlIlI[0]] = lllllIlIlI[42];
            if (llIlIlIIIIllI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllllIlIlI[1]];
                iArr6[lllllIlIlI[0]] = lllllIlIlI[42];
                Inventory.getFirst(iArr6).interact(lllllIlIIl[lllllIlIlI[43]]);
            }
            int[] iArr7 = new int[lllllIlIlI[1]];
            iArr7[lllllIlIlI[0]] = lllllIlIlI[44];
            if (llIlIlIIIIllI(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllllIlIlI[1]];
                iArr8[lllllIlIlI[0]] = lllllIlIlI[44];
                Inventory.getFirst(iArr8).interact(lllllIlIIl[lllllIlIlI[2]]);
            }
            int[] iArr9 = new int[lllllIlIlI[1]];
            iArr9[lllllIlIlI[0]] = lllllIlIlI[45];
            if (llIlIlIIIIllI(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllllIlIlI[1]];
                iArr10[lllllIlIlI[0]] = lllllIlIlI[45];
                Inventory.getFirst(iArr10).interact(lllllIlIIl[lllllIlIlI[46]]);
            }
            int[] iArr11 = new int[lllllIlIlI[1]];
            iArr11[lllllIlIlI[0]] = lllllIlIlI[47];
            if (llIlIlIIIIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllllIlIlI[1]];
                iArr12[lllllIlIlI[0]] = lllllIlIlI[47];
                Inventory.getFirst(iArr12).interact(lllllIlIIl[lllllIlIlI[48]]);
            }
        }
        int[] iArr13 = new int[lllllIlIlI[1]];
        iArr13[lllllIlIlI[0]] = lllllIlIlI[49];
        if (llIlIlIIIIllI(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllllIlIlI[1]];
            iArr14[lllllIlIlI[0]] = lllllIlIlI[49];
            Inventory.getFirst(iArr14).interact(lllllIlIIl[lllllIlIlI[50]]);
        }
        int[] iArr15 = new int[lllllIlIlI[1]];
        iArr15[lllllIlIlI[0]] = lllllIlIlI[51];
        if (llIlIlIIIIllI(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lllllIlIlI[1]];
            iArr16[lllllIlIlI[0]] = lllllIlIlI[51];
            Inventory.getFirst(iArr16).interact(lllllIlIIl[lllllIlIlI[52]]);
        }
    }

    private static int llIlIlIIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x057d, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05c9, code lost:
        return e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.V.lllllIlIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c2, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0219, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0270, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02aa, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e4, code lost:
        return e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.V.lllllIlIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0339, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0390, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03e7, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x043e, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0495, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04ec, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0543, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (llIlIlIIIIllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean dB() {
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[39])) {
            int[] iArr = new int[lllllIlIlI[1]];
            iArr[lllllIlIlI[0]] = lllllIlIlI[18];
            if (llIlIlIIIlIII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIlIlI[1]];
                iArr2[lllllIlIlI[0]] = lllllIlIlI[18];
                if (llIlIlIIIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllllIlIlI[1]];
                    iArr3[lllllIlIlI[0]] = lllllIlIlI[18];
                }
            }
            int[] iArr4 = new int[lllllIlIlI[1]];
            iArr4[lllllIlIlI[0]] = lllllIlIlI[44];
            if (llIlIlIIIlIII(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllllIlIlI[1]];
                iArr5[lllllIlIlI[0]] = lllllIlIlI[44];
                if (llIlIlIIIlIII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllllIlIlI[1]];
                    iArr6[lllllIlIlI[0]] = lllllIlIlI[44];
                }
            }
            int[] iArr7 = new int[lllllIlIlI[1]];
            iArr7[lllllIlIlI[0]] = lllllIlIlI[45];
            if (llIlIlIIIlIII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllllIlIlI[1]];
                iArr8[lllllIlIlI[0]] = lllllIlIlI[45];
                if (llIlIlIIIlIII(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllllIlIlI[1]];
                    iArr9[lllllIlIlI[0]] = lllllIlIlI[45];
                }
            }
            int[] iArr10 = new int[lllllIlIlI[1]];
            iArr10[lllllIlIlI[0]] = lllllIlIlI[42];
            if (llIlIlIIIlIII(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllllIlIlI[1]];
                iArr11[lllllIlIlI[0]] = lllllIlIlI[42];
                if (llIlIlIIIlIII(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllllIlIlI[1]];
                    iArr12[lllllIlIlI[0]] = lllllIlIlI[42];
                }
            }
            int[] iArr13 = new int[lllllIlIlI[1]];
            iArr13[lllllIlIlI[0]] = lllllIlIlI[47];
            if (llIlIlIIIlIII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllllIlIlI[1]];
                iArr14[lllllIlIlI[0]] = lllllIlIlI[47];
                if (llIlIlIIIlIII(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllllIlIlI[1]];
                    iArr15[lllllIlIlI[0]] = lllllIlIlI[47];
                }
            }
            int[] iArr16 = new int[lllllIlIlI[1]];
            iArr16[lllllIlIlI[0]] = lllllIlIlI[49];
            if (llIlIlIIIlIII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllllIlIlI[1]];
                iArr17[lllllIlIlI[0]] = lllllIlIlI[49];
                if (llIlIlIIIlIII(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lllllIlIlI[1]];
                    iArr18[lllllIlIlI[0]] = lllllIlIlI[49];
                }
            }
            int[] iArr19 = new int[lllllIlIlI[1]];
            iArr19[lllllIlIlI[0]] = lllllIlIlI[51];
            if (llIlIlIIIlIII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lllllIlIlI[1]];
                iArr20[lllllIlIlI[0]] = lllllIlIlI[51];
                if (llIlIlIIIlIII(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lllllIlIlI[1]];
                    iArr21[lllllIlIlI[0]] = lllllIlIlI[51];
                }
            }
            int[] iArr22 = new int[lllllIlIlI[1]];
            iArr22[lllllIlIlI[0]] = lllllIlIlI[12];
            if (llIlIlIIIlIII(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lllllIlIlI[1]];
                iArr23[lllllIlIlI[0]] = lllllIlIlI[12];
            }
            ?? r0 = lllllIlIlI[1];
            "".length();
            return 0 != 0 ? ((181 ^ 187) ^ (21 ^ 46)) & (((212 ^ 178) ^ (100 ^ 55)) ^ (-" ".length())) : r0;
        }
        int[] iArr24 = new int[lllllIlIlI[1]];
        iArr24[lllllIlIlI[0]] = lllllIlIlI[17];
        if (llIlIlIIIlIII(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllllIlIlI[1]];
            iArr25[lllllIlIlI[0]] = lllllIlIlI[17];
            if (llIlIlIIIlIII(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lllllIlIlI[1]];
                iArr26[lllllIlIlI[0]] = lllllIlIlI[17];
            }
        }
        int[] iArr27 = new int[lllllIlIlI[1]];
        iArr27[lllllIlIlI[0]] = lllllIlIlI[44];
        if (llIlIlIIIlIII(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lllllIlIlI[1]];
            iArr28[lllllIlIlI[0]] = lllllIlIlI[44];
            if (llIlIlIIIlIII(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lllllIlIlI[1]];
                iArr29[lllllIlIlI[0]] = lllllIlIlI[44];
            }
        }
        int[] iArr30 = new int[lllllIlIlI[1]];
        iArr30[lllllIlIlI[0]] = lllllIlIlI[45];
        if (llIlIlIIIlIII(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lllllIlIlI[1]];
            iArr31[lllllIlIlI[0]] = lllllIlIlI[45];
            if (llIlIlIIIlIII(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lllllIlIlI[1]];
                iArr32[lllllIlIlI[0]] = lllllIlIlI[45];
            }
        }
        int[] iArr33 = new int[lllllIlIlI[1]];
        iArr33[lllllIlIlI[0]] = lllllIlIlI[42];
        if (llIlIlIIIlIII(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lllllIlIlI[1]];
            iArr34[lllllIlIlI[0]] = lllllIlIlI[42];
            if (llIlIlIIIlIII(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lllllIlIlI[1]];
                iArr35[lllllIlIlI[0]] = lllllIlIlI[42];
            }
        }
        int[] iArr36 = new int[lllllIlIlI[1]];
        iArr36[lllllIlIlI[0]] = lllllIlIlI[47];
        if (llIlIlIIIlIII(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lllllIlIlI[1]];
            iArr37[lllllIlIlI[0]] = lllllIlIlI[47];
            if (llIlIlIIIlIII(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lllllIlIlI[1]];
                iArr38[lllllIlIlI[0]] = lllllIlIlI[47];
            }
        }
        int[] iArr39 = new int[lllllIlIlI[1]];
        iArr39[lllllIlIlI[0]] = lllllIlIlI[49];
        if (llIlIlIIIlIII(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lllllIlIlI[1]];
            iArr40[lllllIlIlI[0]] = lllllIlIlI[49];
            if (llIlIlIIIlIII(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lllllIlIlI[1]];
                iArr41[lllllIlIlI[0]] = lllllIlIlI[49];
            }
        }
        int[] iArr42 = new int[lllllIlIlI[1]];
        iArr42[lllllIlIlI[0]] = lllllIlIlI[51];
        if (llIlIlIIIlIII(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lllllIlIlI[1]];
            iArr43[lllllIlIlI[0]] = lllllIlIlI[51];
            if (llIlIlIIIlIII(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lllllIlIlI[1]];
                iArr44[lllllIlIlI[0]] = lllllIlIlI[51];
            }
        }
        int[] iArr45 = new int[lllllIlIlI[1]];
        iArr45[lllllIlIlI[0]] = lllllIlIlI[12];
        if (llIlIlIIIlIII(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lllllIlIlI[1]];
            iArr46[lllllIlIlI[0]] = lllllIlIlI[12];
        }
        ?? r02 = lllllIlIlI[1];
        "".length();
        return "   ".length() == 0 ? ((166 ^ 176) ^ (219 ^ 142)) & (((((7 + 30) - (-5)) + 171) ^ (((145 + 14) - 55) + 46)) ^ (-" ".length())) : r02;
    }

    private static void llIlIlIIIIlII() {
        lllllIlIlI = new int[74];
        lllllIlIlI[0] = ((((74 + 65) - 111) + 214) ^ (((45 + 118) - 54) + 67)) & (((174 ^ 133) ^ (7 ^ 110)) ^ (-" ".length()));
        lllllIlIlI[1] = " ".length();
        lllllIlIlI[2] = (((75 + 81) - 120) + 105) ^ (((113 + 78) - 137) + 93);
        lllllIlIlI[3] = 84 ^ 102;
        lllllIlIlI[4] = "  ".length();
        lllllIlIlI[5] = "   ".length();
        lllllIlIlI[6] = (-((-4114) & 28727)) & (-19) & 29631;
        lllllIlIlI[7] = (5 ^ 72) ^ (230 ^ 175);
        lllllIlIlI[8] = (-((-4609) & 30225)) & (-6157) & 32767;
        lllllIlIlI[9] = (-((-22227) & 32471)) & (-1026) & 12269;
        lllllIlIlI[10] = (-((-3413) & 28029)) & (-1) & 32623;
        lllllIlIlI[11] = 173 ^ 168;
        lllllIlIlI[12] = (-((-469) & 31701)) & (-133) & 31743;
        lllllIlIlI[13] = (((113 + 60) - 47) + 104) ^ (((39 + 52) - (-11)) + 28);
        lllllIlIlI[14] = (((65 + 105) - 57) + 69) ^ (((137 + 134) - 224) + 138);
        lllllIlIlI[15] = (173 ^ 140) ^ (9 ^ 46);
        lllllIlIlI[16] = (((74 + 87) - 133) + 99) ^ (235 ^ 147);
        lllllIlIlI[17] = (-205) & 1535;
        lllllIlIlI[18] = (-((-3409) & 32083)) & (-2113) & 32119;
        lllllIlIlI[19] = 123 ^ 115;
        lllllIlIlI[20] = (146 ^ 142) ^ (68 ^ 76);
        lllllIlIlI[21] = (40 ^ 50) ^ (162 ^ 177);
        lllllIlIlI[22] = 153 ^ 147;
        lllllIlIlI[23] = 143 ^ 132;
        lllllIlIlI[24] = (((86 + 126) - 49) + 0) ^ (((126 + 129) - 175) + 95);
        lllllIlIlI[25] = (95 ^ 6) ^ (20 ^ 64);
        lllllIlIlI[26] = (((118 + 15) - 96) + 107) ^ (((45 + 114) - 71) + 70);
        lllllIlIlI[27] = (91 ^ 68) ^ (126 ^ 113);
        lllllIlIlI[28] = 122 ^ 107;
        lllllIlIlI[29] = -" ".length();
        lllllIlIlI[30] = (-((-5189) & 30565)) & (-194) & 38888447;
        lllllIlIlI[31] = (((30 + 131) - 38) + 28) ^ (((125 + 36) - 112) + 84);
        lllllIlIlI[32] = (45 ^ 91) ^ (115 ^ 22);
        lllllIlIlI[33] = 135 ^ 146;
        lllllIlIlI[34] = 4 ^ 18;
        lllllIlIlI[35] = 134 ^ 145;
        lllllIlIlI[36] = (37 ^ 55) ^ (190 ^ 180);
        lllllIlIlI[37] = 167 ^ 190;
        lllllIlIlI[38] = (((86 + 136) - 81) + 15) ^ (((121 + 17) - 40) + 36);
        lllllIlIlI[39] = (((49 + 17) - (-2)) + 64) ^ (((144 + 154) - 222) + 96);
        lllllIlIlI[40] = 72 ^ 83;
        lllllIlIlI[41] = (((31 + 134) - 18) + 8) ^ (((82 + 76) - 78) + 55);
        lllllIlIlI[42] = (-4613) & 5773;
        lllllIlIlI[43] = ((80 ^ 96) & ((139 ^ 187) ^ (-1))) ^ (25 ^ 4);
        lllllIlIlI[44] = (-((-1893) & 6117)) & (-10761) & 16107;
        lllllIlIlI[45] = (-((-11) & 6351)) & (-8449) & 15861;
        lllllIlIlI[46] = 5 ^ 26;
        lllllIlIlI[47] = (-16641) & 17839;
        lllllIlIlI[48] = (((40 + 103) - (-3)) + 7) ^ (((85 + 30) - 28) + 98);
        lllllIlIlI[49] = (-((-516) & 6727)) & (-24597) & 32511;
        lllllIlIlI[50] = (((136 + 82) - 79) + 86) ^ (((181 + 144) - 199) + 66);
        lllllIlIlI[51] = (-1161) & 12286;
        lllllIlIlI[52] = (((116 + 64) - 35) + 15) ^ (((65 + 55) - 100) + 110);
        lllllIlIlI[53] = (-((-133) & 27839)) & (-2) & 28607;
        lllllIlIlI[54] = (-"   ".length()) & (-8342) & 16351;
        lllllIlIlI[55] = (-((-26658) & 27493)) & (-28673) & 64507;
        lllllIlIlI[56] = (-7767) & 32766;
        lllllIlIlI[57] = (-((-3519) & 8127)) & (-11) & 5118;
        lllllIlIlI[58] = (-1377) & 16376;
        lllllIlIlI[59] = 27 ^ 56;
        lllllIlIlI[60] = (((95 + 72) - 156) + 121) ^ (((110 + 152) - 193) + 91);
        lllllIlIlI[61] = (-4417) & 7641;
        lllllIlIlI[62] = (-20742) & 24031;
        lllllIlIlI[63] = (-25425) & 28668;
        lllllIlIlI[64] = (-4645) & 7924;
        lllllIlIlI[65] = (-4105) & 7289;
        lllllIlIlI[66] = (-8609) & 11775;
        lllllIlIlI[67] = 135 ^ 183;
        lllllIlIlI[68] = (-21347) & 24559;
        lllllIlIlI[69] = (-((-3081) & 24473)) & (-8193) & 32765;
        lllllIlIlI[70] = (-842) & 4095;
        lllllIlIlI[71] = (-((-20917) & 29685)) & (-20513) & 32511;
        lllllIlIlI[72] = (-((-1025) & 13595)) & (-16390) & 32255;
        lllllIlIlI[73] = 83 ^ 118;
    }

    private static boolean llIlIlIIIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlIlIIIlIIl(int i, int i2) {
        return i >= i2;
    }

    public static void dC() {
        if (llIlIlIIIIlll(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[22]) && llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[22]) && llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[22]) && llIlIlIIIIlll(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIlIlIIIIlll(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[20]) && llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[22]) && llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[20]) && llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[20]) && llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[20]) && llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[20]) && llIlIlIIIIlll(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[20])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIlIlIIIIlll(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[2]) && llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[20]) && llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[20])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[2]) && llIlIlIIIIlll(Skills.getLevel(Skill.ATTACK), lllllIlIlI[2]) && llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[20])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[2]) && llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[2]) && llIlIlIIIIlll(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIlIlIIIIlll(Skills.getLevel(Skill.STRENGTH), lllllIlIlI[39]) && llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[2]) && llIlIlIIIlIIl(Skills.getLevel(Skill.DEFENCE), lllllIlIlI[2]) && llIlIlIIIllll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
    }

    public static void ae() {
        int[] iArr = new int[lllllIlIlI[1]];
        iArr[lllllIlIlI[0]] = lllllIlIlI[10];
        if (llIlIlIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[10], lllllIlIlI[39], lllllIlIlI[53]));
            "".length();
        }
        int[] iArr2 = new int[lllllIlIlI[1]];
        iArr2[lllllIlIlI[0]] = lllllIlIlI[54];
        if (llIlIlIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[54], lllllIlIlI[11], lllllIlIlI[53]));
            "".length();
        }
        int[] iArr3 = new int[lllllIlIlI[1]];
        iArr3[lllllIlIlI[0]] = lllllIlIlI[51];
        if (llIlIlIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[51], lllllIlIlI[1], lllllIlIlI[55]));
            "".length();
        }
        int[] iArr4 = new int[lllllIlIlI[1]];
        iArr4[lllllIlIlI[0]] = lllllIlIlI[49];
        if (llIlIlIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[49], lllllIlIlI[1], lllllIlIlI[56]));
            "".length();
        }
        int[] iArr5 = new int[lllllIlIlI[1]];
        iArr5[lllllIlIlI[0]] = lllllIlIlI[12];
        if (llIlIlIIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[12], lllllIlIlI[13], lllllIlIlI[57]));
            "".length();
        }
        int[] iArr6 = new int[lllllIlIlI[1]];
        iArr6[lllllIlIlI[0]] = lllllIlIlI[42];
        if (llIlIlIIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[42], lllllIlIlI[1], lllllIlIlI[58]));
            "".length();
        }
        int[] iArr7 = new int[lllllIlIlI[1]];
        iArr7[lllllIlIlI[0]] = lllllIlIlI[45];
        if (llIlIlIIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[45], lllllIlIlI[1], lllllIlIlI[58]));
            "".length();
        }
        int[] iArr8 = new int[lllllIlIlI[1]];
        iArr8[lllllIlIlI[0]] = lllllIlIlI[47];
        if (llIlIlIIIlIII(Bank.contains(iArr8) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[47], lllllIlIlI[1], lllllIlIlI[58]));
            "".length();
        }
        int[] iArr9 = new int[lllllIlIlI[1]];
        iArr9[lllllIlIlI[0]] = lllllIlIlI[44];
        if (llIlIlIIIlIII(Bank.contains(iArr9) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[44], lllllIlIlI[1], lllllIlIlI[58]));
            "".length();
        }
        if (llIlIlIIIlIIl(Skills.getLevel(Skill.ATTACK), lllllIlIlI[39])) {
            int[] iArr10 = new int[lllllIlIlI[1]];
            iArr10[lllllIlIlI[0]] = lllllIlIlI[18];
            if (llIlIlIIIlIII(Bank.contains(iArr10) ? 1 : 0)) {
                bu.add(new C0003d(lllllIlIlI[18], lllllIlIlI[1], lllllIlIlI[56]));
                "".length();
            }
        }
        int[] iArr11 = new int[lllllIlIlI[1]];
        iArr11[lllllIlIlI[0]] = lllllIlIlI[17];
        if (llIlIlIIIlIII(Bank.contains(iArr11) ? 1 : 0)) {
            bu.add(new C0003d(lllllIlIlI[17], lllllIlIlI[1], lllllIlIlI[58]));
            "".length();
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllIlIIl[lllllIlIlI[59]];
    }

    private static boolean llIlIlIIIIllI(int i) {
        return i != 0;
    }

    private static boolean llIlIlIIIlIlI(Object obj) {
        return obj != null;
    }
}

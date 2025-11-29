package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/p.class */
public class C0029p implements InterfaceC0003ac {
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldPoint ck;
    private static /* synthetic */ String[] lllIlIIIll;
    public static /* synthetic */ WorldArea cj;
    private static /* synthetic */ int[] lllIlIIlIl;
    public static /* synthetic */ boolean cJ;
    public static /* synthetic */ WorldArea cM;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ int[] cK;
    public static /* synthetic */ WorldPoint cP;
    public static /* synthetic */ WorldPoint cO;

    private static boolean llIIIlIIIllIl(int i) {
        return i < 0;
    }

    private static boolean llIIIlIIlIIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIlIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIIIllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIlIIlIIII(Object obj) {
        return obj == null;
    }

    static {
        llIIIlIIIIlIl();
        llIIIlIIIIlII();
        bv = new ArrayList();
        int[] iArr = new int[lllIlIIlIl[9]];
        iArr[lllIlIIlIl[0]] = lllIlIIlIl[14];
        iArr[lllIlIIlIl[1]] = lllIlIIlIl[15];
        iArr[lllIlIIlIl[5]] = lllIlIIlIl[17];
        iArr[lllIlIIlIl[6]] = lllIlIIlIl[16];
        iArr[lllIlIIlIl[8]] = lllIlIIlIl[18];
        cK = iArr;
        cL = new WorldArea(lllIlIIlIl[74], lllIlIIlIl[75], lllIlIIlIl[40], lllIlIIlIl[40], lllIlIIlIl[0]);
        cM = new WorldArea(lllIlIIlIl[76], lllIlIIlIl[77], lllIlIIlIl[48], lllIlIIlIl[44], lllIlIIlIl[0]);
        cN = new WorldArea(lllIlIIlIl[78], lllIlIIlIl[79], lllIlIIlIl[80], lllIlIIlIl[21], lllIlIIlIl[0]);
        cO = new WorldPoint(lllIlIIlIl[81], lllIlIIlIl[82], lllIlIIlIl[0]);
        ck = new WorldPoint(lllIlIIlIl[83], lllIlIIlIl[75], lllIlIIlIl[0]);
        cP = new WorldPoint(lllIlIIlIl[84], lllIlIIlIl[85], lllIlIIlIl[0]);
        cj = new WorldArea(lllIlIIlIl[86], lllIlIIlIl[87], lllIlIIlIl[67], lllIlIIlIl[53], lllIlIIlIl[0]);
        cQ = new WorldPoint(lllIlIIlIl[88], lllIlIIlIl[43], lllIlIIlIl[0]);
    }

    public static void aL() {
        C0018e.F();
        if (llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[9])) {
            int[] iArr = new int[lllIlIIlIl[1]];
            iArr[lllIlIIlIl[0]] = lllIlIIlIl[14];
            if (llIIIlIIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIlIIlIl[1]];
                iArr2[lllIlIIlIl[0]] = lllIlIIlIl[14];
                Inventory.getFirst(iArr2).interact(lllIlIIIll[lllIlIIlIl[47]]);
            }
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[9]) && llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[20])) {
            int[] iArr3 = new int[lllIlIIlIl[1]];
            iArr3[lllIlIIlIl[0]] = lllIlIIlIl[15];
            if (llIIIlIIIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIlIIlIl[1]];
                iArr4[lllIlIIlIl[0]] = lllIlIIlIl[15];
                Inventory.getFirst(iArr4).interact(lllIlIIIll[lllIlIIlIl[20]]);
            }
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[20]) && llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[21])) {
            int[] iArr5 = new int[lllIlIIlIl[1]];
            iArr5[lllIlIIlIl[0]] = lllIlIIlIl[16];
            if (llIIIlIIIIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIlIIlIl[1]];
                iArr6[lllIlIIlIl[0]] = lllIlIIlIl[16];
                Inventory.getFirst(iArr6).interact(lllIlIIIll[lllIlIIlIl[48]]);
            }
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[21]) && llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[49])) {
            int[] iArr7 = new int[lllIlIIlIl[1]];
            iArr7[lllIlIIlIl[0]] = lllIlIIlIl[17];
            if (llIIIlIIIIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIlIIlIl[1]];
                iArr8[lllIlIIlIl[0]] = lllIlIIlIl[17];
                Inventory.getFirst(iArr8).interact(lllIlIIIll[lllIlIIlIl[50]]);
            }
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[49])) {
            int[] iArr9 = new int[lllIlIIlIl[1]];
            iArr9[lllIlIIlIl[0]] = lllIlIIlIl[18];
            if (llIIIlIIIIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIlIIlIl[1]];
                iArr10[lllIlIIlIl[0]] = lllIlIIlIl[18];
                Inventory.getFirst(iArr10).interact(lllIlIIIll[lllIlIIlIl[51]]);
            }
        }
    }

    private static void aj() {
        WorldArea worldArea = new WorldArea(lllIlIIlIl[22], lllIlIIlIl[23], lllIlIIlIl[24], lllIlIIlIl[25], lllIlIIlIl[0]);
        WorldPoint worldPoint = new WorldPoint(lllIlIIlIl[26], lllIlIIlIl[27], lllIlIIlIl[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllIlIIlIl[28], lllIlIIlIl[29], lllIlIIlIl[0]);
        C0018e.F();
        if (llIIIlIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lllIlIIlIl[30], lllIlIIlIl[31], lllIlIIlIl[0]);
            WorldPoint worldPoint4 = new WorldPoint(lllIlIIlIl[30], lllIlIIlIl[32], lllIlIIlIl[0]);
            if (!llIIIlIIIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || llIIIlIIIIlll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lllIlIIlIl[33], lllIlIIlIl[34], lllIlIIlIl[0]);
                C0018e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lllIlIIlIl[35]);
                "".length();
            }
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[36]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllIlIIlIl[1]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (llIIIlIIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIIlIlI(all.size(), lllIlIIlIl[19])) {
            if (llIIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIlIIlIl[5])) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[37]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lllIlIIlIl[1]);
                "".length();
            }
            if (llIIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIlIIlIl[5])) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[38]];
                D();
            }
        }
        if (llIIIlIIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIlIIIlIII(all.size(), lllIlIIlIl[19])) {
            if (llIIIlIIIlIll(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[39]];
            }
            if (llIIIlIIlIIII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llIIIlIIIIlll(npc.getName().contains(lllIlIIIll[lllIlIIlIl[73]]) ? 1 : 0) && llIIIlIIlIIII(npc.getInteracting()) && llIIIlIIIlIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIlIIlIl[1];
                        "".length();
                        return (139 ^ 143) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIlIIlIl[0];
                });
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (llIIIlIIIIlll(npc2.getName().contains(lllIlIIIll[lllIlIIlIl[72]]) ? 1 : 0) && llIIIlIIlIlII(npc2.getInteracting(), Players.getLocal()) && llIIIlIIIlIIl(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lllIlIIlIl[1];
                        "".length();
                        return "  ".length() < 0 ? ((((142 + 147) - 274) + 144) ^ (((126 + 74) - 170) + 133)) & (((55 ^ 35) ^ (175 ^ 135)) ^ (-" ".length())) : r0;
                    }
                    return lllIlIIlIl[0];
                });
                if (llIIIlIIIlIll(nearest) && llIIIlIIlIIII(nearest2)) {
                    AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[40]];
                    nearest.interact(lllIlIIIll[lllIlIIlIl[2]]);
                    Time.sleepTicks(lllIlIIlIl[5]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIIIlIIIlllI(int i, int i2) {
        return i > i2;
    }

    private static void am() {
        if (llIIIlIIIllIl(llIIIlIIlIIIl(C0018e.w(), 30.0d))) {
            int[] iArr = new int[lllIlIIlIl[1]];
            iArr[lllIlIIlIl[0]] = lllIlIIlIl[12];
            if (llIIIlIIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIlIIlIl[1]];
                iArr2[lllIlIIlIl[0]] = lllIlIIlIl[12];
                Inventory.getFirst(iArr2).interact(lllIlIIIll[lllIlIIlIl[4]]);
                Time.sleepTicks(lllIlIIlIl[1]);
                "".length();
            }
        }
        C0018e.F();
        if (llIIIlIIlIIII(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (!llIIIlIIIlIIl(npc.getName().contains(lllIlIIIll[lllIlIIlIl[25]]) ? 1 : 0) || llIIIlIIIIlll(npc.getName().contains(lllIlIIIll[lllIlIIlIl[49]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIlIIlIl[1]];
                    strArr[lllIlIIlIl[0]] = lllIlIIIll[lllIlIIlIl[71]];
                    if (llIIIlIIIIlll(npc.hasAction(strArr) ? 1 : 0) && llIIIlIIlIIII(npc.getInteracting()) && llIIIlIIIlIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIlIIlIl[1];
                        "".length();
                        return (-" ".length()) >= (((((48 + 113) - 33) + 78) ^ (((73 + 1) - 10) + 66)) & (((((140 + 79) - 215) + 236) ^ (((148 + 55) - 202) + 187)) ^ (-" ".length()))) ? ((((170 + 116) - 212) + 113) ^ (((102 + 79) - 180) + 129)) & (((((224 + 63) - 193) + 155) ^ (((173 + 130) - 226) + 115)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIlIIlIl[0];
            });
            String[] strArr = new String[lllIlIIlIl[1]];
            strArr[lllIlIIlIl[0]] = lllIlIIIll[lllIlIIlIl[44]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIIIlIIlIlII(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lllIlIIlIl[1];
                    "".length();
                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIlIIlIl[0];
            }).collect(Collectors.toList());
            if (llIIIlIIIlIll(nearest) && llIIIlIIIIlll(list.isEmpty() ? 1 : 0) && llIIIlIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lllIlIIIll[lllIlIIlIl[45]]);
                Time.sleepTicks(lllIlIIlIl[6]);
                "".length();
            }
            if (llIIIlIIIlIIl(list.isEmpty() ? 1 : 0) && llIIIlIIlIIII(Players.getLocal().getInteracting())) {
                ((NPC) list.get(lllIlIIlIl[0])).interact(lllIlIIIll[lllIlIIlIl[46]]);
                Time.sleepTicks(lllIlIIlIl[6]);
                "".length();
            }
        }
    }

    public static void Q() {
        int[] iArr = new int[lllIlIIlIl[1]];
        iArr[lllIlIIlIl[0]] = lllIlIIlIl[12];
        if (llIIIlIIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlIl[12], lllIlIIlIl[13], lllIlIIlIl[54]));
            "".length();
        }
        int[] iArr2 = new int[lllIlIIlIl[1]];
        iArr2[lllIlIIlIl[0]] = lllIlIIlIl[18];
        if (llIIIlIIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlIl[18], lllIlIIlIl[1], lllIlIIlIl[55]));
            "".length();
        }
        int[] iArr3 = new int[lllIlIIlIl[1]];
        iArr3[lllIlIIlIl[0]] = lllIlIIlIl[14];
        if (llIIIlIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlIl[14], lllIlIIlIl[1], lllIlIIlIl[7]));
            "".length();
        }
        int[] iArr4 = new int[lllIlIIlIl[1]];
        iArr4[lllIlIIlIl[0]] = lllIlIIlIl[15];
        if (llIIIlIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlIl[15], lllIlIIlIl[1], lllIlIIlIl[7]));
            "".length();
        }
        int[] iArr5 = new int[lllIlIIlIl[1]];
        iArr5[lllIlIIlIl[0]] = lllIlIIlIl[16];
        if (llIIIlIIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlIl[16], lllIlIIlIl[1], lllIlIIlIl[56]));
            "".length();
        }
        int[] iArr6 = new int[lllIlIIlIl[1]];
        iArr6[lllIlIIlIl[0]] = lllIlIIlIl[17];
        if (llIIIlIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lllIlIIlIl[17], lllIlIIlIl[1], lllIlIIlIl[56]));
            "".length();
        }
    }

    private static String llIIIlIIIIIII(String lllllllllllllllllIlllIIIIIlIlllI, String lllllllllllllllllIlllIIIIIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIlIIlIl[37]), "DES");
            Cipher lllllllllllllllllIlllIIIIIllIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlllIIIIIllIIII.init(lllIlIIlIl[5], secretKeySpec);
            return new String(lllllllllllllllllIlllIIIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIIIIlIllll) {
            lllllllllllllllllIlllIIIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static int llIIIlIIIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIlIIlIl[0];
    }

    public static void al() {
        if (llIIIlIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIlIIIlIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[52]];
            Movement.walkTo(cQ);
            "".length();
            Time.sleepTicks(lllIlIIlIl[1]);
            "".length();
        }
        if (llIIIlIIIIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[53]];
            am();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011f, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aM() {
        int[] iArr = new int[lllIlIIlIl[1]];
        iArr[lllIlIIlIl[0]] = lllIlIIlIl[14];
        if (llIIIlIIIlIIl(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIlIIlIl[1]];
            iArr2[lllIlIIlIl[0]] = lllIlIIlIl[14];
        }
        int[] iArr3 = new int[lllIlIIlIl[1]];
        iArr3[lllIlIIlIl[0]] = lllIlIIlIl[15];
        if (llIIIlIIIlIIl(Equipment.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lllIlIIlIl[1]];
            iArr4[lllIlIIlIl[0]] = lllIlIIlIl[15];
        }
        int[] iArr5 = new int[lllIlIIlIl[1]];
        iArr5[lllIlIIlIl[0]] = lllIlIIlIl[16];
        if (llIIIlIIIlIIl(Equipment.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lllIlIIlIl[1]];
            iArr6[lllIlIIlIl[0]] = lllIlIIlIl[16];
        }
        int[] iArr7 = new int[lllIlIIlIl[1]];
        iArr7[lllIlIIlIl[0]] = lllIlIIlIl[17];
        if (llIIIlIIIlIIl(Equipment.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lllIlIIlIl[1]];
            iArr8[lllIlIIlIl[0]] = lllIlIIlIl[17];
        }
        int[] iArr9 = new int[lllIlIIlIl[1]];
        iArr9[lllIlIIlIl[0]] = lllIlIIlIl[18];
        if (llIIIlIIIlIIl(Equipment.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lllIlIIlIl[1]];
            iArr10[lllIlIIlIl[0]] = lllIlIIlIl[18];
        }
        int[] iArr11 = new int[lllIlIIlIl[1]];
        iArr11[lllIlIIlIl[0]] = lllIlIIlIl[12];
        if (llIIIlIIIIlll(Inventory.contains(iArr11) ? 1 : 0)) {
            ?? r0 = lllIlIIlIl[1];
            "".length();
            return "   ".length() <= (((31 ^ 39) & ((135 ^ 191) ^ (-1))) & (((39 ^ 119) & ((97 ^ 49) ^ (-1))) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIIlIl[0];
    }

    private static boolean llIIIlIIlIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIlIIIlIIl(int i) {
        return i == 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aJ();
            "".length();
            if ("   ".length() < " ".length()) {
                return (103 ^ 77) & ((126 ^ 84) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lllIlIIlIl[0];
    }

    private static boolean llIIIlIIIlIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[2]) && llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[3]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[4])) {
            ?? r0 = lllIlIIlIl[1];
            "".length();
            return (160 ^ 165) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlIIlIl[0];
    }

    public static void D() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIIIlIIIlIIl(world.isMembers() ? 1 : 0) && llIIIlIIIllll(world.getPlayerCount(), lllIlIIlIl[58]) && llIIIlIIlIIll(world.getId(), Worlds.getCurrentId()) && llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[59]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[60]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[61]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[21]]) ? 1 : 0) && llIIIlIIlIIll(world.getId(), lllIlIIlIl[62]) && llIIIlIIlIIll(world.getId(), lllIlIIlIl[63]) && llIIIlIIlIIll(world.getId(), lllIlIIlIl[63]) && llIIIlIIIlIIl(world.getActivity().contains(lllIlIIIll[lllIlIIlIl[64]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().contains(lllIlIIIll[lllIlIIlIl[65]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().contains(lllIlIIIll[lllIlIIlIl[66]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[67]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[68]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[69]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[70]]) ? 1 : 0) && llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[24]]) ? 1 : 0) && llIIIlIIIlllI(world.getPlayerCount(), lllIlIIlIl[21])) {
                ?? r0 = lllIlIIlIl[1];
                "".length();
                return "   ".length() > (70 ^ 66) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIlIIlIl[0];
        }));
    }

    private static boolean llIIIlIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llIIIlIIIIIIl(String lllllllllllllllllIlllIIIIIlIIIIl, String lllllllllllllllllIlllIIIIIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIlIl[5], lllllllllllllllllIlllIIIIIlIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIIIIlIIIlI) {
            lllllllllllllllllIlllIIIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    public static void aO() {
        if (llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[8]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[8]) && llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[19]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[8]) && llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[19]) && llIIIlIIIlIII(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[36]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[37]) && llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[19]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[36]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[37]) && llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[37]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[36]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[37]) && llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[37]) && llIIIlIIIlIII(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[40]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[2]) && llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[37]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[40]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[2]) && llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[2]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[40]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[2]) && llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[2]) && llIIIlIIIlIII(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[4]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[3]) && llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[2]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[4]) && llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02bc, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v177, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (llIIIlIIIIlll(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[0]];
            C0015b.a(bv);
            if (llIIIlIIIlIII(bv.size(), lllIlIIlIl[1])) {
                System.out.println(lllIlIIIll[lllIlIIlIl[1]]);
                bt = lllIlIIlIl[0];
            }
        }
        if (llIIIlIIIlIIl(bt ? 1 : 0)) {
            if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[2]) && llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[3]) && !llIIIlIIIlIII(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[4])) {
                return;
            }
            if (llIIIlIIIlIIl(aM() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIlIIIlIll(nearest) && llIIIlIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[5]];
                    C0000a.a(nearest);
                }
                if (llIIIlIIIlIll(nearest) && llIIIlIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[6]];
                    if (llIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlIIlIl[7]);
                        "".length();
                    }
                    if (llIIIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIlIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlIIlIl[1]);
                            "".length();
                        }
                        if (llIIIlIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlIIlIl[5]);
                            "".length();
                        }
                        if (llIIIlIIIlIIl(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(lllIlIIIll[lllIlIIlIl[8]]);
                            bt = lllIlIIlIl[1];
                            return;
                        }
                        if (llIIIlIIIlIIl(cJ ? 1 : 0)) {
                            C0021h.X();
                            cJ = lllIlIIlIl[1];
                        }
                        while (llIIIlIIIlIIl(C0021h.bu ? 1 : 0) && llIIIlIIIlIIl(AccBuilderSotf.d ? 1 : 0)) {
                            C0021h.d(lllIlIIIll[lllIlIIlIl[9]]);
                            Time.sleepTicks(lllIlIIlIl[1]);
                            "".length();
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                        C0000a.a(cK, lllIlIIlIl[1]);
                        C0000a.a(lllIlIIlIl[10], lllIlIIlIl[11]);
                        C0000a.b(C0019f.ba, lllIlIIlIl[1]);
                        if (llIIIlIIIIlll(Inventory.contains(cK) ? 1 : 0)) {
                            C0000a.a(lllIlIIlIl[12], lllIlIIlIl[13]);
                        }
                    }
                }
            }
            if (llIIIlIIIIlll(aM() ? 1 : 0)) {
                aL();
                cJ = lllIlIIlIl[0];
                if (llIIIlIIIlIlI(Movement.getRunEnergy(), lllIlIIlIl[4]) && llIIIlIIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                int[] iArr = new int[lllIlIIlIl[1]];
                iArr[lllIlIIlIl[0]] = lllIlIIlIl[14];
                if (llIIIlIIIlIIl(Equipment.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlIIlIl[1]];
                    iArr2[lllIlIIlIl[0]] = lllIlIIlIl[15];
                    if (llIIIlIIIlIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIlIIlIl[1]];
                        iArr3[lllIlIIlIl[0]] = lllIlIIlIl[16];
                        if (llIIIlIIIlIIl(Equipment.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIlIIlIl[1]];
                            iArr4[lllIlIIlIl[0]] = lllIlIIlIl[17];
                            if (llIIIlIIIlIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lllIlIIlIl[1]];
                                iArr5[lllIlIIlIl[0]] = lllIlIIlIl[18];
                            }
                        }
                    }
                }
                aO();
                if (llIIIlIIIllIl(llIIIlIIIIllI(C0018e.w(), 45.0d))) {
                    int[] iArr6 = new int[lllIlIIlIl[1]];
                    iArr6[lllIlIIlIl[0]] = lllIlIIlIl[12];
                    if (llIIIlIIIIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIlIIlIl[1]];
                        iArr7[lllIlIIlIl[0]] = lllIlIIlIl[12];
                        Inventory.getFirst(iArr7).interact(lllIlIIIll[lllIlIIlIl[19]]);
                        Time.sleepTicks(lllIlIIlIl[1]);
                        "".length();
                    }
                }
                if (llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[20]) && llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[20])) {
                    aK();
                }
                if ((llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[21]) && !llIIIlIIIlIII(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[20])) || ((llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[21]) && !llIIIlIIIlIII(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[20])) || ((llIIIlIIIlIII(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[21]) && !llIIIlIIIlIII(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[20])) || (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[20]) && llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[20]))))) {
                    al();
                }
                if (llIIIlIIIlIlI(Skills.getLevel(Skill.ATTACK), lllIlIIlIl[21]) && llIIIlIIIlIlI(Skills.getLevel(Skill.STRENGTH), lllIlIIlIl[21]) && llIIIlIIIlIlI(Skills.getLevel(Skill.DEFENCE), lllIlIIlIl[21])) {
                    aj();
                }
            }
        }
    }

    private static boolean llIIIlIIIllII(int i) {
        return i > 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIlIIIll[lllIlIIlIl[57]];
    }

    private static String llIIIlIIIIIlI(String lllllllllllllllllIlllIIIIIIlIIIl, String lllllllllllllllllIlllIIIIIIlIIII) {
        String lllllllllllllllllIlllIIIIIIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIIIIIIllll = new StringBuilder();
        char[] lllllllllllllllllIlllIIIIIIIlllI = lllllllllllllllllIlllIIIIIIlIIII.toCharArray();
        int lllllllllllllllllIlllIIIIIIIllIl = lllIlIIlIl[0];
        char[] charArray = lllllllllllllllllIlllIIIIIIlIIIl2.toCharArray();
        int length = charArray.length;
        int i = lllIlIIlIl[0];
        while (llIIIlIIIlIII(i, length)) {
            lllllllllllllllllIlllIIIIIIIllll.append((char) (charArray[i] ^ lllllllllllllllllIlllIIIIIIIlllI[lllllllllllllllllIlllIIIIIIIllIl % lllllllllllllllllIlllIIIIIIIlllI.length]));
            "".length();
            lllllllllllllllllIlllIIIIIIIllIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlllIIIIIIIllll);
    }

    private static boolean llIIIlIIIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b0, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ea, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x023a, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0029p.lllIlIIlIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
        if (llIIIlIIIIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aN() {
        int[] iArr = new int[lllIlIIlIl[1]];
        iArr[lllIlIIlIl[0]] = lllIlIIlIl[14];
        if (llIIIlIIIlIIl(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIlIIlIl[1]];
            iArr2[lllIlIIlIl[0]] = lllIlIIlIl[14];
            if (llIIIlIIIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIlIIlIl[1]];
                iArr3[lllIlIIlIl[0]] = lllIlIIlIl[14];
            }
        }
        int[] iArr4 = new int[lllIlIIlIl[1]];
        iArr4[lllIlIIlIl[0]] = lllIlIIlIl[15];
        if (llIIIlIIIlIIl(Equipment.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lllIlIIlIl[1]];
            iArr5[lllIlIIlIl[0]] = lllIlIIlIl[15];
            if (llIIIlIIIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIlIIlIl[1]];
                iArr6[lllIlIIlIl[0]] = lllIlIIlIl[15];
            }
        }
        int[] iArr7 = new int[lllIlIIlIl[1]];
        iArr7[lllIlIIlIl[0]] = lllIlIIlIl[16];
        if (llIIIlIIIlIIl(Equipment.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lllIlIIlIl[1]];
            iArr8[lllIlIIlIl[0]] = lllIlIIlIl[16];
            if (llIIIlIIIlIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIlIIlIl[1]];
                iArr9[lllIlIIlIl[0]] = lllIlIIlIl[16];
            }
        }
        int[] iArr10 = new int[lllIlIIlIl[1]];
        iArr10[lllIlIIlIl[0]] = lllIlIIlIl[17];
        if (llIIIlIIIlIIl(Equipment.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lllIlIIlIl[1]];
            iArr11[lllIlIIlIl[0]] = lllIlIIlIl[17];
            if (llIIIlIIIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIlIIlIl[1]];
                iArr12[lllIlIIlIl[0]] = lllIlIIlIl[17];
            }
        }
        int[] iArr13 = new int[lllIlIIlIl[1]];
        iArr13[lllIlIIlIl[0]] = lllIlIIlIl[18];
        if (llIIIlIIIlIIl(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIlIIlIl[1]];
            iArr14[lllIlIIlIl[0]] = lllIlIIlIl[18];
            if (llIIIlIIIlIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIlIIlIl[1]];
                iArr15[lllIlIIlIl[0]] = lllIlIIlIl[18];
            }
        }
        int[] iArr16 = new int[lllIlIIlIl[1]];
        iArr16[lllIlIIlIl[0]] = lllIlIIlIl[12];
        if (llIIIlIIIlIIl(Inventory.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIlIIlIl[1]];
            iArr17[lllIlIIlIl[0]] = lllIlIIlIl[12];
        }
        ?? r0 = lllIlIIlIl[1];
        "".length();
        return " ".length() > "   ".length() ? ((37 ^ 74) ^ (107 ^ 14)) & (((((77 + 27) - 16) + 74) ^ (((119 + 166) - 140) + 23)) ^ (-" ".length())) : r0;
    }

    private static int llIIIlIIlIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIIlIIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static void llIIIlIIIIlII() {
        lllIlIIIll = new String[lllIlIIlIl[89]];
        lllIlIIIll[lllIlIIlIl[0]] = llIIIlIIIIIII("IXw2kFm1TMjsf3MEbOGhDg==", "YbdCv");
        lllIlIIIll[lllIlIIlIl[1]] = llIIIlIIIIIII("ZqrHm1C3ARR1D/ULNn7rwQKOFnJkrz5vrkBMJmPLdm0qTK6IuZzAenUURq2qq5PKFTrsa3zB3jM=", "NssNE");
        lllIlIIIll[lllIlIIlIl[5]] = llIIIlIIIIIIl("8GH+/sUASsfozO1W0SEFeD4F/d6ceBxy", "ldLjI");
        lllIlIIIll[lllIlIIlIl[6]] = llIIIlIIIIIlI("AyYKETgiKQNVNiopDxw6LA==", "KGduT");
        lllIlIIIll[lllIlIIlIl[8]] = llIIIlIIIIIIl("UEi22vMuSCPtyg9SHNl6gweOc3Nb1611K2lS107mMpr1ebdPTEZTYG4ESt5bT69q", "OPayu");
        lllIlIIIll[lllIlIIlIl[9]] = llIIIlIIIIIIl("zMMUXrpnhU307IsB+vlRQg==", "LntSX");
        lllIlIIIll[lllIlIIlIl[19]] = llIIIlIIIIIII("UJ5anM6Yz3E=", "jWCdC");
        lllIlIIIll[lllIlIIlIl[36]] = llIIIlIIIIIlI("ACMZZCUhYgctPSJiCC0wIDYc", "NBoDQ");
        lllIlIIIll[lllIlIIlIl[37]] = llIIIlIIIIIII("csNFvD3qNaRfbueJnmHzKw==", "fXMEY");
        lllIlIIIll[lllIlIIlIl[38]] = llIIIlIIIIIlI("Gys+HhZsLCMCAiUqKw==", "LDLrr");
        lllIlIIIll[lllIlIIlIl[39]] = llIIIlIIIIIIl("bx4cSt5n/eihkn36Qw1ECw==", "cUkKp");
        lllIlIIIll[lllIlIIlIl[40]] = llIIIlIIIIIII("UTFz1CKO4fHW7nxsPIfaw7NdljJaVKwn", "pGfNx");
        lllIlIIIll[lllIlIIlIl[2]] = llIIIlIIIIIlI("MAQBBxca", "qpuft");
        lllIlIIIll[lllIlIIlIl[41]] = llIIIlIIIIIII("GruF71F+7u54t4FGr1Pd0g==", "YDVJc");
        lllIlIIIll[lllIlIIlIl[3]] = llIIIlIIIIIlI("IAUCOBkKGBg+WgIeASo=", "aqvYz");
        lllIlIIIll[lllIlIIlIl[4]] = llIIIlIIIIIIl("yCLxXhsZxVg=", "kNowW");
        lllIlIIIll[lllIlIIlIl[44]] = llIIIlIIIIIlI("FjUZ", "uZniD");
        lllIlIIIll[lllIlIIlIl[45]] = llIIIlIIIIIII("D+F7XtqzI9I=", "iAlYp");
        lllIlIIIll[lllIlIIlIl[46]] = llIIIlIIIIIIl("aLvrF+Q3KRQ=", "MqoFA");
        lllIlIIIll[lllIlIIlIl[47]] = llIIIlIIIIIIl("bxI4tiDon/s=", "ScXmw");
        lllIlIIIll[lllIlIIlIl[20]] = llIIIlIIIIIlI("Oh8BKjM=", "mvdFW");
        lllIlIIIll[lllIlIIlIl[48]] = llIIIlIIIIIII("gGlTmz4Caqc=", "BKiRC");
        lllIlIIIll[lllIlIIlIl[50]] = llIIIlIIIIIIl("i4zEbqkTetA=", "WuTQq");
        lllIlIIIll[lllIlIIlIl[51]] = llIIIlIIIIIIl("czUSW4sG+oo=", "eJkJa");
        lllIlIIIll[lllIlIIlIl[52]] = llIIIlIIIIIlI("BAQcYSQlRQkuJzk=", "JejAP");
        lllIlIIIll[lllIlIIlIl[53]] = llIIIlIIIIIIl("a5Y6cgRMX0obcj8OxYkkyw==", "wjwMM");
        lllIlIIIll[lllIlIIlIl[57]] = llIIIlIIIIIII("pZuEpSIRj8py24lpy+el5Q==", "MdJMO");
        lllIlIIIll[lllIlIIlIl[59]] = llIIIlIIIIIII("gqAuf+xSqgI=", "erRrc");
        lllIlIIIll[lllIlIIlIl[60]] = llIIIlIIIIIlI("CAIX", "XtGHY");
        lllIlIIIll[lllIlIIlIl[61]] = llIIIlIIIIIII("z2tINYEsDT4=", "ByQtz");
        lllIlIIIll[lllIlIIlIl[21]] = llIIIlIIIIIII("rlCl3tMCn/o=", "puPSL");
        lllIlIIIll[lllIlIIlIl[64]] = llIIIlIIIIIlI("Oio0BQATPA==", "vOUbu");
        lllIlIIIll[lllIlIIlIl[65]] = llIIIlIIIIIlI("ECAfCw==", "REkjN");
        lllIlIIIll[lllIlIIlIl[66]] = llIIIlIIIIIlI("JB8RDA==", "FzemB");
        lllIlIIIll[lllIlIIlIl[67]] = llIIIlIIIIIIl("hPkfOYdw1Yc=", "sUEFZ");
        lllIlIIIll[lllIlIIlIl[68]] = llIIIlIIIIIIl("Kkn6qRX8iW0=", "zEJPE");
        lllIlIIIll[lllIlIIlIl[69]] = llIIIlIIIIIIl("VFE549s2vtkFJobT3SNaUg==", "kmcJX");
        lllIlIIIll[lllIlIIlIl[70]] = llIIIlIIIIIIl("CraK+EbNajY=", "mkZXH");
        lllIlIIIll[lllIlIIlIl[24]] = llIIIlIIIIIIl("dDhEjM6P9P8=", "mTaZE");
        lllIlIIIll[lllIlIIlIl[25]] = llIIIlIIIIIlI("IjY8Lg==", "AWPHn");
        lllIlIIIll[lllIlIIlIl[49]] = llIIIlIIIIIlI("Djce", "MXiax");
        lllIlIIIll[lllIlIIlIl[71]] = llIIIlIIIIIII("2nLAKYKZ2nU=", "fgvwx");
        lllIlIIIll[lllIlIIlIl[72]] = llIIIlIIIIIlI("DjkAFQ==", "FPlyp");
        lllIlIIIll[lllIlIIlIl[73]] = llIIIlIIIIIIl("Wdikv6AZeYk=", "aLQWf");
    }

    public static void aK() {
        if (llIIIlIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIlIIIlIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[41]];
            Movement.walkTo(new WorldPoint(lllIlIIlIl[42], lllIlIIlIl[43], lllIlIIlIl[0]));
            "".length();
            Time.sleepTicks(lllIlIIlIl[1]);
            "".length();
        }
        if (llIIIlIIIIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[3]];
            am();
        }
    }

    private static void llIIIlIIIIlIl() {
        lllIlIIlIl = new int[90];
        lllIlIIlIl[0] = ((232 ^ 199) ^ (9 ^ 63)) & (((((94 + 150) - 81) + 9) ^ (((161 + 142) - 201) + 79)) ^ (-" ".length())) & ((((219 ^ 157) ^ (120 ^ 49)) & (((114 ^ 110) ^ (185 ^ 170)) ^ (-" ".length()))) ^ (-" ".length()));
        lllIlIIlIl[1] = " ".length();
        lllIlIIlIl[2] = 78 ^ 66;
        lllIlIIlIl[3] = (((124 + 36) - 94) + 103) ^ (((160 + 91) - 211) + 127);
        lllIlIIlIl[4] = 31 ^ 16;
        lllIlIIlIl[5] = "  ".length();
        lllIlIIlIl[6] = "   ".length();
        lllIlIIlIl[7] = (-((-6442) & 15743)) & (-16417) & 30717;
        lllIlIIlIl[8] = 64 ^ 68;
        lllIlIIlIl[9] = (231 ^ 146) ^ (91 ^ 43);
        lllIlIIlIl[10] = (-7177) & 8171;
        lllIlIIlIl[11] = (-((-364) & 10623)) & (-1029) & 12287;
        lllIlIIlIl[12] = (-((-25335) & 30455)) & (-16385) & 21883;
        lllIlIIlIl[13] = (224 ^ 193) ^ (111 ^ 42);
        lllIlIIlIl[14] = (-20545) & 21867;
        lllIlIIlIl[15] = (-((-29731) & 30435)) & (-10257) & 12285;
        lllIlIIlIl[16] = (-19139) & 20467;
        lllIlIIlIl[17] = (-27277) & 28607;
        lllIlIIlIl[18] = (-27267) & 28599;
        lllIlIIlIl[19] = (105 ^ 33) ^ (44 ^ 98);
        lllIlIIlIl[20] = (38 ^ 96) ^ (110 ^ 60);
        lllIlIIlIl[21] = 46 ^ 48;
        lllIlIIlIl[22] = (-8869) & 12223;
        lllIlIIlIl[23] = (-((-2129) & 19413)) & (-8193) & 28607;
        lllIlIIlIl[24] = (((160 + 127) - 203) + 89) ^ (((56 + 127) - 157) + 113);
        lllIlIIlIl[25] = (188 ^ 162) ^ (157 ^ 164);
        lllIlIIlIl[26] = (-((-5137) & 13845)) & (-20617) & 32701;
        lllIlIIlIl[27] = (-((-525) & 29358)) & (-273) & 32255;
        lllIlIIlIl[28] = (-((-793) & 17245)) & (-8850) & 28671;
        lllIlIIlIl[29] = (-((-4165) & 29669)) & (-1) & 28670;
        lllIlIIlIl[30] = (-20762) & 24029;
        lllIlIIlIl[31] = (-((-30754) & 31269)) & (-321) & 4063;
        lllIlIIlIl[32] = (-((-16547) & 29671)) & (-1) & 16351;
        lllIlIIlIl[33] = (-16657) & 19934;
        lllIlIIlIl[34] = (-((-1066) & 30315)) & (-5) & 32479;
        lllIlIIlIl[35] = (-((-3125) & 28221)) & (-2) & 29597;
        lllIlIIlIl[36] = (59 ^ 3) ^ (14 ^ 49);
        lllIlIIlIl[37] = 134 ^ 142;
        lllIlIIlIl[38] = (((135 + 177) - 272) + 146) ^ (((157 + 117) - 205) + 110);
        lllIlIIlIl[39] = (51 ^ 53) ^ (5 ^ 9);
        lllIlIIlIl[40] = 143 ^ 132;
        lllIlIIlIl[41] = 93 ^ 80;
        lllIlIIlIl[42] = (-((-19298) & 31615)) & (-1) & 15487;
        lllIlIIlIl[43] = (-((-9474) & 30715)) & (-8197) & 32767;
        lllIlIIlIl[44] = (211 ^ 144) ^ (197 ^ 150);
        lllIlIIlIl[45] = (27 ^ 13) ^ (107 ^ 108);
        lllIlIIlIl[46] = (142 ^ 155) ^ (1 ^ 6);
        lllIlIIlIl[47] = (173 ^ 170) ^ (69 ^ 81);
        lllIlIIlIl[48] = (94 ^ 35) ^ (210 ^ 186);
        lllIlIIlIl[49] = 98 ^ 74;
        lllIlIIlIl[50] = (8 ^ 105) ^ (45 ^ 90);
        lllIlIIlIl[51] = 91 ^ 76;
        lllIlIIlIl[52] = 39 ^ 63;
        lllIlIIlIl[53] = 3 ^ 26;
        lllIlIIlIl[54] = (-((-58) & 14909)) & (-1) & 15351;
        lllIlIIlIl[55] = (-4114) & 29113;
        lllIlIIlIl[56] = (-((-2469) & 19948)) & (-33) & 32511;
        lllIlIIlIl[57] = 91 ^ 65;
        lllIlIIlIl[58] = (-24577) & 26526;
        lllIlIIlIl[59] = (98 ^ 108) ^ (32 ^ 53);
        lllIlIIlIl[60] = (((129 + 119) - 144) + 46) ^ (((94 + 126) - 210) + 128);
        lllIlIIlIl[61] = (56 ^ 74) ^ (210 ^ 189);
        lllIlIIlIl[62] = (-22561) & 23034;
        lllIlIIlIl[63] = (-((-6665) & 16331)) & (-20513) & 30711;
        lllIlIIlIl[64] = 158 ^ 129;
        lllIlIIlIl[65] = (((106 + 79) - 129) + 107) ^ (((26 + 94) - (-9)) + 2);
        lllIlIIlIl[66] = 34 ^ 3;
        lllIlIIlIl[67] = 82 ^ 112;
        lllIlIIlIl[68] = 15 ^ 44;
        lllIlIIlIl[69] = 57 ^ 29;
        lllIlIIlIl[70] = 69 ^ 96;
        lllIlIIlIl[71] = 173 ^ 132;
        lllIlIIlIl[72] = 159 ^ 181;
        lllIlIIlIl[73] = 164 ^ 143;
        lllIlIIlIl[74] = (-((-4419) & 29031)) & (-833) & 28669;
        lllIlIIlIl[75] = (-((-15631) & 32015)) & (-4866) & 24539;
        lllIlIIlIl[76] = (-((-3331) & 32003)) & (-835) & 32750;
        lllIlIIlIl[77] = (-29484) & 32763;
        lllIlIIlIl[78] = (-4231) & 7415;
        lllIlIIlIl[79] = (-((-6851) & 31459)) & (-4353) & 32127;
        lllIlIIlIl[80] = 12 ^ 60;
        lllIlIIlIl[81] = (-((-2311) & 27495)) & (-4369) & 32765;
        lllIlIIlIl[82] = (-((-1345) & 30673)) & (-3) & 32511;
        lllIlIIlIl[83] = (-((-16487) & 25455)) & (-4098) & 16319;
        lllIlIIlIl[84] = (-16673) & 19903;
        lllIlIIlIl[85] = (-((-15393) & 32563)) & (-8202) & 28667;
        lllIlIIlIl[86] = (-13065) & 16218;
        lllIlIIlIl[87] = (-8705) & 12023;
        lllIlIIlIl[88] = (-((-2401) & 6507)) & (-8469) & 15743;
        lllIlIIlIl[89] = 64 ^ 108;
    }
}

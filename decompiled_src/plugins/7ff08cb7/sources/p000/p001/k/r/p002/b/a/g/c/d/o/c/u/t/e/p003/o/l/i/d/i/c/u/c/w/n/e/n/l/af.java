package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.af  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/af.class */
public class af implements ab {
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ WorldArea cl;
    private static /* synthetic */ String[] llIIlllII;
    private static /* synthetic */ int[] llIIlllIl;
    static /* synthetic */ WorldPoint cm;
    static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ boolean ck;

    private static void Q() {
        if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
            int[] iArr = new int[llIIlllIl[1]];
            iArr[llIIlllIl[0]] = llIIlllIl[16];
            if (lIlIlllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[16], llIIlllIl[57], llIIlllIl[58]));
                "".length();
            }
            int[] iArr2 = new int[llIIlllIl[1]];
            iArr2[llIIlllIl[0]] = llIIlllIl[9];
            if (lIlIlllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[9], llIIlllIl[59], llIIlllIl[6]));
                "".length();
            }
            int[] iArr3 = new int[llIIlllIl[1]];
            iArr3[llIIlllIl[0]] = llIIlllIl[11];
            if (lIlIlllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[11], llIIlllIl[60], llIIlllIl[6]));
                "".length();
            }
            int[] iArr4 = new int[llIIlllIl[1]];
            iArr4[llIIlllIl[0]] = llIIlllIl[13];
            if (lIlIlllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[13], llIIlllIl[61], llIIlllIl[6]));
                "".length();
            }
            int[] iArr5 = new int[llIIlllIl[1]];
            iArr5[llIIlllIl[0]] = llIIlllIl[14];
            if (lIlIlllIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[14], llIIlllIl[5], llIIlllIl[6]));
                "".length();
            }
            int[] iArr6 = new int[llIIlllIl[1]];
            iArr6[llIIlllIl[0]] = llIIlllIl[46];
            if (lIlIlllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[46], llIIlllIl[1], C0004e.c(llIIlllIl[62], llIIlllIl[63])));
                "".length();
            }
        }
        if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
            int[] iArr7 = new int[llIIlllIl[1]];
            iArr7[llIIlllIl[0]] = llIIlllIl[24];
            if (lIlIlllIIIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlllIl[1]];
                iArr8[llIIlllIl[0]] = llIIlllIl[24];
                if (lIlIlllIIIIl(Bank.getFirst(iArr8).getQuantity(), llIIlllIl[61])) {
                    int i = llIIlllIl[24];
                    int i2 = llIIlllIl[61];
                    int[] iArr9 = new int[llIIlllIl[1]];
                    iArr9[llIIlllIl[0]] = llIIlllIl[24];
                    bx.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), llIIlllIl[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[llIIlllIl[1]];
            iArr10[llIIlllIl[0]] = llIIlllIl[24];
            if (lIlIlllIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[24], llIIlllIl[61], llIIlllIl[64]));
                "".length();
            }
            int[] iArr11 = new int[llIIlllIl[1]];
            iArr11[llIIlllIl[0]] = llIIlllIl[25];
            if (lIlIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIlllIl[1]];
                iArr12[llIIlllIl[0]] = llIIlllIl[25];
                if (lIlIlllIIIIl(Bank.getFirst(iArr12).getQuantity(), llIIlllIl[61])) {
                    int i3 = llIIlllIl[25];
                    int i4 = llIIlllIl[61];
                    int[] iArr13 = new int[llIIlllIl[1]];
                    iArr13[llIIlllIl[0]] = llIIlllIl[25];
                    bx.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), llIIlllIl[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[llIIlllIl[1]];
            iArr14[llIIlllIl[0]] = llIIlllIl[25];
            if (lIlIlllIIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                bx.add(new C0003d(llIIlllIl[25], llIIlllIl[61], llIIlllIl[65]));
                "".length();
            }
            int[] iArr15 = new int[llIIlllIl[1]];
            iArr15[llIIlllIl[0]] = llIIlllIl[22];
            if (lIlIlllIIIlI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIIlllIl[1]];
                iArr16[llIIlllIl[0]] = llIIlllIl[22];
                if (lIlIlllIIIlI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bx.add(new C0003d(llIIlllIl[22], llIIlllIl[1], llIIlllIl[66]));
                    "".length();
                }
            }
            if (lIlIlllIIIII(ck ? 1 : 0)) {
                int[] iArr17 = new int[llIIlllIl[1]];
                iArr17[llIIlllIl[0]] = llIIlllIl[16];
                if (lIlIlllIIIII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIlllIl[1]];
                    iArr18[llIIlllIl[0]] = llIIlllIl[16];
                    if (lIlIlllIIIIl(Bank.getFirst(iArr18).getQuantity(), llIIlllIl[61])) {
                        int i5 = llIIlllIl[16];
                        int i6 = llIIlllIl[61];
                        int[] iArr19 = new int[llIIlllIl[1]];
                        iArr19[llIIlllIl[0]] = llIIlllIl[16];
                        bx.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), llIIlllIl[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[llIIlllIl[1]];
                iArr20[llIIlllIl[0]] = llIIlllIl[16];
                if (lIlIlllIIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                    bx.add(new C0003d(llIIlllIl[16], llIIlllIl[61], llIIlllIl[58]));
                    "".length();
                }
                int[] iArr21 = new int[llIIlllIl[1]];
                iArr21[llIIlllIl[0]] = llIIlllIl[23];
                if (lIlIlllIIIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIIlllIl[1]];
                    iArr22[llIIlllIl[0]] = llIIlllIl[23];
                    if (lIlIlllIIIIl(Bank.getFirst(iArr22).getQuantity(), llIIlllIl[66])) {
                        int i7 = llIIlllIl[23];
                        int i8 = llIIlllIl[66];
                        int[] iArr23 = new int[llIIlllIl[1]];
                        iArr23[llIIlllIl[0]] = llIIlllIl[23];
                        bx.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), llIIlllIl[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[llIIlllIl[1]];
                iArr24[llIIlllIl[0]] = llIIlllIl[23];
                if (lIlIlllIIIlI(Bank.contains(iArr24) ? 1 : 0)) {
                    bx.add(new C0003d(llIIlllIl[23], llIIlllIl[66], llIIlllIl[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[llIIlllIl[1]];
        iArr25[llIIlllIl[0]] = llIIlllIl[20];
        if (lIlIlllIIIlI(Bank.contains(iArr25) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllIl[20], llIIlllIl[67], llIIlllIl[68]));
            "".length();
        }
        if (lIlIlllIIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIlllII[llIIlllIl[74]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllIl[69], llIIlllIl[19], llIIlllIl[70]));
            "".length();
        }
        int[] iArr26 = new int[llIIlllIl[1]];
        iArr26[llIIlllIl[0]] = llIIlllIl[71];
        if (lIlIlllIIIlI(Bank.contains(iArr26) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllIl[71], llIIlllIl[33], llIIlllIl[72]));
            "".length();
        }
        int[] iArr27 = new int[llIIlllIl[1]];
        iArr27[llIIlllIl[0]] = llIIlllIl[18];
        if (lIlIlllIIIlI(Bank.contains(iArr27) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllIl[18], llIIlllIl[33], llIIlllIl[72]));
            "".length();
        }
    }

    private static boolean lIlIlllIIIII(int i) {
        return i != 0;
    }

    public static void aq() {
        if (lIlIlllIIIll(Widgets.get(llIIlllIl[49], llIIlllIl[50]))) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[51]];
            Widgets.get(llIIlllIl[49], llIIlllIl[50]).interact(llIIlllII[llIIlllIl[52]]);
            Time.sleepTicks(llIIlllIl[7]);
            "".length();
        }
        if (lIlIlllIIlll(Widgets.get(llIIlllIl[49], llIIlllIl[50])) && lIlIlllIIIlI(Widgets.get(llIIlllIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(llIIlllIl[1]);
            "".length();
            if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[19])) {
                Widgets.get(llIIlllIl[53], llIIlllIl[1]).getChild(llIIlllIl[1]).interact(llIIlllII[llIIlllIl[54]]);
            }
            if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[32]) && lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[19])) {
                Widgets.get(llIIlllIl[53], llIIlllIl[1]).getChild(llIIlllIl[3]).interact(llIIlllII[llIIlllIl[55]]);
            }
            if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[32]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[39])) {
                Widgets.get(llIIlllIl[53], llIIlllIl[1]).getChild(llIIlllIl[4]).interact(llIIlllII[llIIlllIl[56]]);
            }
            if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[32])) {
                int[] iArr = new int[llIIlllIl[1]];
                iArr[llIIlllIl[0]] = llIIlllIl[14];
                if (lIlIlllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(llIIlllIl[53], llIIlllIl[1]).getChild(llIIlllIl[4]).interact(llIIlllII[llIIlllIl[21]]);
                }
            }
            if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[39])) {
                int[] iArr2 = new int[llIIlllIl[1]];
                iArr2[llIIlllIl[0]] = llIIlllIl[14];
                if (lIlIlllIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(llIIlllIl[53], llIIlllIl[1]).getChild(llIIlllIl[7]).interact(llIIlllII[llIIlllIl[50]]);
                }
            }
            Time.sleepTicks(llIIlllIl[1]);
            "".length();
        }
    }

    private static boolean lIlIlllIIlII(int i) {
        return i > 0;
    }

    private static String lIlIllIlllII(String lIIllllllllIIl, String lIIllllllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllllllIII.getBytes(StandardCharsets.UTF_8)), llIIlllIl[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllllllIlI) {
            lIIllllllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIlllIIllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIllIlllIl(String lIlIIIIIIIIlII, String lIlIIIIIIIIlIl) {
        try {
            SecretKeySpec lIlIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIIIIlIII = Cipher.getInstance("Blowfish");
            lIlIIIIIIIlIII.init(llIIlllIl[3], lIlIIIIIIIlIIl);
            return new String(lIlIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lIlIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIIIIIlll) {
            lIlIIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIl(int i) {
        return i < 0;
    }

    private static void am() {
        if (lIlIlllIlIIl(lIlIlllIlIII(C0004e.w(), 30.0d))) {
            int[] iArr = new int[llIIlllIl[1]];
            iArr[llIIlllIl[0]] = llIIlllIl[20];
            if (lIlIlllIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlllIl[1]];
                iArr2[llIIlllIl[0]] = llIIlllIl[20];
                Inventory.getFirst(iArr2).interact(llIIlllII[llIIlllIl[43]]);
                Time.sleepTicks(llIIlllIl[1]);
                "".length();
            }
        }
        if (lIlIlllIIlll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIlllIIIII(npc.getName().contains(llIIlllII[llIIlllIl[75]]) ? 1 : 0) && lIlIlllIIIlI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = llIIlllIl[1];
                    "".length();
                    return (((110 ^ 23) ^ (127 ^ 59)) & (((2 ^ 23) ^ (233 ^ 193)) ^ (-" ".length()))) != 0 ? (((119 ^ 52) & ((72 ^ 11) ^ (-1))) ^ (82 ^ 66)) & (((203 ^ 188) ^ (119 ^ 16)) ^ (-" ".length())) : r0;
                }
                return llIIlllIl[0];
            });
            String[] strArr = new String[llIIlllIl[3]];
            strArr[llIIlllIl[0]] = llIIlllII[llIIlllIl[44]];
            strArr[llIIlllIl[1]] = llIIlllII[llIIlllIl[45]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIlIlllIlIlI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIIlllIl[1];
                    "".length();
                    return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlllIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[llIIlllIl[1]];
            iArr3[llIIlllIl[0]] = llIIlllIl[46];
            if (lIlIlllIIIII(Equipment.contains(iArr3) ? 1 : 0) && lIlIlllIIIlI(ap() ? 1 : 0)) {
                aq();
            }
            if (lIlIlllIIIll(nearest) && lIlIlllIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(llIIlllII[llIIlllIl[47]]);
                Time.sleepTicks(llIIlllIl[4]);
                "".length();
            }
        }
    }

    public static void al() {
        if (lIlIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIlllIIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[41]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(llIIlllIl[1]);
            "".length();
        }
        if (lIlIlllIIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[42]];
            am();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e3, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028f, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0347, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ao() {
        if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21])) {
            int[] iArr = new int[llIIlllIl[1]];
            iArr[llIIlllIl[0]] = llIIlllIl[9];
            if (lIlIlllIIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlllIl[1]];
                iArr2[llIIlllIl[0]] = llIIlllIl[13];
                if (lIlIlllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIlllIl[1]];
                    iArr3[llIIlllIl[0]] = llIIlllIl[11];
                    if (lIlIlllIIIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIlllIl[1]];
                        iArr4[llIIlllIl[0]] = llIIlllIl[14];
                        if (lIlIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIIlllIl[1]];
                            iArr5[llIIlllIl[0]] = llIIlllIl[20];
                            if (lIlIlllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIIlllIl[1]];
                                iArr6[llIIlllIl[0]] = llIIlllIl[46];
                                if (lIlIlllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIIlllIl[1]];
                                    iArr7[llIIlllIl[0]] = llIIlllIl[46];
                                }
                                ?? r0 = llIIlllIl[1];
                                "".length();
                                return ((32 ^ 8) & ((40 ^ 0) ^ (-1))) >= (124 ^ 120) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llIIlllIl[0];
        } else if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
            int[] iArr8 = new int[llIIlllIl[1]];
            iArr8[llIIlllIl[0]] = llIIlllIl[13];
            if (lIlIlllIIIII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIIlllIl[1]];
                iArr9[llIIlllIl[0]] = llIIlllIl[11];
                if (lIlIlllIIIII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIlllIl[1]];
                    iArr10[llIIlllIl[0]] = llIIlllIl[14];
                    if (lIlIlllIIIII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIIlllIl[1]];
                        iArr11[llIIlllIl[0]] = llIIlllIl[16];
                        if (lIlIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIIlllIl[1]];
                            iArr12[llIIlllIl[0]] = llIIlllIl[46];
                            if (lIlIlllIIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIIlllIl[1]];
                                iArr13[llIIlllIl[0]] = llIIlllIl[46];
                            }
                            ?? r02 = llIIlllIl[1];
                            "".length();
                            return "   ".length() == 0 ? ((((126 + 190) - 310) + 203) ^ (((45 + 109) - 73) + 56)) & (((((212 + 52) - 248) + 207) ^ (((96 + 41) - 49) + 47)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llIIlllIl[0];
        } else if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8]) && lIlIlllIIIlI(ck ? 1 : 0)) {
            int[] iArr14 = new int[llIIlllIl[1]];
            iArr14[llIIlllIl[0]] = llIIlllIl[22];
            if (lIlIlllIIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIIlllIl[1]];
                iArr15[llIIlllIl[0]] = llIIlllIl[22];
            }
            int[] iArr16 = new int[llIIlllIl[1]];
            iArr16[llIIlllIl[0]] = llIIlllIl[24];
            if (lIlIlllIIIII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIlllIl[1]];
                iArr17[llIIlllIl[0]] = llIIlllIl[25];
                if (lIlIlllIIIII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llIIlllIl[1];
                    "".length();
                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llIIlllIl[0];
        } else if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8]) && lIlIlllIIIII(ck ? 1 : 0)) {
            int[] iArr18 = new int[llIIlllIl[1]];
            iArr18[llIIlllIl[0]] = llIIlllIl[22];
            if (lIlIlllIIIlI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIIlllIl[1]];
                iArr19[llIIlllIl[0]] = llIIlllIl[22];
            }
            int[] iArr20 = new int[llIIlllIl[1]];
            iArr20[llIIlllIl[0]] = llIIlllIl[16];
            if (lIlIlllIIIII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIIlllIl[1]];
                iArr21[llIIlllIl[0]] = llIIlllIl[23];
                if (lIlIlllIIIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIIlllIl[1]];
                    iArr22[llIIlllIl[0]] = llIIlllIl[23];
                    if (lIlIlllIIlIl(Bank.getFirst(iArr22).getQuantity(), llIIlllIl[19])) {
                        int[] iArr23 = new int[llIIlllIl[1]];
                        iArr23[llIIlllIl[0]] = llIIlllIl[24];
                        if (lIlIlllIIIII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIIlllIl[1]];
                            iArr24[llIIlllIl[0]] = llIIlllIl[25];
                            if (lIlIlllIIIII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llIIlllIl[1];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llIIlllIl[0];
        } else {
            return llIIlllIl[0];
        }
    }

    private static boolean lIlIlllIIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[2])) {
            ?? r0 = llIIlllIl[1];
            "".length();
            return " ".length() < (-" ".length()) ? ((127 ^ 106) ^ (158 ^ 187)) & (((23 ^ 69) ^ (210 ^ 176)) ^ (-" ".length())) : r0;
        }
        return llIIlllIl[0];
    }

    private static boolean lIlIlllIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlllIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d4, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0275, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x035a, code lost:
        if (lIlIlllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21])) {
            int[] iArr = new int[llIIlllIl[1]];
            iArr[llIIlllIl[0]] = llIIlllIl[9];
            if (lIlIlllIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlllIl[1]];
                iArr2[llIIlllIl[0]] = llIIlllIl[13];
                if (lIlIlllIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIlllIl[1]];
                    iArr3[llIIlllIl[0]] = llIIlllIl[11];
                    if (lIlIlllIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIlllIl[1]];
                        iArr4[llIIlllIl[0]] = llIIlllIl[14];
                        if (lIlIlllIIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIIlllIl[1]];
                            iArr5[llIIlllIl[0]] = llIIlllIl[20];
                            if (lIlIlllIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIIlllIl[1]];
                                iArr6[llIIlllIl[0]] = llIIlllIl[46];
                                if (lIlIlllIIIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIIlllIl[1]];
                                    iArr7[llIIlllIl[0]] = llIIlllIl[46];
                                }
                                ?? r0 = llIIlllIl[1];
                                "".length();
                                return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return llIIlllIl[0];
        } else if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
            int[] iArr8 = new int[llIIlllIl[1]];
            iArr8[llIIlllIl[0]] = llIIlllIl[13];
            if (lIlIlllIIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIIlllIl[1]];
                iArr9[llIIlllIl[0]] = llIIlllIl[11];
                if (lIlIlllIIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIlllIl[1]];
                    iArr10[llIIlllIl[0]] = llIIlllIl[14];
                    if (lIlIlllIIIII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIIlllIl[1]];
                        iArr11[llIIlllIl[0]] = llIIlllIl[16];
                        if (lIlIlllIIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIIlllIl[1]];
                            iArr12[llIIlllIl[0]] = llIIlllIl[46];
                            if (lIlIlllIIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIIlllIl[1]];
                                iArr13[llIIlllIl[0]] = llIIlllIl[46];
                            }
                            ?? r02 = llIIlllIl[1];
                            "".length();
                            return "  ".length() < 0 ? ((((122 + 140) - 236) + 219) ^ (((160 + 21) - 132) + 134)) & (((72 ^ 27) ^ (7 ^ 22)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return llIIlllIl[0];
        } else if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8]) && lIlIlllIIIlI(ck ? 1 : 0)) {
            int[] iArr14 = new int[llIIlllIl[1]];
            iArr14[llIIlllIl[0]] = llIIlllIl[22];
            if (lIlIlllIIIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIIlllIl[1]];
                iArr15[llIIlllIl[0]] = llIIlllIl[22];
            }
            int[] iArr16 = new int[llIIlllIl[1]];
            iArr16[llIIlllIl[0]] = llIIlllIl[24];
            if (lIlIlllIIIII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIlllIl[1]];
                iArr17[llIIlllIl[0]] = llIIlllIl[38];
                if (lIlIlllIIIII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = llIIlllIl[1];
                    "".length();
                    return ((94 ^ 69) ^ (17 ^ 14)) <= (-" ".length()) ? ((107 ^ 109) ^ (46 ^ 58)) & (((((90 + 128) - 155) + 87) ^ (((129 + 87) - 209) + 125)) ^ (-" ".length())) : r03;
                }
            }
            return llIIlllIl[0];
        } else if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8]) && lIlIlllIIIII(ck ? 1 : 0)) {
            int[] iArr18 = new int[llIIlllIl[1]];
            iArr18[llIIlllIl[0]] = llIIlllIl[22];
            if (lIlIlllIIIlI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIIlllIl[1]];
                iArr19[llIIlllIl[0]] = llIIlllIl[22];
            }
            int[] iArr20 = new int[llIIlllIl[1]];
            iArr20[llIIlllIl[0]] = llIIlllIl[16];
            if (lIlIlllIIIII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIIlllIl[1]];
                iArr21[llIIlllIl[0]] = llIIlllIl[23];
                if (lIlIlllIIIII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIIlllIl[1]];
                    iArr22[llIIlllIl[0]] = llIIlllIl[23];
                    if (lIlIlllIIlIl(Inventory.getFirst(iArr22).getQuantity(), llIIlllIl[19])) {
                        int[] iArr23 = new int[llIIlllIl[1]];
                        iArr23[llIIlllIl[0]] = llIIlllIl[24];
                        if (lIlIlllIIIII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIIlllIl[1]];
                            iArr24[llIIlllIl[0]] = llIIlllIl[38];
                            if (lIlIlllIIIII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = llIIlllIl[1];
                                "".length();
                                return "   ".length() <= 0 ? ((66 ^ 58) ^ (43 ^ 115)) & (((((65 + 56) - 110) + 117) ^ (((74 + 113) - 119) + 92)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return llIIlllIl[0];
        } else {
            return llIIlllIl[0];
        }
    }

    private static int lIlIlllIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIlllIl[0];
    }

    private static void lIlIllIlllll() {
        llIIlllIl = new int[81];
        llIIlllIl[0] = ((((171 + 21) - 34) + 15) ^ (((27 + 44) - (-78)) + 1)) & (((((93 + 49) - 134) + 169) ^ (((18 + 28) - (-40)) + 52)) ^ (-" ".length()));
        llIIlllIl[1] = " ".length();
        llIIlllIl[2] = (((5 + 33) - (-39)) + 59) ^ (((184 + 105) - 219) + 116);
        llIIlllIl[3] = "  ".length();
        llIIlllIl[4] = "   ".length();
        llIIlllIl[5] = (-((-8801) & 28276)) & (-37) & 24511;
        llIIlllIl[6] = 62 ^ 56;
        llIIlllIl[7] = (((66 + 44) - 107) + 144) ^ (((150 + 126) - 261) + 136);
        llIIlllIl[8] = (42 ^ 0) ^ (74 ^ 87);
        llIIlllIl[9] = (-((-2577) & 32593)) & (-17) & 30590;
        llIIlllIl[10] = (-((-4361) & 23306)) & (-35) & 20479;
        llIIlllIl[11] = (-((-9515) & 32127)) & (-1153) & 24319;
        llIIlllIl[12] = (-12810) & 15309;
        llIIlllIl[13] = (-18577) & 19133;
        llIIlllIl[14] = (-((-538) & 23455)) & (-65) & 23535;
        llIIlllIl[15] = (-8745) & 13244;
        llIIlllIl[16] = (-10701) & 11263;
        llIIlllIl[17] = (-((-13767) & 32743)) & (-13) & 31613;
        llIIlllIl[18] = (-((-5953) & 30705)) & (-7) & 32767;
        llIIlllIl[19] = 85 ^ 80;
        llIIlllIl[20] = (-((-5489) & 8181)) & (-9217) & 12287;
        llIIlllIl[21] = (((202 + 173) - 166) + 14) ^ (((118 + 112) - 79) + 47);
        llIIlllIl[22] = (-133) & 1519;
        llIIlllIl[23] = (-((-9457) & 15859)) & (-16578) & 23535;
        llIIlllIl[24] = (-((-3893) & 32757)) & (-11) & 29435;
        llIIlllIl[25] = (91 ^ 16) ^ (77 ^ 56);
        llIIlllIl[26] = (((39 + 195) - 33) + 18) ^ (((53 + 97) - 58) + 104);
        llIIlllIl[27] = (((94 + 3) - 25) + 64) ^ (((13 + 102) - 109) + 137);
        llIIlllIl[28] = -" ".length();
        llIIlllIl[29] = 133 ^ 160;
        llIIlllIl[30] = 140 ^ 132;
        llIIlllIl[31] = 111 ^ 66;
        llIIlllIl[32] = (9 ^ 116) ^ (183 ^ 195);
        llIIlllIl[33] = (121 ^ 26) ^ (32 ^ 73);
        llIIlllIl[34] = (((75 + 69) - (-58)) + 1) ^ (((158 + 1) - 86) + 119);
        llIIlllIl[35] = (-((-1563) & 22207)) & (-8961) & 32766;
        llIIlllIl[36] = (-((-5023) & 29631)) & (-4673) & 32767;
        llIIlllIl[37] = (148 ^ 176) ^ (27 ^ 51);
        llIIlllIl[38] = 129 ^ 190;
        llIIlllIl[39] = 177 ^ 188;
        llIIlllIl[40] = (-((-11583) & 32639)) & (-8209) & 32764;
        llIIlllIl[41] = (((37 + 47) - 61) + 117) ^ (((5 + 119) - 72) + 78);
        llIIlllIl[42] = (11 ^ 119) ^ (237 ^ 158);
        llIIlllIl[43] = (139 ^ 182) ^ (177 ^ 156);
        llIIlllIl[44] = 10 ^ 27;
        llIIlllIl[45] = 18 ^ 0;
        llIIlllIl[46] = (-12289) & 13669;
        llIIlllIl[47] = 2 ^ 17;
        llIIlllIl[48] = (-((-391) & 30151)) & (-35) & 30070;
        llIIlllIl[49] = (-13707) & 14299;
        llIIlllIl[50] = 126 ^ 100;
        llIIlllIl[51] = 54 ^ 34;
        llIIlllIl[52] = 148 ^ 129;
        llIIlllIl[53] = (((205 ^ 175) + (99 ^ 63)) - (19 ^ 100)) + ((115 + 114) - 209) + 110;
        llIIlllIl[54] = 16 ^ 6;
        llIIlllIl[55] = (((98 + 108) - 148) + 69) ^ (20 ^ 124);
        llIIlllIl[56] = (176 ^ 198) ^ (22 ^ 120);
        llIIlllIl[57] = (-((-3073) & 15383)) & (-1025) & 14334;
        llIIlllIl[58] = (((130 ^ 132) + (((22 + 121) - 47) + 33)) - (-(121 ^ 110))) + (41 ^ 37);
        llIIlllIl[59] = (-(64 ^ 28)) & (-1) & 4091;
        llIIlllIl[60] = (-((-1681) & 7835)) & (-37) & 8190;
        llIIlllIl[61] = (-((-18949) & 32261)) & (-16455) & 32766;
        llIIlllIl[62] = (-18219) & 30718;
        llIIlllIl[63] = (-((-15450) & 32603)) & (-81) & 32733;
        llIIlllIl[64] = 199 ^ 191;
        llIIlllIl[65] = ((26 + 0) - (-109)) + 15;
        llIIlllIl[66] = (-16679) & 31678;
        llIIlllIl[67] = (((191 + 213) - 190) + 0) ^ (((2 + 143) - 123) + 156);
        llIIlllIl[68] = (-((-11081) & 16377)) & (-10758) & 16373;
        llIIlllIl[69] = (-((-12097) & 32628)) & (-1) & 32511;
        llIIlllIl[70] = (-((-29095) & 30126)) & (-4113) & 30143;
        llIIlllIl[71] = (-((-4177) & 28921)) & (-1) & 32751;
        llIIlllIl[72] = (-((-17041) & 22235)) & (-2) & 6095;
        llIIlllIl[73] = 64 ^ 91;
        llIIlllIl[74] = 74 ^ 86;
        llIIlllIl[75] = 91 ^ 70;
        llIIlllIl[76] = (-((-25375) & 29503)) & (-17410) & 24559;
        llIIlllIl[77] = (-17) & 3315;
        llIIlllIl[78] = (-25641) & 28671;
        llIIlllIl[79] = (-515) & 3819;
        llIIlllIl[80] = 150 ^ 136;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ak();
            "".length();
            if ("  ".length() == 0) {
                return (33 ^ 1) & ((75 ^ 107) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIlllIl[67];
    }

    private static boolean lIlIlllIIIIl(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIlllII[llIIlllIl[73]];
    }

    private static boolean lIlIlllIlIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    public static void ak() {
        if (lIlIlllIIIII(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[0]];
            C0001b.a(bx);
            if (lIlIlllIIIIl(bx.size(), llIIlllIl[1])) {
                System.out.println(llIIlllII[llIIlllIl[1]]);
                bv = llIIlllIl[0];
            }
        }
        if (lIlIlllIIIlI(bv ? 1 : 0) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[2])) {
            if (lIlIlllIIIlI(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlllIIIll(nearest) && lIlIlllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[3]];
                    C0000a.a(nearest);
                }
                if (lIlIlllIIIll(nearest) && lIlIlllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[4]];
                    if (lIlIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlllIl[5]);
                        "".length();
                        Time.sleepTicks(llIIlllIl[6]);
                        "".length();
                    }
                    if (lIlIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlllIl[7]);
                            "".length();
                        }
                        while (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8]) && lIlIlllIIIlI(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(llIIlllIl[1]);
                            "".length();
                            "".length();
                            if ("   ".length() < " ".length()) {
                                return;
                            }
                        }
                        if (lIlIlllIIIlI(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlllII[llIIlllIl[7]]);
                            bv = llIIlllIl[1];
                            return;
                        }
                        if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
                            int[] iArr = new int[llIIlllIl[1]];
                            iArr[llIIlllIl[0]] = llIIlllIl[9];
                            if (lIlIlllIIIII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIlllIl[1]];
                                iArr2[llIIlllIl[0]] = llIIlllIl[9];
                                if (lIlIlllIIIIl(Inventory.getCount(iArr2), llIIlllIl[1])) {
                                    Bank.withdraw(llIIlllIl[9], llIIlllIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[llIIlllIl[1]];
                                        iArr3[llIIlllIl[0]] = llIIlllIl[9];
                                        if (lIlIlllIIlII(Inventory.getCount(iArr3))) {
                                            ?? r0 = llIIlllIl[1];
                                            "".length();
                                            return (-"  ".length()) > 0 ? ("   ".length() ^ (33 ^ 114)) & (((125 ^ 82) ^ (((3 + 86) - (-30)) + 8)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIlllIl[0];
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[llIIlllIl[1]];
                            iArr3[llIIlllIl[0]] = llIIlllIl[11];
                            if (lIlIlllIIIII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIIlllIl[1]];
                                iArr4[llIIlllIl[0]] = llIIlllIl[11];
                                if (lIlIlllIIIIl(Inventory.getCount(iArr4), llIIlllIl[1])) {
                                    Bank.withdraw(llIIlllIl[11], llIIlllIl[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[llIIlllIl[1]];
                                        iArr5[llIIlllIl[0]] = llIIlllIl[11];
                                        if (lIlIlllIIlII(Inventory.getCount(iArr5))) {
                                            ?? r0 = llIIlllIl[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIlllIl[0];
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[llIIlllIl[1]];
                            iArr5[llIIlllIl[0]] = llIIlllIl[13];
                            if (lIlIlllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIIlllIl[1]];
                                iArr6[llIIlllIl[0]] = llIIlllIl[13];
                                if (lIlIlllIIIIl(Inventory.getCount(iArr6), llIIlllIl[1])) {
                                    Bank.withdraw(llIIlllIl[13], llIIlllIl[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[llIIlllIl[1]];
                                        iArr7[llIIlllIl[0]] = llIIlllIl[13];
                                        if (lIlIlllIIlII(Inventory.getCount(iArr7))) {
                                            ?? r0 = llIIlllIl[1];
                                            "".length();
                                            return ((((73 + 149) - 77) + 11) ^ (((85 + 123) - 68) + 12)) == (-" ".length()) ? ((((85 + 156) - 197) + 171) ^ (((139 + 174) - 273) + 159)) & (((((108 + 101) - 194) + 124) ^ (((30 + 33) - 44) + 136)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIlllIl[0];
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[llIIlllIl[1]];
                            iArr7[llIIlllIl[0]] = llIIlllIl[14];
                            if (lIlIlllIIIII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIIlllIl[1]];
                                iArr8[llIIlllIl[0]] = llIIlllIl[14];
                                if (lIlIlllIIIIl(Inventory.getCount(iArr8), llIIlllIl[1])) {
                                    Bank.withdraw(llIIlllIl[14], llIIlllIl[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[llIIlllIl[1]];
                                        iArr9[llIIlllIl[0]] = llIIlllIl[14];
                                        if (lIlIlllIIlII(Inventory.getCount(iArr9))) {
                                            ?? r0 = llIIlllIl[1];
                                            "".length();
                                            return ((30 ^ 11) & ((58 ^ 47) ^ (-1))) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIlllIl[0];
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[llIIlllIl[1]];
                            iArr9[llIIlllIl[0]] = llIIlllIl[16];
                            if (lIlIlllIIIII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llIIlllIl[1]];
                                iArr10[llIIlllIl[0]] = llIIlllIl[16];
                                if (lIlIlllIIIIl(Inventory.getCount(iArr10), llIIlllIl[1])) {
                                    Bank.withdraw(llIIlllIl[16], llIIlllIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[llIIlllIl[1]];
                                        iArr11[llIIlllIl[0]] = llIIlllIl[16];
                                        if (lIlIlllIIlII(Inventory.getCount(iArr11))) {
                                            ?? r0 = llIIlllIl[1];
                                            "".length();
                                            return (-" ".length()) > "   ".length() ? ((239 ^ 163) ^ "  ".length()) & (((104 ^ 42) ^ (106 ^ 102)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIlllIl[0];
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[llIIlllIl[1]];
                            iArr11[llIIlllIl[0]] = llIIlllIl[17];
                            if (lIlIlllIIIII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIIlllIl[1]];
                                iArr12[llIIlllIl[0]] = llIIlllIl[17];
                                if (lIlIlllIIIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(llIIlllIl[17], llIIlllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llIIlllIl[1]];
                                        iArr13[llIIlllIl[0]] = llIIlllIl[17];
                                        return Inventory.contains(iArr13);
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(llIIlllIl[18], llIIlllIl[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[llIIlllIl[1]];
                            iArr13[llIIlllIl[0]] = llIIlllIl[20];
                            if (lIlIlllIIIII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llIIlllIl[1]];
                                iArr14[llIIlllIl[0]] = llIIlllIl[20];
                                if (lIlIlllIIIIl(Inventory.getCount(iArr14), llIIlllIl[1]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21])) {
                                    Bank.withdrawAll(llIIlllIl[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llIIlllIl[1]];
                                        iArr15[llIIlllIl[0]] = llIIlllIl[20];
                                        if (lIlIlllIIlII(Inventory.getCount(iArr15))) {
                                            ?? r0 = llIIlllIl[1];
                                            "".length();
                                            return (-" ".length()) >= (((175 ^ 145) ^ (19 ^ 62)) & (((((165 + 67) - 204) + 140) ^ (((113 + 128) - 61) + 7)) ^ (-" ".length()))) ? ((((9 + 84) - 13) + 87) ^ (((41 + 38) - 18) + 87)) & (((249 ^ 153) ^ (231 ^ 180)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIlllIl[0];
                                    }, llIIlllIl[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
                            int[] iArr15 = new int[llIIlllIl[1]];
                            iArr15[llIIlllIl[0]] = llIIlllIl[22];
                            if (lIlIlllIIIlI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llIIlllIl[22], llIIlllIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIIlllIl[1]);
                                "".length();
                            }
                            if (lIlIlllIIIII(ck ? 1 : 0)) {
                                Bank.withdrawAll(llIIlllIl[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIIlllIl[1]);
                                "".length();
                                Bank.withdrawAll(llIIlllIl[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIIlllIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(llIIlllIl[4]);
                            "".length();
                            Bank.withdrawAll(llIIlllIl[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIIlllIl[1]);
                            "".length();
                            Bank.withdrawAll(llIIlllIl[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(llIIlllIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIlllIIIII(an() ? 1 : 0)) {
                if (lIlIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21])) {
                    if (lIlIlllIIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlllII[llIIlllIl[19]];
                        Movement.walkTo(cm);
                        "".length();
                        Time.sleepTicks(llIIlllIl[1]);
                        "".length();
                    }
                    if (lIlIlllIIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlllII[llIIlllIl[6]];
                        am();
                    }
                }
                if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[21]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[26])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[27]];
                    if (lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(llIIlllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[26]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[29])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[30]];
                    if (lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(llIIlllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[29]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[31])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[32]];
                    if (lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(llIIlllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[31]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[33]];
                    if (lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(llIIlllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[8])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[34]];
                    if (lIlIlllIIlll(cn)) {
                        cn = new WorldPoint(llIIlllIl[35] + C0004e.c(llIIlllIl[1], llIIlllIl[7]), llIIlllIl[36], llIIlllIl[0]);
                    }
                    int[] iArr16 = new int[llIIlllIl[1]];
                    iArr16[llIIlllIl[0]] = llIIlllIl[22];
                    if (lIlIlllIIIII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIIlllIl[1]];
                        iArr17[llIIlllIl[0]] = llIIlllIl[22];
                        if (lIlIlllIIIlI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIIlllIl[1]];
                            iArr18[llIIlllIl[0]] = llIIlllIl[22];
                            Inventory.getFirst(iArr18).interact(llIIlllII[llIIlllIl[37]]);
                            Time.sleepTicks(llIIlllIl[1]);
                            "".length();
                        }
                    }
                    if (lIlIlllIIIII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[llIIlllIl[1]];
                    iArr19[llIIlllIl[0]] = llIIlllIl[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[llIIlllIl[1]];
                    iArr20[llIIlllIl[0]] = llIIlllIl[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlIlllIIIlI(ck ? 1 : 0) && lIlIlllIIIll(cn)) {
                        if (lIlIlllIIIlI(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlllII[llIIlllIl[39]];
                            Movement.walkTo(cn);
                            "".length();
                            Time.sleepTicks(llIIlllIl[1]);
                            "".length();
                        }
                        if (lIlIlllIIIII(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0) && lIlIlllIIIll(first) && lIlIlllIIIll(first2) && lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIlllIlIll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = llIIlllIl[1];
                                    "".length();
                                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlllIl[0];
                            }, llIIlllIl[10]);
                            "".length();
                        }
                    }
                    if (lIlIlllIIIII(ck ? 1 : 0)) {
                        if (lIlIlllIIIll(first) && lIlIlllIIIll(first2) && lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIlllIlIll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = llIIlllIl[1];
                                    "".length();
                                    return (((34 ^ 111) ^ (219 ^ 139)) & (((11 ^ 60) ^ (46 ^ 4)) ^ (-" ".length()))) >= ((185 ^ 182) ^ (69 ^ 78)) ? ((((48 + 149) - 152) + 130) ^ (((96 + 139) - 147) + 83)) & (((110 ^ 100) ^ (78 ^ 64)) ^ (-" ".length())) : r0;
                                }
                                return llIIlllIl[0];
                            }, llIIlllIl[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                                ?? r0 = llIIlllIl[1];
                                "".length();
                                return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIlllIl[0];
                        }, llIIlllIl[40]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIlIllIlllll();
        lIlIllIllllI();
        ck = llIIlllIl[0];
        bx = new ArrayList();
        cl = new WorldArea(llIIlllIl[76], llIIlllIl[77], llIIlllIl[51], llIIlllIl[41], llIIlllIl[0]);
        cm = new WorldPoint(llIIlllIl[78], llIIlllIl[79], llIIlllIl[0]);
        cn = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (lIlIlllIIllI(Vars.getBit(llIIlllIl[48]), llIIlllIl[1]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[19])) {
            return llIIlllIl[1];
        }
        if (lIlIlllIIllI(Vars.getBit(llIIlllIl[48]), llIIlllIl[3]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[32]) && lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[19])) {
            return llIIlllIl[1];
        }
        if (lIlIlllIIllI(Vars.getBit(llIIlllIl[48]), llIIlllIl[4]) && lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[32]) && lIlIlllIIIIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[39])) {
            return llIIlllIl[1];
        }
        if (lIlIlllIIllI(Vars.getBit(llIIlllIl[48]), llIIlllIl[4]) && lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[32])) {
            int[] iArr = new int[llIIlllIl[1]];
            iArr[llIIlllIl[0]] = llIIlllIl[14];
            if (lIlIlllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                return llIIlllIl[1];
            }
        }
        if (lIlIlllIIllI(Vars.getBit(llIIlllIl[48]), llIIlllIl[7]) && lIlIlllIIlIl(Skills.getLevel(Skill.MAGIC), llIIlllIl[39])) {
            int[] iArr2 = new int[llIIlllIl[1]];
            iArr2[llIIlllIl[0]] = llIIlllIl[14];
            if (lIlIlllIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIIlllIl[1];
            }
        }
        return llIIlllIl[0];
    }

    private static String lIlIllIllIll(String lIIllllllIlIIl, String lIIllllllIlIII) {
        String str = new String(Base64.getDecoder().decode(lIIllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllllIIlll = new StringBuilder();
        char[] lIIllllllIIllI = lIIllllllIlIII.toCharArray();
        int lIIllllllIIlIl = llIIlllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlllIl[0];
        while (lIlIlllIIIIl(i, length)) {
            lIIllllllIIlll.append((char) (charArray[i] ^ lIIllllllIIllI[lIIllllllIIlIl % lIIllllllIIllI.length]));
            "".length();
            lIIllllllIIlIl++;
            i++;
            "".length();
            if (((207 ^ 129) ^ (236 ^ 166)) != ((((28 + 130) - 23) + 16) ^ (((119 + 100) - 201) + 129))) {
                return null;
            }
        }
        return String.valueOf(lIIllllllIIlll);
    }

    private static void lIlIllIllllI() {
        llIIlllII = new String[llIIlllIl[80]];
        llIIlllII[llIIlllIl[0]] = lIlIllIllIll("KDc6EAYNYioNDQcx", "jBCyh");
        llIIlllII[llIIlllIl[1]] = lIlIllIlllII("oHqLRQ1Q9EwH+KMMRdipal+6L4acxWq2K1xmszJM6ecnYJCi0PNfysGSwl4SMg30EHt/dQEEIZ0=", "cxdYg");
        llIIlllII[llIIlllIl[3]] = lIlIllIlllII("h0bkzoQe5a9g2EjnNY37pJNGIhPM8M4+", "lLCdv");
        llIIlllII[llIIlllIl[4]] = lIlIllIlllII("m6ZPR7Gi/mPf9zq7zNb7Cmm3kezqhcpD", "noZIt");
        llIIlllII[llIIlllIl[7]] = lIlIllIlllII("osKHwNqZuKGXScF14UwmrWTK21AcO8Nkek61ouWYSQmoNz1DutHRT2N2vJyvVrQb", "UPPNI");
        llIIlllII[llIIlllIl[19]] = lIlIllIlllIl("258CwfqnhHcfNZ4jnlbJJQ==", "pdZnT");
        llIIlllII[llIIlllIl[6]] = lIlIllIllIll("DSMwDwQnPioJRy84Mx0=", "LWDng");
        llIIlllII[llIIlllIl[27]] = lIlIllIllIll("KwA+ISYGBm0jLhoTIjYkSBUoOSo=", "haMUO");
        llIIlllII[llIIlllIl[30]] = lIlIllIlllIl("wNp7hLus6MHrvCTutaxMTQVeR0E4sJPd", "MkszH");
        llIIlllII[llIIlllIl[32]] = lIlIllIllIll("MCsADg0dLVMcBR8mCloQFiYW", "sJszd");
        llIIlllII[llIIlllIl[33]] = lIlIllIlllII("zQndLi5ogqhTSauAXo9rQrqxh9j1il8y", "oyzpY");
        llIIlllII[llIIlllIl[34]] = lIlIllIllIll("CToNCywmMQ==", "HVncE");
        llIIlllII[llIIlllIl[37]] = lIlIllIlllIl("nbzLkYembUA=", "tQjkr");
        llIIlllII[llIIlllIl[39]] = lIlIllIlllIl("tTWi4wmmkfZpzbcWuv3w71QnfvTM6Dt8", "jONhm");
        llIIlllII[llIIlllIl[41]] = lIlIllIlllIl("vl3ExiCqG0B6ilWtAO3WmA==", "iILWy");
        llIIlllII[llIIlllIl[42]] = lIlIllIlllII("bG5B1okli8hNo+1xtl9seg==", "wBpqh");
        llIIlllII[llIIlllIl[43]] = lIlIllIlllIl("k6hWygbDLzc=", "oWARy");
        llIIlllII[llIIlllIl[44]] = lIlIllIllIll("IiI8", "aMKOE");
        llIIlllII[llIIlllIl[45]] = lIlIllIllIll("Aj0U", "aRcEh");
        llIIlllII[llIIlllIl[47]] = lIlIllIlllIl("nWyG+NCO1kU=", "ahzPs");
        llIIlllII[llIIlllIl[51]] = lIlIllIllIll("AzMoIh4iJG0tAjgsLi0EOA==", "LCMLw");
        llIIlllII[llIIlllIl[52]] = lIlIllIlllIl("hXmluKARKlEqnODAlJfzHA==", "jpmEN");
        llIIlllII[llIIlllIl[54]] = lIlIllIllIll("EwcKJW0XGhYoJiE=", "DndAM");
        llIIlllII[llIIlllIl[55]] = lIlIllIlllII("gV1a9oj5po1pT+ynhJ0+UA==", "MYSmV");
        llIIlllII[llIIlllIl[56]] = lIlIllIlllII("U1JaYvqXlb3M67nRqhtibA==", "PrRNW");
        llIIlllII[llIIlllIl[21]] = lIlIllIllIll("ABsoJx1lKS4hHC4f", "EzZSu");
        llIIlllII[llIIlllIl[50]] = lIlIllIlllIl("gdxs0zEdp4/IuHc4s/27sQ==", "fnxOG");
        llIIlllII[llIIlllIl[73]] = lIlIllIlllII("ha3duHaV42KJuLlfqpKxbA==", "eAWav");
        llIIlllII[llIIlllIl[74]] = lIlIllIlllIl("34PwD8IYoq038b3LNbf9xZq3W9dW42Qu", "waewX");
        llIIlllII[llIIlllIl[75]] = lIlIllIlllIl("AYynZJgvpMc=", "UKwwv");
    }
}

package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.G  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/G.class */
public class G implements F {
    private static /* synthetic */ WorldPoint iA;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] lIlllIII;
    static /* synthetic */ WorldArea iy;
    static /* synthetic */ WorldArea iz;
    public static /* synthetic */ int iw;
    public static /* synthetic */ int iu;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ int iv;
    private static /* synthetic */ String[] lIllIlIl;
    static /* synthetic */ WorldArea ix;

    private static boolean lIIllIlIIIl(Object obj) {
        return obj != null;
    }

    private static void co() {
        new WorldArea(lIlllIII[46], lIlllIII[47], lIlllIII[12], lIlllIII[20], lIlllIII[0]);
        WorldArea worldArea = new WorldArea(lIlllIII[46], lIlllIII[48], lIlllIII[49], lIlllIII[24], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[46], lIlllIII[50], lIlllIII[49], lIlllIII[24], lIlllIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[51], lIlllIII[52], lIlllIII[53], lIlllIII[54], lIlllIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[55], lIlllIII[56], lIlllIII[24], lIlllIII[12], lIlllIII[3]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[57], lIlllIII[58], lIlllIII[49], lIlllIII[12], lIlllIII[0]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[59], lIlllIII[60], lIlllIII[12], lIlllIII[20], lIlllIII[0]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[46], lIlllIII[47], lIlllIII[61], lIlllIII[20], lIlllIII[0]);
        if (lIIllIlIIII(ix.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[12]];
            C0004e.b(iA);
            Time.sleepTicks(lIlllIII[1]);
            "".length();
        }
        if (!(lIIllIlIIII(ix.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIllIIlllI(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIllIlIlIl(Players.getLocal().getAnimation(), lIlllIII[62]) && lIIllIlIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIIllIIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[49]];
                String[] strArr = new String[lIlllIII[1]];
                strArr[lIlllIII[0]] = lIllIlIl[lIlllIII[63]];
                TileObjects.getNearest(strArr).interact(lIllIlIl[lIlllIII[64]]);
                Time.sleepTicks(lIlllIII[3]);
                "".length();
            }
            if (lIIllIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[53]];
                String[] strArr2 = new String[lIlllIII[1]];
                strArr2[lIlllIII[0]] = lIllIlIl[lIlllIII[38]];
                TileObjects.getNearest(strArr2).interact(lIllIlIl[lIlllIII[65]]);
                Time.sleepTicks(lIlllIII[3]);
                "".length();
            }
            if (lIIllIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[66]];
                String[] strArr3 = new String[lIlllIII[1]];
                strArr3[lIlllIII[0]] = lIllIlIl[lIlllIII[54]];
                TileObjects.getNearest(strArr3).interact(lIllIlIl[lIlllIII[67]]);
                Time.sleepTicks(lIlllIII[3]);
                "".length();
            }
            if (lIIllIIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[40]];
                String[] strArr4 = new String[lIlllIII[1]];
                strArr4[lIlllIII[0]] = lIllIlIl[lIlllIII[68]];
                TileObjects.getNearest(strArr4).interact(lIllIlIl[lIlllIII[61]]);
                Time.sleepTicks(lIlllIII[2]);
                "".length();
            }
            if (lIIllIIlllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[69]];
                String[] strArr5 = new String[lIlllIII[1]];
                strArr5[lIlllIII[0]] = lIllIlIl[lIlllIII[70]];
                TileObjects.getNearest(strArr5).interact(lIllIlIl[lIlllIII[41]]);
                Time.sleepTicks(lIlllIII[17]);
                "".length();
            }
            if (lIIllIIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[71]];
                String[] strArr6 = new String[lIlllIII[1]];
                strArr6[lIlllIII[0]] = lIllIlIl[lIlllIII[72]];
                TileObjects.getNearest(strArr6).interact(lIllIlIl[lIlllIII[73]]);
                Time.sleepTicks(lIlllIII[10]);
                "".length();
            }
            if (lIIllIIlllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[74]];
                String[] strArr7 = new String[lIlllIII[1]];
                strArr7[lIlllIII[0]] = lIllIlIl[lIlllIII[42]];
                TileObjects.getNearest(strArr7).interact(lIllIlIl[lIlllIII[75]]);
                Time.sleepTicks(lIlllIII[17]);
                "".length();
            }
        }
    }

    private static boolean lIIllIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIllIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllIIlllI(int i) {
        return i != 0;
    }

    private static boolean lIIllIlIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIlllIII[0];
    }

    private static boolean lIIllIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIllllIl(String lIllIIIIIIIIlII, String lIllIIIIIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIIIIIIllI = Cipher.getInstance("Blowfish");
            lIllIIIIIIIIllI.init(lIlllIII[3], secretKeySpec);
            return new String(lIllIIIIIIIIllI.doFinal(Base64.getDecoder().decode(lIllIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIIIIIlIl) {
            lIllIIIIIIIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIIllIlIlII(Skills.getLevel(Skill.AGILITY), lIlllIII[2])) {
            ?? r0 = lIlllIII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIII[0];
    }

    static {
        lIIllIIllIl();
        lIIllIIlIIl();
        bB = new ArrayList();
        iu = lIlllIII[27];
        iv = lIlllIII[23];
        ix = new WorldArea(lIlllIII[235], lIlllIII[52], lIlllIII[69], lIlllIII[72], lIlllIII[0]);
        iy = new WorldArea(lIlllIII[235], lIlllIII[52], lIlllIII[69], lIlllIII[72], lIlllIII[1]);
        iz = new WorldArea(lIlllIII[235], lIlllIII[52], lIlllIII[69], lIlllIII[72], lIlllIII[3]);
        iA = new WorldPoint(lIlllIII[236], lIlllIII[237], lIlllIII[0]);
    }

    private static boolean lIIllIIllll(int i, int i2) {
        return i < i2;
    }

    private static void cr() {
        WorldArea worldArea = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[162], lIlllIII[163], lIlllIII[111], lIlllIII[111], lIlllIII[10]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[164], lIlllIII[133], lIlllIII[64], lIlllIII[12], lIlllIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[165], lIlllIII[139], lIlllIII[38], lIlllIII[53], lIlllIII[3]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[166], lIlllIII[134], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[167], lIlllIII[136], lIlllIII[70], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[168], lIlllIII[169], lIlllIII[54], lIlllIII[63], lIlllIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIlllIII[170], lIlllIII[171], lIlllIII[0]);
        if (lIIllIIlllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIllIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlllIII[1]);
            "".length();
        }
        if (lIIllIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlllIII[1]);
                "".length();
            }
            if (lIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIlllIII[1]];
                strArr[lIlllIII[0]] = lIllIlIl[lIlllIII[175]];
                TileObjects.getNearest(strArr).interact(lIllIlIl[lIlllIII[35]]);
                Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                }, lIlllIII[104]);
                "".length();
                Time.sleepTicks(lIlllIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIlllIII[1]];
        strArr2[lIlllIII[0]] = lIllIlIl[lIlllIII[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIllIlIIIl(nearest) && lIIllIIlllI(cs() ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[177]];
            System.out.println(lIllIlIl[lIlllIII[178]]);
            nearest.interact(lIllIlIl[lIlllIII[179]]);
            Time.sleepTicks(lIlllIII[10]);
            "".length();
        }
        if (lIIllIlIIII(cs() ? 1 : 0)) {
            if (lIIllIIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[218]]) ? 1 : 0) && lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[219], lIlllIII[220], lIlllIII[10])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[180]];
                    nearest2.interact(lIllIlIl[lIlllIII[79]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIllIIlllI(tileObject2.getName().contains(lIllIlIl[lIlllIII[216]]) ? 1 : 0) && lIIllIlIllI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[217], lIlllIII[128], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return 0 != 0 ? ((224 ^ 190) ^ (56 ^ 80)) & (((165 ^ 160) ^ (139 ^ 184)) ^ (-" ".length())) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest3)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIllIlIl[lIlllIII[182]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return ((163 ^ 130) ^ (97 ^ 68)) < " ".length() ? ((((61 + 98) - 95) + 103) ^ (((64 + 19) - 28) + 113)) & (((135 ^ 138) ^ "  ".length()) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIllIIlllI(tileObject3.getName().contains(lIllIlIl[lIlllIII[213]]) ? 1 : 0) && lIIllIlIllI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[214], lIlllIII[215], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return ((19 ^ 63) & ((29 ^ 49) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest4)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIllIlIl[lIlllIII[184]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIllIIlllI(tileObject4.getName().contains(lIllIlIl[lIlllIII[211]]) ? 1 : 0) && lIIllIlIllI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[209], lIlllIII[212], lIlllIII[10])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest5)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIllIlIl[lIlllIII[186]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (!lIIllIIlllI(cs() ? 1 : 0) && lIIllIIlllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIllIIlllI(tileObject5.getName().contains(lIllIlIl[lIlllIII[208]]) ? 1 : 0) && lIIllIlIllI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[209], lIlllIII[210], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest6)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIllIlIl[lIlllIII[188]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIllIlIIll(int i) {
        return i > 0;
    }

    private static String lIIlIlllIll(String lIllIIIIIIlIIIl, String lIllIIIIIIlIIII) {
        try {
            SecretKeySpec lIllIIIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIlllIII[24]), "DES");
            Cipher lIllIIIIIIlIIll = Cipher.getInstance("DES");
            lIllIIIIIIlIIll.init(lIlllIII[3], lIllIIIIIIlIlII);
            return new String(lIllIIIIIIlIIll.doFinal(Base64.getDecoder().decode(lIllIIIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIIIlIIlI) {
            lIllIIIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            cn();
            "".length();
            if ("  ".length() < 0) {
                return (156 ^ 169) & ((30 ^ 43) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlllIII[186];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void cn() {
        if (lIIllIIlllI(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[0]];
            C0001b.a(bB);
            if (lIIllIIllll(bB.size(), lIlllIII[1])) {
                System.out.println(lIllIlIl[lIlllIII[1]]);
                bz = lIlllIII[0];
            }
        }
        if (lIIllIlIIII(bz ? 1 : 0) && lIIllIIllll(Skills.getLevel(Skill.AGILITY), lIlllIII[2])) {
            if (lIIllIlIIII(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIlIIIl(nearest) && lIIllIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[3]];
                    if (lIIllIIlllI(new WorldArea(lIlllIII[4], lIlllIII[5], lIlllIII[6], lIlllIII[7], lIlllIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIlllIII[8], lIlllIII[9], lIlllIII[0]);
                        if (lIIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlllIII[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIlllIII[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIIllIlIIIl(nearest) && lIIllIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[10]];
                    if (lIIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIII[11]);
                        "".length();
                    }
                    if (lIIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIII[1]);
                            "".length();
                        }
                        if (lIIllIlIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIII[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIlllIII[12]];
                    iArr[lIlllIII[0]] = lIlllIII[13];
                    iArr[lIlllIII[1]] = lIlllIII[14];
                    iArr[lIlllIII[3]] = lIlllIII[15];
                    iArr[lIlllIII[10]] = lIlllIII[16];
                    iArr[lIlllIII[17]] = lIlllIII[18];
                    iArr[lIlllIII[2]] = lIlllIII[19];
                    iArr[lIlllIII[20]] = lIlllIII[21];
                    iArr[lIlllIII[22]] = lIlllIII[23];
                    iArr[lIlllIII[24]] = lIlllIII[25];
                    iArr[lIlllIII[26]] = lIlllIII[27];
                    if (lIIllIlIIII(C0004e.b(iArr) ? 1 : 0)) {
                        ag();
                        System.out.println(lIllIlIl[lIlllIII[17]]);
                        bz = lIlllIII[1];
                        return;
                    }
                    int[] iArr2 = new int[lIlllIII[12]];
                    iArr2[lIlllIII[0]] = lIlllIII[13];
                    iArr2[lIlllIII[1]] = lIlllIII[14];
                    iArr2[lIlllIII[3]] = lIlllIII[15];
                    iArr2[lIlllIII[10]] = lIlllIII[16];
                    iArr2[lIlllIII[17]] = lIlllIII[18];
                    iArr2[lIlllIII[2]] = lIlllIII[19];
                    iArr2[lIlllIII[20]] = lIlllIII[21];
                    iArr2[lIlllIII[22]] = lIlllIII[23];
                    iArr2[lIlllIII[24]] = lIlllIII[25];
                    iArr2[lIlllIII[26]] = lIlllIII[27];
                    if (lIIllIIlllI(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIlllIII[28], lIlllIII[1]);
                        C0000a.a(lIlllIII[29], lIlllIII[1]);
                        C0000a.a(lIlllIII[30], lIlllIII[1]);
                        C0000a.a(lIlllIII[31], lIlllIII[1]);
                        C0000a.a(lIlllIII[32], lIlllIII[1]);
                        C0000a.a(lIlllIII[33], lIlllIII[1]);
                        C0000a.a(lIlllIII[34], lIlllIII[1]);
                        int[] iArr3 = new int[lIlllIII[1]];
                        iArr3[lIlllIII[0]] = lIlllIII[28];
                        if (lIIllIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlllIII[1]];
                            iArr4[lIlllIII[0]] = lIlllIII[28];
                            if (lIIllIlIIII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIlllIII[1]];
                                iArr5[lIlllIII[0]] = lIlllIII[28];
                                if (lIIllIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIlllIII[35], lIlllIII[1]);
                                }
                            }
                        }
                        C0000a.a(lIlllIII[18], lIlllIII[1]);
                        C0004e.l(lIlllIII[28]);
                        C0004e.l(lIlllIII[29]);
                        C0004e.l(lIlllIII[30]);
                        C0004e.l(lIlllIII[31]);
                        C0004e.l(lIlllIII[32]);
                        Time.sleepTicks(lIlllIII[1]);
                        "".length();
                        C0004e.l(lIlllIII[34]);
                        C0004e.l(lIlllIII[36]);
                        C0004e.l(lIlllIII[33]);
                        C0004e.l(lIlllIII[35]);
                        C0004e.l(lIlllIII[18]);
                        Time.sleepTicks(lIlllIII[10]);
                        "".length();
                        if (lIIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIlllIII[20]);
                            "".length();
                        }
                        if (lIIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                            if (lIIllIIllll(Skills.getLevel(Skill.AGILITY), lIlllIII[37])) {
                                C0000a.a(lIlllIII[13], lIlllIII[12]);
                                C0000a.a(lIlllIII[14], lIlllIII[12]);
                                C0000a.a(lIlllIII[21], lIlllIII[12]);
                                C0000a.a(lIlllIII[15], lIlllIII[12]);
                                C0000a.b(C0005f.bl, lIlllIII[1]);
                                C0000a.a(lIlllIII[27], lIlllIII[1]);
                                C0000a.a(lIlllIII[19], lIlllIII[2]);
                                C0000a.a(lIlllIII[23], lIlllIII[38]);
                            }
                            if (lIIllIlIlII(Skills.getLevel(Skill.AGILITY), lIlllIII[37])) {
                                C0000a.a(lIlllIII[13], lIlllIII[12]);
                                C0000a.a(lIlllIII[21], lIlllIII[12]);
                                C0000a.a(lIlllIII[25], lIlllIII[12]);
                                C0000a.b(C0005f.bl, lIlllIII[1]);
                                C0000a.a(lIlllIII[27], lIlllIII[1]);
                                C0000a.a(lIlllIII[19], lIlllIII[24]);
                                C0000a.a(lIlllIII[23], lIlllIII[12]);
                            }
                        }
                    }
                }
            }
            if (lIIllIIlllI(ac() ? 1 : 0)) {
                String[] strArr = new String[lIlllIII[1]];
                strArr[lIlllIII[0]] = lIllIlIl[lIlllIII[2]];
                if (lIIllIIlllI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlllIII[1]];
                    strArr2[lIlllIII[0]] = lIllIlIl[lIlllIII[20]];
                    Inventory.getFirst(strArr2).interact(lIllIlIl[lIlllIII[22]]);
                }
                if (lIIllIIlllI(Inventory.contains(C0005f.bb) ? 1 : 0) && lIIllIIllll(Movement.getRunEnergy(), lIlllIII[39])) {
                    Inventory.getFirst(C0005f.bb).interact(lIllIlIl[lIlllIII[24]]);
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIlIIlI(Combat.getMissingHealth(), lIlllIII[40])) {
                    int[] iArr6 = new int[lIlllIII[1]];
                    iArr6[lIlllIII[0]] = lIlllIII[23];
                    if (lIIllIIlllI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlllIII[1]];
                        iArr7[lIlllIII[0]] = lIlllIII[23];
                        Inventory.getFirst(iArr7).interact(lIllIlIl[lIlllIII[26]]);
                        Time.sleepTicks(lIlllIII[3]);
                        "".length();
                    }
                }
                if (lIIllIlIIlI(Movement.getRunEnergy(), lIlllIII[41]) && lIIllIlIIII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIIllIIllll(Skills.getLevel(Skill.AGILITY), lIlllIII[42])) {
                    co();
                }
                if ((!lIIllIlIlII(C0004e.j(lIlllIII[43]), lIlllIII[44]) || lIIllIIllll(C0004e.j(lIlllIII[45]), lIlllIII[2])) && lIIllIlIlII(Skills.getLevel(Skill.AGILITY), lIlllIII[42]) && lIIllIIllll(Skills.getLevel(Skill.AGILITY), lIlllIII[44])) {
                    cp();
                }
                if (lIIllIlIlII(C0004e.j(lIlllIII[43]), lIlllIII[44]) && lIIllIlIlII(C0004e.j(lIlllIII[45]), lIlllIII[2])) {
                    if (lIIllIlIlII(Skills.getLevel(Skill.AGILITY), lIlllIII[42]) && lIIllIIllll(Skills.getLevel(Skill.AGILITY), lIlllIII[37])) {
                        cp();
                    }
                    if (lIIllIlIlII(Skills.getLevel(Skill.AGILITY), lIlllIII[37]) && lIIllIIllll(Skills.getLevel(Skill.AGILITY), lIlllIII[44])) {
                        cq();
                    }
                }
                if (lIIllIlIlII(Skills.getLevel(Skill.AGILITY), lIlllIII[44])) {
                    cr();
                }
            }
        }
    }

    private static void lIIllIIlIIl() {
        lIllIlIl = new String[lIlllIII[238]];
        lIllIlIl[lIlllIII[0]] = lIIlIlllIll("qwpNqffto+pyY50FzwoPDw==", "AUXdi");
        lIllIlIl[lIlllIII[1]] = lIIlIllllII("PxogLDcRFiplJgwKJysjWRo6ICkKX242MxAHLS0tFxRuJyUaGG4xK1kSKSwoEAc3", "ysNED");
        lIllIlIl[lIlllIII[3]] = lIIlIllllIl("gl68Szb5dVHKeCgT5pr8Uypp6+TlvURz", "smlIE");
        lIllIlIl[lIlllIII[10]] = lIIlIllllII("KyABLzkKLwhrNwIvBCI7BA==", "cAoKU");
        lIllIlIl[lIlllIII[17]] = lIIlIllllII("JSRqMTMXYSc5MgEoJDdhAzQvIzVSMj8gMR4oLyNtUjI9OTURKSM+JlI1JXADJxgDHgY=", "rAJPA");
        lIllIlIl[lIlllIII[2]] = lIIlIlllIll("6383vEVI91Q=", "BHUjr");
        lIllIlIl[lIlllIII[20]] = lIIlIllllII("OBwnPQ==", "nuFQW");
        lIllIlIl[lIlllIII[22]] = lIIlIllllIl("u4aMwdNk/uM=", "giLRq");
        lIllIlIl[lIlllIII[24]] = lIIlIlllIll("eb8ZWvHqZuk=", "mRNpa");
        lIllIlIl[lIlllIII[26]] = lIIlIlllIll("YmzXHiXIGIk=", "cnGbf");
        lIllIlIl[lIlllIII[12]] = lIIlIlllIll("C/SveY3rvQ0Kv2q5fJx1N2WeChEJRX5X", "MBgQs");
        lIllIlIl[lIlllIII[49]] = lIIlIllllIl("TwfP2nMlzfNruiu4RA5gBQ==", "RRXMI");
        lIllIlIl[lIlllIII[63]] = lIIlIllllIl("jhKd5asvHGMGJtMEd4DsYw==", "UIaMP");
        lIllIlIl[lIlllIII[64]] = lIIlIllllIl("Pmmsb9m1UQTddB0JNVTQaA==", "awEsU");
        lIllIlIl[lIlllIII[53]] = lIIlIlllIll("YGWTRiKmgknAE39IPz3gSA==", "gOhJC");
        lIllIlIl[lIlllIII[38]] = lIIlIllllIl("g6vdbxhwQZehe3OdZ4imkg==", "LZkWS");
        lIllIlIl[lIlllIII[65]] = lIIlIllllII("AT4+FRVvPSEdBQ==", "BRWxw");
        lIllIlIl[lIlllIII[66]] = lIIlIlllIll("BkWNqf7/TQ3b1ZdsMfqAaA==", "aEZca");
        lIllIlIl[lIlllIII[54]] = lIIlIllllIl("qcDihG9/N0BACHiL4M4FYg==", "Jgqop");
        lIllIlIl[lIlllIII[67]] = lIIlIllllIl("3NVwGhlg6mM=", "CtZvl");
        lIllIlIl[lIlllIII[40]] = lIIlIllllIl("jEsp1U7aN9jSc3GnsDN3hQ==", "IJCPe");
        lIllIlIl[lIlllIII[68]] = lIIlIlllIll("qUMYwZvc2NMgMDh6DZ9qBg==", "YCDqM");
        lIllIlIl[lIlllIII[61]] = lIIlIllllIl("E6gQVQta3E0=", "gvNKE");
        lIllIlIl[lIlllIII[69]] = lIIlIllllII("Ah4cATooHBJMPC4FGw==", "ArulX");
        lIllIlIl[lIlllIII[70]] = lIIlIllllIl("6zEAWoYeoCIv9EhBq1zCkQ==", "kJYlz");
        lIllIlIl[lIlllIII[41]] = lIIlIlllIll("9T02Vqk8EmsP99ZWqO5a+Q==", "TXrgN");
        lIllIlIl[lIlllIII[71]] = lIIlIlllIll("mllGoXYpOFXQcHRBQfAYng==", "BYABS");
        lIllIlIl[lIlllIII[72]] = lIIlIllllII("CzAAAC8nPhZUICEm", "DRstN");
        lIllIlIl[lIlllIII[73]] = lIIlIlllIll("LiLVj3FeisJ4kg/qmAAexA==", "aSeQM");
        lIllIlIl[lIlllIII[74]] = lIIlIllllIl("MA92f3GOempIPwlOvcW5/Q==", "qGQmg");
        lIllIlIl[lIlllIII[42]] = lIIlIllllII("ACorAygsJD1XOSY4PQ==", "OHXwI");
        lIllIlIl[lIlllIII[75]] = lIIlIllllIl("/yH8Q9wwAZIF/ZHBZw+O3g==", "qOIeS");
        lIllIlIl[lIlllIII[95]] = lIIlIllllIl("Z1eyc6eXdo/OPq5kVW/0bw==", "MuNNy");
        lIllIlIl[lIlllIII[97]] = lIIlIlllIll("3SLZiZkhw1ufVU2dyyDL+Q==", "JlUGf");
        lIllIlIl[lIlllIII[98]] = lIIlIllllII("AwQzPBgwRTU0BDw=", "WeXUv");
        lIllIlIl[lIlllIII[99]] = lIIlIllllII("NCw7HitSLi8CJFIsIFAoACw7His=", "rCNpO");
        lIllIlIl[lIlllIII[100]] = lIIlIlllIll("59JSDD7FyyU=", "Ijohe");
        lIllIlIl[lIlllIII[101]] = lIIlIllllIl("D4kI5VZGOYElhDJfnnOuyA==", "nxDkM");
        lIllIlIl[lIlllIII[102]] = lIIlIllllII("HQcRDAFvHwUHBQ==", "Ohdki");
        lIllIlIl[lIlllIII[103]] = lIIlIllllII("LhgRCwE=", "mtxfc");
        lIllIlIl[lIlllIII[37]] = lIIlIllllII("NxQ3GxkdCD9ICRgJLAAPB0Y0AQQR", "tfXhj");
        lIllIlIl[lIlllIII[105]] = lIIlIlllIll("LhL+owqm07OzGTWX5xQJFw==", "KYiOD");
        lIllIlIl[lIlllIII[106]] = lIIlIllllIl("bCF5KKXvlZg=", "DslUu");
        lIllIlIl[lIlllIII[107]] = lIIlIllllII("GS8yBic7LQ==", "UJSvN");
        lIllIlIl[lIlllIII[108]] = lIIlIllllIl("89muotG4K2E=", "DeUam");
        lIllIlIl[lIlllIII[109]] = lIIlIllllIl("zIy3Meje17g=", "kCBxs");
        lIllIlIl[lIlllIII[110]] = lIIlIlllIll("hnGol5kyJqUqWBYRpyFrhA==", "zcBKr");
        lIllIlIl[lIlllIII[111]] = lIIlIlllIll("lEDrH1+Gjsw=", "juiou");
        lIllIlIl[lIlllIII[112]] = lIIlIllllIl("p/eX+A1rW3I=", "Kxppe");
        lIllIlIl[lIlllIII[113]] = lIIlIllllIl("9CBlEqKvfCP23nLblpmabw==", "vleUC");
        lIllIlIl[lIlllIII[39]] = lIIlIllllIl("szftA7QEBkg=", "tLevI");
        lIllIlIl[lIlllIII[7]] = lIIlIllllII("Cy87Bw==", "GJZwO");
        lIllIlIl[lIlllIII[114]] = lIIlIllllIl("AxTEYot9iJTFneK03XFO/g==", "vLVkT");
        lIllIlIl[lIlllIII[116]] = lIIlIlllIll("1MNhF6XrAbw=", "riHyu");
        lIllIlIl[lIlllIII[117]] = lIIlIlllIll("N4bAh1VxYK+2o4OOM7rDeQ==", "okEuj");
        lIllIlIl[lIlllIII[119]] = lIIlIllllII("KRw5IQ==", "eyXQh");
        lIllIlIl[lIlllIII[120]] = lIIlIlllIll("x4FIXgLlIR6V1XMkZVyI+g==", "jdlWd");
        lIllIlIl[lIlllIII[122]] = lIIlIllllII("EAEGDxU9", "Xttky");
        lIllIlIl[lIlllIII[123]] = lIIlIlllIll("jfb4gUrQ5IaoLj5v10kLgMA2TDT3NBCc", "ckSGC");
        lIllIlIl[lIlllIII[124]] = lIIlIlllIll("LodsSHuI0IQ=", "gDyQJ");
        lIllIlIl[lIlllIII[44]] = lIIlIllllIl("TEvfjSY8gqwxv6HbXqXN9w==", "VuzaZ");
        lIllIlIl[lIlllIII[140]] = lIIlIllllII("OjIPei4bcxo7NBU1ECl6FzwMKCkR", "tSyZZ");
        lIllIlIl[lIlllIII[6]] = lIIlIllllII("LSkwVD8MaDUAKhE8", "cHFtK");
        lIllIlIl[lIlllIII[141]] = lIIlIllllIl("CfrYFsAip8U0p/MzGMeoyg==", "JkRcz");
        lIllIlIl[lIlllIII[142]] = lIIlIllllIl("HMytvXv9SeT6sq+NsHEzIQ==", "IdWzu");
        lIllIlIl[lIlllIII[143]] = lIIlIllllIl("/jp+oxEXM+k=", "IWEZI");
        lIllIlIl[lIlllIII[144]] = lIIlIllllIl("GmaoCxyezFhyKdugzhcScQ==", "hiyDG");
        lIllIlIl[lIlllIII[145]] = lIIlIlllIll("aV28nNRTIRmESz4pW12Cmg==", "NdgoF");
        lIllIlIl[lIlllIII[146]] = lIIlIllllII("DhcNLR5oFRkxEWgXFmMdOhcNLR4=", "HxxCz");
        lIllIlIl[lIlllIII[147]] = lIIlIllllIl("jYc4pvhMO9c=", "ZcxUb");
        lIllIlIl[lIlllIII[148]] = lIIlIllllII("JR4GIgUBDEs1DR9LWg==", "okkRl");
        lIllIlIl[lIlllIII[149]] = lIIlIllllIl("CUxXr1S3HpU=", "IACAo");
        lIllIlIl[lIlllIII[150]] = lIIlIllllII("LR8ZJiIJDVQxKhdKRg==", "gjtVK");
        lIllIlIl[lIlllIII[151]] = lIIlIlllIll("TcktfcupCIE=", "hppnD");
        lIllIlIl[lIlllIII[152]] = lIIlIlllIll("OinQ8xiU6OZm9/PaP7O5hQ==", "SAVOh");
        lIllIlIl[lIlllIII[153]] = lIIlIlllIll("sf0+CeBJCCY=", "kpVrB");
        lIllIlIl[lIlllIII[154]] = lIIlIllllIl("Qge+dNjQPfvtKC0vfIPD0g==", "EqdUe");
        lIllIlIl[lIlllIII[155]] = lIIlIlllIll("Upv+vwVDv00=", "HHufL");
        lIllIlIl[lIlllIII[156]] = lIIlIlllIll("BAxvH+WGq0ELU6II6GoMhA==", "tgVFM");
        lIllIlIl[lIlllIII[157]] = lIIlIllllIl("EQR6BUsZaVM=", "uwEfd");
        lIllIlIl[lIlllIII[158]] = lIIlIlllIll("9r2p9b1tPRM4v5iQIe6M8w==", "sUZra");
        lIllIlIl[lIlllIII[159]] = lIIlIllllII("BB8fFQ==", "Njreh");
        lIllIlIl[lIlllIII[160]] = lIIlIlllIll("EVuR1a7U67IL5+G7OZe0Xg==", "vRtxF");
        lIllIlIl[lIlllIII[161]] = lIIlIlllIll("xib+FswDp7k=", "Pohjl");
        lIllIlIl[lIlllIII[172]] = lIIlIllllIl("jmOcVJIHJiYCvbkBScbRIOvYDAKAaOUW", "fVUbs");
        lIllIlIl[lIlllIII[173]] = lIIlIlllIll("+rXtImd7b+pzQKIZOAbOdA==", "VqywP");
        lIllIlIl[lIlllIII[174]] = lIIlIllllIl("3PKUuGUAVS7zQJIjylJfeg==", "QrJoL");
        lIllIlIl[lIlllIII[175]] = lIIlIllllIl("1d8manz4Zkg=", "wCFJg");
        lIllIlIl[lIlllIII[35]] = lIIlIllllIl("aGExk9sf0qB98PVGaYPmkQ==", "gWUqt");
        lIllIlIl[lIlllIII[176]] = lIIlIlllIll("LA0TU6Mb7gwPp77clKeM8g==", "eBofp");
        lIllIlIl[lIlllIII[177]] = lIIlIllllIl("jnLWbsY3BEXB6e1GOhapLg==", "tWgaa");
        lIllIlIl[lIlllIII[178]] = lIIlIlllIll("bhWtjz7PmuXSf/+eUS+n0SOawSAthP8P", "jtbnV");
        lIllIlIl[lIlllIII[179]] = lIIlIllllII("GwMxBA==", "ObZaT");
        lIllIlIl[lIlllIII[180]] = lIIlIllllIl("SLaXlKlZUGFHCnwwSgOZOw==", "Mimtk");
        lIllIlIl[lIlllIII[79]] = lIIlIllllII("MDkBCQ==", "zLlyb");
        lIllIlIl[lIlllIII[181]] = lIIlIllllII("CQsKIiFKCwohNw==", "jyeQR");
        lIllIlIl[lIlllIII[182]] = lIIlIllllIl("MAm6Jj9bw/g=", "DtFFb");
        lIllIlIl[lIlllIII[183]] = lIIlIllllIl("qW9WGfLIqho+PTbJ1aN0Rg==", "eqSYf");
        lIllIlIl[lIlllIII[184]] = lIIlIllllIl("ybx5J2bX+IY=", "faikq");
        lIllIlIl[lIlllIII[185]] = lIIlIllllIl("18Njp6CFskHR6CmkcH0y8Q==", "hdzEm");
        lIllIlIl[lIlllIII[186]] = lIIlIlllIll("XoW6a3GfHSA=", "gbaMK");
        lIllIlIl[lIlllIII[187]] = lIIlIlllIll("lD/X6K3Pj6AWAjPmtizcyg==", "nGMrQ");
        lIllIlIl[lIlllIII[188]] = lIIlIlllIll("G56fN/u95QQ=", "flrvD");
        lIllIlIl[lIlllIII[194]] = lIIlIlllIll("IxFA4s4ing39WTn/yZWTL0rok84JwRzn", "oSWBV");
        lIllIlIl[lIlllIII[203]] = lIIlIllllII("CC0iPic9Mw==", "IJKRN");
        lIllIlIl[lIlllIII[204]] = lIIlIllllII("MhQwCw0lEA==", "BuCxl");
        lIllIlIl[lIlllIII[205]] = lIIlIllllIl("kiHfgOazDOc=", "fqKlq");
        lIllIlIl[lIlllIII[206]] = lIIlIlllIll("a2heAu9OopM=", "mzkeS");
        lIllIlIl[lIlllIII[207]] = lIIlIlllIll("YZSr4N991II=", "thNfU");
        lIllIlIl[lIlllIII[208]] = lIIlIllllIl("L9DCwcEbq00=", "yfKUe");
        lIllIlIl[lIlllIII[211]] = lIIlIllllIl("ViaZAWceyYs=", "eZOiN");
        lIllIlIl[lIlllIII[213]] = lIIlIllllII("LSI4", "jCHJH");
        lIllIlIl[lIlllIII[216]] = lIIlIlllIll("FMCa+ykWdsHHtHySzLzDbA==", "VGtxP");
        lIllIlIl[lIlllIII[218]] = lIIlIllllIl("wus7yLCXyIM=", "QirPh");
        lIllIlIl[lIlllIII[221]] = lIIlIllllII("MTAe", "vQnFI");
        lIllIlIl[lIlllIII[224]] = lIIlIllllIl("S241PpYwjpE=", "cDOBU");
        lIllIlIl[lIlllIII[226]] = lIIlIlllIll("PvNuexSITg1ThRIOC+MBdg==", "CyaES");
        lIllIlIl[lIlllIII[227]] = lIIlIllllIl("XC3zQW9gLDM=", "wuHSp");
        lIllIlIl[lIlllIII[230]] = lIIlIllllII("JDc8", "cVLyU");
        lIllIlIl[lIlllIII[232]] = lIIlIllllIl("N3vWrKqRrdI=", "IoJPC");
        lIllIlIl[lIlllIII[233]] = lIIlIllllIl("EstXcgT7vXA=", "vaZjB");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.G.lIlllIII[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.G.lIlllIII[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ag() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIlllIII[1]];
        iArr4[lIlllIII[0]] = lIlllIII[16];
        if (lIIllIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[16], lIlllIII[1], lIlllIII[195]));
            "".length();
        }
        int[] iArr5 = new int[lIlllIII[1]];
        iArr5[lIlllIII[0]] = lIlllIII[18];
        if (lIIllIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[18], lIlllIII[3], lIlllIII[196]));
            "".length();
        }
        int[] iArr6 = new int[lIlllIII[1]];
        iArr6[lIlllIII[0]] = lIlllIII[27];
        if (lIIllIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[27], lIlllIII[3], lIlllIII[196]));
            "".length();
        }
        int[] iArr7 = new int[lIlllIII[1]];
        iArr7[lIlllIII[0]] = lIlllIII[13];
        if (lIIllIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[13], lIlllIII[12], lIlllIII[197]));
            "".length();
        }
        int[] iArr8 = new int[lIlllIII[1]];
        iArr8[lIlllIII[0]] = lIlllIII[21];
        if (lIIllIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[21], lIlllIII[12], lIlllIII[198]));
            "".length();
        }
        int[] iArr9 = new int[lIlllIII[1]];
        iArr9[lIlllIII[0]] = lIlllIII[15];
        if (lIIllIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[15], lIlllIII[12], lIlllIII[198]));
            "".length();
        }
        int[] iArr10 = new int[lIlllIII[1]];
        iArr10[lIlllIII[0]] = lIlllIII[14];
        if (lIIllIlIIII(Bank.contains(iArr10) ? 1 : 0)) {
            bB.add(new C0003d(lIlllIII[14], lIlllIII[12], lIlllIII[198]));
            "".length();
        }
        int[] iArr11 = new int[lIlllIII[1]];
        iArr11[lIlllIII[0]] = lIlllIII[23];
        if (lIIllIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIlllIII[1]];
            iArr12[lIlllIII[0]] = lIlllIII[23];
            if (lIIllIIlllI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIlllIII[1]];
                iArr13[lIlllIII[0]] = lIlllIII[23];
            }
            iArr = new int[lIlllIII[1]];
            iArr[lIlllIII[0]] = lIlllIII[25];
            if (lIIllIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIlllIII[1]];
                iArr14[lIlllIII[0]] = lIlllIII[25];
                if (lIIllIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlllIII[1]];
                    iArr15[lIlllIII[0]] = lIlllIII[25];
                }
                iArr2 = new int[lIlllIII[1]];
                iArr2[lIlllIII[0]] = lIlllIII[201];
                if (lIIllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    bB.add(new C0003d(lIlllIII[201], lIlllIII[1], lIlllIII[202]));
                    "".length();
                }
                iArr3 = new int[lIlllIII[1]];
                iArr3[lIlllIII[0]] = lIlllIII[19];
                if (lIIllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                    bB.add(new C0003d(lIlllIII[19], lIlllIII[40], C0008i.bw));
                    "".length();
                    return;
                }
                return;
            }
            bB.add(new C0003d(lIlllIII[25], lIlllIII[12], lIlllIII[200]));
            "".length();
            iArr2 = new int[lIlllIII[1]];
            iArr2[lIlllIII[0]] = lIlllIII[201];
            if (lIIllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIlllIII[1]];
            iArr3[lIlllIII[0]] = lIlllIII[19];
            if (lIIllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bB.add(new C0003d(iv, lIlllIII[44], lIlllIII[199]));
        "".length();
        iArr = new int[lIlllIII[1]];
        iArr[lIlllIII[0]] = lIlllIII[25];
        if (lIIllIIlllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bB.add(new C0003d(lIlllIII[25], lIlllIII[12], lIlllIII[200]));
        "".length();
        iArr2 = new int[lIlllIII[1]];
        iArr2[lIlllIII[0]] = lIlllIII[201];
        if (lIIllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlllIII[1]];
        iArr3[lIlllIII[0]] = lIlllIII[19];
        if (lIIllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static String lIIlIllllII(String lIllIIIIIlIIllI, String lIllIIIIIlIIlIl) {
        String str = new String(Base64.getDecoder().decode(lIllIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllIIIIIlIIlIl.toCharArray();
        int lIllIIIIIlIIIlI = lIlllIII[0];
        char[] charArray2 = str.toCharArray();
        int lIllIIIIIIllIll = charArray2.length;
        int i = lIlllIII[0];
        while (lIIllIIllll(i, lIllIIIIIIllIll)) {
            sb.append((char) (charArray2[i] ^ charArray[lIllIIIIIlIIIlI % charArray.length]));
            "".length();
            lIllIIIIIlIIIlI++;
            i++;
            "".length();
            if ("   ".length() >= ((174 ^ 197) ^ (114 ^ 29))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ac() {
        if (lIIllIlIlII(Skills.getBoostedLevel(Skill.AGILITY), lIlllIII[37])) {
            int[] iArr = new int[lIlllIII[1]];
            iArr[lIlllIII[0]] = lIlllIII[13];
            if (lIIllIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIII[1]];
                iArr2[lIlllIII[0]] = lIlllIII[25];
                if (lIIllIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIII[1]];
                    iArr3[lIlllIII[0]] = lIlllIII[23];
                    if (lIIllIIlllI(Inventory.contains(iArr3) ? 1 : 0) && ((!lIIllIlIIII(Inventory.contains(item -> {
                        return item.getName().contains(lIllIlIl[lIlllIII[207]]);
                    }) ? 1 : 0) || lIIllIIlllI(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIllIlIl[lIlllIII[206]]);
                    }) ? 1 : 0)) && (!lIIllIlIIII(Inventory.contains(C0005f.bl) ? 1 : 0) || lIIllIIlllI(Equipment.contains(C0005f.bl) ? 1 : 0)))) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return (-"  ".length()) > 0 ? ((((152 + 28) - 101) + 76) ^ (((158 + 158) - 304) + 181)) & (((157 ^ 196) ^ "   ".length()) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lIlllIII[0];
        }
        int[] iArr4 = new int[lIlllIII[1]];
        iArr4[lIlllIII[0]] = lIlllIII[13];
        if (lIIllIIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIlllIII[1]];
            iArr5[lIlllIII[0]] = lIlllIII[15];
            if (lIIllIIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlllIII[1]];
                iArr6[lIlllIII[0]] = lIlllIII[14];
                if (lIIllIIlllI(Inventory.contains(iArr6) ? 1 : 0) && ((!lIIllIlIIII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIllIlIl[lIlllIII[205]]);
                }) ? 1 : 0) || lIIllIIlllI(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIllIlIl[lIlllIII[204]]);
                }) ? 1 : 0)) && (!lIIllIlIIII(Inventory.contains(C0005f.bl) ? 1 : 0) || lIIllIIlllI(Equipment.contains(C0005f.bl) ? 1 : 0)))) {
                    ?? r02 = lIlllIII[1];
                    "".length();
                    return (((115 ^ 59) ^ (125 ^ 58)) & (((((26 + 138) - 110) + 109) ^ (((52 + 73) - (-19)) + 28)) ^ (-" ".length()))) == " ".length() ? ((161 ^ 185) ^ (213 ^ 159)) & (((87 ^ 111) ^ (46 ^ 68)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIlllIII[0];
    }

    private static void lIIllIIllIl() {
        lIlllIII = new int[239];
        lIlllIII[0] = ((37 ^ 102) ^ (100 ^ 53)) & (((((100 + 102) - 44) + 32) ^ (((86 + 131) - 103) + 58)) ^ (-" ".length()));
        lIlllIII[1] = " ".length();
        lIlllIII[2] = (186 ^ 131) ^ (142 ^ 178);
        lIlllIII[3] = "  ".length();
        lIlllIII[4] = (-((-16789) & 29141)) & (-529) & 16343;
        lIlllIII[5] = (-28699) & 32159;
        lIlllIII[6] = 43 ^ 21;
        lIlllIII[7] = (82 ^ 126) ^ (90 ^ 69);
        lIlllIII[8] = (-((-167) & 28903)) & (-514) & 32761;
        lIlllIII[9] = (-((-11273) & 28267)) & (-12289) & 32762;
        lIlllIII[10] = "   ".length();
        lIlllIII[11] = (-1089) & 6088;
        lIlllIII[12] = 98 ^ 104;
        lIlllIII[13] = (-((-20745) & 29097)) & (-16385) & 32743;
        lIlllIII[14] = (-(104 ^ 90)) & (-8197) & 16253;
        lIlllIII[15] = (-8373) & 16381;
        lIlllIII[16] = (-83) & 3935;
        lIlllIII[17] = (((139 + 5) - 18) + 41) ^ (((114 + 143) - 116) + 22);
        lIlllIII[18] = (-20515) & 32494;
        lIlllIII[19] = (-143) & 12767;
        lIlllIII[20] = 153 ^ 159;
        lIlllIII[21] = (-8354) & 16363;
        lIlllIII[22] = (32 ^ 121) ^ (4 ^ 90);
        lIlllIII[23] = (-22057) & 22441;
        lIlllIII[24] = (127 ^ 81) ^ (134 ^ 160);
        lIlllIII[25] = (-((-6187) & 14719)) & (-1) & 28151;
        lIlllIII[26] = (59 ^ 84) ^ (226 ^ 132);
        lIlllIII[27] = (-1281) & 22426;
        lIlllIII[28] = (-162) & 12021;
        lIlllIII[29] = (-((-11265) & 27939)) & (-4106) & 32635;
        lIlllIII[30] = (-401) & 12254;
        lIlllIII[31] = (-4481) & 16332;
        lIlllIII[32] = (-20865) & 32722;
        lIlllIII[33] = (-((-713) & 17130)) & (-4497) & 32763;
        lIlllIII[34] = (-4098) & 16065;
        lIlllIII[35] = (21 ^ 1) ^ (249 ^ 181);
        lIlllIII[36] = (-4241) & 24475;
        lIlllIII[37] = (((33 + 131) - 43) + 13) ^ (((22 + 89) - 0) + 63);
        lIlllIII[38] = 58 ^ 53;
        lIlllIII[39] = 178 ^ 128;
        lIlllIII[40] = 41 ^ 61;
        lIlllIII[41] = (((132 + 61) - 98) + 62) ^ (((12 + 12) - (-60)) + 48);
        lIlllIII[42] = 145 ^ 143;
        lIlllIII[43] = (-9217) & 9518;
        lIlllIII[44] = (164 ^ 171) ^ (17 ^ 34);
        lIlllIII[45] = (-32265) & 32571;
        lIlllIII[46] = (-((-20577) & 29305)) & (-21507) & 32703;
        lIlllIII[47] = (-8193) & 11627;
        lIlllIII[48] = (-536) & 3959;
        lIlllIII[49] = 119 ^ 124;
        lIlllIII[50] = (-12321) & 15741;
        lIlllIII[51] = (-((-481) & 30719)) & (-65) & 32767;
        lIlllIII[52] = (-((-23749) & 32485)) & (-20481) & 32631;
        lIlllIII[53] = 124 ^ 114;
        lIlllIII[54] = (88 ^ 114) ^ (149 ^ 173);
        lIlllIII[55] = (-((-23343) & 32623)) & (-4609) & 16371;
        lIlllIII[56] = (-((-12329) & 28841)) & (-12290) & 32217;
        lIlllIII[57] = (-9230) & 11711;
        lIlllIII[58] = (-12327) & 15743;
        lIlllIII[59] = (-((-25089) & 30273)) & (-24579) & 32243;
        lIlllIII[60] = (-16521) & 19947;
        lIlllIII[61] = (37 ^ 49) ^ "  ".length();
        lIlllIII[62] = -" ".length();
        lIlllIII[63] = (75 ^ 82) ^ (31 ^ 10);
        lIlllIII[64] = 38 ^ 43;
        lIlllIII[65] = (((134 + 12) - 134) + 128) ^ (((136 + 143) - 192) + 69);
        lIlllIII[66] = 92 ^ 77;
        lIlllIII[67] = (((8 + 164) - 61) + 65) ^ (((91 + 20) - (-49)) + 3);
        lIlllIII[68] = 98 ^ 119;
        lIlllIII[69] = 209 ^ 198;
        lIlllIII[70] = (140 ^ 164) ^ (189 ^ 141);
        lIlllIII[71] = (93 ^ 116) ^ (20 ^ 39);
        lIlllIII[72] = 122 ^ 97;
        lIlllIII[73] = (((74 + 89) - 72) + 64) ^ (((121 + 38) - 62) + 38);
        lIlllIII[74] = 112 ^ 109;
        lIlllIII[75] = (((62 + 44) - (-7)) + 27) ^ (((92 + 3) - 6) + 58);
        lIlllIII[76] = (-((-3159) & 3543)) & (-28705) & 32255;
        lIlllIII[77] = (-20713) & 24062;
        lIlllIII[78] = (((107 ^ 96) + (79 ^ 39)) - (182 ^ 170)) + (240 ^ 194);
        lIlllIII[79] = (196 ^ 158) ^ (15 ^ 11);
        lIlllIII[80] = (-((-791) & 21335)) & (-777) & 24539;
        lIlllIII[81] = (-21129) & 24537;
        lIlllIII[82] = (-8964) & 12175;
        lIlllIII[83] = (-((-17669) & 30598)) & (-16641) & 32767;
        lIlllIII[84] = (-17058) & 20469;
        lIlllIII[85] = (-137) & 3326;
        lIlllIII[86] = (-28801) & 32213;
        lIlllIII[87] = (-((-1801) & 10123)) & (-16421) & 28143;
        lIlllIII[88] = (-((-771) & 29463)) & (-385) & 32255;
        lIlllIII[89] = (-12866) & 16247;
        lIlllIII[90] = (-((-20097) & 28591)) & (-4097) & 15807;
        lIlllIII[91] = (-4232) & 7623;
        lIlllIII[92] = (-21250) & 24483;
        lIlllIII[93] = (-((-2561) & 23205)) & (-2) & 24047;
        lIlllIII[94] = (-((-11761) & 16382)) & (-24737) & 32767;
        lIlllIII[95] = (((142 + 145) - 198) + 79) ^ (((114 + 94) - 82) + 10);
        lIlllIII[96] = (-((-12289) & 29543)) & (-8193) & 28670;
        lIlllIII[97] = 229 ^ 196;
        lIlllIII[98] = (77 ^ 93) ^ (87 ^ 101);
        lIlllIII[99] = 57 ^ 26;
        lIlllIII[100] = (((89 + 34) - 23) + 40) ^ (((23 + 5) - 9) + 149);
        lIlllIII[101] = (((64 + 77) - 127) + 167) ^ (((138 + 112) - 223) + 117);
        lIlllIII[102] = 48 ^ 22;
        lIlllIII[103] = (((160 + 104) - 193) + 92) ^ (((10 + 116) - 90) + 96);
        lIlllIII[104] = (-((-24753) & 26353)) & (-6276) & 16375;
        lIlllIII[105] = (127 ^ 14) ^ (30 ^ 70);
        lIlllIII[106] = (3 ^ 60) ^ (65 ^ 84);
        lIlllIII[107] = 24 ^ 51;
        lIlllIII[108] = (((11 + 171) - 107) + 161) ^ (((37 + 39) - (-25)) + 91);
        lIlllIII[109] = 63 ^ 18;
        lIlllIII[110] = (202 ^ 161) ^ (11 ^ 78);
        lIlllIII[111] = (((106 + 105) - 111) + 60) ^ (((82 + 130) - 166) + 97);
        lIlllIII[112] = 83 ^ 99;
        lIlllIII[113] = 133 ^ 180;
        lIlllIII[114] = 151 ^ 163;
        lIlllIII[115] = (-1542) & 16375;
        lIlllIII[116] = 73 ^ 124;
        lIlllIII[117] = 155 ^ 173;
        lIlllIII[118] = (-16905) & 31739;
        lIlllIII[119] = 170 ^ 157;
        lIlllIII[120] = (((122 + 100) - 107) + 12) ^ (225 ^ 166);
        lIlllIII[121] = (-((-26043) & 26558)) & (-1) & 15351;
        lIlllIII[122] = (116 ^ 124) ^ (34 ^ 19);
        lIlllIII[123] = 191 ^ 133;
        lIlllIII[124] = (((55 + 239) - 279) + 237) ^ (((47 + 46) - 61) + 167);
        lIlllIII[125] = (-((-17865) & 21977)) & (-8737) & 16319;
        lIlllIII[126] = (-16993) & 20458;
        lIlllIII[127] = (-8770) & 12271;
        lIlllIII[128] = (-16386) & 19875;
        lIlllIII[129] = (-((-12129) & 28537)) & (-12801) & 32703;
        lIlllIII[130] = (-29189) & 32671;
        lIlllIII[131] = (-583) & 4079;
        lIlllIII[132] = (-16422) & 19893;
        lIlllIII[133] = (-25093) & 28581;
        lIlllIII[134] = (-4617) & 8091;
        lIlllIII[135] = (-((-10397) & 27389)) & (-8193) & 28669;
        lIlllIII[136] = (-12309) & 15775;
        lIlllIII[137] = (-20997) & 24502;
        lIlllIII[138] = (-12867) & 16339;
        lIlllIII[139] = (-((-8997) & 13093)) & (-16385) & 23966;
        lIlllIII[140] = (((27 + 134) - 44) + 40) ^ (((45 + 105) - 26) + 36);
        lIlllIII[141] = 22 ^ 41;
        lIlllIII[142] = (15 ^ 92) ^ (130 ^ 145);
        lIlllIII[143] = (33 ^ 92) ^ (126 ^ 66);
        lIlllIII[144] = 122 ^ 56;
        lIlllIII[145] = (((174 + 190) - 280) + 138) ^ (((80 + 67) - 140) + 150);
        lIlllIII[146] = (222 ^ 168) ^ (130 ^ 176);
        lIlllIII[147] = 224 ^ 165;
        lIlllIII[148] = 107 ^ 45;
        lIlllIII[149] = (0 ^ 59) ^ (92 ^ 32);
        lIlllIII[150] = 141 ^ 197;
        lIlllIII[151] = 38 ^ 111;
        lIlllIII[152] = (((180 + 8) - (-3)) + 4) ^ (((81 + 60) - 18) + 14);
        lIlllIII[153] = (199 ^ 139) ^ (188 ^ 187);
        lIlllIII[154] = (28 ^ 108) ^ (65 ^ 125);
        lIlllIII[155] = 242 ^ 191;
        lIlllIII[156] = 249 ^ 183;
        lIlllIII[157] = (237 ^ 180) ^ (11 ^ 29);
        lIlllIII[158] = (((137 + 178) - 158) + 41) ^ (((130 + 14) - 100) + 106);
        lIlllIII[159] = (((154 + 94) - 28) + 13) ^ (((41 + 30) - (-14)) + 99);
        lIlllIII[160] = (((91 + 148) - 63) + 47) ^ (((1 + 28) - (-45)) + 67);
        lIlllIII[161] = 100 ^ 55;
        lIlllIII[162] = (-24705) & 27391;
        lIlllIII[163] = (-((-2505) & 27081)) & (-513) & 28542;
        lIlllIII[164] = (-((-7069) & 24509)) & (-4417) & 24575;
        lIlllIII[165] = (-1041) & 3741;
        lIlllIII[166] = (-30017) & 32723;
        lIlllIII[167] = (-28791) & 31487;
        lIlllIII[168] = (-1032) & 3719;
        lIlllIII[169] = (-((-8385) & 24829)) & (-577) & 20477;
        lIlllIII[170] = (-20819) & 23547;
        lIlllIII[171] = (-((-6181) & 30783)) & (-70) & 28159;
        lIlllIII[172] = (19 ^ 64) ^ (59 ^ 60);
        lIlllIII[173] = (255 ^ 194) ^ (69 ^ 45);
        lIlllIII[174] = 217 ^ 143;
        lIlllIII[175] = (88 ^ 52) ^ (166 ^ 157);
        lIlllIII[176] = (36 ^ 125) ^ ((42 ^ 5) & ((15 ^ 32) ^ (-1)));
        lIlllIII[177] = 24 ^ 66;
        lIlllIII[178] = (129 ^ 136) ^ (227 ^ 177);
        lIlllIII[179] = 246 ^ 170;
        lIlllIII[180] = (((231 + 128) - 330) + 222) ^ (((9 + 69) - (-75)) + 13);
        lIlllIII[181] = 11 ^ 84;
        lIlllIII[182] = 35 ^ 67;
        lIlllIII[183] = 194 ^ 163;
        lIlllIII[184] = (((142 + 11) - 83) + 169) ^ (((22 + 99) - 31) + 51);
        lIlllIII[185] = 228 ^ 135;
        lIlllIII[186] = 88 ^ 60;
        lIlllIII[187] = 241 ^ 148;
        lIlllIII[188] = 68 ^ 34;
        lIlllIII[189] = (-((-8217) & 28953)) & (-8321) & 32247;
        lIlllIII[190] = (-((-3501) & 32685)) & (-170) & 32767;
        lIlllIII[191] = (-((-377) & 29689)) & (-2) & 32495;
        lIlllIII[192] = (-((-16385) & 29381)) & (-16385) & 32767;
        lIlllIII[193] = (-4357) & 16205;
        lIlllIII[194] = 30 ^ 121;
        lIlllIII[195] = (-((-10274) & 27299)) & (-8193) & 30717;
        lIlllIII[196] = (-((-10505) & 15197)) & (-2052) & 31743;
        lIlllIII[197] = (-((-11169) & 28668)) & (-2081) & 20479;
        lIlllIII[198] = (-((-21781) & 32093)) & (-4097) & 15358;
        lIlllIII[199] = (-((-6421) & 30998)) & (-6241) & 32767;
        lIlllIII[200] = (-1025) & 9974;
        lIlllIII[201] = (-4374) & 16351;
        lIlllIII[202] = (-2210) & 28159;
        lIlllIII[203] = 1 ^ 105;
        lIlllIII[204] = (226 ^ 156) ^ (150 ^ 129);
        lIlllIII[205] = (((155 + 158) - 148) + 50) ^ (((130 + 12) - (-36)) + 11);
        lIlllIII[206] = 84 ^ 63;
        lIlllIII[207] = 60 ^ 80;
        lIlllIII[208] = 168 ^ 197;
        lIlllIII[209] = (-4129) & 6831;
        lIlllIII[210] = (-(85 ^ 98)) & (-28737) & 32255;
        lIlllIII[211] = 37 ^ 75;
        lIlllIII[212] = (-609) & 4077;
        lIlllIII[213] = 119 ^ 24;
        lIlllIII[214] = (-((-641) & 13961)) & (-353) & 16383;
        lIlllIII[215] = (-586) & 4061;
        lIlllIII[216] = (57 ^ 63) ^ (32 ^ 86);
        lIlllIII[217] = (-((-2462) & 32159)) & (-289) & 32695;
        lIlllIII[218] = 177 ^ 192;
        lIlllIII[219] = (-20557) & 23277;
        lIlllIII[220] = (-(89 ^ 24)) & (-4617) & 8173;
        lIlllIII[221] = 3 ^ 113;
        lIlllIII[222] = (-((-17831) & 26607)) & (-4097) & 16382;
        lIlllIII[223] = (-28706) & 32189;
        lIlllIII[224] = (((118 + 39) - 122) + 216) ^ (((13 + 26) - 38) + 135);
        lIlllIII[225] = (-28737) & 32239;
        lIlllIII[226] = 34 ^ 86;
        lIlllIII[227] = 49 ^ 68;
        lIlllIII[228] = (-16969) & 20446;
        lIlllIII[229] = (-((-9821) & 26205)) & (-12881) & 32756;
        lIlllIII[230] = " ".length() ^ (69 ^ 50);
        lIlllIII[231] = (-((-25815) & 30423)) & (-85) & 8191;
        lIlllIII[232] = (152 ^ 198) ^ (163 ^ 138);
        lIlllIII[233] = (((68 + 67) - 30) + 149) ^ (((72 + 114) - 77) + 25);
        lIlllIII[234] = (-8773) & 12277;
        lIlllIII[235] = (-((-6350) & 23759)) & (-12875) & 32751;
        lIlllIII[236] = (-13397) & 15870;
        lIlllIII[237] = (-16913) & 20349;
        lIlllIII[238] = (73 ^ 20) ^ (88 ^ 124);
    }

    private static boolean lIIllIlIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    private static boolean cs() {
        WorldArea worldArea = new WorldArea(lIlllIII[80], lIlllIII[81], lIlllIII[69], lIlllIII[64], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[82], lIlllIII[81], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[83], lIlllIII[84], lIlllIII[63], lIlllIII[49], lIlllIII[10]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[189], lIlllIII[190], lIlllIII[24], lIlllIII[2], lIlllIII[1]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[85], lIlllIII[87], lIlllIII[12], lIlllIII[24], lIlllIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[191], lIlllIII[192], lIlllIII[73], lIlllIII[38], lIlllIII[10]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[90], lIlllIII[91], lIlllIII[66], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[92], lIlllIII[93], lIlllIII[22], lIlllIII[26], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[92], lIlllIII[94], lIlllIII[12], lIlllIII[22], lIlllIII[10]);
        WorldArea worldArea10 = new WorldArea(lIlllIII[127], lIlllIII[128], lIlllIII[49], lIlllIII[12], lIlllIII[3]);
        WorldArea worldArea11 = new WorldArea(lIlllIII[129], lIlllIII[127], lIlllIII[49], lIlllIII[24], lIlllIII[3]);
        WorldArea worldArea12 = new WorldArea(lIlllIII[130], lIlllIII[131], lIlllIII[63], lIlllIII[49], lIlllIII[3]);
        WorldArea worldArea13 = new WorldArea(lIlllIII[132], lIlllIII[133], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea14 = new WorldArea(lIlllIII[134], lIlllIII[9], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea15 = new WorldArea(lIlllIII[135], lIlllIII[136], lIlllIII[68], lIlllIII[53], lIlllIII[10]);
        WorldArea worldArea16 = new WorldArea(lIlllIII[137], lIlllIII[138], lIlllIII[63], lIlllIII[64], lIlllIII[3]);
        WorldArea worldArea17 = new WorldArea(lIlllIII[164], lIlllIII[133], lIlllIII[64], lIlllIII[12], lIlllIII[10]);
        WorldArea worldArea18 = new WorldArea(lIlllIII[165], lIlllIII[139], lIlllIII[38], lIlllIII[53], lIlllIII[3]);
        WorldArea worldArea19 = new WorldArea(lIlllIII[166], lIlllIII[134], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea20 = new WorldArea(lIlllIII[167], lIlllIII[136], lIlllIII[70], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea21 = new WorldArea(lIlllIII[168], lIlllIII[169], lIlllIII[54], lIlllIII[63], lIlllIII[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIlllIII[68]];
        worldAreaArr[lIlllIII[0]] = worldArea;
        worldAreaArr[lIlllIII[1]] = worldArea2;
        worldAreaArr[lIlllIII[3]] = worldArea3;
        worldAreaArr[lIlllIII[10]] = worldArea4;
        worldAreaArr[lIlllIII[17]] = worldArea5;
        worldAreaArr[lIlllIII[2]] = worldArea6;
        worldAreaArr[lIlllIII[20]] = worldArea7;
        worldAreaArr[lIlllIII[22]] = worldArea8;
        worldAreaArr[lIlllIII[24]] = worldArea9;
        worldAreaArr[lIlllIII[26]] = worldArea10;
        worldAreaArr[lIlllIII[12]] = worldArea11;
        worldAreaArr[lIlllIII[49]] = worldArea12;
        worldAreaArr[lIlllIII[63]] = worldArea13;
        worldAreaArr[lIlllIII[64]] = worldArea14;
        worldAreaArr[lIlllIII[53]] = worldArea15;
        worldAreaArr[lIlllIII[38]] = worldArea16;
        worldAreaArr[lIlllIII[65]] = worldArea17;
        worldAreaArr[lIlllIII[66]] = worldArea18;
        worldAreaArr[lIlllIII[54]] = worldArea19;
        worldAreaArr[lIlllIII[67]] = worldArea20;
        worldAreaArr[lIlllIII[40]] = worldArea21;
        int[] iArr = new int[lIlllIII[1]];
        iArr[lIlllIII[0]] = lIlllIII[193];
        if (lIIllIlIIIl(TileItems.getNearest(iArr))) {
            System.out.println(lIllIlIl[lIlllIII[194]]);
            int i = lIlllIII[0];
            while (lIIllIIllll(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lIlllIII[1]];
                iArr2[lIlllIII[0]] = lIlllIII[193];
                if (lIIllIIlllI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIIllIIlllI(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIlllIII[1];
                }
                i++;
                "".length();
                if (" ".length() <= 0) {
                    return ((142 ^ 161) ^ (21 ^ 31)) & (((((27 + 68) - 60) + 121) ^ (((13 + 110) - 93) + 155)) ^ (-" ".length()));
                }
            }
        }
        return lIlllIII[0];
    }

    private static void cp() {
        WorldArea worldArea = new WorldArea(lIlllIII[76], lIlllIII[77], lIlllIII[78], lIlllIII[79], lIlllIII[1]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[76], lIlllIII[77], lIlllIII[78], lIlllIII[79], lIlllIII[3]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[76], lIlllIII[77], lIlllIII[78], lIlllIII[79], lIlllIII[10]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[80], lIlllIII[81], lIlllIII[69], lIlllIII[64], lIlllIII[0]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[82], lIlllIII[81], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[83], lIlllIII[84], lIlllIII[63], lIlllIII[49], lIlllIII[10]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[85], lIlllIII[86], lIlllIII[26], lIlllIII[22], lIlllIII[1]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[85], lIlllIII[87], lIlllIII[12], lIlllIII[24], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[88], lIlllIII[89], lIlllIII[75], lIlllIII[40], lIlllIII[10]);
        WorldArea worldArea10 = new WorldArea(lIlllIII[90], lIlllIII[91], lIlllIII[66], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea11 = new WorldArea(lIlllIII[92], lIlllIII[93], lIlllIII[22], lIlllIII[26], lIlllIII[10]);
        WorldArea worldArea12 = new WorldArea(lIlllIII[92], lIlllIII[94], lIlllIII[12], lIlllIII[22], lIlllIII[10]);
        if (lIIllIlIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[95]];
            if (lIIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIllIIlllI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIlllIII[96], lIlllIII[52], lIlllIII[0]));
            "".length();
            Time.sleepTicks(lIlllIII[1]);
            "".length();
        }
        if (lIIllIlIlIl(Players.getLocal().getAnimation(), lIlllIII[62]) && lIIllIlIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIlllIII[1]];
            strArr[lIlllIII[0]] = lIllIlIl[lIlllIII[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIIllIlIIIl(nearest) && lIIllIIlllI(cs() ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[98]];
                System.out.println(lIllIlIl[lIlllIII[99]]);
                nearest.interact(lIllIlIl[lIlllIII[100]]);
                Time.sleepTicks(lIlllIII[10]);
                "".length();
            }
            if (lIIllIlIIII(cs() ? 1 : 0)) {
                if (lIIllIIlllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIlllIII[1]];
                    strArr2[lIlllIII[0]] = lIllIlIl[lIlllIII[102]];
                    TileObjects.getNearest(strArr2).interact(lIllIlIl[lIlllIII[103]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (-"  ".length()) > 0 ? ((((10 + 100) - (-2)) + 66) ^ (((118 + 70) - 136) + 98)) & (((148 ^ 189) ^ (124 ^ 113)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIlllIII[1]];
                    strArr3[lIlllIII[0]] = lIllIlIl[lIlllIII[105]];
                    TileObjects.getNearest(strArr3).interact(lIllIlIl[lIlllIII[106]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIlllIII[1]];
                    strArr4[lIlllIII[0]] = lIllIlIl[lIlllIII[108]];
                    TileObjects.getNearest(strArr4).interact(lIllIlIl[lIlllIII[109]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return " ".length() == (145 ^ 149) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIlllIII[1]];
                    strArr5[lIlllIII[0]] = lIllIlIl[lIlllIII[111]];
                    TileObjects.getNearest(strArr5).interact(lIllIlIl[lIlllIII[112]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (51 ^ 55) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIlllIII[1]];
                    strArr6[lIlllIII[0]] = lIllIlIl[lIlllIII[39]];
                    TileObjects.getNearest(strArr6).interact(lIllIlIl[lIlllIII[7]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (-((86 ^ 12) ^ (198 ^ 153))) >= 0 ? ((((199 + 205) - 238) + 70) ^ (((85 + 57) - 27) + 52)) & (((((174 + 68) - 52) + 60) ^ (((143 + 10) - 131) + 155)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIlllIII[1]];
                    iArr[lIlllIII[0]] = lIlllIII[115];
                    TileObjects.getNearest(iArr).interact(lIllIlIl[lIlllIII[116]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return 0 != 0 ? ((93 ^ 89) ^ (240 ^ 196)) & (((((8 + 125) - (-27)) + 8) ^ (((11 + 83) - (-45)) + 13)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIlllIII[1]];
                    iArr2[lIlllIII[0]] = lIlllIII[118];
                    TileObjects.getNearest(iArr2).interact(lIllIlIl[lIlllIII[119]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIlllIII[1]];
                    iArr3[lIlllIII[0]] = lIlllIII[121];
                    TileObjects.getNearest(iArr3).interact(lIllIlIl[lIlllIII[122]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (((((171 + 124) - 154) + 34) ^ (((115 + 116) - 219) + 121)) & (((157 ^ 142) ^ (105 ^ 80)) ^ (-" ".length()))) != 0 ? ((6 ^ 44) ^ (212 ^ 184)) & (((8 ^ 75) ^ (168 ^ 173)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
                if (lIIllIIlllI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(cs() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIlllIII[1]];
                    strArr7[lIlllIII[0]] = lIllIlIl[lIlllIII[124]];
                    TileObjects.getNearest(strArr7).interact(lIllIlIl[lIlllIII[44]]);
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
        }
    }

    private static void cq() {
        WorldArea worldArea = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlllIII[125], lIlllIII[126], lIlllIII[112], lIlllIII[107], lIlllIII[10]);
        WorldArea worldArea5 = new WorldArea(lIlllIII[127], lIlllIII[128], lIlllIII[49], lIlllIII[12], lIlllIII[3]);
        WorldArea worldArea6 = new WorldArea(lIlllIII[129], lIlllIII[127], lIlllIII[49], lIlllIII[24], lIlllIII[3]);
        WorldArea worldArea7 = new WorldArea(lIlllIII[130], lIlllIII[131], lIlllIII[63], lIlllIII[49], lIlllIII[3]);
        WorldArea worldArea8 = new WorldArea(lIlllIII[132], lIlllIII[133], lIlllIII[12], lIlllIII[64], lIlllIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlllIII[134], lIlllIII[9], lIlllIII[49], lIlllIII[26], lIlllIII[3]);
        WorldArea worldArea10 = new WorldArea(lIlllIII[135], lIlllIII[136], lIlllIII[68], lIlllIII[53], lIlllIII[10]);
        WorldArea worldArea11 = new WorldArea(lIlllIII[137], lIlllIII[138], lIlllIII[63], lIlllIII[64], lIlllIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIlllIII[137], lIlllIII[139], lIlllIII[0]);
        if (lIIllIIlllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIllIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlllIII[1]);
            "".length();
        }
        if (lIIllIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlllIII[1]);
                "".length();
            }
            if (lIIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlllIII[20])) {
                AccBuilderBarrows.c = lIllIlIl[lIlllIII[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIlllIII[1]];
                strArr[lIlllIII[0]] = lIllIlIl[lIlllIII[142]];
                TileObjects.getNearest(strArr).interact(lIllIlIl[lIlllIII[143]]);
                Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return ((99 ^ 80) & ((135 ^ 180) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                }, lIlllIII[104]);
                "".length();
                Time.sleepTicks(lIlllIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIlllIII[1]];
        strArr2[lIlllIII[0]] = lIllIlIl[lIlllIII[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIllIlIIIl(nearest) && lIIllIIlllI(cs() ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlIl[lIlllIII[145]];
            System.out.println(lIllIlIl[lIlllIII[146]]);
            nearest.interact(lIllIlIl[lIlllIII[147]]);
            Time.sleepTicks(lIlllIII[10]);
            "".length();
        }
        if (lIIllIlIIII(cs() ? 1 : 0)) {
            if (lIIllIIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIllIIlllI(tileObject.getName().contains(lIllIlIl[lIlllIII[233]]) ? 1 : 0) && lIIllIlIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[234], lIlllIII[131], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[148]];
                    nearest2.interact(lIllIlIl[lIlllIII[149]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIllIIlllI(tileObject2.getName().contains(lIllIlIl[lIlllIII[232]]) ? 1 : 0) && lIIllIlIllI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[131], lIlllIII[225], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return ((241 ^ 181) & ((225 ^ 165) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest3)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIllIlIl[lIlllIII[151]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIllIIlllI(tileObject3.getName().contains(lIllIlIl[lIlllIII[230]]) ? 1 : 0) && lIIllIlIllI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[139], lIlllIII[231], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return ((112 ^ 111) ^ (144 ^ 139)) < 0 ? ((43 ^ 54) ^ (65 ^ 105)) & (((((89 + 131) - 123) + 39) ^ (((154 + 127) - 231) + 139)) ^ (-" ".length())) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest4)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIllIlIl[lIlllIII[153]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (((((22 + 3) - (-7)) + 136) ^ (((58 + 116) - 162) + 117)) & (((54 ^ 94) ^ (124 ^ 61)) ^ (-" ".length()))) == (-" ".length()) ? ((105 ^ 58) ^ (132 ^ 142)) & (((((25 + 111) - 106) + 206) ^ (((97 + 72) - 66) + 78)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIllIIlllI(tileObject4.getName().contains(lIllIlIl[lIlllIII[227]]) ? 1 : 0) && lIIllIlIllI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[228], lIlllIII[229], lIlllIII[10])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return (-(111 ^ 107)) >= 0 ? (!true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest5)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIllIlIl[lIlllIII[155]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return 0 != 0 ? ((((45 + 119) - 79) + 49) ^ (((111 + 16) - 36) + 54)) & (((68 ^ 99) ^ (90 ^ 106)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIllIIlllI(tileObject5.getName().contains(lIllIlIl[lIlllIII[226]]) ? 1 : 0) && lIIllIlIllI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[9], lIlllIII[130], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return (-" ".length()) > 0 ? ((((77 + 80) - 143) + 137) ^ (((29 + 98) - (-45)) + 25)) & (((96 ^ 17) ^ (100 ^ 71)) ^ (-" ".length())) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest6)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIllIlIl[lIlllIII[157]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (-" ".length()) == (((65 ^ 29) ^ (15 ^ 122)) & (((151 ^ 192) ^ (199 ^ 185)) ^ (-" ".length()))) ? ((69 ^ 118) ^ (29 ^ 103)) & (((((63 + 18) - 65) + 123) ^ (((134 + 168) - 280) + 172)) ^ (-" ".length())) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (lIIllIIlllI(cs() ? 1 : 0)) {
                return;
            }
            if (lIIllIIlllI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIIllIIlllI(tileObject6.getName().contains(lIllIlIl[lIlllIII[224]]) ? 1 : 0) && lIIllIlIllI(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[225], lIlllIII[215], lIlllIII[10])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return (-" ".length()) >= ((192 ^ 152) & ((22 ^ 78) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest7)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIllIlIl[lIlllIII[159]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
            if (!lIIllIIlllI(cs() ? 1 : 0) && lIIllIIlllI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIIllIIlllI(tileObject7.getName().contains(lIllIlIl[lIlllIII[221]]) ? 1 : 0) && lIIllIlIllI(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIlllIII[222], lIlllIII[223], lIlllIII[3])), lIlllIII[3])) {
                        ?? r0 = lIlllIII[1];
                        "".length();
                        return (16 ^ 20) > (152 ^ 156) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIII[0];
                });
                if (lIIllIlIIIl(nearest8)) {
                    AccBuilderBarrows.c = lIllIlIl[lIlllIII[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIllIlIl[lIlllIII[161]]);
                    Time.sleepTicks(C0004e.c(lIlllIII[1], lIlllIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIllIlIIlI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIlllIII[1];
                            "".length();
                            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIII[0];
                    }, lIlllIII[104]);
                    "".length();
                    Time.sleepTicks(lIlllIII[1]);
                    "".length();
                }
            }
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIllIlIl[lIlllIII[203]];
    }
}

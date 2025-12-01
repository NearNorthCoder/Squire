package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ac  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ac.class */
public class ac implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ WorldPoint me;
    static /* synthetic */ WorldArea mb;
    private static /* synthetic */ String[] lIIIIIIIll;
    static /* synthetic */ WorldArea md;
    public static /* synthetic */ int lZ;
    static /* synthetic */ WorldArea mc;
    public static /* synthetic */ int ma;
    private static /* synthetic */ int[] lIIIIIIlII;
    public static /* synthetic */ int lY;
    public static /* synthetic */ List<C0003d> bx;

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dT();
            "".length();
            if (0 != 0) {
                return (75 ^ 99) & ((123 ^ 83) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIIIIlII[186];
    }

    private static String llIllIlIllIl(String lIIIIlllllIIl, String lIIIIlllllIII) {
        try {
            SecretKeySpec lIIIIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlllllIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIlII[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlII[3], lIIIIllllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlllllIlI) {
            lIIIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static void dV() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[76], lIIIIIIlII[77], lIIIIIIlII[78], lIIIIIIlII[79], lIIIIIIlII[1]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[76], lIIIIIIlII[77], lIIIIIIlII[78], lIIIIIIlII[79], lIIIIIIlII[3]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[76], lIIIIIIlII[77], lIIIIIIlII[78], lIIIIIIlII[79], lIIIIIIlII[10]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[80], lIIIIIIlII[81], lIIIIIIlII[69], lIIIIIIlII[64], lIIIIIIlII[0]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[82], lIIIIIIlII[81], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[83], lIIIIIIlII[84], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[10]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[85], lIIIIIIlII[86], lIIIIIIlII[27], lIIIIIIlII[23], lIIIIIIlII[1]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[85], lIIIIIIlII[87], lIIIIIIlII[12], lIIIIIIlII[25], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[88], lIIIIIIlII[89], lIIIIIIlII[75], lIIIIIIlII[41], lIIIIIIlII[10]);
        WorldArea worldArea10 = new WorldArea(lIIIIIIlII[90], lIIIIIIlII[91], lIIIIIIlII[66], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea11 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[93], lIIIIIIlII[23], lIIIIIIlII[27], lIIIIIIlII[10]);
        WorldArea worldArea12 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[94], lIIIIIIlII[12], lIIIIIIlII[23], lIIIIIIlII[10]);
        if (llIlllIIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[95]];
            if (llIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llIlllIIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIIIIIIlII[96], lIIIIIIlII[52], lIIIIIIlII[0]));
            "".length();
            Time.sleepTicks(lIIIIIIlII[1]);
            "".length();
        }
        if (llIlllIlIIlI(Players.getLocal().getAnimation(), lIIIIIIlII[62]) && llIlllIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIIIIIIlII[1]];
            strArr[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (llIlllIIlllI(nearest) && llIlllIIlIll(dY() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[98]];
                System.out.println(lIIIIIIIll[lIIIIIIlII[99]]);
                nearest.interact(lIIIIIIIll[lIIIIIIlII[100]]);
                Time.sleepTicks(lIIIIIIlII[10]);
                "".length();
            }
            if (llIlllIIllIl(dY() ? 1 : 0)) {
                if (llIlllIIlIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIIIIIIlII[1]];
                    strArr2[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[102]];
                    TileObjects.getNearest(strArr2).interact(lIIIIIIIll[lIIIIIIlII[103]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return ((254 ^ 168) & ((55 ^ 97) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[38]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIIIIIIlII[1]];
                    strArr3[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[105]];
                    TileObjects.getNearest(strArr3).interact(lIIIIIIIll[lIIIIIIlII[106]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (((157 ^ 198) ^ (83 ^ 65)) & (((((145 + 217) - 263) + 126) ^ (((97 + 143) - 75) + 3)) ^ (-" ".length()))) > (((((24 + 52) - 11) + 157) ^ (((129 + 75) - 138) + 76)) & (((30 ^ 111) ^ (33 ^ 0)) ^ (-" ".length()))) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIIIIIIlII[1]];
                    strArr4[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[108]];
                    TileObjects.getNearest(strArr4).interact(lIIIIIIIll[lIIIIIIlII[109]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return " ".length() < 0 ? ((15 ^ 118) ^ (123 ^ 14)) & (((36 ^ 73) ^ (84 ^ 53)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIIIIIIlII[1]];
                    strArr5[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[111]];
                    TileObjects.getNearest(strArr5).interact(lIIIIIIIll[lIIIIIIlII[112]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIIIIIIlII[1]];
                    strArr6[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[40]];
                    TileObjects.getNearest(strArr6).interact(lIIIIIIIll[lIIIIIIlII[7]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return ((159 ^ 146) & ((55 ^ 58) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIIIIIIlII[1]];
                    iArr[lIIIIIIlII[0]] = lIIIIIIlII[115];
                    TileObjects.getNearest(iArr).interact(lIIIIIIIll[lIIIIIIlII[116]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (-" ".length()) > (-" ".length()) ? ((63 ^ 111) ^ (69 ^ 4)) & (("   ".length() ^ (143 ^ 157)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIIIIIIlII[1]];
                    iArr2[lIIIIIIlII[0]] = lIIIIIIlII[118];
                    TileObjects.getNearest(iArr2).interact(lIIIIIIIll[lIIIIIIlII[119]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIIIIIIlII[1]];
                    iArr3[lIIIIIIlII[0]] = lIIIIIIlII[121];
                    TileObjects.getNearest(iArr3).interact(lIIIIIIIll[lIIIIIIlII[122]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIlIll(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIIIIIIlII[1]];
                    strArr7[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[124]];
                    TileObjects.getNearest(strArr7).interact(lIIIIIIIll[lIIIIIIlII[44]]);
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlllIIlIll(int i) {
        return i != 0;
    }

    private static boolean llIlllIlIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void dU() {
        new WorldArea(lIIIIIIlII[46], lIIIIIIlII[47], lIIIIIIlII[12], lIIIIIIlII[21], lIIIIIIlII[0]);
        WorldArea worldArea = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[48], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[50], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[51], lIIIIIIlII[52], lIIIIIIlII[53], lIIIIIIlII[54], lIIIIIIlII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[55], lIIIIIIlII[56], lIIIIIIlII[25], lIIIIIIlII[12], lIIIIIIlII[3]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[57], lIIIIIIlII[58], lIIIIIIlII[49], lIIIIIIlII[12], lIIIIIIlII[0]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[59], lIIIIIIlII[60], lIIIIIIlII[12], lIIIIIIlII[21], lIIIIIIlII[0]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[46], lIIIIIIlII[47], lIIIIIIlII[61], lIIIIIIlII[21], lIIIIIIlII[0]);
        if (llIlllIIllIl(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[12]];
            C0004e.b(me);
            Time.sleepTicks(lIIIIIIlII[1]);
            "".length();
        }
        if (!(llIlllIIllIl(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIlllIIlIll(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIlllIlIIlI(Players.getLocal().getAnimation(), lIIIIIIlII[62]) && llIlllIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            if (llIlllIIlIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[49]];
                String[] strArr = new String[lIIIIIIlII[1]];
                strArr[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[63]];
                TileObjects.getNearest(strArr).interact(lIIIIIIIll[lIIIIIIlII[64]]);
                Time.sleepTicks(lIIIIIIlII[3]);
                "".length();
            }
            if (llIlllIIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[53]];
                String[] strArr2 = new String[lIIIIIIlII[1]];
                strArr2[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[39]];
                TileObjects.getNearest(strArr2).interact(lIIIIIIIll[lIIIIIIlII[65]]);
                Time.sleepTicks(lIIIIIIlII[3]);
                "".length();
            }
            if (llIlllIIlIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[66]];
                String[] strArr3 = new String[lIIIIIIlII[1]];
                strArr3[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[54]];
                TileObjects.getNearest(strArr3).interact(lIIIIIIIll[lIIIIIIlII[67]]);
                Time.sleepTicks(lIIIIIIlII[3]);
                "".length();
            }
            if (llIlllIIlIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[41]];
                String[] strArr4 = new String[lIIIIIIlII[1]];
                strArr4[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[68]];
                TileObjects.getNearest(strArr4).interact(lIIIIIIIll[lIIIIIIlII[61]]);
                Time.sleepTicks(lIIIIIIlII[19]);
                "".length();
            }
            if (llIlllIIlIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[69]];
                String[] strArr5 = new String[lIIIIIIlII[1]];
                strArr5[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[70]];
                TileObjects.getNearest(strArr5).interact(lIIIIIIIll[lIIIIIIlII[42]]);
                Time.sleepTicks(lIIIIIIlII[17]);
                "".length();
            }
            if (llIlllIIlIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[71]];
                String[] strArr6 = new String[lIIIIIIlII[1]];
                strArr6[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[72]];
                TileObjects.getNearest(strArr6).interact(lIIIIIIIll[lIIIIIIlII[73]]);
                Time.sleepTicks(lIIIIIIlII[10]);
                "".length();
            }
            if (llIlllIIlIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[74]];
                String[] strArr7 = new String[lIIIIIIlII[1]];
                strArr7[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[2]];
                TileObjects.getNearest(strArr7).interact(lIIIIIIIll[lIIIIIIlII[75]]);
                Time.sleepTicks(lIIIIIIlII[17]);
                "".length();
            }
        }
    }

    private static String llIllIlIllll(String lIIIlIIIIIllI, String lIIIlIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIIIIlll) {
            lIIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIIIIll[lIIIIIIlII[203]];
    }

    private static boolean llIlllIIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (llIlllIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ac.lIIIIIIlII[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (llIlllIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ac.lIIIIIIlII[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIIIIIlII[1]];
        iArr4[lIIIIIIlII[0]] = lIIIIIIlII[16];
        if (llIlllIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[16], lIIIIIIlII[1], lIIIIIIlII[195]));
            "".length();
        }
        int[] iArr5 = new int[lIIIIIIlII[1]];
        iArr5[lIIIIIIlII[0]] = lIIIIIIlII[18];
        if (llIlllIIllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[18], lIIIIIIlII[3], lIIIIIIlII[196]));
            "".length();
        }
        int[] iArr6 = new int[lIIIIIIlII[1]];
        iArr6[lIIIIIIlII[0]] = lIIIIIIlII[28];
        if (llIlllIIllIl(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[28], lIIIIIIlII[3], lIIIIIIlII[196]));
            "".length();
        }
        int[] iArr7 = new int[lIIIIIIlII[1]];
        iArr7[lIIIIIIlII[0]] = lIIIIIIlII[13];
        if (llIlllIIllIl(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[13], lIIIIIIlII[12], lIIIIIIlII[197]));
            "".length();
        }
        int[] iArr8 = new int[lIIIIIIlII[1]];
        iArr8[lIIIIIIlII[0]] = lIIIIIIlII[22];
        if (llIlllIIllIl(Bank.contains(iArr8) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[22], lIIIIIIlII[12], lIIIIIIlII[198]));
            "".length();
        }
        int[] iArr9 = new int[lIIIIIIlII[1]];
        iArr9[lIIIIIIlII[0]] = lIIIIIIlII[15];
        if (llIlllIIllIl(Bank.contains(iArr9) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[15], lIIIIIIlII[12], lIIIIIIlII[198]));
            "".length();
        }
        int[] iArr10 = new int[lIIIIIIlII[1]];
        iArr10[lIIIIIIlII[0]] = lIIIIIIlII[14];
        if (llIlllIIllIl(Bank.contains(iArr10) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIIIlII[14], lIIIIIIlII[12], lIIIIIIlII[198]));
            "".length();
        }
        int[] iArr11 = new int[lIIIIIIlII[1]];
        iArr11[lIIIIIIlII[0]] = lIIIIIIlII[24];
        if (llIlllIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIIIIlII[1]];
            iArr12[lIIIIIIlII[0]] = lIIIIIIlII[24];
            if (llIlllIIlIll(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIIIIIlII[1]];
                iArr13[lIIIIIIlII[0]] = lIIIIIIlII[24];
            }
            iArr = new int[lIIIIIIlII[1]];
            iArr[lIIIIIIlII[0]] = lIIIIIIlII[26];
            if (llIlllIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIIIIIIlII[1]];
                iArr14[lIIIIIIlII[0]] = lIIIIIIlII[26];
                if (llIlllIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIIIIIlII[1]];
                    iArr15[lIIIIIIlII[0]] = lIIIIIIlII[26];
                }
                iArr2 = new int[lIIIIIIlII[1]];
                iArr2[lIIIIIIlII[0]] = lIIIIIIlII[201];
                if (llIlllIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIIIlII[201], lIIIIIIlII[1], lIIIIIIlII[202]));
                    "".length();
                }
                iArr3 = new int[lIIIIIIlII[1]];
                iArr3[lIIIIIIlII[0]] = lIIIIIIlII[20];
                if (llIlllIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIIIlII[20], lIIIIIIlII[41], C0009j.ch));
                    "".length();
                    return;
                }
                return;
            }
            bx.add(new C0003d(lIIIIIIlII[26], lIIIIIIlII[12], lIIIIIIlII[200]));
            "".length();
            iArr2 = new int[lIIIIIIlII[1]];
            iArr2[lIIIIIIlII[0]] = lIIIIIIlII[201];
            if (llIlllIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIIIIIlII[1]];
            iArr3[lIIIIIIlII[0]] = lIIIIIIlII[20];
            if (llIlllIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bx.add(new C0003d(lZ, lIIIIIIlII[44], lIIIIIIlII[199]));
        "".length();
        iArr = new int[lIIIIIIlII[1]];
        iArr[lIIIIIIlII[0]] = lIIIIIIlII[26];
        if (llIlllIIlIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIIIlII[26], lIIIIIIlII[12], lIIIIIIlII[200]));
        "".length();
        iArr2 = new int[lIIIIIIlII[1]];
        iArr2[lIIIIIIlII[0]] = lIIIIIIlII[201];
        if (llIlllIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIIIIlII[1]];
        iArr3[lIIIIIIlII[0]] = lIIIIIIlII[20];
        if (llIlllIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static void dW() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[125], lIIIIIIlII[126], lIIIIIIlII[112], lIIIIIIlII[107], lIIIIIIlII[10]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[127], lIIIIIIlII[128], lIIIIIIlII[49], lIIIIIIlII[12], lIIIIIIlII[3]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[129], lIIIIIIlII[127], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[3]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[130], lIIIIIIlII[131], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[3]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[132], lIIIIIIlII[133], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[134], lIIIIIIlII[9], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea10 = new WorldArea(lIIIIIIlII[135], lIIIIIIlII[136], lIIIIIIlII[68], lIIIIIIlII[53], lIIIIIIlII[10]);
        WorldArea worldArea11 = new WorldArea(lIIIIIIlII[137], lIIIIIIlII[138], lIIIIIIlII[63], lIIIIIIlII[64], lIIIIIIlII[3]);
        WorldPoint worldPoint = new WorldPoint(lIIIIIIlII[137], lIIIIIIlII[139], lIIIIIIlII[0]);
        if (llIlllIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIlllIIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIIIIlII[1]);
            "".length();
        }
        if (llIlllIIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlllIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIIIIIlII[1]);
                "".length();
            }
            if (llIlllIlIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIIIIIlII[1]];
                strArr[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[142]];
                TileObjects.getNearest(strArr).interact(lIIIIIIIll[lIIIIIIlII[143]]);
                Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return "  ".length() == 0 ? ((90 ^ 57) ^ (200 ^ 142)) & (((60 ^ 8) ^ (82 ^ 67)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                }, lIIIIIIlII[104]);
                "".length();
                Time.sleepTicks(lIIIIIIlII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIIIIIlII[1]];
        strArr2[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIlllIIlllI(nearest) && llIlllIIlIll(dY() ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[145]];
            System.out.println(lIIIIIIIll[lIIIIIIlII[146]]);
            nearest.interact(lIIIIIIIll[lIIIIIIlII[147]]);
            Time.sleepTicks(lIIIIIIlII[10]);
            "".length();
        }
        if (llIlllIIllIl(dY() ? 1 : 0)) {
            if (llIlllIIlIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[233]]) ? 1 : 0) && llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[234], lIIIIIIlII[131], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return ((((13 + 107) - 108) + 150) ^ (((96 + 122) - 130) + 78)) <= "  ".length() ? ((73 ^ 121) ^ (94 ^ 39)) & (((((38 + 8) - (-63)) + 29) ^ (((57 + 15) - 21) + 144)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[148]];
                    nearest2.interact(lIIIIIIIll[lIIIIIIlII[149]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIlllIIlIll(tileObject2.getName().contains(lIIIIIIIll[lIIIIIIlII[232]]) ? 1 : 0) && llIlllIlIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[131], lIIIIIIlII[225], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (((129 ^ 165) ^ (40 ^ 79)) & (((((112 + 30) - (-69)) + 11) ^ (((137 + 65) - 111) + 66)) ^ (-" ".length()))) != 0 ? ((149 ^ 162) ^ (25 ^ 41)) & (((11 ^ 53) ^ (108 ^ 85)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest3)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIIIIIIll[lIIIIIIlII[151]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return "   ".length() != "   ".length() ? ((79 ^ 36) ^ (183 ^ 140)) & (((((18 + 99) - 32) + 111) ^ (((141 + 34) - 149) + 122)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIlllIIlIll(tileObject3.getName().contains(lIIIIIIIll[lIIIIIIlII[230]]) ? 1 : 0) && llIlllIlIIll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[139], lIIIIIIlII[231], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (-" ".length()) >= "   ".length() ? ((16 ^ 113) ^ (45 ^ 85)) & (((115 ^ 5) ^ (123 ^ 20)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest4)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIIIIIIll[lIIIIIIlII[153]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIlllIIlIll(tileObject4.getName().contains(lIIIIIIIll[lIIIIIIlII[227]]) ? 1 : 0) && llIlllIlIIll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[228], lIIIIIIlII[229], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return "  ".length() <= 0 ? ((13 ^ 69) ^ (235 ^ 182)) & (((((39 + 16) - 21) + 123) ^ (((103 + 100) - 168) + 101)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest5)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIIIIIIll[lIIIIIIlII[155]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return "   ".length() == "  ".length() ? ((157 ^ 134) ^ (72 ^ 111)) & (((155 ^ 136) ^ (38 ^ 9)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIlllIIlIll(tileObject5.getName().contains(lIIIIIIIll[lIIIIIIlII[226]]) ? 1 : 0) && llIlllIlIIll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[9], lIIIIIIlII[130], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return "  ".length() >= ((151 ^ 195) ^ (249 ^ 169)) ? ((153 ^ 180) ^ (17 ^ 31)) & (((((93 + 118) - 184) + 131) ^ (((2 + 29) - (-106)) + 52)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest6)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIIIIIIll[lIIIIIIlII[157]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return "   ".length() <= "  ".length() ? ((133 ^ 156) ^ (255 ^ 195)) & (((144 ^ 180) ^ " ".length()) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (llIlllIIlIll(tileObject6.getName().contains(lIIIIIIIll[lIIIIIIlII[224]]) ? 1 : 0) && llIlllIlIIll(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[225], lIIIIIIlII[215], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (-((((92 + 155) - 111) + 41) ^ (((157 + 125) - 181) + 80))) > 0 ? ((88 ^ 18) ^ (22 ^ 25)) & (((((24 + 118) - 51) + 128) ^ (((0 + 45) - (-38)) + 75)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest7)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIIIIIIIll[lIIIIIIlII[159]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (((112 ^ 66) ^ (41 ^ 59)) & (((109 ^ 127) ^ (180 ^ 134)) ^ (-" ".length()))) != 0 ? ((85 ^ 70) ^ (224 ^ 199)) & (((126 ^ 121) ^ (138 ^ 185)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (!llIlllIIlIll(dY() ? 1 : 0) && llIlllIIlIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (llIlllIIlIll(tileObject7.getName().contains(lIIIIIIIll[lIIIIIIlII[221]]) ? 1 : 0) && llIlllIlIIll(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[222], lIIIIIIlII[223], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest8)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIIIIIIIll[lIIIIIIlII[161]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
        }
    }

    static {
        llIlllIIlIlI();
        llIllIlllllI();
        bx = new ArrayList();
        lY = lIIIIIIlII[28];
        lZ = lIIIIIIlII[24];
        mb = new WorldArea(lIIIIIIlII[235], lIIIIIIlII[52], lIIIIIIlII[69], lIIIIIIlII[72], lIIIIIIlII[0]);
        mc = new WorldArea(lIIIIIIlII[235], lIIIIIIlII[52], lIIIIIIlII[69], lIIIIIIlII[72], lIIIIIIlII[1]);
        md = new WorldArea(lIIIIIIlII[235], lIIIIIIlII[52], lIIIIIIlII[69], lIIIIIIlII[72], lIIIIIIlII[3]);
        me = new WorldPoint(lIIIIIIlII[236], lIIIIIIlII[237], lIIIIIIlII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void dT() {
        if (llIlllIIlIll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[0]];
            C0001b.a(bx);
            if (llIlllIIllII(bx.size(), lIIIIIIlII[1])) {
                System.out.println(lIIIIIIIll[lIIIIIIlII[1]]);
                bv = lIIIIIIlII[0];
            }
        }
        if (llIlllIIllIl(bv ? 1 : 0) && llIlllIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[2])) {
            if (llIlllIIllIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllIIlllI(nearest) && llIlllIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[3]];
                    if (llIlllIIlIll(new WorldArea(lIIIIIIlII[4], lIIIIIIlII[5], lIIIIIIlII[6], lIIIIIIlII[7], lIIIIIIlII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIIIIIlII[8], lIIIIIIlII[9], lIIIIIIlII[0]);
                        if (llIlllIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIlII[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIIIIIlII[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (llIlllIIlllI(nearest) && llIlllIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[10]];
                    if (llIlllIIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIlII[11]);
                        "".length();
                    }
                    if (llIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (llIlllIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIlII[1]);
                            "".length();
                        }
                        if (llIlllIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIlII[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIIIIIlII[12]];
                    iArr[lIIIIIIlII[0]] = lIIIIIIlII[13];
                    iArr[lIIIIIIlII[1]] = lIIIIIIlII[14];
                    iArr[lIIIIIIlII[3]] = lIIIIIIlII[15];
                    iArr[lIIIIIIlII[10]] = lIIIIIIlII[16];
                    iArr[lIIIIIIlII[17]] = lIIIIIIlII[18];
                    iArr[lIIIIIIlII[19]] = lIIIIIIlII[20];
                    iArr[lIIIIIIlII[21]] = lIIIIIIlII[22];
                    iArr[lIIIIIIlII[23]] = lIIIIIIlII[24];
                    iArr[lIIIIIIlII[25]] = lIIIIIIlII[26];
                    iArr[lIIIIIIlII[27]] = lIIIIIIlII[28];
                    if (llIlllIIllIl(C0004e.d(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(lIIIIIIIll[lIIIIIIlII[17]]);
                        bv = lIIIIIIlII[1];
                        return;
                    }
                    int[] iArr2 = new int[lIIIIIIlII[12]];
                    iArr2[lIIIIIIlII[0]] = lIIIIIIlII[13];
                    iArr2[lIIIIIIlII[1]] = lIIIIIIlII[14];
                    iArr2[lIIIIIIlII[3]] = lIIIIIIlII[15];
                    iArr2[lIIIIIIlII[10]] = lIIIIIIlII[16];
                    iArr2[lIIIIIIlII[17]] = lIIIIIIlII[18];
                    iArr2[lIIIIIIlII[19]] = lIIIIIIlII[20];
                    iArr2[lIIIIIIlII[21]] = lIIIIIIlII[22];
                    iArr2[lIIIIIIlII[23]] = lIIIIIIlII[24];
                    iArr2[lIIIIIIlII[25]] = lIIIIIIlII[26];
                    iArr2[lIIIIIIlII[27]] = lIIIIIIlII[28];
                    if (llIlllIIlIll(C0004e.d(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIIIIIlII[29], lIIIIIIlII[1]);
                        C0000a.a(lIIIIIIlII[30], lIIIIIIlII[1]);
                        C0000a.a(lIIIIIIlII[31], lIIIIIIlII[1]);
                        C0000a.a(lIIIIIIlII[32], lIIIIIIlII[1]);
                        C0000a.a(lIIIIIIlII[33], lIIIIIIlII[1]);
                        C0000a.a(lIIIIIIlII[34], lIIIIIIlII[1]);
                        C0000a.a(lIIIIIIlII[35], lIIIIIIlII[1]);
                        int[] iArr3 = new int[lIIIIIIlII[1]];
                        iArr3[lIIIIIIlII[0]] = lIIIIIIlII[29];
                        if (llIlllIIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIIIlII[1]];
                            iArr4[lIIIIIIlII[0]] = lIIIIIIlII[29];
                            if (llIlllIIllIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIIIIIlII[1]];
                                iArr5[lIIIIIIlII[0]] = lIIIIIIlII[29];
                                if (llIlllIIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIIIIIIlII[36], lIIIIIIlII[1]);
                                }
                            }
                        }
                        C0000a.a(lIIIIIIlII[18], lIIIIIIlII[1]);
                        C0004e.l(lIIIIIIlII[29]);
                        C0004e.l(lIIIIIIlII[30]);
                        C0004e.l(lIIIIIIlII[31]);
                        C0004e.l(lIIIIIIlII[32]);
                        C0004e.l(lIIIIIIlII[33]);
                        Time.sleepTicks(lIIIIIIlII[1]);
                        "".length();
                        C0004e.l(lIIIIIIlII[35]);
                        C0004e.l(lIIIIIIlII[37]);
                        C0004e.l(lIIIIIIlII[34]);
                        C0004e.l(lIIIIIIlII[36]);
                        C0004e.l(lIIIIIIlII[18]);
                        Time.sleepTicks(lIIIIIIlII[10]);
                        "".length();
                        if (llIlllIIllIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIIIIIlII[21]);
                            "".length();
                        }
                        if (llIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                            if (llIlllIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[38])) {
                                C0000a.a(lIIIIIIlII[13], lIIIIIIlII[12]);
                                C0000a.a(lIIIIIIlII[14], lIIIIIIlII[12]);
                                C0000a.a(lIIIIIIlII[22], lIIIIIIlII[12]);
                                C0000a.a(lIIIIIIlII[15], lIIIIIIlII[12]);
                                C0000a.b(C0005f.bm, lIIIIIIlII[1]);
                                C0000a.a(lIIIIIIlII[28], lIIIIIIlII[1]);
                                C0000a.a(lIIIIIIlII[20], lIIIIIIlII[19]);
                                C0000a.a(lIIIIIIlII[24], lIIIIIIlII[39]);
                            }
                            if (llIlllIlIIIl(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[38])) {
                                C0000a.a(lIIIIIIlII[13], lIIIIIIlII[12]);
                                C0000a.a(lIIIIIIlII[22], lIIIIIIlII[12]);
                                C0000a.a(lIIIIIIlII[26], lIIIIIIlII[12]);
                                C0000a.b(C0005f.bm, lIIIIIIlII[1]);
                                C0000a.a(lIIIIIIlII[28], lIIIIIIlII[1]);
                                C0000a.a(lIIIIIIlII[20], lIIIIIIlII[25]);
                                C0000a.a(lIIIIIIlII[24], lIIIIIIlII[12]);
                            }
                        }
                    }
                }
            }
            if (llIlllIIlIll(an() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIlII[1]];
                strArr[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[19]];
                if (llIlllIIlIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIIIIlII[1]];
                    strArr2[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[21]];
                    Inventory.getFirst(strArr2).interact(lIIIIIIIll[lIIIIIIlII[23]]);
                }
                if (llIlllIIlIll(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlllIIllII(Movement.getRunEnergy(), lIIIIIIlII[40])) {
                    Inventory.getFirst(C0005f.bc).interact(lIIIIIIIll[lIIIIIIlII[25]]);
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
                if (llIlllIIllll(Combat.getMissingHealth(), lIIIIIIlII[41])) {
                    int[] iArr6 = new int[lIIIIIIlII[1]];
                    iArr6[lIIIIIIlII[0]] = lIIIIIIlII[24];
                    if (llIlllIIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIIIIlII[1]];
                        iArr7[lIIIIIIlII[0]] = lIIIIIIlII[24];
                        Inventory.getFirst(iArr7).interact(lIIIIIIIll[lIIIIIIlII[27]]);
                        Time.sleepTicks(lIIIIIIlII[3]);
                        "".length();
                    }
                }
                if (llIlllIIllll(Movement.getRunEnergy(), lIIIIIIlII[42]) && llIlllIIllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (llIlllIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[2])) {
                    dU();
                }
                if ((!llIlllIlIIIl(C0004e.j(lIIIIIIlII[43]), lIIIIIIlII[44]) || llIlllIIllII(C0004e.j(lIIIIIIlII[45]), lIIIIIIlII[19])) && llIlllIlIIIl(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[2]) && llIlllIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[44])) {
                    dV();
                }
                if (llIlllIlIIIl(C0004e.j(lIIIIIIlII[43]), lIIIIIIlII[44]) && llIlllIlIIIl(C0004e.j(lIIIIIIlII[45]), lIIIIIIlII[19])) {
                    if (llIlllIlIIIl(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[2]) && llIlllIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[38])) {
                        dV();
                    }
                    if (llIlllIlIIIl(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[38]) && llIlllIIllII(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[44])) {
                        dW();
                    }
                }
                if (llIlllIlIIIl(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[44])) {
                    dX();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIIIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean an() {
        if (llIlllIlIIIl(Skills.getBoostedLevel(Skill.AGILITY), lIIIIIIlII[38])) {
            int[] iArr = new int[lIIIIIIlII[1]];
            iArr[lIIIIIIlII[0]] = lIIIIIIlII[13];
            if (llIlllIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIIlII[1]];
                iArr2[lIIIIIIlII[0]] = lIIIIIIlII[26];
                if (llIlllIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIIIlII[1]];
                    iArr3[lIIIIIIlII[0]] = lIIIIIIlII[24];
                    if (llIlllIIlIll(Inventory.contains(iArr3) ? 1 : 0) && ((!llIlllIIllIl(Inventory.contains(item -> {
                        return item.getName().contains(lIIIIIIIll[lIIIIIIlII[207]]);
                    }) ? 1 : 0) || llIlllIIlIll(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIIIIIIIll[lIIIIIIlII[206]]);
                    }) ? 1 : 0)) && (!llIlllIIllIl(Inventory.contains(C0005f.bm) ? 1 : 0) || llIlllIIlIll(Equipment.contains(C0005f.bm) ? 1 : 0)))) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return ((((151 + 128) - 273) + 157) ^ (((109 + 144) - 155) + 68)) <= 0 ? ((91 ^ 46) ^ (132 ^ 193)) & (((26 ^ 92) ^ (65 ^ 55)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lIIIIIIlII[0];
        }
        int[] iArr4 = new int[lIIIIIIlII[1]];
        iArr4[lIIIIIIlII[0]] = lIIIIIIlII[13];
        if (llIlllIIlIll(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIIIIIlII[1]];
            iArr5[lIIIIIIlII[0]] = lIIIIIIlII[15];
            if (llIlllIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIIIIlII[1]];
                iArr6[lIIIIIIlII[0]] = lIIIIIIlII[14];
                if (llIlllIIlIll(Inventory.contains(iArr6) ? 1 : 0) && ((!llIlllIIllIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIIIIIIll[lIIIIIIlII[205]]);
                }) ? 1 : 0) || llIlllIIlIll(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIIIIIIIll[lIIIIIIlII[204]]);
                }) ? 1 : 0)) && (!llIlllIIllIl(Inventory.contains(C0005f.bm) ? 1 : 0) || llIlllIIlIll(Equipment.contains(C0005f.bm) ? 1 : 0)))) {
                    ?? r02 = lIIIIIIlII[1];
                    "".length();
                    return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return lIIIIIIlII[0];
    }

    private static boolean llIlllIlIIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean dY() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[80], lIIIIIIlII[81], lIIIIIIlII[69], lIIIIIIlII[64], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[82], lIIIIIIlII[81], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[83], lIIIIIIlII[84], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[10]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[189], lIIIIIIlII[190], lIIIIIIlII[25], lIIIIIIlII[19], lIIIIIIlII[1]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[85], lIIIIIIlII[87], lIIIIIIlII[12], lIIIIIIlII[25], lIIIIIIlII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[191], lIIIIIIlII[192], lIIIIIIlII[73], lIIIIIIlII[39], lIIIIIIlII[10]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[90], lIIIIIIlII[91], lIIIIIIlII[66], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[93], lIIIIIIlII[23], lIIIIIIlII[27], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[92], lIIIIIIlII[94], lIIIIIIlII[12], lIIIIIIlII[23], lIIIIIIlII[10]);
        WorldArea worldArea10 = new WorldArea(lIIIIIIlII[127], lIIIIIIlII[128], lIIIIIIlII[49], lIIIIIIlII[12], lIIIIIIlII[3]);
        WorldArea worldArea11 = new WorldArea(lIIIIIIlII[129], lIIIIIIlII[127], lIIIIIIlII[49], lIIIIIIlII[25], lIIIIIIlII[3]);
        WorldArea worldArea12 = new WorldArea(lIIIIIIlII[130], lIIIIIIlII[131], lIIIIIIlII[63], lIIIIIIlII[49], lIIIIIIlII[3]);
        WorldArea worldArea13 = new WorldArea(lIIIIIIlII[132], lIIIIIIlII[133], lIIIIIIlII[12], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea14 = new WorldArea(lIIIIIIlII[134], lIIIIIIlII[9], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea15 = new WorldArea(lIIIIIIlII[135], lIIIIIIlII[136], lIIIIIIlII[68], lIIIIIIlII[53], lIIIIIIlII[10]);
        WorldArea worldArea16 = new WorldArea(lIIIIIIlII[137], lIIIIIIlII[138], lIIIIIIlII[63], lIIIIIIlII[64], lIIIIIIlII[3]);
        WorldArea worldArea17 = new WorldArea(lIIIIIIlII[164], lIIIIIIlII[133], lIIIIIIlII[64], lIIIIIIlII[12], lIIIIIIlII[10]);
        WorldArea worldArea18 = new WorldArea(lIIIIIIlII[165], lIIIIIIlII[139], lIIIIIIlII[39], lIIIIIIlII[53], lIIIIIIlII[3]);
        WorldArea worldArea19 = new WorldArea(lIIIIIIlII[166], lIIIIIIlII[134], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea20 = new WorldArea(lIIIIIIlII[167], lIIIIIIlII[136], lIIIIIIlII[70], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea21 = new WorldArea(lIIIIIIlII[168], lIIIIIIlII[169], lIIIIIIlII[54], lIIIIIIlII[63], lIIIIIIlII[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIIIIIIlII[68]];
        worldAreaArr[lIIIIIIlII[0]] = worldArea;
        worldAreaArr[lIIIIIIlII[1]] = worldArea2;
        worldAreaArr[lIIIIIIlII[3]] = worldArea3;
        worldAreaArr[lIIIIIIlII[10]] = worldArea4;
        worldAreaArr[lIIIIIIlII[17]] = worldArea5;
        worldAreaArr[lIIIIIIlII[19]] = worldArea6;
        worldAreaArr[lIIIIIIlII[21]] = worldArea7;
        worldAreaArr[lIIIIIIlII[23]] = worldArea8;
        worldAreaArr[lIIIIIIlII[25]] = worldArea9;
        worldAreaArr[lIIIIIIlII[27]] = worldArea10;
        worldAreaArr[lIIIIIIlII[12]] = worldArea11;
        worldAreaArr[lIIIIIIlII[49]] = worldArea12;
        worldAreaArr[lIIIIIIlII[63]] = worldArea13;
        worldAreaArr[lIIIIIIlII[64]] = worldArea14;
        worldAreaArr[lIIIIIIlII[53]] = worldArea15;
        worldAreaArr[lIIIIIIlII[39]] = worldArea16;
        worldAreaArr[lIIIIIIlII[65]] = worldArea17;
        worldAreaArr[lIIIIIIlII[66]] = worldArea18;
        worldAreaArr[lIIIIIIlII[54]] = worldArea19;
        worldAreaArr[lIIIIIIlII[67]] = worldArea20;
        worldAreaArr[lIIIIIIlII[41]] = worldArea21;
        int[] iArr = new int[lIIIIIIlII[1]];
        iArr[lIIIIIIlII[0]] = lIIIIIIlII[193];
        if (llIlllIIlllI(TileItems.getNearest(iArr))) {
            System.out.println(lIIIIIIIll[lIIIIIIlII[194]]);
            int i = lIIIIIIlII[0];
            while (llIlllIIllII(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lIIIIIIlII[1]];
                iArr2[lIIIIIIlII[0]] = lIIIIIIlII[193];
                if (llIlllIIlIll(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && llIlllIIlIll(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIIIIIlII[1];
                }
                i++;
                "".length();
                if (0 != 0) {
                    return ((76 ^ 83) ^ (163 ^ 131)) & (((92 ^ 41) ^ (45 ^ 103)) ^ (-" ".length()));
                }
            }
        }
        return lIIIIIIlII[0];
    }

    private static void llIlllIIlIlI() {
        lIIIIIIlII = new int[239];
        lIIIIIIlII[0] = ((((105 + 116) - 73) + 53) ^ (((24 + 83) - 49) + 72)) & (((((117 + 17) - 131) + 206) ^ (((51 + 2) - (-73)) + 28)) ^ (-" ".length()));
        lIIIIIIlII[1] = " ".length();
        lIIIIIIlII[2] = (130 ^ 175) ^ (84 ^ 103);
        lIIIIIIlII[3] = "  ".length();
        lIIIIIIlII[4] = (-25105) & 28567;
        lIIIIIIlII[5] = (-((-16773) & 29631)) & (-16449) & 32767;
        lIIIIIIlII[6] = (214 ^ 184) ^ (67 ^ 19);
        lIIIIIIlII[7] = (((41 + 53) - 69) + 102) ^ (6 ^ 74);
        lIIIIIIlII[8] = (-((-4777) & 13039)) & (-2) & 11775;
        lIIIIIIlII[9] = (-((-65) & 12902)) & (-1) & 16317;
        lIIIIIIlII[10] = "   ".length();
        lIIIIIIlII[11] = (-17493) & 22492;
        lIIIIIIlII[12] = 105 ^ 99;
        lIIIIIIlII[13] = (-((-35) & 16571)) & (-8225) & 32767;
        lIIIIIIlII[14] = (-8242) & 16249;
        lIIIIIIlII[15] = (-((-2627) & 19059)) & (-135) & 24575;
        lIIIIIIlII[16] = (-(((61 + 145) - 100) + 135)) & (-8193) & 12285;
        lIIIIIIlII[17] = 173 ^ 169;
        lIIIIIIlII[18] = (-51) & 12030;
        lIIIIIIlII[19] = (8 ^ 89) ^ (80 ^ 4);
        lIIIIIIlII[20] = (-19591) & 32215;
        lIIIIIIlII[21] = 35 ^ 37;
        lIIIIIIlII[22] = (-((-21442) & 29683)) & (-5) & 16255;
        lIIIIIIlII[23] = (56 ^ 60) ^ "   ".length();
        lIIIIIIlII[24] = (-14973) & 15357;
        lIIIIIIlII[25] = 121 ^ 113;
        lIIIIIIlII[26] = (-8717) & 28335;
        lIIIIIIlII[27] = (((129 + 120) - 192) + 119) ^ (((170 + 179) - 291) + 127);
        lIIIIIIlII[28] = (-((-851) & 12151)) & (-1) & 32446;
        lIIIIIIlII[29] = (-395) & 12254;
        lIIIIIIlII[30] = (-4354) & 16209;
        lIIIIIIlII[31] = (-((-14093) & 30653)) & (-2) & 28415;
        lIIIIIIlII[32] = (-((-31945) & 32252)) & (-4225) & 16383;
        lIIIIIIlII[33] = (-16518) & 28375;
        lIIIIIIlII[34] = (-20645) & 32494;
        lIIIIIIlII[35] = (-20774) & 32741;
        lIIIIIIlII[36] = 20 ^ 76;
        lIIIIIIlII[37] = (-((-17183) & 29567)) & (-145) & 32763;
        lIIIIIIlII[38] = (32 ^ 96) ^ (51 ^ 91);
        lIIIIIIlII[39] = 5 ^ 10;
        lIIIIIIlII[40] = (111 ^ 113) ^ (158 ^ 178);
        lIIIIIIlII[41] = 75 ^ 95;
        lIIIIIIlII[42] = 59 ^ 34;
        lIIIIIIlII[43] = (-9809) & 10110;
        lIIIIIIlII[44] = (50 ^ 105) ^ (93 ^ 58);
        lIIIIIIlII[45] = (-18501) & 18807;
        lIIIIIIlII[46] = (-13385) & 15853;
        lIIIIIIlII[47] = (-((-1353) & 30553)) & (-1) & 32635;
        lIIIIIIlII[48] = (-4249) & 7672;
        lIIIIIIlII[49] = (121 ^ 42) ^ (250 ^ 162);
        lIIIIIIlII[50] = (-((-11601) & 28113)) & (-8739) & 28671;
        lIIIIIIlII[51] = (-((-2357) & 8061)) & (-16407) & 24575;
        lIIIIIIlII[52] = (-4649) & 8063;
        lIIIIIIlII[53] = 85 ^ 91;
        lIIIIIIlII[54] = (56 ^ 114) ^ (116 ^ 44);
        lIIIIIIlII[55] = (-8769) & 11251;
        lIIIIIIlII[56] = (-25250) & 28665;
        lIIIIIIlII[57] = (-21513) & 23994;
        lIIIIIIlII[58] = (-((-9435) & 9979)) & (-4231) & 8191;
        lIIIIIIlII[59] = (-1615) & 4095;
        lIIIIIIlII[60] = (-((-1027) & 1563)) & (-28801) & 32763;
        lIIIIIIlII[61] = (((134 + 99) - 80) + 13) ^ (((37 + 0) - (-116)) + 23);
        lIIIIIIlII[62] = -" ".length();
        lIIIIIIlII[63] = 6 ^ 10;
        lIIIIIIlII[64] = 94 ^ 83;
        lIIIIIIlII[65] = 167 ^ 183;
        lIIIIIIlII[66] = (((138 + 158) - 261) + 149) ^ (((94 + 125) - 68) + 18);
        lIIIIIIlII[67] = 59 ^ 40;
        lIIIIIIlII[68] = (175 ^ 158) ^ (114 ^ 86);
        lIIIIIIlII[69] = 213 ^ 194;
        lIIIIIIlII[70] = 144 ^ 136;
        lIIIIIIlII[71] = (204 ^ 188) ^ (227 ^ 137);
        lIIIIIIlII[72] = (((39 + 87) - 11) + 25) ^ (((114 + 84) - 91) + 44);
        lIIIIIIlII[73] = (170 ^ 192) ^ (19 ^ 101);
        lIIIIIIlII[74] = 68 ^ 89;
        lIIIIIIlII[75] = (156 ^ 140) ^ (19 ^ 28);
        lIIIIIIlII[76] = (-((-18039) & 30583)) & (-641) & 16351;
        lIIIIIIlII[77] = (-((-2102) & 30783)) & (-737) & 32767;
        lIIIIIIlII[78] = ((118 + 25) - 82) + 76;
        lIIIIIIlII[79] = 13 ^ 83;
        lIIIIIIlII[80] = (-4673) & 7891;
        lIIIIIIlII[81] = (-37) & 3445;
        lIIIIIIlII[82] = (-((-210) & 29683)) & (-19) & 32703;
        lIIIIIIlII[83] = (-((-20473) & 32762)) & (-257) & 15743;
        lIIIIIIlII[84] = (-16426) & 19837;
        lIIIIIIlII[85] = (-((-17510) & 26351)) & (-4353) & 16383;
        lIIIIIIlII[86] = (-16425) & 19837;
        lIIIIIIlII[87] = (-((-4101) & 29319)) & (-53) & 28671;
        lIIIIIIlII[88] = (-((-2193) & 27029)) & (-4097) & 32111;
        lIIIIIIlII[89] = (-4161) & 7542;
        lIIIIIIlII[90] = (-24903) & 28119;
        lIIIIIIlII[91] = (-((-9941) & 14076)) & (-529) & 8055;
        lIIIIIIlII[92] = (-266) & 3499;
        lIIIIIIlII[93] = (-17025) & 20426;
        lIIIIIIlII[94] = (-((-19545) & 27738)) & (-16525) & 28127;
        lIIIIIIlII[95] = 12 ^ 44;
        lIIIIIIlII[96] = (-((-8339) & 29686)) & (-1) & 24571;
        lIIIIIIlII[97] = (111 ^ 37) ^ (92 ^ 55);
        lIIIIIIlII[98] = (73 ^ 97) ^ (149 ^ 159);
        lIIIIIIlII[99] = (44 ^ 9) ^ (120 ^ 126);
        lIIIIIIlII[100] = 120 ^ 92;
        lIIIIIIlII[101] = (174 ^ 189) ^ (158 ^ 168);
        lIIIIIIlII[102] = 44 ^ 10;
        lIIIIIIlII[103] = 104 ^ 79;
        lIIIIIIlII[104] = (-((-8403) & 15582)) & (-513) & 16191;
        lIIIIIIlII[105] = 98 ^ 75;
        lIIIIIIlII[106] = (38 ^ 10) ^ (21 ^ 19);
        lIIIIIIlII[107] = (86 ^ 113) ^ (119 ^ 123);
        lIIIIIIlII[108] = (10 ^ 36) ^ "  ".length();
        lIIIIIIlII[109] = (39 ^ 77) ^ (46 ^ 105);
        lIIIIIIlII[110] = 59 ^ 21;
        lIIIIIIlII[111] = (((78 + 119) - 134) + 123) ^ (((142 + 50) - 182) + 139);
        lIIIIIIlII[112] = 175 ^ 159;
        lIIIIIIlII[113] = 17 ^ 32;
        lIIIIIIlII[114] = (120 ^ 45) ^ (15 ^ 110);
        lIIIIIIlII[115] = (-1025) & 15858;
        lIIIIIIlII[116] = 12 ^ 57;
        lIIIIIIlII[117] = 46 ^ 24;
        lIIIIIIlII[118] = (-((-12467) & 29371)) & (-1) & 31739;
        lIIIIIIlII[119] = 131 ^ 180;
        lIIIIIIlII[120] = (((108 + 149) - 171) + 94) ^ (((108 + 58) - 112) + 86);
        lIIIIIIlII[121] = (-((-8233) & 24618)) & (-1035) & 32255;
        lIIIIIIlII[122] = (88 ^ 124) ^ (146 ^ 143);
        lIIIIIIlII[123] = 134 ^ 188;
        lIIIIIIlII[124] = (((14 + 11) - (-111)) + 35) ^ (((57 + 20) - (-39)) + 28);
        lIIIIIIlII[125] = (-24609) & 28079;
        lIIIIIIlII[126] = (-4178) & 7643;
        lIIIIIIlII[127] = (-((-2235) & 15035)) & (-65) & 16366;
        lIIIIIIlII[128] = (-12357) & 15846;
        lIIIIIIlII[129] = (-((-1853) & 6013)) & (-16905) & 24559;
        lIIIIIIlII[130] = (-((-1027) & 30307)) & (-1) & 32763;
        lIIIIIIlII[131] = (-28755) & 32251;
        lIIIIIIlII[132] = (-((-7685) & 32333)) & (-35) & 28154;
        lIIIIIIlII[133] = (-12805) & 16293;
        lIIIIIIlII[134] = (-(34 ^ 75)) & (-20485) & 24063;
        lIIIIIIlII[135] = (-12321) & 15805;
        lIIIIIIlII[136] = (-4133) & 7599;
        lIIIIIIlII[137] = (-20549) & 24054;
        lIIIIIIlII[138] = (-16897) & 20369;
        lIIIIIIlII[139] = (-((-2881) & 31585)) & (-577) & 32766;
        lIIIIIIlII[140] = 127 ^ 66;
        lIIIIIIlII[141] = 3 ^ 60;
        lIIIIIIlII[142] = 223 ^ 159;
        lIIIIIIlII[143] = (((125 + 71) - 32) + 67) ^ (((104 + 50) - 85) + 97);
        lIIIIIIlII[144] = (((14 + 97) - (-42)) + 39) ^ (((6 + 97) - 73) + 100);
        lIIIIIIlII[145] = 114 ^ 49;
        lIIIIIIlII[146] = 220 ^ 152;
        lIIIIIIlII[147] = 88 ^ 29;
        lIIIIIIlII[148] = (135 ^ 186) ^ (204 ^ 183);
        lIIIIIIlII[149] = 22 ^ 81;
        lIIIIIIlII[150] = 208 ^ 152;
        lIIIIIIlII[151] = (38 ^ 126) ^ (19 ^ 2);
        lIIIIIIlII[152] = 57 ^ 115;
        lIIIIIIlII[153] = 42 ^ 97;
        lIIIIIIlII[154] = 56 ^ 116;
        lIIIIIIlII[155] = 222 ^ 147;
        lIIIIIIlII[156] = (52 ^ 49) ^ (218 ^ 145);
        lIIIIIIlII[157] = (((122 + 96) - 137) + 166) ^ (((84 + 31) - 94) + 163);
        lIIIIIIlII[158] = 228 ^ 180;
        lIIIIIIlII[159] = 253 ^ 172;
        lIIIIIIlII[160] = (((27 + 28) - (-150)) + 40) ^ (((115 + 18) - 64) + 98);
        lIIIIIIlII[161] = 151 ^ 196;
        lIIIIIIlII[162] = (-((-8813) & 26605)) & (-4097) & 24575;
        lIIIIIIlII[163] = (-((-9827) & 30435)) & (-514) & 24575;
        lIIIIIIlII[164] = (-((-2459) & 23035)) & (-1025) & 24319;
        lIIIIIIlII[165] = (-1137) & 3837;
        lIIIIIIlII[166] = (-((-1353) & 9581)) & (-1033) & 11967;
        lIIIIIIlII[167] = (-((-361) & 24957)) & (-97) & 27389;
        lIIIIIIlII[168] = (-((-2849) & 28476)) & (-4449) & 32763;
        lIIIIIIlII[169] = (-((-2177) & 27375)) & (-4113) & 32767;
        lIIIIIIlII[170] = (-21831) & 24559;
        lIIIIIIlII[171] = (-((-9273) & 9851)) & (-16410) & 20475;
        lIIIIIIlII[172] = 93 ^ 9;
        lIIIIIIlII[173] = (((70 + 22) - (-92)) + 53) ^ (((22 + 24) - (-54)) + 84);
        lIIIIIIlII[174] = 215 ^ 129;
        lIIIIIIlII[175] = (240 ^ 192) ^ (16 ^ 119);
        lIIIIIIlII[176] = 19 ^ 74;
        lIIIIIIlII[177] = (26 ^ 83) ^ (47 ^ 60);
        lIIIIIIlII[178] = 195 ^ 152;
        lIIIIIIlII[179] = (153 ^ 162) ^ (118 ^ 17);
        lIIIIIIlII[180] = (21 ^ 53) ^ (198 ^ 187);
        lIIIIIIlII[181] = 82 ^ 13;
        lIIIIIIlII[182] = 68 ^ 36;
        lIIIIIIlII[183] = (125 ^ 64) ^ (192 ^ 156);
        lIIIIIIlII[184] = (((197 + 224) - 231) + 39) ^ (((69 + 69) - 120) + 117);
        lIIIIIIlII[185] = 82 ^ 49;
        lIIIIIIlII[186] = (41 ^ 20) ^ (117 ^ 44);
        lIIIIIIlII[187] = (224 ^ 142) ^ (58 ^ 49);
        lIIIIIIlII[188] = (189 ^ 175) ^ (230 ^ 146);
        lIIIIIIlII[189] = (-((-20513) & 29225)) & (-20481) & 32383;
        lIIIIIIlII[190] = (-(((24 + 114) - 40) + 72)) & (-12801) & 16383;
        lIIIIIIlII[191] = (-((-5) & 12949)) & (-16641) & 32766;
        lIIIIIIlII[192] = (-4161) & 7547;
        lIIIIIIlII[193] = (-401) & 12249;
        lIIIIIIlII[194] = (((47 + 245) - 110) + 72) ^ (((51 + 40) - (-21)) + 41);
        lIIIIIIlII[195] = (-10371) & 15870;
        lIIIIIIlII[196] = (-(56 ^ 112)) & (-1041) & 26111;
        lIIIIIIlII[197] = (-25643) & 26542;
        lIIIIIIlII[198] = (-21505) & 22454;
        lIIIIIIlII[199] = (-26721) & 28670;
        lIIIIIIlII[200] = (-7170) & 16119;
        lIIIIIIlII[201] = (-((-5761) & 6053)) & (-16385) & 28654;
        lIIIIIIlII[202] = (-((-8885) & 12982)) & (-513) & 30559;
        lIIIIIIlII[203] = 29 ^ 117;
        lIIIIIIlII[204] = 212 ^ 189;
        lIIIIIIlII[205] = (185 ^ 155) ^ (228 ^ 172);
        lIIIIIIlII[206] = 57 ^ 82;
        lIIIIIIlII[207] = (((16 + 191) - 8) + 27) ^ (((15 + 126) - 83) + 84);
        lIIIIIIlII[208] = 231 ^ 138;
        lIIIIIIlII[209] = (-24641) & 27343;
        lIIIIIIlII[210] = (-25207) & 28671;
        lIIIIIIlII[211] = (((85 + 174) - 142) + 78) ^ (((2 + 44) - (-124)) + 3);
        lIIIIIIlII[212] = (-529) & 3997;
        lIIIIIIlII[213] = 53 ^ 90;
        lIIIIIIlII[214] = (-((-9911) & 30711)) & (-8201) & 31711;
        lIIIIIIlII[215] = (-((-451) & 29166)) & (-1) & 32191;
        lIIIIIIlII[216] = 235 ^ 155;
        lIIIIIIlII[217] = (-((-18777) & 32121)) & (-16641) & 32694;
        lIIIIIIlII[218] = (50 ^ 122) ^ (186 ^ 131);
        lIIIIIIlII[219] = (-((-33) & 17781)) & (-12299) & 32767;
        lIIIIIIlII[220] = (-((-11331) & 32347)) & (-67) & 24575;
        lIIIIIIlII[221] = 54 ^ 68;
        lIIIIIIlII[222] = (-8266) & 11775;
        lIIIIIIlII[223] = (-((-27337) & 31468)) & (-16449) & 24063;
        lIIIIIIlII[224] = 243 ^ 128;
        lIIIIIIlII[225] = (-4609) & 8111;
        lIIIIIIlII[226] = 125 ^ 9;
        lIIIIIIlII[227] = 68 ^ 49;
        lIIIIIIlII[228] = (-29194) & 32671;
        lIIIIIIlII[229] = (-4113) & 7604;
        lIIIIIIlII[230] = 112 ^ 6;
        lIIIIIIlII[231] = (-(4 ^ 1)) & (-16897) & 20399;
        lIIIIIIlII[232] = 121 ^ 14;
        lIIIIIIlII[233] = 254 ^ 134;
        lIIIIIIlII[234] = (-25103) & 28607;
        lIIIIIIlII[235] = (-((-8229) & 12397)) & (-1041) & 7676;
        lIIIIIIlII[236] = (-((-687) & 30463)) & (-517) & 32766;
        lIIIIIIlII[237] = (-((-19685) & 24309)) & (-8321) & 16381;
        lIIIIIIlII[238] = 98 ^ 27;
    }

    private static boolean llIlllIlIIII(int i) {
        return i > 0;
    }

    private static void llIllIlllllI() {
        lIIIIIIIll = new String[lIIIIIIlII[238]];
        lIIIIIIIll[lIIIIIIlII[0]] = llIllIlIllIl("ZYuvhpXpzFXEQS7ajOQVcA==", "ITCtE");
        lIIIIIIIll[lIIIIIIlII[1]] = llIllIlIllIl("wxFJM7HwVJkCucFBR7kPLzLqFGo5CUWbsvI36dMSRJ692oHoqIU0wQAOAKM9sgpKy0d9Yrid9S0=", "BaUzE");
        lIIIIIIIll[lIIIIIIlII[3]] = llIllIlIlllI("DDEUGTcjJAseN2IkDVAyIz4J", "BPbpP");
        lIIIIIIIll[lIIIIIIlII[10]] = llIllIlIllIl("QbqV1je/Nq/gqauNbJ5jqHr+fJqCA5ic", "vgJFr");
        lIIIIIIIll[lIIIIIIlII[17]] = llIllIlIllll("gAwRZjmpS059CG5/BoolCKnovOWUG3xUil6o3WR37YTR6bIWYK9No5r7w4jZJQ4pb5QMhcv1KSs=", "FwwuH");
        lIIIIIIIll[lIIIIIIlII[19]] = llIllIlIlllI("LzEGBA==", "yXghd");
        lIIIIIIIll[lIIIIIIlII[21]] = llIllIlIllll("L0JJ8D1kecQ=", "jWyWV");
        lIIIIIIIll[lIIIIIIlII[23]] = llIllIlIllll("xVAvq8nRP+c=", "YgbjI");
        lIIIIIIIll[lIIIIIIlII[25]] = llIllIlIlllI("NR8eLAM=", "qmwBh");
        lIIIIIIIll[lIIIIIIlII[27]] = llIllIlIllll("VogzlcWGcPA=", "xtGgi");
        lIIIIIIIll[lIIIIIIlII[12]] = llIllIlIllIl("/Tkp9G4OjA9W2xXXxO0KNU3AOJNkNcng", "qxuhb");
        lIIIIIIIll[lIIIIIIlII[49]] = llIllIlIllIl("7GWBEXlshJlhGlXXGPAodg==", "hFwDI");
        lIIIIIIIll[lIIIIIIlII[63]] = llIllIlIllll("nvGrldoApqD5Invm7GgTvA==", "ULfKS");
        lIIIIIIIll[lIIIIIIlII[64]] = llIllIlIllIl("OQtnxy53cb5nDO9nDwKrdA==", "asrOk");
        lIIIIIIIll[lIIIIIIlII[53]] = llIllIlIllll("sRUzY0tAwwsCglsxpIhKbA==", "TvQdq");
        lIIIIIIIll[lIIIIIIlII[39]] = llIllIlIllIl("UAvjqGRGaoEpEgx9AEDyKw==", "cyhoo");
        lIIIIIIIll[lIIIIIIlII[65]] = llIllIlIllIl("j87wwZKWWO0f+yrTh3uf+Q==", "IUvie");
        lIIIIIIIll[lIIIIIIlII[66]] = llIllIlIlllI("MicaJTgYJRRoOAMqHSsy", "qKsHZ");
        lIIIIIIIll[lIIIIIIlII[54]] = llIllIlIllll("jNmLrsMaDebM0xMf8yho0Q==", "hPjxl");
        lIIIIIIIll[lIIIIIIlII[67]] = llIllIlIlllI("Bxo4HSU=", "DvQpG");
        lIIIIIIIll[lIIIIIIlII[41]] = llIllIlIllIl("BUwa2RtkJzpC8K1EOv1V+A==", "Ojfgo");
        lIIIIIIIll[lIIIIIIlII[68]] = llIllIlIllll("NrSnQV7SmUmCThGBRWbB8w==", "VlQpb");
        lIIIIIIIll[lIIIIIIlII[61]] = llIllIlIllll("Kj0I1NXcXuQ=", "zGEEB");
        lIIIIIIIll[lIIIIIIlII[69]] = llIllIlIllIl("SlfWl/p4Kq7V/K3xJXjJmA==", "EqUag");
        lIIIIIIIll[lIIIIIIlII[70]] = llIllIlIlllI("BxoBJ2UxGgUsJjs=", "ShdBE");
        lIIIIIIIll[lIIIIIIlII[42]] = llIllIlIlllI("GRwEFAB3FAIODA==", "Zpmyb");
        lIIIIIIIll[lIIIIIIlII[71]] = llIllIlIllll("E4jnTCDE2wsCJyS+QMWPXw==", "MdzAB");
        lIIIIIIIll[lIIIIIIlII[72]] = llIllIlIllIl("0ND9jb6LPluoulO8JrC6Zg==", "nGCWN");
        lIIIIIIIll[lIIIIIIlII[73]] = llIllIlIllIl("TeKp/A24UdXcgIfxPLl9KQ==", "QNNLK");
        lIIIIIIIll[lIIIIIIlII[74]] = llIllIlIlllI("BCYlMTUuOi1iNi4kLw==", "GTJBF");
        lIIIIIIIll[lIIIIIIlII[2]] = llIllIlIllll("mlAXmFcvLDxpfQoI5Nr1vw==", "AgBru");
        lIIIIIIIll[lIIIIIIlII[75]] = llIllIlIllIl("HFlsMm6tC/4jsbVv8KOUmQ==", "OViDm");
        lIIIIIIIll[lIIIIIIlII[95]] = llIllIlIllll("KHhfls9q3Qg2tMe3FYS2vA==", "JVmHq");
        lIIIIIIIll[lIIIIIIlII[97]] = llIllIlIllIl("gwcLriT5hxH+6uQ8wwY51Q==", "vixjX");
        lIIIIIIIll[lIIIIIIlII[98]] = llIllIlIllll("ZCFFgCzpcN1HCnI4Dcj0Jw==", "cTZWs");
        lIIIIIIIll[lIIIIIIlII[99]] = llIllIlIllll("JUKgHHirt3NMyui3CmHb/OgJSUF2/gUP", "PAWqH");
        lIIIIIIIll[lIIIIIIlII[100]] = llIllIlIllIl("lgHbco5gnFU=", "FrGgE");
        lIIIIIIIll[lIIIIIIlII[101]] = llIllIlIllIl("D6GybbRX75PML8MHMqQOtA==", "woeXU");
        lIIIIIIIll[lIIIIIIlII[102]] = llIllIlIllIl("BDEdtAdqhJrMcj80cIFcQw==", "UICnL");
        lIIIIIIIll[lIIIIIIlII[103]] = llIllIlIllll("RCwJhK9v30k=", "qDVTZ");
        lIIIIIIIll[lIIIIIIlII[38]] = llIllIlIllIl("RL6KFKFrRV6lNyjRSKOdZ2f8D///NZsM", "WhYyN");
        lIIIIIIIll[lIIIIIIlII[105]] = llIllIlIlllI("NgoNBCQQFUIcJRsD", "ufbpL");
        lIIIIIIIll[lIIIIIIlII[106]] = llIllIlIllll("ipF7lHs8jAU=", "pzgpZ");
        lIIIIIIIll[lIIIIIIlII[107]] = llIllIlIllll("9HeHxMhg6/4=", "hoUUZ");
        lIIIIIIIll[lIIIIIIlII[108]] = llIllIlIlllI("BCkR", "CHaHM");
        lIIIIIIIll[lIIIIIIlII[109]] = llIllIlIllIl("9REBKcZVRck=", "Mqpho");
        lIIIIIIIll[lIIIIIIlII[110]] = llIllIlIllIl("1wm+C2y/cpiij3s8MTK2Mg==", "SrTjt");
        lIIIIIIIll[lIIIIIIlII[111]] = llIllIlIlllI("AA8cBQ==", "Wnpiq");
        lIIIIIIIll[lIIIIIIlII[112]] = llIllIlIllll("me/P486rjVQ=", "tqpVv");
        lIIIIIIIll[lIIIIIIlII[113]] = llIllIlIlllI("BgwuFgQiHmMBDDw=", "LyCfm");
        lIIIIIIIll[lIIIIIIlII[40]] = llIllIlIllll("SaxF0WLoTLI=", "GmNnK");
        lIIIIIIIll[lIIIIIIlII[7]] = llIllIlIlllI("AAIFKA==", "LgdXD");
        lIIIIIIIll[lIIIIIIlII[114]] = llIllIlIllll("E4G1hSrEvW175tJCdgRKdQ==", "iOJMq");
        lIIIIIIIll[lIIIIIIlII[116]] = llIllIlIllIl("bkuIuZVvcQo=", "GcGJb");
        lIIIIIIIll[lIIIIIIlII[117]] = llIllIlIlllI("Hx0dBTM7D1ASOyVIQw==", "UhpuZ");
        lIIIIIIIll[lIIIIIIlII[119]] = llIllIlIllll("UuV78//qxO4=", "BqKrs");
        lIIIIIIIll[lIIIIIIlII[120]] = llIllIlIllIl("z7hhx38jw6ee4YVSvPyqpQ==", "LHNbe");
        lIIIIIIIll[lIIIIIIlII[122]] = llIllIlIllIl("nXrknpmQxs4=", "YdRIi");
        lIIIIIIIll[lIIIIIIlII[123]] = llIllIlIllIl("MnSUqDHGN+lADw90TssT8qlMSzVbXvFz", "QZkqa");
        lIIIIIIIll[lIIIIIIlII[124]] = llIllIlIllIl("mQ9RvtUQRZI=", "jkekY");
        lIIIIIIIll[lIIIIIIlII[44]] = llIllIlIllIl("v+rQH/sEgqTuSVdbSllgoQ==", "ZlDDz");
        lIIIIIIIll[lIIIIIIlII[140]] = llIllIlIllll("DSlZBybf3IMEV9eawi9IhAEXg266lnJe", "weLII");
        lIIIIIIIll[lIIIIIIlII[6]] = llIllIlIllIl("fe2POlJU2+eZhJK7mVmE+A==", "iiwvW");
        lIIIIIIIll[lIIIIIIlII[141]] = llIllIlIllIl("CZFuIvCechfswtEU0tpgjA==", "GPnpo");
        lIIIIIIIll[lIIIIIIlII[142]] = llIllIlIllIl("rvcE0l04eC1qd75Bp8ESfg==", "OWaUw");
        lIIIIIIIll[lIIIIIIlII[143]] = llIllIlIllll("2yhyVZMbPwI=", "kfpkH");
        lIIIIIIIll[lIIIIIIlII[144]] = llIllIlIllIl("B5pp3DpOHX6RclyJrTYmlw==", "HSMyy");
        lIIIIIIIll[lIIIIIIlII[145]] = llIllIlIllll("yv3B+enHaZbqRgm1oJCWpQ==", "IywEf");
        lIIIIIIIll[lIIIIIIlII[146]] = llIllIlIllIl("pWqmkCUBvKgn9czQjHbi08awCfjaDJdX", "HvFcg");
        lIIIIIIIll[lIIIIIIlII[147]] = llIllIlIllIl("zI0FLvKasi0=", "FgplT");
        lIIIIIIIll[lIIIIIIlII[148]] = llIllIlIllll("kvGcnPSxzBORUdypFcwUHg==", "XBiOb");
        lIIIIIIIll[lIIIIIIlII[149]] = llIllIlIllll("N795MaHwiao=", "CpgKp");
        lIIIIIIIll[lIIIIIIlII[150]] = llIllIlIlllI("JzAjCBADIm4fGB1lfA==", "mENxy");
        lIIIIIIIll[lIIIIIIlII[151]] = llIllIlIlllI("BAEvFg==", "NtBfx");
        lIIIIIIIll[lIIIIIIlII[152]] = llIllIlIllll("/+AFkNionPI++XP+mPlXiw==", "yMNhm");
        lIIIIIIIll[lIIIIIIlII[153]] = llIllIlIllll("YTZtC2hasE0=", "XhiPy");
        lIIIIIIIll[lIIIIIIlII[154]] = llIllIlIllll("a1aU9pFqgdmj/Vro9NRaMA==", "fEQny");
        lIIIIIIIll[lIIIIIIlII[155]] = llIllIlIllll("kLiySQ6m6uU=", "OXwFS");
        lIIIIIIIll[lIIIIIIlII[156]] = llIllIlIllIl("esqRgMY53yOkI5fxYB0BNw==", "VMSpj");
        lIIIIIIIll[lIIIIIIlII[157]] = llIllIlIllIl("Q70rEVbij0o=", "eWYgh");
        lIIIIIIIll[lIIIIIIlII[158]] = llIllIlIllIl("0kz3KAyBMsvv0nnX+gpLdw==", "QQEsX");
        lIIIIIIIll[lIIIIIIlII[159]] = llIllIlIlllI("KQMYGQ==", "cvuiN");
        lIIIIIIIll[lIIIIIIlII[160]] = llIllIlIllIl("EYesAn5JqK930RO/oEQoyg==", "dureq");
        lIIIIIIIll[lIIIIIIlII[161]] = llIllIlIllIl("9u59a01sjcU=", "mMCVS");
        lIIIIIIIll[lIIIIIIlII[172]] = llIllIlIlllI("NzUbdiIWdA43OBgyBCV2GjsYJCUc", "yTmVV");
        lIIIIIIIll[lIIIIIIlII[173]] = llIllIlIllll("LHv09BFiRkQrC6EOtkLIBA==", "cJnar");
        lIIIIIIIll[lIIIIIIlII[174]] = llIllIlIllIl("dm8uN1zoZybNFkf8fCANYA==", "nxkhj");
        lIIIIIIIll[lIIIIIIlII[175]] = llIllIlIllIl("+0CMuf6cPNk=", "tUnWy");
        lIIIIIIIll[lIIIIIIlII[36]] = llIllIlIllIl("xtPMzl0Wtw4jFKMcKB70bA==", "sULND");
        lIIIIIIIll[lIIIIIIlII[176]] = llIllIlIllIl("/0BqpDpQznwRX+zwfJw0ww==", "tvPXp");
        lIIIIIIIll[lIIIIIIlII[177]] = llIllIlIllIl("FLhS8tIle6QPOEfnyvcpiw==", "yItxX");
        lIIIIIIIll[lIIIIIIlII[178]] = llIllIlIllll("Fei+UXQ7Nc4VSu3C5OIXgJwyF3Ndb7zV", "oejWF");
        lIIIIIIIll[lIIIIIIlII[179]] = llIllIlIlllI("NzAeFg==", "cQusX");
        lIIIIIIIll[lIIIIIIlII[180]] = llIllIlIlllI("Ah8JCRsmDUQeEzhKVQ==", "Hjdyr");
        lIIIIIIIll[lIIIIIIlII[79]] = llIllIlIllIl("dZWeFi8V4Yg=", "qaJsI");
        lIIIIIIIll[lIIIIIIlII[181]] = llIllIlIllIl("BjEDy/olQmzRNZ6gzboXlg==", "bAJpl");
        lIIIIIIIll[lIIIIIIlII[182]] = llIllIlIlllI("LCIXCjg=", "oPxyK");
        lIIIIIIIll[lIIIIIIlII[183]] = llIllIlIlllI("JxAMETkDAkEGMR1FUg==", "meaaP");
        lIIIIIIIll[lIIIIIIlII[184]] = llIllIlIllll("+wXKtui4DNs=", "WYREN");
        lIIIIIIIll[lIIIIIIlII[185]] = llIllIlIllll("OQ0ZvH89SJSxjZQgRIyaYQ==", "SOTjm");
        lIIIIIIIll[lIIIIIIlII[186]] = llIllIlIlllI("OAAqHQ==", "ruGmP");
        lIIIIIIIll[lIIIIIIlII[187]] = llIllIlIlllI("GyI4NwM/MHUCDjYy", "QWUGj");
        lIIIIIIIll[lIIIIIIlII[188]] = llIllIlIllIl("uqK6sBlgwuo=", "qphqD");
        lIIIIIIIll[lIIIIIIlII[194]] = llIllIlIllIl("/wR5SNJT66l+J8wilUxisewP57VESX8P", "YpRVu");
        lIIIIIIIll[lIIIIIIlII[203]] = llIllIlIlllI("DREQFgI4Dw==", "Lvyzk");
        lIIIIIIIll[lIIIIIIlII[204]] = llIllIlIllIl("ZS4VZWNBvb0=", "IAMvJ");
        lIIIIIIIll[lIIIIIIlII[205]] = llIllIlIlllI("BhE6PBYRFQ==", "vpIOw");
        lIIIIIIIll[lIIIIIIlII[206]] = llIllIlIllIl("wodVh70ixFQ=", "fmSFg");
        lIIIIIIIll[lIIIIIIlII[207]] = llIllIlIllll("4sTqyDALTbM=", "lKcCw");
        lIIIIIIIll[lIIIIIIlII[208]] = llIllIlIllll("752ZUHy5uWU=", "IAhlq");
        lIIIIIIIll[lIIIIIIlII[211]] = llIllIlIllIl("P2egcDTcMYU=", "PQnoa");
        lIIIIIIIll[lIIIIIIlII[213]] = llIllIlIlllI("Ahs0", "EzDHd");
        lIIIIIIIll[lIIIIIIlII[216]] = llIllIlIlllI("BQIfIzojBAgu", "QkxKN");
        lIIIIIIIll[lIIIIIIlII[218]] = llIllIlIlllI("ERs5", "VzIUP");
        lIIIIIIIll[lIIIIIIlII[221]] = llIllIlIllll("80Dj7j5ytdA=", "inAux");
        lIIIIIIIll[lIIIIIIlII[224]] = llIllIlIllIl("qDCBq/GuvPI=", "xwxPn");
        lIIIIIIIll[lIIIIIIlII[226]] = llIllIlIllIl("QjEfRHAuHV3Fo9meHSZ71A==", "PpUhl");
        lIIIIIIIll[lIIIIIIlII[227]] = llIllIlIlllI("DDMn", "KRWQJ");
        lIIIIIIIll[lIIIIIIlII[230]] = llIllIlIllll("vpwp+A5Yr68=", "eKlRi");
        lIIIIIIIll[lIIIIIIlII[232]] = llIllIlIllll("SVnqj4HmRj0=", "xtlaK");
        lIIIIIIIll[lIIIIIIlII[233]] = llIllIlIlllI("NRMh", "rrQUo");
    }

    private static String llIllIlIlllI(String lIIIIlllIlIIl, String lIIIIlllIlIII) {
        String lIIIIlllIlIIl2 = new String(Base64.getDecoder().decode(lIIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIIlllIlIII.toCharArray();
        int lIIIIlllIIlIl = lIIIIIIlII[0];
        char[] charArray2 = lIIIIlllIlIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIIIlII[0];
        while (llIlllIIllII(i, length)) {
            char lIIIIlllIlIlI = charArray2[i];
            sb.append((char) (lIIIIlllIlIlI ^ charArray[lIIIIlllIIlIl % charArray.length]));
            "".length();
            lIIIIlllIIlIl++;
            i++;
            "".length();
            if (((1 ^ 75) ^ (126 ^ 48)) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlllIIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIlllIlIIIl(Skills.getLevel(Skill.AGILITY), lIIIIIIlII[2])) {
            ?? r0 = lIIIIIIlII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIIIlII[0];
    }

    private static boolean llIlllIIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlllIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static void dX() {
        WorldArea worldArea = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIIIIlII[162], lIIIIIIlII[163], lIIIIIIlII[111], lIIIIIIlII[111], lIIIIIIlII[10]);
        WorldArea worldArea5 = new WorldArea(lIIIIIIlII[164], lIIIIIIlII[133], lIIIIIIlII[64], lIIIIIIlII[12], lIIIIIIlII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIIIIlII[165], lIIIIIIlII[139], lIIIIIIlII[39], lIIIIIIlII[53], lIIIIIIlII[3]);
        WorldArea worldArea7 = new WorldArea(lIIIIIIlII[166], lIIIIIIlII[134], lIIIIIIlII[49], lIIIIIIlII[27], lIIIIIIlII[3]);
        WorldArea worldArea8 = new WorldArea(lIIIIIIlII[167], lIIIIIIlII[136], lIIIIIIlII[70], lIIIIIIlII[64], lIIIIIIlII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIIIIlII[168], lIIIIIIlII[169], lIIIIIIlII[54], lIIIIIIlII[63], lIIIIIIlII[3]);
        WorldPoint worldPoint = new WorldPoint(lIIIIIIlII[170], lIIIIIIlII[171], lIIIIIIlII[0]);
        if (llIlllIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIlllIIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIIIIlII[1]);
            "".length();
        }
        if (llIlllIIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlllIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIIIIIlII[1]);
                "".length();
            }
            if (llIlllIlIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIIIIlII[21])) {
                AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIIIIIlII[1]];
                strArr[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[175]];
                TileObjects.getNearest(strArr).interact(lIIIIIIIll[lIIIIIIlII[36]]);
                Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlII[0];
                }, lIIIIIIlII[104]);
                "".length();
                Time.sleepTicks(lIIIIIIlII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIIIIIlII[1]];
        strArr2[lIIIIIIlII[0]] = lIIIIIIIll[lIIIIIIlII[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIlllIIlllI(nearest) && llIlllIIlIll(dY() ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[177]];
            System.out.println(lIIIIIIIll[lIIIIIIlII[178]]);
            nearest.interact(lIIIIIIIll[lIIIIIIlII[179]]);
            Time.sleepTicks(lIIIIIIlII[10]);
            "".length();
        }
        if (llIlllIIllIl(dY() ? 1 : 0)) {
            if (llIlllIIlIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIlllIIlIll(tileObject.getName().contains(lIIIIIIIll[lIIIIIIlII[218]]) ? 1 : 0) && llIlllIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[219], lIIIIIIlII[220], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (-" ".length()) == " ".length() ? ((188 ^ 147) ^ (211 ^ 175)) & (((242 ^ 143) ^ (155 ^ 181)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[180]];
                    nearest2.interact(lIIIIIIIll[lIIIIIIlII[79]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIlllIIlIll(tileObject2.getName().contains(lIIIIIIIll[lIIIIIIlII[216]]) ? 1 : 0) && llIlllIlIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[217], lIIIIIIlII[128], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (((175 ^ 191) & ((42 ^ 58) ^ (-1))) & (((55 ^ 12) & ((190 ^ 133) ^ (-1))) ^ (-1))) > (26 ^ 30) ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest3)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIIIIIIll[lIIIIIIlII[182]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIlllIIlIll(tileObject3.getName().contains(lIIIIIIIll[lIIIIIIlII[213]]) ? 1 : 0) && llIlllIlIIll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[214], lIIIIIIlII[215], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (193 ^ 197) < ((115 ^ 72) & ((87 ^ 108) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest4)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIIIIIIll[lIIIIIIlII[184]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (llIlllIIlIll(dY() ? 1 : 0)) {
                return;
            }
            if (llIlllIIlIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIlllIIlIll(tileObject4.getName().contains(lIIIIIIIll[lIIIIIIlII[211]]) ? 1 : 0) && llIlllIlIIll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[209], lIIIIIIlII[212], lIIIIIIlII[10])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return (-"  ".length()) > 0 ? ((36 ^ 16) ^ (45 ^ 65)) & (((5 ^ 46) ^ (27 ^ 104)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest5)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIIIIIIll[lIIIIIIlII[186]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return ("  ".length() ^ (74 ^ 76)) == 0 ? ((((102 + 106) - 72) + 90) ^ (((109 + 70) - 120) + 104)) & (((((56 + 23) - (-27)) + 93) ^ (((1 + 128) - 127) + 132)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
            if (!llIlllIIlIll(dY() ? 1 : 0) && llIlllIIlIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIlllIIlIll(tileObject5.getName().contains(lIIIIIIIll[lIIIIIIlII[208]]) ? 1 : 0) && llIlllIlIIll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIIIIIlII[209], lIIIIIIlII[210], lIIIIIIlII[3])), lIIIIIIlII[3])) {
                        ?? r0 = lIIIIIIlII[1];
                        "".length();
                        return 0 != 0 ? ((((210 + 170) - 234) + 84) ^ (((124 + 55) - 64) + 47)) & (((87 ^ 74) ^ (22 ^ 79)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlII[0];
                });
                if (llIlllIIlllI(nearest6)) {
                    AccBuilderGWD.c = lIIIIIIIll[lIIIIIIlII[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIIIIIIll[lIIIIIIlII[188]]);
                    Time.sleepTicks(C0004e.c(lIIIIIIlII[1], lIIIIIIlII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlllIIllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIIIIlII[1];
                            "".length();
                            return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIIIIlII[0];
                    }, lIIIIIIlII[104]);
                    "".length();
                    Time.sleepTicks(lIIIIIIlII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlllIIllII(int i, int i2) {
        return i < i2;
    }
}

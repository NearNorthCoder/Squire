package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ad  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ad.class */
public class C0004ad implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ WorldArea mW;
    private static /* synthetic */ WorldPoint mZ;
    private static /* synthetic */ String[] llIllIllIl;
    public static /* synthetic */ int mU;
    private static /* synthetic */ int[] llIlllIIII;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int mT;
    static /* synthetic */ WorldArea mY;
    static /* synthetic */ WorldArea mX;
    public static /* synthetic */ int mV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlllIIII[0];
    }

    private static boolean lIlllIIlIlIll(Object obj) {
        return obj != null;
    }

    private static String lIlllIIIIIIlI(String llllllllllllllllllIIIIIlllIIIIlI, String llllllllllllllllllIIIIIlllIIIIIl) {
        String llllllllllllllllllIIIIIlllIIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIIlllIIIIII = new StringBuilder();
        char[] llllllllllllllllllIIIIIllIllllll = llllllllllllllllllIIIIIlllIIIIIl.toCharArray();
        int llllllllllllllllllIIIIIllIlllllI = llIlllIIII[0];
        char[] charArray = llllllllllllllllllIIIIIlllIIIIlI2.toCharArray();
        int length = charArray.length;
        int i = llIlllIIII[0];
        while (lIlllIIlIlIIl(i, length)) {
            char llllllllllllllllllIIIIIlllIIIIll = charArray[i];
            llllllllllllllllllIIIIIlllIIIIII.append((char) (llllllllllllllllllIIIIIlllIIIIll ^ llllllllllllllllllIIIIIllIllllll[llllllllllllllllllIIIIIllIlllllI % llllllllllllllllllIIIIIllIllllll.length]));
            "".length();
            llllllllllllllllllIIIIIllIlllllI++;
            i++;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIIIlllIIIIII);
    }

    private static boolean lIlllIIllIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlllIIlIlllI(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            eA();
            "".length();
            if ((124 ^ 120) <= "   ".length()) {
                return (33 ^ 11) & ((82 ^ 120) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlllIIII[186];
    }

    private static boolean lIlllIIlIlIII(int i) {
        return i != 0;
    }

    private static String lIlllIIIIIIll(String llllllllllllllllllIIIIIllllIIIll, String llllllllllllllllllIIIIIllllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIllllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIIII[3], llllllllllllllllllIIIIIllllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIllllIIlII) {
            llllllllllllllllllIIIIIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static void eC() {
        WorldArea worldArea = new WorldArea(llIlllIIII[76], llIlllIIII[77], llIlllIIII[78], llIlllIIII[79], llIlllIIII[1]);
        WorldArea worldArea2 = new WorldArea(llIlllIIII[76], llIlllIIII[77], llIlllIIII[78], llIlllIIII[79], llIlllIIII[3]);
        WorldArea worldArea3 = new WorldArea(llIlllIIII[76], llIlllIIII[77], llIlllIIII[78], llIlllIIII[79], llIlllIIII[10]);
        WorldArea worldArea4 = new WorldArea(llIlllIIII[80], llIlllIIII[81], llIlllIIII[69], llIlllIIII[64], llIlllIIII[0]);
        WorldArea worldArea5 = new WorldArea(llIlllIIII[82], llIlllIIII[81], llIlllIIII[12], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea6 = new WorldArea(llIlllIIII[83], llIlllIIII[84], llIlllIIII[63], llIlllIIII[49], llIlllIIII[10]);
        WorldArea worldArea7 = new WorldArea(llIlllIIII[85], llIlllIIII[86], llIlllIIII[27], llIlllIIII[23], llIlllIIII[1]);
        WorldArea worldArea8 = new WorldArea(llIlllIIII[85], llIlllIIII[87], llIlllIIII[12], llIlllIIII[25], llIlllIIII[10]);
        WorldArea worldArea9 = new WorldArea(llIlllIIII[88], llIlllIIII[89], llIlllIIII[75], llIlllIIII[41], llIlllIIII[10]);
        WorldArea worldArea10 = new WorldArea(llIlllIIII[90], llIlllIIII[91], llIlllIIII[66], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea11 = new WorldArea(llIlllIIII[92], llIlllIIII[93], llIlllIIII[23], llIlllIIII[27], llIlllIIII[10]);
        WorldArea worldArea12 = new WorldArea(llIlllIIII[92], llIlllIIII[94], llIlllIIII[12], llIlllIIII[23], llIlllIIII[10]);
        if (lIlllIIlIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[95]];
            if (lIlllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(llIlllIIII[96], llIlllIIII[52], llIlllIIII[0]));
            "".length();
            Time.sleepTicks(llIlllIIII[1]);
            "".length();
        }
        if (lIlllIIlIllll(Players.getLocal().getAnimation(), llIlllIIII[62]) && lIlllIIlIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[llIlllIIII[1]];
            strArr[llIlllIIII[0]] = llIllIllIl[llIlllIIII[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIlllIIlIlIll(nearest) && lIlllIIlIlIII(eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[98]];
                System.out.println(llIllIllIl[llIlllIIII[99]]);
                nearest.interact(llIllIllIl[llIlllIIII[100]]);
                Time.sleepTicks(llIlllIIII[10]);
                "".length();
            }
            if (lIlllIIlIlIlI(eF() ? 1 : 0)) {
                if (lIlllIIlIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[101]];
                    int llllllllllllllllllIIIIlIlIlIIIIl = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[llIlllIIII[1]];
                    strArr2[llIlllIIII[0]] = llIllIllIl[llIlllIIII[102]];
                    TileObjects.getNearest(strArr2).interact(llIllIllIl[llIlllIIII[103]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (((((96 + 161) - 88) + 80) ^ (((21 + 39) - (-2)) + 135)) & (((72 ^ 77) ^ (162 ^ 155)) ^ (-" ".length()))) >= "  ".length() ? ((197 ^ 173) ^ (188 ^ 142)) & (((70 ^ 20) ^ (97 ^ 105)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[38]];
                    int llllllllllllllllllIIIIlIlIlIIIIl2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[llIlllIIII[1]];
                    strArr3[llIlllIIII[0]] = llIllIllIl[llIlllIIII[105]];
                    TileObjects.getNearest(strArr3).interact(llIllIllIl[llIlllIIII[106]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl2)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return "   ".length() <= "  ".length() ? ((((31 + 2) - 32) + 211) ^ (((122 + 102) - 206) + 136)) & (((108 ^ 123) ^ (81 ^ 8)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[107]];
                    int llllllllllllllllllIIIIlIlIlIIIIl3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[llIlllIIII[1]];
                    strArr4[llIlllIIII[0]] = llIllIllIl[llIlllIIII[108]];
                    TileObjects.getNearest(strArr4).interact(llIllIllIl[llIlllIIII[109]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl3)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (((182 ^ 193) ^ (55 ^ 71)) & (((12 ^ 36) ^ (45 ^ 2)) ^ (-" ".length()))) >= "  ".length() ? ((((55 + 61) - 45) + 81) ^ (((67 + 77) - 131) + 121)) & (((113 ^ 25) ^ (198 ^ 176)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[110]];
                    int llllllllllllllllllIIIIlIlIlIIIIl4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[llIlllIIII[1]];
                    strArr5[llIlllIIII[0]] = llIllIllIl[llIlllIIII[111]];
                    TileObjects.getNearest(strArr5).interact(llIllIllIl[llIlllIIII[112]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl4)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return ((174 ^ 158) & ((76 ^ 124) ^ (-1))) >= (64 ^ 68) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[113]];
                    int llllllllllllllllllIIIIlIlIlIIIIl5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[llIlllIIII[1]];
                    strArr6[llIlllIIII[0]] = llIllIllIl[llIlllIIII[40]];
                    TileObjects.getNearest(strArr6).interact(llIllIllIl[llIlllIIII[7]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl5)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[114]];
                    int llllllllllllllllllIIIIlIlIlIIIIl6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[llIlllIIII[1]];
                    iArr[llIlllIIII[0]] = llIlllIIII[115];
                    TileObjects.getNearest(iArr).interact(llIllIllIl[llIlllIIII[116]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl6)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (-"   ".length()) > 0 ? ((212 ^ 162) ^ (141 ^ 174)) & (((85 ^ 30) ^ (191 ^ 161)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[117]];
                    int llllllllllllllllllIIIIlIlIlIIIIl7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[llIlllIIII[1]];
                    iArr2[llIlllIIII[0]] = llIlllIIII[118];
                    TileObjects.getNearest(iArr2).interact(llIllIllIl[llIlllIIII[119]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl7)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (((204 ^ 180) ^ (91 ^ 58)) & (((((46 + 201) - 135) + 109) ^ (((109 + 107) - 92) + 72)) ^ (-" ".length()))) != 0 ? ((108 ^ 50) ^ (74 ^ 38)) & (((118 ^ 69) ^ " ".length()) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[120]];
                    int llllllllllllllllllIIIIlIlIlIIIIl8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[llIlllIIII[1]];
                    iArr3[llIlllIIII[0]] = llIlllIIII[121];
                    TileObjects.getNearest(iArr3).interact(llIllIllIl[llIlllIIII[122]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl8)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return ((58 ^ 112) ^ (103 ^ 41)) <= (((((136 + 75) - 185) + 193) ^ (((94 + 15) - 51) + 84)) & (((((39 + 188) - 72) + 66) ^ (((10 + 135) - 68) + 59)) ^ (-" ".length()))) ? ((79 ^ 61) ^ (184 ^ 142)) & (((150 ^ 161) ^ (94 ^ 45)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIlIII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[123]];
                    int llllllllllllllllllIIIIlIlIlIIIIl9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[llIlllIIII[1]];
                    strArr7[llIlllIIII[0]] = llIllIllIl[llIlllIIII[124]];
                    TileObjects.getNearest(strArr7).interact(llIllIllIl[llIlllIIII[44]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIlIIIIl9)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlllIIlIllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void eA() {
        if (lIlllIIlIlIII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[0]];
            C0015b.a(bv);
            if (lIlllIIlIlIIl(bv.size(), llIlllIIII[1])) {
                System.out.println(llIllIllIl[llIlllIIII[1]]);
                bt = llIlllIIII[0];
            }
        }
        if (lIlllIIlIlIlI(bt ? 1 : 0) && lIlllIIlIlIIl(Skills.getLevel(Skill.AGILITY), llIlllIIII[2])) {
            if (lIlllIIlIlIlI(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllIIlIlIll(nearest) && lIlllIIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[3]];
                    if (lIlllIIlIlIII(new WorldArea(llIlllIIII[4], llIlllIIII[5], llIlllIIII[6], llIlllIIII[7], llIlllIIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llIlllIIII[8], llIlllIIII[9], llIlllIIII[0]);
                        if (lIlllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlllIIII[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIlllIIII[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIlllIIlIlIll(nearest) && lIlllIIlIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[10]];
                    if (lIlllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlllIIII[11]);
                        "".length();
                    }
                    if (lIlllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlllIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlllIIII[1]);
                            "".length();
                        }
                        if (lIlllIIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlllIIII[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[llIlllIIII[12]];
                    iArr[llIlllIIII[0]] = llIlllIIII[13];
                    iArr[llIlllIIII[1]] = llIlllIIII[14];
                    iArr[llIlllIIII[3]] = llIlllIIII[15];
                    iArr[llIlllIIII[10]] = llIlllIIII[16];
                    iArr[llIlllIIII[17]] = llIlllIIII[18];
                    iArr[llIlllIIII[19]] = llIlllIIII[20];
                    iArr[llIlllIIII[21]] = llIlllIIII[22];
                    iArr[llIlllIIII[23]] = llIlllIIII[24];
                    iArr[llIlllIIII[25]] = llIlllIIII[26];
                    iArr[llIlllIIII[27]] = llIlllIIII[28];
                    if (lIlllIIlIlIlI(C0018e.c(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(llIllIllIl[llIlllIIII[17]]);
                        bt = llIlllIIII[1];
                        return;
                    }
                    int[] iArr2 = new int[llIlllIIII[12]];
                    iArr2[llIlllIIII[0]] = llIlllIIII[13];
                    iArr2[llIlllIIII[1]] = llIlllIIII[14];
                    iArr2[llIlllIIII[3]] = llIlllIIII[15];
                    iArr2[llIlllIIII[10]] = llIlllIIII[16];
                    iArr2[llIlllIIII[17]] = llIlllIIII[18];
                    iArr2[llIlllIIII[19]] = llIlllIIII[20];
                    iArr2[llIlllIIII[21]] = llIlllIIII[22];
                    iArr2[llIlllIIII[23]] = llIlllIIII[24];
                    iArr2[llIlllIIII[25]] = llIlllIIII[26];
                    iArr2[llIlllIIII[27]] = llIlllIIII[28];
                    if (lIlllIIlIlIII(C0018e.c(iArr2) ? 1 : 0)) {
                        C0000a.a(llIlllIIII[29], llIlllIIII[1]);
                        C0000a.a(llIlllIIII[30], llIlllIIII[1]);
                        C0000a.a(llIlllIIII[31], llIlllIIII[1]);
                        C0000a.a(llIlllIIII[32], llIlllIIII[1]);
                        C0000a.a(llIlllIIII[33], llIlllIIII[1]);
                        C0000a.a(llIlllIIII[34], llIlllIIII[1]);
                        C0000a.a(llIlllIIII[35], llIlllIIII[1]);
                        int[] iArr3 = new int[llIlllIIII[1]];
                        iArr3[llIlllIIII[0]] = llIlllIIII[29];
                        if (lIlllIIlIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIlllIIII[1]];
                            iArr4[llIlllIIII[0]] = llIlllIIII[29];
                            if (lIlllIIlIlIlI(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIlllIIII[1]];
                                iArr5[llIlllIIII[0]] = llIlllIIII[29];
                                if (lIlllIIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(llIlllIIII[36], llIlllIIII[1]);
                                }
                            }
                        }
                        C0000a.a(llIlllIIII[18], llIlllIIII[1]);
                        C0018e.l(llIlllIIII[29]);
                        C0018e.l(llIlllIIII[30]);
                        C0018e.l(llIlllIIII[31]);
                        C0018e.l(llIlllIIII[32]);
                        C0018e.l(llIlllIIII[33]);
                        Time.sleepTicks(llIlllIIII[1]);
                        "".length();
                        C0018e.l(llIlllIIII[35]);
                        C0018e.l(llIlllIIII[37]);
                        C0018e.l(llIlllIIII[34]);
                        C0018e.l(llIlllIIII[36]);
                        C0018e.l(llIlllIIII[18]);
                        Time.sleepTicks(llIlllIIII[10]);
                        "".length();
                        if (lIlllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIlllIIII[21]);
                            "".length();
                        }
                        if (lIlllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                            if (lIlllIIlIlIIl(Skills.getLevel(Skill.AGILITY), llIlllIIII[38])) {
                                C0000a.a(llIlllIIII[13], llIlllIIII[12]);
                                C0000a.a(llIlllIIII[14], llIlllIIII[12]);
                                C0000a.a(llIlllIIII[22], llIlllIIII[12]);
                                C0000a.a(llIlllIIII[15], llIlllIIII[12]);
                                C0000a.b(C0019f.bk, llIlllIIII[1]);
                                C0000a.a(llIlllIIII[28], llIlllIIII[1]);
                                C0000a.a(llIlllIIII[20], llIlllIIII[19]);
                                C0000a.a(llIlllIIII[24], llIlllIIII[39]);
                            }
                            if (lIlllIIlIlllI(Skills.getLevel(Skill.AGILITY), llIlllIIII[38])) {
                                C0000a.a(llIlllIIII[13], llIlllIIII[12]);
                                C0000a.a(llIlllIIII[22], llIlllIIII[12]);
                                C0000a.a(llIlllIIII[26], llIlllIIII[12]);
                                C0000a.b(C0019f.bk, llIlllIIII[1]);
                                C0000a.a(llIlllIIII[28], llIlllIIII[1]);
                                C0000a.a(llIlllIIII[20], llIlllIIII[25]);
                                C0000a.a(llIlllIIII[24], llIlllIIII[12]);
                            }
                        }
                    }
                }
            }
            if (lIlllIIlIlIII(an() ? 1 : 0)) {
                String[] strArr = new String[llIlllIIII[1]];
                strArr[llIlllIIII[0]] = llIllIllIl[llIlllIIII[19]];
                if (lIlllIIlIlIII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlllIIII[1]];
                    strArr2[llIlllIIII[0]] = llIllIllIl[llIlllIIII[21]];
                    Inventory.getFirst(strArr2).interact(llIllIllIl[llIlllIIII[23]]);
                }
                if (lIlllIIlIlIII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllIIlIlIIl(Movement.getRunEnergy(), llIlllIIII[40])) {
                    Inventory.getFirst(C0019f.ba).interact(llIllIllIl[llIlllIIII[25]]);
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
                if (lIlllIIlIllII(Combat.getMissingHealth(), llIlllIIII[41])) {
                    int[] iArr6 = new int[llIlllIIII[1]];
                    iArr6[llIlllIIII[0]] = llIlllIIII[24];
                    if (lIlllIIlIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIlllIIII[1]];
                        iArr7[llIlllIIII[0]] = llIlllIIII[24];
                        Inventory.getFirst(iArr7).interact(llIllIllIl[llIlllIIII[27]]);
                        Time.sleepTicks(llIlllIIII[3]);
                        "".length();
                    }
                }
                if (lIlllIIlIllII(Movement.getRunEnergy(), llIlllIIII[42]) && lIlllIIlIlIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIlllIIlIlIIl(Skills.getLevel(Skill.AGILITY), llIlllIIII[2])) {
                    eB();
                }
                if ((!lIlllIIlIlllI(C0018e.j(llIlllIIII[43]), llIlllIIII[44]) || lIlllIIlIlIIl(C0018e.j(llIlllIIII[45]), llIlllIIII[19])) && lIlllIIlIlllI(Skills.getLevel(Skill.AGILITY), llIlllIIII[2]) && lIlllIIlIlIIl(Skills.getLevel(Skill.AGILITY), llIlllIIII[44])) {
                    eC();
                }
                if (lIlllIIlIlllI(C0018e.j(llIlllIIII[43]), llIlllIIII[44]) && lIlllIIlIlllI(C0018e.j(llIlllIIII[45]), llIlllIIII[19])) {
                    if (lIlllIIlIlllI(Skills.getLevel(Skill.AGILITY), llIlllIIII[2]) && lIlllIIlIlIIl(Skills.getLevel(Skill.AGILITY), llIlllIIII[38])) {
                        eC();
                    }
                    if (lIlllIIlIlllI(Skills.getLevel(Skill.AGILITY), llIlllIIII[38]) && lIlllIIlIlIIl(Skills.getLevel(Skill.AGILITY), llIlllIIII[44])) {
                        eD();
                    }
                }
                if (lIlllIIlIlllI(Skills.getLevel(Skill.AGILITY), llIlllIIII[44])) {
                    eE();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean an() {
        if (lIlllIIlIlllI(Skills.getBoostedLevel(Skill.AGILITY), llIlllIIII[38])) {
            int[] iArr = new int[llIlllIIII[1]];
            iArr[llIlllIIII[0]] = llIlllIIII[13];
            if (lIlllIIlIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlllIIII[1]];
                iArr2[llIlllIIII[0]] = llIlllIIII[26];
                if (lIlllIIlIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlllIIII[1]];
                    iArr3[llIlllIIII[0]] = llIlllIIII[24];
                    if (lIlllIIlIlIII(Inventory.contains(iArr3) ? 1 : 0) && ((!lIlllIIlIlIlI(Inventory.contains(item -> {
                        return item.getName().contains(llIllIllIl[llIlllIIII[207]]);
                    }) ? 1 : 0) || lIlllIIlIlIII(Equipment.contains(item2 -> {
                        return item2.getName().contains(llIllIllIl[llIlllIIII[206]]);
                    }) ? 1 : 0)) && (!lIlllIIlIlIlI(Inventory.contains(C0019f.bk) ? 1 : 0) || lIlllIIlIlIII(Equipment.contains(C0019f.bk) ? 1 : 0)))) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return 0 != 0 ? ((((165 + 243) - 253) + 99) ^ (((86 + 156) - 181) + 116)) & (((5 ^ 83) ^ (95 ^ 70)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return llIlllIIII[0];
        }
        int[] iArr4 = new int[llIlllIIII[1]];
        iArr4[llIlllIIII[0]] = llIlllIIII[13];
        if (lIlllIIlIlIII(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[llIlllIIII[1]];
            iArr5[llIlllIIII[0]] = llIlllIIII[15];
            if (lIlllIIlIlIII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIlllIIII[1]];
                iArr6[llIlllIIII[0]] = llIlllIIII[14];
                if (lIlllIIlIlIII(Inventory.contains(iArr6) ? 1 : 0) && ((!lIlllIIlIlIlI(Inventory.contains(item3 -> {
                    return item3.getName().contains(llIllIllIl[llIlllIIII[205]]);
                }) ? 1 : 0) || lIlllIIlIlIII(Equipment.contains(item4 -> {
                    return item4.getName().contains(llIllIllIl[llIlllIIII[204]]);
                }) ? 1 : 0)) && (!lIlllIIlIlIlI(Inventory.contains(C0019f.bk) ? 1 : 0) || lIlllIIlIlIII(Equipment.contains(C0019f.bk) ? 1 : 0)))) {
                    ?? r02 = llIlllIIII[1];
                    "".length();
                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return llIlllIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIlllIIII[80], llIlllIIII[81], llIlllIIII[69], llIlllIIII[64], llIlllIIII[0]);
        WorldArea worldArea2 = new WorldArea(llIlllIIII[82], llIlllIIII[81], llIlllIIII[12], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea3 = new WorldArea(llIlllIIII[83], llIlllIIII[84], llIlllIIII[63], llIlllIIII[49], llIlllIIII[10]);
        WorldArea worldArea4 = new WorldArea(llIlllIIII[189], llIlllIIII[190], llIlllIIII[25], llIlllIIII[19], llIlllIIII[1]);
        WorldArea worldArea5 = new WorldArea(llIlllIIII[85], llIlllIIII[87], llIlllIIII[12], llIlllIIII[25], llIlllIIII[10]);
        WorldArea worldArea6 = new WorldArea(llIlllIIII[191], llIlllIIII[192], llIlllIIII[73], llIlllIIII[39], llIlllIIII[10]);
        WorldArea worldArea7 = new WorldArea(llIlllIIII[90], llIlllIIII[91], llIlllIIII[66], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea8 = new WorldArea(llIlllIIII[92], llIlllIIII[93], llIlllIIII[23], llIlllIIII[27], llIlllIIII[10]);
        WorldArea worldArea9 = new WorldArea(llIlllIIII[92], llIlllIIII[94], llIlllIIII[12], llIlllIIII[23], llIlllIIII[10]);
        WorldArea worldArea10 = new WorldArea(llIlllIIII[127], llIlllIIII[128], llIlllIIII[49], llIlllIIII[12], llIlllIIII[3]);
        WorldArea worldArea11 = new WorldArea(llIlllIIII[129], llIlllIIII[127], llIlllIIII[49], llIlllIIII[25], llIlllIIII[3]);
        WorldArea worldArea12 = new WorldArea(llIlllIIII[130], llIlllIIII[131], llIlllIIII[63], llIlllIIII[49], llIlllIIII[3]);
        WorldArea worldArea13 = new WorldArea(llIlllIIII[132], llIlllIIII[133], llIlllIIII[12], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea14 = new WorldArea(llIlllIIII[134], llIlllIIII[9], llIlllIIII[49], llIlllIIII[27], llIlllIIII[3]);
        WorldArea worldArea15 = new WorldArea(llIlllIIII[135], llIlllIIII[136], llIlllIIII[68], llIlllIIII[53], llIlllIIII[10]);
        WorldArea worldArea16 = new WorldArea(llIlllIIII[137], llIlllIIII[138], llIlllIIII[63], llIlllIIII[64], llIlllIIII[3]);
        WorldArea worldArea17 = new WorldArea(llIlllIIII[164], llIlllIIII[133], llIlllIIII[64], llIlllIIII[12], llIlllIIII[10]);
        WorldArea worldArea18 = new WorldArea(llIlllIIII[165], llIlllIIII[139], llIlllIIII[39], llIlllIIII[53], llIlllIIII[3]);
        WorldArea worldArea19 = new WorldArea(llIlllIIII[166], llIlllIIII[134], llIlllIIII[49], llIlllIIII[27], llIlllIIII[3]);
        WorldArea worldArea20 = new WorldArea(llIlllIIII[167], llIlllIIII[136], llIlllIIII[70], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea21 = new WorldArea(llIlllIIII[168], llIlllIIII[169], llIlllIIII[54], llIlllIIII[63], llIlllIIII[3]);
        WorldArea[] worldAreaArr = new WorldArea[llIlllIIII[68]];
        worldAreaArr[llIlllIIII[0]] = worldArea;
        worldAreaArr[llIlllIIII[1]] = worldArea2;
        worldAreaArr[llIlllIIII[3]] = worldArea3;
        worldAreaArr[llIlllIIII[10]] = worldArea4;
        worldAreaArr[llIlllIIII[17]] = worldArea5;
        worldAreaArr[llIlllIIII[19]] = worldArea6;
        worldAreaArr[llIlllIIII[21]] = worldArea7;
        worldAreaArr[llIlllIIII[23]] = worldArea8;
        worldAreaArr[llIlllIIII[25]] = worldArea9;
        worldAreaArr[llIlllIIII[27]] = worldArea10;
        worldAreaArr[llIlllIIII[12]] = worldArea11;
        worldAreaArr[llIlllIIII[49]] = worldArea12;
        worldAreaArr[llIlllIIII[63]] = worldArea13;
        worldAreaArr[llIlllIIII[64]] = worldArea14;
        worldAreaArr[llIlllIIII[53]] = worldArea15;
        worldAreaArr[llIlllIIII[39]] = worldArea16;
        worldAreaArr[llIlllIIII[65]] = worldArea17;
        worldAreaArr[llIlllIIII[66]] = worldArea18;
        worldAreaArr[llIlllIIII[54]] = worldArea19;
        worldAreaArr[llIlllIIII[67]] = worldArea20;
        worldAreaArr[llIlllIIII[41]] = worldArea21;
        int[] iArr = new int[llIlllIIII[1]];
        iArr[llIlllIIII[0]] = llIlllIIII[193];
        if (lIlllIIlIlIll(TileItems.getNearest(iArr))) {
            System.out.println(llIllIllIl[llIlllIIII[194]]);
            int i = llIlllIIII[0];
            while (lIlllIIlIlIIl(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[llIlllIIII[1]];
                iArr2[llIlllIIII[0]] = llIlllIIII[193];
                if (lIlllIIlIlIII(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIlllIIlIlIII(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIlllIIII[1];
                }
                i++;
                "".length();
                if ("  ".length() < (((201 ^ 157) ^ (31 ^ 84)) & (((31 ^ 12) ^ (204 ^ 192)) ^ (-" ".length())))) {
                    return ((((78 + 7) - (-72)) + 38) ^ (((11 + 100) - (-1)) + 25)) & (((131 ^ 133) ^ (28 ^ 80)) ^ (-" ".length()));
                }
            }
        }
        return llIlllIIII[0];
    }

    private static boolean lIlllIIlIllIl(int i) {
        return i > 0;
    }

    private static void eE() {
        WorldArea worldArea = new WorldArea(llIlllIIII[162], llIlllIIII[163], llIlllIIII[111], llIlllIIII[111], llIlllIIII[0]);
        WorldArea worldArea2 = new WorldArea(llIlllIIII[162], llIlllIIII[163], llIlllIIII[111], llIlllIIII[111], llIlllIIII[1]);
        WorldArea worldArea3 = new WorldArea(llIlllIIII[162], llIlllIIII[163], llIlllIIII[111], llIlllIIII[111], llIlllIIII[3]);
        WorldArea worldArea4 = new WorldArea(llIlllIIII[162], llIlllIIII[163], llIlllIIII[111], llIlllIIII[111], llIlllIIII[10]);
        WorldArea worldArea5 = new WorldArea(llIlllIIII[164], llIlllIIII[133], llIlllIIII[64], llIlllIIII[12], llIlllIIII[10]);
        WorldArea worldArea6 = new WorldArea(llIlllIIII[165], llIlllIIII[139], llIlllIIII[39], llIlllIIII[53], llIlllIIII[3]);
        WorldArea worldArea7 = new WorldArea(llIlllIIII[166], llIlllIIII[134], llIlllIIII[49], llIlllIIII[27], llIlllIIII[3]);
        WorldArea worldArea8 = new WorldArea(llIlllIIII[167], llIlllIIII[136], llIlllIIII[70], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea9 = new WorldArea(llIlllIIII[168], llIlllIIII[169], llIlllIIII[54], llIlllIIII[63], llIlllIIII[3]);
        WorldPoint worldPoint = new WorldPoint(llIlllIIII[170], llIlllIIII[171], llIlllIIII[0]);
        if (lIlllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlllIIlIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIlllIIII[1]);
            "".length();
        }
        if (lIlllIIlIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlllIIII[21])) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIlllIIII[1]);
                "".length();
            }
            if (lIlllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlllIIII[21])) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIlllIIII[1]];
                strArr[llIlllIIII[0]] = llIllIllIl[llIlllIIII[175]];
                TileObjects.getNearest(strArr).interact(llIllIllIl[llIlllIIII[36]]);
                Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                }, llIlllIIII[104]);
                "".length();
                Time.sleepTicks(llIlllIIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIlllIIII[1]];
        strArr2[llIlllIIII[0]] = llIllIllIl[llIlllIIII[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlllIIlIlIll(nearest) && lIlllIIlIlIII(eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[177]];
            System.out.println(llIllIllIl[llIlllIIII[178]]);
            nearest.interact(llIllIllIl[llIlllIIII[179]]);
            Time.sleepTicks(llIlllIIII[10]);
            "".length();
        }
        if (lIlllIIlIlIlI(eF() ? 1 : 0)) {
            if (lIlllIIlIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlllIIlIlIII(tileObject.getName().contains(llIllIllIl[llIlllIIII[218]]) ? 1 : 0) && lIlllIIllIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[219], llIlllIIII[220], llIlllIIII[10])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (((110 ^ 103) ^ (75 ^ 119)) & (((114 ^ 91) ^ (165 ^ 185)) ^ (-" ".length()))) == " ".length() ? ((46 ^ 120) ^ (65 ^ 12)) & (((17 ^ 127) ^ (63 ^ 74)) ^ (-" ".length())) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[180]];
                    nearest2.interact(llIllIllIl[llIlllIIII[79]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlllIIlIlIII(tileObject2.getName().contains(llIllIllIl[llIlllIIII[216]]) ? 1 : 0) && lIlllIIllIIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[217], llIlllIIII[128], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (((((9 + 155) - 8) + 37) ^ (((128 + 30) - 20) + 7)) & (((95 ^ 99) ^ (5 ^ 105)) ^ (-" ".length()))) != 0 ? ((((187 + 174) - 280) + 173) ^ (((32 + 51) - 54) + 134)) & (((80 ^ 34) ^ (118 ^ 89)) ^ (-" ".length())) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest3)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIllIllIl[llIlllIIII[182]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (((171 ^ 137) ^ ((183 ^ 177) & ((5 ^ 3) ^ (-1)))) & (((((141 + 74) - 78) + 11) ^ (((61 + 96) - 99) + 124)) ^ (-" ".length()))) < 0 ? ((((141 + 26) - 100) + 85) ^ (((24 + 77) - (-5)) + 69)) & (((((101 + 38) - 93) + 86) ^ (((163 + 10) - 106) + 112)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlllIIlIlIII(tileObject3.getName().contains(llIllIllIl[llIlllIIII[213]]) ? 1 : 0) && lIlllIIllIIII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[214], llIlllIIII[215], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest4)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIllIllIl[llIlllIIII[184]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return 0 != 0 ? ((155 ^ 178) ^ (114 ^ 59)) & (((53 ^ 87) ^ "  ".length()) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlllIIlIlIII(tileObject4.getName().contains(llIllIllIl[llIlllIIII[211]]) ? 1 : 0) && lIlllIIllIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[209], llIlllIIII[212], llIlllIIII[10])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (-(145 ^ 149)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest5)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIllIllIl[llIlllIIII[186]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return "  ".length() <= 0 ? ((((87 + 158) - 123) + 42) ^ (((175 + 8) - 174) + 179)) & (((176 ^ 185) ^ (147 ^ 130)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (!lIlllIIlIlIII(eF() ? 1 : 0) && lIlllIIlIlIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlllIIlIlIII(tileObject5.getName().contains(llIllIllIl[llIlllIIII[208]]) ? 1 : 0) && lIlllIIllIIII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[209], llIlllIIII[210], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest6)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIllIllIl[llIlllIIII[188]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return "   ".length() <= 0 ? ((83 ^ 78) ^ (58 ^ 1)) & (((((147 + 85) - 127) + 85) ^ (((74 + 69) - 111) + 120)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static void eB() {
        new WorldArea(llIlllIIII[46], llIlllIIII[47], llIlllIIII[12], llIlllIIII[21], llIlllIIII[0]);
        WorldArea worldArea = new WorldArea(llIlllIIII[46], llIlllIIII[48], llIlllIIII[49], llIlllIIII[25], llIlllIIII[0]);
        WorldArea worldArea2 = new WorldArea(llIlllIIII[46], llIlllIIII[50], llIlllIIII[49], llIlllIIII[25], llIlllIIII[1]);
        WorldArea worldArea3 = new WorldArea(llIlllIIII[51], llIlllIIII[52], llIlllIIII[53], llIlllIIII[54], llIlllIIII[3]);
        WorldArea worldArea4 = new WorldArea(llIlllIIII[55], llIlllIIII[56], llIlllIIII[25], llIlllIIII[12], llIlllIIII[3]);
        WorldArea worldArea5 = new WorldArea(llIlllIIII[57], llIlllIIII[58], llIlllIIII[49], llIlllIIII[12], llIlllIIII[0]);
        WorldArea worldArea6 = new WorldArea(llIlllIIII[59], llIlllIIII[60], llIlllIIII[12], llIlllIIII[21], llIlllIIII[0]);
        WorldArea worldArea7 = new WorldArea(llIlllIIII[46], llIlllIIII[47], llIlllIIII[61], llIlllIIII[21], llIlllIIII[0]);
        if (lIlllIIlIlIlI(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[12]];
            C0018e.b(mZ);
            Time.sleepTicks(llIlllIIII[1]);
            "".length();
        }
        if (!(lIlllIIlIlIlI(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlllIIlIlIII(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlllIIlIllll(Players.getLocal().getAnimation(), llIlllIIII[62]) && lIlllIIlIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIlllIIlIlIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[49]];
                String[] strArr = new String[llIlllIIII[1]];
                strArr[llIlllIIII[0]] = llIllIllIl[llIlllIIII[63]];
                TileObjects.getNearest(strArr).interact(llIllIllIl[llIlllIIII[64]]);
                Time.sleepTicks(llIlllIIII[3]);
                "".length();
            }
            if (lIlllIIlIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[53]];
                String[] strArr2 = new String[llIlllIIII[1]];
                strArr2[llIlllIIII[0]] = llIllIllIl[llIlllIIII[39]];
                TileObjects.getNearest(strArr2).interact(llIllIllIl[llIlllIIII[65]]);
                Time.sleepTicks(llIlllIIII[3]);
                "".length();
            }
            if (lIlllIIlIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[66]];
                String[] strArr3 = new String[llIlllIIII[1]];
                strArr3[llIlllIIII[0]] = llIllIllIl[llIlllIIII[54]];
                TileObjects.getNearest(strArr3).interact(llIllIllIl[llIlllIIII[67]]);
                Time.sleepTicks(llIlllIIII[3]);
                "".length();
            }
            if (lIlllIIlIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[41]];
                String[] strArr4 = new String[llIlllIIII[1]];
                strArr4[llIlllIIII[0]] = llIllIllIl[llIlllIIII[68]];
                TileObjects.getNearest(strArr4).interact(llIllIllIl[llIlllIIII[61]]);
                Time.sleepTicks(llIlllIIII[19]);
                "".length();
            }
            if (lIlllIIlIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[69]];
                String[] strArr5 = new String[llIlllIIII[1]];
                strArr5[llIlllIIII[0]] = llIllIllIl[llIlllIIII[70]];
                TileObjects.getNearest(strArr5).interact(llIllIllIl[llIlllIIII[42]]);
                Time.sleepTicks(llIlllIIII[17]);
                "".length();
            }
            if (lIlllIIlIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[71]];
                String[] strArr6 = new String[llIlllIIII[1]];
                strArr6[llIlllIIII[0]] = llIllIllIl[llIlllIIII[72]];
                TileObjects.getNearest(strArr6).interact(llIllIllIl[llIlllIIII[73]]);
                Time.sleepTicks(llIlllIIII[10]);
                "".length();
            }
            if (lIlllIIlIlIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[74]];
                String[] strArr7 = new String[llIlllIIII[1]];
                strArr7[llIlllIIII[0]] = llIllIllIl[llIlllIIII[2]];
                TileObjects.getNearest(strArr7).interact(llIllIllIl[llIlllIIII[75]]);
                Time.sleepTicks(llIlllIIII[17]);
                "".length();
            }
        }
    }

    private static boolean lIlllIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlllIIIIllll() {
        llIllIllIl = new String[llIlllIIII[238]];
        llIllIllIl[llIlllIIII[0]] = lIlllIIIIIIIl("u2Ycv+a426+z9YYzvGux8w==", "aWrUc");
        llIllIllIl[llIlllIIII[1]] = lIlllIIIIIIlI("FAsoIx86ByJqDicbLyQLcgsyLwEhTmY5GzsWJSIFPAVmKA0xCWY+A3IDISMAOxY/", "RbFJl");
        llIllIllIl[llIlllIIII[3]] = lIlllIIIIIIll("67kqpf5510ab8LtANkNHvsRGlUen6GMO", "oCPNt");
        llIllIllIl[llIlllIIII[10]] = lIlllIIIIIIll("Wcn3r885o/ioynbMO+NI11zQZAhl1Loc", "vsynZ");
        llIllIllIl[llIlllIIII[17]] = lIlllIIIIIIIl("Uftxgzxp6ouoF3DZhpgloJNDq5UFkOHVmlBf+xpH5MRQUmjCWO+pOE3vF54iU8lxgaqSwEmtJaE=", "RJVqx");
        llIllIllIl[llIlllIIII[19]] = lIlllIIIIIIll("Gl5e/vmWk1E=", "fDuWR");
        llIllIllIl[llIlllIIII[21]] = lIlllIIIIIIIl("JWBdBebM5VQ=", "ymNXX");
        llIllIllIl[llIlllIIII[23]] = lIlllIIIIIIll("NsE6ZdS3LLs=", "PxRZD");
        llIllIllIl[llIlllIIII[25]] = lIlllIIIIIIlI("IT0eND4=", "eOwZU");
        llIllIllIl[llIlllIIII[27]] = lIlllIIIIIIlI("LSwG", "hMrvd");
        llIllIllIl[llIlllIIII[12]] = lIlllIIIIIIlI("KDsAUzAJehEdKws/VhArEygFFg==", "fZvsD");
        llIllIllIl[llIlllIIII[49]] = lIlllIIIIIIlI("KBYEOjUCCgxpKgQD", "kdkIF");
        llIllIllIl[llIlllIIII[63]] = lIlllIIIIIIll("wER2EIoNs50vt9bsUlBUJg==", "hPONr");
        llIllIllIl[llIlllIIII[64]] = lIlllIIIIIIll("Licj291q5KoKOM3AJ1anow==", "pomNY");
        llIllIllIl[llIlllIIII[53]] = lIlllIIIIIIlI("IR8HIAwLHQltAAcH", "bsnMn");
        llIllIllIl[llIlllIIII[39]] = lIlllIIIIIIlI("HQMHBCYxDRFQKTcV", "RatpG");
        llIllIllIl[llIlllIIII[65]] = lIlllIIIIIIll("0RCreu6PMbqeFQvlzv+SEg==", "bOigz");
        llIllIllIl[llIlllIIII[66]] = lIlllIIIIIIlI("DgcoJDskBSZpOz8KLyox", "MkAIY");
        llIllIllIl[llIlllIIII[54]] = lIlllIIIIIIll("W86HXHJCXFb/oPUe/bzvuA==", "ZYnSN");
        llIllIllIl[llIlllIIII[67]] = lIlllIIIIIIlI("CC85GDU=", "KCPuW");
        llIllIllIl[llIlllIIII[41]] = lIlllIIIIIIll("2avn+1nCtp/GY5XS6Sq1Hg==", "iesjd");
        llIllIllIl[llIlllIIII[68]] = lIlllIIIIIIlI("BgMoDT8nCyoLcTYNNAk=", "DbDlQ");
        llIllIllIl[llIlllIIII[61]] = lIlllIIIIIIll("r5/7gjrQ+bg=", "YexiU");
        llIllIllIl[llIlllIIII[69]] = lIlllIIIIIIll("EMbDXtJQQjBmGMlf/McsdQ==", "RCIAF");
        llIllIllIl[llIlllIIII[70]] = lIlllIIIIIIlI("GxgyAFAtGDYLEyc=", "OjWep");
        llIllIllIl[llIlllIIII[42]] = lIlllIIIIIIll("8z0ktGm/s+FT/SY3guKn3w==", "ChxIx");
        llIllIllIl[llIlllIIII[71]] = lIlllIIIIIIIl("0PJ3w52fjaFeSsO19EumdQ==", "MuTCe");
        llIllIllIl[llIlllIIII[72]] = lIlllIIIIIIlI("GDsBGSI0NRdNLTIt", "WYrmC");
        llIllIllIl[llIlllIIII[73]] = lIlllIIIIIIll("BNolH20aGqKGmejVjmKrXw==", "yLWlR");
        llIllIllIl[llIlllIIII[74]] = lIlllIIIIIIlI("FycfIBs9OxdzGD0lFQ==", "TUpSh");
        llIllIllIl[llIlllIIII[2]] = lIlllIIIIIIlI("BS0rEBcpIz1EBiM/PQ==", "JOXdv");
        llIllIllIl[llIlllIIII[75]] = lIlllIIIIIIIl("ntbSb/jGt3Xd4+BKpBj33w==", "rSFuu");
        llIllIllIl[llIlllIIII[95]] = lIlllIIIIIIll("YLOUEH3PE25fuGws+XNE9A==", "bTMqA");
        llIllIllIl[llIlllIIII[97]] = lIlllIIIIIIlI("HxkIHFc9HloQBTMbHw==", "Rxzww");
        llIllIllIl[llIlllIIII[98]] = lIlllIIIIIIlI("GBscPi0rWho2MSc=", "LzwWC");
        llIllIllIl[llIlllIIII[99]] = lIlllIIIIIIlI("BwIHBShhABMZJ2ECHEsrMwIHBSg=", "AmrkL");
        llIllIllIl[llIlllIIII[100]] = lIlllIIIIIIIl("W+idCobdRnM=", "NjIsf");
        llIllIllIl[llIlllIIII[101]] = lIlllIIIIIIIl("Hr2iES3Nwohsot+ub8mb5Q==", "ndkOh");
        llIllIllIl[llIlllIIII[102]] = lIlllIIIIIIll("c/A5Zj19L0x6cOlS7KnIsA==", "TAMFJ");
        llIllIllIl[llIlllIIII[103]] = lIlllIIIIIIIl("myWaZNdy1tM=", "fauqQ");
        llIllIllIl[llIlllIIII[38]] = lIlllIIIIIIIl("9xQwmzR8wK6uVurQ/ePCJWylMeptd6cE", "EXhFg");
        llIllIllIl[llIlllIIII[105]] = lIlllIIIIIIIl("doHzWdvF/Nn7K9AhhMZQOA==", "IpAWJ");
        llIllIllIl[llIlllIIII[106]] = lIlllIIIIIIll("aEOgLpOgovY=", "TYzFE");
        llIllIllIl[llIlllIIII[107]] = lIlllIIIIIIlI("PxUTNwYdFw==", "sprGo");
        llIllIllIl[llIlllIIII[108]] = lIlllIIIIIIIl("9wM5V/3cVmY=", "mmFhC");
        llIllIllIl[llIlllIIII[109]] = lIlllIIIIIIll("NAzxP92NHLA=", "gzUMy");
        llIllIllIl[llIlllIIII[110]] = lIlllIIIIIIIl("U5c1mzkRg9LXH9UZRM/KFg==", "ZXeWe");
        llIllIllIl[llIlllIIII[111]] = lIlllIIIIIIlI("EhYBCg==", "Ewmfn");
        llIllIllIl[llIlllIIII[112]] = lIlllIIIIIIlI("EjsqExczPw==", "PZFry");
        llIllIllIl[llIlllIIII[113]] = lIlllIIIIIIlI("ITo0ATEFKHkWORs=", "kOYqX");
        llIllIllIl[llIlllIIII[40]] = lIlllIIIIIIlI("LTQx", "jUAeo");
        llIllIllIl[llIlllIIII[7]] = lIlllIIIIIIIl("Ej+V+y+XevM=", "roWGC");
        llIllIllIl[llIlllIIII[114]] = lIlllIIIIIIlI("Oz8BOhofLUwtEgFqXg==", "qJlJs");
        llIllIllIl[llIlllIIII[116]] = lIlllIIIIIIIl("+xGozOZCRWg=", "TttGk");
        llIllIllIl[llIlllIIII[117]] = lIlllIIIIIIlI("EhwIAhA2DkUVGChJVg==", "Xiery");
        llIllIllIl[llIlllIIII[119]] = lIlllIIIIIIlI("BQooOg==", "IoIJJ");
        llIllIllIl[llIlllIIII[120]] = lIlllIIIIIIll("21R98dSMLyOz+SFSmoEOig==", "maYPu");
        llIllIllIl[llIlllIIII[122]] = lIlllIIIIIIlI("LTozDDoA", "eOAhV");
        llIllIllIl[llIlllIIII[123]] = lIlllIIIIIIlI("Nzw0AzsZPDQNaBI6Lxg7FA==", "qUZjH");
        llIllIllIl[llIlllIIII[124]] = lIlllIIIIIIll("V3L8pmCCZ/M=", "OvhKc");
        llIllIllIl[llIlllIIII[44]] = lIlllIIIIIIlI("IiMANkAHMAs=", "hVmFm");
        llIllIllIl[llIlllIIII[140]] = lIlllIIIIIIlI("PAAVUy0dQQASNxMHCgB5EQ4WASoX", "racsY");
        llIllIllIl[llIlllIIII[6]] = lIlllIIIIIIlI("KBs8bRkJWjk5DBQO", "fzJMm");
        llIllIllIl[llIlllIIII[141]] = lIlllIIIIIIIl("iP/Kuz9+DvvyU6jwvCVYSQ==", "Cghym");
        llIllIllIl[llIlllIIII[142]] = lIlllIIIIIIlI("NSg4FmkVOzEf", "aITzI");
        llIllIllIl[llIlllIIII[143]] = lIlllIIIIIIll("0wve7+cmezA=", "byamw");
        llIllIllIl[llIlllIIII[144]] = lIlllIIIIIIlI("BxsXIFYlHEUsBCsZAA==", "JzeKv");
        llIllIllIl[llIlllIIII[145]] = lIlllIIIIIIIl("1iFXPzW9bXVq/4iwqfFJJw==", "HZqBu");
        llIllIllIl[llIlllIIII[146]] = lIlllIIIIIIlI("DjUgIR5oNzQ9EWg1O28dOjUgIR4=", "HZUOz");
        llIllIllIl[llIlllIIII[147]] = lIlllIIIIIIlI("HjkuKA==", "JXEMV");
        llIllIllIl[llIlllIIII[148]] = lIlllIIIIIIlI("Kww5HicPHnQJLxFZZQ==", "ayTnN");
        llIllIllIl[llIlllIIII[149]] = lIlllIIIIIIlI("DBMrAQ==", "FfFqh");
        llIllIllIl[llIlllIIII[150]] = lIlllIIIIIIIl("BFQyYfCZ3+i7gMGpZwSxtw==", "PByYE");
        llIllIllIl[llIlllIIII[151]] = lIlllIIIIIIIl("4Oi3I/E9u1U=", "iTulH");
        llIllIllIl[llIlllIIII[152]] = lIlllIIIIIIIl("fmahJDo08t+2tqrRbPdafQ==", "nHsfl");
        llIllIllIl[llIlllIIII[153]] = lIlllIIIIIIlI("JzknCA==", "mLJxJ");
        llIllIllIl[llIlllIIII[154]] = lIlllIIIIIIIl("1L1VpXJvUQMdtkywOlMdcQ==", "ALyRj");
        llIllIllIl[llIlllIIII[155]] = lIlllIIIIIIll("PhHjZwPpE+4=", "DgJWv");
        llIllIllIl[llIlllIIII[156]] = lIlllIIIIIIIl("yc0wSx3G1olL+yRpw1fPVA==", "dLEyN");
        llIllIllIl[llIlllIIII[157]] = lIlllIIIIIIIl("NDHtLGbOuFw=", "PXyFJ");
        llIllIllIl[llIlllIIII[158]] = lIlllIIIIIIlI("Gi8aOy0+PVcsJSB6Qg==", "PZwKD");
        llIllIllIl[llIlllIIII[159]] = lIlllIIIIIIll("+m/a9LsPz5c=", "dZiGF");
        llIllIllIl[llIlllIIII[160]] = lIlllIIIIIIll("/X+7plrzfeAkkkkjn42Mxw==", "auoHv");
        llIllIllIl[llIlllIIII[161]] = lIlllIIIIIIll("TGQW92+p4vM=", "hUmAw");
        llIllIllIl[llIlllIIII[172]] = lIlllIIIIIIIl("BRcU/zdgfxgsgBY5OL2sS09tvv1ArGF/", "aXUPa");
        llIllIllIl[llIlllIIII[173]] = lIlllIIIIIIIl("ZvYRphdx3iuEYAzH3DZ3pQ==", "xCLjy");
        llIllIllIl[llIlllIIII[174]] = lIlllIIIIIIlI("OgITHxsAGBVNDAYDAB4K", "ivrmo");
        llIllIllIl[llIlllIIII[175]] = lIlllIIIIIIIl("fDe7IcqICE8=", "ngkRI");
        llIllIllIl[llIlllIIII[36]] = lIlllIIIIIIIl("ZN8tCOha4wM1ugifU2MtPQ==", "krIOe");
        llIllIllIl[llIlllIIII[176]] = lIlllIIIIIIlI("Pg0EBEwcClYIHhIPEw==", "slvol");
        llIllIllIl[llIlllIIII[177]] = lIlllIIIIIIll("aJ8FurLyHN8YvbuUaS3qZQ==", "RhCeC");
        llIllIllIl[llIlllIIII[178]] = lIlllIIIIIIll("+GIgxRbd7iag2T21PWapVxSsBlMSCk0t", "nQYpQ");
        llIllIllIl[llIlllIIII[179]] = lIlllIIIIIIll("LORfY373l3M=", "dqRyI");
        llIllIllIl[llIlllIIII[180]] = lIlllIIIIIIIl("l9xayPYQFUchkPzTcuAvKg==", "WXfMb");
        llIllIllIl[llIlllIIII[79]] = lIlllIIIIIIll("mmZZAd6lYdw=", "BeAdN");
        llIllIllIl[llIlllIIII[181]] = lIlllIIIIIIIl("hpzNmVE0Lw3kp87eLYSKuQ==", "VQfjn");
        llIllIllIl[llIlllIIII[182]] = lIlllIIIIIIlI("EiQ/JTQ=", "QVPVG");
        llIllIllIl[llIlllIIII[183]] = lIlllIIIIIIlI("AiwdMTsmPlAmMzh5Qw==", "HYpAR");
        llIllIllIl[llIlllIIII[184]] = lIlllIIIIIIIl("6oIytDArHTM=", "CnsFL");
        llIllIllIl[llIlllIIII[185]] = lIlllIIIIIIll("NPOG5Ut5CbhjwfO36vOm8Q==", "EQrBt");
        llIllIllIl[llIlllIIII[186]] = lIlllIIIIIIlI("HDkGBQ==", "VLkuk");
        llIllIllIl[llIlllIIII[187]] = lIlllIIIIIIIl("KykK8q+igVFOoJfLxCI9PA==", "CfElz");
        llIllIllIl[llIlllIIII[188]] = lIlllIIIIIIlI("OhoKIg==", "pogRi");
        llIllIllIl[llIlllIIII[194]] = lIlllIIIIIIlI("ARYxHjxnFCUCM2cWKlA/NRYxHjw=", "GyDpX");
        llIllIllIl[llIlllIIII[203]] = lIlllIIIIIIll("N6Lyk+LF8Cc=", "oLtjA");
        llIllIllIl[llIlllIIII[204]] = lIlllIIIIIIlI("AxMCPQAUFw==", "srqNa");
        llIllIllIl[llIlllIIII[205]] = lIlllIIIIIIll("uZnNKnPBfLY=", "bSlsj");
        llIllIllIl[llIlllIIII[206]] = lIlllIIIIIIIl("ygwDK2lkbDc=", "SGqAD");
        llIllIllIl[llIlllIIII[207]] = lIlllIIIIIIlI("FC8EGBMDKw==", "dNwkr");
        llIllIllIl[llIlllIIII[208]] = lIlllIIIIIIll("6NHdvcQ32Vs=", "JXDLq");
        llIllIllIl[llIlllIIII[211]] = lIlllIIIIIIIl("Hpjz4rxTARQ=", "rThGy");
        llIllIllIl[llIlllIIII[213]] = lIlllIIIIIIIl("xp+1tO0O4AY=", "FtaKs");
        llIllIllIl[llIlllIIII[216]] = lIlllIIIIIIIl("2v2q6mHUvqGZSou6GRUeXw==", "IEPJE");
        llIllIllIl[llIlllIIII[218]] = lIlllIIIIIIll("vjPsvBXIQk8=", "axfrG");
        llIllIllIl[llIlllIIII[221]] = lIlllIIIIIIlI("ADAY", "GQhNs");
        llIllIllIl[llIlllIIII[224]] = lIlllIIIIIIIl("+IddSvDzcU0=", "ezhMZ");
        llIllIllIl[llIlllIIII[226]] = lIlllIIIIIIlI("Jys/DHUBJSYFLA==", "wDSiX");
        llIllIllIl[llIlllIIII[227]] = lIlllIIIIIIIl("JThp/y0j6Hw=", "jxkEB");
        llIllIllIl[llIlllIIII[230]] = lIlllIIIIIIIl("P2G2UoNWLV0=", "nmsoO");
        llIllIllIl[llIlllIIII[232]] = lIlllIIIIIIll("/NV0nLt1oJ8=", "qpwSe");
        llIllIllIl[llIlllIIII[233]] = lIlllIIIIIIlI("MQog", "vkPpA");
    }

    static {
        lIlllIIlIIlll();
        lIlllIIIIllll();
        bv = new ArrayList();
        mT = llIlllIIII[28];
        mU = llIlllIIII[24];
        mW = new WorldArea(llIlllIIII[235], llIlllIIII[52], llIlllIIII[69], llIlllIIII[72], llIlllIIII[0]);
        mX = new WorldArea(llIlllIIII[235], llIlllIIII[52], llIlllIIII[69], llIlllIIII[72], llIlllIIII[1]);
        mY = new WorldArea(llIlllIIII[235], llIlllIIII[52], llIlllIIII[69], llIlllIIII[72], llIlllIIII[3]);
        mZ = new WorldPoint(llIlllIIII[236], llIlllIIII[237], llIlllIIII[0]);
    }

    private static void eD() {
        WorldArea worldArea = new WorldArea(llIlllIIII[125], llIlllIIII[126], llIlllIIII[112], llIlllIIII[107], llIlllIIII[0]);
        WorldArea worldArea2 = new WorldArea(llIlllIIII[125], llIlllIIII[126], llIlllIIII[112], llIlllIIII[107], llIlllIIII[1]);
        WorldArea worldArea3 = new WorldArea(llIlllIIII[125], llIlllIIII[126], llIlllIIII[112], llIlllIIII[107], llIlllIIII[3]);
        WorldArea worldArea4 = new WorldArea(llIlllIIII[125], llIlllIIII[126], llIlllIIII[112], llIlllIIII[107], llIlllIIII[10]);
        WorldArea worldArea5 = new WorldArea(llIlllIIII[127], llIlllIIII[128], llIlllIIII[49], llIlllIIII[12], llIlllIIII[3]);
        WorldArea worldArea6 = new WorldArea(llIlllIIII[129], llIlllIIII[127], llIlllIIII[49], llIlllIIII[25], llIlllIIII[3]);
        WorldArea worldArea7 = new WorldArea(llIlllIIII[130], llIlllIIII[131], llIlllIIII[63], llIlllIIII[49], llIlllIIII[3]);
        WorldArea worldArea8 = new WorldArea(llIlllIIII[132], llIlllIIII[133], llIlllIIII[12], llIlllIIII[64], llIlllIIII[10]);
        WorldArea worldArea9 = new WorldArea(llIlllIIII[134], llIlllIIII[9], llIlllIIII[49], llIlllIIII[27], llIlllIIII[3]);
        WorldArea worldArea10 = new WorldArea(llIlllIIII[135], llIlllIIII[136], llIlllIIII[68], llIlllIIII[53], llIlllIIII[10]);
        WorldArea worldArea11 = new WorldArea(llIlllIIII[137], llIlllIIII[138], llIlllIIII[63], llIlllIIII[64], llIlllIIII[3]);
        WorldPoint worldPoint = new WorldPoint(llIlllIIII[137], llIlllIIII[139], llIlllIIII[0]);
        if (lIlllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlllIIlIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIIlIlIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIlllIIII[1]);
            "".length();
        }
        if (lIlllIIlIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlllIIII[21])) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIlllIIII[1]);
                "".length();
            }
            if (lIlllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlllIIII[21])) {
                AccBuilderSotf.c = llIllIllIl[llIlllIIII[141]];
                int llllllllllllllllllIIIIlIlIIIIlIl = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIlllIIII[1]];
                strArr[llIlllIIII[0]] = llIllIllIl[llIlllIIII[142]];
                TileObjects.getNearest(strArr).interact(llIllIllIl[llIlllIIII[143]]);
                Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), llllllllllllllllllIIIIlIlIIIIlIl)) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return ((((34 + 10) - 38) + 179) ^ (((52 + 35) - (-86)) + 16)) == " ".length() ? ((((31 + 152) - 167) + 143) ^ (((3 + 99) - (-39)) + 6)) & (((223 ^ 189) ^ (250 ^ 148)) ^ (-" ".length())) : r0;
                    }
                    return llIlllIIII[0];
                }, llIlllIIII[104]);
                "".length();
                Time.sleepTicks(llIlllIIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIlllIIII[1]];
        strArr2[llIlllIIII[0]] = llIllIllIl[llIlllIIII[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlllIIlIlIll(nearest) && lIlllIIlIlIII(eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIllIllIl[llIlllIIII[145]];
            System.out.println(llIllIllIl[llIlllIIII[146]]);
            nearest.interact(llIllIllIl[llIlllIIII[147]]);
            Time.sleepTicks(llIlllIIII[10]);
            "".length();
        }
        if (lIlllIIlIlIlI(eF() ? 1 : 0)) {
            if (lIlllIIlIlIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlllIIlIlIII(tileObject.getName().contains(llIllIllIl[llIlllIIII[233]]) ? 1 : 0) && lIlllIIllIIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[234], llIlllIIII[131], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (((89 ^ 111) ^ (72 ^ 88)) & (((235 ^ 167) ^ (174 ^ 196)) ^ (-" ".length()))) != 0 ? ((182 ^ 162) ^ (57 ^ 105)) & (((50 ^ 27) ^ (101 ^ 8)) ^ (-" ".length())) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest2)) {
                    int experience = Skills.getExperience(Skill.AGILITY);
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[148]];
                    nearest2.interact(llIllIllIl[llIlllIIII[149]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlllIIlIlIII(tileObject2.getName().contains(llIllIllIl[llIlllIIII[232]]) ? 1 : 0) && lIlllIIllIIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[131], llIlllIIII[225], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (10 ^ 15) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest3)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[150]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIllIllIl[llIlllIIII[151]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return " ".length() == 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlllIIlIlIII(tileObject3.getName().contains(llIllIllIl[llIlllIIII[230]]) ? 1 : 0) && lIlllIIllIIII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[139], llIlllIIII[231], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return ((30 ^ 7) & ((75 ^ 82) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest4)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[152]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIllIllIl[llIlllIIII[153]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlllIIlIlIII(tileObject4.getName().contains(llIllIllIl[llIlllIIII[227]]) ? 1 : 0) && lIlllIIllIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[228], llIlllIIII[229], llIlllIIII[10])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest5)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[154]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIllIllIl[llIlllIIII[155]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return 0 != 0 ? ((((2 + 102) - 15) + 42) ^ (((98 + 122) - 133) + 69)) & (((17 ^ 68) ^ (16 ^ 90)) ^ (-" ".length())) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlllIIlIlIII(tileObject5.getName().contains(llIllIllIl[llIlllIIII[226]]) ? 1 : 0) && lIlllIIllIIII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[9], llIlllIIII[130], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return (-((179 ^ 136) ^ (29 ^ 34))) > 0 ? ((126 ^ 30) ^ (6 ^ 123)) & (((8 ^ 27) ^ (155 ^ 149)) ^ (-" ".length())) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest6)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[156]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIllIllIl[llIlllIIII[157]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (lIlllIIlIlIII(eF() ? 1 : 0)) {
                return;
            }
            if (lIlllIIlIlIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIlllIIlIlIII(tileObject6.getName().contains(llIllIllIl[llIlllIIII[224]]) ? 1 : 0) && lIlllIIllIIII(tileObject6.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[225], llIlllIIII[215], llIlllIIII[10])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest7)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[158]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(llIllIllIl[llIlllIIII[159]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
            if (!lIlllIIlIlIII(eF() ? 1 : 0) && lIlllIIlIlIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIlllIIlIlIII(tileObject7.getName().contains(llIllIllIl[llIlllIIII[221]]) ? 1 : 0) && lIlllIIllIIII(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llIlllIIII[222], llIlllIIII[223], llIlllIIII[3])), llIlllIIII[3])) {
                        ?? r0 = llIlllIIII[1];
                        "".length();
                        return 0 != 0 ? ((((18 + 111) - (-1)) + 19) ^ (((129 + 97) - 202) + 142)) & (((98 ^ 123) ^ (236 ^ 198)) ^ (-" ".length())) : r0;
                    }
                    return llIlllIIII[0];
                });
                if (lIlllIIlIlIll(nearest8)) {
                    AccBuilderSotf.c = llIllIllIl[llIlllIIII[160]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(llIllIllIl[llIlllIIII[161]]);
                    Time.sleepTicks(C0018e.c(llIlllIIII[1], llIlllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlllIIlIllII(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llIlllIIII[1];
                            "".length();
                            return ((197 ^ 135) & ((117 ^ 55) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIIII[0];
                    }, llIlllIIII[104]);
                    "".length();
                    Time.sleepTicks(llIlllIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlllIIlIlIlI(int i) {
        return i == 0;
    }

    private static void lIlllIIlIIlll() {
        llIlllIIII = new int[239];
        llIlllIIII[0] = (122 ^ 46) & ((43 ^ 127) ^ (-1));
        llIlllIIII[1] = " ".length();
        llIlllIIII[2] = 147 ^ 141;
        llIlllIIII[3] = "  ".length();
        llIlllIIII[4] = (-29297) & 32759;
        llIlllIIII[5] = (-((-1605) & 26231)) & (-585) & 28671;
        llIlllIIII[6] = 26 ^ 36;
        llIlllIIII[7] = 100 ^ 87;
        llIlllIIII[8] = (-((-1441) & 26594)) & (-7) & 28671;
        llIlllIIII[9] = (-25156) & 28635;
        llIlllIIII[10] = "   ".length();
        llIlllIIII[11] = (-((-19214) & 28543)) & (-16389) & 30717;
        llIlllIIII[12] = 112 ^ 122;
        llIlllIIII[13] = (-(((111 + 110) - 209) + 157)) & (-8193) & 16367;
        llIlllIIII[14] = (-8211) & 16218;
        llIlllIIII[15] = (-"   ".length()) & (-16421) & 24431;
        llIlllIIII[16] = (-12531) & 16383;
        llIlllIIII[17] = 10 ^ 14;
        llIlllIIII[18] = (-20787) & 32766;
        llIlllIIII[19] = (120 ^ 55) ^ (74 ^ 0);
        llIlllIIII[20] = (-((-8777) & 28399)) & (-9) & 32255;
        llIlllIIII[21] = (232 ^ 150) ^ (194 ^ 186);
        llIlllIIII[22] = (-((-22986) & 31183)) & (-16433) & 32639;
        llIlllIIII[23] = 174 ^ 169;
        llIlllIIII[24] = (-((-20617) & 32447)) & (-1) & 12215;
        llIlllIIII[25] = 113 ^ 121;
        llIlllIIII[26] = (-((-27333) & 27597)) & (-12357) & 32239;
        llIlllIIII[27] = 76 ^ 69;
        llIlllIIII[28] = (-((-671) & 10207)) & (-33) & 30714;
        llIlllIIII[29] = (-4140) & 15999;
        llIlllIIII[30] = (-((-7889) & 8188)) & (-4101) & 16255;
        llIlllIIII[31] = (-16418) & 28271;
        llIlllIIII[32] = (-((-17601) & 21987)) & (-16529) & 32766;
        llIlllIIII[33] = (-((-18447) & 22959)) & (-9) & 16378;
        llIlllIIII[34] = (-((-6857) & 23290)) & (-5) & 28287;
        llIlllIIII[35] = (-((-10005) & 30495)) & (-53) & 32510;
        llIlllIIII[36] = (186 ^ 145) ^ (72 ^ 59);
        llIlllIIII[37] = (-8197) & 28431;
        llIlllIIII[38] = 40 ^ 0;
        llIlllIIII[39] = (198 ^ 151) ^ (37 ^ 123);
        llIlllIIII[40] = (110 ^ 101) ^ (112 ^ 73);
        llIlllIIII[41] = (120 ^ 81) ^ (251 ^ 198);
        llIlllIIII[42] = 124 ^ 101;
        llIlllIIII[43] = (-((-497) & 10225)) & (-2242) & 12271;
        llIlllIIII[44] = 60 ^ 0;
        llIlllIIII[45] = (-24133) & 24439;
        llIlllIIII[46] = (-4123) & 6591;
        llIlllIIII[47] = (-((-25669) & 30293)) & (-133) & 8191;
        llIlllIIII[48] = (-25240) & 28663;
        llIlllIIII[49] = 207 ^ 196;
        llIlllIIII[50] = (-4097) & 7517;
        llIlllIIII[51] = (-4699) & 7163;
        llIlllIIII[52] = (-((-3123) & 24251)) & (-8193) & 32735;
        llIlllIIII[53] = 0 ^ 14;
        llIlllIIII[54] = (38 ^ 42) ^ (79 ^ 81);
        llIlllIIII[55] = (-12361) & 14843;
        llIlllIIII[56] = (-25125) & 28540;
        llIlllIIII[57] = (-((-3106) & 32363)) & (-5) & 31743;
        llIlllIIII[58] = (-((-2753) & 31431)) & (-129) & 32223;
        llIlllIIII[59] = (-4105) & 6585;
        llIlllIIII[60] = (-25245) & 28671;
        llIlllIIII[61] = (193 ^ 171) ^ (81 ^ 45);
        llIlllIIII[62] = -" ".length();
        llIlllIIII[63] = (((54 + 24) - 36) + 95) ^ (((100 + 123) - 132) + 42);
        llIlllIIII[64] = (64 ^ 120) ^ (148 ^ 161);
        llIlllIIII[65] = 141 ^ 157;
        llIlllIIII[66] = 128 ^ 145;
        llIlllIIII[67] = (84 ^ 49) ^ (202 ^ 188);
        llIlllIIII[68] = (30 ^ 4) ^ (10 ^ 5);
        llIlllIIII[69] = 120 ^ 111;
        llIlllIIII[70] = (110 ^ 82) ^ (96 ^ 68);
        llIlllIIII[71] = (116 ^ 88) ^ (247 ^ 193);
        llIlllIIII[72] = (((125 + 120) - 119) + 14) ^ (((89 + 53) - 51) + 60);
        llIlllIIII[73] = (202 ^ 168) ^ (248 ^ 134);
        llIlllIIII[74] = (8 ^ 80) ^ (104 ^ 45);
        llIlllIIII[75] = (97 ^ 101) ^ (100 ^ 127);
        llIlllIIII[76] = (-29345) & 32511;
        llIlllIIII[77] = (-202) & 3551;
        llIlllIIII[78] = (((138 ^ 158) + (34 ^ 113)) - (115 ^ 35)) + (93 ^ 47);
        llIlllIIII[79] = 255 ^ 161;
        llIlllIIII[80] = (-28937) & 32155;
        llIlllIIII[81] = (-4225) & 7633;
        llIlllIIII[82] = (-16419) & 19630;
        llIlllIIII[83] = (-20481) & 23678;
        llIlllIIII[84] = (-((-7765) & 16119)) & (-1) & 11766;
        llIlllIIII[85] = (-4106) & 7295;
        llIlllIIII[86] = (-((-1189) & 30381)) & (-33) & 32637;
        llIlllIIII[87] = (-12467) & 15867;
        llIlllIIII[88] = (-16785) & 19963;
        llIlllIIII[89] = (-((-373) & 13181)) & (-16577) & 32766;
        llIlllIIII[90] = (-((-2065) & 23415)) & (-1) & 24567;
        llIlllIIII[91] = (-((-4099) & 4791)) & (-12290) & 16373;
        llIlllIIII[92] = (-29462) & 32695;
        llIlllIIII[93] = (-25093) & 28494;
        llIlllIIII[94] = (-((-17529) & 26233)) & (-16518) & 28631;
        llIlllIIII[95] = (((223 + 55) - 245) + 196) ^ (((145 + 15) - 154) + 191);
        llIlllIIII[96] = (-20772) & 23995;
        llIlllIIII[97] = (80 ^ 28) ^ (26 ^ 119);
        llIlllIIII[98] = 147 ^ 177;
        llIlllIIII[99] = (55 ^ 18) ^ (47 ^ 41);
        llIlllIIII[100] = 33 ^ 5;
        llIlllIIII[101] = 21 ^ 48;
        llIlllIIII[102] = 5 ^ 35;
        llIlllIIII[103] = 130 ^ 165;
        llIlllIIII[104] = (-((-21254) & 24335)) & (-4225) & 15805;
        llIlllIIII[105] = " ".length() ^ (81 ^ 121);
        llIlllIIII[106] = 72 ^ 98;
        llIlllIIII[107] = 190 ^ 149;
        llIlllIIII[108] = (((40 + 145) - 150) + 112) ^ (((136 + 106) - 74) + 23);
        llIlllIIII[109] = 152 ^ 181;
        llIlllIIII[110] = (12 ^ 63) ^ (20 ^ 9);
        llIlllIIII[111] = (7 ^ 125) ^ (214 ^ 131);
        llIlllIIII[112] = 74 ^ 122;
        llIlllIIII[113] = 243 ^ 194;
        llIlllIIII[114] = (((152 + 26) - 62) + 68) ^ (((23 + 16) - 12) + 113);
        llIlllIIII[115] = (-((-14475) & 32395)) & (-14) & 32767;
        llIlllIIII[116] = 180 ^ 129;
        llIlllIIII[117] = (58 ^ 66) ^ (51 ^ 125);
        llIlllIIII[118] = (-1545) & 16379;
        llIlllIIII[119] = (147 ^ 188) ^ (114 ^ 106);
        llIlllIIII[120] = (6 ^ 27) ^ (79 ^ 106);
        llIlllIIII[121] = (-((-8465) & 26395)) & (-1) & 32766;
        llIlllIIII[122] = (251 ^ 144) ^ (105 ^ 59);
        llIlllIIII[123] = (((77 + 127) - 114) + 59) ^ (((28 + 99) - (-16)) + 32);
        llIlllIIII[124] = (185 ^ 139) ^ (6 ^ 15);
        llIlllIIII[125] = (-((-8287) & 24703)) & (-1) & 19887;
        llIlllIIII[126] = (-4674) & 8139;
        llIlllIIII[127] = (-29186) & 32687;
        llIlllIIII[128] = (-16462) & 19951;
        llIlllIIII[129] = (-((-3905) & 24401)) & (-1) & 23991;
        llIlllIIII[130] = (-4677) & 8159;
        llIlllIIII[131] = (-16917) & 20413;
        llIlllIIII[132] = (-((-20865) & 29168)) & (-1) & 11775;
        llIlllIIII[133] = (-12825) & 16313;
        llIlllIIII[134] = (-16493) & 19967;
        llIlllIIII[135] = (-((-23867) & 32635)) & (-3) & 12255;
        llIlllIIII[136] = (-16385) & 19851;
        llIlllIIII[137] = (-28746) & 32251;
        llIlllIIII[138] = (-((-4497) & 13245)) & (-4099) & 16319;
        llIlllIIII[139] = (-29282) & 32767;
        llIlllIIII[140] = (127 ^ 113) ^ (151 ^ 164);
        llIlllIIII[141] = (153 ^ 134) ^ (100 ^ 68);
        llIlllIIII[142] = (192 ^ 158) ^ (34 ^ 60);
        llIlllIIII[143] = 44 ^ 109;
        llIlllIIII[144] = (215 ^ 150) ^ "   ".length();
        llIlllIIII[145] = (36 ^ 123) ^ (171 ^ 183);
        llIlllIIII[146] = (227 ^ 174) ^ (97 ^ 104);
        llIlllIIII[147] = 69 ^ 0;
        llIlllIIII[148] = (6 ^ 87) ^ (17 ^ 6);
        llIlllIIII[149] = 24 ^ 95;
        llIlllIIII[150] = 200 ^ 128;
        llIlllIIII[151] = (12 ^ 28) ^ (5 ^ 92);
        llIlllIIII[152] = (227 ^ 141) ^ (42 ^ 14);
        llIlllIIII[153] = (38 ^ 7) ^ (245 ^ 159);
        llIlllIIII[154] = 92 ^ 16;
        llIlllIIII[155] = (28 ^ 90) ^ (129 ^ 138);
        llIlllIIII[156] = 2 ^ 76;
        llIlllIIII[157] = (((74 + 91) - 93) + 158) ^ (((66 + 129) - 108) + 82);
        llIlllIIII[158] = (200 ^ 157) ^ (103 ^ 98);
        llIlllIIII[159] = (242 ^ 199) ^ (235 ^ 143);
        llIlllIIII[160] = (250 ^ 137) ^ (230 ^ 199);
        llIlllIIII[161] = (((61 + 10) - 17) + 93) ^ (((100 + 40) - 98) + 150);
        llIlllIIII[162] = (-((-16811) & 30123)) & (-385) & 16383;
        llIlllIIII[163] = (-((-93) & 21213)) & (-8193) & 32766;
        llIlllIIII[164] = (-5377) & 8095;
        llIlllIIII[165] = (-30017) & 32717;
        llIlllIIII[166] = (-17741) & 20447;
        llIlllIIII[167] = (-24691) & 27387;
        llIlllIIII[168] = (-((-16645) & 20766)) & (-16641) & 23449;
        llIlllIIII[169] = (-8271) & 11727;
        llIlllIIII[170] = (-((-8321) & 26071)) & (-1) & 20479;
        llIlllIIII[171] = (-25111) & 28598;
        llIlllIIII[172] = 228 ^ 176;
        llIlllIIII[173] = 28 ^ 73;
        llIlllIIII[174] = 81 ^ 7;
        llIlllIIII[175] = 228 ^ 179;
        llIlllIIII[176] = 120 ^ 33;
        llIlllIIII[177] = 25 ^ 67;
        llIlllIIII[178] = (88 ^ 23) ^ (173 ^ 185);
        llIlllIIII[179] = 249 ^ 165;
        llIlllIIII[180] = (((83 + 214) - 97) + 44) ^ (((88 + 72) - 149) + 158);
        llIlllIIII[181] = (((98 + 167) - 69) + 13) ^ (((91 + 15) - 33) + 69);
        llIlllIIII[182] = 105 ^ 9;
        llIlllIIII[183] = (247 ^ 129) ^ (30 ^ 9);
        llIlllIIII[184] = 68 ^ 38;
        llIlllIIII[185] = 251 ^ 152;
        llIlllIIII[186] = 254 ^ 154;
        llIlllIIII[187] = 205 ^ 168;
        llIlllIIII[188] = (189 ^ 139) ^ (205 ^ 157);
        llIlllIIII[189] = (-8321) & 11511;
        llIlllIIII[190] = (-((-835) & 17251)) & (-4738) & 24567;
        llIlllIIII[191] = (-((-18898) & 23507)) & (-401) & 8191;
        llIlllIIII[192] = (-((-4235) & 29391)) & (-4225) & 32767;
        llIlllIIII[193] = (-20791) & 32639;
        llIlllIIII[194] = (161 ^ 178) ^ (92 ^ 40);
        llIlllIIII[195] = (-((-4601) & 15356)) & (-129) & 16383;
        llIlllIIII[196] = (-((-25633) & 28279)) & (-4097) & 31742;
        llIlllIIII[197] = (-5211) & 6110;
        llIlllIIII[198] = (-((-3491) & 24035)) & (-8201) & 29694;
        llIlllIIII[199] = (-10337) & 12286;
        llIlllIIII[200] = (-17417) & 26366;
        llIlllIIII[201] = (-294) & 12271;
        llIlllIIII[202] = (-6657) & 32606;
        llIlllIIII[203] = (((186 + 140) - 249) + 149) ^ (((110 + 100) - 108) + 36);
        llIlllIIII[204] = 52 ^ 93;
        llIlllIIII[205] = 92 ^ 54;
        llIlllIIII[206] = 63 ^ 84;
        llIlllIIII[207] = (118 ^ 82) ^ (137 ^ 193);
        llIlllIIII[208] = (((125 + 85) - 169) + 193) ^ (((58 + 123) - 59) + 13);
        llIlllIIII[209] = (-21761) & 24463;
        llIlllIIII[210] = (-((-8579) & 9203)) & (-4103) & 8191;
        llIlllIIII[211] = (45 ^ 16) ^ (214 ^ 133);
        llIlllIIII[212] = (-8771) & 12239;
        llIlllIIII[213] = (1 ^ 85) ^ (23 ^ 44);
        llIlllIIII[214] = (-8545) & 11255;
        llIlllIIII[215] = (-66) & 3541;
        llIlllIIII[216] = 18 ^ 98;
        llIlllIIII[217] = (-17762) & 20471;
        llIlllIIII[218] = 74 ^ 59;
        llIlllIIII[219] = (-((-2577) & 11871)) & (-273) & 12287;
        llIlllIIII[220] = (-8793) & 12285;
        llIlllIIII[221] = (15 ^ 114) ^ (122 ^ 117);
        llIlllIIII[222] = (-16449) & 19958;
        llIlllIIII[223] = (-((-6580) & 31735)) & (-33) & 28671;
        llIlllIIII[224] = (57 ^ 54) ^ (9 ^ 117);
        llIlllIIII[225] = (-((-6585) & 31673)) & (-1) & 28591;
        llIlllIIII[226] = (243 ^ 158) ^ (77 ^ 84);
        llIlllIIII[227] = 224 ^ 149;
        llIlllIIII[228] = (-((-85) & 12405)) & (-16905) & 32702;
        llIlllIIII[229] = (-28681) & 32172;
        llIlllIIII[230] = (54 ^ 99) ^ (80 ^ 115);
        llIlllIIII[231] = (-25173) & 28671;
        llIlllIIII[232] = 219 ^ 172;
        llIlllIIII[233] = (((164 + 32) - 165) + 159) ^ (((95 + 121) - 108) + 90);
        llIlllIIII[234] = (-29261) & 32765;
        llIlllIIII[235] = (-((-1066) & 30331)) & (-9) & 31741;
        llIlllIIII[236] = (-((-19707) & 31999)) & (-16385) & 31150;
        llIlllIIII[237] = (-28675) & 32111;
        llIlllIIII[238] = (12 ^ 61) ^ (138 ^ 194);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIIlIlllI(Skills.getLevel(Skill.AGILITY), llIlllIIII[2])) {
            ?? r0 = llIlllIIII[1];
            "".length();
            return (-(167 ^ 163)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlllIIII[0];
    }

    private static String lIlllIIIIIIIl(String llllllllllllllllllIIIIIlllIlIIlI, String llllllllllllllllllIIIIIlllIIllll) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlllIIllll.getBytes(StandardCharsets.UTF_8)), llIlllIIII[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllIIII[3], llllllllllllllllllIIIIIlllIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIlllIlIIll) {
            llllllllllllllllllIIIIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIlllIIlIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0004ad.llIlllIIII[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIlllIIlIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0004ad.llIlllIIII[12]) != false) goto L43;
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
        int[] iArr4 = new int[llIlllIIII[1]];
        iArr4[llIlllIIII[0]] = llIlllIIII[16];
        if (lIlllIIlIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[16], llIlllIIII[1], llIlllIIII[195]));
            "".length();
        }
        int[] iArr5 = new int[llIlllIIII[1]];
        iArr5[llIlllIIII[0]] = llIlllIIII[18];
        if (lIlllIIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[18], llIlllIIII[3], llIlllIIII[196]));
            "".length();
        }
        int[] iArr6 = new int[llIlllIIII[1]];
        iArr6[llIlllIIII[0]] = llIlllIIII[28];
        if (lIlllIIlIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[28], llIlllIIII[3], llIlllIIII[196]));
            "".length();
        }
        int[] iArr7 = new int[llIlllIIII[1]];
        iArr7[llIlllIIII[0]] = llIlllIIII[13];
        if (lIlllIIlIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[13], llIlllIIII[12], llIlllIIII[197]));
            "".length();
        }
        int[] iArr8 = new int[llIlllIIII[1]];
        iArr8[llIlllIIII[0]] = llIlllIIII[22];
        if (lIlllIIlIlIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[22], llIlllIIII[12], llIlllIIII[198]));
            "".length();
        }
        int[] iArr9 = new int[llIlllIIII[1]];
        iArr9[llIlllIIII[0]] = llIlllIIII[15];
        if (lIlllIIlIlIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[15], llIlllIIII[12], llIlllIIII[198]));
            "".length();
        }
        int[] iArr10 = new int[llIlllIIII[1]];
        iArr10[llIlllIIII[0]] = llIlllIIII[14];
        if (lIlllIIlIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIlllIIII[14], llIlllIIII[12], llIlllIIII[198]));
            "".length();
        }
        int[] iArr11 = new int[llIlllIIII[1]];
        iArr11[llIlllIIII[0]] = llIlllIIII[24];
        if (lIlllIIlIlIII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llIlllIIII[1]];
            iArr12[llIlllIIII[0]] = llIlllIIII[24];
            if (lIlllIIlIlIII(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIlllIIII[1]];
                iArr13[llIlllIIII[0]] = llIlllIIII[24];
            }
            iArr = new int[llIlllIIII[1]];
            iArr[llIlllIIII[0]] = llIlllIIII[26];
            if (lIlllIIlIlIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[llIlllIIII[1]];
                iArr14[llIlllIIII[0]] = llIlllIIII[26];
                if (lIlllIIlIlIII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIlllIIII[1]];
                    iArr15[llIlllIIII[0]] = llIlllIIII[26];
                }
                iArr2 = new int[llIlllIIII[1]];
                iArr2[llIlllIIII[0]] = llIlllIIII[201];
                if (lIlllIIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(llIlllIIII[201], llIlllIIII[1], llIlllIIII[202]));
                    "".length();
                }
                iArr3 = new int[llIlllIIII[1]];
                iArr3[llIlllIIII[0]] = llIlllIIII[20];
                if (lIlllIIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(llIlllIIII[20], llIlllIIII[41], C0023j.cf));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIlllIIII[26], llIlllIIII[12], llIlllIIII[200]));
            "".length();
            iArr2 = new int[llIlllIIII[1]];
            iArr2[llIlllIIII[0]] = llIlllIIII[201];
            if (lIlllIIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIlllIIII[1]];
            iArr3[llIlllIIII[0]] = llIlllIIII[20];
            if (lIlllIIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(mU, llIlllIIII[44], llIlllIIII[199]));
        "".length();
        iArr = new int[llIlllIIII[1]];
        iArr[llIlllIIII[0]] = llIlllIIII[26];
        if (lIlllIIlIlIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIlllIIII[26], llIlllIIII[12], llIlllIIII[200]));
        "".length();
        iArr2 = new int[llIlllIIII[1]];
        iArr2[llIlllIIII[0]] = llIlllIIII[201];
        if (lIlllIIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIlllIIII[1]];
        iArr3[llIlllIIII[0]] = llIlllIIII[20];
        if (lIlllIIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIlllIIlIllII(int i, int i2) {
        return i > i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIllIllIl[llIlllIIII[203]];
    }
}

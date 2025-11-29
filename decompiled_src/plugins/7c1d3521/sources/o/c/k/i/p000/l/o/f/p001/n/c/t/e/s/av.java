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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.av  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/av.class */
public class av implements InterfaceC0003ac {
    public static /* synthetic */ int mV;
    public static /* synthetic */ int mT;
    static /* synthetic */ WorldArea mW;
    private static /* synthetic */ String[] llIIIIIllI;
    public static /* synthetic */ int mU;
    private static /* synthetic */ int[] llIIIIlllI;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea mY;
    static /* synthetic */ WorldArea mX;
    private static /* synthetic */ WorldPoint mZ;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIlIIlIIlllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIIlllI[0];
    }

    private static void eC() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[1]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[2]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[9]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[79], llIIIIlllI[80], llIIIIlllI[69], llIIIIlllI[64], llIIIIlllI[0]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[81], llIIIIlllI[80], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[82], llIIIIlllI[83], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[9]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[84], llIIIIlllI[85], llIIIIlllI[26], llIIIIlllI[22], llIIIIlllI[1]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[84], llIIIIlllI[86], llIIIIlllI[11], llIIIIlllI[24], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[87], llIIIIlllI[88], llIIIIlllI[89], llIIIIlllI[40], llIIIIlllI[9]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[90], llIIIIlllI[91], llIIIIlllI[66], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[92], llIIIIlllI[93], llIIIIlllI[22], llIIIIlllI[26], llIIIIlllI[9]);
        WorldArea worldArea12 = new WorldArea(llIIIIlllI[92], llIIIIlllI[94], llIIIIlllI[11], llIIIIlllI[22], llIIIIlllI[9]);
        if (lIlIIlIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[89]];
            if (lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(llIIIIlllI[95], llIIIIlllI[52], llIIIIlllI[0]));
            "".length();
            Time.sleepTicks(llIIIIlllI[1]);
            "".length();
        }
        if (lIlIIlIlIIIlI(Players.getLocal().getAnimation(), llIIIIlllI[62]) && lIlIIlIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[llIIIIlllI[1]];
            strArr[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[96]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIlIIlIIllllI(nearest) && lIlIIlIIllIll(eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[97]];
                System.out.println(llIIIIIllI[llIIIIlllI[98]]);
                nearest.interact(llIIIIIllI[llIIIIlllI[99]]);
                Time.sleepTicks(llIIIIlllI[9]);
                "".length();
            }
            if (lIlIIlIIlllIl(eF() ? 1 : 0)) {
                if (lIlIIlIIllIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[100]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[llIIIIlllI[1]];
                    strArr2[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[101]];
                    TileObjects.getNearest(strArr2).interact(llIIIIIllI[llIIIIlllI[102]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? ((229 ^ 134) ^ (26 ^ 64)) & (((((80 + 43) - 12) + 76) ^ (((33 + 32) - (-42)) + 23)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[104]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[llIIIIlllI[1]];
                    strArr3[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[37]];
                    TileObjects.getNearest(strArr3).interact(llIIIIIllI[llIIIIlllI[105]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-(191 ^ 187)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[106]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[llIIIIlllI[1]];
                    strArr4[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[107]];
                    TileObjects.getNearest(strArr4).interact(llIIIIIllI[llIIIIlllI[108]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[109]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[llIIIIlllI[1]];
                    strArr5[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[110]];
                    TileObjects.getNearest(strArr5).interact(llIIIIIllI[llIIIIlllI[111]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[112]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[llIIIIlllI[1]];
                    strArr6[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[113]];
                    TileObjects.getNearest(strArr6).interact(llIIIIIllI[llIIIIlllI[39]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[6]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[llIIIIlllI[1]];
                    iArr[llIIIIlllI[0]] = llIIIIlllI[114];
                    TileObjects.getNearest(iArr).interact(llIIIIIllI[llIIIIlllI[115]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[116]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[llIIIIlllI[1]];
                    iArr2[llIIIIlllI[0]] = llIIIIlllI[117];
                    TileObjects.getNearest(iArr2).interact(llIIIIIllI[llIIIIlllI[118]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[119]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[llIIIIlllI[1]];
                    iArr3[llIIIIlllI[0]] = llIIIIlllI[120];
                    TileObjects.getNearest(iArr3).interact(llIIIIIllI[llIIIIlllI[121]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIllIll(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[122]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[llIIIIlllI[1]];
                    strArr7[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[123]];
                    TileObjects.getNearest(strArr7).interact(llIIIIIllI[llIIIIlllI[124]]);
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            eA();
            "".length();
            if ((-" ".length()) > ((107 ^ 95) & ((14 ^ 58) ^ (-1)))) {
                return (174 ^ 147) & ((38 ^ 27) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIIlllI[186];
    }

    private static boolean lIlIIlIlIIlII(int i, int i2) {
        return i <= i2;
    }

    static {
        lIlIIlIIllIlI();
        lIlIIlIIIllIl();
        bv = new ArrayList();
        mT = llIIIIlllI[27];
        mU = llIIIIlllI[23];
        mW = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[0]);
        mX = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[1]);
        mY = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[2]);
        mZ = new WorldPoint(llIIIIlllI[239], llIIIIlllI[240], llIIIIlllI[0]);
    }

    private static String lIlIIIllIIIII(String llllllllllllllllllIllIIIIIllIlII, String llllllllllllllllllIllIIIIIllIIll) {
        try {
            SecretKeySpec llllllllllllllllllIllIIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIIIIllIIll.getBytes(StandardCharsets.UTF_8)), llIIIIlllI[24]), "DES");
            Cipher llllllllllllllllllIllIIIIIllIllI = Cipher.getInstance("DES");
            llllllllllllllllllIllIIIIIllIllI.init(llIIIIlllI[2], llllllllllllllllllIllIIIIIllIlll);
            return new String(llllllllllllllllllIllIIIIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIIIIIllIlIl) {
            llllllllllllllllllIllIIIIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void eD() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[9]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[127], llIIIIlllI[128], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[129], llIIIIlllI[127], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[2]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[130], llIIIIlllI[131], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[2]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[132], llIIIIlllI[133], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[134], llIIIIlllI[8], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[135], llIIIIlllI[136], llIIIIlllI[68], llIIIIlllI[53], llIIIIlllI[9]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[137], llIIIIlllI[138], llIIIIlllI[63], llIIIIlllI[64], llIIIIlllI[2]);
        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[137], llIIIIlllI[139], llIIIIlllI[0]);
        if (lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[44]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIIIIlllI[1]);
            "".length();
        }
        if (lIlIIlIIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[140]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIIIIlllI[1]);
                "".length();
            }
            if (lIlIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[5]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIIIIlllI[1]];
                strArr[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[141]];
                TileObjects.getNearest(strArr).interact(llIIIIIllI[llIIIIlllI[142]]);
                Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return ((9 ^ 92) ^ (60 ^ 109)) == "   ".length() ? ((75 ^ 41) ^ (244 ^ 156)) & (((69 ^ 67) ^ (50 ^ 62)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                }, llIIIIlllI[103]);
                "".length();
                Time.sleepTicks(llIIIIlllI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIIIIlllI[1]];
        strArr2[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[143]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlIIlIIllllI(nearest) && lIlIIlIIllIll(eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[144]];
            System.out.println(llIIIIIllI[llIIIIlllI[145]]);
            nearest.interact(llIIIIIllI[llIIIIlllI[146]]);
            Time.sleepTicks(llIIIIlllI[9]);
            "".length();
        }
        if (lIlIIlIIlllIl(eF() ? 1 : 0)) {
            if (lIlIIlIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[232]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[233], llIIIIlllI[131], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[147]];
                    nearest2.interact(llIIIIIllI[llIIIIlllI[148]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-" ".length()) >= " ".length() ? ((145 ^ 130) ^ (120 ^ 102)) & (("  ".length() ^ (97 ^ 110)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlIIlIIllIll(tileObject2.getName().contains(llIIIIIllI[llIIIIlllI[231]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[131], llIIIIlllI[224], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return !((true ^ true) ^ (true ^ true)) ? ((229 ^ 136) ^ (102 ^ 66)) & (((223 ^ 145) ^ (139 ^ 140)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest3)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[149]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIIIIIllI[llIIIIlllI[150]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return " ".length() == 0 ? ((((139 + 135) - 218) + 166) ^ (((64 + 53) - 48) + 64)) & (((141 ^ 180) ^ (77 ^ 47)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlIIlIIllIll(tileObject3.getName().contains(llIIIIIllI[llIIIIlllI[229]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[139], llIIIIlllI[230], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return "  ".length() == " ".length() ? true & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest4)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[151]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIIIIIllI[llIIIIlllI[152]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((240 ^ 137) ^ (70 ^ 23)) & (((232 ^ 198) ^ (108 ^ 106)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlIIlIIllIll(tileObject4.getName().contains(llIIIIIllI[llIIIIlllI[226]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[227], llIIIIlllI[228], llIIIIlllI[9])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return ((((72 + 82) - 148) + 162) ^ (((31 + 78) - 71) + 135)) <= 0 ? ((115 ^ 33) ^ (24 ^ 68)) & (((((63 + 72) - 58) + 62) ^ (((19 + 7) - 4) + 111)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest5)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[153]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIIIIIllI[llIIIIlllI[154]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlIIlIIllIll(tileObject5.getName().contains(llIIIIIllI[llIIIIlllI[225]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[8], llIIIIlllI[130], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return "  ".length() <= " ".length() ? ((93 ^ 97) ^ (232 ^ 183)) & (((((82 + 206) - 273) + 210) ^ (((6 + 29) - 22) + 117)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest6)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[155]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIIIIIllI[llIIIIlllI[156]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return " ".length() <= ((121 ^ 39) & ((35 ^ 125) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIlIIlIIllIll(tileObject6.getName().contains(llIIIIIllI[llIIIIlllI[223]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject6.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[224], llIIIIlllI[214], llIIIIlllI[9])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return (-" ".length()) >= "   ".length() ? ((((127 + 174) - 222) + 144) ^ (((28 + 55) - 51) + 103)) & (((120 ^ 94) ^ (114 ^ 12)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest7)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[157]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(llIIIIIllI[llIIIIlllI[158]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (178 ^ 182) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (!lIlIIlIIllIll(eF() ? 1 : 0) && lIlIIlIIllIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIlIIlIIllIll(tileObject7.getName().contains(llIIIIIllI[llIIIIlllI[220]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[221], llIIIIlllI[222], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return (-((236 ^ 155) ^ (26 ^ 105))) > 0 ? ((((32 + 136) - 120) + 99) ^ (((105 + 132) - 232) + 160)) & (((82 ^ 10) ^ (10 ^ 100)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest8)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[159]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(llIIIIIllI[llIIIIlllI[160]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-" ".length()) > " ".length() ? ((179 ^ 174) ^ (40 ^ 32)) & (((((22 + 12) - (-73)) + 46) ^ (((69 + 92) - 79) + 58)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIIlIlIIIlI(int i, int i2) {
        return i == i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIIIllI[llIIIIlllI[202]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean an() {
        if (lIlIIlIlIIIIl(Skills.getBoostedLevel(Skill.AGILITY), llIIIIlllI[37])) {
            int[] iArr = new int[llIIIIlllI[1]];
            iArr[llIIIIlllI[0]] = llIIIIlllI[12];
            if (lIlIIlIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIlllI[1]];
                iArr2[llIIIIlllI[0]] = llIIIIlllI[25];
                if (lIlIIlIIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIIIlllI[1]];
                    iArr3[llIIIIlllI[0]] = llIIIIlllI[23];
                    if (lIlIIlIIllIll(Inventory.contains(iArr3) ? 1 : 0) && ((!lIlIIlIIlllIl(Inventory.contains(item -> {
                        return item.getName().contains(llIIIIIllI[llIIIIlllI[206]]);
                    }) ? 1 : 0) || lIlIIlIIllIll(Equipment.contains(item2 -> {
                        return item2.getName().contains(llIIIIIllI[llIIIIlllI[205]]);
                    }) ? 1 : 0)) && (!lIlIIlIIlllIl(Inventory.contains(C0019f.bk) ? 1 : 0) || lIlIIlIIllIll(Equipment.contains(C0019f.bk) ? 1 : 0)))) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return llIIIIlllI[0];
        }
        int[] iArr4 = new int[llIIIIlllI[1]];
        iArr4[llIIIIlllI[0]] = llIIIIlllI[12];
        if (lIlIIlIIllIll(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[llIIIIlllI[1]];
            iArr5[llIIIIlllI[0]] = llIIIIlllI[14];
            if (lIlIIlIIllIll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIIlllI[1]];
                iArr6[llIIIIlllI[0]] = llIIIIlllI[13];
                if (lIlIIlIIllIll(Inventory.contains(iArr6) ? 1 : 0) && ((!lIlIIlIIlllIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(llIIIIIllI[llIIIIlllI[204]]);
                }) ? 1 : 0) || lIlIIlIIllIll(Equipment.contains(item4 -> {
                    return item4.getName().contains(llIIIIIllI[llIIIIlllI[203]]);
                }) ? 1 : 0)) && (!lIlIIlIIlllIl(Inventory.contains(C0019f.bk) ? 1 : 0) || lIlIIlIIllIll(Equipment.contains(C0019f.bk) ? 1 : 0)))) {
                    ?? r02 = llIIIIlllI[1];
                    "".length();
                    return ((((129 + 33) - 92) + 113) ^ (((94 + 81) - 144) + 148)) != ((94 ^ 85) ^ (32 ^ 47)) ? ((117 ^ 58) ^ (219 ^ 171)) & (((245 ^ 185) ^ (198 ^ 181)) ^ (-" ".length())) : r02;
                }
            }
        }
        return llIIIIlllI[0];
    }

    private static String lIlIIIlIllllI(String llllllllllllllllllIllIIIIIlIIlII, String llllllllllllllllllIllIIIIIlIIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIllIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIllIIIIIlIIIll.toCharArray();
        int llllllllllllllllllIllIIIIIlIIIII = llIIIIlllI[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllllIllIIIIIIllIIl = charArray2.length;
        int i = llIIIIlllI[0];
        while (lIlIIlIIlllII(i, llllllllllllllllllIllIIIIIIllIIl)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIllIIIIIlIIIII % charArray.length]));
            "".length();
            llllllllllllllllllIllIIIIIlIIIII++;
            i++;
            "".length();
            if ("   ".length() > (62 ^ 58)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), llIIIIlllI[185])) {
            ?? r0 = llIIIIlllI[1];
            "".length();
            return 0 != 0 ? ((((72 + 10) - 80) + 132) ^ (((108 + 147) - 72) + 9)) & (((174 ^ 146) ^ (35 ^ 89)) ^ (-" ".length())) : r0;
        }
        return llIIIIlllI[0];
    }

    private static boolean lIlIIlIlIIIII(int i) {
        return i > 0;
    }

    private static void lIlIIlIIllIlI() {
        llIIIIlllI = new int[242];
        llIIIIlllI[0] = ((16 ^ 49) ^ (83 ^ 73)) & (((47 ^ 48) ^ (57 ^ 29)) ^ (-" ".length()));
        llIIIIlllI[1] = " ".length();
        llIIIIlllI[2] = "  ".length();
        llIIIIlllI[3] = (-20497) & 23959;
        llIIIIlllI[4] = (-4123) & 7583;
        llIIIIlllI[5] = (((63 + 78) - 43) + 42) ^ (((30 + 18) - (-103)) + 27);
        llIIIIlllI[6] = 152 ^ 171;
        llIIIIlllI[7] = (-((-2363) & 19323)) & (-12294) & 32765;
        llIIIIlllI[8] = (-16999) & 20478;
        llIIIIlllI[9] = "   ".length();
        llIIIIlllI[10] = (-((-4630) & 31351)) & (-1025) & 32745;
        llIIIIlllI[11] = (175 ^ 142) ^ (176 ^ 155);
        llIIIIlllI[12] = (-((-22673) & 30897)) & (-16513) & 32743;
        llIIIIlllI[13] = (-129) & 8136;
        llIIIIlllI[14] = (-24743) & 32751;
        llIIIIlllI[15] = (-((-3661) & 7887)) & (-8241) & 16319;
        llIIIIlllI[16] = 165 ^ 161;
        llIIIIlllI[17] = (-((-18957) & 23358)) & (-3) & 16383;
        llIIIIlllI[18] = 156 ^ 153;
        llIIIIlllI[19] = (-18049) & 30673;
        llIIIIlllI[20] = (3 ^ 85) ^ (116 ^ 36);
        llIIIIlllI[21] = (-16433) & 24442;
        llIIIIlllI[22] = 132 ^ 131;
        llIIIIlllI[23] = (-((-6785) & 23229)) & (-3137) & 19965;
        llIIIIlllI[24] = 17 ^ 25;
        llIIIIlllI[25] = (-4105) & 23723;
        llIIIIlllI[26] = 109 ^ 100;
        llIIIIlllI[27] = (-((-16971) & 28523)) & (-5) & 32702;
        llIIIIlllI[28] = (-((-15442) & 32123)) & (-129) & 28669;
        llIIIIlllI[29] = (-20904) & 32759;
        llIIIIlllI[30] = (-20497) & 32350;
        llIIIIlllI[31] = (-20498) & 32349;
        llIIIIlllI[32] = (-16550) & 28407;
        llIIIIlllI[33] = (-20773) & 32622;
        llIIIIlllI[34] = (-((-28337) & 28605)) & (-16419) & 28654;
        llIIIIlllI[35] = 221 ^ 133;
        llIIIIlllI[36] = (-8257) & 28491;
        llIIIIlllI[37] = (((69 + 0) - (-51)) + 53) ^ (((116 + 4) - 106) + 119);
        llIIIIlllI[38] = (((108 + 91) - 197) + 160) ^ (((157 + 31) - 185) + 170);
        llIIIIlllI[39] = 184 ^ 138;
        llIIIIlllI[40] = 32 ^ 52;
        llIIIIlllI[41] = (161 ^ 180) ^ (67 ^ 79);
        llIIIIlllI[42] = 90 ^ 68;
        llIIIIlllI[43] = (-((-13366) & 31927)) & (-13393) & 32255;
        llIIIIlllI[44] = (109 ^ 39) ^ (52 ^ 66);
        llIIIIlllI[45] = (-((-5591) & 32223)) & (-5633) & 32571;
        llIIIIlllI[46] = (-((-487) & 22511)) & (-83) & 24575;
        llIIIIlllI[47] = (-16517) & 19951;
        llIIIIlllI[48] = (-12826) & 16249;
        llIIIIlllI[49] = 118 ^ 125;
        llIIIIlllI[50] = (-12801) & 16221;
        llIIIIlllI[51] = (-5647) & 8111;
        llIIIIlllI[52] = (-((-14161) & 30585)) & (-8705) & 28543;
        llIIIIlllI[53] = 57 ^ 55;
        llIIIIlllI[54] = (73 ^ 107) ^ (182 ^ 134);
        llIIIIlllI[55] = (-5129) & 7611;
        llIIIIlllI[56] = (-((-1377) & 26597)) & (-2) & 28637;
        llIIIIlllI[57] = (-((-6577) & 32697)) & (-69) & 28670;
        llIIIIlllI[58] = (-((-3417) & 20319)) & (-8321) & 28639;
        llIIIIlllI[59] = (-((-7601) & 16309)) & (-16385) & 27573;
        llIIIIlllI[60] = (-((-4353) & 29577)) & (-21) & 28671;
        llIIIIlllI[61] = 4 ^ 18;
        llIIIIlllI[62] = -" ".length();
        llIIIIlllI[63] = 81 ^ 93;
        llIIIIlllI[64] = (87 ^ 118) ^ (3 ^ 47);
        llIIIIlllI[65] = (40 ^ 15) ^ (70 ^ 113);
        llIIIIlllI[66] = (((52 + 124) - 94) + 63) ^ (((87 + 108) - 104) + 37);
        llIIIIlllI[67] = (1 ^ 118) ^ (112 ^ 20);
        llIIIIlllI[68] = (111 ^ 113) ^ (136 ^ 131);
        llIIIIlllI[69] = (105 ^ 69) ^ (25 ^ 34);
        llIIIIlllI[70] = (((122 + 83) - 131) + 113) ^ (((22 + 39) - 35) + 137);
        llIIIIlllI[71] = 187 ^ 161;
        llIIIIlllI[72] = (((154 + 166) - 193) + 89) ^ (((146 + 69) - 33) + 13);
        llIIIIlllI[73] = 2 ^ 30;
        llIIIIlllI[74] = 223 ^ 194;
        llIIIIlllI[75] = (-((-9849) & 26489)) & (-4737) & 24543;
        llIIIIlllI[76] = (-((-419) & 25571)) & (-4106) & 32607;
        llIIIIlllI[77] = (((98 ^ 108) + (32 ^ 54)) - (-" ".length())) + (110 ^ 10);
        llIIIIlllI[78] = 59 ^ 101;
        llIIIIlllI[79] = (-12617) & 15835;
        llIIIIlllI[80] = (-((-7897) & 24319)) & (-513) & 20343;
        llIIIIlllI[81] = (-((-7305) & 24252)) & (-321) & 20479;
        llIIIIlllI[82] = (-9090) & 12287;
        llIIIIlllI[83] = (-16906) & 20317;
        llIIIIlllI[84] = (-21258) & 24447;
        llIIIIlllI[85] = (-12809) & 16221;
        llIIIIlllI[86] = (-21153) & 24553;
        llIIIIlllI[87] = (-((-23907) & 24567)) & (-28673) & 32511;
        llIIIIlllI[88] = (-4609) & 7990;
        llIIIIlllI[89] = 183 ^ 168;
        llIIIIlllI[90] = (-((-19465) & 28495)) & (-16385) & 28631;
        llIIIIlllI[91] = (-((-1030) & 26303)) & (-3) & 28667;
        llIIIIlllI[92] = (-28930) & 32163;
        llIIIIlllI[93] = (-((-4377) & 20890)) & (-8229) & 28143;
        llIIIIlllI[94] = (-17070) & 20479;
        llIIIIlllI[95] = (-16456) & 19679;
        llIIIIlllI[96] = (((97 + 146) - 118) + 105) ^ (((52 + 49) - 56) + 153);
        llIIIIlllI[97] = 179 ^ 146;
        llIIIIlllI[98] = (18 ^ 23) ^ (99 ^ 68);
        llIIIIlllI[99] = 126 ^ 93;
        llIIIIlllI[100] = 33 ^ 5;
        llIIIIlllI[101] = 16 ^ 53;
        llIIIIlllI[102] = 56 ^ 30;
        llIIIIlllI[103] = (-((-1061) & 24103)) & (-73) & 31614;
        llIIIIlllI[104] = (((14 + 151) - (-1)) + 21) ^ (((65 + 61) - 70) + 100);
        llIIIIlllI[105] = 118 ^ 95;
        llIIIIlllI[106] = 161 ^ 139;
        llIIIIlllI[107] = (12 ^ 26) ^ (55 ^ 10);
        llIIIIlllI[108] = (((97 + 1) - (-52)) + 1) ^ (((183 + 130) - 250) + 124);
        llIIIIlllI[109] = (((100 + 2) - 22) + 74) ^ (((109 + 94) - 201) + 181);
        llIIIIlllI[110] = 165 ^ 139;
        llIIIIlllI[111] = (81 ^ 92) ^ (230 ^ 196);
        llIIIIlllI[112] = (64 ^ 89) ^ (173 ^ 132);
        llIIIIlllI[113] = (((72 + 133) - 119) + 66) ^ (((70 + 80) - 42) + 61);
        llIIIIlllI[114] = (-((-9638) & 26535)) & (-9) & 31739;
        llIIIIlllI[115] = 12 ^ 56;
        llIIIIlllI[116] = 157 ^ 168;
        llIIIIlllI[117] = (-1029) & 15863;
        llIIIIlllI[118] = 5 ^ 51;
        llIIIIlllI[119] = 182 ^ 129;
        llIIIIlllI[120] = (-9) & 14844;
        llIIIIlllI[121] = (134 ^ 149) ^ (130 ^ 169);
        llIIIIlllI[122] = (95 ^ 98) ^ (159 ^ 155);
        llIIIIlllI[123] = " ".length() ^ (79 ^ 116);
        llIIIIlllI[124] = (43 ^ 78) ^ (19 ^ 77);
        llIIIIlllI[125] = (-((-1159) & 1719)) & (-24577) & 28607;
        llIIIIlllI[126] = (-((-3406) & 20303)) & (-12325) & 32687;
        llIIIIlllI[127] = (-8706) & 12207;
        llIIIIlllI[128] = (-((-20355) & 28627)) & (-16389) & 28150;
        llIIIIlllI[129] = (-((-3075) & 31835)) & (-1) & 32255;
        llIIIIlllI[130] = (-24609) & 28091;
        llIIIIlllI[131] = (-((-2085) & 6711)) & (-24581) & 32703;
        llIIIIlllI[132] = (-4161) & 7632;
        llIIIIlllI[133] = (-((-9683) & 30679)) & (-81) & 24565;
        llIIIIlllI[134] = (-((-3251) & 23803)) & (-8709) & 32735;
        llIIIIlllI[135] = (-8225) & 11709;
        llIIIIlllI[136] = (-24629) & 28095;
        llIIIIlllI[137] = (-29253) & 32758;
        llIIIIlllI[138] = (-12897) & 16369;
        llIIIIlllI[139] = (-16417) & 19902;
        llIIIIlllI[140] = (((58 + 98) - 57) + 35) ^ (((59 + 150) - 114) + 92);
        llIIIIlllI[141] = 150 ^ 169;
        llIIIIlllI[142] = 53 ^ 117;
        llIIIIlllI[143] = (152 ^ 198) ^ (53 ^ 42);
        llIIIIlllI[144] = (((172 + 112) - 247) + 177) ^ (((97 + 10) - 39) + 80);
        llIIIIlllI[145] = (38 ^ 68) ^ (151 ^ 182);
        llIIIIlllI[146] = (221 ^ 179) ^ (125 ^ 87);
        llIIIIlllI[147] = 75 ^ 14;
        llIIIIlllI[148] = 204 ^ 138;
        llIIIIlllI[149] = 241 ^ 182;
        llIIIIlllI[150] = 8 ^ 64;
        llIIIIlllI[151] = 29 ^ 84;
        llIIIIlllI[152] = (((15 + 28) - (-133)) + 43) ^ (((61 + 22) - 5) + 67);
        llIIIIlllI[153] = 240 ^ 187;
        llIIIIlllI[154] = 199 ^ 139;
        llIIIIlllI[155] = 116 ^ 57;
        llIIIIlllI[156] = (((100 + 21) - 44) + 143) ^ (((54 + 25) - 53) + 120);
        llIIIIlllI[157] = (((173 + 155) - 210) + 117) ^ (((77 + 80) - 15) + 22);
        llIIIIlllI[158] = 223 ^ 143;
        llIIIIlllI[159] = (((79 + 26) - (-1)) + 94) ^ (((62 + 80) - 113) + 124);
        llIIIIlllI[160] = (((117 + 122) - 56) + 14) ^ (((48 + 108) - 46) + 41);
        llIIIIlllI[161] = (-((-5515) & 30091)) & (-1153) & 28415;
        llIIIIlllI[162] = (-514) & 3967;
        llIIIIlllI[163] = (-((-3733) & 32725)) & (-1025) & 32735;
        llIIIIlllI[164] = (-((-7301) & 31959)) & (-289) & 27647;
        llIIIIlllI[165] = (-((-913) & 14325)) & (-9) & 16127;
        llIIIIlllI[166] = (-4135) & 6831;
        llIIIIlllI[167] = (-((-6706) & 15221)) & (-20541) & 31743;
        llIIIIlllI[168] = (-((-18307) & 30711)) & (-16395) & 32255;
        llIIIIlllI[169] = (-(12 ^ 27)) & (-12353) & 15103;
        llIIIIlllI[170] = (-((-369) & 29559)) & (-89) & 32766;
        llIIIIlllI[171] = (124 ^ 39) ^ (88 ^ 80);
        llIIIIlllI[172] = 17 ^ 69;
        llIIIIlllI[173] = 255 ^ 170;
        llIIIIlllI[174] = 42 ^ 124;
        llIIIIlllI[175] = (21 ^ 62) ^ (104 ^ 20);
        llIIIIlllI[176] = (214 ^ 194) ^ (94 ^ 19);
        llIIIIlllI[177] = 19 ^ 73;
        llIIIIlllI[178] = 98 ^ 57;
        llIIIIlllI[179] = (((142 + 68) - 55) + 4) ^ (((182 + 71) - 153) + 95);
        llIIIIlllI[180] = 115 ^ 46;
        llIIIIlllI[181] = (100 ^ 44) ^ (73 ^ 94);
        llIIIIlllI[182] = 207 ^ 175;
        llIIIIlllI[183] = (((67 + 83) - 108) + 118) ^ (((160 + 181) - 270) + 122);
        llIIIIlllI[184] = 232 ^ 138;
        llIIIIlllI[185] = (191 ^ 195) ^ (49 ^ 46);
        llIIIIlllI[186] = (14 ^ 122) ^ (74 ^ 90);
        llIIIIlllI[187] = 164 ^ 193;
        llIIIIlllI[188] = (-((-20053) & 32477)) & (-16385) & 31999;
        llIIIIlllI[189] = (-8866) & 12279;
        llIIIIlllI[190] = (-((-28011) & 32123)) & (-24962) & 32255;
        llIIIIlllI[191] = (-4229) & 7615;
        llIIIIlllI[192] = (-4387) & 16235;
        llIIIIlllI[193] = (((19 + 179) - 194) + 237) ^ (((115 + 76) - 111) + 71);
        llIIIIlllI[194] = (-((-20759) & 21271)) & (-24579) & 30590;
        llIIIIlllI[195] = (-((-4899) & 8035)) & (-518) & 28653;
        llIIIIlllI[196] = (-18482) & 19381;
        llIIIIlllI[197] = (-28738) & 29687;
        llIIIIlllI[198] = (-((-1687) & 16119)) & (-1) & 16382;
        llIIIIlllI[199] = (-6410) & 15359;
        llIIIIlllI[200] = (-((-11789) & 12062)) & (-20513) & 32763;
        llIIIIlllI[201] = (-((-25165) & 27341)) & (-514) & 28639;
        llIIIIlllI[202] = (250 ^ 193) ^ (202 ^ 150);
        llIIIIlllI[203] = 214 ^ 190;
        llIIIIlllI[204] = (5 ^ 119) ^ (178 ^ 169);
        llIIIIlllI[205] = (40 ^ 105) ^ (171 ^ 128);
        llIIIIlllI[206] = 82 ^ 57;
        llIIIIlllI[207] = (((59 + 171) - 161) + 146) ^ (((7 + 44) - (-78)) + 58);
        llIIIIlllI[208] = (-((-2767) & 8191)) & (-1) & 8127;
        llIIIIlllI[209] = (-51) & 3515;
        llIIIIlllI[210] = 213 ^ 184;
        llIIIIlllI[211] = (-(25 ^ 58)) & (-4161) & 7663;
        llIIIIlllI[212] = 120 ^ 22;
        llIIIIlllI[213] = (-12385) & 15095;
        llIIIIlllI[214] = (-586) & 4061;
        llIIIIlllI[215] = 110 ^ 1;
        llIIIIlllI[216] = (-16417) & 19126;
        llIIIIlllI[217] = 66 ^ 50;
        llIIIIlllI[218] = (-4417) & 7137;
        llIIIIlllI[219] = (-25107) & 28599;
        llIIIIlllI[220] = 101 ^ 20;
        llIIIIlllI[221] = (-((-8343) & 29399)) & (-8193) & 32758;
        llIIIIlllI[222] = (-((-3249) & 31921)) & (-514) & 32669;
        llIIIIlllI[223] = (172 ^ 178) ^ (69 ^ 41);
        llIIIIlllI[224] = (-4689) & 8191;
        llIIIIlllI[225] = (32 ^ 104) ^ (155 ^ 160);
        llIIIIlllI[226] = (11 ^ 95) ^ (99 ^ 67);
        llIIIIlllI[227] = (-((-2071) & 6783)) & (-8193) & 16382;
        llIIIIlllI[228] = (-((-9633) & 10171)) & (-28737) & 32766;
        llIIIIlllI[229] = (((140 + 32) - 118) + 175) ^ (((108 + 81) - 67) + 22);
        llIIIIlllI[230] = (-((-3091) & 19539)) & (-8197) & 28143;
        llIIIIlllI[231] = 55 ^ 65;
        llIIIIlllI[232] = (10 ^ 110) ^ (72 ^ 91);
        llIIIIlllI[233] = (-28685) & 32189;
        llIIIIlllI[234] = 220 ^ 164;
        llIIIIlllI[235] = (-((-17853) & 30141)) & (-9) & 14783;
        llIIIIlllI[236] = (-((-7035) & 31611)) & (-665) & 28671;
        llIIIIlllI[237] = 201 ^ 176;
        llIIIIlllI[238] = (-((-8481) & 28987)) & (-8258) & 31231;
        llIIIIlllI[239] = (-21585) & 24058;
        llIIIIlllI[240] = (-((-333) & 21343)) & (-1) & 24447;
        llIIIIlllI[241] = 19 ^ 105;
    }

    private static void eE() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[9]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[163], llIIIIlllI[133], llIIIIlllI[64], llIIIIlllI[11], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[164], llIIIIlllI[139], llIIIIlllI[38], llIIIIlllI[53], llIIIIlllI[2]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[165], llIIIIlllI[134], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[166], llIIIIlllI[136], llIIIIlllI[70], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[167], llIIIIlllI[168], llIIIIlllI[54], llIIIIlllI[63], llIIIIlllI[2]);
        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[169], llIIIIlllI[170], llIIIIlllI[0]);
        if (lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[171]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIIIIlllI[1]);
            "".length();
        }
        if (lIlIIlIIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[172]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIIIIlllI[1]);
                "".length();
            }
            if (lIlIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[173]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIIIIlllI[1]];
                strArr[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[174]];
                TileObjects.getNearest(strArr).interact(llIIIIIllI[llIIIIlllI[175]]);
                Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                }, llIIIIlllI[103]);
                "".length();
                Time.sleepTicks(llIIIIlllI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIIIIlllI[1]];
        strArr2[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[35]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIlIIlIIllllI(nearest) && lIlIIlIIllIll(eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[176]];
            System.out.println(llIIIIIllI[llIIIIlllI[177]]);
            nearest.interact(llIIIIIllI[llIIIIlllI[178]]);
            Time.sleepTicks(llIIIIlllI[9]);
            "".length();
        }
        if (lIlIIlIIlllIl(eF() ? 1 : 0)) {
            if (lIlIIlIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[217]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[218], llIIIIlllI[219], llIIIIlllI[9])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[179]];
                    nearest2.interact(llIIIIIllI[llIIIIlllI[180]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-" ".length()) > 0 ? ((249 ^ 186) ^ (127 ^ 14)) & (((((91 + 13) - 27) + 84) ^ (((12 + 14) - 24) + 145)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIlIIlIIllIll(tileObject2.getName().contains(llIIIIIllI[llIIIIlllI[215]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[216], llIIIIlllI[128], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest3)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[78]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIIIIIllI[llIIIIlllI[181]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((19 ^ 35) ^ (104 ^ 75)) & (((76 ^ 54) ^ (122 ^ 19)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIlIIlIIllIll(tileObject3.getName().contains(llIIIIIllI[llIIIIlllI[212]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[213], llIIIIlllI[214], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest4)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[182]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIIIIIllI[llIIIIlllI[183]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (lIlIIlIIllIll(eF() ? 1 : 0)) {
                return;
            }
            if (lIlIIlIIllIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIlIIlIIllIll(tileObject4.getName().contains(llIIIIIllI[llIIIIlllI[210]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[208], llIIIIlllI[211], llIIIIlllI[9])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return (-((126 ^ 104) ^ (10 ^ 24))) >= 0 ? ((((55 + 90) - 107) + 119) ^ (((60 + 30) - (-22)) + 29)) & (((187 ^ 175) ^ (78 ^ 74)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest5)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[184]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIIIIIllI[llIIIIlllI[185]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return 0 != 0 ? ((145 ^ 189) ^ (184 ^ 183)) & (((13 ^ 105) ^ (95 ^ 24)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
            if (!lIlIIlIIllIll(eF() ? 1 : 0) && lIlIIlIIllIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIlIIlIIllIll(tileObject5.getName().contains(llIIIIIllI[llIIIIlllI[207]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[208], llIIIIlllI[209], llIIIIlllI[2])), llIIIIlllI[2])) {
                        ?? r0 = llIIIIlllI[1];
                        "".length();
                        return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest6)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[186]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIIIIIllI[llIIIIlllI[187]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[1], llIIIIlllI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIlIIlIIlllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return (((91 ^ 48) ^ (131 ^ 161)) & (((((118 + 152) - 207) + 134) ^ (((38 + 57) - 93) + 138)) ^ (-" ".length()))) != 0 ? ((146 ^ 192) ^ (66 ^ 2)) & (((((52 + 47) - 22) + 53) ^ (((51 + 95) - 88) + 86)) ^ (-" ".length())) : r0;
                        }
                        return llIIIIlllI[0];
                    }, llIIIIlllI[103]);
                    "".length();
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIIlIIlllII(int i, int i2) {
        return i < i2;
    }

    private static void eB() {
        new WorldArea(llIIIIlllI[46], llIIIIlllI[47], llIIIIlllI[11], llIIIIlllI[20], llIIIIlllI[0]);
        WorldArea worldArea = new WorldArea(llIIIIlllI[46], llIIIIlllI[48], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[46], llIIIIlllI[50], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[51], llIIIIlllI[52], llIIIIlllI[53], llIIIIlllI[54], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[55], llIIIIlllI[56], llIIIIlllI[24], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[57], llIIIIlllI[58], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[0]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[59], llIIIIlllI[60], llIIIIlllI[11], llIIIIlllI[20], llIIIIlllI[0]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[46], llIIIIlllI[47], llIIIIlllI[61], llIIIIlllI[20], llIIIIlllI[0]);
        if (lIlIIlIIlllIl(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[11]];
            C0018e.b(mZ);
            Time.sleepTicks(llIIIIlllI[1]);
            "".length();
        }
        if (!(lIlIIlIIlllIl(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIlllIl(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIIlIIllIll(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIIlIlIIIlI(Players.getLocal().getAnimation(), llIIIIlllI[62]) && lIlIIlIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIlIIlIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[49]];
                String[] strArr = new String[llIIIIlllI[1]];
                strArr[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[63]];
                TileObjects.getNearest(strArr).interact(llIIIIIllI[llIIIIlllI[64]]);
                Time.sleepTicks(llIIIIlllI[2]);
                "".length();
            }
            if (lIlIIlIIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[53]];
                String[] strArr2 = new String[llIIIIlllI[1]];
                strArr2[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[38]];
                TileObjects.getNearest(strArr2).interact(llIIIIIllI[llIIIIlllI[65]]);
                Time.sleepTicks(llIIIIlllI[2]);
                "".length();
            }
            if (lIlIIlIIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[66]];
                String[] strArr3 = new String[llIIIIlllI[1]];
                strArr3[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[54]];
                TileObjects.getNearest(strArr3).interact(llIIIIIllI[llIIIIlllI[67]]);
                Time.sleepTicks(llIIIIlllI[2]);
                "".length();
            }
            if (lIlIIlIIllIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[40]];
                String[] strArr4 = new String[llIIIIlllI[1]];
                strArr4[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[68]];
                TileObjects.getNearest(strArr4).interact(llIIIIIllI[llIIIIlllI[61]]);
                Time.sleepTicks(llIIIIlllI[18]);
                "".length();
            }
            if (lIlIIlIIllIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[69]];
                String[] strArr5 = new String[llIIIIlllI[1]];
                strArr5[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[70]];
                TileObjects.getNearest(strArr5).interact(llIIIIIllI[llIIIIlllI[41]]);
                Time.sleepTicks(llIIIIlllI[16]);
                "".length();
            }
            if (lIlIIlIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[71]];
                String[] strArr6 = new String[llIIIIlllI[1]];
                strArr6[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[72]];
                TileObjects.getNearest(strArr6).interact(llIIIIIllI[llIIIIlllI[73]]);
                Time.sleepTicks(llIIIIlllI[9]);
                "".length();
            }
            if (lIlIIlIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[74]];
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[234]]) ? 1 : 0) && lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[235], llIIIIlllI[236], llIIIIlllI[0])), llIIIIlllI[2])) {
                        String[] strArr7 = new String[llIIIIlllI[1]];
                        strArr7[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[237]];
                        if (lIlIIlIIllIll(tileObject.hasAction(strArr7) ? 1 : 0)) {
                            ?? r0 = llIIIIlllI[1];
                            "".length();
                            return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIIIIlllI[0];
                });
                if (lIlIIlIIllllI(nearest)) {
                    nearest.interact(llIIIIIllI[llIIIIlllI[42]]);
                    Time.sleepTicks(C0018e.c(llIIIIlllI[9], llIIIIlllI[16]));
                    "".length();
                }
                if (lIlIIlIlIIIll(nearest)) {
                    C0018e.D();
                }
            }
        }
    }

    private static boolean lIlIIlIIllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[79], llIIIIlllI[80], llIIIIlllI[69], llIIIIlllI[64], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[81], llIIIIlllI[80], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[82], llIIIIlllI[83], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[9]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[188], llIIIIlllI[189], llIIIIlllI[24], llIIIIlllI[18], llIIIIlllI[1]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[84], llIIIIlllI[86], llIIIIlllI[11], llIIIIlllI[24], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[190], llIIIIlllI[191], llIIIIlllI[73], llIIIIlllI[38], llIIIIlllI[9]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[90], llIIIIlllI[91], llIIIIlllI[66], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[92], llIIIIlllI[93], llIIIIlllI[22], llIIIIlllI[26], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[92], llIIIIlllI[94], llIIIIlllI[11], llIIIIlllI[22], llIIIIlllI[9]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[127], llIIIIlllI[128], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[129], llIIIIlllI[127], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[2]);
        WorldArea worldArea12 = new WorldArea(llIIIIlllI[130], llIIIIlllI[131], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[2]);
        WorldArea worldArea13 = new WorldArea(llIIIIlllI[132], llIIIIlllI[133], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea14 = new WorldArea(llIIIIlllI[134], llIIIIlllI[8], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea15 = new WorldArea(llIIIIlllI[135], llIIIIlllI[136], llIIIIlllI[68], llIIIIlllI[53], llIIIIlllI[9]);
        WorldArea worldArea16 = new WorldArea(llIIIIlllI[137], llIIIIlllI[138], llIIIIlllI[63], llIIIIlllI[64], llIIIIlllI[2]);
        WorldArea worldArea17 = new WorldArea(llIIIIlllI[163], llIIIIlllI[133], llIIIIlllI[64], llIIIIlllI[11], llIIIIlllI[9]);
        WorldArea worldArea18 = new WorldArea(llIIIIlllI[164], llIIIIlllI[139], llIIIIlllI[38], llIIIIlllI[53], llIIIIlllI[2]);
        WorldArea worldArea19 = new WorldArea(llIIIIlllI[165], llIIIIlllI[134], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea20 = new WorldArea(llIIIIlllI[166], llIIIIlllI[136], llIIIIlllI[70], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea21 = new WorldArea(llIIIIlllI[167], llIIIIlllI[168], llIIIIlllI[54], llIIIIlllI[63], llIIIIlllI[2]);
        WorldArea[] worldAreaArr = new WorldArea[llIIIIlllI[68]];
        worldAreaArr[llIIIIlllI[0]] = worldArea;
        worldAreaArr[llIIIIlllI[1]] = worldArea2;
        worldAreaArr[llIIIIlllI[2]] = worldArea3;
        worldAreaArr[llIIIIlllI[9]] = worldArea4;
        worldAreaArr[llIIIIlllI[16]] = worldArea5;
        worldAreaArr[llIIIIlllI[18]] = worldArea6;
        worldAreaArr[llIIIIlllI[20]] = worldArea7;
        worldAreaArr[llIIIIlllI[22]] = worldArea8;
        worldAreaArr[llIIIIlllI[24]] = worldArea9;
        worldAreaArr[llIIIIlllI[26]] = worldArea10;
        worldAreaArr[llIIIIlllI[11]] = worldArea11;
        worldAreaArr[llIIIIlllI[49]] = worldArea12;
        worldAreaArr[llIIIIlllI[63]] = worldArea13;
        worldAreaArr[llIIIIlllI[64]] = worldArea14;
        worldAreaArr[llIIIIlllI[53]] = worldArea15;
        worldAreaArr[llIIIIlllI[38]] = worldArea16;
        worldAreaArr[llIIIIlllI[65]] = worldArea17;
        worldAreaArr[llIIIIlllI[66]] = worldArea18;
        worldAreaArr[llIIIIlllI[54]] = worldArea19;
        worldAreaArr[llIIIIlllI[67]] = worldArea20;
        worldAreaArr[llIIIIlllI[40]] = worldArea21;
        int[] iArr = new int[llIIIIlllI[1]];
        iArr[llIIIIlllI[0]] = llIIIIlllI[192];
        if (lIlIIlIIllllI(TileItems.getNearest(iArr))) {
            System.out.println(llIIIIIllI[llIIIIlllI[193]]);
            int i = llIIIIlllI[0];
            while (lIlIIlIIlllII(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[llIIIIlllI[1]];
                iArr2[llIIIIlllI[0]] = llIIIIlllI[192];
                if (lIlIIlIIllIll(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIlIIlIIllIll(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIIIIlllI[1];
                }
                i++;
                "".length();
                if ("   ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIIIIlllI[0];
    }

    private static boolean lIlIIlIIlllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIlIIllIll(int i) {
        return i != 0;
    }

    private static String lIlIIIlIlllll(String llllllllllllllllllIllIIIIlIIIIIl, String llllllllllllllllllIllIIIIlIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIIIIIllllIl) {
            llllllllllllllllllIllIIIIIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v212, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v256, types: [boolean] */
    public static void eA() {
        if (lIlIIlIIllIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[0]];
            C0015b.a(bv);
            if (lIlIIlIIlllII(bv.size(), llIIIIlllI[1])) {
                System.out.println(llIIIIIllI[llIIIIlllI[1]]);
                bt = llIIIIlllI[0];
            }
        }
        if (lIlIIlIIlllIl(bt ? 1 : 0)) {
            if (lIlIIlIIlllIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIllllI(nearest) && lIlIIlIIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[2]];
                    if (lIlIIlIIllIll(new WorldArea(llIIIIlllI[3], llIIIIlllI[4], llIIIIlllI[5], llIIIIlllI[6], llIIIIlllI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[7], llIIIIlllI[8], llIIIIlllI[0]);
                        if (lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIlllI[9])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIIIIlllI[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIlIIlIIllllI(nearest) && lIlIIlIIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[9]];
                    if (lIlIIlIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIlllI[10]);
                        "".length();
                    }
                    if (lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIlllI[1]);
                            "".length();
                        }
                        if (lIlIIlIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIlllI[2]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[llIIIIlllI[11]];
                    iArr[llIIIIlllI[0]] = llIIIIlllI[12];
                    iArr[llIIIIlllI[1]] = llIIIIlllI[13];
                    iArr[llIIIIlllI[2]] = llIIIIlllI[14];
                    iArr[llIIIIlllI[9]] = llIIIIlllI[15];
                    iArr[llIIIIlllI[16]] = llIIIIlllI[17];
                    iArr[llIIIIlllI[18]] = llIIIIlllI[19];
                    iArr[llIIIIlllI[20]] = llIIIIlllI[21];
                    iArr[llIIIIlllI[22]] = llIIIIlllI[23];
                    iArr[llIIIIlllI[24]] = llIIIIlllI[25];
                    iArr[llIIIIlllI[26]] = llIIIIlllI[27];
                    if (lIlIIlIIlllIl(C0018e.c(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(llIIIIIllI[llIIIIlllI[16]]);
                        bt = llIIIIlllI[1];
                        return;
                    }
                    int[] iArr2 = new int[llIIIIlllI[11]];
                    iArr2[llIIIIlllI[0]] = llIIIIlllI[12];
                    iArr2[llIIIIlllI[1]] = llIIIIlllI[13];
                    iArr2[llIIIIlllI[2]] = llIIIIlllI[14];
                    iArr2[llIIIIlllI[9]] = llIIIIlllI[15];
                    iArr2[llIIIIlllI[16]] = llIIIIlllI[17];
                    iArr2[llIIIIlllI[18]] = llIIIIlllI[19];
                    iArr2[llIIIIlllI[20]] = llIIIIlllI[21];
                    iArr2[llIIIIlllI[22]] = llIIIIlllI[23];
                    iArr2[llIIIIlllI[24]] = llIIIIlllI[25];
                    iArr2[llIIIIlllI[26]] = llIIIIlllI[27];
                    if (lIlIIlIIllIll(C0018e.c(iArr2) ? 1 : 0)) {
                        C0000a.a(llIIIIlllI[28], llIIIIlllI[1]);
                        C0000a.a(llIIIIlllI[29], llIIIIlllI[1]);
                        C0000a.a(llIIIIlllI[30], llIIIIlllI[1]);
                        C0000a.a(llIIIIlllI[31], llIIIIlllI[1]);
                        C0000a.a(llIIIIlllI[32], llIIIIlllI[1]);
                        C0000a.a(llIIIIlllI[33], llIIIIlllI[1]);
                        C0000a.a(llIIIIlllI[34], llIIIIlllI[1]);
                        int[] iArr3 = new int[llIIIIlllI[1]];
                        iArr3[llIIIIlllI[0]] = llIIIIlllI[28];
                        if (lIlIIlIIlllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIIlllI[1]];
                            iArr4[llIIIIlllI[0]] = llIIIIlllI[28];
                            if (lIlIIlIIlllIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIIIIlllI[1]];
                                iArr5[llIIIIlllI[0]] = llIIIIlllI[28];
                                if (lIlIIlIIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(llIIIIlllI[35], llIIIIlllI[1]);
                                }
                            }
                        }
                        C0000a.a(llIIIIlllI[17], llIIIIlllI[1]);
                        C0018e.l(llIIIIlllI[28]);
                        C0018e.l(llIIIIlllI[29]);
                        C0018e.l(llIIIIlllI[30]);
                        C0018e.l(llIIIIlllI[31]);
                        C0018e.l(llIIIIlllI[32]);
                        Time.sleepTicks(llIIIIlllI[1]);
                        "".length();
                        C0018e.l(llIIIIlllI[34]);
                        C0018e.l(llIIIIlllI[36]);
                        C0018e.l(llIIIIlllI[33]);
                        C0018e.l(llIIIIlllI[35]);
                        C0018e.l(llIIIIlllI[17]);
                        Time.sleepTicks(llIIIIlllI[9]);
                        "".length();
                        if (lIlIIlIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIIIIlllI[20]);
                            "".length();
                        }
                        if (lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (lIlIIlIIlllII(Skills.getLevel(Skill.AGILITY), llIIIIlllI[37])) {
                                C0000a.a(llIIIIlllI[12], llIIIIlllI[11]);
                                C0000a.a(llIIIIlllI[13], llIIIIlllI[11]);
                                C0000a.a(llIIIIlllI[21], llIIIIlllI[11]);
                                C0000a.a(llIIIIlllI[14], llIIIIlllI[11]);
                                C0000a.b(C0019f.bk, llIIIIlllI[1]);
                                C0000a.a(llIIIIlllI[27], llIIIIlllI[1]);
                                C0000a.a(llIIIIlllI[19], llIIIIlllI[18]);
                                C0000a.a(llIIIIlllI[23], llIIIIlllI[38]);
                            }
                            if (lIlIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), llIIIIlllI[37])) {
                                C0000a.a(llIIIIlllI[12], llIIIIlllI[11]);
                                C0000a.a(llIIIIlllI[21], llIIIIlllI[11]);
                                C0000a.a(llIIIIlllI[25], llIIIIlllI[11]);
                                C0000a.b(C0019f.bk, llIIIIlllI[1]);
                                C0000a.a(llIIIIlllI[27], llIIIIlllI[1]);
                                C0000a.a(llIIIIlllI[19], llIIIIlllI[24]);
                                C0000a.a(llIIIIlllI[23], llIIIIlllI[11]);
                            }
                        }
                    }
                }
            }
            if (lIlIIlIIllIll(an() ? 1 : 0)) {
                String[] strArr = new String[llIIIIlllI[1]];
                strArr[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[18]];
                if (lIlIIlIIllIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIIIlllI[1]];
                    strArr2[llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[20]];
                    Inventory.getFirst(strArr2).interact(llIIIIIllI[llIIIIlllI[22]]);
                }
                if (lIlIIlIIllIll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIlIIlllII(Movement.getRunEnergy(), llIIIIlllI[39])) {
                    Inventory.getFirst(C0019f.ba).interact(llIIIIIllI[llIIIIlllI[24]]);
                    Time.sleepTicks(llIIIIlllI[1]);
                    "".length();
                }
                if (lIlIIlIIlllll(Combat.getMissingHealth(), llIIIIlllI[40])) {
                    int[] iArr6 = new int[llIIIIlllI[1]];
                    iArr6[llIIIIlllI[0]] = llIIIIlllI[23];
                    if (lIlIIlIIllIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIIIlllI[1]];
                        iArr7[llIIIIlllI[0]] = llIIIIlllI[23];
                        Inventory.getFirst(iArr7).interact(llIIIIIllI[llIIIIlllI[26]]);
                        Time.sleepTicks(llIIIIlllI[2]);
                        "".length();
                    }
                }
                if (lIlIIlIIlllll(Movement.getRunEnergy(), llIIIIlllI[41]) && lIlIIlIIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIlIIlIIlllII(Skills.getLevel(Skill.AGILITY), llIIIIlllI[42])) {
                    eB();
                }
                if ((!lIlIIlIlIIIIl(C0018e.j(llIIIIlllI[43]), llIIIIlllI[44]) || lIlIIlIIlllII(C0018e.j(llIIIIlllI[45]), llIIIIlllI[18])) && lIlIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), llIIIIlllI[42]) && lIlIIlIIlllII(Skills.getLevel(Skill.AGILITY), llIIIIlllI[44])) {
                    eC();
                }
                if (lIlIIlIlIIIIl(C0018e.j(llIIIIlllI[43]), llIIIIlllI[44]) && lIlIIlIlIIIIl(C0018e.j(llIIIIlllI[45]), llIIIIlllI[18])) {
                    if (lIlIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), llIIIIlllI[42]) && lIlIIlIIlllII(Skills.getLevel(Skill.AGILITY), llIIIIlllI[37])) {
                        eC();
                    }
                    if (lIlIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), llIIIIlllI[37]) && lIlIIlIIlllII(Skills.getLevel(Skill.AGILITY), llIIIIlllI[44])) {
                        eD();
                    }
                }
                if (lIlIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), llIIIIlllI[44])) {
                    eE();
                }
            }
        }
    }

    private static void lIlIIlIIIllIl() {
        llIIIIIllI = new String[llIIIIlllI[241]];
        llIIIIIllI[llIIIIlllI[0]] = lIlIIIlIllllI("FxEoHicyRDgDLDgX", "UdQwI");
        llIIIIIllI[llIIIIlllI[1]] = lIlIIIlIllllI("LjoMAQoANgZIGx0qCwYeSDoWDRQbf0IbDgEnAQAQBjRCChgLOEIcFkgyBQEVAScb", "hSbhy");
        llIIIIIllI[llIIIIlllI[2]] = lIlIIIlIllllI("OhMmEw0VBjkUDVQGP1oIFRw7", "trPzj");
        llIIIIIllI[llIIIIlllI[9]] = lIlIIIlIlllll("pdFPo70duFp8c+wAnyEXpFBGFPz4N1cZ", "FCTSZ");
        llIIIIIllI[llIIIIlllI[16]] = lIlIIIlIllllI("OxJRJRsJVxwtGh8eHyNJHQIUNx1MBAQ0GQAeFDdFTAQGLR0PHxgqDkwDHmQrOS44Ci4=", "lwqDi");
        llIIIIIllI[llIIIIlllI[18]] = lIlIIIlIllllI("DDoLKQ==", "ZSjEC");
        llIIIIIllI[llIIIIlllI[20]] = lIlIIIllIIIII("0hVDOk0O7rk=", "DcCRv");
        llIIIIIllI[llIIIIlllI[22]] = lIlIIIlIlllll("tQ6hmYCWkfU=", "CucZC");
        llIIIIIllI[llIIIIlllI[24]] = lIlIIIllIIIII("w14IbOJZ2r8=", "ioutw");
        llIIIIIllI[llIIIIlllI[26]] = lIlIIIlIlllll("FzXC8gBqgUA=", "hgWts");
        llIIIIIllI[llIIIIlllI[11]] = lIlIIIlIlllll("51PJxI3khnxGhzwHHZOf0E4svHP/1EF4", "MscCe");
        llIIIIIllI[llIIIIlllI[49]] = lIlIIIllIIIII("g/gxIzWPASto86KORlaYaw==", "YICRU");
        llIIIIIllI[llIIIIlllI[63]] = lIlIIIlIllllI("LiApcwQDIy89BQc=", "bONSf");
        llIIIIIllI[llIIIIlllI[64]] = lIlIIIllIIIII("5YTJk1fs6i1Zl5Shsdoepw==", "iAfqP");
        llIIIIIllI[llIIIIlllI[53]] = lIlIIIlIllllI("JwMlKCANAStlLAEb", "doLEB");
        llIIIIIllI[llIIIIlllI[38]] = lIlIIIllIIIII("7AaxTO+1ikRsfl39vzOZlg==", "edcMi");
        llIIIIIllI[llIIIIlllI[65]] = lIlIIIllIIIII("O70I7HCf42Ot+uG/BF+dWg==", "MPJZn");
        llIIIIIllI[llIIIIlllI[66]] = lIlIIIlIllllI("MgAmCy0YAihGLQMNIQUn", "qlOfO");
        llIIIIIllI[llIIIIlllI[54]] = lIlIIIllIIIII("6PmzCAnYpz78Tffw9cmeXg==", "ZjLRc");
        llIIIIIllI[llIIIIlllI[67]] = lIlIIIlIllllI("MxQrOg4=", "pxBWl");
        llIIIIIllI[llIIIIlllI[40]] = lIlIIIllIIIII("JpgDwqq8O3l8+bh+1vCnGg==", "VFgzO");
        llIIIIIllI[llIIIIlllI[68]] = lIlIIIlIlllll("MyS/vaaTfOde4+1GexoU1A==", "vudVH");
        llIIIIIllI[llIIIIlllI[61]] = lIlIIIlIllllI("MSMgAWsJLA==", "fBLjF");
        llIIIIIllI[llIIIIlllI[69]] = lIlIIIlIllllI("Gh44HiAwHDZTJjYFPw==", "YrQsB");
        llIIIIIllI[llIIIIlllI[70]] = lIlIIIllIIIII("vDkbW7ybteyzIPsXYOo7GA==", "wLtuE");
        llIIIIIllI[llIIIIlllI[41]] = lIlIIIllIIIII("eFbnlaIt/F2/lj+Rv5Pq5g==", "GfBdi");
        llIIIIIllI[llIIIIlllI[71]] = lIlIIIlIlllll("GwmuVUohA0vfyrXbI893yg==", "COHAQ");
        llIIIIIllI[llIIIIlllI[72]] = lIlIIIlIlllll("v7HZe/HDslxre4qqWmHsAA==", "VpblA");
        llIIIIIllI[llIIIIlllI[73]] = lIlIIIlIllllI("BR84LChrHCckOA==", "FsQAJ");
        llIIIIIllI[llIIIIlllI[74]] = lIlIIIlIlllll("0oLR6fuhUqOpz5hu+RdwTQ==", "tpFHM");
        llIIIIIllI[llIIIIlllI[42]] = lIlIIIllIIIII("oNIUXHIY13G6s5ROTuYggQ==", "rzBxh");
        llIIIIIllI[llIIIIlllI[89]] = lIlIIIlIllllI("PBYEZRodVwExDwAD", "rwrEn");
        llIIIIIllI[llIIIIlllI[96]] = lIlIIIlIllllI("BBcmBXAmEHQJIigVMQ==", "IvTnP");
        llIIIIIllI[llIIIIlllI[97]] = lIlIIIlIllllI("Aw8tOiIwTisyPjw=", "WnFSL");
        llIIIIIllI[llIIIIlllI[98]] = lIlIIIlIlllll("7CmY3FxTzpCkIlYRWligqWT18kPhWN9r", "rooSR");
        llIIIIIllI[llIIIIlllI[99]] = lIlIIIllIIIII("XcjoHh7+sJ4=", "FITAT");
        llIIIIIllI[llIIIIlllI[100]] = lIlIIIlIllllI("EgU3NAcoHzFmEC4EJDUW", "AqVFs");
        llIIIIIllI[llIIIIlllI[101]] = lIlIIIllIIIII("hCtN/hV8rVQHAnE5tnpMkQ==", "fBGEa");
        llIIIIIllI[llIIIIlllI[102]] = lIlIIIlIllllI("BSoKGzQ=", "FFcvV");
        llIIIIIllI[llIIIIlllI[104]] = lIlIIIllIIIII("Gq1A3Vj5dfp8mbSBQQc2HnTwQ4se3KNq", "nWVTT");
        llIIIIIllI[llIIIIlllI[37]] = lIlIIIllIIIII("DZIgamKoqSw4/G4m/9eHUA==", "LUvUz");
        llIIIIIllI[llIIIIlllI[105]] = lIlIIIlIllllI("GjsGPzU=", "YIiLF");
        llIIIIIllI[llIIIIlllI[106]] = lIlIIIllIIIII("W2WX0qrTNus=", "mGhJT");
        llIIIIIllI[llIIIIlllI[107]] = lIlIIIllIIIII("SZlJn+0btLg=", "QLxew");
        llIIIIIllI[llIIIIlllI[108]] = lIlIIIlIllllI("BxElJg==", "KtDVa");
        llIIIIIllI[llIIIIlllI[109]] = lIlIIIllIIIII("HA2aFVpa62yxMhrJ18aw6A==", "HAnXb");
        llIIIIIllI[llIIIIlllI[110]] = lIlIIIllIIIII("Lrjg9aQ9zvI=", "IfmVB");
        llIIIIIllI[llIIIIlllI[111]] = lIlIIIllIIIII("BgZr68ie8mU=", "xCzmO");
        llIIIIIllI[llIIIIlllI[112]] = lIlIIIlIlllll("s2YDN2/ka4ThqAMFvYF09g==", "GtfwP");
        llIIIIIllI[llIIIIlllI[113]] = lIlIIIllIIIII("+uGqRxzofZc=", "HKPUs");
        llIIIIIllI[llIIIIlllI[39]] = lIlIIIlIlllll("03dwW0sACgY=", "qpmOJ");
        llIIIIIllI[llIIIIlllI[6]] = lIlIIIlIlllll("t2BZPVv2s108maNcuXEbMQ==", "GbNUD");
        llIIIIIllI[llIIIIlllI[115]] = lIlIIIlIllllI("Kg0kPg==", "fhENJ");
        llIIIIIllI[llIIIIlllI[116]] = lIlIIIllIIIII("wXC+s1gvR07yi7P+4IED7g==", "nuvwv");
        llIIIIIllI[llIIIIlllI[118]] = lIlIIIllIIIII("jbluLFsZhx0=", "mRNao");
        llIIIIIllI[llIIIIlllI[119]] = lIlIIIlIlllll("qszbR4ZsjRLpNqv/AR2zoQ==", "fivja");
        llIIIIIllI[llIIIIlllI[121]] = lIlIIIlIllllI("JBMRMgoJ", "lfcVf");
        llIIIIIllI[llIIIIlllI[122]] = lIlIIIllIIIII("XwlSpeXWWfzOVAj0NwCithu7qYQHERtP", "yFMhJ");
        llIIIIIllI[llIIIIlllI[123]] = lIlIIIlIllllI("MBE9Aw==", "uuZfZ");
        llIIIIIllI[llIIIIlllI[124]] = lIlIIIlIlllll("iuAnI3NkSgoVMOK7pwXDEA==", "emIcx");
        llIIIIIllI[llIIIIlllI[44]] = lIlIIIllIIIII("nHttawpWZM8PjcRw6LoRtCNlnszvB5Nq", "FNZPw");
        llIIIIIllI[llIIIIlllI[140]] = lIlIIIlIllllI("GDAVaj05cRA+KCQl", "VQcJI");
        llIIIIIllI[llIIIIlllI[5]] = lIlIIIlIllllI("ES4KGBArNAxKBy0vGRkB", "BZkjd");
        llIIIIIllI[llIIIIlllI[141]] = lIlIIIllIIIII("xpgSq7GGOcARXKVOWQq0YA==", "vqFRf");
        llIIIIIllI[llIIIIlllI[142]] = lIlIIIlIlllll("A4UqKC3/oEw=", "CSdpa");
        llIIIIIllI[llIIIIlllI[143]] = lIlIIIlIlllll("/0tl7ruqbcB8QV7xvSjXyA==", "pcIbL");
        llIIIIIllI[llIIIIlllI[144]] = lIlIIIlIllllI("LAsEMwAfSgI7HBM=", "xjoZn");
        llIIIIIllI[llIIIIlllI[145]] = lIlIIIllIIIII("QM8WeC2ftPB+AixuF4t5Dod/CzMagQWP", "MMVuE");
        llIIIIIllI[llIIIIlllI[146]] = lIlIIIlIllllI("HBcfJg==", "HvtCE");
        llIIIIIllI[llIIIIlllI[147]] = lIlIIIlIlllll("tzATchbeyRM5FRal4T4p0w==", "tgrVS");
        llIIIIIllI[llIIIIlllI[148]] = lIlIIIlIlllll("HMp5cSVyiJ4=", "BGeGZ");
        llIIIIIllI[llIIIIlllI[149]] = lIlIIIlIllllI("JR4cEQwBDFEGBB9LQw==", "okqae");
        llIIIIIllI[llIIIIlllI[150]] = lIlIIIlIlllll("AXb42Hj7gEc=", "gCycs");
        llIIIIIllI[llIIIIlllI[151]] = lIlIIIllIIIII("Dl8/WJql2zKlCBG/FiPmEA==", "fSuqM");
        llIIIIIllI[llIIIIlllI[152]] = lIlIIIlIllllI("Lg0BJw==", "dxlWf");
        llIIIIIllI[llIIIIlllI[153]] = lIlIIIlIllllI("LS8pGSQJPWQOLBd6cA==", "gZDiM");
        llIIIIIllI[llIIIIlllI[154]] = lIlIIIlIlllll("6BXgxDAZUoM=", "bjoCO");
        llIIIIIllI[llIIIIlllI[155]] = lIlIIIlIlllll("us4bNOkUlocpwwcFzXX4xw==", "pLqVJ");
        llIIIIIllI[llIIIIlllI[156]] = lIlIIIlIllllI("LxIfLTc=", "ysjAC");
        llIIIIIllI[llIIIIlllI[157]] = lIlIIIllIIIII("fizUxKlIu5PndqiaTvHkBQ==", "jZZap");
        llIIIIIllI[llIIIIlllI[158]] = lIlIIIlIllllI("KzQXEQ==", "aAzaY");
        llIIIIIllI[llIIIIlllI[159]] = lIlIIIlIlllll("XJhMmwrKTb/JY3VAmPj6VA==", "tbOPW");
        llIIIIIllI[llIIIIlllI[160]] = lIlIIIllIIIII("i8xbMzodeOM=", "gyQnW");
        llIIIIIllI[llIIIIlllI[171]] = lIlIIIlIlllll("qX6hscQX+uX2pCAmPP83zRDCK3ZcOJe2", "zQeOq");
        llIIIIIllI[llIIIIlllI[172]] = lIlIIIllIIIII("kmwaBasmXzb8+/nCgMzZnw==", "HKPLU");
        llIIIIIllI[llIIIIlllI[173]] = lIlIIIlIlllll("n61msczHI/EvQgIZdf1MiQ==", "doNvD");
        llIIIIIllI[llIIIIlllI[174]] = lIlIIIllIIIII("3X17rhzMRrA=", "aQmLw");
        llIIIIIllI[llIIIIlllI[175]] = lIlIIIlIlllll("LlZ2cQaBLyfkmUCVR+x9ZA==", "ClFhg");
        llIIIIIllI[llIIIIlllI[35]] = lIlIIIlIllllI("AzY2KlMhMWQmAS80IQ==", "NWDAs");
        llIIIIIllI[llIIIIlllI[176]] = lIlIIIllIIIII("TDvLjZ3LR88+uwGPCwkBKA==", "nuBzJ");
        llIIIIIllI[llIIIIlllI[177]] = lIlIIIlIllllI("Ej8SKTR0PQY1O3Q/CWc3Jj8SKTQ=", "TPgGP");
        llIIIIIllI[llIIIIlllI[178]] = lIlIIIlIlllll("oq6Q6FA+JHY=", "pXNsx");
        llIIIIIllI[llIIIIlllI[179]] = lIlIIIlIlllll("iKCMej5r/wqTX2CZw5F/+w==", "ZkUlh");
        llIIIIIllI[llIIIIlllI[180]] = lIlIIIlIllllI("IAUFOA==", "jphHu");
        llIIIIIllI[llIIIIlllI[78]] = lIlIIIlIllllI("IQcCJzViBwIkIw==", "BumTF");
        llIIIIIllI[llIIIIlllI[181]] = lIlIIIlIllllI("ByEWCx0=", "DSyxn");
        llIIIIIllI[llIIIIlllI[182]] = lIlIIIlIllllI("PCIjOicYMG4tLwZ3fQ==", "vWNJN");
        llIIIIIllI[llIIIIlllI[183]] = lIlIIIllIIIII("0BIRLiPUkfc=", "cHwFI");
        llIIIIIllI[llIIIIlllI[184]] = lIlIIIlIlllll("OZOVhejZAlf+53Fxn8zzJw==", "SHwlW");
        llIIIIIllI[llIIIIlllI[185]] = lIlIIIlIllllI("LyUiOg==", "ePOJL");
        llIIIIIllI[llIIIIlllI[186]] = lIlIIIlIllllI("JCUMNAIAN0EBDwk1", "nPaDk");
        llIIIIIllI[llIIIIlllI[187]] = lIlIIIlIllllI("JgEmOw==", "ltKKy");
        llIIIIIllI[llIIIIlllI[193]] = lIlIIIlIllllI("CyQSHghtJgYCB20kCVALPyQSHgg=", "MKgpl");
        llIIIIIllI[llIIIIlllI[202]] = lIlIIIlIllllI("MhcdGwEHCQ==", "sptwh");
        llIIIIIllI[llIIIIlllI[203]] = lIlIIIllIIIII("6hHu9cvwk+4=", "QDrHr");
        llIIIIIllI[llIIIIlllI[204]] = lIlIIIlIllllI("CC8XBDYfKw==", "xNdwW");
        llIIIIIllI[llIIIIlllI[205]] = lIlIIIllIIIII("lFNgYYFVbnE=", "JRRIe");
        llIIIIIllI[llIIIIlllI[206]] = lIlIIIlIlllll("gR6/N8ixdQA=", "hnplR");
        llIIIIIllI[llIIIIlllI[207]] = lIlIIIllIIIII("VSiHJE9MBC8=", "yPNOv");
        llIIIIIllI[llIIIIlllI[210]] = lIlIIIlIllllI("JgQU", "aedeJ");
        llIIIIIllI[llIIIIlllI[212]] = lIlIIIlIlllll("TsxlPOH68KQ=", "wDSgj");
        llIIIIIllI[llIIIIlllI[215]] = lIlIIIllIIIII("T9ZEX76PNDfF0aBHKzqDzw==", "rvSxp");
        llIIIIIllI[llIIIIlllI[217]] = lIlIIIllIIIII("FyNHxPMZtLw=", "dkcyl");
        llIIIIIllI[llIIIIlllI[220]] = lIlIIIlIlllll("SOIklNMExNU=", "zixcz");
        llIIIIIllI[llIIIIlllI[223]] = lIlIIIlIllllI("EgUg", "UdPpw");
        llIIIIIllI[llIIIIlllI[225]] = lIlIIIllIIIII("nHhXGjcl4ndA5OYiQ2yLfw==", "ufwBP");
        llIIIIIllI[llIIIIlllI[226]] = lIlIIIlIlllll("mpTUnsVvSiM=", "qGtzH");
        llIIIIIllI[llIIIIlllI[229]] = lIlIIIllIIIII("0Hnu18gj6mY=", "YqRbb");
        llIIIIIllI[llIIIIlllI[231]] = lIlIIIlIlllll("m/jGdRi2i4c=", "yUjte");
        llIIIIIllI[llIIIIlllI[232]] = lIlIIIllIIIII("hBtUskPqCI4=", "nMUWq");
        llIIIIIllI[llIIIIlllI[234]] = lIlIIIllIIIII("VEfP/CvIET4=", "xixDM");
        llIIIIIllI[llIIIIlllI[237]] = lIlIIIllIIIII("6UwQVCDKOUPaosiWcjXzcw==", "qbKwe");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIlIIlIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.av.llIIIIlllI[11]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIlIIlIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.av.llIIIIlllI[11]) != false) goto L43;
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
        int[] iArr4 = new int[llIIIIlllI[1]];
        iArr4[llIIIIlllI[0]] = llIIIIlllI[15];
        if (lIlIIlIIlllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[15], llIIIIlllI[1], llIIIIlllI[194]));
            "".length();
        }
        int[] iArr5 = new int[llIIIIlllI[1]];
        iArr5[llIIIIlllI[0]] = llIIIIlllI[17];
        if (lIlIIlIIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[17], llIIIIlllI[2], llIIIIlllI[195]));
            "".length();
        }
        int[] iArr6 = new int[llIIIIlllI[1]];
        iArr6[llIIIIlllI[0]] = llIIIIlllI[27];
        if (lIlIIlIIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[27], llIIIIlllI[2], llIIIIlllI[195]));
            "".length();
        }
        int[] iArr7 = new int[llIIIIlllI[1]];
        iArr7[llIIIIlllI[0]] = llIIIIlllI[12];
        if (lIlIIlIIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[12], llIIIIlllI[11], llIIIIlllI[196]));
            "".length();
        }
        int[] iArr8 = new int[llIIIIlllI[1]];
        iArr8[llIIIIlllI[0]] = llIIIIlllI[21];
        if (lIlIIlIIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[21], llIIIIlllI[11], llIIIIlllI[197]));
            "".length();
        }
        int[] iArr9 = new int[llIIIIlllI[1]];
        iArr9[llIIIIlllI[0]] = llIIIIlllI[14];
        if (lIlIIlIIlllIl(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[14], llIIIIlllI[11], llIIIIlllI[197]));
            "".length();
        }
        int[] iArr10 = new int[llIIIIlllI[1]];
        iArr10[llIIIIlllI[0]] = llIIIIlllI[13];
        if (lIlIIlIIlllIl(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlllI[13], llIIIIlllI[11], llIIIIlllI[197]));
            "".length();
        }
        int[] iArr11 = new int[llIIIIlllI[1]];
        iArr11[llIIIIlllI[0]] = llIIIIlllI[23];
        if (lIlIIlIIllIll(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llIIIIlllI[1]];
            iArr12[llIIIIlllI[0]] = llIIIIlllI[23];
            if (lIlIIlIIllIll(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIIIIlllI[1]];
                iArr13[llIIIIlllI[0]] = llIIIIlllI[23];
            }
            iArr = new int[llIIIIlllI[1]];
            iArr[llIIIIlllI[0]] = llIIIIlllI[25];
            if (lIlIIlIIllIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIIlllI[1]];
                iArr14[llIIIIlllI[0]] = llIIIIlllI[25];
                if (lIlIIlIIllIll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIIIlllI[1]];
                    iArr15[llIIIIlllI[0]] = llIIIIlllI[25];
                }
                iArr2 = new int[llIIIIlllI[1]];
                iArr2[llIIIIlllI[0]] = llIIIIlllI[200];
                if (lIlIIlIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(llIIIIlllI[200], llIIIIlllI[1], llIIIIlllI[201]));
                    "".length();
                }
                iArr3 = new int[llIIIIlllI[1]];
                iArr3[llIIIIlllI[0]] = llIIIIlllI[19];
                if (lIlIIlIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(llIIIIlllI[19], llIIIIlllI[40], C0023j.cf));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIIIIlllI[25], llIIIIlllI[11], llIIIIlllI[199]));
            "".length();
            iArr2 = new int[llIIIIlllI[1]];
            iArr2[llIIIIlllI[0]] = llIIIIlllI[200];
            if (lIlIIlIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIIIIlllI[1]];
            iArr3[llIIIIlllI[0]] = llIIIIlllI[19];
            if (lIlIIlIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(mU, llIIIIlllI[44], llIIIIlllI[198]));
        "".length();
        iArr = new int[llIIIIlllI[1]];
        iArr[llIIIIlllI[0]] = llIIIIlllI[25];
        if (lIlIIlIIllIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIIlllI[25], llIIIIlllI[11], llIIIIlllI[199]));
        "".length();
        iArr2 = new int[llIIIIlllI[1]];
        iArr2[llIIIIlllI[0]] = llIIIIlllI[200];
        if (lIlIIlIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIIIlllI[1]];
        iArr3[llIIIIlllI[0]] = llIIIIlllI[19];
        if (lIlIIlIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }
}

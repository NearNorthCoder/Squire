package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Completing Witchs Potion")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.C  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/C.class */
public class C extends Task {
    private static /* synthetic */ int[] lIIIllIlIIIII;
    private static /* synthetic */ String[] lIIIllIIlllll;
    private final /* synthetic */ SquireQuesterConfig bA;

    private static boolean lIlIIIlIIllIIll(Object obj) {
        return obj == null;
    }

    private static void lIlIIIlIIlIlllI() {
        lIIIllIlIIIII = new int[43];
        lIIIllIlIIIII[0] = "  ".length() & ("  ".length() ^ (-1));
        lIIIllIlIIIII[1] = "   ".length();
        lIIIllIlIIIII[2] = " ".length();
        lIIIllIlIIIII[3] = (-12291) & 15258;
        lIIIllIlIIIII[4] = (-29009) & 32214;
        lIIIllIlIIIII[5] = (-((-17265) & 31730)) & (-577) & 15341;
        lIIIllIlIIIII[6] = (-18449) & 23067;
        lIIIllIlIIIII[7] = (-5153) & 8118;
        lIIIllIlIIIII[8] = (-29185) & 32389;
        lIIIllIlIIIII[9] = 83 ^ 85;
        lIIIllIlIIIII[10] = "  ".length();
        lIIIllIlIIIII[11] = 113 ^ 117;
        lIIIllIlIIIII[12] = 72 ^ 77;
        lIIIllIlIIIII[13] = (-((-16759) & 20855)) & (-24673) & 31726;
        lIIIllIlIIIII[14] = (-((-10539) & 31547)) & (-33) & 24243;
        lIIIllIlIIIII[15] = (((((140 + 31) - 164) + 156) + (51 ^ 125)) - (176 ^ 135)) + (140 ^ 175);
        lIIIllIlIIIII[16] = (-12299) & 14255;
        lIIIllIlIIIII[17] = (-24966) & 27111;
        lIIIllIlIIIII[18] = (-((-17413) & 27853)) & (-7) & 16351;
        lIIIllIlIIIII[19] = (((124 + 73) - 183) + 140) ^ (((32 + 62) - 18) + 81);
        lIIIllIlIIIII[20] = (-17457) & 20470;
        lIIIllIlIIIII[21] = (-8453) & 11710;
        lIIIllIlIIIII[22] = (-25) & 1019;
        lIIIllIlIIIII[23] = (-((-23937) & 24557)) & (-28673) & 32383;
        lIIIllIlIIIII[24] = (-4371) & 7615;
        lIIIllIlIIIII[25] = (214 ^ 187) ^ (77 ^ 40);
        lIIIllIlIIIII[26] = 113 ^ 120;
        lIIIllIlIIIII[27] = (-22017) & 24150;
        lIIIllIlIIIII[28] = (-5121) & 7262;
        lIIIllIlIIIII[29] = (23 ^ 34) ^ (13 ^ 74);
        lIIIllIlIIIII[30] = (-16981) & 20191;
        lIIIllIlIIIII[31] = (-((-17987) & 30579)) & (-16961) & 32767;
        lIIIllIlIIIII[32] = 29 ^ 23;
        lIIIllIlIIIII[33] = (34 ^ 94) ^ (36 ^ 83);
        lIIIllIlIIIII[34] = (103 ^ 70) ^ (75 ^ 102);
        lIIIllIlIIIII[35] = (-((-18739) & 23475)) & (-262) & 8191;
        lIIIllIlIIIII[36] = (-21202) & 24567;
        lIIIllIlIIIII[37] = (((131 + 97) - 123) + 97) ^ (((119 + 86) - 131) + 125);
        lIIIllIlIIIII[38] = (-16513) & 19701;
        lIIIllIlIIIII[39] = (-8237) & 11503;
        lIIIllIlIIIII[40] = 14 ^ 0;
        lIIIllIlIIIII[41] = (164 ^ 158) ^ (62 ^ 11);
        lIIIllIlIIIII[42] = (((146 + 94) - 106) + 54) ^ (((122 + 14) - 132) + 168);
    }

    static {
        lIlIIIlIIlIlllI();
        lIlIIIlIIlIllIl();
    }

    private void cJ() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (lIlIIIlIIlIllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIIIII[2]];
        iArr2[lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        if (lIlIIIlIIlIllll(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIlIIIII[2]];
            iArr3[lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            if (lIlIIIlIIlIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr4 = new int[lIIIllIlIIIII[2]];
        iArr4[lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
            return;
        }
        int[] iArr5 = new int[lIIIllIlIIIII[2]];
        iArr5[lIIIllIlIIIII[0]] = lIIIllIlIIIII[29];
        TileObject nearest = TileObjects.getNearest(iArr5);
        if (!lIlIIIlIIllIIlI(nearest) || !lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIIIII[30], lIIIllIlIIIII[31], lIIIllIlIIIII[0]));
            "".length();
            return;
        }
        int[] iArr6 = new int[lIIIllIlIIIII[2]];
        iArr6[lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIIllIlIIIII[2]];
            iArr7[lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
            Inventory.getFirst(iArr7).useOn(nearest);
            return;
        }
        int[] iArr8 = new int[lIIIllIlIIIII[2]];
        iArr8[lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIIllIlIIIII[2]];
            iArr9[lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            Inventory.getFirst(iArr9).useOn(nearest);
            "".length();
            if (0 != 0) {
            }
        }
    }

    private static boolean lIlIIIlIIllIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIlIIllIIII(int i, int i2) {
        return i >= i2;
    }

    @Inject
    public C(SquireQuesterConfig squireQuesterConfig) {
        this.bA = squireQuesterConfig;
    }

    private static boolean lIlIIIlIIlIllll(int i) {
        return i == 0;
    }

    private void cI() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[15];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIIIII[2]];
        iArr2[lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIlIIIII[2]];
            iArr3[lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
            if (!lIlIIIlIIlIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                System.out.println(lIIIllIIlllll[lIIIllIlIIIII[9]]);
                if (lIlIIIlIIllIIIl(Shop.isOpen() ? 1 : 0)) {
                    Shop.buyOne(lIIIllIlIIIII[15]);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                }
                int[] iArr4 = new int[lIIIllIlIIIII[2]];
                iArr4[lIIIllIlIIIII[0]] = lIIIllIlIIIII[18];
                NPC nearest = NPCs.getNearest(iArr4);
                if (!lIlIIIlIIllIIlI(nearest) || !lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
                    Walker.walkTo(new WorldPoint(lIIIllIlIIIII[20], lIIIllIlIIIII[21], lIIIllIlIIIII[0]));
                    "".length();
                    return;
                }
                nearest.interact(lIIIllIIlllll[lIIIllIlIIIII[19]]);
                "".length();
                if ((((((113 + 95) - (-3)) + 15) ^ (((97 + 42) - 84) + 114)) & (((80 ^ 44) ^ (151 ^ 160)) ^ (-" ".length()))) != 0) {
                    return;
                }
                return;
            }
        }
        System.out.println(lIIIllIIlllll[lIIIllIlIIIII[12]]);
    }

    private void cF() {
        if (lIlIIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlIIIII[2]];
        strArr[lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (!lIlIIIlIIllIIlI(nearest) || !lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIIIII[3], lIIIllIlIIIII[4], lIIIllIlIIIII[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIlllll[lIIIllIlIIIII[2]]);
        "".length();
        if ("   ".length() == (-" ".length())) {
        }
    }

    private static boolean lIlIIIlIIllIIlI(Object obj) {
        return obj != null;
    }

    private static String lIlIIIlIIlIlIlI(String lllllllllllllllIIIIlIIllIlIllIIl, String lllllllllllllllIIIIlIIllIlIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIllIlIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIllIlIllIII.getBytes(StandardCharsets.UTF_8)), lIIIllIlIIIII[25]), "DES");
            Cipher lllllllllllllllIIIIlIIllIlIllIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIllIlIllIll.init(lIIIllIlIIIII[10], lllllllllllllllIIIIlIIllIlIlllII);
            return new String(lllllllllllllllIIIIlIIllIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIllIlIllIlI) {
            lllllllllllllllIIIIlIIllIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIlIIlIlIll(String lllllllllllllllIIIIlIIllIllIIllI, String lllllllllllllllIIIIlIIllIllIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIllIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIllIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIllIllIlIII.init(lIIIllIlIIIII[10], secretKeySpec);
            return new String(lllllllllllllllIIIIlIIllIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIllIllIIlll) {
            lllllllllllllllIIIIlIIllIllIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIlIIlIllII(String lllllllllllllllIIIIlIIllIlIIlIIl, String lllllllllllllllIIIIlIIllIlIIlIII) {
        String lllllllllllllllIIIIlIIllIlIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIIllIlIIlIII.toCharArray();
        int lllllllllllllllIIIIlIIllIlIIIlIl = lIIIllIlIIIII[0];
        char[] charArray2 = lllllllllllllllIIIIlIIllIlIIlIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIlIIIII[0];
        while (lIlIIIlIIllIlIl(i, length)) {
            char lllllllllllllllIIIIlIIllIlIIlIlI = charArray2[i];
            sb.append((char) (lllllllllllllllIIIIlIIllIlIIlIlI ^ charArray[lllllllllllllllIIIIlIIllIlIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIIllIlIIIlIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private void cL() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIIIII[2]];
        iArr2[lIIIllIlIIIII[0]] = lIIIllIlIIIII[36];
        TileObject nearest = TileObjects.getNearest(iArr2);
        if (!lIlIIIlIIllIIlI(nearest) || !lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIIIII[38], lIIIllIlIIIII[39], lIIIllIlIIIII[0]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIlllll[lIIIllIlIIIII[37]]);
        "".length();
        if ("   ".length() < ((138 ^ 192) & ((78 ^ 4) ^ (-1)))) {
        }
    }

    private static boolean lIlIIIlIIllIIIl(int i) {
        return i != 0;
    }

    private void cK() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (lIlIIIlIIlIllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIIIII[2]];
        iArr2[lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
        if (lIlIIIlIIlIllll(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIlIIIII[2]];
            iArr3[lIIIllIlIIIII[0]] = lIIIllIlIIIII[28];
            if (lIlIIIlIIlIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIllIlIIIII[2]];
                iArr4[lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
                if (lIlIIIlIIllIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                    return;
                }
                String[] strArr = new String[lIIIllIlIIIII[2]];
                strArr[lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[32]];
                NPC nearest = NPCs.getNearest(strArr);
                int[] iArr5 = new int[lIIIllIlIIIII[2]];
                iArr5[lIIIllIlIIIII[0]] = lIIIllIlIIIII[27];
                TileItem nearest2 = TileItems.getNearest(iArr5);
                if (lIlIIIlIIllIIlI(nearest2) && lIlIIIlIIllIIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                    nearest2.interact(lIIIllIIlllll[lIIIllIlIIIII[33]]);
                } else if (lIlIIIlIIllIIlI(nearest) && lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0) && lIlIIIlIIllIIll(Players.getLocal().getInteracting())) {
                    nearest.interact(lIIIllIIlllll[lIIIllIlIIIII[34]]);
                } else if (lIlIIIlIIllIIll(nearest)) {
                    Walker.walkTo(new WorldPoint(lIIIllIlIIIII[35], lIIIllIlIIIII[4], lIIIllIlIIIII[0]));
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    public boolean run() {
        if (lIlIIIlIIlIllll(this.bA.quest().equals(h.WITCHS_POTION) ? 1 : 0)) {
            return lIIIllIlIIIII[0];
        }
        int Q = Q();
        if (lIlIIIlIIllIIII(Q, lIIIllIlIIIII[1])) {
            return lIIIllIlIIIII[0];
        }
        System.out.println("[WITCHS_POTION] - Current Progress: " + Q);
        switch (Q) {
            case 0:
                N();
                M();
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((215 ^ 147) ^ (200 ^ 165)) & (((118 ^ 121) ^ (119 ^ 81)) ^ (-" ".length()));
                }
                break;
            case 1:
                cH();
                cG();
                "".length();
                if ((-" ".length()) < (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 2:
                cF();
                P();
                "".length();
                if ((((((122 + 79) - 117) + 122) ^ (((17 + 71) - 81) + 123)) & (((((175 + 74) - 212) + 162) ^ (((122 + 96) - 144) + 65)) ^ (-" ".length()))) <= (-" ".length())) {
                    return ((((8 + 21) - (-125)) + 8) ^ (((11 + 104) - 63) + 87)) & (((230 ^ 149) ^ (155 ^ 193)) ^ (-" ".length()));
                }
                break;
            default:
                return lIIIllIlIIIII[0];
        }
        return lIIIllIlIIIII[2];
    }

    private void cH() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String[] strArr = new String[lIIIllIlIIIII[2]];
        strArr[lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[10]];
        NPC nearest = NPCs.getNearest(strArr);
        int[] iArr2 = new int[lIIIllIlIIIII[2]];
        iArr2[lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        TileItem nearest2 = TileItems.getNearest(iArr2);
        if (lIlIIIlIIllIIlI(nearest2) && lIlIIIlIIllIIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
            nearest2.interact(lIIIllIIlllll[lIIIllIlIIIII[1]]);
        } else if (lIlIIIlIIllIIlI(nearest) && lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0) && lIlIIIlIIllIIll(Players.getLocal().getInteracting())) {
            nearest.interact(lIIIllIIlllll[lIIIllIlIIIII[11]]);
        } else if (lIlIIIlIIllIIll(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIIIII[13], lIIIllIlIIIII[14], lIIIllIlIIIII[0]));
            "".length();
        }
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIlIIllIIlI(nearest) || !lIlIIIlIIllIIIl(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIIlllll[lIIIllIlIIIII[41]]);
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIllIIlllll[lIIIllIlIIIII[40]]);
        "".length();
        if (0 != 0) {
        }
    }

    private void cG() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[5];
        if (lIlIIIlIIlIllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int i = lIIIllIlIIIII[6];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIIIII[7], lIIIllIlIIIII[8], lIIIllIlIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIIIII[9]];
        dialogOptionArr[lIIIllIlIIIII[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[11]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[12]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }

    private void N() {
        cL();
        cK();
        cJ();
        Z();
        cI();
    }

    private static boolean lIlIIIlIIllIlII(int i, int i2) {
        return i == i2;
    }

    private int Q() {
        return Vars.getVarp(EnumC0000a.QUEST_WITCHS_POTION.c());
    }

    private static void lIlIIIlIIlIllIl() {
        lIIIllIIlllll = new String[lIIIllIlIIIII[42]];
        lIIIllIIlllll[lIIIllIlIIIII[0]] = lIlIIIlIIlIlIlI("Krhl3lK8bIq9f0sXhBFF2g==", "OvkpU");
        lIIIllIIlllll[lIIIllIlIIIII[2]] = lIlIIIlIIlIlIll("iwj4sy77iU7dNU6MJ3Hb/A==", "AsUIH");
        lIIIllIIlllll[lIIIllIlIIIII[10]] = lIlIIIlIIlIlIll("EtjOu3OB4TE=", "DmsqW");
        lIIIllIIlllll[lIIIllIlIIIII[1]] = lIlIIIlIIlIllII("BS4oAw==", "QOCfx");
        lIIIllIIlllll[lIIIllIlIIIII[11]] = lIlIIIlIIlIllII("JCEFJA4O", "eUqEm");
        lIIIllIIlllll[lIIIllIlIIIII[12]] = lIlIIIlIIlIlIll("K4EQVK8bIUFPC8nCBD8GVQ==", "LsWXK");
        lIIIllIIlllll[lIIIllIlIIIII[9]] = lIlIIIlIIlIlIlI("2uVCOIHILij8clebFwBrLH9PKe4Pf55F", "RfeZQ");
        lIIIllIIlllll[lIIIllIlIIIII[19]] = lIlIIIlIIlIlIlI("HLH7RV22Zqs=", "EyAvw");
        lIIIllIIlllll[lIIIllIlIIIII[25]] = lIlIIIlIIlIlIlI("rMPvvGxpX4kq7xVpq0jlCw==", "uoNXg");
        lIIIllIIlllll[lIIIllIlIIIII[26]] = lIlIIIlIIlIllII("BhMaEQ==", "Drtzb");
        lIIIllIIlllll[lIIIllIlIIIII[32]] = lIlIIIlIIlIlIll("qFTy9w4E70rAJxFhG/2kTA==", "GwCjy");
        lIIIllIIlllll[lIIIllIlIIIII[33]] = lIlIIIlIIlIlIlI("3UlBDCQDKAg=", "ihtVx");
        lIIIllIIlllll[lIIIllIlIIIII[34]] = lIlIIIlIIlIlIlI("tq3mCch9DB4=", "BgUsC");
        lIIIllIIlllll[lIIIllIlIIIII[37]] = lIlIIIlIIlIlIll("oBJTXfwv79g=", "CvfgS");
        lIIIllIIlllll[lIIIllIlIIIII[40]] = lIlIIIlIIlIllII("IA4HE2IAAA==", "tokxO");
        lIIIllIIlllll[lIIIllIlIIIII[41]] = lIlIIIlIIlIlIlI("fsX0WX37FlMB3p6j9PACDg==", "WkKMv");
    }

    private void P() {
        if (lIlIIIlIIllIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    private void Z() {
        int[] iArr = new int[lIIIllIlIIIII[2]];
        iArr[lIIIllIlIIIII[0]] = lIIIllIlIIIII[15];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIlIIIII[2]];
        iArr2[lIIIllIlIIIII[0]] = lIIIllIlIIIII[16];
        if (lIlIIIlIIlIllll(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIIllIlIIIII[2]];
            iArr3[lIIIllIlIIIII[0]] = lIIIllIlIIIII[17];
            if (lIlIIIlIIlIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr4 = new int[lIIIllIlIIIII[2]];
        iArr4[lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
        if (lIlIIIlIIllIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
            ?? r0 = lIIIllIlIIIII[2];
            int[] iArr5 = new int[lIIIllIlIIIII[2]];
            iArr5[lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
            if (lIlIIIlIIllIIII(Inventory.getCount((boolean) r0, iArr5), lIIIllIlIIIII[1])) {
                return;
            }
        }
        if (!lIlIIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
            int[] iArr6 = new int[lIIIllIlIIIII[2]];
            iArr6[lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
            if (lIlIIIlIIllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                ?? r02 = lIIIllIlIIIII[2];
                int[] iArr7 = new int[lIIIllIlIIIII[2]];
                iArr7[lIIIllIlIIIII[0]] = lIIIllIlIIIII[22];
                if (lIlIIIlIIllIIII(Bank.getCount((boolean) r02, iArr7), lIIIllIlIIIII[1])) {
                    Bank.withdraw(lIIIllIlIIIII[22], lIIIllIlIIIII[1], Bank.WithdrawMode.ITEM);
                    return;
                }
                return;
            }
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]);
        String[] strArr = new String[lIIIllIlIIIII[2]];
        strArr[lIIIllIlIIIII[0]] = lIIIllIIlllll[lIIIllIlIIIII[25]];
        List at = TileObjects.getAt(worldPoint, strArr);
        if (lIlIIIlIIllIIIl(at.isEmpty() ? 1 : 0)) {
            Walker.walkTo(new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]));
            "".length();
        } else if (lIlIIIlIIllIlII(at.size(), lIIIllIlIIIII[2])) {
            if (!lIlIIIlIIlIllll(Reachable.isInteractable((Locatable) at.get(lIIIllIlIIIII[0])) ? 1 : 0)) {
                ((TileObject) at.get(lIIIllIlIIIII[0])).interact(lIIIllIIlllll[lIIIllIlIIIII[26]]);
                return;
            }
            Walker.walkTo(new WorldPoint(lIIIllIlIIIII[23], lIIIllIlIIIII[24], lIIIllIlIIIII[0]));
            "".length();
        }
    }

    private void M() {
        int i = lIIIllIlIIIII[6];
        WorldPoint worldPoint = new WorldPoint(lIIIllIlIIIII[7], lIIIllIlIIIII[8], lIIIllIlIIIII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIlIIIII[9]];
        dialogOptionArr[lIIIllIlIIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIlIIIII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIlIIIII[12]] = DialogOption.CHAT_OPTION_ONE;
        a(i, worldPoint, dialogOptionArr);
    }
}

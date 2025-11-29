package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Completing X Marks The Spot")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.D  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/D.class */
public class D extends Task {
    private static /* synthetic */ int[] lIIIllIIIIlII;
    private static /* synthetic */ String[] lIIIllIIIIIll;
    private final /* synthetic */ SquireQuesterConfig bB;

    private static boolean lIlIIIIlIlllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIIllIIIIII(int i) {
        return i > 0;
    }

    private void Y() {
        int[] iArr = new int[lIIIllIIIIlII[2]];
        iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[3];
        if (lIlIIIIlIllllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String str = lIIIllIIIIIll[lIIIllIIIIlII[0]];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIlII[4], lIIIllIIIIlII[5], lIIIllIIIIlII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIlII[1]];
        dialogOptionArr[lIIIllIIIIlII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[8]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArr[lIIIllIIIIlII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[11]] = DialogOption.CHAT_OPTION_ONE;
        a(str, worldPoint, dialogOptionArr);
    }

    private void a(String str, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIIlIllllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        String[] strArr = new String[lIIIllIIIIlII[2]];
        strArr[lIIIllIIIIlII[0]] = str;
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIlIIIIllIIIIIl(nearest) || !lIlIIIIlIllllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIIIIIll[lIIIllIIIIlII[25]]);
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIIIll[lIIIllIIIIlII[26]]);
        "".length();
        if (0 != 0) {
        }
    }

    private static boolean lIlIIIIllIIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    public boolean run() {
        if (lIlIIIIlIllllIl(this.bB.quest().equals(h.X_MARKS_THE_SPOT) ? 1 : 0)) {
            return lIIIllIIIIlII[0];
        }
        int lllllllllllllllIIIIlIlllIlIlIlll = Q();
        if (lIlIIIIlIlllllI(lllllllllllllllIIIIlIlllIlIlIlll, lIIIllIIIIlII[1])) {
            return lIIIllIIIIlII[0];
        }
        System.out.println("[X_MARKS_THE_SPOT] - Current Progress: " + lllllllllllllllIIIIlIlllIlIlIlll);
        switch (lllllllllllllllIIIIlIlllIlIlIlll) {
            case 0:
                bx();
                cp();
                "".length();
                if (" ".length() >= "   ".length()) {
                    return ((((15 + 69) - (-9)) + 122) ^ (((37 + 124) - 151) + 128)) & (((((144 + 79) - 160) + 95) ^ (((112 + 91) - 83) + 75)) ^ (-" ".length())) & ((((83 ^ 67) ^ (106 ^ 127)) & (((99 ^ 6) ^ (89 ^ 57)) ^ (-" ".length()))) ^ (-" ".length()));
                }
                break;
            case 1:
                cp();
                "".length();
                if ((-(1 ^ 5)) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 2:
                bw();
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 3:
                bv();
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 4:
                bu();
                "".length();
                if (!(true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            case 5:
                bt();
                "".length();
                if (" ".length() == (((90 ^ 111) ^ (55 ^ 69)) & (((190 ^ 177) ^ (81 ^ 25)) ^ (-" ".length())))) {
                    return ((66 ^ 27) ^ (117 ^ 99)) & (((((15 + 9) - (-187)) + 2) ^ (((91 + 88) - 127) + 102)) ^ (-" ".length()));
                }
                break;
            case 6:
                P();
                Y();
                "".length();
                if ("  ".length() < (((125 ^ 81) ^ (127 ^ 117)) & (((((107 + 32) - 54) + 48) ^ (((65 + 147) - 50) + 1)) ^ (-" ".length())))) {
                    return ((99 ^ 10) ^ (238 ^ 192)) & (((36 ^ 21) ^ (180 ^ 194)) ^ (-" ".length()));
                }
                break;
            case 7:
                P();
                "".length();
                if ("  ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                break;
            default:
                return lIIIllIIIIlII[0];
        }
        return lIIIllIIIIlII[2];
    }

    private void bx() {
        int[] iArr = new int[lIIIllIIIIlII[2]];
        iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        if (lIlIIIIlIllllll(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        int[] iArr2 = new int[lIIIllIIIIlII[2]];
        iArr2[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        TileItem nearest = TileItems.getNearest(iArr2);
        if (!lIlIIIIllIIIIIl(nearest)) {
            Walker.walkTo(new WorldPoint(lIIIllIIIIlII[21], lIIIllIIIIlII[22], lIIIllIIIIlII[2]));
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIIIll[lIIIllIIIIlII[9]]);
        "".length();
        if ((true ^ true) && ((true ^ true) ^ true)) {
        }
    }

    @Inject
    public D(SquireQuesterConfig squireQuesterConfig) {
        this.bB = squireQuesterConfig;
    }

    private static boolean lIlIIIIlIllllll(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIlIllllIl(int i) {
        return i == 0;
    }

    private static String lIlIIIIlIlllIIl(String lllllllllllllllIIIIlIlllIIlIlIIl, String lllllllllllllllIIIIlIlllIIlIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIlllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIlllIIlIlIII.toCharArray();
        int lllllllllllllllIIIIlIlllIIlIIlIl = lIIIllIIIIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIIIlII[0];
        while (lIlIIIIllIIIIlI(i, length)) {
            char lllllllllllllllIIIIlIlllIIlIlIlI = charArray2[i];
            sb.append((char) (lllllllllllllllIIIIlIlllIIlIlIlI ^ charArray[lllllllllllllllIIIIlIlllIIlIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIlllIIlIIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIIIlIlllIII(String lllllllllllllllIIIIlIlllIIlllIIl, String lllllllllllllllIIIIlIlllIIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlllIIlllIII.getBytes(StandardCharsets.UTF_8)), lIIIllIIIIlII[1]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIIIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlllIIlllIlI) {
            lllllllllllllllIIIIlIlllIIlllIlI.printStackTrace();
            return null;
        }
    }

    private void bt() {
        if (!lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[12], lIIIllIIIIlII[13], lIIIllIIIIlII[0])))) {
            int[] iArr = new int[lIIIllIIIIlII[2]];
            iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst(iArr).interact(lIIIllIIIIIll[lIIIllIIIIlII[2]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIIIIlII[12], lIIIllIIIIlII[13], lIIIllIIIIlII[0]));
        "".length();
        "".length();
        if ((64 ^ 68) < " ".length()) {
        }
    }

    private void bu() {
        if (!lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[15], lIIIllIIIIlII[16], lIIIllIIIIlII[0])))) {
            int[] iArr = new int[lIIIllIIIIlII[2]];
            iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst(iArr).interact(lIIIllIIIIIll[lIIIllIIIIlII[6]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIIIIlII[15], lIIIllIIIIlII[16], lIIIllIIIIlII[0]));
        "".length();
        "".length();
        if ((-"   ".length()) > 0) {
        }
    }

    private static boolean lIlIIIIllIIIIIl(Object obj) {
        return obj != null;
    }

    private static void lIlIIIIlIlllIll() {
        lIIIllIIIIIll = new String[lIIIllIIIIlII[27]];
        lIIIllIIIIIll[lIIIllIIIIlII[0]] = lIlIIIIlIlllIII("twIeuCzgZkI=", "jywbW");
        lIIIllIIIIIll[lIIIllIIIIlII[2]] = lIlIIIIlIlllIII("st7xSuDTdYk=", "uqERw");
        lIIIllIIIIIll[lIIIllIIIIlII[6]] = lIlIIIIlIlllIIl("LQc0", "inStE");
        lIIIllIIIIIll[lIIIllIIIIlII[7]] = lIlIIIIlIlllIII("qyhrg5NJWLg=", "hzVly");
        lIIIllIIIIIll[lIIIllIIIIlII[8]] = lIlIIIIlIlllIII("201bqaImbxE=", "FaFTJ");
        lIIIllIIIIIll[lIIIllIIIIlII[9]] = lIlIIIIlIlllIIl("FiABHA==", "BAjyd");
        lIIIllIIIIIll[lIIIllIIIIlII[10]] = lIlIIIIlIlllIlI("Gr1a9O9bizU=", "GPKWx");
        lIIIllIIIIIll[lIIIllIIIIlII[11]] = lIlIIIIlIlllIIl("JCkiHHoEJw==", "pHNwW");
        lIIIllIIIIIll[lIIIllIIIIlII[1]] = lIlIIIIlIlllIII("lMGy/shFhVOVAAZYPJUYGw==", "GZJVu");
        lIIIllIIIIIll[lIIIllIIIIlII[26]] = lIlIIIIlIlllIlI("BsVJLQiH1Nc=", "njwij");
        lIIIllIIIIIll[lIIIllIIIIlII[25]] = lIlIIIIlIlllIIl("HysrBgEmLWcZB2gEFy4=", "HJGmh");
    }

    private void bv() {
        if (!lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[17], lIIIllIIIIlII[18], lIIIllIIIIlII[0])))) {
            int[] iArr = new int[lIIIllIIIIlII[2]];
            iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst(iArr).interact(lIIIllIIIIIll[lIIIllIIIIlII[7]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIIIIlII[17], lIIIllIIIIlII[18], lIIIllIIIIlII[0]));
        "".length();
        "".length();
        if ((110 ^ 106) < 0) {
        }
    }

    private void a(int i, WorldPoint worldPoint, DialogOption... dialogOptionArr) {
        if (lIlIIIIlIllllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        int[] iArr = new int[lIIIllIIIIlII[2]];
        iArr[lIIIllIIIIlII[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIlIIIIllIIIIIl(nearest) || !lIlIIIIlIllllll(Reachable.isInteractable(nearest) ? 1 : 0)) {
            System.out.println(lIIIllIIIIIll[lIIIllIIIIlII[1]]);
            Walker.walkTo(worldPoint);
            "".length();
            return;
        }
        nearest.interact(lIIIllIIIIIll[lIIIllIIIIlII[11]]);
        "".length();
        if ((-" ".length()) >= (((20 ^ 101) ^ (237 ^ 182)) & (((((38 + 82) - (-43)) + 11) ^ (((81 + 99) - 53) + 5)) ^ (-" ".length())))) {
        }
    }

    private void cp() {
        int[] iArr = new int[lIIIllIIIIlII[2]];
        iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        if (lIlIIIIlIllllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        String str = lIIIllIIIIIll[lIIIllIIIIlII[10]];
        WorldPoint worldPoint = new WorldPoint(lIIIllIIIIlII[23], lIIIllIIIIlII[24], lIIIllIIIIlII[0]);
        DialogOption[] dialogOptionArr = new DialogOption[lIIIllIIIIlII[25]];
        dialogOptionArr[lIIIllIIIIlII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArr[lIIIllIIIIlII[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArr[lIIIllIIIIlII[26]] = DialogOption.CHAT_OPTION_ONE;
        a(str, worldPoint, dialogOptionArr);
    }

    private static String lIlIIIIlIlllIlI(String lllllllllllllllIIIIlIlllIIIlIlII, String lllllllllllllllIIIIlIlllIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIlllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIlllIIIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIlllIIIlIllI.init(lIIIllIIIIlII[6], secretKeySpec);
            return new String(lllllllllllllllIIIIlIlllIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIlllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIlllIIIlIlIl) {
            lllllllllllllllIIIIlIlllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private void bw() {
        if (!lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[19], lIIIllIIIIlII[20], lIIIllIIIIlII[0])))) {
            int[] iArr = new int[lIIIllIIIIlII[2]];
            iArr[lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst(iArr).interact(lIIIllIIIIIll[lIIIllIIIIlII[8]]);
            return;
        }
        Walker.walkTo(new WorldPoint(lIIIllIIIIlII[19], lIIIllIIIIlII[20], lIIIllIIIIlII[0]));
        "".length();
        "".length();
        if ("  ".length() < 0) {
        }
    }

    private static void lIlIIIIlIllllII() {
        lIIIllIIIIlII = new int[28];
        lIIIllIIIIlII[0] = ((((57 + 140) - 113) + 162) ^ (((46 + 122) - 78) + 92)) & (((130 ^ 190) ^ (65 ^ 61)) ^ (-" ".length()));
        lIIIllIIIIlII[1] = 187 ^ 179;
        lIIIllIIIIlII[2] = " ".length();
        lIIIllIIIIlII[3] = (-((-16401) & 17905)) & (-1) & 24575;
        lIIIllIIIIlII[4] = (-((-4549) & 20949)) & (-12289) & 31742;
        lIIIllIIIIlII[5] = (-((-19) & 20819)) & (-8193) & 32238;
        lIIIllIIIIlII[6] = "  ".length();
        lIIIllIIIIlII[7] = "   ".length();
        lIIIllIIIIlII[8] = (207 ^ 174) ^ (238 ^ 139);
        lIIIllIIIIlII[9] = 138 ^ 143;
        lIIIllIIIIlII[10] = 80 ^ 86;
        lIIIllIIIIlII[11] = 17 ^ 22;
        lIIIllIIIIlII[12] = (-((-8197) & 25597)) & (-8193) & 28670;
        lIIIllIIIIlII[13] = (-25089) & 28347;
        lIIIllIIIIlII[14] = (-24580) & 25531;
        lIIIllIIIIlII[15] = (-16977) & 20085;
        lIIIllIIIIlII[16] = (-8716) & 11979;
        lIIIllIIIIlII[17] = (-16505) & 19707;
        lIIIllIIIIlII[18] = (-((-10315) & 14459)) & (-3) & 7358;
        lIIIllIIIIlII[19] = (-((-142) & 21487)) & (-8193) & 32767;
        lIIIllIIIIlII[20] = (-((-1425) & 30615)) & (-49) & 32447;
        lIIIllIIIIlII[21] = (-9035) & 12250;
        lIIIllIIIIlII[22] = (-((-22803) & 31167)) & (-20993) & 32767;
        lIIIllIIIIlII[23] = (-28769) & 31997;
        lIIIllIIIIlII[24] = (-((-5127) & 30039)) & (-4097) & 32249;
        lIIIllIIIIlII[25] = (((12 + 11) - (-139)) + 25) ^ (((129 + 128) - 175) + 95);
        lIIIllIIIIlII[26] = (((91 + 37) - 61) + 60) ^ (216 ^ 174);
        lIIIllIIIIlII[27] = 33 ^ 42;
    }

    private int Q() {
        return Static.getClient().getVarbitValue(EnumC0001b.QUEST_X_MARKS_THE_SPOT.c());
    }

    static {
        lIlIIIIlIllllII();
        lIlIIIIlIlllIll();
    }

    private void P() {
        if (lIlIIIIlIllllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

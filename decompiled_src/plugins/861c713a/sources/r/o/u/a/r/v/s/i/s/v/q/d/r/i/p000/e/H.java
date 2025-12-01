package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Walking to vardorvis [DEATH]", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.H  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/H.class */
public class H extends E {
    private static /* synthetic */ WorldPoint ai;
    private static final /* synthetic */ int az;
    private static /* synthetic */ String[] lIlIlIIIllIIl;
    private final /* synthetic */ int aA = lIlIlIIIllIlI[0];
    private static /* synthetic */ int[] lIlIlIIIllIlI;

    private static String lIllllIllIIIIll(String llllllllllllllIllIllIIIIllIllIll, String llllllllllllllIllIllIIIIllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIllIlllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIllIlI[9]), "DES");
            Cipher llllllllllllllIllIllIIIIllIlllll = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIIllIlllll.init(lIlIlIIIllIlI[5], secretKeySpec);
            return new String(llllllllllllllIllIllIIIIllIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIIllIllllI) {
            llllllllllllllIllIllIIIIllIllllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllIllIIIIlI(String llllllllllllllIllIllIIIIllIlIIII, String llllllllllllllIllIllIIIIllIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIllIlI[5], llllllllllllllIllIllIIIIllIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIIllIlIIIl) {
            llllllllllllllIllIllIIIIllIlIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.E
    public boolean l() {
        if (lIllllIllIIIllI(X() ? 1 : 0)) {
            return lIlIlIIIllIlI[1];
        }
        if (lIllllIllIIIlll(av.contains(Players.getLocal()) ? 1 : 0)) {
            return lIlIlIIIllIlI[1];
        }
        if (!lIllllIllIIIlll(S() ? 1 : 0)) {
            Movement.walkTo(ai);
            "".length();
            return lIlIlIIIllIlI[3];
        }
        if (lIllllIllIIIlll(Dialog.isOpen() ? 1 : 0) && lIllllIllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(lIlIlIIIllIlI[2]);
            "".length();
        }
        String[] strArr = new String[lIlIlIIIllIlI[3]];
        strArr[lIlIlIIIllIlI[1]] = lIlIlIIIllIIl[lIlIlIIIllIlI[1]];
        Inventory.getFirst(strArr).interact(lIlIlIIIllIIl[lIlIlIIIllIlI[3]]);
        return lIlIlIIIllIlI[3];
    }

    private static boolean lIllllIllIIIlll(int i) {
        return i != 0;
    }

    private static boolean lIllllIllIIlIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllIllIIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean S() {
        Client client = Static.getClient();
        if (lIllllIllIIIlll(IntStream.of(client.getMapRegions()).noneMatch(i -> {
            if (lIllllIllIIlIII(i, lIlIlIIIllIlI[0])) {
                ?? r0 = lIlIlIIIllIlI[3];
                "".length();
                return (((68 ^ 73) ^ (212 ^ 132)) & (((((99 + 162) - 160) + 132) ^ (((64 + 165) - 65) + 16)) ^ (-" ".length()))) >= "   ".length() ? ((50 ^ 78) ^ (176 ^ 135)) & (((100 ^ 46) ^ " ".length()) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIllIlI[1];
        }) ? 1 : 0) && lIllllIllIIlIII(client.getVarbitValue(lIlIlIIIllIlI[4]), lIlIlIIIllIlI[3])) {
            String[] strArr = new String[lIlIlIIIllIlI[3]];
            strArr[lIlIlIIIllIlI[1]] = lIlIlIIIllIIl[lIlIlIIIllIlI[5]];
            if (lIllllIllIIIlll(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = lIlIlIIIllIlI[3];
                "".length();
                return "   ".length() > (75 ^ 79) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIlIIIllIlI[1];
    }

    private static void lIllllIllIIIlIl() {
        lIlIlIIIllIlI = new int[10];
        lIlIlIIIllIlI[0] = (-((-10273) & 28137)) & (-2051) & 24575;
        lIlIlIIIllIlI[1] = ((((118 + 92) - 143) + 61) ^ (((34 + 47) - 55) + 115)) & (((((42 + 71) - (-65)) + 1) ^ (((45 + 178) - 206) + 173)) ^ (-" ".length()));
        lIlIlIIIllIlI[2] = 1 ^ 4;
        lIlIlIIIllIlI[3] = " ".length();
        lIlIlIIIllIlI[4] = (-((-13378) & 29787)) & (-1089) & 32637;
        lIlIlIIIllIlI[5] = "  ".length();
        lIlIlIIIllIlI[6] = (-2305) & 3421;
        lIlIlIIIllIlI[7] = (-((-1058) & 30253)) & (-129) & 32751;
        lIlIlIIIllIlI[8] = "   ".length();
        lIlIlIIIllIlI[9] = (((149 + 101) - 149) + 53) ^ (((38 + 103) - 21) + 26);
    }

    private static void lIllllIllIIIlII() {
        lIlIlIIIllIIl = new String[lIlIlIIIllIlI[8]];
        lIlIlIIIllIIl[lIlIlIIIllIlI[1]] = lIllllIllIIIIlI("X/Ig+i/f2oJgPS6bGORMQQ==", "hniPx");
        lIlIlIIIllIIl[lIlIlIIIllIlI[3]] = lIllllIllIIIIll("n61yvNaUd04+ypRgB30R0w==", "RhEmG");
        lIlIlIIIllIIl[lIlIlIIIllIlI[5]] = lIllllIllIIIIlI("o9QeBURG08MlCGOtRqyLuw==", "czkyv");
    }

    static {
        lIllllIllIIIlIl();
        lIllllIllIIIlII();
        az = lIlIlIIIllIlI[4];
        ai = new WorldPoint(lIlIlIIIllIlI[6], lIlIlIIIllIlI[7], lIlIlIIIllIlI[1]);
    }
}

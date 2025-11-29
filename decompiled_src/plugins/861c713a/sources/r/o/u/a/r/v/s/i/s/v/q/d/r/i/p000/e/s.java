package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Pathing to Boss", priority = 2147483547, blocking = true)
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/s.class */
public class s extends q {
    private static /* synthetic */ WorldPoint ai;
    private static final /* synthetic */ int ah;
    private final /* synthetic */ int am = lIlIlIIIIIllI[0];
    private /* synthetic */ WorldArea an = new WorldArea(new WorldPoint(lIlIlIIIIIllI[1], lIlIlIIIIIllI[2], lIlIlIIIIIllI[3]), new WorldPoint(lIlIlIIIIIllI[4], lIlIlIIIIIllI[5], lIlIlIIIIIllI[3]));
    private static /* synthetic */ int[] lIlIlIIIIIllI;
    private final /* synthetic */ SquireVardorvisConfig al;
    private static /* synthetic */ String[] lIlIlIIIIIlIl;
    private final /* synthetic */ SquireVardorvis aj;
    private final /* synthetic */ C0004e ak;

    @Inject
    public s(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.aj = squireVardorvis;
        this.ak = squireVardorvis.j();
        this.al = squireVardorvisConfig;
    }

    private static boolean lIllllIlIIIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.q
    public boolean run() {
        return lIllllIlIIIIIII(this.aj.h() ? 1 : 0) ? lIlIlIIIIIllI[3] : l();
    }

    private static boolean lIllllIlIIIIIII(int i) {
        return i != 0;
    }

    static {
        lIllllIIlllllll();
        lIllllIIllllllI();
        ah = lIlIlIIIIIllI[12];
        ai = new WorldPoint(lIlIlIIIIIllI[13], lIlIlIIIIIllI[14], lIlIlIIIIIllI[3]);
    }

    private void a(String str, String str2, int i, Player player) {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIllllIlIIIIIll(tileObject.getId(), i) && lIllllIlIIIIIII(tileObject.getName().equals(str) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIIIIIllI[6]];
                strArr[lIlIlIIIIIllI[3]] = str2;
                if (lIllllIlIIIIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIIIIIllI[6];
                    "".length();
                    return (((((74 + 106) - 159) + 107) ^ (((55 + 50) - 22) + 60)) & (((((34 + 9) - 30) + 125) ^ (((78 + 34) - 80) + 101)) ^ (-" ".length()))) > 0 ? ((((99 + 43) - 30) + 29) ^ (((34 + 152) - 44) + 35)) & (((172 ^ 183) ^ (153 ^ 190)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIIIIIllI[3];
        });
        if (lIllllIlIIIIIIl(nearest) || lIllllIlIIIIIII(player.isMoving() ? 1 : 0)) {
            return;
        }
        nearest.interact(str2);
    }

    private static void lIllllIIllllllI() {
        lIlIlIIIIIlIl = new String[lIlIlIIIIIllI[15]];
        lIlIlIIIIIlIl[lIlIlIIIIIllI[3]] = lIllllIIlllllII("OSU=", "wJzIu");
        lIlIlIIIIIlIl[lIlIlIIIIIllI[6]] = lIllllIIlllllIl("r/xjk2vAj9Y=", "AbNXY");
        lIlIlIIIIIlIl[lIlIlIIIIIllI[7]] = lIllllIIlllllIl("ccukg/sVepsofod3RkmUQQ==", "RzaSd");
        lIlIlIIIIIlIl[lIlIlIIIIIllI[10]] = lIllllIIlllllII("HQwFCGcgA0scLy4BBBg0", "OekoG");
        lIlIlIIIIIlIl[lIlIlIIIIIllI[11]] = lIllllIIlllllII("BwoiLDc8HTo=", "SoNIG");
        lIlIlIIIIIlIl[lIlIlIIIIIllI[9]] = lIllllIIlllllII("AR87KkQ8EHU+DDISOjoX", "SvUMd");
    }

    private static String lIllllIIlllllIl(String llllllllllllllIllIllIIlIlIIIIllI, String llllllllllllllIllIllIIlIlIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIIIllI[7], llllllllllllllIllIllIIlIlIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIlIlIIIIlll) {
            llllllllllllllIllIllIIlIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    private boolean S() {
        int[] mapRegions = this.w.getMapRegions();
        int i = lIlIlIIIIIllI[3];
        while (lIllllIlIIIIIlI(i, mapRegions.length)) {
            i++;
            "".length();
            if ("  ".length() < " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lIllllIlIIIIIII(IntStream.of(mapRegions).noneMatch(i2 -> {
            if (lIllllIlIIIIIll(i2, lIlIlIIIIIllI[0])) {
                ?? r0 = lIlIlIIIIIllI[6];
                "".length();
                return (-"  ".length()) > 0 ? ((((13 + 81) - (-39)) + 108) ^ (((42 + 110) - 129) + 124)) & (((((154 + 186) - 186) + 60) ^ (((114 + 125) - 146) + 87)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIIIllI[3];
        }) ? 1 : 0) && lIllllIlIIIIIll(this.w.getVarbitValue(lIlIlIIIIIllI[12]), lIlIlIIIIIllI[6])) {
            String[] strArr = new String[lIlIlIIIIIllI[6]];
            strArr[lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[9]];
            if (lIllllIlIIIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = lIlIlIIIIIllI[6];
                "".length();
                return (-"   ".length()) > 0 ? ((((60 + 8) - 2) + 103) ^ (((6 + 58) - 59) + 146)) & (((((45 + 33) - 13) + 122) ^ (((100 + 32) - 15) + 16)) ^ (-" ".length())) : r0;
            }
        }
        return lIlIlIIIIIllI[3];
    }

    private static String lIllllIIlllllII(String llllllllllllllIllIllIIlIIlllIllI, String llllllllllllllIllIllIIlIIlllIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIlIIlllIlII = new StringBuilder();
        char[] llllllllllllllIllIllIIlIIlllIIll = llllllllllllllIllIllIIlIIlllIlIl.toCharArray();
        int llllllllllllllIllIllIIlIIllIllIl = lIlIlIIIIIllI[3];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIIIllI[3];
        while (lIllllIlIIIIIlI(i, length)) {
            char llllllllllllllIllIllIIlIIlllIlll = charArray[i];
            llllllllllllllIllIllIIlIIlllIlII.append((char) (llllllllllllllIllIllIIlIIlllIlll ^ llllllllllllllIllIllIIlIIlllIIll[llllllllllllllIllIllIIlIIllIllIl % llllllllllllllIllIllIIlIIlllIIll.length]));
            "".length();
            llllllllllllllIllIllIIlIIllIllIl++;
            i++;
            "".length();
            if ((((131 ^ 188) ^ (106 ^ 15)) & (((((175 + 184) - 141) + 19) ^ (((149 + 82) - 136) + 88)) ^ (-" ".length()))) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIllIIlIIlllIlII);
    }

    private static void lIllllIIlllllll() {
        lIlIlIIIIIllI = new int[17];
        lIlIlIIIIIllI[0] = (-25859) & 30519;
        lIlIlIIIIIllI[1] = (-10529) & 11641;
        lIlIlIIIIIllI[2] = (-((-5451) & 30683)) & (-4097) & 32755;
        lIlIlIIIIIllI[3] = ((((33 + 135) - 110) + 107) ^ (((69 + 112) - 151) + 139)) & (((14 ^ 74) ^ (46 ^ 102)) ^ (-" ".length()));
        lIlIlIIIIIllI[4] = (-28820) & 29939;
        lIlIlIIIIIllI[5] = (-((-2211) & 23223)) & (-8321) & 32767;
        lIlIlIIIIIllI[6] = " ".length();
        lIlIlIIIIIllI[7] = "  ".length();
        lIlIlIIIIIllI[8] = (-8873) & 58367;
        lIlIlIIIIIllI[9] = (10 ^ 123) ^ (251 ^ 143);
        lIlIlIIIIIllI[10] = "   ".length();
        lIlIlIIIIIllI[11] = (117 ^ 69) ^ (100 ^ 80);
        lIlIlIIIIIllI[12] = (-16593) & 31732;
        lIlIlIIIIIllI[13] = (-25249) & 26365;
        lIlIlIIIIIllI[14] = (-((-1308) & 30623)) & (-1) & 32743;
        lIlIlIIIIIllI[15] = (((146 + 45) - 46) + 39) ^ (((179 + 137) - 301) + 175);
        lIlIlIIIIIllI[16] = (((19 + 70) - (-4)) + 48) ^ (((125 + 5) - 40) + 43);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    @Override // r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.q
    public boolean l() {
        if (lIllllIlIIIIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        if (lIllllIlIIIIIII(this.aj.i() ? 1 : 0)) {
            return lIlIlIIIIIllI[6];
        }
        Player local = Players.getLocal();
        if (lIllllIlIIIIIIl(local)) {
            return lIlIlIIIIIllI[3];
        }
        if (lIllllIlIIIIIII(this.an.contains(local) ? 1 : 0)) {
            if (!lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                a(lIlIlIIIIIlIl[lIlIlIIIIIllI[6]], lIlIlIIIIIlIl[lIlIlIIIIIllI[7]], lIlIlIIIIIllI[8], local);
                return lIlIlIIIIIllI[6];
            }
            String[] strArr = new String[lIlIlIIIIIllI[6]];
            strArr[lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[3]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIlIlIIIIIllI[6];
        } else if (!lIllllIlIIIIIII(S() ? 1 : 0)) {
            Movement.walkTo(ai);
            "".length();
            return lIlIlIIIIIllI[6];
        } else {
            if (lIllllIlIIIIIII(Dialog.isOpen() ? 1 : 0) && lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption(lIlIlIIIIIllI[9]);
                "".length();
            }
            String[] strArr2 = new String[lIlIlIIIIIllI[6]];
            strArr2[lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[10]];
            Inventory.getFirst(strArr2).interact(lIlIlIIIIIlIl[lIlIlIIIIIllI[11]]);
            return lIlIlIIIIIllI[6];
        }
    }

    private static boolean lIllllIlIIIIIIl(Object obj) {
        return obj == null;
    }
}

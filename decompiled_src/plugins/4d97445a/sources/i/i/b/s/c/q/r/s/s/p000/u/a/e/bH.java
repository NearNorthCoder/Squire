package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Attacking")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bH  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bH.class */
public class bH extends Task {
    private static /* synthetic */ int[] lIlIIIIll;
    private final /* synthetic */ SarachnisConfig gA;
    private /* synthetic */ int bD = lIlIIIIll[0];
    private static /* synthetic */ String[] lIlIIIIlI;

    static {
        lIIIllIlIll();
        lIIIllIlIlI();
    }

    private static void lIIIllIlIll() {
        lIlIIIIll = new int[16];
        lIlIIIIll[0] = -" ".length();
        lIlIIIIll[1] = " ".length();
        lIlIIIIll[2] = ((102 ^ 1) ^ (64 ^ 22)) & (((227 ^ 189) ^ (233 ^ 134)) ^ (-" ".length()));
        lIlIIIIll[3] = (-((-25857) & 32103)) & (-1025) & 15983;
        lIlIIIIll[4] = (-18450) & 20279;
        lIlIIIIll[5] = (-6145) & 16033;
        lIlIIIIll[6] = 13 ^ 21;
        lIlIIIIll[7] = 95 ^ 72;
        lIlIIIIll[8] = ((78 + 119) - 67) + 30;
        lIlIIIIll[9] = 133 ^ 166;
        lIlIIIIll[10] = "  ".length();
        lIlIIIIll[11] = "   ".length();
        lIlIIIIll[12] = 23 ^ 19;
        lIlIIIIll[13] = (((40 + 128) - 77) + 100) ^ (((108 + 112) - 219) + 185);
        lIlIIIIll[14] = 164 ^ 162;
        lIlIIIIll[15] = (19 ^ 91) ^ (45 ^ 109);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIlIIIIll[1]];
        iArr[lIlIIIIll[2]] = lIlIIIIll[3];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIIIllIllII(new WorldArea(lIlIIIIll[4], lIlIIIIll[5], lIlIIIIll[6], lIlIIIIll[7], lIlIIIIll[2]).contains(Players.getLocal()) ? 1 : 0) && !lIIIllIllIl(nearest)) {
            if (!lIIIllIlllI(nearest) || lIIIllIllll(nearest.isDead() ? 1 : 0)) {
                return lIlIIIIll[2];
            }
            if (lIIIlllIIII(Players.getLocal().getInteracting(), nearest)) {
                nearest.interact(lIlIIIIlI[lIlIIIIll[2]]);
            }
            if (lIIIllIllII(Combat.isSpecEnabled() ? 1 : 0) && lIIIlllIIIl(Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId(), this.gA.specWeapon().ar())) {
                Widget widget = Widgets.get(lIlIIIIll[8], lIlIIIIll[9]);
                if (lIIIllIlllI(widget)) {
                    System.out.println(lIlIIIIlI[lIlIIIIll[1]]);
                    widget.interact(lIlIIIIll[2]);
                }
            }
            if (lIIIllIlllI(Players.getLocal().getInteracting())) {
                if (lIIIlllIIlI(Combat.getSpecEnergy(), this.gA.specWeapon().as())) {
                    Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
                    if (lIIIllIlllI(fromSlot) && lIIIlllIIll(fromSlot.getId(), ap())) {
                        int[] iArr2 = new int[lIlIIIIll[1]];
                        iArr2[lIlIIIIll[2]] = ap();
                        Inventory.getFirst(iArr2).interact(lIlIIIIlI[lIlIIIIll[10]]);
                    }
                }
                if (lIIIlllIlII(Combat.getSpecEnergy(), this.gA.specWeapon().as())) {
                    Item fromSlot2 = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
                    if (lIIIllIlllI(fromSlot2) && lIIIlllIIll(fromSlot2.getId(), this.gA.specWeapon().ar())) {
                        int[] iArr3 = new int[lIlIIIIll[1]];
                        iArr3[lIlIIIIll[2]] = this.gA.specWeapon().ar();
                        if (lIIIllIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                            if (lIIIllIllII(this.gA.specWeapon().at() ? 1 : 0)) {
                                k(fromSlot2.getId());
                                int[] iArr4 = new int[lIlIIIIll[1]];
                                iArr4[lIlIIIIll[2]] = this.gA.specWeapon().ar();
                                Inventory.getFirst(iArr4).interact(lIlIIIIlI[lIlIIIIll[11]]);
                            }
                            if (lIIIllIllll(this.gA.specWeapon().at() ? 1 : 0) && lIIIlllIlIl(Inventory.getFreeSlots(), lIlIIIIll[10])) {
                                k(fromSlot2.getId());
                                int[] iArr5 = new int[lIlIIIIll[1]];
                                iArr5[lIlIIIIll[2]] = this.gA.specWeapon().ar();
                                Inventory.getFirst(iArr5).interact(lIlIIIIlI[lIlIIIIll[12]]);
                                "".length();
                                if ((-((20 ^ 68) ^ (67 ^ 23))) >= 0) {
                                    return ((((124 + 60) - 93) + 55) ^ (((125 + 86) - 209) + 159)) & (((78 ^ 121) ^ (37 ^ 33)) ^ (-" ".length()));
                                }
                            } else {
                                System.out.println(lIlIIIIlI[lIlIIIIll[13]]);
                            }
                        }
                    }
                }
            }
            return lIlIIIIll[1];
        }
        return lIlIIIIll[2];
    }

    private static boolean lIIIlllIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIIllIlIII(String llIIIIllIlllIIl, String llIIIIllIlllIII) {
        String llIIIIllIlllIIl2 = new String(Base64.getDecoder().decode(llIIIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIIllIlllIII.toCharArray();
        int llIIIIllIllIlIl = lIlIIIIll[2];
        char[] charArray2 = llIIIIllIlllIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIIIIll[2];
        while (lIIIlllIIlI(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[llIIIIllIllIlIl % charArray.length]));
            "".length();
            llIIIIllIllIlIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIllIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIlIl(int i2, int i3) {
        return i2 > i3;
    }

    public int ap() {
        return this.bD;
    }

    private static boolean lIIIlllIIll(int i2, int i3) {
        return i2 != i3;
    }

    private static void lIIIllIlIlI() {
        lIlIIIIlI = new String[lIlIIIIll[14]];
        lIlIIIIlI[lIlIIIIll[2]] = lIIIllIIlll("fBrAQrjP1p0=", "lRlYg");
        lIlIIIIlI[lIlIIIIll[1]] = lIIIllIIlll("Cnqba43FZmP0e1jvRt/gdFFAvRqlkHSS", "ocrSP");
        lIlIIIIlI[lIlIIIIll[10]] = lIIIllIIlll("35iVR/2eYI8=", "QyQFc");
        lIlIIIIlI[lIlIIIIll[11]] = lIIIllIlIII("AhgrCiw=", "UqNfH");
        lIlIIIIlI[lIlIIIIll[12]] = lIIIllIlIII("GjMGKwc=", "MZcGc");
        lIlIIIIlI[lIlIIIIll[13]] = lIIIllIlIIl("NgEBaBrbVdaU6zafX9WjBr48e8ZDV7tQVXi7JS4nNbwieLSgd2Goy3axSQohO+Ub", "FEnar");
    }

    @Inject
    public bH(SarachnisConfig sarachnisConfig) {
        this.gA = sarachnisConfig;
    }

    private static boolean lIIIlllIIIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIlllIlII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIIIlllIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIIIllIIlll(String llIIIIllIlIIlII, String llIIIIllIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIllIlIIllI = Cipher.getInstance("Blowfish");
            llIIIIllIlIIllI.init(lIlIIIIll[10], secretKeySpec);
            return new String(llIIIIllIlIIllI.doFinal(Base64.getDecoder().decode(llIIIIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIllIlIIlIl) {
            llIIIIllIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIlIIl(String llIIIIllIIlIlll, String llIIIIllIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllIIlIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIll[15]), "DES");
            Cipher llIIIIllIIllIIl = Cipher.getInstance("DES");
            llIIIIllIIllIIl.init(lIlIIIIll[10], secretKeySpec);
            return new String(llIIIIllIIllIIl.doFinal(Base64.getDecoder().decode(llIIIIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIllIIllIII) {
            llIIIIllIIllIII.printStackTrace();
            return null;
        }
    }

    public void k(int i2) {
        this.bD = i2;
    }

    private static boolean lIIIllIllll(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIllIllII(int i2) {
        return i2 == 0;
    }
}

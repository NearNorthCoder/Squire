package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Waiting rooms")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.i  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/i.class */
public class i extends Task {
    private static /* synthetic */ String[] lIIIIIIlIlIll;
    private static /* synthetic */ int[] lIIIIIIlIllIl;
    private final /* synthetic */ SquireMoonsOfPerilConfig ac;
    final /* synthetic */ WorldArea ad = new WorldArea(lIIIIIIlIllIl[0], lIIIIIIlIllIl[1], lIIIIIIlIllIl[2], lIIIIIIlIllIl[3], lIIIIIIlIllIl[4]);
    final /* synthetic */ WorldArea ae = new WorldArea(lIIIIIIlIllIl[5], lIIIIIIlIllIl[6], lIIIIIIlIllIl[7], lIIIIIIlIllIl[2], lIIIIIIlIllIl[4]);
    final /* synthetic */ WorldArea af = new WorldArea(lIIIIIIlIllIl[8], lIIIIIIlIllIl[9], lIIIIIIlIllIl[10], lIIIIIIlIllIl[11], lIIIIIIlIllIl[4]);

    @Inject
    public i(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.ac = squireMoonsOfPerilConfig;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup) this.ac.blueMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllllIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlllllIIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean e() {
        if (lIIlIllllIllllI(this.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllllIllllI(this.ae.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIlIlllllIIIII(this.af.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIllIl[4];
        }
        ?? r0 = lIIIIIIlIllIl[12];
        "".length();
        return "  ".length() <= ((164 ^ 148) & ((188 ^ 140) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static String lIIlIllllIllIIl(String lllllllllllllllIIIlllIllIIlIIIll, String lllllllllllllllIIIlllIllIIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIllIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIllIl[18]), "DES");
            Cipher lllllllllllllllIIIlllIllIIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIIlllIllIIlIIlIl.init(lIIIIIIlIllIl[13], lllllllllllllllIIIlllIllIIlIIllI);
            return new String(lllllllllllllllIIIlllIllIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllIllIIlIIlII) {
            lllllllllllllllIIIlllIllIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIllllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    public boolean run() {
        if (lIIlIllllIllllI(e() ? 1 : 0)) {
            return lIIIIIIlIllIl[4];
        }
        if (lIIlIlllllIIIII(this.ad.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIllllIllllI(b().isFullyEquipped() ? 1 : 0)) {
            if (lIIlIlllllIIIII(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIlIllIl[12]];
                strArr[lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[4]];
                if (lIIlIlllllIIIII(Inventory.contains(strArr) ? 1 : 0) && lIIlIlllllIIIIl(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lIIlIlllllIIIlI(b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] strArr2 = new String[lIIIIIIlIllIl[12]];
                    strArr2[lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[12]];
                    Inventory.getFirst(strArr2).interact(lIIIIIIlIlIll[lIIIIIIlIllIl[13]]);
                }
            }
            b().swap();
        }
        SquireMoonsOfPeril.g = lIIIIIIlIlIll[lIIIIIIlIllIl[14]];
        String[] strArr3 = new String[lIIIIIIlIllIl[12]];
        strArr3[lIIIIIIlIllIl[4]] = lIIIIIIlIlIll[lIIIIIIlIllIl[15]];
        TileObject nearest = TileObjects.getNearest(strArr3);
        if (lIIlIlllllIIIIl(nearest)) {
            nearest.interact(lIIIIIIlIlIll[lIIIIIIlIllIl[16]]);
            return lIIIIIIlIllIl[12];
        }
        return lIIIIIIlIllIl[4];
    }

    private static void lIIlIllllIllIlI() {
        lIIIIIIlIlIll = new String[lIIIIIIlIllIl[17]];
        lIIIIIIlIlIll[lIIIIIIlIllIl[4]] = lIIlIllllIllIII("LRc2PicKWDsnJw8V", "nxYUB");
        lIIIIIIlIlIll[lIIIIIIlIllIl[12]] = lIIlIllllIllIIl("MDdbt3A7OXyZZxYKyWOcqQ==", "zDDKw");
        lIIIIIIlIlIll[lIIIIIIlIllIl[13]] = lIIlIllllIllIII("IDE8", "ePHOz");
        lIIIIIIlIlIll[lIIIIIIlIllIl[14]] = lIIlIllllIllIIl("lVRTKvRMwTLbx9W2ICxtNA==", "dZIpm");
        lIIIIIIlIlIll[lIIIIIIlIllIl[15]] = lIIlIllllIllIII("EgYjGQYk", "ArBms");
        lIIIIIIlIlIll[lIIIIIIlIllIl[16]] = lIIlIllllIllIIl("iGLFZ8xFxfQ=", "fsQhm");
    }

    private static boolean lIIlIlllllIIIlI(int i) {
        return i <= 0;
    }

    private static boolean lIIlIlllllIIIII(int i) {
        return i != 0;
    }

    private static String lIIlIllllIllIII(String lllllllllllllllIIIlllIllIIlllIII, String lllllllllllllllIIIlllIllIIllIlll) {
        String lllllllllllllllIIIlllIllIIlllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllIllIIllIllI = new StringBuilder();
        char[] lllllllllllllllIIIlllIllIIllIlIl = lllllllllllllllIIIlllIllIIllIlll.toCharArray();
        int lllllllllllllllIIIlllIllIIllIlII = lIIIIIIlIllIl[4];
        char[] charArray = lllllllllllllllIIIlllIllIIlllIII2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIlIllIl[4];
        while (lIIlIlllllIIIll(i, length)) {
            lllllllllllllllIIIlllIllIIllIllI.append((char) (charArray[i] ^ lllllllllllllllIIIlllIllIIllIlIl[lllllllllllllllIIIlllIllIIllIlII % lllllllllllllllIIIlllIllIIllIlIl.length]));
            "".length();
            lllllllllllllllIIIlllIllIIllIlII++;
            i++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIlllIllIIllIllI);
    }

    private static void lIIlIllllIlllIl() {
        lIIIIIIlIllIl = new int[19];
        lIIIIIIlIllIl[0] = (-((-21621) & 24189)) & (-28769) & 32767;
        lIIIIIIlIllIl[1] = (-(150 ^ 147)) & (-73) & 9727;
        lIIIIIIlIllIl[2] = 44 ^ 62;
        lIIIIIIlIllIl[3] = 8 ^ 4;
        lIIIIIIlIllIl[4] = (255 ^ 191) & ((198 ^ 134) ^ (-1));
        lIIIIIIlIllIl[5] = (-((-1123) & 31871)) & (-1) & 32156;
        lIIIIIIlIllIl[6] = (-((-12055) & 28543)) & (-2049) & 28159;
        lIIIIIIlIllIl[7] = (183 ^ 149) ^ (15 ^ 34);
        lIIIIIIlIllIl[8] = (-((-9249) & 15974)) & (-9) & 8191;
        lIIIIIIlIllIl[9] = (-16897) & 26520;
        lIIIIIIlIllIl[10] = 140 ^ 129;
        lIIIIIIlIllIl[11] = (((10 + 105) - 66) + 109) ^ (((57 + 73) - 80) + 92);
        lIIIIIIlIllIl[12] = " ".length();
        lIIIIIIlIllIl[13] = "  ".length();
        lIIIIIIlIllIl[14] = "   ".length();
        lIIIIIIlIllIl[15] = 174 ^ 170;
        lIIIIIIlIllIl[16] = (35 ^ 111) ^ (243 ^ 186);
        lIIIIIIlIllIl[17] = (((3 + 64) - (-63)) + 32) ^ (((137 + 80) - 152) + 99);
        lIIIIIIlIllIl[18] = 190 ^ 182;
    }

    static {
        lIIlIllllIlllIl();
        lIIlIllllIllIlI();
    }
}

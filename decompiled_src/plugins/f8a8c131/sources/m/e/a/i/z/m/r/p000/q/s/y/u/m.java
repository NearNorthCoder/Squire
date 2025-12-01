package m.e.a.i.z.m.r.p000.q.s.y.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Inventory;
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.m  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/m.class */
public abstract class m extends Task {
    protected final /* synthetic */ SquireZammyConfig H;
    private static /* synthetic */ String[] lIllIIIllllIl;
    private static /* synthetic */ int[] lIllIIIllllll;
    protected final /* synthetic */ l I;

    private static void llIIIlIllIIIIlI() {
        lIllIIIllllIl = new String[lIllIIIllllll[4]];
        lIllIIIllllIl[lIllIIIllllll[0]] = llIIIlIlIlllIIl("DrinCyOzEk8=", "Bpeux");
        lIllIIIllllIl[lIllIIIllllll[2]] = llIIIlIlIlllIlI("wRI5JMbIZHc=", "JkhiG");
        lIllIIIllllIl[lIllIIIllllll[3]] = llIIIlIlIlllIlI("bvrOl9yVlz0=", "YDlHM");
    }

    private static boolean llIIIlIllIIIlll(int i) {
        return i == 0;
    }

    private static String llIIIlIlIlllIlI(String llllllllllllllIllIIlIlIllIlIIlIl, String llllllllllllllIllIIlIlIllIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIllIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIllIlIIlll.init(lIllIIIllllll[3], secretKeySpec);
            return new String(llllllllllllllIllIIlIlIllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIllIlIIllI) {
            llllllllllllllIllIIlIlIllIlIIllI.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlIllIIIIll();
        llIIIlIllIIIIlI();
    }

    public m(SquireZammyConfig squireZammyConfig, l lVar) {
        this.H = squireZammyConfig;
        this.I = lVar;
    }

    private static boolean llIIIlIllIIIlII(int i) {
        return i != 0;
    }

    private static void llIIIlIllIIIIll() {
        lIllIIIllllll = new int[6];
        lIllIIIllllll[0] = ((((177 + 128) - 160) + 46) ^ (((97 + 62) - 47) + 25)) & (((((19 + 6) - (-65)) + 48) ^ (((121 + 81) - 24) + 10)) ^ (-" ".length()));
        lIllIIIllllll[1] = (((80 + 73) - (-21)) + 3) ^ (((60 + 116) - (-3)) + 3);
        lIllIIIllllll[2] = " ".length();
        lIllIIIllllll[3] = "  ".length();
        lIllIIIllllll[4] = "   ".length();
        lIllIIIllllll[5] = 12 ^ 4;
    }

    public boolean b(int[] iArr) {
        return Inventory.contains(iArr);
    }

    private static boolean llIIIlIllIIIllI(Object obj) {
        return obj != null;
    }

    private static String llIIIlIlIlllIIl(String llllllllllllllIllIIlIlIllIIlIllI, String llllllllllllllIllIIlIlIllIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIllIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIllIIlIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIllllll[5]), "DES");
            Cipher llllllllllllllIllIIlIlIllIIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIllIIllIlI.init(lIllIIIllllll[3], llllllllllllllIllIIlIlIllIIllIll);
            return new String(llllllllllllllIllIIlIlIllIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIllIIllIIl) {
            llllllllllllllIllIIlIlIllIIllIIl.printStackTrace();
            return null;
        }
    }

    public int[] K() {
        return a(this.H.mageGear());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean a(int[] iArr) {
        List all = Inventory.getAll(iArr);
        if (llIIIlIllIIIlII(all.isEmpty() ? 1 : 0)) {
            return lIllIIIllllll[0];
        }
        int i = lIllIIIllllll[0];
        while (llIIIlIllIIIlIl(i, Math.min(all.size(), lIllIIIllllll[1]))) {
            ((Item) all.get(i)).interact(str -> {
                if (!llIIIlIllIIIllI(str) || (llIIIlIllIIIlll(str.equals(lIllIIIllllIl[lIllIIIllllll[0]]) ? 1 : 0) && llIIIlIllIIIlll(str.equals(lIllIIIllllIl[lIllIIIllllll[2]]) ? 1 : 0) && !llIIIlIllIIIlII(str.equals(lIllIIIllllIl[lIllIIIllllll[3]]) ? 1 : 0))) {
                    return lIllIIIllllll[0];
                }
                ?? r0 = lIllIIIllllll[2];
                "".length();
                return (-"  ".length()) >= 0 ? ((95 ^ 97) ^ (10 ^ 5)) & (((((131 + 75) - 198) + 146) ^ (((126 + 18) - 108) + 135)) ^ (-" ".length())) : r0;
            });
            i++;
            "".length();
            if ("   ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIllIIIllllll[2];
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (llIIIlIllIIIllI(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
            return ids;
        }
        return new int[lIllIIIllllll[0]];
    }

    public int[] L() {
        return a(this.H.rangedGear());
    }

    private static boolean llIIIlIllIIIlIl(int i, int i2) {
        return i < i2;
    }
}

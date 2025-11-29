package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Enter instance", priority = 30, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.e  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIlIIIIIIlIl;
    private static /* synthetic */ String[] lIlIIIIIIIIl;
    private /* synthetic */ Player r;
    private final /* synthetic */ SquireDriftNet v;
    private final /* synthetic */ Client w;
    private final /* synthetic */ WorldPoint x = new WorldPoint(lIlIIIIIIlIl[0], lIlIIIIIIlIl[1], lIlIIIIIIlIl[2]);

    private static boolean llIlIIlIlllIII(Object obj) {
        return obj == null;
    }

    private static String llIlIIlIlIllIl(String lllllllllllllllIlllIlIIlIIIlIIlI, String lllllllllllllllIlllIlIIlIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIIIllll.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIIlIl[4], lllllllllllllllIlllIlIIlIIIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIIIlIIll) {
            lllllllllllllllIlllIlIIlIIIlIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public e(SquireDriftNet squireDriftNet, Client client) {
        this.v = squireDriftNet;
        this.w = client;
    }

    static {
        llIlIIlIllIlll();
        llIlIIlIllIIll();
    }

    private static void llIlIIlIllIlll() {
        lIlIIIIIIlIl = new int[20];
        lIlIIIIIIlIl[0] = (-(235 ^ 174)) & (-4363) & 8159;
        lIlIIIIIIlIl[1] = (-5889) & 16183;
        lIlIIIIIIlIl[2] = " ".length();
        lIlIIIIIIlIl[3] = (187 ^ 131) & ((26 ^ 34) ^ (-1));
        lIlIIIIIIlIl[4] = "  ".length();
        lIlIIIIIIlIl[5] = "   ".length();
        lIlIIIIIIlIl[6] = ((19 ^ 91) & ((26 ^ 82) ^ (-1))) ^ (166 ^ 162);
        lIlIIIIIIlIl[7] = 115 ^ 118;
        lIlIIIIIIlIl[8] = (((102 + 67) - 52) + 41) ^ (((34 + 37) - (-59)) + 22);
        lIlIIIIIIlIl[9] = (((136 + 127) - 184) + 64) ^ (((107 + 21) - 15) + 23);
        lIlIIIIIIlIl[10] = 33 ^ 41;
        lIlIIIIIIlIl[11] = ((122 ^ 68) & ((4 ^ 58) ^ (-1))) ^ (105 ^ 96);
        lIlIIIIIIlIl[12] = (((127 ^ 30) + (64 ^ 83)) - (-(188 ^ 156))) + (176 ^ 132);
        lIlIIIIIIlIl[13] = 146 ^ 152;
        lIlIIIIIIlIl[14] = 170 ^ 161;
        lIlIIIIIIlIl[15] = (45 ^ 109) ^ (27 ^ 87);
        lIlIIIIIIlIl[16] = (53 ^ 89) ^ (103 ^ 6);
        lIlIIIIIIlIl[17] = 150 ^ 152;
        lIlIIIIIIlIl[18] = (((120 + 1) - 120) + 143) ^ (((28 + 149) - 106) + 88);
        lIlIIIIIIlIl[19] = 36 ^ 52;
    }

    private static String llIlIIlIlIllll(String lllllllllllllllIlllIlIIlIIIIIlIl, String lllllllllllllllIlllIlIIlIIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIIIIlll.init(lIlIIIIIIlIl[4], lllllllllllllllIlllIlIIlIIIIlIII);
            return new String(lllllllllllllllIlllIlIIlIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIIIIIllI) {
            lllllllllllllllIlllIlIIlIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIllllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIlIlllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    public boolean run() {
        this.r = Players.getLocal();
        if (llIlIIlIlllIII(this.r)) {
            return lIlIIIIIIlIl[3];
        }
        if (llIlIIlIlllIIl(this.w.isInInstancedRegion() ? 1 : 0)) {
            String[] strArr = new String[lIlIIIIIIlIl[2]];
            strArr[lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[3]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (llIlIIlIlllIlI(nearest) && llIlIIlIlllIll(this.r.getWorldLocation().getX(), nearest.getWorldLocation().getX())) {
                nearest.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[2]]);
                return lIlIIIIIIlIl[2];
            }
            Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            if (!llIlIIlIlllIlI(fromSlot) || (llIlIIlIllllII(fromSlot.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[4]]) ? 1 : 0) && !llIlIIlIlllIIl(fromSlot.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[5]]) ? 1 : 0))) {
                if (!llIlIIlIlllIIl(Dialog.hasOption(str -> {
                    return str.toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[18]]);
                }) ? 1 : 0)) {
                    Item first = Inventory.getFirst(item -> {
                        if (!llIlIIlIllllII(item.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[16]]) ? 1 : 0) || llIlIIlIlllIIl(item.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[17]]) ? 1 : 0)) {
                            ?? r0 = lIlIIIIIIlIl[2];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIIIIIlIl[3];
                    });
                    if (llIlIIlIlllIlI(first)) {
                        first.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[7]]);
                    }
                    return lIlIIIIIIlIl[2];
                }
                String[] strArr2 = new String[lIlIIIIIIlIl[2]];
                strArr2[lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[6]];
                Dialog.chooseOption(strArr2);
                "".length();
                return lIlIIIIIIlIl[2];
            }
            return lIlIIIIIIlIl[3];
        } else if (!llIlIIlIlllIIl(Dialog.isViewingOptions() ? 1 : 0) || llIlIIlIllllII(Dialog.hasOption(str2 -> {
            return str2.toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIlIl[15]]);
        }) ? 1 : 0)) {
            WorldPoint worldPoint = this.x;
            String[] strArr3 = new String[lIlIIIIIIlIl[2]];
            strArr3[lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[8]];
            TileObject firstAt = TileObjects.getFirstAt(worldPoint, strArr3);
            if (llIlIIlIlllIlI(firstAt)) {
                firstAt.interact(lIlIIIIIIIIl[lIlIIIIIIlIl[9]]);
                return lIlIIIIIIlIl[2];
            }
            return lIlIIIIIIlIl[3];
        } else {
            if (llIlIIlIlllIIl(Dialog.hasOption(lIlIIIIIIIIl[lIlIIIIIIlIl[10]]) ? 1 : 0)) {
                String[] strArr4 = new String[lIlIIIIIIlIl[2]];
                strArr4[lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[11]];
                if (llIlIIlIllllIl(Inventory.getFirst(strArr4).getQuantity(), lIlIIIIIIlIl[12])) {
                    Log.error(lIlIIIIIIIIl[lIlIIIIIIlIl[13]]);
                    this.v.forceStop();
                    return lIlIIIIIIlIl[3];
                }
            }
            String[] strArr5 = new String[lIlIIIIIIlIl[2]];
            strArr5[lIlIIIIIIlIl[3]] = lIlIIIIIIIIl[lIlIIIIIIlIl[14]];
            Dialog.chooseOption(strArr5);
            "".length();
            return lIlIIIIIIlIl[2];
        }
    }

    private static boolean llIlIIlIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static String llIlIIlIlIlllI(String lllllllllllllllIlllIlIIlIIlIIlll, String lllllllllllllllIlllIlIIlIIlIIllI) {
        String lllllllllllllllIlllIlIIlIIlIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIlIIlIIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIlIIlIIlIIlII = lllllllllllllllIlllIlIIlIIlIIllI.toCharArray();
        int lllllllllllllllIlllIlIIlIIlIIIll = lIlIIIIIIlIl[3];
        char[] charArray = lllllllllllllllIlllIlIIlIIlIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIlIl[3];
        while (llIlIIlIllllIl(i, length)) {
            char lllllllllllllllIlllIlIIlIIlIlIII = charArray[i];
            lllllllllllllllIlllIlIIlIIlIIlIl.append((char) (lllllllllllllllIlllIlIIlIIlIlIII ^ lllllllllllllllIlllIlIIlIIlIIlII[lllllllllllllllIlllIlIIlIIlIIIll % lllllllllllllllIlllIlIIlIIlIIlII.length]));
            "".length();
            lllllllllllllllIlllIlIIlIIlIIIll++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIlIIlIIlIIlIl);
    }

    private static boolean llIlIIlIlllIIl(int i) {
        return i != 0;
    }

    private static void llIlIIlIllIIll() {
        lIlIIIIIIIIl = new String[lIlIIIIIIlIl[19]];
        lIlIIIIIIIIl[lIlIIIIIIlIl[3]] = llIlIIlIlIllIl("NrZrB64cjSvXWcnxenpZCw==", "AxWmk");
        lIlIIIIIIIIl[lIlIIIIIIlIl[2]] = llIlIIlIlIllIl("HPjjB1GgPU5Qza5y4B6H/w==", "eIkXg");
        lIlIIIIIIIIl[lIlIIIIIIlIl[4]] = llIlIIlIlIllIl("TjCJThxablQ=", "DYFDq");
        lIlIIIIIIIIl[lIlIIIIIIlIl[5]] = llIlIIlIlIlllI("IC8mCD0nIA==", "HNTxR");
        lIlIIIIIIIIl[lIlIIIIIIlIl[6]] = llIlIIlIlIllll("pknV/PzAnyg=", "OnvCy");
        lIlIIIIIIIIl[lIlIIIIIIlIl[7]] = llIlIIlIlIllIl("deLaV43OC2c=", "xrrzy");
        lIlIIIIIIIIl[lIlIIIIIIlIl[8]] = llIlIIlIlIllll("I7kIAt3IudQ=", "mkMkT");
        lIlIIIIIIIIl[lIlIIIIIIlIl[9]] = llIlIIlIlIlllI("IC04PTg=", "eCLXJ");
        lIlIIIIIIIIl[lIlIIIIIIlIl[10]] = llIlIIlIlIllIl("0U/256uiGI8=", "SkRMA");
        lIlIIIIIIIIl[lIlIIIIIIlIl[11]] = llIlIIlIlIllIl("lt7n/cqtP+/1YcnP05iP4A==", "IWqje");
        lIlIIIIIIIIl[lIlIIIIIIlIl[13]] = llIlIIlIlIllll("EWkWsE4HAUtWpKPeHZqnOe8HNyNq1fx7eLvphvMSC2DvupRguzfRgQ==", "amvTb");
        lIlIIIIIIIIl[lIlIIIIIIlIl[14]] = llIlIIlIlIllIl("sH9RsOmhO9/I8hGA9IFuDw==", "rqwqV");
        lIlIIIIIIIIl[lIlIIIIIIlIl[15]] = llIlIIlIlIllIl("S6782mcd4+lziITz04aZGg==", "POrzx");
        lIlIIIIIIIIl[lIlIIIIIIlIl[16]] = llIlIIlIlIllIl("dbDvWSBCswA=", "SBqhK");
        lIlIIIIIIIIl[lIlIIIIIIlIl[17]] = llIlIIlIlIllll("rFxfnfox2I4=", "TUMsd");
        lIlIIIIIIIIl[lIlIIIIIIlIl[18]] = llIlIIlIlIllIl("FOyxxLuR/EU=", "HAOuV");
    }

    private static boolean llIlIIlIllllII(int i) {
        return i == 0;
    }
}

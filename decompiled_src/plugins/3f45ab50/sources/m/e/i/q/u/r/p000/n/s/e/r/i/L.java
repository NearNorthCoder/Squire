package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Mining (Superheat)", priority = 100, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.L  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/L.class */
public class L extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ int[] lllllIIlIIIl;
    private /* synthetic */ SquireMiner l;
    private static /* synthetic */ String[] lllllIIlIIII;
    private final /* synthetic */ int[] ao;
    private static final /* synthetic */ int an;

    private static boolean lIIlIIlIlIlIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private void r() {
        if (lIIlIIlIlIlIIlI(Inventory.contains(this.ao) ? 1 : 0)) {
            Item first = Inventory.getFirst(this.ao);
            int[] iArr = new int[lllllIIlIIIl[3]];
            iArr[lllllIIlIIIl[1]] = lllllIIlIIIl[14];
            first.useOn(Inventory.getFirst(iArr));
            "".length();
            if (((((116 + 42) - 87) + 101) ^ (((7 + 162) - 58) + 57)) < 0) {
                return;
            }
            return;
        }
        int[] iArr2 = new int[lllllIIlIIIl[3]];
        iArr2[lllllIIlIIIl[1]] = lllllIIlIIIl[15];
        Item first2 = Inventory.getFirst(iArr2);
        int[] iArr3 = new int[lllllIIlIIIl[5]];
        iArr3[lllllIIlIIIl[1]] = lllllIIlIIIl[16];
        iArr3[lllllIIlIIIl[3]] = lllllIIlIIIl[17];
        first2.useOn(Inventory.getFirst(iArr3));
    }

    private static boolean lIIlIIlIlIlIIll(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIlIlIlIIII();
        lIIlIIlIlIIllll();
        an = lllllIIlIIIl[11];
    }

    private static String lIIlIIlIlIIlllI(String lllllllllllllllIIlIIllIIIlIllIll, String lllllllllllllllIIlIIllIIIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), lllllIIlIIIl[20]), "DES");
            Cipher lllllllllllllllIIlIIllIIIlIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIIIlIlllIl.init(lllllIIlIIIl[5], lllllllllllllllIIlIIllIIIlIllllI);
            return new String(lllllllllllllllIIlIIllIIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIlIlllII) {
            lllllllllllllllIIlIIllIIIlIlllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (lIIlIIlIlIlIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (lIIlIIlIlIlIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        if (lIIlIIlIlIlIIlI(Inventory.contains(this.ao) ? 1 : 0)) {
            int[] iArr = new int[lllllIIlIIIl[3]];
            iArr[lllllIIlIIIl[1]] = lllllIIlIIIl[14];
            if (lIIlIIlIlIlIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIIlIIIl[3]];
                iArr2[lllllIIlIIIl[1]] = lllllIIlIIIl[18];
            }
        }
        int[] iArr3 = new int[lllllIIlIIIl[3]];
        iArr3[lllllIIlIIIl[1]] = lllllIIlIIIl[15];
        if (lIIlIIlIlIlIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lllllIIlIIIl[3]];
            iArr4[lllllIIlIIIl[1]] = lllllIIlIIIl[17];
            if (lIIlIIlIlIlIllI(Inventory.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllllIIlIIIl[3]];
                iArr5[lllllIIlIIIl[1]] = lllllIIlIIIl[16];
            }
            ?? r0 = lllllIIlIIIl[3];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllllIIlIIIl[1];
    }

    private static boolean lIIlIIlIlIlIllI(int i) {
        return i == 0;
    }

    private static void lIIlIIlIlIlIIII() {
        lllllIIlIIIl = new int[25];
        lllllIIlIIIl[0] = 139 ^ 143;
        lllllIIlIIIl[1] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lllllIIlIIIl[2] = ((189 + 134) - 290) + 216;
        lllllIIlIIIl[3] = " ".length();
        lllllIIlIIIl[4] = ((142 + 244) - 208) + 73;
        lllllIIlIIIl[5] = "  ".length();
        lllllIIlIIIl[6] = (((11 ^ 46) + (42 ^ 92)) - (((111 + 123) - 220) + 139)) + ((239 + 73) - 311) + 250;
        lllllIIlIIIl[7] = "   ".length();
        lllllIIlIIIl[8] = ((207 + 100) - 224) + 172;
        lllllIIlIIIl[9] = (190 ^ 175) ^ (111 ^ 103);
        lllllIIlIIIl[10] = (-24072) & 24511;
        lllllIIlIIIl[11] = (-19755) & 20479;
        lllllIIlIIIl[12] = (89 ^ 2) ^ (240 ^ 174);
        lllllIIlIIIl[13] = (10 ^ 70) ^ (76 ^ 6);
        lllllIIlIIIl[14] = (-((-8779) & 14955)) & (-16385) & 24499;
        lllllIIlIIIl[15] = (-19469) & 20414;
        lllllIIlIIIl[16] = (-((-565) & 25143)) & (-1601) & 32510;
        lllllIIlIIIl[17] = (-((-10719) & 28639)) & (-8195) & 32447;
        lllllIIlIIIl[18] = ((167 + 172) - 235) + 129;
        lllllIIlIIIl[19] = (211 ^ 192) ^ (14 ^ 26);
        lllllIIlIIIl[20] = 80 ^ 88;
        lllllIIlIIIl[21] = (-((-1217) & 18387)) & (-4105) & 32638;
        lllllIIlIIIl[22] = (-20889) & 32253;
        lllllIIlIIIl[23] = (-25346) & 28581;
        lllllIIlIIIl[24] = 23 ^ 30;
    }

    private static boolean lIIlIIlIlIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIlIlIllIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIIlIlIIllIl(String lllllllllllllllIIlIIllIIIlIIlIll, String lllllllllllllllIIlIIllIIIlIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIIlIIlIII = lllllllllllllllIIlIIllIIIlIIlIlI.toCharArray();
        int lllllllllllllllIIlIIllIIIlIIIlll = lllllIIlIIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlIIllIIIIllllll = lllllIIlIIIl[1];
        while (lIIlIIlIlIllIIl(lllllllllllllllIIlIIllIIIIllllll, length)) {
            sb.append((char) (charArray[lllllllllllllllIIlIIllIIIIllllll] ^ lllllllllllllllIIlIIllIIIlIIlIII[lllllllllllllllIIlIIllIIIlIIIlll % lllllllllllllllIIlIIllIIIlIIlIII.length]));
            "".length();
            lllllllllllllllIIlIIllIIIlIIIlll++;
            lllllllllllllllIIlIIllIIIIllllll++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIIlIlIIllII(String lllllllllllllllIIlIIllIIIllIlIII, String lllllllllllllllIIlIIllIIIllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIllIlIlI.init(lllllIIlIIIl[5], lllllllllllllllIIlIIllIIIllIlIll);
            return new String(lllllllllllllllIIlIIllIIIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIllIlIIl) {
            lllllllllllllllIIlIIllIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIlIlIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public boolean run() {
        if (!lIIlIIlIlIlIIIl(this.f.activity(), EnumC0000a.SUPERHEAT_MINE) && !lIIlIIlIlIlIIlI(Inventory.isFull() ? 1 : 0) && !lIIlIIlIlIlIIlI(Bank.isOpen() ? 1 : 0)) {
            Player local = Players.getLocal();
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIlIIlIlIlIIlI(List.of(Integer.valueOf(lllllIIlIIIl[21]), Integer.valueOf(lllllIIlIIIl[22])).contains(Integer.valueOf(tileObject.getId())) ? 1 : 0) && lIIlIIlIlIllIIl(tileObject.getWorldY(), lllllIIlIIIl[23])) {
                    ?? r0 = lllllIIlIIIl[3];
                    "".length();
                    return (-((((62 + 31) - 40) + 88) ^ (((99 + 24) - 116) + 130))) >= 0 ? ((174 ^ 169) ^ (163 ^ 187)) & (((124 ^ 68) ^ (66 ^ 101)) ^ (-" ".length())) : r0;
                }
                return lllllIIlIIIl[1];
            });
            if (!lIIlIIlIlIlIIll(nearest) || lIIlIIlIlIlIlII(nearest.distanceTo(local.getWorldLocation()), lllllIIlIIIl[9])) {
                Item first = Equipment.getFirst(item -> {
                    return item.getName().contains(lllllIIlIIII[lllllIIlIIIl[20]]);
                });
                if (lIIlIIlIlIlIlIl(first)) {
                    first = Inventory.getFirst(item2 -> {
                        return item2.getName().contains(lllllIIlIIII[lllllIIlIIIl[19]]);
                    });
                }
                if (lIIlIIlIlIlIlIl(first)) {
                    Log.info(lllllIIlIIII[lllllIIlIIIl[1]]);
                    return lllllIIlIIIl[1];
                }
                String[] strArr = new String[lllllIIlIIIl[5]];
                strArr[lllllIIlIIIl[1]] = lllllIIlIIII[lllllIIlIIIl[3]];
                strArr[lllllIIlIIIl[3]] = lllllIIlIIII[lllllIIlIIIl[5]];
                first.interact(strArr);
                sleep(lllllIIlIIIl[7]);
                return lllllIIlIIIl[3];
            }
            if (lIIlIIlIlIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
                Log.info(lllllIIlIIII[lllllIIlIIIl[7]]);
                Movement.toggleRun();
            }
            int[] iArr = new int[lllllIIlIIIl[3]];
            iArr[lllllIIlIIIl[1]] = lllllIIlIIIl[10];
            Item first2 = Inventory.getFirst(iArr);
            SpellBook.Standard standard = SpellBook.Standard.SUPERHEAT_ITEM;
            if (lIIlIIlIlIlIIll(first2) && lIIlIIlIlIlIlll(local.getAnimation(), lllllIIlIIIl[11])) {
                if (lIIlIIlIlIlIllI(standard.canCast() ? 1 : 0)) {
                    Log.info(lllllIIlIIII[lllllIIlIIIl[0]]);
                    this.l.forceStop();
                }
                int[] iArr2 = new int[lllllIIlIIIl[3]];
                iArr2[lllllIIlIIIl[1]] = lllllIIlIIIl[10];
                standard.castOn(Inventory.getFirst(iArr2));
            }
            if (lIIlIIlIlIlIIlI(Players.getLocal().getWorldLocation().toWorldArea().isInMeleeDistance(nearest.getWorldLocation()) ? 1 : 0)) {
                nearest.interact(lllllIIlIIII[lllllIIlIIIl[12]]);
                sleep(lllllIIlIIIl[3]);
                return lllllIIlIIIl[3];
            }
            if (lIIlIIlIlIlIIlI(n() ? 1 : 0) && lIIlIIlIlIllIII(local.distanceTo(nearest), lllllIIlIIIl[7])) {
                r();
            }
            nearest.interact(lllllIIlIIII[lllllIIlIIIl[13]]);
            sleep(lllllIIlIIIl[3]);
            return lllllIIlIIIl[3];
        }
        return lllllIIlIIIl[1];
    }

    private static boolean lIIlIIlIlIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIlIlIlIlll(int i, int i2) {
        return i != i2;
    }

    public L() {
        int[] iArr = new int[lllllIIlIIIl[0]];
        iArr[lllllIIlIIIl[1]] = lllllIIlIIIl[2];
        iArr[lllllIIlIIIl[3]] = lllllIIlIIIl[4];
        iArr[lllllIIlIIIl[5]] = lllllIIlIIIl[6];
        iArr[lllllIIlIIIl[7]] = lllllIIlIIIl[8];
        this.ao = iArr;
    }

    private static boolean lIIlIIlIlIlIlIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIIlIlIIllll() {
        lllllIIlIIII = new String[lllllIIlIIIl[24]];
        lllllIIlIIII[lllllIIlIIIl[1]] = lIIlIIlIlIIllII("jtK4+HzLrKbWUrh545fKBRN3UcTdBOXl", "UeKDM");
        lllllIIlIIII[lllllIIlIIIl[3]] = lIIlIIlIlIIllIl("Bgs8AB8/ASAYTB8BPgQcJBYm", "KdRal");
        lllllIIlIIII[lllllIIlIIIl[5]] = lIIlIIlIlIIlllI("rYCE+wUd0xbf7NqpPcTG1JAhDWd+uWdr", "fTXtc");
        lllllIIlIIII[lllllIIlIIIl[7]] = lIIlIIlIlIIlllI("QmYOuPvCcC3FukqOiviyZwGNmzev4kNKNnY/g7Pig94=", "necgi");
        lllllIIlIIII[lllllIIlIIIl[0]] = lIIlIIlIlIIllIl("Ei9zLScrbSduJSQ5J241MDo2PC4gKydiZjY+PD42LCQ0YA==", "EJSNF");
        lllllIIlIIII[lllllIIlIIIl[12]] = lIIlIIlIlIIllIl("HBM8Kg==", "QzROE");
        lllllIIlIIII[lllllIIlIIIl[13]] = lIIlIIlIlIIllIl("DBkrDg==", "ApEkC");
        lllllIIlIIII[lllllIIlIIIl[19]] = lIIlIIlIlIIlllI("kxjCFqcDPT1zsytke0yBOQ==", "crFiY");
        lllllIIlIIII[lllllIIlIIIl[20]] = lIIlIIlIlIIlllI("962ZyIEg7E0DaG5cQdzLfg==", "IcpPR");
    }
}

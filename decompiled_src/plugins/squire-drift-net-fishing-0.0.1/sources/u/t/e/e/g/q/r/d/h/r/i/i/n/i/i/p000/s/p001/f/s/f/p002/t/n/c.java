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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Banking", priority = 35, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.c  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/c.class */
public class c extends Task {
    private static /* synthetic */ int[] lIlIIIIIlllI;
    private static /* synthetic */ String[] lIlIIIIIlIlI;
    private /* synthetic */ Player r;
    private final /* synthetic */ Client q;
    private final /* synthetic */ SquireDriftNet p;

    private static String llIlIIllIlIllI(String lllllllllllllllIlllIIlllllIlIlIl, String lllllllllllllllIlllIIlllllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllllIlIlll.init(lIlIIIIIlllI[2], secretKeySpec);
            return new String(lllllllllllllllIlllIIlllllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllllIlIllI) {
            lllllllllllllllIlllIIlllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static String llIlIIllIllIlI(String lllllllllllllllIlllIIllllllIlIlI, String lllllllllllllllIlllIIllllllIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllllllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIllllllIlIIl.toCharArray();
        int lllllllllllllllIlllIIllllllIIllI = lIlIIIIIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIlllI[0];
        while (llIlIIlllIlIII(i, length)) {
            char lllllllllllllllIlllIIlllllIlllIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIIlllllIlllIl ^ charArray[lllllllllllllllIlllIIllllllIIllI % charArray.length]));
            "".length();
            lllllllllllllllIlllIIllllllIIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean run() {
        if (llIlIIlllIIlII(this.q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlllI[0];
        }
        this.r = Players.getLocal();
        if (!llIlIIlllIIlIl(this.r) || llIlIIlllIIlII(this.r.getPlane())) {
            return lIlIIIIIlllI[0];
        }
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (llIlIIlllIIlIl(fromSlot)) {
            if (llIlIIlllIIllI(Inventory.getFreeSlots())) {
                fromSlot.interact(lIlIIIIIlIlI[lIlIIIIIlllI[0]]);
                return lIlIIIIIlllI[1];
            }
            String[] strArr = new String[lIlIIIIIlllI[1]];
            strArr[lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[1]];
            Item first = Inventory.getFirst(strArr);
            if (llIlIIlllIIlIl(first)) {
                first.interact(lIlIIIIIlIlI[lIlIIIIIlllI[2]]);
                return lIlIIIIIlllI[1];
            }
            String[] strArr2 = new String[lIlIIIIIlllI[1]];
            strArr2[lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[3]];
            Item first2 = Inventory.getFirst(strArr2);
            if (llIlIIlllIIlIl(first2)) {
                first2.interact(lIlIIIIIlIlI[lIlIIIIIlllI[4]]);
            }
            return lIlIIIIIlllI[1];
        } else if (!llIlIIlllIIlII(this.p.g().matchesInventory() ? 1 : 0)) {
            if (!llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                sleep(lIlIIIIIlllI[3]);
                return lIlIIIIIlllI[1];
            }
            if (llIlIIlllIIlll(this.p.g().matchesInventory() ? 1 : 0)) {
                this.p.g().withdraw();
                "".length();
                sleep(lIlIIIIIlllI[6]);
            }
            return lIlIIIIIlllI[1];
        } else {
            if (llIlIIlllIIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIlIIIIIlllI[0]);
            }
            if (llIlIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lIlIIIIIlllI[1];
            } else if (llIlIIlllIIlll(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIlIIIIIlllI[1];
            } else {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    String[] strArr3 = new String[lIlIIIIIlllI[1]];
                    strArr3[lIlIIIIIlllI[0]] = lIlIIIIIlIlI[lIlIIIIIlllI[8]];
                    if (llIlIIlllIIlII(tileObject.hasAction(strArr3) ? 1 : 0) && llIlIIlllIIlII(tileObject.getName().contains(lIlIIIIIlIlI[lIlIIIIIlllI[9]]) ? 1 : 0)) {
                        ?? r0 = lIlIIIIIlllI[1];
                        "".length();
                        return (((((84 + 30) - 52) + 75) ^ (((18 + 127) - (-15)) + 3)) & (((121 ^ 1) ^ (229 ^ 183)) ^ (-" ".length()))) < 0 ? ((((89 + 17) - 61) + 130) ^ (((60 + 185) - 60) + 6)) & (((102 ^ 15) ^ (5 ^ 124)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIIIlllI[0];
                });
                if (llIlIIlllIIlIl(nearest)) {
                    if (llIlIIlllIlIII(this.q.getWeight(), lIlIIIIIlllI[5])) {
                        nearest.interact(lIlIIIIIlIlI[lIlIIIIIlllI[6]]);
                        return lIlIIIIIlllI[1];
                    }
                    Log.error(lIlIIIIIlIlI[lIlIIIIIlllI[7]]);
                    this.p.forceStop();
                    return lIlIIIIIlllI[1];
                }
                return lIlIIIIIlllI[1];
            }
        }
    }

    private static boolean llIlIIlllIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIlllIlIII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public c(SquireDriftNet squireDriftNet, Client client) {
        this.p = squireDriftNet;
        this.q = client;
    }

    private static boolean llIlIIlllIIlll(int i) {
        return i == 0;
    }

    private static boolean llIlIIlllIIllI(int i) {
        return i > 0;
    }

    private static void llIlIIlllIIIll() {
        lIlIIIIIlllI = new int[11];
        lIlIIIIIlllI[0] = ((235 ^ 188) ^ (238 ^ 148)) & (((114 ^ 44) ^ (103 ^ 20)) ^ (-" ".length()));
        lIlIIIIIlllI[1] = " ".length();
        lIlIIIIIlllI[2] = "  ".length();
        lIlIIIIIlllI[3] = "   ".length();
        lIlIIIIIlllI[4] = (((3 + 84) - 47) + 104) ^ (((27 + 85) - 16) + 52);
        lIlIIIIIlllI[5] = 175 ^ 179;
        lIlIIIIIlllI[6] = 139 ^ 142;
        lIlIIIIIlllI[7] = 65 ^ 71;
        lIlIIIIIlllI[8] = 197 ^ 194;
        lIlIIIIIlllI[9] = (((170 + 80) - 74) + 11) ^ (((122 + 96) - 173) + 134);
        lIlIIIIIlllI[10] = 52 ^ 61;
    }

    private static String llIlIIllIlIIll(String lllllllllllllllIlllIIllllllllIlI, String lllllllllllllllIlllIIllllllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllllllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlllI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIlllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllllllllIll) {
            lllllllllllllllIlllIIllllllllIll.printStackTrace();
            return null;
        }
    }

    private static void llIlIIllIlllII() {
        lIlIIIIIlIlI = new String[lIlIIIIIlllI[10]];
        lIlIIIIIlIlI[lIlIIIIIlllI[0]] = llIlIIllIlIIll("F9zFFmGevJo=", "uyTLL");
        lIlIIIIIlIlI[lIlIIIIIlllI[1]] = llIlIIllIlIIll("rG+xDunthOg=", "ptLyv");
        lIlIIIIIlIlI[lIlIIIIIlllI[2]] = llIlIIllIlIllI("A+4/HP6EkKQ=", "dQdsm");
        lIlIIIIIlIlI[lIlIIIIIlllI[3]] = llIlIIllIlIIll("tVdIlgaVlI8q5dpOreiSLg==", "AIFSp");
        lIlIIIIIlIlI[lIlIIIIIlllI[4]] = llIlIIllIlIllI("epZ4bM+33is=", "dmifw");
        lIlIIIIIlIlI[lIlIIIIIlllI[6]] = llIlIIllIlIIll("z9MMHBGtYio=", "kDPDB");
        lIlIIIIIlIlI[lIlIIIIIlllI[7]] = llIlIIllIllIlI("HxYWaDU0HEM8OylZCy01MABCaAApDQIkdDEcCi88MlkLKSdmDQxoNiNZFiYwIwtDemwtHg==", "FycHT");
        lIlIIIIIlIlI[lIlIIIIIlllI[8]] = llIlIIllIlIIll("ODHqk1ew9KI=", "sRPxK");
        lIlIIIIIlIlI[lIlIIIIIlllI[9]] = llIlIIllIllIlI("FwkNLikkEg==", "EfzLF");
    }

    private static boolean llIlIIlllIIlII(int i) {
        return i != 0;
    }

    static {
        llIlIIlllIIIll();
        llIlIIllIlllII();
    }
}

package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Taking loot", priority = 10, blocking = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.s  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/s.class */
public class s extends u {
    private static /* synthetic */ String[] lIlIllIllIIIl;
    private static final /* synthetic */ int aa;
    private static /* synthetic */ int[] lIlIllIllIlIl;

    private static String llIIIIIlIllllIl(String llllllllllllllIllIlIIIlIIlIlIIlI, String llllllllllllllIllIlIIIlIIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIlIIlIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIlIIlIlIlII.init(lIlIllIllIlIl[2], llllllllllllllIllIlIIIlIIlIlIlIl);
            return new String(llllllllllllllIllIlIIIlIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIIlIlIIll) {
            llllllllllllllIllIlIIIlIIlIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean e(int i) {
        if (llIIIIIllIIllIl(Inventory.getFreeSlots(), i)) {
            ?? r0 = lIlIllIllIlIl[1];
            "".length();
            return (-" ".length()) >= (141 ^ 137) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllIllIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        return lIlIllIllIlIl[0];
    }

    private static boolean llIIIIIllIIllIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIIllIIllII(Object obj) {
        return obj != null;
    }

    private static String llIIIIIllIIIlII(String llllllllllllllIllIlIIIlIIlIIIlIl, String llllllllllllllIllIlIIIlIIlIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIllIllIlIl[10]), "DES");
            Cipher llllllllllllllIllIlIIIlIIlIIIlll = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIIlIIIlll.init(lIlIllIllIlIl[2], llllllllllllllIllIlIIIlIIlIIlIII);
            return new String(llllllllllllllIllIlIIIlIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIIlIIIllI) {
            llllllllllllllIllIlIIIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIIlIlI(int i) {
        return i != 0;
    }

    private static boolean llIIIIIllIIllll(int i, int i2) {
        return i < i2;
    }

    private static void llIIIIIllIIIlll() {
        lIlIllIllIlIl = new int[12];
        lIlIllIllIlIl[0] = ((((46 + 18) - 26) + 134) ^ (((160 + 14) - 76) + 63)) & (((15 ^ 32) ^ (83 ^ 113)) ^ (-" ".length()));
        lIlIllIllIlIl[1] = " ".length();
        lIlIllIllIlIl[2] = "  ".length();
        lIlIllIllIlIl[3] = "   ".length();
        lIlIllIllIlIl[4] = 23 ^ 19;
        lIlIllIllIlIl[5] = 114 ^ 119;
        lIlIllIllIlIl[6] = (114 ^ 116) ^ ((28 ^ 60) & ((13 ^ 45) ^ (-1)));
        lIlIllIllIlIl[7] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIlIllIllIlIl[8] = (-((-6930) & 8055)) & (-19) & 6143;
        lIlIllIllIlIl[9] = 129 ^ 134;
        lIlIllIllIlIl[10] = 142 ^ 134;
        lIlIllIllIlIl[11] = (112 ^ 2) ^ (12 ^ 119);
    }

    private static String llIIIIIlIllllII(String llllllllllllllIllIlIIIlIIIllIlIl, String llllllllllllllIllIlIIIlIIIllIlII) {
        String llllllllllllllIllIlIIIlIIIllIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIIIllIIlI = llllllllllllllIllIlIIIlIIIllIlII.toCharArray();
        int llllllllllllllIllIlIIIlIIIlIllII = lIlIllIllIlIl[0];
        char[] charArray = llllllllllllllIllIlIIIlIIIllIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIllIllIlIl[0];
        while (llIIIIIllIIllll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIlIIIlIIIllIIlI[llllllllllllllIllIlIIIlIIIlIllII % llllllllllllllIllIlIIIlIIIllIIlI.length]));
            "".length();
            llllllllllllllIllIlIIIlIIIlIllII++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIIIIIllIIIlll();
        llIIIIIllIIIlIl();
        aa = lIlIllIllIlIl[8];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean run() {
        if (llIIIIIllIIlIII(this.W.g() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        List all = TileItems.getAll(tileItem -> {
            if (!(llIIIIIllIIlIlI(tileItem.isTradable() ? 1 : 0) && llIIIIIllIIllIl(Prices.getItemPrice(tileItem.getId()) * tileItem.getQuantity(), lIlIllIllIlIl[8]) && llIIIIIllIIlIII(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[9]]) ? 1 : 0) && !llIIIIIllIIlIlI(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[10]]) ? 1 : 0)) && llIIIIIllIIlIlI(Reachable.isInteractable(tileItem) ? 1 : 0)) {
                ?? r0 = lIlIllIllIlIl[1];
                "".length();
                return (158 ^ 154) > (198 ^ 194) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIllIlIl[0];
        });
        if (llIIIIIllIIlIlI(all.isEmpty() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        TileItem tileItem2 = (TileItem) all.stream().max(Comparator.comparingInt(tileItem3 -> {
            if (llIIIIIllIIlIII(tileItem3.isTradable() ? 1 : 0)) {
                int i = lIlIllIllIlIl[7];
                "".length();
                return " ".length() > "  ".length() ? (156 ^ 148) & ((127 ^ 119) ^ (-1)) : i;
            }
            return Prices.getItemPrice(tileItem3.getId()) * tileItem3.getQuantity();
        })).orElse(null);
        if ((!llIIIIIllIIlIII(tileItem2.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[0]]) ? 1 : 0) || llIIIIIllIIlIlI(tileItem2.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[1]]) ? 1 : 0)) && llIIIIIllIIlIlI(e(lIlIllIllIlIl[2]) ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        if (llIIIIIllIIlIlI(e(lIlIllIllIlIl[1]) ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[lIlIllIllIlIl[1]];
                strArr[lIlIllIllIlIl[0]] = lIlIllIllIIIl[lIlIllIllIlIl[4]];
                if (!llIIIIIllIIlIlI(item.hasAction(strArr) ? 1 : 0) || (llIIIIIllIIlIII(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[5]]) ? 1 : 0) && !llIIIIIllIIlIlI(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[6]]) ? 1 : 0))) {
                    return lIlIllIllIlIl[0];
                }
                ?? r0 = lIlIllIllIlIl[1];
                "".length();
                return (-(66 ^ 70)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            if (llIIIIIllIIllII(first)) {
                first.interact(lIlIllIllIIIl[lIlIllIllIlIl[2]]);
            }
        }
        tileItem2.interact(lIlIllIllIIIl[lIlIllIllIlIl[3]]);
        return lIlIllIllIlIl[1];
    }

    private static void llIIIIIllIIIlIl() {
        lIlIllIllIIIl = new String[lIlIllIllIlIl[11]];
        lIlIllIllIIIl[lIlIllIllIlIl[0]] = llIIIIIlIllllII("NhcuOxQ0", "FeOBq");
        lIlIllIllIIIl[lIlIllIllIlIl[1]] = llIIIIIlIllllIl("Eda0YsRg35I=", "gGDXt");
        lIlIllIllIIIl[lIlIllIllIlIl[2]] = llIIIIIlIllllII("NwIDFw==", "splgY");
        lIlIllIllIIIl[lIlIllIllIlIl[3]] = llIIIIIlIllllIl("RUMaAEnMp3o=", "pVqXU");
        lIlIllIllIIIl[lIlIllIllIlIl[4]] = llIIIIIllIIIlII("drbh4QvFT40=", "lsSlI");
        lIlIllIllIIIl[lIlIllIllIlIl[5]] = llIIIIIlIllllII("MQIqKCkz", "ApKQL");
        lIlIllIllIIIl[lIlIllIllIlIl[6]] = llIIIIIlIllllIl("VjwGdK/9Cms=", "VmRuF");
        lIlIllIllIIIl[lIlIllIllIlIl[9]] = llIIIIIlIllllIl("8Bb9zBk8aO4=", "eLLkn");
        lIlIllIllIIIl[lIlIllIllIlIl[10]] = llIIIIIllIIIlII("6SmZd9MyFc8=", "YjnGM");
    }

    private static boolean llIIIIIllIIlIII(int i) {
        return i == 0;
    }
}

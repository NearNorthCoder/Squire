/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handling rope swing")
public class y
extends x {
    private final /* synthetic */ List<TileObject> aj;
    private static /* synthetic */ String[] lIIllIIllIlll;
    private static /* synthetic */ int[] lIIllIIlllIll;

    @Inject
    protected y(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIlllIll[0]];
        nArray[y.lIIllIIlllIll[1]] = lIIllIIlllIll[2];
        super(templeTrekkingPlugin, nArray);
        this.aj = new ArrayDeque();
    }

    private static boolean lIllIIIIIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIllllllllllI(String llllllllllllllIllllIIIIIIllIIlIl, String llllllllllllllIllllIIIIIIllIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIIllIIlll.init(lIIllIIlllIll[3], llllllllllllllIllllIIIIIIllIlIII);
            return new String(llllllllllllllIllllIIIIIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIIllIIllI) {
            llllllllllllllIllllIIIIIIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIlIIIl() {
        lIIllIIlllIll = new int[18];
        y.lIIllIIlllIll[0] = " ".length();
        y.lIIllIIlllIll[1] = (0x9A ^ 0x9F) & ~(0x4A ^ 0x4F);
        y.lIIllIIlllIll[2] = 0x69 ^ 0x60;
        y.lIIllIIlllIll[3] = "  ".length();
        y.lIIllIIlllIll[4] = 60 + 121 - 59 + 11 ^ 76 + 87 - 131 + 96;
        y.lIIllIIlllIll[5] = "   ".length();
        y.lIIllIIlllIll[6] = 0xBE ^ 0x90 ^ (0x99 ^ 0xBF);
        y.lIIllIIlllIll[7] = 0x6F ^ 0x6B;
        y.lIIllIIlllIll[8] = 8 ^ 0xE;
        y.lIIllIIlllIll[9] = 112 + 43 - 75 + 83 ^ 119 + 148 - 221 + 118;
        y.lIIllIIlllIll[10] = 0x42 ^ 0x48;
        y.lIIllIIlllIll[11] = 0xAA ^ 0xA1;
        y.lIIllIIlllIll[12] = 8 ^ 0x7D ^ (0xD0 ^ 0xA9);
        y.lIIllIIlllIll[13] = 0x5E ^ 0x37 ^ (0xEF ^ 0x8B);
        y.lIIllIIlllIll[14] = 0x48 ^ 0x46;
        y.lIIllIIlllIll[15] = 0x83 ^ 0x8C;
        y.lIIllIIlllIll[16] = 0xE3 ^ 0x9D ^ (0xF1 ^ 0x9F);
        y.lIIllIIlllIll[17] = 28 + 101 - 80 + 137 ^ 58 + 170 - 177 + 120;
    }

    private static boolean lIllIIIIIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIIIIIlII() {
        lIIllIIllIlll = new String[lIIllIIlllIll[17]];
        y.lIIllIIllIlll[y.lIIllIIlllIll[1]] = y.lIlIllllllllllI("O4nWbjOH6i0pb9wwkHM3r+uj0WXYpdtB/rNnh/ornW9ZzWiq+mBp7Ig20qgaYJZ7MPPPgFKjTuDt1NgTdamOoA==", "mkAKm");
        y.lIIllIIllIlll[y.lIIllIIlllIll[0]] = y.lIllIIIIIIIIIII("EVseV7uCLA990206Z/60Qom8hq5D3Yuo4chBeSIKA8wtwGb5lj+223oTlOMR/vZgrzXoovFv1moT8qlu5zpNA8r+5CrZxzedTkG1PWV2xoDw1hvLUDx6IaZ97az+QgPMn1hRuRnWxthvlHy8VQ/nWw==", "bJcIs");
        y.lIIllIIllIlll[y.lIIllIIlllIll[3]] = y.lIlIllllllllllI("yd+etTZMEsOHzzOH/ajiPnjIXUn775zE+ql62VHRyNnuMReWLom5XmNq98P5A5Cc", "hFzVH");
        y.lIIllIIllIlll[y.lIIllIIlllIll[5]] = y.lIllIIIIIIIIIlI("GgUKBT43HwFcIysPDw==", "YjdqW");
        y.lIIllIIllIlll[y.lIIllIIlllIll[7]] = y.lIllIIIIIIIIIII("0Jc5BWqt7PvznmnPbvvXEA==", "SNRQD");
        y.lIIllIIllIlll[y.lIIllIIlllIll[4]] = y.lIlIllllllllllI("6uTxhXP/8dB91ASFBf5Waw==", "yhjtS");
        y.lIIllIIllIlll[y.lIIllIIlllIll[8]] = y.lIllIIIIIIIIIlI("LhgaC08UHhoJ", "bwtlo");
        y.lIIllIIllIlll[y.lIIllIIlllIll[9]] = y.lIllIIIIIIIIIII("Bqyyhp/j92C0RRcJLV1rBg==", "BwCgU");
        y.lIIllIIllIlll[y.lIIllIIlllIll[6]] = y.lIllIIIIIIIIIlI("Iy8HJyFQLBQvNFA6FCs/EzA=", "pXfJQ");
        y.lIIllIIllIlll[y.lIIllIIlllIll[2]] = y.lIllIIIIIIIIIlI("BwEFOCV0HwMkNA==", "TijJQ");
        y.lIIllIIllIlll[y.lIIllIIlllIll[10]] = y.lIlIllllllllllI("xhCXfakA42TjMTcfurhwVA==", "bZUaH");
        y.lIIllIIllIlll[y.lIIllIIlllIll[11]] = y.lIlIllllllllllI("xgWK+mPZGwx40mk4+Kf3Jw==", "DfYTc");
        y.lIIllIIllIlll[y.lIIllIIlllIll[12]] = y.lIllIIIIIIIIIII("CgTisyaWoRbaxgNgPZtvuQ==", "JdzUL");
        y.lIIllIIllIlll[y.lIIllIIlllIll[13]] = y.lIllIIIIIIIIIlI("BjsNZQcsIBw=", "ENyHq");
        y.lIIllIIllIlll[y.lIIllIIlllIll[14]] = y.lIllIIIIIIIIIlI("ETANPhxiMx42CWIlHjICIS8=", "BGlSl");
        y.lIIllIIllIlll[y.lIIllIIlllIll[15]] = y.lIlIllllllllllI("xpAbTqAslQdnfF7RvVaJ1w==", "CrvII");
        y.lIIllIIllIlll[y.lIIllIIlllIll[16]] = y.lIllIIIIIIIIIlI("FiAZOgE7OhJjHCcqHA==", "UOwNh");
    }

    private static String lIllIIIIIIIIIlI(String llllllllllllllIllllIIIIIIlIIIIll, String llllllllllllllIllllIIIIIIlIIIlll) {
        llllllllllllllIllllIIIIIIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIIIlIIIllI = new StringBuilder();
        char[] llllllllllllllIllllIIIIIIlIIIlIl = llllllllllllllIllllIIIIIIlIIIlll.toCharArray();
        int llllllllllllllIllllIIIIIIlIIIlII = lIIllIIlllIll[1];
        char[] llllllllllllllIllllIIIIIIIlllllI = llllllllllllllIllllIIIIIIlIIIIll.toCharArray();
        int llllllllllllllIllllIIIIIIIllllIl = llllllllllllllIllllIIIIIIIlllllI.length;
        int llllllllllllllIllllIIIIIIIllllII = lIIllIIlllIll[1];
        while (y.lIllIIIIIIllIIl(llllllllllllllIllllIIIIIIIllllII, llllllllllllllIllllIIIIIIIllllIl)) {
            char llllllllllllllIllllIIIIIIlIIlIIl = llllllllllllllIllllIIIIIIIlllllI[llllllllllllllIllllIIIIIIIllllII];
            llllllllllllllIllllIIIIIIlIIIllI.append((char)(llllllllllllllIllllIIIIIIlIIlIIl ^ llllllllllllllIllllIIIIIIlIIIlIl[llllllllllllllIllllIIIIIIlIIIlII % llllllllllllllIllllIIIIIIlIIIlIl.length]));
            "".length();
            ++llllllllllllllIllllIIIIIIlIIIlII;
            ++llllllllllllllIllllIIIIIIIllllII;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIIIlIIIllI);
    }

    private static boolean lIllIIIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean z() {
        y llllllllllllllIllllIIIIIIlllIlll;
        String string;
        if (y.lIllIIIIIIlIIlI(Dialog.isOpen() ? 1 : 0) && y.lIllIIIIIIlIIll((string = Dialog.getText()).length()) && (!y.lIllIIIIIIlIlII(string.contains(lIIllIIllIlll[lIIllIIlllIll[1]]) ? 1 : 0) || !y.lIllIIIIIIlIlII(string.contains(lIIllIIllIlll[lIIllIIlllIll[0]]) ? 1 : 0) || y.lIllIIIIIIlIIlI(string.contains(lIIllIIllIlll[lIIllIIlllIll[3]]) ? 1 : 0))) {
            return lIIllIIlllIll[1];
        }
        Player llllllllllllllIllllIIIIIIlllIllI = Players.getLocal();
        TileObject llllllllllllllIllllIIIIIIlllIlIl = llllllllllllllIllllIIIIIIlllIlll.A();
        if (y.lIllIIIIIIlIlIl(llllllllllllllIllllIIIIIIlllIlIl)) {
            return lIIllIIlllIll[1];
        }
        if (y.lIllIIIIIIlIllI(llllllllllllllIllllIIIIIIlllIllI.distanceTo((Locatable)llllllllllllllIllllIIIIIIlllIlIl), lIIllIIlllIll[4])) {
            llllllllllllllIllllIIIIIIlllIlll.aj.clear();
            llllllllllllllIllllIIIIIIlllIlIl.interact(lIIllIIllIlll[lIIllIIlllIll[5]]);
            return lIIllIIlllIll[0];
        }
        llllllllllllllIllllIIIIIIlllIlIl = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIIlllIll[0]];
            stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[16]];
            return tileObject.hasAction(stringArray);
        });
        if (y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIlIl) && y.lIllIIIIIIlIllI(llllllllllllllIllllIIIIIIlllIlIl.distanceTo((Locatable)llllllllllllllIllllIIIIIIlllIllI), lIIllIIlllIll[6])) {
            llllllllllllllIllllIIIIIIlllIlIl.interact(lIIllIIllIlll[lIIllIIlllIll[7]]);
            return lIIllIIlllIll[0];
        }
        TileObject llllllllllllllIllllIIIIIIlllIlII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIllIIIIIIlIIlI(tileObject.getName().equals(lIIllIIllIlll[lIIllIIlllIll[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIlllIll[0]];
                stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[15]];
                if (y.lIllIIIIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIlllIll[0];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0xF8 ^ 0xB3 ^ (0x69 ^ 0x17)) & (0x73 ^ 0x5D ^ (0x51 ^ 0x4A) ^ -" ".length())) != 0;
                }
            }
            n2 = lIIllIIlllIll[1];
            return n2 != 0;
        });
        if (y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIlII)) {
            llllllllllllllIllllIIIIIIlllIlII.interact(lIIllIIllIlll[lIIllIIlllIll[4]]);
            return lIIllIIlllIll[0];
        }
        String[] stringArray = new String[lIIllIIlllIll[0]];
        stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[8]];
        if (y.lIllIIIIIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIllIIlllIll[0]];
            stringArray2[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[9]];
            Item llllllllllllllIllllIIIIIIlllIIll = Inventory.getFirst((String[])stringArray2);
            String[] stringArray3 = new String[lIIllIIlllIll[0]];
            stringArray3[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[6]];
            TileObject llllllllllllllIllllIIIIIIlllIIlI = TileObjects.getNearest((String[])stringArray3);
            if (y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIIll) && y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIIlI)) {
                llllllllllllllIllllIIIIIIlllIIll.useOn(llllllllllllllIllllIIIIIIlllIIlI);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        String[] stringArray4 = new String[lIIllIIlllIll[0]];
        stringArray4[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[2]];
        if (y.lIllIIIIIIllIII(Inventory.getCount((String[])stringArray4), lIIllIIlllIll[5])) {
            String[] stringArray5 = new String[lIIllIIlllIll[0]];
            stringArray5[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[10]];
            List llllllllllllllIllllIIIIIIlllIIll = Inventory.getAll((String[])stringArray5);
            Item llllllllllllllIllllIIIIIIlllIIlI = (Item)llllllllllllllIllllIIIIIIlllIIll.get(lIIllIIlllIll[1]);
            Item llllllllllllllIllllIIIIIIlllIIIl = (Item)llllllllllllllIllllIIIIIIlllIIll.get(lIIllIIlllIll[0]);
            if (y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIIlI) && y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIIIl)) {
                llllllllllllllIllllIIIIIIlllIIlI.useOn(llllllllllllllIllllIIIIIIlllIIIl);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        TileObject llllllllllllllIllllIIIIIIlllIIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIllIIIIIIlIIlI(tileObject.getName().equals(lIIllIIllIlll[lIIllIIlllIll[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIlllIll[0]];
                stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[13]];
                if (y.lIllIIIIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIlllIll[0];
                    "".length();
                    if (-(0x4E ^ 0x4A) < 0) return n2 != 0;
                    return ((0x7B ^ 0x59) & ~(0xE6 ^ 0xC4)) != 0;
                }
            }
            n2 = lIIllIIlllIll[1];
            return n2 != 0;
        });
        if (y.lIllIIIIIIlIlll(llllllllllllllIllllIIIIIIlllIIll)) {
            llllllllllllllIllllIIIIIIlllIIll.interact(lIIllIIllIlll[lIIllIIlllIll[11]]);
            return lIIllIIlllIll[0];
        }
        return lIIllIIlllIll[1];
    }

    static {
        y.lIllIIIIIIlIIIl();
        y.lIllIIIIIIIIlII();
    }

    private static boolean lIllIIIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIIlIIll(int n2) {
        return n2 > 0;
    }

    private static String lIllIIIIIIIIIII(String llllllllllllllIllllIIIIIIlIllIII, String llllllllllllllIllllIIIIIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIllIIlllIll[6]), "DES");
            Cipher llllllllllllllIllllIIIIIIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIIlIllIlI.init(lIIllIIlllIll[3], llllllllllllllIllllIIIIIIlIllIll);
            return new String(llllllllllllllIllllIIIIIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIIlIllIIl) {
            llllllllllllllIllllIIIIIIlIllIIl.printStackTrace();
            return null;
        }
    }
}


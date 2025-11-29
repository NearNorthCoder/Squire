/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Getting new seeds", priority=500, blocking=true)
public class o
extends r {
    private final /* synthetic */ Client V;
    private static /* synthetic */ int[] lIIlllllllIIl;
    private static /* synthetic */ String[] lIIllllllIlll;
    private static final /* synthetic */ int S;
    private final /* synthetic */ SquireTitheConfig U;
    private static final /* synthetic */ int T;

    private static boolean lIllIllIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lIllIllIIIlllII() {
        lIIlllllllIIl = new int[11];
        o.lIIlllllllIIl[0] = (0xCB ^ 0x80) & ~(0xF ^ 0x44);
        o.lIIlllllllIIl[1] = -(0xFFFFFEE3 & 0xDDF) & (0xFFFFDFFF & 0x3FDF);
        o.lIIlllllllIIl[2] = -(0xFFFFDC3B & 0x7FDF) & (0xFFFFDFBF & 0x7FDE);
        o.lIIlllllllIIl[3] = " ".length();
        o.lIIlllllllIIl[4] = 0xFFFFFF76 & 0x2799;
        o.lIIlllllllIIl[5] = "  ".length();
        o.lIIlllllllIIl[6] = "   ".length();
        o.lIIlllllllIIl[7] = 0xDD ^ 0x9C ^ (0x2A ^ 0x6F);
        o.lIIlllllllIIl[8] = 118 + 73 - 92 + 57 ^ 118 + 26 - 46 + 55;
        o.lIIlllllllIIl[9] = 0x60 ^ 0x66;
        o.lIIlllllllIIl[10] = 85 + 179 - 226 + 163 ^ 157 + 48 - 89 + 77;
    }

    private static boolean lIllIllIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIllIllIIIllIII(String llllllllllllllIlllIIlIllIIllIIll, String llllllllllllllIlllIIlIllIIllIIlI) {
        llllllllllllllIlllIIlIllIIllIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIllIIllIIIl = new StringBuilder();
        char[] llllllllllllllIlllIIlIllIIllIIII = llllllllllllllIlllIIlIllIIllIIlI.toCharArray();
        int llllllllllllllIlllIIlIllIIlIllll = lIIlllllllIIl[0];
        char[] llllllllllllllIlllIIlIllIIlIlIIl = llllllllllllllIlllIIlIllIIllIIll.toCharArray();
        int llllllllllllllIlllIIlIllIIlIlIII = llllllllllllllIlllIIlIllIIlIlIIl.length;
        int llllllllllllllIlllIIlIllIIlIIlll = lIIlllllllIIl[0];
        while (o.lIllIllIIlIIllI(llllllllllllllIlllIIlIllIIlIIlll, llllllllllllllIlllIIlIllIIlIlIII)) {
            char llllllllllllllIlllIIlIllIIllIlII = llllllllllllllIlllIIlIllIIlIlIIl[llllllllllllllIlllIIlIllIIlIIlll];
            llllllllllllllIlllIIlIllIIllIIIl.append((char)(llllllllllllllIlllIIlIllIIllIlII ^ llllllllllllllIlllIIlIllIIllIIII[llllllllllllllIlllIIlIllIIlIllll % llllllllllllllIlllIIlIllIIllIIII.length]));
            "".length();
            ++llllllllllllllIlllIIlIllIIlIllll;
            ++llllllllllllllIlllIIlIllIIlIIlll;
            "".length();
            if (((106 + 40 - 28 + 104 ^ 121 + 114 - 155 + 68) & (0x35 ^ 0x50 ^ (0x8C ^ 0xA3) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIllIIllIIIl);
    }

    static {
        o.lIllIllIIIlllII();
        o.lIllIllIIIllIIl();
        S = lIIlllllllIIl[4];
        T = lIIlllllllIIl[2];
    }

    private static String lIllIllIIIlIllI(String llllllllllllllIlllIIlIllIlIIIIll, String llllllllllllllIlllIIlIllIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllllIIl[10]), "DES");
            Cipher llllllllllllllIlllIIlIllIlIIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIllIlIIIlIl.init(lIIlllllllIIl[5], llllllllllllllIlllIIlIllIlIIIllI);
            return new String(llllllllllllllIlllIIlIllIlIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIllIlIIIlII) {
            llllllllllllllIlllIIlIllIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllIllIIIlIlll(String llllllllllllllIlllIIlIllIIIlllII, String llllllllllllllIlllIIlIllIIIllIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIllIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIllIIlIIIII.init(lIIlllllllIIl[5], llllllllllllllIlllIIlIllIIlIIIIl);
            return new String(llllllllllllllIlllIIlIllIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIllIIIlllll) {
            llllllllllllllIlllIIlIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIlllIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        o llllllllllllllIlllIIlIllIlIIllIl;
        if (o.lIllIllIIIlllIl(this.Z.u(), this.Z.t()) && o.lIllIllIIIlllll(this.V.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllllIIl[0];
        }
        if (o.lIllIllIIlIIIII(Vars.getBit((int)lIIlllllllIIl[1]), lIIlllllllIIl[2])) {
            return lIIlllllllIIl[0];
        }
        Item llllllllllllllIlllIIlIllIlIIllII = Inventory.getFirst(item -> item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[8]]));
        if (o.lIllIllIIlIIIlI(llllllllllllllIlllIIlIllIlIIllII) && o.lIllIllIIlIIIll(llllllllllllllIlllIIlIllIlIIllII.getQuantity(), llllllllllllllIlllIIlIllIlIIllIl.Z.u()) && o.lIllIllIIIlllll(llllllllllllllIlllIIlIllIlIIllIl.V.isInInstancedRegion() ? 1 : 0)) {
            if (o.lIllIllIIlIIlII(llllllllllllllIlllIIlIllIlIIllIl.U.fruit().a(llllllllllllllIlllIIlIllIlIIllII) ? 1 : 0)) {
                return lIIlllllllIIl[0];
            }
            if (o.lIllIllIIIlllll(Inventory.contains(item -> item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[7]])) ? 1 : 0)) {
                return lIIlllllllIIl[0];
            }
        }
        if (!o.lIllIllIIlIIlII(llllllllllllllIlllIIlIllIlIIllIl.V.isInInstancedRegion() ? 1 : 0) || o.lIllIllIIlIIIlI(llllllllllllllIlllIIlIllIlIIllII)) {
            String[] stringArray = new String[lIIlllllllIIl[3]];
            stringArray[o.lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[0]];
            TileObject llllllllllllllIlllIIlIllIlIIlIll = TileObjects.getNearest((String[])stringArray);
            if (o.lIllIllIIlIIlIl(llllllllllllllIlllIIlIllIlIIlIll)) {
                return lIIlllllllIIl[0];
            }
            llllllllllllllIlllIIlIllIlIIlIll.interact(lIIllllllIlll[lIIlllllllIIl[3]]);
            return lIIlllllllIIl[3];
        }
        if (o.lIllIllIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIIlllllllIIl[4]);
            return lIIlllllllIIl[3];
        }
        String[] stringArray = new String[lIIlllllllIIl[3]];
        stringArray[o.lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[5]];
        TileObject llllllllllllllIlllIIlIllIlIIlIll = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)llllllllllllllIlllIIlIllIlIIllIl.U.fruit().i().ordinal());
            "".length();
            "".length();
            if ((0xE6 ^ 0x83 ^ (0x2F ^ 0x4F)) <= 0) {
                return ((0x32 ^ 0xB ^ (0x3B ^ 0x3E)) & ("  ".length() ^ (0x8A ^ 0xB4) ^ -" ".length())) != 0;
            }
        } else {
            llllllllllllllIlllIIlIllIlIIlIll.interact(lIIllllllIlll[lIIlllllllIIl[6]]);
        }
        return lIIlllllllIIl[3];
    }

    private static boolean lIllIllIIlIIlIl(Object object) {
        return object == null;
    }

    @Inject
    protected o(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.U = squireTitheConfig;
        this.V = client;
    }

    private static void lIllIllIIIllIIl() {
        lIIllllllIlll = new String[lIIlllllllIIl[9]];
        o.lIIllllllIlll[o.lIIlllllllIIl[0]] = o.lIllIllIIIlIllI("Cp4LCYtirEIUt7X8ni3K/w==", "QWDUw");
        o.lIIllllllIlll[o.lIIlllllllIIl[3]] = o.lIllIllIIIlIlll("zFlrVsgc+XI=", "spZLt");
        o.lIIllllllIlll[o.lIIlllllllIIl[5]] = o.lIllIllIIIlIllI("da/KgSmHXdXJvNhMKYb6Ig==", "vvLEL");
        o.lIIllllllIlll[o.lIIlllllllIIl[6]] = o.lIllIllIIIllIII("EQ4rGiIq", "BkJhA");
        o.lIIllllllIlll[o.lIIlllllllIIl[7]] = o.lIllIllIIIlIllI("U31DTfUHoC4=", "MMVbI");
        o.lIIllllllIlll[o.lIIlllllllIIl[8]] = o.lIllIllIIIllIII("HwQPLA==", "lajHw");
    }
}


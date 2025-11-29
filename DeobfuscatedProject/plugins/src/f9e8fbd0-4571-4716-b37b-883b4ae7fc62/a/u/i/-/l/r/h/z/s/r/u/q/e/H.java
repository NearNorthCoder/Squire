/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.E;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling house", priority=10)
public class H
extends E {
    private static /* synthetic */ String[] lIllIlllIIllI;
    private static /* synthetic */ int[] lIllIlllIlIII;

    private static boolean llIIlIIllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIlIllllll() {
        lIllIlllIlIII = new int[9];
        H.lIllIlllIlIII[0] = (0x67 ^ 0x70) & ~(0x4A ^ 0x5D);
        H.lIllIlllIlIII[1] = 0xFFFFEEEF & 0x135E;
        H.lIllIlllIlIII[2] = 0xC9 ^ 0xA0 ^ (0x21 ^ 0x7B);
        H.lIllIlllIlIII[3] = " ".length();
        H.lIllIlllIlIII[4] = -(0xFFFFBFBE & 0x48C7) & (0xFFFFFFB5 & 0x2BFF);
        H.lIllIlllIlIII[5] = -(0xFFFFFF9F & 0x4CF1) & (0xFFFFEFFF & 0x7FBF);
        H.lIllIlllIlIII[6] = "  ".length();
        H.lIllIlllIlIII[7] = "   ".length();
        H.lIllIlllIlIII[8] = 0xF2 ^ 0xA6 ^ (0x65 ^ 0x39);
    }

    private static String llIIlIIlIlllIIl(String llllllllllllllIllIIIlIIlIIIIlIIl, String llllllllllllllIllIIIlIIlIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIlIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIllIlllIlIII[8]), "DES");
            Cipher llllllllllllllIllIIIlIIlIIIIllIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIIlIIIIllIl.init(lIllIlllIlIII[6], llllllllllllllIllIIIlIIlIIIIlllI);
            return new String(llllllllllllllIllIIIlIIlIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIlIIIIllII) {
            llllllllllllllIllIIIlIIlIIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    static {
        H.llIIlIIlIllllll();
        H.llIIlIIlIllllII();
    }

    private static String llIIlIIlIlllIll(String llllllllllllllIllIIIlIIIllllllII, String llllllllllllllIllIIIlIIIlllllIll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIlIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIlIIIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIlIIIIIIII.init(lIllIlllIlIII[6], llllllllllllllIllIIIlIIlIIIIIIIl);
            return new String(llllllllllllllIllIIIlIIlIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIIllllllll) {
            llllllllllllllIllIIIlIIIllllllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean run() {
        H llllllllllllllIllIIIlIIlIIllllII;
        if (!H.llIIlIIllIIIIII(this.ag() ? 1 : 0) || H.llIIlIIllIIIIII(this.ae().needsToBank() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int llllllllllllllIllIIIlIIlIIlllIll = Inventory.getCount(item -> item.hasAction(lIllIlllIIllI[lIllIlllIlIII[6]]::equals));
        if (H.llIIlIIllIIIIIl(llllllllllllllIllIIIlIIlIIlllIll, llllllllllllllIllIIIlIIlIIllllII.X.multiple()) && H.llIIlIIllIIIIlI(llllllllllllllIllIIIlIIlIIllllII.X.multiple())) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIlI(llllllllllllllIllIIIlIIlIIllllII.ad() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIII(llllllllllllllIllIIIlIIlIIllllII.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        if (!H.llIIlIIllIIIIlI(Players.getLocal().isIdle() ? 1 : 0) || H.llIIlIIllIIIIll(Static.getClient().getGameState(), GameState.LOADING)) {
            return lIllIlllIlIII[0];
        }
        if (H.llIIlIIllIIIIlI(Widgets.isVisible((Widget)Widgets.get((int)lIllIlllIlIII[1], (int)lIllIlllIlIII[0])) ? 1 : 0)) {
            Keyboard.type((char)lIllIlllIlIII[2]);
            return lIllIlllIlIII[3];
        }
        TileObject llllllllllllllIllIIIlIIlIIlllIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (H.llIIlIIllIIIlII(tileObject.getName()) && H.llIIlIIllIIIIlI(tileObject.getName().contains(lIllIlllIIllI[lIllIlllIlIII[3]]) ? 1 : 0)) {
                n2 = lIllIlllIlIII[3];
                "".length();
                if (-" ".length() >= (0xE ^ 0xA)) {
                    return ((0x4A ^ 0x6D) & ~(0x7C ^ 0x5B)) != 0;
                }
            } else {
                n2 = lIllIlllIlIII[0];
            }
            return n2 != 0;
        });
        if (H.llIIlIIllIIIlII(llllllllllllllIllIIIlIIlIIlllIlI)) {
            llllllllllllllIllIIIlIIlIIlllIlI.interact(lIllIlllIIllI[lIllIlllIlIII[0]]);
            return lIllIlllIlIII[3];
        }
        return lIllIlllIlIII[0];
    }

    private static String llIIlIIlIlllIlI(String llllllllllllllIllIIIlIIlIIlIIIII, String llllllllllllllIllIIIlIIlIIIlllll) {
        llllllllllllllIllIIIlIIlIIlIIIII = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIIlIIIllllI = new StringBuilder();
        char[] llllllllllllllIllIIIlIIlIIIlllIl = llllllllllllllIllIIIlIIlIIIlllll.toCharArray();
        int llllllllllllllIllIIIlIIlIIIlllII = lIllIlllIlIII[0];
        char[] llllllllllllllIllIIIlIIlIIIlIllI = llllllllllllllIllIIIlIIlIIlIIIII.toCharArray();
        int llllllllllllllIllIIIlIIlIIIlIlIl = llllllllllllllIllIIIlIIlIIIlIllI.length;
        int llllllllllllllIllIIIlIIlIIIlIlII = lIllIlllIlIII[0];
        while (H.llIIlIIllIIIlIl(llllllllllllllIllIIIlIIlIIIlIlII, llllllllllllllIllIIIlIIlIIIlIlIl)) {
            char llllllllllllllIllIIIlIIlIIlIIIIl = llllllllllllllIllIIIlIIlIIIlIllI[llllllllllllllIllIIIlIIlIIIlIlII];
            llllllllllllllIllIIIlIIlIIIllllI.append((char)(llllllllllllllIllIIIlIIlIIlIIIIl ^ llllllllllllllIllIIIlIIlIIIlllIl[llllllllllllllIllIIIlIIlIIIlllII % llllllllllllllIllIIIlIIlIIIlllIl.length]));
            "".length();
            ++llllllllllllllIllIIIlIIlIIIlllII;
            ++llllllllllllllIllIIIlIIlIIIlIlII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIIlIIIllllI);
    }

    private static boolean llIIlIIllIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIlIllllII() {
        lIllIlllIIllI = new String[lIllIlllIlIII[7]];
        H.lIllIlllIIllI[H.lIllIlllIlIII[0]] = H.llIIlIIlIlllIIl("YBrm26pBSYnZudi61vRRTA==", "KEpHB");
        H.lIllIlllIIllI[H.lIllIlllIlIII[3]] = H.llIIlIIlIlllIlI("BQs5FjsjCzwKdw0BNg==", "OnNsW");
        H.lIllIlllIIllI[H.lIllIlllIlIII[6]] = H.llIIlIIlIlllIll("Jk+McZ6+mLE=", "CDMAL");
    }

    private static boolean llIIlIIllIIIlII(Object object) {
        return object != null;
    }

    @Inject
    protected H(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    private static boolean llIIlIIllIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlIIllIIIIII(int n2) {
        return n2 == 0;
    }

    private boolean ag() {
        H llllllllllllllIllIIIlIIlIIllIlII;
        if (H.llIIlIIllIIIIII(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlllIlIII[0];
        }
        int[] llllllllllllllIllIIIlIIlIIllIIll = llllllllllllllIllIIIlIIlIIllIlII.Z.getMapRegions();
        int llllllllllllllIllIIIlIIlIIllIIIl = llllllllllllllIllIIIlIIlIIllIIll.length;
        int llllllllllllllIllIIIlIIlIIllIIII = lIllIlllIlIII[0];
        while (H.llIIlIIllIIIlIl(llllllllllllllIllIIIlIIlIIllIIII, llllllllllllllIllIIIlIIlIIllIIIl)) {
            int llllllllllllllIllIIIlIIlIIlIllll = llllllllllllllIllIIIlIIlIIllIIll[llllllllllllllIllIIIlIIlIIllIIII];
            if (!H.llIIlIIllIIIllI(llllllllllllllIllIIIlIIlIIlIllll, lIllIlllIlIII[4]) || H.llIIlIIllIIIlll(llllllllllllllIllIIIlIIlIIlIllll, lIllIlllIlIII[5])) {
                return lIllIlllIlIII[3];
            }
            ++llllllllllllllIllIIIlIIlIIllIIII;
            "".length();
            if (null == null) continue;
            return ((0x80 ^ 0xAB ^ (0x31 ^ 0x2F)) & (107 + 128 - 219 + 228 ^ 33 + 5 - -134 + 21 ^ -" ".length())) != 0;
        }
        return lIllIlllIlIII[0];
    }

    @Override
    public boolean ac() {
        return lIllIlllIlIII[0];
    }
}


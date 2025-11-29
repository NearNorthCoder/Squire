/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.Identifiable
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Grabbing harpoon", priority=15, blocking=true)
public class K
extends n {
    private static /* synthetic */ int[] llIIlllIIlIl;
    private static /* synthetic */ String[] llIIllIllllI;

    private static boolean llllllllIIllII(Object object) {
        return object == null;
    }

    private static boolean llllllllIIlIIl(Object object) {
        return object != null;
    }

    private static String llllllllIIIlIl(String lllllllllllllllIlIIlIIlIIllIIllI, String lllllllllllllllIlIIlIIlIIllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIllIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllIIlIl[9]), "DES");
            Cipher lllllllllllllllIlIIlIIlIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIIlIIllIlIII.init(llIIlllIIlIl[5], lllllllllllllllIlIIlIIlIIllIlIIl);
            return new String(lllllllllllllllIlIIlIIlIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIlIIllIIlll) {
            lllllllllllllllIlIIlIIlIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIlIII(int n2) {
        return n2 != 0;
    }

    private static void llllllllIIIllI() {
        llIIllIllllI = new String[llIIlllIIlIl[8]];
        K.llIIllIllllI[K.llIIlllIIlIl[1]] = K.llllllllIIIIll("BSIwCS0iLWIOKykkJw1iOyoxECAhJg==", "MCByB");
        K.llIIllIllllI[K.llIIlllIIlIl[0]] = K.llllllllIIIlII("gxMkz5KfIMA=", "OJsRl");
        K.llIIllIllllI[K.llIIlllIIlIl[5]] = K.llllllllIIIlIl("c+8pTkf/304=", "yvlWI");
    }

    private static void llllllllIIIlll() {
        llIIlllIIlIl = new int[10];
        K.llIIlllIIlIl[0] = " ".length();
        K.llIIlllIIlIl[1] = (0x58 ^ 0x1B) & ~(0x69 ^ 0x2A);
        K.llIIlllIIlIl[2] = 0xFFFFB4AF & 0xBB4B53;
        K.llIIlllIIlIl[3] = 0x79 ^ 0x16 ^ (0x15 ^ 0x49);
        K.llIIlllIIlIl[4] = 0x85 ^ 0x89;
        K.llIIlllIIlIl[5] = "  ".length();
        K.llIIlllIIlIl[6] = -(0xFFFF9BFB & 0x7415) & (0xFFFFDCDB & 0xBFBD);
        K.llIIlllIIlIl[7] = 0xFFFFADEE & 0xDEFB;
        K.llIIlllIIlIl[8] = "   ".length();
        K.llIIlllIIlIl[9] = 0xC9 ^ 0x9A ^ (0x5C ^ 7);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8_8;
        WorldPoint lllllllllllllllIlIIlIIlIIllIllll;
        K lllllllllllllllIlIIlIIlIIlllIllI;
        void lllllllllllllllIlIIlIIlIIlllIlII;
        Predicate<Identifiable> predicate;
        List<Integer> list = i.FISH.ay();
        Predicate<Identifiable> predicate2 = predicate = identifiable -> list.contains(identifiable.getId());
        Objects.requireNonNull(predicate2);
        "".length();
        if (K.llllllllIIlIII(Inventory.contains(predicate2::test) ? 1 : 0)) {
            return llIIlllIIlIl[1];
        }
        Widget lllllllllllllllIlIIlIIlIIlllIIll = Static.getClient().getWidget(llIIlllIIlIl[2]);
        if (K.llllllllIIlIIl(lllllllllllllllIlIIlIIlIIlllIIll) && K.llllllllIIlIII(lllllllllllllllIlIIlIIlIIlllIIll.isVisible() ? 1 : 0)) {
            System.out.println(llIIllIllllI[llIIlllIIlIl[1]]);
            Keyboard.type((char)llIIlllIIlIl[3]);
            return llIIlllIIlIl[0];
        }
        void v1 = lllllllllllllllIlIIlIIlIIlllIlII;
        Objects.requireNonNull(v1);
        "".length();
        TileItem lllllllllllllllIlIIlIIlIIlllIIlI = TileItems.getNearest(((Predicate)v1)::test);
        Player lllllllllllllllIlIIlIIlIIlllIIIl = Players.getLocal();
        if (K.llllllllIIlIIl(lllllllllllllllIlIIlIIlIIlllIIlI) && K.llllllllIIlIlI(lllllllllllllllIlIIlIIlIIlllIIlI.distanceTo((Locatable)lllllllllllllllIlIIlIIlIIlllIIIl), llIIlllIIlIl[4])) {
            lllllllllllllllIlIIlIIlIIlllIIlI.interact(llIIllIllllI[llIIlllIIlIl[0]]);
            return llIIlllIIlIl[0];
        }
        m lllllllllllllllIlIIlIIlIIlllIIII = lllllllllllllllIlIIlIIlIIlllIllI.ba.V().av();
        if (K.llllllllIIlIll(lllllllllllllllIlIIlIIlIIlllIIII.e(lllllllllllllllIlIIlIIlIIllIllll = lllllllllllllllIlIIlIIlIIlllIIIl.getWorldLocation()) ? 1 : 0)) {
            return lllllllllllllllIlIIlIIlIIlllIllI.ba.a((l)lllllllllllllllIlIIlIIlIIlllIIII, lllllllllllllllIlIIlIIlIIllIllll);
        }
        int[] nArray = new int[llIIlllIIlIl[5]];
        nArray[K.llIIlllIIlIl[1]] = llIIlllIIlIl[6];
        nArray[K.llIIlllIIlIl[0]] = llIIlllIIlIl[7];
        TileObject lllllllllllllllIlIIlIIlIIllIlllI = TileObjects.getNearest((int[])nArray);
        if (K.llllllllIIllII(lllllllllllllllIlIIlIIlIIllIlllI)) {
            return llIIlllIIlIl[1];
        }
        var8_8.interact(llIIllIllllI[llIIlllIIlIl[5]]);
        Time.sleep((long)150L);
        "".length();
        Keyboard.type((char)llIIlllIIlIl[3]);
        return llIIlllIIlIl[0];
    }

    @Inject
    public K(c c2) {
        d[] dArray = new d[llIIlllIIlIl[0]];
        dArray[K.llIIlllIIlIl[1]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static String llllllllIIIlII(String lllllllllllllllIlIIlIIlIIlIIIIIl, String lllllllllllllllIlIIlIIlIIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlIIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIlIIlIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIlIIlIIIIll.init(llIIlllIIlIl[5], lllllllllllllllIlIIlIIlIIlIIIlII);
            return new String(lllllllllllllllIlIIlIIlIIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIlIIlIIIIlI) {
            lllllllllllllllIlIIlIIlIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIIlIll(int n2) {
        return n2 == 0;
    }

    private static String llllllllIIIIll(String lllllllllllllllIlIIlIIlIIlIlIIIl, String lllllllllllllllIlIIlIIlIIlIlIlIl) {
        lllllllllllllllIlIIlIIlIIlIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIlIIlIlIlII = new StringBuilder();
        char[] lllllllllllllllIlIIlIIlIIlIlIIll = lllllllllllllllIlIIlIIlIIlIlIlIl.toCharArray();
        int lllllllllllllllIlIIlIIlIIlIlIIlI = llIIlllIIlIl[1];
        char[] lllllllllllllllIlIIlIIlIIlIIllII = lllllllllllllllIlIIlIIlIIlIlIIIl.toCharArray();
        int lllllllllllllllIlIIlIIlIIlIIlIll = lllllllllllllllIlIIlIIlIIlIIllII.length;
        int lllllllllllllllIlIIlIIlIIlIIlIlI = llIIlllIIlIl[1];
        while (K.llllllllIIlIlI(lllllllllllllllIlIIlIIlIIlIIlIlI, lllllllllllllllIlIIlIIlIIlIIlIll)) {
            char lllllllllllllllIlIIlIIlIIlIlIlll = lllllllllllllllIlIIlIIlIIlIIllII[lllllllllllllllIlIIlIIlIIlIIlIlI];
            lllllllllllllllIlIIlIIlIIlIlIlII.append((char)(lllllllllllllllIlIIlIIlIIlIlIlll ^ lllllllllllllllIlIIlIIlIIlIlIIll[lllllllllllllllIlIIlIIlIIlIlIIlI % lllllllllllllllIlIIlIIlIIlIlIIll.length]));
            "".length();
            ++lllllllllllllllIlIIlIIlIIlIlIIlI;
            ++lllllllllllllllIlIIlIIlIIlIIlIlI;
            "".length();
            if ((156 + 72 - 177 + 117 ^ 36 + 36 - -49 + 52) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIIlIIlIlIlII);
    }

    static {
        K.llllllllIIIlll();
        K.llllllllIIIllI();
    }
}


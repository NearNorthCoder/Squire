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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.HerbType;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
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

/* TASK: Grabbing harpoon -> GrabbingharpoonTask */
@TaskDesc(name="Grabbing harpoon", priority=15, blocking=true)
public class GrabbingHarpoonTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIlllIIlIl;
    private static /* synthetic */ String[] llIIllIllllI;

    private static boolean llllllllIIllII(Object object) {
        return object == null;
    }

    private static boolean llllllllIIlIIl(Object object) {
        return object != null;
    }

    private static String llllllllIIIlIl(String var12, String var25) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), llIIlllIIlIl[9]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIIlllIIlIl[5], var6);
            return new String(var8.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIlIII(int n2) {
        return n2 != 0;
    }

    private static void llllllllIIIllI() {
        llIIllIllllI = new String[llIIlllIIlIl[8]];
        K.llIIllIllllI[K.llIIlllIIlIl[1]] = K."Harpoon widget visible";
        K.llIIllIllllI[K.llIIlllIIlIl[0]] = K."Take";
        K.llIIllIllllI[K.llIIlllIIlIl[5]] = K."Take";
    }

    private static void llllllllIIIlll() {
        llIIlllIIlIl = new int[10];
        K.llIIlllIIlIl[0] = 1;
        K.llIIlllIIlIl[1] = (0x58 ^ 0x1B) & ~(0x69 ^ 0x2A);
        K.llIIlllIIlIl[2] = 0xFFFFB4AF & 0xBB4B53;
        K.llIIlllIIlIl[3] = 0x79 ^ 0x16 ^ (0x15 ^ 0x49);
        K.llIIlllIIlIl[4] = 0x85 ^ 0x89;
        K.llIIlllIIlIl[5] = 2;
        K.llIIlllIIlIl[6] = -(0xFFFF9BFB & 0x7415) & (0xFFFFDCDB & 0xBFBD);
        K.llIIlllIIlIl[7] = 0xFFFFADEE & 0xDEFB;
        K.llIIlllIIlIl[8] = 3;
        K.llIIlllIIlIl[9] = 0xC9 ^ 0x9A ^ (0x5C ^ 7);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8_8;
        WorldPoint var26;
        K var2;
        void var18;
        Predicate<Identifiable> predicate;
        List<Integer> list = i.FISH.ay();
        Predicate<Identifiable> predicate2 = predicate = identifiable -> list.contains(identifiable.getId());
        Objects.requireNonNull(predicate2);
        0;
        if (K.llllllllIIlIII(Inventory.contains(predicate2::test) ? 1 : 0)) {
            return llIIlllIIlIl[1];
        }
        Widget var7 = Static.getClient().getWidget(llIIlllIIlIl[2]);
        if (K.llllllllIIlIIl(var7) && K.llllllllIIlIII(var7.isVisible() ? 1 : 0)) {
            System.out.println(llIIllIllllI[llIIlllIIlIl[1]]);
            Keyboard.type((char)llIIlllIIlIl[3]);
            return llIIlllIIlIl[0];
        }
        void v1 = var18;
        Objects.requireNonNull(v1);
        0;
        TileItem var19 = TileItems.getNearest(((Predicate)v1)::test);
        Player var22 = Players.getLocal();
        if (K.llllllllIIlIIl(var19) && K.llllllllIIlIlI(var19.distanceTo((Locatable)var22), llIIlllIIlIl[4])) {
            var19.interact(llIIllIllllI[llIIlllIIlIl[0]]);
            return llIIlllIIlIl[0];
        }
        m var23 = var2.ba.V().av();
        if (K.llllllllIIlIll(var23.e(var26 = var22.getWorldLocation()) ? 1 : 0)) {
            return var2.ba.a((l)var23, var26);
        }
        int[] nArray = new int[llIIlllIIlIl[5]];
        nArray[K.llIIlllIIlIl[1]] = llIIlllIIlIl[6];
        nArray[K.llIIlllIIlIl[0]] = llIIlllIIlIl[7];
        TileObject var27 = TileObjects.getNearest((int[])nArray);
        if (K.llllllllIIllII(var27)) {
            return llIIlllIIlIl[1];
        }
        var8_8.interact(llIIllIllllI[llIIlllIIlIl[5]]);
        Time.sleep((long)150L);
        0;
        Keyboard.type((char)llIIlllIIlIl[3]);
        return llIIlllIIlIl[0];
    }

    @Inject
    public K(c c2) {
        d[] dArray = new d[llIIlllIIlIl[0]];
        dArray[K.llIIlllIIlIl[1]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static String llllllllIIIlII(String var9, String var20) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIlllIIlIl[5], var17);
            return new String(var10.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIIlIll(int n2) {
        return n2 == 0;
    }

    private static String llllllllIIIIll(String var15, String var24) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var14 = var24.toCharArray();
        int var11 = llIIlllIIlIl[1];
        char[] var13 = var15.toCharArray();
        int var5 = var13.length;
        int var16 = llIIlllIIlIl[1];
        while (K.llllllllIIlIlI(var16, var5)) {
            char var3 = var13[var16];
            var21.append((char)(var3 ^ var14[var11 % var14.length]));
            0;
            ++var11;
            ++var16;
            0;
            if ((156 + 72 - 177 + 117 ^ 36 + 36 - -49 + 52) != 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    static {
        K.llllllllIIIlll();
        K.llllllllIIIllI();
    }
}


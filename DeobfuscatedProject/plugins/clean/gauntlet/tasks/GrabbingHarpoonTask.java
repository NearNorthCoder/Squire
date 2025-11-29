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
package gg.squire.gauntlet.tasks;

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
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
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
public class GrabbingHarpoonTask
extends GauntletTaskBase {

    private static boolean llllllllIIllII(Object object) {
        return object == null;
    }

    private static boolean llllllllIIlIIl(Object object) {
        return object != null;
    }

    private static boolean llllllllIIlIII(int n2) {
        return n2 != 0;
    }

    private static void llllllllIIIllI() {
        llIIllIllllI = new String[llIIlllIIlIl[8]];
        K.llIIllIllllI[K.llIIlllIIlIl[1]] = "Harpoon widget visible";
        K.llIIllIllllI[K.llIIlllIIlIl[0]] = "Take";
        K.llIIllIllllI[K.llIIlllIIlIl[5]] = "Take";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var8_8;
        WorldPoint var1;
        K var2;
        void var3;
        Predicate<Identifiable> predicate;
        List<Integer> list = i.FISH.ay();
        Predicate<Identifiable> predicate2 = predicate = identifiable -> list.contains(identifiable.getId());
        Objects.requireNonNull(predicate2);

        if (K.llllllllIIlIII(Inventory.contains(predicate2::test) ? 1 : 0)) {
            return llIIlllIIlIl[1];
        }
        Widget var4 = Static.getClient().getWidget(llIIlllIIlIl[2]);
        if (K.llllllllIIlIIl(var4) && K.llllllllIIlIII(var4.isVisible() ? 1 : 0)) {
            System.out.println(llIIllIllllI[llIIlllIIlIl[1]]);
            Keyboard.type((char)llIIlllIIlIl[3]);
            return llIIlllIIlIl[0];
        }
        void v1 = var3;
        Objects.requireNonNull(v1);

        TileItem var5 = TileItems.getNearest(((Predicate)v1)::test);
        Player var6 = Players.getLocal();
        if (K.llllllllIIlIIl(var5) && K.llllllllIIlIlI(var5.distanceTo((Locatable)var6), llIIlllIIlIl[4])) {
            var5.interact(llIIllIllllI[llIIlllIIlIl[0]]);
            return llIIlllIIlIl[0];
        }
        m var7 = var2.ba.V().av();
        if (K.llllllllIIlIll(var7.e(var1 = var6.getWorldLocation()) ? 1 : 0)) {
            return var2.ba.a((l)var7, var1);
        }
        int[] nArray = new int[llIIlllIIlIl[5]];
        nArray[K.llIIlllIIlIl[1]] = llIIlllIIlIl[6];
        nArray[K.llIIlllIIlIl[0]] = llIIlllIIlIl[7];
        TileObject var8 = TileObjects.getNearest((int[])nArray);
        if (K.llllllllIIllII(var8)) {
            return llIIlllIIlIl[1];
        }
        var8_8.interact(llIIllIllllI[llIIlllIIlIl[5]]);
        Time.sleep((long)150L);

        Keyboard.type((char)llIIlllIIlIl[3]);
        return llIIlllIIlIl[0];
    }

    @Inject
    public GrabbingHarpoonTask(c c2) {
        d[] dArray = new d[llIIlllIIlIl[0]];
        dArray[K.llIIlllIIlIl[1]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static boolean llllllllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIIlIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var9);
    }

    static {
        K.llllllllIIIlll();
        K.llllllllIIIllI();
    }
}


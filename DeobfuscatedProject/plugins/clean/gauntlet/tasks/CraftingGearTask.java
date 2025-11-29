/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
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
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.CookingFoodTask;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GameEnum39;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Crafting gear", priority=5, blocking=true)
public class CraftingGearTask
extends GauntletTaskBase {

    private final  B bQ;
    private  int bR;

    private static boolean lIIIIIIlIIlIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        C var1;
        void var2;
        void var3;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!C.lIIIIIIlIIIlllI(h2) || C.lIIIIIIlIIIllll(player)) {
            return llIlIIIlIIlI[1];
        }
        int var4 = var3.av().e(var2.getWorldLocation()) ? 1 : 0;
        if (C.lIIIIIIlIIlIIII(var4)) {
            if (C.lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            m var5 = var1.ba.V().av();
            WorldPoint var6 = var5.aQ();
            if (C.lIIIIIIlIIlIIIl(var6.isInScene(Static.getClient()) ? 1 : 0)) {
                ScenePoint var7 = ScenePoint.fromWorld((WorldPoint)var6);
                Movement.setDestination((int)var7.getX(), (int)var7.getY());

                if (((0x31 ^ 0x23) & ~(0xD ^ 0x1F)) != 0) {
                    return false;
                }
            } else {
                var1.ba.a((l)var5, var2.getWorldLocation());

            }
            return llIlIIIlIIlI[2];
        }
        List<f> var5 = var1.ba.I();
        if (C.lIIIIIIlIIlIIII(var5.isEmpty() ? 1 : 0)) {
            Item var7;
            Widget var6;
            if (C.lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            if (C.lIIIIIIlIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[llIlIIIlIIlI[2]];
                nArray[C.llIlIIIlIIlI[1]] = llIlIIIlIIlI[4];
                var6 = Inventory.getFirst((int[])nArray);
                if (C.lIIIIIIlIIIlllI(var6)) {
                    var6.interact(llIlIIIlIIIl[llIlIIIlIIlI[1]]);
                    var1.ba.V().av().k(llIlIIIlIIlI[2]);
                    return llIlIIIlIIlI[2];
                }
                int[] nArray2 = new int[llIlIIIlIIlI[2]];
                nArray2[C.llIlIIIlIIlI[1]] = llIlIIIlIIlI[5];
                var7 = Inventory.getFirst((int[])nArray2);
                if (C.lIIIIIIlIIIlllI(var7)) {
                    var7.interact(llIlIIIlIIIl[llIlIIIlIIlI[2]]);
                    return llIlIIIlIIlI[2];
                }
            }
            if (C.lIIIIIIlIIlIIlI(var1.bR)) {
                var1.bR -= llIlIIIlIIlI[2];
                return llIlIIIlIIlI[2];
            }
            var6 = Widgets.get((int)llIlIIIlIIlI[6], (int)llIlIIIlIIlI[7]);
            if (C.lIIIIIIlIIIlllI(var6) && C.lIIIIIIlIIlIIII(var6.isHidden() ? 1 : 0)) {
                Item var8 = var7 = var6.getStaticChildren();
                int var9 = ((Widget[])var8).length;
                int var10 = llIlIIIlIIlI[1];
                while (C.lIIIIIIlIIlIIll(var10, var9)) {
                    Item var11 = var8[var10];
                    String var12 = var11.getName();
                    List<String> var13 = var5.get(llIlIIIlIIlI[1]).ae();
                    Stream stream = var13.stream();
                    String string = var12;
                    Objects.requireNonNull(string);

                    if (C.lIIIIIIlIIlIIIl(stream.anyMatch(string::contains) ? 1 : 0)) {
                        var11.interact(llIlIIIlIIIl[llIlIIIlIIlI[3]]);
                        var1.bR = llIlIIIlIIlI[2];
                        return llIlIIIlIIlI[2];
                    }
                    ++var10;

                    if (-1 != 3) continue;
                    return ((22 + 57 - 70 + 175 ^ 136 + 102 - 141 + 47) & (5 ^ 0x56 ^ (0x53 ^ 0x28) ^ -1)) != 0;
                }
                return llIlIIIlIIlI[1];
            }
            String[] stringArray = new String[llIlIIIlIIlI[2]];
            stringArray[C.llIlIIIlIIlI[1]] = llIlIIIlIIIl[llIlIIIlIIlI[0]];
            var7 = TileObjects.getNearest((String[])stringArray);
            if (C.lIIIIIIlIIIlllI(var7)) {
                var7.interact(llIlIIIlIIIl[llIlIIIlIIlI[8]]);
                return llIlIIIlIIlI[2];
            }
        }
        return llIlIIIlIIlI[1];
    }

        return String.valueOf(var14);
    }

    private static boolean lIIIIIIlIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public CraftingGearTask(c c2, B b2) {
        d[] dArray = new d[llIlIIIlIIlI[0]];
        dArray[C.llIlIIIlIIlI[1]] = d.FIRST_ROTATION_CREATE;
        dArray[C.llIlIIIlIIlI[2]] = d.PREPARE_BOSS_FIGHT;
        dArray[C.llIlIIIlIIlI[3]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
        this.bQ = b2;
    }

    private static boolean lIIIIIIlIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIlIIlIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIlIIlIIIl(int n2) {
        return n2 != 0;
    }

    static {
        C.lIIIIIIlIIIllIl();
        C.lIIIIIIlIIIllII();
    }

    private static void lIIIIIIlIIIllII() {
        llIlIIIlIIIl = new String[llIlIIIlIIlI[9]];
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[1]] = "Drop";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[2]] = "Eat";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[3]] = "Make";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[0]] = "Singing Bowl";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[8]] = "Sing-crystal";
    }
}


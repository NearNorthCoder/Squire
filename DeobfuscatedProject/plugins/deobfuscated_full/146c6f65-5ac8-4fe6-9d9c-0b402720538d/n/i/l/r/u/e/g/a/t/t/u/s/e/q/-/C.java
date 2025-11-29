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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.B;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
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

/* TASK: Crafting gear -> CraftinggearTask */
@TaskDesc(name="Crafting gear", priority=5, blocking=true)
public class C
extends n {
    private static /* synthetic */ int[] llIlIIIlIIlI;
    private static /* synthetic */ String[] llIlIIIlIIIl;
    private final /* synthetic */ B bQ;
    private /* synthetic */ int bR;

    private static boolean lIIIIIIlIIlIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        C var1;
        void var27;
        void var3;
        Player player = Players.getLocal();
        h h2 = this.ba.V();
        if (!C.lIIIIIIlIIIlllI(h2) || C.lIIIIIIlIIIllll(player)) {
            return llIlIIIlIIlI[1];
        }
        int var11 = var3.av().e(var27.getWorldLocation()) ? 1 : 0;
        if (C.lIIIIIIlIIlIIII(var11)) {
            if (C.lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            m var29 = var1.ba.V().av();
            WorldPoint var10 = var29.aQ();
            if (C.lIIIIIIlIIlIIIl(var10.isInScene(Static.getClient()) ? 1 : 0)) {
                ScenePoint var18 = ScenePoint.fromWorld((WorldPoint)var10);
                Movement.setDestination((int)var18.getX(), (int)var18.getY());
                0;
                if (((0x31 ^ 0x23) & ~(0xD ^ 0x1F)) != 0) {
                    return false;
                }
            } else {
                var1.ba.a((l)var29, var27.getWorldLocation());
                0;
            }
            return llIlIIIlIIlI[2];
        }
        List<f> var29 = var1.ba.I();
        if (C.lIIIIIIlIIlIIII(var29.isEmpty() ? 1 : 0)) {
            Item var18;
            Widget var10;
            if (C.lIIIIIIlIIlIIIl(Movement.isWalking() ? 1 : 0)) {
                return llIlIIIlIIlI[2];
            }
            if (C.lIIIIIIlIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[llIlIIIlIIlI[2]];
                nArray[C.llIlIIIlIIlI[1]] = llIlIIIlIIlI[4];
                var10 = Inventory.getFirst((int[])nArray);
                if (C.lIIIIIIlIIIlllI(var10)) {
                    var10.interact(llIlIIIlIIIl[llIlIIIlIIlI[1]]);
                    var1.ba.V().av().k(llIlIIIlIIlI[2]);
                    return llIlIIIlIIlI[2];
                }
                int[] nArray2 = new int[llIlIIIlIIlI[2]];
                nArray2[C.llIlIIIlIIlI[1]] = llIlIIIlIIlI[5];
                var18 = Inventory.getFirst((int[])nArray2);
                if (C.lIIIIIIlIIIlllI(var18)) {
                    var18.interact(llIlIIIlIIIl[llIlIIIlIIlI[2]]);
                    return llIlIIIlIIlI[2];
                }
            }
            if (C.lIIIIIIlIIlIIlI(var1.bR)) {
                var1.bR -= llIlIIIlIIlI[2];
                return llIlIIIlIIlI[2];
            }
            var10 = Widgets.get((int)llIlIIIlIIlI[6], (int)llIlIIIlIIlI[7]);
            if (C.lIIIIIIlIIIlllI(var10) && C.lIIIIIIlIIlIIII(var10.isHidden() ? 1 : 0)) {
                Item var21 = var18 = var10.getStaticChildren();
                int var32 = ((Widget[])var21).length;
                int var7 = llIlIIIlIIlI[1];
                while (C.lIIIIIIlIIlIIll(var7, var32)) {
                    Item var6 = var21[var7];
                    String var31 = var6.getName();
                    List<String> var23 = var29.get(llIlIIIlIIlI[1]).ae();
                    Stream stream = var23.stream();
                    String string = var31;
                    Objects.requireNonNull(string);
                    0;
                    if (C.lIIIIIIlIIlIIIl(stream.anyMatch(string::contains) ? 1 : 0)) {
                        var6.interact(llIlIIIlIIIl[llIlIIIlIIlI[3]]);
                        var1.bR = llIlIIIlIIlI[2];
                        return llIlIIIlIIlI[2];
                    }
                    ++var7;
                    0;
                    if (-1 != 3) continue;
                    return ((22 + 57 - 70 + 175 ^ 136 + 102 - 141 + 47) & (5 ^ 0x56 ^ (0x53 ^ 0x28) ^ -1)) != 0;
                }
                return llIlIIIlIIlI[1];
            }
            String[] stringArray = new String[llIlIIIlIIlI[2]];
            stringArray[C.llIlIIIlIIlI[1]] = llIlIIIlIIIl[llIlIIIlIIlI[0]];
            var18 = TileObjects.getNearest((String[])stringArray);
            if (C.lIIIIIIlIIIlllI(var18)) {
                var18.interact(llIlIIIlIIIl[llIlIIIlIIlI[8]]);
                return llIlIIIlIIlI[2];
            }
        }
        return llIlIIIlIIlI[1];
    }

    private static String lIIIIIIlIIIlIlI(String var12, String var15) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIlIIIlIIlI[3], var17);
            return new String(var9.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIIlIIIlIll(String var22, String var13) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var13.toCharArray();
        int var4 = llIlIIIlIIlI[1];
        char[] var20 = var22.toCharArray();
        int var5 = var20.length;
        int var19 = llIlIIIlIIlI[1];
        while (C.lIIIIIIlIIlIIll(var19, var5)) {
            char var14 = var20[var19];
            var24.append((char)(var14 ^ var25[var4 % var25.length]));
            0;
            ++var4;
            ++var19;
            0;
            if (((0x79 ^ 0x6B) & ~(0x8E ^ 0x9C)) >= 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static void lIIIIIIlIIIllIl() {
        llIlIIIlIIlI = new int[11];
        C.llIlIIIlIIlI[0] = 3;
        C.llIlIIIlIIlI[1] = (0xB2 ^ 0x9D) & ~(0x2C ^ 3);
        C.llIlIIIlIIlI[2] = 1;
        C.llIlIIIlIIlI[3] = 2;
        C.llIlIIIlIIlI[4] = 0xFFFFFDD7 & 0x5F68;
        C.llIlIIIlIIlI[5] = -(0xFFFFB69D & 0x6BEF) & (0xFFFFFFEF & 0x7FDE);
        C.llIlIIIlIIlI[6] = -(0xFFFFBCA9 & 0x5FF7) & (0xFFFFFFBF & 0x1DEE);
        C.llIlIIIlIIlI[7] = 0x2D ^ 0x23;
        C.llIlIIIlIIlI[8] = 0xCB ^ 0x87 ^ (0x6B ^ 0x23);
        C.llIlIIIlIIlI[9] = 0xF9 ^ 0xC5 ^ (0xFF ^ 0xC6);
        C.llIlIIIlIIlI[10] = 0x4A ^ 0x42;
    }

    private static boolean lIIIIIIlIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIlIIIlIIl(String var26, String var28) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var28.getBytes(StandardCharsets.UTF_8)), llIlIIIlIIlI[10]), "DES");
            Cipher var30 = Cipher.getInstance("DES");
            var30.init(llIlIIIlIIlI[3], var16);
            return new String(var30.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(c c2, B b2) {
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
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[1]] = C."Drop";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[2]] = C."Eat";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[3]] = C."Make";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[0]] = C."Singing Bowl";
        C.llIlIIIlIIIl[C.llIlIIIlIIlI[8]] = C."Sing-crystal";
    }
}


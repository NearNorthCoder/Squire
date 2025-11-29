/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

/* TASK: Entering room -> EnteringroomTask */
@TaskDesc(name="Entering room", register=true)
public class x
extends Task {
    private final /* synthetic */ g ar;
    private static /* synthetic */ String[] lIIlIlIIIlIlI;
    private static /* synthetic */ int[] lIIlIlIIIlIll;
    private /* synthetic */ boolean as;

    @Inject
    public x(g g2) {
        this.ar = g2;
    }

    private static boolean lIlIlIllIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllIIlIlII(Object object) {
        return object == null;
    }

    private static String lIlIlIllIIIllll(String var14, String var10) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIlIlIIIlIll[4], var19);
            return new String(var2.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlIllIIIlllI(String var20, String var8) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var7 = var8.toCharArray();
        int var5 = lIIlIlIIIlIll[0];
        char[] var21 = var20.toCharArray();
        int var16 = var21.length;
        int var4 = lIIlIlIIIlIll[0];
        while (x.lIlIlIllIIlIIll(var4, var16)) {
            char var12 = var21[var4];
            var1.append((char)(var12 ^ var7[var5 % var7.length]));
            0;
            ++var5;
            ++var4;
            0;
            if (((0x14 ^ 0x53 ^ (0x25 ^ 0x53)) & (0x12 ^ 0x7D ^ (0x43 ^ 0x1D) ^ -1)) < 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIlIlIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIllIIlIlll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (x.lIlIlIllIIlIIlI(chatMessage.getMessage().contains(lIIlIlIIIlIlI[lIIlIlIIIlIll[7]]) ? 1 : 0)) {
            this.as = lIIlIlIIIlIll[1];
        }
    }

    private static void lIlIlIllIIlIIII() {
        lIIlIlIIIlIlI = new String[lIIlIlIIIlIll[11]];
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[0]] = x."Open (private)";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[1]] = x."Open (private)";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[4]] = x."Open";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[5]] = x."Open (normal)";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[6]] = x."Climb-down";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[7]] = x."There appears to be someone";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[8]] = x."Big door";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[9]] = x."Climb-down";
        x.lIIlIlIIIlIlI[x.lIIlIlIIIlIll[10]] = x."Rock";
    }

    private static String lIlIlIllIIIllIl(String var6, String var17) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIlIll[10]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIlIlIIIlIll[4], var22);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        x.lIlIlIllIIlIIIl();
        x.lIlIlIllIIlIIII();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean run() {
        void var1_1;
        x var18;
        if (x.lIlIlIllIIlIIlI(this.ar.m() ? 1 : 0)) {
            return lIIlIlIIIlIll[0];
        }
        if (x.lIlIlIllIIlIIll(var18.ar.q(), var18.ar.r())) {
            return lIIlIlIIIlIll[0];
        }
        TileObject var13 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIlIlIIIlIll[1]];
            stringArray[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[9]];
            if (x.lIlIlIllIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0) && x.lIlIlIllIIlIIlI(tileObject.getName().equals(lIIlIlIIIlIlI[lIIlIlIIIlIll[10]]) ? 1 : 0) && x.lIlIlIllIIllIII(tileObject.getPlane(), Static.getClient().getPlane()) && x.lIlIlIllIIlIIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = lIIlIlIIIlIll[1];
                0;
                if (3 <= 0) {
                    return false;
                }
            } else {
                n2 = lIIlIlIIIlIll[0];
            }
            return n2 != 0;
        });
        if (x.lIlIlIllIIlIlII(var13)) {
            TileObject var15 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (x.lIlIlIllIIlIIlI(tileObject.getName().equals(lIIlIlIIIlIlI[lIIlIlIIIlIll[8]]) ? 1 : 0) && x.lIlIlIllIIlIIlI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) && x.lIlIlIllIIllIII(tileObject.getPlane(), Static.getClient().getPlane())) {
                    n2 = lIIlIlIIIlIll[1];
                    0;
                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlIlIIIlIll[0];
                }
                return n2 != 0;
            });
            if (!x.lIlIlIllIIlIlIl(var15)) return lIIlIlIIIlIll[0];
            if (x.lIlIlIllIIlIIlI(var18.V() ? 1 : 0)) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (x.lIlIlIllIIlIIlI(world.isNormal() ? 1 : 0) && x.lIlIlIllIIlIIlI(world.isMembers() ? 1 : 0)) {
                        n2 = lIIlIlIIIlIll[1];
                        0;
                        
                        }
                    } else {
                        n2 = lIIlIlIIIlIll[0];
                    }
                    return n2 != 0;
                }));
                var18.as = lIIlIlIIIlIll[0];
                return lIIlIlIIIlIll[1];
            }
            String[] stringArray = new String[lIIlIlIIIlIll[1]];
            stringArray[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[0]];
            if (x.lIlIlIllIIlIIlI(var15.hasAction(stringArray) ? 1 : 0)) {
                int[] nArray = new int[lIIlIlIIIlIll[1]];
                nArray[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIll[2];
                if (x.lIlIlIllIIlIllI(Inventory.getCount((boolean)lIIlIlIIIlIll[1], (int[])nArray), lIIlIlIIIlIll[3])) {
                    var15.interact(lIIlIlIIIlIlI[lIIlIlIIIlIll[1]]);
                    0;
                    if (((85 + 37 - 56 + 83 ^ 129 + 20 - 116 + 124) & (0x1B ^ 0x7D ^ (0x3D ^ 0x53) ^ -1)) > -1) return lIIlIlIIIlIll[1];
                    return ((0x29 ^ 0x63 ^ (0x4D ^ 2)) & (0x51 ^ 0x39 ^ (0x6D ^ 0) ^ -1)) != 0;
                }
            }
            String[] stringArray2 = new String[lIIlIlIIIlIll[4]];
            stringArray2[x.lIIlIlIIIlIll[0]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[4]];
            stringArray2[x.lIIlIlIIIlIll[1]] = lIIlIlIIIlIlI[lIIlIlIIIlIll[5]];
            var15.interact(stringArray2);
            return lIIlIlIIIlIll[1];
        }
        var1_1.interact(lIIlIlIIIlIlI[lIIlIlIIIlIll[6]]);
        return lIIlIlIIIlIll[1];
    }

    private static void lIlIlIllIIlIIIl() {
        lIIlIlIIIlIll = new int[12];
        x.lIIlIlIIIlIll[0] = (0x9C ^ 0xC7) & ~(0xD6 ^ 0x8D);
        x.lIIlIlIIIlIll[1] = 1;
        x.lIIlIlIIIlIll[2] = 0xFFFF87EF & 0x7BF3;
        x.lIIlIlIIIlIll[3] = -(0xFFFFF66F & 0x199F) & (0xFFFFDBFE & 0x27DFF);
        x.lIIlIlIIIlIll[4] = 2;
        x.lIIlIlIIIlIll[5] = 3;
        x.lIIlIlIIIlIll[6] = 0x79 ^ 0x58 ^ (0x1A ^ 0x3F);
        x.lIIlIlIIIlIll[7] = 0x26 ^ 0x23;
        x.lIIlIlIIIlIll[8] = 0x99 ^ 0x9F;
        x.lIIlIlIIIlIll[9] = 0x20 ^ 3 ^ (0x11 ^ 0x35);
        x.lIIlIlIIIlIll[10] = 0x3D ^ 0x29 ^ (0 ^ 0x1C);
        x.lIIlIlIIIlIll[11] = 0x5B ^ 0x5C ^ (0x69 ^ 0x67);
    }

    private static boolean lIlIlIllIIlIIlI(int n2) {
        return n2 != 0;
    }

    private boolean V() {
        boolean bl;
        if (!x.lIlIlIllIIlIlll(this.as ? 1 : 0) || x.lIlIlIllIIlIlll(Players.getAll(player -> this.ar.a(player.getWorldLocation())).isEmpty() ? 1 : 0)) {
            bl = lIIlIlIIIlIll[1];
            0;
            if ((105 + 136 - 131 + 41 ^ 76 + 10 - 53 + 113) == 0) {
                return ((0x4F ^ 0x34 ^ (0x68 ^ 0x58)) & (0xDB ^ 0xAF ^ (0xBC ^ 0x83) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIlIIIlIll[0];
        }
        return bl;
    }
}


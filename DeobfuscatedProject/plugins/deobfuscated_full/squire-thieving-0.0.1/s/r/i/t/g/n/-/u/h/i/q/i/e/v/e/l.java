/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.k;

/* TASK: Buying wines -> BuyingwinesTask */
@TaskDesc(name="Buying wines", priority=6, blocking=true)
public class l
extends Task {
    private static final /* synthetic */ WorldArea G;
    private static /* synthetic */ int[] lIIllIllIlIII;
    private static /* synthetic */ String[] lIIllIllIIlll;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ WorldPoint F;
    private final /* synthetic */ SquireThievingConfig I;
    private /* synthetic */ boolean K;
    private final /* synthetic */ SquireThieving J;

    private static void lIllIIIlIlIIlIl() {
        lIIllIllIlIII = new int[20];
        l.lIIllIllIlIII[0] = (0xEF ^ 0x91 ^ (0xC0 ^ 0xA7)) & (0xD4 ^ 0xC7 ^ (0xCF ^ 0xC5) ^ -1);
        l.lIIllIllIlIII[1] = 1;
        l.lIIllIllIlIII[2] = 0xFFFF9FEB & 0x67DD;
        l.lIIllIllIlIII[3] = 0xC8 ^ 0x8A ^ (0xF9 ^ 0xA0);
        l.lIIllIllIlIII[4] = 0xCE ^ 0xB6 ^ (0x2C ^ 0x51);
        l.lIIllIllIlIII[5] = 2;
        l.lIIllIllIlIII[6] = 3;
        l.lIIllIllIlIII[7] = 0xBB ^ 0xBF;
        l.lIIllIllIlIII[8] = -(0xFFFF9B95 & 0x657F) & (0xFFFFAFF6 & 0x7F7F);
        l.lIIllIllIlIII[9] = 0x3F ^ 0x39;
        l.lIIllIllIlIII[10] = 0x1A ^ 0x1D;
        l.lIIllIllIlIII[11] = 5 ^ 0x5A ^ (0x76 ^ 0x21);
        l.lIIllIllIlIII[12] = 0xBA ^ 0x9B ^ (0x90 ^ 0xB8);
        l.lIIllIllIlIII[13] = 115 + 132 - 179 + 71 ^ 75 + 98 - 112 + 68;
        l.lIIllIllIlIII[14] = 51 + 106 - 149 + 165 ^ 128 + 51 - 107 + 94;
        l.lIIllIllIlIII[15] = -(0xFFFFA5D5 & 0x7A2B) & (0xFFFFBDFE & 0x6F1F);
        l.lIIllIllIlIII[16] = -(0x6B ^ 0x49) & (0xFFFFABFF & 0x5FAD);
        l.lIIllIllIlIII[17] = 0xFFFFED5B & 0x1FBD;
        l.lIIllIllIlIII[18] = -(0xFFFFFDDD & 0x3677) & (0xFFFFBFFF & 0x7FDE);
        l.lIIllIllIlIII[19] = 137 + 123 - 157 + 66 ^ 77 + 159 - 180 + 109;
    }

    private static boolean lIllIIIlIlIlIIl(Object object) {
        return object != null;
    }

    private static void lIllIIIlIlIIlII() {
        lIIllIllIIlll = new String[lIIllIllIlIII[19]];
        l.lIIllIllIIlll[l.lIIllIllIlIII[0]] = l."Closing our curtain to keep the guy inside:P";
        l.lIIllIllIIlll[l.lIIllIllIlIII[1]] = l."Couldn't find a house for the current location";
        l.lIIllIllIIlll[l.lIIllIllIlIII[5]] = l."Couldn't find an NPC to lure. (Trying to leave house)";
        l.lIIllIllIIlll[l.lIIllIllIlIII[6]] = l."Lure";
        l.lIIllIllIIlll[l.lIIllIllIlIII[7]] = l."Trade";
        l.lIIllIllIIlll[l.lIIllIllIlIII[4]] = l."Talk-to";
        l.lIIllIllIIlll[l.lIIllIllIlIII[9]] = l."Walking to the barman";
        l.lIIllIllIIlll[l.lIIllIllIlIII[10]] = l."Trading bar guy";
        l.lIIllIllIIlll[l.lIIllIllIlIII[11]] = l."Trade";
        l.lIIllIllIIlll[l.lIIllIllIlIII[12]] = l."Lure";
        l.lIIllIllIIlll[l.lIIllIllIlIII[13]] = l."Trade";
        l.lIIllIllIIlll[l.lIIllIllIlIII[14]] = l."Talk-to";
    }

    private static String lIllIIIlIlIIIlI(String var29, String var8) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var22 = var8.toCharArray();
        int var6 = lIIllIllIlIII[0];
        char[] var20 = var29.toCharArray();
        int var12 = var20.length;
        int var13 = lIIllIllIlIII[0];
        while (l.lIllIIIlIlIlIlI(var13, var12)) {
            char var5 = var20[var13];
            var1.append((char)(var5 ^ var22[var6 % var22.length]));
            0;
            ++var6;
            ++var13;
            0;
            if (((0x49 ^ 0x15) & ~(0x6D ^ 0x31)) == 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static String lIllIIIlIlIIIll(String var26, String var14) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIllIllIlIII[5], var19);
            return new String(var23.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIIlIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlIlIlIII(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIlIlIIIIl(String var15, String var9) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIII[11]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIllIllIlIII[5], var10);
            return new String(var18.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    public l(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.I = squireThievingConfig;
        this.J = squireThieving;
    }

    private static boolean lIllIIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject var3;
        l var2;
        if (!l.lIllIIIlIlIIllI(Game.getState(), GameState.LOGGED_IN) || !l.lIllIIIlIlIIllI((Object)this.I.method(), (Object)b.BLACK_JACK) || l.lIllIIIlIlIIlll(this.I.buyWines() ? 1 : 0)) {
            return lIIllIllIlIII[0];
        }
        int var21 = Inventory.getCount(item -> item.hasAction(k.z));
        if (l.lIllIIIlIlIIlll(var21)) {
            var2.J.a(lIIllIllIlIII[1]);
            0;
            if (2 != 2) {
                return ((139 + 34 - -23 + 0 ^ 14 + 76 - 82 + 147) & (0xB1 ^ 0xB7 ^ (0xA ^ 0x53) ^ -1)) != 0;
            }
        } else if (l.lIllIIIlIlIIlll(Inventory.getFreeSlots())) {
            var2.J.a(lIIllIllIlIII[0]);
        }
        if (l.lIllIIIlIlIIlll(var2.J.i() ? 1 : 0)) {
            return lIIllIllIlIII[0];
        }
        if (l.lIllIIIlIlIlIII(Shop.isOpen() ? 1 : 0)) {
            if (l.lIllIIIlIlIIlll(Shop.getStock((int)lIIllIllIlIII[2]))) {
                var2.K = lIIllIllIlIII[1];
                Keyboard.type((char)lIIllIllIlIII[3]);
                return lIIllIllIlIII[1];
            }
            Shop.buyFifty((int)lIIllIllIlIII[2]);
            return lIIllIllIlIII[1];
        }
        if (l.lIllIIIlIlIlIII(var2.K ? 1 : 0)) {
            int var16 = Worlds.getCurrentId();
            World var28 = Worlds.getRandom(world -> {
                int n3;
                if (l.lIllIIIlIlIlIII(world.isNormal() ? 1 : 0) && l.lIllIIIlIlIlIII(world.isMembers() ? 1 : 0) && l.lIllIIIlIlIllII(world.getId(), var16)) {
                    n3 = lIIllIllIlIII[1];
                    0;
                    if ((0x3E ^ 0x3A) == -1) {
                        return false;
                    }
                } else {
                    n3 = lIIllIllIlIII[0];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var28);
            var2.K = lIIllIllIlIII[0];
            return lIIllIllIlIII[1];
        }
        if (l.lIllIIIlIlIIlll(Worlds.isHopperOpen() ? 1 : 0)) {
            Worlds.openHopper();
            return lIIllIllIlIII[1];
        }
        Player var16 = Players.getLocal();
        WorldPoint var28 = var16.getWorldLocation();
        c var27 = var2.J.b().t();
        TileObject var7 = var2.J.a(var27, lIIllIllIlIII[0]);
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIlIII[1]];
        worldAreaArray[l.lIIllIllIlIII[0]] = var27.p();
        if (l.lIllIIIlIlIIlll(var28.isInArea(worldAreaArray) ? 1 : 0) && l.lIllIIIlIlIlIIl(var7) && l.lIllIIIlIlIlIlI(var7.distanceTo((Locatable)var16), lIIllIllIlIII[4])) {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[0]]);
            var2.J.a(var16, lIIllIllIlIII[0]);
            0;
            return lIIllIllIlIII[1];
        }
        if (l.lIllIIIlIlIIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIlIII[0];
        }
        c var11 = c.b(var16.getWorldLocation());
        if (l.lIllIIIlIlIlIll((Object)var11)) {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[1]]);
            var11 = var2.J.b().t();
        }
        c var25 = var11;
        if (l.lIllIIIlIlIlIII(var11.p().contains((Locatable)var16) ? 1 : 0)) {
            var3 = var2.J.a(var11, lIIllIllIlIII[1]);
            if (l.lIllIIIlIlIlIIl(var3)) {
                return var2.J.a(var16, lIIllIllIlIII[1]);
            }
            NPC var4 = NPCs.getNearest(nPC -> {
                int n2;
                block2: {
                    block3: {
                        if (!l.lIllIIIlIlIlIIl(nPC)) break block2;
                        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIlIII[1]];
                        worldAreaArray[l.lIIllIllIlIII[0]] = var25.p();
                        if (!l.lIllIIIlIlIIlll(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) break block2;
                        String[] stringArray = new String[lIIllIllIlIII[1]];
                        stringArray[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[12]];
                        if (!l.lIllIIIlIlIIlll(nPC.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[lIIllIllIlIII[1]];
                        stringArray2[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[13]];
                        if (!l.lIllIIIlIlIIlll(nPC.hasAction(stringArray2) ? 1 : 0)) break block3;
                        String[] stringArray3 = new String[lIIllIllIlIII[1]];
                        stringArray3[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[14]];
                        if (!l.lIllIIIlIlIlIII(nPC.hasAction(stringArray3) ? 1 : 0)) break block2;
                    }
                    n2 = lIIllIllIlIII[1];
                    0;
                    if ((0x48 ^ 0x72 ^ (0x68 ^ 0x56)) > -1) return n2 != 0;
                    return false;
                }
                n2 = lIIllIllIlIII[0];
                return n2 != 0;
            });
            if (l.lIllIIIlIlIlIll(var4)) {
                Log.info((String)lIIllIllIIlll[lIIllIllIlIII[5]]);
                return lIIllIllIlIII[0];
            }
            String[] stringArray = new String[lIIllIllIlIII[6]];
            stringArray[l.lIIllIllIlIII[0]] = lIIllIllIIlll[lIIllIllIlIII[6]];
            stringArray[l.lIIllIllIlIII[1]] = lIIllIllIIlll[lIIllIllIlIII[7]];
            stringArray[l.lIIllIllIlIII[5]] = lIIllIllIIlll[lIIllIllIlIII[4]];
            var4.interact(stringArray);
        }
        int[] nArray = new int[lIIllIllIlIII[1]];
        nArray[l.lIIllIllIlIII[0]] = lIIllIllIlIII[8];
        var3 = NPCs.getNearest((int[])nArray);
        if (l.lIllIIIlIlIlIll(var3)) {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[9]]);
            Movement.walkTo((WorldPoint)G.getRandom(), (boolean)lIIllIllIlIII[0]);
            0;
            0;
            if (((139 + 57 - 105 + 154 ^ 22 + 68 - -7 + 87) & (0xE4 ^ 0x9F ^ (0xA4 ^ 0x92) ^ -1)) >= 2) {
                return ((0x4A ^ 0x5A ^ (0xE3 ^ 0xBC)) & (54 + 224 - 256 + 218 ^ 156 + 96 - 77 + 16 ^ -1)) != 0;
            }
        } else {
            Log.info((String)lIIllIllIIlll[lIIllIllIlIII[10]]);
            var3.interact(lIIllIllIIlll[lIIllIllIlIII[11]]);
        }
        return lIIllIllIlIII[1];
    }

    private static boolean lIllIIIlIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    static {
        l.lIllIIIlIlIIlIl();
        l.lIllIIIlIlIIlII();
        H = lIIllIllIlIII[8];
        F = new WorldPoint(lIIllIllIlIII[15], lIIllIllIlIII[16], lIIllIllIlIII[0]);
        G = new WorldArea(lIIllIllIlIII[17], lIIllIllIlIII[18], lIIllIllIlIII[14], lIIllIllIlIII[10], lIIllIllIlIII[0]);
    }

    private static boolean lIllIIIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }
}


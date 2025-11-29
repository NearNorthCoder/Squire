/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck_Unknown;

/* TASK: Hopping to different world -> HoppingtodifferentworldTask */
@TaskDesc(name="Hopping to different world", priority=1000, blocking=true, register=true)
public class HoppingToDifferentWorldTask
extends ck_Unknown {
    private static /* synthetic */ String[] lIlllllIIll;
    private /* synthetic */ World hS;
    private static /* synthetic */ int[] lIlllllIlIl;

    private static /* synthetic */ boolean b(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0) && cj.lIIllIllIlIIll(world2.isMembers() ? 1 : 0) && cj.lIIllIllIlIIll(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0)) {
            n2 = lIlllllIlIl[4];
            0;
            if (1 < 0) {
                return false;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIIllIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0)) {
            n2 = lIlllllIlIl[4];
            0;
            if (1 <= ((0x1D ^ 0x21) & ~(5 ^ 0x39))) {
                return false;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }

    private static String lIIllIllIIlIll(String var18, String var14) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIlllllIlIl[5], var4);
            return new String(var23.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIlIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var5_5;
        void var4_4;
        cj var11;
        if (cj.lIIllIllIlIIll(this.hY.disableHopping() ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        if (cj.lIIllIllIlIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lIlllllIlIl[0];
        }
        Widget var8 = Widgets.get((int)lIlllllIlIl[1], (int)lIlllllIlIl[2]);
        if (cj.lIIllIllIlIIll(Widgets.isVisible((Widget)var8) ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        Widget var1 = var11.cu.getWidget(lIlllllIlIl[3]);
        if (cj.lIIllIllIlIIll(Widgets.isVisible((Widget)var1) ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        if (cj.lIIllIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        BankLoadout var22 = (BankLoadout)var11.hY.loadout().selected(BankLoadout.class);
        if (cj.lIIllIllIlIlIl(var22.needsToBank() ? 1 : 0)) {
            var11.hS = Worlds.getCurrentWorld();
            return lIlllllIlIl[0];
        }
        Log.info((String)lIlllllIIll[lIlllllIlIl[0]]);
        World var16 = Worlds.getCurrentWorld();
        if (cj.lIIllIllIlIllI(var16)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[4]]);
            return lIlllllIlIl[4];
        }
        if (cj.lIIllIllIlIlll(var11.hS) && cj.lIIllIllIllIII(var16.getId(), var11.hS.getId())) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[5]]);
            return lIlllllIlIl[0];
        }
        World var17 = var11.a(var16);
        if (cj.lIIllIllIlIllI(var17)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[2]]);
            return lIlllllIlIl[4];
        }
        if (cj.lIIllIllIlIlIl(Worlds.isHopperOpen() ? 1 : 0)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[6]]);
            Worlds.openHopper();
            return lIlllllIlIl[4];
        }
        this.sleep(lIlllllIlIl[7]);
        this.hS = var4_4;
        Worlds.hopTo((World)var5_5);
        Log.info((String)lIlllllIIll[lIlllllIlIl[8]]);
        return lIlllllIlIl[4];
    }

    private static boolean lIIllIllIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIIllIllIllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIllIllIIllII(String var20, String var13) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var24 = var13.toCharArray();
        int var6 = lIlllllIlIl[0];
        char[] var9 = var20.toCharArray();
        int var10 = var9.length;
        int var12 = lIlllllIlIl[0];
        while (cj.lIIllIllIllIIl(var12, var10)) {
            char var2 = var9[var12];
            var21.append((char)(var2 ^ var24[var6 % var24.length]));
            0;
            ++var6;
            ++var12;
            0;
            if (-(0x9C ^ 0xB0 ^ (0xA ^ 0x22)) <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean lIIllIllIlIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIllIllIlIIlI() {
        lIlllllIlIl = new int[13];
        cj.lIlllllIlIl[0] = (0x47 ^ 5 ^ (0x84 ^ 0x81)) & (199 + 64 - 232 + 196 ^ 95 + 31 - 120 + 158 ^ -1);
        cj.lIlllllIlIl[1] = 0xFFFF9F5A & 0x62FF;
        cj.lIlllllIlIl[2] = 3;
        cj.lIlllllIlIl[3] = 0xFFFFD57D & 0x3042AC2;
        cj.lIlllllIlIl[4] = 1;
        cj.lIlllllIlIl[5] = 2;
        cj.lIlllllIlIl[6] = 112 + 89 - 156 + 111 ^ 82 + 84 - 111 + 97;
        cj.lIlllllIlIl[7] = 0xE6 ^ 0xAB ^ (0x12 ^ 0x77);
        cj.lIlllllIlIl[8] = 0x26 ^ 0x3F ^ (0x26 ^ 0x3A);
        cj.lIlllllIlIl[9] = 129 + 112 - 180 + 129 ^ 55 + 166 - 172 + 135;
        cj.lIlllllIlIl[10] = 0xFFFF93F8 & 0x6E5F;
        cj.lIlllllIlIl[11] = 0x71 ^ 0x76;
        cj.lIlllllIlIl[12] = 0x3A ^ 0x32;
    }

    /*
     * WARNING - void declaration
     */
    private World a(World world) {
        World world3;
        void var25;
        String string = this.hY.worldsHopping();
        if (cj.lIIllIllIlIlIl(string.isEmpty() ? 1 : 0)) {
            String[] stringArray = string.split(lIlllllIIll[lIlllllIlIl[9]]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(Stream.of(stringArray).anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = lIlllllIlIl[4];
                    0;
                    if (1 < 0) {
                        return ((0x96 ^ 0xC4 ^ (3 ^ 8) & ~(0x7D ^ 0x76)) & (0xE3 ^ 0x97 ^ (0x81 ^ 0xA7) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlllllIlIl[0];
                }
                return n2 != 0;
            });
        }
        World var3 = Worlds.getRandom(arg_0 -> cj.c((World)var25, arg_0));
        if (cj.lIIllIllIlIllI(var3) && cj.lIIllIllIlIllI(var3 = Worlds.getRandom(arg_0 -> cj.b((World)var25, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> cj.a((World)var25, arg_0));
        }
        return world3;
    }

    private static String lIIllIllIIlIlI(String var19, String var15) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlllllIlIl[12]), "DES");
            Cipher var27 = Cipher.getInstance("DES");
            var27.init(lIlllllIlIl[5], var26);
            return new String(var27.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    protected cj(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIIllIllIIllIl() {
        lIlllllIIll = new String[lIlllllIlIl[11]];
        cj.lIlllllIIll[cj.lIlllllIlIl[0]] = cj."[HopTask] Need to hop";
        cj.lIlllllIIll[cj.lIlllllIlIl[4]] = cj."[HopTask] Cannot determine our current world";
        cj.lIlllllIIll[cj.lIlllllIlIl[5]] = cj."[HopTask] No need to hop since we are already on a different world";
        cj.lIlllllIIll[cj.lIlllllIlIl[2]] = cj."[HopTask] Failing to find a world to hop to??";
        cj.lIlllllIIll[cj.lIlllllIlIl[6]] = cj."[HopTask] World hopper is not open";
        cj.lIlllllIIll[cj.lIlllllIlIl[8]] = cj."[HopTask] We just hopped";
        cj.lIlllllIIll[cj.lIlllllIlIl[9]] = cj.",";
    }

    static {
        cj.lIIllIllIlIIlI();
        cj.lIIllIllIIllIl();
    }

    private static boolean lIIllIllIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIlIIll(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean c(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0) && cj.lIIllIllIlIIll(world2.isMembers() ? 1 : 0) && cj.lIIllIllIlIIll(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0) && cj.lIIllIllIllIIl(world2.getPlayerCount(), lIlllllIlIl[10])) {
            n2 = lIlllllIlIl[4];
            0;
            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.World
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.api.widgets.Production
 */
package u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.charters.SquireCharterShips;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.World;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Production;
import u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.a;

/* TASK: Charter shiping -> ChartershipingTask */
@TaskDesc(name="Charter shiping")
public class c
extends Task {
    private static /* synthetic */ String[] lIlIllIllllI;
    private /* synthetic */ boolean c;
    @Inject
    private /* synthetic */ SquireCharterShips b;
    private /* synthetic */ boolean e;
    private static /* synthetic */ int[] lIlIlllIIIIl;
    private /* synthetic */ int d;

    private static boolean lllIIIIlIlIlIl(int n) {
        return n > 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n, int n2) {
        void var18;
        void var10;
        if (!u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Shop.getStock((int)lIlIlllIIIIl[7])) || u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(Shop.getStock((int)lIlIlllIIIIl[8]))) {
            var32.c = lIlIlllIIIIl[2];
            Keyboard.type((char)lIlIlllIIIIl[11]);
            return;
        }
        int[] nArray = new int[lIlIlllIIIIl[2]];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[12];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll(Inventory.getCount((boolean)lIlIlllIIIIl[2], (int[])nArray), lIlIlllIIIIl[13])) {
            c var32;
            Log.info((String)lIlIllIllllI[lIlIlllIIIIl[2]]);
            var32.b.forceStop();
            return;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll((int)var10, (int)var18)) {
            Shop.buyTen((int)lIlIlllIIIIl[7]);
            0;
            if (-((0x4F ^ 0) & ~(0xDE ^ 0x91) ^ (0x6E ^ 0x6A)) >= 0) {
                return;
            }
        } else {
            Shop.buyTen((int)lIlIlllIIIIl[8]);
        }
    }

    private static boolean lllIIIIlIlIIll(int n, int n2) {
        return n < n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean h() {
        int n;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIlII(Players.getLocal().getAnimation(), lIlIlllIIIIl[10])) {
            int[] nArray = new int[lIlIlllIIIIl[2]];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIlIl(Inventory.getCount((int[])nArray))) {
                n = lIlIlllIIIIl[2];
                0;
                if (2 == 2) return n != 0;
                return ((0x3F ^ 0x20 ^ (0x4D ^ 6)) & (47 + 56 - -63 + 75 ^ 70 + 36 - -14 + 45 ^ -1)) != 0;
            }
        }
        n = lIlIlllIIIIl[1];
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void b(int n, int n2) {
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIlIl(n) && u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIlIl(n2)) {
            void var21;
            SpellBook.Lunar lunar = SpellBook.Lunar.SUPERGLASS_MAKE;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(lunar.canCast() ? 1 : 0)) {
                Log.info((String)lIlIllIllllI[lIlIlllIIIIl[5]]);
                this.b.forceStop();
                return;
            }
            Magic.cast((Spell)var21);
        }
        int[] nArray = new int[lIlIlllIIIIl[2]];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)a.b().a());
            lllllllllllllllIllIIlIIlIIIIlIlI.d = lIlIlllIIIIl[0];
            return;
        }
        Inventory.use((int)lIlIlllIIIIl[4], (int)lIlIlllIIIIl[6]);
        0;
    }

    private boolean g() {
        boolean bl;
        int n = this.d;
        this.d = n - lIlIlllIIIIl[2];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIIl(n, lIlIlllIIIIl[2])) {
            bl = lIlIlllIIIIl[2];
            0;
            
            }
        } else {
            bl = lIlIlllIIIIl[1];
        }
        return bl;
    }

    private static boolean lllIIIIlIlIllI(int n) {
        return n == 0;
    }

    static {
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIIllll();
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    private static int f() {
        void var8;
        int n = lIlIlllIIIIl[1];
        a[] aArray = a.values();
        int n2 = aArray.length;
        int var6 = lIlIlllIIIIl[1];
        while (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll(var6, (int)var8)) {
            void var33;
            void var16 = var33[var6];
            int[] nArray = new int[lIlIlllIIIIl[2]];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = var16.c();
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                void var5;
                int[] nArray2 = new int[lIlIlllIIIIl[2]];
                nArray2[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = var16.c();
                int var15 = Inventory.getCount((int[])nArray2);
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIIl((int)var5, lIlIlllIIIIl[3])) {
                    0;
                    if (-1 > 3) {
                        return (0x76 ^ 0x4F ^ (0xD2 ^ 0xB6)) & (0xB0 ^ 0x85 ^ (0xE9 ^ 0x81) ^ -1);
                    }
                } else {
                    int[] nArray3 = new int[lIlIlllIIIIl[2]];
                    nArray3[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = var16.c();
                    Inventory.dropAll((int[])nArray3);
                    0;
                    var5 += var15;
                }
            }
            ++var6;
            0;
            if (((0x57 ^ 6 ^ (0x1C ^ 0x2F)) & (0xB3 ^ 0xAF ^ (9 ^ 0x77) ^ -1)) == 0) continue;
            return (71 + 109 - 72 + 25 ^ 95 + 139 - 114 + 23) & (0x58 ^ 0x7A ^ (0x6A ^ 0x42) ^ -1);
        }
        return n;
    }

    private static String lllIIIIlIIlIlI(String var28, String var1) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var29 = var1.toCharArray();
        int var2 = lIlIlllIIIIl[1];
        char[] var14 = var28.toCharArray();
        int var3 = var14.length;
        int var30 = lIlIlllIIIIl[1];
        while (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll(var30, var3)) {
            char var19 = var14[var30];
            var31.append((char)(var19 ^ var29[var2 % var29.length]));
            0;
            ++var2;
            ++var30;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    private static String lllIIIIlIIllII(String var4, String var26) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlIlllIIIIl[5], var24);
            return new String(var11.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIlIIlIll(String var7, String var25) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), lIlIlllIIIIl[3]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIlllIIIIl[5], var27);
            return new String(var17.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        c var9;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.h() ? 1 : 0)) {
            this.d = lIlIlllIIIIl[0];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(var9.g() ? 1 : 0)) {
            return lIlIlllIIIIl[1];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.i() ? 1 : 0)) {
            var9.e = lIlIlllIIIIl[2];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(var9.e ? 1 : 0)) {
            int var20 = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.f();
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIIl(var20, lIlIlllIIIIl[3])) {
                return lIlIlllIIIIl[2];
            }
            var9.e = lIlIlllIIIIl[1];
        }
        a var20 = a.b();
        int[] nArray = new int[lIlIlllIIIIl[2]];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Production.isOpen() ? 1 : 0)) {
                Production.chooseOption((int)var20.a());
                var9.d = lIlIlllIIIIl[5];
                return lIlIlllIIIIl[1];
            }
            Inventory.use((int)lIlIlllIIIIl[4], (int)lIlIlllIIIIl[6]);
            0;
            return lIlIlllIIIIl[2];
        }
        int[] nArray2 = new int[lIlIlllIIIIl[2]];
        nArray2[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[7];
        int var13 = Inventory.getCount((int[])nArray2);
        int[] nArray3 = new int[lIlIlllIIIIl[2]];
        nArray3[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[8];
        int[] nArray4 = new int[lIlIlllIIIIl[2]];
        nArray4[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[9];
        int var12 = Inventory.getCount((int[])nArray3) + Inventory.getCount((int[])nArray4);
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            var9.b(var13, var12);
            return lIlIlllIIIIl[2];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(var9.c ? 1 : 0)) {
            Worlds.hopTo((World)Worlds.getRandom(world -> {
                int n;
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(world.isNormal() ? 1 : 0) && u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(world.isMembers() ? 1 : 0)) {
                    n = lIlIlllIIIIl[2];
                    0;
                    if (3 == 0) {
                        return false;
                    }
                } else {
                    n = lIlIlllIIIIl[1];
                }
                return n != 0;
            }));
            var9.c = lIlIlllIIIIl[1];
            return lIlIlllIIIIl[2];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Shop.isOpen() ? 1 : 0)) {
            var9.a(var13, var12);
            return lIlIlllIIIIl[2];
        }
        NPC var22 = NPCs.getNearest(nPC -> {
            int n;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(nPC.getName().contains(lIlIllIllllI[lIlIlllIIIIl[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlllIIIIl[2]];
                stringArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIllIllllI[lIlIlllIIIIl[0]];
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n = lIlIlllIIIIl[2];
                    0;
                    if (1 == 1) return n != 0;
                    return false;
                }
            }
            n = lIlIlllIIIIl[1];
            return n != 0;
        });
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIlI(var22)) {
            return lIlIlllIIIIl[1];
        }
        var4_5.interact(lIlIllIllllI[lIlIlllIIIIl[1]]);
        return lIlIlllIIIIl[2];
    }

    private static boolean lllIIIIlIlIIII(int n) {
        return n != 0;
    }

    private static boolean lllIIIIlIlIIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lllIIIIlIlIlII(int n, int n2) {
        return n == n2;
    }

    private static void lllIIIIlIIllll() {
        lIlIlllIIIIl = new int[16];
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[0] = 0x22 ^ 0x47 ^ (0x5E ^ 0x3F);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1] = (0x74 ^ 0x65) & ~(0xB0 ^ 0xA1);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[2] = 1;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[3] = 60 + 82 - -3 + 42 ^ 141 + 22 - 72 + 88;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[4] = 0xFFFF8EEF & 0x77FF;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[5] = 2;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[6] = -(0xFFFFBF6F & 0x7995) & (0xFFFFFFFD & 0x3FFF);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[7] = -(0xFFFFD7E9 & 0x6917) & (0xFFFFCFF7 & 0x77FF);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[8] = -(0xFFFFDE7F & 0x75AF) & (0xFFFFFDBF & 0x57FF);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[9] = -(0xFFFFCE2D & 0x79DB) & (0xFFFFDEFD & 0x6FFF);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[10] = 0xFFFF8F7C & 0x73F7;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[11] = 0x41 ^ 0x5A;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[12] = -(0xFFFFF87F & 0xF95) & (0xFFFFCBFF & 0x3FF7);
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[13] = 0xCE ^ 0xAA;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[14] = 3;
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[15] = 0xED ^ 0x97 ^ 51 + 69 - 108 + 115;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean i() {
        int n;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIlIlllIIIIl[2]];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(Inventory.getCount((int[])nArray))) {
                n = lIlIlllIIIIl[2];
                0;
                if (-1 < 0) return n != 0;
                return ((0xF4 ^ 0x84 ^ (0x2C ^ 0x40)) & (88 + 81 - 119 + 128 ^ 71 + 83 - 138 + 158 ^ -1)) != 0;
            }
        }
        n = lIlIlllIIIIl[1];
        return n != 0;
    }

    private static boolean lllIIIIlIlIIlI(Object object) {
        return object == null;
    }

    private static void lllIIIIlIIllIl() {
        lIlIllIllllI = new String[lIlIlllIIIIl[15]];
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c."Trade";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[2]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c."Stopping because we are out of coins";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[5]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c."Stopping because we cannot cast superglass make";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[14]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c."Trader";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[0]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c."Trade";
    }
}


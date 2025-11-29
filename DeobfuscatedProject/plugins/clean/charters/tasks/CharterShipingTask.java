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
package gg.squire.charters.tasks;

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
import gg.squire.charters.tasks.GameEnum2;

@TaskDesc(name="Charter shiping")
public class CharterShipingTask
extends Task {
    
    private  boolean c;
    @Inject
    private  SquireCharterShips b;
    private  boolean e;
    
    private  int d;

    private static boolean lllIIIIlIlIlIl(int n) {
        return n > 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n, int n2) {
        void var1;
        void var2;
        if (!u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Shop.getStock((int)lIlIlllIIIIl[7])) || u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(Shop.getStock((int)lIlIlllIIIIl[8]))) {
            var3.c = lIlIlllIIIIl[2];
            Keyboard.type((char)lIlIlllIIIIl[11]);
            return;
        }
        int[] nArray = new int[lIlIlllIIIIl[2]];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[12];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll(Inventory.getCount((boolean)lIlIlllIIIIl[2], (int[])nArray), lIlIlllIIIIl[13])) {
            c var3;
            Log.info((String)lIlIllIllllI[lIlIlllIIIIl[2]]);
            var3.b.forceStop();
            return;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll((int)var2, (int)var1)) {
            Shop.buyTen((int)lIlIlllIIIIl[7]);

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
            void var4;
            SpellBook.Lunar lunar = SpellBook.Lunar.SUPERGLASS_MAKE;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(lunar.canCast() ? 1 : 0)) {
                Log.info((String)lIlIllIllllI[lIlIlllIIIIl[5]]);
                this.b.forceStop();
                return;
            }
            Magic.cast((Spell)var4);
        }
        int[] nArray = new int[lIlIlllIIIIl[2]];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)a.b().a());
            var5.d = lIlIlllIIIIl[0];
            return;
        }
        Inventory.use((int)lIlIlllIIIIl[4], (int)lIlIlllIIIIl[6]);

    }

    private boolean g() {
        boolean bl;
        int n = this.d;
        this.d = n - lIlIlllIIIIl[2];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIIl(n, lIlIlllIIIIl[2])) {
            bl = lIlIlllIIIIl[2];

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
        void var6;
        int n = lIlIlllIIIIl[1];
        a[] aArray = a.values();
        int n2 = aArray.length;
        int var7 = lIlIlllIIIIl[1];
        while (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIll(var7, (int)var6)) {
            void var8;
            void var9 = var8[var7];
            int[] nArray = new int[lIlIlllIIIIl[2]];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = var9.CharterShipingTask();
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                void var10;
                int[] nArray2 = new int[lIlIlllIIIIl[2]];
                nArray2[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = var9.CharterShipingTask();
                int var11 = Inventory.getCount((int[])nArray2);
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIIl((int)var10, lIlIlllIIIIl[3])) {

                    if (-1 > 3) {
                        return (0x76 ^ 0x4F ^ (0xD2 ^ 0xB6)) & (0xB0 ^ 0x85 ^ (0xE9 ^ 0x81) ^ -1);
                    }
                } else {
                    int[] nArray3 = new int[lIlIlllIIIIl[2]];
                    nArray3[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = var9.CharterShipingTask();
                    Inventory.dropAll((int[])nArray3);

                    var10 += var11;
                }
            }
            ++var7;

            if (((0x57 ^ 6 ^ (0x1C ^ 0x2F)) & (0xB3 ^ 0xAF ^ (9 ^ 0x77) ^ -1)) == 0) continue;
            return (71 + 109 - 72 + 25 ^ 95 + 139 - 114 + 23) & (0x58 ^ 0x7A ^ (0x6A ^ 0x42) ^ -1);
        }
        return n;
    }

        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        c var13;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.h() ? 1 : 0)) {
            this.d = lIlIlllIIIIl[0];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(var13.g() ? 1 : 0)) {
            return lIlIlllIIIIl[1];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.i() ? 1 : 0)) {
            var13.e = lIlIlllIIIIl[2];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(var13.e ? 1 : 0)) {
            int var14 = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.f();
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIIl(var14, lIlIlllIIIIl[3])) {
                return lIlIlllIIIIl[2];
            }
            var13.e = lIlIlllIIIIl[1];
        }
        a var14 = a.b();
        int[] nArray = new int[lIlIlllIIIIl[2]];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Production.isOpen() ? 1 : 0)) {
                Production.chooseOption((int)var14.a());
                var13.d = lIlIlllIIIIl[5];
                return lIlIlllIIIIl[1];
            }
            Inventory.use((int)lIlIlllIIIIl[4], (int)lIlIlllIIIIl[6]);

            return lIlIlllIIIIl[2];
        }
        int[] nArray2 = new int[lIlIlllIIIIl[2]];
        nArray2[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[7];
        int var15 = Inventory.getCount((int[])nArray2);
        int[] nArray3 = new int[lIlIlllIIIIl[2]];
        nArray3[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[8];
        int[] nArray4 = new int[lIlIlllIIIIl[2]];
        nArray4[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIlllIIIIl[9];
        int var16 = Inventory.getCount((int[])nArray3) + Inventory.getCount((int[])nArray4);
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            var13.b(var15, var16);
            return lIlIlllIIIIl[2];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(var13.c ? 1 : 0)) {
            Worlds.hopTo((World)Worlds.getRandom(world -> {
                int n;
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(world.isNormal() ? 1 : 0) && u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(world.isMembers() ? 1 : 0)) {
                    n = lIlIlllIIIIl[2];

                    if (3 == 0) {
                        return false;
                    }
                } else {
                    n = lIlIlllIIIIl[1];
                }
                return n != 0;
            }));
            var13.c = lIlIlllIIIIl[1];
            return lIlIlllIIIIl[2];
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(Shop.isOpen() ? 1 : 0)) {
            var13.a(var15, var16);
            return lIlIlllIIIIl[2];
        }
        NPC var17 = NPCs.getNearest(nPC -> {
            int n;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(nPC.getName().contains(lIlIllIllllI[lIlIlllIIIIl[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlllIIIIl[2]];
                stringArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = lIlIllIllllI[lIlIlllIIIIl[0]];
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n = lIlIlllIIIIl[2];

                    if (1 == 1) return n != 0;
                    return false;
                }
            }
            n = lIlIlllIIIIl[1];
            return n != 0;
        });
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lllIIIIlIlIIlI(var17)) {
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
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[1]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r."Trade";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[2]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r."Stopping because we are out of coins";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[5]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r."Stopping because we cannot cast superglass make";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[14]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r."Trader";
        u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIllIllllI[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.lIlIlllIIIIl[0]] = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r."Trade";
    }
}


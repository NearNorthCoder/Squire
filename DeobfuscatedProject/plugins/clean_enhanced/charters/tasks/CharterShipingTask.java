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

    /*
     * WARNING - void declaration
     */
    private void a(int n, int n2) {
        void var3;
        void var4;
        if (!u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Shop.getStock(int7)) || u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Shop.getStock((int == 0)8))) {
            var5.c = 2;
            Keyboard.type((char)var2[11]);
            return;
        }
        int[] nArray = new int[2];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = var2[12];
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.getCount((boolean)2 < Inventory.getCount((boolean)22)nArray), var2[13])) {
            c var5;
            Log.info((String)var1[2]);
            var5.b.forceStop();
            return;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.((int)var4 < (int)var3)) {
            Shop.buyTen((int)7);
            0;
            if (-((0x4F ^ 0) & ~(0xDE ^ 0x91) ^ (0x6E ^ 0x6A)) >= 0) {
                return;
            }
        } else {
            Shop.buyTen((int)8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean h() {
        int n;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Players.getLocal().getAnimation() == Players.getLocal().getAnimation()2)) {
            int[] nArray = new int[2];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 4;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.getCount((int[] > 0)nArray))) {
                n = 2;
                0;
                if (2 == 2) return n != 0;
                return ((0x3F ^ 0x20 ^ (0x4D ^ 6)) & (47 + 56 - -63 + 75 ^ 70 + 36 - -14 + 45 ^ -1)) != 0;
            }
        }
        n = 1;
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void b(int n, int n2) {
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(n > 0) && u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(n2 > 0)) {
            void var6;
            SpellBook.Lunar lunar = SpellBook.Lunar.SUPERGLASS_MAKE;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(lunar.canCast( == 0) ? 1 : 0)) {
                Log.info((String)var1[5]);
                this.b.forceStop();
                return;
            }
            Magic.cast((Spevar6);
        }
        int[] nArray = new int[2];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 4;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Production.isOpen( != 0) ? 1 : 0)) {
            Production.chooseOption((int)a.b().a());
            var7.d = 0;
            return;
        }
        Inventory.use((int)4, (int)6);
        0;
    }

    private boolean g() {
        boolean bl;
        int n = this.d;
        this.d = n - 2;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(n > 2)) {
            bl = 2;
            0;
            if null != null {
                return ((0x16 ^ 0) & ~(0x86 ^ 0x90)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static int f() {
        void var10;
        int n = 1;
        a[] aArray = a.values();
        int n2 = aArray.length;
        int var11 = 1;
        while (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(var11 < var10)) {
            void var12;
            void var13 = var12[var11];
            int[] nArray = new int[2];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = var13.CharterShipingTask();
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                void var14;
                int[] nArray2 = new int[2];
                nArray2[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = var13.CharterShipingTask();
                int var15 = Inventory.getCount((int[])nArray2);
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.((int)var14 > (int)lllllllllllllllIllIIlIIlIIIlllII2)) {
                    0;
                    if (-1 > 3) {
                        return (0x76 ^ 0x4F ^ (0xD2 ^ 0xB6)) & (0xB0 ^ 0x85 ^ (0xE9 ^ 0x81) ^ -1);
                    }
                } else {
                    int[] nArray3 = new int[2];
                    nArray3[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = var13.CharterShipingTask();
                    Inventory.dropAll((int[])nArray3);
                    0;
                    var14 += var15;
                }
            }
            ++var11;
            0;
            if (((0x57 ^ 6 ^ (0x1C ^ 0x2F)) & (0xB3 ^ 0xAF ^ (9 ^ 0x77) ^ -1)) == 0) continue;
            return (71 + 109 - 72 + 25 ^ 95 + 139 - 114 + 23) & (0x58 ^ 0x7A ^ (0x6A ^ 0x42) ^ -1);
        }
        return n;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 1;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 1;
        while (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(var24 < lllllllllllllllIllIIlIIIlllIllII2)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            
            return null;
        }
        return String.valueOf(var19);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        c var38;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.h( != 0) ? 1 : 0)) {
            this.d = 0;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(var38.g( != 0) ? 1 : 0)) {
            return 1;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.i( != 0) ? 1 : 0)) {
            var38.e = 2;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(var38.e != 0)) {
            int var39 = u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c.f();
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(var39 > lllllllllllllllIllIIlIIlIIlIIllI2)) {
                return 2;
            }
            var38.e = 1;
        }
        a var39 = a.b();
        int[] nArray = new int[2];
        nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 4;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Production.isOpen( != 0) ? 1 : 0)) {
                Production.chooseOption((int)var39.a());
                var38.d = 5;
                return 1;
            }
            Inventory.use((int)4, (int)6);
            0;
            return 2;
        }
        int[] nArray2 = new int[2];
        nArray2[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 7;
        int var40 = Inventory.getCount((int[])nArray2);
        int[] nArray3 = new int[2];
        nArray3[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 8;
        int[] nArray4 = new int[2];
        nArray4[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 9;
        int var41 = Inventory.getCount((int[])nArray3) + Inventory.getCount((int[])nArray4);
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.isFull( != 0) ? 1 : 0)) {
            var38.b(var40, var41);
            return 2;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(var38.c != 0)) {
            Worlds.hopTo((World)Worlds.getRandom(world -> {
                int n;
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(world.isNormal( != 0) ? 1 : 0) && u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(world.isMembers( != 0) ? 1 : 0)) {
                    n = 2;
                    0;
                    
                } else {
                    n = 1;
                }
                return n != 0;
            }));
            var38.c = 1;
            return 2;
        }
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Shop.isOpen( != 0) ? 1 : 0)) {
            var38.a(var40, var41);
            return 2;
        }
        NPC var42 = NPCs.getNearest(nPC -> {
            int n;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(nPC.getName( != 0).contains(var1[var2[14]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = var1[0];
                if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(nPC.hasActionstringArray)) {
                    n = 2;
                    0;
                    if (1 == 1) return n != 0;
                    return ((3 ^ 0x1C) & ~(0xAB ^ 0xB4)) != 0;
                }
            }
            n = 1;
            return n != 0;
        });
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.var42 == null) {
            return 1;
        }
        var4_5.interact(var1[1]);
        return 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean i() {
        int n;
        if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.isFull( != 0) ? 1 : 0)) {
            int[] nArray = new int[2];
            nArray[u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.1] = 4;
            if (u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.(Inventory.getCount((int[] == 0)nArray))) {
                n = 2;
                0;
                if (-1 < 0) return n != 0;
                return ((0xF4 ^ 0x84 ^ (0x2C ^ 0x40)) & (88 + 81 - 119 + 128 ^ 71 + 83 - 138 + 158 ^ -1)) != 0;
            }
        }
        n = 1;
        return n != 0;
    }

}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.miner.MinerConfig;
import gg.squire.runecrafting.tasks.AHelper;
import gg.squire.runecrafting.tasks.GameEnum;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mine rocks")
public class MineRocksTask
extends Task {
     int j;
     int m;
    private static  String[] llII;
     WorldArea t;
     int p;
     int n;
     WorldArea u;
     int g;
    private final  MinerConfig f;
    private static  int[] llIl;
     int r;
     int q;
     int s;
     int h;
     int l;
     int i;
     int o;
     int k;

    private int a() {
        c var1;
        if (c.lIIIll((Object)this.f.getRockType(), (Object)d.RUNE)) {
            if (c.lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return this.o;
            }
            return var1.g;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.ADDY)) {
            if (c.lIIIIl(var1.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return var1.p;
            }
            return var1.m;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.COAL)) {
            if (c.lIIIIl(var1.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return var1.q;
            }
            return var1.h;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.MITHRIL)) {
            if (c.lIIIIl(var1.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return var1.r;
            }
            return var1.k;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.IRON)) {
            if (c.lIIIIl(var1.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return var1.s;
            }
            return var1.i;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.SOFTCLAY)) {
            return var1.j;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.GOLD)) {
            return var1.l;
        }
        if (c.lIIIll((Object)var1.f.getRockType(), (Object)d.SILVER)) {
            return var1.n;
        }
        return llIl[17];
    }

    private static String lllIl(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = llIl[17];
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = llIl[17];
        while (c.lIIllI(var9, var8)) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (2 <= 2) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIl(int n) {
        return n == 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if (c.lIIIIl(Inventory.isFull() ? 1 : 0) && c.lIIIIl(this.f.getuseBankerNote() ? 1 : 0)) {
            Item item2;
            int[] nArray = new int[llIl[22]];
            nArray[c.llIl[17]] = a.a;
            Item item3 = Inventory.getFirst((int[])nArray);
            if (c.lIIIlI(item3) && c.lIIIlI(item2 = Inventory.getFirst(item -> {
                boolean bl;
                Item var16;
                if ((!c.lIIlIl(item.getName().contains(llII[llIl[17]]) ? 1 : 0) || !c.lIIlIl(item.getName().contains(llII[llIl[22]]) ? 1 : 0) || c.lIIIIl(item.getName().contains(llII[llIl[23]]) ? 1 : 0)) && c.lIIlIl(var16.isNoted() ? 1 : 0)) {
                    bl = llIl[22];
                    0;
                    if (((0x50 ^ 0x1C) & ~(0xC2 ^ 0x8E)) > 0) {
                        return ((4 ^ 0x5F) & ~(0xDE ^ 0x85)) != 0;
                    }
                } else {
                    bl = llIl[17];
                }
                return bl;
            }))) {
                item2.useOn(item3);
                return llIl[17];
            }
        }
        if (c.lIIIIl(Players.getLocal().isIdle() ? 1 : 0)) {
            TileObject var17;
            c var18;
            if (c.lIIIIl(var18.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int var19 = var18.a();
                var17 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (c.lIIlII(tileObject.getId(), var19) && c.lIIIIl(this.t.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        n2 = llIl[22];
                        0;
                        if (-1 >= 3) {
                            return ((0x46 ^ 0x7D) & ~(0xAB ^ 0x90)) != 0;
                        }
                    } else {
                        n2 = llIl[17];
                    }
                    return n2 != 0;
                });
                if (c.lIIIlI(var17)) {
                    var17.interact(llIl[17]);
                    return llIl[17];
                }
                0;
                if null != null {
                    return ((0x92 ^ 0xBC) & ~(0xB5 ^ 0x9B)) != 0;
                }
            } else {
                int var19 = var18.a();
                var17 = TileObjects.getNearest(tileObject -> {
                    boolean bl;
                    if (c.lIIlII(tileObject.getId(), var19)) {
                        bl = llIl[22];
                        0;
                        if (3 <= -1) {
                            return ((0x42 ^ 0x6F) & ~(0x31 ^ 0x1C)) != 0;
                        }
                    } else {
                        bl = llIl[17];
                    }
                    return bl;
                });
                if (c.lIIIlI(var17)) {
                    var17.interact(llIl[17]);
                    return llIl[17];
                }
            }
        }
        return llIl[17];
    }

    @Inject
    public MineRocksTask(MinerConfig minerConfig) {
        this.g = llIl[0];
        this.h = llIl[1];
        this.i = llIl[2];
        this.j = llIl[3];
        this.k = llIl[4];
        this.l = llIl[5];
        this.m = llIl[6];
        this.n = llIl[7];
        this.o = llIl[8];
        this.p = llIl[9];
        this.q = llIl[10];
        this.r = llIl[11];
        this.s = llIl[12];
        this.t = new WorldArea(llIl[13], llIl[14], llIl[15], llIl[16], llIl[17]);
        this.u = new WorldArea(llIl[18], llIl[19], llIl[20], llIl[21], llIl[17]);
        this.f = minerConfig;
    }

    private static boolean lIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIIIl(int n) {
        return n != 0;
    }

    private static boolean lIIllI(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlII(int n, int n2) {
        return n == n2;
    }

    private static void lIIIII() {
        llIl = new int[26];
        c.llIl[0] = 0xFFFFFD7F & 0x8FF1;
        c.llIl[1] = -(0xFFFFF21F & 0x6DE3) & (0xFFFFFF7F & 0xEDEE);
        c.llIl[2] = -(0xFFFFF251 & 0x7DBF) & (0xFFFFFDFB & 0xFF7F);
        c.llIl[3] = 0xFFFFFD7F & 0x8FF2;
        c.llIl[4] = -(0xFFFFD2F7 & 0x7F99) & (0xFFFFDFFF & 0xFFFF);
        c.llIl[5] = -(0xFFFFF697 & 0x5B7A) & (0xFFFFFFFF & 0xDF7F);
        c.llIl[6] = 0xFFFF8F75 & 0xFDFA;
        c.llIl[7] = 0xFFFFAF7F & 0xDDED;
        c.llIl[8] = 0xFFFFFE73 & 0x2DFD;
        c.llIl[9] = 0xFFFFFEEE & 0x2D7F;
        c.llIl[10] = -(89 + 6 - 53 + 95) & (0xFFFFADEF & 0x7EFF);
        c.llIl[11] = -(0xFFFFFDB3 & 0x125F) & (0xFFFFBD7E & 0x7EFF);
        c.llIl[12] = -(0xFFFFD1AF & 0x7F5B) & (0xFFFFFDEF & 0x7F7F);
        c.llIl[13] = -(0xFFFFF7DF & 0x6865) & (0xFFFFFEFF & 0x6FEF);
        c.llIl[14] = 0xFFFF8EFC & 0x7FE3;
        c.llIl[15] = 119 + 89 - 158 + 95 ^ 53 + 79 - 118 + 127;
        c.llIl[16] = 0xB0 ^ 0xAC ^ (0x6E ^ 0x64);
        c.llIl[17] = (0xCA ^ 0x83) & ~(0x6B ^ 0x22);
        c.llIl[18] = 0xFFFFEE97 & 0x1FED;
        c.llIl[19] = 0xFFFFCFE7 & 0x3EDF;
        c.llIl[20] = 0xD1 ^ 0xB6 ^ (0x74 ^ 0x48);
        c.llIl[21] = 0xCE ^ 0x9B ^ (0x40 ^ 0x51);
        c.llIl[22] = 1;
        c.llIl[23] = 2;
        c.llIl[24] = 3;
        c.llIl[25] = 0x50 ^ 0x58;
    }
}


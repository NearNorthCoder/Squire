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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
     WorldArea t;
     int p;
     int n;
     WorldArea u;
     int g;
    private final  MinerConfig f;
    
     int r;
     int q;
     int s;
     int h;
     int l;
     int i;
     int o;
     int k;

    private int a() {
        c lllllllIIlIlIIl;
        if (c.lIIIll((Object)this.f.getRockType(), (Object)d.RUNE)) {
            if (c.lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return this.o;
            }
            return lllllllIIlIlIIl.g;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.ADDY)) {
            if (c.lIIIIl(lllllllIIlIlIIl.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lllllllIIlIlIIl.p;
            }
            return lllllllIIlIlIIl.m;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.COAL)) {
            if (c.lIIIIl(lllllllIIlIlIIl.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lllllllIIlIlIIl.q;
            }
            return lllllllIIlIlIIl.h;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.MITHRIL)) {
            if (c.lIIIIl(lllllllIIlIlIIl.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lllllllIIlIlIIl.r;
            }
            return lllllllIIlIlIIl.k;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.IRON)) {
            if (c.lIIIIl(lllllllIIlIlIIl.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lllllllIIlIlIIl.s;
            }
            return lllllllIIlIlIIl.i;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.SOFTCLAY)) {
            return lllllllIIlIlIIl.j;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.GOLD)) {
            return lllllllIIlIlIIl.l;
        }
        if (c.lIIIll((Object)lllllllIIlIlIIl.f.getRockType(), (Object)d.SILVER)) {
            return lllllllIIlIlIIl.n;
        }
        return llIl[17];
    }

        return String.valueOf(lllllllIIIlIIII);
    }

    private static boolean lIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIl(int n) {
        return n == 0;
    }

    public boolean run() {
        if (c.lIIIIl(Inventory.isFull() ? 1 : 0) && c.lIIIIl(this.f.getuseBankerNote() ? 1 : 0)) {
            Item item2;
            int[] nArray = new int[llIl[22]];
            nArray[c.llIl[17]] = a.a;
            Item item3 = Inventory.getFirst((int[])nArray);
            if (c.lIIIlI(item3) && c.lIIIlI(item2 = Inventory.getFirst(item -> {
                boolean bl;
                Item lllllllIIIlllIl;
                if ((!c.lIIlIl(item.getName().contains(llII[llIl[17]]) ? 1 : 0) || !c.lIIlIl(item.getName().contains(llII[llIl[22]]) ? 1 : 0) || c.lIIIIl(item.getName().contains(llII[llIl[23]]) ? 1 : 0)) && c.lIIlIl(lllllllIIIlllIl.isNoted() ? 1 : 0)) {
                    bl = llIl[22];

                    if (((0x50 ^ 0x1C) & ~(0xC2 ^ 0x8E)) > 0) {
                        return false;
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
            TileObject lllllllIIlIlIll;
            c lllllllIIlIllIl;
            if (c.lIIIIl(lllllllIIlIllIl.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int lllllllIIlIllII = lllllllIIlIllIl.a();
                lllllllIIlIlIll = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (c.lIIlII(tileObject.getId(), lllllllIIlIllII) && c.lIIIIl(this.t.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        n2 = llIl[22];

                        if (-1 >= 3) {
                            return false;
                        }
                    } else {
                        n2 = llIl[17];
                    }
                    return n2 != 0;
                });
                if (c.lIIIlI(lllllllIIlIlIll)) {
                    lllllllIIlIlIll.interact(llIl[17]);
                    return llIl[17];
                }

                }
            } else {
                int lllllllIIlIllII = lllllllIIlIllIl.a();
                lllllllIIlIlIll = TileObjects.getNearest(tileObject -> {
                    boolean bl;
                    if (c.lIIlII(tileObject.getId(), lllllllIIlIllII)) {
                        bl = llIl[22];

                        if (3 <= -1) {
                            return false;
                        }
                    } else {
                        bl = llIl[17];
                    }
                    return bl;
                });
                if (c.lIIIlI(lllllllIIlIlIll)) {
                    lllllllIIlIlIll.interact(llIl[17]);
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

    private static void lllll() {
        llII = new String[llIl[24]];
        c.llII[c.llIl[17]] = "ore";
        c.llII[c.llIl[22]] = "Coal";
        c.llII[c.llIl[23]] = "clay";
    }

    static {
        c.lIIIII();
        c.lllll();
    }

}


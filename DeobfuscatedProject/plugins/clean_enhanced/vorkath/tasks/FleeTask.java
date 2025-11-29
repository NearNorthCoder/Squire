/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Flee", priority=108, register=true)
public class FleeTask
extends VorkathManager {
    public static final  int ci;

    public static final  int cj;
    private  int ck;

    private boolean Y() {
        int n2 = this.cf.getBoostedSkillLevel(Skill.PRAYER);
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(n2 > 6)) {
            return 0;
        }
        return Inventory.contains(item -> item.getName().startsWith(var2[9]));
    }

    static {
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.var3();
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.var4();
        cj = 5;
        ci = 7;
    }

    private boolean Z() {
        int n2;
        x var5;
        int n3;
        int n4 = 7;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Combat.isVenomed( != 0) ? 1 : 0)) {
            n3 = 6;
            0;
            if (((0x73 ^ 0x54) & ~(0x37 ^ 0x10)) != 0) {
                return ((0xBD ^ 0xA0) & ~(0x48 ^ 0x55)) != 0;
            }
        } else {
            n3 = 1;
        }
        int var6 = n4 + n3;
        String var7 = var2[8];
        if (!i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var5.X( == 0) ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Combat.isVenomed( != 0) ? 1 : 0) || !i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Combat.getCurrentHealth() <= var6) || i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Inventory.contains(item -> item.getName( != 0).startsWith(var7)) ? 1 : 0)) {
            n2 = 0;
            0;
            if (1 > 2) {
                return ((123 + 17 - 85 + 72 ^ (0xC ^ 0x74)) & (0xA2 ^ 0xC3 ^ (0x63 ^ 5) ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = 1;
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = 1;
        while (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var16 < var15)) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-1 <= ((0x99 ^ 0xC1) & ~(0xE9 ^ 0xB1))) continue;
            return null;
        }
        return String.valueOf(var11);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private boolean X() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Combat.getCurrentHealth() > this.ce.eatAtHP())) {
            return 0;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Inventory.getCount((boolean > 0)0, item -> {
            String[] stringArray = new String[0];
            stringArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.1] = var2[var1[10]];
            return item.hasAction(stringArray);
        }))) {
            bl = 0;
            0;
            if (-1 > (0xD4 ^ 0xA9 ^ (0x3A ^ 0x43))) {
                return ((0x1F ^ 0x3B ^ (0xC5 ^ 0xB3)) & (0x46 ^ 8 ^ (0x42 ^ 0x5E) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private boolean aa() {
        int n2;
        int var24;
        int n3;
        int var25;
        int n4;
        x var26;
        int n5;
        int n6 = 7;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Combat.isVenomed( != 0) ? 1 : 0)) {
            n5 = 6;
            0;
            if (-3 >= 0) {
                return ((0x26 ^ 1) & ~(0x48 ^ 0x6F)) != 0;
            }
        } else {
            n5 = 1;
        }
        int var27 = n6 + n5;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var26.cf.getBoostedSkillLevel(Skill.HITPOINTS) <= 7)) {
            n4 = 0;
            0;
            if ((7 ^ 2 ^ (0x2F ^ 0x24) & ~(0x6F ^ 0x64)) == 0) {
                return ((0xC7 ^ 0xA5 ^ (0xF1 ^ 0xC7)) & (56 + 148 - 4 + 7 ^ 93 + 153 - 234 + 143 ^ -1)) != 0;
            }
        } else {
            n4 = var25 = 1;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var26.cf.getTickCount() - var26.cg.F() > 5)) {
            n3 = 0;
            0;
            if (2 < 1) {
                return ((0x35 ^ 0x6C) & ~(0xE4 ^ 0xBD)) != 0;
            }
        } else {
            n3 = var24 = 1;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.var25 && i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var24 == 0) && i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var26.ab( != 0) ? 1 : 0)) {
            n2 = 0;
            0;
            if (-1 >= 1) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    @Inject
    protected FleeTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private boolean ab() {
        boolean bl;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(this.cf.getTickCount() - this.ck > 8)) {
            bl = 0;
            0;
            if (2 <= 0) {
                return ((0x8F ^ 0xBA) & ~(0x5A ^ 0x6F)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    private static void W() {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(TeleportLoader.canEnterHouse( != 0) ? 1 : 0)) {
            TeleportLoader.enterHouse();
            0;
            0;
            if (3 != 3) {
                return;
            }
        } else {
            int[] nArray = new int[0];
            nArray[i.v.k.o.-.u.s.e.r.a.q.r.t.h.1] = 2;
            if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray2 = new int[0];
                nArray2[i.v.k.o.-.u.s.e.r.a.q.r.t.h.1] = 2;
                Inventory.getFirst((int[])nArray2).interact(var2[1]);
            }
        }
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(hitsplatApplied.getActor() == hitsplatApplied.getActor()2))) {
            this.ck = this.cf.getTickCount();
        }
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Q() {
        x var34;
        int var35;
        int n2 = 1;
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(this.X( == 0) ? 1 : 0)) {
            Log.info((String)var2[0]);
            var35 = 0;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var34.Y( == 0) ? 1 : 0)) {
            Log.info((String)var2[3]);
            var35 = 0;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var34.Z( == 0) ? 1 : 0)) {
            Log.info((String)var2[4]);
            var35 = 0;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var34.aa( != 0) ? 1 : 0)) {
            Log.info((String)var2[5]);
            var35 = 0;
        }
        if (i.v.k.o.-.u.s.e.r.a.q.r.t.h.(var35 == 0)) {
            return 1;
        }
        i.v.k.o.-.u.s.e.r.a.q.r.t.h.x.W();
        this.x.a(0);
        return 0;
    }

}


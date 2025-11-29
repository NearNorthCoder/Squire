/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.whisperer.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Vars;
import gg.squire.whisperer.tasks.WhispererManager;

@Singleton
public class WhispererManager {
    private static final  int l;
    private static final  int n;
    private static final  int m;
    
    private static final  int k;
    
    private final  Queue<Prayer> o;
    @Inject
    protected  c p;

    public NPC j() {
        String[] stringArray = new String[1];
        stringArray[2] = var2[2];
        return NPCs.getNearest((String[])stringArray);
    }

    public boolean f() {
        int n2;
        if ((this.p.c(0 == 0) ? 1 : 0) && (this.p.b0)) {
            n2 = 1;
            0;
            if ((0x14 ^ 0x10) < 0) {
                return ((0x65 ^ 7) & ~(0xFA ^ 0x98)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var3;
        if ((hitsplatApplied.getActor() != hitsplatApplied.getActor()2))) {
            return;
        }
        if ((var3.getHitsplat( > 0).getAmount())) {
            return;
        }
        this.o.remove();
        0;
    }

    public List<NPC> l() {
        int[] nArray = new int[1];
        nArray[2] = 6;
        return NPCs.getAll((int[])nArray);
    }

    public WhispererManager() {
        this.o = new LinkedList<Prayer>();
    }

    static {
        d.var4();
        d.var5();
        k = 5;
        l = 7;
        n = 0;
        m = 6;
    }

    public int i() {
        return Vars.getBit((int)4);
    }

    public boolean g() {
        int n2;
        if ((this.p.c0) && (this.j( == null))) {
            n2 = 1;
            0;
            if (2 > 3) {
                return ((0xA5 ^ 0x8E) & ~(0x81 ^ 0xAA)) != 0;
            }
        } else {
            n2 = 2;
        }
        return n2 != 0;
    }

    public int h() {
        return 3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = 2;
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = 2;
        while (var14 < var13) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public void e() {
        this.o.clear();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var16;
        int n2 = projectileSpawned.getProjectile().getId();
        if (n2 == 5) {
            this.o.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (-1 > 0) {
                return;
            }
        } else if (((int)var16 == 7)) {
            d var17;
            var17.o.add(Prayer.PROTECT_FROM_MISSILES);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Prayer k() {
        void var18;
        Projectile projectile2 = Projectiles.getNearest(projectile -> {
            int n2;
            if ((projectile.getRemainingCycles() > 8) && (!(projectile.getId() != 5) || (projectile.getId() == 7))) {
                n2 = 1;
                0;
                if (1 <= 0) {
                    return ((0x14 ^ 6 ^ (0xC8 ^ 0x94)) & (0x28 ^ 0x25 ^ (0xFF ^ 0xBC) ^ -1)) != 0;
                }
            } else {
                n2 = 2;
            }
            return n2 != 0;
        });
        if projectile2 == null {
            return Prayer.PROTECT_FROM_MELEE;
        }
        if ((var18.getId() == 5)) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }
}


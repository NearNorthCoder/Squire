/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.client.Static
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling Akkha Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingAkkhaPrayersTask
extends ToaManager {

    private  Prayer aY;
    private  int aZ;
    private  Prayer aX;

    private static boolean var3(int n2) {
        return n2 > 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        int[] nArray = new int[var1[5]];
        nArray[D.var1[1]] = var1[6];
        nArray[D.var1[0]] = var1[7];
        nArray[D.var1[8]] = var1[9];
        nArray[D.var1[10]] = var1[3];
        return this.aS.a(nArray);
    }

    @Override
    public n J() {
        return this.aT.prayerFlickAkkha();
    }

    @Override
    public boolean I() {
        return var1[0];
    }

    @Override
    public int F() {
        return var1[4];
    }

    static {
        D.var5();
        D.var6();
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var8(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> E() {
        void var9;
        int var10;
        int n2;
        D var11;
        String[] stringArray = new String[var1[0]];
        stringArray[D.var1[1]] = var2[var1[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (D.var12(nPC)) {
            return List.of(this.H());
        }
        if (D.var8(Static.getClient().getTickCount(), var11.aZ)) {
            var11.aX = var11.aY;
        }
        int[] nArray = new int[var1[0]];
        nArray[D.var1[1]] = var1[2];
        if (D.var3(Projectiles.getAll((int[])nArray).size())) {
            n2 = var1[0];
            0;
            if ((0x8A ^ 0x8E) == ((0xD7 ^ 0x8C) & ~(0xE7 ^ 0xBC) & ~((0xB8 ^ 0x8E) & ~(0x63 ^ 0x55)))) {
                return null;
            }
        } else {
            n2 = var1[1];
        }
        if (D.var13(var10 = n2) && D.var14(var11.aY, Prayer.PROTECT_FROM_MELEE) && D.var13(var9.isAnimating() ? 1 : 0)) {
            var11.aX = var11.aY;
        }
        if (D.var7(var9.getId(), var1[3])) {
            var11.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(this.H(), this.aX);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var15;
        Actor actor = animationChanged.getActor();
        if (D.var4(actor instanceof Player)) {
            return;
        }
        if (D.var16(var15.getId(), var1[6]) && D.var16(var15.getId(), var1[7]) && D.var16(var15.getId(), var1[9])) {
            return;
        }
        if (D.var7(var15.getAnimation(), var1[11])) {
            var17.aX = Prayer.PROTECT_FROM_MELEE;
        }
        if (D.var7(var15.getAnimation(), var1[12])) {
            var17.aX = Prayer.PROTECT_FROM_MISSILES;
        }
        if (D.var7(var15.getAnimation(), var1[13])) {
            var17.aX = Prayer.PROTECT_FROM_MAGIC;
        }
        this.aZ = Static.getClient().getTickCount() + var1[5];
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var18;
        NPC nPC = npcChanged.getNpc();
        if (D.var7(nPC.getId(), var1[6])) {
            this.aY = Prayer.PROTECT_FROM_MELEE;
            0;
            if ((24 + 134 - 49 + 56 ^ 127 + 101 - 158 + 91) == 2) {
                return;
            }
        } else if (D.var7(var18.getId(), var1[7])) {
            var19.aY = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (-1 == ((74 + 18 - 42 + 99 ^ 17 + 47 - -40 + 92) & (205 + 187 - 141 + 4 ^ 119 + 39 - 64 + 80 ^ -1))) {
                return;
            }
        } else if (D.var7(var18.getId(), var1[9])) {
            var19.aY = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    private static boolean var14(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    private static void var6() {
        var2 = new String[var1[0]];
        D.var2[D.var1[1]] = "Akkha";
    }

    @Inject
    public HandlingAkkhaPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.aX = Prayer.PROTECT_FROM_MELEE;
        this.aY = Prayer.PROTECT_FROM_MAGIC;
    }

    private static void var5() {
        var1 = new int[15];
        D.var1[0] = 1;
        D.var1[1] = (0xE8 ^ 0xB7) & ~(0xD ^ 0x52);
        D.var1[2] = -(0xFFFFE63B & 0x5FF7) & (0xFFFFFEFF & 0x4FFF);
        D.var1[3] = 0xFFFFBFFF & 0x6E13;
        D.var1[4] = 0xFFFFF9F7 & 0x3F5C;
        D.var1[5] = 0xF ^ 0xB;
        D.var1[6] = -(0xFFFFD3B6 & 0x2D7B) & (0xFFFFAF7F & 0x7FBF);
        D.var1[7] = 0xFFFFBF5F & 0x6EAF;
        D.var1[8] = 2;
        D.var1[9] = 0xFFFFAF9D & 0x7E72;
        D.var1[10] = 3;
        D.var1[11] = 0xFFFFFFAF & 0x267A;
        D.var1[12] = 0xFFFFFEEC & 0x273F;
        D.var1[13] = -(0xFFFFD897 & 0x7FF9) & (0xFFFFFEFF & 0x7FBE);
        D.var1[14] = 0x26 ^ 0x77 ^ (0x46 ^ 0x1F);
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }
}


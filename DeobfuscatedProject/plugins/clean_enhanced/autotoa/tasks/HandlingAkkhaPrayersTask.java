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
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling Akkha Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingAkkhaPrayersTask
extends AutotoaManager {
    
    private  Prayer df;
    private  int dg;
    
    private  Prayer de;

    @Override
    public boolean aL() {
        int[] nArray = new int[var2[5]];
        nArray[ar.var2[1]] = var2[6];
        nArray[ar.var2[0]] = var2[7];
        nArray[ar.var2[8]] = var2[9];
        nArray[ar.var2[10]] = var2[3];
        return this.cm.a(nArray);
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    private static void var6() {
        var1 = new String[var2[0]];
        ar.var1[ar.var2[1]] = "Akkha";
    }

    @Override
    public int aO() {
        return var2[4];
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aS() {
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void var8;
        NPC nPC = npcChanged.getNpc();
        if (ar.var7(nPC.getId(), var2[6])) {
            this.df = Prayer.PROTECT_FROM_MELEE;
            0;
            if (3 < 2) {
                return;
            }
        } else if (ar.var7(var8.getId(), var2[7])) {
            var9.df = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (-1 != -1) {
                return;
            }
        } else if (ar.var7(var8.getId(), var2[9])) {
            var9.df = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var10;
        Actor actor = animationChanged.getActor();
        if (ar.var11(actor instanceof Player)) {
            return;
        }
        if (ar.var3(var10.getId(), var2[6]) && ar.var3(var10.getId(), var2[7]) && ar.var3(var10.getId(), var2[9])) {
            return;
        }
        if (ar.var7(var10.getAnimation(), var2[11])) {
            var12.de = Prayer.PROTECT_FROM_MELEE;
        }
        if (ar.var7(var10.getAnimation(), var2[12])) {
            var12.de = Prayer.PROTECT_FROM_MISSILES;
        }
        if (ar.var7(var10.getAnimation(), var2[13])) {
            var12.de = Prayer.PROTECT_FROM_MAGIC;
        }
        this.dg = Static.getClient().getTickCount() + var2[5];
    }

    private static boolean var13(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ar.var14();
        ar.var6();
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static void var14() {
        var2 = new int[14];
        ar.var2[0] = 1;
        ar.var2[1] = (104 + 159 - 63 + 10 ^ 151 + 53 - 59 + 53) & (0x9C ^ 0x8F ^ (0xA2 ^ 0xA5) ^ -1);
        ar.var2[2] = -(0xFFFFDF13 & 0x37EF) & (0xFFFFBFFF & 0x5FCF);
        ar.var2[3] = 0xFFFFAF3F & 0x7ED3;
        ar.var2[4] = -(0xFFFFA4AB & 0x5F75) & (0xFFFFFFF7 & 0x3D7C);
        ar.var2[5] = 0x75 ^ 0x71;
        ar.var2[6] = -(0xFFFFFD71 & 0x539F) & (0xFFFFFF7E & 0x7F9F);
        ar.var2[7] = 0xFFFFFE8F & 0x2F7F;
        ar.var2[8] = 2;
        ar.var2[9] = -(3 + 182 - 24 + 33) & (0xFFFFAEF3 & 0x7FDD);
        ar.var2[10] = 3;
        ar.var2[11] = -(0xFFFFDBB7 & 0x65DD) & (0xFFFFE7FF & 0x7FBE);
        ar.var2[12] = -(0xFFFFDBE7 & 0x7DDB) & (0xFFFFFFFF & 0x7FEE);
        ar.var2[13] = 0xFFFFF7FE & 0x2E2F;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        void var15;
        int var16;
        int n2;
        ar var17;
        String[] stringArray = new String[var2[0]];
        stringArray[ar.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (ar.var4(nPC)) {
            return List.of(this.aQ());
        }
        if (ar.var13(Static.getClient().getTickCount(), var17.dg)) {
            var17.de = var17.df;
        }
        int[] nArray = new int[var2[0]];
        nArray[ar.var2[1]] = var2[2];
        if (ar.var18(Projectiles.getAll((int[])nArray).isEmpty() ? 1 : 0)) {
            n2 = var2[0];
            0;
            if (2 != 2) {
                return null;
            }
        } else {
            n2 = var2[1];
        }
        if (ar.var18(var16 = n2) && ar.var5(var17.df, Prayer.PROTECT_FROM_MELEE) && ar.var18(var15.isAnimating() ? 1 : 0)) {
            var17.de = var17.df;
        }
        if (ar.var7(var15.getId(), var2[3])) {
            var17.de = Prayer.PROTECT_FROM_MAGIC;
        }
        return List.of(this.aQ(), this.de);
    }

    @Inject
    public HandlingAkkhaPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.de = Prayer.PROTECT_FROM_MELEE;
        this.df = Prayer.PROTECT_FROM_MAGIC;
    }

    private static boolean var18(int n2) {
        return n2 == 0;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}


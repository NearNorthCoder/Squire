/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling Warden Prayers", register=true, priority=0x7FFFFFFF)
public class HandlingWardenPrayersTask
extends AutotoaManager {
    private  Prayer dE;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if (aE.var4(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var5 = var3.getMessage();
        if (aE.var6(var5.contains(var2[var1[2]]) ? 1 : 0)) {
            var7.dE = Prayer.PROTECT_FROM_MELEE;
            0;
            if ((0xE6 ^ 0xA4 ^ (0xD4 ^ 0x92)) <= 2) {
                return;
            }
        } else if (aE.var6(var5.contains(var2[var1[4]]) ? 1 : 0)) {
            var7.dE = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (-1 > ((0x8C ^ 0xB6) & ~(0x36 ^ 0xC))) {
                return;
            }
        } else if (aE.var6(var5.contains(var2[var1[1]]) ? 1 : 0)) {
            var7.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public int aO() {
        return var1[0];
    }

    @Inject
    public HandlingWardenPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var16() {
        var1 = new int[19];
        aE.var1[0] = -(0xFFFFE6E9 & 0x5DBF) & (0xFFFFFFFF & 0x7FF8);
        aE.var1[1] = 2;
        aE.var1[2] = (0x55 ^ 0x1B) & ~(0xD4 ^ 0x9A);
        aE.var1[3] = 0xFFFFFFFB & 0x2DFE;
        aE.var1[4] = 1;
        aE.var1[5] = -(0xFFFFC3D7 & 0x7E2D) & (0xFFFFFFFF & 0x6FFF);
        aE.var1[6] = 0xAD ^ 0xAB;
        aE.var1[7] = -(0xFFFFBDB5 & 0x524F) & (0xFFFFBFEF & 0x7DFD);
        aE.var1[8] = -(0xFFFFF3FE & 0x1E03) & (0xFFFFFFEF & 0x3FFB);
        aE.var1[9] = -(0xFFFFAA45 & 0x57BB) & (0xFFFFFFFF & 0x2FEB);
        aE.var1[10] = 3;
        aE.var1[11] = -1 & (0xFFFFBDED & 0x6FFE);
        aE.var1[12] = 107 + 116 - 115 + 71 ^ 91 + 10 - -62 + 20;
        aE.var1[13] = -(0xFFFFC6BF & 0x7B51) & (0xFFFFFFFF & 0x6FFD);
        aE.var1[14] = 0x82 ^ 0xAE ^ (0x9C ^ 0xB5);
        aE.var1[15] = 0xFFFFEDEF & 0x3FFE;
        aE.var1[16] = 0xFFFFFDFF & 0x27BC;
        aE.var1[17] = -(0xFFFFDF07 & 0x7AFB) & (0xFFFFFFBF & Short.MAX_VALUE);
        aE.var1[18] = 0x75 ^ 0x7D;
    }

    private static void var17() {
        var2 = new String[var1[10]];
        aE.var2[aE.var1[2]] = "scimitar";
        aE.var2[aE.var1[4]] = "skull";
        aE.var2[aE.var1[1]] = "arrow";
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[var1[1]];
        nArray[aE.var1[2]] = var1[3];
        nArray[aE.var1[4]] = var1[5];
        if (aE.var8(NPCs.getNearest((int[])nArray))) {
            return var1[4];
        }
        int[] nArray2 = new int[var1[6]];
        nArray2[aE.var1[2]] = var1[7];
        nArray2[aE.var1[4]] = var1[8];
        nArray2[aE.var1[1]] = var1[9];
        nArray2[aE.var1[10]] = var1[11];
        nArray2[aE.var1[12]] = var1[13];
        nArray2[aE.var1[14]] = var1[15];
        return this.cm.a(nArray2);
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var25;
        Actor actor = animationChanged.getActor();
        if (aE.var6(actor instanceof Player)) {
            return;
        }
        if (aE.var24(var25.getAnimation(), var1[16])) {
            var26.dE = Prayer.PROTECT_FROM_MISSILES;
            0;
            if null != null {
                return;
            }
        } else if (aE.var24(var25.getAnimation(), var1[17])) {
            var26.dE = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    static {
        aE.var16();
        aE.var17();
    }

    @Override
    public List<Prayer> aN() {
        if (aE.var9(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }
}


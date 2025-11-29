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
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling Warden Prayers", register=true)
public class HandlingWardenPrayersTask
extends ToaManager {
    
    private  Prayer ba;

    @Override
    public boolean C() {
        int[] nArray = new int[var2[1]];
        nArray[G.var2[2]] = var2[3];
        nArray[G.var2[4]] = var2[5];
        nArray[G.var2[6]] = var2[7];
        nArray[G.var2[8]] = var2[9];
        nArray[G.var2[10]] = var2[11];
        nArray[G.var2[12]] = var2[13];
        return this.aS.a(nArray);
    }

    private static void var3() {
        var2 = new int[17];
        G.var2[0] = 0xFFFFFF71 & 0x3BDE;
        G.var2[1] = 0x50 ^ 0x56;
        G.var2[2] = (0xA ^ 6) & ~(0x91 ^ 0x9D);
        G.var2[3] = -(0xFFFF9B5F & 0x76B1) & (0xFFFFFFFB & 0x3FFD);
        G.var2[4] = 1;
        G.var2[5] = -(0xFFFFB7D6 & 0x5A3F) & (0xFFFFFFFF & 0x3FFF);
        G.var2[6] = 2;
        G.var2[7] = -(0x27 ^ 0x32) & (0xFFFFFFFF & 0x2DFF);
        G.var2[8] = 3;
        G.var2[9] = -(0xFFFFD7DB & 0x7A37) & (0xFFFFFFFE & Short.MAX_VALUE);
        G.var2[10] = 0x35 ^ 0x31;
        G.var2[11] = -(0xFFFF9B7B & 0x7697) & (0xFFFFFFFF & 0x3FFF);
        G.var2[12] = 0x67 ^ 0x62;
        G.var2[13] = -2 & (0xFFFFAFFF & 0x7DEF);
        G.var2[14] = 0xFFFFE7FF & 0x3DBC;
        G.var2[15] = 0xFFFFADFD & 0x77BF;
        G.var2[16] = 0x74 ^ 0x2B ^ (0x4F ^ 0x18);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> E() {
        if (G.var10(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickWarden();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var11;
        Actor actor = animationChanged.getActor();
        if (G.var12(actor instanceof Player)) {
            return;
        }
        if (G.var13(var11.getAnimation(), var2[14])) {
            var14.ba = Prayer.PROTECT_FROM_MISSILES;
            0;
            if null != null {
                return;
            }
        } else if (G.var13(var11.getAnimation(), var2[15])) {
            var14.ba = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var15;
        if (G.var16(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var17 = var15.getMessage();
        if (G.var12(var17.contains(var1[var2[2]]) ? 1 : 0)) {
            var18.ba = Prayer.PROTECT_FROM_MELEE;
            0;
            if (1 < 0) {
                return;
            }
        } else if (G.var12(var17.contains(var1[var2[4]]) ? 1 : 0)) {
            var18.ba = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (2 < ((0x5B ^ 0x6B) & ~(0x2F ^ 0x1F))) {
                return;
            }
        } else if (G.var12(var17.contains(var1[var2[6]]) ? 1 : 0)) {
            var18.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    private static void var19() {
        var1 = new String[var2[8]];
        G.var1[G.var2[2]] = "scimitar";
        G.var1[G.var2[4]] = "skull";
        G.var1[G.var2[6]] = "arrow";
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    static {
        G.var3();
        G.var19();
    }

    @Override
    public int F() {
        return var2[0];
    }

    @Inject
    public HandlingWardenPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }
}


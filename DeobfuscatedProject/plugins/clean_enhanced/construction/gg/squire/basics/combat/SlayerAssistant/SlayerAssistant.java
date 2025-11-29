/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.NPCManager
 *  net.runelite.client.game.NpcUtil
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.basics.combat.SlayerAssistant;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.combat.SlayerAssistant.DisturbingKrakenTask;
import gg.squire.basics.combat.SlayerAssistant.EquippingBraceletsTask;
import gg.squire.basics.combat.SlayerAssistant.GameEnum23;
import gg.squire.basics.combat.SlayerAssistant.ThrowingFishingExplosiveTask;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.NPCManager;
import net.runelite.client.game.NpcUtil;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Slayer Assistant", description="Auto-killing blows so you do not have to spend Slayer points on it. Auto-equipping expeditious bracelets/bracelets of slaughter.", enabledByDefault=false)
@SquireUtil
public class SlayerAssistant
extends SquirePlugin {
    private static  int[] lIlIlIllI;
    private static  String[] lIlIlIlIl;
    @Inject
    private  NPCManager ci;
    @Inject
    private  NpcUtil ch;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    private static boolean var2(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var3() {
        lIlIlIllI = new int[7];
        SlayerAssistant.lIlIlIllI[0] = 1;
        SlayerAssistant.lIlIlIllI[1] = (0x2F ^ 0x23) & ~(0xA3 ^ 0xAF);
        SlayerAssistant.lIlIlIllI[2] = -(0xFFFFE3B2 & 0x3CFF) & (0xFFFFBDF7 & 0x72FB);
        SlayerAssistant.lIlIlIllI[3] = -1;
        SlayerAssistant.lIlIlIllI[4] = 3;
        SlayerAssistant.lIlIlIllI[5] = 2;
        SlayerAssistant.lIlIlIllI[6] = 0x15 ^ 0xD ^ (0xA8 ^ 0xB4);
    }

    protected void onStop() {
    }

    private static boolean var4(int n2) {
        return n2 >= 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SlayerAssistant.var1(chatMessage.getMessage().contains(lIlIlIlIl[lIlIlIllI[1]]) ? 1 : 0)) {
            this.forceStop();
        }
    }

    static {
        SlayerAssistant.var3();
        SlayerAssistant.var6();
    }

    /*
     * WARNING - void declaration
     */
    private int f(NPC nPC) {
        void var2_2;
        void var3_3;
        void var4_4;
        SlayerAssistant var7;
        void var8;
        if (!SlayerAssistant.var9(nPC) || SlayerAssistant.var5(nPC.getName())) {
            return lIlIlIllI[3];
        }
        int var10 = var8.getHealthScale();
        int var11 = var8.getHealthRatio();
        Integer var12 = var7.ci.getHealth(var8.getId());
        if (!SlayerAssistant.var4(var11) || !SlayerAssistant.var13(var10) || SlayerAssistant.var5(var12)) {
            return lIlIlIllI[3];
        }
        return (int)((float)(var4_4.intValue() * var3_3 / var2_2) + 0.5f);
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static boolean var14(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (SlayerAssistant.var14(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIlIllI[0]];
                stringArray[SlayerAssistant.lIlIlIllI[1]] = lIlIlIlIl[lIlIlIllI[0]];
                if (SlayerAssistant.var1(nPC.hasAction(stringArray) ? 1 : 0) && SlayerAssistant.var2(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIlIllI[6])) {
                    n2 = lIlIlIllI[0];
                    0;
                    if (2 != 0) return n2 != 0;
                    return ((42 + 101 - -67 + 35 ^ 154 + 20 - 89 + 92) & (0xEA ^ 0xAD ^ 3 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIllI[1];
            return n2 != 0;
        });
        int[] nArray = new int[lIlIlIllI[0]];
        nArray[SlayerAssistant.lIlIlIllI[1]] = lIlIlIllI[2];
        Item item = Inventory.getFirst((int[])nArray);
        if (SlayerAssistant.var15(list.isEmpty() ? 1 : 0)) {
            void var16;
            int var17;
            SlayerAssistant var18;
            NPC var19;
            Actor var20 = list.iterator();
            while (SlayerAssistant.var1(var20.hasNext() ? 1 : 0)) {
                var19 = (NPC)var20.next();
                var17 = var18.f(var19);
                if (SlayerAssistant.var21(var17, lIlIlIllI[3]) && SlayerAssistant.var2(var17, T.GARGOYLES.aQ()) && SlayerAssistant.var9(var16)) {
                    var16.useOn((Actor)var19);
                }
                0;
                if ((0x12 ^ 0x25 ^ (0x17 ^ 0x24)) != 3) continue;
                return;
            }
            var20 = Players.getLocal().getInteracting();
            if (SlayerAssistant.var1(var20 instanceof NPC) && SlayerAssistant.var21(var17 = var18.f(var19 = (NPC)var20), lIlIlIllI[3]) && SlayerAssistant.var2(var17, T.GARGOYLES.aQ()) && SlayerAssistant.var9(var16)) {
                var16.useOn((Actor)var19);
            }
        }
    }

    private static boolean var13(int n2) {
        return n2 > 0;
    }

    protected void onStart() {
    }

    private static void var6() {
        lIlIlIlIl = new String[lIlIlIllI[5]];
        SlayerAssistant.lIlIlIlIl[SlayerAssistant.lIlIlIllI[1]] = "completed your task!";
        SlayerAssistant.lIlIlIlIl[SlayerAssistant.lIlIlIllI[0]] = "Attack";
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlIllI[4]];
        classArray[SlayerAssistant.lIlIlIllI[1]] = ThrowingFishingExplosiveTask.class;
        classArray[SlayerAssistant.lIlIlIllI[0]] = EquippingBraceletsTask.class;
        classArray[SlayerAssistant.lIlIlIllI[5]] = DisturbingKrakenTask.class;
        return classArray;
    }
}


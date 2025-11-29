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
import gg.squire.basics.combat.SlayerAssistant.GameEnum115;
import gg.squire.basics.combat.SlayerAssistant.ThrowingFishingExplosiveTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    @Inject
    private  NPCManager ci;
    @Inject
    private  NpcUtil ch;

    private static boolean lIIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    protected void onStop() {
    }

    private static boolean lIIlIlllIll(int n2) {
        return n2 >= 0;
    }

    private static boolean lIIlIlllIlI(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SlayerAssistant.lIIlIllIllI(chatMessage.getMessage().contains(lIlIlIlIl[lIlIlIllI[1]]) ? 1 : 0)) {
            this.forceStop();
        }
    }

    static {
        SlayerAssistant.lIIlIllIlII();
        SlayerAssistant.lIIlIllIIll();
    }

    /*
     * WARNING - void declaration
     */
    private int f(NPC nPC) {
        void var2_2;
        void var3_3;
        void var4_4;
        SlayerAssistant lIllllllIllllIl;
        void lIllllllIllllII;
        if (!SlayerAssistant.lIIlIlllIIl(nPC) || SlayerAssistant.lIIlIlllIlI(nPC.getName())) {
            return lIlIlIllI[3];
        }
        int lIllllllIlllIll = lIllllllIllllII.getHealthScale();
        int lIllllllIlllIlI = lIllllllIllllII.getHealthRatio();
        Integer lIllllllIlllIIl = lIllllllIllllIl.ci.getHealth(lIllllllIllllII.getId());
        if (!SlayerAssistant.lIIlIlllIll(lIllllllIlllIlI) || !SlayerAssistant.lIIlIllllII(lIllllllIlllIll) || SlayerAssistant.lIIlIlllIlI(lIllllllIlllIIl)) {
            return lIlIlIllI[3];
        }
        return (int)((float)(var4_4.intValue() * var3_3 / var2_2) + 0.5f);
    }

    private static boolean lIIlIlllIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIllllIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (SlayerAssistant.lIIlIllllIl(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIlIllI[0]];
                stringArray[SlayerAssistant.lIlIlIllI[1]] = lIlIlIlIl[lIlIlIllI[0]];
                if (SlayerAssistant.lIIlIllIllI(nPC.hasAction(stringArray) ? 1 : 0) && SlayerAssistant.lIIlIlllIII(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIlIllI[6])) {
                    n2 = lIlIlIllI[0];

                    if (2 != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIllI[1];
            return n2 != 0;
        });
        int[] nArray = new int[lIlIlIllI[0]];
        nArray[SlayerAssistant.lIlIlIllI[1]] = lIlIlIllI[2];
        Item item = Inventory.getFirst((int[])nArray);
        if (SlayerAssistant.lIIlIllIlIl(list.isEmpty() ? 1 : 0)) {
            void lIlllllllIIlIlI;
            int lIlllllllIIIlll;
            SlayerAssistant lIlllllllIIllII;
            NPC lIlllllllIIlIII;
            Actor lIlllllllIIlIIl = list.iterator();
            while (SlayerAssistant.lIIlIllIllI(lIlllllllIIlIIl.hasNext() ? 1 : 0)) {
                lIlllllllIIlIII = (NPC)lIlllllllIIlIIl.next();
                lIlllllllIIIlll = lIlllllllIIllII.f(lIlllllllIIlIII);
                if (SlayerAssistant.lIIlIllIlll(lIlllllllIIIlll, lIlIlIllI[3]) && SlayerAssistant.lIIlIlllIII(lIlllllllIIIlll, T.GARGOYLES.aQ()) && SlayerAssistant.lIIlIlllIIl(lIlllllllIIlIlI)) {
                    lIlllllllIIlIlI.useOn((Actor)lIlllllllIIlIII);
                }

                if ((0x12 ^ 0x25 ^ (0x17 ^ 0x24)) != 3) continue;
                return;
            }
            lIlllllllIIlIIl = Players.getLocal().getInteracting();
            if (SlayerAssistant.lIIlIllIllI(lIlllllllIIlIIl instanceof NPC) && SlayerAssistant.lIIlIllIlll(lIlllllllIIIlll = lIlllllllIIllII.f(lIlllllllIIlIII = (NPC)lIlllllllIIlIIl), lIlIlIllI[3]) && SlayerAssistant.lIIlIlllIII(lIlllllllIIIlll, T.GARGOYLES.aQ()) && SlayerAssistant.lIIlIlllIIl(lIlllllllIIlIlI)) {
                lIlllllllIIlIlI.useOn((Actor)lIlllllllIIlIII);
            }
        }
    }

    private static boolean lIIlIllllII(int n2) {
        return n2 > 0;
    }

    protected void onStart() {
    }

    private static void lIIlIllIIll() {
        lIlIlIlIl = new String[lIlIlIllI[5]];
        SlayerAssistant.lIlIlIlIl[SlayerAssistant.lIlIlIllI[1]] = "completed your task!";
        SlayerAssistant.lIlIlIlIl[SlayerAssistant.lIlIlIllI[0]] = "Attack";
    }

    private static boolean lIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIllIlll(int n2, int n3) {
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


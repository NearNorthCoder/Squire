/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.basics.minigames.toader;

import gg.squire.basics.minigames.toader.overlay.ToaderOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.minigames.toader.AttackingChompyTask;
import gg.squire.basics.minigames.toader.InflatingToadTask;
import gg.squire.basics.minigames.toader.PlantingBaitTask;
import gg.squire.basics.minigames.toader.FillingTheBellowsTask;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@SquireUtil
@PluginDescriptor(name="Squire Chompy Killer", description="Kills Toad and Chomp", enabledByDefault=false)
public class SquireToadKiller
extends SquirePlugin {
    private  int fk;
    private static  int[] llllIIIIl;
    @Inject
    private  ToaderOverlay fj;
    private static  String[] llllIIIII;
    @Inject
    private  OverlayManager bq;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if ((chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var1.getMessage( != 0).contains(llllIIIII[1]) ? 1 : 0)) {
            var2.fk += 2;
        }
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.fj);
        0;
    }

    protected void onStart() {
        this.bq.add((Overlay)this.fj);
        0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = AttackingChompyTask.class;
        classArray[2] = PlantingBaitTask.class;
        classArray[3] = FillingTheBellowsTask.class;
        classArray[4] = InflatingToadTask.class;
        return classArray;
    }

    public int cs() {
        return this.fk;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}


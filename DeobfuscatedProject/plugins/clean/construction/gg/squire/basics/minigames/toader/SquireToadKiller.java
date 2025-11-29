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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    @Inject
    private  ToaderOverlay fj;
    
    @Inject
    private  OverlayManager bq;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIlIlIIIIIIlIlI;
        if (SquireToadKiller.llIIlllIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireToadKiller.llIIlllIIlI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (SquireToadKiller.llIIlllIIll(lIlIlIIIIIIlIlI.getMessage().contains(llllIIIII[llllIIIIl[1]]) ? 1 : 0)) {
            lIlIlIIIIIIlIll.fk += llllIIIIl[2];
        }
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.fj);

    }

    protected void onStart() {
        this.bq.add((Overlay)this.fj);

    }

    private static boolean llIIlllIIll(int n2) {
        return n2 != 0;
    }

    private static void llIIlllIIII() {
        llllIIIII = new String[llllIIIIl[2]];
        SquireToadKiller.llllIIIII[SquireToadKiller.llllIIIIl[1]] = "scratch a notch on your bow";
    }

    private static boolean llIIlllIIlI(Object object, Object object2) {
        return object != object2;
    }

    static {
        SquireToadKiller.llIIlllIIIl();
        SquireToadKiller.llIIlllIIII();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIIIIl[0]];
        classArray[SquireToadKiller.llllIIIIl[1]] = AttackingChompyTask.class;
        classArray[SquireToadKiller.llllIIIIl[2]] = PlantingBaitTask.class;
        classArray[SquireToadKiller.llllIIIIl[3]] = FillingTheBellowsTask.class;
        classArray[SquireToadKiller.llllIIIIl[4]] = InflatingToadTask.class;
        return classArray;
    }

    public int cs() {
        return this.fk;
    }

}


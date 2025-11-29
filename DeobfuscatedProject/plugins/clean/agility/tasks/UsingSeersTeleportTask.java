/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.agility.tasks.GameEnum;

@TaskDesc(name="Using seers teleport", priority=100, blocking=true)
public class UsingSeersTeleportTask
extends Task {
    
    private final  AgilityConfig y;

    private static boolean lIIlIlIllIIlll(int n, int n2) {
        return n > n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        i var1;
        if (i.lIIlIlIllIIIll((Object)this.y.course(), (Object)b.SEERS_VILLAGE)) {
            return lIllIIIllIl[0];
        }
        if (i.lIIlIlIllIIlII(var1.y.seersTeleport() ? 1 : 0)) {
            return lIllIIIllIl[0];
        }
        Player var2 = Players.getLocal();
        if (!i.lIIlIlIllIIlIl(var2) || i.lIIlIlIllIIllI(var2.isAnimating() ? 1 : 0)) {
            return lIllIIIllIl[0];
        }
        if (i.lIIlIlIllIIllI(var2.getPlane())) {
            return lIllIIIllIl[0];
        }
        if (i.lIIlIlIllIIlll(var2.getWorldLocation().distanceTo2D(new WorldPoint(lIllIIIllIl[1], lIllIIIllIl[2], lIllIIIllIl[0])), lIllIIIllIl[3])) {
            return lIllIIIllIl[0];
        }
        WidgetInfo var3 = SpellBook.Standard.CAMELOT_TELEPORT.getWidget();
        Widget var4 = Widgets.get((WidgetInfo)var3);
        if (i.lIIlIlIllIlIII(var4)) {
            return lIllIIIllIl[0];
        }
        var3_3.interact(lIllIIIllII[lIllIIIllIl[0]]);
        return lIllIIIllIl[4];
    }

    private static boolean lIIlIlIllIIlII(int n) {
        return n == 0;
    }

    private static void lIIlIlIllIIIIl() {
        lIllIIIllII = new String[lIllIIIllIl[4]];
        i.lIllIIIllII[i.lIllIIIllIl[0]] = "Seers'";
    }

    @Inject
    public UsingSeersTeleportTask(AgilityConfig agilityConfig) {
        this.y = agilityConfig;
    }

    private static boolean lIIlIlIllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIllIIllI(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIllIlIII(Object object) {
        return object == null;
    }

    static {
        i.lIIlIlIllIIIlI();
        i.lIIlIlIllIIIIl();
    }

    private static boolean lIIlIlIllIIIll(Object object, Object object2) {
        return object != object2;
    }
}


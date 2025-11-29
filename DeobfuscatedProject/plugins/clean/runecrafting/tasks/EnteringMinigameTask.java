/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Entering Minigame", priority=2, blocking=true)
public class EnteringMinigameTask
extends RunecraftingTaskBase {
    private static final  String bg;
    
    private static final  String bh;
    
    private  boolean bi;
    private static final  int bf;

        return String.valueOf(var1);
    }

    private void c(String string) {
        if (z.llllllIIlIlIIl(string.contains(llIIllIIllIl[llIIllIIlllI[7]]) ? 1 : 0)) {
            return;
        }
        String string2 = string.substring(string.indexOf(llIIllIIllIl[llIIllIIlllI[2]])).trim().substring(llIIllIIlllI[1], llIIllIIlllI[6]);
    }

    private static boolean llllllIIlIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllllIIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        z.llllllIIlIIlII();
        z.llllllIIlIIIll();
        bh = llIIllIIllIl[llIIllIIlllI[8]];
        bg = llIIllIIllIl[llIIllIIlllI[4]];
        bf = llIIllIIlllI[3];
    }

    private static boolean llllllIIlIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIIlIIllI(Object object) {
        return object != null;
    }

    @Inject
    public EnteringMinigameTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIIlllI[0]];
        cArray[z.llIIllIIlllI[1]] = c.OUTSIDE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean llllllIIlIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIlIlIIl(int n2) {
        return n2 == 0;
    }

    private static void llllllIIlIIIll() {
        llIIllIIllIl = new String[llIIllIIlllI[9]];
        z.llIIllIIllIl[z.llIIllIIlllI[1]] = "It looks like the rift is already being guarded";
        z.llIIllIIllIl[z.llIIllIIlllI[0]] = "finishing up";
        z.llIIllIIllIl[z.llIIllIIlllI[6]] = "Quick-pass";
        z.llIIllIIllIl[z.llIIllIIlllI[7]] = "Great<br>Guardian power:";
        z.llIIllIIllIl[z.llIIllIIlllI[2]] = "Great<br>Guardian power:";
        z.llIIllIIllIl[z.llIIllIIlllI[8]] = "finishing up";
        z.llIIllIIllIl[z.llIIllIIlllI[4]] = "It looks like the rift is already being guarded";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ak() {
        void var1_1;
        if (z.llllllIIlIIlIl(this.aV.f() ? 1 : 0)) {
            return llIIllIIlllI[1];
        }
        if (z.llllllIIlIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIllIIlllI[1];
        }
        TileObject var2 = TileObjects.getNearest((int[])SquireGOTRPlugin.d);
        if (!z.llllllIIlIIllI(var2) || z.llllllIIlIIlll(var2.distanceTo((Locatable)Players.getLocal()), llIIllIIlllI[2])) {
            return llIIllIIlllI[1];
        }
        if (z.llllllIIlIlIII(var2.getId(), llIIllIIlllI[3])) {
            return llIIllIIlllI[1];
        }
        Widget var3 = Widgets.get((WidgetInfo)WidgetInfo.MINIGAME_DIALOG_TEXT);
        if (z.llllllIIlIIllI(var3)) {
            z var4;
            String var5 = var3.getText();
            if (z.llllllIIlIIlIl(var5.contains(llIIllIIllIl[llIIllIIlllI[1]]) ? 1 : 0)) {
                var4.sleep(Rand.nextInt((int)llIIllIIlllI[4], (int)llIIllIIlllI[5]));
            }
            if (z.llllllIIlIIlIl(var5.contains(llIIllIIllIl[llIIllIIlllI[0]]) ? 1 : 0)) {
                var4.sleep(Rand.nextInt((int)llIIllIIlllI[6], (int)llIIllIIlllI[2]));
            }
        }
        var1_1.interact(llIIllIIllIl[llIIllIIlllI[6]]);
        return llIIllIIlllI[0];
    }
}


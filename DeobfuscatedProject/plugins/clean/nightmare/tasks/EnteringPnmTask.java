/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Entering PNM", priority=500, blocking=true)
public class EnteringPnmTask
extends NightmareTaskBase {
    private static final  Logger eI;

    @Inject
    protected EnteringPnmTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIllllIIIIlII() {
        llllIIIlIIll = new String[llllIIIlIlIl[5]];
        aA.llllIIIlIIll[aA.llllIIIlIlIl[0]] = "you like to attempt";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[1]] = "still like to";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[2]] = "you sure you wish to begin";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[3]] = "Drink-from";
        aA.llllIIIlIIll[aA.llllIIIlIlIl[4]] = "Pool of Nightmares";
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean bY() {
        aA var2;
        if (aA.lIIIllllIIIlIIl(this.cV.assistantMode() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIIl(var2.cW.ad() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIIl(var2.cV.useFireSpells() ? 1 : 0) && aA.lIIIllllIIIlIIl(var2.cW.av() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (aA.lIIIllllIIIlIlI(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIlIlIl[0];
        }
        if (!aA.lIIIllllIIIlIlI(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[0]]) ? 1 : 0) || aA.lIIIllllIIIlIIl(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[1]]) ? 1 : 0)) {
            Dialog.chooseOption((int)llllIIIlIlIl[1]);

            return llllIIIlIlIl[1];
        }
        if (aA.lIIIllllIIIlIIl(Dialog.getName().contains(llllIIIlIIll[llllIIIlIlIl[2]]) ? 1 : 0)) {
            Dialog.chooseOption((int)llllIIIlIlIl[2]);

            return llllIIIlIlIl[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llllIIIlIIll[llllIIIlIlIl[4]]));
        if (aA.lIIIllllIIIlIll(var3)) {
            var3.interact(llllIIIlIIll[llllIIIlIlIl[3]]);
            return llllIIIlIlIl[1];
        }
        return llllIIIlIlIl[0];
    }

    private static boolean lIIIllllIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIIllllIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aA.lIIIllllIIIlIII();
        aA.lIIIllllIIIIlII();
        eI = LoggerFactory.getLogger(EnteringPnmTask.class);
    }
}


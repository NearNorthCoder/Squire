/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Teleporting to corp")
public class TeleportingToCorpTask
extends CorpTaskBase {

    static {
        n.lllIIIlIIlIIlI();
        n.lllIIIlIIlIIIl();
    }

    private static boolean lllIIIlIIlIlII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var2;
        if (n.lllIIIlIIlIIll(this.l() ? 1 : 0)) {
            return lIlIllllIlII[0];
        }
        if (n.lllIIIlIIlIlII(var2.m() ? 1 : 0)) {
            return lIlIllllIlII[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> tileObject.getName().toLowerCase().contains(lIlIllllIIll[lIlIllllIlII[5]]));
        if (n.lllIIIlIIlIlIl(var3)) {
            return lIlIllllIlII[0];
        }
        if (n.lllIIIlIIlIlII(Widgets.isVisible((Widget)Widgets.get((int)lIlIllllIlII[1], (int)lIlIllllIlII[0])) ? 1 : 0)) {
            Keyboard.type((char)lIlIllllIlII[2]);
            return lIlIllllIlII[3];
        }
        String[] stringArray = new String[lIlIllllIlII[3]];
        stringArray[n.lIlIllllIlII[0]] = lIlIllllIIll[lIlIllllIlII[0]];
        if (n.lllIIIlIIlIIll(var3.hasAction(stringArray) ? 1 : 0)) {
            var3.interact(lIlIllllIIll[lIlIllllIlII[3]]);
            return lIlIllllIlII[3];
        }
        var1_1.interact(lIlIllllIIll[lIlIllllIlII[4]]);
        return lIlIllllIlII[3];
    }

    private static boolean lllIIIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIlIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIIlIlIl(Object object) {
        return object == null;
    }

    private static void lllIIIlIIlIIIl() {
        lIlIllllIIll = new String[lIlIllllIlII[6]];
        n.lIlIllllIIll[n.lIlIllllIlII[0]] = "Corporeal Beast";
        n.lIlIllllIIll[n.lIlIllllIlII[3]] = "Teleport Menu";
        n.lIlIllllIIll[n.lIlIllllIlII[4]] = "Corporeal Beast";
        n.lIlIllllIIll[n.lIlIllllIlII[5]] = "jewellery";
    }

}


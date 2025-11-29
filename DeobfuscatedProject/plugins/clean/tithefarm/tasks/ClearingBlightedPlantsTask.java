/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Clearing blighted plants")
public class ClearingBlightedPlantsTask
extends TithefarmTaskBase {

    public boolean run() {
        TileObject tileObject2 = this.Z.a(tileObject -> {
            String[] stringArray = new String[lIIlllllllIlI[1]];
            stringArray[l.lIIlllllllIlI[0]] = lIIlllllllIII[lIIlllllllIlI[1]];
            return tileObject.hasAction(stringArray);
        });
        if (l.lIllIllIIlIIIIl(tileObject2)) {
            return lIIlllllllIlI[0];
        }
        tileObject2.interact(lIIlllllllIII[lIIlllllllIlI[0]]);
        return lIIlllllllIlI[1];
    }

    private static boolean lIllIllIIlIIIIl(Object object) {
        return object == null;
    }

    static {
        l.lIllIllIIIllllI();
        l.lIllIllIIIllIll();
    }

    private static void lIllIllIIIllIll() {
        lIIlllllllIII = new String[lIIlllllllIlI[2]];
        l.lIIlllllllIII[l.lIIlllllllIlI[0]] = "Clear";
        l.lIIlllllllIII[l.lIIlllllllIlI[1]] = "Clear";
    }

    @Inject
    protected ClearingBlightedPlantsTask(i i2) {
        super(i2);
    }
}


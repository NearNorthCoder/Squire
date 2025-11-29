/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Handling evade")
public class HandlingEvadeTask
extends TempletrekkingTaskBase {

    static {
        w.lIlIlllllllIIII();
        w.lIlIllllllIllII();
    }

    @Inject
    protected HandlingEvadeTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIllIIII[0]];
        nArray[w.lIIllIIllIIII[1]] = lIIllIIllIIII[2];
        nArray[w.lIIllIIllIIII[2]] = lIIllIIllIIII[3];
        nArray[w.lIIllIIllIIII[3]] = lIIllIIllIIII[4];
        nArray[w.lIIllIIllIIII[4]] = lIIllIIllIIII[5];
        nArray[w.lIIllIIllIIII[5]] = lIIllIIllIIII[6];
        nArray[w.lIIllIIllIIII[6]] = lIIllIIllIIII[7];
        nArray[w.lIIllIIllIIII[7]] = lIIllIIllIIII[8];
        nArray[w.lIIllIIllIIII[9]] = lIIllIIllIIII[10];
        super(templeTrekkingPlugin, nArray);
    }

    private static void lIlIllllllIllII() {
        lIIllIIlIllII = new String[lIIllIIllIIII[3]];
        w.lIIllIIlIllII[w.lIIllIIllIIII[1]] = "Evade-event";
        w.lIIllIIlIllII[w.lIIllIIllIIII[2]] = "Evade-event";
    }

    @Override
    public boolean z() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIIllIIII[2]];
            stringArray[w.lIIllIIllIIII[1]] = lIIllIIlIllII[lIIllIIllIIII[2]];
            return tileObject.hasAction(stringArray);
        });
        if (w.lIlIlllllllIIIl(tileObject2)) {
            return lIIllIIllIIII[1];
        }
        tileObject2.interact(lIIllIIlIllII[lIIllIIllIIII[1]]);
        return lIIllIIllIIII[2];
    }

    private static boolean lIlIlllllllIIIl(Object object) {
        return object == null;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Picking up sword", priority=300, blocking=true)
public class PickingUpSwordTask
extends GiantsfoundryTaskBase {

    private static void lIIIIlIIIIIIIII() {
        llIlIllIlIlI = new String[llIlIlllIllI[2]];
        w.llIlIllIlIlI[w.llIlIlllIllI[0]] = "Pick-up";
        w.llIlIllIlIlI[w.llIlIlllIllI[1]] = "Pick-up";
    }

    private static boolean lIIIIlIIIIIIIlI(Object object) {
        return object == null;
    }

    @Override
    public boolean M() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[llIlIlllIllI[1]];
            stringArray[w.llIlIlllIllI[0]] = llIlIllIlIlI[llIlIlllIllI[1]];
            return tileObject.hasAction(stringArray);
        });
        if (w.lIIIIlIIIIIIIlI(tileObject2)) {
            return llIlIlllIllI[0];
        }
        tileObject2.interact(llIlIllIlIlI[llIlIlllIllI[0]]);
        return llIlIlllIllI[1];
    }

    static {
        w.lIIIIlIIIIIIIIl();
        w.lIIIIlIIIIIIIII();
    }

    @Inject
    public PickingUpSwordTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

}


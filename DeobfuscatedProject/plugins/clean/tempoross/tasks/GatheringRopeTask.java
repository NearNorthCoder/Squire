/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Gathering rope", priority=100, blocking=true)
public class GatheringRopeTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        boolean bl;
        if (t.lIllIIIlllllIll(this.ar.r() ? 1 : 0)) {
            bl = lIIllIlllllIl[0];

            if (2 == 0) {
                return ((0x4B ^ 0x5F ^ (0x24 ^ 0x6D)) & (0xE7 ^ 0x9D ^ (0xB1 ^ 0x96) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIlllllIl[1];
        }
        return bl;
    }

    private static boolean lIllIIIllllllII(Object object) {
        return object != null;
    }

    private static void lIllIIIlllllIIl() {
        lIIllIlllllII = new String[lIIllIlllllIl[0]];
        t.lIIllIlllllII[t.lIIllIlllllIl[1]] = "Take";
    }

    @Inject
    protected GatheringRopeTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlllllIll(int n2) {
        return n2 == 0;
    }

    static {
        t.lIllIIIlllllIlI();
        t.lIllIIIlllllIIl();
    }

    @Override
    public boolean al() {
        c c2 = this.ar.N();
        TileObject tileObject = c2.Q();
        if (t.lIllIIIllllllII(tileObject) && t.lIllIIIlllllIll(this.au.a((Locatable)tileObject) ? 1 : 0)) {
            tileObject.interact(lIIllIlllllII[lIIllIlllllIl[1]]);
            return lIIllIlllllIl[0];
        }
        this.au.b(c2.Y());

        return lIIllIlllllIl[1];
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameObject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Harvesting Plant")
public class HarvestingPlantTask
extends TithefarmTaskBase {

    @Inject
    protected HarvestingPlantTask(i i2) {
        super(i2);
    }

    private static boolean lIllIlllIIIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        p.lIllIllIllllllI();
        p.lIllIllIlllllIl();
    }

    private static boolean lIllIllIlllllll(Object object) {
        return object != null;
    }

    public boolean run() {
        p var1;
        TileObject tileObject = this.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[0]]);
        if (p.lIllIllIlllllll(tileObject)) {
            return lIlIIIIIlIlIl[0];
        }
        TileObject var2 = var1.Z.a(lIlIIIIIlIIll[lIlIIIIIlIlIl[1]]);
        if (p.lIllIlllIIIIIII(var2)) {
            return lIlIIIIIlIlIl[0];
        }
        var2.interact(lIlIIIIIlIIll[lIlIIIIIlIlIl[2]]);
        GameObject var3 = (GameObject)var2;
        Player var4 = Players.getLocal();
        if (p.lIllIlllIIIIIIl(var3.getWorldArea().isInMeleeDistance(var4.getWorldArea()) ? 1 : 0)) {
            var1.sleep(lIlIIIIIlIlIl[2]);
        }
        return lIlIIIIIlIlIl[1];
    }

    private static boolean lIllIlllIIIIIII(Object object) {
        return object == null;
    }

    private static void lIllIllIlllllIl() {
        lIlIIIIIlIIll = new String[lIlIIIIIlIlIl[3]];
        p.lIlIIIIIlIIll[p.lIlIIIIIlIlIl[0]] = "Water";
        p.lIlIIIIIlIIll[p.lIlIIIIIlIlIl[1]] = "Harvest";
        p.lIlIIIIIlIIll[p.lIlIIIIIlIlIl[2]] = "Harvest";
    }

}


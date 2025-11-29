/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Repairing mast", priority=0x7FFFFFFF, blocking=true)
public class RepairingMastTask
extends TemporossTaskBase {

    private static boolean lIllIIIlllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlllIIIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ak() {
        boolean bl;
        m var1;
        TileObject tileObject = this.ar.x();
        if (m.lIllIIIllIlllIl(this.ar.L() ? 1 : 0) && m.lIllIIIllIllllI(tileObject) && m.lIllIIIllIlllll(this.ar.t() ? 1 : 0) && !m.lIllIIIlllIIIII(tileObject.distanceTo((Locatable)Players.getLocal()), lIIllIllllIIl[0]) || m.lIllIIIllIlllll(var1.ar.K() ? 1 : 0)) {
            bl = lIIllIllllIIl[1];

            if (-1 > (0x4E ^ 0x2F ^ (0x66 ^ 3))) {
                return ((0xAF ^ 0xBC ^ (0x36 ^ 0x1E)) & (34 + 80 - -20 + 22 ^ 63 + 68 - 60 + 96 ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIIl[2];
        }
        return bl;
    }

    private static boolean lIllIIIllIlllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2;
        m var3;
        Player player = Players.getLocal();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIllIllllIIl[1]];
            stringArray[m.lIIllIllllIIl[2]] = lIIllIlllIlll[lIIllIllllIIl[1]];
            if (m.lIllIIIllIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && m.lIllIIIlllIIIlI(tileObject.distanceTo((Locatable)player), lIIllIllllIIl[3])) {
                n2 = lIIllIllllIIl[1];

            } else {
                n2 = lIIllIllllIIl[2];
            }
            return n2 != 0;
        });
        if (m.lIllIIIlllIIIIl(tileObject2)) {
            return lIIllIllllIIl[2];
        }
        if (m.lIllIIIllIlllll(var3.au.a((Locatable)var2) ? 1 : 0)) {
            return var3.au.b((SceneEntity)var2);
        }
        tileObject2.interact(lIIllIlllIlll[lIIllIllllIIl[2]]);
        return lIIllIllllIIl[1];
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIIllIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected RepairingMastTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIllIllllI(Object object) {
        return object != null;
    }

    private static void lIllIIIllIllIll() {
        lIIllIlllIlll = new String[lIIllIllllIIl[4]];
        m.lIIllIlllIlll[m.lIIllIllllIIl[2]] = "Repair";
        m.lIIllIlllIlll[m.lIIllIllllIIl[1]] = "Repair";
    }

    static {
        m.lIllIIIllIlllII();
        m.lIllIIIllIllIll();
    }
}


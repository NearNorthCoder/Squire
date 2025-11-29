/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;

@TaskDesc(name="Opening the compost bin", priority=35, blocking=true)
public class OpeningTheCompostBinTask
extends FarmerTaskBase {

    private static boolean lllIllllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        aR.lllIllllIlllII();
        aR.lllIllllIllIll();
    }

    @Inject
    public OpeningTheCompostBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIllllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean I(N n2) {
        int n3;
        an an2 = n2.aI();
        au au2 = an2.aY();
        if (aR.lllIllllIlllIl((Object)an2.aZ(), (Object)n.GROWING) && aR.lllIllllIllllI(an2.bb(), au2.bc() - lIlllllIIlll[0])) {
            n3 = lIlllllIIlll[0];

            if (2 != 2) {
                return ((0x5A ^ 0x4D ^ (0x6F ^ 0x7C)) & (111 + 56 - 111 + 77 ^ 64 + 25 - 61 + 101 ^ -1)) != 0;
            }
        } else {
            n3 = lIlllllIIlll[1];
        }
        return n3 != 0;
    }

    @Override
    public boolean b(TileObject tileObject) {
        tileObject.interact(lIlllllIIllI[lIlllllIIlll[1]]);
        return lIlllllIIlll[0];
    }

    private static void lllIllllIllIll() {
        lIlllllIIllI = new String[lIlllllIIlll[0]];
        aR.lIlllllIIllI[aR.lIlllllIIlll[1]] = "Open";
    }
}


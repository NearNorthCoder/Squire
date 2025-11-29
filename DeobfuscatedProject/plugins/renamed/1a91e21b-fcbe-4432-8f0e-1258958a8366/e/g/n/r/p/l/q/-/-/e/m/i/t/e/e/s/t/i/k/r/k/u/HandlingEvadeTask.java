/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Handling evade -> HandlingevadeTask */
@TaskDesc(name="Handling evade")
public class HandlingEvadeTask
extends x_Unknown {
    private static /* synthetic */ int[] lIIllIIllIIII;
    private static /* synthetic */ String[] lIIllIIlIllII;

    static {
        w.lIlIlllllllIIII();
        w.lIlIllllllIllII();
    }

    @Inject
    protected w(TempleTrekkingPlugin templeTrekkingPlugin) {
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

    private static void lIlIlllllllIIII() {
        lIIllIIllIIII = new int[11];
        w.lIIllIIllIIII[0] = 8 + 153 - 113 + 126 ^ 141 + 49 - 101 + 77;
        w.lIIllIIllIIII[1] = (0x8D ^ 0xA4) & ~(0xEE ^ 0xC7);
        w.lIIllIIllIIII[2] = 1;
        w.lIIllIIllIIII[3] = 2;
        w.lIIllIIllIIII[4] = 3;
        w.lIIllIIllIIII[5] = 0x54 ^ 0x50;
        w.lIIllIIllIIII[6] = 0x8F ^ 0x8A;
        w.lIIllIIllIIII[7] = 0xF9 ^ 0xA3 ^ (6 ^ 0x5A);
        w.lIIllIIllIIII[8] = 0x45 ^ 0x4F;
        w.lIIllIIllIIII[9] = 0xAC ^ 0xB3 ^ (0x8A ^ 0x92);
        w.lIIllIIllIIII[10] = 0x34 ^ 0x38;
    }

    private static void lIlIllllllIllII() {
        lIIllIIlIllII = new String[lIIllIIllIIII[3]];
        w.lIIllIIlIllII[w.lIIllIIllIIII[1]] = w."Evade-event";
        w.lIIllIIlIllII[w.lIIllIIllIIII[2]] = w."Evade-event";
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

    private static String lIlIllllllIlIlI(String var5, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIllIIllIIII[3], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllllllIIIl(Object object) {
        return object == null;
    }
}


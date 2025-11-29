/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s;

@TaskDesc(name="Drinking antipoison", priority=0x7FFFFFFE, blocking=true)
public class t
extends s {
    private static /* synthetic */ int[] lIIllIllllIIl;
    private static /* synthetic */ String[] lIIllIllllIII;

    private static String lIllIIIlllllIIl(String llllllllllllllIlllIllIllIllIlllI, String llllllllllllllIlllIllIllIllIllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIllIllll.getBytes(StandardCharsets.UTF_8)), lIIllIllllIIl[5]), "DES");
            Cipher llllllllllllllIlllIllIllIlllIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIllIllIlllIIlI.init(lIIllIllllIIl[2], llllllllllllllIlllIllIllIlllIIll);
            return new String(llllllllllllllIlllIllIllIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIllIlllIIIl) {
            llllllllllllllIlllIllIllIlllIIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        if (t.lIllIIIllllllIl(Inventory.contains(item -> item.getName().contains(lIIllIllllIII[lIIllIllllIIl[3]])) ? 1 : 0)) {
            Log.error((String)lIIllIllllIII[lIIllIllllIIl[0]]);
            this.ad.forceStop();
        }
        if (t.lIllIIIllllllIl(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIllllIIl[0];
        }
        Inventory.getFirst(item -> item.getName().contains(lIIllIllllIII[lIIllIllllIIl[2]])).interact(lIIllIllllIII[lIIllIllllIIl[1]]);
        return lIIllIllllIIl[1];
    }

    private static void lIllIIIlllllIll() {
        lIIllIllllIII = new String[lIIllIllllIIl[4]];
        t.lIIllIllllIII[t.lIIllIllllIIl[0]] = t.lIllIIIlllllIIl("IgG3rGgMyM9FCgTw99j+dSQ+f8qwU2AOXX0dA42J1FE=", "VpWll");
        t.lIIllIllllIII[t.lIIllIllllIIl[1]] = t.lIllIIIlllllIlI("gkQJVBQzQpM=", "qmvQb");
        t.lIIllIllllIII[t.lIIllIllllIIl[2]] = t.lIllIIIlllllIlI("UkTprALDmuCzvukh2ps7xw==", "SRePq");
        t.lIIllIllllIII[t.lIIllIllllIIl[3]] = t.lIllIIIlllllIlI("EtmgsD0EE2qC4HNqtQApwg==", "eqvnq");
    }

    @Inject
    public t(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static String lIllIIIlllllIlI(String llllllllllllllIlllIllIllIllIIIll, String llllllllllllllIlllIllIllIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIllIllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIllIllIIlIl.init(lIIllIllllIIl[2], llllllllllllllIlllIllIllIllIIllI);
            return new String(llllllllllllllIlllIllIllIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIllIllIIlII) {
            llllllllllllllIlllIllIllIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllllllIl(int n2) {
        return n2 == 0;
    }

    static {
        t.lIllIIIllllllII();
        t.lIllIIIlllllIll();
    }

    private static void lIllIIIllllllII() {
        lIIllIllllIIl = new int[6];
        t.lIIllIllllIIl[0] = (0x92 ^ 0x9A) & ~(0xBD ^ 0xB5);
        t.lIIllIllllIIl[1] = " ".length();
        t.lIIllIllllIIl[2] = "  ".length();
        t.lIIllIllllIIl[3] = "   ".length();
        t.lIIllIllllIIl[4] = 0xBC ^ 0xB8;
        t.lIIllIllllIIl[5] = 0xDD ^ 0x8F ^ (0xFA ^ 0xA0);
    }
}


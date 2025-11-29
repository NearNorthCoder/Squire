/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j;

@TaskDesc(name="Banking", priority=100, blocking=true)
public class l
extends j {
    private static /* synthetic */ String[] llIIlIllllll;
    @Inject
    private /* synthetic */ SquireGorillaPlugin P;
    private static /* synthetic */ int[] llIIllIIIIII;

    private static boolean lllllIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static void lllllIllllIlII() {
        llIIllIIIIII = new int[6];
        l.llIIllIIIIII[0] = -(0xFFFFD99F & 0x6EE2) & (0xFFFFFEBF & 0x6FF7);
        l.llIIllIIIIII[1] = (0xD5 ^ 0xC0) & ~(0x22 ^ 0x37);
        l.llIIllIIIIII[2] = " ".length();
        l.llIIllIIIIII[3] = 0x40 ^ 0x38 ^ (0x2C ^ 0x4D);
        l.llIIllIIIIII[4] = "  ".length();
        l.llIIllIIIIII[5] = "   ".length();
    }

    private static boolean lllllIllllIllI(Object object) {
        return object == null;
    }

    private static String lllllIllllIIlI(String lllllllllllllllIlIIlllIlIIIllIlI, String lllllllllllllllIlIIlllIlIIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIlIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIlIIIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIlIIIlllII.init(llIIllIIIIII[4], lllllllllllllllIlIIlllIlIIIlllIl);
            return new String(lllllllllllllllIlIIlllIlIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIlIIIllIll) {
            lllllllllllllllIlIIlllIlIIIllIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public l(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    static {
        l.lllllIllllIlII();
        l.lllllIllllIIll();
    }

    private static String lllllIllllIIIl(String lllllllllllllllIlIIlllIlIIIIlIlI, String lllllllllllllllIlIIlllIlIIIIIlII) {
        lllllllllllllllIlIIlllIlIIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIlIIIIlIII = new StringBuilder();
        char[] lllllllllllllllIlIIlllIlIIIIIlll = lllllllllllllllIlIIlllIlIIIIIlII.toCharArray();
        int lllllllllllllllIlIIlllIlIIIIIllI = llIIllIIIIII[1];
        char[] lllllllllllllllIlIIlllIlIIIIIIII = lllllllllllllllIlIIlllIlIIIIlIlI.toCharArray();
        int lllllllllllllllIlIIlllIIllllllll = lllllllllllllllIlIIlllIlIIIIIIII.length;
        int lllllllllllllllIlIIlllIIlllllllI = llIIllIIIIII[1];
        while (l.lllllIllllIlll(lllllllllllllllIlIIlllIIlllllllI, lllllllllllllllIlIIlllIIllllllll)) {
            char lllllllllllllllIlIIlllIlIIIIlIll = lllllllllllllllIlIIlllIlIIIIIIII[lllllllllllllllIlIIlllIIlllllllI];
            lllllllllllllllIlIIlllIlIIIIlIII.append((char)(lllllllllllllllIlIIlllIlIIIIlIll ^ lllllllllllllllIlIIlllIlIIIIIlll[lllllllllllllllIlIIlllIlIIIIIllI % lllllllllllllllIlIIlllIlIIIIIlll.length]));
            "".length();
            ++lllllllllllllllIlIIlllIlIIIIIllI;
            ++lllllllllllllllIlIIlllIIlllllllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllIlIIIIlIII);
    }

    private static void lllllIllllIIll() {
        llIIlIllllll = new String[llIIllIIIIII[5]];
        l.llIIlIllllll[l.llIIllIIIIII[1]] = l.lllllIllllIIIl("BQcHLU8lCQYyBw==", "GfiFo");
        l.llIIlIllllll[l.llIIllIIIIII[2]] = l.lllllIllllIIlI("UDEHO1cgiHo=", "sNKUa");
        l.llIIlIllllll[l.llIIllIIIIII[4]] = l.lllllIllllIIIl("FQ44DhUuCDsMQSEOPAUGZhYnBA8hQTcKDy0IOwxBNRU6GxEvDzJLESoUMgIP", "FaUka");
    }

    public boolean run() {
        l lllllllllllllllIlIIlllIlIIlIIlII;
        if (l.lllllIllllIlIl(Locations.isRegionLoaded((int)llIIllIIIIII[0]) ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        BankLoadout lllllllllllllllIlIIlllIlIIlIIIll = (BankLoadout)lllllllllllllllIlIIlllIlIIlIIlII.T.bankLoadout().selected(BankLoadout.class);
        if (l.lllllIllllIlIl(lllllllllllllllIlIIlllIlIIlIIlII.J() ? 1 : 0)) {
            return llIIllIIIIII[1];
        }
        if (l.lllllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIIllIIIIII[2]];
            stringArray[l.llIIllIIIIII[1]] = llIIlIllllll[llIIllIIIIII[1]];
            TileObject lllllllllllllllIlIIlllIlIIlIIIlI = TileObjects.getNearest((String[])stringArray);
            if (l.lllllIllllIllI(lllllllllllllllIlIIlllIlIIlIIIlI)) {
                Movement.walkTo((WorldPoint)R);
                "".length();
                return llIIllIIIIII[2];
            }
            if (l.lllllIllllIlIl(Reachable.isInteractable((Locatable)lllllllllllllllIlIIlllIlIIlIIIlI) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lllllllllllllllIlIIlllIlIIlIIIlI.getWorldLocation());
                "".length();
                return llIIllIIIIII[2];
            }
            lllllllllllllllIlIIlllIlIIlIIIlI.interact(llIIlIllllll[llIIllIIIIII[2]]);
            return llIIllIIIIII[2];
        }
        if (l.lllllIllllIlIl(BankLoadouts.withdrawWithRetries((BankLoadout)lllllllllllllllIlIIlllIlIIlIIIll, (int)llIIllIIIIII[3]).booleanValue() ? 1 : 0)) {
            Log.info((String)llIIlIllllll[llIIllIIIIII[4]]);
            return llIIllIIIIII[1];
        }
        return llIIllIIIIII[2];
    }

    private static boolean lllllIllllIlll(int n2, int n3) {
        return n2 < n3;
    }
}


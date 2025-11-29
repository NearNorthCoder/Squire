/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.o;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking Akkha (Butterfly)")
public class ay
extends ap {
    private static /* synthetic */ int[] lIllIIllIlI;
    private /* synthetic */ int dr;
    private static /* synthetic */ String[] lIllIIllIIl;

    private static boolean lIIlIllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        ay.lIIlIllIIIllII();
        ay.lIIlIllIIIlIll();
    }

    private static boolean lIIlIllIIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIllIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIllIIIlIlI(String llllllllllllllllIlIlIIllIllIIIlI, String llllllllllllllllIlIlIIllIllIIIIl) {
        llllllllllllllllIlIlIIllIllIIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIllIllIIIII = new StringBuilder();
        char[] llllllllllllllllIlIlIIllIlIlllll = llllllllllllllllIlIlIIllIllIIIIl.toCharArray();
        int llllllllllllllllIlIlIIllIlIllllI = lIllIIllIlI[0];
        char[] llllllllllllllllIlIlIIllIlIllIII = llllllllllllllllIlIlIIllIllIIIlI.toCharArray();
        int llllllllllllllllIlIlIIllIlIlIlll = llllllllllllllllIlIlIIllIlIllIII.length;
        int llllllllllllllllIlIlIIllIlIlIllI = lIllIIllIlI[0];
        while (ay.lIIlIllIIlIIII(llllllllllllllllIlIlIIllIlIlIllI, llllllllllllllllIlIlIIllIlIlIlll)) {
            char llllllllllllllllIlIlIIllIllIIIll = llllllllllllllllIlIlIIllIlIllIII[llllllllllllllllIlIlIIllIlIlIllI];
            llllllllllllllllIlIlIIllIllIIIII.append((char)(llllllllllllllllIlIlIIllIllIIIll ^ llllllllllllllllIlIlIIllIlIlllll[llllllllllllllllIlIlIIllIlIllllI % llllllllllllllllIlIlIIllIlIlllll.length]));
            "".length();
            ++llllllllllllllllIlIlIIllIlIllllI;
            ++llllllllllllllllIlIlIIllIlIlIllI;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIIllIllIIIII);
    }

    private static void lIIlIllIIIllII() {
        lIllIIllIlI = new int[3];
        ay.lIllIIllIlI[0] = (0xD ^ 2 ^ (0x6E ^ 0x34)) & (0x58 ^ 0x57 ^ (0x7F ^ 0x25) ^ -" ".length());
        ay.lIllIIllIlI[1] = " ".length();
        ay.lIllIIllIlI[2] = "  ".length();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        NPC llllllllllllllllIlIlIIllIlllllll2;
        WorldPoint llllllllllllllllIlIlIIllIllllllI;
        o llllllllllllllllIlIlIIlllIIIIIIl;
        ay llllllllllllllllIlIlIIlllIIIIIlI;
        if (ay.lIIlIllIIIllIl(this.bu() ? 1 : 0)) {
            return lIllIIllIlI[0];
        }
        if (ay.lIIlIllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
            llllllllllllllllIlIlIIlllIIIIIlI.bp();
        }
        if (ay.lIIlIllIIIllll((Object)(llllllllllllllllIlIlIIlllIIIIIIl = llllllllllllllllIlIlIIlllIIIIIlI.bv()))) {
            return lIllIIllIlI[0];
        }
        WorldPoint llllllllllllllllIlIlIIlllIIIIIII = null;
        int llllllllllllllllIlIlIIllIlllllll2 = lIllIIllIlI[0];
        while (ay.lIIlIllIIlIIII(llllllllllllllllIlIlIIllIlllllll2, llllllllllllllllIlIlIIlllIIIIIIl.M().size())) {
            llllllllllllllllIlIlIIllIllllllI = llllllllllllllllIlIlIIlllIIIIIlI.a(llllllllllllllllIlIlIIlllIIIIIIl.M().get(llllllllllllllllIlIlIIllIlllllll2));
            if (ay.lIIlIllIIIlllI(llllllllllllllllIlIlIIllIllllllI.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllllllllllllllIlIlIIlllIIIIIII = llllllllllllllllIlIlIIlllIIIIIlI.a(llllllllllllllllIlIlIIlllIIIIIIl.M().get((llllllllllllllllIlIlIIllIlllllll2 + lIllIIllIlI[1]) % llllllllllllllllIlIlIIlllIIIIIIl.M().size()));
                "".length();
                if (null == null) break;
                return ((0xD7 ^ 0x8B) & ~(0x70 ^ 0x2C)) != 0;
            }
            ++llllllllllllllllIlIlIIllIlllllll2;
            "".length();
            if ((0xF7 ^ 0xBC ^ (0x48 ^ 7)) == (44 + 59 - 44 + 91 ^ 37 + 22 - 29 + 116)) continue;
            return ((0x25 ^ 0x5D ^ (0x5D ^ 4)) & (0xE2 ^ 0x90 ^ (0x55 ^ 6) ^ -" ".length())) != 0;
        }
        if (ay.lIIlIllIIIllIl(llllllllllllllllIlIlIIlllIIIIIlI.g(llllllllllllllllIlIlIIllIlllllll2 = llllllllllllllllIlIlIIlllIIIIIlI.J()) ? 1 : 0)) {
            llllllllllllllllIlIlIIllIllllllI = llllllllllllllllIlIlIIlllIIIIIlI.bx().a(llllllllllllllllIlIlIIlllIIIIIlI.cu);
            String[] stringArray = new String[lIllIIllIlI[1]];
            stringArray[ay.lIllIIllIlI[0]] = lIllIIllIIl[lIllIIllIlI[0]];
            llllllllllllllllIlIlIIllIlllllll2 = NPCs.getNearest((WorldPoint)llllllllllllllllIlIlIIllIllllllI, (String[])stringArray);
        }
        if (ay.lIIlIllIIIllll(llllllllllllllllIlIlIIllIlllllll2)) {
            return lIllIIllIlI[0];
        }
        llllllllllllllllIlIlIIllIllllllI = Players.getLocal().getWorldLocation();
        NPC llllllllllllllllIlIlIIllIlllllIl = llllllllllllllllIlIlIIlllIIIIIIl.N().iterator();
        while (ay.lIIlIllIIIlllI(llllllllllllllllIlIlIIllIlllllIl.hasNext() ? 1 : 0)) {
            Point llllllllllllllllIlIlIIllIlllllII = llllllllllllllllIlIlIIllIlllllIl.next();
            if (ay.lIIlIllIIIlllI(llllllllllllllllIlIlIIllIllllllI.equals((Object)llllllllllllllllIlIlIIlllIIIIIlI.a(llllllllllllllllIlIlIIllIlllllII)) ? 1 : 0)) {
                llllllllllllllllIlIlIIllIlllllll2.interact(lIllIIllIIl[lIllIIllIlI[1]]);
            }
            "".length();
            if ((89 + 130 - 89 + 1 ^ 112 + 111 - 201 + 113) != -" ".length()) continue;
            return ((0xA4 ^ 0x82 ^ (0x44 ^ 0x20)) & (110 + 78 - 142 + 82 ^ 187 + 118 - 186 + 75 ^ -" ".length())) != 0;
        }
        if (ay.lIIlIllIIIllll(llllllllllllllllIlIlIIlllIIIIIII) && ay.lIIlIllIIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            llllllllllllllllIlIlIIlllIIIIIlI.g(llllllllllllllllIlIlIIlllIIIIIlI.a(llllllllllllllllIlIlIIlllIIIIIIl.M().get(lIllIIllIlI[0])));
            return lIllIIllIlI[1];
        }
        llllllllllllllllIlIlIIllIlllllIl = llllllllllllllllIlIlIIlllIIIIIlI.J();
        if (ay.lIIlIllIIlIIIl(llllllllllllllllIlIlIIllIlllllIl.getWorldArea().distanceTo((Locatable)Players.getLocal()), lIllIIllIlI[2])) {
            return lIllIIllIlI[0];
        }
        if (ay.lIIlIllIIIllll(llllllllllllllllIlIlIIlllIIIIIII)) {
            return lIllIIllIlI[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return lIllIIllIlI[1];
    }

    private static void lIIlIllIIIlIll() {
        lIllIIllIIl = new String[lIllIIllIlI[2]];
        ay.lIllIIllIIl[ay.lIllIIllIlI[0]] = ay.lIIlIllIIIlIIl("SABmF3PeoE4YbnPVem2tjA==", "MMFJc");
        ay.lIllIIllIIl[ay.lIllIIllIlI[1]] = ay.lIIlIllIIIlIlI("KBg4GSgC", "ilLxK");
    }

    private static String lIIlIllIIIlIIl(String llllllllllllllllIlIlIIllIlllIIlI, String llllllllllllllllIlIlIIllIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIllIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIllIlllIlII.init(lIllIIllIlI[2], llllllllllllllllIlIlIIllIlllIlIl);
            return new String(llllllllllllllllIlIlIIllIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIllIlllIIll) {
            llllllllllllllllIlIlIIllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIIIlllI(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        if (ay.lIIlIllIIIllIl(this.g(this.J()) ? 1 : 0)) {
            return this.cW.shadowAttackStyle();
        }
        return super.br();
    }

    @Inject
    protected ay(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dr = lIllIIllIlI[0];
    }
}


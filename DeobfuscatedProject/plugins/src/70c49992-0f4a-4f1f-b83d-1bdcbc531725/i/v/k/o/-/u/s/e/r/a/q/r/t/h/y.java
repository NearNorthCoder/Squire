/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Killing zombified spawn", priority=50)
public class y
extends w {
    private static /* synthetic */ String[] lIlIlIlIIlIll;
    private static /* synthetic */ int[] lIlIlIlIIlllI;

    private static boolean lIlllllIllIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected y(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static void lIlllllIllIIIII() {
        lIlIlIlIIlllI = new int[6];
        y.lIlIlIlIIlllI[0] = (0x5D ^ 0x47 ^ (5 ^ 0x38)) & (0x1D ^ 0x3E ^ (0x2B ^ 0x2F) ^ -" ".length());
        y.lIlIlIlIIlllI[1] = " ".length();
        y.lIlIlIlIIlllI[2] = 0xFFFFDDCA & 0x327F;
        y.lIlIlIlIIlllI[3] = "  ".length();
        y.lIlIlIlIIlllI[4] = "   ".length();
        y.lIlIlIlIIlllI[5] = 0x7C ^ 0x74;
    }

    private static boolean lIlllllIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIlIlIIII(String llllllllllllllIllIlIllIIIllIIIll, String llllllllllllllIllIlIllIIIllIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIIIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllIIIllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllIIIllIIlIl.init(lIlIlIlIIlllI[3], llllllllllllllIllIlIllIIIllIIllI);
            return new String(llllllllllllllIllIlIllIIIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIIIllIIlII) {
            llllllllllllllIllIlIllIIIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlllllIlIlIlII(String llllllllllllllIllIlIllIIIlIIIllI, String llllllllllllllIllIlIllIIIlIIIIII) {
        llllllllllllllIllIlIllIIIlIIIllI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIIIlIIIlII = new StringBuilder();
        char[] llllllllllllllIllIlIllIIIlIIIIll = llllllllllllllIllIlIllIIIlIIIIII.toCharArray();
        int llllllllllllllIllIlIllIIIlIIIIlI = lIlIlIlIIlllI[0];
        char[] llllllllllllllIllIlIllIIIIllllII = llllllllllllllIllIlIllIIIlIIIllI.toCharArray();
        int llllllllllllllIllIlIllIIIIlllIll = llllllllllllllIllIlIllIIIIllllII.length;
        int llllllllllllllIllIlIllIIIIlllIlI = lIlIlIlIIlllI[0];
        while (y.lIlllllIllIIlIl(llllllllllllllIllIlIllIIIIlllIlI, llllllllllllllIllIlIllIIIIlllIll)) {
            char llllllllllllllIllIlIllIIIlIIIlll = llllllllllllllIllIlIllIIIIllllII[llllllllllllllIllIlIllIIIIlllIlI];
            llllllllllllllIllIlIllIIIlIIIlII.append((char)(llllllllllllllIllIlIllIIIlIIIlll ^ llllllllllllllIllIlIllIIIlIIIIll[llllllllllllllIllIlIllIIIlIIIIlI % llllllllllllllIllIlIllIIIlIIIIll.length]));
            "".length();
            ++llllllllllllllIllIlIllIIIlIIIIlI;
            ++llllllllllllllIllIlIllIIIIlllIlI;
            "".length();
            if (((138 + 15 - 133 + 202 ^ 128 + 61 - 163 + 119) & (3 ^ 0x49 ^ (0x2B ^ 0x2E) ^ -" ".length())) < "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllIIIlIIIlII);
    }

    private static String lIlllllIlIlIlIl(String llllllllllllllIllIlIllIIIlIlIlII, String llllllllllllllIllIlIllIIIlIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIIIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlllI[5]), "DES");
            Cipher llllllllllllllIllIlIllIIIlIllIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIIIlIllIII.init(lIlIlIlIIlllI[3], llllllllllllllIllIlIllIIIlIllIIl);
            return new String(llllllllllllllIllIlIllIIIlIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIIIlIlIlll) {
            llllllllllllllIllIlIllIIIlIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        y.lIlllllIllIIIII();
        y.lIlllllIlIlIllI();
    }

    private static boolean lIlllllIllIIlII(Object object) {
        return object == null;
    }

    private static void lIlllllIlIlIllI() {
        lIlIlIlIIlIll = new String[lIlIlIlIIlllI[4]];
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[0]] = y.lIlllllIlIlIIII("esZwmxxl1xk=", "ELaId");
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[1]] = y.lIlllllIlIlIlII("BSArAQ4=", "RINmj");
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[3]] = y.lIlllllIlIlIlIl("yBgvHBEpTV4=", "NuHbJ");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        y llllllllllllllIllIlIllIIIllIllII;
        if (y.lIlllllIllIIIIl(this.cg.I() ? 1 : 0)) {
            return lIlIlIlIIlllI[0];
        }
        NPC llllllllllllllIllIlIllIIIllIlIll = llllllllllllllIllIlIllIIIllIllII.cg.A();
        if ((!y.lIlllllIllIIIlI(llllllllllllllIllIlIllIIIllIlIll) || y.lIlllllIllIIIll(llllllllllllllIllIlIllIIIllIlIll.isDead() ? 1 : 0)) && y.lIlllllIllIIIlI(Players.getLocal().getInteracting())) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return lIlIlIlIIlllI[0];
        }
        int[] nArray = new int[lIlIlIlIIlllI[1]];
        nArray[y.lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
        if (y.lIlllllIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIlIIlllI[1]];
            nArray2[y.lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
            Inventory.getFirst((int[])nArray2).interact(lIlIlIlIIlIll[lIlIlIlIIlllI[0]]);
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0xC0 ^ 0x82 ^ (0xDA ^ 0xBF)) & (0x45 ^ 0xC ^ (0xC ^ 0x62) ^ -" ".length())) != 0;
            }
        } else {
            Inventory.interact(item -> item.getName().toLowerCase().contains(lIlIlIlIIlIll[lIlIlIlIIlllI[3]]), (String)lIlIlIlIIlIll[lIlIlIlIIlllI[1]]);
            "".length();
        }
        if (y.lIlllllIllIIlII(llllllllllllllIllIlIllIIIllIlIll)) {
            return lIlIlIlIIlllI[1];
        }
        Magic.cast((Spell)SpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var1_1);
        return lIlIlIlIIlllI[1];
    }

    private static boolean lIlllllIllIIIlI(Object object) {
        return object != null;
    }
}


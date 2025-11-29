/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Prayers
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Teleporting out", priority=0x7FFFFFFE, blocking=true)
public class n
extends Task {
    private final /* synthetic */ SquireCerberusConfig as;
    private static /* synthetic */ String[] llIlIIllI;
    private static /* synthetic */ int[] llIlIIlll;
    private final /* synthetic */ a ar;

    private static boolean lIlllIIlllI(Object object) {
        return object != null;
    }

    private static void lIlllIIllII() {
        llIlIIllI = new String[llIlIIlll[4]];
        n.llIlIIllI[n.llIlIIlll[0]] = n.lIlllIIlIIl("icySCSfqgjDykrXewk65Rg==", "ibVdG");
        n.llIlIIllI[n.llIlIIlll[1]] = n.lIlllIIlIlI("Pzg4Ixwd", "oJYZy");
        n.llIlIIllI[n.llIlIIlll[2]] = n.lIlllIIlIll("Hdev9/eVx4wcfnOWCleghg==", "GWjyt");
        n.llIlIIllI[n.llIlIIlll[3]] = n.lIlllIIlIlI("JCgs", "aIXye");
    }

    static {
        n.lIlllIIllIl();
        n.lIlllIIllII();
    }

    private static boolean lIlllIIllll(Object object) {
        return object == null;
    }

    public boolean run() {
        n lIllIIIIIlllIlI;
        if (!n.lIlllIIlllI(this.ar.k()) || n.lIlllIIllll(this.ar.k().y())) {
            lIllIIIIIlllIlI.ar.a();
            return llIlIIlll[0];
        }
        if (n.lIlllIlIIII(Combat.getCurrentHealth(), lIllIIIIIlllIlI.as.forceTeleportAtHp()) && n.lIlllIlIIIl(Inventory.contains(item -> item.hasAction(llIlIIllI[llIlIIlll[3]]::equals)) ? 1 : 0)) {
            return lIllIIIIIlllIlI.U();
        }
        if (n.lIlllIlIIIl(Prayers.getPoints()) && n.lIlllIlIIIl(Inventory.contains(item -> {
            boolean bl2;
            if (!n.lIlllIlIIIl(item.getName().startsWith(llIlIIllI[llIlIIlll[1]]) ? 1 : 0) || n.lIlllIlIIlI(item.getName().startsWith(llIlIIllI[llIlIIlll[2]]) ? 1 : 0)) {
                bl2 = llIlIIlll[1];
                "".length();
                if (((107 + 57 - 131 + 110 ^ 131 + 95 - 221 + 158) & (80 + 138 - 94 + 55 ^ 28 + 106 - -20 + 5 ^ -" ".length())) != 0) {
                    return ((0x61 ^ 0x29 ^ (0x38 ^ 0x40)) & (0xE8 ^ 0xC4 ^ (0x5D ^ 0x41) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIlIIlll[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIllIIIIIlllIlI.U();
        }
        return llIlIIlll[0];
    }

    private static boolean lIlllIlIIlI(int n2) {
        return n2 != 0;
    }

    private boolean U() {
        Spell spell = Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            int n2;
            if (n.lIlllIlIIlI(standard.canCast() ? 1 : 0) && n.lIlllIlIIlI(standard.toString().toLowerCase().contains(llIlIIllI[llIlIIlll[0]]) ? 1 : 0)) {
                n2 = llIlIIlll[1];
                "".length();
                if (((0x53 ^ 0x1E ^ (0x46 ^ 0xE)) & (123 + 54 - 110 + 106 ^ 164 + 99 - 112 + 17 ^ -" ".length())) != 0) {
                    return ((6 ^ 0x76 ^ (0x5A ^ 0x7D)) & (56 + 183 - 173 + 165 ^ 110 + 19 - -4 + 43 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIlIIlll[0];
            }
            return n2 != 0;
        }).findFirst().orElse(null);
        if (n.lIlllIIllll(spell)) {
            if (n.lIlllIlIIlI(TeleportLoader.canEnterHouse() ? 1 : 0)) {
                TeleportLoader.enterHouse();
                "".length();
                return llIlIIlll[1];
            }
            return llIlIIlll[0];
        }
        Magic.cast((Spell)spell);
        return llIlIIlll[1];
    }

    private static String lIlllIIlIIl(String lIllIIIIIIlIlII, String lIllIIIIIIlIIIl) {
        try {
            SecretKeySpec lIllIIIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIIIIlIllI = Cipher.getInstance("Blowfish");
            lIllIIIIIIlIllI.init(llIlIIlll[2], lIllIIIIIIlIlll);
            return new String(lIllIIIIIIlIllI.doFinal(Base64.getDecoder().decode(lIllIIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIIIlIlIl) {
            lIllIIIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllIIllIl() {
        llIlIIlll = new int[6];
        n.llIlIIlll[0] = (0xD7 ^ 0x84) & ~(0x1A ^ 0x49);
        n.llIlIIlll[1] = " ".length();
        n.llIlIIlll[2] = "  ".length();
        n.llIlIIlll[3] = "   ".length();
        n.llIlIIlll[4] = 0x86 ^ 0xA6 ^ (0x57 ^ 0x73);
        n.llIlIIlll[5] = 50 + 84 - -11 + 10 ^ 124 + 45 - 136 + 114;
    }

    private static boolean lIlllIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlllIIlIll(String lIllIIIIIIIIlll, String lIllIIIIIIIIlII) {
        try {
            SecretKeySpec lIllIIIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), llIlIIlll[5]), "DES");
            Cipher lIllIIIIIIIlIIl = Cipher.getInstance("DES");
            lIllIIIIIIIlIIl.init(llIlIIlll[2], lIllIIIIIIIlIlI);
            return new String(lIllIIIIIIIlIIl.doFinal(Base64.getDecoder().decode(lIllIIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIIIIlIII) {
            lIllIIIIIIIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    private n(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.as = squireCerberusConfig;
        this.ar = a2;
    }

    private static String lIlllIIlIlI(String lIllIIIIIlIlIIl, String lIllIIIIIlIIIll) {
        lIllIIIIIlIlIIl = new String(Base64.getDecoder().decode(lIllIIIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIIIlIIlll = new StringBuilder();
        char[] lIllIIIIIlIIllI = lIllIIIIIlIIIll.toCharArray();
        int lIllIIIIIlIIlIl = llIlIIlll[0];
        char[] lIllIIIIIIlllll = lIllIIIIIlIlIIl.toCharArray();
        int lIllIIIIIIllllI = lIllIIIIIIlllll.length;
        int lIllIIIIIIlllIl = llIlIIlll[0];
        while (n.lIlllIlIIll(lIllIIIIIIlllIl, lIllIIIIIIllllI)) {
            char lIllIIIIIlIlIlI = lIllIIIIIIlllll[lIllIIIIIIlllIl];
            lIllIIIIIlIIlll.append((char)(lIllIIIIIlIlIlI ^ lIllIIIIIlIIllI[lIllIIIIIlIIlIl % lIllIIIIIlIIllI.length]));
            "".length();
            ++lIllIIIIIlIIlIl;
            ++lIllIIIIIIlllIl;
            "".length();
            if (" ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lIllIIIIIlIIlll);
    }
}


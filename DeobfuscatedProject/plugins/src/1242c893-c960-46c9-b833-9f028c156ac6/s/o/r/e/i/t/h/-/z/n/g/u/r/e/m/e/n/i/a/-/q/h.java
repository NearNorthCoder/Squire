/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Lower HP", priority=15, blocking=true)
public class h
extends Task {
    private static /* synthetic */ String[] lIIIlIIlllIII;
    private final /* synthetic */ SquireNightmareZoneConfig T;
    private final /* synthetic */ SquireNightmareZone S;
    private final /* synthetic */ Client U;
    private static /* synthetic */ int[] lIIIlIIlllIIl;

    private static boolean lIIlllllIllllll(Object object) {
        return object != null;
    }

    private static boolean lIIlllllIllllII(int n2) {
        return n2 != 0;
    }

    private static void lIIlllllIlllIII() {
        lIIIlIIlllIII = new String[lIIIlIIlllIIl[6]];
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[0]] = h.lIIlllllIllIllI("8NKw5V4PjmBpe6F3MlsJ7A==", "UwtHc");
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[1]] = h.lIIlllllIllIllI("cbDwtivzKlg=", "IDOPA");
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[3]] = h.lIIlllllIllIlll("PTwRPxMcJVA/ChogUC4EEi4=", "yKpMe");
        h.lIIIlIIlllIII[h.lIIIlIIlllIIl[5]] = h.lIIlllllIllIllI("Hy5TOBHlufM=", "MqtoR");
    }

    private static String lIIlllllIllIllI(String lllllllllllllllIIIIlllIllllIllIl, String lllllllllllllllIIIIlllIllllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIllllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIllllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIllllIllll.init(lIIIlIIlllIIl[3], lllllllllllllllIIIIlllIlllllIIII);
            return new String(lllllllllllllllIIIIlllIllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIllllIlllI) {
            lllllllllllllllIIIIlllIllllIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllllllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllllIlllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        h lllllllllllllllIIIIllllIIIIlIIII;
        if (h.lIIlllllIlllIlI(this.U.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlllIIl[0];
        }
        if (h.lIIlllllIlllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlIIlllIIl[1])) {
            return lIIIlIIlllIIl[0];
        }
        int lllllllllllllllIIIIllllIIIIIllll = Static.getClient().getVarbitValue(lIIIlIIlllIIl[2]);
        if (h.lIIlllllIllllII(lllllllllllllllIIIIllllIIIIlIIII.T.overload()) && !h.lIIlllllIllllIl(lllllllllllllllIIIIllllIIIIIllll, lIIIlIIlllIIl[3]) || h.lIIlllllIlllllI(lllllllllllllllIIIIllllIIIIIllll, lIIIlIIlllIIl[4])) {
            return lIIIlIIlllIIl[0];
        }
        String[] stringArray = new String[lIIIlIIlllIIl[1]];
        stringArray[h.lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[0]];
        Item lllllllllllllllIIIIllllIIIIIlllI = Inventory.getFirst((String[])stringArray);
        if (h.lIIlllllIllllll(lllllllllllllllIIIIllllIIIIIlllI)) {
            lllllllllllllllIIIIllllIIIIIlllI.interact(lIIIlIIlllIII[lIIIlIIlllIIl[1]]);
            return lIIIlIIlllIIl[1];
        }
        String[] stringArray2 = new String[lIIIlIIlllIIl[1]];
        stringArray2[h.lIIIlIIlllIIl[0]] = lIIIlIIlllIII[lIIIlIIlllIIl[3]];
        Item lllllllllllllllIIIIllllIIIIIllIl = Inventory.getFirst((String[])stringArray2);
        if (h.lIIlllllIllllll(lllllllllllllllIIIIllllIIIIIllIl)) {
            lllllllllllllllIIIIllllIIIIIllIl.interact(lIIIlIIlllIII[lIIIlIIlllIIl[5]]);
            return lIIIlIIlllIIl[1];
        }
        return lIIIlIIlllIIl[0];
    }

    @Inject
    public h(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.S = squireNightmareZone;
        this.T = squireNightmareZoneConfig;
        this.U = client;
    }

    static {
        h.lIIlllllIlllIIl();
        h.lIIlllllIlllIII();
    }

    private static String lIIlllllIllIlll(String lllllllllllllllIIIIlllIlllllllIl, String lllllllllllllllIIIIllllIIIIIIIIl) {
        lllllllllllllllIIIIlllIlllllllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllIIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIIIIlllIlllllllll = lllllllllllllllIIIIllllIIIIIIIIl.toCharArray();
        int lllllllllllllllIIIIlllIllllllllI = lIIIlIIlllIIl[0];
        char[] lllllllllllllllIIIIlllIllllllIII = lllllllllllllllIIIIlllIlllllllIl.toCharArray();
        int lllllllllllllllIIIIlllIlllllIlll = lllllllllllllllIIIIlllIllllllIII.length;
        int lllllllllllllllIIIIlllIlllllIllI = lIIIlIIlllIIl[0];
        while (h.lIIllllllIIIIII(lllllllllllllllIIIIlllIlllllIllI, lllllllllllllllIIIIlllIlllllIlll)) {
            char lllllllllllllllIIIIllllIIIIIIIll = lllllllllllllllIIIIlllIllllllIII[lllllllllllllllIIIIlllIlllllIllI];
            lllllllllllllllIIIIllllIIIIIIIII.append((char)(lllllllllllllllIIIIllllIIIIIIIll ^ lllllllllllllllIIIIlllIlllllllll[lllllllllllllllIIIIlllIllllllllI % lllllllllllllllIIIIlllIlllllllll.length]));
            "".length();
            ++lllllllllllllllIIIIlllIllllllllI;
            ++lllllllllllllllIIIIlllIlllllIllI;
            "".length();
            if ((147 + 164 - 269 + 148 ^ 109 + 58 - 126 + 145) >= (0x4D ^ 0x4B ^ "  ".length())) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIllllIIIIIIIII);
    }

    private static void lIIlllllIlllIIl() {
        lIIIlIIlllIIl = new int[7];
        h.lIIIlIIlllIIl[0] = "  ".length() & ~"  ".length();
        h.lIIIlIIlllIIl[1] = " ".length();
        h.lIIIlIIlllIIl[2] = -(0xFFFFF85F & 0x67A1) & (0xFFFFEF7B & 0x7FF7);
        h.lIIIlIIlllIIl[3] = "  ".length();
        h.lIIIlIIlllIIl[4] = 91 + 36 - 109 + 135 ^ 41 + 135 - 156 + 118;
        h.lIIIlIIlllIIl[5] = "   ".length();
        h.lIIIlIIlllIIl[6] = 0x7B ^ 0x7F;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Prayers
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Teleporting out", priority=20, blocking=true)
public class ak
extends Task {
    private static /* synthetic */ String[] llIIIlIll;
    private final /* synthetic */ a cP;
    private static /* synthetic */ int[] llIIIllII;

    private static void lIlIlIlllll() {
        llIIIlIll = new String[llIIIllII[10]];
        ak.llIIIlIll[ak.llIIIllII[1]] = ak.lIlIlIlllII("h8yuvmrUhq4t+jLGantQKA==", "Oafql");
        ak.llIIIlIll[ak.llIIIllII[0]] = ak.lIlIlIlllIl("d2LXeSRzi1M=", "cHkTJ");
        ak.llIIIlIll[ak.llIIIllII[8]] = ak.lIlIlIlllIl("X1J5jmID6pjDgAeM6gEAFw==", "vnFKg");
        ak.llIIIlIll[ak.llIIIllII[9]] = ak.lIlIlIllllI("Kykt", "nHYYz");
    }

    private static boolean lIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ak.lIlIllIIIII();
        ak.lIlIlIlllll();
    }

    private static boolean lIlIllIIIlI(Object object) {
        return object == null;
    }

    private static void lIlIllIIIII() {
        llIIIllII = new int[12];
        ak.llIIIllII[0] = " ".length();
        ak.llIIIllII[1] = (0x16 ^ 0x49 ^ (0x63 ^ 0x6E)) & (0 ^ 0xA ^ (0xFB ^ 0xA3) ^ -" ".length());
        ak.llIIIllII[2] = 0xFFFFE3CD & 0x3E3B;
        ak.llIIIllII[3] = 0xFFFF97FF & 0x6F26;
        ak.llIIIllII[4] = -(0xFFFFCE4F & 0x79BF) & (0xFFFFFEFF & 0x6FAF);
        ak.llIIIllII[5] = 0xE ^ 0xB ^ (1 ^ 0x1C);
        ak.llIIIllII[6] = 137 + 70 - 80 + 34 ^ 36 + 139 - 46 + 53;
        ak.llIIIllII[7] = 0x3A ^ 0x24;
        ak.llIIIllII[8] = "  ".length();
        ak.llIIIllII[9] = "   ".length();
        ak.llIIIllII[10] = 0xB0 ^ 0xB4;
        ak.llIIIllII[11] = 0xCF ^ 0xA7 ^ (0xA2 ^ 0xC2);
    }

    private boolean U() {
        Spell spell = Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            int n2;
            if (ak.lIlIllIIlII(standard.canCast() ? 1 : 0) && ak.lIlIllIIlII(standard.toString().toLowerCase().contains(llIIIlIll[llIIIllII[1]]) ? 1 : 0)) {
                n2 = llIIIllII[0];
                "".length();
                if (null != null) {
                    return ((0x54 ^ 0x4B ^ (0xC ^ 0x2A)) & (0x10 ^ 0x18 ^ (0xBD ^ 0x8C) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIIllII[1];
            }
            return n2 != 0;
        }).findFirst().orElse(null);
        if (ak.lIlIllIIIlI(spell)) {
            return llIIIllII[1];
        }
        Magic.cast((Spell)spell);
        return llIIIllII[0];
    }

    private static boolean lIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        ak lIllIllIlllllll;
        void lIllIllIllllllI;
        int[] nArray = new int[llIIIllII[0]];
        nArray[ak.llIIIllII[1]] = llIIIllII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIIllII[3], llIIIllII[4], llIIIllII[5], llIIIllII[6], llIIIllII[1]);
        if (ak.lIlIllIIIIl(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIllII[1];
        }
        if (ak.lIlIllIIIlI(lIllIllIllllllI)) {
            return llIIIllII[1];
        }
        if (ak.lIlIllIIIll(Combat.getCurrentHealth(), llIIIllII[7]) && ak.lIlIllIIIIl(Inventory.contains(item -> item.hasAction(llIIIlIll[llIIIllII[9]]::equals)) ? 1 : 0)) {
            return lIllIllIlllllll.U();
        }
        if (ak.lIlIllIIIIl(Prayers.getPoints()) && ak.lIlIllIIIIl(Inventory.contains(item -> {
            int n2;
            if (!ak.lIlIllIIIIl(item.getName().startsWith(llIIIlIll[llIIIllII[0]]) ? 1 : 0) || ak.lIlIllIIlII(item.getName().startsWith(llIIIlIll[llIIIllII[8]]) ? 1 : 0)) {
                n2 = llIIIllII[0];
                "".length();
                if (-" ".length() > 0) {
                    return ((0xFA ^ 0x87 ^ (0xE3 ^ 0xA7)) & (0x65 ^ 0x32 ^ (0x7F ^ 0x11) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIIllII[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIllIllIlllllll.U();
        }
        return llIIIllII[1];
    }

    @Inject
    private ak(a a2) {
        this.cP = a2;
    }

    private static boolean lIlIllIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIlIllllI(String lIllIllIllIllII, String lIllIllIllIIllI) {
        lIllIllIllIllII = new String(Base64.getDecoder().decode(lIllIllIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIllIllIlIlI = new StringBuilder();
        char[] lIllIllIllIlIIl = lIllIllIllIIllI.toCharArray();
        int lIllIllIllIlIII = llIIIllII[1];
        char[] lIllIllIllIIIlI = lIllIllIllIllII.toCharArray();
        int lIllIllIllIIIIl = lIllIllIllIIIlI.length;
        int lIllIllIllIIIII = llIIIllII[1];
        while (ak.lIlIllIIlIl(lIllIllIllIIIII, lIllIllIllIIIIl)) {
            char lIllIllIllIllIl = lIllIllIllIIIlI[lIllIllIllIIIII];
            lIllIllIllIlIlI.append((char)(lIllIllIllIllIl ^ lIllIllIllIlIIl[lIllIllIllIlIII % lIllIllIllIlIIl.length]));
            "".length();
            ++lIllIllIllIlIII;
            ++lIllIllIllIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIllIllIllIlIlI);
    }

    private static String lIlIlIlllIl(String lIllIllIlIIlIlI, String lIllIllIlIIIlll) {
        try {
            SecretKeySpec lIllIllIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIlIIIlll.getBytes(StandardCharsets.UTF_8)), llIIIllII[11]), "DES");
            Cipher lIllIllIlIIllII = Cipher.getInstance("DES");
            lIllIllIlIIllII.init(llIIIllII[8], lIllIllIlIIllIl);
            return new String(lIllIllIlIIllII.doFinal(Base64.getDecoder().decode(lIllIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIlIIlIll) {
            lIllIllIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlllII(String lIllIllIlIlIlIl, String lIllIllIlIlIllI) {
        try {
            SecretKeySpec lIllIllIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllIlIllIIl = Cipher.getInstance("Blowfish");
            lIllIllIlIllIIl.init(llIIIllII[8], lIllIllIlIllIlI);
            return new String(lIllIllIlIllIIl.doFinal(Base64.getDecoder().decode(lIllIllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIlIllIII) {
            lIllIllIlIllIII.printStackTrace();
            return null;
        }
    }
}


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
public class bL
extends Task {
    private static /* synthetic */ String[] llIIIllll;
    private static /* synthetic */ int[] llIIlIIII;
    private final /* synthetic */ a gF;

    @Inject
    private bL(a a2) {
        this.gF = a2;
    }

    private boolean U() {
        Spell spell = Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            int n2;
            if (bL.lIlIlllIIIl(standard.canCast() ? 1 : 0) && bL.lIlIlllIIIl(standard.toString().toLowerCase().contains(llIIIllll[llIIlIIII[1]]) ? 1 : 0)) {
                n2 = llIIlIIII[0];
                "".length();
                if ((0xD4 ^ 0x84 ^ (0x70 ^ 0x24)) != (144 + 72 - 46 + 16 ^ 21 + 158 - 121 + 132)) {
                    return ((131 + 54 - 124 + 88 ^ 120 + 75 - 143 + 116) & (11 + 141 - 41 + 71 ^ 66 + 64 - 40 + 49 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIlIIII[1];
            }
            return n2 != 0;
        }).findFirst().orElse(null);
        if (bL.lIlIllIllll(spell)) {
            return llIIlIIII[1];
        }
        Magic.cast((Spell)spell);
        return llIIlIIII[0];
    }

    private static String lIlIllIlIll(String lIllIllIIIllIIl, String lIllIllIIIlIllI) {
        try {
            SecretKeySpec lIllIllIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIlIIII[11]), "DES");
            Cipher lIllIllIIIllIll = Cipher.getInstance("DES");
            lIllIllIIIllIll.init(llIIlIIII[8], lIllIllIIIlllII);
            return new String(lIllIllIIIllIll.doFinal(Base64.getDecoder().decode(lIllIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIIIllIlI) {
            lIllIllIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        bL lIllIllIIlIlIIl;
        void lIllIllIIlIlIII;
        int[] nArray = new int[llIIlIIII[0]];
        nArray[bL.llIIlIIII[1]] = llIIlIIII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIlIIII[3], llIIlIIII[4], llIIlIIII[5], llIIlIIII[6], llIIlIIII[1]);
        if (bL.lIlIllIlllI(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlIIII[1];
        }
        if (bL.lIlIllIllll(lIllIllIIlIlIII)) {
            return llIIlIIII[1];
        }
        if (bL.lIlIlllIIII(Combat.getCurrentHealth(), llIIlIIII[7]) && bL.lIlIllIlllI(Inventory.contains(item -> item.hasAction(llIIIllll[llIIlIIII[9]]::equals)) ? 1 : 0)) {
            return lIllIllIIlIlIIl.U();
        }
        if (bL.lIlIllIlllI(Prayers.getPoints()) && bL.lIlIllIlllI(Inventory.contains(item -> {
            boolean bl2;
            if (!bL.lIlIllIlllI(item.getName().startsWith(llIIIllll[llIIlIIII[0]]) ? 1 : 0) || bL.lIlIlllIIIl(item.getName().startsWith(llIIIllll[llIIlIIII[8]]) ? 1 : 0)) {
                bl2 = llIIlIIII[0];
                "".length();
                if (-" ".length() > (146 + 106 - 181 + 99 ^ 32 + 84 - 80 + 138)) {
                    return ((118 + 125 - 172 + 61 ^ 78 + 94 - 42 + 8) & (0x44 ^ 0x4B ^ " ".length() ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIlIIII[1];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIllIllIIlIlIIl.U();
        }
        return llIIlIIII[1];
    }

    private static String lIlIllIlIlI(String lIllIllIIIIlIlI, String lIllIllIIIIlIIl) {
        try {
            SecretKeySpec lIllIllIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllIIIIlllI = Cipher.getInstance("Blowfish");
            lIllIllIIIIlllI.init(llIIlIIII[8], lIllIllIIIIllll);
            return new String(lIllIllIIIIlllI.doFinal(Base64.getDecoder().decode(lIllIllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIIIIllIl) {
            lIllIllIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIllIllIl() {
        llIIlIIII = new int[12];
        bL.llIIlIIII[0] = " ".length();
        bL.llIIlIIII[1] = (0x91 ^ 0xBD ^ (0x6A ^ 0x1E)) & (192 + 130 - 183 + 79 ^ 102 + 41 - 15 + 2 ^ -" ".length());
        bL.llIIlIIII[2] = 0xFFFFF39F & 0x2E69;
        bL.llIIlIIII[3] = -(0xFFFFFBAB & 0x545D) & (0xFFFFD7EE & 0x7F3F);
        bL.llIIlIIII[4] = 0xFFFFFEED & 0x27B3;
        bL.llIIlIIII[5] = 0x71 ^ 0x68 ^ " ".length();
        bL.llIIlIIII[6] = 0x59 ^ 0x1C ^ (0xFD ^ 0xAF);
        bL.llIIlIIII[7] = 0x75 ^ 0x41 ^ (0x9A ^ 0xB0);
        bL.llIIlIIII[8] = "  ".length();
        bL.llIIlIIII[9] = "   ".length();
        bL.llIIlIIII[10] = 85 + 43 - 50 + 56 ^ 49 + 76 - 81 + 86;
        bL.llIIlIIII[11] = 3 ^ 0x31 ^ (0x45 ^ 0x7F);
    }

    static {
        bL.lIlIllIllIl();
        bL.lIlIllIllII();
    }

    private static void lIlIllIllII() {
        llIIIllll = new String[llIIlIIII[10]];
        bL.llIIIllll[bL.llIIlIIII[1]] = bL.lIlIllIlIlI("UDw/GOAQ1zDjV5QcPB80YA==", "UAAKO");
        bL.llIIIllll[bL.llIIlIIII[0]] = bL.lIlIllIlIll("YdBZMApHTX8=", "EfIgh");
        bL.llIIIllll[bL.llIIlIIII[8]] = bL.lIlIllIlIll("/1mdXD6fJhrxkoJHb7h7BA==", "ckidj");
        bL.llIIIllll[bL.llIIlIIII[9]] = bL.lIlIllIlIll("3LEifjfhd6k=", "cpCvb");
    }
}


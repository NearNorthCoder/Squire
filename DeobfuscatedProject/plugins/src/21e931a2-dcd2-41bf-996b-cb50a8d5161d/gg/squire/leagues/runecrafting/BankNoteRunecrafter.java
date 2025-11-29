/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.leagues.runecrafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="[Leagues] Runecrafter", enabledByDefault=false)
@SquireUtil
public class BankNoteRunecrafter
extends SquirePlugin {
    private static /* synthetic */ String[] lIIll;
    private static /* synthetic */ int[] lIlII;

    private static String lllIlI(String llllllIIIlIIIlI, String llllllIIIlIIIll) {
        try {
            SecretKeySpec llllllIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIlIIllI = Cipher.getInstance("Blowfish");
            llllllIIIlIIllI.init(lIlII[2], llllllIIIlIIlll);
            return new String(llllllIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIIlIIlIl) {
            llllllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllI() {
        lIlII = new int[6];
        BankNoteRunecrafter.lIlII[0] = (0x80 ^ 0x8B ^ (0x86 ^ 0xB2)) & (0xB2 ^ 0xA2 ^ (0x83 ^ 0xAC) ^ -" ".length());
        BankNoteRunecrafter.lIlII[1] = " ".length();
        BankNoteRunecrafter.lIlII[2] = "  ".length();
        BankNoteRunecrafter.lIlII[3] = "   ".length();
        BankNoteRunecrafter.lIlII[4] = 0xB2 ^ 0xB6;
        BankNoteRunecrafter.lIlII[5] = 0xC8 ^ 0xC0;
    }

    private static String lllIll(String llllllIIlIIlIIl, String llllllIIlIIlIII) {
        try {
            SecretKeySpec llllllIIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIlIIlIII.getBytes(StandardCharsets.UTF_8)), lIlII[5]), "DES");
            Cipher llllllIIlIIlIll = Cipher.getInstance("DES");
            llllllIIlIIlIll.init(lIlII[2], llllllIIlIIllII);
            return new String(llllllIIlIIlIll.doFinal(Base64.getDecoder().decode(llllllIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIlIIlIlI) {
            llllllIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void llllIl() {
        lIIll = new String[lIlII[4]];
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[0]] = BankNoteRunecrafter.lllIlI("Ak0AhQT4SDQ8HT0ArWIfQA==", "MMQAL");
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[1]] = BankNoteRunecrafter.lllIll("PQnbm3E51Lfaed4r2GZUpA==", "ruBLS");
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[2]] = BankNoteRunecrafter.lllIlI("X5wG8MTEaoo=", "LchJY");
        BankNoteRunecrafter.lIIll[BankNoteRunecrafter.lIlII[3]] = BankNoteRunecrafter.llllII("CgAjFSMMFg==", "osPpM");
    }

    private static String llllII(String llllllIIIllIlII, String llllllIIIllIIll) {
        llllllIIIllIlII = new String(Base64.getDecoder().decode(llllllIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIIllIlll = new StringBuilder();
        char[] llllllIIIllIllI = llllllIIIllIIll.toCharArray();
        int llllllIIIllIlIl = lIlII[0];
        char[] llllllIIIlIllll = llllllIIIllIlII.toCharArray();
        int llllllIIIlIlllI = llllllIIIlIllll.length;
        int llllllIIIlIllIl = lIlII[0];
        while (BankNoteRunecrafter.lIIIIlI(llllllIIIlIllIl, llllllIIIlIlllI)) {
            char llllllIIIlllIlI = llllllIIIlIllll[llllllIIIlIllIl];
            llllllIIIllIlll.append((char)(llllllIIIlllIlI ^ llllllIIIllIllI[llllllIIIllIlIl % llllllIIIllIllI.length]));
            "".length();
            ++llllllIIIllIlIl;
            ++llllllIIIlIllIl;
            "".length();
            if ((0x45 ^ 0x41) >= " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllIIIllIlll);
    }

    protected Class<?>[] tasks() {
        return new Class[lIlII[0]];
    }

    private static boolean lIIIIlI(int n, int n2) {
        return n < n2;
    }

    private static boolean llllll(int n) {
        return n == 0;
    }

    private static boolean lIIIIII(int n, int n2) {
        return n == n2;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (BankNoteRunecrafter.llllll(Inventory.contains(item -> item.getName().contains(lIIll[lIlII[3]])) ? 1 : 0)) {
            return;
        }
        if (BankNoteRunecrafter.llllll(Inventory.isFull() ? 1 : 0)) {
            Inventory.use(item -> {
                int n;
                if (BankNoteRunecrafter.lIIIIIl(item.getName().contains(lIIll[lIlII[2]]) ? 1 : 0) && BankNoteRunecrafter.lIIIIIl(item.isNoted() ? 1 : 0)) {
                    n = lIlII[1];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((0x62 ^ 0x34 ^ (0x1D ^ 0x40)) & (0xE4 ^ 0xB1 ^ (0x42 ^ 0x1C) ^ -" ".length())) != 0;
                    }
                } else {
                    n = lIlII[0];
                }
                return n != 0;
            }, item -> {
                boolean bl;
                if (BankNoteRunecrafter.lIIIIII(item.getId(), a.a)) {
                    bl = lIlII[1];
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((65 + 158 - 36 + 7 ^ 96 + 72 - 98 + 58) & (0xCF ^ 0x86 ^ (0 ^ 0xB) ^ -" ".length())) != 0;
                    }
                } else {
                    bl = lIlII[0];
                }
                return bl;
            });
            "".length();
        }
        TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIlII[1]];
            stringArray[BankNoteRunecrafter.lIlII[0]] = lIIll[lIlII[1]];
            return tileObject.hasAction(stringArray);
        }).interact(lIIll[lIlII[0]]);
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    static {
        BankNoteRunecrafter.lllllI();
        BankNoteRunecrafter.llllIl();
    }

    private static boolean lIIIIIl(int n) {
        return n != 0;
    }
}


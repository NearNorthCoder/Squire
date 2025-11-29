/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

@TaskDesc(name="Hopping to different world", priority=1000, blocking=true, register=true)
public class cj
extends ck {
    private static /* synthetic */ String[] lIlllllIIll;
    private /* synthetic */ World hS;
    private static /* synthetic */ int[] lIlllllIlIl;

    private static /* synthetic */ boolean b(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0) && cj.lIIllIllIlIIll(world2.isMembers() ? 1 : 0) && cj.lIIllIllIlIIll(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0)) {
            n2 = lIlllllIlIl[4];
            "".length();
            if (" ".length() < 0) {
                return ((0xE8 ^ 0xA3) & ~(0xCF ^ 0x84)) != 0;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIIllIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0)) {
            n2 = lIlllllIlIl[4];
            "".length();
            if (" ".length() <= ((0x1D ^ 0x21) & ~(5 ^ 0x39))) {
                return ((0x19 ^ 7) & ~(0xA6 ^ 0xB8)) != 0;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }

    private static String lIIllIllIIlIll(String llllllllllllllllIlIIlIlIIIlIIlIl, String llllllllllllllllIlIIlIlIIIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIlIIIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIlIIIlIIlll.init(lIlllllIlIl[5], llllllllllllllllIlIIlIlIIIlIlIII);
            return new String(llllllllllllllllIlIIlIlIIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIIIlIIllI) {
            llllllllllllllllIlIIlIlIIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIlIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var5_5;
        void var4_4;
        cj llllllllllllllllIlIIlIlIIlIIllII;
        if (cj.lIIllIllIlIIll(this.hY.disableHopping() ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        if (cj.lIIllIllIlIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lIlllllIlIl[0];
        }
        Widget llllllllllllllllIlIIlIlIIlIIlIll = Widgets.get((int)lIlllllIlIl[1], (int)lIlllllIlIl[2]);
        if (cj.lIIllIllIlIIll(Widgets.isVisible((Widget)llllllllllllllllIlIIlIlIIlIIlIll) ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        Widget llllllllllllllllIlIIlIlIIlIIlIlI = llllllllllllllllIlIIlIlIIlIIllII.cu.getWidget(lIlllllIlIl[3]);
        if (cj.lIIllIllIlIIll(Widgets.isVisible((Widget)llllllllllllllllIlIIlIlIIlIIlIlI) ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        if (cj.lIIllIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        BankLoadout llllllllllllllllIlIIlIlIIlIIlIIl = (BankLoadout)llllllllllllllllIlIIlIlIIlIIllII.hY.loadout().selected(BankLoadout.class);
        if (cj.lIIllIllIlIlIl(llllllllllllllllIlIIlIlIIlIIlIIl.needsToBank() ? 1 : 0)) {
            llllllllllllllllIlIIlIlIIlIIllII.hS = Worlds.getCurrentWorld();
            return lIlllllIlIl[0];
        }
        Log.info((String)lIlllllIIll[lIlllllIlIl[0]]);
        World llllllllllllllllIlIIlIlIIlIIlIII = Worlds.getCurrentWorld();
        if (cj.lIIllIllIlIllI(llllllllllllllllIlIIlIlIIlIIlIII)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[4]]);
            return lIlllllIlIl[4];
        }
        if (cj.lIIllIllIlIlll(llllllllllllllllIlIIlIlIIlIIllII.hS) && cj.lIIllIllIllIII(llllllllllllllllIlIIlIlIIlIIlIII.getId(), llllllllllllllllIlIIlIlIIlIIllII.hS.getId())) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[5]]);
            return lIlllllIlIl[0];
        }
        World llllllllllllllllIlIIlIlIIlIIIlll = llllllllllllllllIlIIlIlIIlIIllII.a(llllllllllllllllIlIIlIlIIlIIlIII);
        if (cj.lIIllIllIlIllI(llllllllllllllllIlIIlIlIIlIIIlll)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[2]]);
            return lIlllllIlIl[4];
        }
        if (cj.lIIllIllIlIlIl(Worlds.isHopperOpen() ? 1 : 0)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[6]]);
            Worlds.openHopper();
            return lIlllllIlIl[4];
        }
        this.sleep(lIlllllIlIl[7]);
        this.hS = var4_4;
        Worlds.hopTo((World)var5_5);
        Log.info((String)lIlllllIIll[lIlllllIlIl[8]]);
        return lIlllllIlIl[4];
    }

    private static boolean lIIllIllIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIIllIllIllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIllIllIIllII(String llllllllllllllllIlIIlIlIIIIIlIII, String llllllllllllllllIlIIlIlIIIIIIlll) {
        llllllllllllllllIlIIlIlIIIIIlIII = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIlIIIIIIllI = new StringBuilder();
        char[] llllllllllllllllIlIIlIlIIIIIIlIl = llllllllllllllllIlIIlIlIIIIIIlll.toCharArray();
        int llllllllllllllllIlIIlIlIIIIIIlII = lIlllllIlIl[0];
        char[] llllllllllllllllIlIIlIIllllllllI = llllllllllllllllIlIIlIlIIIIIlIII.toCharArray();
        int llllllllllllllllIlIIlIIlllllllIl = llllllllllllllllIlIIlIIllllllllI.length;
        int llllllllllllllllIlIIlIIlllllllII = lIlllllIlIl[0];
        while (cj.lIIllIllIllIIl(llllllllllllllllIlIIlIIlllllllII, llllllllllllllllIlIIlIIlllllllIl)) {
            char llllllllllllllllIlIIlIlIIIIIlIIl = llllllllllllllllIlIIlIIllllllllI[llllllllllllllllIlIIlIIlllllllII];
            llllllllllllllllIlIIlIlIIIIIIllI.append((char)(llllllllllllllllIlIIlIlIIIIIlIIl ^ llllllllllllllllIlIIlIlIIIIIIlIl[llllllllllllllllIlIIlIlIIIIIIlII % llllllllllllllllIlIIlIlIIIIIIlIl.length]));
            "".length();
            ++llllllllllllllllIlIIlIlIIIIIIlII;
            ++llllllllllllllllIlIIlIIlllllllII;
            "".length();
            if (-(0x9C ^ 0xB0 ^ (0xA ^ 0x22)) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIlIlIIIIIIllI);
    }

    private static boolean lIIllIllIlIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIllIllIlIIlI() {
        lIlllllIlIl = new int[13];
        cj.lIlllllIlIl[0] = (0x47 ^ 5 ^ (0x84 ^ 0x81)) & (199 + 64 - 232 + 196 ^ 95 + 31 - 120 + 158 ^ -" ".length());
        cj.lIlllllIlIl[1] = 0xFFFF9F5A & 0x62FF;
        cj.lIlllllIlIl[2] = "   ".length();
        cj.lIlllllIlIl[3] = 0xFFFFD57D & 0x3042AC2;
        cj.lIlllllIlIl[4] = " ".length();
        cj.lIlllllIlIl[5] = "  ".length();
        cj.lIlllllIlIl[6] = 112 + 89 - 156 + 111 ^ 82 + 84 - 111 + 97;
        cj.lIlllllIlIl[7] = 0xE6 ^ 0xAB ^ (0x12 ^ 0x77);
        cj.lIlllllIlIl[8] = 0x26 ^ 0x3F ^ (0x26 ^ 0x3A);
        cj.lIlllllIlIl[9] = 129 + 112 - 180 + 129 ^ 55 + 166 - 172 + 135;
        cj.lIlllllIlIl[10] = 0xFFFF93F8 & 0x6E5F;
        cj.lIlllllIlIl[11] = 0x71 ^ 0x76;
        cj.lIlllllIlIl[12] = 0x3A ^ 0x32;
    }

    /*
     * WARNING - void declaration
     */
    private World a(World world) {
        World world3;
        void llllllllllllllllIlIIlIlIIlIIIIIl;
        String string = this.hY.worldsHopping();
        if (cj.lIIllIllIlIlIl(string.isEmpty() ? 1 : 0)) {
            String[] stringArray = string.split(lIlllllIIll[lIlllllIlIl[9]]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(Stream.of(stringArray).anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = lIlllllIlIl[4];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x96 ^ 0xC4 ^ (3 ^ 8) & ~(0x7D ^ 0x76)) & (0xE3 ^ 0x97 ^ (0x81 ^ 0xA7) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlllllIlIl[0];
                }
                return n2 != 0;
            });
        }
        World llllllllllllllllIlIIlIlIIIllllll = Worlds.getRandom(arg_0 -> cj.c((World)llllllllllllllllIlIIlIlIIlIIIIIl, arg_0));
        if (cj.lIIllIllIlIllI(llllllllllllllllIlIIlIlIIIllllll) && cj.lIIllIllIlIllI(llllllllllllllllIlIIlIlIIIllllll = Worlds.getRandom(arg_0 -> cj.b((World)llllllllllllllllIlIIlIlIIlIIIIIl, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> cj.a((World)llllllllllllllllIlIIlIlIIlIIIIIl, arg_0));
        }
        return world3;
    }

    private static String lIIllIllIIlIlI(String llllllllllllllllIlIIlIlIIIIlIllI, String llllllllllllllllIlIIlIlIIIIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), lIlllllIlIl[12]), "DES");
            Cipher llllllllllllllllIlIIlIlIIIIllIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIIIIllIlI.init(lIlllllIlIl[5], llllllllllllllllIlIIlIlIIIIllIll);
            return new String(llllllllllllllllIlIIlIlIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIIIIllIIl) {
            llllllllllllllllIlIIlIlIIIIllIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected cj(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIIllIllIIllIl() {
        lIlllllIIll = new String[lIlllllIlIl[11]];
        cj.lIlllllIIll[cj.lIlllllIlIl[0]] = cj.lIIllIllIIlIlI("oWKg42+h4XMxI4g/yDI08b+py14eRB9o", "afBUq");
        cj.lIlllllIIll[cj.lIlllllIlIl[4]] = cj.lIIllIllIIlIll("dLMUahVn0ZaTxPsGmSKtDV5TygF3hVVW1kLPMua2xtNRs4TUd0fphnpfeypuE1lM", "EbIVp");
        cj.lIlllllIIll[cj.lIlllllIlIl[5]] = cj.lIIllIllIIlIll("rBUfZpx6in2VfNIZDVbL2xvndgG9fgdK2MiwLQ+p7zmCW+VevJUSIh4MVYTqHpA1BtcQ8jetap7HOm/IaqmDjj2qOR4ikknY", "fpUFM");
        cj.lIlllllIIll[cj.lIlllllIlIl[2]] = cj.lIIllIllIIllII("OQ4FPDEDNQERRSQnAyAMDCFKOApCIAMiAUInSjsKECoObBENZgIjFUIyBXNa", "bFjLe");
        cj.lIlllllIIll[cj.lIlllllIlIl[6]] = cj.lIIllIllIIlIlI("10FKYtVXjZi9Fgp2eEp6C8ma3hDp8vySp5A1S/s6gPEUjcihWKR/Uw==", "ITfwe");
        cj.lIlllllIIll[cj.lIlllllIlIl[8]] = cj.lIIllIllIIllII("PCwfIQ0GFxsMeTABUDssFBBQOTYXFBU1", "gdpQY");
        cj.lIlllllIIll[cj.lIlllllIlIl[9]] = cj.lIIllIllIIlIlI("bArB+BvlhQ4=", "HErBN");
    }

    static {
        cj.lIIllIllIlIIlI();
        cj.lIIllIllIIllIl();
    }

    private static boolean lIIllIllIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIlIIll(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean c(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0) && cj.lIIllIllIlIIll(world2.isMembers() ? 1 : 0) && cj.lIIllIllIlIIll(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0) && cj.lIIllIllIllIIl(world2.getPlayerCount(), lIlllllIlIl[10])) {
            n2 = lIlllllIlIl[4];
            "".length();
            if ("   ".length() <= 0) {
                return ((0xF ^ 0x5A) & ~(0xCD ^ 0x98)) != 0;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }
}


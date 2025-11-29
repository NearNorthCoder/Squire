package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Hopping to different world", priority = 1000, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cj  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cj.class */
public class cj extends ck {
    private static /* synthetic */ String[] lIlllllIIll;
    private /* synthetic */ World hS;
    private static /* synthetic */ int[] lIlllllIlIl;

    private static boolean lIIllIllIllIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIllIllIIlIll(String llllllllllllllllIlIIlIlIIIlIIlIl, String llllllllllllllllIlIIlIlIIIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllIlIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIIIlIIllI) {
            llllllllllllllllIlIIlIlIIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIlIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        if (!lIIllIllIlIIll(this.hY.disableHopping() ? 1 : 0) && !lIIllIllIlIlII(Game.getState(), GameState.LOGGED_IN) && !lIIllIllIlIIll(Widgets.isVisible(Widgets.get(lIlllllIlIl[1], lIlllllIlIl[2])) ? 1 : 0) && !lIIllIllIlIIll(Widgets.isVisible(this.cu.getWidget(lIlllllIlIl[3])) ? 1 : 0) && !lIIllIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            if (lIIllIllIlIlIl(((BankLoadout) this.hY.loadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
                this.hS = Worlds.getCurrentWorld();
                return lIlllllIlIl[0];
            }
            Log.info(lIlllllIIll[lIlllllIlIl[0]]);
            World currentWorld = Worlds.getCurrentWorld();
            if (lIIllIllIlIllI(currentWorld)) {
                Log.info(lIlllllIIll[lIlllllIlIl[4]]);
                return lIlllllIlIl[4];
            } else if (lIIllIllIlIlll(this.hS) && lIIllIllIllIII(currentWorld.getId(), this.hS.getId())) {
                Log.info(lIlllllIIll[lIlllllIlIl[5]]);
                return lIlllllIlIl[0];
            } else {
                World a = a(currentWorld);
                if (lIIllIllIlIllI(a)) {
                    Log.info(lIlllllIIll[lIlllllIlIl[2]]);
                    return lIlllllIlIl[4];
                } else if (lIIllIllIlIlIl(Worlds.isHopperOpen() ? 1 : 0)) {
                    Log.info(lIlllllIIll[lIlllllIlIl[6]]);
                    Worlds.openHopper();
                    return lIlllllIlIl[4];
                } else {
                    sleep(lIlllllIlIl[7]);
                    this.hS = currentWorld;
                    Worlds.hopTo(a);
                    Log.info(lIlllllIIll[lIlllllIlIl[8]]);
                    return lIlllllIlIl[4];
                }
            }
        }
        return lIlllllIlIl[0];
    }

    private static boolean lIIllIllIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIllIllIII(int i, int i2) {
        return i != i2;
    }

    private static String lIIllIllIIllII(String llllllllllllllllIlIIlIlIIIIIlIII, String llllllllllllllllIlIIlIlIIIIIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIlIIIIIIllI = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIlIlIIIIIIlll.toCharArray();
        int llllllllllllllllIlIIlIlIIIIIIlII = lIlllllIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlllllIlIl[0];
        while (lIIllIllIllIIl(i, length)) {
            char llllllllllllllllIlIIlIIllllllIll = charArray2[i];
            llllllllllllllllIlIIlIlIIIIIIllI.append((char) (llllllllllllllllIlIIlIIllllllIll ^ charArray[llllllllllllllllIlIIlIlIIIIIIlII % charArray.length]));
            "".length();
            llllllllllllllllIlIIlIlIIIIIIlII++;
            i++;
            "".length();
            if ((-((156 ^ 176) ^ (10 ^ 34))) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIlIlIIIIIIllI);
    }

    private static boolean lIIllIllIlIlIl(int i) {
        return i == 0;
    }

    private static void lIIllIllIlIIlI() {
        lIlllllIlIl = new int[13];
        lIlllllIlIl[0] = ((71 ^ 5) ^ (132 ^ 129)) & (((((199 + 64) - 232) + 196) ^ (((95 + 31) - 120) + 158)) ^ (-" ".length()));
        lIlllllIlIl[1] = (-24742) & 25343;
        lIlllllIlIl[2] = "   ".length();
        lIlllllIlIl[3] = (-10883) & 50604738;
        lIlllllIlIl[4] = " ".length();
        lIlllllIlIl[5] = "  ".length();
        lIlllllIlIl[6] = (((112 + 89) - 156) + 111) ^ (((82 + 84) - 111) + 97);
        lIlllllIlIl[7] = (230 ^ 171) ^ (18 ^ 119);
        lIlllllIlIl[8] = (38 ^ 63) ^ (38 ^ 58);
        lIlllllIlIl[9] = (((129 + 112) - 180) + 129) ^ (((55 + 166) - 172) + 135);
        lIlllllIlIl[10] = (-27656) & 28255;
        lIlllllIlIl[11] = 113 ^ 118;
        lIlllllIlIl[12] = 58 ^ 50;
    }

    private World a(World world) {
        String worldsHopping = this.hY.worldsHopping();
        if (lIIllIllIlIlIl(worldsHopping.isEmpty() ? 1 : 0)) {
            String[] split = worldsHopping.split(lIlllllIIll[lIlllllIlIl[9]]);
            return Worlds.getRandom(world2 -> {
                if (lIIllIllIllIII(world2.getId(), world.getId()) && lIIllIllIlIIll(Stream.of((Object[]) split).anyMatch(str -> {
                    return String.valueOf(world2.getId()).equals(str);
                }) ? 1 : 0)) {
                    ?? r0 = lIlllllIlIl[4];
                    "".length();
                    return " ".length() < 0 ? ((150 ^ 196) ^ ((3 ^ 8) & ((125 ^ 118) ^ (-1)))) & (((227 ^ 151) ^ (129 ^ 167)) ^ (-" ".length())) : r0;
                }
                return lIlllllIlIl[0];
            });
        }
        World random = Worlds.getRandom(world3 -> {
            if (lIIllIllIllIII(world3.getId(), world.getId()) && lIIllIllIlIIll(world3.isNormal() ? 1 : 0) && lIIllIllIlIIll(world3.isMembers() ? 1 : 0) && lIIllIllIlIIll(Objects.equals(Integer.valueOf(world3.getLocation()), Integer.valueOf(world.getLocation())) ? 1 : 0) && lIIllIllIllIIl(world3.getPlayerCount(), lIlllllIlIl[10])) {
                ?? r0 = lIlllllIlIl[4];
                "".length();
                return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllllIlIl[0];
        });
        if (lIIllIllIlIllI(random)) {
            random = Worlds.getRandom(world4 -> {
                if (lIIllIllIllIII(world4.getId(), world.getId()) && lIIllIllIlIIll(world4.isNormal() ? 1 : 0) && lIIllIllIlIIll(world4.isMembers() ? 1 : 0) && lIIllIllIlIIll(Objects.equals(Integer.valueOf(world4.getLocation()), Integer.valueOf(world.getLocation())) ? 1 : 0)) {
                    ?? r0 = lIlllllIlIl[4];
                    "".length();
                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllllIlIl[0];
            });
            if (lIIllIllIlIllI(random)) {
                random = Worlds.getRandom(world5 -> {
                    if (lIIllIllIllIII(world5.getId(), world.getId()) && lIIllIllIlIIll(world5.isNormal() ? 1 : 0)) {
                        ?? r0 = lIlllllIlIl[4];
                        "".length();
                        return " ".length() <= ((29 ^ 33) & ((5 ^ 57) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllllIlIl[0];
                });
            }
        }
        return random;
    }

    private static String lIIllIllIIlIlI(String llllllllllllllllIlIIlIlIIIIllIII, String llllllllllllllllIlIIlIlIIIIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), lIlllllIlIl[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllllIlIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIIIIllIIl) {
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
        lIlllllIIll[lIlllllIlIl[0]] = lIIllIllIIlIlI("oWKg42+h4XMxI4g/yDI08b+py14eRB9o", "afBUq");
        lIlllllIIll[lIlllllIlIl[4]] = lIIllIllIIlIll("dLMUahVn0ZaTxPsGmSKtDV5TygF3hVVW1kLPMua2xtNRs4TUd0fphnpfeypuE1lM", "EbIVp");
        lIlllllIIll[lIlllllIlIl[5]] = lIIllIllIIlIll("rBUfZpx6in2VfNIZDVbL2xvndgG9fgdK2MiwLQ+p7zmCW+VevJUSIh4MVYTqHpA1BtcQ8jetap7HOm/IaqmDjj2qOR4ikknY", "fpUFM");
        lIlllllIIll[lIlllllIlIl[2]] = lIIllIllIIllII("OQ4FPDEDNQERRSQnAyAMDCFKOApCIAMiAUInSjsKECoObBENZgIjFUIyBXNa", "bFjLe");
        lIlllllIIll[lIlllllIlIl[6]] = lIIllIllIIlIlI("10FKYtVXjZi9Fgp2eEp6C8ma3hDp8vySp5A1S/s6gPEUjcihWKR/Uw==", "ITfwe");
        lIlllllIIll[lIlllllIlIl[8]] = lIIllIllIIllII("PCwfIQ0GFxsMeTABUDssFBBQOTYXFBU1", "gdpQY");
        lIlllllIIll[lIlllllIlIl[9]] = lIIllIllIIlIlI("bArB+BvlhQ4=", "HErBN");
    }

    static {
        lIIllIllIlIIlI();
        lIIllIllIIllIl();
    }

    private static boolean lIIllIllIlIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIllIllIlIIll(int i) {
        return i != 0;
    }
}

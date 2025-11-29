package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.SquireTutorialIsland;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Trade;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Upgrading to members", register = true)
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.I  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/I.class */
public class I extends Task {
    private final /* synthetic */ SquireQuesterConfig aF;
    private static /* synthetic */ String[] lIlIIIllllIll;
    private final /* synthetic */ SquireTutorialIsland aG;
    private static /* synthetic */ int[] lIlIIIlllllII;
    private final /* synthetic */ ConfigManager aH;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIlllIIIllIIIIl(message.contains(lIlIIIllllIll[lIlIIIlllllII[14]]) ? 1 : 0)) {
            this.aG.a(Text.sanitize(message.split(lIlIIIllllIll[lIlIIIlllllII[18]])[lIlIIIlllllII[0]]));
        }
        if (lIlllIIIllIIIIl(message.contains(lIlIIIllllIll[lIlIIIlllllII[19]]) ? 1 : 0)) {
            this.aG.a((String) null);
        }
    }

    private static String lIlllIIIlIllIIl(String llllllllllllllIlllIIIIllIlIIIIlI, String llllllllllllllIlllIIIIllIlIIIIIl) {
        String llllllllllllllIlllIIIIllIlIIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIIIllIIllllll = llllllllllllllIlllIIIIllIlIIIIIl.toCharArray();
        int llllllllllllllIlllIIIIllIIlllllI = lIlIIIlllllII[0];
        char[] charArray = llllllllllllllIlllIIIIllIlIIIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIlllllII[0];
        while (lIlllIIIlIllllI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIIIIllIIllllll[llllllllllllllIlllIIIIllIIlllllI % llllllllllllllIlllIIIIllIIllllll.length]));
            "".length();
            llllllllllllllIlllIIIIllIIlllllI++;
            i++;
            "".length();
            if (((143 ^ 171) ^ (119 ^ 87)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public I(SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland, ConfigManager configManager) {
        this.aF = squireQuesterConfig;
        this.aG = squireTutorialIsland;
        this.aH = configManager;
    }

    private static String lIlllIIIlIllIlI(String llllllllllllllIlllIIIIllIlIlIIlI, String llllllllllllllIlllIIIIllIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIllIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlllllII[16]), "DES");
            Cipher llllllllllllllIlllIIIIllIlIlIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIllIlIlIlII.init(lIlIIIlllllII[7], llllllllllllllIlllIIIIllIlIlIlIl);
            return new String(llllllllllllllIlllIIIIllIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIllIlIlIIll) {
            llllllllllllllIlllIIIIllIlIlIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24, types: [boolean] */
    public boolean run() {
        if (lIlllIIIlIlllIl(this.aF.bond() ? 1 : 0)) {
            return lIlIIIlllllII[0];
        }
        int varp = Vars.getVarp(lIlIIIlllllII[1]);
        if (lIlllIIIlIllllI(varp, lIlIIIlllllII[2])) {
            return lIlIIIlllllII[0];
        }
        int varp2 = Vars.getVarp(lIlIIIlllllII[3]);
        if (lIlllIIIlIlllll(varp2, lIlIIIlllllII[4])) {
            System.out.println("You have " + varp2 + " days of members left. You do not need a bond.");
            this.aH.setConfiguration(lIlIIIllllIll[lIlIIIlllllII[0]], lIlIIIllllIll[lIlIIIlllllII[4]], Boolean.valueOf((boolean) lIlIIIlllllII[0]));
            return lIlIIIlllllII[0];
        } else if (lIlllIIIlIllllI(varp, lIlIIIlllllII[5])) {
            return lIlIIIlllllII[0];
        } else {
            if (lIlllIIIlIlllIl(Trade.isOpen() ? 1 : 0)) {
                int[] iArr = new int[lIlIIIlllllII[4]];
                iArr[lIlIIIlllllII[0]] = lIlIIIlllllII[6];
                if (lIlllIIIlIlllIl(Inventory.contains(iArr) ? 1 : 0) && lIlllIIIllIIIII(this.aG.b())) {
                    System.out.println(lIlIIIllllIll[lIlIIIlllllII[7]]);
                    String[] strArr = new String[lIlIIIlllllII[4]];
                    strArr[lIlIIIlllllII[0]] = this.aG.b();
                    Players.getNearest(strArr).interact(lIlIIIllllIll[lIlIIIlllllII[8]]);
                }
            }
            if (lIlllIIIllIIIIl(Trade.isFirstScreenOpen() ? 1 : 0)) {
                Trade.acceptFirstScreen();
            }
            if (lIlllIIIllIIIIl(Trade.isSecondScreenOpen() ? 1 : 0)) {
                Trade.acceptSecondScreen();
            }
            if (lIlllIIIllIIIII(Widgets.get(lIlIIIlllllII[9], lIlIIIlllllII[4])) && lIlllIIIllIIIIl(Widgets.get(lIlIIIlllllII[9], lIlIIIlllllII[4]).getText().equals(lIlIIIllllIll[lIlIIIlllllII[10]]) ? 1 : 0)) {
                Game.logout();
            }
            if (lIlllIIIllIIIII(Widgets.get(lIlIIIlllllII[11], lIlIIIlllllII[12]))) {
                if (lIlllIIIllIIIIl(Widgets.get(lIlIIIlllllII[11], lIlIIIlllllII[13], lIlIIIlllllII[14]).getText().equals(lIlIIIllllIll[lIlIIIlllllII[5]]) ? 1 : 0)) {
                    Widgets.get(lIlIIIlllllII[11], lIlIIIlllllII[12]).interact(lIlIIIllllIll[lIlIIIlllllII[15]]);
                }
                if (lIlllIIIllIIIIl(Widgets.get(lIlIIIlllllII[11], lIlIIIlllllII[13], lIlIIIlllllII[14]).getText().equals(lIlIIIllllIll[lIlIIIlllllII[12]]) ? 1 : 0)) {
                    Widgets.get(lIlIIIlllllII[11], lIlIIIlllllII[13]).interact(lIlIIIllllIll[lIlIIIlllllII[16]]);
                    "".length();
                    if (((215 ^ 156) & ((253 ^ 182) ^ (-1))) > " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            } else {
                int[] iArr2 = new int[lIlIIIlllllII[4]];
                iArr2[lIlIIIlllllII[0]] = lIlIIIlllllII[6];
                Inventory.getFirst(iArr2).interact(lIlIIIllllIll[lIlIIIlllllII[17]]);
            }
            return lIlIIIlllllII[4];
        }
    }

    private static boolean lIlllIIIlIlllll(int i, int i2) {
        return i >= i2;
    }

    private static void lIlllIIIlIllIll() {
        lIlIIIllllIll = new String[lIlIIIlllllII[20]];
        lIlIIIllllIll[lIlIIIlllllII[0]] = lIlllIIIlIllIII("OowFzN/P2LLjfL41R8EFUw==", "gEkDG");
        lIlIIIllllIll[lIlIIIlllllII[4]] = lIlllIIIlIllIIl("CAsiNQ==", "JdLQJ");
        lIlIIIllllIll[lIlIIIlllllII[7]] = lIlllIIIlIllIII("yQo5X/Q3w34=", "FjTGh");
        lIlIIIllllIll[lIlIIIlllllII[8]] = lIlllIIIlIllIII("l0PLqbqhDKBN4SK1xprNaw==", "aWvGg");
        lIlIIIllllIll[lIlIIIlllllII[10]] = lIlllIIIlIllIlI("AbHfjlSNENqoIE1DA4yxb6krqmKEqg7tT1snJKDGYx2Ww+yr3eFu0JIpHMmIOKc/chGXU3uFdjmcZHTZEhDi5sX0xs+nfgDzWtwKFTgPkp23iVXylrUKde0G37DqQClST09U7/jufTY=", "gVUnS");
        lIlIIIllllIll[lIlIIIlllllII[5]] = lIlllIIIlIllIIl("THRL", "aYfnB");
        lIlIIIllllIll[lIlIIIlllllII[15]] = lIlllIIIlIllIII("tVjn89kV47E=", "Jmflu");
        lIlIIIllllIll[lIlIIIlllllII[12]] = lIlllIIIlIllIIl("MAcBBxwBBQ==", "shoau");
        lIlIIIllllIll[lIlIIIlllllII[16]] = lIlllIIIlIllIlI("Cf/4+dv2HSk=", "twEWG");
        lIlIIIllllIll[lIlIIIlllllII[17]] = lIlllIIIlIllIlI("o0aNiZA5Hws=", "LNPmU");
        lIlIIIllllIll[lIlIIIlllllII[14]] = lIlllIIIlIllIII("IiKNnqQMjTshJL6b+9hHAhjuqYeN1jUOWet+xdza1Ww=", "JQyml");
        lIlIIIllllIll[lIlIIIlllllII[18]] = lIlllIIIlIllIlI("jYN8EBgxe1Y=", "YhoYv");
        lIlIIIllllIll[lIlIIIlllllII[19]] = lIlllIIIlIllIIl("LCglJBkZLiJhHR8qIiRH", "mKFAi");
    }

    private static boolean lIlllIIIlIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIlllIIIllIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlllIIIllIIIII(Object obj) {
        return obj != null;
    }

    private static void lIlllIIIlIlllII() {
        lIlIIIlllllII = new int[21];
        lIlIIIlllllII[0] = ((42 ^ 83) ^ (((11 + 70) - 70) + 116)) & (((17 ^ 35) ^ (39 ^ 19)) ^ (-" ".length()));
        lIlIIIlllllII[1] = (-((-12757) & 16343)) & (-20549) & 24415;
        lIlIIIlllllII[2] = (-((-1825) & 32545)) & (-8) & 31727;
        lIlIIIlllllII[3] = (-((-5201) & 21851)) & (-6145) & 24574;
        lIlIIIlllllII[4] = " ".length();
        lIlIIIlllllII[5] = (12 ^ 51) ^ (8 ^ 50);
        lIlIIIlllllII[6] = (-16500) & 29691;
        lIlIIIlllllII[7] = "  ".length();
        lIlIIIlllllII[8] = "   ".length();
        lIlIIIlllllII[9] = (((77 ^ 12) + (((155 + 152) - 278) + 133)) - (143 ^ 182)) + (32 ^ 27);
        lIlIIIlllllII[10] = (97 ^ 78) ^ (130 ^ 169);
        lIlIIIlllllII[11] = 248 ^ 186;
        lIlIIIlllllII[12] = 63 ^ 56;
        lIlIIIlllllII[13] = 105 ^ 113;
        lIlIIIlllllII[14] = 94 ^ 84;
        lIlIIIlllllII[15] = (248 ^ 146) ^ (83 ^ 63);
        lIlIIIlllllII[16] = 26 ^ 18;
        lIlIIIlllllII[17] = (94 ^ 118) ^ (136 ^ 169);
        lIlIIIlllllII[18] = (((45 + 52) - 87) + 154) ^ (((71 + 172) - 236) + 168);
        lIlIIIlllllII[19] = (((127 + 104) - 192) + 100) ^ (((18 + 2) - (-20)) + 95);
        lIlIIIlllllII[20] = 143 ^ 130;
    }

    private static String lIlllIIIlIllIII(String llllllllllllllIlllIIIIllIIlIllIl, String llllllllllllllIlllIIIIllIIlIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlllllII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIIllIIlIlllI) {
            llllllllllllllIlllIIIIllIIlIlllI.printStackTrace();
            return null;
        }
    }

    static {
        lIlllIIIlIlllII();
        lIlllIIIlIllIll();
    }

    private static boolean lIlllIIIlIllllI(int i, int i2) {
        return i < i2;
    }
}

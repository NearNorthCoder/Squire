package gg.squire.basics.kitten;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0026az;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aB;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@PluginDescriptor(name = "Squire Kitten Feeder", description = "Feeds your kitten/plays with it", enabledByDefault = false, tags = {"cat", "spice", "rfd"})
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/kitten/SquireKitten.class */
public class SquireKitten extends SquirePlugin {
    private static /* synthetic */ int[] lIIllIlII;
    private static final /* synthetic */ int dN;
    private /* synthetic */ int dS;
    private static /* synthetic */ String[] lIIllIIll;
    private /* synthetic */ int dO = lIIllIlII[0];
    private /* synthetic */ int dP = lIIllIlII[0];
    private /* synthetic */ aB dQ = aB.NONE;
    private /* synthetic */ aB dR = aB.SOME;
    private /* synthetic */ boolean dT = lIIllIlII[1];

    private static void lIIIIllIlIl() {
        lIIllIlII = new int[26];
        lIIllIlII[0] = (191 ^ 161) & ((39 ^ 57) ^ (-1));
        lIIllIlII[1] = " ".length();
        lIIllIlII[2] = "  ".length();
        lIIllIlII[3] = "   ".length();
        lIIllIlII[4] = (88 ^ 113) ^ (79 ^ 98);
        lIIllIlII[5] = (((30 + 20) - 5) + 91) ^ (((120 + 9) - 83) + 95);
        lIIllIlII[6] = 170 ^ 172;
        lIIllIlII[7] = (-1601) & 2047;
        lIIllIlII[8] = -" ".length();
        lIIllIlII[9] = "  ".length() ^ (78 ^ 108);
        lIIllIlII[10] = (56 ^ 45) ^ (174 ^ 188);
        lIIllIlII[11] = (126 ^ 85) ^ (36 ^ 31);
        lIIllIlII[12] = 180 ^ 188;
        lIIllIlII[13] = 207 ^ 197;
        lIIllIlII[14] = (-20866) & 24015;
        lIIllIlII[15] = (-((-4249) & 23229)) & (-12289) & 31599;
        lIIllIlII[16] = (-((-16985) & 32505)) & (-16393) & 32239;
        lIIllIlII[17] = (-((-17093) & 20213)) & (-29313) & 32767;
        lIIllIlII[18] = (-((-17243) & 21339)) & (-16387) & 31806;
        lIIllIlII[19] = (-322) & 11647;
        lIIllIlII[20] = (-((-17165) & 27421)) & (-1) & 10615;
        lIIllIlII[21] = (-2707) & 3067;
        lIIllIlII[22] = (-((-6187) & 32299)) & (-4097) & 30585;
        lIIllIlII[23] = (((37 + 90) - 111) + 141) ^ (((84 + 17) - (-19)) + 28);
        lIIllIlII[24] = (-9345) & 9723;
        lIIllIlII[25] = 39 ^ 44;
    }

    @Subscribe
    public void c(ChatMessage chatMessage) {
        if (lIIIIllIllI(chatMessage.getType(), ChatMessageType.SPAM) && lIIIIllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String removeTags = Text.removeTags(chatMessage.getMessage());
        if (!lIIIIllIlll(removeTags.equals(lIIllIIll[lIIllIlII[0]]) ? 1 : 0) || lIIIIlllIII(removeTags.equals(lIIllIIll[lIIllIlII[1]]) ? 1 : 0)) {
            this.dQ = aB.NONE;
        }
        if (lIIIIlllIII(removeTags.equals(lIIllIIll[lIIllIlII[2]]) ? 1 : 0)) {
            this.dR = aB.NONE;
        }
        if (lIIIIlllIII(removeTags.equals(lIIllIIll[lIIllIlII[3]]) ? 1 : 0)) {
            this.dQ = aB.SOME;
        }
        if (lIIIIlllIII(removeTags.equals(lIIllIIll[lIIllIlII[4]]) ? 1 : 0)) {
            this.dQ = aB.EXTREME;
        }
        if (lIIIIlllIII(removeTags.equals(lIIllIIll[lIIllIlII[5]]) ? 1 : 0)) {
            this.dR = aB.SOME;
        }
        if (lIIIIlllIII(removeTags.equals(lIIllIIll[lIIllIlII[6]]) ? 1 : 0)) {
            this.dR = aB.EXTREME;
        }
    }

    private void v(int i2) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(i2));
        while (lIIIIlllIll(sb.length(), lIIllIlII[9])) {
            sb.insert(lIIllIlII[0], lIIllIIll[lIIllIlII[10]]);
            "".length();
            "".length();
            if ("   ".length() == (((132 ^ 156) ^ (73 ^ 105)) & (((((109 + 57) - 163) + 248) ^ (((6 + 84) - 22) + 127)) ^ (-" ".length())))) {
                return;
            }
        }
        this.dO = Integer.parseInt(sb.substring(lIIllIlII[0], lIIllIlII[11]), lIIllIlII[2]);
    }

    private static boolean lIIIIllllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private void bQ() {
        if (lIIIIllIllI(Static.getClient().getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        int varp = Vars.getVarp(lIIllIlII[7]);
        if (lIIIIlllIlI(varp, lIIllIlII[8])) {
            this.dP = varp;
            v(this.dP);
        }
    }

    private static String lIIIIllIIll(String llIIIllIIIIIlll, String llIIIllIIIIIllI) {
        try {
            SecretKeySpec llIIIllIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIllIIIIlIIl = Cipher.getInstance("Blowfish");
            llIIIllIIIIlIIl.init(lIIllIlII[2], llIIIllIIIIlIlI);
            return new String(llIIIllIIIIlIIl.doFinal(Base64.getDecoder().decode(llIIIllIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIllIIIIIIll) {
            llIIIllIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllllII(Object obj) {
        return obj == null;
    }

    @Provides
    SquireKittenConfig l(ConfigManager configManager) {
        return (SquireKittenConfig) configManager.getConfig(SquireKittenConfig.class);
    }

    protected void onStart() {
        bQ();
    }

    public aB bS() {
        return this.dQ;
    }

    @Subscribe
    public void d(VarbitChanged varbitChanged) {
        int varp = Vars.getVarp(lIIllIlII[7]);
        if (lIIIIlllIIl(varp, this.dP)) {
            return;
        }
        this.dP = varp;
        if (lIIIIlllIIl(varp, lIIllIlII[8])) {
            this.dO = lIIllIlII[8];
        } else {
            v(this.dP);
        }
    }

    private static void lIIIIllIlII() {
        lIIllIIll = new String[lIIllIlII[25]];
        lIIllIIll[lIIllIlII[0]] = lIIIIllIIIl("IDAPUQwdLB4UCVQ/BRMFGD0ZURIEeB4ZAlQ+AwIPWg==", "tXjqg");
        lIIllIIll[lIIllIlII[1]] = lIIIIllIIlI("1rDeZfuBPTqDk0WqI5b8XpiN0pN9GAJAWNPNr0IOK3k=", "VirNq");
        lIIllIIll[lIIllIlII[2]] = lIIIIllIIlI("UJ4CuW8ly8SksMFk+hDTANF0OPGLzuSAJJkADbJVWhw=", "ruXrV");
        lIIllIIll[lIIllIlII[3]] = lIIIIllIIll("g39Jf9DEItta2SkCfzJeArAOnGS5vHDw", "SrtlR");
        lIIllIIll[lIIllIlII[4]] = lIIIIllIIlI("YsOP8Dwju1Zl/E0uaaoBr1D5ynRhJJXLkW4igtsoRXY=", "BWANX");
        lIIllIIll[lIIllIlII[5]] = lIIIIllIIIl("IyATNUIRJhIzBxRvESYMDjxGJhYOKggzCxUhSA==", "zOfGb");
        lIIllIIll[lIIllIlII[6]] = lIIIIllIIlI("C6Oo6D7gzuvjZRLQClgVV0nmaWJtbcX8ecVIFSBCxAyEMSTR8XuHDA==", "VaDFw");
        lIIllIIll[lIIllIlII[10]] = lIIIIllIIIl("YQ==", "QDrXG");
        lIIllIIll[lIIllIlII[12]] = lIIIIllIIll("stXBotnasyc=", "CTQVn");
        lIIllIIll[lIIllIlII[23]] = lIIIIllIIll("nd1PNqzxDEpsKZCJysPp5Q==", "blapw");
        lIIllIIll[lIIllIlII[13]] = lIIIIllIIll("KD25d5439co=", "ciHOk");
    }

    static {
        lIIIIllIlIl();
        lIIIIllIlII();
        dN = lIIllIlII[7];
    }

    private static boolean lIIIIllIlll(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIlllIlI(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIIIIlllIIl(this.dO, lIIllIlII[8])) {
            return;
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIIIlllIIl(npc.getId(), this.dO) && lIIIIlllIII(lIIllIIll[lIIllIlII[13]].equals(npc.getName()) ? 1 : 0) && lIIIIllllll(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = lIIllIlII[1];
                "".length();
                return 0 != 0 ? ((156 ^ 140) ^ (217 ^ 153)) & (((((128 + 39) - 157) + 244) ^ (((115 + 121) - 200) + 138)) ^ (-" ".length())) : r0;
            }
            return lIIllIlII[0];
        });
        if (lIIIIllllII(nearest)) {
            return;
        }
        if (lIIIIllIlll(this.dT ? 1 : 0) && lIIIIlllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIIllIlII[1]];
            strArr[lIIllIlII[0]] = lIIllIIll[lIIllIlII[12]];
            Dialog.chooseOption(strArr);
            "".length();
        } else if (lIIIIllIlll(this.dT ? 1 : 0) && lIIIIlllIII(Dialog.isOpen() ? 1 : 0) && lIIIIlllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            this.dT = lIIllIlII[1];
        } else {
            int tickCount = Static.getClient().getTickCount();
            if (lIIIIllllIl(tickCount - this.dS, lIIllIlII[5])) {
                return;
            }
            if (lIIIIllIllI(this.dQ, aB.NONE)) {
                int[] iArr = new int[lIIllIlII[13]];
                iArr[lIIllIlII[0]] = lIIllIlII[14];
                iArr[lIIllIlII[1]] = lIIllIlII[15];
                iArr[lIIllIlII[2]] = lIIllIlII[16];
                iArr[lIIllIlII[3]] = lIIllIlII[17];
                iArr[lIIllIlII[4]] = lIIllIlII[18];
                iArr[lIIllIlII[5]] = lIIllIlII[19];
                iArr[lIIllIlII[6]] = lIIllIlII[20];
                iArr[lIIllIlII[10]] = lIIllIlII[21];
                iArr[lIIllIlII[12]] = lIIllIlII[22];
                iArr[lIIllIlII[23]] = lIIllIlII[24];
                Item first = Inventory.getFirst(iArr);
                if (lIIIIlllllI(first)) {
                    first.useOn(nearest);
                    this.dS = tickCount;
                }
            }
            if (lIIIIllIllI(this.dR, aB.NONE)) {
                nearest.interact(lIIllIIll[lIIllIlII[23]]);
                this.dS = tickCount;
                this.dT = lIIllIlII[0];
            }
        }
    }

    private static String lIIIIllIIIl(String llIIIlIllllIlll, String llIIIlIllllIllI) {
        String llIIIlIllllIlll2 = new String(Base64.getDecoder().decode(llIIIlIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIIlIllllIlII = llIIIlIllllIllI.toCharArray();
        int llIIIlIllllIIll = lIIllIlII[0];
        char[] charArray = llIIIlIllllIlll2.toCharArray();
        int length = charArray.length;
        int i2 = lIIllIlII[0];
        while (lIIIIlllIll(i2, length)) {
            char llIIIlIlllllIII = charArray[i2];
            sb.append((char) (llIIIlIlllllIII ^ llIIIlIllllIlII[llIIIlIllllIIll % llIIIlIllllIlII.length]));
            "".length();
            llIIIlIllllIIll++;
            i2++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIlllIII(int i2) {
        return i2 != 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIlII[1]];
        clsArr[lIIllIlII[0]] = C0026az.class;
        return clsArr;
    }

    protected void onStop() {
        this.dP = lIIllIlII[8];
        this.dO = lIIllIlII[8];
    }

    private static boolean lIIIIlllllI(Object obj) {
        return obj != null;
    }

    public aB bT() {
        return this.dR;
    }

    private static boolean lIIIIlllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIIIllllIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static String lIIIIllIIlI(String llIIIllIIIlIlII, String llIIIllIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIllIlII[12]), "DES");
            Cipher llIIIllIIIlIllI = Cipher.getInstance("DES");
            llIIIllIIIlIllI.init(lIIllIlII[2], secretKeySpec);
            return new String(llIIIllIIIlIllI.doFinal(Base64.getDecoder().decode(llIIIllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIllIIIlIlIl) {
            llIIIllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIIllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int bR() {
        return this.dO;
    }
}

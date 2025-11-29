/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.kitten;

import com.google.inject.Provides;
import gg.squire.basics.kitten.SquireKittenConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ABEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.HuntCatTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
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

@PluginDescriptor(name="Squire Kitten Feeder", description="Feeds your kitten/plays with it", enabledByDefault=false, tags={"cat", "spice", "rfd"})
@SquireUtil
public class SquireKitten
extends SquirePlugin {
    private /* synthetic */ int dO;
    private /* synthetic */ boolean dT;
    private static /* synthetic */ int[] lIIllIlII;
    private /* synthetic */ aB dR;
    private /* synthetic */ int dP;
    private /* synthetic */ aB dQ;
    private static final /* synthetic */ int dN;
    private /* synthetic */ int dS;
    private static /* synthetic */ String[] lIIllIIll;

    private static void lIIIIllIlIl() {
        lIIllIlII = new int[26];
        SquireKitten.lIIllIlII[0] = (0xBF ^ 0xA1) & ~(0x27 ^ 0x39);
        SquireKitten.lIIllIlII[1] = 1;
        SquireKitten.lIIllIlII[2] = 2;
        SquireKitten.lIIllIlII[3] = 3;
        SquireKitten.lIIllIlII[4] = 0x58 ^ 0x71 ^ (0x4F ^ 0x62);
        SquireKitten.lIIllIlII[5] = 30 + 20 - 5 + 91 ^ 120 + 9 - 83 + 95;
        SquireKitten.lIIllIlII[6] = 0xAA ^ 0xAC;
        SquireKitten.lIIllIlII[7] = 0xFFFFF9BF & 0x7FF;
        SquireKitten.lIIllIlII[8] = -1;
        SquireKitten.lIIllIlII[9] = 2 ^ (0x4E ^ 0x6C);
        SquireKitten.lIIllIlII[10] = 0x38 ^ 0x2D ^ (0xAE ^ 0xBC);
        SquireKitten.lIIllIlII[11] = 0x7E ^ 0x55 ^ (0x24 ^ 0x1F);
        SquireKitten.lIIllIlII[12] = 0xB4 ^ 0xBC;
        SquireKitten.lIIllIlII[13] = 0xCF ^ 0xC5;
        SquireKitten.lIIllIlII[14] = 0xFFFFAE7E & 0x5DCF;
        SquireKitten.lIIllIlII[15] = -(0xFFFFEF67 & 0x5ABD) & (0xFFFFCFFF & 0x7B6F);
        SquireKitten.lIIllIlII[16] = -(0xFFFFBDA7 & 0x7EF9) & (0xFFFFBFF7 & 0x7DEF);
        SquireKitten.lIIllIlII[17] = -(0xFFFFBD3B & 0x4EF5) & (0xFFFF8D7F & Short.MAX_VALUE);
        SquireKitten.lIIllIlII[18] = -(0xFFFFBCA5 & 0x535B) & (0xFFFFBFFD & 0x7C3E);
        SquireKitten.lIIllIlII[19] = 0xFFFFFEBE & 0x2D7F;
        SquireKitten.lIIllIlII[20] = -(0xFFFFBCF3 & 0x6B1D) & (0xFFFFFFFF & 0x2977);
        SquireKitten.lIIllIlII[21] = 0xFFFFF56D & 0xBFB;
        SquireKitten.lIIllIlII[22] = -(0xFFFFE7D5 & 0x7E2B) & (0xFFFFEFFF & 0x7779);
        SquireKitten.lIIllIlII[23] = 37 + 90 - 111 + 141 ^ 84 + 17 - -19 + 28;
        SquireKitten.lIIllIlII[24] = 0xFFFFDB7F & 0x25FB;
        SquireKitten.lIIllIlII[25] = 0x27 ^ 0x2C;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(ChatMessage chatMessage) {
        void llIIIllIIlllIIl;
        if (SquireKitten.lIIIIllIllI(chatMessage.getType(), ChatMessageType.SPAM) && SquireKitten.lIIIIllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llIIIllIIlllIII = Text.removeTags((String)llIIIllIIlllIIl.getMessage());
        if (!SquireKitten.lIIIIllIlll(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[0]]) ? 1 : 0) || SquireKitten.lIIIIlllIII(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[1]]) ? 1 : 0)) {
            llIIIllIIlllIlI.dQ = aB.NONE;
        }
        if (SquireKitten.lIIIIlllIII(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[2]]) ? 1 : 0)) {
            llIIIllIIlllIlI.dR = aB.NONE;
        }
        if (SquireKitten.lIIIIlllIII(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[3]]) ? 1 : 0)) {
            llIIIllIIlllIlI.dQ = aB.SOME;
        }
        if (SquireKitten.lIIIIlllIII(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[4]]) ? 1 : 0)) {
            llIIIllIIlllIlI.dQ = aB.EXTREME;
        }
        if (SquireKitten.lIIIIlllIII(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[5]]) ? 1 : 0)) {
            llIIIllIIlllIlI.dR = aB.SOME;
        }
        if (SquireKitten.lIIIIlllIII(llIIIllIIlllIII.equals(lIIllIIll[lIIllIlII[6]]) ? 1 : 0)) {
            llIIIllIIlllIlI.dR = aB.EXTREME;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void v(int n2) {
        void var2_2;
        StringBuilder llIIIllIIlIlIII = new StringBuilder(Integer.toBinaryString(n2));
        while (SquireKitten.lIIIIlllIll(llIIIllIIlIlIII.length(), lIIllIlII[9])) {
            llIIIllIIlIlIII.insert(lIIllIlII[0], lIIllIIll[lIIllIlII[10]]);
            0;
            0;
            if (3 != ((0x84 ^ 0x9C ^ (0x49 ^ 0x69)) & (109 + 57 - 163 + 248 ^ 6 + 84 - 22 + 127 ^ -1))) continue;
            return;
        }
        this.dO = Integer.parseInt(var2_2.substring(lIIllIlII[0], lIIllIlII[11]), lIIllIlII[2]);
    }

    private static boolean lIIIIllllll(Object object, Object object2) {
        return object == object2;
    }

    private void bQ() {
        Client client = Static.getClient();
        if (SquireKitten.lIIIIllIllI(client.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        int llIIIllIIlIlllI = Vars.getVarp((int)lIIllIlII[7]);
        if (SquireKitten.lIIIIlllIlI(llIIIllIIlIlllI, lIIllIlII[8])) {
            SquireKitten llIIIllIIllIIII;
            llIIIllIIllIIII.dP = llIIIllIIlIlllI;
            llIIIllIIllIIII.v(llIIIllIIllIIII.dP);
        }
    }

    private static String lIIIIllIIll(String llIIIllIIIIIlIl, String llIIIllIIIIIlII) {
        try {
            SecretKeySpec llIIIllIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIllIIIIlIIl = Cipher.getInstance("Blowfish");
            llIIIllIIIIlIIl.init(lIIllIlII[2], llIIIllIIIIlIlI);
            return new String(llIIIllIIIIlIIl.doFinal(Base64.getDecoder().decode(llIIIllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIllIIIIlIII) {
            llIIIllIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllllII(Object object) {
        return object == null;
    }

    @Provides
    SquireKittenConfig l(ConfigManager configManager) {
        return (SquireKittenConfig)configManager.getConfig(SquireKittenConfig.class);
    }

    protected void onStart() {
        this.bQ();
    }

    public SquireKitten() {
        this.dO = lIIllIlII[0];
        this.dP = lIIllIlII[0];
        this.dQ = aB.NONE;
        this.dR = aB.SOME;
        this.dT = lIIllIlII[1];
    }

    public aB bS() {
        return this.dQ;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void d(VarbitChanged varbitChanged) {
        void llIIIllIIllIlII;
        int n2 = Vars.getVarp((int)lIIllIlII[7]);
        if (SquireKitten.lIIIIlllIIl(n2, this.dP)) {
            return;
        }
        llIIIllIIllIlIl.dP = llIIIllIIllIlII;
        if (SquireKitten.lIIIIlllIIl((int)llIIIllIIllIlII, lIIllIlII[8])) {
            llIIIllIIllIlIl.dO = lIIllIlII[8];
            return;
        }
        this.v(this.dP);
    }

    private static void lIIIIllIlII() {
        lIIllIIll = new String[lIIllIlII[25]];
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[0]] = SquireKitten."The kitten gobbles up the fish.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[1]] = SquireKitten."The kitten laps up the milk.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[2]] = SquireKitten."You softly stroke your cat.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[3]] = SquireKitten."Your kitten is hungry.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[4]] = SquireKitten."Your kitten is very hungry.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[5]] = SquireKitten."Your kitten wants attention.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[6]] = SquireKitten."Your kitten really wants attention.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[10]] = SquireKitten."0";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[12]] = SquireKitten."Stroke";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[23]] = SquireKitten."Interact";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[13]] = SquireKitten."Kitten";
    }

    static {
        SquireKitten.lIIIIllIlIl();
        SquireKitten.lIIIIllIlII();
        dN = lIIllIlII[7];
    }

    private static boolean lIIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlllIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireKitten llIIIllIIlIIIll;
        if (SquireKitten.lIIIIlllIIl(this.dO, lIIllIlII[8])) {
            return;
        }
        NPC llIIIllIIlIIIlI = NPCs.getNearest(nPC -> {
            int n2;
            if (SquireKitten.lIIIIlllIIl(nPC.getId(), this.dO) && SquireKitten.lIIIIlllIII(lIIllIIll[lIIllIlII[13]].equals(nPC.getName()) ? 1 : 0) && SquireKitten.lIIIIllllll(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIllIlII[1];
                0;
                
                }
            } else {
                n2 = lIIllIlII[0];
            }
            return n2 != 0;
        });
        if (SquireKitten.lIIIIllllII(llIIIllIIlIIIlI)) {
            return;
        }
        if (SquireKitten.lIIIIllIlll(llIIIllIIlIIIll.dT ? 1 : 0) && SquireKitten.lIIIIlllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlII[1]];
            stringArray[SquireKitten.lIIllIlII[0]] = lIIllIIll[lIIllIlII[12]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return;
        }
        if (SquireKitten.lIIIIllIlll(llIIIllIIlIIIll.dT ? 1 : 0) && SquireKitten.lIIIIlllIII(Dialog.isOpen() ? 1 : 0) && SquireKitten.lIIIIlllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            llIIIllIIlIIIll.dT = lIIllIlII[1];
            return;
        }
        int llIIIllIIlIIIIl = Static.getClient().getTickCount();
        if (SquireKitten.lIIIIllllIl(llIIIllIIlIIIIl - llIIIllIIlIIIll.dS, lIIllIlII[5])) {
            return;
        }
        if (SquireKitten.lIIIIllIllI((Object)llIIIllIIlIIIll.dQ, (Object)aB.NONE)) {
            int[] nArray = new int[lIIllIlII[13]];
            nArray[SquireKitten.lIIllIlII[0]] = lIIllIlII[14];
            nArray[SquireKitten.lIIllIlII[1]] = lIIllIlII[15];
            nArray[SquireKitten.lIIllIlII[2]] = lIIllIlII[16];
            nArray[SquireKitten.lIIllIlII[3]] = lIIllIlII[17];
            nArray[SquireKitten.lIIllIlII[4]] = lIIllIlII[18];
            nArray[SquireKitten.lIIllIlII[5]] = lIIllIlII[19];
            nArray[SquireKitten.lIIllIlII[6]] = lIIllIlII[20];
            nArray[SquireKitten.lIIllIlII[10]] = lIIllIlII[21];
            nArray[SquireKitten.lIIllIlII[12]] = lIIllIlII[22];
            nArray[SquireKitten.lIIllIlII[23]] = lIIllIlII[24];
            Item llIIIllIIlIIIII = Inventory.getFirst((int[])nArray);
            if (SquireKitten.lIIIIlllllI(llIIIllIIlIIIII)) {
                llIIIllIIlIIIII.useOn((Actor)llIIIllIIlIIIlI);
                llIIIllIIlIIIll.dS = llIIIllIIlIIIIl;
            }
        }
        if (SquireKitten.lIIIIllIllI((Object)llIIIllIIlIIIll.dR, (Object)aB.NONE)) {
            llIIIllIIlIIIlI.interact(lIIllIIll[lIIllIlII[23]]);
            llIIIllIIlIIIll.dS = llIIIllIIlIIIIl;
            llIIIllIIlIIIll.dT = lIIllIlII[0];
        }
    }

    private static String lIIIIllIIIl(String llIIIlIllllIIlI, String llIIIlIllllIllI) {
        llIIIlIllllIIlI = new String(Base64.getDecoder().decode(llIIIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIllllIlIl = new StringBuilder();
        char[] llIIIlIllllIlII = llIIIlIllllIllI.toCharArray();
        int llIIIlIllllIIll = lIIllIlII[0];
        char[] llIIIlIlllIllIl = llIIIlIllllIIlI.toCharArray();
        int llIIIlIlllIllII = llIIIlIlllIllIl.length;
        int llIIIlIlllIlIll = lIIllIlII[0];
        while (SquireKitten.lIIIIlllIll(llIIIlIlllIlIll, llIIIlIlllIllII)) {
            char llIIIlIlllllIII = llIIIlIlllIllIl[llIIIlIlllIlIll];
            llIIIlIllllIlIl.append((char)(llIIIlIlllllIII ^ llIIIlIllllIlII[llIIIlIllllIIll % llIIIlIllllIlII.length]));
            0;
            ++llIIIlIllllIIll;
            ++llIIIlIlllIlIll;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(llIIIlIllllIlIl);
    }

    private static boolean lIIIIlllIII(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIlII[1]];
        classArray[SquireKitten.lIIllIlII[0]] = HuntCatTask.class;
        return classArray;
    }

    protected void onStop() {
        this.dP = lIIllIlII[8];
        this.dO = lIIllIlII[8];
    }

    private static boolean lIIIIlllllI(Object object) {
        return object != null;
    }

    public aB bT() {
        return this.dR;
    }

    private static boolean lIIIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIIllIIlI(String llIIIllIIIlIlII, String llIIIllIIIlIIIl) {
        try {
            SecretKeySpec llIIIllIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIllIlII[12]), "DES");
            Cipher llIIIllIIIlIllI = Cipher.getInstance("DES");
            llIIIllIIIlIllI.init(lIIllIlII[2], llIIIllIIIlIlll);
            return new String(llIIIllIIIlIllI.doFinal(Base64.getDecoder().decode(llIIIllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIllIIIlIlIl) {
            llIIIllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIllIllI(Object object, Object object2) {
        return object != object2;
    }

    public int bR() {
        return this.dO;
    }
}


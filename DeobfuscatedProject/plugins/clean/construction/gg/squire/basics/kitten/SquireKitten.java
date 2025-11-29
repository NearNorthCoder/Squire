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
import gg.squire.basics.kitten.GameEnum130;
import gg.squire.basics.kitten.HuntCatTask;
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
    private  int dO;
    private  boolean dT;
    
    private  aB dR;
    private  int dP;
    private  aB dQ;
    private static final  int dN;
    private  int dS;

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
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[0]] = "The kitten gobbles up the fish.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[1]] = "The kitten laps up the milk.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[2]] = "You softly stroke your cat.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[3]] = "Your kitten is hungry.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[4]] = "Your kitten is very hungry.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[5]] = "Your kitten wants attention.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[6]] = "Your kitten really wants attention.";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[10]] = "0";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[12]] = "Stroke";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[23]] = "Interact";
        SquireKitten.lIIllIIll[SquireKitten.lIIllIlII[13]] = "Kitten";
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

